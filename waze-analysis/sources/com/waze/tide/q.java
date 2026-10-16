package com.waze.tide;

import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.core.app.NotificationCompat;
import com.waze.ac;
import com.waze.cs;
import com.waze.navigate.eo;
import j$.time.Duration;
import j$.time.Instant;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class q implements o {

    /* renamed from: a, reason: collision with root package name */
    private final g f40945a;

    /* renamed from: b, reason: collision with root package name */
    private final eo f40946b;

    /* renamed from: c, reason: collision with root package name */
    private final ac f40947c;

    /* renamed from: d, reason: collision with root package name */
    private final f f40948d;

    /* renamed from: e, reason: collision with root package name */
    private final x f40949e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.shared_infra.q.e f40950f;

    /* renamed from: g, reason: collision with root package name */
    private final Context f40951g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f40952h;

    /* renamed from: i, reason: collision with root package name */
    private final SharedPreferences f40953i;

    /* renamed from: j, reason: collision with root package name */
    private final af f40954j;

    /* renamed from: k, reason: collision with root package name */
    private final bn f40955k;

    /* renamed from: l, reason: collision with root package name */
    private final ch f40956l;

    public q(g gVar, eo eoVar, ac acVar, f fVar, x xVar, com.waze.shared_infra.q.e eVar, t tVar, Context context, s sVar, com.waze.shared_infra.i.e eVar2, SharedPreferences sharedPreferences, h.c.j jVar) {
        h.g.b.x.f(gVar, "tideConfig");
        h.g.b.x.f(eoVar, "navigationStatusInterface");
        h.g.b.x.f(acVar, "backgroundStateProvider");
        h.g.b.x.f(fVar, "driveDetectionApi");
        h.g.b.x.f(xVar, "tideStatSender");
        h.g.b.x.f(eVar, "clock");
        h.g.b.x.f(tVar, "permissionsHelper");
        h.g.b.x.f(context, "context");
        h.g.b.x.f(sVar, "locationProvider");
        h.g.b.x.f(eVar2, "logger");
        h.g.b.x.f(sharedPreferences, "sharedPref");
        h.g.b.x.f(jVar, "coroutineContext");
        this.f40945a = gVar;
        this.f40946b = eoVar;
        this.f40947c = acVar;
        this.f40948d = fVar;
        this.f40949e = xVar;
        this.f40950f = eVar;
        this.f40951g = context;
        this.f40952h = eVar2;
        this.f40953i = sharedPreferences;
        this.f40954j = aj.e(jVar);
        bn bnVarB = ck.b(n.f40940a);
        this.f40955k = bnVarB;
        this.f40956l = ai.U(bnVarB);
    }

    public static final /* synthetic */ com.waze.bz.a j(BluetoothDevice bluetoothDevice) {
        String strK = k(bluetoothDevice);
        String name = bluetoothDevice.getName();
        if (name == null && strK == null) {
            return null;
        }
        return (name == null || strK == null) ? name != null ? new a(name) : new c(strK) : new b(name, strK);
    }

    private static final String k(BluetoothDevice bluetoothDevice) {
        BluetoothClass bluetoothClass = bluetoothDevice.getBluetoothClass();
        if (bluetoothClass == null) {
            return null;
        }
        int deviceClass = bluetoothClass.getDeviceClass();
        return deviceClass == 256 ? "COMPUTER_UNCATEGORIZED" : deviceClass == 260 ? "COMPUTER_DESKTOP" : deviceClass == 264 ? "COMPUTER_SERVER" : deviceClass == 268 ? "COMPUTER_LAPTOP" : deviceClass == 272 ? "COMPUTER_HANDHELD_PC_PDA" : deviceClass == 276 ? "COMPUTER_PALM_SIZE_PC_PDA" : deviceClass == 280 ? "COMPUTER_WEARABLE" : deviceClass == 512 ? "PHONE_UNCATEGORIZED" : deviceClass == 516 ? "PHONE_CELLULAR" : deviceClass == 520 ? "PHONE_CORDLESS" : deviceClass == 524 ? "PHONE_SMART" : deviceClass == 528 ? "PHONE_MODEM_OR_GATEWAY" : deviceClass == 532 ? "PHONE_ISDN" : deviceClass == 1024 ? "AUDIO_VIDEO_UNCATEGORIZED" : deviceClass == 1028 ? "AUDIO_VIDEO_WEARABLE_HEADSET" : deviceClass == 1032 ? "AUDIO_VIDEO_HANDSFREE" : deviceClass == 1040 ? "AUDIO_VIDEO_MICROPHONE" : deviceClass == 1044 ? "AUDIO_VIDEO_LOUDSPEAKER" : deviceClass == 1048 ? "AUDIO_VIDEO_HEADPHONES" : deviceClass == 1052 ? "AUDIO_VIDEO_PORTABLE_AUDIO" : deviceClass == 1056 ? "AUDIO_VIDEO_CAR_AUDIO" : deviceClass == 1060 ? "AUDIO_VIDEO_SET_TOP_BOX" : deviceClass == 1064 ? "AUDIO_VIDEO_HIFI_AUDIO" : deviceClass == 1068 ? "AUDIO_VIDEO_VCR" : deviceClass == 1072 ? "AUDIO_VIDEO_VIDEO_CAMERA" : deviceClass == 1076 ? "AUDIO_VIDEO_CAMCORDER" : deviceClass == 1080 ? "AUDIO_VIDEO_VIDEO_MONITOR" : deviceClass == 1084 ? "AUDIO_VIDEO_VIDEO_DISPLAY_AND_LOUDSPEAKER" : deviceClass == 1088 ? "AUDIO_VIDEO_VIDEO_CONFERENCING" : deviceClass == 1096 ? "AUDIO_VIDEO_VIDEO_GAMING_TOY" : deviceClass == 1792 ? "WEARABLE_UNCATEGORIZED" : deviceClass == 1796 ? "WEARABLE_WRIST_WATCH" : deviceClass == 1800 ? "WEARABLE_PAGER" : deviceClass == 1804 ? "WEARABLE_JACKET" : deviceClass == 1808 ? "WEARABLE_HELMET" : deviceClass == 1812 ? "WEARABLE_GLASSES" : deviceClass == 2048 ? "TOY_UNCATEGORIZED" : deviceClass == 2052 ? "TOY_ROBOT" : deviceClass == 2056 ? "TOY_VEHICLE" : deviceClass == 2060 ? "TOY_DOLL_ACTION_FIGURE" : deviceClass == 2064 ? "TOY_CONTROLLER" : deviceClass == 2068 ? "TOY_GAME" : deviceClass == 2304 ? "HEALTH_UNCATEGORIZED" : deviceClass == 2308 ? "HEALTH_BLOOD_PRESSURE" : deviceClass == 2312 ? "HEALTH_THERMOMETER" : deviceClass == 2316 ? "HEALTH_WEIGHING" : deviceClass == 2320 ? "HEALTH_GLUCOSE" : deviceClass == 2324 ? "HEALTH_PULSE_OXIMETER" : deviceClass == 2328 ? "HEALTH_PULSE_RATE" : deviceClass == 2332 ? "HEALTH_DATA_DISPLAY" : deviceClass == 1280 ? "PERIPHERAL_NON_KEYBOARD_NON_POINTING" : deviceClass == 1344 ? "PERIPHERAL_KEYBOARD" : deviceClass == 1408 ? "PERIPHERAL_POINTING" : deviceClass == 1472 ? "PERIPHERAL_KEYBOARD_POINTING" : "UNKNOWN_DEVICE_CLASS";
    }

    @Override // com.waze.tide.o
    public final ch a() {
        return this.f40956l;
    }

    @Override // com.waze.tide.o
    public final void b() {
        this.f40955k.e(n.f40940a);
        this.f40945a.c();
    }

    @Override // com.waze.tide.o
    public final boolean c() {
        return !t.b(this.f40951g);
    }

    @Override // com.waze.tide.o
    public final boolean d() {
        return this.f40945a.h() && !t.b(this.f40951g);
    }

    @Override // com.waze.tide.o
    public final void e(s sVar) {
        h.g.b.x.f(sVar, NotificationCompat.CATEGORY_EVENT);
        if (sVar instanceof i) {
            g gVar = this.f40945a;
            gVar.b();
            if (gVar.f()) {
                x xVar = this.f40949e;
                Context context = this.f40951g;
                xVar.e(new w(t.a(context), t.b(context)));
                return;
            }
            return;
        }
        if (sVar instanceof j) {
            this.f40955k.e(m.f40939a);
            return;
        }
        if (!(sVar instanceof k)) {
            if (!(sVar instanceof l)) {
                throw new h.i();
            }
            this.f40945a.d(true);
            return;
        }
        BluetoothDevice bluetoothDeviceA = ((k) sVar).a();
        com.waze.shared_infra.q.e eVar = this.f40950f;
        SharedPreferences sharedPreferences = this.f40953i;
        Instant instantB = eVar.b();
        Instant instantOfEpochMilli = Instant.ofEpochMilli(sharedPreferences.getLong("last_blu_con", 0L));
        com.waze.shared_infra.i.e eVar2 = this.f40952h;
        Instant instant = instantOfEpochMilli;
        Instant instant2 = instantB;
        Duration durationBetween = Duration.between(instant, instant2);
        h.g.b.x.e(durationBetween, "between(...)");
        long seconds = durationBetween.getSeconds();
        h.o.d dVar = h.o.d.f48273d;
        long j2 = h.o.c.j(seconds, dVar);
        int nano = durationBetween.getNano();
        h.o.d dVar2 = h.o.d.f48270a;
        String strY = h.o.a.y(h.o.a.r(j2, h.o.c.i(nano, dVar2)));
        g gVar2 = this.f40945a;
        eVar2.a("TIDE checkEnoughTimeSinceLastRequestPassed\nlastConnection: " + instantOfEpochMilli + "\ntimestamp: " + instantB + "\nduration:" + strY + "\nminInterval: " + h.o.a.y(gVar2.a()));
        Duration durationBetween2 = Duration.between(instant, instant2);
        h.g.b.x.e(durationBetween2, "between(...)");
        boolean z = h.o.a.c(h.o.a.r(h.o.c.j(durationBetween2.getSeconds(), dVar), h.o.c.i(durationBetween2.getNano(), dVar2)), gVar2.a()) > 0;
        if (gVar2.g() && !gVar2.e() && !this.f40946b.T() && cs.f(this.f40947c) && z && t.b(this.f40951g)) {
            eVar2.a("BluetoothConnectionReceiver Connected to: ".concat(String.valueOf(bluetoothDeviceA.getName())));
            eVar2.a("BluetoothConnectionReceiver deviceClass: ".concat(String.valueOf(k(bluetoothDeviceA))));
            long epochMilli = eVar.b().toEpochMilli();
            eVar2.a("TIDE sending request at: " + epochMilli);
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            h.g.b.x.c(editorEdit);
            editorEdit.putLong("last_blu_con", epochMilli);
            editorEdit.apply();
            aj.z(this.f40954j, null, null, new p(this, bluetoothDeviceA, null), 3);
            return;
        }
        eo eoVar = this.f40946b;
        ac acVar = this.f40947c;
        Context context2 = this.f40951g;
        eVar2.a("BluetoothConnectionReceiver TIDE didn't meet conditions, not sending request:\nisEnabled: " + gVar2.g() + "\ndidUserOptout: " + gVar2.e() + "\nisNavigating: " + eoVar.T() + "\nisBackgroundValue: " + cs.f(acVar) + "\nenoughTimePassed: " + z + "\nhasBluetoothPermission: " + t.b(context2));
    }
}
