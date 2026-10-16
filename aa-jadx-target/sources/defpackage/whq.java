package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class whq extends defpackage.why {
    public static final defpackage.why a = new defpackage.whq();

    @Override // defpackage.why
    public final java.lang.String a() {
        return "singleproc";
    }

    @Override // defpackage.why
    public final /* synthetic */ defpackage.whx b(defpackage.whg whgVar, java.lang.String str, java.util.concurrent.Executor executor, defpackage.ngb ngbVar) {
        return new defpackage.whs(str, defpackage.ysr.cp(whgVar.a), new defpackage.wia(whgVar.b, whgVar.f ? defpackage.abol.a() : defpackage.abol.a), executor, ngbVar, whgVar.c);
    }
}
