package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class blk {
    public final boolean a;
    public final defpackage.bko b;
    public final defpackage.bkl c;

    public blk(boolean z, defpackage.bko bkoVar, defpackage.bkl bklVar) {
        this.a = z;
        this.b = bkoVar;
        this.c = bklVar;
    }

    public final int a() {
        return this.c.c();
    }

    public final java.lang.String toString() {
        java.lang.String str;
        int iA = a();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SingleSelectionLayout(isStartHandle=");
        sb.append(this.a);
        sb.append(", crossed=");
        if (iA != 1) {
            str = iA != 2 ? "COLLAPSED" : "NOT_CROSSED";
        } else {
            str = "CROSSED";
        }
        defpackage.bkl bklVar = this.c;
        sb.append((java.lang.Object) str);
        sb.append(", info=\n\t");
        sb.append(bklVar);
        sb.append(")");
        return sb.toString();
    }
}
