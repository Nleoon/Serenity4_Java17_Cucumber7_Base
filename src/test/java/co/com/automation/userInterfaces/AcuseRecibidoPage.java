package co.com.automation.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AcuseRecibidoPage {

    // ACUSE RECIBIDO
    public static final Target TXT_BUSCAR = Target.the("TXT BUSCAR").
            locatedBy("//textarea[1]");


    // ASSERTS
    public static final Target ASSERT_ACUSE_RECIBIDO_CARTA_SOMETIMIENTO = Target.the("ASSERT CARTA DE SOMETIMIENTO EN ACUSE DE RECIBIDO").
            locatedBy("(//div[@class='modal-header bg-info']/div/div[@class='col-md-10']/h5[@class='modal-title'])[3]");

}
