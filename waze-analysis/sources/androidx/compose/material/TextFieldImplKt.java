package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material.TextFieldImplKt;
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
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutIdParentData;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.media3.muxer.MuxerUtil;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.g.a.t;
import h.g.b.x;
import h.i;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextFieldImplKt {
    public static final int AnimationDuration = 150;
    private static final float HorizontalIconPadding = 12.0f;
    public static final String LabelId = "Label";
    public static final String LeadingId = "Leading";
    private static final int PlaceholderAnimationDelayOrDuration = 67;
    private static final int PlaceholderAnimationDuration = 83;
    public static final String PlaceholderId = "Hint";
    public static final String TextFieldId = "TextField";
    private static final float TextFieldPadding = 16.0f;
    public static final String TrailingId = "Trailing";

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3, reason: invalid class name */
    final class AnonymousClass3 implements t<Float, Color, Color, Float, Composer, Integer, ab> {
        final /* synthetic */ p<Composer, Integer, ab> $border;
        final /* synthetic */ TextFieldColors $colors;
        final /* synthetic */ PaddingValues $contentPadding;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ p<Composer, Integer, ab> $innerTextField;
        final /* synthetic */ InteractionSource $interactionSource;
        final /* synthetic */ boolean $isError;
        final /* synthetic */ p<Composer, Integer, ab> $label;
        final /* synthetic */ p<Composer, Integer, ab> $leadingIcon;
        final /* synthetic */ p<Composer, Integer, ab> $placeholder;
        final /* synthetic */ Shape $shape;
        final /* synthetic */ boolean $shouldOverrideTextStyleColor;
        final /* synthetic */ boolean $singleLine;
        final /* synthetic */ p<Composer, Integer, ab> $trailingIcon;
        final /* synthetic */ String $transformedText;
        final /* synthetic */ TextFieldType $type;

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$WhenMappings */
        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

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
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(p<? super Composer, ? super Integer, ab> pVar, p<? super Composer, ? super Integer, ab> pVar2, String str, TextFieldColors textFieldColors, boolean z, boolean z2, InteractionSource interactionSource, p<? super Composer, ? super Integer, ab> pVar3, p<? super Composer, ? super Integer, ab> pVar4, Shape shape, TextFieldType textFieldType, p<? super Composer, ? super Integer, ab> pVar5, boolean z3, PaddingValues paddingValues, boolean z4, p<? super Composer, ? super Integer, ab> pVar6) {
            this.$label = pVar;
            this.$placeholder = pVar2;
            this.$transformedText = str;
            this.$colors = textFieldColors;
            this.$enabled = z;
            this.$isError = z2;
            this.$interactionSource = interactionSource;
            this.$leadingIcon = pVar3;
            this.$trailingIcon = pVar4;
            this.$shape = shape;
            this.$type = textFieldType;
            this.$innerTextField = pVar5;
            this.$singleLine = z3;
            this.$contentPadding = paddingValues;
            this.$shouldOverrideTextStyleColor = z4;
            this.$border = pVar6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ab invoke_RIQooxk$lambda$0$0(float f2, long j2, p pVar, boolean z, long j3, Composer composer, int i2) {
            if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(723429411, i2, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:131)");
                }
                TextStyle textStyleLerp = TextStyleKt.lerp(MaterialTheme.INSTANCE.getTypography(composer, 6).getSubtitle1(), MaterialTheme.INSTANCE.getTypography(composer, 6).getCaption(), f2);
                if (z) {
                    textStyleLerp = TextStyle.m10559copyp1EtxEg$default(textStyleLerp, j3, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
                }
                TextFieldImplKt.m4265DecorationeuL9pac(j2, textStyleLerp, null, pVar, composer, 384, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer.skipToGroupEnd();
            }
            return ab.f48028a;
        }

        static final ab invoke_RIQooxk$lambda$1(float f2, TextFieldColors textFieldColors, boolean z, p pVar, Modifier modifier, Composer composer, int i2) {
            if ((i2 & 6) == 0) {
                i2 |= true != composer.changed(modifier) ? 2 : 4;
            }
            if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-426706263, i2, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:151)");
                }
                Modifier modifierAlpha = AlphaKt.alpha(modifier, f2);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierAlpha);
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
                p<ComposeUiNode, Integer, ab> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (composer.getInserting() || !x.n(composer.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    Integer numValueOf = Integer.valueOf(currentCompositeKeyHash);
                    composer.updateRememberedValue(numValueOf);
                    composer.apply(numValueOf, setCompositeKeyHash);
                }
                Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                TextFieldImplKt.m4265DecorationeuL9pac(textFieldColors.placeholderColor(z, composer, 0).getValue().m8238unboximpl(), MaterialTheme.INSTANCE.getTypography(composer, 6).getSubtitle1(), null, pVar, composer, 0, 4);
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
        public static final ab invoke_RIQooxk$lambda$2$0(long j2, p pVar, Composer composer, int i2) {
            if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-317090443, i2, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:164)");
                }
                TextFieldImplKt.m4265DecorationeuL9pac(j2, null, null, pVar, composer, 0, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer.skipToGroupEnd();
            }
            return ab.f48028a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ab invoke_RIQooxk$lambda$3$0(long j2, p pVar, Composer composer, int i2) {
            if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(262889693, i2, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:170)");
                }
                TextFieldImplKt.m4265DecorationeuL9pac(j2, null, null, pVar, composer, 0, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer.skipToGroupEnd();
            }
            return ab.f48028a;
        }

        static final ab invoke_RIQooxk$lambda$5(MutableState mutableState, PaddingValues paddingValues, p pVar, Composer composer, int i2) {
            if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1107746014, i2, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:193)");
                }
                Modifier modifierM4143outlineCutout12SF9DM = OutlinedTextFieldKt.m4143outlineCutout12SF9DM(LayoutIdKt.layoutId(Modifier.Companion, OutlinedTextFieldKt.BorderId), ((Size) mutableState.getValue()).m8054unboximpl(), paddingValues);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), true);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM4143outlineCutout12SF9DM);
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
                p<ComposeUiNode, Integer, ab> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (composer.getInserting() || !x.n(composer.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    Integer numValueOf = Integer.valueOf(currentCompositeKeyHash);
                    composer.updateRememberedValue(numValueOf);
                    composer.apply(numValueOf, setCompositeKeyHash);
                }
                Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                if (pVar == null) {
                    composer.startReplaceGroup(-1295979683);
                } else {
                    composer.startReplaceGroup(235288868);
                    pVar.invoke(composer, 0);
                }
                composer.endReplaceGroup();
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
        public static final ab invoke_RIQooxk$lambda$6$0(float f2, MutableState mutableState, Size size) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (size.m8054unboximpl() >> 32)) * f2;
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (size.m8054unboximpl() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) * f2;
            if (Float.intBitsToFloat((int) (((Size) mutableState.getValue()).m8054unboximpl() >> 32)) != fIntBitsToFloat || Float.intBitsToFloat((int) (((Size) mutableState.getValue()).m8054unboximpl() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) != fIntBitsToFloat2) {
                mutableState.setValue(Size.m8037boximpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE)));
            }
            return ab.f48028a;
        }

        @Override // h.g.a.t
        public /* bridge */ /* synthetic */ ab invoke(Float f2, Color color, Color color2, Float f3, Composer composer, Integer num) {
            m4266invokeRIQooxk(f2.floatValue(), color.m8238unboximpl(), color2.m8238unboximpl(), f3.floatValue(), composer, num.intValue());
            return ab.f48028a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v30, types: [h.g.a.q] */
        /* JADX WARN: Type inference failed for: r3v11, types: [h.g.a.q] */
        /* JADX WARN: Type inference failed for: r4v14, types: [h.g.a.p] */
        /* JADX WARN: Type inference failed for: r4v7, types: [h.g.a.p] */
        /* JADX WARN: Type inference failed for: r5v5 */
        /* JADX WARN: Type inference failed for: r5v6, types: [h.g.a.p] */
        /* JADX WARN: Type inference failed for: r5v7 */
        /* renamed from: invoke-RIQooxk, reason: not valid java name */
        public final void m4266invokeRIQooxk(float f2, long j2, final long j3, final float f3, Composer composer, int i2) {
            int i3;
            long j4;
            SnapshotMutationPolicy snapshotMutationPolicy;
            int i4;
            ComposableLambda composableLambda;
            Object obj;
            Object obj2;
            ?? r5;
            final float f4 = f2;
            if ((i2 & 6) == 0) {
                i3 = (true != composer.changed(f4) ? 2 : 4) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & 48) == 0) {
                j4 = j2;
                i3 |= true != composer.changed(j4) ? 16 : 32;
            } else {
                j4 = j2;
            }
            if ((i2 & 384) == 0) {
                i3 |= true != composer.changed(j3) ? 128 : 256;
            }
            if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
                i3 |= true != composer.changed(f3) ? 1024 : 2048;
            }
            int i5 = i3;
            if (!composer.shouldExecute((i5 & 9363) != 9362, i5 & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(33336375, i5, -1, "androidx.compose.material.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:128)");
            }
            final p<Composer, Integer, ab> pVar = this.$label;
            if (pVar == null) {
                composer.startReplaceGroup(986681709);
                composer.endReplaceGroup();
                i4 = 54;
                composableLambda = null;
                snapshotMutationPolicy = null;
            } else {
                composer.startReplaceGroup(986681710);
                final boolean z = this.$shouldOverrideTextStyleColor;
                snapshotMutationPolicy = null;
                i4 = 54;
                final long j5 = j4;
                p pVar2 = new p() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$$ExternalSyntheticLambda0
                    @Override // h.g.a.p
                    public final Object invoke(Object obj3, Object obj4) {
                        return TextFieldImplKt.AnonymousClass3.invoke_RIQooxk$lambda$0$0(f4, j3, pVar, z, j5, (Composer) obj3, ((Integer) obj4).intValue());
                    }
                };
                f4 = f4;
                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(723429411, true, pVar2, composer, 54);
                composer.endReplaceGroup();
                composableLambda = composableLambdaRememberComposableLambda;
            }
            if (this.$placeholder == null || this.$transformedText.length() != 0 || f3 <= 0.0f) {
                composer.startReplaceGroup(988093542);
                composer.endReplaceGroup();
                obj = snapshotMutationPolicy;
            } else {
                composer.startReplaceGroup(987666549);
                final TextFieldColors textFieldColors = this.$colors;
                final boolean z2 = this.$enabled;
                final p<Composer, Integer, ab> pVar3 = this.$placeholder;
                Object objRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-426706263, true, new q() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$$ExternalSyntheticLambda1
                    @Override // h.g.a.q
                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                        return TextFieldImplKt.AnonymousClass3.invoke_RIQooxk$lambda$1(f3, textFieldColors, z2, pVar3, (Modifier) obj3, (Composer) obj4, ((Integer) obj5).intValue());
                    }
                }, composer, i4);
                composer.endReplaceGroup();
                obj = objRememberComposableLambda;
            }
            final long jM8238unboximpl = this.$colors.leadingIconColor(this.$enabled, this.$isError, this.$interactionSource, composer, 0).getValue().m8238unboximpl();
            final p<Composer, Integer, ab> pVar4 = this.$leadingIcon;
            if (pVar4 == null) {
                composer.startReplaceGroup(988282301);
                composer.endReplaceGroup();
                obj2 = snapshotMutationPolicy;
            } else {
                composer.startReplaceGroup(988282302);
                Object objRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(-317090443, true, new p() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$$ExternalSyntheticLambda2
                    @Override // h.g.a.p
                    public final Object invoke(Object obj3, Object obj4) {
                        return TextFieldImplKt.AnonymousClass3.invoke_RIQooxk$lambda$2$0(jM8238unboximpl, pVar4, (Composer) obj3, ((Integer) obj4).intValue());
                    }
                }, composer, i4);
                composer.endReplaceGroup();
                obj2 = objRememberComposableLambda2;
            }
            final long jM8238unboximpl2 = this.$colors.trailingIconColor(this.$enabled, this.$isError, this.$interactionSource, composer, 0).getValue().m8238unboximpl();
            final p<Composer, Integer, ab> pVar5 = this.$trailingIcon;
            if (pVar5 == null) {
                composer.startReplaceGroup(988575964);
                composer.endReplaceGroup();
                r5 = snapshotMutationPolicy;
            } else {
                composer.startReplaceGroup(988575965);
                ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(262889693, true, new p() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$$ExternalSyntheticLambda3
                    @Override // h.g.a.p
                    public final Object invoke(Object obj3, Object obj4) {
                        return TextFieldImplKt.AnonymousClass3.invoke_RIQooxk$lambda$3$0(jM8238unboximpl2, pVar5, (Composer) obj3, ((Integer) obj4).intValue());
                    }
                }, composer, i4);
                composer.endReplaceGroup();
                r5 = composableLambdaRememberComposableLambda2;
            }
            Modifier modifierM1971backgroundbw27NRU = BackgroundKt.m1971backgroundbw27NRU(Modifier.Companion, this.$colors.backgroundColor(this.$enabled, composer, 0).getValue().m8238unboximpl(), this.$shape);
            TextFieldType textFieldType = this.$type;
            TextFieldType textFieldType2 = TextFieldType.Filled;
            int iOrdinal = textFieldType.ordinal();
            if (iOrdinal == 0) {
                composer.startReplaceGroup(988856360);
                TextFieldKt.TextFieldLayout(modifierM1971backgroundbw27NRU, this.$innerTextField, composableLambda, obj, obj2, r5, this.$singleLine, f2, this.$contentPadding, composer, 29360128 & (i5 << 21));
                composer.endReplaceGroup();
            } else {
                if (iOrdinal != 1) {
                    composer.startReplaceGroup(1971561250);
                    composer.endReplaceGroup();
                    throw new i();
                }
                int i6 = (i5 << 21) & 29360128;
                composer.startReplaceGroup(989436742);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m8037boximpl(Size.Companion.m8058getZeroNHjbRc()), snapshotMutationPolicy, 2, snapshotMutationPolicy);
                    composer.updateRememberedValue(objRememberedValue);
                }
                final PaddingValues paddingValues = this.$contentPadding;
                final p<Composer, Integer, ab> pVar6 = this.$border;
                final MutableState mutableState = (MutableState) objRememberedValue;
                ComposableLambda composableLambdaRememberComposableLambda3 = ComposableLambdaKt.rememberComposableLambda(-1107746014, true, new p() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$$ExternalSyntheticLambda4
                    @Override // h.g.a.p
                    public final Object invoke(Object obj3, Object obj4) {
                        return TextFieldImplKt.AnonymousClass3.invoke_RIQooxk$lambda$5(mutableState, paddingValues, pVar6, (Composer) obj3, ((Integer) obj4).intValue());
                    }
                }, composer, i4);
                p<Composer, Integer, ab> pVar7 = this.$innerTextField;
                boolean z3 = this.$singleLine;
                int i7 = i5 & 14;
                Object objRememberedValue2 = composer.rememberedValue();
                if (i7 == 4 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new l() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$$ExternalSyntheticLambda5
                        @Override // h.g.a.l
                        public final Object invoke(Object obj3) {
                            return TextFieldImplKt.AnonymousClass3.invoke_RIQooxk$lambda$6$0(f4, mutableState, (Size) obj3);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                int i8 = i6 | 805306368;
                OutlinedTextFieldKt.OutlinedTextFieldLayout(modifierM1971backgroundbw27NRU, pVar7, obj, composableLambda, obj2, r5, z3, f4, (l) objRememberedValue2, composableLambdaRememberComposableLambda3, this.$contentPadding, composer, i8, 0);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public static final void CommonDecorationBox(final TextFieldType textFieldType, final String str, final p<? super Composer, ? super Integer, ab> pVar, final VisualTransformation visualTransformation, final p<? super Composer, ? super Integer, ab> pVar2, final p<? super Composer, ? super Integer, ab> pVar3, final p<? super Composer, ? super Integer, ab> pVar4, final p<? super Composer, ? super Integer, ab> pVar5, final boolean z, final boolean z2, final boolean z3, final InteractionSource interactionSource, final PaddingValues paddingValues, final Shape shape, final TextFieldColors textFieldColors, final p<? super Composer, ? super Integer, ab> pVar6, Composer composer, final int i2, final int i3) {
        int i4;
        p<? super Composer, ? super Integer, ab> pVar7;
        int i5;
        p<? super Composer, ? super Integer, ab> pVar8;
        p<? super Composer, ? super Integer, ab> pVar9;
        p<? super Composer, ? super Integer, ab> pVar10;
        int i6;
        PaddingValues paddingValues2;
        int i7;
        boolean z4;
        Composer composer2;
        InputPhase inputPhase;
        TextFieldTransitionScope textFieldTransitionScope;
        long j2;
        InputPhase inputPhase2;
        long jM8238unboximpl;
        int i8 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(418608794);
        if (i8 == 0) {
            i4 = (true != composerStartRestartGroup.changed(textFieldType.ordinal()) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changed(str) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            pVar7 = pVar;
            i4 |= true != composerStartRestartGroup.changedInstance(pVar7) ? 128 : 256;
        } else {
            pVar7 = pVar;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i4 |= true != composerStartRestartGroup.changed(visualTransformation) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(pVar2) ? 8192 : 16384;
        }
        if ((i2 & 196608) == 0) {
            i5 = 196608;
            pVar8 = pVar3;
            i4 |= true != composerStartRestartGroup.changedInstance(pVar8) ? 65536 : 131072;
        } else {
            i5 = 196608;
            pVar8 = pVar3;
        }
        if ((1572864 & i2) == 0) {
            pVar9 = pVar4;
            i4 |= true != composerStartRestartGroup.changedInstance(pVar9) ? 524288 : 1048576;
        } else {
            pVar9 = pVar4;
        }
        if ((12582912 & i2) == 0) {
            pVar10 = pVar5;
            i4 |= true != composerStartRestartGroup.changedInstance(pVar10) ? 4194304 : 8388608;
        } else {
            pVar10 = pVar5;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= true != composerStartRestartGroup.changed(z) ? GroupFlagsKt.HasAuxSlotFlag : 67108864;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= true != composerStartRestartGroup.changed(z2) ? 268435456 : 536870912;
        }
        if ((i3 & 6) == 0) {
            i6 = (true != composerStartRestartGroup.changed(z3) ? 2 : 4) | i3;
        } else {
            i6 = i3;
        }
        int i9 = i6;
        if ((i3 & 48) == 0) {
            i6 = i9 | (true == composerStartRestartGroup.changed(interactionSource) ? 32 : 16);
        }
        if ((i3 & 384) == 0) {
            paddingValues2 = paddingValues;
            i6 |= true == composerStartRestartGroup.changed(paddingValues2) ? 256 : 128;
        } else {
            paddingValues2 = paddingValues;
        }
        if ((i3 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i6 |= true == composerStartRestartGroup.changed(shape) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            int i10 = i6;
            z4 = true;
            i7 = i10 | (true == composerStartRestartGroup.changed(textFieldColors) ? 16384 : 8192);
        } else {
            i7 = i6;
            z4 = true;
        }
        if ((i3 & i5) == 0) {
            i7 |= z4 == composerStartRestartGroup.changedInstance(pVar6) ? 131072 : 65536;
        }
        int i11 = i7;
        if (composerStartRestartGroup.shouldExecute(((i4 & 306783379) == 306783378 && (74899 & i11) == 74898) ? false : true, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(418608794, i4, i11, "androidx.compose.material.CommonDecorationBox (TextFieldImpl.kt:78)");
            }
            boolean z5 = (i4 & 112) == 32;
            boolean z6 = (i4 & 7168) == 2048;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((z5 | z6) || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = visualTransformation.filter(new AnnotatedString(str, null, 2, null));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            String text = ((TransformedText) objRememberedValue).getText().getText();
            InputPhase inputPhase3 = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composerStartRestartGroup, (i11 >> 3) & 14).getValue().booleanValue() ? InputPhase.Focused : text.length() == 0 ? InputPhase.UnfocusedEmpty : InputPhase.UnfocusedNotEmpty;
            q<InputPhase, Composer, Integer, Color> qVar = new q<InputPhase, Composer, Integer, Color>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$labelColor$1
                @Override // h.g.a.q
                public /* bridge */ /* synthetic */ Color invoke(InputPhase inputPhase4, Composer composer3, Integer num) {
                    return Color.m8218boximpl(m4267invokeXeAY9LY(inputPhase4, composer3, num.intValue()));
                }

                /* renamed from: invoke-XeAY9LY, reason: not valid java name */
                public final long m4267invokeXeAY9LY(InputPhase inputPhase4, Composer composer3, int i12) {
                    composer3.startReplaceGroup(1423138213);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1423138213, i12, -1, "androidx.compose.material.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:95)");
                    }
                    long jM8238unboximpl2 = textFieldColors.labelColor(z2, inputPhase4 == InputPhase.UnfocusedEmpty ? false : z3, interactionSource, composer3, 0).getValue().m8238unboximpl();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer3.endReplaceGroup();
                    return jM8238unboximpl2;
                }
            };
            Typography typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
            TextStyle subtitle1 = typography.getSubtitle1();
            TextStyle caption = typography.getCaption();
            InputPhase inputPhase4 = inputPhase3;
            boolean z7 = (Color.m8229equalsimpl0(subtitle1.m10576getColor0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU()) && !Color.m8229equalsimpl0(caption.m10576getColor0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU())) || (!Color.m8229equalsimpl0(subtitle1.m10576getColor0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU()) && Color.m8229equalsimpl0(caption.m10576getColor0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU()));
            TextFieldTransitionScope textFieldTransitionScope2 = TextFieldTransitionScope.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1443813555);
            long jM10576getColor0d7_KjU = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getCaption().m10576getColor0d7_KjU();
            if (z7) {
                composerStartRestartGroup.startReplaceGroup(-887928539);
                if (jM10576getColor0d7_KjU != 16) {
                    inputPhase2 = inputPhase4;
                    jM8238unboximpl = jM10576getColor0d7_KjU;
                } else {
                    inputPhase2 = inputPhase4;
                    jM8238unboximpl = qVar.invoke(inputPhase2, composerStartRestartGroup, 0).m8238unboximpl();
                }
                composerStartRestartGroup.endReplaceGroup();
                inputPhase = inputPhase2;
                j2 = jM8238unboximpl;
                textFieldTransitionScope = textFieldTransitionScope2;
            } else {
                inputPhase = inputPhase4;
                textFieldTransitionScope = textFieldTransitionScope2;
                composerStartRestartGroup.startReplaceGroup(1218284988);
                composerStartRestartGroup.endReplaceGroup();
                j2 = jM10576getColor0d7_KjU;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1443806289);
            long jM10576getColor0d7_KjU2 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getSubtitle1().m10576getColor0d7_KjU();
            if (z7) {
                composerStartRestartGroup.startReplaceGroup(-1026713946);
                if (jM10576getColor0d7_KjU2 == 16) {
                    jM10576getColor0d7_KjU2 = qVar.invoke(inputPhase, composerStartRestartGroup, 0).m8238unboximpl();
                }
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(798166043);
                composerStartRestartGroup.endReplaceGroup();
            }
            long j3 = jM10576getColor0d7_KjU2;
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            textFieldTransitionScope.m4272TransitionDTcfvLk(inputPhase, j2, j3, qVar, pVar2 != null, ComposableLambdaKt.rememberComposableLambda(33336375, true, new AnonymousClass3(pVar2, pVar8, text, textFieldColors, z2, z3, interactionSource, pVar9, pVar10, shape, textFieldType, pVar7, z, paddingValues2, z7, pVar6), composerStartRestartGroup, 54), composer2, 1769472);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material.TextFieldImplKt$$ExternalSyntheticLambda1
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return TextFieldImplKt.CommonDecorationBox$lambda$3(textFieldType, str, pVar, visualTransformation, pVar2, pVar3, pVar4, pVar5, z, z2, z3, interactionSource, paddingValues, shape, textFieldColors, pVar6, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab CommonDecorationBox$lambda$3(TextFieldType textFieldType, String str, p pVar, VisualTransformation visualTransformation, p pVar2, p pVar3, p pVar4, p pVar5, boolean z, boolean z2, boolean z3, InteractionSource interactionSource, PaddingValues paddingValues, Shape shape, TextFieldColors textFieldColors, p pVar6, int i2, int i3, Composer composer, int i4) {
        CommonDecorationBox(textFieldType, str, pVar, visualTransformation, pVar2, pVar3, pVar4, pVar5, z, z2, z3, interactionSource, paddingValues, shape, textFieldColors, pVar6, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3));
        return ab.f48028a;
    }

    /* renamed from: Decoration-euL9pac, reason: not valid java name */
    public static final void m4265DecorationeuL9pac(final long j2, TextStyle textStyle, Float f2, final p<? super Composer, ? super Integer, ab> pVar, Composer composer, final int i2, final int i3) {
        int i4;
        final TextStyle textStyle2;
        final Float f3;
        int i5 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(2064632657);
        if (i5 == 0) {
            i4 = (true != composerStartRestartGroup.changed(j2) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changed(textStyle) ? 16 : 32;
        }
        int i7 = i3 & 4;
        if (i7 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= true != composerStartRestartGroup.changed(f2) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(pVar) ? 1024 : 2048;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & DisplayStrings.DS_DONT_SHOW_AGAIN) != 1170, i4 & 1)) {
            TextStyle textStyle3 = i6 != 0 ? null : textStyle;
            final Float f4 = i7 != 0 ? null : f2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2064632657, i4, -1, "androidx.compose.material.Decoration (TextFieldImpl.kt:236)");
            }
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-650790565, true, new p() { // from class: androidx.compose.material.TextFieldImplKt$$ExternalSyntheticLambda3
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return TextFieldImplKt.Decoration_euL9pac$lambda$0(j2, f4, pVar, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54);
            if (textStyle3 != null) {
                composerStartRestartGroup.startReplaceGroup(-162880673);
                TextKt.ProvideTextStyle(textStyle3, composableLambdaRememberComposableLambda, composerStartRestartGroup, ((i4 >> 3) & 14) | 48);
            } else {
                composerStartRestartGroup.startReplaceGroup(-162879037);
                composableLambdaRememberComposableLambda.invoke(composerStartRestartGroup, 6);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            textStyle2 = textStyle3;
            f3 = f4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            textStyle2 = textStyle;
            f3 = f2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material.TextFieldImplKt$$ExternalSyntheticLambda4
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return TextFieldImplKt.Decoration_euL9pac$lambda$1(j2, textStyle2, f3, pVar, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab Decoration_euL9pac$lambda$0(final long j2, final Float f2, final p pVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-650790565, i2, -1, "androidx.compose.material.Decoration.<anonymous> (TextFieldImpl.kt:239)");
            }
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m8218boximpl(j2)), ComposableLambdaKt.rememberComposableLambda(-1624601445, true, new p() { // from class: androidx.compose.material.TextFieldImplKt$$ExternalSyntheticLambda2
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return TextFieldImplKt.Decoration_euL9pac$lambda$0$0(f2, pVar, j2, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab Decoration_euL9pac$lambda$0$0(Float f2, p pVar, long j2, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1624601445, i2, -1, "androidx.compose.material.Decoration.<anonymous>.<anonymous> (TextFieldImpl.kt:240)");
            }
            if (f2 != null) {
                composer.startReplaceGroup(1484860324);
                CompositionLocalKt.CompositionLocalProvider(ContentAlphaKt.getLocalContentAlpha().provides(f2), (p<? super Composer, ? super Integer, ab>) pVar, composer, ProvidedValue.$stable);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1485059902);
                CompositionLocalKt.CompositionLocalProvider(ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m8230getAlphaimpl(j2))), (p<? super Composer, ? super Integer, ab>) pVar, composer, ProvidedValue.$stable);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab Decoration_euL9pac$lambda$1(long j2, TextStyle textStyle, Float f2, p pVar, int i2, int i3, Composer composer, int i4) {
        m4265DecorationeuL9pac(j2, textStyle, f2, pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    public static final Modifier defaultErrorSemantics(Modifier modifier, boolean z, final String str) {
        return z ? SemanticsModifierKt.semantics(modifier, 1 == ((false ? 1 : 0) & ((1 & 1) ^ 1)), new l() { // from class: androidx.compose.material.TextFieldImplKt$$ExternalSyntheticLambda0
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

    public static final float getHorizontalIconPadding() {
        return HorizontalIconPadding;
    }

    public static final Object getLayoutId(IntrinsicMeasurable intrinsicMeasurable) {
        Object parentData = intrinsicMeasurable.getParentData();
        LayoutIdParentData layoutIdParentData = parentData instanceof LayoutIdParentData ? (LayoutIdParentData) parentData : null;
        if (layoutIdParentData != null) {
            return layoutIdParentData.getLayoutId();
        }
        return null;
    }

    public static final float getTextFieldPadding() {
        return TextFieldPadding;
    }

    public static final int heightOrZero(Placeable placeable) {
        if (placeable != null) {
            return placeable.getHeight();
        }
        return 0;
    }

    public static final int widthOrZero(Placeable placeable) {
        if (placeable != null) {
            return placeable.getWidth();
        }
        return 0;
    }
}
