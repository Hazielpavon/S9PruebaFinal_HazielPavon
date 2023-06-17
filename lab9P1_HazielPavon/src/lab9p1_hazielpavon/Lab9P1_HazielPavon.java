package lab9p1_hazielpavon;

import java.util.Scanner;
import java.util.ArrayList;

public class Lab9P1_HazielPavon {

    static Scanner leer = new Scanner(System.in);
    static ArrayList<Libros> lArray = new ArrayList<>();
    static Libros lib = new Libros();

    public static void main(String[] args) {

        boolean seguir = true;
        boolean primero = false;
        while (seguir) {

            System.out.println("1. Libros y mas Libros REMASTERED");
            System.out.println("2. Salir");
            int opcion;
            System.out.println("");
            System.out.print("Opcion ingresada: ");
            opcion = leer.nextInt();

            switch (opcion) {

                case 1:

                    System.out.println("\nElija una opcion:\n");

                    System.out.println("   1. Agregar Libro");
                    System.out.println("   2. Listar libros");
                    System.out.println("   3. Modificar Libro");
                    System.out.println("   4. Eliminar Libro");
                    System.out.println("   5. Buscar Libros por Titulo");
                    System.out.println("   6. Buscar Libros segun autor");
                    System.out.println("   7. Buscar con filtro de genero");
                    System.out.println("   8. Salir");

                    int opcion2;
                    System.out.println("");
                    System.out.print("Opcion ingresada: ");
                    opcion2 = leer.nextInt();

                    boolean seguir2 = true;

                    while (seguir2) {

                        switch (opcion2) {

                            case 1:
                                int edadM = 0;

                                boolean edadv = false;

                                System.out.println("\nHa elegido la opcion para agregar un libro , por favor aporte la informacion solicitada \n");

                                System.out.println("\nTitulo: ");
                                leer.nextLine();
                                String tituloM = leer.nextLine();

                                System.out.println("\nAutor: ");
                                String autorM = leer.nextLine();

                                System.out.println("\nGenero: ");
                                String generoM = leer.nextLine();

                                while (edadv == false) {
                                    System.out.println("\nEdad: ");
                                    edadM = leer.nextInt();

                                    if (edadM > 0) {
                                        System.out.println("\nLibro ingresado con exito");
                                        edadv = true;
                                    } else {
                                        edadv = false;
                                        System.out.println("Ingrese una edad valida\n");
                                    }
                                }
                                Libros lib = new Libros(autorM, tituloM, generoM, edadM);

                                lArray.add(lib);

                                primero = true;
                                seguir2 = false;

                                break;

                            case 2:

                                if (primero == true) {
                                    System.out.println("\nHa elegido la opcion para Listar el o los libros ");

                                    print();

                                } else {
                                    System.out.println("Ingrese un libro para listar el o los libros");
                                }
                                seguir2 = false;
                                break;

                            case 3:
                                if (primero == true) {

                                    System.out.println("Ha elegido la opcion para cambiar algun atributo del libro");

                                    ModificarLibro();

                                } else {
                                    System.out.println("Ingrese un libro para cambiar el o los libros");
                                }
                                seguir2 = false;
                                break;

                            case 4:
                                if (primero == true) {

                                    System.out.println("Ha elegido la opcion para eliminar algun libro");

                                    eliminar();

                                } else {
                                    System.out.println("Ingrese un libro para cambiar el o los libros");
                                }
                                seguir2 = false;
                                break;

                            case 5:
                                if (primero == true) {

                                    bustitulo();

                                } else {
                                    System.out.println("Ingrese un libro para cambiar el o los libros");
                                }
                                seguir2 = false;
                                break; 

                            case 6:
                                if (primero == true) {
                                    busautor();

                                } else {
                                    System.out.println("Ingrese un libro para cambiar el o los libros");
                                }
                                seguir2 = false;
                                break; 

                            case 7:
                                if (primero == true) {
                                    busgenero();

                                } else {
                                    System.out.println("Ingrese un libro para cambiar el o los libros");
                                }
                                seguir2 = false;
                                break; 

                            case 8:

                                seguir2 = false;
                                break;

                            default:
                                if (opcion2 > 8) {
                                    System.out.println("Ingrese un valor valiod");
                                }

                        }
                    }

                    break;

                case 2:
                    seguir = false;
                    break;

                default:
                    if (opcion > 2) {
                        System.out.println("Ingrese una opcion valida");
                    }

            }
        }
    }

    public static void print() {

        for (int i = 0; i < lArray.size(); i++) {

            System.out.print("Libro " + (i + 1));

            System.out.println(lArray.get(i).toString());

        }

    }

