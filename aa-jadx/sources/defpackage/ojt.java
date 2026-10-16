package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ojt extends defpackage.okc {
    public final android.content.Context a;

    public ojt(android.content.Context context) {
        super(defpackage.yyt.BLUETOOTH_CONNECT_PERMISSION_MISSING, false);
        this.a = context;
    }

    @Override // defpackage.okc
    public final defpackage.okf a() {
        return new defpackage.ojs(this);
    }

    public final boolean c() {
        return android.os.Build.VERSION.SDK_INT >= 31 && this.a.checkSelfPermission("android.permission.BLUETOOTH_CONNECT") == -1;
    }

    @Override // defpackage.okc
    public final int d() {
        return c() ? 2 : 1;
    }

    @Override // defpackage.okc
    public final void b() {
    }
}
