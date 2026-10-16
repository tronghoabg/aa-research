package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jfy {
    public java.lang.String a;
    public java.lang.String b;
    public java.lang.String c;
    public java.lang.String d;
    private java.lang.String e;

    public final defpackage.jfz a() {
        java.lang.String str = this.e;
        if (str != null) {
            return new defpackage.jfz(str, this.a, this.b, this.c, this.d);
        }
        throw new java.lang.IllegalStateException("Missing required properties: make");
    }

    public final void b(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null make");
        }
        this.e = str;
    }
}
