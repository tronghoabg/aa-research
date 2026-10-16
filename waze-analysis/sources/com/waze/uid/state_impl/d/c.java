package com.waze.uid.state_impl.d;

import com.waze.config.ConfigValues;
import com.waze.uid.UidModel;
import com.waze.uid.b.m;
import com.waze.uid.d.q;
import com.waze.uid.state_impl.util.InstallParameters;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c extends com.waze.uid.e.f {

    /* renamed from: a, reason: collision with root package name */
    private static final com.waze.shared_infra.i.e f44623a = com.waze.shared_infra.i.a.d("GuestLoginState");

    public c(com.waze.uid.e.b bVar, com.waze.uid.e.h hVar, m mVar) {
        super("GuestLoginStateController", bVar, hVar, mVar);
    }

    @Override // com.waze.uid.e.f
    public final void f(com.waze.uid.e.e eVar) {
        super.f(eVar);
        Boolean boolB = ConfigValues.CONFIG_VALUE_ADS_ALLOW_PROFILE_TARGETING_DEFAULT.b();
        boolean zBooleanValue = boolB.booleanValue();
        ConfigValues.CONFIG_VALUE_ADS_ALLOW_PROFILE_TARGETING_SELECTION_STATUS.d("unset");
        ConfigValues.CONFIG_VALUE_ADS_ALLOW_PROFILE_TARGETING.d(boolB);
        com.waze.sharedui.h.k().g(zBooleanValue);
        f44623a.a(String.format("Settings CONFIG_VALUE_ADS_ALLOW_PROFILE_TARGETING_SELECTION_STATUS to %s and CONFIG_VALUE_ADS_ALLOW_PROFILE_TARGETING to %s in new onboarding", "unset", boolB));
        q.b().f44467e.n(new b(this));
    }

    @Override // com.waze.uid.e.f
    public final boolean h(com.waze.uid.e.e eVar) {
        return ((UidModel) this.f44485c.b()).getInstallParameters().result == InstallParameters.Result.GUEST;
    }
}
