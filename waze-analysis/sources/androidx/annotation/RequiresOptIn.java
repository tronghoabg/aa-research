package androidx.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: WazeSource */
@Target({ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes2.dex */
public @interface RequiresOptIn {

    /* compiled from: WazeSource */
    public enum Level {
        WARNING,
        ERROR
    }

    Level level() default Level.ERROR;
}
