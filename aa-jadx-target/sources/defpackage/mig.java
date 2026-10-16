package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mig extends defpackage.ijw implements defpackage.mih {
    public mig() {
        super("com.google.android.apps.auto.components.projectionstate.IProjectionStateService");
    }

    @Override // defpackage.mih
    public final void e(defpackage.mie mieVar) {
        com.google.android.apps.auto.components.projectionstate.ProjectionStateService.a = mieVar;
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        defpackage.mie micVar;
        if (i != 2) {
            return false;
        }
        android.os.IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            micVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.auto.components.projectionstate.IProjectionStateOwner");
            micVar = iInterfaceQueryLocalInterface instanceof defpackage.mie ? (defpackage.mie) iInterfaceQueryLocalInterface : new defpackage.mic(strongBinder);
        }
        defpackage.ijx.d(parcel);
        com.google.android.apps.auto.components.projectionstate.ProjectionStateService.a = micVar;
        return true;
    }
}
