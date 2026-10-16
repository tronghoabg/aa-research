package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qkh {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final long d;
    public final java.lang.String e;
    public final android.net.Uri f;

    public qkh(java.lang.String str, java.lang.String str2, java.lang.String str3, long j, java.lang.String str4, android.net.Uri uri) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        if (uri == null || str4 == null) {
            this.e = null;
            this.f = null;
        } else {
            this.e = str4;
            this.f = uri;
        }
    }

    public qkh(java.lang.String str, java.lang.String str2, java.lang.String str3, long j) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = null;
        this.f = null;
    }
}
