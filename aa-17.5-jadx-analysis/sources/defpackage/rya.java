package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class rya implements ryb {
    private static final ypf h = ols.R("rya");
    public final Context a;
    public final long c;
    public final long d;
    public long e;
    public boolean f;
    private final int i;
    private final Executor k;
    private boolean l;
    private final List j = new ArrayList();
    public boolean g = false;
    public final Handler b = new sss(Looper.getMainLooper());

    public rya(Context context, Executor executor, int i, long j, long j2) {
        this.a = context;
        this.k = executor;
        this.i = i;
        this.c = j;
        this.d = j2;
    }

    private final void h(boolean z) {
        if (this.l == z) {
            return;
        }
        this.l = z;
        if (!this.g) {
            this.g = true;
            this.b.postDelayed(new rnq(this, 13), this.d);
        }
        List list = this.j;
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        yrm.av(list, new xxj() { // from class: rxz
            @Override // defpackage.xxj
            public final boolean a(Object obj) {
                return ((Long) obj).longValue() < jElapsedRealtime - this.a.c;
            }
        });
        list.add(Long.valueOf(jElapsedRealtime));
        if (list.size() > this.i && !this.f) {
            h.l().ai(8539).u("Flakey connection detected!");
            this.f = true;
            ols.L(this.a, "com.google.android.gms.car.USB_ISSUE_FOUND", rrz.j, null);
            if (Build.VERSION.SDK_INT >= 30 && adbr.a.gu().o()) {
                this.k.execute(new rnq(this, 12));
            }
        }
        this.e = jElapsedRealtime;
        h.l().ai(8538).y("Usb change, %s", list);
    }

    @Override // defpackage.ryb
    public final void b(ryv ryvVar) {
        h(ryvVar.a);
    }

    @Override // defpackage.ryb
    public final void c(ryx ryxVar) {
        h(ryxVar.c);
    }

    @Override // defpackage.ryb
    public final void e() {
        this.b.removeCallbacksAndMessages(null);
        g();
        h.l().ai(8540).u("Stopping flakey connection detector");
    }

    @Override // defpackage.ryb
    public final /* synthetic */ String[] f() {
        return roc.g();
    }

    public final void g() {
        this.g = false;
    }

    @Override // defpackage.ryb
    public final void d() {
    }

    @Override // defpackage.ryb
    public final /* synthetic */ void v(String str, xxh xxhVar) {
    }
}
