package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kfk extends defpackage.eqp {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.CntntPrvdrQryLvDt");
    private final defpackage.kfm h;
    private final android.content.ContentResolver i;
    private final android.content.AsyncQueryHandler j;
    private final int k;
    private final android.database.ContentObserver l = new defpackage.kfi(this, defpackage.wfp.a());

    public kfk(int i, android.content.ContentResolver contentResolver, defpackage.kfm kfmVar, kfl kflVar) {
        this.k = i;
        this.i = contentResolver;
        this.h = kfmVar;
        this.j = new defpackage.kfj(this, contentResolver, kflVar);
    }

    public final void a() {
        android.content.AsyncQueryHandler asyncQueryHandler = this.j;
        int i = this.k;
        asyncQueryHandler.cancelOperation(i);
        defpackage.kfm kfmVar = this.h;
        java.lang.String[] strArr = (java.lang.String[]) kfmVar.b.toArray(new java.lang.String[0]);
        java.lang.String[] strArr2 = (java.lang.String[]) kfmVar.d.toArray(new java.lang.String[0]);
        java.lang.String str = kfmVar.e;
        asyncQueryHandler.startQuery(i, null, kfmVar.a, strArr, kfmVar.c, strArr2, str);
    }

    @Override // defpackage.eqp
    protected final void c() {
        try {
            this.i.registerContentObserver(this.h.a, true, this.l);
            a();
        } catch (java.lang.SecurityException unused) {
            this.j.cancelOperation(this.k);
            java.lang.String authority = this.h.a.getAuthority();
            ((defpackage.yqj) ((defpackage.yqj) a.g()).ai((char) 2991)).y("Failed to access ContentProvider (authority=%s)", authority);
            defpackage.oim oimVarU = defpackage.omf.u();
            defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.CONTENT_PROVIDER_QUERY, defpackage.zbd.Jx);
            rrvVarH.p(new android.content.ComponentName(authority, ""));
            oimVarU.F(rrvVarH.l());
        }
    }

    @Override // defpackage.eqp
    protected final void d() {
        this.j.cancelOperation(this.k);
        try {
            this.i.unregisterContentObserver(this.l);
        } catch (java.lang.SecurityException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai((char) 2994)).u("Failed to unregister from ContentProvider");
        }
    }
}
