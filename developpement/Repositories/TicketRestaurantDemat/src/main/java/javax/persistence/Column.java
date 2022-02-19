package javax.persistence;

public @interface Column {
    String name() default "";
}
