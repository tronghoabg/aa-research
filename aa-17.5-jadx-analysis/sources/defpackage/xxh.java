package defpackage;

import j$.util.Optional;
import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class xxh implements Serializable {
    private static final long serialVersionUID = 0;

    public static xxh g(Object obj) {
        return obj == null ? xvy.a : new xxm(obj);
    }

    public static xxh h(Object obj) {
        obj.getClass();
        return new xxm(obj);
    }

    public abstract xxh a(xwx xwxVar);

    public abstract Object b();

    public abstract Object c(xyc xycVar);

    public abstract Object d(Object obj);

    public abstract Object e();

    public abstract boolean equals(Object obj);

    public abstract boolean f();

    public abstract int hashCode();

    public final Optional i() {
        return Optional.ofNullable(e());
    }
}
