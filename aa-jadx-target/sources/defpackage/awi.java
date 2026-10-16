package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class awi extends defpackage.cyc<defpackage.awk> {
    private final float a;
    private final float b;
    private final float c;
    private final float d;
    private final boolean f;

    public awi(float f, float f2, float f3, float f4, boolean z) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.f = z;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.awk(this.a, this.b, this.c, this.d, this.f);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        defpackage.awk awkVar = (defpackage.awk) cgeVar;
        awkVar.a = this.a;
        awkVar.b = this.b;
        awkVar.c = this.c;
        awkVar.d = this.d;
        awkVar.e = this.f;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.awi)) {
            return false;
        }
        defpackage.awi awiVar = (defpackage.awi) obj;
        return java.lang.Float.compare(this.a, awiVar.a) == 0 && java.lang.Float.compare(this.b, awiVar.b) == 0 && java.lang.Float.compare(this.c, awiVar.c) == 0 && java.lang.Float.compare(this.d, awiVar.d) == 0 && this.f == awiVar.f;
    }

    public final int hashCode() {
        return (((((((java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b)) * 31) + java.lang.Float.floatToIntBits(this.c)) * 31) + java.lang.Float.floatToIntBits(this.d)) * 31) + (true != this.f ? 1237 : 1231);
    }
}
