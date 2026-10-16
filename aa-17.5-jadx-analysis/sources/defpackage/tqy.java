package defpackage;

/* loaded from: classes3.dex */
public final class tqy {
    public final float a;
    private final boolean b;

    public tqy(byte[] bArr) {
        this.a = 65.0f;
        this.b = true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tqy) {
            tqy tqyVar = (tqy) obj;
            if (Float.floatToIntBits(this.a) == Float.floatToIntBits(tqyVar.a) && this.b == tqyVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.b ? 1237 : 1231) ^ ((Float.floatToIntBits(this.a) ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "{" + this.a + ", " + this.b + "}";
    }

    public tqy() {
        throw null;
    }
}
