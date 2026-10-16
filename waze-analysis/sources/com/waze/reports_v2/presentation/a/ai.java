package com.waze.reports_v2.presentation.a;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.Ref;
import com.waze.reports_v2.c.dj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ai implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Ref f34640a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ az f34641b;

    public ai(Ref ref, az azVar) {
        this.f34640a = ref;
        this.f34641b = azVar;
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-559889238, iIntValue, -1, "com.waze.design_components_compose.components.AnimatedValueVisibility.<anonymous> (AnimatedValueVisibility.kt:26)");
        }
        Object value = this.f34640a.getValue();
        if (value == null) {
            composer.startReplaceGroup(1992702047);
        } else {
            composer.startReplaceGroup(1992702048);
            av avVar = (av) value;
            composer.startReplaceGroup(951477510);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(h.c.k.f48060a, composer);
                composer.updateRememberedValue(objRememberedValue);
            }
            kotlinx.coroutines.af afVar = (kotlinx.coroutines.af) objRememberedValue;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
            az azVar = this.f34641b;
            boolean zChanged = composer.changed(azVar);
            ad adVarRememberedValue = composer.rememberedValue();
            if (zChanged || adVarRememberedValue == Composer.Companion.getEmpty()) {
                adVarRememberedValue = new ad(azVar);
                composer.updateRememberedValue(adVarRememberedValue);
            }
            Modifier modifierA = com.waze.main_screen.ac.b.a(modifierFillMaxWidth$default, (h.g.a.a) adVarRememberedValue);
            dj djVarB = avVar.b();
            boolean zChangedInstance = composer.changedInstance(afVar) | composer.changed(azVar);
            af afVarRememberedValue = composer.rememberedValue();
            if (zChangedInstance || afVarRememberedValue == Composer.Companion.getEmpty()) {
                afVarRememberedValue = new af(afVar, azVar);
                composer.updateRememberedValue(afVarRememberedValue);
            }
            h.g.a.l lVar = (h.g.a.l) afVarRememberedValue;
            boolean zChanged2 = composer.changed(azVar);
            ag agVarRememberedValue = composer.rememberedValue();
            if (zChanged2 || agVarRememberedValue == Composer.Companion.getEmpty()) {
                agVarRememberedValue = new ag(azVar);
                composer.updateRememberedValue(agVarRememberedValue);
            }
            an.t(modifierA, djVarB, lVar, (h.g.a.l) agVarRememberedValue, composer, 0);
            composer.endReplaceGroup();
        }
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return h.ab.f48028a;
    }
}
