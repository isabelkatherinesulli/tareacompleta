import java.util.Scanner;
import java.util.Arrays;
public class OECHSLE{
    private Scanner esponja = new Scanner(System.in);
    private String apodo;
    public void inicio_sesion() {
        String correo, correo_in, contraseña, contraseña_in;
        System.out.println("Bienvenido a OECHLE");
        System.out.println("---INICIAR SECION---");
        System.out.println("-----CREAR CUENTA-----");
        System.out.println("Ingrese su nombre completo");
        apodo = esponja.nextLine();
        System.out.println("Ingrese su correo");
        correo = esponja.nextLine();
        System.out.println("Ingrese su contraseña");
        contraseña = esponja.nextLine();
        System.out.println("-----INICIAR SESION-----");
        System.out.println("Ingrese su correo");
        correo_in = esponja.nextLine();
        System.out.println("Ingrese su contraseña");
        contraseña_in = esponja.nextLine();
        if (correo_in.equals(correo) && contraseña_in.equals(contraseña)) {
            this.menu();
        } else {
            System.out.println("Credenciales incorrectas. Inténtalo nuevamente.");
        }
    }
    public void menu() {
        System.out.println("---- OECHLE ----");
        System.out.println(":::MENU:::");
        System.out.println("¿QUÉ ESTÁS BUSCANDO HOY?");
        System.out.println("1. MODA MUJER");
        System.out.println("2. MODA HOMBRE");
        System.out.println("3. MODA INFANTIL");
        System.out.println("4. CALZADOS");
        System.out.println("5. TECNOLOGIA");
        int opcion = esponja.nextInt();
        switch (opcion) {
            case 1:
                this.op_moda_mujer();
                break;
            case 2:
                this.op_moda_hombre();
                break;
            case 3:
                this.op_moda_infantil();
                break;
            case 4:
                this.op_moda_calzado();
                break;
            case 5:
                this.op_tecnologia();
                break;
            default:
                System.out.println("OPCION NO VALIDA");
        }
    }
    public String op_moda_mujer() {
        String[] RECIEN_NACIDOS = {"Skinny Jeans pitillo flerchi $119.00", "jean malabar correa $129.00", "joger mujer parada 111 ally $111.50"};

        String[] PERSONAJES_FAVORITOS = {"hypnotic casaca green pit $134.00", "chompa malabar manga larga mel 123.00", "abrigo sfera solapa camel $121.00"};

        String[] ZAPATOS = {"chaleco hypnotic mujer cruce $132.00", "vestido largo hypnotic largo vainilla $123.00", "polo hypnotic mety $121.00"};

        double[] precio = {119.00, 129.00, 111.50, 134.00, 123.00, 121.00, 132.00, 123.00, 121.00};
        double igv, subtotal, totalpagar;
        int[] carrito = new int[RECIEN_NACIDOS.length];
        int[] carrito_PERSONAJES = new int[PERSONAJES_FAVORITOS.length];
        int[] carrito_ZAPATOS = new int[ZAPATOS.length];
        int opcion, cantidad;
        String metodo_pago, NOMBRE, DNI, clave;
        System.out.println("-----------BIENVENIDOS A OECHSLE-----------");
        System.out.println("ENCUENTRA TU STOCK FAVORITO AQUI");
        System.out.println("TENEMOS EN:");
        System.out.println(" 1.- JEANS");
        System.out.println(" 2.- MARCAS MUJER");
        System.out.println(" 3.- NIGHT x HIPNOTIC");

        opcion = esponja.nextInt();
        esponja.nextLine();
        switch (opcion) {
            case 1:
                System.out.println("Elige una opción:");
                for (int i = 0; i < RECIEN_NACIDOS.length; i++) {
                    System.out.println("Opción " + (i + 1) + ": " + RECIEN_NACIDOS[i]);
                }
                opcion = esponja.nextInt();
                esponja.nextLine();
                switch (opcion) {
                    case 1:
                        System.out.println("¿Cuántos desea comprar?");
                        cantidad = esponja.nextInt();
                        esponja.nextLine();
                        carrito[0] += cantidad;
                        System.out.println("Ha pedido " + carrito[0] + " de " + RECIEN_NACIDOS[0]);
                        break;
                    case 2:
                        System.out.println("¿Cuántos desea comprar?");
                        cantidad = esponja.nextInt();
                        esponja.nextLine();
                        carrito[1] += cantidad;
                        System.out.println("Ha pedido " + carrito[1] + " de " + RECIEN_NACIDOS[1]);
                        break;
                    case 3:
                        System.out.println("¿Cuántos desea comprar?");
                        cantidad = esponja.nextInt();
                        esponja.nextLine();
                        carrito[2] += cantidad;
                        System.out.println("Ha pedido " + carrito[2] + " de " + RECIEN_NACIDOS[2]);
                        break;
                    default:
                        System.out.println("Opción no válida");
                        break;
                }
                break;
            case 2:
                System.out.println("Elige una opción:");
                for (int i = 0; i < PERSONAJES_FAVORITOS.length; i++) {
                    System.out.println("Opción " + (i + 1) + ": " + PERSONAJES_FAVORITOS[i]);
                }
                opcion = esponja.nextInt();
                esponja.nextLine();
                switch (opcion) {
                    case 1:
                        System.out.println("¿Cuántos desea comprar?");
                        cantidad = esponja.nextInt();
                        esponja.nextLine();
                        carrito[0] += cantidad;
                        System.out.println("Ha pedido " + carrito[0] + " de " + PERSONAJES_FAVORITOS[0]);
                        break;
                    case 2:
                        System.out.println("¿Cuántos desea comprar?");
                        cantidad = esponja.nextInt();
                        esponja.nextLine();
                        carrito[1] += cantidad;
                        System.out.println("Ha pedido " + carrito[1] + " de " + PERSONAJES_FAVORITOS[1]);
                        break;
                    case 3:
                        System.out.println("¿Cuántos desea comprar?");
                        cantidad = esponja.nextInt();
                        esponja.nextLine();
                        carrito[2] += cantidad;
                        System.out.println("Ha pedido " + carrito[2] + " de " + PERSONAJES_FAVORITOS[2]);
                        break;
                    default:
                        System.out.println("Opción no válida");
                        break;
                }
                break;
            case 3:
                System.out.println("Elige una opción:");
                for (int i = 0; i < ZAPATOS.length; i++) {
                    System.out.println("Opción " + (i + 1) + ": " + ZAPATOS[i]);
                }
                opcion = esponja.nextInt();
                esponja.nextLine();
                switch (opcion) {
                    case 1:
                        System.out.println("¿Cuántos desea comprar?");
                        cantidad = esponja.nextInt();
                        esponja.nextLine();
                        carrito[0] += cantidad;
                        System.out.println("Ha pedido " + carrito[0] + " de " + ZAPATOS[0]);
                        break;
                    case 2:
                        System.out.println("¿Cuántos desea comprar?");
                        cantidad = esponja.nextInt();
                        esponja.nextLine();
                        carrito[1] += cantidad;
                        System.out.println("Ha pedido " + carrito[1] + " de " + ZAPATOS[1]);
                        break;
                    case 3:
                        System.out.println("¿Cuántos desea comprar?");
                        cantidad = esponja.nextInt();
                        esponja.nextLine();
                        carrito[2] += cantidad;
                        System.out.println("Ha pedido " + carrito[2] + " de " + ZAPATOS[2]);
                        break;
                    default:
                        System.out.println("Opción no válida");
                        break;
                }
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
        double subtotalRECIEN = Arrays.stream(carrito).sum() * precio[0];
        double subtotalPERSONAJES = Arrays.stream(carrito_PERSONAJES).sum() * precio[1];
        double subtotalZAPATOS = Arrays.stream(carrito_ZAPATOS).sum() * precio[2];

        double subtotalTotal = subtotalRECIEN + subtotalPERSONAJES + subtotalZAPATOS;
        igv = subtotalTotal * 0.18;
        totalpagar = subtotalTotal + igv;

        System.out.println("Subtotal JEANS : S/ " + subtotalRECIEN);
        System.out.println("Subtotal MARCAS MUJER : S/ " + subtotalPERSONAJES);
        System.out.println("Subtotal NIGHT x HIPNOTIC : S/ " + subtotalZAPATOS);
        System.out.println("----------------------------------------");
        System.out.println("Subtotal Total: S/ " + subtotalTotal);
        System.out.println("IGV : S/ " + igv);
        System.out.println("Total a pagar: S/ " + totalpagar);

        System.out.println("seleccione tipo de pago11");
        System.out.println("1. Tarjeta de crédito");
        System.out.println("2. Efectivo");
        metodo_pago = esponja.nextLine();

        switch (metodo_pago) {
            case "1":
                System.out.println("Ingrese su DNI");
                DNI = esponja.nextLine();
                System.out.println("Ingrese su clave:");
                clave = esponja.nextLine();
                System.out.println("TRANSACCION exitosa");
                break;
            case "2":
                System.out.println("Ingrese su DNI");
                DNI = esponja.nextLine();
                System.out.println("TRANSACCION exitosa");
                break;
            case "3":
                System.out.println("Ingrese su DNI");
                DNI = esponja.nextLine();
                System.out.println("TRANSACCION exitosa");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
        return null;
    }
    public String op_moda_hombre() {
        String[] RECIEN_NACIDOS = {"Hipnotic casaca Revers hombre negro","Madison gorra caspre bonber negro","Pioner gorra traficc Hat hombre verde militar"};

        String[] PERSONAJES_FAVORITOS = {"polo pijama Hipnotic manga larga", "bata Madison Flannel hombre", "bata Madison con pantufla waffle"};

        String[] ZAPATOS = {"lentes skullcandy bold lunas negras", "lentes skullcandy bold lunas rojas", "collar deplatahombre"};

        double[] precio = {154.50, 144.50, 134.50, 124.00, 115.00, 111.00};
        double igv, subtotal, totalpagar;
        int[] carrito = new int[RECIEN_NACIDOS.length];
        int[] carrito_PERSONAJES = new int[PERSONAJES_FAVORITOS.length];
        int[] carrito_ZAPATOS = new int[ZAPATOS.length];
        int opcion, cantidad;
        String metodo_pago, NOMBRE, DNI, clave;
        System.out.println("-----------BIENVENIDOS A OECHSLE-----------");
        System.out.println("ENCUENTRA TU STOCK FAVORITO AQUI");
        System.out.println("TENEMOS EN:");
        System.out.println(" 1.- MARCAS ");
        System.out.println(" 2.- PIJAMAS ");
        System.out.println(" 3.- ACCESORIOS");

        opcion = esponja.nextInt();
        esponja.nextLine();
        switch (opcion) {
            case 1:
                System.out.println("Elige una opción:");
                for (int i = 0; i < RECIEN_NACIDOS.length; i++) {
                    System.out.println("Opción " + (i + 1) + ": " + RECIEN_NACIDOS[i]);
                }
                opcion = esponja.nextInt();
                esponja.nextLine();
                switch (opcion) {
                    case 1:
                        System.out.println("¿Qué color desea comprar?");
                        System.out.println("1. Rosado S/ 154.50");
                        System.out.println("2. Amarillo S/ 144.50");
                        System.out.println("3. Blanco S/ 134.50");
                        int opcionColor = esponja.nextInt();
                        esponja.nextLine();
                        System.out.println("¿Cuántos desea comprar?");
                        cantidad = esponja.nextInt();
                        esponja.nextLine();
                        carrito[0] += cantidad;
                        System.out.println("Ha pedido " + carrito[0] + " de " + RECIEN_NACIDOS[0]);
                        break;
                    case 2:
                        System.out.println("¿Qué color desea comprar?");
                        System.out.println("1. Rosado S/ 154.50");
                        System.out.println("2. Celeste S/ 144.50");
                        System.out.println("3. Amarillo S/ 134.50");
                        opcionColor = esponja.nextInt();
                        esponja.nextLine();
                        System.out.println("¿Cuántos desea comprar?");
                        cantidad = esponja.nextInt();
                        esponja.nextLine();
                        carrito[1] += cantidad;
                        System.out.println("Ha pedido " + carrito[1] + " de " + RECIEN_NACIDOS[1]);
                        break;
                    case 3:
                        System.out.println("¿Qué color desea comprar?");
                        System.out.println("1. Blanco S/ 154.50");
                        System.out.println("2. Negro S/ 145.00");
                        System.out.println("3. Celeste S/ 134.00");
                        opcionColor = esponja.nextInt();
                        esponja.nextLine();
                        System.out.println("¿Cuántos desea comprar?");
                        cantidad = esponja.nextInt();
                        esponja.nextLine();
                        carrito[2] += cantidad;
                        System.out.println("Ha pedido " + carrito[2] + " de " + RECIEN_NACIDOS[2]);
                        break;
                    default:
                        System.out.println("Opción no válida");
                        break;
                }
                break;
            case 2:
                System.out.println("Elige una opción:");
                for (int i = 0; i < PERSONAJES_FAVORITOS.length; i++) {
                    System.out.println("Opción " + (i + 1) + ": " + PERSONAJES_FAVORITOS[i]);
                }
                opcion = esponja.nextInt();
                esponja.nextLine();
                switch (opcion) {
                    case 1:
                        System.out.println("¿Qué color desea comprar?");
                        System.out.println("1. Rosado S/ 154.50");
                        System.out.println("2. Amarillo S/ 144.50");
                        System.out.println("3. Blanco S/ 134.50");
                        int opcionColor = esponja.nextInt();
                        esponja.nextLine();
                        System.out.println("¿Cuántos desea comprar?");
                        cantidad = esponja.nextInt();
                        esponja.nextLine();
                        carrito[0] += cantidad;
                        System.out.println("Ha pedido " + carrito[0] + " de " + PERSONAJES_FAVORITOS[0]);
                        break;
                    case 2:
                        System.out.println("¿Qué color desea comprar?");
                        System.out.println("1. Rosado S/ 154.50");
                        System.out.println("2. Celeste S/ 144.50");
                        System.out.println("3. Amarillo S/ 134.50");
                        opcionColor = esponja.nextInt();
                        esponja.nextLine();
                        System.out.println("¿Cuántos desea comprar?");
                        cantidad = esponja.nextInt();
                        esponja.nextLine();
                        carrito[1] += cantidad;
                        System.out.println("Ha pedido " + carrito[1] + " de " + PERSONAJES_FAVORITOS[1]);
                        break;
                    case 3:
                        System.out.println("¿Qué color desea comprar?");
                        System.out.println("1. Blanco S/ 154.50");
                        System.out.println("2. Negro S/ 144.00");
                        System.out.println("3. Celeste S/ 134.00");
                        opcionColor = esponja.nextInt();
                        esponja.nextLine();
                        System.out.println("¿Cuántos desea comprar?");
                        cantidad = esponja.nextInt();
                        esponja.nextLine();
                        carrito[2] += cantidad;
                        System.out.println("Ha pedido " + carrito[2] + " de " + PERSONAJES_FAVORITOS[2]);
                        break;
                    default:
                        System.out.println("Opción no válida");
                        break;
                }
                break;
            case 3:
                System.out.println("Elige una opción:");
                for (int i = 0; i < ZAPATOS.length; i++) {
                    System.out.println("Opción " + (i + 1) + ": " + ZAPATOS[i]);
                }
                opcion = esponja.nextInt();
                esponja.nextLine();
                switch (opcion) {
                    case 1:
                        System.out.println("¿QUE TALLA DESEA?");
                        System.out.println("1. TALLA 32");
                        System.out.println("2. TALLA 30");
                        System.out.println("3. TALLA 34");
                        int opcionColor = esponja.nextInt();
                        esponja.nextLine();
                        System.out.println("¿Cuántos desea comprar?");
                        cantidad = esponja.nextInt();
                        esponja.nextLine();
                        carrito[0] += cantidad;
                        System.out.println("Ha pedido " + carrito[0] + " de " + ZAPATOS[0]);
                        break;
                    case 2:
                        System.out.println("¿QUE TALLA DESEA ?");
                        System.out.println("1. TALLA 30");
                        System.out.println("2. TALLA 32");
                        System.out.println("3. TALLA 34");
                        opcionColor = esponja.nextInt();
                        esponja.nextLine();
                        System.out.println("¿Cuántos desea comprar?");
                        cantidad = esponja.nextInt();
                        esponja.nextLine();
                        carrito[1] += cantidad;
                        System.out.println("Ha pedido " + carrito[1] + " de " + ZAPATOS[1]);
                        break;
                    case 3:
                        System.out.println("¿QUE TALLA DESEA?");
                        System.out.println("1. TALLA 30");
                        System.out.println("2. TALLA 32");
                        System.out.println("3. TALLA 34");
                        opcionColor = esponja.nextInt();
                        esponja.nextLine();
                        System.out.println("¿Cuántos desea comprar?");
                        cantidad = esponja.nextInt();
                        esponja.nextLine();
                        carrito[2] += cantidad;
                        System.out.println("Ha pedido " + carrito[2] + " de " + ZAPATOS[2]);
                        break;
                    default:
                        System.out.println("Opción no válida");
                        break;
                }
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
        double subtotalRECIEN = Arrays.stream(carrito).sum() * precio[0];
        double subtotalPERSONAJES = Arrays.stream(carrito_PERSONAJES).sum() * precio[1];
        double subtotalZAPATOS = Arrays.stream(carrito_ZAPATOS).sum() * precio[2];

        double subtotalTotal = subtotalRECIEN + subtotalPERSONAJES + subtotalZAPATOS;
        igv = subtotalTotal * 0.18;
        totalpagar = subtotalTotal + igv;

        System.out.println("Subtotal MARCAS : S/ " + subtotalRECIEN);
        System.out.println("Subtotal PIJAMAS : S/ " + subtotalPERSONAJES);
        System.out.println("Subtotal ACCESORIOS : S/ " + subtotalZAPATOS);
        System.out.println("----------------------------------------");
        System.out.println("Subtotal Total: S/ " + subtotalTotal);
        System.out.println("IGV : S/ " + igv);
        System.out.println("Total a pagar: S/ " + totalpagar);

        System.out.println("seleccione tipo de pago11");
        System.out.println("1. Tarjeta de crédito");
        System.out.println("2. Efectivo");
        metodo_pago = esponja.nextLine();

        switch (metodo_pago) {
            case "1":
                System.out.println("Ingrese su DNI");
                DNI = esponja.nextLine();
                System.out.println("Ingrese su clave:");
                clave = esponja.nextLine();
                System.out.println("TRANSACCION exitosa");
                break;
            case "2":
                System.out.println("Ingrese su DNI");
                DNI = esponja.nextLine();
                System.out.println("TRANSACCION exitosa");
                break;
            case "3":
                System.out.println("Ingrese su DNI");
                DNI = esponja.nextLine();
                System.out.println("TRANSACCION exitosa");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
        return null;
    }
    public String op_moda_infantil() {
        String[] RECIEN_NACIDOS = {"PIJAMA 2 PIEZAS PARA RECIEN NACIDO BABY CIRCUS PANTALON", "PIJAMA PARA RECIEN NACIDO ENTERIZO BABY CIRCUS MAMA", "MANTA PARA RECIEN NACIDO BABY CIRCUS"};

        String[] PERSONAJES_FAVORITOS = {"BARBIE POLO ROSADO NIÑA S/ 34.50", "SPIDERMAN POLO NEGRO NIÑO S/ 34.50", "KUNFU PANDA POLO CELESTE NIÑO 34.50"};

        String[] ZAPATOS = {"zapato de cuero escolar varon S/ 70.00", "zapato de cuero escolar mujer S/ 65.00", "zapatillas deportivas S/ 120.00"};

        double[] precio = {34.50, 34.50, 34.50, 70.00, 65.00, 120.00};
        double igv, subtotal, totalpagar;
        int[] carrito = new int[RECIEN_NACIDOS.length];
        int[] carrito_PERSONAJES = new int[PERSONAJES_FAVORITOS.length];
        int[] carrito_ZAPATOS = new int[ZAPATOS.length];
        int opcion, cantidad;
        String metodo_pago, NOMBRE, DNI, clave;
        System.out.println("-----------BIENVENIDOS A OECHSLE-----------");
        System.out.println("ENCUENTRA TU STOCK FAVORITO AQUI");
        System.out.println("TENEMOS EN:");
        System.out.println(" 1.- RECIEN NACIDOS");
        System.out.println(" 2.- PERSONAJES FAVORITOS");
        System.out.println(" 3.- ZAPATOS");

        opcion = esponja.nextInt();
        esponja.nextLine();
        switch (opcion) {
            case 1:
                System.out.println("Elige una opción:");
                for (int i = 0; i < RECIEN_NACIDOS.length; i++) {
                    System.out.println("Opción " + (i + 1) + ": " + RECIEN_NACIDOS[i]);
                }
                opcion = esponja.nextInt();
                esponja.nextLine();
                switch (opcion) {
                    case 1:
                        System.out.println("¿Qué color desea comprar?");
                        System.out.println("1. Rosado S/ 34.50");
                        System.out.println("2. Amarillo S/ 34.50");
                        System.out.println("3. Blanco S/ 34.50");
                        int opcionColor = esponja.nextInt();
                        esponja.nextLine();
                        System.out.println("¿Cuántos desea comprar?");
                        cantidad = esponja.nextInt();
                        esponja.nextLine();
                        carrito[0] += cantidad;
                        System.out.println("Ha pedido " + carrito[0] + " de " + RECIEN_NACIDOS[0]);
                        break;
                    case 2:
                        System.out.println("¿Qué color desea comprar?");
                        System.out.println("1. Rosado S/ 34.50");
                        System.out.println("2. Celeste S/ 34.50");
                        System.out.println("3. Amarillo S/ 34.50");
                        opcionColor = esponja.nextInt();
                        esponja.nextLine();
                        System.out.println("¿Cuántos desea comprar?");
                        cantidad = esponja.nextInt();
                        esponja.nextLine();
                        carrito[1] += cantidad;
                        System.out.println("Ha pedido " + carrito[1] + " de " + RECIEN_NACIDOS[1]);
                        break;
                    case 3:
                        System.out.println("¿Qué color desea comprar?");
                        System.out.println("1. Blanco S/ 34.50");
                        System.out.println("2. Negro S/ 34.00");
                        System.out.println("3. Celeste S/ 34.00");
                        opcionColor = esponja.nextInt();
                        esponja.nextLine();
                        System.out.println("¿Cuántos desea comprar?");
                        cantidad = esponja.nextInt();
                        esponja.nextLine();
                        carrito[2] += cantidad;
                        System.out.println("Ha pedido " + carrito[2] + " de " + RECIEN_NACIDOS[2]);
                        break;
                    default:
                        System.out.println("Opción no válida");
                        break;
                }
                break;
            case 2:
                System.out.println("Elige una opción:");
                for (int i = 0; i < PERSONAJES_FAVORITOS.length; i++) {
                    System.out.println("Opción " + (i + 1) + ": " + PERSONAJES_FAVORITOS[i]);
                }
                opcion = esponja.nextInt();
                esponja.nextLine();
                switch (opcion) {
                    case 1:
                        System.out.println("¿Qué color desea comprar?");
                        System.out.println("1. Rosado S/ 34.50");
                        System.out.println("2. Amarillo S/ 34.50");
                        System.out.println("3. Blanco S/ 34.50");
                        int opcionColor = esponja.nextInt();
                        esponja.nextLine();
                        System.out.println("¿Cuántos desea comprar?");
                        cantidad = esponja.nextInt();
                        esponja.nextLine();
                        carrito[0] += cantidad;
                        System.out.println("Ha pedido " + carrito[0] + " de " + PERSONAJES_FAVORITOS[0]);
                        break;
                    case 2:
                        System.out.println("¿Qué color desea comprar?");
                        System.out.println("1. Rosado S/ 34.50");
                        System.out.println("2. Celeste S/ 34.50");
                        System.out.println("3. Amarillo S/ 34.50");
                        opcionColor = esponja.nextInt();
                        esponja.nextLine();
                        System.out.println("¿Cuántos desea comprar?");
                        cantidad = esponja.nextInt();
                        esponja.nextLine();
                        carrito[1] += cantidad;
                        System.out.println("Ha pedido " + carrito[1] + " de " + PERSONAJES_FAVORITOS[1]);
                        break;
                    case 3:
                        System.out.println("¿Qué color desea comprar?");
                        System.out.println("1. Blanco S/ 34.50");
                        System.out.println("2. Negro S/ 34.00");
                        System.out.println("3. Celeste S/ 34.00");
                        opcionColor = esponja.nextInt();
                        esponja.nextLine();
                        System.out.println("¿Cuántos desea comprar?");
                        cantidad = esponja.nextInt();
                        esponja.nextLine();
                        carrito[2] += cantidad;
                        System.out.println("Ha pedido " + carrito[2] + " de " + PERSONAJES_FAVORITOS[2]);
                        break;
                    default:
                        System.out.println("Opción no válida");
                        break;
                }
                break;
            case 3:
                System.out.println("Elige una opción:");
                for (int i = 0; i < ZAPATOS.length; i++) {
                    System.out.println("Opción " + (i + 1) + ": " + ZAPATOS[i]);
                }
                opcion = esponja.nextInt();
                esponja.nextLine();
                switch (opcion) {
                    case 1:
                        System.out.println("¿QUE TALLA DESEA?");
                        System.out.println("1. TALLA 32");
                        System.out.println("2. TALLA 30");
                        System.out.println("3. TALLA 34");
                        int opcionColor = esponja.nextInt();
                        esponja.nextLine();
                        System.out.println("¿Cuántos desea comprar?");
                        cantidad = esponja.nextInt();
                        esponja.nextLine();
                        carrito[0] += cantidad;
                        System.out.println("Ha pedido " + carrito[0] + " de " + ZAPATOS[0]);
                        break;
                    case 2:
                        System.out.println("¿QUE TALLA DESEA ?");
                        System.out.println("1. TALLA 30");
                        System.out.println("2. TALLA 32");
                        System.out.println("3. TALLA 34");
                        opcionColor = esponja.nextInt();
                        esponja.nextLine();
                        System.out.println("¿Cuántos desea comprar?");
                        cantidad = esponja.nextInt();
                        esponja.nextLine();
                        carrito[1] += cantidad;
                        System.out.println("Ha pedido " + carrito[1] + " de " + ZAPATOS[1]);
                        break;
                    case 3:
                        System.out.println("¿QUE TALLA DESEA?");
                        System.out.println("1. TALLA 30");
                        System.out.println("2. TALLA 32");
                        System.out.println("3. TALLA 34");
                        opcionColor = esponja.nextInt();
                        esponja.nextLine();
                        System.out.println("¿Cuántos desea comprar?");
                        cantidad = esponja.nextInt();
                        esponja.nextLine();
                        carrito[2] += cantidad;
                        System.out.println("Ha pedido " + carrito[2] + " de " + ZAPATOS[2]);
                        break;
                    default:
                        System.out.println("Opción no válida");
                        break;
                }
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
        double subtotalRECIEN = Arrays.stream(carrito).sum() * precio[0];
        double subtotalPERSONAJES = Arrays.stream(carrito_PERSONAJES).sum() * precio[1];
        double subtotalZAPATOS = Arrays.stream(carrito_ZAPATOS).sum() * precio[2];

        double subtotalTotal = subtotalRECIEN + subtotalPERSONAJES + subtotalZAPATOS;
        igv = subtotalTotal * 0.18;
        totalpagar = subtotalTotal + igv;

        System.out.println("Subtotal RECIEN NACIDOS: S/ " + subtotalRECIEN);
        System.out.println("Subtotal PERSONAJES FAVORITOS: S/ " + subtotalPERSONAJES);
        System.out.println("Subtotal ZAPATOS: S/ " + subtotalZAPATOS);
        System.out.println("----------------------------------------");
        System.out.println("Subtotal Total: S/ " + subtotalTotal);
        System.out.println("IGV : S/ " + igv);
        System.out.println("Total a pagar: S/ " + totalpagar);

        System.out.println("seleccione tipo de pago11");
        System.out.println("1. Tarjeta de crédito");
        System.out.println("2. Efectivo");
        metodo_pago = esponja.nextLine();

        switch (metodo_pago) {
            case "1":
                System.out.println("Ingrese su DNI");
                DNI = esponja.nextLine();
                System.out.println("Ingrese su clave:");
                clave = esponja.nextLine();
                System.out.println("TRANSACCION exitosa");
                break;
            case "2":
                System.out.println("Ingrese su DNI");
                DNI = esponja.nextLine();
                System.out.println("TRANSACCION exitosa");
                break;
            case "3":
                System.out.println("Ingrese su DNI");
                DNI = esponja.nextLine();
                System.out.println("TRANSACCION exitosa");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
        return null;
    }
    public String op_moda_calzado() {
        String[] RECIEN_NACIDOS = {"ZAPATILLAS HOMBRE $134.00", "ZAPATILLAS MUJER $124.00", "ZAPATILLAS NIÑOS $114.00"};

        String[] PERSONAJES_FAVORITOS = {"ZAPATILLAS HOMBRE $134.00", "ZAPATILLAS MUJER $124.00", "ZAPATILLAS NIÑOS $114.00"};

        String[] ZAPATOS = {"ZAPATILLAS HOMBRE $134.00", "ZAPATILLAS MUJER $124.00", "ZAPATILLAS NIÑOS $114.00"};

        double[] precio = {134.50, 124.50, 114.50, 134.00, 125.00, 111.00};
        double igv, subtotal, totalpagar;
        int[] carrito = new int[RECIEN_NACIDOS.length];
        int[] carrito_PERSONAJES = new int[PERSONAJES_FAVORITOS.length];
        int[] carrito_ZAPATOS = new int[ZAPATOS.length];
        int opcion, cantidad;
        String metodo_pago, NOMBRE, DNI, clave;
        System.out.println("-----------BIENVENIDOS A OECHSLE-----------");
        System.out.println("ENCUENTRA TU STOCK FAVORITO AQUI");
        System.out.println("TENEMOS EN:");
        System.out.println(" 1.- ZAPATILLAS ADIDAS");
        System.out.println(" 2.- ZAPATILLAS PUMA");
        System.out.println(" 3.- ZAPATILLAS NIKE");

        opcion = esponja.nextInt();
        esponja.nextLine();
        switch (opcion) {
            case 1:
                System.out.println("Elige una opción:");
                for (int i = 0; i < RECIEN_NACIDOS.length; i++) {
                    System.out.println("Opción " + (i + 1) + ": " + RECIEN_NACIDOS[i]);
                }
                opcion = esponja.nextInt();
                esponja.nextLine();
                switch (opcion) {
                    case 1:
                        System.out.println("¿Qué color desea comprar?");
                        System.out.println("1. Rosado S/ 134.50");
                        System.out.println("2. Amarillo S/ 124.50");
                        System.out.println("3. Blanco S/ 114.50");
                        int opcionColor = esponja.nextInt();
                        esponja.nextLine();
                        System.out.println("¿Cuántos desea comprar?");
                        cantidad = esponja.nextInt();
                        esponja.nextLine();
                        carrito[0] += cantidad;
                        System.out.println("Ha pedido " + carrito[0] + " de " + RECIEN_NACIDOS[0]);
                        break;
                    case 2:
                        System.out.println("¿Qué color desea comprar?");
                        System.out.println("1. Rosado S/ 134.50");
                        System.out.println("2. Celeste S/ 124.50");
                        System.out.println("3. Amarillo S/ 114.50");
                        opcionColor = esponja.nextInt();
                        esponja.nextLine();
                        System.out.println("¿Cuántos desea comprar?");
                        cantidad = esponja.nextInt();
                        esponja.nextLine();
                        carrito[1] += cantidad;
                        System.out.println("Ha pedido " + carrito[1] + " de " + RECIEN_NACIDOS[1]);
                        break;
                    case 3:
                        System.out.println("¿Qué color desea comprar?");
                        System.out.println("1. Blanco S/ 134.50");
                        System.out.println("2. Negro S/ 125.00");
                        System.out.println("3. Celeste S/ 114.00");
                        opcionColor = esponja.nextInt();
                        esponja.nextLine();
                        System.out.println("¿Cuántos desea comprar?");
                        cantidad = esponja.nextInt();
                        esponja.nextLine();
                        carrito[2] += cantidad;
                        System.out.println("Ha pedido " + carrito[2] + " de " + RECIEN_NACIDOS[2]);
                        break;
                    default:
                        System.out.println("Opción no válida");
                        break;
                }
                break;
            case 2:
                System.out.println("Elige una opción:");
                for (int i = 0; i < PERSONAJES_FAVORITOS.length; i++) {
                    System.out.println("Opción " + (i + 1) + ": " + PERSONAJES_FAVORITOS[i]);
                }
                opcion = esponja.nextInt();
                esponja.nextLine();
                switch (opcion) {
                    case 1:
                        System.out.println("¿Qué color desea comprar?");
                        System.out.println("1. Rosado S/ 134.50");
                        System.out.println("2. Amarillo S/ 124.50");
                        System.out.println("3. Blanco S/ 114.50");
                        int opcionColor = esponja.nextInt();
                        esponja.nextLine();
                        System.out.println("¿Cuántos desea comprar?");
                        cantidad = esponja.nextInt();
                        esponja.nextLine();
                        carrito[0] += cantidad;
                        System.out.println("Ha pedido " + carrito[0] + " de " + PERSONAJES_FAVORITOS[0]);
                        break;
                    case 2:
                        System.out.println("¿Qué color desea comprar?");
                        System.out.println("1. Rosado S/ 134.50");
                        System.out.println("2. Celeste S/ 124.50");
                        System.out.println("3. Amarillo S/ 114.50");
                        opcionColor = esponja.nextInt();
                        esponja.nextLine();
                        System.out.println("¿Cuántos desea comprar?");
                        cantidad = esponja.nextInt();
                        esponja.nextLine();
                        carrito[1] += cantidad;
                        System.out.println("Ha pedido " + carrito[1] + " de " + PERSONAJES_FAVORITOS[1]);
                        break;
                    case 3:
                        System.out.println("¿Qué color desea comprar?");
                        System.out.println("1. Blanco S/ 134.50");
                        System.out.println("2. Negro S/ 124.00");
                        System.out.println("3. Celeste S/ 114.00");
                        opcionColor = esponja.nextInt();
                        esponja.nextLine();
                        System.out.println("¿Cuántos desea comprar?");
                        cantidad = esponja.nextInt();
                        esponja.nextLine();
                        carrito[2] += cantidad;
                        System.out.println("Ha pedido " + carrito[2] + " de " + PERSONAJES_FAVORITOS[2]);
                        break;
                    default:
                        System.out.println("Opción no válida");
                        break;
                }
                break;
            case 3:
                System.out.println("Elige una opción:");
                for (int i = 0; i < ZAPATOS.length; i++) {
                    System.out.println("Opción " + (i + 1) + ": " + ZAPATOS[i]);
                }
                opcion = esponja.nextInt();
                esponja.nextLine();
                switch (opcion) {
                    case 1:
                        System.out.println("¿QUE TALLA DESEA?");
                        System.out.println("1. TALLA 32");
                        System.out.println("2. TALLA 30");
                        System.out.println("3. TALLA 34");
                        int opcionColor = esponja.nextInt();
                        esponja.nextLine();
                        System.out.println("¿Cuántos desea comprar?");
                        cantidad = esponja.nextInt();
                        esponja.nextLine();
                        carrito[0] += cantidad;
                        System.out.println("Ha pedido " + carrito[0] + " de " + ZAPATOS[0]);
                        break;
                    case 2:
                        System.out.println("¿QUE TALLA DESEA ?");
                        System.out.println("1. TALLA 30");
                        System.out.println("2. TALLA 32");
                        System.out.println("3. TALLA 34");
                        opcionColor = esponja.nextInt();
                        esponja.nextLine();
                        System.out.println("¿Cuántos desea comprar?");
                        cantidad = esponja.nextInt();
                        esponja.nextLine();
                        carrito[1] += cantidad;
                        System.out.println("Ha pedido " + carrito[1] + " de " + ZAPATOS[1]);
                        break;
                    case 3:
                        System.out.println("¿QUE TALLA DESEA?");
                        System.out.println("1. TALLA 30");
                        System.out.println("2. TALLA 32");
                        System.out.println("3. TALLA 34");
                        opcionColor = esponja.nextInt();
                        esponja.nextLine();
                        System.out.println("¿Cuántos desea comprar?");
                        cantidad = esponja.nextInt();
                        esponja.nextLine();
                        carrito[2] += cantidad;
                        System.out.println("Ha pedido " + carrito[2] + " de " + ZAPATOS[2]);
                        break;
                    default:
                        System.out.println("Opción no válida");
                        break;
                }
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
        double subtotalRECIEN = Arrays.stream(carrito).sum() * precio[0];
        double subtotalPERSONAJES = Arrays.stream(carrito_PERSONAJES).sum() * precio[1];
        double subtotalZAPATOS = Arrays.stream(carrito_ZAPATOS).sum() * precio[2];

        double subtotalTotal = subtotalRECIEN + subtotalPERSONAJES + subtotalZAPATOS;
        igv = subtotalTotal * 0.18;
        totalpagar = subtotalTotal + igv;

        System.out.println("Subtotal ZAPATILLAS ADIDAS : S/ " + subtotalRECIEN);
        System.out.println("Subtotal ZAPATILLAS PUMA : S/ " + subtotalPERSONAJES);
        System.out.println("Subtotal ZAPATILLAS NIKE : S/ " + subtotalZAPATOS);
        System.out.println("----------------------------------------");
        System.out.println("Subtotal Total: S/ " + subtotalTotal);
        System.out.println("IGV : S/ " + igv);
        System.out.println("Total a pagar: S/ " + totalpagar);

        System.out.println("seleccione tipo de pago11");
        System.out.println("1. Tarjeta de crédito");
        System.out.println("2. Efectivo");
        metodo_pago = esponja.nextLine();

        switch (metodo_pago) {
            case "1":
                System.out.println("Ingrese su DNI");
                DNI = esponja.nextLine();
                System.out.println("Ingrese su clave:");
                clave = esponja.nextLine();
                System.out.println("TRANSACCION exitosa");
                break;
            case "2":
                System.out.println("Ingrese su DNI");
                DNI = esponja.nextLine();
                System.out.println("TRANSACCION exitosa");
                break;
            case "3":
                System.out.println("Ingrese su DNI");
                DNI = esponja.nextLine();
                System.out.println("TRANSACCION exitosa");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
        return null;
    }
    public String op_tecnologia() {
        String[] RECIEN_NACIDOS = {"XIAMI T11 $774.00", "XIAMI T12 $994.00", "XIAMI T13 $1114.00"};

        String[] PERSONAJES_FAVORITOS = {"SAMSUMG S21 $1000.00", "SAMSUMG S22 $1524.00", "SAMSUMG S23 $1814.00"};

        String[] ZAPATOS = {"IPHONE 13 $1324.00", "IPHONE 14 $1734.00", "IPHONE 15 $1994.00"};

        double[] precio = {774.50, 944.50, 1114.50, 1344.00, 1235.00, 1121.00};
        double igv, subtotal, totalpagar;
        int[] carrito = new int[RECIEN_NACIDOS.length];
        int[] carrito_PERSONAJES = new int[PERSONAJES_FAVORITOS.length];
        int[] carrito_ZAPATOS = new int[ZAPATOS.length];
        int opcion, cantidad;
        String metodo_pago, NOMBRE, DNI, clave;
        System.out.println("-----------BIENVENIDOS A OECHSLE-----------");
        System.out.println("ENCUENTRA TU STOCK FAVORITO AQUI");
        System.out.println("TENEMOS EN:");
        System.out.println(" 1.- XIAMO");
        System.out.println(" 2.- SAMSUMG");
        System.out.println(" 3.- IPHONE");

        opcion = esponja.nextInt();
        esponja.nextLine();
        switch (opcion) {
            case 1:
                System.out.println("Elige una opción:");
                for (int i = 0; i < RECIEN_NACIDOS.length; i++) {
                    System.out.println("Opción " + (i + 1) + ": " + RECIEN_NACIDOS[i]);
                }
                opcion = esponja.nextInt();
                esponja.nextLine();
                switch (opcion) {
                    case 1:
                        System.out.println("¿Cuántos desea comprar?");
                        cantidad = esponja.nextInt();
                        esponja.nextLine();
                        carrito[0] += cantidad;
                        System.out.println("Ha pedido " + carrito[0] + " de " + RECIEN_NACIDOS[0]);
                        break;
                    case 2:
                        System.out.println("¿Cuántos desea comprar?");
                        cantidad = esponja.nextInt();
                        esponja.nextLine();
                        carrito[1] += cantidad;
                        System.out.println("Ha pedido " + carrito[1] + " de " + RECIEN_NACIDOS[1]);
                        break;
                    case 3:
                        System.out.println("¿Cuántos desea comprar?");
                        cantidad = esponja.nextInt();
                        esponja.nextLine();
                        carrito[2] += cantidad;
                        System.out.println("Ha pedido " + carrito[2] + " de " + RECIEN_NACIDOS[2]);
                        break;
                    default:
                        System.out.println("Opción no válida");
                        break;
                }
                break;
            case 2:
                System.out.println("Elige una opción:");
                for (int i = 0; i < PERSONAJES_FAVORITOS.length; i++) {
                    System.out.println("Opción " + (i + 1) + ": " + PERSONAJES_FAVORITOS[i]);
                }
                opcion = esponja.nextInt();
                esponja.nextLine();
                switch (opcion) {
                    case 1:
                        System.out.println("¿Cuántos desea comprar?");
                        cantidad = esponja.nextInt();
                        esponja.nextLine();
                        carrito[0] += cantidad;
                        System.out.println("Ha pedido " + carrito[0] + " de " + PERSONAJES_FAVORITOS[0]);
                        break;
                    case 2:
                        System.out.println("¿Cuántos desea comprar?");
                        cantidad = esponja.nextInt();
                        esponja.nextLine();
                        carrito[1] += cantidad;
                        System.out.println("Ha pedido " + carrito[1] + " de " + PERSONAJES_FAVORITOS[1]);
                        break;
                    case 3:
                        System.out.println("¿Cuántos desea comprar?");
                        cantidad = esponja.nextInt();
                        esponja.nextLine();
                        carrito[2] += cantidad;
                        System.out.println("Ha pedido " + carrito[2] + " de " + PERSONAJES_FAVORITOS[2]);
                        break;
                    default:
                        System.out.println("Opción no válida");
                        break;
                }
                break;
            case 3:
                System.out.println("Elige una opción:");
                for (int i = 0; i < ZAPATOS.length; i++) {
                    System.out.println("Opción " + (i + 1) + ": " + ZAPATOS[i]);
                }
                opcion = esponja.nextInt();
                esponja.nextLine();
                switch (opcion) {
                    case 1:
                        System.out.println("¿Cuántos desea comprar?");
                        cantidad = esponja.nextInt();
                        esponja.nextLine();
                        carrito[0] += cantidad;
                        System.out.println("Ha pedido " + carrito[0] + " de " + ZAPATOS[0]);
                        break;
                    case 2:
                        System.out.println("¿Cuántos desea comprar?");
                        cantidad = esponja.nextInt();
                        esponja.nextLine();
                        carrito[1] += cantidad;
                        System.out.println("Ha pedido " + carrito[1] + " de " + ZAPATOS[1]);
                        break;
                    case 3:
                        System.out.println("¿Cuántos desea comprar?");
                        cantidad = esponja.nextInt();
                        esponja.nextLine();
                        carrito[2] += cantidad;
                        System.out.println("Ha pedido " + carrito[2] + " de " + ZAPATOS[2]);
                        break;
                    default:
                        System.out.println("Opción no válida");
                        break;
                }
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
        double subtotalRECIEN = Arrays.stream(carrito).sum() * precio[0];
        double subtotalPERSONAJES = Arrays.stream(carrito_PERSONAJES).sum() * precio[1];
        double subtotalZAPATOS = Arrays.stream(carrito_ZAPATOS).sum() * precio[2];

        double subtotalTotal = subtotalRECIEN + subtotalPERSONAJES + subtotalZAPATOS;
        igv = subtotalTotal * 0.18;
        totalpagar = subtotalTotal + igv;

        System.out.println("Subtotal XIAMO : S/ " + subtotalRECIEN);
        System.out.println("Subtotal SAMSUMG : S/ " + subtotalPERSONAJES);
        System.out.println("Subtotal IPHONE : S/ " + subtotalZAPATOS);
        System.out.println("----------------------------------------");
        System.out.println("Subtotal Total: S/ " + subtotalTotal);
        System.out.println("IGV : S/ " + igv);
        System.out.println("Total a pagar: S/ " + totalpagar);

        System.out.println("seleccione tipo de pago11");
        System.out.println("1. Tarjeta de crédito");
        System.out.println("2. Efectivo");
        metodo_pago = esponja.nextLine();

        switch (metodo_pago) {
            case "1":
                System.out.println("Ingrese su DNI");
                DNI = esponja.nextLine();
                System.out.println("Ingrese su clave:");
                clave = esponja.nextLine();
                System.out.println("TRANSACCION exitosa");
                break;
            case "2":
                System.out.println("Ingrese su DNI");
                DNI = esponja.nextLine();
                System.out.println("TRANSACCION exitosa");
                break;
            case "3":
                System.out.println("Ingrese su DNI");
                DNI = esponja.nextLine();
                System.out.println("TRANSACCION exitosa");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
        return null;
    }
    public static void main (String[]args){
        OECHSLE frank = new OECHSLE();
        frank.inicio_sesion();
    }
}
