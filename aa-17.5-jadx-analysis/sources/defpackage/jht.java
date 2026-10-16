package defpackage;

import android.opengl.Matrix;
import android.os.SystemClock;

/* loaded from: classes.dex */
public abstract class jht implements jhs {
    protected static final float[] g;
    protected final long h;
    protected final float j;
    protected volatile long i = SystemClock.elapsedRealtime();
    protected final jhu k = new jhu();

    static {
        float[] fArr = new float[16];
        g = fArr;
        Matrix.setIdentityM(fArr, 0);
    }

    public jht(long j, float f) {
        this.h = Math.round(j * f);
        this.j = f;
    }

    protected static int i(int i, int i2) {
        return Math.round(dlz.F(i2, i));
    }

    @Override // defpackage.jhs
    public int a() {
        return 0;
    }

    protected abstract jhu b(boolean z, long j);

    @Override // defpackage.jhs
    public boolean c() {
        return true;
    }

    @Override // defpackage.jhs
    public boolean d() {
        return false;
    }

    @Override // defpackage.jhs
    public final long e() {
        return this.h;
    }

    @Override // defpackage.jhs
    public final jhu f(boolean z) {
        return b(z, SystemClock.elapsedRealtime() - this.i);
    }

    @Override // defpackage.jhs
    public final void g() {
        this.i = SystemClock.elapsedRealtime();
    }

    @Override // defpackage.jhs
    public boolean h(long j) {
        return j(j, this.h);
    }

    protected final boolean j(long j, long j2) {
        return j >= j2 + this.i;
    }
}
