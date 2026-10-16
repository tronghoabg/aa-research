package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.nio.channels.WritableByteChannel;

/* loaded from: classes2.dex */
public final class rue extends ijo implements IInterface {
    final /* synthetic */ rtq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rue(rtq rtqVar) {
        super("com.google.android.gms.car.senderprotocol.IReader");
        this.a = rtqVar;
    }

    public final rud a() {
        rtq rtqVar = this.a;
        Object obj = rtqVar.b;
        synchronized (obj) {
            rtqVar.a = false;
            rtqVar.interrupt();
            obj.notify();
        }
        rtq rtqVar2 = this.a;
        ypf ypfVar = ruw.a;
        return new ruc(rtqVar2);
    }

    public final void b(rua ruaVar) {
        this.a.d = ruaVar;
    }

    public final void c() {
        rtq rtqVar = this.a;
        synchronized (rtqVar.b) {
            rtqVar.c = null;
        }
    }

    public final boolean d(rud rudVar) {
        rtq rtqVar = this.a;
        Object obj = rtqVar.b;
        synchronized (obj) {
            if (rtqVar.c != null) {
                throw new IllegalStateException("Setting channel while already set");
            }
            if (!rtqVar.a) {
                return false;
            }
            rtqVar.c = (WritableByteChannel) ruc.a(rudVar);
            obj.notify();
            return true;
        }
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        rud rubVar = null;
        rua rtyVar = null;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.senderprotocol.IObjectWrapper");
                rubVar = iInterfaceQueryLocalInterface instanceof rud ? (rud) iInterfaceQueryLocalInterface : new rub(strongBinder);
            }
            ijp.d(parcel);
            boolean zD = d(rubVar);
            parcel2.writeNoException();
            parcel2.writeInt(zD ? 1 : 0);
        } else if (i == 2) {
            c();
            parcel2.writeNoException();
        } else if (i == 3) {
            rud rudVarA = a();
            parcel2.writeNoException();
            ijp.i(parcel2, rudVarA);
        } else if (i == 4) {
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.car.senderprotocol.IObjectWrapper");
                if (iInterfaceQueryLocalInterface2 instanceof rud) {
                }
            }
            ijp.d(parcel);
            parcel2.writeNoException();
        } else {
            if (i != 5) {
                return false;
            }
            IBinder strongBinder3 = parcel.readStrongBinder();
            if (strongBinder3 != null) {
                IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.car.senderprotocol.ICarGalMonitorProxy");
                rtyVar = iInterfaceQueryLocalInterface3 instanceof rua ? (rua) iInterfaceQueryLocalInterface3 : new rty(strongBinder3);
            }
            ijp.d(parcel);
            b(rtyVar);
            parcel2.writeNoException();
        }
        return true;
    }
}
