package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lar implements defpackage.lhn {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.DeprecationAlertGen");
    private final android.content.Context b = defpackage.mkp.a.c;

    private final void a() {
        android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
        nvc nvcVar = new nvc();
        nvcVar.a = nvf.d;
        boolean zD = defpackage.acvq.d();
        android.content.Context context = this.b;
        nvcVar.m = zD ? context.getString(2132083346) : context.getString(2132084686);
        boolean zD2 = defpackage.acvq.d();
        android.content.Context context2 = this.b;
        nvcVar.n = zD2 ? context2.getString(2132083345) : context2.getString(2132084685);
        nvcVar.f = "com.google.android.projection.gearhead";
        nvcVar.k = false;
        nvcVar.h = 0;
        nvcVar.x = defpackage.nve.a;
        nvcVar.b = com.google.android.apps.auto.components.graphics.icon.GhIcon.p(this.b, true != defpackage.acvq.d() ? 2131233112 : 2131231825);
        handler.postDelayed(new defpackage.kmp(nvcVar.b(), 14), 5000L);
    }

    @Override // defpackage.lhn
    public final void eQ() {
        if (android.os.Build.VERSION.SDK_INT < ((int) defpackage.acvq.b())) {
            if (defpackage.acvq.f()) {
                if (defpackage.jrj.a()) {
                    a();
                }
                android.content.Context context = this.b;
                defpackage.maz.c();
                defpackage.dte dteVar = new defpackage.dte(context, "gearhead_alerts");
                dteVar.n(2131231572);
                dteVar.i(context.getString(2132084788));
                dteVar.h(context.getString(2132084787));
                dtd dtdVar = new dtd();
                dtdVar.d(context.getString(2132084787));
                dteVar.o(dtdVar);
                dteVar.i = 2;
                new defpackage.dun(context).b(null, 2131429164, dteVar.a());
                return;
            }
            if (defpackage.jrj.a()) {
                a();
                return;
            }
            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 3693)).u("Adding OS deprecation card to Vanagon");
            moh mohVar = new moh();
            mohVar.j = defpackage.zaw.OS_DEPRECATION;
            mohVar.c("deprecation");
            android.content.Context context2 = this.b;
            mohVar.s = context2.getString(2132084686);
            mohVar.t = context2.getString(2132084685);
            mohVar.i = "com.google.android.projection.gearhead";
            mohVar.w = 0;
            mohVar.n = 5000;
            mohVar.o = true;
            mohVar.v = 2131233112;
            defpackage.lxy.o().j(new moi(mohVar));
        }
    }

    @Override // defpackage.lhn
    public final void d() {
    }
}
