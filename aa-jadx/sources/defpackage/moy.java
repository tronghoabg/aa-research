package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class moy implements defpackage.lhn {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.DisplayStateMonitor");
    public android.hardware.display.DisplayManager b;
    public android.view.Display c;
    public int d;
    private defpackage.xzg e;
    private final java.util.Map f = new java.util.HashMap();
    private final android.hardware.display.DisplayManager.DisplayListener g = new defpackage.mox(this);

    public final void a(int i) {
        java.lang.Long lValueOf = java.lang.Long.valueOf(this.e.a(java.util.concurrent.TimeUnit.MILLISECONDS));
        j$.util.Map.EL.merge(this.f, java.lang.Integer.valueOf(this.d), lValueOf, new defpackage.mow(0));
        this.e.d();
        this.e.e();
        this.d = i;
    }

    @Override // defpackage.lhn
    public final void d() {
        if (this.b != null) {
            a(this.c.getState());
            j$.util.Map.EL.forEach(this.f, new defpackage.maj(2));
            this.b.unregisterDisplayListener(this.g);
        }
    }

    @Override // defpackage.lhn
    public final void eQ() {
        android.hardware.display.DisplayManager displayManager = (android.hardware.display.DisplayManager) defpackage.mkp.a.c.getSystemService("display");
        this.b = displayManager;
        if (displayManager == null) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 5132)).u("DisplayManager not found");
            return;
        }
        android.view.Display display = displayManager.getDisplay(0);
        this.c = display;
        if (display == null) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 5131)).u("Default display not found");
            return;
        }
        this.d = display.getState();
        this.e = defpackage.xzg.b((defpackage.xzo) defpackage.ojm.a().b);
        this.b.registerDisplayListener(this.g, new android.os.Handler(android.os.Looper.getMainLooper()));
    }
}
