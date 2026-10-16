package defpackage;

/* loaded from: classes.dex */
public final class qdg {
    private final int a;

    public qdg(int i) {
        this.a = i;
    }

    public final boolean a() {
        return this.a == 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.a == ((qdg) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }
}
