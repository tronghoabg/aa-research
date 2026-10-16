package defpackage;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes2.dex */
public @interface sel {
    Class a() default sej.class;

    Class b() default sej.class;

    Class c() default sej.class;

    String d();

    boolean e() default false;
}
