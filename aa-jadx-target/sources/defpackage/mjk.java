package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mjk implements defpackage.lhn {
    private final android.content.Context a = defpackage.mkp.a.c;

    @Override // defpackage.lhn
    public final void d() {
        this.a.stopService(new android.content.Intent().setComponent(defpackage.mkt.G));
    }

    @Override // defpackage.lhn
    public final void eQ() {
        this.a.startService(new android.content.Intent().setComponent(defpackage.mkt.G));
    }
}
