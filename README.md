"#desafio-accenture" 

//DADO que eu esteja na tela de Enter Vehicle Data
        navegador.findElement(By.id("entervehicledata")).click();

        //QUANDO preencho o campo Make
        WebElement campoMake = navegador.findElement(By.id("make"));
        campoMake.click();
        new Select(campoMake).selectByVisibleText("Volkswagen");

        //E preencho o campo Model
        WebElement campoModel = navegador.findElement(By.id("model"));
        campoModel.click();
        new Select(campoModel).selectByVisibleText("Moped");

        //E preencho o campo Cylinder Capacity [ccm]
        navegador.findElement(By.id("cylindercapacity")).sendKeys("62");

        //E preencho o campo Engine Performance [kW]
        navegador.findElement(By.id("engineperformance")).sendKeys("1523");

        //E preencho o campo Date of Manufacture
        navegador.findElement(By.name("Date of Manufacture")).sendKeys("06/12/2020");

        //E seleciono o Number of Seats
        WebElement campoSeats = navegador.findElement(By.id("numberofseats"));
        campoSeats.click();
        new Select(campoSeats).selectByVisibleText("7");

        //E seleciono o campo Right Hand Drive
        navegador.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[1]/div[7]/p/label[1]/span")).click();

        //E seleciono o campo Number of Seats
        WebElement campoNSeats = navegador.findElement(By.id("numberofseatsmotorcycle"));
        campoNSeats.click();
        new Select(campoNSeats).selectByVisibleText("3");

        //E seleciono o campo Fuel Type
        WebElement campoFuel = navegador.findElement(By.id("fuel"));
        campoFuel.click();
        new Select(campoFuel).selectByVisibleText("Electric Power");

        //E preencho o campo Payload [kg]
        navegador.findElement(By.id("payload")).sendKeys("200");

        //E preencho o campo Total Weight [kg]
        navegador.findElement(By.id("totalweight")).sendKeys("1000");

        //E preencho o campo List Price [$]
        navegador.findElement(By.id("listprice")).sendKeys("100000");

        //E preencho o campo License Plate Number
        navegador.findElement(By.id("licenseplatenumber")).sendKeys("5689786423");

        //E preencho o campo Annual Mileage [mi]
        navegador.findElement(By.id("annualmileage")).sendKeys("80000");

        //E clico no botão "Next"
        navegador.findElement(By.id("nextenterinsurantdata")).click();

        //ENTÃO avanço para a etapa de Enter Insurant Data
       navegador.findElement(By.name("First Name"));
       
       
       
       //---------------------------------------------------------------------------------

        //DADO que eu esteja na etapa de Enter Insurant Data
        navegador.findElement(By.name("First Name"));

        //QUANDO preencho o Campo First Name
        navegador.findElement(By.id("firstname")).sendKeys("Francisco");

        //E preencho o Campo Last Name
        navegador.findElement(By.id("lastname")).sendKeys("Lopes");

        //E preencho o campo Date of Birth
        navegador.findElement(By.id("birthdate")).sendKeys("06/06/1996");

        //E preencho o Campo Gender
        navegador.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]/span")).click();

        // E preencho o campo Street Address
        navegador.findElement(By.id("streetaddress")).sendKeys("Av Comandante Sampaio,641");

        //E preencho o campo Country
        WebElement campoCountry = navegador.findElement(By.id("country"));
        campoCountry.click();
        new Select(campoCountry).selectByVisibleText("Brazil");

        //E preencho o campo Zip Code
        navegador.findElement(By.id("zipcode")).sendKeys("06192010");

        //E preencho o campo City
        navegador.findElement(By.id("city")).sendKeys("Osasco");

        //E preencho o campo Occupation
        WebElement campoOccupation = navegador.findElement(By.id("occupation"));
        campoOccupation.click();
        new Select(campoOccupation).selectByVisibleText("Employee");

        //E preencho o campo Hobbies
        navegador.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[3]/span")).click();

        //E preencho o campoWebSite
        navegador.findElement(By.id("website")).sendKeys("https://br.linkedin.com/laelsonrodrigues-qa?_l=pt_BR");

        //E preencho o campo Picture
        navegador.findElement(By.id("picture")).sendKeys("C:\\Users\\laels\\OneDrive\\Imagens");

        //E clico no botão Next
        navegador.findElement(By.id("nextenterproductdata")).click();

        //ENTÃO avanço para a etapa de Enter Insurant Data
        navegador.findElement(By.name("Start Date"));


        //--------------------------------------------------------------------------------------------------------------

        //DADO que estou na etapa de Enter Insurant Data
        navegador.findElement(By.name("Start Date"));

        //QUANDO preencho o campo Start Date
        navegador.findElement(By.id("startdate")).sendKeys("02/01/2023");

        //E preencho o campo Insurance Sum
        WebElement campoSum = navegador.findElement(By.id("insurancesum"));
        campoSum.click();
        new Select(campoSum).selectByVisibleText("30.000.000,00");

        //E preencho o campo Merit Rating
        WebElement campoRating = navegador.findElement(By.id("meritrating"));
        campoRating.click();
        new Select(campoRating).selectByVisibleText("Bonus 9");

        //E preencho o campo Damage Insurance
        WebElement campoInsu = navegador.findElement(By.id("damageinsurance"));
        campoInsu.click();
        new Select(campoInsu).selectByVisibleText("Full Coverage");

        //E preencho o campo Optional Products
        navegador.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]/span")).click();

        //E preencho o campo Courtesy Car
        WebElement campoCourtesy = navegador.findElement(By.id("courtesycar"));
        campoCourtesy.click();
        new Select(campoCourtesy).selectByVisibleText("Yes");
        campoCourtesy.click();

        //E clico no botão next
        navegador.findElement(By.id("nextselectpriceoption")).click();

        //ENTÃO avanço para a etapa de Select Price Option
        navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        navegador.findElement(By.id("pricePlans"));


        //--------------------------------------------------------------------------------------------------------------

        //DADO que estou na etapa de Select Price Option
        navegador.findElement(By.id("pricePlans"));

        //QUANDO seleciono a opção de Price
        navegador.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[3]/span")).click();
        navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //E Clico em Next
        navegador.findElement(By.id("nextsendquote")).click();

        //então avanço para a etapa de Send Quote
        navegador.findElement(By.name("E-Mail"));

        //--------------------------------------------------------------------------------------------------------------

        //DADO que eu esteja na etapa de Sendo Quote
        navegador.findElement(By.name("E-Mail"));

        //QUANDO preencho Campo E-mail
        navegador.findElement(By.id("email")).sendKeys("laelson.rodrigues@hotmail.com");

        //E preencho o campo Phone
        navegador.findElement(By.id("phone")).sendKeys("11951078452");

        //E preencho campo Username
        navegador.findElement(By.id("username")).sendKeys("flaelson");

        //E preencho campo Password
        navegador.findElement(By.id("password")).sendKeys("Flaelson22");

        //E preencho campo confirm Password
        navegador.findElement(By.id("confirmpassword")).sendKeys("Flaelson22");

        //E preencho campo Comments
        navegador.findElement(By.id("Comments")).sendKeys("Teste de automação Accenture");

        //E clico  em Send
        navegador.findElement(By.id("sendemail")).click();

        //ENTÃO é apresentado mensagem de Sending e-mail success!
        navegador.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        String textElement = navegador.findElement(By.xpath("/html/body/div[4]/h2")).getText();
        Assert.assertEquals("Sending e-mail success!", textElement);


    }

    @After
    public void Fechar(){
        navegador.quit();
    }

}
