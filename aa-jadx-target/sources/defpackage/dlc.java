package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dlc {
    public static final defpackage.dlc a = new defpackage.dlc(0);
    public static final defpackage.dlc b = new defpackage.dlc(1);
    public static final defpackage.dlc c = new defpackage.dlc(2);
    public final int d;

    public dlc(int i) {
        this.d = i;
    }

    public final boolean a(defpackage.dlc dlcVar) {
        int i = this.d;
        return (dlcVar.d | i) == i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.dlc) && this.d == ((defpackage.dlc) obj).d;
    }

    public final int hashCode() {
        return this.d;
    }

    public final java.lang.String toString() throws java.io.IOException {
        int i = this.d;
        if (i == 0) {
            return "TextDecoration.None";
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if ((b.d & i) != 0) {
            arrayList.add("Underline");
        }
        if ((i & c.d) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            java.lang.Object obj = arrayList.get(0);
            java.util.Objects.toString(obj);
            return "TextDecoration.".concat(java.lang.String.valueOf(obj));
        }
        return "TextDecoration[" + defpackage.dmh.c(arrayList, ", ", null, null, null, 62) + "]";
    }
}
