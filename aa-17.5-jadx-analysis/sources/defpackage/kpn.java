package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.hardware.usb.UsbAccessory;
import android.hardware.usb.UsbManager;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import j$.time.Duration;
import j$.util.Objects;
import j$.util.OptionalInt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class kpn implements kna {
    public static final yph a = yph.c("GH.ConnLoggerV2");
    private static final ygr q = ygr.r("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED", "android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED", "android.hardware.usb.action.USB_STATE", "android.hardware.usb.action.USB_ACCESSORY_DETACHED");
    public final Context b;
    public final zgt c;
    public final SharedPreferences d;
    public final AtomicReference e;
    final AtomicReference f;
    public long g;
    public zgp h;
    public long i;
    public long j;
    public long k;
    public zgp l;
    public final List m;
    public boolean n;
    public boolean o;
    public int p;
    private final AtomicLong r;
    private volatile zgp s;
    private zgp t;
    private final Map u;
    private zgp v;
    private final BroadcastReceiver w;
    private final mbm x;

    public kpn(Context context) {
        zgt zgtVarAJ;
        acot acotVar = acot.a;
        if (acotVar.gu().r()) {
            zgtVarAJ = yrm.aJ(Executors.unconfigurableScheduledExecutorService(new tdy()));
            zgtVarAJ.getClass();
        } else {
            zgtVarAJ = yrm.aJ(Executors.newSingleThreadScheduledExecutor());
        }
        this.e = new AtomicReference();
        this.r = new AtomicLong();
        this.f = new AtomicReference();
        this.g = 0L;
        this.p = 1;
        this.l = new zhc();
        this.t = zgl.a;
        this.m = acotVar.gu().l().b;
        this.u = new HashMap();
        this.w = new kpl(this);
        this.b = context.getApplicationContext();
        this.c = zgtVarAJ;
        this.d = ((lbi) mki.a.i(lbi.class)).a(context, "connectivity_logger_state");
        this.x = new mbm(new kpg(this, 0), new kpg(context, 2));
        C();
    }

    public static final zgp B() {
        return ((oqe) mki.a.i(oqe.class)).f(mki.a.d, new kph());
    }

    private final void C() {
        for (Integer num : acot.a.gu().m().b) {
            num.intValue();
            this.u.put(num, 0);
        }
    }

    private final void D(boolean z) {
        x(new jgv(this, z, 7));
    }

    private final void E(knb knbVar) {
        this.e.set(knbVar);
        this.p = 2;
        zgp zgpVar = this.h;
        if (zgpVar == null || zgpVar.isCancelled()) {
            long jC = acot.a.gu().c();
            oit.a();
            this.i = SystemClock.elapsedRealtime();
            this.h = this.c.scheduleAtFixedRate(new jgw(this, 14), jC, jC, TimeUnit.MILLISECONDS);
            this.o = false;
            this.n = false;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
            dup.e(this.b, this.w, intentFilter, null, 2);
            w();
        }
    }

    private static boolean F(long j, long j2) {
        return j < 0 || j > j2;
    }

    private final void G(int i, OptionalInt optionalInt, long j, int i2) {
        String strConcat;
        wer.b();
        if (this.s == null || (acot.a.gu().j().b.contains(Integer.valueOf(i)) && this.s.isDone())) {
            zgp zgpVarQ = q();
            kpf kpfVar = new kpf(this, 0);
            zgt zgtVar = this.c;
            int i3 = zfb.c;
            zfa zfaVar = new zfa(zgpVarQ, kpfVar);
            zgpVarQ.c(zfaVar, yrm.aK(zgtVar, zfaVar));
            this.s = zfaVar;
        }
        AtomicReference atomicReference = this.e;
        int andIncrement = i2 == 1 ? ((knb) atomicReference.get()).b.getAndIncrement() : ((knb) atomicReference.get()).b.get();
        AtomicReference atomicReference2 = this.e;
        UUID uuid = ((knb) atomicReference2.get()).a;
        yxi yxiVarB = yxi.b(i);
        String strName = yxiVarB != null ? yxiVarB.name() : String.valueOf(i);
        if (i2 == 1) {
            strConcat = "";
        } else {
            strConcat = "throttle ".concat(i2 != 2 ? "THROTTLE_LIMIT_EXCEEDED" : "THROTTLE_LIMIT_REACHED");
        }
        String str = strConcat;
        ype ypeVar = (ype) ((ype) a.f()).ai(3345);
        Integer numValueOf = Integer.valueOf(andIncrement);
        Long lValueOf = Long.valueOf(j);
        ypeVar.U("Session %s, event %d, detail %s, %s, at %d %s", uuid, numValueOf, optionalInt, strName, lValueOf, str);
        rqo rqoVar = new rqo();
        rqoVar.b = yxy.CONNECTIVITY;
        rqoVar.a = yxc.CONNECTIVITY_INFO;
        rqoVar.d = i;
        byte b = rqoVar.i;
        rqoVar.i = (byte) (b | 1);
        rqoVar.c = new xxm(uuid);
        rqoVar.f = andIncrement;
        rqoVar.i = (byte) (b | 3);
        xxh xxhVar = (xxh) optionalInt.stream().mapToObj(new kpe()).findAny().orElse(xvy.a);
        if (xxhVar == null) {
            throw new NullPointerException("Null eventDetail");
        }
        rqoVar.g = xxhVar;
        long j2 = -1;
        if (j != -1) {
            rqoVar.e = new xxm(lValueOf);
            j2 = j;
        }
        rqp rqpVar = (rqp) rqoVar.l();
        Duration durationOfMillis = Duration.ofMillis(j2);
        UUID uuid2 = ((knb) atomicReference2.get()).a;
        int i4 = rqpVar.b;
        yxi yxiVarB2 = yxi.b(i4);
        if (yxiVarB2 == null) {
            Log.w("GH.StartupPerfLogger", a.bp(i4, "Unknown connection event type: "));
        } else {
            tfy tfyVar = tfy.GEARHEAD_COLD_HU_SERVICE_DISCOVERY_COMPLETED;
            int iOrdinal = yxiVarB2.ordinal();
            if (iOrdinal == 33) {
                tgj.g.f(tfy.GEARHEAD_PROJECTION_MODE_STARTED, durationOfMillis, uuid2);
            } else if (iOrdinal == 60) {
                tgj.g.f(tfy.GEARHEAD_WARM_STARTUP_STARTED, durationOfMillis, uuid2);
            } else if (iOrdinal != 63) {
                if (iOrdinal == 85) {
                    tgj.g.f(tfy.GEARHEAD_PROJECTION_ENABLED, durationOfMillis, uuid2);
                } else if (iOrdinal == 117) {
                    tgj.g.f(tfy.GEARHEAD_FRX_STARTED, durationOfMillis, uuid2);
                } else if (iOrdinal == 530) {
                    tgj.g.f(tfy.GEARHEAD_WIRELESS_WARM_STARTUP_STARTED, durationOfMillis, uuid2);
                } else if (iOrdinal == 536) {
                    tgj.g.f(tfy.GEARHEAD_WIRELESS_COLD_STARTUP_STARTED, durationOfMillis, uuid2);
                } else if (iOrdinal != 121) {
                    if (iOrdinal != 122) {
                        if (iOrdinal == 722) {
                            tgj.g.f(tfy.GEARHEAD_WIRELESS_CONTROL_CHANNEL_CONNECT_ATTEMPT_RFCOMM, durationOfMillis, uuid2);
                        } else if (iOrdinal == 723) {
                            tgj.g.f(tfy.GEARHEAD_WIRELESS_CONTROL_CHANNEL_CONNECT_ATTEMPT_TCP, durationOfMillis, uuid2);
                        } else if (iOrdinal == 737) {
                            tgj.g.f(tfy.GEARHEAD_WIRELESS_START_REQUEST_RECEIVED_RFCOMM, durationOfMillis, uuid2);
                        } else if (iOrdinal == 738) {
                            tgj.g.f(tfy.GEARHEAD_WIRELESS_START_REQUEST_RECEIVED_TCP, durationOfMillis, uuid2);
                        } else if (iOrdinal == 741) {
                            tgj.g.f(tfy.GEARHEAD_WIRELESS_VERSION_REQUEST_RECEIVED_RFCOMM, durationOfMillis, uuid2);
                        } else if (iOrdinal != 742) {
                            switch (iOrdinal) {
                                case 141:
                                case 142:
                                    tgj.g.f(tfy.PROJECTION_STARTED_USB, durationOfMillis, uuid2);
                                    break;
                                case 143:
                                    tgj.g.f(tfy.PROJECTION_STARTED_WIRELESS, durationOfMillis, uuid2);
                                    break;
                                default:
                                    switch (iOrdinal) {
                                        case 624:
                                            tgj.g.f(tfy.GEARHEAD_COLD_STARTUP_STARTED, durationOfMillis, uuid2);
                                            break;
                                        case 625:
                                            tgj.g.f(tfy.GEARHEAD_FACET_BAR_FIRST_RESUME, durationOfMillis, uuid2);
                                            break;
                                        case 626:
                                            tgj.g.f(tfy.GEARHEAD_CAR_SERVICE_VIDEO_FOCUS_GAINED, durationOfMillis, uuid2);
                                            break;
                                        case 627:
                                            tgj.g.f(tfy.PROJECTION_LIFECYCLE_LISTENER_ON_PROJECTION_START, durationOfMillis, uuid2);
                                            break;
                                        case 628:
                                            tgj.g.f(tfy.PRIMARY_REGION_FIRST_CAR_ACTIVITY_RESUME, durationOfMillis, uuid2);
                                            break;
                                    }
                            }
                        } else {
                            tgj.g.f(tfy.GEARHEAD_WIRELESS_VERSION_REQUEST_RECEIVED_TCP, durationOfMillis, uuid2);
                        }
                    } else if (acur.a.gu().o()) {
                        tgj.g.f(tfy.GEARHEAD_PREFLIGHT_COMPLETED, durationOfMillis, uuid2);
                    }
                } else if (acur.a.gu().o()) {
                    tgj.g.f(tfy.GEARHEAD_PREFLIGHT_STARTED, durationOfMillis, uuid2);
                }
            } else if ("perfgate".equals(acur.a.gu().e())) {
                tgj.g.f(tfy.GEARHEAD_WARM_STARTUP_STARTED, durationOfMillis, uuid2);
            }
        }
        this.s.getClass();
        zgp zgpVar = this.s;
        zgpVar.c(new zgf(zgpVar, new kpk(this, rqoVar, j2, i2)), this.c);
    }

    public static long p() {
        oit.a();
        return SystemClock.elapsedRealtime();
    }

    public static UUID r(knb knbVar) {
        if (knbVar != null) {
            return knbVar.a;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v28, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v11, types: [android.content.SharedPreferences, java.lang.Object] */
    final void A(int i, long j) {
        int i2;
        long j2;
        wer.b();
        long jH = acot.a.gu().h();
        int i3 = this.p;
        int i4 = i3 - 1;
        if (i3 == 0) {
            throw null;
        }
        if (i4 == 0) {
            SharedPreferences sharedPreferences = this.d;
            if (sharedPreferences.contains("drive_id_high_bits") && sharedPreferences.contains("drive_id_low_bits") && sharedPreferences.contains("session_start_time_ms") && sharedPreferences.contains("event_index")) {
                long j3 = sharedPreferences.getLong("last_event_time_ms", -1L);
                i2 = 1;
                if (F(j - j3, jH)) {
                    ((ype) a.l().ai(3343)).G("Cannot revive session: last event time = %d, current event time = %d", j3, j);
                    j2 = j;
                } else {
                    j2 = j;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long j4 = sharedPreferences.getLong("last_saved_time_ms", -1L);
                    if (F(jCurrentTimeMillis - j4, jH)) {
                        ((ype) a.l().ai(3342)).G("Cannot revive session: last saved time = %d, current time = %d", j4, jCurrentTimeMillis);
                    } else {
                        long j5 = sharedPreferences.getLong("drive_id_high_bits", 0L);
                        long j6 = sharedPreferences.getLong("drive_id_low_bits", 0L);
                        long j7 = sharedPreferences.getLong("session_start_time_ms", -1L);
                        int i5 = sharedPreferences.getInt("event_index", -1);
                        if (j5 != 0 && j6 != 0 && j7 >= 0 && i5 >= 0) {
                            knb knbVar = new knb(new UUID(j5, j6), new AtomicInteger(i5), j7);
                            E(knbVar);
                            ((ype) ((ype) a.f()).ai(3358)).R("Revived session %s, start time = %d, event index = %d", knbVar.a, Long.valueOf(knbVar.c), Integer.valueOf(knbVar.b.get()));
                            t(yxi.SESSION_REVIVED);
                            return;
                        }
                        ((ype) ((ype) a.g()).ai(3357)).S("Bad saved session: high bits = %d, low bits = %d, start time = %d, event index = %d", Long.valueOf(j5), Long.valueOf(j6), Long.valueOf(j7), Integer.valueOf(i5));
                    }
                }
            } else {
                i2 = 1;
                j2 = j;
                ((ype) ((ype) a.h()).ai((char) 3341)).u("Saved session not found in SharedPreferences");
            }
        } else {
            if (i4 == 1) {
                return;
            }
            if (i4 == 2) {
                if (this.m.contains(Integer.valueOf(i))) {
                    ((ype) ((ype) a.f()).ai((char) 3364)).w("Would have extended the session, but event type %d is non-extending", i);
                    return;
                }
                ((ype) ((ype) a.f()).ai(3363)).y("Resumed session %s", ((knb) this.e.get()).a);
                t(yxi.SESSION_RESUMED);
                this.p = 2;
                return;
            }
            if (i4 == 3) {
                ((ype) ((ype) a.f()).ai((char) 3365)).u("Session expired, will start a new session");
            }
            i2 = 1;
            j2 = j;
        }
        knb knbVar2 = new knb(((lbi) mki.a.i(lbi.class)).d(), new AtomicInteger(0), j2);
        E(knbVar2);
        mbm mbmVar = this.x;
        xxx xxxVarF = xxx.d(",").b().f();
        ?? r6 = mbmVar.a;
        List listI = xxxVarF.i(r6.getString("drive_session_info_key", ""));
        UUID uuid = knbVar2.a;
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        Object[] objArr = new Object[2];
        objArr[0] = uuid;
        objArr[i2] = lValueOf;
        String[] strArr = {String.format("%s/%d", objArr)};
        ArrayList arrayList = new ArrayList(yrm.O(i2));
        Collections.addAll(arrayList, strArr);
        arrayList.addAll(listI);
        r6.edit().putString("drive_session_info_key", new xxd(",").b(yrm.ak(arrayList, 10))).apply();
        ?? r1 = mbmVar.b;
        if (r1 != 0) {
            r1.edit().putString("connectivity_lifetime_id", uuid.toString()).apply();
        }
        ype ypeVar = (ype) ((ype) a.f()).ai(3362);
        long j8 = knbVar2.c;
        ypeVar.L("Started session %s, start time = %d", uuid, j8);
        v(yxi.SESSION_STARTED, OptionalInt.empty(), j8);
    }

    @Override // defpackage.kna
    public final void a(final boolean z, boolean z2) {
        final long jP = p();
        g(yxi.ANDROID_AUTO_BLUETOOTH_CONNECTED, OptionalInt.empty(), jP);
        if (z2) {
            g(yxi.ANDROID_AUTO_WIRELESS_CAPABLE_BLUETOOTH_CONNECTED, OptionalInt.empty(), jP);
        }
        if (z) {
            g(yxi.ANDROID_AUTO_DONGLE_CONNECTED, OptionalInt.empty(), jP);
        }
        x(new Runnable() { // from class: kpj
            @Override // java.lang.Runnable
            public final void run() {
                UUID uuid = ((knb) this.a.e.get()).a;
                rqk rqkVar = new rqk();
                rqkVar.b = yxy.CONNECTIVITY;
                rqkVar.a = yxc.BT_PROFILE_CONNECT;
                rqkVar.f = true != z ? 2 : 3;
                rqkVar.c = xxh.h(uuid);
                rqkVar.d = jP;
                rqkVar.e = (byte) 1;
                ebf.j().d((rql) rqkVar.l());
            }
        });
    }

    @Override // defpackage.kna
    public final void b() {
        yop yopVarF = a.f();
        AtomicReference atomicReference = this.f;
        ((ype) ((ype) yopVarF).ai((char) 3344)).y("Clear current plugbot callback (asBinder: %s).", ((mkb) atomicReference.get()).asBinder());
        atomicReference.set(null);
    }

    @Override // defpackage.kna
    public final void c(Intent intent) {
        woy.O(q.contains(intent.getAction()), "not allowed connectivity logger intent");
        x(new jgw(this, 16));
    }

    @Override // defpackage.kna
    public final void d(yxi yxiVar) {
        e(yxiVar, OptionalInt.empty());
    }

    @Override // defpackage.kna
    public final void e(yxi yxiVar, OptionalInt optionalInt) {
        g(yxiVar, optionalInt, p());
    }

    @Override // defpackage.kna
    public final void f(final int i, final OptionalInt optionalInt, long j) {
        if (j <= 0) {
            oit.a();
            j = SystemClock.elapsedRealtime();
        }
        final long j2 = j;
        this.r.getAndSet(j2);
        x(new Runnable() { // from class: kpd
            @Override // java.lang.Runnable
            public final void run() {
                kpn kpnVar = this.a;
                List list = kpnVar.m;
                int i2 = i;
                if (!list.contains(Integer.valueOf(i2))) {
                    kpnVar.g++;
                    oit.a();
                    kpnVar.k = SystemClock.elapsedRealtime();
                }
                OptionalInt optionalInt2 = optionalInt;
                long j3 = j2;
                kpnVar.A(i2, j3);
                kpnVar.u(i2, optionalInt2, j3);
            }
        });
    }

    @Override // defpackage.kna
    public final void g(yxi yxiVar, OptionalInt optionalInt, long j) {
        yxiVar.getClass();
        f(yxiVar.pC, optionalInt, j);
    }

    @Override // defpackage.kna
    public final void h() {
        D(false);
    }

    @Override // defpackage.kna
    public final void i(String str, String str2) {
        ((ype) ((ype) a.f()).ai((char) 3355)).u("Projection started");
        D(true);
        if (str2 == null || str == null || Objects.equals(str2, str) || !mpl.f().b().c(str, scw.a)) {
            return;
        }
        d(yxi.ANDROID_AUTO_USB_CAPABILITY_VIA_DONGLE_REGISTERED);
    }

    @Override // defpackage.kna
    public final int j() {
        return this.p;
    }

    @Override // defpackage.kna
    public final void k(final int i, final int i2, final yxk yxkVar, final long j) {
        this.r.getAndSet(j);
        x(new Runnable() { // from class: kpc
            @Override // java.lang.Runnable
            public final void run() {
                int i3 = yxi.UNKNOWN.pC;
                long j2 = j;
                kpn kpnVar = this.a;
                kpnVar.A(i3, j2);
                UUID uuid = ((knb) kpnVar.e.get()).a;
                ype ypeVar = (ype) ((ype) kpn.a.f()).ai(3354);
                yxk yxkVar2 = yxkVar;
                int i4 = i2;
                int i5 = i;
                ypeVar.T("Session %s, from %s, to %s, reason %s at time %d.", uuid, zeb.w(i5), zeb.w(i4), yxkVar2.name(), Long.valueOf(j2));
                rqq rqqVar = new rqq();
                rqqVar.b = yxy.CONNECTIVITY;
                rqqVar.a = yxc.CONNECTIVITY_STATE;
                rqqVar.g = i4;
                rqqVar.c = xxh.h(uuid);
                rqqVar.h = i5;
                rqqVar.d = yxkVar2;
                rqqVar.e = j2;
                rqqVar.f = (byte) 1;
                ebf.j().d((rqr) rqqVar.l());
            }
        });
    }

    @Override // defpackage.kna
    public final void l(mkb mkbVar) {
        mkbVar.getClass();
        this.f.set(mkbVar);
    }

    @Override // defpackage.kna
    public final void m(mkb mkbVar) {
        mkbVar.getClass();
        this.f.set(null);
    }

    @Override // defpackage.kna
    public final void n(mkb mkbVar) {
        mkbVar.getClass();
        ((ype) ((ype) a.f()).ai((char) 3361)).y("Set plugbot callback (asBinder: %s) to connectivity logger.", mkbVar.asBinder());
        this.f.set(mkbVar);
    }

    @Override // defpackage.kna
    public final void o(mmc mmcVar) {
        x(new jgw(mmcVar, 17));
    }

    public final zgp q() {
        int i = 0;
        if (!((mdk) mki.a.i(mdk.class)).g()) {
            return new zgl(false);
        }
        zgp zgpVar = this.v;
        if (zgpVar != null && !zgpVar.isDone()) {
            return this.v;
        }
        if (BluetoothAdapter.getDefaultAdapter() == null) {
            return new zgl(false);
        }
        zgp zgpVarB = B();
        kpi kpiVar = new kpi(i);
        zfq zfqVar = zfq.a;
        int i2 = zfb.c;
        zfa zfaVar = new zfa(zgpVarB, kpiVar);
        zgpVarB.c(zfaVar, yrm.aK(zfqVar, zfaVar));
        this.v = zfaVar;
        return zfaVar;
    }

    public final void s() {
        C();
        this.h.cancel(false);
        Context context = this.b;
        etb.a(context).d(new Intent("com.google.android.apps.auto.components.connectivity.ACTION_SESSION_EXPIRED"));
        this.l.cancel(false);
        this.t.cancel(false);
        context.unregisterReceiver(this.w);
        this.p = 4;
        this.e.set(null);
    }

    public final void t(yxi yxiVar) {
        v(yxiVar, OptionalInt.empty(), p());
    }

    public final void u(int i, OptionalInt optionalInt, long j) {
        int i2;
        kpn kpnVar;
        int i3;
        OptionalInt optionalInt2;
        long j2;
        wer.b();
        wer.b();
        abod abodVar = acot.a.gu().i().b;
        Integer numValueOf = Integer.valueOf(i);
        int i4 = 3;
        if (!abodVar.contains(numValueOf)) {
            Map map = this.u;
            if (map.containsKey(numValueOf)) {
                int iIntValue = ((Integer) map.get(numValueOf)).intValue();
                long j3 = iIntValue;
                long jE = acot.e();
                if (j3 == jE) {
                    i4 = 2;
                } else if (j3 <= jE) {
                    i4 = 1;
                }
                map.put(numValueOf, Integer.valueOf(iIntValue + 1));
            } else {
                i4 = 1;
            }
        }
        if (i4 == 2) {
            kpnVar = this;
            j2 = j;
            kpnVar.G(4206, OptionalInt.of(i), j2, 1);
            i2 = 2;
            i3 = i;
            optionalInt2 = optionalInt;
        } else {
            i2 = i4;
            kpnVar = this;
            i3 = i;
            optionalInt2 = optionalInt;
            j2 = j;
        }
        kpnVar.G(i3, optionalInt2, j2, i2);
    }

    public final void v(yxi yxiVar, OptionalInt optionalInt, long j) {
        u(yxiVar.pC, optionalInt, j);
    }

    public final void w() {
        this.t.cancel(false);
        this.t = this.c.schedule(new jgw(this, 15), acot.a.gu().b(), TimeUnit.MILLISECONDS);
    }

    final void x(Runnable runnable) {
        this.c.execute(runnable);
    }

    public final boolean y() {
        UsbAccessory[] accessoryList;
        UsbManager usbManager = (UsbManager) this.b.getSystemService("usb");
        if (usbManager != null && (accessoryList = usbManager.getAccessoryList()) != null) {
            for (UsbAccessory usbAccessory : accessoryList) {
                if (usbAccessory != null && ("Android Auto".equals(usbAccessory.getModel()) || "Android Open Automotive Protocol".equals(usbAccessory.getModel()))) {
                    return true;
                }
            }
        }
        return false;
    }

    final void z(rqp rqpVar, long j, int i) {
        if (i == 1) {
            ((ohs) mki.a.i(ohs.class)).d(rqpVar);
        }
        int i2 = rqpVar.b;
        if (i2 != yxi.SESSION_EXPIRED.pC && i2 != yxi.SESSION_OBSOLETE.pC) {
            knb knbVar = (knb) this.e.get();
            if (Objects.equals(knbVar != null ? knbVar.a : null, rqpVar.a.e())) {
                SharedPreferences sharedPreferences = this.d;
                UUID uuid = knbVar.a;
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putLong("drive_id_high_bits", uuid.getMostSignificantBits());
                editorEdit.putLong("drive_id_low_bits", uuid.getLeastSignificantBits());
                editorEdit.putInt("event_index", knbVar.b.get());
                editorEdit.putLong("last_event_time_ms", j);
                editorEdit.putLong("last_saved_time_ms", System.currentTimeMillis());
                editorEdit.putLong("session_start_time_ms", knbVar.c);
                editorEdit.apply();
            } else {
                ((ype) ((ype) a.f()).ai((char) 3359)).u("dropped saving session id as it's obsolete");
            }
        }
        mkb mkbVar = (mkb) this.f.get();
        if (mkbVar == null) {
            return;
        }
        yxi yxiVarB = yxi.b(i2);
        String strName = yxiVarB != null ? yxiVarB.name() : String.valueOf(rqpVar);
        ygp ygpVar = new ygp();
        ygpVar.k(acve.b().b);
        ygpVar.k(acve.c().b);
        ygpVar.k(acve.d().b);
        if (ygpVar.g().contains(Integer.valueOf(i2))) {
            try {
                Parcel parcelGh = mkbVar.gh();
                parcelGh.writeString(strName);
                mkbVar.gj(2, parcelGh);
            } catch (RemoteException unused) {
                ((ype) a.l().ai((char) 3360)).u("Remote gone, removing callback.");
                this.f.set(null);
            }
        }
    }
}
