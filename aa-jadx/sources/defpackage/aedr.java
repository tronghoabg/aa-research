package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aedr {
    public final java.lang.String a;
    public final int b;
    private final java.lang.String c;

    public aedr(defpackage.aedq aedqVar) {
        this.a = aedqVar.b;
        this.b = aedqVar.a();
        this.c = aedqVar.toString();
    }

    public static int a(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        if (c < 'A' || c > 'F') {
            return -1;
        }
        return c - '7';
    }

    public static int b(java.lang.String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.aedr) && ((defpackage.aedr) obj).c.equals(this.c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final java.lang.String toString() {
        return this.c;
    }
}
