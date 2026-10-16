package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hhr {
    public final java.lang.String a;
    public final int b;
    public final char c;
    public final boolean d;
    public final boolean e;

    public hhr(java.lang.String str, int i, char c, boolean z, boolean z2) {
        this.a = str;
        this.b = i;
        this.c = c;
        this.d = z;
        this.e = z2;
    }

    public static defpackage.mnm a() {
        defpackage.mnm mnmVar = new defpackage.mnm();
        mnmVar.c = (byte) (mnmVar.c | 1);
        mnmVar.g((char) 0);
        mnmVar.f();
        mnmVar.c = (byte) (mnmVar.c | 2);
        mnmVar.h(false);
        mnmVar.b = androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY;
        mnmVar.c = (byte) (mnmVar.c | 4);
        return mnmVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.hhr) {
            defpackage.hhr hhrVar = (defpackage.hhr) obj;
            java.lang.String str = this.a;
            if (str != null ? str.equals(hhrVar.a) : hhrVar.a == null) {
                if (this.b == hhrVar.b && this.c == hhrVar.c && this.d == hhrVar.d && this.e == hhrVar.e) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        int i = this.b;
        char c = this.c;
        return ((((((((iHashCode ^ 1000003) * 583896283) ^ i) * 1000003) ^ c) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true == this.e ? 1231 : 1237);
    }

    public final java.lang.String toString() {
        return "Column{name=" + this.a + ", width=0, minWidth=0, maxWidth=" + this.b + ", border=" + this.c + ", autoWidth=" + this.d + ", leftAligned=" + this.e + "}";
    }

    public hhr() {
        throw null;
    }
}
