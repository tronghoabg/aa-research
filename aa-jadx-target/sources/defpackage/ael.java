package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ael extends defpackage.aep {
    public float a;

    public ael(float f) {
        this.a = f;
    }

    @Override // defpackage.aep
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        return 0.0f;
    }

    @Override // defpackage.aep
    public final int b() {
        return 1;
    }

    @Override // defpackage.aep
    public final /* synthetic */ defpackage.aep c() {
        return new defpackage.ael(0.0f);
    }

    @Override // defpackage.aep
    public final void d() {
        this.a = 0.0f;
    }

    @Override // defpackage.aep
    public final void e(int i, float f) {
        if (i == 0) {
            this.a = f;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.ael) && ((defpackage.ael) obj).a == this.a;
    }

    public final int hashCode() {
        return java.lang.Float.floatToIntBits(this.a);
    }

    public final java.lang.String toString() {
        return "AnimationVector1D: value = " + this.a;
    }
}
