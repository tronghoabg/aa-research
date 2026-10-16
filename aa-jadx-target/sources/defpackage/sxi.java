package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class sxi implements defpackage.snv {
    @Override // defpackage.snv
    public final void a(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
        defpackage.sxj sxjVar = new defpackage.sxj((defpackage.lhe) obj2);
        defpackage.sxt sxtVar = (defpackage.sxt) ((defpackage.sxy) obj).v();
        android.os.Parcel parcelFp = sxtVar.fp();
        java.lang.ClassLoader classLoader = defpackage.ijx.a;
        parcelFp.writeStrongBinder(sxjVar);
        sxtVar.fr(2, parcelFp);
    }
}
