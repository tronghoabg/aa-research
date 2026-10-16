package com.google.android.apps.auto.wireless.setup.service.impl;

import android.app.Notification;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.text.format.Formatter;
import android.util.Pair;
import com.google.android.gms.carsetup.CarInfoInternal;
import com.google.android.projection.gearhead.R;
import defpackage.a;
import defpackage.aaem;
import defpackage.acqa;
import defpackage.acrk;
import defpackage.acvh;
import defpackage.acxv;
import defpackage.aczs;
import defpackage.aczv;
import defpackage.afck;
import defpackage.afcp;
import defpackage.aiji;
import defpackage.aiqd;
import defpackage.ajdr;
import defpackage.ajmd;
import defpackage.dup;
import defpackage.ebe;
import defpackage.eqe;
import defpackage.eqj;
import defpackage.hrp;
import defpackage.jfj;
import defpackage.jlo;
import defpackage.joa;
import defpackage.jri;
import defpackage.kio;
import defpackage.kmo;
import defpackage.kmy;
import defpackage.kny;
import defpackage.kzt;
import defpackage.ldp;
import defpackage.lfm;
import defpackage.llv;
import defpackage.nkn;
import defpackage.oez;
import defpackage.ogz;
import defpackage.ojk;
import defpackage.orf;
import defpackage.ozb;
import defpackage.ozd;
import defpackage.ozj;
import defpackage.ozk;
import defpackage.pah;
import defpackage.pbf;
import defpackage.pbp;
import defpackage.pbq;
import defpackage.pca;
import defpackage.pcx;
import defpackage.pex;
import defpackage.pfb;
import defpackage.pfi;
import defpackage.pfj;
import defpackage.pgr;
import defpackage.pgs;
import defpackage.pgt;
import defpackage.pgx;
import defpackage.pgy;
import defpackage.pha;
import defpackage.phb;
import defpackage.phc;
import defpackage.phj;
import defpackage.phk;
import defpackage.qrv;
import defpackage.rxr;
import defpackage.skn;
import defpackage.tez;
import defpackage.wer;
import defpackage.ws;
import defpackage.wub;
import defpackage.xxh;
import defpackage.xyc;
import defpackage.ycm;
import defpackage.ydx;
import defpackage.yfq;
import defpackage.yfu;
import defpackage.yfy;
import defpackage.ygr;
import defpackage.yly;
import defpackage.ype;
import defpackage.yph;
import defpackage.yxi;
import defpackage.zgl;
import defpackage.zgp;
import defpackage.zjc;
import defpackage.zjd;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.OptionalInt;
import j$.util.stream.Collectors;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public class WirelessSetupSharedService extends eqe {
    public static final yph a = yph.c("GH.WirelessShared");
    public static final boolean b;
    static final AtomicBoolean c;
    public ogz A;
    public ajdr B;
    private final Supplier E;
    private BroadcastReceiver F;
    private HandlerThread G;
    private pca H;
    private ozk I;
    private int J;
    private final Map K;
    private final Supplier L;
    private zgp M;
    private final yfy N;
    private final pbq O;
    public final Handler i;
    Handler j;
    kio k;
    public rxr l;
    public pfi m;
    public pgt n;
    public phj o;
    public BluetoothDevice p;
    public kny q;
    public pfj r;
    public zgp s;
    public final Supplier t;
    public ScheduledExecutorService u;
    public ozd v;
    public final pah w;
    final pbp x;
    public final pbf y;
    public kzt z;
    int d = 0;
    public int e = 0;
    final AtomicBoolean f = new AtomicBoolean();
    public volatile boolean g = false;
    private boolean C = false;
    private final int D = R.id.service_notification_id;
    public final Handler h = new Handler(Looper.getMainLooper());

    static {
        b = Build.VERSION.SDK_INT >= 30;
        c = new AtomicBoolean(false);
    }

    public WirelessSetupSharedService() {
        xyc xycVarL = wub.L(new ojk(this, 9));
        xycVarL.getClass();
        this.E = new llv(xycVarL, 15);
        this.i = new Handler(Looper.getMainLooper());
        this.y = new pbf(this);
        this.K = new HashMap();
        this.s = null;
        xyc xycVarL2 = wub.L(new joa(14));
        xycVarL2.getClass();
        this.t = new llv(xycVarL2, 16);
        xyc xycVarL3 = wub.L(new ojk(this, 10));
        xycVarL3.getClass();
        this.L = new llv(xycVarL3, 17);
        this.M = zgl.a;
        yfu yfuVar = new yfu(4);
        if (aczv.ae()) {
            yfuVar.e("com.google.android.apps.auto.carservice.companion.ACL_CONNECTED", yxi.WIRELESS_SETUP_SHARED_SERVICE_STARTED_COMPANION_ACL_CONNECTED);
            yfuVar.e("com.google.android.apps.auto.carservice.companion.PROFILE_CONNECTION_STATE_CHANGED", yxi.WIRELESS_SETUP_SHARED_SERVICE_STARTED_COMPANION_PROFILE_CONNECTION_STATE_CHANGED);
            yfuVar.e("android.bluetooth.device.action.ACL_CONNECTED", yxi.WIRELESS_SETUP_SHARED_SERVICE_STARTED_ACL_CONNECTED);
            yfuVar.e("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED", yxi.WIRELESS_SETUP_SHARED_SERVICE_STARTED_HFP_CONNECTION_STATE_CHANGED);
            yfuVar.e("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED", yxi.WIRELESS_SETUP_SHARED_SERVICE_STARTED_A2DP_CONNECTION_STATE_CHANGED);
        }
        if (j()) {
            yfuVar.e("com.google.android.projection.gearhead.USER_INITIATED_START_WIRELESS_PROJECTION", yxi.WIRELESS_SETUP_SHARED_ACTION_USER_INITIATED_START_WIRELESS_PROJECTION);
        }
        if (aczv.ba()) {
            yfuVar.e("com.google.android.projection.gearhead.START_WIRELESS_PROJECTION", yxi.WIRELESS_SETUP_SHARED_ACTION_LEGACY_START_WIRELESS_PROJECTION);
        }
        this.N = yfuVar.d(true);
        this.w = new phb(this);
        this.x = new pbp(this);
        this.O = new pbq(this);
    }

    private final int e() {
        if (b) {
            return 2;
        }
        return this.D;
    }

    private final void f() {
        this.d++;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, oqe] */
    private final void g() {
        int i = 0;
        if (this.f.compareAndSet(false, true)) {
            orf orfVar = new orf();
            yph yphVar = a;
            ((ype) yphVar.l().ai((char) 6671)).u("initialize WirelessSetup Shared Service");
            pex pexVar = new pex(this);
            this.k = pexVar;
            pexVar.c();
            ws wsVar = new ws();
            wsVar.c = this.q;
            wsVar.b = orfVar;
            wsVar.a = (ExecutorService) this.t.get();
            this.B = new ajdr(wsVar);
            this.q.b = aczv.r();
            this.q.c = aczv.q();
            this.r = new pfj(this, orfVar);
            Context applicationContext = getApplicationContext();
            Handler handler = this.h;
            yph yphVar2 = pgt.a;
            pgs pgsVar = new pgs(applicationContext, handler);
            pgsVar.c = e();
            pgsVar.d = 25000;
            pgsVar.e = this.B;
            this.n = new pgt(pgsVar);
            Context applicationContext2 = getApplicationContext();
            yph yphVar3 = pfi.a;
            aaem aaemVar = new aaem(applicationContext2);
            aaemVar.a = new lfm(this).i();
            this.m = new pfi(aaemVar);
            this.I = this.B.a.c();
            if (this.A == null) {
                this.n.getClass();
                ajmd ajmdVar = new ajmd(this, null);
                kny knyVar = this.q;
                Object obj = this.B.a;
                this.A = new ogz(this, ajmdVar, knyVar);
            }
            if (acxv.m()) {
                rxr rxrVarB = this.l;
                if (rxrVarB == null) {
                    rxrVarB = rxr.b(this, xxh.h(new pgx(i)), new pgy(i));
                    this.l = rxrVarB;
                }
                rxrVarB.d(this, (int) acrk.b());
            }
            ((ype) yphVar.l().ai((char) 6680)).u("Init CarConnectionStateBroadcastReceiver");
            pbq pbqVar = this.O;
            pbp pbpVar = this.x;
            wer.c();
            pbqVar.b.add(pbpVar);
            wer.c();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.google.android.gms.car.PROJECTION_STARTED");
            intentFilter.addAction("com.google.android.gms.car.PROJECTION_ENDED");
            dup.e(pbqVar.a, pbqVar, intentFilter, null, 2);
            pca pcaVar = new pca(this.B, this.L, aczv.ad());
            this.H = pcaVar;
            try {
                this.v.a(pcaVar);
                if (acvh.z()) {
                    this.F = new phc(this);
                    dup.e(this, this.F, new IntentFilter("com.google.android.apps.auto.components.preflight.phone.RESTORE_PHONE_NOTIFICATION"), null, 2);
                }
            } catch (InterruptedException | ExecutionException e) {
                throw new IllegalStateException("Failed to register current car tracker", e);
            }
        }
    }

    private final void h() {
        yph yphVar = a;
        ((ype) ((ype) yphVar.f()).ai((char) 6683)).y("Creating foreground notification, already active: %b", Boolean.valueOf(this.C));
        pgt pgtVar = this.n;
        Object objA = pgtVar.v.isPresent() ? pgtVar.v.get() : pgtVar.a();
        if (Build.VERSION.SDK_INT >= 34) {
            int iX = qrv.x(this, yfq.r(16, 8));
            ((ype) ((ype) yphVar.f()).ai((char) 6685)).w("Combined foreground service type: %d", iX);
            startForeground(e(), (Notification) objA, iX);
        } else {
            startForeground(e(), (Notification) objA);
        }
        ((ype) ((ype) yphVar.f()).ai((char) 6684)).u("started foreground service");
        this.C = true;
    }

    private final boolean i() {
        return Objects.equals(new ldp(getApplicationContext(), jri.a, "car").b(), true);
    }

    private static boolean j() {
        if (aczv.ap() || aczv.as()) {
            return true;
        }
        return hrp.a() && aczv.ar();
    }

    public final ygr a(BluetoothDevice bluetoothDevice) {
        jlo jloVar = new jlo(this);
        try {
            Object obj = this.B.a;
            ygr ygrVar = (ygr) Collection.EL.stream(new kmy(this, "dongle_associations").getStringSet(bluetoothDevice.getAddress(), yly.a)).filter(new pcx(jloVar, 6)).collect(ycm.b);
            jloVar.close();
            return ygrVar;
        } catch (Throwable th) {
            try {
                jloVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b() {
        if (Binder.getCallingUid() != Process.myUid()) {
            String[] packagesForUid = getPackageManager().getPackagesForUid(Binder.getCallingUid());
            skn sknVarA = skn.a(this);
            if (packagesForUid != null) {
                for (String str : packagesForUid) {
                    if (kmo.c(aczs.b(), str) && sknVarA.b(str)) {
                        return;
                    }
                }
            }
            throw new SecurityException("Unauthorized");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0398 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02a3  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, oqe] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object, pah] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(android.bluetooth.BluetoothDevice r21, defpackage.phg r22, j$.util.OptionalInt r23, android.content.Intent r24) {
        /*
            Method dump skipped, instructions count: 1448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.auto.wireless.setup.service.impl.WirelessSetupSharedService.c(android.bluetooth.BluetoothDevice, phg, j$.util.OptionalInt, android.content.Intent):void");
    }

    public final void d() {
        pca pcaVar;
        yph yphVar = a;
        ype ypeVar = (ype) ((ype) yphVar.f()).ai(6693);
        Integer numValueOf = Integer.valueOf(this.d);
        zjc zjcVar = zjc.a;
        ypeVar.M("Ready to stop service if required? bindCount=%s isWirelessSetupManagerActive=%s", new zjd(zjcVar, numValueOf), new zjd(zjcVar, Boolean.valueOf(this.g)));
        if (!this.g && this.p == null && (pcaVar = this.H) != null) {
            wer.c();
            pcaVar.f = null;
            pcaVar.b.removeCallbacksAndMessages(pcaVar.e);
        }
        if (this.B != null && !this.g && this.p == null) {
            this.M.cancel(false);
            ((eqj) this.B.c).m(null);
        }
        if (this.d == 0 && this.e == 0 && !this.g && this.p == null) {
            if (this.C) {
                ((ype) yphVar.l().ai((char) 6668)).u("Removing foreground notification");
                stopForeground(true);
                ((ype) ((ype) yphVar.f()).ai((char) 6669)).u("stopped foreground service");
                this.C = false;
            }
            stopSelf(this.J);
            ((ype) ((ype) yphVar.f()).ai((char) 6694)).y("Stopped service request sent for startId: %s", new zjd(zjcVar, Integer.valueOf(this.J)));
        }
    }

    @Override // android.app.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        char c2;
        if (acqa.c()) {
            printWriter.println("Dumping BuildConfig flags for the CAR process");
            ebe.p(printWriter);
            printWriter.println();
        }
        printWriter.println("isForegroundNotificationActive: " + this.C);
        printWriter.println("isWirelessSetupManagerActive: " + this.g);
        pfj pfjVar = this.r;
        if (pfjVar != null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
            printWriter.println("-------- WirelessSetupDumpManager --------\n");
            ozk ozkVarC = pfjVar.d.c();
            printWriter.println("\nWirelessSetupEvents records:");
            String str = "";
            while (true) {
                Pair pair = (Pair) pfjVar.a.poll();
                if (pair == null) {
                    break;
                }
                Date date = new Date(((Long) pair.first).longValue());
                String str2 = (String) Collection.EL.stream((yfq) pair.second).collect(Collectors.joining(", "));
                if (str.equals(str2)) {
                    printWriter.print(".");
                } else {
                    printWriter.printf("\n%s : %s,", simpleDateFormat.format(date), str2);
                }
                str = str2;
            }
            c2 = 0;
            printWriter.println();
            printWriter.println("\nProxy Server records:".concat(ozkVarC != null ? "" : "NULL"));
            if (ozkVarC != null) {
                printWriter.println(ozkVarC.toString());
                Context context = pfjVar.e;
                ozj ozjVarA = ozkVarC.a(context, System.currentTimeMillis() - 604800000);
                long j = ozjVarA.a;
                long j2 = ozjVarA.b;
                printWriter.println("Proxy stats: txBytes: " + Formatter.formatShortFileSize(context, j) + ", rxBytes: " + Formatter.formatShortFileSize(context, j2));
            }
            printWriter.println("\nOnStartWirelessSetup Bluetooth Device records :");
            String str3 = "";
            while (true) {
                Pair pair2 = (Pair) pfjVar.b.poll();
                if (pair2 == null) {
                    break;
                }
                Date date2 = new Date(((Long) pair2.first).longValue());
                if (str3.equals(pair2.second)) {
                    printWriter.print(".");
                } else {
                    printWriter.printf("\n%s: %s,", simpleDateFormat.format(date2), pair2.second);
                }
                str3 = (String) pair2.second;
            }
            printWriter.println("\nBluetooth device latest record:".concat(pfjVar.c != null ? "" : "NULL"));
            if (pfjVar.c != null) {
                printWriter.println(simpleDateFormat.format(new Date(System.currentTimeMillis())) + ": " + String.format("Device Name: %s,Address: %s,BondState: %s ", pfjVar.c.getName(), pfjVar.c.getAddress(), pfj.a(pfjVar.c.getBondState())));
            }
        } else {
            c2 = 0;
            printWriter.println("WirelessSetupDumpManager is null.");
        }
        kio kioVar = this.k;
        if (kioVar != null) {
            ydx ydxVar = kioVar.l;
            printWriter.println("\nCarClientManager State Change Records :".concat(true != ydxVar.isEmpty() ? "" : "NULL"));
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("EEE, yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
            Iterator<E> it = ydxVar.iterator();
            while (it.hasNext()) {
                Pair pair3 = (Pair) it.next();
                String str4 = simpleDateFormat2.format(new Date(((Long) pair3.first).longValue()));
                Object obj = pair3.second;
                Object[] objArr = new Object[2];
                objArr[c2] = str4;
                objArr[1] = obj;
                printWriter.println(String.format("Timestamp %s - State %s", objArr));
            }
        } else {
            printWriter.println("CarClientManager is null.");
        }
        pbq pbqVar = this.O;
        if (pbqVar != null) {
            ydx ydxVar2 = pbqVar.c;
            printWriter.println("\nCarConnectionStateBroadcastReceiver State Change Records :".concat(true != ydxVar2.isEmpty() ? "" : "NULL"));
            SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("EEE, yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
            Iterator<E> it2 = ydxVar2.iterator();
            while (it2.hasNext()) {
                Pair pair4 = (Pair) it2.next();
                String str5 = simpleDateFormat3.format(new Date(((Long) pair4.first).longValue()));
                Object obj2 = pair4.second;
                Object[] objArr2 = new Object[2];
                objArr2[c2] = str5;
                objArr2[1] = obj2;
                printWriter.println(String.format("Timestamp %s - State %s", objArr2));
            }
        } else {
            printWriter.println("CarConnectionStateBroadcastReceiver is null.");
        }
        if (this.B != null) {
            jlo jloVarB = new phk(this).b();
            try {
                printWriter.println("Allowed cars in database:");
                Iterator it3 = jloVarB.e().iterator();
                while (it3.hasNext()) {
                    printWriter.println((CarInfoInternal) it3.next());
                }
                printWriter.println();
                printWriter.println("Rejected cars in database:");
                Iterator it4 = jloVarB.f().iterator();
                while (it4.hasNext()) {
                    printWriter.println((CarInfoInternal) it4.next());
                }
                printWriter.println();
                jloVarB.close();
            } finally {
            }
        } else {
            printWriter.println("WirelessContext is null.");
        }
        printWriter.println("Dumping logs for the CAR process");
        tez.c(printWriter);
    }

    @Override // defpackage.eqe, android.app.Service
    public final IBinder onBind(Intent intent) {
        super.onBind(intent);
        if (intent.getBooleanExtra("PCTS_MODE", false) || intent.getBooleanExtra("PLUGBOT_AGENT_MODE", false)) {
            ((ype) a.l().ai((char) 6673)).u("Skipping bind initialization due to PCTS/Plugbot mode.");
            return this.y;
        }
        ((ype) a.l().ai((char) 6674)).u("Binding wireless setup service");
        g();
        f();
        return this.y;
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [aitx, java.lang.Object] */
    @Override // defpackage.eqe, android.app.Service
    public final void onCreate() {
        super.onCreate();
        ((PowerManager.WakeLock) this.E.get()).acquire();
        this.q = new kny(getApplicationContext());
        if (c.compareAndSet(false, true)) {
            this.q.d(yxi.WIRELESS_SETUP_SHARED_SERVICE_CLASS_LOADED);
        }
        this.q.d(yxi.WIRELESS_SETUP_SHARED_SERVICE_CREATED);
        this.u = Executors.newScheduledThreadPool((int) aczv.y());
        HandlerThread handlerThread = new HandlerThread("bt-tracker");
        this.G = handlerThread;
        handlerThread.start();
        HandlerThread handlerThread2 = this.G;
        handlerThread2.getClass();
        this.j = new Handler(handlerThread2.getLooper());
        ozb ozbVar = new ozb(jfj.c(this), this.j);
        this.v = ozbVar;
        try {
            ozbVar.a(new pha(this));
            ozd ozdVar = this.v;
            dup.e(((ozb) ozdVar).b, ((ozb) ozdVar).f, ((ozb) ozdVar).l, null, 2);
            ((ozb) ozdVar).c.post(new oez(ozdVar, 19));
            try {
                Executor executor = (Executor) this.t.get();
                ozd ozdVar2 = this.v;
                executor.getClass();
                ozdVar2.getClass();
                kzt kztVar = new kzt(aiji.b(executor));
                this.z = (kzt) a.L(aiqd.b(kztVar.d, afcp.a, new nkn(ozdVar2, kztVar, (afck) null, 10)));
            } catch (ExecutionException e) {
                throw new IllegalStateException("Unable to create head unit presence tracker", e);
            }
        } catch (InterruptedException | ExecutionException e2) {
            throw new IllegalStateException("Failed to start bt state tracker", e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object, pah] */
    @Override // defpackage.eqe, android.app.Service
    public final void onDestroy() {
        this.q.d(yxi.WIRELESS_SETUP_SHARED_SERVICE_DESTROYED);
        if (this.d != 0 || this.e != 0 || this.g || this.p != null) {
            this.q.e(yxi.WIRELESS_WSSS_IS_DESTROYED_BY_OS, OptionalInt.of(this.d | (this.e << 8) | ((this.g ? 1 : 0) << 16) | ((this.p != null ? 1 : 0) << 17)));
        }
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 6675)).u("Destroying wireless setup service");
        if (this.f.compareAndSet(true, false)) {
            pfb.a(getApplicationContext()).b();
            zgp zgpVar = this.s;
            if (zgpVar != null) {
                if (!zgpVar.isDone()) {
                    ((ype) ((ype) yphVar.f()).ai((char) 6665)).u("Cancelling HFP/A2DP device search query");
                    this.s.cancel(false);
                }
                this.s = null;
            }
            pgt pgtVar = this.n;
            pgtVar.n.cancel(pgtVar.d);
            pgtVar.v = Optional.empty();
            ogz ogzVar = this.A;
            if (ogzVar != null) {
                phj phjVar = this.o;
                if (phjVar != null) {
                    phjVar.a.c(ogzVar.a);
                }
                this.A = null;
            }
            rxr rxrVar = this.l;
            if (rxrVar != null) {
                rxrVar.e(this);
            }
            phj phjVar2 = this.o;
            if (phjVar2 != null) {
                ((pgr) phjVar2.a).ah(true);
            }
            this.o = null;
            ((ype) yphVar.l().ai((char) 6695)).u("Unregister CarConnectionListener from CarConnectionStateBroadcastReceiver");
            pbq pbqVar = this.O;
            pbp pbpVar = this.x;
            wer.c();
            pbqVar.b.remove(pbpVar);
            wer.c();
            pbqVar.a.unregisterReceiver(pbqVar);
            this.I.b();
            kio kioVar = this.k;
            if (kioVar != null) {
                kioVar.d();
            }
            BroadcastReceiver broadcastReceiver = this.F;
            if (broadcastReceiver != null) {
                unregisterReceiver(broadcastReceiver);
                this.F = null;
            }
        }
        this.h.removeCallbacksAndMessages(null);
        this.u.shutdown();
        pfi pfiVar = this.m;
        if (pfiVar != null) {
            pfiVar.b(false);
        }
        try {
            ozd ozdVar = this.v;
            ozdVar.getClass();
            try {
                ((ozb) ozdVar).b.unregisterReceiver(((ozb) ozdVar).f);
                ((ozb) ozdVar).c.post(new oez(ozdVar, 20));
                zgp zgpVar2 = zgl.a;
                HandlerThread handlerThread = this.G;
                handlerThread.getClass();
                handlerThread.quitSafely();
                ((PowerManager.WakeLock) this.E.get()).release();
                super.onDestroy();
            } catch (IllegalArgumentException e) {
                throw new IllegalStateException("Bluetooth tracker is stopped twice.", e);
            }
        } catch (InterruptedException | ExecutionException e2) {
            throw new IllegalStateException("Failed to stop bt state tracker", e2);
        }
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        ((ype) a.l().ai((char) 6676)).u("Rebinding wireless setup service");
        g();
        f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01eb  */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, oqe] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, oqe] */
    /* JADX WARN: Type inference failed for: r13v3, types: [aitx, java.lang.Object] */
    @Override // android.app.Service
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int onStartCommand(android.content.Intent r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.auto.wireless.setup.service.impl.WirelessSetupSharedService.onStartCommand(android.content.Intent, int, int):int");
    }

    @Override // android.app.Service, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        if (i == 80) {
            this.q.d(yxi.WIRELESS_SETUP_SHARED_SERVICE_TRIM_MEMORY_COMPLETE);
        }
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        ((ype) a.l().ai((char) 6679)).u("Unbinding wireless setup service");
        int i = this.d;
        if (i > 0) {
            this.d = i - 1;
        }
        d();
        return true;
    }
}
