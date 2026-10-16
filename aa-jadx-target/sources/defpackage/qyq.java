package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qyq extends defpackage.ijw implements defpackage.qyr {
    private final java.lang.ref.WeakReference a;

    public qyq(defpackage.ror rorVar) {
        super("com.google.android.gms.car.ICarProjection");
        this.a = new java.lang.ref.WeakReference(rorVar);
    }

    private static java.lang.String a() {
        java.util.Map<java.lang.Thread, java.lang.StackTraceElement[]> allStackTraces = java.lang.Thread.getAllStackTraces();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("***ANR Stack Traces***");
        for (java.util.Map.Entry<java.lang.Thread, java.lang.StackTraceElement[]> entry : allStackTraces.entrySet()) {
            sb.append(entry.getKey().toString());
            sb.append(":");
            if (entry.getValue().length == 0) {
                sb.append(" No non-native stack");
            } else {
                for (java.lang.StackTraceElement stackTraceElement : entry.getValue()) {
                    sb.append("\n\t");
                    sb.append(stackTraceElement.toString());
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    private final void b(com.google.android.gms.car.InputFocusChangedEvent inputFocusChangedEvent) {
        defpackage.rbz.h(new defpackage.ron((defpackage.ror) this.a.get(), inputFocusChangedEvent, 1));
    }

    private static boolean c(defpackage.ror rorVar) {
        return rorVar == null || rorVar.f == null;
    }

    @Override // defpackage.qyr
    public final void A() {
        defpackage.ror rorVar = (defpackage.ror) this.a.get();
        if (c(rorVar)) {
            return;
        }
        android.util.SparseArray sparseArray = defpackage.ror.a;
        defpackage.rpm rpmVar = rorVar.k;
        if (rpmVar != null) {
            rpmVar.k();
        }
    }

    @Override // defpackage.qyr
    public final void B(defpackage.qyu qyuVar, defpackage.qvl qvlVar) {
        defpackage.ror rorVar = (defpackage.ror) this.a.get();
        if (c(rorVar)) {
            return;
        }
        if (defpackage.omv.c("CAR.PROJECTION.CAHI", 3)) {
            android.util.SparseArray sparseArray = defpackage.ror.a;
            defpackage.rrx.d(3, "CAR.PROJECTION.CAHI", null, "Binder:%s.onSetup()", rorVar.t);
        }
        android.util.SparseArray sparseArray2 = defpackage.ror.a;
        rorVar.w.O(qvlVar);
        android.os.IBinder.DeathRecipient deathRecipient = rorVar.e;
        synchronized (deathRecipient) {
            rorVar.i = qyuVar;
            try {
                qyuVar.asBinder().linkToDeath(deathRecipient, 0);
            } catch (android.os.RemoteException unused) {
                rorVar.i = null;
                new defpackage.stq(android.os.Looper.getMainLooper()).post(rorVar.d);
                return;
            }
        }
        try {
            qyuVar.p(11);
        } catch (android.os.RemoteException unused2) {
            new defpackage.stq(android.os.Looper.getMainLooper()).post(rorVar.d);
        }
    }

    @Override // defpackage.qyr
    public final void e() {
        defpackage.ror rorVar = (defpackage.ror) this.a.get();
        if (c(rorVar)) {
            return;
        }
        rorVar.getClass();
        defpackage.rbz.h(new defpackage.rid(rorVar, 7));
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        defpackage.qyu qysVar;
        boolean z;
        defpackage.qyu qysVar2;
        defpackage.qyu qysVar3;
        defpackage.qvl qvjVar = null;
        switch (i) {
            case 1:
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    qysVar = null;
                } else {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarProjectionCallback");
                    qysVar = iInterfaceQueryLocalInterface instanceof defpackage.qyu ? (defpackage.qyu) iInterfaceQueryLocalInterface : new defpackage.qys(strongBinder);
                }
                android.os.IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.car.ICar");
                    qvjVar = iInterfaceQueryLocalInterface2 instanceof defpackage.qvl ? (defpackage.qvl) iInterfaceQueryLocalInterface2 : new defpackage.qvj(strongBinder2);
                }
                defpackage.ijx.d(parcel);
                B(qysVar, qvjVar);
                return true;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                int i2 = parcel.readInt();
                com.google.android.gms.car.DrawingSpec drawingSpec = (com.google.android.gms.car.DrawingSpec) defpackage.ijx.a(parcel, com.google.android.gms.car.DrawingSpec.CREATOR);
                android.content.Intent intent = (android.content.Intent) defpackage.ijx.a(parcel, android.content.Intent.CREATOR);
                android.os.Bundle bundle = (android.os.Bundle) defpackage.ijx.a(parcel, android.os.Bundle.CREATOR);
                defpackage.ijx.d(parcel);
                s(i2, drawingSpec, intent, bundle);
                return true;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                android.content.Intent intent2 = (android.content.Intent) defpackage.ijx.a(parcel, android.content.Intent.CREATOR);
                defpackage.ijx.d(parcel);
                m(intent2);
                return true;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                int i3 = parcel.readInt();
                defpackage.ijx.d(parcel);
                q(i3);
                return true;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                int i4 = parcel.readInt();
                defpackage.ijx.d(parcel);
                p(i4);
                return true;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                int i5 = parcel.readInt();
                int i6 = parcel.readInt();
                com.google.android.gms.car.DrawingSpec drawingSpec2 = (com.google.android.gms.car.DrawingSpec) defpackage.ijx.a(parcel, com.google.android.gms.car.DrawingSpec.CREATOR);
                android.content.res.Configuration configuration = (android.content.res.Configuration) defpackage.ijx.a(parcel, android.content.res.Configuration.CREATOR);
                defpackage.ijx.d(parcel);
                x(i5, i6, drawingSpec2, configuration);
                return true;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                int i7 = parcel.readInt();
                android.view.MotionEvent motionEvent = (android.view.MotionEvent) defpackage.ijx.a(parcel, android.view.MotionEvent.CREATOR);
                defpackage.ijx.d(parcel);
                l(i7, motionEvent);
                return true;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                int i8 = parcel.readInt();
                android.view.KeyEvent keyEvent = (android.view.KeyEvent) defpackage.ijx.a(parcel, android.view.KeyEvent.CREATOR);
                defpackage.ijx.d(parcel);
                k(i8, keyEvent);
                return true;
            case 9:
                int i9 = parcel.readInt();
                defpackage.ijx.d(parcel);
                u(i9);
                return true;
            case 10:
                java.lang.ClassLoader classLoader = defpackage.ijx.a;
                z = parcel.readInt() != 0;
                defpackage.ijx.d(parcel);
                i(z);
                return true;
            case 11:
                f();
                return true;
            case 12:
                v();
                return true;
            case 13:
                defpackage.ror rorVar = (defpackage.ror) this.a.get();
                if (!c(rorVar)) {
                    rorVar.a();
                }
                return true;
            case 14:
                A();
                return true;
            case 15:
                int i10 = parcel.readInt();
                defpackage.ijx.d(parcel);
                g(i10);
                return true;
            case 16:
                int i11 = parcel.readInt();
                defpackage.ijx.d(parcel);
                o(i11);
                return true;
            case 17:
                com.google.android.gms.car.DrawingSpec drawingSpec3 = (com.google.android.gms.car.DrawingSpec) defpackage.ijx.a(parcel, com.google.android.gms.car.DrawingSpec.CREATOR);
                defpackage.ijx.d(parcel);
                z(drawingSpec3);
                return true;
            case 18:
                java.lang.ClassLoader classLoader2 = defpackage.ijx.a;
                boolean z2 = parcel.readInt() != 0;
                z = parcel.readInt() != 0;
                defpackage.ijx.d(parcel);
                j(z2, z);
                return true;
            case 19:
                android.os.IBinder strongBinder3 = parcel.readStrongBinder();
                defpackage.ijx.d(parcel);
                defpackage.ror rorVar2 = (defpackage.ror) this.a.get();
                if (!c(rorVar2)) {
                    if (defpackage.omv.c("CAR.PROJECTION.CAHI", 3)) {
                        android.util.SparseArray sparseArray = defpackage.ror.a;
                        defpackage.rrx.d(3, "CAR.PROJECTION.CAHI", null, "Binder:%s.onAccessibilityEvent", rorVar2.t);
                    }
                    new defpackage.stq(android.os.Looper.getMainLooper()).post(new defpackage.rft(rorVar2, strongBinder3, 19));
                }
                return true;
            case 20:
                com.google.android.gms.car.InputFocusChangedEvent inputFocusChangedEvent = (com.google.android.gms.car.InputFocusChangedEvent) defpackage.ijx.a(parcel, com.google.android.gms.car.InputFocusChangedEvent.CREATOR);
                defpackage.ijx.d(parcel);
                h(inputFocusChangedEvent);
                return true;
            case 21:
                com.google.android.gms.car.CarWindowManagerLayoutParams carWindowManagerLayoutParams = (com.google.android.gms.car.CarWindowManagerLayoutParams) defpackage.ijx.a(parcel, com.google.android.gms.car.CarWindowManagerLayoutParams.CREATOR);
                defpackage.ijx.d(parcel);
                y(carWindowManagerLayoutParams);
                return true;
            case 22:
                android.graphics.Rect rect = (android.graphics.Rect) defpackage.ijx.a(parcel, android.graphics.Rect.CREATOR);
                defpackage.ijx.d(parcel);
                w(rect);
                return true;
            case 23:
                int i12 = parcel.readInt();
                com.google.android.gms.car.DrawingSpec drawingSpec4 = (com.google.android.gms.car.DrawingSpec) defpackage.ijx.a(parcel, com.google.android.gms.car.DrawingSpec.CREATOR);
                android.content.Intent intent3 = (android.content.Intent) defpackage.ijx.a(parcel, android.content.Intent.CREATOR);
                android.content.res.Configuration configuration2 = (android.content.res.Configuration) defpackage.ijx.a(parcel, android.content.res.Configuration.CREATOR);
                android.os.Bundle bundle2 = (android.os.Bundle) defpackage.ijx.a(parcel, android.os.Bundle.CREATOR);
                defpackage.ijx.d(parcel);
                t(i12, drawingSpec4, intent3, configuration2, bundle2);
                return true;
            case 24:
                android.os.IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 == null) {
                    qysVar2 = null;
                } else {
                    android.os.IInterface iInterfaceQueryLocalInterface3 = strongBinder4.queryLocalInterface("com.google.android.gms.car.ICarProjectionCallback");
                    qysVar2 = iInterfaceQueryLocalInterface3 instanceof defpackage.qyu ? (defpackage.qyu) iInterfaceQueryLocalInterface3 : new defpackage.qys(strongBinder4);
                }
                defpackage.ijx.d(parcel);
                defpackage.ror rorVar3 = (defpackage.ror) this.a.get();
                if (!c(rorVar3)) {
                    if (defpackage.omv.c("CAR.PROJECTION.CAHI", 3)) {
                        android.util.SparseArray sparseArray2 = defpackage.ror.a;
                        defpackage.rrx.d(3, "CAR.PROJECTION.CAHI", null, "Binder:%s.kill()", rorVar3.t);
                    }
                    java.lang.String strA = a();
                    defpackage.rrx.d(6, "CAR.PROJECTION.CAHI", null, "%s", strA);
                    android.os.Bundle bundle3 = new android.os.Bundle();
                    bundle3.putString("anr_logs", strA);
                    try {
                        qysVar2.h(bundle3);
                    } catch (android.os.RemoteException e) {
                        defpackage.rrx.b("CAR.PROJECTION.CAHI", e, "Failed to log ANR data!");
                    }
                    android.util.SparseArray sparseArray3 = defpackage.ror.a;
                    if (rorVar3.z) {
                        android.os.Process.killProcess(android.os.Process.myPid());
                        java.lang.System.exit(10);
                    }
                    break;
                }
                return true;
            case 25:
                e();
                return true;
            case 26:
                int i13 = parcel.readInt();
                int i14 = parcel.readInt();
                com.google.android.gms.car.DrawingSpec drawingSpec5 = (com.google.android.gms.car.DrawingSpec) defpackage.ijx.a(parcel, com.google.android.gms.car.DrawingSpec.CREATOR);
                android.content.Intent intent4 = (android.content.Intent) defpackage.ijx.a(parcel, android.content.Intent.CREATOR);
                android.content.res.Configuration configuration3 = (android.content.res.Configuration) defpackage.ijx.a(parcel, android.content.res.Configuration.CREATOR);
                android.os.Bundle bundle4 = (android.os.Bundle) defpackage.ijx.a(parcel, android.os.Bundle.CREATOR);
                defpackage.ijx.d(parcel);
                r(i13, i14, drawingSpec5, intent4, configuration3, bundle4);
                return true;
            case 27:
                android.os.IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 == null) {
                    qysVar3 = null;
                } else {
                    android.os.IInterface iInterfaceQueryLocalInterface4 = strongBinder5.queryLocalInterface("com.google.android.gms.car.ICarProjectionCallback");
                    qysVar3 = iInterfaceQueryLocalInterface4 instanceof defpackage.qyu ? (defpackage.qyu) iInterfaceQueryLocalInterface4 : new defpackage.qys(strongBinder5);
                }
                com.google.android.gms.car.KillOptions killOptionsA = defpackage.ijx.a(parcel, com.google.android.gms.car.KillOptions.CREATOR);
                defpackage.ijx.d(parcel);
                defpackage.ror rorVar4 = (defpackage.ror) this.a.get();
                if (!c(rorVar4) && qysVar3 != null && killOptionsA != null) {
                    if (defpackage.omv.c("CAR.PROJECTION.CAHI", 3)) {
                        android.util.SparseArray sparseArray4 = defpackage.ror.a;
                        defpackage.rrx.d(3, "CAR.PROJECTION.CAHI", null, "Binder:%s.kill()", rorVar4.t);
                    }
                    java.lang.String strA2 = a();
                    defpackage.rrx.d(6, "CAR.PROJECTION.CAHI", null, "%s", strA2);
                    android.os.Bundle bundle5 = new android.os.Bundle();
                    if (killOptionsA.b) {
                        bundle5.putString("anr_logs", strA2);
                    }
                    try {
                        qysVar3.h(bundle5);
                    } catch (android.os.RemoteException e2) {
                        defpackage.rrx.b("CAR.PROJECTION.CAHI", e2, "Failed to log ANR data!");
                    }
                    if (killOptionsA.c) {
                        android.util.SparseArray sparseArray5 = defpackage.ror.a;
                        java.util.concurrent.Executors.newSingleThreadExecutor().execute(new defpackage.rid(killOptionsA, 11));
                    } else {
                        android.util.SparseArray sparseArray6 = defpackage.ror.a;
                        if (rorVar4.z) {
                            android.os.Process.killProcess(android.os.Process.myPid());
                            java.lang.System.exit(10);
                        }
                    }
                    break;
                }
                return true;
            case 28:
                android.graphics.Rect rect2 = (android.graphics.Rect) defpackage.ijx.a(parcel, android.graphics.Rect.CREATOR);
                defpackage.ijx.d(parcel);
                n(rect2);
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.qyr
    @java.lang.Deprecated
    public final void f() {
        defpackage.ror rorVar = (defpackage.ror) this.a.get();
        if (c(rorVar)) {
            return;
        }
        if (defpackage.omv.c("CAR.PROJECTION.CAHI", 3)) {
            android.util.SparseArray sparseArray = defpackage.ror.a;
            defpackage.rrx.d(3, "CAR.PROJECTION.CAHI", null, "Binder:%s.killDeprecated()", rorVar.t);
        }
        defpackage.rrx.d(6, "CAR.PROJECTION.CAHI", null, "%s", a());
        android.util.SparseArray sparseArray2 = defpackage.ror.a;
        if (rorVar.z) {
            android.os.Process.killProcess(android.os.Process.myPid());
            java.lang.System.exit(10);
        }
    }

    @Override // defpackage.qyr
    public final void g(int i) {
        defpackage.ror rorVar = (defpackage.ror) this.a.get();
        if (c(rorVar)) {
            return;
        }
        defpackage.rbz.h(new defpackage.rid(rorVar, 12));
    }

    @Override // defpackage.qyr
    public final void h(com.google.android.gms.car.InputFocusChangedEvent inputFocusChangedEvent) {
        defpackage.ror rorVar = (defpackage.ror) this.a.get();
        if (c(rorVar)) {
            if (defpackage.rrx.e("CAR.PROJECTION.CAHI", 2)) {
                defpackage.rrx.d(2, "CAR.PROJECTION.CAHI", null, "Binder: onInputFocusChange(event: %s) service is null", inputFocusChangedEvent);
            }
        } else {
            if (defpackage.omv.c("CAR.PROJECTION.CAHI", 3)) {
                android.util.SparseArray sparseArray = defpackage.ror.a;
                defpackage.rrx.d(3, "CAR.PROJECTION.CAHI", null, "Binder:%s.onInputFocusChange(event: %s)", rorVar.t, inputFocusChangedEvent);
            }
            b(inputFocusChangedEvent);
        }
    }

    @Override // defpackage.qyr
    @java.lang.Deprecated
    public final void i(boolean z) {
        java.lang.ref.WeakReference weakReference = this.a;
        if (c((defpackage.ror) weakReference.get())) {
            if (defpackage.rrx.e("CAR.PROJECTION.CAHI", 2)) {
                defpackage.rrx.d(2, "CAR.PROJECTION.CAHI", null, "Binder: onInputFocusChangeDeprecated(hasFocus:%b) service is null", java.lang.Boolean.valueOf(z));
            }
        } else {
            if (defpackage.rrx.e("CAR.PROJECTION.CAHI", 2)) {
                defpackage.ror rorVar = (defpackage.ror) weakReference.get();
                android.util.SparseArray sparseArray = defpackage.ror.a;
                defpackage.rrx.d(2, "CAR.PROJECTION.CAHI", null, "Binder:%s onInputFocusChangeDeprecated(hasFocus:%b)", rorVar.t, java.lang.Boolean.valueOf(z));
            }
            b(new com.google.android.gms.car.InputFocusChangedEvent(z, true, -1, null));
        }
    }

    @Override // defpackage.qyr
    @java.lang.Deprecated
    public final void j(boolean z, boolean z2) {
        defpackage.ror rorVar = (defpackage.ror) this.a.get();
        if (c(rorVar)) {
            if (defpackage.rrx.e("CAR.PROJECTION.CAHI", 2)) {
                defpackage.rrx.d(2, "CAR.PROJECTION.CAHI", null, "Binder: onInputFocusChangeDeprecated2(hasFocus:%b, notInTouchMode:%b) service is null", java.lang.Boolean.valueOf(z), java.lang.Boolean.valueOf(z2));
            }
        } else {
            if (defpackage.rrx.e("CAR.PROJECTION.CAHI", 2)) {
                android.util.SparseArray sparseArray = defpackage.ror.a;
                defpackage.rrx.d(2, "CAR.PROJECTION.CAHI", null, "Binder:%s onInputFocusChangeDeprecated2(hasFocus:%b, notInTouchMode:%b)", rorVar.t, java.lang.Boolean.valueOf(z), java.lang.Boolean.valueOf(z2));
            }
            b(new com.google.android.gms.car.InputFocusChangedEvent(z, !z2, -1, null));
        }
    }

    @Override // defpackage.qyr
    public final void k(int i, android.view.KeyEvent keyEvent) {
        defpackage.ror rorVar = (defpackage.ror) this.a.get();
        if (c(rorVar)) {
            return;
        }
        defpackage.rbz.h(new defpackage.ron(rorVar, keyEvent, 2));
    }

    @Override // defpackage.qyr
    public final void l(int i, android.view.MotionEvent motionEvent) {
        long jElapsedRealtime;
        defpackage.ror rorVar = (defpackage.ror) this.a.get();
        if (c(rorVar)) {
            return;
        }
        int i2 = 3;
        if (defpackage.omv.c("CAR.PROJECTION.CAHI", 3)) {
            android.util.SparseArray sparseArray = defpackage.ror.a;
            defpackage.rrx.d(3, "CAR.PROJECTION.CAHI", null, "Binder:%s.onMotionEvent(displayId:%s, event:%s)", rorVar.t, java.lang.Integer.valueOf(i), motionEvent);
        }
        if (motionEvent.isFromSource(4098)) {
            defpackage.rbz.h(new oc(rorVar, i, motionEvent, 17));
            try {
                android.util.SparseArray sparseArray2 = defpackage.ror.a;
                java.lang.Object obj = rorVar.D;
                synchronized (obj) {
                    if (defpackage.rrx.e("CAR.PROJECTION.CAHI", 2)) {
                        jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                        defpackage.rrx.d(2, "CAR.PROJECTION.CAHI", null, "Binder:%s onMotionEvent() [activityHasWindowFocus(beforeWait):%b]", rorVar.t, java.lang.Boolean.valueOf(rorVar.E));
                    } else {
                        jElapsedRealtime = 0;
                    }
                    while (!rorVar.E) {
                        obj.wait(500L);
                    }
                    if (defpackage.rrx.e("CAR.PROJECTION.CAHI", 2)) {
                        defpackage.rrx.d(2, "CAR.PROJECTION.CAHI", null, "Binder:%s onMotionEvent() [activityHasWindowFocus(afterWait):%b, waitTimeInMs:%d]", rorVar.t, java.lang.Boolean.valueOf(rorVar.E), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - jElapsedRealtime));
                    }
                }
            } catch (java.lang.InterruptedException e) {
                defpackage.rrx.b("CAR.PROJECTION.CAHI", e, "Error waiting for car activity to receive focus on touch.");
            }
        }
        defpackage.rbz.h(new defpackage.ron(rorVar, motionEvent, i2));
    }

    @Override // defpackage.qyr
    public final void m(android.content.Intent intent) {
        defpackage.ror rorVar = (defpackage.ror) this.a.get();
        if (c(rorVar)) {
            return;
        }
        if (defpackage.omv.c("CAR.PROJECTION.CAHI", 3)) {
            android.util.SparseArray sparseArray = defpackage.ror.a;
            defpackage.rrx.d(3, "CAR.PROJECTION.CAHI", null, "Binder:%s.onNewIntent(%s)", rorVar.t, intent);
        }
        defpackage.rbz.h(new defpackage.rft(rorVar, intent, 20));
    }

    @Override // defpackage.qyr
    public final void n(android.graphics.Rect rect) {
        defpackage.ror rorVar = (defpackage.ror) this.a.get();
        if (c(rorVar)) {
            boolean z = defpackage.rrx.a;
            defpackage.rrx.d(3, "CAR.PROJECTION.CAHI", null, "No CarActivityHost connected, not delivering onNonDrawableInsetsChanged.", new java.lang.Object[0]);
            return;
        }
        if (defpackage.omv.c("CAR.PROJECTION.CAHI", 3)) {
            android.util.SparseArray sparseArray = defpackage.ror.a;
            defpackage.rrx.d(3, "CAR.PROJECTION.CAHI", null, "Binder:%s.onNonDrawableInsetsChanged(%s)", rorVar.t, rect);
        }
        android.util.SparseArray sparseArray2 = defpackage.ror.a;
        rorVar.j();
        new defpackage.stq(android.os.Looper.getMainLooper()).post(new defpackage.kfq(rorVar, rect, 5));
    }

    @Override // defpackage.qyr
    public final void o(int i) {
        defpackage.ror rorVar = (defpackage.ror) this.a.get();
        if (c(rorVar)) {
            return;
        }
        defpackage.rbz.h(new defpackage.rid(rorVar, 9));
    }

    @Override // defpackage.qyr
    public final void p(int i) {
        defpackage.ror rorVar = (defpackage.ror) this.a.get();
        if (c(rorVar)) {
            return;
        }
        if (defpackage.omv.c("CAR.PROJECTION.CAHI", 3)) {
            android.util.SparseArray sparseArray = defpackage.ror.a;
            defpackage.rrx.d(3, "CAR.PROJECTION.CAHI", null, "Binder:%s.onProjectionPause(displayId:%s)", rorVar.t, java.lang.Integer.valueOf(i));
        }
        rorVar.getClass();
        defpackage.rbz.h(new defpackage.rid(rorVar, 8));
    }

    @Override // defpackage.qyr
    public final void q(int i) {
        defpackage.ror rorVar = (defpackage.ror) this.a.get();
        if (c(rorVar)) {
            return;
        }
        if (defpackage.omv.c("CAR.PROJECTION.CAHI", 3)) {
            android.util.SparseArray sparseArray = defpackage.ror.a;
            defpackage.rrx.d(3, "CAR.PROJECTION.CAHI", null, "Binder:%s.onProjectionResume(displayId:%s)", rorVar.t, java.lang.Integer.valueOf(i));
        }
        rorVar.getClass();
        new defpackage.stq(android.os.Looper.getMainLooper()).post(new defpackage.qtk(rorVar, 11));
    }

    @Override // defpackage.qyr
    public final void r(final int i, final int i2, final com.google.android.gms.car.DrawingSpec drawingSpec, final android.content.Intent intent, final android.content.res.Configuration configuration, final android.os.Bundle bundle) {
        final defpackage.ror rorVar = (defpackage.ror) this.a.get();
        if (c(rorVar)) {
            return;
        }
        if (defpackage.omv.c("CAR.PROJECTION.CAHI", 3)) {
            android.util.SparseArray sparseArray = defpackage.ror.a;
            defpackage.rrx.d(3, "CAR.PROJECTION.CAHI", null, "Binder:%s.onProjectionStart(displayId:%d, regionId:%d, spec:%s, currentIntent:%s, config:%s)", rorVar.t, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), drawingSpec, intent, configuration);
        }
        android.util.SparseArray sparseArray2 = defpackage.ror.a;
        rorVar.j();
        new defpackage.stq(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: rol
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.car.display.CarRegionId carRegionId = new com.google.android.gms.car.display.CarRegionId(i2, new com.google.android.gms.car.display.CarDisplayId(i));
                android.util.SparseArray sparseArray3 = defpackage.ror.a;
                rorVar.p(carRegionId, drawingSpec, intent, configuration, bundle);
            }
        });
    }

    @Override // defpackage.qyr
    @java.lang.Deprecated
    public final void s(int i, com.google.android.gms.car.DrawingSpec drawingSpec, android.content.Intent intent, android.os.Bundle bundle) {
        defpackage.ror rorVar = (defpackage.ror) this.a.get();
        if (c(rorVar)) {
            return;
        }
        if (defpackage.omv.c("CAR.PROJECTION.CAHI", 3)) {
            android.util.SparseArray sparseArray = defpackage.ror.a;
            defpackage.rrx.d(3, "CAR.PROJECTION.CAHI", null, "Binder:%s.onProjectionStartDeprecated(displayId:%d, spec:%s, currentIntent:%s)", rorVar.t, java.lang.Integer.valueOf(i), drawingSpec, intent);
        }
        android.util.SparseArray sparseArray2 = defpackage.ror.a;
        rorVar.j();
        defpackage.rbz.h(new ody(rorVar, i, drawingSpec, intent, bundle, 4));
    }

    @Override // defpackage.qyr
    public final void t(int i, com.google.android.gms.car.DrawingSpec drawingSpec, android.content.Intent intent, android.content.res.Configuration configuration, android.os.Bundle bundle) {
        defpackage.ror rorVar = (defpackage.ror) this.a.get();
        if (c(rorVar)) {
            return;
        }
        if (defpackage.omv.c("CAR.PROJECTION.CAHI", 3)) {
            android.util.SparseArray sparseArray = defpackage.ror.a;
            defpackage.rrx.d(3, "CAR.PROJECTION.CAHI", null, "Binder:%s.onProjectionStartWithDisplayIdDeprecated(displayId:%d, spec:%s, currentIntent:%s, config:%s)", rorVar.t, java.lang.Integer.valueOf(i), drawingSpec, intent, configuration);
        }
        android.util.SparseArray sparseArray2 = defpackage.ror.a;
        rorVar.j();
        defpackage.rbz.h(new rom(rorVar, i, drawingSpec, intent, configuration, bundle, 0));
    }

    @Override // defpackage.qyr
    public final void u(int i) {
        defpackage.ror rorVar = (defpackage.ror) this.a.get();
        if (c(rorVar)) {
            return;
        }
        if (defpackage.omv.c("CAR.PROJECTION.CAHI", 3)) {
            android.util.SparseArray sparseArray = defpackage.ror.a;
            defpackage.rrx.d(3, "CAR.PROJECTION.CAHI", null, "Binder:%s.onProjectionStop(displayId:%s)", rorVar.t, java.lang.Integer.valueOf(i));
        }
        rorVar.getClass();
        defpackage.rbz.h(new defpackage.rid(rorVar, 10));
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, java.util.Queue] */
    @Override // defpackage.qyr
    public final void v() {
        defpackage.ror rorVar = (defpackage.ror) this.a.get();
        if (c(rorVar)) {
            return;
        }
        android.util.SparseArray sparseArray = defpackage.ror.a;
        vbd vbdVar = rorVar.M;
        if (vbdVar != null) {
            if (defpackage.omv.c("CAR.INPUT", 3)) {
                defpackage.rrx.a("CAR.INPUT", null, "onStopInput");
            }
            ?? r5 = vbdVar.c;
            synchronized (r5) {
                if (r5.isEmpty()) {
                    defpackage.rrx.d(5, "CAR.INPUT", null, "onStopInput received with no active editable", new java.lang.Object[0]);
                } else {
                    r5.poll();
                }
            }
        }
    }

    @Override // defpackage.qyr
    public final void w(android.graphics.Rect rect) {
        defpackage.ror rorVar = (defpackage.ror) this.a.get();
        if (c(rorVar)) {
            boolean z = defpackage.rrx.a;
            defpackage.rrx.d(3, "CAR.PROJECTION.CAHI", null, "No CarActivityHost connected, not delivering onSystemWindowInsetsChanged.", new java.lang.Object[0]);
            return;
        }
        if (defpackage.omv.c("CAR.PROJECTION.CAHI", 3)) {
            android.util.SparseArray sparseArray = defpackage.ror.a;
            defpackage.rrx.d(3, "CAR.PROJECTION.CAHI", null, "Binder:%s.onSystemWindowInsetsChanged(%s)", rorVar.t, rect);
        }
        android.util.SparseArray sparseArray2 = defpackage.ror.a;
        rorVar.j();
        new defpackage.stq(android.os.Looper.getMainLooper()).post(new defpackage.kfq(rorVar, rect, 6));
    }

    @Override // defpackage.qyr
    public final void x(int i, int i2, com.google.android.gms.car.DrawingSpec drawingSpec, android.content.res.Configuration configuration) {
        defpackage.ror rorVar = (defpackage.ror) this.a.get();
        if (c(rorVar)) {
            return;
        }
        if (defpackage.omv.c("CAR.PROJECTION.CAHI", 3)) {
            android.util.SparseArray sparseArray = defpackage.ror.a;
            defpackage.rrx.d(3, "CAR.PROJECTION.CAHI", null, "Binder:%s.onVideoConfigurationChanged()", rorVar.t);
        }
        android.util.SparseArray sparseArray2 = defpackage.ror.a;
        rorVar.j();
        defpackage.rbz.h(new isx(rorVar, i2, drawingSpec, configuration, 13));
    }

    @Override // defpackage.qyr
    public final void y(com.google.android.gms.car.CarWindowManagerLayoutParams carWindowManagerLayoutParams) {
        defpackage.ror rorVar = (defpackage.ror) this.a.get();
        if (c(rorVar)) {
            return;
        }
        defpackage.rbz.h(new defpackage.rft(rorVar, carWindowManagerLayoutParams, 18));
    }

    @Override // defpackage.qyr
    public final void z(com.google.android.gms.car.DrawingSpec drawingSpec) {
        defpackage.ror rorVar = (defpackage.ror) this.a.get();
        if (c(rorVar)) {
            return;
        }
        defpackage.rbz.h(new defpackage.ron(rorVar, drawingSpec, 0));
    }
}
