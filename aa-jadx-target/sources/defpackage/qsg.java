package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class qsg extends android.app.Service implements defpackage.qto {
    public static final defpackage.yqk a = defpackage.omv.n("CAR.SERVICE");
    protected android.content.Context b;
    private defpackage.quc c;
    private defpackage.qse d;
    private defpackage.rwz e;
    private final defpackage.shj f = new defpackage.shl();
    private defpackage.qtp g;
    private final defpackage.qsf h;
    private final defpackage.qsf i;

    static {
        defpackage.yhx.p("android.permission-group.MICROPHONE", "android.permission-group.PHONE");
    }

    public qsg() {
        final int i = 1;
        this.h = new defpackage.qsf(this) { // from class: qsc
            public final /* synthetic */ defpackage.qsg a;

            {
                this.a = this;
            }

            @Override // defpackage.qsf
            public final void a(android.content.Intent intent) {
                if (i == 0) {
                    if ("com.google.android.gms.car.CarChimeraService.EXIT_APP".equals(intent.getAction())) {
                        this.a.g(com.google.android.gms.car.diagnostics.CriticalError.a(defpackage.zaj.PROTOCOL_BYEBYE_REQUESTED_BY_USER, defpackage.zak.BYEBYE_BY_USER));
                        return;
                    }
                    return;
                }
                java.lang.String action = intent.getAction();
                boolean zEquals = "com.google.android.gms.car.CarChimeraService.EXIT_APP".equals(action);
                defpackage.qsg qsgVar = this.a;
                if (zEquals) {
                    qsgVar.g(com.google.android.gms.car.diagnostics.CriticalError.a(defpackage.zaj.PROTOCOL_BYEBYE_REQUESTED_BY_USER, defpackage.zak.BYEBYE_BY_USER));
                } else {
                    if (!"android.hardware.usb.action.USB_ACCESSORY_DETACHED".equals(action) || ((android.hardware.usb.UsbAccessory) intent.getParcelableExtra("accessory")) == null) {
                        return;
                    }
                    qsgVar.g(com.google.android.gms.car.diagnostics.CriticalError.a(defpackage.zaj.PROTOCOL_BYEBYE_REQUESTED_BY_USER, defpackage.zak.BYEBYE_BY_USER));
                }
            }
        };
        final int i2 = 0;
        this.i = new defpackage.qsf(this) { // from class: qsc
            public final /* synthetic */ defpackage.qsg a;

            {
                this.a = this;
            }

            @Override // defpackage.qsf
            public final void a(android.content.Intent intent) {
                if (i2 == 0) {
                    if ("com.google.android.gms.car.CarChimeraService.EXIT_APP".equals(intent.getAction())) {
                        this.a.g(com.google.android.gms.car.diagnostics.CriticalError.a(defpackage.zaj.PROTOCOL_BYEBYE_REQUESTED_BY_USER, defpackage.zak.BYEBYE_BY_USER));
                        return;
                    }
                    return;
                }
                java.lang.String action = intent.getAction();
                boolean zEquals = "com.google.android.gms.car.CarChimeraService.EXIT_APP".equals(action);
                defpackage.qsg qsgVar = this.a;
                if (zEquals) {
                    qsgVar.g(com.google.android.gms.car.diagnostics.CriticalError.a(defpackage.zaj.PROTOCOL_BYEBYE_REQUESTED_BY_USER, defpackage.zak.BYEBYE_BY_USER));
                } else {
                    if (!"android.hardware.usb.action.USB_ACCESSORY_DETACHED".equals(action) || ((android.hardware.usb.UsbAccessory) intent.getParcelableExtra("accessory")) == null) {
                        return;
                    }
                    qsgVar.g(com.google.android.gms.car.diagnostics.CriticalError.a(defpackage.zaj.PROTOCOL_BYEBYE_REQUESTED_BY_USER, defpackage.zak.BYEBYE_BY_USER));
                }
            }
        };
    }

    protected defpackage.ryi a() {
        return new phu(2);
    }

    protected defpackage.xyn b() {
        return defpackage.xxe.a;
    }

    protected boolean d() {
        return defpackage.qtq.a(this.b, "android.permission.DUMP") == 0;
    }

    @Override // android.app.Service
    public final void dump(java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        if (!d()) {
            printWriter.println("Permission Denial: can't dump CarService from from pid=" + android.os.Binder.getCallingPid() + ", uid=" + android.os.Binder.getCallingUid());
            return;
        }
        defpackage.omv.o(printWriter);
        printWriter.println("No module info for gms-independent lib.");
        int length = strArr.length;
        if (length == 0) {
            defpackage.quc qucVar = this.c;
            if (qucVar != null) {
                qucVar.d(printWriter);
                return;
            }
            return;
        }
        java.lang.String str = strArr[0];
        if (str.hashCode() != 113762 || !str.equals("set")) {
            printWriter.println("Error: Unknown command: ".concat(java.lang.String.valueOf(str)));
            return;
        }
        if (length < 4) {
            printWriter.println("Error: not enough arguments to set.");
            printWriter.println("set [setting] [string|boolean] [value]");
            return;
        }
        try {
            java.lang.String str2 = strArr[2];
            int iHashCode = str2.hashCode();
            if (iHashCode == -891985903) {
                if (str2.equals("string")) {
                    this.c.aW(strArr[1], strArr[3]);
                    printWriter.println("Success. Set " + strArr[1] + " to " + strArr[3]);
                    return;
                }
                printWriter.println(defpackage.a.bA(str2, "Error: Unknown value type: "));
            }
            if (iHashCode == -189262159) {
                if (str2.equals("stringset")) {
                    this.c.aX(strArr[1], java.util.Arrays.asList(strArr[3].split(",", -1)));
                    printWriter.println("Success. Set " + strArr[1] + " to " + strArr[3]);
                    return;
                }
                printWriter.println(defpackage.a.bA(str2, "Error: Unknown value type: "));
            }
            if (iHashCode == 64711720 && str2.equals("boolean")) {
                if (strArr[3].equals("true")) {
                    this.c.aR(strArr[1], true);
                } else {
                    if (!strArr[3].equals("false")) {
                        printWriter.println("Error: Unrecognized boolean value: " + strArr[3]);
                        return;
                    }
                    this.c.aR(strArr[1], false);
                }
                printWriter.println("Success. Set " + strArr[1] + " to " + strArr[3]);
                return;
            }
            printWriter.println(defpackage.a.bA(str2, "Error: Unknown value type: "));
        } catch (java.lang.IllegalStateException e) {
            printWriter.println("Error: ".concat(java.lang.String.valueOf(e.getMessage())));
        }
    }

    @Override // defpackage.qto
    public final void e() {
        stopForeground(true);
        a.f().ai(7808).u("stopped foreground service");
    }

    @Override // defpackage.qto
    public final void f() {
        defpackage.dte dteVar = new defpackage.dte(this.b, null);
        dteVar.i(getString(2132083282));
        dteVar.h(getString(2132083343));
        dteVar.n(2131231122);
        dteVar.t = getResources().getColor(2131100013);
        dteVar.i = 2;
        getString(2132083282);
        defpackage.vsl vslVarH = defpackage.vsl.h(this.b);
        if (vslVarH.e("car.default_notification_channel") == null) {
            a.l().ai(7802).y("Creating notification channel %s", "car.default_notification_channel");
            vslVarH.f(new android.app.NotificationChannel("car.default_notification_channel", getString(2132083282), 3));
        }
        dteVar.x = "car.default_notification_channel";
        c(this.b, dteVar);
        android.app.Notification notificationA = dteVar.a();
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            ped$.ExternalSyntheticApiModelOutline8.m(this, 2, notificationA, defpackage.rox.f(this.b, defpackage.ygw.s(16, 128, 8)));
        } else {
            startForeground(2, notificationA);
        }
        a.f().ai(7810).u("started foreground service");
    }

    public final void g(com.google.android.gms.car.diagnostics.CriticalError criticalError) {
        this.c.f(criticalError);
    }

    @Override // defpackage.qto
    public final void h() {
        a.l().ai(7826).u("requestStop");
        stopSelf();
    }

    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent intent) {
        defpackage.yqk yqkVar = a;
        yqkVar.l().ai(7811).u("onBind");
        defpackage.rit ritVar = defpackage.rit.INSTANCE;
        if (!defpackage.a.N()) {
            yqkVar.l().ai(7813).u("shouldRunCarChimeraService is false - return null IBinder.");
            return null;
        }
        if (!"com.google.android.gms.car.service.START".equals(intent.getAction())) {
            yqkVar.h().ai(7812).y("No binder for action %s", intent.getAction());
            return null;
        }
        defpackage.rwz rwzVar = this.e;
        rwzVar.asBinder();
        return rwzVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // android.app.Service
    public void onCreate() {
        android.content.Context contextM;
        super.onCreate();
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            defpackage.rit ritVar = defpackage.rit.INSTANCE;
            if (defpackage.acve.g()) {
                contextM = pdw$.ExternalSyntheticApiModelOutline1.m(this, 0);
            } else {
                contextM = this;
            }
        } else {
            contextM = this;
        }
        this.b = contextM;
        defpackage.tfv.e(defpackage.tfu.c, defpackage.yzn.b((int) defpackage.acxb.a.fF().a()) == defpackage.yzn.PROD ? 500 : 1000);
        this.g = defpackage.qtp.a(this.b);
        a.f().ai(7814).u("onCreate");
        android.content.Context context = this.b;
        this.c = new defpackage.quc(new defpackage.qtj(this, context.getApplicationContext(), context, this.g, defpackage.ryk.b(context, b(), a()), defpackage.rit.INSTANCE));
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.hardware.usb.action.USB_ACCESSORY_DETACHED");
        intentFilter.addAction("com.google.android.gms.car.CarChimeraService.EXIT_APP");
        this.d = new defpackage.qse(this.h);
        defpackage.duw.e(this.b, this.d, intentFilter, null, true != defpackage.acsj.a.fF().h() ? 2 : 4);
        android.content.Context context2 = this.b;
        int i = defpackage.rwz.a;
        defpackage.quc qucVar = this.c;
        defpackage.sak sakVar = defpackage.sak.a;
        qucVar.getClass();
        sakVar.getClass();
        this.e = new defpackage.rwz(context2, qucVar, sakVar, defpackage.slj.a(context2));
    }

    @Override // android.app.Service
    public void onDestroy() {
        a.f().ai(7815).u("onDestroy");
        defpackage.qse qseVar = this.d;
        if (qseVar != null) {
            this.b.unregisterReceiver(qseVar);
            this.d = null;
        }
        super.onDestroy();
        this.c.j();
    }

    @Override // android.app.Service
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final int onStartCommand(android.content.Intent intent, int i, int i2) {
        xiw xiwVarB;
        final defpackage.sde sdcVar;
        long j;
        defpackage.yqk yqkVar = a;
        yqkVar.l().ai(7817).D("onStartCommand start id %d: %s", i2, intent);
        if (intent == null) {
            stopSelf(i2);
            return 2;
        }
        defpackage.rit ritVar = defpackage.rit.INSTANCE;
        if (!defpackage.a.N()) {
            yqkVar.l().ai(7825).u("shouldRunCarChimeraService is false - don't start service.");
            return 2;
        }
        if (!this.f.b(this.b, intent)) {
            yqkVar.h().ai(7824).u("Failed validation, not starting anything");
            return 2;
        }
        if ("com.google.android.gms.car.HANDOFF".equals(intent.getAction())) {
            android.os.IBinder iBinder = ((com.google.android.gms.carsetup.BinderParcel) intent.getParcelableExtra("connection_tear_down_helper")).a;
            if (iBinder == null) {
                sdcVar = null;
            } else {
                sdc sdcVarQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.carsetup.ITransferStateCallbacks");
                sdcVar = sdcVarQueryLocalInterface instanceof defpackage.sde ? (defpackage.sde) sdcVarQueryLocalInterface : new sdc(iBinder);
            }
            java.io.Closeable closeable = new java.io.Closeable() { // from class: qsd
                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    defpackage.yqk yqkVar2 = defpackage.qsg.a;
                    try {
                        sdcVar.a();
                    } catch (android.os.RemoteException e) {
                        defpackage.qsg.a.h().p(e).ai(7806).u("Failed to call transferStateCallbacks.close().");
                    }
                }
            };
            defpackage.qte qteVarA = this.c.a();
            intent.getByteArrayExtra("car_handoff_car_info").getClass();
            android.os.Parcelable.Creator<com.google.android.gms.carsetup.CarInfoInternal> creator = com.google.android.gms.carsetup.CarInfoInternal.CREATOR;
            byte[] byteArrayExtra = intent.getByteArrayExtra("car_handoff_car_info");
            com.google.android.gms.common.internal.safeparcel.SafeParcelable safeParcelableL = byteArrayExtra == null ? null : defpackage.sqs.l(byteArrayExtra, creator);
            boolean booleanExtra = intent.getBooleanExtra("car_handoff_is_car_audio_service_migration_enabled", false);
            int intExtra = intent.getIntExtra("car_handoff_connection_type", 1);
            defpackage.qtn qtnVar = new defpackage.qtn(this.b, intExtra, intent.getIntExtra("car_handoff_analytics_session_id", 0), closeable, (com.google.android.gms.carsetup.CarInfoInternal) safeParcelableL, booleanExtra, (com.google.android.gms.car.bluetooth.data.CarBluetoothData) intent.getParcelableExtra("car_handoff_starting_bluetooth_device"), qteVarA.a());
            final android.content.ComponentName componentNameUnflattenFromString = android.content.ComponentName.unflattenFromString(intent.getStringExtra("car_handoff_component"));
            final long longExtra = intent.getLongExtra("car_handoff_session_id", 0L);
            boolean booleanExtra2 = intent.getBooleanExtra("car_handoff_user_authorized_projection", false);
            componentNameUnflattenFromString.flattenToString();
            qtnVar.j = booleanExtra2;
            if (longExtra != qtnVar.g) {
                qtnVar.g = longExtra;
                defpackage.shm shmVar = qtnVar.b;
                final defpackage.rty rtyVar = qtnVar.c;
                final defpackage.shu shuVar = (defpackage.shu) shmVar;
                java.lang.Runnable runnable = new java.lang.Runnable() { // from class: shn
                    @Override // java.lang.Runnable
                    public final void run() {
                        defpackage.shu shuVar2 = shuVar;
                        defpackage.ysr.bk(shuVar2.g == null, "Cannot resume already live car connection");
                        shuVar2.g = new defpackage.shp(shuVar2, longExtra, componentNameUnflattenFromString, rtyVar);
                        defpackage.shp shpVar = shuVar2.g;
                        android.content.Intent intent2 = new android.content.Intent();
                        intent2.setComponent(shpVar.c);
                        int i3 = true != defpackage.sqs.e() ? 65 : 4161;
                        defpackage.sqf sqfVarA = defpackage.sqf.a();
                        defpackage.shu shuVar3 = shpVar.h;
                        if (sqfVarA.d(shuVar3.b, intent2, shpVar, i3)) {
                            shpVar.i = 1;
                        }
                        if (shpVar.i != 1) {
                            shuVar3.h.e();
                        }
                    }
                };
                j = longExtra;
                shuVar.c.post(runnable);
            } else {
                j = longExtra;
            }
            defpackage.ypu ypuVarAi = yqkVar.f().ai(7822);
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(intExtra);
            defpackage.zke zkeVar = defpackage.zke.a;
            ypuVarAi.H("Overriding delegate with new Lite CarServiceBinder, sessionId: %d, connectionType: %s", j, new defpackage.zkf(zkeVar, numValueOf));
            defpackage.ysr.bk(defpackage.a.g(this.c.k, qteVarA, qtnVar), "Failed to update delegate");
            yqkVar.f().ai(7823).y("Updating receiver callback and sessionId for connectionType: %s", new defpackage.zkf(zkeVar, numValueOf));
            this.d.b(intExtra == 2 ? this.i : this.h);
        } else if ("com.google.android.gms.car.HANDOFF_USER_AUTHORIZATION".equals(intent.getAction())) {
            defpackage.qte qteVarA2 = this.c.a();
            long longExtra2 = intent.getLongExtra("car_handoff_session_id", 0L);
            int intExtra2 = intent.getIntExtra("car_handoff_connection_type", 1);
            if (qteVarA2.a() != qteVarA2) {
                defpackage.qtn qtnVar2 = (defpackage.qtn) qteVarA2;
                if (qtnVar2.g == longExtra2) {
                    boolean booleanExtra3 = intent.getBooleanExtra("car_handoff_user_authorized_projection", false);
                    if (booleanExtra3 || !intent.hasExtra("car_handoff_user_not_authorized_projection_bye_bye_reason")) {
                        xiwVarB = null;
                    } else {
                        int intExtra3 = intent.getIntExtra("car_handoff_user_not_authorized_projection_bye_bye_reason", 0);
                        xiwVarB = xiw.b(intExtra3);
                        if (xiwVarB == null) {
                            yqkVar.g().ai(7821).w("Unknown ByeByeReason number %d given, should never happen", intExtra3);
                        }
                    }
                    qtnVar2.j = booleanExtra3;
                    if (longExtra2 == qtnVar2.g) {
                        if (!booleanExtra3) {
                            if (xiwVarB != null) {
                                defpackage.shm shmVar2 = qtnVar2.b;
                                defpackage.shu.a.f().ai(8968).w("Teardown initiated for ByeByeReason %d", xiwVarB.i);
                                ((defpackage.shu) shmVar2).c.post(new sbj(shmVar2, xiwVarB, 5, (byte[]) null));
                            } else {
                                qtnVar2.b.a();
                            }
                            qtnVar2.a().e();
                            qtnVar2.a().f(com.google.android.gms.car.diagnostics.CriticalError.a(defpackage.zaj.PROTOCOL_BYEBYE_REQUESTED_BY_USER, defpackage.zak.BYEBYE_BY_USER));
                            qtnVar2.m();
                        } else if (qtnVar2.i) {
                            qtnVar2.o();
                        }
                    }
                    yqkVar.f().ai(7820).y("Updating receiver callback and sessionId for connectionType: %s", new defpackage.zkf(defpackage.zke.a, java.lang.Integer.valueOf(intExtra2)));
                    this.d.b(intExtra2 == 2 ? this.i : this.h);
                } else {
                    yqkVar.h().ai(7819).x("received user authorization on an invalid session %d", longExtra2);
                }
            } else {
                yqkVar.h().ai(7818).u("received user authorization without car handoff command");
            }
        }
        return 2;
    }

    protected void c(android.content.Context context, defpackage.dte dteVar) {
    }
}
