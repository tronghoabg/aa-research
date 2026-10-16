package defpackage;

/* loaded from: classes3.dex */
public final class aitw extends afcg {
    public static final ezh b = new ezh();
    public final String a;

    public aitw(String str) {
        super(b);
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aitw) && affa.f(this.a, ((aitw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CoroutineName(" + this.a + ")";
    }
}
