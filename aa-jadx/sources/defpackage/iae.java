package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class iae implements defpackage.hzr {
    private final android.content.Context a;
    private final java.lang.Class b;

    public iae(android.content.Context context, java.lang.Class cls) {
        this.a = context;
        this.b = cls;
    }

    @Override // defpackage.hzr
    public final defpackage.hzq b(defpackage.hzv hzvVar) {
        java.lang.Class cls = this.b;
        return new defpackage.iag(this.a, hzvVar.a(java.io.File.class, cls), hzvVar.a(android.net.Uri.class, cls), cls);
    }
}
