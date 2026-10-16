package Vb;

import K8.r;
import Y0.e;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import android.os.PowerManager;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import qc.C3884a;
import qc.InterfaceC3885b;
import uc.C4271h;
import uc.C4273j;
import uc.C4281r;
import uc.InterfaceC4269f;
import uc.InterfaceC4270g;
import uc.InterfaceC4272i;
import uc.InterfaceC4279p;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u0000 /2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001/B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0017J\u0012\u0010\u001d\u001a\u00020\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\n\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0002J\b\u0010 \u001a\u00020!H\u0002J\u000f\u0010\"\u001a\u0004\u0018\u00010#H\u0002¢\u0006\u0002\u0010$J\b\u0010%\u001a\u00020#H\u0002J\b\u0010&\u001a\u00020#H\u0003J\u000f\u0010'\u001a\u0004\u0018\u00010#H\u0002¢\u0006\u0002\u0010$J\b\u0010(\u001a\u00020#H\u0003J\u0010\u0010)\u001a\u00020!2\u0006\u0010*\u001a\u00020!H\u0003J\u0010\u0010+\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0012\u0010,\u001a\u0004\u0018\u00010\u001f2\u0006\u0010-\u001a\u00020!H\u0002J\u001a\u0010.\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010-\u001a\u0004\u0018\u00010\u001fH\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Ldev/fluttercommunity/plus/battery/BatteryPlusPlugin;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "Lio/flutter/plugin/common/EventChannel$StreamHandler;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "<init>", "()V", "applicationContext", "Landroid/content/Context;", "chargingStateChangeReceiver", "Landroid/content/BroadcastReceiver;", "methodChannel", "Lio/flutter/plugin/common/MethodChannel;", "eventChannel", "Lio/flutter/plugin/common/EventChannel;", "onAttachedToEngine", "", "binding", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "onDetachedFromEngine", "onMethodCall", "call", "Lio/flutter/plugin/common/MethodCall;", "result", "Lio/flutter/plugin/common/MethodChannel$Result;", "onListen", "arguments", "", "events", "Lio/flutter/plugin/common/EventChannel$EventSink;", "onCancel", "getBatteryStatus", "", "getBatteryLevel", "", "isInPowerSaveMode", "", "()Ljava/lang/Boolean;", "isSamsungPowerSaveModeActive", "isHuaweiPowerSaveModeActive", "isXiaomiPowerSaveModeActive", "checkPowerServiceSaveMode", "getBatteryProperty", "property", "createChargingStateChangeReceiver", "convertBatteryStatus", "status", "publishBatteryStatus", "Companion", "battery_plus_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements InterfaceC4279p, InterfaceC4272i, InterfaceC3885b {

    /* renamed from: a, reason: collision with root package name */
    public Context f14850a;

    /* renamed from: b, reason: collision with root package name */
    public r f14851b;

    /* renamed from: c, reason: collision with root package name */
    public C4281r f14852c;

    /* renamed from: d, reason: collision with root package name */
    public C4273j f14853d;

    public static String b(int i5) {
        if (i5 == 1) {
            return "unknown";
        }
        if (i5 == 2) {
            return "charging";
        }
        if (i5 == 3) {
            return "discharging";
        }
        if (i5 == 4) {
            return "connected_not_charging";
        }
        if (i5 != 5) {
            return null;
        }
        return "full";
    }

    public final boolean a() {
        Context context = this.f14850a;
        AbstractC3340k.b(context);
        Object systemService = context.getSystemService("power");
        AbstractC3340k.c(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        return ((PowerManager) systemService).isPowerSaveMode();
    }

    public final String c() {
        int intExtra;
        if (Build.VERSION.SDK_INT >= 26) {
            Context context = this.f14850a;
            AbstractC3340k.b(context);
            Object systemService = context.getSystemService("batterymanager");
            AbstractC3340k.c(systemService, "null cannot be cast to non-null type android.os.BatteryManager");
            intExtra = ((BatteryManager) systemService).getIntProperty(6);
        } else {
            Intent intentRegisterReceiver = new ContextWrapper(this.f14850a).registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            intExtra = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("status", -1) : -1;
        }
        return b(intExtra);
    }

    @Override // qc.InterfaceC3885b
    public final void onAttachedToEngine(C3884a binding) {
        AbstractC3340k.e(binding, "binding");
        this.f14850a = binding.f44186a;
        InterfaceC4269f interfaceC4269f = binding.f44188c;
        this.f14852c = new C4281r(interfaceC4269f, "dev.fluttercommunity.plus/battery");
        C4273j c4273j = new C4273j(interfaceC4269f, "dev.fluttercommunity.plus/charging");
        this.f14853d = c4273j;
        c4273j.a(this);
        C4281r c4281r = this.f14852c;
        AbstractC3340k.b(c4281r);
        c4281r.b(this);
    }

    @Override // uc.InterfaceC4272i
    public final void onCancel(Object arguments) {
        Context context = this.f14850a;
        AbstractC3340k.b(context);
        context.unregisterReceiver(this.f14851b);
        this.f14851b = null;
    }

    @Override // qc.InterfaceC3885b
    public final void onDetachedFromEngine(C3884a binding) {
        AbstractC3340k.e(binding, "binding");
        this.f14850a = null;
        C4281r c4281r = this.f14852c;
        AbstractC3340k.b(c4281r);
        c4281r.b(null);
        this.f14852c = null;
        C4273j c4273j = this.f14853d;
        AbstractC3340k.b(c4273j);
        c4273j.a(null);
        this.f14853d = null;
    }

    @Override // uc.InterfaceC4272i
    public final void onListen(Object obj, InterfaceC4270g interfaceC4270g) {
        C4271h c4271h = (C4271h) interfaceC4270g;
        r rVar = new r(this, c4271h);
        this.f14851b = rVar;
        Context context = this.f14850a;
        if (context != null) {
            e.registerReceiver(context, rVar, new IntentFilter("android.intent.action.BATTERY_CHANGED"), 4);
        }
        String strC = c();
        if (strC != null) {
            c4271h.a(strC);
        } else {
            c4271h.c("UNAVAILABLE", "Charging status unavailable", null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b2  */
    @Override // uc.InterfaceC4279p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMethodCall(uc.C4278o r9, uc.InterfaceC4280q r10) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Vb.a.onMethodCall(uc.o, uc.q):void");
    }
}
