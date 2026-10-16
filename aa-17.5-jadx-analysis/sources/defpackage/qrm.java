package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.hardware.usb.UsbAccessory;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.car.bluetooth.data.CarBluetoothData;
import com.google.android.gms.car.diagnostics.CriticalError;
import com.google.android.gms.carsetup.BinderParcel;
import com.google.android.gms.carsetup.CarInfoInternal;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.projection.gearhead.R;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

/* loaded from: classes.dex */
public class qrm extends Service implements qss {
    public static final ypf a = ols.R("CAR.SERVICE");
    protected Context b;
    private qtg c;
    private qrk d;
    private rwg e;
    private final sgn f = new sgp();
    private qst g;
    private final qrl h;
    private final qrl i;

    static {
        ygr.p("android.permission-group.MICROPHONE", "android.permission-group.PHONE");
    }

    public qrm() {
        final int i = 1;
        this.h = new qrl(this) { // from class: qri
            public final /* synthetic */ qrm a;

            {
                this.a = this;
            }

            @Override // defpackage.qrl
            public final void a(Intent intent) {
                if (i == 0) {
                    if ("com.google.android.gms.car.CarChimeraService.EXIT_APP".equals(intent.getAction())) {
                        this.a.g(CriticalError.a(yze.PROTOCOL_BYEBYE_REQUESTED_BY_USER, yzf.BYEBYE_BY_USER));
                        return;
                    }
                    return;
                }
                String action = intent.getAction();
                boolean zEquals = "com.google.android.gms.car.CarChimeraService.EXIT_APP".equals(action);
                qrm qrmVar = this.a;
                if (zEquals) {
                    qrmVar.g(CriticalError.a(yze.PROTOCOL_BYEBYE_REQUESTED_BY_USER, yzf.BYEBYE_BY_USER));
                } else {
                    if (!"android.hardware.usb.action.USB_ACCESSORY_DETACHED".equals(action) || ((UsbAccessory) intent.getParcelableExtra("accessory")) == null) {
                        return;
                    }
                    qrmVar.g(CriticalError.a(yze.PROTOCOL_BYEBYE_REQUESTED_BY_USER, yzf.BYEBYE_BY_USER));
                }
            }
        };
        final int i2 = 0;
        this.i = new qrl(this) { // from class: qri
            public final /* synthetic */ qrm a;

            {
                this.a = this;
            }

            @Override // defpackage.qrl
            public final void a(Intent intent) {
                if (i2 == 0) {
                    if ("com.google.android.gms.car.CarChimeraService.EXIT_APP".equals(intent.getAction())) {
                        this.a.g(CriticalError.a(yze.PROTOCOL_BYEBYE_REQUESTED_BY_USER, yzf.BYEBYE_BY_USER));
                        return;
                    }
                    return;
                }
                String action = intent.getAction();
                boolean zEquals = "com.google.android.gms.car.CarChimeraService.EXIT_APP".equals(action);
                qrm qrmVar = this.a;
                if (zEquals) {
                    qrmVar.g(CriticalError.a(yze.PROTOCOL_BYEBYE_REQUESTED_BY_USER, yzf.BYEBYE_BY_USER));
                } else {
                    if (!"android.hardware.usb.action.USB_ACCESSORY_DETACHED".equals(action) || ((UsbAccessory) intent.getParcelableExtra("accessory")) == null) {
                        return;
                    }
                    qrmVar.g(CriticalError.a(yze.PROTOCOL_BYEBYE_REQUESTED_BY_USER, yzf.BYEBYE_BY_USER));
                }
            }
        };
    }

    protected rxp a() {
        return new pgy(2);
    }

    protected xxh b() {
        return xvy.a;
    }

    protected boolean d() {
        return qsu.a(this.b, "android.permission.DUMP") == 0;
    }

