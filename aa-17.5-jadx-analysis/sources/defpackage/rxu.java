package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;

/* loaded from: classes.dex */
public final class rxu implements ryb {
    public static final ypf a = ols.R("CAR.SERVICE");
    public final Context b;
    public whk g;
    private final Handler h;
    private final long i;
    final Runnable c = new rsv(this, 4, null);
    BroadcastReceiver d = null;
    public boolean e = false;
    private boolean j = false;
    public boolean f = false;

    public rxu(Context context, Handler handler, long j) {
        this.b = context;
        this.h = handler;
        this.i = j;
    }

    public static final boolean h(Intent intent) {
        return (intent.getIntExtra("plugged", 0) & 3) != 0;
    }

    private final void i() {
        if (!this.j || this.f) {
            k();
        } else {
            j();
        }
    }

    private final void j() {
        this.h.postDelayed(this.c, this.i);
    }

    private final void k() {
        this.h.removeCallbacks(this.c);
        whk whkVar = this.g;
        if (whkVar != null) {
            whkVar.a(!this.f);
        }
        if (this.e && this.f) {
            ols.L(this.b, "com.google.android.gms.car.USB_ISSUE_FOUND", rrz.b, null);
        }
        this.e = false;
    }

    @Override // defpackage.ryb
    public final void b(ryv ryvVar) {
        g(ryvVar.a);
    }

    @Override // defpackage.ryb
    public final void c(ryx ryxVar) {
        boolean z = this.f;
        boolean z2 = ryxVar.b;
        if (z != z2) {
            this.f = z2;
            i();
        }
    }

    @Override // defpackage.ryb
    public final void d() {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        Context context = this.b;
        Intent intentE = dup.e(context, null, intentFilter, null, 2);
        boolean z = false;
        if (intentE != null && h(intentE)) {
            z = true;
        }
        this.j = z;
        if (z) {
            j();
        }
        this.d = new rxt(this);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("android.intent.action.BATTERY_CHANGED");
        rhx rhxVar = rhx.c;
        int i = Build.VERSION.SDK_INT;
        BroadcastReceiver broadcastReceiver = this.d;
        if (i >= 30) {
            dup.e(context, broadcastReceiver, intentFilter2, null, 2);
        } else {
            dup.e(context, broadcastReceiver, intentFilter2, null, 2);
        }
    }

    @Override // defpackage.ryb
    public final void e() {
        k();
        BroadcastReceiver broadcastReceiver = this.d;
        if (broadcastReceiver != null) {
            this.b.unregisterReceiver(broadcastReceiver);
            this.d = null;
        }
        this.j = false;
        this.f = false;
    }

    @Override // defpackage.ryb
    public final /* synthetic */ String[] f() {
        return roc.g();
    }

    public final void g(boolean z) {
        if (this.j != z) {
            this.j = z;
            i();
        }
    }

    @Override // defpackage.ryb
    public final /* synthetic */ void v(String str, xxh xxhVar) {
    }
}
