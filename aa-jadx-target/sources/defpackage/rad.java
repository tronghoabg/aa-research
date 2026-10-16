package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rad extends defpackage.ijw implements defpackage.rae {
    public final /* synthetic */ defpackage.imi a;
    private final java.util.concurrent.atomic.AtomicInteger b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rad(defpackage.imi imiVar) {
        super("com.google.android.gms.car.IConnectionController");
        this.a = imiVar;
        this.b = new java.util.concurrent.atomic.AtomicInteger(1);
    }

    @Override // defpackage.rae
    public final void e() {
        defpackage.rbz.k(new defpackage.img(0));
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        boolean z;
        int i2 = 4;
        int i3 = 11;
        defpackage.ral rajVar = null;
        switch (i) {
            case 1:
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.IFdBinder");
                    if (iInterfaceQueryLocalInterface instanceof defpackage.ral) {
                    }
                }
                android.os.IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.car.IFdBinder");
                    if (iInterfaceQueryLocalInterface2 instanceof defpackage.ral) {
                    }
                }
                android.os.IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.car.IFdBinder");
                    if (iInterfaceQueryLocalInterface3 instanceof defpackage.ral) {
                    }
                }
                parcel.readInt();
                java.lang.ClassLoader classLoader = defpackage.ijx.a;
                parcel.readInt();
                parcel.readInt();
                defpackage.ijx.d(parcel);
                throw new java.lang.UnsupportedOperationException("ConnectionControllerService.startConnection is deprecated.");
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                e();
                parcel2.writeNoException();
                return true;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                int i4 = parcel.readInt();
                defpackage.ijx.d(parcel);
                if (xiw.b(i4) != null) {
                    this.a.et(xiw.b(i4));
                }
                parcel2.writeNoException();
                return true;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                int i5 = this.a.G.D;
                parcel2.writeNoException();
                parcel2.writeInt(i5);
                return true;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                android.content.ComponentName componentName = (android.content.ComponentName) defpackage.ijx.a(parcel, android.content.ComponentName.CREATOR);
                defpackage.ijx.d(parcel);
                this.a.L = componentName;
                parcel2.writeNoException();
                return true;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                java.lang.String[] strArrCreateStringArray = parcel.createStringArray();
                defpackage.ijx.d(parcel);
                long jClearCallingIdentity = android.os.Binder.clearCallingIdentity();
                if (strArrCreateStringArray != null && strArrCreateStringArray.length != 0) {
                    try {
                        new java.io.PrintWriter(new java.io.FileOutputStream("/dev/null")).close();
                    } catch (java.io.IOException e) {
                        ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.imi.b.g()).p(e)).ai((char) 322)).u("handleAdbCommand failed");
                    }
                    break;
                }
                android.os.Binder.restoreCallingIdentity(jClearCallingIdentity);
                parcel2.writeNoException();
                return true;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                android.content.ComponentName componentName2 = (android.content.ComponentName) defpackage.ijx.a(parcel, android.content.ComponentName.CREATOR);
                int i6 = parcel.readInt();
                defpackage.ijx.d(parcel);
                defpackage.ill.e();
                if (i6 == 0) {
                    i2 = 1;
                } else if (i6 != 1) {
                    if (i6 == 2) {
                        i2 = 6;
                    } else {
                        if (i6 != 3) {
                            throw new java.lang.IllegalArgumentException(defpackage.a.bo(i6, "Bad constant "));
                        }
                        i2 = 2;
                    }
                }
                defpackage.imi imiVar = this.a;
                imiVar.ak();
                imiVar.bz(new android.content.Intent().setComponent(componentName2), null, i2, false);
                parcel2.writeNoException();
                return true;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                android.content.ComponentName componentName3 = (android.content.ComponentName) defpackage.ijx.a(parcel, android.content.ComponentName.CREATOR);
                defpackage.ijx.d(parcel);
                defpackage.imi imiVar2 = this.a;
                java.lang.String packageName = componentName3.getPackageName();
                java.lang.String className = componentName3.getClassName();
                defpackage.ill.e();
                imiVar2.aj();
                imiVar2.o.post(new ae(imiVar2, packageName, className, 17, (byte[]) null));
                parcel2.writeNoException();
                return true;
            case 9:
                android.content.ComponentName componentName4 = (android.content.ComponentName) defpackage.ijx.a(parcel, android.content.ComponentName.CREATOR);
                defpackage.ijx.d(parcel);
                this.a.M = componentName4;
                ((defpackage.yqj) defpackage.imi.b.l().ai(382)).y("Setting appkey override for component %s", componentName4);
                parcel2.writeNoException();
                return true;
            case 10:
                long j = parcel.readLong();
                java.lang.ClassLoader classLoader2 = defpackage.ijx.a;
                z = parcel.readInt() != 0;
                byte[] bArrCreateByteArray = parcel.createByteArray();
                defpackage.ijx.d(parcel);
                defpackage.imi imiVar3 = this.a;
                j$.util.Optional optionalX = imiVar3.X();
                if (optionalX.isEmpty()) {
                    ((defpackage.yqj) ((defpackage.yqj) defpackage.imi.b.h()).ai((char) 381)).u("Tried to send Ping request with no car connection");
                } else {
                    defpackage.jbw jbwVar = ((defpackage.iuk) optionalX.get()).s;
                    if (jbwVar == null) {
                        ((defpackage.yqj) ((defpackage.yqj) defpackage.imi.b.h()).ai((char) 380)).u("Tried to send Ping request to null controller");
                    } else if (!imiVar3.br()) {
                        ((defpackage.yqj) ((defpackage.yqj) defpackage.imi.b.h()).ai((char) 379)).u("Not connected to car");
                    } else if (bArrCreateByteArray == null) {
                        jbwVar.d.g.d(j, z);
                    } else {
                        defpackage.izs izsVar = jbwVar.d;
                        defpackage.abor aborVarN = defpackage.xni.a.n();
                        aborVarN.t();
                        defpackage.xni xniVar = (defpackage.xni) aborVarN.b;
                        xniVar.b |= 1;
                        xniVar.c = j;
                        aborVarN.t();
                        defpackage.xni xniVar2 = (defpackage.xni) aborVarN.b;
                        xniVar2.b = 2 | xniVar2.b;
                        xniVar2.d = z;
                        defpackage.abnv abnvVarV = defpackage.abnv.v(bArrCreateByteArray);
                        aborVarN.t();
                        defpackage.xni xniVar3 = (defpackage.xni) aborVarN.b;
                        abnvVarV.getClass();
                        xniVar3.b = 4 | xniVar3.b;
                        xniVar3.e = abnvVarV;
                        izsVar.g.k(11, (defpackage.xni) aborVarN.q());
                    }
                }
                parcel2.writeNoException();
                return true;
            case 11:
                android.os.IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.car.IFdBinder");
                    rajVar = iInterfaceQueryLocalInterface4 instanceof defpackage.ral ? (defpackage.ral) iInterfaceQueryLocalInterface4 : new defpackage.raj(strongBinder4);
                }
                android.os.IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.car.IFdBinder");
                    if (iInterfaceQueryLocalInterface5 instanceof defpackage.ral) {
                    }
                }
                int i7 = parcel.readInt();
                java.lang.ClassLoader classLoader3 = defpackage.ijx.a;
                boolean z2 = parcel.readInt() != 0;
                z = parcel.readInt() != 0;
                defpackage.ijx.d(parcel);
                f(rajVar, i7, z2, z);
                parcel2.writeNoException();
                return true;
            case 12:
                int i8 = parcel.readInt();
                defpackage.ijx.d(parcel);
                if (xiw.b(i8) == null) {
                    throw new java.lang.IllegalArgumentException(defpackage.a.bo(i8, "Invalid ByeBye reason: "));
                }
                defpackage.imi imiVar4 = this.a;
                xiw xiwVarB = xiw.b(i8);
                imiVar4.ao();
                ((defpackage.yqj) defpackage.imi.b.l().ai((char) 363)).y("PCTS sent ByeBye request with reason %s", xiwVarB.name());
                imiVar4.o.post(new defpackage.hie(imiVar4, (java.lang.Object) xiwVarB, i3));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.rae
    public final void f(defpackage.ral ralVar, int i, boolean z, boolean z2) {
        ((defpackage.yqj) defpackage.imi.b.l().ai((char) 295)).u("startDuplexConnection");
        int andIncrement = this.b.getAndIncrement();
        android.content.Intent flags = new android.content.Intent().setAction("com.google.android.gms.carsetup.START_DUPLEX").putExtra("connection_fd", new com.google.android.gms.carsetup.BinderParcel(ralVar.asBinder())).putExtra("connection_type", i).putExtra("start_activities", z).putExtra("connection_tag", andIncrement).putExtra("suppress_restart", z2).setFlags(268435456);
        defpackage.imi imiVar = this.a;
        imiVar.m.b(flags);
        java.lang.Object obj = imiVar.q;
        synchronized (obj) {
            if (imiVar.r != -1) {
                throw new java.lang.IllegalStateException("Already connected");
            }
            flags.setComponent((android.content.ComponentName) defpackage.iuf.c.fF());
            imiVar.k.startActivity(flags);
            if (java.lang.Thread.currentThread() != android.os.Looper.getMainLooper().getThread()) {
                while (imiVar.r == -1 && andIncrement >= 0) {
                    try {
                        obj.wait();
                    } catch (java.lang.InterruptedException unused) {
                    }
                }
                if (this.a.r != andIncrement && andIncrement >= 0) {
                    throw new java.lang.IllegalStateException("Already connected");
                }
            }
        }
    }
}
