package bc;

import android.content.Context;
import android.hardware.SensorManager;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import qc.C3884a;
import qc.InterfaceC3885b;
import tc.g;
import uc.C4273j;
import uc.C4278o;
import uc.C4281r;
import uc.InterfaceC4269f;
import uc.InterfaceC4279p;
import uc.InterfaceC4280q;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010$\u001a\u00020%2\b\b\u0001\u0010&\u001a\u00020'H\u0016J\u0012\u0010(\u001a\u00020%2\b\b\u0001\u0010&\u001a\u00020'H\u0016J\u0018\u0010)\u001a\u00020%2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0016J\u0018\u0010.\u001a\u00020%2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0002J\b\u00103\u001a\u00020%H\u0002J\u0018\u00104\u001a\u00020%2\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u000206H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lfinaldev/motion_sensors/MotionSensorsPlugin;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "<init>", "()V", "METHOD_CHANNEL_NAME", "", "ACCELEROMETER_CHANNEL_NAME", "GYROSCOPE_CHANNEL_NAME", "MAGNETOMETER_CHANNEL_NAME", "USER_ACCELEROMETER_CHANNEL_NAME", "ORIENTATION_CHANNEL_NAME", "ABSOLUTE_ORIENTATION_CHANNEL_NAME", "SCREEN_ORIENTATION_CHANNEL_NAME", "sensorManager", "Landroid/hardware/SensorManager;", "methodChannel", "Lio/flutter/plugin/common/MethodChannel;", "accelerometerChannel", "Lio/flutter/plugin/common/EventChannel;", "gyroscopeChannel", "magnetometerChannel", "userAccelerometerChannel", "orientationChannel", "absoluteOrientationChannel", "screenOrientationChannel", "accelerationStreamHandler", "Lfinaldev/motion_sensors/StreamHandlerImpl;", "gyroScopeStreamHandler", "magnetometerStreamHandler", "userAccelerationStreamHandler", "orientationStreamHandler", "Lfinaldev/motion_sensors/RotationVectorStreamHandler;", "absoluteOrientationStreamHandler", "screenOrientationStreamHandler", "Lfinaldev/motion_sensors/ScreenOrientationStreamHandler;", "onAttachedToEngine", "", "binding", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "onDetachedFromEngine", "onMethodCall", "call", "Lio/flutter/plugin/common/MethodCall;", "result", "Lio/flutter/plugin/common/MethodChannel$Result;", "setupEventChannels", "context", "Landroid/content/Context;", "messenger", "Lio/flutter/plugin/common/BinaryMessenger;", "teardownEventChannels", "setSensorUpdateInterval", "sensorType", "", "interval", "motion_sensors_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* renamed from: bc.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1523a implements InterfaceC3885b, InterfaceC4279p {

    /* renamed from: a, reason: collision with root package name */
    public SensorManager f19419a;

    /* renamed from: b, reason: collision with root package name */
    public C4281r f19420b;

    /* renamed from: c, reason: collision with root package name */
    public C4273j f19421c;

    /* renamed from: d, reason: collision with root package name */
    public C4273j f19422d;

    /* renamed from: e, reason: collision with root package name */
    public C4273j f19423e;

    /* renamed from: f, reason: collision with root package name */
    public C4273j f19424f;

    /* renamed from: g, reason: collision with root package name */
    public C4273j f19425g;

    /* renamed from: h, reason: collision with root package name */
    public C4273j f19426h;

    /* renamed from: i, reason: collision with root package name */
    public C4273j f19427i;

    /* renamed from: j, reason: collision with root package name */
    public b f19428j;
    public b k;

    /* renamed from: l, reason: collision with root package name */
    public b f19429l;

    /* renamed from: m, reason: collision with root package name */
    public b f19430m;

    /* renamed from: n, reason: collision with root package name */
    public b f19431n;

    /* renamed from: o, reason: collision with root package name */
    public b f19432o;

    /* renamed from: p, reason: collision with root package name */
    public c f19433p;

    @Override // qc.InterfaceC3885b
    public final void onAttachedToEngine(C3884a binding) {
        AbstractC3340k.e(binding, "binding");
        Context context = binding.f44186a;
        AbstractC3340k.d(context, "getApplicationContext(...)");
        InterfaceC4269f interfaceC4269f = binding.f44188c;
        AbstractC3340k.d(interfaceC4269f, "getBinaryMessenger(...)");
        Object systemService = context.getSystemService("sensor");
        AbstractC3340k.c(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        this.f19419a = (SensorManager) systemService;
        C4281r c4281r = new C4281r(interfaceC4269f, "motion_sensors/method");
        this.f19420b = c4281r;
        c4281r.b(this);
        this.f19421c = new C4273j(interfaceC4269f, "motion_sensors/accelerometer");
        SensorManager sensorManager = this.f19419a;
        AbstractC3340k.b(sensorManager);
        this.f19428j = new b(sensorManager, 1, 1);
        C4273j c4273j = this.f19421c;
        AbstractC3340k.b(c4273j);
        b bVar = this.f19428j;
        AbstractC3340k.b(bVar);
        c4273j.a(bVar);
        this.f19424f = new C4273j(interfaceC4269f, "motion_sensors/user_accelerometer");
        SensorManager sensorManager2 = this.f19419a;
        AbstractC3340k.b(sensorManager2);
        this.f19430m = new b(sensorManager2, 10, 1);
        C4273j c4273j2 = this.f19424f;
        AbstractC3340k.b(c4273j2);
        b bVar2 = this.f19430m;
        AbstractC3340k.b(bVar2);
        c4273j2.a(bVar2);
        this.f19422d = new C4273j(interfaceC4269f, "motion_sensors/gyroscope");
        SensorManager sensorManager3 = this.f19419a;
        AbstractC3340k.b(sensorManager3);
        this.k = new b(sensorManager3, 4, 1);
        C4273j c4273j3 = this.f19422d;
        AbstractC3340k.b(c4273j3);
        b bVar3 = this.k;
        AbstractC3340k.b(bVar3);
        c4273j3.a(bVar3);
        this.f19423e = new C4273j(interfaceC4269f, "motion_sensors/magnetometer");
        SensorManager sensorManager4 = this.f19419a;
        AbstractC3340k.b(sensorManager4);
        this.f19429l = new b(sensorManager4, 2, 1);
        C4273j c4273j4 = this.f19423e;
        AbstractC3340k.b(c4273j4);
        b bVar4 = this.f19429l;
        AbstractC3340k.b(bVar4);
        c4273j4.a(bVar4);
        this.f19425g = new C4273j(interfaceC4269f, "motion_sensors/orientation");
        SensorManager sensorManager5 = this.f19419a;
        AbstractC3340k.b(sensorManager5);
        this.f19431n = new b(sensorManager5, 15, 0);
        C4273j c4273j5 = this.f19425g;
        AbstractC3340k.b(c4273j5);
        b bVar5 = this.f19431n;
        AbstractC3340k.b(bVar5);
        c4273j5.a(bVar5);
        this.f19426h = new C4273j(interfaceC4269f, "motion_sensors/absolute_orientation");
        SensorManager sensorManager6 = this.f19419a;
        AbstractC3340k.b(sensorManager6);
        this.f19432o = new b(sensorManager6, 11, 0);
        C4273j c4273j6 = this.f19426h;
        AbstractC3340k.b(c4273j6);
        b bVar6 = this.f19432o;
        AbstractC3340k.b(bVar6);
        c4273j6.a(bVar6);
        this.f19427i = new C4273j(interfaceC4269f, "motion_sensors/screen_orientation");
        SensorManager sensorManager7 = this.f19419a;
        AbstractC3340k.b(sensorManager7);
        this.f19433p = new c(context, sensorManager7);
        C4273j c4273j7 = this.f19427i;
        AbstractC3340k.b(c4273j7);
        c4273j7.a(this.f19433p);
    }

    @Override // qc.InterfaceC3885b
    public final void onDetachedFromEngine(C3884a binding) {
        AbstractC3340k.e(binding, "binding");
        C4281r c4281r = this.f19420b;
        AbstractC3340k.b(c4281r);
        c4281r.b(null);
        C4273j c4273j = this.f19421c;
        AbstractC3340k.b(c4273j);
        c4273j.a(null);
        C4273j c4273j2 = this.f19424f;
        AbstractC3340k.b(c4273j2);
        c4273j2.a(null);
        C4273j c4273j3 = this.f19422d;
        AbstractC3340k.b(c4273j3);
        c4273j3.a(null);
        C4273j c4273j4 = this.f19423e;
        AbstractC3340k.b(c4273j4);
        c4273j4.a(null);
        C4273j c4273j5 = this.f19425g;
        AbstractC3340k.b(c4273j5);
        c4273j5.a(null);
        C4273j c4273j6 = this.f19426h;
        AbstractC3340k.b(c4273j6);
        c4273j6.a(null);
        C4273j c4273j7 = this.f19427i;
        AbstractC3340k.b(c4273j7);
        c4273j7.a(null);
        b bVar = this.f19428j;
        if (bVar != null) {
            bVar.onCancel(null);
        }
        b bVar2 = this.f19430m;
        if (bVar2 != null) {
            bVar2.onCancel(null);
        }
        b bVar3 = this.k;
        if (bVar3 != null) {
            bVar3.onCancel(null);
        }
        b bVar4 = this.f19429l;
        if (bVar4 != null) {
            bVar4.onCancel(null);
        }
        b bVar5 = this.f19431n;
        if (bVar5 != null) {
            bVar5.onCancel(null);
        }
        b bVar6 = this.f19432o;
        if (bVar6 != null) {
            bVar6.onCancel(null);
        }
        c cVar = this.f19433p;
        if (cVar != null) {
            cVar.onCancel(null);
        }
    }

    @Override // uc.InterfaceC4279p
    public final void onMethodCall(C4278o call, InterfaceC4280q interfaceC4280q) {
        AbstractC3340k.e(call, "call");
        String str = call.f46759a;
        if (AbstractC3340k.a(str, "isSensorAvailable")) {
            SensorManager sensorManager = this.f19419a;
            AbstractC3340k.b(sensorManager);
            Object obj = call.f46760b;
            AbstractC3340k.c(obj, "null cannot be cast to non-null type kotlin.Int");
            AbstractC3340k.d(sensorManager.getSensorList(((Integer) obj).intValue()), "getSensorList(...)");
            ((g) interfaceC4280q).a(Boolean.valueOf(!r4.isEmpty()));
            return;
        }
        if (!AbstractC3340k.a(str, "setSensorUpdateInterval")) {
            ((g) interfaceC4280q).c();
            return;
        }
        Object objA = call.a("sensorType");
        AbstractC3340k.b(objA);
        int iIntValue = ((Number) objA).intValue();
        Object objA2 = call.a("interval");
        AbstractC3340k.b(objA2);
        int iIntValue2 = ((Number) objA2).intValue();
        if (iIntValue == 1) {
            b bVar = this.f19428j;
            AbstractC3340k.b(bVar);
            bVar.c(iIntValue2);
            return;
        }
        if (iIntValue == 2) {
            b bVar2 = this.f19429l;
            AbstractC3340k.b(bVar2);
            bVar2.c(iIntValue2);
            return;
        }
        if (iIntValue == 4) {
            b bVar3 = this.k;
            AbstractC3340k.b(bVar3);
            bVar3.c(iIntValue2);
            return;
        }
        if (iIntValue == 15) {
            b bVar4 = this.f19431n;
            AbstractC3340k.b(bVar4);
            bVar4.f19436c = iIntValue2;
            if (bVar4.f19438e != null) {
                SensorManager sensorManager2 = bVar4.f19435b;
                sensorManager2.unregisterListener(bVar4);
                sensorManager2.registerListener(bVar4, bVar4.f19437d, iIntValue2);
                return;
            }
            return;
        }
        if (iIntValue == 10) {
            b bVar5 = this.f19430m;
            AbstractC3340k.b(bVar5);
            bVar5.c(iIntValue2);
        } else {
            if (iIntValue != 11) {
                return;
            }
            b bVar6 = this.f19432o;
            AbstractC3340k.b(bVar6);
            bVar6.f19436c = iIntValue2;
            if (bVar6.f19438e != null) {
                SensorManager sensorManager3 = bVar6.f19435b;
                sensorManager3.unregisterListener(bVar6);
                sensorManager3.registerListener(bVar6, bVar6.f19437d, iIntValue2);
            }
        }
    }
}
