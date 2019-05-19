package au.edu.sydney.brawndo.erp.spfea.products;

public class ProductType {
    private String name;
    private double[] manufacturingData;
    private double[] marketingData;
    private double[] safetyData;
    private double[] licensingData;

    public ProductType(String name, double[] manufacturingData, double[] marketingData, double[] safetyData, double[] licensingData) {
        this.name = name;
        this.manufacturingData = manufacturingData;
        this.marketingData = marketingData;
        this.safetyData = safetyData;
        this.licensingData = licensingData;
    }

    public String getName() {
        return name;
    }

    public double[] getManufacturingData() {
        return manufacturingData;
    }

    public double[] getMarketingData() {
        return marketingData;
    }

    public double[] getSafetyData() {
        return safetyData;
    }

    public double[] getLicensingData() {
        return licensingData;
    }
}
