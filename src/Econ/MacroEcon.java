/*Description: This class holds Macroeconomics methods to calculate Per capia, Unemployment Rate, Percentage IncreaseGDP,
 * GDP, and Percentage Change 
 */
package Econ;

/**
 *
 * @author dominque
 */
public class MacroEcon 
{
    /**
     * 
     * @param GDP Gross Domestic Product 
     * @param Population population of the economy 
     * @return Gross Domestic Product / Population 
     */
    public static float PerCapia(float GDP, float Population)
    {
        return GDP / Population;
    }
    /**
     * 
     * @param CpiCurrentYear Consumer price index in current year
     * @param CpiPreviousYear consumer price index in previous year
     * @return (Consumer price index in current year - consumer price index in previous year) 
     * / consumer price index in previous year *100
     */
    public static float PercentIncreaseGDP(float CpiCurrentYear, float CpiPreviousYear)
    {
        return (CpiCurrentYear - CpiPreviousYear) / CpiPreviousYear * 100;
    }
    /**
     * 
     * @param NominalGDP measures a country's overall economic output
     * @param GDPdeflator measures the level of prices oof all new domestically produced
     * @return Nominal Gross Domestic Product / Gross Domestic Product deflator * 100
     */
    public static float GDP(float NominalGDP, float GDPdeflator)
    {
        return NominalGDP / GDPdeflator * 100;
    }
    /**
     * 
     * @param CurrentPrice current price
     * @param PreviousPrice previous price
     * @return (Current Price - Previous Price) / Previous Price
     */
    public static float PercentageChange(float CurrentPrice, float PreviousPrice)
    {
        return (CurrentPrice - PreviousPrice) / PreviousPrice;
    }
    /**
     * 
     * @param NumUnemployed Number of individuals unemployed
     * @param LaborForce Number of the Labor Force
     * @return Number Unemployed / Labor Force
     */
    public static float UnemploymentRate(float NumUnemployed, float LaborForce)
    {
        return NumUnemployed / LaborForce;
    }
    

}
