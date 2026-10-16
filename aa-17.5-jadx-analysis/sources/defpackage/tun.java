package defpackage;

import android.util.Log;
import androidx.car.app.model.Alert;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class tun implements qaw, uyl {
    public static final long a;
    private static final long i;
    private long D;
    private long E;
    private final yfq I;
    private yfq J;
    private final tsl K;
    private final ncp L;
    private final erb M;
    public final int h;
    private final tmb j;
    private final qbv k;
    private final qbv l;
    private final zbu m;
    private final boolean n;
    private long p;
    private boolean q;
    private boolean r;
    private final AtomicBoolean o = new AtomicBoolean(false);
    private boolean s = false;
    private long t = 0;
    private int u = 0;
    private int v = 0;
    private int w = 0;
    private int x = 0;
    private int y = 0;
    private int z = 0;
    private int A = Alert.DURATION_SHOW_INDEFINITELY;
    private int B = 0;
    private int C = 0;
    private long F = -1;
    private long G = 0;
    private volatile boolean H = false;
    public long b = 0;
    public long c = 0;
    public long d = 0;
    public long e = 0;
    public long f = 0;
    public long g = 0;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        a = 1000000000L;
        i = 1000000000L;
    }

    public tun(tsl tslVar, erb erbVar, tmb tmbVar, int i2, ncp ncpVar, boolean z) {
        int i3 = yfq.d;
        yfq yfqVar = yls.a;
        this.I = yfqVar;
        this.J = yfqVar;
        this.K = tslVar;
        this.M = erbVar;
        this.j = tmbVar;
        this.k = qbo.ak;
        this.l = qbo.aj;
        this.h = i2;
        abnp abnpVarN = zbu.a.n();
        if (i2 == 0) {
            throw null;
        }
        int i4 = i2 + (-1) == 1 ? 2 : 1;
        abnpVarN.t();
        zbu zbuVar = (zbu) abnpVarN.b;
        zbuVar.u = i4 - 1;
        zbuVar.e |= 536870912;
        this.m = (zbu) abnpVarN.q();
        this.L = ncpVar;
        this.n = z;
    }

    private final void f(long j) {
        this.G = 0L;
        this.F = j;
    }

    private final void g() {
        this.t = 0L;
        this.u = 0;
        this.v = 0;
        this.w = 0;
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.C = 0;
        this.B = 0;
        this.A = Alert.DURATION_SHOW_INDEFINITELY;
    }

    private static void h(String str, int i2, long j) {
        Log.v("JankMetrics", String.format("HawkeyeMetrics::%s: %f", str, Double.valueOf((i2 * 1000.0d) / j)));
    }

    private final void i() {
        yfq yfqVar;
        long j = this.G;
        if (j <= 0) {
            return;
        }
        int iMin = (int) Math.min(j, this.p);
        if (this.s) {
            if (iMin < this.A) {
                this.A = iMin;
            }
            this.B += iMin;
            this.C++;
        }
        synchronized (this) {
            yfqVar = this.I;
        }
        int i2 = ((yls) yfqVar).c;
        for (int i3 = 0; i3 < i2; i3++) {
            ((tum) yfqVar.get(i3)).a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:94:0x01b0  */
    @Override // defpackage.qaw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 823
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tun.c():void");
    }

    public final synchronized void d(tuk tukVar) {
        yfl yflVar = new yfl(4);
        yflVar.k(this.J);
        yflVar.i(tukVar);
        this.J = yflVar.g();
    }

    public final synchronized void e() {
        this.o.set(true);
    }

    @Override // defpackage.uyl
    public final void gt(String str, PrintWriter printWriter) {
        throw null;
    }

    @Override // defpackage.qaw
    public final void a() {
    }
}
