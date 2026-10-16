package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class akay implements java.lang.Cloneable {
    public final java.lang.String a;
    public final java.lang.String b;
    private final defpackage.ajqp[] c;

    public akay(java.lang.String str, java.lang.String str2, defpackage.ajqp[] ajqpVarArr) {
        this.a = str;
        this.b = str2;
        if (ajqpVarArr != null) {
            this.c = ajqpVarArr;
        } else {
            this.c = new defpackage.ajqp[0];
        }
    }

    public final int a() {
        return this.c.length;
    }

    public final defpackage.ajqp b(int i) {
        return this.c[i];
    }

    public final defpackage.ajqp c(java.lang.String str) {
        int i = 0;
        while (true) {
            defpackage.ajqp[] ajqpVarArr = this.c;
            if (i >= ajqpVarArr.length) {
                return null;
            }
            defpackage.ajqp ajqpVar = ajqpVarArr[i];
            if (ajqpVar.b().equalsIgnoreCase(str)) {
                return ajqpVar;
            }
            i++;
        }
    }

    public final java.lang.Object clone() throws java.lang.CloneNotSupportedException {
        return super.clone();
    }

    public final defpackage.ajqp[] d() {
        return (defpackage.ajqp[]) this.c.clone();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.akay) {
            defpackage.akay akayVar = (defpackage.akay) obj;
            if (this.a.equals(akayVar.a) && defpackage.a.an(this.b, akayVar.b) && defpackage.agwh.d(this.c, akayVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iC = defpackage.agwh.c(defpackage.agwh.c(17, this.a), this.b);
        int i = 0;
        while (true) {
            defpackage.ajqp[] ajqpVarArr = this.c;
            if (i >= ajqpVarArr.length) {
                return iC;
            }
            iC = defpackage.agwh.c(iC, ajqpVarArr[i]);
            i++;
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.a);
        java.lang.String str = this.b;
        if (str != null) {
            sb.append("=");
            sb.append(str);
        }
        for (defpackage.ajqp ajqpVar : this.c) {
            sb.append("; ");
            sb.append(ajqpVar);
        }
        return sb.toString();
    }
}