    public static void ModificarLibro() {

        int cont = 0;
        int i = 0;
        for (i = 0; i < lArray.size(); i++) {

            System.out.print("Libro " + (i + 1));

            System.out.println(lArray.get(i).toString());
            cont++;
        }

        boolean seguir = false;

        while (seguir == false) {
            System.out.println("Seleccione un libro para cambiar");
            int cambio = leer.nextInt();

            if (cambio == cont) {

                Libros libroSeleccionado = lArray.get(cambio - 1);
                System.out.println("Ha seleccionado el libro " + libroSeleccionado.getTitulo() + " ¿Qué atributo desea modificar?");
                System.out.println("1. Titulo");
                System.out.println("2. Autor");
                System.out.println("3. Genero");
                System.out.println("4. Edad minima");
                int cambiode = leer.nextInt();

                switch (cambiode) {

                    case 1: {
                        System.out.println("Modificara el Titulo del libro, ingrese un nuevo Titulo: ");
                        leer.nextLine();
                        String titact = leer.nextLine();

                        if (libroSeleccionado.getTitulo().equals(titact)) {
                            System.out.println("El titulo no se puede cambiar ya que se mantuvo igual");
                        } else {

                            libroSeleccionado.setTitulo(titact);

                            System.out.println("Libro modificado exitosamente");
                            seguir = true;
                            break;
                        }
                    }
                    case 2: {
                        System.out.println("Modificara el Autor del libro, ingrese un nuevo Autor: ");
                        leer.nextLine();
                        String autact = leer.nextLine();

                        if (libroSeleccionado.getEscritor().equals(autact)) {
                            System.out.println("El autor no se puede cambiar ya que se mantuvo igual");
                        } else {
                            libroSeleccionado.setEscritor(autact);

                            System.out.println("Libro modificado exitosamente");

                            seguir = true;
                            break;
                        }
                    }
                    case 3: {
                        System.out.println("Modificara el Genero del libro, ingrese un nuevo Genero: ");
                        leer.nextLine();
                        String genact = leer.nextLine();
                        if (libroSeleccionado.getGenero().equals(genact)) {
                            System.out.println("El genero no se puede cambiar ya que se mantuvo igual");
                        } else {
                            libroSeleccionado.setGenero(genact);

                            System.out.println("Libro modificado exitosamente");
                            seguir = true;
                            break;
                        }
                    }
                    case 4: {
                        System.out.println("Modificara la Edad minima del libro, ingrese una nueva Edad Minima: ");
                        int edadact = leer.nextInt();
                        if (libroSeleccionado.getEdad() == edadact) {
                            System.out.println("La edad no se puede cambiar ya que se mantuvo igual");
                        } else {
                            libroSeleccionado.setEdad(edadact);

                            System.out.println("Libro modificado exitosamente");
                            seguir = true;
                            break;
                        }
                    }
                }

            } else {
                System.out.println("El numero del libro ingresado no esta en la lista");
            }

        }
    }

    public static void eliminar() {
        int cont = 0;
        for (int i = 0; i < lArray.size(); i++) {

            System.out.print("Libro " + (i + 1));

            System.out.println(lArray.get(i).toString());
            cont++;
        }

        boolean seguir = false;

        while (seguir == false) {
            System.out.println("Seleccione un libro para Eliminar");
            int delete = leer.nextInt();

            if (delete >= 1 && delete <= cont) {
                Libros libroSeleccionado = lArray.get(delete - 1);
                System.out.println("Ha seleccionado el libro " + libroSeleccionado.getTitulo());

                lArray.remove(delete - 1);

                System.out.println("El libro fue eliminado exitosamente");
                seguir = true;
            } else {
                System.out.println("El libro no está en la librería");
            }
        }
    }

    public static void bustitulo() {

        boolean encontrado = false;

        System.out.println("Ingrese el Titulo del libro");
        leer.nextLine();
        String titulo = leer.nextLine();

        for (int i = 0; i < lArray.size(); i++) {
            Libros tituloenclase = lArray.get(i);
            if (tituloenclase.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("El Titulo se encontró:");
                System.out.println(tituloenclase.toString());
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("El título no se encontró");
        }
    }

    public static void busautor() {

        boolean seguir = false;
        System.out.println("Ingrese el Autor del libro");
        leer.nextLine();
        String autor = leer.nextLine();

        for (int i = 0; i < lArray.size(); i++) {
            Libros autorenclase = lArray.get(i);

            if (autorenclase.getEscritor().equalsIgnoreCase(autor)) {
                System.out.println("El Autor se encontró:");
                System.out.println(autorenclase.toString());
                seguir = true;
                break;

            }
        }

        if (!seguir) {
            System.out.println("El Autor no fue encontrado");
        }
    }

    public static void busgenero() {

        boolean seguir = false;

        System.out.println("Ingrese el Genero del libro");
        leer.nextLine();
        String genero = leer.nextLine();

        for (int i = 0; i < lArray.size(); i++) {
            Libros generonclase = lArray.get(i);
            if (generonclase.getGenero().equalsIgnoreCase(genero)) {
                System.out.println("El Genero se encontró:");
                System.out.println(generonclase.toString());
                seguir = true;
                break;
            }
        }
        if (!seguir) {
            System.out.println("El Genero no fue encontrado");

        }
    }

}
