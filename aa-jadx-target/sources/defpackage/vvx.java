package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class vvx implements defpackage.vqw {
    final /* synthetic */ defpackage.aclm a;
    final /* synthetic */ defpackage.zhw b;
    public final /* synthetic */ defpackage.vvz c;

    public vvx(defpackage.vvz vvzVar, defpackage.aclm aclmVar, defpackage.zhw zhwVar) {
        this.a = aclmVar;
        this.b = zhwVar;
        this.c = vvzVar;
    }

    @Override // defpackage.vqw
    public final void g(defpackage.vlu vluVar) {
        defpackage.vvz vvzVar = this.c;
        vvzVar.g.a(3, vluVar.a);
        vvzVar.a();
        long jLongValue = ((java.lang.Long) this.a.a()).longValue();
        vvzVar.i = this.b.f(new defpackage.umi(this, vluVar, 16, null), jLongValue, java.util.concurrent.TimeUnit.SECONDS);
    }

    @Override // defpackage.vqw
    public final void j(defpackage.vlu vluVar) {
        defpackage.vvz vvzVar = this.c;
        vvzVar.g.a(4, vluVar.a);
        vvzVar.a();
        vvzVar.h = this.b.f(new defpackage.kfq(this, vluVar, 19), 10L, java.util.concurrent.TimeUnit.SECONDS);
    }
}
