package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jio extends defpackage.jia {
    private static final defpackage.yqm a = defpackage.yqm.c("CAR.WIN.ANIM");
    private final long l;
    private boolean m;
    private final defpackage.jic n;
    private final long o;
    private final int p;

    public jio(defpackage.jic jicVar, long j, long j2, int i, float f) {
        super(j2 + j, f);
        this.m = false;
        this.l = this.i;
        this.n = jicVar;
        this.o = j;
        this.p = i;
        if (i == 0) {
            android.opengl.Matrix.setIdentityM(this.k.a, 0);
        } else {
            android.opengl.Matrix.translateM(this.k.a, 0, g, 0, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, i, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        }
    }

    @Override // defpackage.jia
    protected final defpackage.jib b(boolean z, long j) {
        long j2 = 0;
        if (z && !this.m) {
            this.m = true;
            g();
            j = 0;
        }
        if (this.m) {
            j2 = j;
        } else {
            long j3 = this.i + j;
            long j4 = this.l;
            if (j3 > 1000 + j4) {
                ((defpackage.yqj) ((defpackage.yqj) a.f()).ai(2160)).G("timeout while waiting for initial rendering, now:%d real start time:%d", j3, j4);
                this.m = true;
                g();
            }
        }
        long j5 = this.o;
        if (j2 > j5) {
            float fA = this.n.a(j2, j5, this.h);
            float f = fA * com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
            int i = this.p;
            android.opengl.Matrix.translateM(this.k.a, 0, g, 0, f + com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, i + ((-i) * fA), com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        }
        return this.k;
    }

    @Override // defpackage.jia, defpackage.jhz
    public final boolean h(long j) {
        if (this.m) {
            return super.h(j);
        }
        return false;
    }
}
