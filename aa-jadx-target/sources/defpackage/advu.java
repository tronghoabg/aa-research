package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class advu {
    public int a;
    public int b;
    public java.lang.Object c;

    public advu(byte[] bArr) {
        this.b = 0;
        this.c = null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final defpackage.adjs a() {
        return ((defpackage.adkw) this.c.get(this.a)).f;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final java.net.SocketAddress b() {
        return (java.net.SocketAddress) ((defpackage.adkw) this.c.get(this.a)).e.get(this.b);
    }

    public final void c() {
        this.a = 0;
        this.b = 0;
    }

    public advu(java.util.List list) {
        this.c = list;
    }

    public advu() {
        this.c = null;
    }

    public advu(byte[] bArr, byte[] bArr2) {
    }
}
