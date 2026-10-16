package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pwr implements defpackage.pwv {
    private static final defpackage.pxg c = new defpackage.pxg("connectivity", "true");
    public defpackage.zif a;
    final android.content.BroadcastReceiver b = new defpackage.pwq(this);
    private final java.util.concurrent.atomic.AtomicBoolean d = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final defpackage.pmc e;
    private final android.content.Context f;

    public pwr(android.content.Context context, defpackage.pmc pmcVar) {
        this.e = pmcVar;
        this.f = context;
    }

    @Override // defpackage.pwv
    public final defpackage.pww a() {
        return defpackage.pww.g;
    }

    @Override // defpackage.pwv
    public final defpackage.pxg c() {
        if (!this.d.getAndSet(true)) {
            this.f.registerReceiver(this.b, new android.content.IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
        if (this.e.c()) {
            return c;
        }
        return null;
    }

    @Override // defpackage.pwv
    public final defpackage.zhs d() {
        defpackage.pxg pxgVarC = c();
        if (pxgVarC != null) {
            return defpackage.ysr.cp(pxgVarC);
        }
        synchronized (this) {
            defpackage.zif zifVar = this.a;
            if (zifVar != null) {
                return defpackage.ysr.cq(zifVar);
            }
            defpackage.zif zifVar2 = new defpackage.zif();
            this.a = zifVar2;
            return defpackage.ysr.cq(zifVar2);
        }
    }

    @Override // defpackage.pwv
    public final /* synthetic */ void e() {
    }
}
