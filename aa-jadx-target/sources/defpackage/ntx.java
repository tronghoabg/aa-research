package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class ntx extends android.telephony.TelephonyManager.CellInfoCallback {
    final /* synthetic */ defpackage.nua a;

    public ntx(defpackage.nua nuaVar) {
        this.a = nuaVar;
    }

    @Override // android.telephony.TelephonyManager.CellInfoCallback
    public final synchronized void onCellInfo(java.util.List list) {
        defpackage.nua nuaVar = this.a;
        if (nuaVar.n()) {
            nuaVar.a();
        }
    }
}
