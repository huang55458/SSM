package annotation;

/**
 * @author chumeng
 * @date 2022/7/8 15:56
 */

public @interface MybatisRepository {
    String value() default "";
}