    @Override // android.app.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (!d()) {
            printWriter.println("Permission Denial: can't dump CarService from from pid=" + Binder.getCallingPid() + ", uid=" + Binder.getCallingUid());
            return;
        }
        ols.S(printWriter);
        printWriter.println("No module info for gms-independent lib.");
        int length = strArr.length;
        if (length == 0) {
            qtg qtgVar = this.c;
            if (qtgVar != null) {
                qtgVar.d(printWriter);
                return;
            }
            return;
        }
        String str = strArr[0];
        if (str.hashCode() != 113762 || !str.equals("set")) {
            printWriter.println("Error: Unknown command: ".concat(String.valueOf(str)));
            return;
        }
        if (length < 4) {
            printWriter.println("Error: not enough arguments to set.");
            printWriter.println("set [setting] [string|boolean] [value]");
            return;
        }
        try {
            String str2 = strArr[2];
            int iHashCode = str2.hashCode();
            if (iHashCode == -891985903) {
                if (str2.equals("string")) {
                    this.c.aW(strArr[1], strArr[3]);
                    printWriter.println("Success. Set " + strArr[1] + " to " + strArr[3]);
                    return;
                }
                printWriter.println(a.bz(str2, "Error: Unknown value type: "));
            }
            if (iHashCode == -189262159) {
                if (str2.equals("stringset")) {
                    this.c.aX(strArr[1], Arrays.asList(strArr[3].split(",", -1)));
                    printWriter.println("Success. Set " + strArr[1] + " to " + strArr[3]);
                    return;
                }
                printWriter.println(a.bz(str2, "Error: Unknown value type: "));
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
            printWriter.println(a.bz(str2, "Error: Unknown value type: "));
        } catch (IllegalStateException e) {
            printWriter.println("Error: ".concat(String.valueOf(e.getMessage())));
        }
    }

    @Override // defpackage.qss
    public final void e() {
        stopForeground(true);
        a.f().ai(7783).u("stopped foreground service");
    }

    @Override // defpackage.qss
    public final void f() {
        dsx dsxVar = new dsx(this.b, null);
        dsxVar.i(getString(R.string.car_app_name));
        dsxVar.h(getString(R.string.car_notification_message));
        dsxVar.n(2131231122);
        dsxVar.t = getResources().getColor(R.color.car_light_blue_500);
        dsxVar.i = 2;
        getString(R.string.car_app_name);
        kwp kwpVarE = kwp.e(this.b);
        if (kwpVarE.c("car.default_notification_channel") == null) {
            a.l().ai(7777).y("Creating notification channel %s", "car.default_notification_channel");
            kwpVarE.d(new NotificationChannel("car.default_notification_channel", getString(R.string.car_app_name), 3));
        }
        dsxVar.x = "car.default_notification_channel";
        c(this.b, dsxVar);
        Notification notificationA = dsxVar.a();
        if (Build.VERSION.SDK_INT >= 34) {
            startForeground(2, notificationA, qrv.x(this.b, yfq.s(16, 128, 8)));
        } else {
            startForeground(2, notificationA);
        }
        a.f().ai(7785).u("started foreground service");
    }

    public final void g(CriticalError criticalError) {
        this.c.f(criticalError);
    }

    @Override // defpackage.qss
    public final void h() {
        a.l().ai(7801).u("requestStop");
        stopSelf();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        ypf ypfVar = a;
        ypfVar.l().ai(7786).u("onBind");
        rhx rhxVar = rhx.c;
        if (!a.O()) {
            ypfVar.l().ai(7788).u("shouldRunCarChimeraService is false - return null IBinder.");
            return null;
        }
        if (!"com.google.android.gms.car.service.START".equals(intent.getAction())) {
            ypfVar.h().ai(7787).y("No binder for action %s", intent.getAction());
            return null;
        }
        rwg rwgVar = this.e;
        rwgVar.asBinder();
        return rwgVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate() {
        /*
            r8 = this;
            super.onCreate()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto L17
            rhx r0 = defpackage.rhx.c
            boolean r0 = defpackage.acuc.g()
            if (r0 == 0) goto L17
            r0 = 0
            android.content.Context r0 = defpackage.pda$$ExternalSyntheticApiModelOutline1.m(r8, r0)
            goto L18
        L17:
            r0 = r8
        L18:
            r8.b = r0
            acvz r0 = defpackage.acvz.a
            acwa r0 = r0.gu()
            long r0 = r0.a()
            int r0 = (int) r0
            yyi r0 = defpackage.yyi.b(r0)
            tey r1 = defpackage.tey.c
            yyi r2 = defpackage.yyi.PROD
            if (r0 != r2) goto L32
            r0 = 500(0x1f4, float:7.0E-43)
            goto L34
        L32:
            r0 = 1000(0x3e8, float:1.401E-42)
        L34:
            defpackage.tez.e(r1, r0)
            android.content.Context r0 = r8.b
            qst r0 = defpackage.qst.a(r0)
            r8.g = r0
            ypf r0 = defpackage.qrm.a
            yop r0 = r0.f()
            r1 = 7789(0x1e6d, float:1.0915E-41)
            yop r0 = r0.ai(r1)
            java.lang.String r1 = "onCreate"
            r0.u(r1)
            qtg r0 = new qtg
            qso r1 = new qso
            android.content.Context r4 = r8.b
            qst r5 = r8.g
            xxh r2 = r8.b()
            rxp r3 = r8.a()
            r6 = r3
            android.content.Context r3 = r4.getApplicationContext()
            rxr r6 = defpackage.rxr.b(r4, r2, r6)
            rhx r7 = defpackage.rhx.c
            r2 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.<init>(r1)
            r2.c = r0
            android.content.IntentFilter r8 = new android.content.IntentFilter
            r8.<init>()
            java.lang.String r0 = "android.hardware.usb.action.USB_ACCESSORY_DETACHED"
            r8.addAction(r0)
            java.lang.String r0 = "com.google.android.gms.car.CarChimeraService.EXIT_APP"
            r8.addAction(r0)
            qrl r0 = r2.h
            qrk r1 = new qrk
            r1.<init>(r0)
            r2.d = r1
            r0 = 1
            boolean r1 = defpackage.acrh.h()
            if (r0 == r1) goto L95
            r0 = 2
            goto L96
        L95:
            r0 = 4
        L96:
            android.content.Context r1 = r2.b
            qrk r3 = r2.d
            r4 = 0
            defpackage.dup.e(r1, r3, r8, r4, r0)
            android.content.Context r8 = r2.b
            int r0 = defpackage.rwg.a
            qtg r0 = r2.c
            rzo r1 = defpackage.rzo.a
            rwg r3 = new rwg
            r0.getClass()
            r1.getClass()
            skn r4 = defpackage.skn.a(r8)
            r3.<init>(r8, r0, r1, r4)
            r2.e = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qrm.onCreate():void");
    }

    @Override // android.app.Service
    public void onDestroy() {
        a.f().ai(7790).u("onDestroy");
        qrk qrkVar = this.d;
        if (qrkVar != null) {
            this.b.unregisterReceiver(qrkVar);
            this.d = null;
        }
        super.onDestroy();
        this.c.j();
    }

    @Override // android.app.Service
    @ResultIgnorabilityUnspecified
    public final int onStartCommand(Intent intent, int i, int i2) {
        xhv xhvVarB;
        final sci scgVar;
        long j;
        ypf ypfVar = a;
        ypfVar.l().ai(7792).D("onStartCommand start id %d: %s", i2, intent);
        if (intent == null) {
            stopSelf(i2);
            return 2;
        }
        rhx rhxVar = rhx.c;
        if (!a.O()) {
            ypfVar.l().ai(7800).u("shouldRunCarChimeraService is false - don't start service.");
            return 2;
        }
        if (!this.f.b(this.b, intent)) {
            ypfVar.h().ai(7799).u("Failed validation, not starting anything");
            return 2;
        }
        if ("com.google.android.gms.car.HANDOFF".equals(intent.getAction())) {
            IBinder iBinder = ((BinderParcel) intent.getParcelableExtra("connection_tear_down_helper")).a;
            if (iBinder == null) {
                scgVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.carsetup.ITransferStateCallbacks");
                scgVar = iInterfaceQueryLocalInterface instanceof sci ? (sci) iInterfaceQueryLocalInterface : new scg(iBinder);
            }
            Closeable closeable = new Closeable() { // from class: qrj
                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    ypf ypfVar2 = qrm.a;
                    try {
                        scgVar.a();
                    } catch (RemoteException e) {
                        qrm.a.h().p(e).ai(7781).u("Failed to call transferStateCallbacks.close().");
                    }
                }
            };
            qsk qskVarA = this.c.a();
            intent.getByteArrayExtra("car_handoff_car_info").getClass();
            Parcelable.Creator<CarInfoInternal> creator = CarInfoInternal.CREATOR;
            byte[] byteArrayExtra = intent.getByteArrayExtra("car_handoff_car_info");
            SafeParcelable safeParcelableH = byteArrayExtra == null ? null : spu.h(byteArrayExtra, creator);
            boolean booleanExtra = intent.getBooleanExtra("car_handoff_is_car_audio_service_migration_enabled", false);
            int intExtra = intent.getIntExtra("car_handoff_connection_type", 1);
            qsr qsrVar = new qsr(this.b, intExtra, intent.getIntExtra("car_handoff_analytics_session_id", 0), closeable, (CarInfoInternal) safeParcelableH, booleanExtra, (CarBluetoothData) intent.getParcelableExtra("car_handoff_starting_bluetooth_device"), qskVarA.a());
            final ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(intent.getStringExtra("car_handoff_component"));
            final long longExtra = intent.getLongExtra("car_handoff_session_id", 0L);
            boolean booleanExtra2 = intent.getBooleanExtra("car_handoff_user_authorized_projection", false);
            componentNameUnflattenFromString.flattenToString();
            qsrVar.j = booleanExtra2;
            if (longExtra != qsrVar.g) {
                qsrVar.g = longExtra;
                sgq sgqVar = qsrVar.b;
                final rtf rtfVar = qsrVar.c;
                final sgx sgxVar = (sgx) sgqVar;
                Runnable runnable = new Runnable() { // from class: sgr
                    @Override // java.lang.Runnable
                    public final void run() {
                        sgx sgxVar2 = sgxVar;
                        woy.aa(sgxVar2.g == null, "Cannot resume already live car connection");
                        sgxVar2.g = new sgs(sgxVar2, longExtra, componentNameUnflattenFromString, rtfVar);
                        sgs sgsVar = sgxVar2.g;
                        Intent intent2 = new Intent();
                        intent2.setComponent(sgsVar.c);
                        int i3 = true != spu.c() ? 65 : 4161;
                        spi spiVarA = spi.a();
                        sgx sgxVar3 = sgsVar.h;
                        if (spiVarA.d(sgxVar3.b, intent2, sgsVar, i3)) {
                            sgsVar.i = 1;
                        }
                        if (sgsVar.i != 1) {
                            sgxVar3.h.f();
                        }
                    }
                };
                j = longExtra;
                sgxVar.c.post(runnable);
            } else {
                j = longExtra;
            }
            yop yopVarAi = ypfVar.f().ai(7797);
            Integer numValueOf = Integer.valueOf(intExtra);
            zjc zjcVar = zjc.a;
            yopVarAi.H("Overriding delegate with new Lite CarServiceBinder, sessionId: %d, connectionType: %s", j, new zjd(zjcVar, numValueOf));
            woy.aa(a.h(this.c.k, qskVarA, qsrVar), "Failed to update delegate");
            ypfVar.f().ai(7798).y("Updating receiver callback and sessionId for connectionType: %s", new zjd(zjcVar, numValueOf));
            this.d.b(intExtra == 2 ? this.i : this.h);
        } else if ("com.google.android.gms.car.HANDOFF_USER_AUTHORIZATION".equals(intent.getAction())) {
            qsk qskVarA2 = this.c.a();
            long longExtra2 = intent.getLongExtra("car_handoff_session_id", 0L);
            int intExtra2 = intent.getIntExtra("car_handoff_connection_type", 1);
            if (qskVarA2.a() != qskVarA2) {
                qsr qsrVar2 = (qsr) qskVarA2;
                if (qsrVar2.g == longExtra2) {
                    boolean booleanExtra3 = intent.getBooleanExtra("car_handoff_user_authorized_projection", false);
                    if (booleanExtra3 || !intent.hasExtra("car_handoff_user_not_authorized_projection_bye_bye_reason")) {
                        xhvVarB = null;
                    } else {
                        int intExtra3 = intent.getIntExtra("car_handoff_user_not_authorized_projection_bye_bye_reason", 0);
                        xhvVarB = xhv.b(intExtra3);
                        if (xhvVarB == null) {
                            ypfVar.g().ai(7796).w("Unknown ByeByeReason number %d given, should never happen", intExtra3);
                        }
                    }
                    qsrVar2.j = booleanExtra3;
                    if (longExtra2 == qsrVar2.g) {
                        if (!booleanExtra3) {
                            if (xhvVarB != null) {
                                sgq sgqVar2 = qsrVar2.b;
                                sgx.a.f().ai(8943).w("Teardown initiated for ByeByeReason %d", xhvVarB.i);
                                ((sgx) sgqVar2).c.post(new sbj(sgqVar2, xhvVarB, 2));
                            } else {
                                qsrVar2.b.a();
                            }
                            qsrVar2.a().e();
                            qsrVar2.a().f(CriticalError.a(yze.PROTOCOL_BYEBYE_REQUESTED_BY_USER, yzf.BYEBYE_BY_USER));
                            qsrVar2.m();
                        } else if (qsrVar2.i) {
                            qsrVar2.o();
                        }
                    }
                    ypfVar.f().ai(7795).y("Updating receiver callback and sessionId for connectionType: %s", new zjd(zjc.a, Integer.valueOf(intExtra2)));
                    this.d.b(intExtra2 == 2 ? this.i : this.h);
                } else {
                    ypfVar.h().ai(7794).x("received user authorization on an invalid session %d", longExtra2);
                }
            } else {
                ypfVar.h().ai(7793).u("received user authorization without car handoff command");
            }
        }
        return 2;
    }

    protected void c(Context context, dsx dsxVar) {
    }
}
