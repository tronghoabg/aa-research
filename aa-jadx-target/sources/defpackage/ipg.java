package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ipg extends defpackage.inl {
    public static final /* synthetic */ int i = 0;
    public final defpackage.ink h;
    private boolean j;

    public ipg(defpackage.iph iphVar, android.content.ComponentName componentName) {
        super(iphVar, componentName);
        this.h = new defpackage.ink(this, 26);
        this.j = false;
    }

    private final void w(boolean z) {
        this.j = z;
        if (z) {
            return;
        }
        defpackage.rcm.e(this, this.h);
        defpackage.iph.V(true);
    }

    @Override // defpackage.inl
    protected final int a(int i2) {
        long j;
        switch (i2) {
            case defpackage.abnt.b /* 0 */:
                j = defpackage.acps.a.fF().j();
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                j = defpackage.acps.a.fF().k();
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                j = defpackage.acps.m();
                break;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                j = defpackage.acps.a.fF().i();
                break;
            case 9:
                j = defpackage.acps.n();
                break;
            case 11:
                j = defpackage.acps.i();
                break;
            case 13:
                j = defpackage.acps.h();
                break;
            case 15:
                j = defpackage.acps.d();
                break;
            case 20:
                j = defpackage.acps.f();
                break;
            case 26:
                j = defpackage.acps.e();
                break;
            case 49:
                j = defpackage.acps.g();
                break;
            default:
                j = defpackage.acps.a.fF().a();
                break;
        }
        return (int) j;
    }

    @Override // defpackage.inl
    protected final java.lang.String b(int i2) {
        return (java.lang.String) defpackage.iph.F.get(i2);
    }

    @Override // defpackage.inl
    protected final java.lang.String c(android.os.Message message) {
        if (message.what == 20) {
            return message.arg1 == 1 ? "gain" : "loss";
        }
        if (message.what == 3) {
            return message.arg1 == 1 ? "window updated" : "";
        }
        return null;
    }

    @Override // defpackage.inl
    public final void f() {
        defpackage.rcm.d(this, this.b);
        removeCallbacksAndMessages(null);
        defpackage.rcm.e(this, this.h);
        defpackage.iph.V(true);
    }

    /* JADX WARN: Code duplicated, block: B:137:0x0275  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r15v117 */
    /* JADX WARN: Type inference failed for: r15v118 */
    /* JADX WARN: Type inference failed for: r15v127 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.inl
    protected final /* synthetic */ void m(defpackage.inn innVar, android.os.Message message) {
        int i2;
        ?? r14;
        android.content.res.Configuration configuration;
        com.google.android.gms.car.DrawingSpec drawingSpecAN;
        defpackage.iph iphVar = (defpackage.iph) innVar;
        defpackage.ill.d();
        int i3 = message.what;
        int iN = 2;
        android.os.RemoteException remoteException = null;
        int i4 = 3;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        ?? r12 = 1;
        switch (i3) {
            case defpackage.abnt.b /* 0 */:
                if (iphVar.Z("l_setup")) {
                    i(0, true);
                    return;
                }
                if (!iphVar.X()) {
                    i(0, false);
                    return;
                } else {
                    if (!defpackage.acvt.a.fF().j() || iphVar.F()) {
                        return;
                    }
                    iphVar.S();
                    return;
                }
            case 1:
                iphVar.S = true;
                i(0, true);
                return;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                if (iphVar.K == 3) {
                    defpackage.jhl jhlVar = iphVar.N;
                    if (!jhlVar.aF() || ((defpackage.inh) iphVar.y).ak(jhlVar, 0)) {
                        if (jhlVar.aD()) {
                            ((defpackage.yqj) defpackage.iph.E.l().ai(959)).y("%s waiting for window surface tex", iphVar.i);
                            iphVar.T = true;
                            return;
                        } else {
                            inj injVar = this.a;
                            if (injVar != null) {
                                injVar.c(2, 3);
                            }
                        }
                    }
                    break;
                }
                if (iphVar.K != 3) {
                    ((defpackage.yqj) ((defpackage.yqj) defpackage.iph.E.h()).ai(930)).y("component: %s; Start: callback state not resumed", this.e);
                } else {
                    ((defpackage.yqj) ((defpackage.yqj) defpackage.iph.E.h()).ai(929)).y("component: %s; Start: unable to prepare window", this.e);
                }
                iphVar.ab(false);
                k(2, 3, null);
                return;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                if (iphVar.ab(message.arg1 == 1)) {
                    return;
                }
                i(2, false);
                return;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                try {
                    if (iphVar.aa("doStop")) {
                        iphVar.ah = true;
                        iphVar.O.u(iphVar.M());
                        iphVar.ac.c();
                        i4 = 1;
                    }
                    i11 = i4;
                } catch (android.os.RemoteException e) {
                    remoteException = e;
                }
                k(5, i11, remoteException);
                return;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                w(false);
                j$.util.Optional optional = iphVar.aj;
                if (true == optional.isPresent()) {
                    ((defpackage.ipr) optional.get()).c(defpackage.ipq.b);
                }
                iphVar.b.A(iphVar);
                defpackage.jhl jhlVar2 = iphVar.N;
                if (jhlVar2.g() == 1) {
                    jhlVar2.ag();
                }
                iphVar.ai = false;
                i(5, true);
                return;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                try {
                    if (iphVar.aa("doResume")) {
                        if (iphVar.K != 3) {
                            ((defpackage.yqj) ((defpackage.yqj) defpackage.iph.E.h()).ai((char) 944)).y("Trying to resume in wrong state %s", iphVar);
                            iphVar.b.v(iphVar);
                        } else {
                            j$.util.Optional optional2 = iphVar.aj;
                            if (true == optional2.isPresent()) {
                                ((defpackage.ipr) optional2.get()).c(defpackage.ipq.c);
                            }
                            iphVar.ac.d(iphVar.d);
                            iphVar.O.q(iphVar.M());
                            i4 = 1;
                        }
                    }
                    i8 = i4;
                } catch (android.os.RemoteException e2) {
                    remoteException = e2;
                }
                k(7, i8, remoteException);
                return;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                w(true);
                iphVar.r = true;
                defpackage.ioh iohVar = iphVar.b;
                iohVar.w(iphVar);
                defpackage.jhl jhlVar3 = iphVar.N;
                if (jhlVar3.g() == 1) {
                    iphVar.y.L(jhlVar3, true, iphVar.u, iphVar.v);
                }
                iphVar.y.P(jhlVar3);
                iphVar.T(new android.graphics.Rect(jhlVar3.o()));
                i(7, true);
                iohVar.F(iphVar);
                return;
            case 9:
                try {
                    if (!iphVar.aa("doVideoConfigChange") || !iphVar.Z("doVideoConfigChange")) {
                        iN = 3;
                    } else if (iphVar.ah || iphVar.ai || (configuration = iphVar.ae) == null) {
                        ((defpackage.yqj) defpackage.iph.E.l().ai(952)).S("%s delaying video config change. clientStopped=%s, isStopping=%s, nextVideoConfig=%s", iphVar.i, java.lang.Boolean.valueOf(iphVar.ah), java.lang.Boolean.valueOf(iphVar.ai), iphVar.ae);
                    } else {
                        iphVar.R(iphVar.ad, configuration);
                        iN = 1;
                    }
                    i9 = iN;
                } catch (android.os.RemoteException e3) {
                    remoteException = e3;
                }
                k(9, i9, remoteException);
                return;
            case 10:
                iphVar.W();
                i(9, true);
                return;
            case 11:
                try {
                    if (iphVar.aa("doPause")) {
                        iphVar.O.p(iphVar.M());
                        i4 = 1;
                    }
                    i7 = i4;
                } catch (android.os.RemoteException e4) {
                    remoteException = e4;
                }
                k(11, i7, remoteException);
                return;
            case 12:
                iphVar.b.u(iphVar);
                i(11, true);
                return;
            case 13:
                try {
                    android.content.Intent intent = (android.content.Intent) message.obj;
                    if (iphVar.aa("doNewIntent")) {
                        iphVar.O.m(intent);
                        i4 = 1;
                    }
                    i10 = i4;
                } catch (android.os.RemoteException e5) {
                    remoteException = e5;
                }
                k(13, i10, remoteException);
                return;
            case 14:
                iphVar.b.y(iphVar);
                i(13, true);
                return;
            case 15:
                if (iphVar.Y()) {
                    return;
                }
                i(15, false);
                return;
            case 16:
                if (!iphVar.Y()) {
                    i(15, false);
                    return;
                }
                iphVar.ac.c();
                iphVar.K = -1;
                iphVar.b.av(iphVar, null);
                return;
            case 17:
                q(new java.lang.RuntimeException(com.google.android.gms.car.CrashInfoParcel.a(((com.google.android.gms.car.CrashInfoParcel) message.obj).a)));
                return;
            case 18:
                iphVar.m = true;
                defpackage.ioh iohVar2 = iphVar.b;
                defpackage.jkr jkrVar = iphVar.y;
                com.google.android.gms.car.display.CarRegionId carRegionId = iphVar.z;
                synchronized (iohVar2) {
                    defpackage.inu inuVarF = iohVar2.f(carRegionId.h);
                    inuVarF.m.add(carRegionId);
                    inuVarF.e = true;
                    break;
                }
                ((defpackage.inh) jkrVar).Z.G();
                i(18, true);
                return;
            case 19:
                defpackage.jkr jkrVar2 = iphVar.y;
                jkrVar2.U();
                if (((defpackage.inh) jkrVar2).C) {
                    if (iphVar.m) {
                        ((defpackage.yqj) defpackage.inn.a.l().ai((char) 608)).u("No longer relinquishing");
                        iphVar.m = false;
                    }
                    iphVar.b.T(iphVar.z);
                } else {
                    ((defpackage.yqj) ((defpackage.yqj) defpackage.inn.a.f()).ai(609)).D("Window manager not compositing, add pending client, layer:%d, startInfo: %s", iphVar.b(), iphVar.s);
                    iphVar.b.n(iphVar.s);
                }
                i(19, true);
                return;
            case 20:
                try {
                    if (this.j) {
                        com.google.android.gms.car.InputFocusChangedEvent inputFocusChangedEvent = (com.google.android.gms.car.InputFocusChangedEvent) message.obj;
                        if (!iphVar.aa("doInputFocusChange") || iphVar.j || iphVar.K == 0) {
                            iN = 3;
                        } else {
                            boolean z = iphVar.P;
                            boolean z2 = inputFocusChangedEvent.a;
                            if (z != z2) {
                                iphVar.P = z2;
                                if (z2) {
                                    iN = iphVar.N(inputFocusChangedEvent);
                                } else {
                                    synchronized (iphVar.Y) {
                                        if (iphVar.Z.isEmpty() && iphVar.aa.isEmpty()) {
                                            iN = iphVar.N(inputFocusChangedEvent);
                                        } else {
                                            iphVar.ab = inputFocusChangedEvent;
                                            ((defpackage.yqj) defpackage.iph.E.l().ai(943)).u("Delaying input focus loss until pending input events are completed.");
                                            iN = 4;
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        iN = 3;
                    }
                    i12 = iN;
                } catch (android.os.RemoteException e6) {
                    remoteException = e6;
                }
                k(20, i12, remoteException);
                return;
            case 21:
                i(20, true);
                return;
            case 22:
                android.util.Pair pair = (android.util.Pair) message.obj;
                iphVar.b.ad((rnh) pair.first, (android.view.inputmethod.EditorInfo) pair.second, iphVar);
                i(22, true);
                return;
            case 23:
                defpackage.ioh iohVar3 = iphVar.b;
                defpackage.ill.d();
                iohVar3.y = false;
                defpackage.ioj iojVar = iohVar3.p;
                if (iojVar == null) {
                    ((defpackage.yqj) ((defpackage.yqj) defpackage.ioh.b.h()).ai((char) 798)).u("No ImeManager; can't stop input");
                } else {
                    iojVar.e(iphVar);
                }
                i(23, true);
                return;
            case 24:
                try {
                    if (iphVar.aa("doStopImeInput")) {
                        iphVar.O.v();
                        r14 = 1;
                    } else {
                        r14 = 3;
                    }
                } catch (android.os.RemoteException e7) {
                    remoteException = e7;
                    r14 = 0;
                }
                i(24, r14 != 3);
                if (remoteException != null) {
                    ((defpackage.yqj) ((defpackage.yqj) defpackage.iph.E.g()).ai(931)).y("component: %s; Exception calling stop ime", this.e);
                    q(new java.lang.RuntimeException(remoteException));
                    return;
                }
                return;
            default:
                switch (i3) {
                    case 26:
                        defpackage.tgg.a.b(defpackage.tgf.GEARHEAD_CAR_ACTIVITY_MANAGER_INPUT_EVENT);
                        defpackage.rcm.c(this, this.h, defpackage.acps.e());
                        try {
                            android.view.InputEvent inputEvent = (android.view.InputEvent) message.obj;
                            ?? r15 = message.arg1 == 1;
                            if (iphVar.aa("doInputEvent")) {
                                if (!iphVar.P && r15 != false && inputEvent.isFromSource(4098) && !iphVar.ah) {
                                    ((defpackage.yqj) defpackage.iph.E.l().ai(942)).y("%s gaining focus locally.", iphVar.i);
                                    iphVar.P = true;
                                }
                                if (iphVar.P) {
                                    synchronized (iphVar.Y) {
                                        try {
                                            if (r15 == true) {
                                                android.view.MotionEvent motionEvent = (android.view.MotionEvent) inputEvent;
                                                iphVar.aa.add(motionEvent);
                                                iphVar.O.l(iphVar.M(), motionEvent);
                                            } else {
                                                android.view.KeyEvent keyEvent = (android.view.KeyEvent) inputEvent;
                                                iphVar.Z.add(keyEvent);
                                                iphVar.O.k(iphVar.M(), keyEvent);
                                            }
                                        } catch (java.lang.Throwable th) {
                                            throw th;
                                        }
                                    }
                                } else {
                                    ((defpackage.yqj) defpackage.iph.E.l().ai(941)).y("Ignoring input event due to lack of focus %b", java.lang.Boolean.valueOf(iphVar.P));
                                    r12 = 3;
                                }
                            } else {
                                r12 = 3;
                            }
                            break;
                        } catch (android.os.RemoteException e8) {
                            remoteException = e8;
                            r12 = 0;
                        }
                        if (r12 == 3) {
                            defpackage.rcm.d(this, this.h);
                            defpackage.iph.V(false);
                            if (remoteException != null) {
                                ((defpackage.yqj) ((defpackage.yqj) defpackage.iph.E.g()).ai(932)).y("%s; Exception calling doInputEvent", this.e);
                                q(new java.lang.RuntimeException(remoteException));
                                return;
                            }
                            return;
                        }
                        return;
                    case 27:
                        try {
                            if (iphVar.aa("doWindowReattach") && (drawingSpecAN = iphVar.N.aN()) != null) {
                                iphVar.O.z(drawingSpecAN);
                                i4 = 1;
                            }
                            i6 = i4;
                        } catch (android.os.RemoteException e9) {
                            remoteException = e9;
                        }
                        k(27, i6, remoteException);
                        return;
                    case 28:
                        iphVar.y.r(iphVar.N, iphVar.s.c.getIntExtra("com.google.android.gms.car.EXTRA_CAR_ACTIVITY_FLAGS", 0));
                        return;
                    default:
                        switch (i3) {
                            case 47:
                                try {
                                    if (iphVar.aa("doSetup")) {
                                        iphVar.O.B(iphVar.am, iphVar.b.i);
                                        i4 = 1;
                                    }
                                } catch (android.os.RemoteException e10) {
                                    remoteException = e10;
                                    i4 = 0;
                                }
                                k(0, i4, remoteException);
                                return;
                            case 48:
                                try {
                                    defpackage.ill.d();
                                    iphVar.O.e();
                                    return;
                                } catch (android.os.RemoteException e11) {
                                    q(new java.lang.RuntimeException(e11));
                                    return;
                                }
                            case 49:
                                if (((defpackage.rqm) iphVar.ak.fF()).g(new defpackage.ioy(iphVar, i5))) {
                                    return;
                                }
                                ((defpackage.yqj) ((defpackage.yqj) defpackage.iph.E.g()).ai((char) 994)).u("Could not register callback to listen for lifetime");
                                i(49, false);
                                throw new java.lang.IllegalStateException("Could not register callback to listen for lifetime");
                            case 50:
                                i(49, true);
                                return;
                            default:
                                ((defpackage.yqj) ((defpackage.yqj) defpackage.iph.E.g()).ai(928)).K("component: %s; Unknown msg.what %d", this.e, message.what);
                                return;
                        }
                }
        }
        try {
            boolean z3 = message.arg1 == 1;
            if (iphVar.aa("doStartWindowReady")) {
                defpackage.jhl jhlVar4 = iphVar.N;
                com.google.android.gms.car.DrawingSpec drawingSpecAN2 = jhlVar4.aN();
                if (drawingSpecAN2 != null) {
                    iphVar.y.P(jhlVar4);
                    iphVar.O.w(new android.graphics.Rect(jhlVar4.o()));
                    iphVar.U(jhlVar4.p(), true);
                    if (z3 || iphVar.ae != null) {
                        ((defpackage.yqj) defpackage.iph.E.l().ai(949)).P("Sending video focus change command async before start. updated=%s, nextVideoConfig=%s", z3, iphVar.ae);
                        android.content.res.Configuration configurationO = iphVar.ae;
                        if (configurationO != null) {
                            i2 = iphVar.ad;
                        } else {
                            configurationO = iphVar.O();
                            i2 = 0;
                        }
                        if (z3) {
                            i2 |= 1024;
                        }
                        iphVar.R(i2, configurationO);
                        iphVar.af.set(true);
                    }
                    iphVar.ac.d(iphVar.d);
                    iphVar.ah = false;
                    if (iphVar.n >= 10) {
                        iphVar.O.r(iphVar.M(), iphVar.z.g, drawingSpecAN2, iphVar.M.a, iphVar.b.c(iphVar.P()), iphVar.Q);
                    } else if (iphVar.n >= 8) {
                        iphVar.O.t(iphVar.M(), drawingSpecAN2, iphVar.M.a, iphVar.b.c(iphVar.P()), iphVar.Q);
                    } else {
                        ((defpackage.yqj) ((defpackage.yqj) defpackage.iph.E.f()).ai(950)).w("calling onProjectionStartDeprecated, clientVersion=%d", iphVar.n);
                        iphVar.O.s(iphVar.M(), drawingSpecAN2, iphVar.M.a, iphVar.Q);
                    }
                    i4 = 1;
                } else if (defpackage.acpa.i()) {
                    ((defpackage.yqj) ((defpackage.yqj) defpackage.iph.E.f()).ai((char) 951)).y("Unable to start, no drawing spec %s", iphVar);
                    defpackage.ioh iohVar4 = iphVar.b;
                    defpackage.rqt.a(iohVar4.d).c(defpackage.rrw.h(defpackage.yzd.CAR_SERVICE, defpackage.zbe.ACTIVITY_MANAGER, defpackage.zbd.MR).l());
                    iohVar4.v(iphVar);
                }
            }
            i5 = i4;
        } catch (android.os.RemoteException e12) {
            remoteException = e12;
        }
        k(2, i5, remoteException);
    }

    public final void q(java.lang.RuntimeException runtimeException) {
        ((defpackage.yqj) defpackage.iph.E.l().ai(926)).M("component: %s; client crash for: %s", this.e, this);
        defpackage.rbz.g(getLooper(), new defpackage.inq(this, runtimeException, 5));
    }

    public final void r(com.google.android.gms.car.InputFocusChangedEvent inputFocusChangedEvent) {
        e(android.os.Message.obtain(this, 20, inputFocusChangedEvent));
    }

    public final void s(android.view.InputEvent inputEvent, boolean z) {
        sendMessage(android.os.Message.obtain(this, 26, z ? 1 : 0, 0, inputEvent));
    }

    public final void t(android.content.Intent intent) {
        e(android.os.Message.obtain(this, 13, intent));
    }

    public final void u(boolean z) {
        p(2, android.os.Message.obtain(this, 4, z ? 1 : 0, 0));
    }
}
