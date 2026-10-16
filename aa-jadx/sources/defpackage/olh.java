package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class olh extends defpackage.okc {
    private final android.content.Context a;
    private int b;

    public olh(android.content.Context context) {
        super(defpackage.yyt.VPN_DETECTED, false);
        this.b = 1;
        this.a = context;
    }

    @Override // defpackage.okc
    public final defpackage.okf a() {
        return new defpackage.olg(this, this.a);
    }

    @Override // defpackage.okc
    public final void b() {
        this.b = 2;
    }

    @Override // defpackage.okc
    public final int d() {
        return this.b;
    }
}
