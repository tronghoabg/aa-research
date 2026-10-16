package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Build;
import android.os.HandlerThread;
import android.os.IInterface;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.car.InputFocusChangedEvent;
import com.google.android.gms.carsetup.CarInfoInternal;
import com.google.android.gms.carsetup.FirstActivityImpl;
import com.google.android.gms.carsetup.setup.UsbConnectionHelper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.projection.gearhead.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class jpx implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ jpx(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v100, types: [java.lang.Object, svu] */
    /* JADX WARN: Type inference failed for: r0v105, types: [java.lang.Object, svv] */
    /* JADX WARN: Type inference failed for: r0v76, types: [android.os.IBinder, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v96, types: [java.lang.Object, svs] */
    /* JADX WARN: Type inference failed for: r11v100, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.lang.Object, qup] */
    /* JADX WARN: Type inference failed for: r11v18, types: [java.lang.Object, rwy] */
    /* JADX WARN: Type inference failed for: r11v64, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object, svr, svu, svv] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, rwy] */
    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        rwv rwtVar = null;
        switch (this.c) {
            case 0:
                Object obj = this.a;
                boolean zN = ((jpw) obj).n();
                ?? r11 = this.b;
                if (zN) {
                    ((ype) ((ype) jqa.a.f()).ai((char) 2588)).u("Tearing down; skipping registration of CarConnectionListener to delegate.");
                    return;
                }
                try {
                    r11.aM(((jqa) obj).h);
                    return;
                } catch (RemoteException e) {
                    ((ype) ((ype) ((ype) jqa.a.g()).p(e)).ai((char) 2587)).u("Failed to register CarConnectionListener to delegate.");
                    throw new IllegalStateException(e);
                }
            case 1:
                if (((joi) this.a).v) {
                    try {
                        ?? r1 = this.b;
                        int i = yfq.d;
                        r1.h(false, yls.a, 0, 0, xob.a.h());
                        return;
                    } catch (RemoteException e2) {
                        ((ype) ((ype) ((ype) jou.a.h()).p(e2)).ai((char) 2509)).u("RemoteException in ::resumeServices");
                        return;
                    }
                }
                Object obj2 = this.a;
                ?? r112 = this.b;
                joi joiVar = (joi) obj2;
                joiVar.c();
                joiVar.d();
                List<rwy> list = joiVar.g;
                if (list.contains(r112)) {
                    throw new IllegalArgumentException();
                }
                if (!joiVar.n(r112)) {
                    joiVar.b();
                    return;
                }
                xob xobVar = joiVar.s;
                for (rwy rwyVar : list) {
                    try {
                        ArrayList arrayList = new ArrayList();
                        Iterator<E> it = xobVar.c.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((xnz) it.next()).h());
                        }
                        rwyVar.h(true, arrayList, ((joi) obj2).p, ((joi) obj2).q, xobVar.h());
                    } catch (RemoteException e3) {
                        ((ype) ((ype) ((ype) joi.a.h()).p(e3)).ai((char) 2488)).u("RemoteException in ::resumeServices");
                        joiVar.b();
                        return;
                    }
                }
                return;
            case 2:
                ((obs) this.b).f((Context) this.a, kfp.b, R.string.battery_saver_warning, 1);
                return;
            case 3:
                Iterator<E> it2 = ygr.n(((mgn) this.b).a).iterator();
                while (it2.hasNext()) {
                    ((mgm) it2.next()).a((mgl) this.a);
                }
                return;
            case 4:
                ypf ypfVar = qrg.a;
                ypfVar.l().ai(7663).u("onEndPointReady on main thread");
                qrg qrgVar = (qrg) this.a;
                if (qrgVar.i) {
                    ypfVar.l().ai(7667).u("onEndPointReady exit early due onDisconnectedCalled");
                    return;
                }
                if (qrgVar.b != 0) {
                    ypfVar.l().ai(7666).w("onEndPointReady exit early due to initializationStatus!=STATUS_SUCCESS, initializationStatus=%d", qrgVar.b);
                    return;
                }
                qrgVar.g = (rsh) this.b;
                if (Build.VERSION.SDK_INT < 30) {
                    qrgVar.e.c(rgo.EVENT_ENDPOINT_READY);
                    return;
                }
                CarInfoInternal carInfoInternal = ((qso) qrgVar.p).j;
                Boolean boolValueOf = carInfoInternal != null ? Boolean.valueOf(carInfoInternal.p) : null;
                woy.aa(boolValueOf != null, "Car should be available at this point!");
                if (boolValueOf.booleanValue()) {
                    ypfVar.l().ai(7665).u("Car authorized; starting normal operation");
                    qrgVar.e.c(rgo.EVENT_ENDPOINT_READY);
                    return;
                } else {
                    ypfVar.l().ai(7664).u("Car not authorized; deferring until authorized");
                    qrgVar.e.c(rgo.EVENT_ENDPOINT_READY_WAIT_FOR_USER_AUTHORIZATION);
                    return;
                }
            case 5:
                qsr qsrVar = (qsr) ((wyd) this.a).a;
                qsrVar.i = true;
                qsrVar.h = (ruw) this.b;
                qsrVar.o();
                return;
            case 6:
                SparseArray sparseArray = rnw.a;
                rnw rnwVar = (rnw) this.b;
                Rect rect = rnwVar.v;
                rect.set((Rect) this.a);
                ror rorVar = rnwVar.k;
                if (rorVar != null) {
                    rorVar.B(rect);
                    return;
                } else {
                    boolean z = rrd.a;
                    rrd.d(2, "CAR.PROJECTION.CAHI", null, "Non-drawable insets updated before uiHost attached. Will apply to uiHost when attaching.", new Object[0]);
                    return;
                }
            case 7:
                SparseArray sparseArray2 = rnw.a;
                rnw rnwVar2 = (rnw) this.b;
                Rect rect2 = rnwVar2.u;
                rect2.set((Rect) this.a);
                ror rorVar2 = rnwVar2.k;
                if (rorVar2 != null) {
                    rorVar2.D(rect2);
                    return;
                } else {
                    boolean z2 = rrd.a;
                    rrd.d(2, "CAR.PROJECTION.CAHI", null, "System window insets updated before uiHost attached. Will apply to uiHost when attaching.", new Object[0]);
                    return;
                }
            case 8:
                Object obj3 = this.b;
                Object obj4 = this.a;
                if (rrd.e("CAR.CLIENT.WM.WIN", 2)) {
                    rrd.d(2, "CAR.CLIENT.WM.WIN", null, "%s onInputFocusChange(event:%s)", ((qzb) obj4).a(), obj3);
                }
                rzx rzxVar = (rzx) ((qzb) obj4).a.get();
                if (rzxVar != null) {
                    if (omc.c("CAR.CLIENT.WM.WIN", 3)) {
                        rrd.d(3, "CAR.CLIENT.WM.WIN", null, "%s onInputFocusChange(event:%s)", rzxVar.a, obj3);
                    }
                    ror rorVar3 = rzxVar.g;
                    if (rorVar3 != null) {
                        rorVar3.o((InputFocusChangedEvent) obj3);
                        return;
                    } else {
                        rrd.d(3, "CAR.CLIENT.WM.WIN", null, "%s onInputFocusChange(event:%s) presentation:null", rzxVar.a, obj3);
                        return;
                    }
                }
                return;
            case 9:
                if (((rzx) ((qzb) this.a).a.get()) != null) {
                    this.b.run();
                    return;
                } else {
                    if (omc.c("CAR.CLIENT.WM.WIN", 5)) {
                        rrd.d(5, "CAR.CLIENT.WM.WIN", null, "No reference to CarWindow, doing nothing", new Object[0]);
                        return;
                    }
                    return;
                }
            case 10:
                ((FirstActivityImpl) this.b).A((Intent) this.a);
                return;
            case 11:
                Object obj5 = this.b;
                Object obj6 = this.a;
                List list2 = UsbConnectionHelper.TrackedParcelFileDescriptor.a;
                dup.e((Context) obj6, (BroadcastReceiver) obj5, new IntentFilter("android.hardware.usb.action.USB_STATE"), UsbConnectionHelper.TrackedParcelFileDescriptor.g, 2);
                return;
            case 12:
                Object obj7 = this.b;
                Object obj8 = this.a;
                synchronized (UsbConnectionHelper.TrackedParcelFileDescriptor.d) {
                    ((Context) obj8).unregisterReceiver((BroadcastReceiver) obj7);
                    if (UsbConnectionHelper.TrackedParcelFileDescriptor.e == null && UsbConnectionHelper.TrackedParcelFileDescriptor.c.decrementAndGet() == 0) {
                        HandlerThread handlerThread = UsbConnectionHelper.TrackedParcelFileDescriptor.f;
                        if (handlerThread != null) {
                            handlerThread.quitSafely();
                        }
                        UsbConnectionHelper.TrackedParcelFileDescriptor.f = null;
                        UsbConnectionHelper.TrackedParcelFileDescriptor.g = null;
                    }
                }
                return;
            case 13:
                ?? r0 = this.a;
                if (r0 != 0) {
                    IInterface iInterfaceQueryLocalInterface = r0.queryLocalInterface("com.google.android.gms.car.startup.IStartup");
                    rwtVar = iInterfaceQueryLocalInterface instanceof rwv ? (rwv) iInterfaceQueryLocalInterface : new rwt(r0);
                }
                Object obj9 = this.b;
                ((sgs) obj9).f = rwtVar;
                try {
                    rwv rwvVar = ((sgs) obj9).f;
                    rwvVar.getClass();
                    rwvVar.h(((sgs) obj9).b, ((sgs) obj9).a);
                    return;
                } catch (RemoteException e4) {
                    sgx.a.g().p(e4).ai(8928).u("Should never get a RemoteException when resuming a connection.");
                    throw new RuntimeException(e4);
                }
            case 14:
                smg smgVar = (smg) this.b;
                sme smeVar = (sme) smgVar.e.k.get(smgVar.b);
                if (smeVar == null) {
                    return;
                }
                if (!((ConnectionResult) this.a).c()) {
                    smeVar.j((ConnectionResult) this.a, null);
                    return;
                }
                smgVar.d = true;
                skv skvVar = smgVar.a;
                if (skvVar.i()) {
                    smgVar.c();
                    return;
                }
                try {
                    skvVar.s(null, skvVar.m());
                    return;
                } catch (SecurityException e5) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e5);
                    ((smg) this.b).a.o("Failed to get service from broker.");
                    smeVar.j(new ConnectionResult(1, 10, null, null, null), null);
                    return;
                }
            case 15:
                try {
                    svz svzVar = (svz) ((svo) this.a).a.a((svz) this.b);
                    ?? r113 = this.a;
                    if (svzVar == 0) {
                        ((svo) r113).d(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    Executor executor = swd.b;
                    svzVar.l(executor, r113);
                    svzVar.k(executor, r113);
                    svzVar.h(executor, r113);
                    return;
                } catch (svx e6) {
                    boolean z3 = e6.getCause() instanceof Exception;
                    Object obj10 = this.a;
                    if (z3) {
                        ((svo) obj10).b.o((Exception) e6.getCause());
                        return;
                    } else {
                        ((svo) obj10).b.o(e6);
                        return;
                    }
                } catch (Exception e7) {
                    ((svo) this.a).b.o(e7);
                    return;
                }
            case 16:
                Object obj11 = this.a;
                synchronized (((svt) obj11).a) {
                    ((svt) obj11).b.a((svz) this.b);
                }
                return;
            case 17:
                Object obj12 = this.a;
                synchronized (((svt) obj12).a) {
                    ?? r02 = ((svt) obj12).b;
                    Exception excD = ((svz) this.b).d();
                    if (excD == null) {
                        throw new NullPointerException("null reference");
                    }
                    r02.d(excD);
                }
                return;
            case 18:
                Object obj13 = this.a;
                synchronized (((svt) obj13).a) {
                    ((svt) obj13).b.e(((svz) this.b).e());
                }
                return;
            case 19:
                int i2 = ((vli) this.a).a;
                if (i2 != 0) {
                    Process.setThreadPriority(i2);
                }
                this.b.run();
                return;
            default:
                ((vvc) this.b).c.g.a(6, ((vky) this.a).a);
                return;
        }
    }

    public /* synthetic */ jpx(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public jpx(Object obj, Object obj2, int i, char[] cArr) {
        this.c = i;
        this.b = obj2;
        this.a = obj;
    }

    public jpx(jnh jnhVar, rwy rwyVar, int i) {
        this.c = i;
        this.a = jnhVar;
        this.b = rwyVar;
    }

    public jpx(smg smgVar, ConnectionResult connectionResult, int i) {
        this.c = i;
        this.a = connectionResult;
        this.b = smgVar;
    }
}
