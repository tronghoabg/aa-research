package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lcv implements defpackage.lhn {
    public static final defpackage.lcu a = new defpackage.lcu();
    public static final defpackage.yqm b = defpackage.yqm.c("GH.CsatPostdrive");
    public static final defpackage.afhl c = new defpackage.lco(defpackage.afga.bZ(new defpackage.mko[]{defpackage.mko.b}), 2);
    public final defpackage.ldf d;
    public final java.util.Set e;
    private final android.content.Context f;
    private final oip g;
    private final defpackage.ldm h;

    public /* synthetic */ lcv(byte[] bArr) {
        defpackage.ldf ldfVarA = defpackage.ldf.a.a();
        android.content.Context context = defpackage.mkp.a.c;
        context.getClass();
        context.getClass();
        this.d = ldfVarA;
        this.f = context;
        java.util.EnumSet enumSetNoneOf = java.util.EnumSet.noneOf(defpackage.lby.class);
        enumSetNoneOf.getClass();
        this.e = enumSetNoneOf;
        this.g = new defpackage.lds(this, 1);
        int i = defpackage.ldm.e;
        this.h = new defpackage.ldm(new defpackage.kwz(this, 7));
    }

    public static final defpackage.lcv a() {
        return a.a();
    }

    public final void b(android.content.Context context) {
        context.getClass();
        android.widget.Toast.makeText(context, 2132083886, 1).show();
    }

    @Override // defpackage.lhn
    public final void d() {
        b.l().u("Stopping CsatPostdriveManager");
        android.content.Context context = this.f;
        defpackage.ldm ldmVar = this.h;
        synchronized (ldmVar.a) {
            if (ldmVar.b) {
                context.unregisterReceiver(ldmVar);
                ldmVar.b = false;
            }
        }
        defpackage.omf.t().f(this.g);
    }

    @Override // defpackage.lhn
    public final void eQ() {
        b.l().u("Starting CsatPostdriveManager");
        defpackage.omf.t().d(this.g, defpackage.afga.I(defpackage.yyh.NON_UI));
        android.content.Context context = this.f;
        defpackage.ldm ldmVar = this.h;
        synchronized (ldmVar.a) {
            if (!ldmVar.b) {
                defpackage.duw.e(context, ldmVar, new android.content.IntentFilter("com.google.android.apps.auto.components.feedback.csat.TRIGGER_SURVEY"), null, 4);
                ldmVar.b = true;
            }
        }
    }

    public lcv() {
        this(null);
    }
}
