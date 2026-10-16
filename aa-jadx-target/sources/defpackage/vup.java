package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class vup extends defpackage.sqs implements defpackage.vsw {
    public final defpackage.vsu a;
    public final android.content.Context b;
    public final java.util.concurrent.Executor c;
    public final defpackage.afak d;
    public final defpackage.aclm e;
    public final defpackage.afak f;
    public final defpackage.afak g;
    public final defpackage.afak h;
    public final defpackage.vum i;
    public final defpackage.vpu j;
    public final defpackage.ret k;

    public vup(defpackage.wde wdeVar, android.content.Context context, java.util.concurrent.Executor executor, defpackage.vum vumVar, defpackage.afak afakVar, defpackage.aclm aclmVar, defpackage.vpu vpuVar, defpackage.ret retVar, defpackage.afak afakVar2, defpackage.afak afakVar3, defpackage.afak afakVar4) {
        super(null, null);
        this.a = wdeVar.d(executor, aclmVar, null);
        this.b = context;
        this.c = executor;
        this.i = vumVar;
        this.d = afakVar;
        this.j = vpuVar;
        this.k = retVar;
        this.e = aclmVar;
        this.f = afakVar2;
        this.g = afakVar3;
        this.h = afakVar4;
    }

    @Override // defpackage.vsw
    public final void k() {
        defpackage.zim zimVar = new defpackage.zim(new defpackage.vtx(this, 3));
        java.util.concurrent.Executor executor = this.c;
        executor.execute(zimVar);
        executor.execute(new defpackage.zim(java.util.concurrent.Executors.callable(new defpackage.rzu(this, 16), null)));
    }
}
