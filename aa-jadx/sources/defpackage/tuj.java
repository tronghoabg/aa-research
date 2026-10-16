package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tuj implements java.io.Serializable {
    public static final defpackage.tuj a;
    public static final int b;
    public static final int c;
    public static final int d;
    public static final int e;
    public static final int f;
    public final defpackage.tpg g;
    public final defpackage.tpm h;
    public final float i;
    public final float j;
    public final float k;
    public final float l;
    public final float m;
    public final float n;
    public final defpackage.tuk o;
    public defpackage.tpf p;

    static {
        defpackage.tuh tuhVar = new defpackage.tuh();
        tuhVar.e(new defpackage.tpm(0, 0));
        tuhVar.e = 20.0f;
        tuhVar.f = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        tuhVar.g = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        tuhVar.i = defpackage.tuk.a;
        tuhVar.c = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        tuhVar.d = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        tuhVar.h = 30.0f;
        a = tuhVar.a();
        defpackage.tan.q();
        b = 8;
        c = 1;
        d = 2;
        e = 4;
        f = 8;
    }

    public tuj(defpackage.tpg tpgVar, float f2, float f3, float f4, defpackage.tuk tukVar, float f5, float f6, float f7) {
        tpgVar.getClass();
        tukVar.getClass();
        if (f3 <= com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            f3 = 0.0f;
        } else if (f3 > 90.0f) {
            f3 = 90.0f;
        }
        this.g = tpgVar;
        this.h = defpackage.tnm.t(tpgVar);
        this.l = java.lang.Math.max(2.0f, java.lang.Math.min(f2, 21.0f));
        this.m = f3 + com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.n = (((double) f4) <= 0.0d ? (f4 % 360.0f) + 360.0f : f4) % 360.0f;
        this.o = defpackage.tuk.d(tukVar);
        this.i = f5;
        this.k = f6;
        this.j = f7;
    }

    public static final defpackage.tsn a(defpackage.tuj tujVar) {
        defpackage.tpg tpgVar = tujVar.g;
        defpackage.tsm tsmVarA = defpackage.tsn.a();
        tsmVarA.a = tpgVar;
        tsmVarA.d(tujVar.i);
        tsmVarA.e(tujVar.k);
        tsmVarA.h(tujVar.l);
        tsmVarA.f(tujVar.m);
        tsmVarA.c(tujVar.n);
        defpackage.tuk tukVar = tujVar.o;
        tsmVarA.b = defpackage.tso.a(tukVar.b, tukVar.c);
        tsmVarA.g(tujVar.j);
        return tsmVarA.a();
    }

    public static final defpackage.tuj b(defpackage.tsn tsnVar) {
        defpackage.tuh tuhVar = new defpackage.tuh();
        tuhVar.a = tsnVar.a;
        tuhVar.c = tsnVar.b;
        tuhVar.d = tsnVar.c;
        tuhVar.e = tsnVar.h;
        tuhVar.f = tsnVar.e;
        tuhVar.g = tsnVar.d;
        defpackage.tso tsoVar = tsnVar.f;
        tuhVar.i = new defpackage.tuk(tsoVar.b, tsoVar.c);
        tuhVar.h = tsnVar.g;
        return tuhVar.a();
    }

    public final java.lang.Object c(int i) {
        switch (i - 1) {
            case 0:
                return this.h;
            case 1:
                return java.lang.Float.valueOf(this.l);
            case 2:
                return java.lang.Float.valueOf(this.m);
            case 3:
                return java.lang.Float.valueOf(this.n);
            case 4:
                return this.o;
            case 5:
                return java.lang.Float.valueOf(this.i);
            case 6:
                return java.lang.Float.valueOf(this.k);
            default:
                return java.lang.Float.valueOf(this.j);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.tuj)) {
            return false;
        }
        defpackage.tuj tujVar = (defpackage.tuj) obj;
        return this.g.equals(tujVar.g) && java.lang.Float.floatToIntBits(this.l) == java.lang.Float.floatToIntBits(tujVar.l) && java.lang.Float.floatToIntBits(this.m) == java.lang.Float.floatToIntBits(tujVar.m) && java.lang.Float.floatToIntBits(this.n) == java.lang.Float.floatToIntBits(tujVar.n) && this.o.equals(tujVar.o) && java.lang.Float.floatToIntBits(this.i) == java.lang.Float.floatToIntBits(tujVar.i) && java.lang.Float.floatToIntBits(this.k) == java.lang.Float.floatToIntBits(tujVar.k) && java.lang.Float.floatToIntBits(this.j) == java.lang.Float.floatToIntBits(tujVar.j);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(this.g, java.lang.Float.valueOf(this.l), java.lang.Float.valueOf(this.m), java.lang.Float.valueOf(this.n), this.o, java.lang.Float.valueOf(this.i), java.lang.Float.valueOf(this.k), java.lang.Float.valueOf(this.j));
    }

    public final java.lang.String toString() {
        defpackage.xym xymVarBy = defpackage.ysr.by(this);
        xymVarBy.b("target", this.g);
        xymVarBy.e("zoom", this.l);
        xymVarBy.e("tilt", this.m);
        xymVarBy.e("bearing", this.n);
        xymVarBy.b("lookAhead", this.o);
        xymVarBy.e("targetAltitude", this.i);
        xymVarBy.e("targetAltitudeStrength", this.k);
        xymVarBy.e("verticalFov", this.j);
        return xymVarBy.toString();
    }
}
