package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.nio.channels.WritableByteChannel;

/* loaded from: classes.dex */
public final class jap extends ijo implements IInterface {
    final /* synthetic */ jaa a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jap(jaa jaaVar) {
        super("com.google.android.apps.auto.carservice.car.senderprotocol.IReader");
        this.a = jaaVar;
    }

    public final jao a() {
        jaa jaaVar = this.a;
        Object obj = jaaVar.b;
        synchronized (obj) {
            jaaVar.a = false;
            jaaVar.interrupt();
            obj.notify();
        }
        jaa jaaVar2 = this.a;
        ypf ypfVar = jbp.a;
        return new jan(jaaVar2);
    }

    public final void b(jal jalVar) {
        this.a.d = jalVar;
    }

    public final boolean c(jao jaoVar) {
        jaa jaaVar = this.a;
        Object obj = jaaVar.b;
        synchronized (obj) {
            if (jaaVar.c != null) {
                throw new IllegalStateException("Setting channel while already set");
            }
            if (!jaaVar.a) {
                return false;
            }
            jaaVar.c = (WritableByteChannel) jan.a(jaoVar);
            obj.notify();
            return true;
        }
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        jao jamVar = null;
        jal jajVar = null;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.auto.carservice.car.senderprotocol.IObjectWrapper");
                jamVar = iInterfaceQueryLocalInterface instanceof jao ? (jao) iInterfaceQueryLocalInterface : new jam(strongBinder);
            }
            ijp.d(parcel);
            boolean zC = c(jamVar);
            parcel2.writeNoException();
            parcel2.writeInt(zC ? 1 : 0);
        } else if (i == 2) {
            jaa jaaVar = this.a;
            synchronized (jaaVar.b) {
                jaaVar.c = null;
            }
            parcel2.writeNoException();
        } else if (i == 3) {
            jao jaoVarA = a();
            parcel2.writeNoException();
            ijp.i(parcel2, jaoVarA);
        } else if (i == 4) {
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.apps.auto.carservice.car.senderprotocol.IObjectWrapper");
                if (iInterfaceQueryLocalInterface2 instanceof jao) {
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
                IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.apps.auto.carservice.car.senderprotocol.ICarGalMonitorProxy");
                jajVar = iInterfaceQueryLocalInterface3 instanceof jal ? (jal) iInterfaceQueryLocalInterface3 : new jaj(strongBinder3);
            }
            ijp.d(parcel);
            b(jajVar);
            parcel2.writeNoException();
        }
        return true;
    }
}
