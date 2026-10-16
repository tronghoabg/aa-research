package defpackage;

import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Set;

/* loaded from: classes2.dex */
public final class rjo extends ijo implements rjp {
    private final Set a;
    private final sss b;

    public rjo(byte[] bArr) {
        super("com.google.android.gms.car.display.integratedoverlay.IIntegratedOverlayStateCallbacks");
        this.a = new yy(0);
        this.b = new sss(Looper.getMainLooper());
    }

    public final synchronized void a() {
        this.a.clear();
    }

    public final synchronized void b(pxp pxpVar) {
        this.a.add(pxpVar);
    }

    public final synchronized void c(pxp pxpVar) {
        this.a.remove(pxpVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rjp
    public final void e(int i) {
        yx yxVar = new yx((yy) this.a);
        while (yxVar.hasNext()) {
            this.b.post(new rgm((pxp) yxVar.next(), i, 2, null));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rjp
    public final void f() {
        yx yxVar = new yx((yy) this.a);
        while (yxVar.hasNext()) {
            pxp pxpVar = (pxp) yxVar.next();
            sss sssVar = this.b;
            pxpVar.getClass();
            sssVar.post(new ral(pxpVar, 17));
        }
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i == 2) {
            int i2 = parcel.readInt();
            ijp.d(parcel);
            e(i2);
        } else {
            if (i != 3) {
                return false;
            }
            f();
        }
        parcel2.writeNoException();
        return true;
    }

    public rjo() {
        throw null;
    }
}
