package androidx.compose.material3.internal;

import androidx.compose.animation.ColorVectorConverterKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.ContentColorKt;
import androidx.compose.material3.InteractiveComponentSizeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.MotionSchemeKt;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldKt;
import androidx.compose.material3.TextFieldLabelPosition;
import androidx.compose.material3.TextFieldLabelScope;
import androidx.compose.material3.Typography;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.material3.tokens.SmallIconButtonTokens;
import androidx.compose.material3.tokens.TypeScaleTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import androidx.media3.common.C;
import androidx.media3.muxer.MuxerUtil;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.g.b.x;
import h.i;
import h.k.n;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class TextFieldImplKt {
    private static final float AboveLabelBottomPadding = 4.0f;
    private static final float AboveLabelHorizontalPadding = 4.0f;
    public static final String ContainerId = "Container";
    public static final String LabelId = "Label";
    public static final String LeadingId = "Leading";
    private static final float MinFocusedLabelLineHeight = 16.0f;
    private static final float MinSupportingTextLineHeight = 16.0f;
    private static final float MinTextLineHeight = 24.0f;
    public static final String PlaceholderId = "Hint";
    public static final String PrefixId = "Prefix";
    private static final float PrefixSuffixTextPadding = 2.0f;
    public static final String SuffixId = "Suffix";
    public static final String SupportingId = "Supporting";
    private static final float SupportingTopPadding = 4.0f;
    public static final String TextFieldId = "TextField";
    private static final float TextFieldPadding = 16.0f;
    public static final String TrailingId = "Trailing";

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TextFieldType.values().length];
            try {
                iArr[TextFieldType.Filled.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextFieldType.Outlined.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[InputPhase.values().length];
            try {
                iArr2[InputPhase.Focused.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[InputPhase.UnfocusedEmpty.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[InputPhase.UnfocusedNotEmpty.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final void CommonDecorationBox(final TextFieldType textFieldType, final CharSequence charSequence, final p<? super Composer, ? super Integer, ab> pVar, final TextFieldLabelPosition textFieldLabelPosition, final q<? super TextFieldLabelScope, ? super Composer, ? super Integer, ab> qVar, final p<? super Composer, ? super Integer, ab> pVar2, final p<? super Composer, ? super Integer, ab> pVar3, final p<? super Composer, ? super Integer, ab> pVar4, final p<? super Composer, ? super Integer, ab> pVar5, final p<? super Composer, ? super Integer, ab> pVar6, final p<? super Composer, ? super Integer, ab> pVar7, final boolean z, final boolean z2, final boolean z3, final InteractionSource interactionSource, final PaddingValues paddingValues, final TextFieldColors textFieldColors, final p<? super Composer, ? super Integer, ab> pVar8, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        boolean z4;
        int i6;
        boolean z5;
        int i7;
        boolean z6;
        InteractionSource interactionSource2;
        int i8;
        Composer composer2;
        State<Float> stateLabelProgress;
        State<Float> state;
        final State<Float> statePlaceholderOpacity;
        State<Float> stateAffixOpacity;
        final boolean z7;
        State<Float> state2;
        int i9;
        Composer composer3;
        final TextFieldColors textFieldColors2;
        int i10;
        boolean z8;
        boolean z9;
        final TextStyle textStyle;
        ComposableLambda composableLambdaRememberComposableLambda;
        ComposableLambda composableLambdaRememberComposableLambda2;
        ComposableLambda composableLambda;
        final State<Float> state3;
        State state4;
        ComposableLambda composableLambda2;
        ComposableLambda composableLambdaRememberComposableLambda3;
        ComposableLambda composableLambda3;
        ComposableLambda composableLambdaRememberComposableLambda4;
        ComposableLambda composableLambda4;
        Composer composerStartRestartGroup = composer.startRestartGroup(546805032);
        if ((i2 & 6) == 0) {
            i4 = (true != composerStartRestartGroup.changed(textFieldType.ordinal()) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 = i4 | (true != composerStartRestartGroup.changedInstance(charSequence) ? 16 : 32);
        } else {
            i5 = i4;
        }
        if ((i2 & 384) == 0) {
            i5 |= true != composerStartRestartGroup.changedInstance(pVar) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            z4 = true;
            i5 |= true != composerStartRestartGroup.changed(textFieldLabelPosition) ? 1024 : 2048;
        } else {
            z4 = true;
        }
        if ((i2 & 24576) == 0) {
            i5 |= z4 != composerStartRestartGroup.changedInstance(qVar) ? 8192 : 16384;
        }
        if ((i2 & 196608) == 0) {
            i5 |= z4 != composerStartRestartGroup.changedInstance(pVar2) ? 65536 : 131072;
        }
        if ((i2 & 1572864) == 0) {
            i6 = 1572864;
            i5 |= true != composerStartRestartGroup.changedInstance(pVar3) ? 524288 : 1048576;
        } else {
            i6 = 1572864;
        }
        if ((12582912 & i2) == 0) {
            i5 |= true != composerStartRestartGroup.changedInstance(pVar4) ? 4194304 : 8388608;
        }
        if ((100663296 & i2) == 0) {
            i5 |= true != composerStartRestartGroup.changedInstance(pVar5) ? GroupFlagsKt.HasAuxSlotFlag : 67108864;
        }
        if ((805306368 & i2) == 0) {
            i5 |= true != composerStartRestartGroup.changedInstance(pVar6) ? 268435456 : 536870912;
        }
        int i11 = i5;
        if ((i3 & 6) == 0) {
            z5 = true;
            i7 = i3 | (true != composerStartRestartGroup.changedInstance(pVar7) ? 2 : 4);
        } else {
            z5 = true;
            i7 = i3;
        }
        if ((i3 & 48) == 0) {
            i7 |= z5 == composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            z6 = true;
            i7 |= true == composerStartRestartGroup.changed(z2) ? 256 : 128;
        } else {
            z6 = true;
        }
        if ((i3 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i7 |= z6 == composerStartRestartGroup.changed(z3) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            interactionSource2 = interactionSource;
            i7 |= z6 != composerStartRestartGroup.changed(interactionSource2) ? 8192 : 16384;
        } else {
            interactionSource2 = interactionSource;
        }
        if ((i3 & 196608) == 0) {
            i7 |= z6 != composerStartRestartGroup.changed(paddingValues) ? 65536 : 131072;
        }
        if ((i3 & i6) == 0) {
            i8 = i7 | (z6 != composerStartRestartGroup.changed(textFieldColors) ? 524288 : 1048576);
        } else {
            i8 = i7;
        }
        if ((12582912 & i3) == 0) {
            i8 |= true != composerStartRestartGroup.changedInstance(pVar8) ? 4194304 : 8388608;
        }
        int i12 = i8;
        if (composerStartRestartGroup.shouldExecute(((i11 & 306783379) == 306783378 && (4793491 & i12) == 4793490) ? false : true, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(546805032, i11, i12, "androidx.compose.material3.internal.CommonDecorationBox (TextFieldImpl.kt:94)");
            }
            boolean zBooleanValue = FocusInteractionKt.collectIsFocusedAsState(interactionSource2, composerStartRestartGroup, (i12 >> 12) & 14).getValue().booleanValue();
            InputPhase inputPhase = zBooleanValue ? InputPhase.Focused : charSequence.length() == 0 ? InputPhase.UnfocusedEmpty : InputPhase.UnfocusedNotEmpty;
            Typography typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
            final TextStyle bodyLarge = typography.getBodyLarge();
            final TextStyle bodySmall = typography.getBodySmall();
            InputPhase inputPhase2 = inputPhase;
            final boolean z10 = (Color.m8229equalsimpl0(bodyLarge.m10576getColor0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU()) && !Color.m8229equalsimpl0(bodySmall.m10576getColor0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU())) || (!Color.m8229equalsimpl0(bodyLarge.m10576getColor0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU()) && Color.m8229equalsimpl0(bodySmall.m10576getColor0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU()));
            final Transition transitionUpdateTransition = TransitionKt.updateTransition(inputPhase2, "TextFieldInputState", composerStartRestartGroup, 48, 0);
            boolean z11 = qVar != null && getShowExpandedLabel(textFieldLabelPosition);
            if (qVar != null) {
                composerStartRestartGroup.startReplaceGroup(-940723593);
                stateLabelProgress = labelProgress(transitionUpdateTransition, z11, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-940652386);
                composerStartRestartGroup.endReplaceGroup();
                stateLabelProgress = null;
            }
            if (pVar2 != null) {
                state = stateLabelProgress;
                composerStartRestartGroup.startReplaceGroup(-940561742);
                statePlaceholderOpacity = placeholderOpacity(transitionUpdateTransition, z11, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                state = stateLabelProgress;
                composerStartRestartGroup.startReplaceGroup(-940485730);
                composerStartRestartGroup.endReplaceGroup();
                statePlaceholderOpacity = null;
            }
            if (pVar5 == null && pVar6 == null) {
                composerStartRestartGroup.startReplaceGroup(-940318082);
                composerStartRestartGroup.endReplaceGroup();
                stateAffixOpacity = null;
            } else {
                composerStartRestartGroup.startReplaceGroup(-940388328);
                stateAffixOpacity = affixOpacity(transitionUpdateTransition, z11, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (qVar == null) {
                composerStartRestartGroup.startReplaceGroup(-940231841);
                composerStartRestartGroup.endReplaceGroup();
                z7 = zBooleanValue;
                i10 = i11;
                state2 = stateAffixOpacity;
                i9 = i12;
                composer3 = composerStartRestartGroup;
                z8 = z2;
                z9 = z3;
                textStyle = bodyLarge;
                composableLambdaRememberComposableLambda = null;
                textFieldColors2 = textFieldColors;
            } else {
                composerStartRestartGroup.startReplaceGroup(-940231840);
                z7 = zBooleanValue;
                state2 = stateAffixOpacity;
                i9 = i12;
                composer3 = composerStartRestartGroup;
                final State<Float> state5 = state;
                textFieldColors2 = textFieldColors;
                p pVar9 = new p() { // from class: androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda4
                    @Override // h.g.a.p
                    public final Object invoke(Object obj, Object obj2) {
                        return TextFieldImplKt.CommonDecorationBox$lambda$0$0(state5, textFieldColors2, z2, z3, z7, z10, transitionUpdateTransition, bodySmall, bodyLarge, qVar, (Composer) obj, ((Integer) obj2).intValue());
                    }
                };
                i10 = i11;
                state = state5;
                z8 = z2;
                z9 = z3;
                textStyle = bodyLarge;
                composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1632654811, true, pVar9, composer3, 54);
                composer3.endReplaceGroup();
            }
            final long jM5778placeholderColorXeAY9LY = textFieldColors2.m5778placeholderColorXeAY9LY(z8, z9, z7);
            Object objRememberedValue = composer3.rememberedValue();
            ComposableLambda composableLambda5 = composableLambdaRememberComposableLambda;
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new a() { // from class: androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda11
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return Boolean.valueOf(TextFieldImplKt.CommonDecorationBox$lambda$1$0(statePlaceholderOpacity));
                    }
                });
                composer3.updateRememberedValue(objRememberedValue);
            }
            State state6 = (State) objRememberedValue;
            if (pVar2 != null && charSequence.length() == 0 && CommonDecorationBox$lambda$2(state6)) {
                composer3.startReplaceGroup(-939160356);
                composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(-720601610, true, new q() { // from class: androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda12
                    @Override // h.g.a.q
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return TextFieldImplKt.CommonDecorationBox$lambda$3(jM5778placeholderColorXeAY9LY, textStyle, pVar2, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, composer3, 54);
                composer3.endReplaceGroup();
            } else {
                composer3.startReplaceGroup(-938848683);
                composer3.endReplaceGroup();
                composableLambdaRememberComposableLambda2 = null;
            }
            final long jM5779prefixColorXeAY9LY = textFieldColors2.m5779prefixColorXeAY9LY(z8, z9, z7);
            Object objRememberedValue2 = composer3.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                composableLambda = composableLambdaRememberComposableLambda2;
                state3 = state2;
                objRememberedValue2 = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new a() { // from class: androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda13
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return Boolean.valueOf(TextFieldImplKt.CommonDecorationBox$lambda$4$0(state3));
                    }
                });
                composer3.updateRememberedValue(objRememberedValue2);
            } else {
                composableLambda = composableLambdaRememberComposableLambda2;
                state3 = state2;
            }
            State state7 = (State) objRememberedValue2;
            if (pVar5 == null || !CommonDecorationBox$lambda$5(state7)) {
                state4 = state7;
                composer3.startReplaceGroup(-938405259);
                composer3.endReplaceGroup();
                composableLambda2 = null;
            } else {
                composer3.startReplaceGroup(-938552601);
                state4 = state7;
                ComposableLambda composableLambdaRememberComposableLambda5 = ComposableLambdaKt.rememberComposableLambda(-1271185508, true, new p() { // from class: androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda14
                    @Override // h.g.a.p
                    public final Object invoke(Object obj, Object obj2) {
                        return TextFieldImplKt.CommonDecorationBox$lambda$6(jM5779prefixColorXeAY9LY, textStyle, pVar5, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, composer3, 54);
                composer3.endReplaceGroup();
                composableLambda2 = composableLambdaRememberComposableLambda5;
            }
            final long jM5780suffixColorXeAY9LY = textFieldColors2.m5780suffixColorXeAY9LY(z8, z9, z7);
            if (pVar6 == null || !CommonDecorationBox$lambda$5(state4)) {
                composer3.startReplaceGroup(-938084843);
                composer3.endReplaceGroup();
                composableLambdaRememberComposableLambda3 = null;
            } else {
                composer3.startReplaceGroup(-938232185);
                composableLambdaRememberComposableLambda3 = ComposableLambdaKt.rememberComposableLambda(123777469, true, new p() { // from class: androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda15
                    @Override // h.g.a.p
                    public final Object invoke(Object obj, Object obj2) {
                        return TextFieldImplKt.CommonDecorationBox$lambda$7(jM5780suffixColorXeAY9LY, textStyle, pVar6, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, composer3, 54);
                composer3.endReplaceGroup();
            }
            final long jM5777leadingIconColorXeAY9LY = textFieldColors2.m5777leadingIconColorXeAY9LY(z8, z9, z7);
            if (pVar3 == null) {
                composer3.startReplaceGroup(-937922124);
                composer3.endReplaceGroup();
                composableLambda3 = null;
            } else {
                composer3.startReplaceGroup(-937922123);
                ComposableLambda composableLambdaRememberComposableLambda6 = ComposableLambdaKt.rememberComposableLambda(-906968406, true, new p() { // from class: androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda16
                    @Override // h.g.a.p
                    public final Object invoke(Object obj, Object obj2) {
                        return TextFieldImplKt.CommonDecorationBox$lambda$8$0(jM5777leadingIconColorXeAY9LY, pVar3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, composer3, 54);
                composer3.endReplaceGroup();
                composableLambda3 = composableLambdaRememberComposableLambda6;
            }
            ComposableLambda composableLambda6 = composableLambda2;
            final long jM5783trailingIconColorXeAY9LY = textFieldColors2.m5783trailingIconColorXeAY9LY(z8, z9, z7);
            if (pVar4 == null) {
                composer3.startReplaceGroup(-937662189);
                composer3.endReplaceGroup();
                composableLambdaRememberComposableLambda4 = null;
            } else {
                composer3.startReplaceGroup(-937662188);
                composableLambdaRememberComposableLambda4 = ComposableLambdaKt.rememberComposableLambda(-1287792574, true, new p() { // from class: androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda17
                    @Override // h.g.a.p
                    public final Object invoke(Object obj, Object obj2) {
                        return TextFieldImplKt.CommonDecorationBox$lambda$9$0(jM5783trailingIconColorXeAY9LY, pVar4, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, composer3, 54);
                composer3.endReplaceGroup();
            }
            final long jM5781supportingTextColorXeAY9LY = textFieldColors2.m5781supportingTextColorXeAY9LY(z8, z9, z7);
            if (pVar7 == null) {
                composer3.startReplaceGroup(-937391714);
                composer3.endReplaceGroup();
                composableLambda4 = null;
            } else {
                composer3.startReplaceGroup(-937391713);
                ComposableLambda composableLambdaRememberComposableLambda7 = ComposableLambdaKt.rememberComposableLambda(-1612592437, true, new p() { // from class: androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda18
                    @Override // h.g.a.p
                    public final Object invoke(Object obj, Object obj2) {
                        return TextFieldImplKt.CommonDecorationBox$lambda$10$0(jM5781supportingTextColorXeAY9LY, bodySmall, pVar7, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, composer3, 54);
                composer3.endReplaceGroup();
                composableLambda4 = composableLambdaRememberComposableLambda7;
            }
            final State<Float> state8 = state;
            boolean zChanged = composer3.changed(state8);
            Object objRememberedValue3 = composer3.rememberedValue();
            if (zChanged || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new a() { // from class: androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda19
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return Float.valueOf(TextFieldImplKt.CommonDecorationBox$lambda$11$0(state8));
                    }
                };
                composer3.updateRememberedValue(objRememberedValue3);
            }
            final a aVar = (a) objRememberedValue3;
            boolean zChanged2 = composer3.changed(statePlaceholderOpacity);
            Object objRememberedValue4 = composer3.rememberedValue();
            if (zChanged2 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = new a() { // from class: androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda5
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return Float.valueOf(TextFieldImplKt.CommonDecorationBox$lambda$12$0(statePlaceholderOpacity));
                    }
                };
                composer3.updateRememberedValue(objRememberedValue4);
            }
            a aVar2 = (a) objRememberedValue4;
            boolean zChanged3 = composer3.changed(state3);
            Object objRememberedValue5 = composer3.rememberedValue();
            if (zChanged3 || objRememberedValue5 == Composer.Companion.getEmpty()) {
                objRememberedValue5 = new a() { // from class: androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda6
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return Float.valueOf(TextFieldImplKt.CommonDecorationBox$lambda$13$0(state3));
                    }
                };
                composer3.updateRememberedValue(objRememberedValue5);
            }
            a aVar3 = (a) objRememberedValue5;
            TextFieldType textFieldType2 = TextFieldType.Filled;
            int iOrdinal = textFieldType.ordinal();
            if (iOrdinal == 0) {
                int i13 = i10;
                int i14 = (i13 << 18) & C.ENCODING_PCM_DOUBLE;
                composer3.startReplaceGroup(-936973554);
                int i15 = ((i9 << 21) & 234881024) | ((i13 >> 3) & 112) | 6 | i14;
                Composer composer4 = composer3;
                TextFieldKt.TextFieldLayout(Modifier.Companion, pVar, composableLambda5, composableLambda, composableLambda3, composableLambdaRememberComposableLambda4, composableLambda6, composableLambdaRememberComposableLambda3, z, textFieldLabelPosition, new TextFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0(aVar), new TextFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0(aVar2), new TextFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0(aVar3), ComposableLambdaKt.rememberComposableLambda(-358432442, true, new p() { // from class: androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda7
                    @Override // h.g.a.p
                    public final Object invoke(Object obj, Object obj2) {
                        return TextFieldImplKt.CommonDecorationBox$lambda$14(pVar8, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, composer3, 54), composableLambda4, paddingValues, composer4, i15, (i9 & 458752) | DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS);
                composer2 = composer4;
                composer2.endReplaceGroup();
            } else {
                if (iOrdinal != 1) {
                    composer3.startReplaceGroup(1493796415);
                    composer3.endReplaceGroup();
                    throw new i();
                }
                int i16 = (i10 << 18) & C.ENCODING_PCM_DOUBLE;
                int i17 = (i9 << 21) & 234881024;
                int i18 = ((i10 >> 3) & 112) | 6;
                composer3.startReplaceGroup(-935939642);
                Object objRememberedValue6 = composer3.rememberedValue();
                ComposableLambda composableLambda7 = composableLambdaRememberComposableLambda4;
                if (objRememberedValue6 == Composer.Companion.getEmpty()) {
                    objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m8037boximpl(Size.Companion.m8058getZeroNHjbRc()), null, 2, null);
                    composer3.updateRememberedValue(objRememberedValue6);
                }
                final MutableState mutableState = (MutableState) objRememberedValue6;
                ComposableLambda composableLambda8 = composableLambda3;
                ComposableLambda composableLambdaRememberComposableLambda8 = ComposableLambdaKt.rememberComposableLambda(-403938615, true, new p() { // from class: androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda8
                    @Override // h.g.a.p
                    public final Object invoke(Object obj, Object obj2) {
                        return TextFieldImplKt.CommonDecorationBox$lambda$16(mutableState, textFieldLabelPosition, paddingValues, pVar8, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, composer3, 54);
                Modifier.Companion companion = Modifier.Companion;
                TextFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0 textFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0 = new TextFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0(aVar);
                TextFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0 textFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$02 = new TextFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0(aVar2);
                TextFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0 textFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$03 = new TextFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0(aVar3);
                Modifier.Companion companion2 = companion;
                boolean zChanged4 = ((i10 & 7168) == 2048) | composer3.changed(aVar);
                Object objRememberedValue7 = composer3.rememberedValue();
                if (zChanged4 || objRememberedValue7 == Composer.Companion.getEmpty()) {
                    objRememberedValue7 = new l() { // from class: androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda9
                        @Override // h.g.a.l
                        public final Object invoke(Object obj) {
                            return TextFieldImplKt.CommonDecorationBox$lambda$17$0(textFieldLabelPosition, aVar, mutableState, (Size) obj);
                        }
                    };
                    composer3.updateRememberedValue(objRememberedValue7);
                }
                Composer composer5 = composer3;
                OutlinedTextFieldKt.OutlinedTextFieldLayout(companion2, pVar, composableLambda, composableLambda5, composableLambda8, composableLambda7, composableLambda6, composableLambdaRememberComposableLambda3, z, textFieldLabelPosition, textFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0, textFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$02, textFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$03, (l) objRememberedValue7, composableLambdaRememberComposableLambda8, composableLambda4, paddingValues, composer5, i18 | i17 | i16, ((i9 << 3) & 3670016) | 24576);
                composer2 = composer5;
                composer2.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda10
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return TextFieldImplKt.CommonDecorationBox$lambda$18(textFieldType, charSequence, pVar, textFieldLabelPosition, qVar, pVar2, pVar3, pVar4, pVar5, pVar6, pVar7, z, z2, z3, interactionSource, paddingValues, textFieldColors, pVar8, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab CommonDecorationBox$lambda$0$0(State state, TextFieldColors textFieldColors, boolean z, boolean z2, boolean z3, boolean z4, Transition transition, TextStyle textStyle, TextStyle textStyle2, q qVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1632654811, i2, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:138)");
            }
            DecoratedLabel(state, textFieldColors, z, z2, z3, z4, transition, textStyle, textStyle2, qVar, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CommonDecorationBox$lambda$1$0(State state) {
        return (state != null ? ((Number) state.getValue()).floatValue() : 0.0f) > 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab CommonDecorationBox$lambda$10$0(long j2, TextStyle textStyle, p pVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1612592437, i2, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:207)");
            }
            m6385Decoration3JVO9M(j2, textStyle, pVar, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float CommonDecorationBox$lambda$11$0(State state) {
        if (state != null) {
            return ((Number) state.getValue()).floatValue();
        }
        return 1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float CommonDecorationBox$lambda$12$0(State state) {
        if (state != null) {
            return ((Number) state.getValue()).floatValue();
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float CommonDecorationBox$lambda$13$0(State state) {
        if (state != null) {
            return ((Number) state.getValue()).floatValue();
        }
        return 0.0f;
    }

    static final ab CommonDecorationBox$lambda$14(p pVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-358432442, i2, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:217)");
            }
            Modifier modifierLayoutId = LayoutIdKt.layoutId(Modifier.Companion, ContainerId);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), true);
            int iM = TextFieldImplKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierLayoutId);
            a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Updater.m7351setimpl(composer, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            pVar.invoke(composer, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab CommonDecorationBox$lambda$16(final MutableState mutableState, TextFieldLabelPosition textFieldLabelPosition, PaddingValues paddingValues, p pVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-403938615, i2, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:243)");
            }
            Modifier modifierOutlineCutout = OutlinedTextFieldKt.outlineCutout(LayoutIdKt.layoutId(Modifier.Companion, ContainerId), new h.g.b.ab(mutableState) { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$borderContainerWithId$1$1
                @Override // h.g.b.ab, h.l.n
                public Object get() {
                    return ((MutableState) this.receiver).getValue();
                }

                @Override // h.g.b.ab
                public void set(Object obj) {
                    ((MutableState) this.receiver).setValue(obj);
                }
            }, getMinimizedAlignment(textFieldLabelPosition), paddingValues);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), true);
            int iM = TextFieldImplKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierOutlineCutout);
            a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Updater.m7351setimpl(composer, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            pVar.invoke(composer, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab CommonDecorationBox$lambda$17$0(TextFieldLabelPosition textFieldLabelPosition, a aVar, MutableState mutableState, Size size) {
        if (!(textFieldLabelPosition instanceof TextFieldLabelPosition.Above)) {
            float fFloatValue = ((Number) aVar.invoke()).floatValue();
            float fIntBitsToFloat = Float.intBitsToFloat((int) (size.m8054unboximpl() >> 32)) * fFloatValue;
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (size.m8054unboximpl() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) * fFloatValue;
            if (Float.intBitsToFloat((int) (((Size) mutableState.getValue()).m8054unboximpl() >> 32)) != fIntBitsToFloat || Float.intBitsToFloat((int) (((Size) mutableState.getValue()).m8054unboximpl() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) != fIntBitsToFloat2) {
                mutableState.setValue(Size.m8037boximpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE)));
            }
        }
        return ab.f48028a;
    }

    static final ab CommonDecorationBox$lambda$18(TextFieldType textFieldType, CharSequence charSequence, p pVar, TextFieldLabelPosition textFieldLabelPosition, q qVar, p pVar2, p pVar3, p pVar4, p pVar5, p pVar6, p pVar7, boolean z, boolean z2, boolean z3, InteractionSource interactionSource, PaddingValues paddingValues, TextFieldColors textFieldColors, p pVar8, int i2, int i3, Composer composer, int i4) {
        CommonDecorationBox(textFieldType, charSequence, pVar, textFieldLabelPosition, qVar, pVar2, pVar3, pVar4, pVar5, pVar6, pVar7, z, z2, z3, interactionSource, paddingValues, textFieldColors, pVar8, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3));
        return ab.f48028a;
    }

    private static final boolean CommonDecorationBox$lambda$2(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    static final ab CommonDecorationBox$lambda$3(long j2, TextStyle textStyle, p pVar, Modifier modifier, Composer composer, int i2) {
        if ((i2 & 6) == 0) {
            i2 |= true != composer.changed(modifier) ? 2 : 4;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-720601610, i2, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:162)");
            }
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iM = TextFieldImplKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifier);
            a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Updater.m7351setimpl(composer, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            m6385Decoration3JVO9M(j2, textStyle, pVar, composer, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CommonDecorationBox$lambda$4$0(State state) {
        return (state != null ? ((Number) state.getValue()).floatValue() : 0.0f) > 0.0f;
    }

    private static final boolean CommonDecorationBox$lambda$5(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    static final ab CommonDecorationBox$lambda$6(long j2, TextStyle textStyle, p pVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1271185508, i2, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:179)");
            }
            m6385Decoration3JVO9M(j2, textStyle, pVar, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab CommonDecorationBox$lambda$7(long j2, TextStyle textStyle, p pVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(123777469, i2, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:187)");
            }
            m6385Decoration3JVO9M(j2, textStyle, pVar, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab CommonDecorationBox$lambda$8$0(long j2, p pVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-906968406, i2, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:194)");
            }
            m6386DecorationIv8Zu3U(j2, pVar, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab CommonDecorationBox$lambda$9$0(long j2, p pVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1287792574, i2, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:200)");
            }
            m6386DecorationIv8Zu3U(j2, pVar, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    private static final void DecoratedLabel(final State<Float> state, final TextFieldColors textFieldColors, final boolean z, final boolean z2, final boolean z3, boolean z4, Transition<InputPhase> transition, final TextStyle textStyle, final TextStyle textStyle2, final q<? super TextFieldLabelScope, ? super Composer, ? super Integer, ab> qVar, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        final boolean z5;
        long j2;
        Composer composer3;
        State<Color> state2;
        boolean z6;
        long j3;
        final Transition<InputPhase> transition2 = transition;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(376119213);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(state) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(textFieldColors) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(z) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changed(z2) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != composerStartRestartGroup.changed(z3) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changed(z4) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changed(transition2) ? 524288 : 1048576;
        }
        if ((12582912 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changed(textStyle) ? 4194304 : 8388608;
        }
        if ((100663296 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changed(textStyle2) ? GroupFlagsKt.HasAuxSlotFlag : 67108864;
        }
        if ((805306368 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(qVar) ? 268435456 : 536870912;
        }
        if (composerStartRestartGroup.shouldExecute((306783379 & i3) != 306783378, i3 & 1)) {
            int i5 = i3 >> 18;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(376119213, i3, -1, "androidx.compose.material3.internal.DecoratedLabel (TextFieldImpl.kt:304)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new TextFieldLabelScope() { // from class: androidx.compose.material3.internal.TextFieldImplKt$DecoratedLabel$labelScope$1$1
                    @Override // androidx.compose.material3.TextFieldLabelScope
                    public float getLabelMinimizedProgress() {
                        State<Float> state3 = state;
                        if (state3 != null) {
                            return state3.getValue().floatValue();
                        }
                        return 1.0f;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            int i6 = i5 & 14;
            final TextFieldImplKt$DecoratedLabel$labelScope$1$1 textFieldImplKt$DecoratedLabel$labelScope$1$1 = (TextFieldImplKt$DecoratedLabel$labelScope$1$1) objRememberedValue;
            long jM5776labelColorXeAY9LY = textFieldColors.m5776labelColorXeAY9LY(z, z2, z3);
            if (z4) {
                composerStartRestartGroup.startReplaceGroup(-601510006);
                long jM10576getColor0d7_KjU = textStyle.m10576getColor0d7_KjU();
                if (jM10576getColor0d7_KjU == 16) {
                    jM10576getColor0d7_KjU = jM5776labelColorXeAY9LY;
                }
                long jM10576getColor0d7_KjU2 = textStyle2.m10576getColor0d7_KjU();
                if (jM10576getColor0d7_KjU2 != 16) {
                    j2 = jM5776labelColorXeAY9LY;
                    j3 = jM10576getColor0d7_KjU2;
                } else {
                    j3 = jM5776labelColorXeAY9LY;
                    j2 = j3;
                }
                State<Color> stateM6388labelTextStyleColor1wkBAMs = m6388labelTextStyleColor1wkBAMs(transition2, jM10576getColor0d7_KjU, j3, composerStartRestartGroup, i6);
                transition2 = transition2;
                composer3 = composerStartRestartGroup;
                composer3.endReplaceGroup();
                state2 = stateM6388labelTextStyleColor1wkBAMs;
                z6 = true;
            } else {
                j2 = jM5776labelColorXeAY9LY;
                composer3 = composerStartRestartGroup;
                composer3.startReplaceGroup(-601031335);
                composer3.endReplaceGroup();
                state2 = null;
                z6 = z4;
            }
            State<Color> stateM6387labelContentColorRPmYEkk = m6387labelContentColorRPmYEkk(transition2, j2, composer3, i6);
            TextStyle textStyleLerp = TextStyleKt.lerp(textStyle2, textStyle, state != null ? state.getValue().floatValue() : 1.0f);
            if (z6) {
                x.c(state2);
                textStyleLerp = TextStyle.m10559copyp1EtxEg$default(textStyleLerp, state2.getValue().m8238unboximpl(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
            }
            composer2 = composer3;
            m6385Decoration3JVO9M(stateM6387labelContentColorRPmYEkk.getValue().m8238unboximpl(), textStyleLerp, ComposableLambdaKt.rememberComposableLambda(57043598, true, new p() { // from class: androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda22
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return TextFieldImplKt.DecoratedLabel$lambda$4(qVar, textFieldImplKt$DecoratedLabel$labelScope$1$1, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer3, 54), composer2, 384);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z5 = z6;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            z5 = z4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda23
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return TextFieldImplKt.DecoratedLabel$lambda$5(state, textFieldColors, z, z2, z3, z5, transition2, textStyle, textStyle2, qVar, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab DecoratedLabel$lambda$4(q qVar, TextFieldImplKt$DecoratedLabel$labelScope$1$1 textFieldImplKt$DecoratedLabel$labelScope$1$1, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(57043598, i2, -1, "androidx.compose.material3.internal.DecoratedLabel.<anonymous> (TextFieldImpl.kt:337)");
            }
            qVar.invoke(textFieldImplKt$DecoratedLabel$labelScope$1$1, composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab DecoratedLabel$lambda$5(State state, TextFieldColors textFieldColors, boolean z, boolean z2, boolean z3, boolean z4, Transition transition, TextStyle textStyle, TextStyle textStyle2, q qVar, int i2, Composer composer, int i3) {
        DecoratedLabel(state, textFieldColors, z, z2, z3, z4, transition, textStyle, textStyle2, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    /* renamed from: Decoration-3J-VO9M, reason: not valid java name */
    private static final void m6385Decoration3JVO9M(long j2, TextStyle textStyle, p<? super Composer, ? super Integer, ab> pVar, Composer composer, final int i2) {
        int i3;
        final p<? super Composer, ? super Integer, ab> pVar2;
        final TextStyle textStyle2;
        final long j3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(396611577);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(j2) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(textStyle) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(396611577, i3, -1, "androidx.compose.material3.internal.Decoration (TextFieldImpl.kt:362)");
            }
            ProvideContentColorTextStyleKt.m6286ProvideContentColorTextStyle3JVO9M(j2, textStyle, pVar, composerStartRestartGroup, i3 & 1022);
            j3 = j2;
            textStyle2 = textStyle;
            pVar2 = pVar;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            pVar2 = pVar;
            textStyle2 = textStyle;
            j3 = j2;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda29
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return TextFieldImplKt.Decoration_3J_VO9M$lambda$0(j3, textStyle2, pVar2, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: Decoration-Iv8Zu3U, reason: not valid java name */
    private static final void m6386DecorationIv8Zu3U(final long j2, final p<? super Composer, ? super Integer, ab> pVar, Composer composer, final int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(590397809);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(j2) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(590397809, i3, -1, "androidx.compose.material3.internal.Decoration (TextFieldImpl.kt:367)");
            }
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m8218boximpl(j2)), pVar, composerStartRestartGroup, (i3 & 112) | ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda30
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return TextFieldImplKt.Decoration_Iv8Zu3U$lambda$0(j2, pVar, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab Decoration_3J_VO9M$lambda$0(long j2, TextStyle textStyle, p pVar, int i2, Composer composer, int i3) {
        m6385Decoration3JVO9M(j2, textStyle, pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    static final ab Decoration_Iv8Zu3U$lambda$0(long j2, p pVar, int i2, Composer composer, int i3) {
        m6386DecorationIv8Zu3U(j2, pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b1, code lost:
    
        if (r11 == 2) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0117, code lost:
    
        if (r3 == 2) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0184  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final androidx.compose.runtime.State<java.lang.Float> affixOpacity(final androidx.compose.animation.core.Transition<androidx.compose.material3.internal.InputPhase> r19, boolean r20, androidx.compose.runtime.Composer r21, int r22) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.TextFieldImplKt.affixOpacity(androidx.compose.animation.core.Transition, boolean, androidx.compose.runtime.Composer, int):androidx.compose.runtime.State");
    }

    static final FiniteAnimationSpec affixOpacity$lambda$0(FiniteAnimationSpec finiteAnimationSpec, Transition.Segment segment, Composer composer, int i2) {
        composer.startReplaceGroup(-735253059);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-735253059, i2, -1, "androidx.compose.material3.internal.affixOpacity.<anonymous> (TextFieldImpl.kt:445)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return finiteAnimationSpec;
    }

    public static final Modifier defaultErrorSemantics(Modifier modifier, boolean z, final String str) {
        return z ? SemanticsModifierKt.semantics(modifier, 1 == ((false ? 1 : 0) & ((1 & 1) ^ 1)), new l() { // from class: androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda24
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return TextFieldImplKt.defaultErrorSemantics$lambda$0(str, (SemanticsPropertyReceiver) obj);
            }
        }) : modifier;
    }

    static final ab defaultErrorSemantics$lambda$0(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.error(semanticsPropertyReceiver, str);
        return ab.f48028a;
    }

    public static final float getAboveLabelBottomPadding() {
        return AboveLabelBottomPadding;
    }

    public static final float getAboveLabelHorizontalPadding() {
        return AboveLabelHorizontalPadding;
    }

    public static final Alignment.Horizontal getExpandedAlignment(TextFieldLabelPosition textFieldLabelPosition) {
        if (textFieldLabelPosition instanceof TextFieldLabelPosition.Above) {
            return ((TextFieldLabelPosition.Above) textFieldLabelPosition).getAlignment();
        }
        if (textFieldLabelPosition instanceof TextFieldLabelPosition.Attached) {
            return ((TextFieldLabelPosition.Attached) textFieldLabelPosition).getExpandedAlignment();
        }
        Objects.toString(textFieldLabelPosition);
        throw new IllegalArgumentException("Unknown position: ".concat(String.valueOf(textFieldLabelPosition)));
    }

    public static final float getMinFocusedLabelLineHeight() {
        return MinFocusedLabelLineHeight;
    }

    public static final float getMinSupportingTextLineHeight() {
        return MinSupportingTextLineHeight;
    }

    public static final float getMinTextLineHeight() {
        return MinTextLineHeight;
    }

    public static final Alignment.Horizontal getMinimizedAlignment(TextFieldLabelPosition textFieldLabelPosition) {
        if (textFieldLabelPosition instanceof TextFieldLabelPosition.Above) {
            return ((TextFieldLabelPosition.Above) textFieldLabelPosition).getAlignment();
        }
        if (textFieldLabelPosition instanceof TextFieldLabelPosition.Attached) {
            return ((TextFieldLabelPosition.Attached) textFieldLabelPosition).getMinimizedAlignment();
        }
        Objects.toString(textFieldLabelPosition);
        throw new IllegalArgumentException("Unknown position: ".concat(String.valueOf(textFieldLabelPosition)));
    }

    public static final float getPrefixSuffixTextPadding() {
        return PrefixSuffixTextPadding;
    }

    private static final boolean getShowExpandedLabel(TextFieldLabelPosition textFieldLabelPosition) {
        return (textFieldLabelPosition instanceof TextFieldLabelPosition.Attached) && !((TextFieldLabelPosition.Attached) textFieldLabelPosition).getAlwaysMinimize();
    }

    public static final float getSupportingTopPadding() {
        return SupportingTopPadding;
    }

    public static final float getTextFieldPadding() {
        return TextFieldPadding;
    }

    /* renamed from: labelContentColor-RPmYEkk, reason: not valid java name */
    private static final State<Color> m6387labelContentColorRPmYEkk(final Transition<InputPhase> transition, long j2, Composer composer, int i2) {
        Object currentState;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1365844622, i2, -1, "androidx.compose.material3.internal.labelContentColor (TextFieldImpl.kt:470)");
        }
        final FiniteAnimationSpec finiteAnimationSpecValue = MotionSchemeKt.value(MotionSchemeKeyTokens.FastEffects, composer, 6);
        q qVar = new q() { // from class: androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda26
            @Override // h.g.a.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                FiniteAnimationSpec finiteAnimationSpec = finiteAnimationSpecValue;
                TextFieldImplKt.labelContentColor_RPmYEkk$lambda$0(finiteAnimationSpec, (Transition.Segment) obj, (Composer) obj2, ((Integer) obj3).intValue());
                return finiteAnimationSpec;
            }
        };
        int i3 = i2 & 14;
        transition.getTargetState();
        composer.startReplaceGroup(1139343725);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1139343725, 0, -1, "androidx.compose.material3.internal.labelContentColor.<anonymous> (TextFieldImpl.kt:476)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        ColorSpace colorSpaceM8232getColorSpaceimpl = Color.m8232getColorSpaceimpl(j2);
        boolean zChanged = composer.changed(colorSpaceM8232getColorSpaceimpl);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(colorSpaceM8232getColorSpaceimpl);
            composer.updateRememberedValue(objRememberedValue);
        }
        int i4 = ((i3 | 384) & 14) | DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS;
        int i5 = i4 & 14;
        int i6 = i5 ^ 6;
        TwoWayConverter twoWayConverter = (TwoWayConverter) objRememberedValue;
        if (transition.isSeeking()) {
            composer.startReplaceGroup(1666827533);
            composer.endReplaceGroup();
            currentState = transition.getCurrentState();
        } else {
            composer.startReplaceGroup(1666573488);
            boolean z = (i6 > 4 && composer.changed(transition)) || (i4 & 6) == 4;
            currentState = composer.rememberedValue();
            if (z || currentState == Composer.Companion.getEmpty()) {
                Snapshot.Companion companion = Snapshot.Companion;
                Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                l<Object, ab> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                try {
                    InputPhase currentState2 = transition.getCurrentState();
                    companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                    composer.updateRememberedValue(currentState2);
                    currentState = currentState2;
                } catch (Throwable th) {
                    companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                    throw th;
                }
            }
            composer.endReplaceGroup();
        }
        composer.startReplaceGroup(1139343725);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1139343725, 0, -1, "androidx.compose.material3.internal.labelContentColor.<anonymous> (TextFieldImpl.kt:476)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        Color colorM8218boximpl = Color.m8218boximpl(j2);
        boolean z2 = (i6 > 4 && composer.changed(transition)) || (i4 & 6) == 4;
        Object objRememberedValue2 = composer.rememberedValue();
        if (z2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt.derivedStateOf(new a<InputPhase>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$labelContentColor-RPmYEkk$$inlined$animateColor$1
                /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.material3.internal.InputPhase, java.lang.Object] */
                @Override // h.g.a.a
                public final InputPhase invoke() {
                    return transition.getTargetState();
                }
            });
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.startReplaceGroup(1139343725);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1139343725, 0, -1, "androidx.compose.material3.internal.labelContentColor.<anonymous> (TextFieldImpl.kt:476)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        Color colorM8218boximpl2 = Color.m8218boximpl(j2);
        boolean z3 = (i6 > 4 && composer.changed(transition)) || (i4 & 6) == 4;
        Object objRememberedValue3 = composer.rememberedValue();
        if (z3 || objRememberedValue3 == Composer.Companion.getEmpty()) {
            objRememberedValue3 = SnapshotStateKt.derivedStateOf(new a<Transition.Segment<InputPhase>>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$labelContentColor-RPmYEkk$$inlined$animateColor$2
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // h.g.a.a
                public final Transition.Segment<InputPhase> invoke() {
                    return transition.getSegment();
                }
            });
            composer.updateRememberedValue(objRememberedValue3);
        }
        State<Color> stateCreateTransitionAnimation = TransitionKt.createTransitionAnimation(transition, colorM8218boximpl, colorM8218boximpl2, (FiniteAnimationSpec) qVar.invoke(((State) objRememberedValue3).getValue(), composer, 0), twoWayConverter, "LabelContentColor", composer, i5 | 196608);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateCreateTransitionAnimation;
    }

    static final FiniteAnimationSpec labelContentColor_RPmYEkk$lambda$0(FiniteAnimationSpec finiteAnimationSpec, Transition.Segment segment, Composer composer, int i2) {
        composer.startReplaceGroup(-1207102280);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1207102280, i2, -1, "androidx.compose.material3.internal.labelContentColor.<anonymous> (TextFieldImpl.kt:474)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return finiteAnimationSpec;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b1, code lost:
    
        if (r11 == 2) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0117, code lost:
    
        if (r3 == 2) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0184  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final androidx.compose.runtime.State<java.lang.Float> labelProgress(final androidx.compose.animation.core.Transition<androidx.compose.material3.internal.InputPhase> r19, boolean r20, androidx.compose.runtime.Composer r21, int r22) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.TextFieldImplKt.labelProgress(androidx.compose.animation.core.Transition, boolean, androidx.compose.runtime.Composer, int):androidx.compose.runtime.State");
    }

    static final FiniteAnimationSpec labelProgress$lambda$0(FiniteAnimationSpec finiteAnimationSpec, Transition.Segment segment, Composer composer, int i2) {
        composer.startReplaceGroup(1806589607);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1806589607, i2, -1, "androidx.compose.material3.internal.labelProgress.<anonymous> (TextFieldImpl.kt:404)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return finiteAnimationSpec;
    }

    /* renamed from: labelTextStyleColor-1wkBAMs, reason: not valid java name */
    private static final State<Color> m6388labelTextStyleColor1wkBAMs(final Transition<InputPhase> transition, long j2, long j3, Composer composer, int i2) {
        Object currentState;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-182681442, i2, -1, "androidx.compose.material3.internal.labelTextStyleColor (TextFieldImpl.kt:459)");
        }
        final FiniteAnimationSpec finiteAnimationSpecValue = MotionSchemeKt.value(MotionSchemeKeyTokens.FastEffects, composer, 6);
        q qVar = new q() { // from class: androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda3
            @Override // h.g.a.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                FiniteAnimationSpec finiteAnimationSpec = finiteAnimationSpecValue;
                TextFieldImplKt.labelTextStyleColor_1wkBAMs$lambda$0(finiteAnimationSpec, (Transition.Segment) obj, (Composer) obj2, ((Integer) obj3).intValue());
                return finiteAnimationSpec;
            }
        };
        int i3 = i2 & 14;
        InputPhase targetState = transition.getTargetState();
        composer.startReplaceGroup(-759924327);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-759924327, 0, -1, "androidx.compose.material3.internal.labelTextStyleColor.<anonymous> (TextFieldImpl.kt:462)");
        }
        long j4 = WhenMappings.$EnumSwitchMapping$1[targetState.ordinal()] == 1 ? j2 : j3;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        ColorSpace colorSpaceM8232getColorSpaceimpl = Color.m8232getColorSpaceimpl(j4);
        boolean zChanged = composer.changed(colorSpaceM8232getColorSpaceimpl);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(colorSpaceM8232getColorSpaceimpl);
            composer.updateRememberedValue(objRememberedValue);
        }
        int i4 = ((i3 | 384) & 14) | DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS;
        int i5 = i4 & 14;
        int i6 = i5 ^ 6;
        TwoWayConverter twoWayConverter = (TwoWayConverter) objRememberedValue;
        if (transition.isSeeking()) {
            composer.startReplaceGroup(1666827533);
            composer.endReplaceGroup();
            currentState = transition.getCurrentState();
        } else {
            composer.startReplaceGroup(1666573488);
            boolean z = (i6 > 4 && composer.changed(transition)) || (i4 & 6) == 4;
            currentState = composer.rememberedValue();
            if (z || currentState == Composer.Companion.getEmpty()) {
                Snapshot.Companion companion = Snapshot.Companion;
                Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                l<Object, ab> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                try {
                    InputPhase currentState2 = transition.getCurrentState();
                    companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                    composer.updateRememberedValue(currentState2);
                    currentState = currentState2;
                } catch (Throwable th) {
                    companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                    throw th;
                }
            }
            composer.endReplaceGroup();
        }
        InputPhase inputPhase = (InputPhase) currentState;
        composer.startReplaceGroup(-759924327);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-759924327, 0, -1, "androidx.compose.material3.internal.labelTextStyleColor.<anonymous> (TextFieldImpl.kt:462)");
        }
        long j5 = WhenMappings.$EnumSwitchMapping$1[inputPhase.ordinal()] == 1 ? j2 : j3;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        Color colorM8218boximpl = Color.m8218boximpl(j5);
        boolean z2 = (i6 > 4 && composer.changed(transition)) || (i4 & 6) == 4;
        Object objRememberedValue2 = composer.rememberedValue();
        if (z2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt.derivedStateOf(new a<InputPhase>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$labelTextStyleColor-1wkBAMs$$inlined$animateColor$1
                /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.material3.internal.InputPhase, java.lang.Object] */
                @Override // h.g.a.a
                public final InputPhase invoke() {
                    return transition.getTargetState();
                }
            });
            composer.updateRememberedValue(objRememberedValue2);
        }
        InputPhase inputPhase2 = (InputPhase) ((State) objRememberedValue2).getValue();
        composer.startReplaceGroup(-759924327);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-759924327, 0, -1, "androidx.compose.material3.internal.labelTextStyleColor.<anonymous> (TextFieldImpl.kt:462)");
        }
        int i7 = WhenMappings.$EnumSwitchMapping$1[inputPhase2.ordinal()];
        boolean z3 = true;
        long j6 = i7 == 1 ? j2 : j3;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        Color colorM8218boximpl2 = Color.m8218boximpl(j6);
        if ((i6 <= 4 || !composer.changed(transition)) && (i4 & 6) != 4) {
            z3 = false;
        }
        Object objRememberedValue3 = composer.rememberedValue();
        if (z3 || objRememberedValue3 == Composer.Companion.getEmpty()) {
            objRememberedValue3 = SnapshotStateKt.derivedStateOf(new a<Transition.Segment<InputPhase>>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$labelTextStyleColor-1wkBAMs$$inlined$animateColor$2
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // h.g.a.a
                public final Transition.Segment<InputPhase> invoke() {
                    return transition.getSegment();
                }
            });
            composer.updateRememberedValue(objRememberedValue3);
        }
        State<Color> stateCreateTransitionAnimation = TransitionKt.createTransitionAnimation(transition, colorM8218boximpl, colorM8218boximpl2, (FiniteAnimationSpec) qVar.invoke(((State) objRememberedValue3).getValue(), composer, 0), twoWayConverter, "LabelTextStyleColor", composer, i5 | 196608);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateCreateTransitionAnimation;
    }

    static final FiniteAnimationSpec labelTextStyleColor_1wkBAMs$lambda$0(FiniteAnimationSpec finiteAnimationSpec, Transition.Segment segment, Composer composer, int i2) {
        composer.startReplaceGroup(1730286052);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1730286052, i2, -1, "androidx.compose.material3.internal.labelTextStyleColor.<anonymous> (TextFieldImpl.kt:461)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return finiteAnimationSpec;
    }

    public static final float minimizedLabelHalfHeight(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1251545215, i2, -1, "androidx.compose.material3.internal.minimizedLabelHalfHeight (TextFieldImpl.kt:512)");
        }
        long jM10585getLineHeightXSAIIZE = MaterialTheme.INSTANCE.getTypography(composer, 6).getBodySmall().m10585getLineHeightXSAIIZE();
        long jM7191getBodySmallLineHeightXSAIIZE = TypeScaleTokens.INSTANCE.m7191getBodySmallLineHeightXSAIIZE();
        if (true != TextUnit.m11365isSpimpl(jM10585getLineHeightXSAIIZE)) {
            jM10585getLineHeightXSAIIZE = jM7191getBodySmallLineHeightXSAIIZE;
        }
        float f2 = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo2122toDpGaN1DYA(jM10585getLineHeightXSAIIZE) / 2.0f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return f2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b7, code lost:
    
        if (r11 == 2) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x011d, code lost:
    
        if (r3 == 2) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x018a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final androidx.compose.runtime.State<java.lang.Float> placeholderOpacity(final androidx.compose.animation.core.Transition<androidx.compose.material3.internal.InputPhase> r19, boolean r20, androidx.compose.runtime.Composer r21, int r22) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.TextFieldImplKt.placeholderOpacity(androidx.compose.animation.core.Transition, boolean, androidx.compose.runtime.Composer, int):androidx.compose.runtime.State");
    }

    static final FiniteAnimationSpec placeholderOpacity$lambda$0(FiniteAnimationSpec finiteAnimationSpec, FiniteAnimationSpec finiteAnimationSpec2, Transition.Segment segment, Composer composer, int i2) {
        composer.startReplaceGroup(-1370891590);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1370891590, i2, -1, "androidx.compose.material3.internal.placeholderOpacity.<anonymous> (TextFieldImpl.kt:420)");
        }
        if (!segment.isTransitioningTo(InputPhase.Focused, InputPhase.UnfocusedEmpty) && (segment.isTransitioningTo(InputPhase.UnfocusedEmpty, InputPhase.Focused) || segment.isTransitioningTo(InputPhase.UnfocusedNotEmpty, InputPhase.UnfocusedEmpty))) {
            finiteAnimationSpec = finiteAnimationSpec2;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return finiteAnimationSpec;
    }

    public static final Modifier textFieldBackground(Modifier modifier, final ColorProducer colorProducer, final Shape shape) {
        return DrawModifierKt.drawWithCache(modifier, new l() { // from class: androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda28
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return TextFieldImplKt.textFieldBackground$lambda$0(shape, colorProducer, (CacheDrawScope) obj);
            }
        });
    }

    static final DrawResult textFieldBackground$lambda$0(Shape shape, final ColorProducer colorProducer, CacheDrawScope cacheDrawScope) {
        final Outline outlineMo2037createOutlinePq9zytI = shape.mo2037createOutlinePq9zytI(cacheDrawScope.m7760getSizeNHjbRc(), cacheDrawScope.getLayoutDirection(), cacheDrawScope);
        return cacheDrawScope.onDrawBehind(new l() { // from class: androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda2
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return TextFieldImplKt.textFieldBackground$lambda$0$0(outlineMo2037createOutlinePq9zytI, colorProducer, (DrawScope) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab textFieldBackground$lambda$0$0(Outline outline, ColorProducer colorProducer, DrawScope drawScope) {
        OutlineKt.m8530drawOutlinewDX37Ww$default(drawScope, outline, colorProducer.mo4059invoke0d7_KjU(), 0.0f, null, null, 0, 60, null);
        return ab.f48028a;
    }

    public static final float textFieldHorizontalIconPadding(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1986450462, i2, -1, "androidx.compose.material3.internal.textFieldHorizontalIconPadding (TextFieldImpl.kt:505)");
        }
        float fM11178unboximpl = ((Dp) composer.consume(InteractiveComponentSizeKt.getLocalMinimumInteractiveComponentSize())).m11178unboximpl();
        if (true == Float.isNaN(fM11178unboximpl)) {
            fM11178unboximpl = 0.0f;
        }
        float fE = n.e((fM11178unboximpl - SmallIconButtonTokens.INSTANCE.m7082getIconSizeD9Ej5fM()) / 2.0f, 0.0f);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return fE;
    }

    public static final Modifier textFieldLabelMinHeight(Modifier modifier, final a<Dp> aVar) {
        return LayoutModifierKt.layout(modifier, new q() { // from class: androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda21
            @Override // h.g.a.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return TextFieldImplKt.textFieldLabelMinHeight$lambda$0(aVar, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
            }
        });
    }

    static final MeasureResult textFieldLabelMinHeight$lambda$0(a aVar, MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        float fM11178unboximpl = ((Dp) aVar.invoke()).m11178unboximpl();
        final Placeable placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(Constraints.m11097copyZbe2FdA$default(constraints.m11113unboximpl(), 0, 0, ConstraintsKt.m11123constrainHeightK40F9xA(constraints.m11113unboximpl(), !Dp.m11169equalsimpl0(fM11178unboximpl, Dp.Companion.m11184getUnspecifiedD9Ej5fM()) ? measureScope.mo2121roundToPx0680j_4(fM11178unboximpl) : 0), 0, 11, null));
        return MeasureScope.CC.layout$default(measureScope, placeableMo9741measureBRTryo0.getWidth(), placeableMo9741measureBRTryo0.getHeight(), null, new l() { // from class: androidx.compose.material3.internal.TextFieldImplKt$$ExternalSyntheticLambda27
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return TextFieldImplKt.textFieldLabelMinHeight$lambda$0$0(placeableMo9741measureBRTryo0, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab textFieldLabelMinHeight$lambda$0$0(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.place$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return ab.f48028a;
    }
}
