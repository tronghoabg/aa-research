package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class aem extends defpackage.aep {
    public float a;
    public float b;

    public aem(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.aep
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i != 1) {
            return 0.0f;
        }
        return this.b;
    }

    @Override // defpackage.aep
    public final int b() {
        return 2;
    }

    @Override // defpackage.aep
    public final /* synthetic */ defpackage.aep c() {
        return new defpackage.aem(0.0f, 0.0f);
    }

    @Override // defpackage.aep
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
    }

    @Override // defpackage.aep
    public final void e(int i, float f) {
        if (i == 0) {
            this.a = f;
        } else {
            if (i != 1) {
                return;
            }
            this.b = f;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.aem)) {
            return false;
        }
        defpackage.aem aemVar = (defpackage.aem) obj;
        return aemVar.a == this.a && aemVar.b == this.b;
    }

    public final int hashCode() {
        return (java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b);
    }

    public final java.lang.String toString() {
        return "AnimationVector2D: v1 = " + this.a + ", v2 = " + this.b;
    }
}
