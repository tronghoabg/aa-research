package defpackage;

/* loaded from: classes2.dex */
public final class hix {
    public static final hix a = new hix(heg.a);
    public final heg b;

    static {
        new hix(heg.b);
    }

    public hix(heg hegVar) {
        hegVar.getClass();
        this.b = hegVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hix) && affa.f(this.b, ((hix) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "TemplateLayout(sectionedItem=" + this.b + ")";
    }
}
