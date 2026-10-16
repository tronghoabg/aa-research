package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class okq extends defpackage.okc {
    public final android.content.Context a;
    boolean b;

    public okq(android.content.Context context) {
        super(defpackage.yyt.ONLY_KNOWN_CARS, false);
        this.b = false;
        this.a = context;
    }

    @Override // defpackage.okc
    public final defpackage.okf a() {
        return new defpackage.okp(this);
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
