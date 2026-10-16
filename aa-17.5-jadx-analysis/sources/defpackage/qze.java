package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.KeyEvent;
import com.google.android.gms.car.CarWindowLayoutParams;
import com.google.android.gms.car.CarWindowSpec;
import com.google.android.gms.car.animation.ProjectionWindowAnimationParams;
import com.google.android.gms.car.display.CarRegionId;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class qze extends ijo implements qzf {
    public final Object a;
    public volatile imv b;
    public final List c;
    private final WeakReference d;
    private final jew e;

    public qze(ina inaVar, jew jewVar) {
        super("com.google.android.gms.car.ICarWindowManager");
        this.a = new Object();
        this.c = new ArrayList();
        this.d = new WeakReference(inaVar);
        this.e = jewVar;
    }

    public final void a(qwh qwhVar) {
        this.e.ao();
        ((ype) ((ype) ina.a.f()).ai((char) 451)).u("FRAME DEBUG disabled!");
        synchronized (this.a) {
            this.b.getClass();
            woy.aa(((ijn) this.b.a).asBinder().equals(qwhVar.asBinder()), "Some other client is using the frame debug callback.");
            qwhVar.asBinder().unlinkToDeath(this.b, 0);
            this.b = null;
        }
        ina inaVar = (ina) this.d.get();
        if (inaVar != null) {
            inaVar.ad();
        }
    }

    @Override // defpackage.qzf
    public final int e() {
        jkk jkkVar = (jkk) this.d.get();
        if (jkkVar != null) {
            return jkkVar.d();
        }
        return 0;
    }

    @Override // defpackage.qzf
    public final Point f() {
        jkk jkkVar = (jkk) this.d.get();
        if (jkkVar != null) {
            return jkkVar.h();
        }
        return null;
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        qyw qyuVar = null;
        qwo qwmVar = null;
        qwo qwmVar2 = null;
        qwh qwhVar = null;
        qwh qwhVar2 = null;
        qzc qzaVar = null;
        qzc qzaVar2 = null;
        qyw qyuVar2 = null;
        switch (i) {
            case 1:
                boolean zP = p();
                parcel2.writeNoException();
                ClassLoader classLoader = ijp.a;
                parcel2.writeInt(zP ? 1 : 0);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarVideoFocusListener");
                    qyuVar = iInterfaceQueryLocalInterface instanceof qyw ? (qyw) iInterfaceQueryLocalInterface : new qyu(strongBinder);
                }
                ijp.d(parcel);
                h(qyuVar);
                parcel2.writeNoException();
                return true;
            case 3:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.car.ICarVideoFocusListener");
                    qyuVar2 = iInterfaceQueryLocalInterface2 instanceof qyw ? (qyw) iInterfaceQueryLocalInterface2 : new qyu(strongBinder2);
                }
                ijp.d(parcel);
                k(qyuVar2);
                parcel2.writeNoException();
                return true;
            case 4:
                int i2 = parcel.readInt();
                ijp.d(parcel);
                ina inaVar = (ina) this.d.get();
                if (inaVar != null) {
                    inaVar.x.e(i2);
                }
                parcel2.writeNoException();
                return true;
            case 5:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.car.ICarInputCallback");
                    if (iInterfaceQueryLocalInterface3 instanceof qwp) {
                    }
                }
                ijp.d(parcel);
                throw new UnsupportedOperationException();
            case 6:
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.car.ICarInputCallback");
                    if (iInterfaceQueryLocalInterface4 instanceof qwp) {
                    }
                }
                ijp.d(parcel);
                throw new UnsupportedOperationException();
            case 7:
                l();
                parcel2.writeNoException();
                return true;
            case 8:
                String string = parcel.readString();
                String string2 = parcel.readString();
                CarWindowLayoutParams carWindowLayoutParams = (CarWindowLayoutParams) ijp.a(parcel, CarWindowLayoutParams.CREATOR);
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.car.ICarWindowCallback");
                    qzaVar2 = iInterfaceQueryLocalInterface5 instanceof qzc ? (qzc) iInterfaceQueryLocalInterface5 : new qza(strongBinder5);
                }
                ijp.d(parcel);
                qyz qyzVarG = g(new CarWindowSpec(string, string2, carWindowLayoutParams, 0), qzaVar2);
                parcel2.writeNoException();
                ijp.i(parcel2, qyzVarG);
                return true;
            case 9:
                Point pointF = f();
                parcel2.writeNoException();
                ijp.h(parcel2, pointF);
                return true;
            case 10:
                int iE = e();
                parcel2.writeNoException();
                parcel2.writeInt(iE);
                return true;
            case 11:
                CarWindowSpec carWindowSpec = (CarWindowSpec) ijp.a(parcel, CarWindowSpec.CREATOR);
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.car.ICarWindowCallback");
                    qzaVar = iInterfaceQueryLocalInterface6 instanceof qzc ? (qzc) iInterfaceQueryLocalInterface6 : new qza(strongBinder6);
                }
                ijp.d(parcel);
                qyz qyzVarG2 = g(carWindowSpec, qzaVar);
                parcel2.writeNoException();
                ijp.i(parcel2, qyzVarG2);
                return true;
            case 12:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.car.ICarFrameDebugCallback");
                    qwhVar2 = iInterfaceQueryLocalInterface7 instanceof qwh ? (qwh) iInterfaceQueryLocalInterface7 : new qwh(strongBinder7);
                }
                ijp.d(parcel);
                this.e.ao();
                ((ype) ((ype) ina.a.f()).ai((char) 446)).u("FRAME DEBUG enabled!");
                synchronized (this.a) {
                    woy.aa(this.b == null, "Some other client is using the frame debug callback.");
                    try {
                        imv imvVar = new imv(qwhVar2, this, 0);
                        qwhVar2.asBinder().linkToDeath(imvVar, 0);
                        this.b = imvVar;
                    } catch (RemoteException unused) {
                    }
                }
                ina inaVar2 = (ina) this.d.get();
                if (inaVar2 != null) {
                    inaVar2.ad();
                }
                parcel2.writeNoException();
                return true;
            case 13:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.car.ICarFrameDebugCallback");
                    qwhVar = iInterfaceQueryLocalInterface8 instanceof qwh ? (qwh) iInterfaceQueryLocalInterface8 : new qwh(strongBinder8);
                }
                ijp.d(parcel);
                a(qwhVar);
                parcel2.writeNoException();
                return true;
            case 14:
                int i3 = parcel.readInt();
                int i4 = parcel.readInt();
                ijp.d(parcel);
                m(i3, i4);
                parcel2.writeNoException();
                return true;
            case 15:
                CarRegionId carRegionId = (CarRegionId) ijp.a(parcel, CarRegionId.CREATOR);
                KeyEvent keyEvent = (KeyEvent) ijp.a(parcel, KeyEvent.CREATOR);
                ijp.d(parcel);
                i(carRegionId, keyEvent);
                parcel2.writeNoException();
                return true;
            case 16:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.car.ICarGestureListener");
                    qwmVar2 = iInterfaceQueryLocalInterface9 instanceof qwo ? (qwo) iInterfaceQueryLocalInterface9 : new qwm(strongBinder9);
                }
                ijp.d(parcel);
                j(qwmVar2);
                parcel2.writeNoException();
                return true;
            case 17:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.car.ICarGestureListener");
                    qwmVar = iInterfaceQueryLocalInterface10 instanceof qwo ? (qwo) iInterfaceQueryLocalInterface10 : new qwm(strongBinder10);
                }
                ijp.d(parcel);
                o(qwmVar);
                parcel2.writeNoException();
                return true;
            case 18:
                int i5 = parcel.readInt();
                int i6 = parcel.readInt();
                ijp.d(parcel);
                n(i5, i6);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.qzf
    public final qyz g(CarWindowSpec carWindowSpec, qzc qzcVar) throws RemoteException {
        jgy jgyVar;
        try {
            ina inaVar = (ina) this.d.get();
            if (inaVar != null) {
                String str = carWindowSpec.a;
                String str2 = carWindowSpec.b;
                CarWindowLayoutParams carWindowLayoutParams = carWindowSpec.c;
                int i = carWindowSpec.d;
                ((ype) ina.a.l().ai((char) 483)).y("createCarWindow %s", str);
                synchronized (inaVar.ab) {
                    try {
                        try {
                            jgyVar = new jgy(str, str2, carWindowLayoutParams, inaVar, qzcVar, i, inaVar.m, inaVar.ag, inaVar.as, inaVar.i);
                            CarWindowLayoutParams carWindowLayoutParams2 = jgyVar.g;
                            if (carWindowLayoutParams2.j.a > 0 || carWindowLayoutParams2.k.a > 0) {
                                Context contextU = jgyVar.u(jgyVar.c);
                                if (contextU == null) {
                                    throw new IllegalArgumentException("Failed to init window");
                                }
                                ProjectionWindowAnimationParams projectionWindowAnimationParams = jgyVar.g.j;
                                if (projectionWindowAnimationParams.a > 0) {
                                    jgyVar.j = ((ina) jgyVar.d).Y.b(contextU, projectionWindowAnimationParams, jgyVar.t(), jgyVar.s());
                                }
                                ProjectionWindowAnimationParams projectionWindowAnimationParams2 = jgyVar.g.k;
                                if (projectionWindowAnimationParams2.a > 0) {
                                    jgyVar.k = ((ina) jgyVar.d).Y.b(contextU, projectionWindowAnimationParams2, jgyVar.t(), jgyVar.s());
                                }
                            }
                            inaVar.ac.add(jgyVar);
                            jhc jhcVar = inaVar.w;
                            ims imsVar = inaVar.s;
                            if (imsVar != null && jhcVar != null) {
                                boolean zR = acvt.a.gu().r();
                                if (!zR || jgyVar.h == null) {
                                    jgyVar.r(jhcVar);
                                    if (!zR) {
                                        ((ype) ina.a.l().ai(484)).y("createCarWindow initializing %s", jgyVar);
                                        imsVar.g(jgyVar.h);
                                    }
                                } else {
                                    ((ype) ((ype) ina.a.f()).ai(486)).y("Window for %s already created, skipping", jgyVar);
                                }
                                if (jgyVar.q()) {
                                    ((ype) ina.a.l().ai(484)).y("createCarWindow initializing %s", jgyVar);
                                    imsVar.g(jgyVar.h);
                                } else {
                                    ((ype) ((ype) ina.a.f()).ai(485)).y("Window for %s already initialized, skipping", jgyVar);
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    } catch (RemoteException e) {
                        ((ype) ((ype) ((ype) ina.a.g()).p(e)).ai(487)).u("Error creating CarWindow: RemoteException");
                        return null;
                    }
                }
                return jgyVar.u;
            }
        } catch (Exception e2) {
            ((ype) ((ype) ((ype) ina.a.g()).p(e2)).ai((char) 445)).u("createCarWindow exception");
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, qyw] */
    @Override // defpackage.qzf
    public final void h(qyw qywVar) {
        synchronized (this.a) {
            List list = this.c;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((imv) it.next()).a.asBinder().equals(qywVar.asBinder())) {
                    return;
                }
            }
            try {
                list.add(new imv(qywVar, this, 1));
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.qzf
    public final void i(CarRegionId carRegionId, KeyEvent keyEvent) {
        jhf jhfVarK;
        ina inaVar = (ina) this.d.get();
        if (inaVar == null || (jhfVarK = inaVar.k(carRegionId, false)) == null) {
            return;
        }
        jhfVarK.M(keyEvent);
    }

    @Override // defpackage.qzf
    public final void j(qwo qwoVar) {
        ina inaVar = (ina) this.d.get();
        if (inaVar == null) {
            return;
        }
        inaVar.am.c(qwoVar);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, qyw] */
    @Override // defpackage.qzf
    public final void k(qyw qywVar) {
        imv imvVar;
        synchronized (this.a) {
            List list = this.c;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    imvVar = null;
                    break;
                } else {
                    imvVar = (imv) it.next();
                    if (imvVar.a.asBinder().equals(qywVar.asBinder())) {
                        break;
                    }
                }
            }
            if (imvVar != null) {
                qywVar.asBinder().unlinkToDeath(imvVar, 0);
                list.remove(imvVar);
            }
        }
    }

    @Override // defpackage.qzf
    public final void l() {
        jkk jkkVar;
        if (p() || (jkkVar = (jkk) this.d.get()) == null) {
            return;
        }
        jkkVar.U();
    }

    @Override // defpackage.qzf
    public final void m(int i, int i2) {
        yph yphVar = ina.a;
        ((ype) ((ype) yphVar.f()).ai(447)).B("setBackgroundColors darkBackgroundColor: %08X lightBackgroundColor: %08X", i, i2);
        ina inaVar = (ina) this.d.get();
        if (inaVar == null) {
            ((ype) ((ype) yphVar.h()).ai((char) 448)).u("ProjectionWindowManager was null when setting background colors");
            return;
        }
        ((ype) ((ype) yphVar.f()).ai((char) 449)).u("ProjectionWindowManager available, setting background colors.");
        ((ype) ((ype) yphVar.f()).ai(493)).B("Immediately updating background colors to %08X and %08X", i, i2);
        inaVar.F = new tkn(i, i2);
        new sss(Looper.getMainLooper()).post(new ne(inaVar, 18, null));
    }

    @Override // defpackage.qzf
    public final void n(int i, int i2) {
        ina inaVar = (ina) this.d.get();
        if (inaVar == null) {
            ((ype) ((ype) ina.a.h()).ai((char) 450)).u("ProjectionWindowManager was null when setting border colors");
        } else {
            ((ype) ((ype) ina.a.f()).ai(575)).B("Update border colors to dark theme %08X and light theme %08X", i, i2);
            inaVar.ae = new tkn(i, i2);
        }
    }

    @Override // defpackage.qzf
    public final void o(qwo qwoVar) {
        ina inaVar = (ina) this.d.get();
        if (inaVar == null) {
            return;
        }
        inaVar.am.d(qwoVar);
    }

    @Override // defpackage.qzf
    public final boolean p() {
        jkk jkkVar = (jkk) this.d.get();
        return jkkVar != null && jkkVar.ae();
    }
}
