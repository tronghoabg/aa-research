package com.waze.bw.c.d;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cq implements h.g.a.r {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ List f18050a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f18051b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ h.g.a.p f18052c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f18053d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f18054e;

    public cq(List list, String str, h.g.a.p pVar, h.g.a.l lVar, int i2) {
        this.f18054e = i2;
        this.f18050a = list;
        this.f18051b = str;
        this.f18052c = pVar;
        this.f18053d = lVar;
    }

    @Override // h.g.a.r
    public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i2;
        int i3;
        if (this.f18054e != 0) {
            Object obj5 = (LazyItemScope) obj;
            int iIntValue = ((Number) obj2).intValue();
            Composer composer = (Composer) obj3;
            int iIntValue2 = ((Number) obj4).intValue();
            if ((iIntValue2 & 6) == 0) {
                i3 = iIntValue2 | (true == composer.changed(obj5) ? 4 : 2);
            } else {
                i3 = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                i3 |= true == composer.changed(iIntValue) ? 32 : 16;
            }
            if (composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2039820996, i3, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                cv cvVar = (cv) this.f18050a.get(iIntValue);
                composer.startReplaceGroup(177040105);
                com.waze.z.a.al alVarE = com.waze.z.a.aj.e(composer);
                String str = "RECENT_ITEM_" + iIntValue;
                String str2 = this.f18051b;
                h.g.a.p pVar = this.f18052c;
                h.g.a.l lVar = this.f18053d;
                boolean zChanged = composer.changed(lVar) | ((((i3 & 112) ^ 48) > 32 && composer.changed(iIntValue)) || (i3 & 48) == 32);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = (h.g.a.l) new cr(lVar, iIntValue, 1);
                    composer.updateRememberedValue(objRememberedValue);
                }
                ct.j(str, str2, alVarE, pVar, (h.g.a.l) objRememberedValue, ComposableLambdaKt.rememberComposableLambda(321548985, true, new cs(cvVar, iIntValue, lVar, 1), composer, 54), composer, 196608);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer.skipToGroupEnd();
            }
            return h.ab.f48028a;
        }
        Object obj6 = (LazyItemScope) obj;
        int iIntValue3 = ((Number) obj2).intValue();
        Composer composer2 = (Composer) obj3;
        int iIntValue4 = ((Number) obj4).intValue();
        if ((iIntValue4 & 6) == 0) {
            i2 = iIntValue4 | (true == composer2.changed(obj6) ? 4 : 2);
        } else {
            i2 = iIntValue4;
        }
        if ((iIntValue4 & 48) == 0) {
            i2 |= true == composer2.changed(iIntValue3) ? 32 : 16;
        }
        if (composer2.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2039820996, i2, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
            }
            cw cwVar = (cw) this.f18050a.get(iIntValue3);
            composer2.startReplaceGroup(1719472510);
            com.waze.z.a.al alVarE2 = com.waze.z.a.aj.e(composer2);
            String str3 = "UPCOMING_ITEM_" + iIntValue3;
            String str4 = this.f18051b;
            h.g.a.p pVar2 = this.f18052c;
            h.g.a.l lVar2 = this.f18053d;
            boolean zChanged2 = ((((i2 & 112) ^ 48) > 32 && composer2.changed(iIntValue3)) || (i2 & 48) == 32) | composer2.changed(lVar2);
            Object objRememberedValue2 = composer2.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = (h.g.a.l) new cr(lVar2, iIntValue3, 0);
                composer2.updateRememberedValue(objRememberedValue2);
            }
            ct.j(str3, str4, alVarE2, pVar2, (h.g.a.l) objRememberedValue2, ComposableLambdaKt.rememberComposableLambda(647404572, true, new cs(cwVar, iIntValue3, lVar2, 0), composer2, 54), composer2, 196608);
            composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2.skipToGroupEnd();
        }
        return h.ab.f48028a;
    }
}
