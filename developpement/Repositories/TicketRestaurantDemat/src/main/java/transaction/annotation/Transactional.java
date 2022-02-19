package transaction.annotation;

public @interface Transactional {

    boolean readOnly() default  false;
}
