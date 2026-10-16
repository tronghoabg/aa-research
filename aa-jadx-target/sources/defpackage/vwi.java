package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class vwi {
    public final java.lang.Long a;
    public final java.lang.Long b;
    public final java.lang.Long c;

    public vwi(java.lang.Long l, java.lang.Long l2, java.lang.Long l3) {
        this.a = l;
        this.b = l2;
        this.c = l3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.vwi) {
            defpackage.vwi vwiVar = (defpackage.vwi) obj;
            java.lang.Long l = this.a;
            if (l != null ? l.equals(vwiVar.a) : vwiVar.a == null) {
                java.lang.Long l2 = this.b;
                if (l2 != null ? l2.equals(vwiVar.b) : vwiVar.b == null) {
                    java.lang.Long l3 = this.c;
                    if (l3 != null ? l3.equals(vwiVar.c) : vwiVar.c == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Long l = this.a;
        int iHashCode = l == null ? 0 : l.hashCode();
        java.lang.Long l2 = this.b;
        int iHashCode2 = l2 == null ? 0 : l2.hashCode();
        int i = iHashCode ^ 1000003;
        java.lang.Long l3 = this.c;
        return (((i * 1000003) ^ iHashCode2) * 1000003) ^ (l3 != null ? l3.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "ProcDmaBuf{dmabufRssBytes=" + this.a + ", dmabufRssHwmBytes=" + this.b + ", dmabufPssBytes=" + this.c + "}";
    }

    public vwi() {
        throw null;
    }
}
