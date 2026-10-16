package com.waze.crash;

import android.content.SharedPreferences;
import com.b.b.a.u;
import com.waze.config.ConfigValues;
import com.waze.map.MapViewChooser;
import com.waze.ni;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    private final h.f f23226a = h.g.a(new com.waze.car_lib.o.a(9));

    private final SharedPreferences h() {
        return (SharedPreferences) this.f23226a.getValue();
    }

    @Override // com.waze.crash.d
    public final String a() {
        return h().getString("crashlytics_user_id", null);
    }

    @Override // com.waze.crash.d
    public final String b() {
        return u.d().c().a();
    }

    @Override // com.waze.crash.d
    public final String c() {
        String strB = ConfigValues.CONFIG_VALUE_GENERAL_CRASHLYTICS_USER_FLAG.b();
        x.e(strB, "getValue(...)");
        return strB;
    }

    @Override // com.waze.crash.d
    public final kotlinx.coroutines.b.k d() {
        kotlinx.coroutines.b.k kVarK = ConfigValues.CONFIG_VALUE_SYSTEM_SERVER_ID.k();
        x.e(kVarK, "getFlow(...)");
        return kVarK;
    }

    @Override // com.waze.crash.d
    public final void e(String str) {
        if (str == null) {
            h().edit().remove("crashlytics_user_id").apply();
        } else {
            h().edit().putString("crashlytics_user_id", str).apply();
        }
    }

    @Override // com.waze.crash.d
    public final boolean f() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_GENERAL_RECORD_ERROR_FEATURE_ENABLED.b();
        x.e(boolB, "getValue(...)");
        return boolB.booleanValue();
    }

    @Override // com.waze.crash.d
    public final boolean g() {
        ni niVar = MapViewChooser.f27898a;
        return ni.d();
    }
}
