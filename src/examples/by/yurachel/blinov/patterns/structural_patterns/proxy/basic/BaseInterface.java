package examples.by.yurachel.blinov.patterns.structural_patterns.proxy.basic;

/*Прокси-объект представляет другой объект. С точки зрения клиента интерфейс
и функциональность класса остаются неизменными. Чтобы это представление
было естественным, прокси-объект обязан реализовывать тот же интерфейс, что
и реальный класс. Кроме того, прокси-объект должен содержать реальный
класс в качестве поля, чтобы при необходимости обращаться к функционалу
реального класса. В общем случае реализует технологию обертывания
(wrapping) класса с целью повышения безопасности или оптимизации взаимо-
действия.*/
public interface BaseInterface {
     void perform();
}