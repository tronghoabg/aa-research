package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vfs extends defpackage.ijw implements defpackage.vft {
    final /* synthetic */ com.google.android.libraries.maps.MapsAppCheckTokenProvider a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vfs(com.google.android.libraries.maps.MapsAppCheckTokenProvider mapsAppCheckTokenProvider) {
        super("com.google.android.libraries.maps.internal.IMapsAppCheckTokenProvider");
        this.a = mapsAppCheckTokenProvider;
    }

    @Override // defpackage.vft
    public final void e(defpackage.vfq vfqVar) {
        this.a.fetchToken(new defpackage.vei(vfqVar));
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        defpackage.vfq vfoVar;
        if (i != 2) {
            return false;
        }
        android.os.IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            vfoVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.libraries.maps.internal.IMapsAppCheckTokenCallback");
            vfoVar = iInterfaceQueryLocalInterface instanceof defpackage.vfq ? (defpackage.vfq) iInterfaceQueryLocalInterface : new defpackage.vfo(strongBinder);
        }
        defpackage.ijx.d(parcel);
        e(vfoVar);
        parcel2.writeNoException();
        return true;
    }
}
