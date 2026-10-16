package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class usu implements defpackage.usz {
    final float[] a;
    final int b;
    final float c;
    final float d;

    public usu(float[] fArr, int i, float f, float f2) {
        this.a = fArr;
        this.b = i;
        this.c = f;
        this.d = f2;
    }

    @Override // defpackage.usz
    public final int a() {
        return this.b;
    }

    @Override // defpackage.usz
    public final defpackage.tqd b() {
        return null;
    }

    @Override // defpackage.usz
    public final defpackage.tqd c() {
        return null;
    }

    @Override // defpackage.usz
    public final void d(int i, defpackage.tqd tqdVar) {
        float[] fArr = this.a;
        tqdVar.n(fArr[i] - this.c, fArr[i + 1] - this.d);
    }

    @Override // defpackage.usz
    public final boolean e(int i, int i2) {
        float[] fArr = this.a;
        return fArr[i] == fArr[i2];
    }
}
