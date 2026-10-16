package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class suj extends defpackage.ijv implements android.os.IInterface {
    public suj(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    public final void e(com.google.android.gms.location.internal.LocationReceiver locationReceiver, com.google.android.gms.location.LocationRequest locationRequest, snj snjVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, locationReceiver);
        defpackage.ijx.g(parcelFp, locationRequest);
        defpackage.ijx.i(parcelFp, snjVar);
        fr(88, parcelFp);
    }

    public final void f(com.google.android.gms.location.internal.LocationReceiver locationReceiver, snj snjVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, locationReceiver);
        defpackage.ijx.i(parcelFp, snjVar);
        fr(89, parcelFp);
    }

    public final void g(com.google.android.gms.location.internal.LocationRequestUpdateData locationRequestUpdateData) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, locationRequestUpdateData);
        fr(59, parcelFp);
    }
}
