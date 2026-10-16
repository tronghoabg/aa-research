package com.waze.main_screen.af.b;

import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.Ref;
import androidx.fragment.compose.AndroidFragmentKt;
import androidx.fragment.compose.FragmentStateKt;
import com.waze.asks.ah;
import com.waze.asks.as;
import h.ab;
import h.g.a.l;
import h.g.a.q;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class a implements q {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Ref f25783a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Modifier f25784b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ i f25785c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ l f25786d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ MutableIntState f25787e;

    public a(Ref ref, Modifier modifier, i iVar, l lVar, MutableIntState mutableIntState) {
        this.f25783a = ref;
        this.f25784b = modifier;
        this.f25785c = iVar;
        this.f25786d = lVar;
        this.f25787e = mutableIntState;
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-559889238, iIntValue, -1, "com.waze.design_components_compose.components.AnimatedValueVisibility.<anonymous> (AnimatedValueVisibility.kt:26)");
        }
        Object value = this.f25783a.getValue();
        if (value == null) {
            composer.startReplaceGroup(1992702047);
        } else {
            composer.startReplaceGroup(1992702048);
            as asVar = (as) value;
            composer.startReplaceGroup(1468375678);
            Modifier modifier = this.f25784b;
            Bundle bundle = new Bundle();
            bundle.putParcelable("ENRICH_ALERT_QUESTION_KEY", asVar);
            i iVar = this.f25785c;
            boolean zChanged = composer.changed(iVar) | composer.changedInstance(asVar);
            l lVar = this.f25786d;
            boolean zChanged2 = zChanged | composer.changed(lVar);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged2 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = (l) new g(iVar, asVar, this.f25787e, lVar);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.startReplaceableGroup(1765406104);
            AndroidFragmentKt.AndroidFragment(ah.class, modifier, FragmentStateKt.rememberFragmentState(composer, 0), bundle, (l) objRememberedValue, composer, 0, 0);
            composer.endReplaceableGroup();
            composer.endReplaceGroup();
        }
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return ab.f48028a;
    }
}
