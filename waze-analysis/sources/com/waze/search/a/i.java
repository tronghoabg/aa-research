package com.waze.search.a;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import h.ab;
import h.g.a.r;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class i implements r {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ List f35481a;

    public i(List list) {
        this.f35481a = list;
    }

    @Override // h.g.a.r
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i2;
        LazyItemScope lazyItemScope = (LazyItemScope) obj;
        int iIntValue = ((Number) obj2).intValue();
        Composer composer = (Composer) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i2 = (true != composer.changed(lazyItemScope) ? 2 : 4) | iIntValue2;
        } else {
            i2 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i2 |= true != composer.changed(iIntValue) ? 16 : 32;
        }
        if (composer.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2039820996, i2, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
            }
            com.waze.search.d.a.a.a aVar = (com.waze.search.d.a.a.a) this.f35481a.get(iIntValue);
            composer.startReplaceGroup(-1517402569);
            j.k(aVar, composer, 0);
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }
}
