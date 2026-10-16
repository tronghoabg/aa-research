package defpackage;

/* loaded from: classes2.dex */
public final class ajzy implements Cloneable {
    public final String a;
    public final String b;
    private final ajpp[] c;

    public ajzy(String str, String str2, ajpp[] ajppVarArr) {
        this.a = str;
        this.b = str2;
        if (ajppVarArr != null) {
            this.c = ajppVarArr;
        } else {
            this.c = new ajpp[0];
        }
    }

    public final int a() {
        return this.c.length;
    }

    public final ajpp b(int i) {
        return this.c[i];
    }

    public final ajpp c(String str) {
        int i = 0;
        while (true) {
            ajpp[] ajppVarArr = this.c;
            if (i >= ajppVarArr.length) {
                return null;
            }
            ajpp ajppVar = ajppVarArr[i];
            if (ajppVar.b().equalsIgnoreCase(str)) {
                return ajppVar;
            }
            i++;
        }
    }

    public final Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public final ajpp[] d() {
        return (ajpp[]) this.c.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ajzy) {
            ajzy ajzyVar = (ajzy) obj;
            if (this.a.equals(ajzyVar.a) && a.ao(this.b, ajzyVar.b) && ahku.d(this.c, ajzyVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iC = ahku.c(ahku.c(17, this.a), this.b);
        int i = 0;
        while (true) {
            ajpp[] ajppVarArr = this.c;
            if (i >= ajppVarArr.length) {
                return iC;
            }
            iC = ahku.c(iC, ajppVarArr[i]);
            i++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        String str = this.b;
        if (str != null) {
            sb.append("=");
            sb.append(str);
        }
        for (ajpp ajppVar : this.c) {
            sb.append("; ");
            sb.append(ajppVar);
        }
        return sb.toString();
    }
}
