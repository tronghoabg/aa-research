package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lza implements defpackage.lyv {
    public static final /* synthetic */ int e = 0;
    public boolean a;
    private final defpackage.ljb f;
    private final android.content.SharedPreferences g;
    public final java.util.Set b = new java.util.concurrent.CopyOnWriteArraySet();
    private final android.content.SharedPreferences.OnSharedPreferenceChangeListener i = new defpackage.kww(this, 3, null);
    private final defpackage.lja j = new defpackage.lyw(this, 0);
    final defpackage.lyz c = new defpackage.lyx(this);
    public final defpackage.lyz d = new defpackage.lyy(this);
    private final defpackage.xzi h = defpackage.ysr.aQ(new inr(this, 8));

    static {
        defpackage.yqm.c("GH.VpManagerImpl");
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public lza(defpackage.mku mkuVar, defpackage.ljb ljbVar) {
        this.g = mkuVar.b;
        this.f = ljbVar;
    }

    @Override // defpackage.lyv
    public final defpackage.eqp a() {
        return (defpackage.eqp) this.h.fF();
    }

    @Override // defpackage.lyv
    public final void b(lyu lyuVar) {
        this.b.add(lyuVar);
    }

    @Override // defpackage.lhn
    public final void d() {
        this.a = false;
        this.c.c();
        this.b.clear();
        this.f.p(this.j);
        this.g.unregisterOnSharedPreferenceChangeListener(this.i);
    }

    @Override // defpackage.lyv
    public final void e(boolean z) {
        this.g.edit().putBoolean("key_settings_messaging_visual_preview_enabled", z).apply();
        ((defpackage.eqs) this.h.fF()).m(java.lang.Boolean.valueOf(z));
    }

    @Override // defpackage.lhn
    public final void eQ() {
        this.g.registerOnSharedPreferenceChangeListener(this.i);
        this.f.k(this.j);
        this.a = true;
        this.c.c();
        this.d.c();
    }

    @Override // defpackage.lyv
    public final void f(lyu lyuVar) {
        this.b.remove(lyuVar);
    }

    @Override // defpackage.lyv
    public final boolean g() {
        return l();
    }

    @Override // defpackage.lyv
    public final boolean h() {
        boolean z = defpackage.mkp.a.c.getResources().getBoolean(2131034224);
        android.content.SharedPreferences sharedPreferences = this.g;
        return sharedPreferences == null ? z : sharedPreferences.getBoolean("key_settings_messaging_visual_preview_enabled", z);
    }

    @Override // defpackage.lyv
    public final boolean i() {
        return this.d.b;
    }

    @Override // defpackage.lyv
    public final boolean j(luk lukVar) {
        return l() && lukVar.l();
    }

    @Override // defpackage.lyv
    public final boolean k(lvn lvnVar) {
        return l() && lvnVar.b.getBoolean("visual_preview");
    }

    final boolean l() {
        return this.c.b;
    }
}
