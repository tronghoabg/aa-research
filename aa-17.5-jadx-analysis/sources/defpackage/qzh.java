package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.carsetup.BinderParcel;
import j$.util.Optional;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class qzh extends ijo implements qzi {
    public final /* synthetic */ ima a;
    private final AtomicInteger b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qzh(ima imaVar) {
        super("com.google.android.gms.car.IConnectionController");
        this.a = imaVar;
        this.b = new AtomicInteger(1);
    }

    @Override // defpackage.qzi
    public final void e() {
        rbe.k(new ily(0));
    }

    @Override // defpackage.qzi
    public final void f(qzp qzpVar, int i, boolean z, boolean z2) {
        ((ype) ima.b.l().ai((char) 295)).u("startDuplexConnection");
        int andIncrement = this.b.getAndIncrement();
        Intent flags = new Intent().setAction("com.google.android.gms.carsetup.START_DUPLEX").putExtra("connection_fd", new BinderParcel(qzpVar.asBinder())).putExtra("connection_type", i).putExtra("start_activities", z).putExtra("connection_tag", andIncrement).putExtra("suppress_restart", z2).setFlags(268435456);
        ima imaVar = this.a;
        imaVar.m.b(flags);
        Object obj = imaVar.q;
        synchronized (obj) {
            if (imaVar.r != -1) {
                throw new IllegalStateException("Already connected");
            }
            flags.setComponent((ComponentName) itx.c.gu());
            imaVar.k.startActivity(flags);
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                while (imaVar.r == -1 && andIncrement >= 0) {
                    try {
                        obj.wait();
                    } catch (InterruptedException unused) {
                    }
                }
                if (this.a.r != andIncrement && andIncrement >= 0) {
                    throw new IllegalStateException("Already connected");
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        boolean z;
        int i2 = 4;
        int i3 = 11;
        qzp qznVar = null;
        Object[] objArr = 0;
        switch (i) {
            case 1:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.IFdBinder");
                    if (iInterfaceQueryLocalInterface instanceof qzp) {
                    }
                }
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.car.IFdBinder");
                    if (iInterfaceQueryLocalInterface2 instanceof qzp) {
                    }
                }
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.car.IFdBinder");
                    if (iInterfaceQueryLocalInterface3 instanceof qzp) {
                    }
                }
                parcel.readInt();
                ClassLoader classLoader = ijp.a;
                parcel.readInt();
                parcel.readInt();
                ijp.d(parcel);
                throw new UnsupportedOperationException("ConnectionControllerService.startConnection is deprecated.");
            case 2:
                e();
                parcel2.writeNoException();
                return true;
            case 3:
                int i4 = parcel.readInt();
                ijp.d(parcel);
                if (xhv.b(i4) != null) {
                    this.a.fl(xhv.b(i4));
                }
                parcel2.writeNoException();
                return true;
            case 4:
                int i5 = this.a.G.D;
                parcel2.writeNoException();
                parcel2.writeInt(i5);
                return true;
            case 5:
                ComponentName componentName = (ComponentName) ijp.a(parcel, ComponentName.CREATOR);
                ijp.d(parcel);
                this.a.L = componentName;
                parcel2.writeNoException();
                return true;
            case 6:
                String[] strArrCreateStringArray = parcel.createStringArray();
                ijp.d(parcel);
                long jClearCallingIdentity = Binder.clearCallingIdentity();
                if (strArrCreateStringArray != null && strArrCreateStringArray.length != 0) {
                    try {
                        new PrintWriter(new FileOutputStream("/dev/null")).close();
                    } catch (IOException e) {
                        ((ype) ((ype) ((ype) ima.b.g()).p(e)).ai((char) 322)).u("handleAdbCommand failed");
                    }
                }
                Binder.restoreCallingIdentity(jClearCallingIdentity);
                parcel2.writeNoException();
                return true;
            case 7:
                ComponentName componentName2 = (ComponentName) ijp.a(parcel, ComponentName.CREATOR);
                int i6 = parcel.readInt();
                ijp.d(parcel);
                ilb.e();
                if (i6 == 0) {
                    i2 = 1;
                } else if (i6 != 1) {
                    if (i6 == 2) {
                        i2 = 6;
                    } else {
                        if (i6 != 3) {
                            throw new IllegalArgumentException(a.bp(i6, "Bad constant "));
                        }
                        i2 = 2;
                    }
                }
                ima imaVar = this.a;
                imaVar.ak();
                imaVar.bz(new Intent().setComponent(componentName2), null, i2, false);
                parcel2.writeNoException();
                return true;
            case 8:
                ComponentName componentName3 = (ComponentName) ijp.a(parcel, ComponentName.CREATOR);
                ijp.d(parcel);
                ima imaVar2 = this.a;
                String packageName = componentName3.getPackageName();
                String className = componentName3.getClassName();
                ilb.e();
                imaVar2.aj();
                imaVar2.o.post(new ae((Object) imaVar2, (Object) packageName, (Object) className, 17, (byte[]) null));
                parcel2.writeNoException();
                return true;
            case 9:
                ComponentName componentName4 = (ComponentName) ijp.a(parcel, ComponentName.CREATOR);
                ijp.d(parcel);
                this.a.M = componentName4;
                ((ype) ima.b.l().ai(382)).y("Setting appkey override for component %s", componentName4);
                parcel2.writeNoException();
                return true;
            case 10:
                long j = parcel.readLong();
                ClassLoader classLoader2 = ijp.a;
                z = parcel.readInt() != 0;
                byte[] bArrCreateByteArray = parcel.createByteArray();
                ijp.d(parcel);
                ima imaVar3 = this.a;
                Optional optionalX = imaVar3.X();
                if (optionalX.isEmpty()) {
                    ((ype) ((ype) ima.b.h()).ai((char) 381)).u("Tried to send Ping request with no car connection");
                } else {
                    jbp jbpVar = ((iuc) optionalX.get()).s;
                    if (jbpVar == null) {
                        ((ype) ((ype) ima.b.h()).ai((char) 380)).u("Tried to send Ping request to null controller");
                    } else if (!imaVar3.br()) {
                        ((ype) ((ype) ima.b.h()).ai((char) 379)).u("Not connected to car");
                    } else if (bArrCreateByteArray == null) {
                        jbpVar.d.g.d(j, z);
                    } else {
                        izl izlVar = jbpVar.d;
                        abnp abnpVarN = xmh.a.n();
                        abnpVarN.t();
                        xmh xmhVar = (xmh) abnpVarN.b;
                        xmhVar.b |= 1;
                        xmhVar.c = j;
                        abnpVarN.t();
                        xmh xmhVar2 = (xmh) abnpVarN.b;
                        xmhVar2.b = 2 | xmhVar2.b;
                        xmhVar2.d = z;
                        abms abmsVarV = abms.v(bArrCreateByteArray);
                        abnpVarN.t();
                        xmh xmhVar3 = (xmh) abnpVarN.b;
                        abmsVarV.getClass();
                        xmhVar3.b = 4 | xmhVar3.b;
                        xmhVar3.e = abmsVarV;
                        izlVar.g.k(11, (xmh) abnpVarN.q());
                    }
                }
                parcel2.writeNoException();
                return true;
            case 11:
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.car.IFdBinder");
                    qznVar = iInterfaceQueryLocalInterface4 instanceof qzp ? (qzp) iInterfaceQueryLocalInterface4 : new qzn(strongBinder4);
                }
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.car.IFdBinder");
                    if (iInterfaceQueryLocalInterface5 instanceof qzp) {
                    }
                }
                int i7 = parcel.readInt();
                ClassLoader classLoader3 = ijp.a;
                boolean z2 = parcel.readInt() != 0;
                z = parcel.readInt() != 0;
                ijp.d(parcel);
                f(qznVar, i7, z2, z);
                parcel2.writeNoException();
                return true;
            case 12:
                int i8 = parcel.readInt();
                ijp.d(parcel);
                if (xhv.b(i8) == null) {
                    throw new IllegalArgumentException(a.bp(i8, "Invalid ByeBye reason: "));
                }
                ima imaVar4 = this.a;
                xhv xhvVarB = xhv.b(i8);
                imaVar4.ao();
                ((ype) ima.b.l().ai((char) 363)).y("PCTS sent ByeBye request with reason %s", xhvVarB.name());
                imaVar4.o.post(new hhw((Object) imaVar4, (Object) xhvVarB, i3, (char[]) (objArr == true ? 1 : 0)));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
