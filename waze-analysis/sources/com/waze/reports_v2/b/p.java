package com.waze.reports_v2.b;

import com.waze.config.PreferencesConfigNativeManager;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class p implements o {
    @Override // com.waze.reports_v2.b.o
    public final Object a(h.c.e eVar) {
        CompletableDeferred completableDeferredJ = bo.j();
        PreferencesConfigNativeManager.getInstance().getAndroidAutoAvailableReportCategories(new com.waze.car_lib.screens.am(completableDeferredJ, 17));
        return completableDeferredJ.c(eVar);
    }

    @Override // com.waze.reports_v2.b.o
    public final Object b(h.c.e eVar) {
        CompletableDeferred completableDeferredJ = bo.j();
        PreferencesConfigNativeManager.getInstance().getAvailableReportCategories(new com.waze.car_lib.screens.am(completableDeferredJ, 18));
        return completableDeferredJ.c(eVar);
    }
}
