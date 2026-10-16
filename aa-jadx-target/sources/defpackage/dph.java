package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class dph {
    defpackage.dpj a;
    final /* synthetic */ defpackage.dpi b;

    public dph(defpackage.dpi dpiVar) {
        this.b = dpiVar;
    }

    public final java.lang.String toString() {
        java.lang.String str = "[ ";
        if (this.a != null) {
            for (int i = 0; i < 9; i++) {
                str = str + this.a.i[i] + " ";
            }
        }
        return str + "] " + java.lang.String.valueOf(this.a);
    }
}
