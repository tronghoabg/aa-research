package defpackage;

/* loaded from: classes2.dex */
public final class eiz {
    private final Object a;
    private final int b;

    public eiz(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof eiz)) {
            return false;
        }
        eiz eizVar = (eiz) obj;
        return this.a == eizVar.a && this.b == eizVar.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }
}
