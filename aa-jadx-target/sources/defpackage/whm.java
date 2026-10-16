package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class whm extends defpackage.why {
    public static final defpackage.xzi a = defpackage.ysr.aQ(new defpackage.riu(13));
    private final defpackage.sqs b;

    public whm(defpackage.sqs sqsVar) {
        this.b = sqsVar;
    }

    @Override // defpackage.why
    public final java.lang.String a() {
        return "mmap";
    }

    @Override // defpackage.why
    public final /* synthetic */ defpackage.whx b(defpackage.whg whgVar, java.lang.String str, java.util.concurrent.Executor executor, defpackage.ngb ngbVar) {
        defpackage.wia wiaVar = new defpackage.wia(whgVar.b, whgVar.f ? defpackage.abol.a() : defpackage.abol.a);
        if (!(whgVar.e instanceof defpackage.whi)) {
            throw new java.lang.IllegalArgumentException();
        }
        android.net.Uri uri = whgVar.a;
        return new defpackage.who(str, uri == null ? defpackage.zho.a : new defpackage.zho(uri), wiaVar, executor, ngbVar, whgVar.c, this.b);
    }
}
