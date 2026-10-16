package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class zik extends defpackage.zhq {
    final /* synthetic */ defpackage.zim a;
    private final defpackage.zgm b;

    public zik(defpackage.zim zimVar, defpackage.zgm zgmVar) {
        this.a = zimVar;
        this.b = zgmVar;
    }

    @Override // defpackage.zhq
    public final /* bridge */ /* synthetic */ java.lang.Object a() throws java.lang.Exception {
        defpackage.zhs zhsVarA = this.b.a();
        zhsVarA.getClass();
        return zhsVarA;
    }

    @Override // defpackage.zhq
    public final java.lang.String b() {
        return this.b.toString();
    }

    @Override // defpackage.zhq
    public final void d(java.lang.Throwable th) {
        this.a.p(th);
    }

    @Override // defpackage.zhq
    public final /* bridge */ /* synthetic */ void e(java.lang.Object obj) {
        this.a.r((defpackage.zhs) obj);
    }

    @Override // defpackage.zhq
    public final boolean g() {
        return this.a.isDone();
    }
}
