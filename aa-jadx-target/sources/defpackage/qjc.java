package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qjc implements defpackage.lbx {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.RatingPromptManager");
    static final long b = 28800000;
    public static final long c = 14400000;
    static final long d = 5184000000L;
    public static final java.util.regex.Pattern e = java.util.regex.Pattern.compile("^(\\d+\\.\\d+)\\.");
    final oip f;
    public final android.content.Context g;
    public final android.content.SharedPreferences h;
    public java.lang.Boolean i;
    public long j = -1;

    public qjc(android.content.Context context) {
        context.getClass();
        this.g = context;
        this.h = context.getSharedPreferences("GH.RatingPromptManager", 0);
        this.f = new defpackage.qjb(this);
    }

    @Override // defpackage.lhn
    public final void d() {
        ((defpackage.yqj) a.l().ai((char) 7361)).u("Stopping RatingPromptManager.");
        defpackage.omf.t().f(this.f);
    }

    @Override // defpackage.lhn
    public final void eQ() {
        ((defpackage.yqj) a.l().ai((char) 7360)).u("Starting RatingPromptManager.");
        defpackage.omf.t().d(this.f, java.util.Arrays.asList(defpackage.yyh.UI, defpackage.yyh.NON_UI));
    }
}
