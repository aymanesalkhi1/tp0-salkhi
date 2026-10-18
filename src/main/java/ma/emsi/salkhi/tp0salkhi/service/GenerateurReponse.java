package ma.emsi.salkhi.tp0salkhi.service;

import jakarta.enterprise.context.Dependent;
import java.io.Serializable;
import java.util.Locale;

@Dependent
public class GenerateurReponse implements Serializable {

    public String genererReponse(String question, String roleSysteme) {
        if (question == null) {
            question = "";
        }

        // Traitement personnel et original pour le bonus
        int nbrCaracteres = question.length();
        String roleFormate = (roleSysteme != null) ? roleSysteme.toUpperCase(Locale.FRENCH) : "STANDARD";

        // Inversion des mots de la question
        String[] mots = question.trim().split("\\s+");
        StringBuilder questionInverse = new StringBuilder();
        for (int i = mots.length - 1; i >= 0; i--) {
            questionInverse.append(mots[i]).append(" ");
        }

        return ">>> [MODE " + roleFormate + "] <<<" + "\n" +
                "Analyse cryptée : " + questionInverse.toString().trim() + "\n" +
                "({ Caractères traités : " + nbrCaracteres + " })";
    }
}