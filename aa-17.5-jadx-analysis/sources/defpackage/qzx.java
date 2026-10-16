package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class qzx extends ijo implements qzy {
    final /* synthetic */ mtv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qzx(mtv mtvVar) {
        super("com.google.android.gms.car.IProjectionWindowDragCallback");
        this.a = mtvVar;
    }

    @Override // defpackage.qzy
    public final void e(int i) {
        szp.u(new hhx(this.a, i, 13));
    }

    @Override // defpackage.qzy
    public final void f(int i) {
        szp.u(new kze(i, 3));
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i == 1) {
            int i2 = parcel.readInt();
            ijp.d(parcel);
            e(i2);
        } else if (i == 2) {
            g();
        } else {
            if (i != 3) {
                return false;
            }
            int i3 = parcel.readInt();
            ijp.d(parcel);
            f(i3);
        }
        return true;
    }

    @Override // defpackage.qzy
    public final void g() {
        szp.u(new mhr(this.a, 14));
    }
}
