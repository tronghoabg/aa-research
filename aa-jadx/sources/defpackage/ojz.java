package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ojz extends defpackage.okc {
    public final android.content.Context a;
    boolean b;

    public ojz(android.content.Context context) {
        super(defpackage.yyt.FLAKY_USB_CABLE, false);
        this.b = false;
        this.a = context;
    }

    @Override // defpackage.okc
    public final defpackage.okf a() {
        return new defpackage.ojy(this);
    }

    @Override // defpackage.okc
    public final void b() {
        this.b = true;
    }

    @Override // defpackage.okc
    public final int d() {
        return this.b ? 2 : 1;
    }
}
