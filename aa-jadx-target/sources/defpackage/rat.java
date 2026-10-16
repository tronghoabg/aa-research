package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rat extends defpackage.ijw implements defpackage.rau {
    final /* synthetic */ defpackage.muc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rat(defpackage.muc mucVar) {
        super("com.google.android.gms.car.IProjectionWindowDragCallback");
        this.a = mucVar;
    }

    @Override // defpackage.rau
    public final void e(int i) {
        defpackage.tna.i(new defpackage.hif(this.a, i, 14));
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        if (i == 1) {
            int i2 = parcel.readInt();
            defpackage.ijx.d(parcel);
            e(i2);
        } else if (i == 2) {
            g();
        } else {
            if (i != 3) {
                return false;
            }
            int i3 = parcel.readInt();
            defpackage.ijx.d(parcel);
            f(i3);
        }
        return true;
    }

    @Override // defpackage.rau
    public final void f(int i) {
        defpackage.tna.i(new kzj(i, 3));
    }

    @Override // defpackage.rau
    public final void g() {
        defpackage.tna.i(new defpackage.mta(this.a, 2));
    }
}
