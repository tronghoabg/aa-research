package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class oey implements ngs {
    private final defpackage.ngy c;
    private static final defpackage.yqm b = defpackage.yqm.c("GH.DialerEducationPrvdr");
    static final defpackage.oex a = new defpackage.oex(defpackage.acrf.r(), defpackage.acbk.A, defpackage.zbe.PHONE_FACET);

    public oey(defpackage.ngy ngyVar) {
        this.c = ngyVar;
    }

    public final /* bridge */ /* synthetic */ ngx a(ngt ngtVar) {
        if (android.os.Build.VERSION.SDK_INT < 30 || !defpackage.acrf.s() || !defpackage.mdp.d().k()) {
            return null;
        }
        android.content.Context context = defpackage.mkp.a.c;
        if (!defpackage.oeh.a().H(context) || defpackage.oeh.a().B(context)) {
            return null;
        }
        defpackage.ngy ngyVar = this.c;
        defpackage.oex oexVar = a;
        if (ngyVar.j(oexVar) || ngtVar != ngu.a) {
            return null;
        }
        ((defpackage.yqj) ((defpackage.yqj) b.f()).ai((char) 5625)).u("Showing Multi-SIM tooltip");
        return oexVar;
    }
}
