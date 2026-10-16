package com.waze.ui.d;

import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import h.ab;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class o implements h.g.a.r {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ List f42157a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f42158b;

    public o(List list, h.g.a.l lVar) {
        this.f42157a = list;
        this.f42158b = lVar;
    }

    @Override // h.g.a.r
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i2;
        LazyGridItemScope lazyGridItemScope = (LazyGridItemScope) obj;
        int iIntValue = ((Number) obj2).intValue();
        Composer composer = (Composer) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i2 = (true != composer.changed(lazyGridItemScope) ? 2 : 4) | iIntValue2;
        } else {
            i2 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i2 |= true != composer.changed(iIntValue) ? 16 : 32;
        }
        if (composer.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1942245546, i2, -1, "androidx.compose.foundation.lazy.grid.itemsIndexed.<anonymous> (LazyGridDsl.kt:576)");
            }
            b bVar = (b) this.f42157a.get(iIntValue);
            composer.startReplaceGroup(169134354);
            s.n(bVar, iIntValue, this.f42158b, composer, i2 & 112);
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
