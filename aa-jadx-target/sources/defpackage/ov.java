package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ov {
    public final int a;
    public final int b;
    public final java.lang.Object c;

    public ov(int i, int i2, java.lang.Object obj) {
        this.a = i;
        this.b = i2;
        this.c = obj;
        if (i < 0) {
            defpackage.asq.c("startIndex should be >= 0");
        }
        if (i2 > 0) {
            return;
        }
        defpackage.asq.c("size should be > 0");
    }

    public final int a(boolean z) {
        return z ? this.b : this.a;
    }

    public ov(int i, int i2, defpackage.affc affcVar) {
        this.a = i;
        this.b = i2;
        this.c = affcVar;
    }
}
