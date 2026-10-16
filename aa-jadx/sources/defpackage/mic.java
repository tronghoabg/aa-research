package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mic extends defpackage.ijv implements defpackage.mie {
    public mic(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.apps.auto.components.projectionstate.IProjectionStateOwner");
    }

    @Override // defpackage.mie
    public final boolean e() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(2, fp());
        boolean zJ = defpackage.ijx.j(parcelFq);
        parcelFq.recycle();
        return zJ;
    }
}
