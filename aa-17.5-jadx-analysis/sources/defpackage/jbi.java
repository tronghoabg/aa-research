package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class jbi implements izs {
    private static final ypf a = ols.R("CAR.GAL.DIAGNOSTICS");
    private static final ComponentName b = new ComponentName("com.google.android.projection.gearhead", "com.google.android.apps.auto.components.bugreport.BugreporterReceiver");
    private final Object c = new Object();
    private final Context d;
    private final boolean e;
    private izt f;

    public jbi(Context context, boolean z) {
        this.d = context;
        this.e = z;
    }

    @Override // defpackage.izs
    public void a(izt iztVar) {
        synchronized (this.c) {
            this.f = iztVar;
        }
    }

    @Override // defpackage.izs
    public void b() {
        synchronized (this.c) {
            this.f = null;
        }
    }

    @Override // defpackage.izs
    public void c(xmh xmhVar) {
        long j = xmhVar.c;
        synchronized (this.c) {
            izt iztVar = this.f;
            if (iztVar != null) {
                iztVar.e(xmhVar.c);
            } else {
                a.f().ai(1784).u("onPingRequest: ControlEndPoint has not been registered");
            }
        }
        e(xmhVar);
    }

    @Override // defpackage.izs
    public void d(xmi xmiVar) {
        long j = xmiVar.c;
    }

    protected final void e(xmh xmhVar) {
        if (xmhVar.d) {
            if (!this.e) {
                a.h().l(1, TimeUnit.MINUTES).ai(1781).u("Not allowed to request a bugreport");
                return;
            }
            a.f().ai(1782).u("Sending a request for a bugreport");
            this.d.sendBroadcast(new Intent("android.intent.action.BUG_REPORT").setComponent(b).putExtra("EXTRA_ORIGIN", "ORIGIN_HU").addFlags(268435456));
        }
    }
}
