package com.waze.web;

import android.content.Context;
import android.location.Location;
import com.b.b.a.u;
import com.waze.NativeManager;
import com.waze.location.LocationSensorListener;
import com.waze.location.bi;
import com.waze.location.y;
import com.waze.realtime.RealtimeNativeManager;
import com.waze.share.ShareNativeManager;
import com.waze.system.SystemNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class n implements com.waze.sharedui.web.f {

    /* renamed from: a, reason: collision with root package name */
    final y f45510a = (y) r.h(y.class);

    /* renamed from: b, reason: collision with root package name */
    final ShareNativeManager f45511b = (ShareNativeManager) r.h(ShareNativeManager.class);

    @Override // com.waze.sharedui.web.f
    public final com.waze.sharedui.web.e a() {
        return com.waze.sharedui.web.e.f39349a;
    }

    @Override // com.waze.sharedui.web.f
    public final Boolean b() {
        return Boolean.valueOf(this.f45511b.isMetricUnits());
    }

    @Override // com.waze.sharedui.web.f
    public final Integer c() {
        return Integer.valueOf(((SystemNativeManager) r.h(SystemNativeManager.class)).getDeviceId());
    }

    @Override // com.waze.sharedui.web.f
    public final Integer d() {
        bi biVarGetNativeLocation = LocationSensorListener.GetNativeLocation((Location) this.f45510a.c().d());
        if (biVarGetNativeLocation != null) {
            return Integer.valueOf(biVarGetNativeLocation.c());
        }
        return null;
    }

    @Override // com.waze.sharedui.web.f
    public final Integer e() {
        bi biVarGetNativeLocation = LocationSensorListener.GetNativeLocation((Location) this.f45510a.c().d());
        if (biVarGetNativeLocation != null) {
            return Integer.valueOf(biVarGetNativeLocation.d());
        }
        return null;
    }

    @Override // com.waze.sharedui.web.f
    public final Integer f() {
        return Integer.valueOf(NativeManager.getInstance().getServerSessionId());
    }

    @Override // com.waze.sharedui.web.f
    public final String g() {
        return u.d().d();
    }

    @Override // com.waze.sharedui.web.f
    public final String h() {
        return RealtimeNativeManager.getInstance().getCoreVersion();
    }

    @Override // com.waze.sharedui.web.f
    public final String i() {
        return NativeManager.getInstance().getServerEnv();
    }

    @Override // com.waze.sharedui.web.f
    public final String j() {
        return ((SystemNativeManager) r.h(SystemNativeManager.class)).getSystemLanguage();
    }

    @Override // com.waze.sharedui.web.f
    public final String k() {
        return NativeManager.getInstance().getServerCookie();
    }

    @Override // com.waze.sharedui.web.f
    public final String l(Context context) {
        return true != com.waze.shared_infra.i.h.B(context) ? "light" : "dark";
    }
}
