package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class igs {
    public final java.lang.String a;
    public java.util.List b = null;
    public java.util.List c = null;
    public final int d;

    public igs(int i, java.lang.String str) {
        this.d = i == 0 ? 1 : i;
        this.a = str;
    }

    public final void a(java.lang.String str, int i, java.lang.String str2) {
        if (this.b == null) {
            this.b = new java.util.ArrayList();
        }
        this.b.add(new defpackage.aahg(str, i, str2));
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i = this.d;
        if (i == 2) {
            sb.append("> ");
        } else if (i == 3) {
            sb.append("+ ");
        }
        java.lang.String str = this.a;
        if (str == null) {
            str = "*";
        }
        sb.append(str);
        java.util.List<defpackage.aahg> list = this.b;
        if (list != null) {
            for (defpackage.aahg aahgVar : list) {
                sb.append('[');
                sb.append((java.lang.String) aahgVar.b);
                int i2 = aahgVar.a - 1;
                if (i2 == 1) {
                    sb.append('=');
                    sb.append((java.lang.String) aahgVar.c);
                } else if (i2 == 2) {
                    sb.append("~=");
                    sb.append((java.lang.String) aahgVar.c);
                } else if (i2 == 3) {
                    sb.append("|=");
                    sb.append((java.lang.String) aahgVar.c);
                }
                sb.append(']');
            }
        }
        java.util.List<java.lang.String> list2 = this.c;
        if (list2 != null) {
            for (java.lang.String str2 : list2) {
                sb.append(':');
                sb.append(str2);
            }
        }
        return sb.toString();
    }
}
