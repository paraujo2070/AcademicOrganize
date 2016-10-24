package academic.organize.fabrica;

import academic.organize.dao.Dao;
import academic.organize.dao.IDao;
import academic.organize.entidade.Entidade;

public class FabricaDao {

    public static <T extends Entidade> IDao<T> getDao(Class<T> currentClass) {
        return new Dao<T>(currentClass);
    }

}
