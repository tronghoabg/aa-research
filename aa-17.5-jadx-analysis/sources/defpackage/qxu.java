package defpackage;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.gms.car.CarWindowManagerLayoutParams;
import com.google.android.gms.car.DrawingSpec;
import com.google.android.gms.car.InputFocusChangedEvent;
import com.google.android.gms.car.KillOptions;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.CarRegionId;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class qxu extends ijo implements qxv {
    private final WeakReference a;

    public qxu(rnw rnwVar) {
        super("com.google.android.gms.car.ICarProjection");
        this.a = new WeakReference(rnwVar);
    }

    private static String a() {
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        StringBuilder sb = new StringBuilder("***ANR Stack Traces***");
        for (Map.Entry<Thread, StackTraceElement[]> entry : allStackTraces.entrySet()) {
            sb.append(entry.getKey().toString());
            sb.append(":");
            if (entry.getValue().length == 0) {
                sb.append(" No non-native stack");
            } else {
                for (StackTraceElement stackTraceElement : entry.getValue()) {
                    sb.append("\n\t");
                    sb.append(stackTraceElement.toString());
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    private final void b(InputFocusChangedEvent inputFocusChangedEvent) {
        rbe.h(new rfc((rnw) this.a.get(), inputFocusChangedEvent, 18));
    }

    private static boolean c(rnw rnwVar) {
        return rnwVar == null || rnwVar.f == null;
    }

    @Override // defpackage.qxv
    public final void A() {
        rnw rnwVar = (rnw) this.a.get();
        if (c(rnwVar)) {
            return;
        }
        SparseArray sparseArray = rnw.a;
        ror rorVar = rnwVar.k;
        if (rorVar != null) {
            rorVar.k();
        }
    }

    @Override // defpackage.qxv
    public final void B(qxy qxyVar, qup qupVar) {
        rnw rnwVar = (rnw) this.a.get();
        if (c(rnwVar)) {
            return;
        }
        if (omc.c("CAR.PROJECTION.CAHI", 3)) {
            SparseArray sparseArray = rnw.a;
            rrd.d(3, "CAR.PROJECTION.CAHI", null, "Binder:%s.onSetup()", rnwVar.t);
        }
        SparseArray sparseArray2 = rnw.a;
        rnwVar.w.O(qupVar);
        IBinder.DeathRecipient deathRecipient = rnwVar.e;
        synchronized (deathRecipient) {
            rnwVar.i = qxyVar;
            try {
                qxyVar.asBinder().linkToDeath(deathRecipient, 0);
            } catch (RemoteException unused) {
                rnwVar.i = null;
                new sss(Looper.getMainLooper()).post(rnwVar.d);
                return;
            }
        }
        try {
            qxyVar.p(11);
        } catch (RemoteException unused2) {
            new sss(Looper.getMainLooper()).post(rnwVar.d);
        }
    }

    @Override // defpackage.qxv
    public final void e() {
        rnw rnwVar = (rnw) this.a.get();
        if (c(rnwVar)) {
            return;
        }
        rnwVar.getClass();
        rbe.h(new ral(rnwVar, 20));
    }

    @Override // defpackage.qxv
    @Deprecated
    public final void f() {
        rnw rnwVar = (rnw) this.a.get();
        if (c(rnwVar)) {
            return;
        }
        if (omc.c("CAR.PROJECTION.CAHI", 3)) {
            SparseArray sparseArray = rnw.a;
            rrd.d(3, "CAR.PROJECTION.CAHI", null, "Binder:%s.killDeprecated()", rnwVar.t);
        }
        rrd.d(6, "CAR.PROJECTION.CAHI", null, "%s", a());
        SparseArray sparseArray2 = rnw.a;
        if (rnwVar.z) {
            Process.killProcess(Process.myPid());
            System.exit(10);
        }
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        qxy qxwVar;
        boolean z;
        qxy qxwVar2;
        qxy qxwVar3;
        int i2 = 3;
        qup qunVar = null;
        switch (i) {
            case 1:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    qxwVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarProjectionCallback");
                    qxwVar = iInterfaceQueryLocalInterface instanceof qxy ? (qxy) iInterfaceQueryLocalInterface : new qxw(strongBinder);
                }
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.car.ICar");
                    qunVar = iInterfaceQueryLocalInterface2 instanceof qup ? (qup) iInterfaceQueryLocalInterface2 : new qun(strongBinder2);
                }
                ijp.d(parcel);
                B(qxwVar, qunVar);
                return true;
            case 2:
                int i3 = parcel.readInt();
                DrawingSpec drawingSpec = (DrawingSpec) ijp.a(parcel, DrawingSpec.CREATOR);
                Intent intent = (Intent) ijp.a(parcel, Intent.CREATOR);
                Bundle bundle = (Bundle) ijp.a(parcel, Bundle.CREATOR);
                ijp.d(parcel);
                s(i3, drawingSpec, intent, bundle);
                return true;
            case 3:
                Intent intent2 = (Intent) ijp.a(parcel, Intent.CREATOR);
                ijp.d(parcel);
                m(intent2);
                return true;
            case 4:
                int i4 = parcel.readInt();
                ijp.d(parcel);
                q(i4);
                return true;
            case 5:
                int i5 = parcel.readInt();
                ijp.d(parcel);
                p(i5);
                return true;
            case 6:
                int i6 = parcel.readInt();
                int i7 = parcel.readInt();
                DrawingSpec drawingSpec2 = (DrawingSpec) ijp.a(parcel, DrawingSpec.CREATOR);
                Configuration configuration = (Configuration) ijp.a(parcel, Configuration.CREATOR);
                ijp.d(parcel);
                x(i6, i7, drawingSpec2, configuration);
                return true;
            case 7:
                int i8 = parcel.readInt();
                MotionEvent motionEvent = (MotionEvent) ijp.a(parcel, MotionEvent.CREATOR);
                ijp.d(parcel);
                l(i8, motionEvent);
                return true;
            case 8:
                int i9 = parcel.readInt();
                KeyEvent keyEvent = (KeyEvent) ijp.a(parcel, KeyEvent.CREATOR);
                ijp.d(parcel);
                k(i9, keyEvent);
                return true;
            case 9:
                int i10 = parcel.readInt();
                ijp.d(parcel);
                u(i10);
                return true;
            case 10:
                ClassLoader classLoader = ijp.a;
                z = parcel.readInt() != 0;
                ijp.d(parcel);
                i(z);
                return true;
            case 11:
                f();
                return true;
            case 12:
                v();
                return true;
            case 13:
                rnw rnwVar = (rnw) this.a.get();
                if (!c(rnwVar)) {
                    rnwVar.a();
                }
                return true;
            case 14:
                A();
                return true;
            case 15:
                int i11 = parcel.readInt();
                ijp.d(parcel);
                g(i11);
                return true;
            case 16:
                int i12 = parcel.readInt();
                ijp.d(parcel);
                o(i12);
                return true;
            case 17:
                DrawingSpec drawingSpec3 = (DrawingSpec) ijp.a(parcel, DrawingSpec.CREATOR);
                ijp.d(parcel);
                z(drawingSpec3);
                return true;
            case 18:
                ClassLoader classLoader2 = ijp.a;
                boolean z2 = parcel.readInt() != 0;
                z = parcel.readInt() != 0;
                ijp.d(parcel);
                j(z2, z);
                return true;
            case 19:
                IBinder strongBinder3 = parcel.readStrongBinder();
                ijp.d(parcel);
                rnw rnwVar2 = (rnw) this.a.get();
                if (!c(rnwVar2)) {
                    if (omc.c("CAR.PROJECTION.CAHI", 3)) {
                        SparseArray sparseArray = rnw.a;
                        rrd.d(3, "CAR.PROJECTION.CAHI", null, "Binder:%s.onAccessibilityEvent", rnwVar2.t);
                    }
                    new sss(Looper.getMainLooper()).post(new rfc(rnwVar2, strongBinder3, 16));
                }
                return true;
            case 20:
                InputFocusChangedEvent inputFocusChangedEvent = (InputFocusChangedEvent) ijp.a(parcel, InputFocusChangedEvent.CREATOR);
                ijp.d(parcel);
                h(inputFocusChangedEvent);
                return true;
            case 21:
                CarWindowManagerLayoutParams carWindowManagerLayoutParams = (CarWindowManagerLayoutParams) ijp.a(parcel, CarWindowManagerLayoutParams.CREATOR);
                ijp.d(parcel);
                y(carWindowManagerLayoutParams);
                return true;
            case 22:
                Rect rect = (Rect) ijp.a(parcel, Rect.CREATOR);
                ijp.d(parcel);
                w(rect);
                return true;
            case 23:
                int i13 = parcel.readInt();
                DrawingSpec drawingSpec4 = (DrawingSpec) ijp.a(parcel, DrawingSpec.CREATOR);
                Intent intent3 = (Intent) ijp.a(parcel, Intent.CREATOR);
                Configuration configuration2 = (Configuration) ijp.a(parcel, Configuration.CREATOR);
                Bundle bundle2 = (Bundle) ijp.a(parcel, Bundle.CREATOR);
                ijp.d(parcel);
                t(i13, drawingSpec4, intent3, configuration2, bundle2);
                return true;
            case 24:
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 == null) {
                    qxwVar2 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder4.queryLocalInterface("com.google.android.gms.car.ICarProjectionCallback");
                    qxwVar2 = iInterfaceQueryLocalInterface3 instanceof qxy ? (qxy) iInterfaceQueryLocalInterface3 : new qxw(strongBinder4);
                }
                ijp.d(parcel);
                rnw rnwVar3 = (rnw) this.a.get();
                if (!c(rnwVar3)) {
                    if (omc.c("CAR.PROJECTION.CAHI", 3)) {
                        SparseArray sparseArray2 = rnw.a;
                        rrd.d(3, "CAR.PROJECTION.CAHI", null, "Binder:%s.kill()", rnwVar3.t);
                    }
                    String strA = a();
                    rrd.d(6, "CAR.PROJECTION.CAHI", null, "%s", strA);
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("anr_logs", strA);
                    try {
                        qxwVar2.h(bundle3);
                    } catch (RemoteException e) {
                        rrd.b("CAR.PROJECTION.CAHI", e, "Failed to log ANR data!");
                    }
                    SparseArray sparseArray3 = rnw.a;
                    if (rnwVar3.z) {
                        Process.killProcess(Process.myPid());
                        System.exit(10);
                    }
                }
                return true;
            case 25:
                e();
                return true;
            case 26:
                int i14 = parcel.readInt();
                int i15 = parcel.readInt();
                DrawingSpec drawingSpec5 = (DrawingSpec) ijp.a(parcel, DrawingSpec.CREATOR);
                Intent intent4 = (Intent) ijp.a(parcel, Intent.CREATOR);
                Configuration configuration3 = (Configuration) ijp.a(parcel, Configuration.CREATOR);
                Bundle bundle4 = (Bundle) ijp.a(parcel, Bundle.CREATOR);
                ijp.d(parcel);
                r(i14, i15, drawingSpec5, intent4, configuration3, bundle4);
                return true;
            case 27:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 == null) {
                    qxwVar3 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder5.queryLocalInterface("com.google.android.gms.car.ICarProjectionCallback");
                    qxwVar3 = iInterfaceQueryLocalInterface4 instanceof qxy ? (qxy) iInterfaceQueryLocalInterface4 : new qxw(strongBinder5);
                }
                KillOptions killOptions = (KillOptions) ijp.a(parcel, KillOptions.CREATOR);
                ijp.d(parcel);
                rnw rnwVar4 = (rnw) this.a.get();
                if (!c(rnwVar4) && qxwVar3 != null && killOptions != null) {
                    if (omc.c("CAR.PROJECTION.CAHI", 3)) {
                        SparseArray sparseArray4 = rnw.a;
                        rrd.d(3, "CAR.PROJECTION.CAHI", null, "Binder:%s.kill()", rnwVar4.t);
                    }
                    String strA2 = a();
                    rrd.d(6, "CAR.PROJECTION.CAHI", null, "%s", strA2);
                    Bundle bundle5 = new Bundle();
                    if (killOptions.b) {
                        bundle5.putString("anr_logs", strA2);
                    }
                    try {
                        qxwVar3.h(bundle5);
                    } catch (RemoteException e2) {
                        rrd.b("CAR.PROJECTION.CAHI", e2, "Failed to log ANR data!");
                    }
                    if (killOptions.c) {
                        SparseArray sparseArray5 = rnw.a;
                        Executors.newSingleThreadExecutor().execute(new rnq(killOptions, i2));
                    } else {
                        SparseArray sparseArray6 = rnw.a;
                        if (rnwVar4.z) {
                            Process.killProcess(Process.myPid());
                            System.exit(10);
                        }
                    }
                }
                return true;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                Rect rect2 = (Rect) ijp.a(parcel, Rect.CREATOR);
                ijp.d(parcel);
                n(rect2);
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.qxv
    public final void g(int i) {
        rnw rnwVar = (rnw) this.a.get();
        if (c(rnwVar)) {
            return;
        }
        rbe.h(new rnq(rnwVar, 4));
    }

    @Override // defpackage.qxv
    public final void h(InputFocusChangedEvent inputFocusChangedEvent) {
        rnw rnwVar = (rnw) this.a.get();
        if (c(rnwVar)) {
            if (rrd.e("CAR.PROJECTION.CAHI", 2)) {
                rrd.d(2, "CAR.PROJECTION.CAHI", null, "Binder: onInputFocusChange(event: %s) service is null", inputFocusChangedEvent);
            }
        } else {
            if (omc.c("CAR.PROJECTION.CAHI", 3)) {
                SparseArray sparseArray = rnw.a;
                rrd.d(3, "CAR.PROJECTION.CAHI", null, "Binder:%s.onInputFocusChange(event: %s)", rnwVar.t, inputFocusChangedEvent);
            }
            b(inputFocusChangedEvent);
        }
    }

    @Override // defpackage.qxv
    @Deprecated
    public final void i(boolean z) {
        WeakReference weakReference = this.a;
        if (c((rnw) weakReference.get())) {
            if (rrd.e("CAR.PROJECTION.CAHI", 2)) {
                rrd.d(2, "CAR.PROJECTION.CAHI", null, "Binder: onInputFocusChangeDeprecated(hasFocus:%b) service is null", Boolean.valueOf(z));
            }
        } else {
            if (rrd.e("CAR.PROJECTION.CAHI", 2)) {
                rnw rnwVar = (rnw) weakReference.get();
                SparseArray sparseArray = rnw.a;
                rrd.d(2, "CAR.PROJECTION.CAHI", null, "Binder:%s onInputFocusChangeDeprecated(hasFocus:%b)", rnwVar.t, Boolean.valueOf(z));
            }
            b(new InputFocusChangedEvent(z, true, -1, null));
        }
    }

    @Override // defpackage.qxv
    @Deprecated
    public final void j(boolean z, boolean z2) {
        rnw rnwVar = (rnw) this.a.get();
        if (c(rnwVar)) {
            if (rrd.e("CAR.PROJECTION.CAHI", 2)) {
                rrd.d(2, "CAR.PROJECTION.CAHI", null, "Binder: onInputFocusChangeDeprecated2(hasFocus:%b, notInTouchMode:%b) service is null", Boolean.valueOf(z), Boolean.valueOf(z2));
            }
        } else {
            if (rrd.e("CAR.PROJECTION.CAHI", 2)) {
                SparseArray sparseArray = rnw.a;
                rrd.d(2, "CAR.PROJECTION.CAHI", null, "Binder:%s onInputFocusChangeDeprecated2(hasFocus:%b, notInTouchMode:%b)", rnwVar.t, Boolean.valueOf(z), Boolean.valueOf(z2));
            }
            b(new InputFocusChangedEvent(z, !z2, -1, null));
        }
    }

    @Override // defpackage.qxv
    public final void k(int i, KeyEvent keyEvent) {
        rnw rnwVar = (rnw) this.a.get();
        if (c(rnwVar)) {
            return;
        }
        rbe.h(new rfc(rnwVar, keyEvent, 20));
    }

    @Override // defpackage.qxv
    public final void l(int i, MotionEvent motionEvent) {
        long jElapsedRealtime;
        rnw rnwVar = (rnw) this.a.get();
        if (c(rnwVar)) {
            return;
        }
        int i2 = 1;
        if (omc.c("CAR.PROJECTION.CAHI", 3)) {
            SparseArray sparseArray = rnw.a;
            rrd.d(3, "CAR.PROJECTION.CAHI", null, "Binder:%s.onMotionEvent(displayId:%s, event:%s)", rnwVar.t, Integer.valueOf(i), motionEvent);
        }
        if (motionEvent.isFromSource(4098)) {
            rbe.h(new oa(rnwVar, i, motionEvent, 17));
            try {
                SparseArray sparseArray2 = rnw.a;
                Object obj = rnwVar.D;
                synchronized (obj) {
                    if (rrd.e("CAR.PROJECTION.CAHI", 2)) {
                        jElapsedRealtime = SystemClock.elapsedRealtime();
                        rrd.d(2, "CAR.PROJECTION.CAHI", null, "Binder:%s onMotionEvent() [activityHasWindowFocus(beforeWait):%b]", rnwVar.t, Boolean.valueOf(rnwVar.E));
                    } else {
                        jElapsedRealtime = 0;
                    }
                    while (!rnwVar.E) {
                        obj.wait(500L);
                    }
                    if (rrd.e("CAR.PROJECTION.CAHI", 2)) {
                        rrd.d(2, "CAR.PROJECTION.CAHI", null, "Binder:%s onMotionEvent() [activityHasWindowFocus(afterWait):%b, waitTimeInMs:%d]", rnwVar.t, Boolean.valueOf(rnwVar.E), Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
                    }
                }
            } catch (InterruptedException e) {
                rrd.b("CAR.PROJECTION.CAHI", e, "Error waiting for car activity to receive focus on touch.");
            }
        }
        rbe.h(new rpo(rnwVar, motionEvent, i2));
    }

    @Override // defpackage.qxv
    public final void m(Intent intent) {
        rnw rnwVar = (rnw) this.a.get();
        if (c(rnwVar)) {
            return;
        }
        if (omc.c("CAR.PROJECTION.CAHI", 3)) {
            SparseArray sparseArray = rnw.a;
            rrd.d(3, "CAR.PROJECTION.CAHI", null, "Binder:%s.onNewIntent(%s)", rnwVar.t, intent);
        }
        rbe.h(new rfc(rnwVar, intent, 17));
    }

    @Override // defpackage.qxv
    public final void n(Rect rect) {
        rnw rnwVar = (rnw) this.a.get();
        byte[] bArr = null;
        if (c(rnwVar)) {
            boolean z = rrd.a;
            rrd.d(3, "CAR.PROJECTION.CAHI", null, "No CarActivityHost connected, not delivering onNonDrawableInsetsChanged.", new Object[0]);
            return;
        }
        if (omc.c("CAR.PROJECTION.CAHI", 3)) {
            SparseArray sparseArray = rnw.a;
            rrd.d(3, "CAR.PROJECTION.CAHI", null, "Binder:%s.onNonDrawableInsetsChanged(%s)", rnwVar.t, rect);
        }
        SparseArray sparseArray2 = rnw.a;
        rnwVar.j();
        new sss(Looper.getMainLooper()).post(new jpx(rnwVar, rect, 6, bArr));
    }

    @Override // defpackage.qxv
    public final void o(int i) {
        rnw rnwVar = (rnw) this.a.get();
        if (c(rnwVar)) {
            return;
        }
        rbe.h(new rnq(rnwVar, 0));
    }

    @Override // defpackage.qxv
    public final void p(int i) {
        rnw rnwVar = (rnw) this.a.get();
        if (c(rnwVar)) {
            return;
        }
        int i2 = 1;
        if (omc.c("CAR.PROJECTION.CAHI", 3)) {
            SparseArray sparseArray = rnw.a;
            rrd.d(3, "CAR.PROJECTION.CAHI", null, "Binder:%s.onProjectionPause(displayId:%s)", rnwVar.t, Integer.valueOf(i));
        }
        rnwVar.getClass();
        rbe.h(new rnq(rnwVar, i2));
    }

    @Override // defpackage.qxv
    public final void q(int i) {
        rnw rnwVar = (rnw) this.a.get();
        if (c(rnwVar)) {
            return;
        }
        if (omc.c("CAR.PROJECTION.CAHI", 3)) {
            SparseArray sparseArray = rnw.a;
            rrd.d(3, "CAR.PROJECTION.CAHI", null, "Binder:%s.onProjectionResume(displayId:%s)", rnwVar.t, Integer.valueOf(i));
        }
        rnwVar.getClass();
        new sss(Looper.getMainLooper()).post(new nwg(rnwVar, 20));
    }

    @Override // defpackage.qxv
    public final void r(final int i, final int i2, final DrawingSpec drawingSpec, final Intent intent, final Configuration configuration, final Bundle bundle) {
        final rnw rnwVar = (rnw) this.a.get();
        if (c(rnwVar)) {
            return;
        }
        if (omc.c("CAR.PROJECTION.CAHI", 3)) {
            SparseArray sparseArray = rnw.a;
            rrd.d(3, "CAR.PROJECTION.CAHI", null, "Binder:%s.onProjectionStart(displayId:%d, regionId:%d, spec:%s, currentIntent:%s, config:%s)", rnwVar.t, Integer.valueOf(i), Integer.valueOf(i2), drawingSpec, intent, configuration);
        }
        SparseArray sparseArray2 = rnw.a;
        rnwVar.j();
        new sss(Looper.getMainLooper()).post(new Runnable() { // from class: rnr
            @Override // java.lang.Runnable
            public final void run() throws PackageManager.NameNotFoundException {
                CarRegionId carRegionId = new CarRegionId(i2, new CarDisplayId(i));
                SparseArray sparseArray3 = rnw.a;
                rnwVar.p(carRegionId, drawingSpec, intent, configuration, bundle);
            }
        });
    }

    @Override // defpackage.qxv
    @Deprecated
    public final void s(int i, DrawingSpec drawingSpec, Intent intent, Bundle bundle) {
        rnw rnwVar = (rnw) this.a.get();
        if (c(rnwVar)) {
            return;
        }
        if (omc.c("CAR.PROJECTION.CAHI", 3)) {
            SparseArray sparseArray = rnw.a;
            rrd.d(3, "CAR.PROJECTION.CAHI", null, "Binder:%s.onProjectionStartDeprecated(displayId:%d, spec:%s, currentIntent:%s)", rnwVar.t, Integer.valueOf(i), drawingSpec, intent);
        }
        SparseArray sparseArray2 = rnw.a;
        rnwVar.j();
        rbe.h(new ode(rnwVar, i, drawingSpec, intent, bundle, 4));
    }

    @Override // defpackage.qxv
    public final void t(int i, DrawingSpec drawingSpec, Intent intent, Configuration configuration, Bundle bundle) {
        rnw rnwVar = (rnw) this.a.get();
        if (c(rnwVar)) {
            return;
        }
        if (omc.c("CAR.PROJECTION.CAHI", 3)) {
            SparseArray sparseArray = rnw.a;
            rrd.d(3, "CAR.PROJECTION.CAHI", null, "Binder:%s.onProjectionStartWithDisplayIdDeprecated(displayId:%d, spec:%s, currentIntent:%s, config:%s)", rnwVar.t, Integer.valueOf(i), drawingSpec, intent, configuration);
        }
        SparseArray sparseArray2 = rnw.a;
        rnwVar.j();
        rbe.h(new rns(rnwVar, i, drawingSpec, intent, configuration, bundle, 0));
    }

    @Override // defpackage.qxv
    public final void u(int i) {
        rnw rnwVar = (rnw) this.a.get();
        if (c(rnwVar)) {
            return;
        }
        int i2 = 2;
        if (omc.c("CAR.PROJECTION.CAHI", 3)) {
            SparseArray sparseArray = rnw.a;
            rrd.d(3, "CAR.PROJECTION.CAHI", null, "Binder:%s.onProjectionStop(displayId:%s)", rnwVar.t, Integer.valueOf(i));
        }
        rnwVar.getClass();
        rbe.h(new rnq(rnwVar, i2));
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, java.util.Queue] */
    @Override // defpackage.qxv
    public final void v() {
        rnw rnwVar = (rnw) this.a.get();
        if (c(rnwVar)) {
            return;
        }
        SparseArray sparseArray = rnw.a;
        vag vagVar = rnwVar.L;
        if (vagVar != null) {
            if (omc.c("CAR.INPUT", 3)) {
                rrd.a("CAR.INPUT", null, "onStopInput");
            }
            ?? r5 = vagVar.c;
            synchronized (r5) {
                if (r5.isEmpty()) {
                    rrd.d(5, "CAR.INPUT", null, "onStopInput received with no active editable", new Object[0]);
                } else {
                    r5.poll();
                }
            }
        }
    }

    @Override // defpackage.qxv
    public final void w(Rect rect) {
        rnw rnwVar = (rnw) this.a.get();
        byte[] bArr = null;
        if (c(rnwVar)) {
            boolean z = rrd.a;
            rrd.d(3, "CAR.PROJECTION.CAHI", null, "No CarActivityHost connected, not delivering onSystemWindowInsetsChanged.", new Object[0]);
            return;
        }
        if (omc.c("CAR.PROJECTION.CAHI", 3)) {
            SparseArray sparseArray = rnw.a;
            rrd.d(3, "CAR.PROJECTION.CAHI", null, "Binder:%s.onSystemWindowInsetsChanged(%s)", rnwVar.t, rect);
        }
        SparseArray sparseArray2 = rnw.a;
        rnwVar.j();
        new sss(Looper.getMainLooper()).post(new jpx(rnwVar, rect, 7, bArr));
    }

    @Override // defpackage.qxv
    public final void x(int i, int i2, DrawingSpec drawingSpec, Configuration configuration) {
        rnw rnwVar = (rnw) this.a.get();
        if (c(rnwVar)) {
            return;
        }
        if (omc.c("CAR.PROJECTION.CAHI", 3)) {
            SparseArray sparseArray = rnw.a;
            rrd.d(3, "CAR.PROJECTION.CAHI", null, "Binder:%s.onVideoConfigurationChanged()", rnwVar.t);
        }
        SparseArray sparseArray2 = rnw.a;
        rnwVar.j();
        rbe.h(new isp(rnwVar, i2, drawingSpec, configuration, 13));
    }

    @Override // defpackage.qxv
    public final void y(CarWindowManagerLayoutParams carWindowManagerLayoutParams) {
        rnw rnwVar = (rnw) this.a.get();
        if (c(rnwVar)) {
            return;
        }
        rbe.h(new rfc(rnwVar, carWindowManagerLayoutParams, 15));
    }

    @Override // defpackage.qxv
    public final void z(DrawingSpec drawingSpec) {
        rnw rnwVar = (rnw) this.a.get();
        if (c(rnwVar)) {
            return;
        }
        rbe.h(new rfc(rnwVar, drawingSpec, 19));
    }
}
