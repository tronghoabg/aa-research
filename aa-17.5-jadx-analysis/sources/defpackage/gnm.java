package defpackage;

/* loaded from: classes2.dex */
public final class gnm {
    public final int a;
    public final int b;

    public gnm(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gnm) {
            gnm gnmVar = (gnm) obj;
            if (this.a == gnmVar.a && this.b == gnmVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ContentLimitQuery{contentLimitType=" + this.a + ", contentLimitValue=" + this.b + "}";
    }

    public gnm() {
        throw null;
    }
}
