package examples.by.yurachel.jdbc.ex_1_blinov.dao;

import examples.by.yurachel.jdbc.ex_1_blinov.entity.Abonent;

import java.util.List;

/* При создании информационной системы выявляются некоторые слои,который отвечают
за взаимодействие различных частей приложения.Связь с базой данных является важной
частью любой системы,поэтому всегда выделяется часть кода,ответственная за передачу
запросов в БД и обработку полученных от нее ответов.Общее определение шаблона
Data Access Object трактует его как прослойку между приложением и СУБД.DAO абстрагирует
бизнес-сущность системы и отражает их на записи в БД.DAO определяет общие способы
использования соединения с БД,моменты его открытия и закрытия или извлечения и возвра
щения в пул.В общем случае DAO можно определять таким образом,чтобы была возможность
подмены одной модели базы данных на другой.Например: реляционную заменить на объектную,
или MySql а Oracle
* */


/* Вершина иерархии DAO представляет собой класс или интерфейс с описанием общих
методов,которые будут использоватсья при взаимодействии с таблицей или группой таблиц.
Как правило,это методы,поиска сущностей по признаку,добавление,удаление и замена информации.
 */
public abstract class AbstractDao<K, T extends Abonent> {
    public abstract List<T> findALL();

    public abstract T findEntityById(K id);

    public abstract boolean delete(K id);

    public abstract boolean delete(T entity);

    public abstract boolean create(T entity);

    public abstract T update(T entity);
}

/* Набор методов может варьироваться в зависимости от логики приложения.Параметр К описывает ,
как правило ,ключ в таблице,так как редкая таблица,содержащая описание сущности,обходится
без первичного ключа.Параметр Entity определяет общую бизнес-сущность,от которой
наследуются все бизнес-сущности системы.Класс может содержать также методы возвращения соединения
в пул или его закрытия,а так же закрытия экземпляра Statement.
* */
