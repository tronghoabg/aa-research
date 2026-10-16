package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ktf {
    public static final defpackage.ktf a = new defpackage.ktf(48.0f, 32.0f, null, new defpackage.kvk(3.0f, 1.0f, 3.0f), null, 380);
    public static final defpackage.ktf b;
    public static final defpackage.ktf c;
    public static final defpackage.ktf d;
    public static final defpackage.ktf e;
    public static final defpackage.ktf f;
    public static final defpackage.ktf g;
    public final float h;
    public final float i;
    public final defpackage.dlr j;
    public final float k;
    public final float l;
    public final float m;
    public final float n;
    public final defpackage.kvk o;
    public final defpackage.kvk p;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        defpackage.kvk kvkVar = null;
        defpackage.dlr dlrVar = null;
        b = new defpackage.ktf(56.0f, 34.0f, dlrVar, new defpackage.kvk(4.0f, 2.0f, 4.0f), kvkVar, 380);
        defpackage.dlr dlrVar2 = null;
        c = new defpackage.ktf(64.0f, 38.0f, dlrVar2, null, null, 508);
        d = new defpackage.ktf(72.0f, 42.0f, dlrVar, null, kvkVar, 508);
        e = new defpackage.ktf(56.0f, 48.0f, dlrVar2, new defpackage.kvk(4.0f, 4.0f, 4.2f), new defpackage.kvk(2.0f, 2.0f, 2.0f), 124);
        float f2 = 56.0f;
        f = new defpackage.ktf(64.0f, f2, null, null, null, 508);
        g = new defpackage.ktf(f2, 24.0f, 0 == true ? 1 : 0, new defpackage.kvk(4.0f, 4.0f, 4.2f), new defpackage.kvk(2.0f, 2.0f, 2.0f), 124);
        defpackage.afga.cA(new defpackage.ksa(5));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ktf(float f2, float f3, defpackage.dlr dlrVar, defpackage.kvk kvkVar, defpackage.kvk kvkVar2, int i) {
        defpackage.kvk kvkVar3 = (i & 128) != 0 ? new defpackage.kvk(4.0f, 4.0f, 4.0f) : kvkVar;
        defpackage.kvk kvkVar4 = (i & 256) != 0 ? new defpackage.kvk(3.0f, 3.0f, 3.0f) : kvkVar2;
        int i2 = i & 32;
        int i3 = i & 16;
        int i4 = i & 8;
        float f4 = (i & 64) != 0 ? 12.0f : 0.0f;
        float f5 = i2 != 0 ? 32.0f : 0.0f;
        float f6 = i3 != 0 ? 24.0f : 0.0f;
        this(f2, f3, (i & 4) != 0 ? null : dlrVar, i4 != 0 ? 32.0f : 0.0f, f6, f5, f4, kvkVar3, kvkVar4);
    }

    public static /* synthetic */ defpackage.ktf a(defpackage.ktf ktfVar, float f2, float f3, defpackage.dlr dlrVar, float f4, int i) {
        if ((i & 1) != 0) {
            f2 = ktfVar.h;
        }
        float f5 = f2;
        if ((i & 2) != 0) {
            f3 = ktfVar.i;
        }
        float f6 = f3;
        if ((i & 4) != 0) {
            dlrVar = ktfVar.j;
        }
        defpackage.dlr dlrVar2 = dlrVar;
        float f7 = (i & 8) != 0 ? ktfVar.k : 0.0f;
        float f8 = (i & 16) != 0 ? ktfVar.l : 0.0f;
        if ((i & 32) != 0) {
            f4 = ktfVar.m;
        }
        return new defpackage.ktf(f5, f6, dlrVar2, f7, f8, f4, ktfVar.n, ktfVar.o, ktfVar.p);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ktf)) {
            return false;
        }
        defpackage.ktf ktfVar = (defpackage.ktf) obj;
        return java.lang.Float.compare(this.h, ktfVar.h) == 0 && java.lang.Float.compare(this.i, ktfVar.i) == 0 && defpackage.afga.f(this.j, ktfVar.j) && java.lang.Float.compare(this.k, ktfVar.k) == 0 && java.lang.Float.compare(this.l, ktfVar.l) == 0 && java.lang.Float.compare(this.m, ktfVar.m) == 0 && java.lang.Float.compare(this.n, ktfVar.n) == 0 && defpackage.afga.f(this.o, ktfVar.o) && defpackage.afga.f(this.p, ktfVar.p);
    }

    public final int hashCode() {
        int iFloatToIntBits = (java.lang.Float.floatToIntBits(this.h) * 31) + java.lang.Float.floatToIntBits(this.i);
        defpackage.dlr dlrVar = this.j;
        return (((((((((((((iFloatToIntBits * 31) + (dlrVar == null ? 0 : java.lang.Float.floatToIntBits(dlrVar.a))) * 31) + java.lang.Float.floatToIntBits(this.k)) * 31) + java.lang.Float.floatToIntBits(this.l)) * 31) + java.lang.Float.floatToIntBits(this.m)) * 31) + java.lang.Float.floatToIntBits(this.n)) * 31) + this.o.hashCode()) * 31) + this.p.hashCode();
    }

    public final java.lang.String toString() {
        float f2 = this.n;
        float f3 = this.m;
        float f4 = this.l;
        float f5 = this.k;
        float f6 = this.i;
        return "ButtonSize(buttonHeight=" + defpackage.dlr.b(this.h) + ", iconContentHeight=" + defpackage.dlr.b(f6) + ", iconContentWidth=" + this.j + ", labelContentHeight=" + defpackage.dlr.b(f5) + ", iconHorizontalPadding=" + defpackage.dlr.b(f4) + ", labelHorizontalPadding=" + defpackage.dlr.b(f3) + ", iconSpacing=" + defpackage.dlr.b(f2) + ", focusRingThickness=" + this.o + ", innerFocusRingThickness=" + this.p + ")";
    }

    private ktf(float f2, float f3, defpackage.dlr dlrVar, float f4, float f5, float f6, float f7, defpackage.kvk kvkVar, defpackage.kvk kvkVar2) {
        kvkVar.getClass();
        kvkVar2.getClass();
        this.h = f2;
        this.i = f3;
        this.j = dlrVar;
        this.k = f4;
        this.l = f5;
        this.m = f6;
        this.n = f7;
        this.o = kvkVar;
        this.p = kvkVar2;
    }
}
