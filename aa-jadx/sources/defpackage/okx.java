package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class okx extends defpackage.okc {
    public final android.content.Context a;

    public okx(android.content.Context context) {
        super(defpackage.yyt.SIDELOAD, false);
        this.a = context;
    }

    @Override // defpackage.okc
    public final defpackage.okf a() {
        return new defpackage.okw(this);
    }

    @Override // defpackage.okc
    public final int d() {
        return (android.os.Build.VERSION.SDK_INT < 29 || this.a.checkSelfPermission("android.permission.MANAGE_USB") == 0) ? 1 : 2;
    }

    @Override // defpackage.okc
    public final void b() {
    }
}
