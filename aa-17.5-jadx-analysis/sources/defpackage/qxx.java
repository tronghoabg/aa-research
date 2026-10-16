package defpackage;

import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.inputmethod.EditorInfo;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.gms.car.CrashInfoParcel;
import com.google.android.gms.car.ExceptionParcel;
import com.google.android.gms.car.KeyEventCompleteData;
import com.google.android.gms.car.TouchEventCompleteData;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class qxx extends ijo implements qxy {
    public final /* synthetic */ ipb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qxx(ipb ipbVar) {
        super("com.google.android.gms.car.ICarProjectionCallback");
        this.a = ipbVar;
    }

    private final void b(KeyEventCompleteData keyEventCompleteData) {
        KeyEvent keyEvent;
        ipb ipbVar = this.a;
        synchronized (ipbVar.Y) {
            keyEvent = (KeyEvent) ipbVar.Z.poll();
        }
        if (keyEvent != null) {
            ipa ipaVar = this.a.H;
            String str = ipaVar.e;
            rbr.d(ipaVar, ipaVar.h);
            ipb.V(true);
            ipb ipbVar2 = (ipb) ipaVar.v();
            if (ipbVar2 != null) {
                if (keyEventCompleteData.a) {
                    ipbVar2.N.X(keyEvent);
                } else {
                    if (keyEventCompleteData.a() != null) {
                        ipbVar2.N.ai(keyEventCompleteData.a());
                    }
                    ipbVar2.N.aa(keyEvent);
                }
            }
        }
        d();
    }

    private final void c(TouchEventCompleteData touchEventCompleteData) {
        MotionEvent motionEvent;
        ipb ipbVar = this.a;
        synchronized (ipbVar.Y) {
            motionEvent = (MotionEvent) ipbVar.aa.remove();
        }
        ipa ipaVar = this.a.H;
        rbr.d(ipaVar, ipaVar.h);
        ipb.V(true);
        ipb ipbVar2 = (ipb) ipaVar.v();
        if (ipbVar2 != null) {
            ipbVar2.N.Z(motionEvent, touchEventCompleteData);
        }
        motionEvent.recycle();
        d();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0068 A[Catch: all -> 0x006a, DONT_GENERATE, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x000d, B:8:0x0015, B:10:0x0019, B:11:0x003a, B:13:0x0041, B:16:0x0047, B:17:0x0068), top: B:22:0x0005, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void d() {
        /*
            r5 = this;
            ipb r0 = r5.a
            java.lang.Object r1 = r0.Y
            monitor-enter(r1)
            java.util.Queue r2 = r0.aa     // Catch: java.lang.Throwable -> L6a
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L6a
            if (r2 == 0) goto L68
            java.util.Queue r2 = r0.Z     // Catch: java.lang.Throwable -> L6a
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L6a
            if (r2 == 0) goto L68
            com.google.android.gms.car.InputFocusChangedEvent r2 = r0.ab     // Catch: java.lang.Throwable -> L6a
            if (r2 == 0) goto L68
            yph r2 = defpackage.ipb.E     // Catch: java.lang.Throwable -> L6a
            yop r2 = r2.l()     // Catch: java.lang.Throwable -> L6a
            r3 = 918(0x396, float:1.286E-42)
            yop r2 = r2.ai(r3)     // Catch: java.lang.Throwable -> L6a
            ype r2 = (defpackage.ype) r2     // Catch: java.lang.Throwable -> L6a
            java.lang.String r3 = "Sending delayed input focus change event= %s"
            com.google.android.gms.car.InputFocusChangedEvent r4 = r0.ab     // Catch: java.lang.Throwable -> L6a
            r2.y(r3, r4)     // Catch: java.lang.Throwable -> L6a
            com.google.android.gms.car.InputFocusChangedEvent r2 = r0.ab     // Catch: java.lang.Throwable -> L6a
            r3 = 0
            r0.ab = r3     // Catch: java.lang.Throwable -> L6a
            ipa r3 = r0.H     // Catch: java.lang.Throwable -> L6a
            r4 = 20
            r3.o(r4)     // Catch: java.lang.Throwable -> L6a
            int r0 = r0.N(r2)     // Catch: android.os.RemoteException -> L46 java.lang.Throwable -> L6a
            r2 = 1
            if (r0 == r2) goto L68
            r0 = 0
            r3.i(r4, r0)     // Catch: android.os.RemoteException -> L46 java.lang.Throwable -> L6a
            goto L68
        L46:
            r0 = move-exception
            yph r2 = defpackage.ipb.E     // Catch: java.lang.Throwable -> L6a
            yop r2 = r2.g()     // Catch: java.lang.Throwable -> L6a
            ype r2 = (defpackage.ype) r2     // Catch: java.lang.Throwable -> L6a
            r3 = 919(0x397, float:1.288E-42)
            yop r2 = r2.ai(r3)     // Catch: java.lang.Throwable -> L6a
            ype r2 = (defpackage.ype) r2     // Catch: java.lang.Throwable -> L6a
            java.lang.String r3 = "Error sending queued input focus change"
            r2.u(r3)     // Catch: java.lang.Throwable -> L6a
            ipb r5 = r5.a     // Catch: java.lang.Throwable -> L6a
            ipa r5 = r5.H     // Catch: java.lang.Throwable -> L6a
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L6a
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L6a
            r5.q(r2)     // Catch: java.lang.Throwable -> L6a
        L68:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6a
            return
        L6a:
            r5 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6a
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qxx.d():void");
    }

    @Override // defpackage.qxy
    public final void A() throws RemoteException {
        yph yphVar = ipb.E;
        this.a.H.d(23);
    }

    public final void a(CrashInfoParcel crashInfoParcel) throws RemoteException {
        yph yphVar = ipb.E;
        if (crashInfoParcel == null) {
            crashInfoParcel = new CrashInfoParcel((Throwable) null);
        }
        ipb ipbVar = this.a;
        ipbVar.N.aT();
        ipa ipaVar = ipbVar.H;
        ipaVar.f();
        ipaVar.h();
        ipaVar.e(Message.obtain(ipaVar, 17, crashInfoParcel));
    }

    @Override // defpackage.qxy
    public final void e(Bundle bundle) {
        yph yphVar = ipb.E;
        this.a.Q = bundle;
    }

    @Override // defpackage.qxy
    public final void f() {
        yph yphVar = ipb.E;
        ipb ipbVar = this.a;
        ipbVar.b.h.al();
        ipbVar.N.J();
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        rml rmjVar = null;
        switch (i) {
            case 1:
                q();
                parcel2.writeNoException();
                return true;
            case 2:
                m();
                parcel2.writeNoException();
                return true;
            case 3:
                r();
                parcel2.writeNoException();
                return true;
            case 4:
                p(1);
                parcel2.writeNoException();
                return true;
            case 5:
                o();
                parcel2.writeNoException();
                return true;
            case 6:
                t();
                parcel2.writeNoException();
                return true;
            case 7:
                n();
                parcel2.writeNoException();
                return true;
            case 8:
                yph yphVar = ipb.E;
                c(new TouchEventCompleteData(0, null, -1));
                parcel2.writeNoException();
                return true;
            case 9:
                ClassLoader classLoader = ijp.a;
                boolean z = parcel.readInt() != 0;
                ijp.d(parcel);
                k(z);
                parcel2.writeNoException();
                return true;
            case 10:
                g();
                parcel2.writeNoException();
                return true;
            case 11:
                ExceptionParcel exceptionParcel = (ExceptionParcel) ijp.a(parcel, ExceptionParcel.CREATOR);
                ijp.d(parcel);
                a(new CrashInfoParcel(exceptionParcel.a));
                parcel2.writeNoException();
                return true;
            case 12:
                Bundle bundle = (Bundle) ijp.a(parcel, Bundle.CREATOR);
                ijp.d(parcel);
                e(bundle);
                parcel2.writeNoException();
                return true;
            case 13:
                w();
                parcel2.writeNoException();
                return true;
            case 14:
                yph yphVar2 = ipb.E;
                ipb ipbVar = this.a;
                ipbVar.b.h.al();
                ipbVar.H.d(19);
                parcel2.writeNoException();
                return true;
            case 15:
                i();
                parcel2.writeNoException();
                return true;
            case 16:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.input.IProxyInputConnection");
                    rmjVar = iInterfaceQueryLocalInterface instanceof rml ? (rml) iInterfaceQueryLocalInterface : new rmj(strongBinder);
                }
                EditorInfo editorInfo = (EditorInfo) ijp.a(parcel, EditorInfo.CREATOR);
                ijp.d(parcel);
                z(rmjVar, editorInfo);
                parcel2.writeNoException();
                return true;
            case 17:
                A();
                parcel2.writeNoException();
                return true;
            case 18:
                ClassLoader classLoader2 = ijp.a;
                parcel.readInt();
                ijp.d(parcel);
                ((ype) ((ype) ipb.E.f()).ai((char) 920)).u("setCrashReportingEnabled is no longer supported");
                parcel2.writeNoException();
                return true;
            case 19:
            case 22:
            default:
                return false;
            case 20:
                v();
                parcel2.writeNoException();
                return true;
            case 21:
                Intent intent = (Intent) ijp.a(parcel, Intent.CREATOR);
                ijp.d(parcel);
                x(intent);
                parcel2.writeNoException();
                return true;
            case 23:
                int i2 = parcel.readInt();
                ijp.d(parcel);
                p(i2);
                parcel2.writeNoException();
                return true;
            case 24:
                int iA = ((ina) this.a.y).x.a();
                parcel2.writeNoException();
                parcel2.writeInt(iA);
                return true;
            case 25:
                char cA = (char) this.a.b.j.a();
                parcel2.writeNoException();
                parcel2.writeInt(cA);
                return true;
            case 26:
                CrashInfoParcel crashInfoParcel = (CrashInfoParcel) ijp.a(parcel, CrashInfoParcel.CREATOR);
                ijp.d(parcel);
                a(crashInfoParcel);
                parcel2.writeNoException();
                return true;
            case 27:
                u();
                parcel2.writeNoException();
                return true;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                ClassLoader classLoader3 = ijp.a;
                int i3 = parcel.readInt();
                ijp.d(parcel);
                yph yphVar3 = ipb.E;
                c(new TouchEventCompleteData(i3 == 0 ? -1 : 0, null, -1));
                parcel2.writeNoException();
                return true;
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                int i4 = parcel.readInt();
                ijp.d(parcel);
                yph yphVar4 = ipb.E;
                c(new TouchEventCompleteData(i4, null, -1));
                parcel2.writeNoException();
                return true;
            case 30:
                Surface surface = (Surface) ijp.a(parcel, Surface.CREATOR);
                ijp.d(parcel);
                s(surface);
                parcel2.writeNoException();
                return true;
            case 31:
                f();
                parcel2.writeNoException();
                return true;
            case 32:
                TouchEventCompleteData touchEventCompleteData = (TouchEventCompleteData) ijp.a(parcel, TouchEventCompleteData.CREATOR);
                ijp.d(parcel);
                yph yphVar5 = ipb.E;
                c(touchEventCompleteData);
                parcel2.writeNoException();
                return true;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                Bundle bundle2 = (Bundle) ijp.a(parcel, Bundle.CREATOR);
                ijp.d(parcel);
                h(bundle2);
                parcel2.writeNoException();
                return true;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                KeyEventCompleteData keyEventCompleteData = (KeyEventCompleteData) ijp.a(parcel, KeyEventCompleteData.CREATOR);
                ijp.d(parcel);
                yph yphVar6 = ipb.E;
                b(keyEventCompleteData);
                parcel2.writeNoException();
                return true;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                Bundle bundle3 = (Bundle) ijp.a(parcel, Bundle.CREATOR);
                ijp.d(parcel);
                y(bundle3);
                parcel2.writeNoException();
                return true;
        }
    }

    @Override // defpackage.qxy
    public final void g() throws RemoteException {
        yph yphVar = ipb.E;
        ipb ipbVar = this.a;
        ipbVar.L = true;
        ipbVar.H.j(15, 16);
    }

    @Override // defpackage.qxy
    public final void h(Bundle bundle) {
        this.a.D.set(bundle);
    }

    @Override // defpackage.qxy
    public final void i() {
        yph yphVar = ipb.E;
        this.a.H.j(20, 21);
    }

    @Override // defpackage.qxy
    public final void j(KeyEventCompleteData keyEventCompleteData) {
        yph yphVar = ipb.E;
        b(keyEventCompleteData);
    }

    @Override // defpackage.qxy
    @Deprecated
    public final void k(boolean z) {
        yph yphVar = ipb.E;
        b(new KeyEventCompleteData(z, null));
    }

    @Override // defpackage.qxy
    public final void l(TouchEventCompleteData touchEventCompleteData) {
        yph yphVar = ipb.E;
        c(touchEventCompleteData);
    }

    @Override // defpackage.qxy
    public final void m() throws RemoteException {
        yph yphVar = ipb.E;
        this.a.H.j(13, 14);
    }

    @Override // defpackage.qxy
    public final void n() {
        yph yphVar = ipb.E;
        this.a.H.j(11, 12);
    }

    @Override // defpackage.qxy
    public final void o() {
        yph yphVar = ipb.E;
        this.a.H.j(7, 8);
    }

    @Override // defpackage.qxy
    public final void p(int i) {
        yph yphVar = ipb.E;
        ipb ipbVar = this.a;
        ipbVar.n = i;
        ipbVar.k = Binder.getCallingPid();
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        executorServiceNewSingleThreadExecutor.execute(new imt(ipbVar, 2, null));
        executorServiceNewSingleThreadExecutor.shutdown();
        ipbVar.H.j(0, 1);
    }

    @Override // defpackage.qxy
    public final void q() throws RemoteException {
        yph yphVar = ipb.E;
        this.a.H.u(true);
    }

    @Override // defpackage.qxy
    public final void r() throws RemoteException {
        yph yphVar = ipb.E;
        this.a.H.j(5, 6);
    }

    @Override // defpackage.qxy
    public final void s(Surface surface) {
        yph yphVar = ipb.E;
        this.a.N.aT();
    }

    @Override // defpackage.qxy
    public final void t() {
        yph yphVar = ipb.E;
        ipb ipbVar = this.a;
        if (!ipbVar.af.getAndSet(false)) {
            ipbVar.H.j(9, 10);
            return;
        }
        ((ype) ((ype) ipb.E.f()).ai(913)).y("Using async onVideoConfigurationChangedComplete for %s", ipbVar.i);
        rbe.h(new ilp(ipbVar, 9));
    }

    @Override // defpackage.qxy
    public final void u() {
        yph yphVar = ipb.E;
        this.a.H.j(27, 28);
    }

    @Override // defpackage.qxy
    public final void v() throws RemoteException {
        yph yphVar = ipb.E;
        ipb ipbVar = this.a;
        ipbVar.N.H();
        ipa ipaVar = ipbVar.H;
        synchronized (ipaVar.d) {
            ipaVar.n();
            ipaVar.d(15);
        }
    }

    @Override // defpackage.qxy
    public final void w() {
        yph yphVar = ipb.E;
        ipb ipbVar = this.a;
        ipbVar.b.h.al();
        ipbVar.H.d(18);
    }

    @Override // defpackage.qxy
    public final void x(Intent intent) {
        yph yphVar = ipb.E;
        this.a.M.a(intent);
    }

    @Override // defpackage.qxy
    public final void y(Bundle bundle) {
        ype ypeVar = (ype) ipb.E.l().ai(922);
        ipb ipbVar = this.a;
        ypeVar.M("component: %s; setSurfacePackage (binder) %s", ipbVar.i, ipbVar.d);
        rbe.h(new ino(this, bundle, 2, null));
    }

    @Override // defpackage.qxy
    public final void z(rml rmlVar, EditorInfo editorInfo) throws RemoteException {
        yph yphVar = ipb.E;
        ipa ipaVar = this.a.H;
        ipaVar.e(Message.obtain(ipaVar, 22, Pair.create(rmlVar, editorInfo)));
    }
}
