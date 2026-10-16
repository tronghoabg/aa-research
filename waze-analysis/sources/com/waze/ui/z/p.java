package com.waze.ui.z;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class p implements h.g.a.r {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ List f43984a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ d f43985b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f43986c;

    public p(List list, d dVar, h.g.a.l lVar) {
        this.f43984a = list;
        this.f43985b = dVar;
        this.f43986c = lVar;
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
            aq aqVar = (aq) this.f43984a.get(iIntValue);
            composer.startReplaceGroup(-1296232791);
            as.x(aqVar, com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.dJ, Integer.valueOf(iIntValue)), iIntValue != h.a.i.e(this.f43985b.c()), this.f43986c, composer, 0, 0);
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return h.ab.f48028a;
    }
}
