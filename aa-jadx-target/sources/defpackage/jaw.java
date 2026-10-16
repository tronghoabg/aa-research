package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jaw extends defpackage.ijw implements android.os.IInterface {
    final /* synthetic */ defpackage.jah a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jaw(defpackage.jah jahVar) {
        super("com.google.android.apps.auto.carservice.car.senderprotocol.IReader");
        this.a = jahVar;
    }

    public final defpackage.jav a() {
        defpackage.jah jahVar = this.a;
        java.lang.Object obj = jahVar.b;
        synchronized (obj) {
            jahVar.a = false;
            jahVar.interrupt();
            obj.notify();
        }
        defpackage.jah jahVar2 = this.a;
        defpackage.yqk yqkVar = defpackage.jbw.a;
        return new defpackage.jau(jahVar2);
    }

    public final void b(jas jasVar) {
        this.a.d = jasVar;
    }

    public final boolean c(defpackage.jav javVar) {
        defpackage.jah jahVar = this.a;
        java.lang.Object obj = jahVar.b;
        synchronized (obj) {
            if (jahVar.c != null) {
                throw new java.lang.IllegalStateException("Setting channel while already set");
            }
            if (!jahVar.a) {
                return false;
            }
            jahVar.c = (java.nio.channels.WritableByteChannel) defpackage.jau.a(javVar);
            obj.notify();
            return true;
        }
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        jas jatVar = null;
        if (i == 1) {
            android.os.IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                jas jasVarQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.auto.carservice.car.senderprotocol.IObjectWrapper");
                jatVar = jasVarQueryLocalInterface instanceof defpackage.jav ? (defpackage.jav) jasVarQueryLocalInterface : new jat(strongBinder);
            }
            defpackage.ijx.d(parcel);
            boolean zC = c(jatVar);
            parcel2.writeNoException();
            parcel2.writeInt(zC ? 1 : 0);
        } else if (i == 2) {
            defpackage.jah jahVar = this.a;
            synchronized (jahVar.b) {
                jahVar.c = null;
            }
            parcel2.writeNoException();
        } else if (i == 3) {
            defpackage.jav javVarA = a();
            parcel2.writeNoException();
            defpackage.ijx.i(parcel2, javVarA);
        } else if (i == 4) {
            android.os.IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                android.os.IInterface iInterfaceQueryLocalInterface = strongBinder2.queryLocalInterface("com.google.android.apps.auto.carservice.car.senderprotocol.IObjectWrapper");
                if (iInterfaceQueryLocalInterface instanceof defpackage.jav) {
                }
            }
            defpackage.ijx.d(parcel);
            parcel2.writeNoException();
        } else {
            if (i != 5) {
                return false;
            }
            android.os.IBinder strongBinder3 = parcel.readStrongBinder();
            if (strongBinder3 != null) {
                jas jasVarQueryLocalInterface2 = strongBinder3.queryLocalInterface("com.google.android.apps.auto.carservice.car.senderprotocol.ICarGalMonitorProxy");
                jatVar = jasVarQueryLocalInterface2 instanceof jas ? jasVarQueryLocalInterface2 : new jaq(strongBinder3);
            }
            defpackage.ijx.d(parcel);
            b(jatVar);
            parcel2.writeNoException();
        }
        return true;
    }
}
