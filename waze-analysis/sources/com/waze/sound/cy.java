package com.waze.sound;

import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cy implements cx {
    @Override // com.waze.sound.cx
    public final bk a() {
        com.waze.sharedui.utils.e eVarC = com.waze.sharedui.utils.f.c();
        if (eVarC == null) {
            return bk.f39540a;
        }
        int iOrdinal = eVarC.ordinal();
        if (iOrdinal == 0) {
            return bk.f39540a;
        }
        if (iOrdinal == 1) {
            return bk.f39541b;
        }
        throw new h.i();
    }

    @Override // com.waze.sound.cx
    public final kotlinx.coroutines.b.k b() {
        kotlinx.coroutines.b.k kVarK = ConfigValues.CONFIG_VALUE_GENERAL_DEFAULT_UNITS.k();
        h.g.b.x.e(kVarK, "getFlow(...)");
        return kVarK;
    }

    @Override // com.waze.sound.cx
    public final kotlinx.coroutines.b.k c() {
        kotlinx.coroutines.b.k kVarK = ConfigValues.CONFIG_VALUE_GENERAL_UNITS.k();
        h.g.b.x.e(kVarK, "getFlow(...)");
        return kVarK;
    }
}
