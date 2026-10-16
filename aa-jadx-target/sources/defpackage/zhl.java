package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class zhl extends zga.f implements java.lang.Runnable {
    private defpackage.zhs a;

    public zhl(defpackage.zhs zhsVar) {
        this.a = zhsVar;
    }

    @Override // defpackage.zga
    protected final void b() {
        this.a = null;
    }

    @Override // defpackage.zga
    protected final java.lang.String eW() {
        defpackage.zhs zhsVar = this.a;
        if (zhsVar != null) {
            return defpackage.a.bV(zhsVar, "delegate=[", "]");
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        defpackage.zhs zhsVar = this.a;
        if (zhsVar != null) {
            r(zhsVar);
        }
    }
}
