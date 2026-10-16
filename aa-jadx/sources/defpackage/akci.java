package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class akci {
    public final java.lang.String a;
    private final java.lang.String b = "org.apache.http.client";
    private final java.lang.String c;
    private final java.lang.String d;
    private final java.lang.String e;

    public akci(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.c = str == null ? "UNAVAILABLE" : str;
        this.a = str2 == null ? "UNAVAILABLE" : str2;
        this.d = str3 == null ? "UNAVAILABLE" : str3;
        this.e = str4 == null ? "UNAVAILABLE" : str4;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.b;
        int length = str.length();
        java.lang.String str2 = this.c;
        int length2 = length + 20 + str2.length();
        java.lang.String str3 = this.a;
        int length3 = length2 + str3.length();
        java.lang.String str4 = this.d;
        int length4 = length3 + str4.length();
        java.lang.String str5 = this.e;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length4 + str5.length());
        sb.append("VersionInfo(");
        sb.append(str);
        sb.append(':');
        sb.append(str2);
        if (!"UNAVAILABLE".equals(str3)) {
            sb.append(':');
            sb.append(str3);
        }
        if (!"UNAVAILABLE".equals(str4)) {
            sb.append(':');
            sb.append(str4);
        }
        sb.append(')');
        if (!"UNAVAILABLE".equals(str5)) {
            sb.append('@');
            sb.append(str5);
        }
        return sb.toString();
    }
}
