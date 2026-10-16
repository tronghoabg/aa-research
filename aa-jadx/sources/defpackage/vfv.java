package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vfv extends defpackage.ijw implements defpackage.vfw {
    public vfv() {
        super("com.google.android.libraries.maps.internal.IOnCameraChangeListener");
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        com.google.android.libraries.maps.model.CameraPosition cameraPosition = (com.google.android.libraries.maps.model.CameraPosition) defpackage.ijx.a(parcel, com.google.android.libraries.maps.model.CameraPosition.CREATOR);
        defpackage.ijx.d(parcel);
        a(cameraPosition);
        parcel2.writeNoException();
        return true;
    }
}
