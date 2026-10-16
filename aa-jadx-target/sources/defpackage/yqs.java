package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class yqs implements defpackage.ypw {
    private static final java.util.Set d = new java.util.HashSet(java.util.Arrays.asList(java.lang.Boolean.class, java.lang.Byte.class, java.lang.Short.class, java.lang.Integer.class, java.lang.Long.class, java.lang.Float.class, java.lang.Double.class));
    public final java.lang.StringBuilder b;
    public boolean c = false;
    private final java.lang.String e = "[CONTEXT ";
    public final java.lang.String a = " ]";

    public yqs(java.lang.StringBuilder sb) {
        this.b = sb;
    }

    private static int b(java.lang.String str, int i) {
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt < ' ' || cCharAt == '\"' || cCharAt == '\\') {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // defpackage.ypw
    public final void a(java.lang.String str, java.lang.Object obj) {
        boolean z = this.c;
        java.lang.StringBuilder sb = this.b;
        if (z) {
            sb.append(' ');
        } else {
            if (sb.length() > 0) {
                sb.append((sb.length() > 1000 || sb.indexOf("\n") != -1) ? '\n' : ' ');
            }
            sb.append(this.e);
            this.c = true;
        }
        java.lang.StringBuilder sb2 = this.b;
        sb2.append(str);
        sb2.append('=');
        if (obj == null) {
            sb2.append(true);
            return;
        }
        if (d.contains(obj.getClass())) {
            sb2.append(obj);
            return;
        }
        sb2.append('\"');
        java.lang.String string = obj.toString();
        int i = 0;
        while (true) {
            int iB = b(string, i);
            if (iB == -1) {
                sb2.append((java.lang.CharSequence) string, i, string.length());
                sb2.append('\"');
                return;
            }
            sb2.append((java.lang.CharSequence) string, i, iB);
            i = iB + 1;
            char cCharAt = string.charAt(iB);
            if (cCharAt == '\t') {
                cCharAt = 't';
            } else if (cCharAt == '\n') {
                cCharAt = 'n';
            } else if (cCharAt == '\r') {
                cCharAt = 'r';
            } else if (cCharAt != '\"' && cCharAt != '\\') {
                sb2.append((char) 65533);
            }
            sb2.append("\\");
            sb2.append(cCharAt);
        }
    }
}
