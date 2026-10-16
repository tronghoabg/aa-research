package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class wcr extends defpackage.wcs {
    private volatile boolean d;
    private java.lang.Object e;

    public wcr(java.lang.String str, java.lang.String str2, defpackage.wdo wdoVar, defpackage.wco wcoVar, java.lang.String str3) {
        super(str, str2, wdoVar, wcoVar);
        this.e = str3;
        this.d = true;
    }

    @Override // defpackage.wck
    public final java.lang.Object e() {
        if (this.d) {
            synchronized (this) {
                if (this.d) {
                    java.lang.Object objFH = fH((java.lang.String) this.e);
                    objFH.getClass();
                    this.e = objFH;
                    this.d = false;
                }
            }
        }
        return this.e;
    }
}
