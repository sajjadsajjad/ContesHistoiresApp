package android.dgaps.com.conteshistoiresapp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HP on 1/19/2017.
 */

public class DataProvider {

    private static List<Poem> data = new ArrayList<>();

    public static List<Poem> getData() {
        return data;
    }

    static {
        data.add(new Poem("1","dodo, l'enfant do","dodo, l'enfant do\n" +
                "L'enfant dormira bien vite,\n" +
                "Dodo, l'enfant do\n" +
                "L'enfant dormira bientôt.\n"));
        data.add(new Poem("2","Tapent, petites mains","tapent, tapent, petites mains.\n" +
                "Tourne, tourne, petit moulin.\n" +
                "Vole, vole, petit oiseau.\n" +
                "Nage, nage, petit poisson.\n" +
                "\n" +
                "Petites mains ont bien tapé,\n" +
                "Petit moulin a bien tourné,\n" +
                "Petit oiseau a bien volé,\n" +
                "Petit poisson a bien nagé.\n"));
        data.add(new Poem("3","Bateau sur l'eau","bateau sur l'eau\n" +
                "La rivière, la rivière.\n" +
                "Bateau sur l'eau\n" +
                "La rivière au bord de l'eau.\n" +
                "Plouf !\n"));
        data.add(new Poem("4","Coucou, hibou","dans la forêt lointaine\n" +
                "On entend le coucou.\n" +
                "Du haut de son grand chêne,\n" +
                "Il répond au hibou.\n" +
                "Coucou, coucou, coucou, hibou, coucou.\n" +
                "Coucou, coucou, coucou, hibou, coucou.\n"));
        data.add(new Poem("5","Au feu les pompiers !","au feu les pompiers !\n" +
                "Ma maison qui brûle !\n" +
                "C'est pas moi qui l'ai brûlée,\n" +
                "C'est la cuisinière,\n" +
                "C'est pas moi qui l'ai brûlée,\n" +
                "C'est le cuisinier !\n"));
        data.add(new Poem("6","Dans mon immeuble","dans mon immeuble vivent de drôles de gens.\n" +
                "Au premier étage\n" +
                "Mr Balthazar se prend pour un roi mage.\n" +
                "Au deuxième étage\n" +
                "Mme Tounet passe son temps à faire le ménage.\n" +
                "Au troisième étage\n" +
                "Les demoiselles Pipelette ne cessent leur bavardage.\n" +
                "Au quatrième étage\n" +
                "Le professeur Labougeotte est toujours en voyage.\n" +
                "Au dernier étage\n" +
                "Le jeune Edouard essaye d'attraper les nuages.\n" +
                "Mais j'ai oublié le rez-de-chaussée, mon étage préféré\n" +
                "C'est là qu'habite Daphné, une très belle fée.\n"));
        data.add(new Poem("7","Frère Jacques","frère Jacques, frère Jacques,\n" +
                "Dormez-vous, dormez-vous ?\n" +
                "\n" +
                "Sonnez les matines,\n" +
                "sonnez les matines,\n" +
                "\n" +
                "Ding ding dong, ding ding dong.\n"));
        data.add(new Poem("8","Les petits poissons","les petits poissons dans l'eau,\n" +
                "nagent, nagent, nagent, nagent,\n" +
                "Les petits poissons dans l'eau,\n" +
                "nagent aussi bien que les gros.\n" +
                "Les petits, les gros\n" +
                "nagent comme il faut.\n" +
                "Les gros, les petits\n" +
                "nagent bien aussi.\n"));
        data.add(new Poem("9","Ainsi font, font, font.","ainsi font, font, font,\n" +
                "Les petites marionnettes,\n" +
                "Ainsi font, font, font,\n" +
                "Trois p'tits tours et puis s'en vont.\n" +
                "Les mains aux côtés,\n" +
                "Sautez, sautez, marionnettes,\n" +
                "Les mains aux côtés,\n" +
                "Marionnettes, recommencez.\n" +
                "Mais elles reviendront,\n" +
                "Les petites marionnettes,\n" +
                "Mais elles reviendront,\n" +
                "Quand les enfants dormiront.\n"));
        data.add(new Poem("10","Rond jaune, rectangle bleu","un rond jaune pour le soleil\n" +
                "Un rectangle bleu pour le ciel\n" +
                "Un carré vert pour le pré\n" +
                "Sans oublier, à l'aquarelle,\n" +
                "Un demi-cercle pour l'arc-en-ciel.\n"));
    }

}
