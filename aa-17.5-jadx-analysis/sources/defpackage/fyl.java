package defpackage;

/* loaded from: classes2.dex */
public final class fyl extends fyt {
    public final hjw a;

    static {
        hjw hjwVar = hjw.a;
    }

    public fyl(hjw hjwVar) {
        this.a = hjwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fyl) && affa.f(this.a, ((fyl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Custom(carColor=" + this.a + ")";
    }
}
