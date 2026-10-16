package com.waze.cg;

import com.waze.config.ConfigValues;
import com.waze.shared_infra.f.b;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a implements b {
    @Override // com.waze.shared_infra.f.b
    public final boolean a(com.waze.shared_infra.f.a aVar) {
        x.f(aVar, "deeplink");
        String strA = aVar.a();
        if (strA == null || !x.n(strA, "world_cup_opt_out")) {
            return false;
        }
        ConfigValues.CONFIG_VALUE_WAZE_TO_GOAL_IS_USER_OPTED_IN.d(false);
        return true;
    }
}
