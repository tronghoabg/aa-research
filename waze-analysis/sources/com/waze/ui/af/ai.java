package com.waze.ui.af;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ai implements h.g.a.r {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ List f41826a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f41827b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f41828c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ List f41829d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f41830e;

    public ai(List list, h.g.a.l lVar, h.g.a.l lVar2, List list2, String str) {
        this.f41826a = list;
        this.f41827b = lVar;
        this.f41828c = lVar2;
        this.f41829d = list2;
        this.f41830e = str;
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
            y yVar = (y) this.f41826a.get(iIntValue);
            composer.startReplaceGroup(-1491679998);
            boolean zChanged = composer.changed(yVar);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = (yVar.f() && yVar.e() == c.f41880a) ? ap.f41855d : (yVar.f() || yVar.e() != c.f41880a) ? ap.f41854c : ap.f41856e;
                composer.updateRememberedValue(objRememberedValue);
            }
            h.g.a.l lVar = this.f41827b;
            com.waze.z.a.ak akVar = (com.waze.z.a.ak) objRememberedValue;
            boolean zChanged2 = composer.changed(lVar) | composer.changed(yVar);
            ak akVarRememberedValue = composer.rememberedValue();
            if (zChanged2 || akVarRememberedValue == Composer.Companion.getEmpty()) {
                akVarRememberedValue = new ak(lVar, yVar, this.f41828c);
                composer.updateRememberedValue(akVarRememberedValue);
            }
            com.waze.z.a.aj.b(akVar, null, null, (h.g.a.l) akVarRememberedValue, ComposableLambdaKt.rememberComposableLambda(1376227312, true, new aj(iIntValue, this.f41829d, this.f41830e, yVar, lVar), composer, 54), composer, 24576, 6);
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
