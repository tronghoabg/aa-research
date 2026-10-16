package com.waze.bw.c.d;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import com.waze.strings.DisplayStrings;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class j implements h.g.a.r {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ List f18124a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f18125b;

    public j(List list, h.g.a.l lVar) {
        this.f18124a = list;
        this.f18125b = lVar;
    }

    @Override // h.g.a.r
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i2;
        Object obj5 = (LazyItemScope) obj;
        int iIntValue = ((Number) obj2).intValue();
        Composer composer = (Composer) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i2 = (true != composer.changed(obj5) ? 2 : 4) | iIntValue2;
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
            bn bnVar = (bn) this.f18124a.get(iIntValue);
            composer.startReplaceGroup(727545039);
            SpacerKt.Spacer(SizeKt.m2822size3ABfNKs(Modifier.Companion, 8.0f), composer, 6);
            Modifier modifierA = com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.aq, null);
            String strB = bnVar.b();
            h.g.a.l lVar = this.f18125b;
            com.waze.design_components.b.d dVar = com.waze.design_components.b.d.M;
            boolean zChanged = composer.changed(lVar) | composer.changed(bnVar);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = (h.g.a.a) new i(lVar, bnVar, 1);
                composer.updateRememberedValue(objRememberedValue);
            }
            h.g.a.a aVar = (h.g.a.a) objRememberedValue;
            boolean zChanged2 = composer.changed(lVar) | composer.changed(bnVar);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = (h.g.a.a) new i(lVar, bnVar, 0);
                composer.updateRememberedValue(objRememberedValue2);
            }
            com.waze.z.a.be.E(strB, dVar, modifierA, null, aVar, (h.g.a.a) objRememberedValue2, composer, DisplayStrings.DS_DIRT_ROADS, 8);
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
