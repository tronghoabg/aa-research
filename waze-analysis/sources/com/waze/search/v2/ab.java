package com.waze.search.v2;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.Ref;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ab implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Ref f36139a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.waze.br.c.o f36140b;

    public ab(Ref ref, com.waze.br.c.o oVar) {
        this.f36139a = ref;
        this.f36140b = oVar;
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-559889238, iIntValue, -1, "com.waze.design_components_compose.components.AnimatedValueVisibility.<anonymous> (AnimatedValueVisibility.kt:26)");
        }
        Object value = this.f36139a.getValue();
        if (value == null) {
            composer.startReplaceGroup(1992702047);
        } else {
            composer.startReplaceGroup(1992702048);
            composer.startReplaceGroup(-2140594662);
            com.waze.z.a.e.c cVarC = com.waze.bs.a.c((com.waze.br.c.n) value);
            com.waze.br.c.o oVar = this.f36140b;
            boolean zChanged = composer.changed(oVar);
            y yVarRememberedValue = composer.rememberedValue();
            if (zChanged || yVarRememberedValue == Composer.Companion.getEmpty()) {
                yVarRememberedValue = new y((Object) oVar, 1, (byte[]) null);
                composer.updateRememberedValue(yVarRememberedValue);
            }
            h.g.a.a aVar = (h.g.a.a) yVarRememberedValue;
            Modifier.Companion companion = Modifier.Companion;
            int i2 = SearchV2Activity.f36131f;
            Modifier modifierM2822size3ABfNKs = SizeKt.m2822size3ABfNKs(companion, 64.0f);
            boolean zChanged2 = composer.changed(oVar);
            y yVarRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || yVarRememberedValue2 == Composer.Companion.getEmpty()) {
                yVarRememberedValue2 = new y(oVar, 0);
                composer.updateRememberedValue(yVarRememberedValue2);
            }
            com.waze.z.a.e.b.a(cVarC, aVar, com.waze.design_components.d.b.k(com.waze.main_screen.ac.b.a(modifierM2822size3ABfNKs, (h.g.a.a) yVarRememberedValue2), RoundedCornerShapeKt.getCircleShape()), composer, 0);
            composer.endReplaceGroup();
        }
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return h.ab.f48028a;
    }
}
