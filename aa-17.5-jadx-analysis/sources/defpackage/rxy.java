package defpackage;

import android.app.UiModeManager;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* loaded from: classes.dex */
public final class rxy implements ryb {
    public static final ypf a = ols.R("CAR.SERVICE.FCD");
    static final ygr b = ygr.r("com.google.android.gms.car.VERSION_NEGOTIATION", "com.google.android.gms.car.SSL_NEGOTIATION", "com.google.android.gms.car.SDP_NEGOTIATION", "com.google.android.gms.car.AUTHORIZATION");
    static final ygr c = yrm.o(rrs.b, rrs.d, rrs.e);
    public final yfy d;
    final BroadcastReceiver e;
    public final Context f;
    public rxw g;
    private final Handler h;
    private final xyc i;
    private final Runnable j;
    private boolean k;

    public rxy(Context context, Handler handler) {
        vks vksVar = new vks(context, 1);
        yfu yfuVar = new yfu(4);
        yfuVar.e(rxw.b, new rxx(rrz.c, rrz.f, new rhy(4), new rsv(this, 5)));
        yfuVar.e(rxw.c, new rxx(rrz.d, rrz.g, new rhy(5), new rsv(this, 6)));
        yfuVar.e(rxw.d, new rxx(rrz.e, rrz.h, new rhy(6), new rsv(this, 7)));
        this.d = yrm.F(yfuVar.d(true));
        this.e = new rxv(this);
        this.j = new rsv(this, 8);
        this.g = rxw.a;
        this.k = false;
        this.f = context;
        this.h = handler;
        this.i = vksVar;
    }

    @Override // defpackage.ryb
    public final void b(ryv ryvVar) {
        if (ryvVar.a) {
            return;
        }
        h(rxw.a);
    }

    @Override // defpackage.ryb
    public final void c(ryx ryxVar) {
        if (!ryxVar.c || !ryxVar.b) {
            h(rxw.a);
            return;
        }
        int iOrdinal = this.g.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (ryxVar.e) {
                return;
            }
            h(rxw.b);
        } else if (ryxVar.e) {
            h(rxw.c);
        } else {
            h(rxw.b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ryb
    public final void d() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gms.car.FIRST_ACTIVITY");
        yno it = b.iterator();
        while (it.hasNext()) {
            intentFilter.addAction((String) it.next());
        }
        intentFilter.addAction("com.google.android.gms.car.FRX");
        intentFilter.addAction("com.google.android.gms.car.PROJECTION_STARTED");
        intentFilter.addAction("com.google.android.gms.car.PROJECTION_ENDED");
        Context context = this.f;
        BroadcastReceiver broadcastReceiver = this.e;
        etb.a(context).b(broadcastReceiver, intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction(UiModeManager.ACTION_ENTER_CAR_MODE);
        intentFilter2.addAction(UiModeManager.ACTION_EXIT_CAR_MODE);
        rhx rhxVar = rhx.c;
        dup.e(context, broadcastReceiver, intentFilter2, null, 2);
    }

    @Override // defpackage.ryb
    public final void e() {
        h(rxw.a);
        Context context = this.f;
        etb etbVarA = etb.a(context);
        BroadcastReceiver broadcastReceiver = this.e;
        etbVarA.c(broadcastReceiver);
        context.unregisterReceiver(broadcastReceiver);
    }

    @Override // defpackage.ryb
    public final /* synthetic */ String[] f() {
        return roc.g();
    }

    public final void g(boolean z) {
        if (!z || !((Boolean) this.i.gu()).booleanValue()) {
            this.k = true;
        } else {
            a.f().ai(8532).y("USB connection was reset in stage %s", this.g);
            h(rxw.a);
        }
    }

    final void h(rxw rxwVar) {
        if (rxwVar == this.g) {
            return;
        }
        Handler handler = this.h;
        Runnable runnable = this.j;
        handler.removeCallbacks(runnable);
        if (this.k && rxwVar.ordinal() > this.g.ordinal()) {
            yfy yfyVar = this.d;
            if (yfyVar.containsKey(this.g)) {
                ols.L(this.f, "com.google.android.gms.car.USB_ISSUE_FOUND", ((rxx) yfyVar.get(this.g)).b, null);
            }
        }
        yfy yfyVar2 = this.d;
        if (yfyVar2.containsKey(rxwVar)) {
            handler.postDelayed(runnable, ((rxx) yfyVar2.get(rxwVar)).a());
        }
        a.l().ai(8534).M("transitioning %s -> %s", this.g, rxwVar);
        this.g = rxwVar;
        this.k = false;
    }

    public final void i() {
        Context context = this.f;
        rym rymVarA = ryn.a(context);
        if (!rymVarA.b) {
            a.h().ai(8537).u("Could not launch FirstActivity because no android auto accessory was attached.");
            return;
        }
        a.f().ai(8535).u("Force starting first activity");
        Intent intentAddFlags = new Intent("com.google.android.gms.car.usb.USB_ACCESSORY_FORCE_START").setComponent((ComponentName) rhz.c.gu()).putExtra("accessory", rymVarA.a).addFlags(268435456);
        rhx rhxVar = rhx.c;
        intentAddFlags.putExtra("EXTRA_GEARHEAD_ORIGIN", true);
        try {
            context.startActivity(intentAddFlags);
        } catch (ActivityNotFoundException e) {
            a.h().p(e).ai(8536).u("Could not launch Android Auto first activity");
        }
    }

    @Override // defpackage.ryb
    public final /* synthetic */ void v(String str, xxh xxhVar) {
    }
}
