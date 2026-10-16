package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class poc {
    final defpackage.aceu a;
    final boolean b;
    final boolean c;
    final int d;

    public poc(defpackage.aceu aceuVar, boolean z, boolean z2, int i) {
        this.a = aceuVar;
        this.b = z;
        this.c = z2;
        this.d = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.poc)) {
            return false;
        }
        defpackage.poc pocVar = (defpackage.poc) obj;
        return this.a == pocVar.a && this.b == pocVar.b && this.c == pocVar.c && this.d == pocVar.d;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(this.a, java.lang.Boolean.valueOf(this.b), java.lang.Boolean.valueOf(this.c), java.lang.Integer.valueOf(this.d));
    }
}
