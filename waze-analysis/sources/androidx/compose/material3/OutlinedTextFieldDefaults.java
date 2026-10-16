package androidx.compose.material3;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.style.Style;
import androidx.compose.foundation.style.StyleScope;
import androidx.compose.foundation.style.StyleStateKt;
import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextFieldStateKt;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.OutlinedTextFieldDefaults;
import androidx.compose.material3.TextFieldLabelPosition;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.material3.internal.TextFieldType;
import androidx.compose.material3.tokens.OutlinedTextFieldTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.input.VisualTransformation;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.g.a.p;
import h.g.a.q;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class OutlinedTextFieldDefaults {
    public static final int $stable = 0;
    public static final OutlinedTextFieldDefaults INSTANCE = new OutlinedTextFieldDefaults();
    private static final float MinHeight = 56.0f;
    private static final float MinWidth = 280.0f;
    private static final float UnfocusedBorderThickness = 1.0f;
    private static final float FocusedBorderThickness = 2.0f;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material3.OutlinedTextFieldDefaults$decorator$2, reason: invalid class name */
    final class AnonymousClass2 implements TextFieldDecorator {
        final /* synthetic */ TextFieldColors $colors;
        final /* synthetic */ p<Composer, Integer, ab> $container;
        final /* synthetic */ PaddingValues $contentPadding;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ InteractionSource $interactionSource;
        final /* synthetic */ boolean $isError;
        final /* synthetic */ q<TextFieldLabelScope, Composer, Integer, ab> $label;
        final /* synthetic */ TextFieldLabelPosition $labelPosition;
        final /* synthetic */ p<Composer, Integer, ab> $leadingIcon;
        final /* synthetic */ TextFieldLineLimits $lineLimits;
        final /* synthetic */ OutputTransformation $outputTransformation;
        final /* synthetic */ p<Composer, Integer, ab> $placeholder;
        final /* synthetic */ p<Composer, Integer, ab> $prefix;
        final /* synthetic */ TextFieldState $state;
        final /* synthetic */ p<Composer, Integer, ab> $suffix;
        final /* synthetic */ p<Composer, Integer, ab> $supportingText;
        final /* synthetic */ p<Composer, Integer, ab> $trailingIcon;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(OutputTransformation outputTransformation, TextFieldState textFieldState, TextFieldLineLimits textFieldLineLimits, TextFieldLabelPosition textFieldLabelPosition, q<? super TextFieldLabelScope, ? super Composer, ? super Integer, ab> qVar, p<? super Composer, ? super Integer, ab> pVar, p<? super Composer, ? super Integer, ab> pVar2, p<? super Composer, ? super Integer, ab> pVar3, p<? super Composer, ? super Integer, ab> pVar4, p<? super Composer, ? super Integer, ab> pVar5, p<? super Composer, ? super Integer, ab> pVar6, boolean z, boolean z2, InteractionSource interactionSource, PaddingValues paddingValues, TextFieldColors textFieldColors, p<? super Composer, ? super Integer, ab> pVar7) {
            this.$outputTransformation = outputTransformation;
            this.$state = textFieldState;
            this.$lineLimits = textFieldLineLimits;
            this.$labelPosition = textFieldLabelPosition;
            this.$label = qVar;
            this.$placeholder = pVar;
            this.$leadingIcon = pVar2;
            this.$trailingIcon = pVar3;
            this.$prefix = pVar4;
            this.$suffix = pVar5;
            this.$supportingText = pVar6;
            this.$enabled = z;
            this.$isError = z2;
            this.$interactionSource = interactionSource;
            this.$contentPadding = paddingValues;
            this.$colors = textFieldColors;
            this.$container = pVar7;
        }

        static final ab Decoration$lambda$1(AnonymousClass2 anonymousClass2, p pVar, int i2, Composer composer, int i3) {
            anonymousClass2.Decoration(pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
            return ab.f48028a;
        }

        @Override // androidx.compose.foundation.text.input.TextFieldDecorator
        public final void Decoration(final p<? super Composer, ? super Integer, ab> pVar, Composer composer, final int i2) {
            int i3;
            Composer composer2;
            CharSequence charSequenceAsCharSequence;
            int i4 = i2 & 6;
            Composer composerStartRestartGroup = composer.startRestartGroup(794272399);
            if (i4 == 0) {
                i3 = i2 | (true != composerStartRestartGroup.changedInstance(pVar) ? 2 : 4);
            } else {
                i3 = i2;
            }
            if ((i2 & 48) == 0) {
                i3 |= true != composerStartRestartGroup.changed(this) ? 16 : 32;
            }
            if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(794272399, i3, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.decorator.<no name provided>.Decoration (TextFieldDefaults.kt:973)");
                }
                OutputTransformation outputTransformation = this.$outputTransformation;
                TextFieldState textFieldState = this.$state;
                if (outputTransformation == null) {
                    charSequenceAsCharSequence = textFieldState.getText();
                } else {
                    TextFieldBuffer textFieldBuffer = TextFieldStateKt.toTextFieldBuffer(textFieldState);
                    outputTransformation.transformOutput(textFieldBuffer);
                    charSequenceAsCharSequence = textFieldBuffer.asCharSequence();
                }
                composer2 = composerStartRestartGroup;
                TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, charSequenceAsCharSequence, pVar, this.$labelPosition, this.$label, this.$placeholder, this.$leadingIcon, this.$trailingIcon, this.$prefix, this.$suffix, this.$supportingText, x.n(this.$lineLimits, TextFieldLineLimits.SingleLine.INSTANCE), this.$enabled, this.$isError, this.$interactionSource, this.$contentPadding, this.$colors, this.$container, composer2, ((i3 << 6) & DisplayStrings.DS_TAP_TO_VERIFY) | 6, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$decorator$2$$ExternalSyntheticLambda0
                    @Override // h.g.a.p
                    public final Object invoke(Object obj, Object obj2) {
                        return OutlinedTextFieldDefaults.AnonymousClass2.Decoration$lambda$1(this.f$0, pVar, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
    }

    private OutlinedTextFieldDefaults() {
    }

    static final ab ContainerBox_nbWgWpA$lambda$0(OutlinedTextFieldDefaults outlinedTextFieldDefaults, boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, Shape shape, float f2, float f3, int i2, int i3, Composer composer, int i4) {
        outlinedTextFieldDefaults.m5347ContainerBoxnbWgWpA(z, z2, interactionSource, textFieldColors, shape, f2, f3, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Container_4EFweAY$lambda$1$0(Shape shape, final TextFieldColors textFieldColors, final boolean z, final boolean z2, float f2, final FiniteAnimationSpec finiteAnimationSpec, final float f3, StyleScope styleScope) {
        styleScope.shape(shape);
        styleScope.mo3089background8_81llA(textFieldColors.m5730containerColorXeAY9LY(z, z2, false));
        styleScope.mo3092bordercXLIe8U(f2, textFieldColors.m5775indicatorColorXeAY9LY(z, z2, false));
        StyleStateKt.focused(styleScope, new Style() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$$ExternalSyntheticLambda5
            @Override // androidx.compose.foundation.style.Style
            public final void applyStyle(StyleScope styleScope2) {
                OutlinedTextFieldDefaults.Container_4EFweAY$lambda$1$0$0(finiteAnimationSpec, textFieldColors, z, z2, f3, styleScope2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Container_4EFweAY$lambda$1$0$0(FiniteAnimationSpec finiteAnimationSpec, final TextFieldColors textFieldColors, final boolean z, final boolean z2, final float f2, StyleScope styleScope) {
        styleScope.animate(finiteAnimationSpec, new Style() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$$ExternalSyntheticLambda8
            @Override // androidx.compose.foundation.style.Style
            public final void applyStyle(StyleScope styleScope2) {
                OutlinedTextFieldDefaults.Container_4EFweAY$lambda$1$0$0$0(textFieldColors, z, z2, f2, styleScope2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Container_4EFweAY$lambda$1$0$0$0(TextFieldColors textFieldColors, boolean z, boolean z2, float f2, StyleScope styleScope) {
        styleScope.mo3089background8_81llA(textFieldColors.m5730containerColorXeAY9LY(z, z2, true));
        styleScope.mo3092bordercXLIe8U(f2, textFieldColors.m5775indicatorColorXeAY9LY(z, z2, true));
    }

    static final ab Container_4EFweAY$lambda$2(OutlinedTextFieldDefaults outlinedTextFieldDefaults, boolean z, boolean z2, InteractionSource interactionSource, Modifier modifier, TextFieldColors textFieldColors, Shape shape, float f2, float f3, int i2, int i3, Composer composer, int i4) {
        outlinedTextFieldDefaults.m5346Container4EFweAY(z, z2, interactionSource, modifier, textFieldColors, shape, f2, f3, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    static final ab DecorationBox$lambda$0(boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-896270173, i2, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1130)");
            }
            OutlinedTextFieldDefaults outlinedTextFieldDefaults = INSTANCE;
            outlinedTextFieldDefaults.m5346Container4EFweAY(z, z2, interactionSource, Modifier.Companion, textFieldColors, outlinedTextFieldDefaults.getShape(composer, 6), FocusedBorderThickness, UnfocusedBorderThickness, composer, 114822144, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab DecorationBox$lambda$2$0(p pVar, TextFieldLabelScope textFieldLabelScope, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 17) != 16, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1459717586, i2, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous>.<anonymous> (TextFieldDefaults.kt:1155)");
            }
            pVar.invoke(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab DecorationBox$lambda$3(OutlinedTextFieldDefaults outlinedTextFieldDefaults, String str, p pVar, boolean z, boolean z2, VisualTransformation visualTransformation, InteractionSource interactionSource, boolean z3, p pVar2, p pVar3, p pVar4, p pVar5, p pVar6, p pVar7, p pVar8, TextFieldColors textFieldColors, PaddingValues paddingValues, p pVar9, int i2, int i3, int i4, Composer composer, int i5) {
        outlinedTextFieldDefaults.DecorationBox(str, pVar, z, z2, visualTransformation, interactionSource, z3, pVar2, pVar3, pVar4, pVar5, pVar6, pVar7, pVar8, textFieldColors, paddingValues, pVar9, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    /* renamed from: contentPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m5345contentPaddinga9UjIt4$default(OutlinedTextFieldDefaults outlinedTextFieldDefaults, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i2 & 2) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i2 & 4) != 0) {
            f4 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i2 & 8) != 0) {
            f5 = TextFieldImplKt.getTextFieldPadding();
        }
        return outlinedTextFieldDefaults.m5349contentPaddinga9UjIt4(f2, f3, f4, f5);
    }

    static final ab decorator$lambda$0(boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-163468598, i2, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.decorator.<anonymous> (TextFieldDefaults.kt:962)");
            }
            OutlinedTextFieldDefaults outlinedTextFieldDefaults = INSTANCE;
            outlinedTextFieldDefaults.m5346Container4EFweAY(z, z2, interactionSource, null, textFieldColors, outlinedTextFieldDefaults.getShape(composer, 6), FocusedBorderThickness, UnfocusedBorderThickness, composer, 114819072, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:183:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0103  */
    /* renamed from: Container-4EFweAY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m5346Container4EFweAY(final boolean r30, final boolean r31, final androidx.compose.foundation.interaction.InteractionSource r32, androidx.compose.ui.Modifier r33, androidx.compose.material3.TextFieldColors r34, androidx.compose.ui.graphics.Shape r35, float r36, float r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.OutlinedTextFieldDefaults.m5346Container4EFweAY(boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.ui.Modifier, androidx.compose.material3.TextFieldColors, androidx.compose.ui.graphics.Shape, float, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0183  */
    /* renamed from: ContainerBox-nbWgWpA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m5347ContainerBoxnbWgWpA(final boolean r22, final boolean r23, final androidx.compose.foundation.interaction.InteractionSource r24, androidx.compose.material3.TextFieldColors r25, androidx.compose.ui.graphics.Shape r26, float r27, float r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.OutlinedTextFieldDefaults.m5347ContainerBoxnbWgWpA(boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.material3.TextFieldColors, androidx.compose.ui.graphics.Shape, float, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:260:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DecorationBox(final java.lang.String r36, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r37, final boolean r38, final boolean r39, final androidx.compose.ui.text.input.VisualTransformation r40, final androidx.compose.foundation.interaction.InteractionSource r41, boolean r42, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r43, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r44, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r45, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r46, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r47, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r48, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r49, androidx.compose.material3.TextFieldColors r50, androidx.compose.foundation.layout.PaddingValues r51, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r52, androidx.compose.runtime.Composer r53, final int r54, final int r55, final int r56) {
        /*
            Method dump skipped, instructions count: 1145
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox(java.lang.String, h.g.a.p, boolean, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.InteractionSource, boolean, h.g.a.p, h.g.a.p, h.g.a.p, h.g.a.p, h.g.a.p, h.g.a.p, h.g.a.p, androidx.compose.material3.TextFieldColors, androidx.compose.foundation.layout.PaddingValues, h.g.a.p, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public final TextFieldColors colors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-471651810, i2, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.colors (TextFieldDefaults.kt:1188)");
        }
        TextFieldColors defaultOutlinedTextFieldColors = getDefaultOutlinedTextFieldColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6), composer, (i2 << 3) & 112);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultOutlinedTextFieldColors;
    }

    /* renamed from: colors-0hiis_0, reason: not valid java name */
    public final TextFieldColors m5348colors0hiis_0(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, TextSelectionColors textSelectionColors, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, Composer composer, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        long j44;
        TextSelectionColors textSelectionColors2;
        long jM8264getUnspecified0d7_KjU = (i7 & 1) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j2;
        long jM8264getUnspecified0d7_KjU2 = (i7 & 2) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j3;
        long jM8264getUnspecified0d7_KjU3 = (i7 & 4) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j4;
        long jM8264getUnspecified0d7_KjU4 = (i7 & 8) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j5;
        long jM8264getUnspecified0d7_KjU5 = (i7 & 16) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j6;
        long jM8264getUnspecified0d7_KjU6 = (i7 & 32) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j7;
        long jM8264getUnspecified0d7_KjU7 = (i7 & 64) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j8;
        long j45 = jM8264getUnspecified0d7_KjU;
        long jM8264getUnspecified0d7_KjU8 = (i7 & 128) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j9;
        long jM8264getUnspecified0d7_KjU9 = (i7 & 256) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j10;
        long jM8264getUnspecified0d7_KjU10 = (i7 & 512) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j11;
        TextSelectionColors textSelectionColors3 = (i7 & 1024) != 0 ? null : textSelectionColors;
        long jM8264getUnspecified0d7_KjU11 = (i7 & 2048) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j12;
        long jM8264getUnspecified0d7_KjU12 = (i7 & 4096) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j13;
        long jM8264getUnspecified0d7_KjU13 = (i7 & 8192) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j14;
        long jM8264getUnspecified0d7_KjU14 = (i7 & 16384) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j15;
        long jM8264getUnspecified0d7_KjU15 = (32768 & i7) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j16;
        long jM8264getUnspecified0d7_KjU16 = (65536 & i7) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j17;
        long jM8264getUnspecified0d7_KjU17 = (131072 & i7) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j18;
        long jM8264getUnspecified0d7_KjU18 = (262144 & i7) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j19;
        long jM8264getUnspecified0d7_KjU19 = (524288 & i7) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j20;
        long jM8264getUnspecified0d7_KjU20 = (1048576 & i7) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j21;
        long jM8264getUnspecified0d7_KjU21 = (2097152 & i7) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j22;
        long jM8264getUnspecified0d7_KjU22 = (4194304 & i7) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j23;
        long jM8264getUnspecified0d7_KjU23 = (8388608 & i7) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j24;
        long jM8264getUnspecified0d7_KjU24 = (16777216 & i7) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j25;
        long jM8264getUnspecified0d7_KjU25 = (33554432 & i7) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j26;
        long jM8264getUnspecified0d7_KjU26 = (67108864 & i7) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j27;
        long jM8264getUnspecified0d7_KjU27 = (134217728 & i7) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j28;
        long jM8264getUnspecified0d7_KjU28 = (268435456 & i7) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j29;
        long jM8264getUnspecified0d7_KjU29 = (536870912 & i7) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j30;
        long jM8264getUnspecified0d7_KjU30 = (i7 & 1073741824) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j31;
        long jM8264getUnspecified0d7_KjU31 = (i8 & 1) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j32;
        long jM8264getUnspecified0d7_KjU32 = (i8 & 2) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j33;
        long jM8264getUnspecified0d7_KjU33 = (i8 & 4) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j34;
        long jM8264getUnspecified0d7_KjU34 = (i8 & 8) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j35;
        long jM8264getUnspecified0d7_KjU35 = (i8 & 16) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j36;
        long jM8264getUnspecified0d7_KjU36 = (i8 & 32) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j37;
        long jM8264getUnspecified0d7_KjU37 = (i8 & 64) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j38;
        long jM8264getUnspecified0d7_KjU38 = (i8 & 128) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j39;
        long jM8264getUnspecified0d7_KjU39 = (i8 & 256) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j40;
        long jM8264getUnspecified0d7_KjU40 = (i8 & 512) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j41;
        long jM8264getUnspecified0d7_KjU41 = (i8 & 1024) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j42;
        long jM8264getUnspecified0d7_KjU42 = (i8 & 2048) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j43;
        if (ComposerKt.isTraceInProgress()) {
            j44 = jM8264getUnspecified0d7_KjU42;
            textSelectionColors2 = textSelectionColors3;
            ComposerKt.traceEventStart(1767617725, i2, i3, "androidx.compose.material3.OutlinedTextFieldDefaults.colors (TextFieldDefaults.kt:1290)");
        } else {
            j44 = jM8264getUnspecified0d7_KjU42;
            textSelectionColors2 = textSelectionColors3;
        }
        TextFieldColors textFieldColorsM5731copyejIjP34 = getDefaultOutlinedTextFieldColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6), composer, (i6 >> 6) & 112).m5731copyejIjP34(j45, jM8264getUnspecified0d7_KjU2, jM8264getUnspecified0d7_KjU3, jM8264getUnspecified0d7_KjU4, jM8264getUnspecified0d7_KjU5, jM8264getUnspecified0d7_KjU6, jM8264getUnspecified0d7_KjU7, jM8264getUnspecified0d7_KjU8, jM8264getUnspecified0d7_KjU9, jM8264getUnspecified0d7_KjU10, textSelectionColors2, jM8264getUnspecified0d7_KjU11, jM8264getUnspecified0d7_KjU12, jM8264getUnspecified0d7_KjU13, jM8264getUnspecified0d7_KjU14, jM8264getUnspecified0d7_KjU15, jM8264getUnspecified0d7_KjU16, jM8264getUnspecified0d7_KjU17, jM8264getUnspecified0d7_KjU18, jM8264getUnspecified0d7_KjU19, jM8264getUnspecified0d7_KjU20, jM8264getUnspecified0d7_KjU21, jM8264getUnspecified0d7_KjU22, jM8264getUnspecified0d7_KjU23, jM8264getUnspecified0d7_KjU24, jM8264getUnspecified0d7_KjU25, jM8264getUnspecified0d7_KjU26, jM8264getUnspecified0d7_KjU27, jM8264getUnspecified0d7_KjU28, jM8264getUnspecified0d7_KjU29, jM8264getUnspecified0d7_KjU30, jM8264getUnspecified0d7_KjU31, jM8264getUnspecified0d7_KjU32, jM8264getUnspecified0d7_KjU33, jM8264getUnspecified0d7_KjU34, jM8264getUnspecified0d7_KjU35, jM8264getUnspecified0d7_KjU36, jM8264getUnspecified0d7_KjU37, jM8264getUnspecified0d7_KjU38, jM8264getUnspecified0d7_KjU39, jM8264getUnspecified0d7_KjU40, jM8264getUnspecified0d7_KjU41, j44);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textFieldColorsM5731copyejIjP34;
    }

    /* renamed from: contentPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m5349contentPaddinga9UjIt4(float f2, float f3, float f4, float f5) {
        return PaddingKt.m2751PaddingValuesa9UjIt4(f2, f3, f4, f5);
    }

    public final TextFieldDecorator decorator(TextFieldState textFieldState, boolean z, TextFieldLineLimits textFieldLineLimits, OutputTransformation outputTransformation, InteractionSource interactionSource, TextFieldLabelPosition textFieldLabelPosition, q<? super TextFieldLabelScope, ? super Composer, ? super Integer, ab> qVar, p<? super Composer, ? super Integer, ab> pVar, p<? super Composer, ? super Integer, ab> pVar2, p<? super Composer, ? super Integer, ab> pVar3, p<? super Composer, ? super Integer, ab> pVar4, p<? super Composer, ? super Integer, ab> pVar5, p<? super Composer, ? super Integer, ab> pVar6, boolean z2, TextFieldColors textFieldColors, PaddingValues paddingValues, p<? super Composer, ? super Integer, ab> pVar7, Composer composer, int i2, int i3, int i4) {
        OutlinedTextFieldDefaults outlinedTextFieldDefaults;
        final TextFieldColors textFieldColorsColors;
        final boolean z3;
        final InteractionSource interactionSource2;
        boolean z4;
        TextFieldColors textFieldColors2;
        p<? super Composer, ? super Integer, ab> pVarRememberComposableLambda;
        TextFieldLabelPosition attached = (i4 & 32) != 0 ? new TextFieldLabelPosition.Attached(false, null, null, 7, null) : textFieldLabelPosition;
        q<? super TextFieldLabelScope, ? super Composer, ? super Integer, ab> qVar2 = (i4 & 64) != 0 ? null : qVar;
        p<? super Composer, ? super Integer, ab> pVar8 = (i4 & 128) != 0 ? null : pVar;
        p<? super Composer, ? super Integer, ab> pVar9 = (i4 & 256) != 0 ? null : pVar2;
        p<? super Composer, ? super Integer, ab> pVar10 = (i4 & 512) != 0 ? null : pVar3;
        p<? super Composer, ? super Integer, ab> pVar11 = (i4 & 1024) != 0 ? null : pVar4;
        p<? super Composer, ? super Integer, ab> pVar12 = (i4 & 2048) != 0 ? null : pVar5;
        p<? super Composer, ? super Integer, ab> pVar13 = (i4 & 4096) != 0 ? null : pVar6;
        final boolean z5 = ((i4 & 8192) == 0) & z2;
        if ((i4 & 16384) != 0) {
            outlinedTextFieldDefaults = this;
            textFieldColorsColors = outlinedTextFieldDefaults.colors(composer, (i3 >> 21) & 14);
        } else {
            outlinedTextFieldDefaults = this;
            textFieldColorsColors = textFieldColors;
        }
        PaddingValues paddingValuesM5345contentPaddinga9UjIt4$default = (32768 & i4) != 0 ? m5345contentPaddinga9UjIt4$default(outlinedTextFieldDefaults, 0.0f, 0.0f, 0.0f, 0.0f, 15, null) : paddingValues;
        if ((i4 & 65536) != 0) {
            z3 = z;
            interactionSource2 = interactionSource;
            z4 = z5;
            textFieldColors2 = textFieldColorsColors;
            pVarRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-163468598, true, new p() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$$ExternalSyntheticLambda7
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return OutlinedTextFieldDefaults.decorator$lambda$0(z3, z5, interactionSource2, textFieldColorsColors, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54);
        } else {
            z3 = z;
            interactionSource2 = interactionSource;
            z4 = z5;
            textFieldColors2 = textFieldColorsColors;
            pVarRememberComposableLambda = pVar7;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-449059361, i2, i3, "androidx.compose.material3.OutlinedTextFieldDefaults.decorator (TextFieldDefaults.kt:972)");
        }
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(outputTransformation, textFieldState, textFieldLineLimits, attached, qVar2, pVar8, pVar9, pVar10, pVar11, pVar12, pVar13, z3, z4, interactionSource2, paddingValuesM5345contentPaddinga9UjIt4$default, textFieldColors2, pVarRememberComposableLambda);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return anonymousClass2;
    }

    public final TextFieldColors getDefaultOutlinedTextFieldColors(ColorScheme colorScheme, Composer composer, int i2) {
        TextFieldColors textFieldColors;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-292363577, i2, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.<get-defaultOutlinedTextFieldColors> (TextFieldDefaults.kt:1338)");
        }
        TextFieldColors defaultOutlinedTextFieldColorsCached$material3 = colorScheme.getDefaultOutlinedTextFieldColorsCached$material3();
        if (defaultOutlinedTextFieldColorsCached$material3 == null) {
            composer.startReplaceGroup(390452338);
            composer.endReplaceGroup();
            textFieldColors = null;
        } else {
            composer.startReplaceGroup(390452339);
            TextSelectionColors textSelectionColors = (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors());
            if (!x.n(defaultOutlinedTextFieldColorsCached$material3.getTextSelectionColors(), textSelectionColors)) {
                defaultOutlinedTextFieldColorsCached$material3 = TextFieldColors.m5729copyejIjP34$default(defaultOutlinedTextFieldColorsCached$material3, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, textSelectionColors, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1025, 2047, null);
                colorScheme.setDefaultOutlinedTextFieldColorsCached$material3(defaultOutlinedTextFieldColorsCached$material3);
            }
            composer.endReplaceGroup();
            textFieldColors = defaultOutlinedTextFieldColorsCached$material3;
        }
        if (textFieldColors == null) {
            composer.startReplaceGroup(-1788321191);
            TextFieldColors textFieldColors2 = new TextFieldColors(ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getFocusInputColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputColor()), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getDisabledInputColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getErrorInputColor()), Color.Companion.m8263getTransparent0d7_KjU(), Color.Companion.m8263getTransparent0d7_KjU(), Color.Companion.m8263getTransparent0d7_KjU(), Color.Companion.m8263getTransparent0d7_KjU(), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getCaretColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getErrorFocusCaretColor()), (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getFocusOutlineColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getOutlineColor()), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getDisabledOutlineColor()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getErrorOutlineColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getFocusLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getLeadingIconColor()), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getDisabledLeadingIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getErrorLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getFocusTrailingIconColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getTrailingIconColor()), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getDisabledTrailingIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getErrorTrailingIconColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getFocusLabelColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getLabelColor()), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getDisabledLabelColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getErrorLabelColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputPlaceholderColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputPlaceholderColor()), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getDisabledInputColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputPlaceholderColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getFocusSupportingColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getSupportingColor()), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getDisabledSupportingColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getErrorSupportingColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor()), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor()), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor()), null);
            colorScheme.setDefaultOutlinedTextFieldColorsCached$material3(textFieldColors2);
            composer.endReplaceGroup();
            textFieldColors = textFieldColors2;
        } else {
            composer.startReplaceGroup(-1788515437);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textFieldColors;
    }

    /* renamed from: getFocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m5350getFocusedBorderThicknessD9Ej5fM() {
        return FocusedBorderThickness;
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m5351getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m5352getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    public final Shape getShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1066756961, i2, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.<get-shape> (TextFieldDefaults.kt:866)");
        }
        Shape value = ShapesKt.getValue(OutlinedTextFieldTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getUnfocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m5353getUnfocusedBorderThicknessD9Ej5fM() {
        return UnfocusedBorderThickness;
    }
}
