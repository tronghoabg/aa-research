package defpackage;

import android.opengl.Matrix;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class jih extends jht {
    private static final yph a = yph.c("CAR.WIN.ANIM");
    private final long l;
    private boolean m;
    private final jhv n;
    private final long o;
    private final int p;

    public jih(jhv jhvVar, long j, long j2, int i, float f) {
        super(j2 + j, f);
        this.m = false;
        this.l = this.i;
        this.n = jhvVar;
        this.o = j;
        this.p = i;
        if (i == 0) {
            Matrix.setIdentityM(this.k.a, 0);
        } else {
            Matrix.translateM(this.k.a, 0, g, 0, BitmapDescriptorFactory.HUE_RED, i, BitmapDescriptorFactory.HUE_RED);
        }
    }

    @Override // defpackage.jht
    protected final jhu b(boolean z, long j) {
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
                ((ype) ((ype) a.f()).ai(2159)).G("timeout while waiting for initial rendering, now:%d real start time:%d", j3, j4);
                this.m = true;
                g();
            }
        }
        long j5 = this.o;
        if (j2 > j5) {
            float fA = this.n.a(j2, j5, this.h);
            Matrix.translateM(this.k.a, 0, g, 0, (fA * BitmapDescriptorFactory.HUE_RED) + BitmapDescriptorFactory.HUE_RED, this.p + ((-r0) * fA), BitmapDescriptorFactory.HUE_RED);
        }
        return this.k;
    }

    @Override // defpackage.jht, defpackage.jhs
    public final boolean h(long j) {
        if (this.m) {
            return super.h(j);
        }
        return false;
    }
}
