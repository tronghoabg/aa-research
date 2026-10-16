package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class upw extends java.io.IOException {
    public final int a;

    public upw(java.lang.Throwable th) {
        int i;
        super(th);
        int i2 = 0;
        if ((th instanceof defpackage.pji) && (i = ((defpackage.pji) th).b) >= 65536 && i < 81920) {
            i2 = i - 65536;
        }
        this.a = i2;
    }

    public upw() {
        super("Failed to create sqlite disk cache directory");
        this.a = 0;
    }
}
