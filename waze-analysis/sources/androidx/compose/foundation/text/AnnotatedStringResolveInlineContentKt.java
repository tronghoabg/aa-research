package androidx.compose.foundation.text;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import h.a.i;
import h.ab;
import h.g.a.a;
import h.g.a.p;
import h.g.a.q;
import h.k;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AnnotatedStringResolveInlineContentKt {
    private static final k<List<AnnotatedString.Range<Placeholder>>, List<AnnotatedString.Range<q<String, Composer, Integer, ab>>>> EmptyInlineContent = new k<>(i.h(), i.h());

    public static final void InlineChildren(final AnnotatedString annotatedString, final List<AnnotatedString.Range<q<String, Composer, Integer, ab>>> list, Composer composer, final int i2) {
        int i3 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1794596951);
        int i4 = i3 == 0 ? (true != composerStartRestartGroup.changed(annotatedString) ? 2 : 4) | i2 : i2;
        if ((i2 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(list) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & 19) != 18, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1794596951, i4, -1, "androidx.compose.foundation.text.InlineChildren (AnnotatedStringResolveInlineContent.kt:67)");
            }
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                AnnotatedString.Range<q<String, Composer, Integer, ab>> range = list.get(i5);
                q<String, Composer, Integer, ab> qVarComponent1 = range.component1();
                int iComponent2 = range.component2();
                int iComponent3 = range.component3();
                AnnotatedStringResolveInlineContentKt$InlineChildren$1$2$1 annotatedStringResolveInlineContentKt$InlineChildren$1$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (annotatedStringResolveInlineContentKt$InlineChildren$1$2$1RememberedValue == Composer.Companion.getEmpty()) {
                    annotatedStringResolveInlineContentKt$InlineChildren$1$2$1RememberedValue = AnnotatedStringResolveInlineContentKt$InlineChildren$1$2$1.INSTANCE;
                    composerStartRestartGroup.updateRememberedValue(annotatedStringResolveInlineContentKt$InlineChildren$1$2$1RememberedValue);
                }
                MeasurePolicy measurePolicy = (MeasurePolicy) annotatedStringResolveInlineContentKt$InlineChildren$1$2$1RememberedValue;
                Modifier.Companion companion = Modifier.Companion;
                int iM = AnnotatedStringResolveInlineContentKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
                a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Updater.m7351setimpl(composerStartRestartGroup, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
                Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                qVarComponent1.invoke(annotatedString.subSequence(iComponent2, iComponent3).getText(), composerStartRestartGroup, 0);
                composerStartRestartGroup.endNode();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.foundation.text.AnnotatedStringResolveInlineContentKt$$ExternalSyntheticLambda1
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return AnnotatedStringResolveInlineContentKt.InlineChildren$lambda$1(annotatedString, list, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab InlineChildren$lambda$1(AnnotatedString annotatedString, List list, int i2, Composer composer, int i3) {
        InlineChildren(annotatedString, list, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    public static final boolean hasInlineContent(AnnotatedString annotatedString) {
        return annotatedString.hasStringAnnotations(InlineTextContentKt.INLINE_CONTENT_TAG, 0, annotatedString.getText().length());
    }

    public static final k<List<AnnotatedString.Range<Placeholder>>, List<AnnotatedString.Range<q<String, Composer, Integer, ab>>>> resolveInlineContent(AnnotatedString annotatedString, Map<String, InlineTextContent> map) {
        if (map == null || map.isEmpty()) {
            return EmptyInlineContent;
        }
        List<AnnotatedString.Range<String>> stringAnnotations = annotatedString.getStringAnnotations(InlineTextContentKt.INLINE_CONTENT_TAG, 0, annotatedString.getText().length());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = stringAnnotations.size();
        for (int i2 = 0; i2 < size; i2++) {
            AnnotatedString.Range<String> range = stringAnnotations.get(i2);
            InlineTextContent inlineTextContent = map.get(range.getItem());
            if (inlineTextContent != null) {
                arrayList.add(new AnnotatedString.Range(inlineTextContent.getPlaceholder(), range.getStart(), range.getEnd()));
                arrayList2.add(new AnnotatedString.Range(inlineTextContent.getChildren(), range.getStart(), range.getEnd()));
            }
        }
        return new k<>(arrayList, arrayList2);
    }
}
