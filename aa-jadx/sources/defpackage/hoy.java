package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hoy extends defpackage.hnl {
    public static final defpackage.hox b = new defpackage.hox();
    private final int c;
    private final float d;
    private final float e;
    private final java.util.Collection f;
    private final int g;

    public hoy(int i, int i2, float f, float f2, java.util.Collection collection) {
        super(defpackage.hnt.EmbeddedScrollInsightId);
        this.g = i;
        this.c = i2;
        this.d = f;
        this.e = f2;
        this.f = collection;
    }

    @Override // defpackage.hnq
    public final java.util.Collection a() {
        return this.f;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.hoy)) {
            return false;
        }
        defpackage.hoy hoyVar = (defpackage.hoy) obj;
        return this.g == hoyVar.g && this.c == hoyVar.c && java.lang.Float.compare(this.d, hoyVar.d) == 0 && java.lang.Float.compare(this.e, hoyVar.e) == 0 && defpackage.afga.f(this.f, hoyVar.f);
    }

    public final int hashCode() {
        return (((((((this.g * 31) + this.c) * 31) + java.lang.Float.floatToIntBits(this.d)) * 31) + java.lang.Float.floatToIntBits(this.e)) * 31) + this.f.hashCode();
    }
}
