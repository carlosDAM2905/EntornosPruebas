package ejercicioscajanegra.ejemplo2apuntescajanegra;

import java.time.Month;
import java.util.Date;

public class Factura {
    public static String recargo(int diaMes){
      if (diaMes >=1 && diaMes <= 10){
          return "sin recargo";
      } else if (diaMes >= 11 && diaMes <= 20) {
          return "recargo del 2%";
      } else if (diaMes >= 21 && diaMes <= 31) {
          return "recargo del 4%";
      } else {
          return "día inválido";
      }
    }
}
