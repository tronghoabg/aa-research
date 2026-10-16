package com.waze.search.e;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import com.waze.strings.DisplayStrings;
import com.waze.z.a.be;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class a implements h.g.a.q {
    @Override // h.g.a.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String strD;
        String str;
        long j2;
        com.waze.settings.v vVar = (com.waze.settings.v) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        int i2 = iIntValue & 6;
        int i3 = b.f35617a;
        if (i2 == 0) {
            iIntValue |= true != composer.changed(vVar) ? 2 : 4;
        }
        if (composer.shouldExecute((iIntValue & 19) != 18, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(658920371, iIntValue, -1, "com.waze.search.model.ComposableSingletons$SearchDestinationCellKt.lambda$658920371.<anonymous> (SearchDestinationCell.kt:119)");
            }
            if (vVar instanceof l) {
                composer.startReplaceGroup(1896303957);
                be.x(SizeKt.m2827width3ABfNKs(SizeKt.m2808height3ABfNKs(Modifier.Companion, 20.0f), 56.0f), composer, 6);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1896570743);
                if (vVar == null) {
                    composer.startReplaceGroup(1896531651);
                    composer.endReplaceGroup();
                    str = null;
                } else {
                    composer.startReplaceGroup(1862293758);
                    int i4 = iIntValue & 14;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2068265449, i4, -1, "com.waze.search.model.toContent (SearchDestinationCell.kt:158)");
                    }
                    if (vVar instanceof o) {
                        composer.startReplaceGroup(-966756131);
                        com.waze.bz.a.e(composer);
                        throw null;
                    }
                    if (vVar instanceof m) {
                        composer.startReplaceGroup(-966747303);
                        strD = com.waze.search.d.a.b.d(((m) vVar).a(), composer, 0);
                        composer.endReplaceGroup();
                    } else if (vVar instanceof k) {
                        composer.startReplaceGroup(-966744455);
                        strD = com.waze.search.d.a.b.d(((k) vVar).a(), composer, 0);
                        composer.endReplaceGroup();
                    } else if (vVar instanceof n) {
                        composer.startReplaceGroup(-966741575);
                        strD = com.waze.search.d.a.b.d(((n) vVar).b(), composer, 0);
                        composer.endReplaceGroup();
                    } else {
                        composer.startReplaceGroup(95810644);
                        composer.endReplaceGroup();
                        strD = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer.endReplaceGroup();
                    str = strD;
                }
                if (str == null) {
                    composer.startReplaceGroup(1896570742);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(1896570743);
                    TextStyle textStyleI = com.waze.bz.a.h(composer).i();
                    long jO = com.waze.bz.a.d(composer, 0).o();
                    if (vVar instanceof k) {
                        composer.startReplaceGroup(2006066029);
                        textStyleI = com.waze.bz.a.h(composer).l();
                        jO = com.waze.bz.a.d(composer, 0).r();
                        composer.endReplaceGroup();
                    } else {
                        composer.startReplaceGroup(2006165973);
                        composer.endReplaceGroup();
                    }
                    TextStyle textStyle = textStyleI;
                    Modifier.Companion companion = Modifier.Companion;
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composer, 0);
                    int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
                    h.g.a.a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                    if (!(composer.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor);
                    } else {
                        composer.useNode();
                    }
                    Updater.m7351setimpl(composer, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m7351setimpl(composer, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Updater.m7351setimpl(composer, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
                    Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                    Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    if (vVar instanceof n) {
                        composer.startReplaceGroup(1524186598);
                        long j3 = jO;
                        IconKt.m4110Iconww6aTOc(com.waze.ui.r.a.a.t.e(((n) vVar).a(), null, composer, 0, 6), (String) null, (Modifier) null, j3, composer, Painter.$stable | 48, 4);
                        j2 = j3;
                        SpacerKt.Spacer(SizeKt.m2827width3ABfNKs(Modifier.Companion, 4.0f), composer, 6);
                        composer.endReplaceGroup();
                    } else {
                        j2 = jO;
                        composer.startReplaceGroup(1524443185);
                        composer.endReplaceGroup();
                    }
                    TextKt.m4275Text4IGK_g(str, (Modifier) null, j2, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m11069getEllipsisgIe3tQ8(), false, 1, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, textStyle, composer, 0, DisplayStrings.DS_AAOS_PRIVACY_SETTINGS_DELETE_RECENT_DESTINATION_MESSAGE, 55290);
                    composer = composer;
                    composer.endNode();
                    composer.endReplaceGroup();
                }
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return h.ab.f48028a;
    }
}
