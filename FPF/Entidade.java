public class Entidade {
    private String nome;
    private String areaGeografica;
    private String contacto;
    private String nif;

    public Entidade(String nome, String areaGeografica, String contacto, String nif) {
        this.nome = nome;
        this.areaGeografica = areaGeografica;
        this.contacto = contacto;
        this.nif = nif;
    }

    public String getNome() { return nome; }
    public String getAreaGeografica() { return areaGeografica; }
    public String getContacto() { return contacto; }
    public String getNif() { return nif; }

    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Área Geográfica: " + areaGeografica);
        System.out.println("Contacto: " + contacto);
        System.out.println("NIF: " + nif);
    }
}