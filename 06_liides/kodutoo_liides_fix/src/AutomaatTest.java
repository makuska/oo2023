import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AutomaatTest {

//    KinnisvaraService kinnisvaraService;
//    public AutomaatTest(KinnisvaraService kinnisvaraService) {
//        this.kinnisvaraService = kinnisvaraService;
//    }

//    @Test
//    @DisplayName("Kui piirkond on Tallinnas Kesklinn siis test peab töötama")
//    public void test_peab_tootama_kui_tallinna_piirkond_on_kesklinn() {
//        Kinnisvara kinnisvaraTLN = new Kinnisvara("Tallinn", 799, 30.5, "Kesklinn");
//        assertEquals("Sul pole piisavalt raha", this.kinnisvaraService.getLocation(kinnisvaraTLN));
//    }

//    @Test
//    @DisplayName("Kui kinnisvara pindala on yle 50.1 ruutmeetri, siis peab hind olema 30% kõrgem")
//    public void test_peab_olema_true_kui_tallinna_kinnivsara_ruutmeeter_on_yle_50_mruudus(){
//        KinnisvaraTallinn kinnisvaraTLN = new KinnisvaraTallinn("Tallinn", 799, 30.5, "Kesklinn");
//        assertEquals(39, kinnisvaraTLN.getPrice(kinnisvaraTLN));
//    }

//    @Test
//    @DisplayName("hahah")
//    public void kui_tegemist_on_Tallinnaga_vot_siis_peab_olema_tallinna_piirkond(){
//        KinnisvaraTallinn kinnisvaraTLN = new KinnisvaraTallinn("Tallinn", 769, 40.9, "Kalamaja");
//        assertEquals("Tallinn", kinnisvaraService.getLocation(kinnisvaraTLN));
//    }

    @Test
    @DisplayName("Kui uus loodub object on Tallinna kohta, ja seal on tallinn, siis hind peab oelam 459")
    public void hind_peab_olema_459_kui_uue_loodud_objektile_on_antud_hinnaks_459(){
        KinnisvaraTallinn kinnisvaraTLN = new KinnisvaraTallinn("Tallinn", 459, 16.8, "Südalinn");
        assertEquals(459, kinnisvaraTLN.hind);
    }

    @Test
    @DisplayName("Kui korteri piirkonna porperty on 'Kesklinn', siis piirkonda küsides vahetab test piirkonna väärtuseks: 'Haha oled vaena, vaata parem lasnaka korterit'")
    public void kui_korter_asub_tallinna_kesklinnas_siis_oled_vaene_ja_Seda_osta_ei_saa_mispeale_retunib_haha_oled_vaene(){
        KinnisvaraTallinn kinnisvaraTallinn = new KinnisvaraTallinn(
                "Tallinn", 929, 61.7, "Kesklinn"
        );
        assertEquals("Haha oled vaena, vaata parem lasnaka korterit", kinnisvaraTallinn.getLocation2());
    }

    @Test
    @DisplayName("Kui objekti piirkond on 'Kardiorg' siis getLocation2 meetod peab retunima 'Kadriorg' ")
    public void object_piirkonna_vaartusega_kardiorg_peab_getLocation2_meetodit_kutsudes_returnima_kadriorg(){
        KinnisvaraTallinn kinnisvaraTallinn = new KinnisvaraTallinn(
                "Tallinn", 929, 61.7, "Kadriorg"
        );
        assertEquals("Kadriorg", kinnisvaraTallinn.getLocation2());
    }

}
