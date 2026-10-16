package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cxo {
    public static final defpackage.dlo a = new defpackage.dlp(1.0f, 1.0f);

    public static final defpackage.cyu a(defpackage.cxl cxlVar) {
        defpackage.cyu cyuVar = cxlVar.k;
        if (cyuVar != null) {
            return cyuVar;
        }
        defpackage.csc.a("LayoutNode should be attached to an owner");
        throw new defpackage.afap();
    }
}
