package defpackage;

import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.google.android.gms.car.CarWindowManagerLayoutParams;
import com.google.android.gms.car.DrawingSpec;
import com.google.android.gms.car.InputFocusChangedEvent;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class qzb extends ijo implements qzc {
    public final WeakReference a;
    private final Handler b;

    public qzb(rzx rzxVar, Handler handler) {
        super("com.google.android.gms.car.ICarWindowCallback");
        this.a = new WeakReference(rzxVar);
        this.b = handler;
    }

    private final void b(InputFocusChangedEvent inputFocusChangedEvent) {
        c(new jpx(this, inputFocusChangedEvent, 8));
    }

    private final void c(Runnable runnable) {
        this.b.post(new jpx(this, runnable, 9));
    }

    public final String a() {
        rzx rzxVar = (rzx) this.a.get();
        if (rzxVar == null) {
            return null;
        }
        return rzxVar.a;
    }

    @Override // defpackage.qzc
    public final void e() {
        rrd.d(6, "CAR.CLIENT.WM.WIN", null, "ANR in CarWindow %s", this.a.get());
        Process.killProcess(Process.myPid());
        System.exit(10);
    }

    @Override // defpackage.qzc
    public final void f(int i) throws RemoteException {
        c(new rzy(this, 1));
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        switch (i) {
            case 1:
                DrawingSpec drawingSpec = (DrawingSpec) ijp.a(parcel, DrawingSpec.CREATOR);
                ijp.d(parcel);
                n(drawingSpec);
                return true;
            case 2:
                p();
                return true;
            case 3:
                ClassLoader classLoader = ijp.a;
                boolean z = parcel.readInt() != 0;
                boolean z2 = parcel.readInt() != 0;
                ijp.d(parcel);
                h(z, z2);
                return true;
            case 4:
                MotionEvent motionEvent = (MotionEvent) ijp.a(parcel, MotionEvent.CREATOR);
                ijp.d(parcel);
                k(motionEvent);
                return true;
            case 5:
                KeyEvent keyEvent = (KeyEvent) ijp.a(parcel, KeyEvent.CREATOR);
                ijp.d(parcel);
                j(keyEvent);
                return true;
            case 6:
                int i2 = parcel.readInt();
                ijp.d(parcel);
                f(i2);
                return true;
            case 7:
                e();
                return true;
            case 8:
                InputFocusChangedEvent inputFocusChangedEvent = (InputFocusChangedEvent) ijp.a(parcel, InputFocusChangedEvent.CREATOR);
                ijp.d(parcel);
                g(inputFocusChangedEvent);
                return true;
            case 9:
                CarWindowManagerLayoutParams carWindowManagerLayoutParams = (CarWindowManagerLayoutParams) ijp.a(parcel, CarWindowManagerLayoutParams.CREATOR);
                ijp.d(parcel);
                o(carWindowManagerLayoutParams);
                return true;
            case 10:
                DrawingSpec drawingSpec2 = (DrawingSpec) ijp.a(parcel, DrawingSpec.CREATOR);
                Configuration configuration = (Configuration) ijp.a(parcel, Configuration.CREATOR);
                ijp.d(parcel);
                m(drawingSpec2, configuration);
                return true;
            case 11:
                Configuration configuration2 = (Configuration) ijp.a(parcel, Configuration.CREATOR);
                int i3 = parcel.readInt();
                ijp.d(parcel);
                l(configuration2, i3);
                return true;
            case 12:
                Rect rect = (Rect) ijp.a(parcel, Rect.CREATOR);
                ijp.d(parcel);
                i(rect);
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.qzc
    public final void g(InputFocusChangedEvent inputFocusChangedEvent) throws RemoteException {
        if (omc.c("CAR.CLIENT.WM.WIN", 3)) {
            rrd.d(3, "CAR.CLIENT.WM.WIN", null, "Binder:%s onInputFocusChange(event:%s)", a(), inputFocusChangedEvent);
        }
        b(inputFocusChangedEvent);
    }

    @Override // defpackage.qzc
    @Deprecated
    public final void h(boolean z, boolean z2) throws RemoteException {
        if (omc.c("CAR.CLIENT.WM.WIN", 3)) {
            rrd.d(3, "CAR.CLIENT.WM.WIN", null, "Binder:%s onInputFocusChangedDeprecated(hasFocus:%b, isNotInTouchMode:%b)", a(), Boolean.valueOf(z), Boolean.valueOf(z2));
        }
        b(new InputFocusChangedEvent(z, !z2, -1, null));
    }

    @Override // defpackage.qzc
    public final void i(Rect rect) throws RemoteException {
        c(new rpo(this, rect, 13));
    }

    @Override // defpackage.qzc
    public final void j(KeyEvent keyEvent) throws RemoteException {
        if (rrd.e("CAR.CLIENT.WM.WIN", 2)) {
            rrd.d(2, "CAR.CLIENT.WM.WIN", null, "Binder:%s onKeyEvent(keyEvent:%s)", a(), keyEvent);
        }
        c(new rpo(this, keyEvent, 14));
    }

    @Override // defpackage.qzc
    public final void k(MotionEvent motionEvent) throws RemoteException {
        if (rrd.e("CAR.CLIENT.WM.WIN", 2)) {
            rrd.d(2, "CAR.CLIENT.WM.WIN", null, "Binder:%s onMotionEvent(motionEvent:%s)", a(), motionEvent);
        }
        if (motionEvent.isFromSource(4098)) {
            b(new InputFocusChangedEvent(true, true, -1, null));
            if (rrd.e("CAR.CLIENT.WM.WIN", 2)) {
                rrd.d(2, "CAR.CLIENT.WM.WIN", null, "Binder:%s waitForInputFocus()", a());
            }
            rzx rzxVar = (rzx) this.a.get();
            if (rzxVar != null) {
                Object obj = rzxVar.c;
                synchronized (obj) {
                    try {
                    } catch (InterruptedException e) {
                        rrd.b("CAR.CLIENT.WM.WIN", e, "Error waiting for car window to receive focus on touch.");
                    }
                    synchronized (obj) {
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        if (rrd.e("CAR.CLIENT.WM.WIN", 2)) {
                            rrd.d(2, "CAR.CLIENT.WM.WIN", null, "Binder: %s waitForInputFocus() [hasFocus:%b]", rzxVar.a, Boolean.valueOf(rzxVar.l));
                        }
                        while (!rzxVar.l) {
                            obj.wait(500L);
                        }
                        if (rrd.e("CAR.CLIENT.WM.WIN", 2)) {
                            rrd.d(2, "CAR.CLIENT.WM.WIN", null, "Binder:%s waitForInputFocus() [hasFocus:%b, waitTimeInMs:%d]", rzxVar.a, Boolean.valueOf(rzxVar.l), Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
                        }
                        if (!rzxVar.l) {
                            rrd.d(6, "CAR.CLIENT.WM.WIN", null, "Binder:%s waitForInputFocus() Focus not gained.", rzxVar.a);
                        }
                    }
                }
            } else if (rrd.e("CAR.CLIENT.WM.WIN", 2)) {
                rrd.f("CAR.CLIENT.WM.WIN", "Binder: waitForInputFocus(): CarWindow gone.");
            }
        }
        c(new rpo(this, motionEvent, 16));
    }

    @Override // defpackage.qzc
    public final void l(Configuration configuration, int i) {
        c(new oa(this, configuration, i, 18));
    }

    @Override // defpackage.qzc
    public final void m(DrawingSpec drawingSpec, Configuration configuration) throws RemoteException {
        c(new imp(this, drawingSpec, configuration, 9));
    }

    @Override // defpackage.qzc
    public final void n(DrawingSpec drawingSpec) throws RemoteException {
        c(new rpo(this, drawingSpec, 15));
    }

    @Override // defpackage.qzc
    public final void o(CarWindowManagerLayoutParams carWindowManagerLayoutParams) {
        c(new rpo(this, carWindowManagerLayoutParams, 12));
    }

    @Override // defpackage.qzc
    public final void p() throws RemoteException {
        c(new rnq(this, 20));
    }
}
