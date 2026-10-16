package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class evd {
    public final android.net.Uri a;
    public final java.lang.String b;
    public final java.lang.String c;

    public evd(android.net.Uri uri, java.lang.String str, java.lang.String str2) {
        this.a = uri;
        this.b = str;
        this.c = str2;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NavDeepLinkRequest{");
        android.net.Uri uri = this.a;
        if (uri != null) {
            sb.append(" uri=");
            sb.append(uri.toString());
        }
        java.lang.String str = this.b;
        if (str != null) {
            sb.append(" action=");
            sb.append(str);
        }
        java.lang.String str2 = this.c;
        if (str2 != null) {
            sb.append(" mimetype=");
            sb.append(str2);
        }
        sb.append(" }");
        return sb.toString();
    }
}
