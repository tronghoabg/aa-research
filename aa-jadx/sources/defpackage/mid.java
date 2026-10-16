package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mid extends defpackage.ijw implements defpackage.mie {
    final /* synthetic */ defpackage.mij a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mid(defpackage.mij mijVar) {
        super("com.google.android.apps.auto.components.projectionstate.IProjectionStateOwner");
        this.a = mijVar;
    }

    @Override // defpackage.mie
    public final boolean e() {
        return this.a.e;
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        if (i != 2) {
            return false;
        }
        boolean zE = e();
        parcel2.writeNoException();
        java.lang.ClassLoader classLoader = defpackage.ijx.a;
        parcel2.writeInt(zE ? 1 : 0);
        return true;
    }
}
