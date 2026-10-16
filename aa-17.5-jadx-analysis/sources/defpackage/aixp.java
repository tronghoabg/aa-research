package defpackage;

@afdo
/* loaded from: classes2.dex */
public final class aixp {
    public static final aixo a = new aixo();
    public final Object b;

    public /* synthetic */ aixp(Object obj) {
        this.b = obj;
    }

    public static final Object a(Object obj) {
        if (obj instanceof aixo) {
            return null;
        }
        return obj;
    }

    public static final Throwable b(Object obj) {
        aixn aixnVar = obj instanceof aixn ? (aixn) obj : null;
        if (aixnVar != null) {
            return aixnVar.a;
        }
        return null;
    }

    public static final boolean c(Object obj) {
        return !(obj instanceof aixo);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aixp) && affa.f(this.b, ((aixp) obj).b);
    }

    public final int hashCode() {
        Object obj = this.b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.b;
        return obj instanceof aixn ? ((aixn) obj).toString() : a.bm(obj, "Value(", ")");
    }
}
