import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
public class esponja {
    private Scanner esponja = new Scanner(System.in);
    private String apodo;
    public static boolean registrarse = false;
    public static boolean inicio_sesion = false;
    public static List<String> registro_de_usuarios = new ArrayList<>();
    public static List<String> registro_de_contraseñas = new ArrayList<>();
    public static void iniciar_sesion() {
        Scanner grinch = new Scanner(System.in);
        String op;
        String correo_valido, contraseña_valida;
        String registro, contraeña, respuesta;
        respuesta = grinch.nextLine();
        System.out.println("PARA COMONEZAR A REALIZAR PEDIDOS DEBE: (registrese/inicie sesion)");
        System.out.println("1.- REGISTRARSE");
        System.out.println("2.- INICIAR SESION");
        op = grinch.nextLine();
        switch (op) {
            case "1":
                if (!registrarse) {
                    System.out.println("REGISTRO:");
                    System.out.println("registre su correo electronico:");
                    registro = grinch.nextLine();
                    while (!registro.contains("@gmail.com")) {
                        System.out.println("Correo electrónico inválido, por favor vuelva a intentar :).");
                        registro = grinch.nextLine();
                    }
                    registro_de_usuarios.add(registro);
                    System.out.println("cree su contraeña:");
                    contraeña = grinch.nextLine();
                    registro_de_contraseñas.add(contraeña);
                    String[] usuarios = registro_de_usuarios.toArray(new String[0]);
                    String[] contraseñas = registro_de_contraseñas.toArray(new String[0]);
                    System.out.println("INICIAR SESIÓN:");
                    do {
                        System.out.println("Ingrese su correo electrónico");
                        correo_valido = grinch.nextLine();
                        System.out.println("Ingrese su contraseña: ");
                        contraseña_valida = grinch.nextLine();
                        for (int i = 0; i < registro_de_usuarios.size(); i++) {
                            if (correo_valido.equals(registro_de_usuarios.get(i)) && contraseña_valida.equals(registro_de_contraseñas.get(i))) {
                                System.out.println("Inicio de sesión, ¡EXITOSO!");
                                registrarse = true;
                                inicio_sesion = true;
                                break;
                            }
                        }
                        if (!inicio_sesion) {
                            System.out.println("Inicio de sesión, ¡FALLIDO!");
                            System.out.println("Correo o contraseña incorrecta.");
                        }
                    } while (!registrarse);
                }
                break;
            case "2":
                String[] usuarios = registro_de_usuarios.toArray(new String[0]);
                String[] contraseñas = registro_de_contraseñas.toArray(new String[0]);
                System.out.println("INICIAR SESIÓN:");
                System.out.println("ingrese su correo:");
                correo_valido = grinch.nextLine();
                System.out.println("ingrese su contraseña:");
                contraseña_valida = grinch.nextLine();
                for (int i = 0; i < usuarios.length; i++) {
                    if (correo_valido.equals(usuarios[i]) && contraseña_valida.equals(contraseñas[i])) {
                        System.out.println("Inicio de sesión, ¡EXITOSO!");
                        registrarse = true;
                    }
                }

                break;
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
        String metodo_de_pago,tarjeta,efectivo;
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
        metodo_de_pago = esponja.nextLine();

        switch (metodo_de_pago) {
            case "1":
                break;
            case "2":
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

        String metodo_de_pago,tarjeta,efectivo;
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
        String metodo_de_pago,tarjeta,efectivo;
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
        metodo_de_pago = esponja.nextLine();

        switch (metodo_de_pago) {
            case "1":
                break;
            case "2":
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
        String metodo_de_pago,tarjeta,efectivo;
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
        metodo_de_pago = esponja.nextLine();

        switch (metodo_de_pago) {
            case "1":

                break;
            case "2":
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
        String metodo_de_pago,tarjeta,efectivo;
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
        metodo_de_pago = esponja.nextLine();

        switch (metodo_de_pago) {
            case "1":
                break;
            case "2":
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
        return null;
    }
    static void metodo_de_pago(){
        Scanner opcion=new Scanner(System.in);
        int op;
        System.out.println("SELECIONE POR CUAL METODO DE PAGO, VA A RELIZAR SU PAGO");
        System.out.println("1:   TERJETA VISA/MASTERCARD");
        System.out.println("2:   CONTRA ENTREGA (EFECTIVO)");
        op=opcion.nextInt();
        switch (op){
            case 1:
                metodopago_tarjeta();
                break;
            case 2:
                metodopago_efectivo();
                break;
        }
    }
    static void metodopago_tarjeta() {
        String metodo, fecha, cvv,nombre,confirmar,volver,volverr,menu;
        boolean valida;
        Scanner esponja = new Scanner(System.in);
        do {
            System.out.println("INGRESE EL NOMBRE Y APELLIDO DEL TITULAR DE LA TARJETA");
            nombre= esponja.    nextLine();
            System.out.println("INGRESE SU NUMERO DE TARJETA:  (1234 1234 1234 1234)");
            metodo = esponja.nextLine().trim();
            if (metodo.length() != 19 || !metodo.matches("[4-5]\\d{3} \\d{4} \\d{4} \\d{4}")) {
                System.out.println("Ingreso correctamente");
            }
            break;
        }
        while (metodo.length() != 19 || !metodo.matches("[4-5]\\d{3} \\d{4} \\d{4} \\d{4}"));
        do {
            System.out.println("INGRESE LA FECHA DE VENCIMIENTO DE SU TARJETA (MM/AAAA):");
            fecha = esponja.nextLine().trim();
            valida = fecha.matches("\\d{2}/\\d{4}");
            if (valida) {
                String[] partes = fecha.split("/");
                int mes = Integer.parseInt(partes[0]);
                int año = Integer.parseInt(partes[1]);
                valida = (año >= 2024 && mes >= 6) && (año <= 2035 && mes <= 12);
            }
            if (!valida) {
                System.out.println("Por favor, SU TARJETA VENCIÓ, VUELVE A INTENTAR O CAMBIE EL METODO DE PAGO.");
            }
            break;
        }while (!valida);
        do {
            System.out.println("INGRESE SU CODIGO (CVV)");
            cvv = esponja.nextLine().trim();
            if (cvv.length() != 3 || !cvv.matches("\\d{3}")) {
                System.out.println("Por favor, CODIGO (CVV) INCORRECTO O NO COENCIDE CON LA TERJETA, VUELVE A INTENTAR.");
            }
            break;
        }while (cvv.length() != 3 || !cvv.matches("\\d{3}"));
        System.out.println("DESEA CONFIRMAR SU METODO DE PAGO:  (SI/NO)");
        confirmar = esponja.nextLine();
        if (confirmar.equals("si")||confirmar.equals("SI")){
            System.out.println("PAGO FUE REALIZADO CON EXITO");
            System.out.println("LA TRANSACCION FUE REALIZADA POR EL TITULAR: " + nombre);
            System.out.println("MONTO DESCONTADO A LA TARJETA: " + metodo + " -- " + fecha + " -- XXX");
            System.out.println("GRACIAS POR SU COMPRA");
            System.out.println("DESEA VOLVER AL MENU PRINCIPAL?? (SI/NO)");
            volver = esponja.nextLine();
            if (volver.equals("si")||volver.equals("SI")) {
                System.out.println("MENU");
            }
        } else if (confirmar.equals("no")||confirmar.equals("NO")) {
            System.out.println("SU PAGO SE HA CANCELADO");
            System.out.println("¿DESEA CAMBIAR DE MÉTODO DE PAGO? (SI/NO)");
            volverr = esponja.nextLine();
            if (volverr.equals("si") || volverr.equals("SI")) {
                metodo_de_pago();
            } else {
                System.out.println("SU PEDIDO SE HA CANCELADO");
                System.out.println("DESEA VOLVER AL MENU PRINCIPAL?? (SI/NO)");
                menu= esponja.nextLine();
                if (menu.equals("si")||menu.equals("SI")) {
                    System.out.println("MENU");
                }else {
                    System.out.println("GRACIAS POR VISITAR A OECHSLE");
                }
            }
        }
    }

    static void metodopago_efectivo() {
        Scanner esponja = new Scanner(System.in);
        double montoefectivo;
        System.out.println("INGRESE EL MONTO EN EFECTIVO");
        montoefectivo= esponja.nextDouble();
        System.out.println("tu cambio es: $"+montoefectivo);
        System.out.println("PAGO REALIZADO GRACIAS POR SU COMPRA");
        System.out.println("gracias por vistar a oechsle");
    }
    public static void main (String[]args){
        System.out.println("presione enter");
        esponja frank = new esponja();
        frank.iniciar_sesion();
        frank.menu();
        frank.metodo_de_pago();
    }
}
