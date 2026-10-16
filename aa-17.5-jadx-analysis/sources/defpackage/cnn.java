package defpackage;

/* loaded from: classes.dex */
public final class cnn extends cob {
    public final float a;
    public final float b;

    public cnn(float f, float f2) {
        super(false, false);
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cnn)) {
            return false;
        }
        cnn cnnVar = (cnn) obj;
        return Float.compare(this.a, cnnVar.a) == 0 && Float.compare(this.b, cnnVar.b) == 0;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "MoveTo(x=" + this.a + ", y=" + this.b + ")";
    }
}
