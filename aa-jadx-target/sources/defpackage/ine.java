package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class ine extends defpackage.edd {
    public final int a;
    public final android.window.InputTransferToken b;
    public final int c;

    public ine(int i, android.window.InputTransferToken inputTransferToken, int i2) {
        this.a = i;
        this.b = inputTransferToken;
        this.c = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.ine) {
            defpackage.ine ineVar = (defpackage.ine) obj;
            if (this.a == ineVar.a && this.c == ineVar.c && j$.util.Objects.equals(this.b, ineVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.c) * 31) + j$.util.Objects.hashCode(this.b);
    }

    public final java.lang.String toString() {
        int i = 0;
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(this.a), this.b, java.lang.Integer.valueOf(this.c)};
        java.lang.String[] strArrSplit = "windowId;token;virtualDisplayId".split(";");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ine[");
        while (true) {
            int length = strArrSplit.length;
            if (i >= length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(strArrSplit[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
            i++;
        }
    }
}
