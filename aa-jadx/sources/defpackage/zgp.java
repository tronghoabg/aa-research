package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class zgp extends defpackage.zgr {
    final /* synthetic */ defpackage.zgs a;
    private final defpackage.zgm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zgp(defpackage.zgs zgsVar, defpackage.zgm zgmVar, java.util.concurrent.Executor executor) {
        super(zgsVar, executor);
        this.a = zgsVar;
        this.c = zgmVar;
    }

    @Override // defpackage.zhq
    public final /* bridge */ /* synthetic */ java.lang.Object a() throws java.lang.Exception {
        return this.c.a();
    }

    @Override // defpackage.zhq
    public final java.lang.String b() {
        return this.c.toString();
    }

    @Override // defpackage.zgr
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        this.a.r((defpackage.zhs) obj);
    }
}
