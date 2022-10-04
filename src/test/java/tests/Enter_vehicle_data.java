package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import java.util.concurrent.TimeUnit;

public class Enter_vehicle_data {
    private WebDriver navegador;

    @Before
    public void setUp() {
        //Abrindo o navegador
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\laels\\driver\\chromedriver\\chromedriver.exe");
        navegador = new ChromeDriver();
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //Navegando para a página do teste
        navegador.get("http://sampleapp.tricentis.com/101/app.php");

    }

    @Test
    public void test_PreencherFormulario() {

        //Certificando que estamos na página correta
        navegador.findElement(By.id("entervehicledata")).click();

        //Identificar e selecionar no campo Make
        WebElement campoMake = navegador.findElement(By.id("make"));
        campoMake.click();
        new Select(campoMake).selectByVisibleText("Volkswagen");

        //Identificar e selecionar o campo Model
        WebElement campoModel = navegador.findElement(By.id("model"));
        campoModel.click();
        new Select(campoModel).selectByVisibleText("Moped");

        //Preencher  campo capacidade do cilindro
        navegador.findElement(By.id("cylindercapacity")).sendKeys("62");

        //Preencher o campo Engine Performance
        navegador.findElement(By.id("engineperformance")).sendKeys("1523");

        //Preencher o campo data
        navegador.findElement(By.name("Date of Manufacture")).sendKeys("06/12/2020");

        //Selecionar Numer of Seats
        WebElement campoSeats = navegador.findElement(By.id("numberofseats"));
        campoSeats.click();
        new Select(campoSeats).selectByVisibleText("7");

        //Selecionar campo Right Hand Drive
        navegador.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[1]/div[7]/p/label[1]/span")).click();

        //Selecionar Number of Seats
        WebElement campoNSeats = navegador.findElement(By.id("numberofseatsmotorcycle"));
        campoNSeats.click();
        new Select(campoNSeats).selectByVisibleText("3");

        //Selecionar Fuel Type
        WebElement campoFuel = navegador.findElement(By.id("fuel"));
        campoFuel.click();
        new Select(campoFuel).selectByVisibleText("Electric Power");

        //preencher campo Payload
        navegador.findElement(By.id("payload")).sendKeys("200");

        //Preencher campo Total Weight
        navegador.findElement(By.id("totalweight")).sendKeys("1000");

        //preencher campo List Price
        navegador.findElement(By.id("listprice")).sendKeys("100000");

        //Prencher campo License Plate Number
        navegador.findElement(By.id("licenseplatenumber")).sendKeys("5689786423");

        //Preencher campo Annual Mileage
        navegador.findElement(By.id("annualmileage")).sendKeys("80000");

        //Clicar no Botão Next
        navegador.findElement(By.id("nextenterinsurantdata")).click();

        //---------------------------------------------------------------------------------

        //Certificando que estamos na página correta
        //navegador.findElement(By.id("entervehicledata")).click();

        //Preencher Campo First Name
        navegador.findElement(By.id("firstname")).sendKeys("Francisco");

        //Preencher Campo Last Name
        navegador.findElement(By.id("lastname")).sendKeys("Lopes");

        //Preencher campo Date of Birth
        navegador.findElement(By.id("birthdate")).sendKeys("06/06/1996");

        //Preencher Campo Gender
        navegador.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]/span")).click();

        // Preencher campo Street Address
        navegador.findElement(By.id("streetaddress")).sendKeys("Av Comandante Sampaio,641");

        //Preencher o campo Country
        WebElement campoCountry = navegador.findElement(By.id("country"));
        campoCountry.click();
        new Select(campoCountry).selectByVisibleText("Brazil");

        //Preencher oc ampo Zip Code
        navegador.findElement(By.id("zipcode")).sendKeys("06192010");

        //Preencher o campo City
        navegador.findElement(By.id("city")).sendKeys("Osasco");

        //Preencher o campo Occupation
        WebElement campoOccupation = navegador.findElement(By.id("occupation"));
        campoOccupation.click();
        new Select(campoOccupation).selectByVisibleText("Employee");

        //Preencher o campo Hobbies
        navegador.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[3]/span")).click();

        //Preencher o campoWebSite
        navegador.findElement(By.id("website")).sendKeys("https://br.linkedin.com/laelsonrodrigues-qa?_l=pt_BR");

        //Preencher o campo Picture
        navegador.findElement(By.id("picture")).sendKeys("C:\\Users\\laels\\OneDrive\\Imagens");

        //Clicar em Next
        navegador.findElement(By.id("nextenterproductdata")).click();

        //---------------------------------------------------------------------------------

        //Preencher Start Date
        navegador.findElement(By.id("startdate")).sendKeys("02/01/2023");

        //Preencher Insurance Sum
        WebElement campoSum = navegador.findElement(By.id("insurancesum"));
        campoSum.click();
        new Select(campoSum).selectByVisibleText("30.000.000,00");

        //Preencher Merit Rating
        WebElement campoRating = navegador.findElement(By.id("meritrating"));
        campoRating.click();
        new Select(campoRating).selectByVisibleText("Bonus 9");

        //Preencher Damage Insurance
        WebElement campoInsu = navegador.findElement(By.id("damageinsurance"));
        campoInsu.click();
        new Select(campoInsu).selectByVisibleText("Full Coverage");

        //preencher Optional Products
        navegador.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]/span")).click();

        //Preencher Courtesy Car
        WebElement campoCourtesy = navegador.findElement(By.id("courtesycar"));
        campoCourtesy.click();
        new Select(campoCourtesy).selectByVisibleText("Yes");
        campoCourtesy.click();

        //Clicar no botão next
        navegador.findElement(By.id("nextselectpriceoption")).click();


        //------------------------------------------------------------------------------------

        //Selecionar opção de Price
        navegador.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[3]/span")).click();
        navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Clicar em View quote
        //navegador.findElement(By.xpath("//*[@id=\"viewquote\"]/span/i")).click();
        //navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Clicar em Download Quote
        //navegador.findElement(By.xpath("//*[@id="downloadquote"]/span/i")).click();
        //.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Clicar em Next
        navegador.findElement(By.id("nextsendquote")).click();

        //------------------------------------------------------------------------------------

        //Preencher Campo E-mail
        navegador.findElement(By.id("email")).sendKeys("laelson.rodrigues@hotmail.com");

        //Preencher campo Phone
        navegador.findElement(By.id("phone")).sendKeys("11951078452");

        //Preencher campo Username
        navegador.findElement(By.id("username")).sendKeys("flaelson");

        //Preencher campo Password
        navegador.findElement(By.id("password")).sendKeys("Flaelson22");

        //Preencher campo confirm Password
        navegador.findElement(By.id("confirmpassword")).sendKeys("Flaelson22");

        //Preencher campo Comments
        navegador.findElement(By.id("Comments")).sendKeys("Teste de automação Accenture");


        //Clicar em Send
        navegador.findElement(By.id("sendemail")).click();



        //Validação final
        navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String textElement = navegador.findElement(By.xpath("/html/body/div[4]/h2")).getText();
        Assert.assertEquals("Sending e-mail success!", textElement);


    }

    @After
    public void Fechar(){
        navegador.quit();
    }

}



