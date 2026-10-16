package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum aedb {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");

    public final java.lang.String e;

    aedb(java.lang.String str) {
        this.e = str;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.e;
    }
}
