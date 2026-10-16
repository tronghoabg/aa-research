package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vfe extends defpackage.ijv implements defpackage.vfg {
    public vfe(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.maps.internal.IInfoWindowAdapter");
    }

    @Override // defpackage.vfg
    public final defpackage.srh e(com.google.android.libraries.maps.model.internal.IMarkerDelegate iMarkerDelegate) throws android.os.RemoteException {
        defpackage.srh srfVar;
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, iMarkerDelegate);
        android.os.Parcel parcelFq = fq(2, parcelFp);
        android.os.IBinder strongBinder = parcelFq.readStrongBinder();
        if (strongBinder == null) {
            srfVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            srfVar = iInterfaceQueryLocalInterface instanceof defpackage.srh ? (defpackage.srh) iInterfaceQueryLocalInterface : new defpackage.srf(strongBinder);
        }
        parcelFq.recycle();
        return srfVar;
    }

    @Override // defpackage.vfg
    public final defpackage.srh f(com.google.android.libraries.maps.model.internal.IMarkerDelegate iMarkerDelegate) throws android.os.RemoteException {
        defpackage.srh srfVar;
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, iMarkerDelegate);
        android.os.Parcel parcelFq = fq(1, parcelFp);
        android.os.IBinder strongBinder = parcelFq.readStrongBinder();
        if (strongBinder == null) {
            srfVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            srfVar = iInterfaceQueryLocalInterface instanceof defpackage.srh ? (defpackage.srh) iInterfaceQueryLocalInterface : new defpackage.srf(strongBinder);
        }
        parcelFq.recycle();
        return srfVar;
    }
}
