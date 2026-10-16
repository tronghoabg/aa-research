package com.waze.be;

import com.waze.config.ConfigValues;
import com.waze.config.d;
import com.waze.config.dh;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class a implements com.waze.shared_infra.k.b {

    /* renamed from: b, reason: collision with root package name */
    private final dh f16230b;

    public a(dh dhVar) {
        x.f(dhVar, "offlineConfigManager");
        this.f16230b = dhVar;
    }

    @Override // com.waze.shared_infra.k.b
    public final String a() {
        d dVar = ConfigValues.CONFIG_VALUE_SYSTEM_LANGUAGE;
        x.e(dVar, "CONFIG_VALUE_SYSTEM_LANGUAGE");
        dh dhVar = this.f16230b;
        String strB = dhVar.b(dVar);
        if (!x.n(strB, "default")) {
            return strB;
        }
        d dVar2 = ConfigValues.CONFIG_VALUE_SYSTEM_DEFAULT_LANGUAGE;
        x.e(dVar2, "CONFIG_VALUE_SYSTEM_DEFAULT_LANGUAGE");
        return dhVar.b(dVar2);
    }
}
