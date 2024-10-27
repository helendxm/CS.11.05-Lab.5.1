import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
//        int [] householdEstimateKgPerCapitaPerYear = {1, 3, 60, 24, 5};
//        System.out.println("Median of household estimate per capita per year: "  + medianHouseholdEstimateKgPerCapitaPerYear(householdEstimateKgPerCapitaPerYear) + " kg");
//
//        String[] countries = {"USA", "Canada", "Germany", "France", "Japan"};
//        int[] totalWasteKgPerCapitaPerYear = {800, 600, 500, 400, 300};
//        double[] povertyPercentages = {10.5, 12.3, 12.3, 12.3, 7.5};
//        String[] confidences = {"High Confidence", "Medium Confidence", "High Confidence", "Low Confidence", "High Confidence"};
//
//        int wastePerYear = getCountryTotalWastePerYear(countries[4], countries, totalWasteKgPerCapitaPerYear);
//        System.out.println("Total waste in " + countries[4] + ": " + wastePerYear + " kg");
//
//        String highestWastePerCapita = getCountryWithMostWastePerCapita(countries, totalWasteKgPerCapitaPerYear);
//        System.out.println("Country with the highest amount of waste: " + highestWastePerCapita);
//
//        String[] highestPovertyCountries = getCountriesWithHighestPovertyPercentage(countries, povertyPercentages);
//        for (int i = 0; i < highestPovertyCountries.length; i++){
//            System.out.println("Country with the highest poverty percentage: " + highestPovertyCountries[i]);
//        }
//
//        String[] highestConfidenceCountries = getCountriesWithHighConfidence(countries, confidences);
//        for (int i = 0; i < highestConfidenceCountries.length; i++){
//            System.out.println("Country with the highest poverty percentage: " + highestConfidenceCountries[i]);
//        }
    }

    //Mean Methods

    public static int meanTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear) {
        return -1;
    }
    public static int meanHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear) {
        return -1;
    }

    public static int meanHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear) {
        return -1;
    }

    public static int meanRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear) {
        return -1;
    }

    public static int meanRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear) {
        return -1;
    }

    public static int meanFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear) {
        return -1;
    }

    public static int meanFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear) {
        return -1;
    }

    //Median Methods

    public static int medianTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear) {
        return -1;
    }


    public static int medianHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear) {
        int median = 0;
        Arrays.sort(householdEstimatesKgPerCapitaPerYear);
        int middleNum = householdEstimatesKgPerCapitaPerYear[householdEstimatesKgPerCapitaPerYear.length / 2];
        if (householdEstimatesKgPerCapitaPerYear.length % 2 == 0) {
            int afterMiddle = householdEstimatesKgPerCapitaPerYear[householdEstimatesKgPerCapitaPerYear.length / 2 + 1];
            median = (middleNum + afterMiddle / 2);
        }
        else {
            median = middleNum;
        }

        return median;
    }

    public static int medianHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear) {
        return -1;
    }

    public static int medianRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear) {
        return -1;
    }

    public static int medianRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear) {
        return -1;
    }

    public static int medianFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear) {
        return -1;
    }

    public static int medianFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear) {
        return -1;
    }

    //Min Methods

    public static int minTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear) {
        return -1;
    }

    public static int minHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear) {
        return -1;
    }

    public static int minHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear) {
        return -1;
    }

    public static int minRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear) {
        return -1;
    }

    public static int minRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear) {
        return -1;
    }

    public static int minFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear) {
        return -1;
    }

    public static int minFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear) {
        return -1;
    }

    //Max Methods

    public static int maxTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear) {
        return -1;
    }

    public static int maxHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear) {
        return -1;
    }

    public static int maxHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear) {
        return -1;
    }

    public static int maxRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear) {
        return -1;
    }

    public static int maxRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear) {
        return -1;
    }

    public static int maxFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear) {
        return -1;
    }

    public static int maxFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear) {
        return -1;
    }

    //Miscellaneous Methods
    //1
    public static int getCountryTotalWastePerYear(String country, String[] countries, int[] totalWasteKgPerCapitaPerYear)
    {
        for(int i = 0; i < countries.length; i++){
            if(countries[i].equals(country)){
                return totalWasteKgPerCapitaPerYear[i];
            }
        }

        return 0;
    }

    //2
    public static String getCountryWithMostWastePerCapita(String[] countries, int[] totalWasteKgPerCapitaPerYear) {
        int countryMostWaste = 0;

        for (int i = 1; i < totalWasteKgPerCapitaPerYear.length; i++) {
            if (totalWasteKgPerCapitaPerYear[i] > countryMostWaste) {
                countryMostWaste = totalWasteKgPerCapitaPerYear[i];
                countryMostWaste = i;
            }
        }

        return countries[countryMostWaste];
    }

    //3
    public static String[] getCountriesWithHighestPovertyPercentage(String[] countries, double[] percentagesShareInPoverty) {
        double maxPovertyPercentage = 0;
        for (int i = 0; i < percentagesShareInPoverty.length; i++) {
            if (percentagesShareInPoverty[i] > maxPovertyPercentage) {
                maxPovertyPercentage = percentagesShareInPoverty[i];
            }
        }

        int count = 0;
        for (double percentage : percentagesShareInPoverty) {
            if (percentage == maxPovertyPercentage) {
                count++;
            }
        }

        String[] countriesWithHighestPoverty = new String[count];
        int index = 0;

        for (int i = 0; i < percentagesShareInPoverty.length; i++) {
            if (percentagesShareInPoverty[i] == maxPovertyPercentage) {
                countriesWithHighestPoverty[index] = countries[i];
                index++;
            }
        }
        return countriesWithHighestPoverty;
    }

    //4
    public static String[] getCountriesWithHighConfidence(String[] countries, String[] confidences) {
        String highConfidenceLevel = "High Confidence";
        int confidenceAmount = 0;

        for (String confidence : confidences){
            if (confidence.equals(highConfidenceLevel)){
                confidenceAmount++;
            }
        }

        String[] countriesWithHighConfidence = new String[confidenceAmount];
        int countryIndex = 0;

        for(int i = 0; i < confidences.length; i++){
            if (confidences[i].equals(highConfidenceLevel)) {
                countriesWithHighConfidence[countryIndex] = countries[i];
                countryIndex++;
            }
        }

        return countriesWithHighConfidence;
    }
}