package com.waze.as;

import com.waze.config.ConfigValues;
import h.g.b.x;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final k f15482a;

    public d() {
        k kVarK = ConfigValues.CONFIG_VALUE_NAVIGATION_LOCK_SCREEN_NAVIGATION_USER_CONFIG.k();
        x.e(kVarK, "getFlow(...)");
        this.f15482a = kVarK;
    }

    public final k a() {
        return this.f15482a;
    }
}
