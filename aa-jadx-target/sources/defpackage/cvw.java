package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cvw extends defpackage.cwa {
    public defpackage.cwc a;

    public cvw(defpackage.cwc cwcVar) {
        this.a = cwcVar;
    }

    @Override // defpackage.cwa
    public final java.lang.Object a(defpackage.cjv cjvVar) {
        if (cjvVar != this.a.e()) {
            defpackage.csc.c("Check failed.");
        }
        return this.a.d();
    }

    @Override // defpackage.cwa
    public final void b(defpackage.cjv cjvVar, java.lang.Object obj) {
        throw null;
    }

    @Override // defpackage.cwa
    public final boolean c(defpackage.cjv cjvVar) {
        return cjvVar == this.a.e();
    }
}
