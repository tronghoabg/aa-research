package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hja {
    public static final defpackage.hja a = new defpackage.hja(24.0f, 32.0f, 40.0f);
    public static final defpackage.hja b = new defpackage.hja(32.0f, 40.0f, 50.0f);
    public final float c;
    private final float d;
    private final float e;

    private hja(float f, float f2, float f3) {
        this.d = f;
        this.c = f2;
        this.e = f3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.hja)) {
            return false;
        }
        defpackage.hja hjaVar = (defpackage.hja) obj;
        return defpackage.dlr.c(this.d, hjaVar.d) && defpackage.dlr.c(this.c, hjaVar.c) && defpackage.dlr.c(this.e, hjaVar.e);
    }

    public final int hashCode() {
        return (((java.lang.Float.floatToIntBits(this.d) * 31) + java.lang.Float.floatToIntBits(this.c)) * 31) + java.lang.Float.floatToIntBits(this.e);
    }

    public final java.lang.String toString() {
        float f = this.e;
        float f2 = this.c;
        return "TemplateAccessorySize(small=" + defpackage.dlr.b(this.d) + ", medium=" + defpackage.dlr.b(f2) + ", large=" + defpackage.dlr.b(f) + ")";
    }
}
