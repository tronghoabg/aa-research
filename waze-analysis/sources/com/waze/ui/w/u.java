package com.waze.ui.w;

import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.waze.strings.DisplayStrings;
import com.waze.ui.w.b.av;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class u implements h.g.a.r {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ List f43785a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ av f43786b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ av f43787c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f43788d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f43789e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f43790f;

    public u(List list, av avVar, av avVar2, boolean z, boolean z2, h.g.a.l lVar) {
        this.f43785a = list;
        this.f43786b = avVar;
        this.f43787c = avVar2;
        this.f43788d = z;
        this.f43789e = z2;
        this.f43790f = lVar;
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
            av avVar = (av) this.f43785a.get(iIntValue);
            composer.startReplaceGroup(-67241138);
            av avVar2 = this.f43786b;
            ai.w(lazyGridItemScope, avVar, iIntValue, h.g.b.x.n(avVar, avVar2), h.g.b.x.n(avVar, avVar2) || h.g.b.x.n(avVar, this.f43787c), this.f43788d, this.f43789e, this.f43790f, composer, (i2 & 14) | (((i2 & 126) << 3) & DisplayStrings.DS_TAP_TO_VERIFY));
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
