package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class jia implements defpackage.jhz {
    protected static final float[] g;
    protected final long h;
    protected final float j;
    protected volatile long i = android.os.SystemClock.elapsedRealtime();
    protected final defpackage.jib k = new defpackage.jib();

    static {
        float[] fArr = new float[16];
        g = fArr;
        android.opengl.Matrix.setIdentityM(fArr, 0);
    }

    public jia(long j, float f) {
        this.h = java.lang.Math.round(j * f);
        this.j = f;
    }

    protected static int i(int i, int i2) {
        return java.lang.Math.round(defpackage.ebm.o(i2, i));
    }

    @Override // defpackage.jhz
    public int a() {
        return 0;
    }

    protected abstract defpackage.jib b(boolean z, long j);

    @Override // defpackage.jhz
    public boolean c() {
        return true;
    }

    @Override // defpackage.jhz
    public boolean d() {
        return false;
    }

    @Override // defpackage.jhz
    public final long e() {
        return this.h;
    }

    @Override // defpackage.jhz
    public final defpackage.jib f(boolean z) {
        return b(z, android.os.SystemClock.elapsedRealtime() - this.i);
    }

    @Override // defpackage.jhz
    public final void g() {
        this.i = android.os.SystemClock.elapsedRealtime();
    }

    @Override // defpackage.jhz
    public boolean h(long j) {
        return j(j, this.h);
    }

    protected final boolean j(long j, long j2) {
        return j >= j2 + this.i;
    }
}
