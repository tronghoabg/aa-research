package com.google.android.gms.carsetup;

import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.Service;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.hardware.usb.UsbAccessory;
import android.net.wifi.WifiInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.PowerManager;
import android.os.Process;
import android.os.RemoteException;
import android.util.ArrayMap;
import android.util.SparseArray;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.carsetup.CarSetupServiceImpl;
import com.google.android.gms.carsetup.setup.SetupBinder;
import com.google.android.gms.carsetup.setup.UsbConnectionHelper;
import com.google.android.projection.gearhead.R;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import defpackage.a;
import defpackage.abnp;
import defpackage.acrb;
import defpackage.acrh;
import defpackage.adar;
import defpackage.kwp;
import defpackage.lgx;
import defpackage.ols;
import defpackage.qst;
import defpackage.qzn;
import defpackage.qzp;
import defpackage.rbe;
import defpackage.rhw;
import defpackage.rhx;
import defpackage.rhy;
import defpackage.rhz;
import defpackage.rlg;
import defpackage.rlh;
import defpackage.rlr;
import defpackage.rls;
import defpackage.roc;
import defpackage.rod;
import defpackage.rpo;
import defpackage.rrq;
import defpackage.rrx;
import defpackage.rsk;
import defpackage.rsv;
import defpackage.rtn;
import defpackage.rto;
import defpackage.rtu;
import defpackage.run;
import defpackage.rur;
import defpackage.ruw;
import defpackage.ruy;
import defpackage.rwp;
import defpackage.rxr;
import defpackage.rzy;
import defpackage.sak;
import defpackage.san;
import defpackage.sar;
import defpackage.sat;
import defpackage.sau;
import defpackage.saw;
import defpackage.sax;
import defpackage.say;
import defpackage.saz;
import defpackage.sbm;
import defpackage.sbn;
import defpackage.sbp;
import defpackage.sbs;
import defpackage.sbu;
import defpackage.sbw;
import defpackage.sby;
import defpackage.sdv;
import defpackage.sew;
import defpackage.sfg;
import defpackage.sgj;
import defpackage.sgk;
import defpackage.sgn;
import defpackage.sgp;
import defpackage.sgy;
import defpackage.shd;
import defpackage.shi;
import defpackage.shl;
import defpackage.sky;
import defpackage.spu;
import defpackage.sqi;
import defpackage.ssm;
import defpackage.sss;
import defpackage.ssu;
import defpackage.svk;
import defpackage.woy;
import defpackage.wub;
import defpackage.xhv;
import defpackage.xyc;
import defpackage.yfl;
import defpackage.yfq;
import defpackage.yfu;
import defpackage.ykd;
import defpackage.yls;
import defpackage.yno;
import defpackage.ypf;
import defpackage.yxb;
import defpackage.yxc;
import defpackage.yxi;
import defpackage.yze;
import defpackage.yzf;
import defpackage.zae;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.security.SecureRandom;
import java.util.InvalidPropertiesFormatException;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class CarSetupServiceImpl extends Service implements sbn {
    private UsbConnectionHelper B;
    private sfg C;
    private rtu D;
    private boolean E;
    private rxr F;
    private long G;
    private boolean H;
    private sgk K;
    public ruw d;
    public boolean f;
    public sak g;
    public int h;
    public sbp i;
    public CarInfoInternal j;
    public ConnectionTransfer k;
    public sew l;
    public boolean m;
    public sbm n;
    public Boolean q;
    public qst r;
    public volatile rsk s;
    public volatile sat t;
    public HandlerThread u;
    Handler v;
    public Handler w;
    public sky y;
    public static final ypf a = ols.R("CAR.SETUP.SERVICE");
    private static final Random A = new SecureRandom();
    static final AtomicBoolean b = UsbConnectionHelper.b;
    public final say c = new say(this);
    public int e = -1;
    public int o = 0;
    private int I = 0;
    public final xyc p = wub.L(new rhy(7));
    final rod z = new rod(this);
    private final sgn J = new sgp();
    public final sdv x = new sdv();

    /* loaded from: classes2.dex */
    public static class ConnectionTransfer extends sbu {
        public sbw a;
        private final CarSetupServiceImpl b;

        public ConnectionTransfer(CarSetupServiceImpl carSetupServiceImpl) {
            this.b = carSetupServiceImpl;
        }

        @Override // defpackage.sbv
        public final int a() {
            ypf ypfVar = CarSetupServiceImpl.a;
            return this.b.g.a;
        }

        @Override // defpackage.sbv
        public final int b() {
            ypf ypfVar = CarSetupServiceImpl.a;
            return this.b.e;
        }

        @Override // defpackage.sbv
        public final int c() {
            ypf ypfVar = CarSetupServiceImpl.a;
            return this.b.h;
        }

        @Override // defpackage.sbv
        public final rwp d() {
            ypf ypfVar = CarSetupServiceImpl.a;
            return this.b.l;
        }

        @Override // defpackage.sbv
        public final CarInfoInternal f() {
            ypf ypfVar = CarSetupServiceImpl.a;
            return this.b.j;
        }

        @Override // defpackage.sbv
        public final boolean g() {
            ypf ypfVar = CarSetupServiceImpl.a;
            return this.b.i.k();
        }

        @Override // defpackage.sbv
        public final boolean h() {
            ypf ypfVar = CarSetupServiceImpl.a;
            return this.b.i.g;
        }

        @Override // defpackage.sbv
        public final boolean i() {
            ypf ypfVar = CarSetupServiceImpl.a;
            return this.b.f;
        }

        @Override // defpackage.sbv
        public final void j(sbw sbwVar) {
            ypf ypfVar = CarSetupServiceImpl.a;
            if (this.b.i == null) {
                try {
                    sbwVar.e();
                    return;
                } catch (RemoteException unused) {
                    return;
                }
            }
            CarSetupServiceImpl carSetupServiceImpl = this.b;
            if (carSetupServiceImpl.i.k) {
                this.a = sbwVar;
                this.b.i.h();
                return;
            }
            try {
                Bundle bundle = new Bundle();
                carSetupServiceImpl.d.j(bundle);
                sbwVar.f(bundle);
            } catch (RemoteException unused2) {
            }
            CarSetupServiceImpl carSetupServiceImpl2 = this.b;
            carSetupServiceImpl2.k = null;
            carSetupServiceImpl2.c();
        }
    }

    private final void o() {
        Notification.Builder color = new Notification.Builder(this).setContentTitle(getString(R.string.car_app_name)).setContentText(getString(R.string.car_notification_message)).setSmallIcon(2131231122).setColor(getResources().getColor(R.color.car_light_blue_500));
        getString(R.string.car_app_name);
        kwp kwpVarE = kwp.e(this);
        if (kwpVarE.c("car.default_notification_channel") == null) {
            a.l().ai(8626).y("Creating notification channel %s", "car.default_notification_channel");
            kwpVarE.d(new NotificationChannel("car.default_notification_channel", getString(R.string.car_app_name), 3));
        }
        color.setChannelId("car.default_notification_channel");
        startForeground(1, color.build());
        a.f().ai(8639).u("started foreground service");
    }

    private final void p(Closeable closeable, Bundle bundle, Runnable runnable) throws NumberFormatException, InvalidPropertiesFormatException {
        try {
            Context applicationContext = getApplicationContext();
            ypf ypfVar = shl.a;
            int i = yfq.d;
            yfl yflVar = new yfl(4);
            yfu yfuVar = new yfu(4);
            rhx rhxVar = rhx.c;
            Iterator<E> it = acrh.a.gu().a().b.iterator();
            while (it.hasNext()) {
                String[] strArrSplit = ((String) it.next()).split(":", 2);
                String str = strArrSplit[0];
                ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                if (componentNameUnflattenFromString == null) {
                    throw new InvalidPropertiesFormatException("Failed to unflatten component name: ".concat(String.valueOf(str)));
                }
                long j = 0;
                if (strArrSplit.length > 1 && !strArrSplit[1].isEmpty()) {
                    j = Long.parseLong(strArrSplit[1]);
                }
                yfuVar.e(componentNameUnflattenFromString, Long.valueOf(j));
            }
            yno it2 = yfuVar.d(true).entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (roc.l(applicationContext, (ComponentName) entry.getKey(), ((Long) entry.getValue()).longValue())) {
                    yflVar.i((ComponentName) entry.getKey());
                } else {
                    shl.a.l().ai(8978).M("Not considering handing off to %s because it was not installed or version was below the requested minimum (%d).", entry.getKey(), entry.getValue());
                }
            }
            yfq yfqVarG = yflVar.g();
            this.G = A.nextLong();
            this.t = new sat(this.v, this, this, this.g, this.J);
            shi shiVar = new shi(getApplicationContext(), this.G, this.t, this.v, yfqVarG, this.o);
            sat satVar = this.t;
            long j2 = this.G;
            int i2 = this.e;
            int i3 = this.h;
            satVar.k = j2;
            satVar.m = i3;
            satVar.l = i2;
            satVar.h = closeable;
            satVar.i = bundle;
            satVar.j = runnable;
            satVar.n = shiVar;
            if (shiVar.d) {
                shi.a.f().ai(8970).u("Starting handoff interest checks");
                shiVar.e.post(new rsv(shiVar, 18));
            } else {
                shi.a.f().ai(8971).u("Skipping handoff interest checks - feature is not enabled");
                shiVar.e.post(new rzy(shiVar, 19));
            }
        } catch (NumberFormatException | InvalidPropertiesFormatException e) {
            a.g().p(e).ai(8651).u("Aborting car connection handoff due to configuration error.");
            runnable.run();
        }
    }

    protected rxr a() {
        return rxr.a(this);
    }

    protected final void b() {
        stopForeground(true);
        a.f().ai(8625).w("stopped foreground service id %d", this.I);
        stopSelf(this.I);
    }

    public final void c() {
        ypf ypfVar = a;
        ypfVar.l().ai(8628).u("Connection transfer done");
        if (l()) {
            ypfVar.l().ai(8605).u("Connection handoff complete");
        } else {
            ruw ruwVar = this.d;
            if (ruwVar == null) {
                ypfVar.h().ai(8627).u("Protocol manager is unexpectedly null, ignoring");
                ols.M(this, yxi.CAR_SETUP_SERVICE_NULL_PROTOCOL_MANAGER_DURING_FINISH_TRANSFER);
            } else {
                ruwVar.d.t.f();
                this.d = null;
            }
        }
        k();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0281, code lost:
    
        if (r7.c() != false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x022f, code lost:
    
        if (r6.i.b() == false) goto L107;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(com.google.android.gms.carsetup.CarInfoInternal r22, boolean r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.carsetup.CarSetupServiceImpl.d(com.google.android.gms.carsetup.CarInfoInternal, boolean):void");
    }

    @Override // android.app.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        boolean zB;
        printWriter.println("Connection type: " + this.e);
        printWriter.println("Connected state: " + this.c.a());
        sak sakVar = this.g;
        if (sakVar != null) {
            printWriter.println("Analytics session id: " + sakVar.a);
        }
        sky skyVar = this.y;
        int i = 0;
        if (skyVar != null) {
            Object obj = skyVar.a;
            if (obj != null) {
                zB = ((PowerManager.WakeLock) obj).isHeld();
            } else {
                Object obj2 = skyVar.b;
                zB = obj2 != null ? ((svk) obj2).b() : false;
            }
            printWriter.println(a.bR(zB, "Wake lock held: "));
        } else {
            printWriter.println("Wake lock is null");
        }
        printWriter.println("startActivities: " + this.f);
        printWriter.println("connectionTag: " + this.h);
        printWriter.println("suppressRestart: " + this.E);
        printWriter.println("readerThreadStuck: " + this.m);
        printWriter.println("carServiceSessionId: " + this.G);
        sbp sbpVar = this.i;
        if (sbpVar != null) {
            printWriter.println("FrxState");
            printWriter.println("setupOngoing: " + sbpVar.k);
            printWriter.println("carConnectionAlreadyAllowed: " + sbpVar.l);
            printWriter.println("shouldShowTutorial: " + sbpVar.g);
            printWriter.println("transferStarted: " + sbpVar.m);
            printWriter.println("carServiceStarted: " + sbpVar.n);
        }
        CarInfoInternal carInfoInternal = this.j;
        if (carInfoInternal != null) {
            printWriter.println("car info: ".concat(carInfoInternal.toString()));
        }
        if (this.s != null) {
            rsk rskVar = this.s;
            printWriter.print("CarGalMonitor{messageListeners=[");
            synchronized (rskVar.b) {
                int i2 = 0;
                while (true) {
                    SparseArray sparseArray = rskVar.c;
                    if (i2 >= sparseArray.size()) {
                        break;
                    }
                    ArrayMap arrayMap = (ArrayMap) sparseArray.valueAt(i2);
                    if (arrayMap != null && !arrayMap.isEmpty()) {
                        printWriter.print(sparseArray.keyAt(i2) + ",");
                    }
                    i2++;
                }
                printWriter.print("], frameListeners=[");
                while (true) {
                    SparseArray sparseArray2 = rskVar.d;
                    if (i >= sparseArray2.size()) {
                        break;
                    }
                    ArrayMap arrayMap2 = (ArrayMap) sparseArray2.valueAt(i);
                    if (arrayMap2 != null && !arrayMap2.isEmpty()) {
                        printWriter.print(sparseArray2.keyAt(i) + ",");
                    }
                    i++;
                }
            }
            printWriter.println("]}");
        }
        printWriter.println("No module info for gms-independent lib.");
        this.F.c(printWriter);
    }

    @Override // defpackage.sbn
    public final void e(yze yzeVar, yzf yzfVar, String str) {
        this.C.c(yzeVar, yzfVar, str);
    }

    public final void f(final Closeable closeable, final ParcelFileDescriptor parcelFileDescriptor, final boolean z) throws NumberFormatException, InvalidPropertiesFormatException {
        if (parcelFileDescriptor == null) {
            a.g().ai(8649).u("Null connection file descriptor. Not starting car connection.");
            k();
        } else {
            Runnable runnable = new Runnable() { // from class: sam
                @Override // java.lang.Runnable
                public final void run() throws NumberFormatException {
                    CarSetupServiceImpl carSetupServiceImpl = this.a;
                    if (carSetupServiceImpl.m()) {
                        return;
                    }
                    boolean z2 = z;
                    ParcelFileDescriptor parcelFileDescriptor2 = parcelFileDescriptor;
                    Closeable closeable2 = closeable;
                    woy.aa(((Boolean) carSetupServiceImpl.p.gu()).booleanValue(), "Unable to handoff car connection and not configured to fall back to GMS Core.");
                    carSetupServiceImpl.h(closeable2, parcelFileDescriptor2, parcelFileDescriptor2, z2);
                }
            };
            Bundle bundle = new Bundle();
            bundle.putParcelable("car_setup.EXTRA_CAR_CONNECTION_FILE_DESCRIPTOR", parcelFileDescriptor);
            p(closeable, bundle, runnable);
        }
    }

    public final void g() {
        a.f().ai(8650).u("Start FRX setup");
        ols.L(this, "com.google.android.gms.car.FRX", rrx.a, null);
        sbp sbpVar = this.i;
        ypf ypfVar = sbp.a;
        ypfVar.f().ai(8733).u("Starting setup");
        Context context = sbpVar.b;
        ((UiModeManager) context.getSystemService("uimode")).disableCarMode(0);
        if (((KeyguardManager) context.getSystemService("keyguard")).isKeyguardLocked()) {
            ypfVar.l().ai(8734).u("first run and screen locked");
        }
        sbpVar.k = true;
        ((sdv) sbpVar.d).a.add(sbpVar);
        Intent intent = new Intent();
        intent.setComponent(rhz.d);
        intent.addFlags(268435456);
        intent.addFlags(32768);
        intent.addFlags(65536);
        intent.putExtra("frx_state", new BinderParcel(new sby(new sqi(sbpVar))));
        context.startActivity(intent);
    }

    public final void h(Closeable closeable, ParcelFileDescriptor parcelFileDescriptor, ParcelFileDescriptor parcelFileDescriptor2, boolean z) throws NumberFormatException {
        int i;
        woy.Z(this.e != -1);
        a.l().ai(8653).w("Start car connection %d", this.e);
        this.f = z;
        sar sarVar = new sar(this);
        this.D = sarVar;
        FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptor.getFileDescriptor());
        FileOutputStream fileOutputStream = new FileOutputStream(parcelFileDescriptor2.getFileDescriptor());
        sau sauVar = new sau(closeable, b, this.e);
        ypf ypfVar = ruw.a;
        rur rurVar = new rur();
        rurVar.c = this;
        rurVar.k = new run(false);
        rurVar.l = R.raw.car_android_32;
        rurVar.i = R.raw.car_android_64;
        rurVar.h = R.raw.car_android_128;
        rurVar.m = R.string.car_hu_label;
        int i2 = this.e;
        if (i2 == 1) {
            rtn rtnVarA = rto.a();
            rtnVarA.e(true);
            rtnVarA.f(true);
            rtnVarA.c(1);
            rurVar.n = rtnVarA.a();
        } else if (i2 == 2) {
            rtn rtnVarA2 = rto.a();
            rtnVarA2.e(true);
            rtnVarA2.f(true);
            if (adar.b() > 0) {
                rtnVarA2.d((int) adar.b());
                rtnVarA2.c(2);
            }
            if (adar.c() > 0) {
                rtnVarA2.b((int) adar.c());
            }
            rurVar.n = rtnVarA2.a();
        }
        rurVar.e = sarVar;
        rurVar.b = sauVar;
        rurVar.g = fileInputStream;
        rurVar.j = fileOutputStream;
        qst qstVar = this.r;
        rlr rlrVarA = rls.a();
        rhw rhwVar = qstVar.a;
        rlrVarA.d(!acrb.z() ? false : qstVar.b.getBoolean("car_gal_snoop_log_video_ack", false));
        rlrVarA.c(!acrb.z() ? false : qstVar.b.getBoolean("car_gal_snoop_log_media_ack", false));
        rlrVarA.b(!acrb.z() ? false : qstVar.b.getBoolean("car_gal_snoop_log_guidance_ack", false));
        rls rlsVarA = rlrVarA.a();
        rlg rlgVarA = rlh.a();
        rlgVarA.c(acrb.z() ? qstVar.b.getBoolean("car_enable_gal_snoop", false) : false);
        if (acrb.z()) {
            try {
                i = Integer.parseInt(qstVar.b.getString("car_gal_snoop_buffer_size", "100"));
            } catch (NumberFormatException unused) {
                i = 100;
            }
            i = i >= 100 ? i : 100;
            if (i > 1000) {
                i = 1000;
            }
        }
        rlgVarA.b(i);
        rlgVarA.a = rlsVarA;
        rurVar.f = rlgVarA.a();
        this.d = new ruw(rurVar);
        if (this.s != null) {
            this.d.h(this.s);
        }
        Boolean bool = this.q;
        say sayVar = this.c;
        if (bool == null) {
            sayVar.b(2);
            ols.L(this, "com.google.android.gms.car.CAR_SETUP_SERVICE", rrq.f, null);
        } else {
            sayVar.b(3);
            ols.L(this, "com.google.android.gms.car.CAR_SETUP_SERVICE", rrq.g, null);
            this.d.i();
        }
    }

    public final void i(boolean z, boolean z2) {
        if (!l()) {
            this.k = new ConnectionTransfer(this);
            Intent intent = new Intent("com.google.android.gms.car.TRANSFER");
            intent.setComponent((ComponentName) rhz.a.gu());
            intent.putExtra("connection", new BinderParcel(this.k));
            this.J.a(intent);
            ols.K(this, "com.google.android.gms.car.CONNECTION_TRANSFER", rrx.a.ordinal(), null);
            startService(intent);
            return;
        }
        this.t.q = z;
        this.t.r = z2;
        sat satVar = this.t;
        a.f().ai(8618).u("Starting transfer for handoff.");
        satVar.p = true;
        satVar.n.a(satVar.k, satVar.a(!satVar.o));
        Context context = satVar.e;
        sau sauVar = new sau(new ssm(1), b, satVar.l);
        if (!satVar.s) {
            throw new IllegalStateException("No component accepted the handoff.");
        }
        Intent intentPutExtra = new Intent("com.google.android.gms.car.HANDOFF").setComponent((ComponentName) rhz.a.gu()).putExtra("car_handoff_session_id", satVar.k).putExtra("car_handoff_component", satVar.v.flattenToString()).putExtra("car_handoff_start_activities", true).putExtra("car_handoff_user_authorized_projection", !satVar.o).putExtra("car_handoff_connection_type", satVar.l).putExtra("connection_tag", satVar.m);
        satVar.g.a(intentPutExtra);
        if (satVar.i != null && Build.VERSION.SDK_INT >= 30) {
            intentPutExtra.putExtra("car_handoff_starting_bluetooth_device", satVar.i.getParcelable("WIFI_STARTING_BLUETOOTH_DEVICE"));
        }
        intentPutExtra.putExtra("car_handoff_analytics_session_id", (int) satVar.k);
        if (satVar.f()) {
            intentPutExtra.putExtra("car_handoff_is_car_audio_service_migration_enabled", true);
        }
        intentPutExtra.putExtra("connection_tear_down_helper", new BinderParcel(new saz(sauVar)));
        CarInfoInternal carInfoInternal = satVar.d.j;
        if (carInfoInternal != null) {
            intentPutExtra.putExtra("car_handoff_car_info", spu.k(carInfoInternal));
        }
        intentPutExtra.putExtra("car_handoff_is_first_connection", satVar.q);
        context.startService(intentPutExtra);
        if (satVar.o) {
            return;
        }
        satVar.c.postDelayed(satVar.b, 5000L);
    }

    @Override // defpackage.sbn
    public final void j(Socket socket) {
        rbe.h(new rpo(this, socket, 18, null));
    }

    public final void k() {
        a.f().ai(8655).u("tearDown");
        FirstActivityImpl.n = false;
        this.H = false;
        sdv sdvVar = this.x;
        synchronized (sdvVar.b) {
            if (sdvVar.e) {
                rwp rwpVar = sdvVar.f;
                if (rwpVar != null) {
                    try {
                        rwpVar.g(sdvVar);
                    } catch (RemoteException unused) {
                    }
                }
                sdvVar.e = false;
            }
        }
        this.F.e(this);
        if (this.c.a() == 0) {
            ols.K(this, "com.google.android.gms.car.CAR_SETUP_SERVICE", rrq.h.ordinal(), null);
            return;
        }
        int i = 1;
        if (this.t != null) {
            sat satVar = this.t;
            a.f().ai(8620).u("Tearing down car connection");
            if (!satVar.p) {
                sgy sgyVar = satVar.n;
                shi.a.f().ai(8972).u("Tearing down car connection");
                ((shi) sgyVar).d().execute(new shd(sgyVar, i));
            }
        }
        ruw ruwVar = this.d;
        if (ruwVar != null) {
            ruwVar.f();
            this.d.e();
        }
        sky skyVar = this.y;
        if (skyVar != null) {
            skyVar.b();
        }
        UsbConnectionHelper usbConnectionHelper = this.B;
        synchronized (usbConnectionHelper.d) {
            ssu ssuVar = usbConnectionHelper.e;
            if (ssuVar != null) {
                try {
                    unregisterReceiver(ssuVar);
                } catch (IllegalArgumentException e) {
                    UsbConnectionHelper.a.h().p(e).ai(8914).u("Unable to unregister USB disconnect receiver.");
                }
                usbConnectionHelper.e = null;
            }
        }
        sbp sbpVar = this.i;
        if (sbpVar != null) {
            ykd ykdVar = sbpVar.p;
            if (ykdVar != null) {
                ykdVar.w();
            }
            sbpVar.m(null);
            this.i = null;
        }
        this.v.removeCallbacksAndMessages(null);
        sbm sbmVar = this.n;
        ypf ypfVar = sbm.a;
        ypfVar.l().ai(8693).u("tearDown");
        if (sbmVar.h) {
            sbmVar.h = false;
            sbmVar.b.unregisterReceiver(sbmVar.l);
            sbmVar.d();
            sbmVar.f.execute(new rzy(sbmVar, 5));
        } else {
            ypfVar.l().ai(8694).u("Not initialized");
        }
        sak sakVar = this.g;
        if (sakVar != null) {
            sakVar.a();
        }
        b();
        this.c.b(0);
        ols.K(this, "com.google.android.gms.car.CAR_SETUP_SERVICE", rrq.d.ordinal(), null);
        if (this.e == 1 && this.m) {
            a.f().ai(8656).u("Reader thread stuck after cable removal. Will kill process.");
            Process.killProcess(Process.myPid());
        }
    }

    public final boolean l() {
        return this.t != null && this.t.s;
    }

    public final boolean m() {
        if (Build.VERSION.SDK_INT < 30 || ((Boolean) this.p.gu()).booleanValue()) {
            return false;
        }
        a.g().ai(8648).u("Unable to handoff car connection (no components interested), tearing down");
        k();
        return true;
    }

    public final void n(int i) {
        sbw sbwVar;
        ols.Q(this, rrx.c, i);
        if (l()) {
            CarInfo carInfo = this.j.a;
            this.t.d(xhv.USER_SELECTION);
        } else {
            ConnectionTransfer connectionTransfer = this.k;
            if (connectionTransfer != null && (sbwVar = connectionTransfer.a) != null) {
                try {
                    sbwVar.e();
                } catch (RemoteException unused) {
                }
            }
            ruw ruwVar = this.d;
            if (ruwVar != null) {
                ruwVar.k();
                this.d.g(xhv.USER_SELECTION);
            }
        }
        this.k = null;
        this.i = null;
        k();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        if ("com.google.android.gms.carsetup.ACTION_BIND_CAR_SETUP_SERVICE".equals(intent.getAction())) {
            return new sbs(this);
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        a.f().ai(8640).u("onCreate");
        super.onCreate();
        ols.K(this, "com.google.android.gms.car.CAR_SETUP_SERVICE", rrq.a.ordinal(), null);
        if (Build.VERSION.SDK_INT >= 30) {
            o();
            UsbConnectionHelper.TrackedParcelFileDescriptor.c(this);
            this.K = UsbConnectionHelper.TrackedParcelFileDescriptor.d(this);
        }
        HandlerThread handlerThread = new HandlerThread("CarSetupServiceImpl", 9);
        this.u = handlerThread;
        handlerThread.start();
        this.w = new sss(Looper.getMainLooper());
        this.v = new sss(this.u.getLooper());
        this.r = qst.a(this);
        Boolean boolB = ruy.a().b();
        if (boolB == null) {
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
            executorServiceNewSingleThreadExecutor.execute(new sax(this));
            executorServiceNewSingleThreadExecutor.shutdown();
        } else {
            this.q = boolB;
        }
        this.g = new sak(this, null);
        this.n = new sbm(getApplicationContext(), new lgx(this.g));
        this.F = a();
        this.C = new saw(this);
        this.B = new UsbConnectionHelper(this.C);
        this.F.d(this, rhx.c.a());
    }

    @Override // android.app.Service
    public final void onDestroy() {
        a.f().ai(8641).u("onDestroy");
        super.onDestroy();
        k();
        ols.K(this, "com.google.android.gms.car.CAR_SETUP_SERVICE", rrq.c.ordinal(), null);
        this.v.postDelayed(new rsv(this, 11), 10000L);
        sgk sgkVar = this.K;
        if (sgkVar != null) {
            sgkVar.a();
        }
    }

    @Override // android.app.Service
    @ResultIgnorabilityUnspecified
    public final int onStartCommand(Intent intent, int i, int i2) throws NumberFormatException, InvalidPropertiesFormatException {
        CarSetupServiceImpl carSetupServiceImpl;
        qzp qznVar;
        sky skyVarC;
        this.I = i2;
        boolean z = intent != null && intent.getBooleanExtra("start_foreground_immediately", false);
        if (z) {
            o();
        }
        ypf ypfVar = a;
        ypfVar.f().ai(8642).D("onStartCommand (id=%d): %s", i2, intent);
        if (intent == null) {
            ypfVar.f().ai(8647).u("Restarting with null intent");
            b();
            return 2;
        }
        SetupBinder setupBinder = (SetupBinder) intent.getParcelableExtra("EXTRA_LOCAL_BINDER");
        this.H = intent.getBooleanExtra("PreSetup.PRE_SETUP_WELCOME_SCREEN_SHOWN", false);
        if (Boolean.FALSE.equals(this.q)) {
            ypfVar.f().ai(8646).u("Failed security update, aborting");
            b();
        } else {
            say sayVar = this.c;
            ParcelFileDescriptor parcelFileDescriptorE = null;
            if (sayVar.c()) {
                ypfVar.f().ai(8645).u("Already connected; ignoring connection request");
                ols.K(this, "com.google.android.gms.car.CAR_SETUP_SERVICE", rrq.b.ordinal(), null);
                if (setupBinder == null) {
                    setupBinder = null;
                } else if (setupBinder.b() && (skyVarC = setupBinder.c()) != null) {
                    skyVarC.b();
                }
            } else {
                if (setupBinder == null) {
                    setupBinder = null;
                } else {
                    if (!setupBinder.b()) {
                        ypfVar.f().ai(8644).u("Restarted with invalid binder");
                        b();
                        return 2;
                    }
                    this.y = setupBinder.c();
                    intent = setupBinder.a;
                    intent.getClass();
                }
                sayVar.b(1);
                ols.K(this, "com.google.android.gms.car.CAR_SETUP_SERVICE", rrq.e.ordinal(), null);
                this.h = 0;
                intent.setExtrasClassLoader(getClassLoader());
                this.E = intent.getBooleanExtra("suppress_restart", false);
                yxb yxbVar = yxb.a;
                abnp abnpVarN = yxbVar.n();
                abnpVarN.t();
                yxb yxbVar2 = (yxb) abnpVarN.b;
                yxbVar2.c |= 33554432;
                yxbVar2.W = 2;
                this.g.d((yxb) abnpVarN.q(), yxc.CAR_STARTUP_SERVICE_PROCESS);
                if ("android.hardware.usb.action.USB_ACCESSORY_ATTACHED".equals(intent.getAction()) || "com.google.android.gms.car.usb.USB_ACCESSORY_FORCE_START".equals(intent.getAction())) {
                    UsbAccessory usbAccessory = (UsbAccessory) intent.getParcelableExtra("accessory");
                    if (usbAccessory != null) {
                        this.e = 1;
                        carSetupServiceImpl = this;
                        this.B.a(carSetupServiceImpl, usbAccessory, true, intent.getBooleanExtra("show_permission_errors", true), new sgj() { // from class: sal
                            @Override // defpackage.sgj
                            public final void a(ParcelFileDescriptor parcelFileDescriptor) throws NumberFormatException, InvalidPropertiesFormatException {
                                this.a.f(parcelFileDescriptor, parcelFileDescriptor, true);
                            }
                        });
                    }
                    if (!z && carSetupServiceImpl.c.a() != 0) {
                        carSetupServiceImpl.o();
                    }
                } else if ("com.google.android.gms.car.WIFI_ACTION_BRIDGE".equals(intent.getAction())) {
                    if (intent.getStringExtra("PARAM_HOST_ADDRESS") == null || intent.getIntExtra("PARAM_SERVICE_PORT", -1) == -1) {
                        ypfVar.g().ai(8636).u("Failure to start wifi with invalid IP / Port");
                        k();
                    } else {
                        sak sakVar = this.g;
                        abnp abnpVarN2 = yxbVar.n();
                        abnp abnpVarN3 = zae.a.n();
                        abnpVarN3.t();
                        zae zaeVar = (zae) abnpVarN3.b;
                        zaeVar.b |= 1;
                        zaeVar.c = 2;
                        abnpVarN2.t();
                        yxb yxbVar3 = (yxb) abnpVarN2.b;
                        zae zaeVar2 = (zae) abnpVarN3.q();
                        zaeVar2.getClass();
                        yxbVar3.G = zaeVar2;
                        yxbVar3.c |= 16;
                        yxc yxcVar = yxc.WIRELESS_START;
                        int i3 = yfq.d;
                        sakVar.f(abnpVarN2, yxcVar, yls.a);
                        WifiInfo wifiInfo = (WifiInfo) intent.getParcelableExtra("wifi_info");
                        this.e = 2;
                        this.o = wifiInfo != null ? Math.max(wifiInfo.getFrequency(), 0) : 0;
                        ypfVar.l().ai(8637).w("Detected wifi frequency (MHz) is %d", this.o);
                        Bundle extras = intent.getExtras();
                        ypfVar.f().ai(8652).y("Start handoff wifi setup %s", extras);
                        p(new san(0), extras, new rpo(this, extras, 19));
                    }
                } else if ("com.google.android.gms.carsetup.START_DUPLEX".equals(intent.getAction())) {
                    this.e = intent.getIntExtra("connection_type", 0);
                    BinderParcel binderParcel = (BinderParcel) intent.getParcelableExtra("connection_fd");
                    if (binderParcel != null) {
                        IBinder iBinder = binderParcel.a;
                        if (iBinder == null) {
                            qznVar = null;
                        } else {
                            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.car.IFdBinder");
                            qznVar = iInterfaceQueryLocalInterface instanceof qzp ? (qzp) iInterfaceQueryLocalInterface : new qzn(iBinder);
                        }
                        try {
                            parcelFileDescriptorE = qznVar.e();
                        } catch (RemoteException unused) {
                        }
                    }
                    if (parcelFileDescriptorE == null) {
                        a.g().ai(8635).u("Failure starting");
                    } else {
                        this.h = intent.getIntExtra("connection_tag", -1);
                        f(parcelFileDescriptorE, parcelFileDescriptorE, intent.getBooleanExtra("start_activities", true));
                    }
                } else {
                    ypfVar.g().ai(8634).y("Unknown intent %s", intent);
                    k();
                }
                carSetupServiceImpl = this;
                if (!z) {
                    carSetupServiceImpl.o();
                }
            }
        }
        if (setupBinder != null && setupBinder.b()) {
            setupBinder.a();
        }
        return 1;
    }
}
