package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class iag implements defpackage.hzq {
    private final android.content.Context a;
    private final defpackage.hzq b;
    private final defpackage.hzq c;
    private final java.lang.Class d;

    public iag(android.content.Context context, defpackage.hzq hzqVar, defpackage.hzq hzqVar2, java.lang.Class cls) {
        this.a = context.getApplicationContext();
        this.b = hzqVar;
        this.c = hzqVar2;
        this.d = cls;
    }

    @Override // defpackage.hzq
    public final /* bridge */ /* synthetic */ boolean a(java.lang.Object obj) {
        return android.os.Build.VERSION.SDK_INT >= 29 && defpackage.hef.g((android.net.Uri) obj);
    }

    @Override // defpackage.hzq
    public final /* bridge */ /* synthetic */ defpackage.ndd b(java.lang.Object obj, int i, int i2, defpackage.huw huwVar) {
        android.net.Uri uri = (android.net.Uri) obj;
        return new defpackage.ndd(new defpackage.ifr(uri), new defpackage.iaf(this.a, this.b, this.c, uri, i, i2, huwVar, this.d));
    }
}
