package section2.MinHyuk.WordMaster;
//CRUD를 위한 interface
public interface ICRUD {

    public Object add();
    public int update(Object obj);
    public int delete(Object obj);
    public void selectOne(int id);
}
