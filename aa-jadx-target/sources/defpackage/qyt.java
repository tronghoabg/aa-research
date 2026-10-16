package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qyt extends defpackage.ijw implements defpackage.qyu {
    public final /* synthetic */ defpackage.iph a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qyt(defpackage.iph iphVar) {
        super("com.google.android.gms.car.ICarProjectionCallback");
        this.a = iphVar;
    }

    private final void b(com.google.android.gms.car.KeyEventCompleteData keyEventCompleteData) {
        android.view.KeyEvent keyEvent;
        defpackage.iph iphVar = this.a;
        synchronized (iphVar.Y) {
            keyEvent = (android.view.KeyEvent) iphVar.Z.poll();
        }
        if (keyEvent != null) {
            defpackage.ipg ipgVar = this.a.H;
            java.lang.String str = ipgVar.e;
            defpackage.rcm.d(ipgVar, ipgVar.h);
            defpackage.iph.V(true);
            defpackage.iph iphVar2 = (defpackage.iph) ipgVar.v();
            if (iphVar2 != null) {
                if (keyEventCompleteData.a) {
                    iphVar2.N.Y(keyEvent);
                } else {
                    if (keyEventCompleteData.a() != null) {
                        iphVar2.N.aj(keyEventCompleteData.a());
                    }
                    iphVar2.N.ab(keyEvent);
                }
            }
        }
        d();
    }

    private final void c(com.google.android.gms.car.TouchEventCompleteData touchEventCompleteData) {
        android.view.MotionEvent motionEvent;
        defpackage.iph iphVar = this.a;
        synchronized (iphVar.Y) {
            motionEvent = (android.view.MotionEvent) iphVar.aa.remove();
        }
        defpackage.ipg ipgVar = this.a.H;
        defpackage.rcm.d(ipgVar, ipgVar.h);
        defpackage.iph.V(true);
        defpackage.iph iphVar2 = (defpackage.iph) ipgVar.v();
        if (iphVar2 != null) {
            iphVar2.N.aa(motionEvent, touchEventCompleteData);
        }
        motionEvent.recycle();
        d();
    }

    private final void d() {
        defpackage.iph iphVar = this.a;
        synchronized (iphVar.Y) {
            if (iphVar.aa.isEmpty() && iphVar.Z.isEmpty() && iphVar.ab != null) {
                ((defpackage.yqj) defpackage.iph.E.l().ai(918)).y("Sending delayed input focus change event= %s", iphVar.ab);
                com.google.android.gms.car.InputFocusChangedEvent inputFocusChangedEvent = iphVar.ab;
                iphVar.ab = null;
                defpackage.ipg ipgVar = iphVar.H;
                ipgVar.o(20);
                try {
                    if (iphVar.N(inputFocusChangedEvent) != 1) {
                        ipgVar.i(20, false);
                    }
                } catch (android.os.RemoteException e) {
                    ((defpackage.yqj) ((defpackage.yqj) defpackage.iph.E.g()).ai(919)).u("Error sending queued input focus change");
                    this.a.H.q(new java.lang.RuntimeException(e));
                }
            }
        }
    }

    @Override // defpackage.qyu
    public final void A() throws android.os.RemoteException {
        defpackage.yqm yqmVar = defpackage.iph.E;
        this.a.H.d(23);
    }

    public final void a(com.google.android.gms.car.CrashInfoParcel crashInfoParcel) throws android.os.RemoteException {
        defpackage.yqm yqmVar = defpackage.iph.E;
        if (crashInfoParcel == null) {
            crashInfoParcel = new com.google.android.gms.car.CrashInfoParcel((java.lang.Throwable) null);
        }
        defpackage.iph iphVar = this.a;
        iphVar.N.aV();
        defpackage.ipg ipgVar = iphVar.H;
        ipgVar.f();
        ipgVar.h();
        ipgVar.e(android.os.Message.obtain(ipgVar, 17, crashInfoParcel));
    }

    @Override // defpackage.qyu
    public final void e(android.os.Bundle bundle) {
        defpackage.yqm yqmVar = defpackage.iph.E;
        this.a.Q = bundle;
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        rnh rnfVar = null;
        switch (i) {
            case 1:
                q();
                parcel2.writeNoException();
                return true;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                m();
                parcel2.writeNoException();
                return true;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                r();
                parcel2.writeNoException();
                return true;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                p(1);
                parcel2.writeNoException();
                return true;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                o();
                parcel2.writeNoException();
                return true;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                t();
                parcel2.writeNoException();
                return true;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                n();
                parcel2.writeNoException();
                return true;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.yqm yqmVar = defpackage.iph.E;
                c(new com.google.android.gms.car.TouchEventCompleteData(0, null, -1));
                parcel2.writeNoException();
                return true;
            case 9:
                java.lang.ClassLoader classLoader = defpackage.ijx.a;
                boolean z = parcel.readInt() != 0;
                defpackage.ijx.d(parcel);
                k(z);
                parcel2.writeNoException();
                return true;
            case 10:
                g();
                parcel2.writeNoException();
                return true;
            case 11:
                com.google.android.gms.car.ExceptionParcel exceptionParcelA = defpackage.ijx.a(parcel, com.google.android.gms.car.ExceptionParcel.CREATOR);
                defpackage.ijx.d(parcel);
                a(new com.google.android.gms.car.CrashInfoParcel(exceptionParcelA.a));
                parcel2.writeNoException();
                return true;
            case 12:
                android.os.Bundle bundle = (android.os.Bundle) defpackage.ijx.a(parcel, android.os.Bundle.CREATOR);
                defpackage.ijx.d(parcel);
                e(bundle);
                parcel2.writeNoException();
                return true;
            case 13:
                w();
                parcel2.writeNoException();
                return true;
            case 14:
                defpackage.yqm yqmVar2 = defpackage.iph.E;
                defpackage.iph iphVar = this.a;
                iphVar.b.h.al();
                iphVar.H.d(19);
                parcel2.writeNoException();
                return true;
            case 15:
                i();
                parcel2.writeNoException();
                return true;
            case 16:
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    rnh rnhVarQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.input.IProxyInputConnection");
                    rnfVar = rnhVarQueryLocalInterface instanceof rnh ? rnhVarQueryLocalInterface : new rnf(strongBinder);
                }
                android.view.inputmethod.EditorInfo editorInfo = (android.view.inputmethod.EditorInfo) defpackage.ijx.a(parcel, android.view.inputmethod.EditorInfo.CREATOR);
                defpackage.ijx.d(parcel);
                z(rnfVar, editorInfo);
                parcel2.writeNoException();
                return true;
            case 17:
                A();
                parcel2.writeNoException();
                return true;
            case 18:
                java.lang.ClassLoader classLoader2 = defpackage.ijx.a;
                parcel.readInt();
                defpackage.ijx.d(parcel);
                ((defpackage.yqj) ((defpackage.yqj) defpackage.iph.E.f()).ai((char) 920)).u("setCrashReportingEnabled is no longer supported");
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
                android.content.Intent intent = (android.content.Intent) defpackage.ijx.a(parcel, android.content.Intent.CREATOR);
                defpackage.ijx.d(parcel);
                x(intent);
                parcel2.writeNoException();
                return true;
            case 23:
                int i2 = parcel.readInt();
                defpackage.ijx.d(parcel);
                p(i2);
                parcel2.writeNoException();
                return true;
            case 24:
                int iA = ((defpackage.inh) this.a.y).x.a();
                parcel2.writeNoException();
                parcel2.writeInt(iA);
                return true;
            case 25:
                char cA = (char) this.a.b.j.a();
                parcel2.writeNoException();
                parcel2.writeInt(cA);
                return true;
            case 26:
                com.google.android.gms.car.CrashInfoParcel crashInfoParcel = (com.google.android.gms.car.CrashInfoParcel) defpackage.ijx.a(parcel, com.google.android.gms.car.CrashInfoParcel.CREATOR);
                defpackage.ijx.d(parcel);
                a(crashInfoParcel);
                parcel2.writeNoException();
                return true;
            case 27:
                u();
                parcel2.writeNoException();
                return true;
            case 28:
                java.lang.ClassLoader classLoader3 = defpackage.ijx.a;
                int i3 = parcel.readInt();
                defpackage.ijx.d(parcel);
                defpackage.yqm yqmVar3 = defpackage.iph.E;
                c(new com.google.android.gms.car.TouchEventCompleteData(i3 == 0 ? -1 : 0, null, -1));
                parcel2.writeNoException();
                return true;
            case 29:
                int i4 = parcel.readInt();
                defpackage.ijx.d(parcel);
                defpackage.yqm yqmVar4 = defpackage.iph.E;
                c(new com.google.android.gms.car.TouchEventCompleteData(i4, null, -1));
                parcel2.writeNoException();
                return true;
            case 30:
                android.view.Surface surface = (android.view.Surface) defpackage.ijx.a(parcel, android.view.Surface.CREATOR);
                defpackage.ijx.d(parcel);
                s(surface);
                parcel2.writeNoException();
                return true;
            case 31:
                f();
                parcel2.writeNoException();
                return true;
            case 32:
                com.google.android.gms.car.TouchEventCompleteData touchEventCompleteData = (com.google.android.gms.car.TouchEventCompleteData) defpackage.ijx.a(parcel, com.google.android.gms.car.TouchEventCompleteData.CREATOR);
                defpackage.ijx.d(parcel);
                defpackage.yqm yqmVar5 = defpackage.iph.E;
                c(touchEventCompleteData);
                parcel2.writeNoException();
                return true;
            case 33:
                android.os.Bundle bundle2 = (android.os.Bundle) defpackage.ijx.a(parcel, android.os.Bundle.CREATOR);
                defpackage.ijx.d(parcel);
                h(bundle2);
                parcel2.writeNoException();
                return true;
            case 34:
                com.google.android.gms.car.KeyEventCompleteData keyEventCompleteData = (com.google.android.gms.car.KeyEventCompleteData) defpackage.ijx.a(parcel, com.google.android.gms.car.KeyEventCompleteData.CREATOR);
                defpackage.ijx.d(parcel);
                defpackage.yqm yqmVar6 = defpackage.iph.E;
                b(keyEventCompleteData);
                parcel2.writeNoException();
                return true;
            case 35:
                android.os.Bundle bundle3 = (android.os.Bundle) defpackage.ijx.a(parcel, android.os.Bundle.CREATOR);
                defpackage.ijx.d(parcel);
                y(bundle3);
                parcel2.writeNoException();
                return true;
        }
    }

    @Override // defpackage.qyu
    public final void f() {
        defpackage.yqm yqmVar = defpackage.iph.E;
        defpackage.iph iphVar = this.a;
        iphVar.b.h.al();
        iphVar.N.K();
    }

    @Override // defpackage.qyu
    public final void g() throws android.os.RemoteException {
        defpackage.yqm yqmVar = defpackage.iph.E;
        defpackage.iph iphVar = this.a;
        iphVar.L = true;
        iphVar.H.j(15, 16);
    }

    @Override // defpackage.qyu
    public final void h(android.os.Bundle bundle) {
        this.a.D.set(bundle);
    }

    @Override // defpackage.qyu
    public final void i() {
        defpackage.yqm yqmVar = defpackage.iph.E;
        this.a.H.j(20, 21);
    }

    @Override // defpackage.qyu
    public final void j(com.google.android.gms.car.KeyEventCompleteData keyEventCompleteData) {
        defpackage.yqm yqmVar = defpackage.iph.E;
        b(keyEventCompleteData);
    }

    @Override // defpackage.qyu
    @java.lang.Deprecated
    public final void k(boolean z) {
        defpackage.yqm yqmVar = defpackage.iph.E;
        b(new com.google.android.gms.car.KeyEventCompleteData(z, (android.graphics.Rect) null));
    }

    @Override // defpackage.qyu
    public final void l(com.google.android.gms.car.TouchEventCompleteData touchEventCompleteData) {
        defpackage.yqm yqmVar = defpackage.iph.E;
        c(touchEventCompleteData);
    }

    @Override // defpackage.qyu
    public final void m() throws android.os.RemoteException {
        defpackage.yqm yqmVar = defpackage.iph.E;
        this.a.H.j(13, 14);
    }

    @Override // defpackage.qyu
    public final void n() {
        defpackage.yqm yqmVar = defpackage.iph.E;
        this.a.H.j(11, 12);
    }

    @Override // defpackage.qyu
    public final void o() {
        defpackage.yqm yqmVar = defpackage.iph.E;
        this.a.H.j(7, 8);
    }

    @Override // defpackage.qyu
    public final void p(int i) {
        defpackage.yqm yqmVar = defpackage.iph.E;
        defpackage.iph iphVar = this.a;
        iphVar.n = i;
        iphVar.k = android.os.Binder.getCallingPid();
        java.util.concurrent.ExecutorService executorServiceNewSingleThreadExecutor = java.util.concurrent.Executors.newSingleThreadExecutor();
        executorServiceNewSingleThreadExecutor.execute(new defpackage.bgf(iphVar, 17));
        executorServiceNewSingleThreadExecutor.shutdown();
        iphVar.H.j(0, 1);
    }

    @Override // defpackage.qyu
    public final void q() throws android.os.RemoteException {
        defpackage.yqm yqmVar = defpackage.iph.E;
        this.a.H.u(true);
    }

    @Override // defpackage.qyu
    public final void r() throws android.os.RemoteException {
        defpackage.yqm yqmVar = defpackage.iph.E;
        this.a.H.j(5, 6);
    }

    @Override // defpackage.qyu
    public final void s(android.view.Surface surface) {
        defpackage.yqm yqmVar = defpackage.iph.E;
        this.a.N.aV();
    }

    @Override // defpackage.qyu
    public final void t() {
        defpackage.yqm yqmVar = defpackage.iph.E;
        defpackage.iph iphVar = this.a;
        if (!iphVar.af.getAndSet(false)) {
            iphVar.H.j(9, 10);
            return;
        }
        ((defpackage.yqj) ((defpackage.yqj) defpackage.iph.E.f()).ai(913)).y("Using async onVideoConfigurationChangedComplete for %s", iphVar.i);
        defpackage.rbz.h(new defpackage.iks(iphVar, 15));
    }

    @Override // defpackage.qyu
    public final void u() {
        defpackage.yqm yqmVar = defpackage.iph.E;
        this.a.H.j(27, 28);
    }

    @Override // defpackage.qyu
    public final void v() throws android.os.RemoteException {
        defpackage.yqm yqmVar = defpackage.iph.E;
        defpackage.iph iphVar = this.a;
        iphVar.N.I();
        defpackage.ipg ipgVar = iphVar.H;
        synchronized (ipgVar.d) {
            ipgVar.n();
            ipgVar.d(15);
        }
    }

    @Override // defpackage.qyu
    public final void w() {
        defpackage.yqm yqmVar = defpackage.iph.E;
        defpackage.iph iphVar = this.a;
        iphVar.b.h.al();
        iphVar.H.d(18);
    }

    @Override // defpackage.qyu
    public final void x(android.content.Intent intent) {
        defpackage.yqm yqmVar = defpackage.iph.E;
        this.a.M.a(intent);
    }

    @Override // defpackage.qyu
    public final void y(android.os.Bundle bundle) {
        defpackage.yqj yqjVar = (defpackage.yqj) defpackage.iph.E.l().ai(922);
        defpackage.iph iphVar = this.a;
        yqjVar.M("component: %s; setSurfacePackage (binder) %s", iphVar.i, iphVar.d);
        defpackage.rbz.h(new defpackage.inq(this, bundle, 3, null));
    }

    @Override // defpackage.qyu
    public final void z(rnh rnhVar, android.view.inputmethod.EditorInfo editorInfo) throws android.os.RemoteException {
        defpackage.yqm yqmVar = defpackage.iph.E;
        defpackage.ipg ipgVar = this.a.H;
        ipgVar.e(android.os.Message.obtain(ipgVar, 22, android.util.Pair.create(rnhVar, editorInfo)));
    }
}
