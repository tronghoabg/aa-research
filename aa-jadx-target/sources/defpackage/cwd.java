package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cwd extends defpackage.cwa {
    private final defpackage.bwx a = new androidx.compose.runtime.ParcelableSnapshotMutableState(null, defpackage.bxv.c);
    private final defpackage.cjv b;

    public cwd(defpackage.cjv cjvVar) {
        this.b = cjvVar;
    }

    @Override // defpackage.cwa
    public final java.lang.Object a(defpackage.cjv cjvVar) {
        if (cjvVar != this.b) {
            defpackage.csc.c("Check failed.");
        }
        java.lang.Object objA = this.a.a();
        if (objA == null) {
            return null;
        }
        return objA;
    }

    @Override // defpackage.cwa
    public final void b(defpackage.cjv cjvVar, java.lang.Object obj) {
        if (cjvVar != this.b) {
            defpackage.csc.c("Check failed.");
        }
        this.a.b(obj);
    }

    @Override // defpackage.cwa
    public final boolean c(defpackage.cjv cjvVar) {
        return cjvVar == this.b;
    }
}
