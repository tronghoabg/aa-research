package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lqq implements defpackage.eqt {
    static final j$.time.Duration a = j$.time.Duration.ofSeconds(10);
    static final j$.time.Duration b = j$.time.Duration.ofSeconds(10);
    static final j$.time.Duration c = j$.time.Duration.ofSeconds(60);
    public static final /* synthetic */ int m = 0;
    public final android.content.SharedPreferences d;
    public boolean i;
    public lqv j;
    defpackage.gkc l;
    private final android.content.Context n;
    private int o;
    public boolean k = false;
    public final android.os.Handler e = new android.os.Handler(android.os.Looper.getMainLooper());
    public boolean g = false;
    public boolean h = false;
    public final java.util.List f = new java.util.ArrayList();

    public lqq(android.content.Context context, android.content.SharedPreferences sharedPreferences) {
        this.n = context;
        this.d = sharedPreferences;
        this.o = sharedPreferences.getInt("autoplay_media_pause_history", 0);
    }

    public final void b(java.lang.String str, boolean z) {
        ((defpackage.yqj) defpackage.lqz.a.l().ai(4195)).N("Key (%s) committed to: %b", str, z);
        this.d.edit().putBoolean(str, z).commit();
        defpackage.ojm.a();
        this.f.add(new defpackage.lqp(j$.time.Instant.now(), str, z));
    }

    public final void c(boolean z) {
        int i = this.o;
        this.o = ((z ? 1 : 0) | (i + i)) & ((1 << ((int) defpackage.actz.c())) - 1);
        this.d.edit().putInt("autoplay_media_pause_history", this.o).apply();
    }

    @Override // defpackage.eqt
    public final /* synthetic */ void ea(java.lang.Object obj) {
        lqv lqvVar;
        defpackage.lqr lqrVar = (defpackage.lqr) obj;
        boolean z = lqrVar.b;
        defpackage.yqm yqmVar = defpackage.lqz.a;
        boolean z2 = this.h;
        this.h = z || lqrVar.c == 2;
        boolean z3 = this.g;
        this.g = defpackage.lki.b(lqrVar.a);
        if (defpackage.actz.y() && z3 && !this.g && !this.k && (lqvVar = this.j) != null) {
            defpackage.ojm.a();
            if (j$.time.Duration.between(lqvVar.d, j$.time.Instant.now()).compareTo(j$.time.Duration.ofSeconds(defpackage.actz.d())) < 0) {
                this.k = true;
                c(true);
                if (java.lang.Integer.bitCount(this.o) >= defpackage.actz.e()) {
                    android.content.SharedPreferences sharedPreferences = this.d;
                    if (sharedPreferences.getBoolean("disable_autoplay_hun_shown", false)) {
                        ((defpackage.yqj) ((defpackage.yqj) defpackage.lqz.a.f()).ai((char) 4196)).u("Pause history higher than required count, but disable autoplay HUN already shown");
                    } else if (defpackage.kit.b().r()) {
                        ((defpackage.yqj) ((defpackage.yqj) defpackage.lqz.a.f()).ai((char) 4198)).u("Pause history higher than required count, triggering disable autoplay HUN");
                        android.content.Context context = this.n;
                        defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.MEDIA_AUTOPLAY, defpackage.zbd.gs).l());
                        android.app.PendingIntent broadcast = android.app.PendingIntent.getBroadcast(context, 0, new android.content.Intent("com.google.android.gearhead.autoplay.ACTION_DISABLE_AUTOPLAY").setPackage(context.getPackageName()), 201326592);
                        aafz aafzVar = new aafz((byte[]) null);
                        aafzVar.d = context.getString(2132083978);
                        aafzVar.b = broadcast;
                        nvb nvbVar = new nvb(aafzVar);
                        android.app.PendingIntent broadcast2 = android.app.PendingIntent.getBroadcast(context, 1, new android.content.Intent("com.google.android.gearhead.autoplay.ACTION_KEEP_ON_AUTOPLAY").setPackage(context.getPackageName()), 201326592);
                        aafz aafzVar2 = new aafz((byte[]) null);
                        aafzVar2.d = context.getString(2132083975);
                        aafzVar2.b = broadcast2;
                        nvb nvbVar2 = new nvb(aafzVar2);
                        nvc nvcVar = new nvc();
                        nvcVar.f = context.getPackageName();
                        nvcVar.x = defpackage.nve.a;
                        nvcVar.a = nvf.d;
                        nvcVar.m = context.getString(2132083976);
                        nvcVar.n = context.getString(2132083974);
                        nvcVar.p = nvbVar;
                        nvcVar.q = nvbVar2;
                        defpackage.nuz.b().j(defpackage.zaw.MEDIA.name(), 881096330L, nvcVar.b());
                        sharedPreferences.edit().putBoolean("disable_autoplay_hun_shown", true).apply();
                    } else {
                        ((defpackage.yqj) ((defpackage.yqj) defpackage.lqz.a.f()).ai((char) 4197)).u("Pause history higher than required count, but not connected to car");
                    }
                }
            }
        }
        if (defpackage.actz.s() && this.h) {
            this.e.removeCallbacksAndMessages(null);
            return;
        }
        if (!(defpackage.actz.s() && z2) && z3 == this.g) {
            return;
        }
        android.os.Handler handler = this.e;
        handler.removeCallbacksAndMessages(null);
        if (this.g) {
            handler.postDelayed(new defpackage.lmh(this, 10), b.toMillis());
        }
        handler.postDelayed(new defpackage.lmh(this, 11), this.g ? 0L : a.toMillis());
    }
}
