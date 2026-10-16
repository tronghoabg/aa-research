package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class ovm extends ijo implements ovn {
    private final nzj a;

    public ovm(nzj nzjVar) {
        super("com.google.android.apps.auto.sdk.IImeCallback");
        this.a = nzjVar;
    }

    @Override // defpackage.ovn
    public final void e() {
        nzj nzjVar = this.a;
        ((vag) nzjVar.a).b(new owf((owg) nzjVar.c, 0));
    }

    @Override // defpackage.ovn
    public final void f() {
        this.a.a();
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i == 1) {
            boolean zG = g();
            parcel2.writeNoException();
            ClassLoader classLoader = ijp.a;
            parcel2.writeInt(zG ? 1 : 0);
        } else if (i == 2) {
            e();
            parcel2.writeNoException();
        } else {
            if (i != 3) {
                return false;
            }
            f();
            parcel2.writeNoException();
        }
        return true;
    }

    @Override // defpackage.ovn
    public final boolean g() {
        return this.a.b();
    }
}
