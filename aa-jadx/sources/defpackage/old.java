package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class old extends defpackage.okc {
    public final android.content.Context a;

    public old(android.content.Context context) {
        super(defpackage.yyt.USB_DEBUGGING, false);
        this.a = context;
    }

    @Override // defpackage.okc
    public final defpackage.okf a() {
        return new defpackage.olc(this);
    }

    @Override // defpackage.okc
    public final int d() {
        return android.provider.Settings.Global.getInt(this.a.getContentResolver(), "adb_enabled", 0) == 1 ? 2 : 1;
    }

    @Override // defpackage.okc
    public final void b() {
    }
}
