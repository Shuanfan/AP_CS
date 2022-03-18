package da_past;

public class Hw_that_I_Deleted {
    public static void main1(String[] args) {
        String ex1 = "Strings are constant; their values cannot be <s>changed<e> after they are created.";
        int i = ex1.indexOf("<s>");
        int j = ex1.indexOf("<e>");
        String o = ex1.substring(i+3,j);
        System.out.println(o);
    }

    public static void main2(String[] args) {
        String ex2 = "Taiwan's coronavirus response is among the best.";
        int j = ex2.indexOf("coronavirus");
        String c = ex2.substring(j, j+"coronavirus".length());
        String t = ex2.substring(0,j);
        String r = ex2.substring(j+"coronavirus".length());
        System.out.println(t+"Covid19"+r);
    }

    public static void main(String[] args) {
        String para = "This Medical Product Alert warns consumers, healthcare professionals, and health authorities against a growing number of falsified medical products that claim to prevent, detect, treat or cure COVID-19. \n" +
                "The Coronavirus disease (COVID-19) pandemic (caused by the virus SARS-CoV-2) has increased demand for medicines, vaccines, diagnostics and reagents, all related to COVID-19, creating an opportunity for ill-intended persons to distribute falsified medical products \n" +
                "Due diligence is required from all actors in the procurement, use and administration of medical products, in particular those affected by the current crisis of, or related to, COVID-19. \n" +
                "At this stage, WHO does not recommend any medicines to treat or cure COVID-19. However, the SOLIDARITY trial, led by WHO, is reviewing potential treatments for COVID-19. ";
        int count = 0;
        while (true) {
            int j = para.indexOf("COVID-19");
            if(j != -1) {
                para = para.substring(j + "COVID-19".length());
                count++;
            } else {
                break;
            }
           System.out.println(count);
            }
        }
    }
