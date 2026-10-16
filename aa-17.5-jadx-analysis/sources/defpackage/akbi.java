package defpackage;

/* loaded from: classes2.dex */
public final class akbi {
    public final String a;
    private final String b = "org.apache.http.client";
    private final String c;
    private final String d;
    private final String e;

    public akbi(String str, String str2, String str3, String str4) {
        this.c = str == null ? "UNAVAILABLE" : str;
        this.a = str2 == null ? "UNAVAILABLE" : str2;
        this.d = str3 == null ? "UNAVAILABLE" : str3;
        this.e = str4 == null ? "UNAVAILABLE" : str4;
    }

    public final String toString() {
        String str = this.b;
        int length = str.length();
        String str2 = this.c;
        int length2 = length + 20 + str2.length();
        String str3 = this.a;
        int length3 = length2 + str3.length();
        String str4 = this.d;
        int length4 = length3 + str4.length();
        String str5 = this.e;
        StringBuilder sb = new StringBuilder(length4 + str5.length());
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
