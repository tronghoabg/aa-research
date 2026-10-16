package defpackage;

/* loaded from: classes2.dex */
public final class his {
    public static final his a = new his(24.0f, 32.0f, 40.0f);
    public static final his b = new his(32.0f, 40.0f, 50.0f);
    public final float c;
    private final float d;
    private final float e;

    private his(float f, float f2, float f3) {
        this.d = f;
        this.c = f2;
        this.e = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof his)) {
            return false;
        }
        his hisVar = (his) obj;
        return dlj.c(this.d, hisVar.d) && dlj.c(this.c, hisVar.c) && dlj.c(this.e, hisVar.e);
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.d) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.e);
    }

    public final String toString() {
        float f = this.e;
        float f2 = this.c;
        return "TemplateAccessorySize(small=" + dlj.b(this.d) + ", medium=" + dlj.b(f2) + ", large=" + dlj.b(f) + ")";
    }
}
