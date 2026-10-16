package defpackage;

/* loaded from: classes3.dex */
public final class urx implements usd {
    final float[] a;
    final int b;
    final float c;
    final float d;

    public urx(float[] fArr, int i, float f, float f2) {
        this.a = fArr;
        this.b = i;
        this.c = f;
        this.d = f2;
    }

    @Override // defpackage.usd
    public final int a() {
        return this.b;
    }

    @Override // defpackage.usd
    public final tpf b() {
        return null;
    }

    @Override // defpackage.usd
    public final tpf c() {
        return null;
    }

    @Override // defpackage.usd
    public final void d(int i, tpf tpfVar) {
        float[] fArr = this.a;
        tpfVar.n(fArr[i] - this.c, fArr[i + 1] - this.d);
    }

    @Override // defpackage.usd
    public final boolean e(int i, int i2) {
        float[] fArr = this.a;
        return fArr[i] == fArr[i2];
    }
}
