package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kxj extends java.lang.Exception {
    public final defpackage.yxo a;

    public kxj(java.lang.String str, defpackage.yxo yxoVar, java.lang.Throwable th) {
        super("GH.Assistant.CarMsngr: ".concat(str), th);
        this.a = yxoVar;
    }

    public kxj(defpackage.yxo yxoVar) {
        super("GH.Assistant.CarMsngr: Message manager must be initialized for use.");
        this.a = yxoVar;
    }
}
