package androidx.compose.foundation.layout;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.FontScaling;
import h.ab;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class FlexBoxKt {
    private static final Density DefaultDensity = new Density() { // from class: androidx.compose.foundation.layout.FlexBoxKt$DefaultDensity$1
        private final float density = 1.0f;
        private final float fontScale = 1.0f;

        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            return this.density;
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public float getFontScale() {
            return this.fontScale;
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: roundToPx--R2X_6o */
        public /* synthetic */ int mo2120roundToPxR2X_6o(long j2) {
            return Density.CC.m11128$default$roundToPxR2X_6o(this, j2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: roundToPx-0680j_4 */
        public /* synthetic */ int mo2121roundToPx0680j_4(float f2) {
            return Density.CC.m11129$default$roundToPx0680j_4(this, f2);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        /* renamed from: toDp-GaN1DYA */
        public /* synthetic */ float mo2122toDpGaN1DYA(long j2) {
            return FontScaling.CC.m11273$default$toDpGaN1DYA(this, j2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDp-u2uoSUM */
        public /* synthetic */ float mo2123toDpu2uoSUM(float f2) {
            return Density.CC.m11130$default$toDpu2uoSUM(this, f2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDpSize-k-rfVVM */
        public /* synthetic */ long mo2125toDpSizekrfVVM(long j2) {
            return Density.CC.m11132$default$toDpSizekrfVVM(this, j2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toPx--R2X_6o */
        public /* synthetic */ float mo2126toPxR2X_6o(long j2) {
            return Density.CC.m11133$default$toPxR2X_6o(this, j2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toPx-0680j_4 */
        public /* synthetic */ float mo2127toPx0680j_4(float f2) {
            return Density.CC.m11134$default$toPx0680j_4(this, f2);
        }

        @Override // androidx.compose.ui.unit.Density
        public /* synthetic */ Rect toRect(DpRect dpRect) {
            return Density.CC.$default$toRect(this, dpRect);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSize-XkaWNTQ */
        public /* synthetic */ long mo2128toSizeXkaWNTQ(long j2) {
            return Density.CC.m11135$default$toSizeXkaWNTQ(this, j2);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        /* renamed from: toSp-0xMU5do */
        public /* synthetic */ long mo2129toSp0xMU5do(float f2) {
            return FontScaling.CC.m11274$default$toSp0xMU5do(this, f2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSp-kPz2Gy4 */
        public /* synthetic */ long mo2130toSpkPz2Gy4(float f2) {
            return Density.CC.m11136$default$toSpkPz2Gy4(this, f2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDp-u2uoSUM */
        public /* synthetic */ float mo2124toDpu2uoSUM(int i2) {
            return Density.CC.m11131$default$toDpu2uoSUM((Density) this, i2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSp-kPz2Gy4 */
        public /* synthetic */ long mo2131toSpkPz2Gy4(int i2) {
            return Density.CC.m11137$default$toSpkPz2Gy4((Density) this, i2);
        }
    };

    public static final void FlexBox(Modifier modifier, FlexBoxConfig flexBoxConfig, q<? super FlexBoxScope, ? super Composer, ? super Integer, ab> qVar, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            modifier = Modifier.Companion;
        }
        if ((i3 & 2) != 0) {
            flexBoxConfig = FlexBoxConfig.Companion;
        }
        int i4 = i2 >> 3;
        MeasurePolicy measurePolicyFlexMultiContentMeasurePolicy = flexMultiContentMeasurePolicy(SnapshotStateKt.rememberUpdatedState(flexBoxConfig, composer, i4 & 14), composer, 0);
        int iM = FlexBoxKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifier);
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
        Updater.m7351setimpl(composer, measurePolicyFlexMultiContentMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m7351setimpl(composer, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Updater.m7351setimpl(composer, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
        Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
        Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
        qVar.invoke(FlexBoxScopeInstance.INSTANCE, composer, Integer.valueOf((i4 & 112) | 6));
        composer.endNode();
    }

    private static final <T> void fastForEachUntil(ArrayList<T> arrayList, int i2, int i3, l<? super T, ab> lVar) {
        if (i2 < 0 || i2 > arrayList.size()) {
            throw new IndexOutOfBoundsException(a.a((byte) 93, arrayList, i2, "fromIndex ("));
        }
        if (i3 < 0 || i3 > arrayList.size()) {
            throw new IndexOutOfBoundsException(a.a((byte) 93, arrayList, i3, "toIndex ("));
        }
        while (i2 < i3) {
            lVar.invoke(arrayList.get(i2));
            i2++;
        }
    }

    private static final <T> int fastSumBy(ArrayList<T> arrayList, int i2, int i3, l<? super T, Integer> lVar) {
        if (i2 < 0 || i2 > arrayList.size()) {
            throw new IndexOutOfBoundsException(a.a((byte) 93, arrayList, i2, "fromIndex ("));
        }
        if (i3 < 0 || i3 > arrayList.size()) {
            throw new IndexOutOfBoundsException(a.a((byte) 93, arrayList, i3, "toIndex ("));
        }
        int iIntValue = 0;
        while (i2 < i3) {
            iIntValue += lVar.invoke(arrayList.get(i2)).intValue();
            i2++;
        }
        return iIntValue;
    }

    public static final MeasurePolicy flexMultiContentMeasurePolicy(State<? extends FlexBoxConfig> state, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(958632450, i2, -1, "androidx.compose.foundation.layout.flexMultiContentMeasurePolicy (FlexBox.kt:156)");
        }
        boolean z = true;
        if ((((i2 & 14) ^ 6) <= 4 || !composer.changed(state)) && (i2 & 6) != 4) {
            z = false;
        }
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new FlexBoxMeasurePolicy(state);
            composer.updateRememberedValue(objRememberedValue);
        }
        FlexBoxMeasurePolicy flexBoxMeasurePolicy = (FlexBoxMeasurePolicy) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return flexBoxMeasurePolicy;
    }

    public static final Density getDefaultDensity() {
        return DefaultDensity;
    }

    private static final int intrinsicCrossAxisSize(ResolvedFlexBoxConfig resolvedFlexBoxConfig, List<? extends IntrinsicMeasurable> list, int i2, p<? super IntrinsicMeasurable, ? super Integer, Integer> pVar, p<? super IntrinsicMeasurable, ? super Integer, Integer> pVar2) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMainAxisGap = resolvedFlexBoxConfig.mainAxisGap();
        int iCrossAxisGap = resolvedFlexBoxConfig.crossAxisGap();
        int size = list.size();
        int i3 = 0;
        int iMax = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i5);
            int iIntValue = pVar.invoke(intrinsicMeasurable, Integer.MAX_VALUE).intValue();
            int i6 = iIntValue + iMainAxisGap;
            int iIntValue2 = pVar2.invoke(intrinsicMeasurable, Integer.valueOf(iIntValue)).intValue();
            if ((FlexWrap.m2587equalsimpl0(resolvedFlexBoxConfig.m2786getWrap7ziDAWk$foundation_layout(), 1) || FlexWrap.m2587equalsimpl0(resolvedFlexBoxConfig.m2786getWrap7ziDAWk$foundation_layout(), 2)) && i4 != 0) {
                if (iIntValue + i4 > i2) {
                    i3 += iMax + iCrossAxisGap;
                    iMax = iIntValue2;
                    i4 = i6;
                }
            }
            iMax = Math.max(iMax, iIntValue2);
            i4 += i6;
        }
        return i3 + iMax;
    }

    private static final int intrinsicMainAxisSize(ResolvedFlexBoxConfig resolvedFlexBoxConfig, List<? extends IntrinsicMeasurable> list, int i2, p<? super IntrinsicMeasurable, ? super Integer, Integer> pVar) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMainAxisGap = resolvedFlexBoxConfig.mainAxisGap();
        if (FlexWrap.m2587equalsimpl0(resolvedFlexBoxConfig.m2786getWrap7ziDAWk$foundation_layout(), 1) || FlexWrap.m2587equalsimpl0(resolvedFlexBoxConfig.m2786getWrap7ziDAWk$foundation_layout(), 2)) {
            int size = list.size();
            int iMax = 0;
            while (i < size) {
                iMax = Math.max(iMax, pVar.invoke(list.get(i), Integer.valueOf(i2)).intValue());
                i++;
            }
            return iMax;
        }
        int size2 = list.size();
        int iIntValue = 0;
        for (int i3 = 0; i3 < size2; i3++) {
            iIntValue += pVar.invoke(list.get(i3), Integer.valueOf(i2)).intValue();
        }
        int size3 = list.size() - 1;
        return iIntValue + ((size3 >= 0 ? size3 : 0) * iMainAxisGap);
    }
}
