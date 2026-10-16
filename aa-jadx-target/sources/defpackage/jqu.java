package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jqu implements defpackage.lhn {
    public static final /* synthetic */ int b = 0;
    public final android.content.Context a;
    private defpackage.eqt e;
    private boolean d = false;
    private int f = 1;
    private final defpackage.jqt c = new defpackage.jqt();

    static {
        defpackage.yqm.c("GH.AapmHunController");
    }

    public jqu(android.content.Context context) {
        this.a = context;
    }

    public static void a(defpackage.zbe zbeVar, defpackage.zbd zbdVar) {
        defpackage.omf.u().F((defpackage.rrw) defpackage.rrw.h(defpackage.yzd.GEARHEAD, zbeVar, zbdVar).l());
    }

    public final void b() {
        if (this.e != null) {
            defpackage.mpj.b().h.k(this.e);
        }
    }

    @Override // defpackage.lhn
    public final void d() {
        b();
        if (android.os.Build.VERSION.SDK_INT >= 33 && this.d) {
            this.a.unregisterReceiver(this.c);
            this.d = false;
        }
        this.f = 1;
    }

    public final boolean e() {
        android.content.Context context;
        android.content.SharedPreferences sharedPreferences;
        if (defpackage.acmk.c() && defpackage.acyc.aL() && (((sharedPreferences = (context = this.a).getSharedPreferences("gh_notification_pref", 0)) == null || !sharedPreferences.getBoolean("aapm_hun_dsa_pref", false)) && defpackage.jqv.a(context))) {
            defpackage.mkv.b();
            if (defpackage.mkv.a()) {
                int i = this.f;
                int i2 = 1;
                if (i == 1) {
                    i = true != ((java.lang.Boolean) defpackage.kgu.c(new defpackage.kyr(i2), "GH.AapmHunController", defpackage.zbe.LIFETIME, defpackage.zbd.ph, true, "Could not get car connection type", new java.lang.Object[0])).booleanValue() ? 3 : 2;
                    this.f = i;
                }
                if (i != 2) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.lhn
    public final void eQ() {
        if (defpackage.acmk.c() && android.os.Build.VERSION.SDK_INT >= 33 && !this.d) {
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            intentFilter.addAction("com.google.android.projection.gearhead.ACTION_DSA_AAPM_HUN");
            defpackage.duw.e(this.a, this.c, intentFilter, null, 4);
            this.d = true;
        }
        if (defpackage.acmk.d() && defpackage.jqv.a(this.a)) {
            defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.LIFETIME, defpackage.zbd.Nf).l());
        }
        if (e()) {
            this.e = new defpackage.hlm(this, 2);
            defpackage.mpj.b().h.eM(defpackage.ler.c(), this.e);
        }
    }
}
