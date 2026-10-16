package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class jbp implements defpackage.izz {
    private static final defpackage.yqk a = defpackage.omv.n("CAR.GAL.DIAGNOSTICS");
    private static final android.content.ComponentName b = new android.content.ComponentName("com.google.android.projection.gearhead", "com.google.android.apps.auto.components.bugreport.BugreporterReceiver");
    private final java.lang.Object c = new java.lang.Object();
    private final android.content.Context d;
    private final boolean e;
    private defpackage.jaa f;

    public jbp(android.content.Context context, boolean z) {
        this.d = context;
        this.e = z;
    }

    @Override // defpackage.izz
    public void a(defpackage.jaa jaaVar) {
        synchronized (this.c) {
            this.f = jaaVar;
        }
    }

    @Override // defpackage.izz
    public void b() {
        synchronized (this.c) {
            this.f = null;
        }
    }

    @Override // defpackage.izz
    public void c(defpackage.xni xniVar) {
        long j = xniVar.c;
        synchronized (this.c) {
            defpackage.jaa jaaVar = this.f;
            if (jaaVar != null) {
                jaaVar.e(xniVar.c);
            } else {
                a.f().ai(1784).u("onPingRequest: ControlEndPoint has not been registered");
            }
        }
        e(xniVar);
    }

    @Override // defpackage.izz
    public void d(defpackage.xnj xnjVar) {
        long j = xnjVar.c;
    }

    protected final void e(defpackage.xni xniVar) {
        if (xniVar.d) {
            if (!this.e) {
                a.h().l(1, java.util.concurrent.TimeUnit.MINUTES).ai(1781).u("Not allowed to request a bugreport");
                return;
            }
            a.f().ai(1782).u("Sending a request for a bugreport");
            this.d.sendBroadcast(new android.content.Intent("android.intent.action.BUG_REPORT").setComponent(b).putExtra("EXTRA_ORIGIN", "ORIGIN_HU").addFlags(268435456));
        }
    }
}
