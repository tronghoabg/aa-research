package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dwn {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.util.List d;
    public final int e;
    public final java.lang.String f;
    public final java.lang.String g;
    public final java.lang.String h;

    public dwn(java.lang.String str, java.lang.String str2) {
        this.a = "com.google.android.gms.fonts";
        this.b = "com.google.android.gms";
        this.c = str;
        this.d = null;
        this.e = 2130903050;
        this.f = null;
        this.g = str2;
        this.h = a("com.google.android.gms.fonts", "com.google.android.gms", str, null, str2);
    }

    private static final java.lang.String a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append("-");
        sb.append(str2);
        sb.append("-");
        sb.append(str3);
        sb.append("-");
        sb.append(str4);
        if (str5 != null && !defpackage.tna.aj(str5)) {
            sb.append("-VF");
        }
        return sb.toString();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.a + ", mProviderPackage: " + this.b + ", mQuery: " + this.c + ", mSystemFont: " + this.f + ", mVariationSettings: " + this.g + ", mCertificates:");
        int i = 0;
        while (true) {
            java.util.List list = this.d;
            if (i >= list.size()) {
                sb.append("}");
                sb.append("mCertificatesArray: " + this.e);
                return sb.toString();
            }
            sb.append(" [");
            java.util.List list2 = (java.util.List) list.get(i);
            for (int i2 = 0; i2 < list2.size(); i2++) {
                sb.append(" \"");
                sb.append(android.util.Base64.encodeToString((byte[]) list2.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
            i++;
        }
    }

    public dwn(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list, java.lang.String str4, java.lang.String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        list.getClass();
        this.d = list;
        this.e = 0;
        this.f = str4;
        this.g = str5;
        this.h = a(str, str2, str3, str4, str5);
    }
}
