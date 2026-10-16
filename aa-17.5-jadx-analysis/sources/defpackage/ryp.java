package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;

/* loaded from: classes.dex */
final class ryp implements ryb {
    public static final ypf a = ols.R("CAR.SERVICE.UsbIssueDetector");
    private final Context c;
    private final ryb d;
    private final BroadcastReceiver b = new ryo(this);
    private boolean e = false;

    public ryp(Context context, ryb rybVar) {
        this.c = context;
        this.d = rybVar;
    }

    @Override // defpackage.ryb
    public final void b(ryv ryvVar) {
        if (this.e) {
            this.d.b(ryvVar);
        }
    }

    @Override // defpackage.ryb
    public final void c(ryx ryxVar) {
        if (this.e) {
            this.d.c(ryxVar);
        }
    }

    @Override // defpackage.ryb
    public final void d() {
        woy.Z(!this.e);
        g();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gms.car.FIRST_ACTIVITY");
        intentFilter.addAction("com.google.android.gms.car.PROJECTION_STARTED");
        intentFilter.addAction("com.google.android.gms.car.PROJECTION_ENDED");
        etb.a(this.c).b(this.b, intentFilter);
    }

    @Override // defpackage.ryb
    public final void e() {
        etb.a(this.c).c(this.b);
        h();
    }

    @Override // defpackage.ryb
    public final String[] f() {
        return this.e ? this.d.f() : new String[0];
    }

    public final void g() {
        if (this.e) {
            return;
        }
        this.d.d();
        this.e = true;
    }

    public final void h() {
        if (this.e) {
            this.d.e();
            this.e = false;
        }
    }

    @Override // defpackage.ryb
    public final void v(String str, xxh xxhVar) {
        if (this.e) {
            this.d.v(str, xxhVar);
        }
    }
}
