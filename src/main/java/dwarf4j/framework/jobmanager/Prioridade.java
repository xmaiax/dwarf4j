package dwarf4j.framework.jobmanager;

public enum Prioridade {

  BAIXA(4), NORMAL(5), ALTA(6), URGENTE(7);
  
  private int nivel;
  private Prioridade(int nivel) { this.nivel = nivel; }
  public int getIntValue() { return this.nivel; }
  
}
