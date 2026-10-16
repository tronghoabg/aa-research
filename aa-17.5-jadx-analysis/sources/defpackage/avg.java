package defpackage;

/* loaded from: classes.dex */
public final class avg extends cxt<avh> {
    private final float a;
    private final float b;

    public avg(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new avh(this.a, this.b);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        avh avhVar = (avh) cfxVar;
        float f = avhVar.a;
        float f2 = this.a;
        int iCompare = Float.compare(f, f2);
        float f3 = this.b;
        if (iCompare != 0 || Float.compare(avhVar.b, f3) != 0 || !avhVar.c) {
            bzi.q(avhVar).W(false);
        }
        avhVar.a = f2;
        avhVar.b = f3;
        avhVar.c = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        avg avgVar = obj instanceof avg ? (avg) obj : null;
        return avgVar != null && Float.compare(this.a, avgVar.a) == 0 && Float.compare(this.b, avgVar.b) == 0;
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + 1231;
    }

    public final String toString() {
        float f = this.b;
        return "OffsetModifierElement(x=" + dlj.b(this.a) + ", y=" + dlj.b(f) + ", rtlAware=true)";
    }
}
