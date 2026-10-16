package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class vhu extends ijo implements IInterface {
    final /* synthetic */ zwz a;
    final /* synthetic */ zwl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vhu(zwz zwzVar, zwl zwlVar) {
        super("com.google.android.libraries.maps.internal.IOnRenderEventListener");
        this.a = zwzVar;
        this.b = zwlVar;
    }

    public final void a() {
        zrz.b().execute(new xab(this.a, this.b, 16));
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            a();
        }
        parcel2.writeNoException();
        return true;
    }
}
