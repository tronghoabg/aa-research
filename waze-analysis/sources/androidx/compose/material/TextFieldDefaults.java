package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.text.input.VisualTransformation;
import h.ab;
import h.g.a.p;
import h.g.a.q;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextFieldDefaults {
    public static final int $stable = 0;
    public static final float BackgroundOpacity = 0.12f;
    public static final float IconOpacity = 0.54f;
    public static final float UnfocusedIndicatorLineOpacity = 0.42f;
    public static final TextFieldDefaults INSTANCE = new TextFieldDefaults();
    private static final float MinHeight = 56.0f;
    private static final float MinWidth = 280.0f;
    private static final float UnfocusedBorderThickness = 1.0f;
    private static final float FocusedBorderThickness = 2.0f;

    private TextFieldDefaults() {
    }

    static final ab BorderBox_nbWgWpA$lambda$0(TextFieldDefaults textFieldDefaults, boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, Shape shape, float f2, float f3, int i2, int i3, Composer composer, int i4) {
        textFieldDefaults.m4252BorderBoxnbWgWpA(z, z2, interactionSource, textFieldColors, shape, f2, f3, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    static final ab OutlinedTextFieldDecorationBox$lambda$0(boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, Shape shape, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1212923596, i2, -1, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:644)");
            }
            INSTANCE.m4252BorderBoxnbWgWpA(z, z2, interactionSource, textFieldColors, shape, 0.0f, 0.0f, composer, 12582912, 96);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab OutlinedTextFieldDecorationBox$lambda$1(TextFieldDefaults textFieldDefaults, String str, p pVar, boolean z, boolean z2, VisualTransformation visualTransformation, InteractionSource interactionSource, boolean z3, p pVar2, p pVar3, p pVar4, p pVar5, Shape shape, TextFieldColors textFieldColors, PaddingValues paddingValues, p pVar6, int i2, int i3, int i4, Composer composer, int i5) {
        textFieldDefaults.OutlinedTextFieldDecorationBox(str, pVar, z, z2, visualTransformation, interactionSource, z3, pVar2, pVar3, pVar4, pVar5, shape, textFieldColors, paddingValues, pVar6, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    static final ab OutlinedTextFieldDecorationBox$lambda$2(boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1922186815, i2, -1, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:730)");
            }
            INSTANCE.m4252BorderBoxnbWgWpA(z, z2, interactionSource, textFieldColors, null, 0.0f, 0.0f, composer, 12582912, 112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab OutlinedTextFieldDecorationBox$lambda$3(TextFieldDefaults textFieldDefaults, String str, p pVar, boolean z, boolean z2, VisualTransformation visualTransformation, InteractionSource interactionSource, boolean z3, p pVar2, p pVar3, p pVar4, p pVar5, TextFieldColors textFieldColors, PaddingValues paddingValues, p pVar6, int i2, int i3, int i4, Composer composer, int i5) {
        textFieldDefaults.OutlinedTextFieldDecorationBox(str, pVar, z, z2, visualTransformation, interactionSource, z3, pVar2, pVar3, pVar4, pVar5, textFieldColors, paddingValues, pVar6, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    static final ab TextFieldDecorationBox$lambda$0(TextFieldDefaults textFieldDefaults, String str, p pVar, boolean z, boolean z2, VisualTransformation visualTransformation, InteractionSource interactionSource, boolean z3, p pVar2, p pVar3, p pVar4, p pVar5, Shape shape, TextFieldColors textFieldColors, PaddingValues paddingValues, int i2, int i3, int i4, Composer composer, int i5) {
        textFieldDefaults.TextFieldDecorationBox(str, pVar, z, z2, visualTransformation, interactionSource, z3, pVar2, pVar3, pVar4, pVar5, shape, textFieldColors, paddingValues, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    static final ab TextFieldDecorationBox$lambda$1(TextFieldDefaults textFieldDefaults, String str, p pVar, boolean z, boolean z2, VisualTransformation visualTransformation, InteractionSource interactionSource, boolean z3, p pVar2, p pVar3, p pVar4, p pVar5, TextFieldColors textFieldColors, PaddingValues paddingValues, int i2, int i3, int i4, Composer composer, int i5) {
        textFieldDefaults.TextFieldDecorationBox(str, pVar, z, z2, visualTransformation, interactionSource, z3, pVar2, pVar3, pVar4, pVar5, textFieldColors, paddingValues, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    /* renamed from: indicatorLine-gv0btCI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m4248indicatorLinegv0btCI$default(TextFieldDefaults textFieldDefaults, Modifier modifier, boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, float f2, float f3, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            f2 = FocusedBorderThickness;
        }
        return textFieldDefaults.m4257indicatorLinegv0btCI(modifier, z, z2, interactionSource, textFieldColors, f2, (i2 & 32) != 0 ? UnfocusedBorderThickness : f3);
    }

    static final Modifier indicatorLine_gv0btCI$lambda$1(boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, float f2, float f3, Modifier modifier, Composer composer, int i2) {
        composer.startReplaceGroup(1398930845);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1398930845, i2, -1, "androidx.compose.material.TextFieldDefaults.indicatorLine.<anonymous> (TextFieldDefaults.kt:288)");
        }
        Modifier modifierDrawIndicatorLine = TextFieldKt.drawIndicatorLine(Modifier.Companion, (BorderStroke) TextFieldDefaultsKt.m4264animateBorderStrokeAsStateNuRrP5Q(z, z2, interactionSource, textFieldColors, f2, f3, composer, 0).getValue());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return modifierDrawIndicatorLine;
    }

    /* renamed from: outlinedTextFieldPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m4249outlinedTextFieldPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f2, float f3, float f4, float f5, int i2, Object obj) {
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
        return textFieldDefaults.m4259outlinedTextFieldPaddinga9UjIt4(f2, f3, f4, f5);
    }

    /* renamed from: textFieldWithLabelPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m4250textFieldWithLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i2 & 2) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i2 & 4) != 0) {
            f4 = TextFieldKt.getFirstBaselineOffset();
        }
        if ((i2 & 8) != 0) {
            f5 = TextFieldKt.getTextFieldBottomPadding();
        }
        return textFieldDefaults.m4261textFieldWithLabelPaddinga9UjIt4(f2, f3, f4, f5);
    }

    /* renamed from: textFieldWithoutLabelPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m4251textFieldWithoutLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f2, float f3, float f4, float f5, int i2, Object obj) {
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
        return textFieldDefaults.m4262textFieldWithoutLabelPaddinga9UjIt4(f2, f3, f4, f5);
    }

    /* JADX WARN: Removed duplicated region for block: B:96:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0162  */
    /* renamed from: BorderBox-nbWgWpA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4252BorderBoxnbWgWpA(final boolean r22, final boolean r23, final androidx.compose.foundation.interaction.InteractionSource r24, final androidx.compose.material.TextFieldColors r25, androidx.compose.ui.graphics.Shape r26, float r27, float r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldDefaults.m4252BorderBoxnbWgWpA(boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.material.TextFieldColors, androidx.compose.ui.graphics.Shape, float, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:216:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OutlinedTextFieldDecorationBox(final java.lang.String r63, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r64, final boolean r65, final boolean r66, final androidx.compose.ui.text.input.VisualTransformation r67, final androidx.compose.foundation.interaction.InteractionSource r68, boolean r69, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r70, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r71, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r72, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r73, androidx.compose.ui.graphics.Shape r74, androidx.compose.material.TextFieldColors r75, androidx.compose.foundation.layout.PaddingValues r76, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r77, androidx.compose.runtime.Composer r78, final int r79, final int r80, final int r81) {
        /*
            Method dump skipped, instructions count: 1055
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox(java.lang.String, h.g.a.p, boolean, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.InteractionSource, boolean, h.g.a.p, h.g.a.p, h.g.a.p, h.g.a.p, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.foundation.layout.PaddingValues, h.g.a.p, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:207:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void TextFieldDecorationBox(final java.lang.String r61, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r62, final boolean r63, final boolean r64, final androidx.compose.ui.text.input.VisualTransformation r65, final androidx.compose.foundation.interaction.InteractionSource r66, boolean r67, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r68, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r69, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r70, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r71, androidx.compose.ui.graphics.Shape r72, androidx.compose.material.TextFieldColors r73, androidx.compose.foundation.layout.PaddingValues r74, androidx.compose.runtime.Composer r75, final int r76, final int r77, final int r78) {
        /*
            Method dump skipped, instructions count: 992
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldDefaults.TextFieldDecorationBox(java.lang.String, h.g.a.p, boolean, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.InteractionSource, boolean, h.g.a.p, h.g.a.p, h.g.a.p, h.g.a.p, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* renamed from: getFocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m4253getFocusedBorderThicknessD9Ej5fM() {
        return FocusedBorderThickness;
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m4254getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m4255getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    public final Shape getOutlinedTextFieldShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1899109048, i2, -1, "androidx.compose.material.TextFieldDefaults.<get-OutlinedTextFieldShape> (TextFieldDefaults.kt:228)");
        }
        CornerBasedShape small = MaterialTheme.INSTANCE.getShapes(composer, 6).getSmall();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return small;
    }

    public final Shape getTextFieldShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1117199624, i2, -1, "androidx.compose.material.TextFieldDefaults.<get-TextFieldShape> (TextFieldDefaults.kt:221)");
        }
        CornerBasedShape cornerBasedShapeCopy$default = CornerBasedShape.copy$default(MaterialTheme.INSTANCE.getShapes(composer, 6).getSmall(), null, null, CornerSizeKt.getZeroCornerSize(), CornerSizeKt.getZeroCornerSize(), 3, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return cornerBasedShapeCopy$default;
    }

    /* renamed from: getUnfocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m4256getUnfocusedBorderThicknessD9Ej5fM() {
        return UnfocusedBorderThickness;
    }

    /* renamed from: indicatorLine-gv0btCI, reason: not valid java name */
    public final Modifier m4257indicatorLinegv0btCI(Modifier modifier, boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, float f2, float f3) {
        boolean z3;
        boolean z4;
        InteractionSource interactionSource2;
        TextFieldColors textFieldColors2;
        float f4;
        float f5;
        TextFieldDefaults$indicatorLinegv0btCI$$inlined$debugInspectorInfo$1 noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            z3 = z;
            z4 = z2;
            interactionSource2 = interactionSource;
            textFieldColors2 = textFieldColors;
            f4 = f2;
            f5 = f3;
            noInspectorInfo = new TextFieldDefaults$indicatorLinegv0btCI$$inlined$debugInspectorInfo$1(z3, z4, interactionSource2, textFieldColors2, f4, f5);
        } else {
            z3 = z;
            z4 = z2;
            interactionSource2 = interactionSource;
            textFieldColors2 = textFieldColors;
            f4 = f2;
            f5 = f3;
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        final float f6 = f5;
        final float f7 = f4;
        final TextFieldColors textFieldColors3 = textFieldColors2;
        final InteractionSource interactionSource3 = interactionSource2;
        final boolean z5 = z4;
        final boolean z6 = z3;
        return ComposedModifierKt.composed(modifier, noInspectorInfo, new q() { // from class: androidx.compose.material.TextFieldDefaults$$ExternalSyntheticLambda7
            @Override // h.g.a.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return TextFieldDefaults.indicatorLine_gv0btCI$lambda$1(z6, z5, interactionSource3, textFieldColors3, f7, f6, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        });
    }

    /* renamed from: outlinedTextFieldColors-dx8h9Zs, reason: not valid java name */
    public final TextFieldColors m4258outlinedTextFieldColorsdx8h9Zs(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, Composer composer, int i2, int i3, int i4, int i5) {
        long j23;
        long jM8227copywmQWz5c$default;
        long j24;
        long jM8227copywmQWz5c$default2;
        long j25;
        long jM8227copywmQWz5c$default3;
        long j26;
        long jM8227copywmQWz5c$default4;
        long j27;
        long jM8227copywmQWz5c$default5 = (i5 & 1) != 0 ? Color.m8227copywmQWz5c$default(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m8238unboximpl(), ((Number) composer.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long jM8227copywmQWz5c$default6 = (i5 & 2) != 0 ? Color.m8227copywmQWz5c$default(jM8227copywmQWz5c$default5, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long jM8263getTransparent0d7_KjU = (i5 & 4) != 0 ? Color.Companion.m8263getTransparent0d7_KjU() : j4;
        long jM4027getPrimary0d7_KjU = (i5 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m4027getPrimary0d7_KjU() : j5;
        long jM4021getError0d7_KjU = (i5 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m4021getError0d7_KjU() : j6;
        long jM8227copywmQWz5c$default7 = (i5 & 32) != 0 ? Color.m8227copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m4027getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j7;
        long jM8227copywmQWz5c$default8 = (i5 & 64) != 0 ? Color.m8227copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m4026getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j8;
        if ((i5 & 128) != 0) {
            long j28 = jM8227copywmQWz5c$default8;
            jM8227copywmQWz5c$default = Color.m8227copywmQWz5c$default(j28, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j23 = j28;
        } else {
            j23 = jM8227copywmQWz5c$default8;
            jM8227copywmQWz5c$default = j9;
        }
        long jM4021getError0d7_KjU2 = (i5 & 256) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m4021getError0d7_KjU() : j10;
        long jM8227copywmQWz5c$default9 = (i5 & 512) != 0 ? Color.m8227copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m4026getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j11;
        if ((i5 & 1024) != 0) {
            long j29 = jM8227copywmQWz5c$default9;
            jM8227copywmQWz5c$default2 = Color.m8227copywmQWz5c$default(j29, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j24 = j29;
        } else {
            j24 = jM8227copywmQWz5c$default9;
            jM8227copywmQWz5c$default2 = j12;
        }
        long j30 = (i5 & 2048) != 0 ? j24 : j13;
        long jM8227copywmQWz5c$default10 = (i5 & 4096) != 0 ? Color.m8227copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m4026getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j14;
        if ((i5 & 8192) != 0) {
            long j31 = jM8227copywmQWz5c$default10;
            jM8227copywmQWz5c$default3 = Color.m8227copywmQWz5c$default(j31, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j25 = j31;
        } else {
            j25 = jM8227copywmQWz5c$default10;
            jM8227copywmQWz5c$default3 = j15;
        }
        long jM4021getError0d7_KjU3 = (i5 & 16384) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m4021getError0d7_KjU() : j16;
        long jM8227copywmQWz5c$default11 = (32768 & i5) != 0 ? Color.m8227copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m4027getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j17;
        long jM8227copywmQWz5c$default12 = (65536 & i5) != 0 ? Color.m8227copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m4026getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j18;
        if ((131072 & i5) != 0) {
            long j32 = jM8227copywmQWz5c$default12;
            jM8227copywmQWz5c$default4 = Color.m8227copywmQWz5c$default(j32, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j26 = j32;
        } else {
            j26 = jM8227copywmQWz5c$default12;
            jM8227copywmQWz5c$default4 = j19;
        }
        long jM4021getError0d7_KjU4 = (262144 & i5) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m4021getError0d7_KjU() : j20;
        long jM8227copywmQWz5c$default13 = (524288 & i5) != 0 ? Color.m8227copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m4026getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j21;
        long jM8227copywmQWz5c$default14 = (i5 & 1048576) != 0 ? Color.m8227copywmQWz5c$default(jM8227copywmQWz5c$default13, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j22;
        if (ComposerKt.isTraceInProgress()) {
            j27 = jM8227copywmQWz5c$default14;
            ComposerKt.traceEventStart(1762667317, i2, i3, "androidx.compose.material.TextFieldDefaults.outlinedTextFieldColors (TextFieldDefaults.kt:451)");
        } else {
            j27 = jM8227copywmQWz5c$default14;
        }
        DefaultTextFieldColors defaultTextFieldColors = new DefaultTextFieldColors(jM8227copywmQWz5c$default5, jM8227copywmQWz5c$default6, jM4027getPrimary0d7_KjU, jM4021getError0d7_KjU, jM8227copywmQWz5c$default7, j23, jM4021getError0d7_KjU2, jM8227copywmQWz5c$default, j24, jM8227copywmQWz5c$default2, j30, j25, jM8227copywmQWz5c$default3, jM4021getError0d7_KjU3, jM8263getTransparent0d7_KjU, jM8227copywmQWz5c$default11, j26, jM8227copywmQWz5c$default4, jM4021getError0d7_KjU4, jM8227copywmQWz5c$default13, j27, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultTextFieldColors;
    }

    /* renamed from: outlinedTextFieldPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m4259outlinedTextFieldPaddinga9UjIt4(float f2, float f3, float f4, float f5) {
        return PaddingKt.m2751PaddingValuesa9UjIt4(f2, f3, f4, f5);
    }

    /* renamed from: textFieldColors-dx8h9Zs, reason: not valid java name */
    public final TextFieldColors m4260textFieldColorsdx8h9Zs(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, Composer composer, int i2, int i3, int i4, int i5) {
        long j23;
        long jM8227copywmQWz5c$default;
        long j24;
        long jM8227copywmQWz5c$default2;
        long j25;
        long jM8227copywmQWz5c$default3;
        long j26;
        long jM8227copywmQWz5c$default4;
        long j27;
        long jM8227copywmQWz5c$default5 = (i5 & 1) != 0 ? Color.m8227copywmQWz5c$default(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m8238unboximpl(), ((Number) composer.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long jM8227copywmQWz5c$default6 = (i5 & 2) != 0 ? Color.m8227copywmQWz5c$default(jM8227copywmQWz5c$default5, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long jM8227copywmQWz5c$default7 = (i5 & 4) != 0 ? Color.m8227copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m4026getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j4;
        long jM4027getPrimary0d7_KjU = (i5 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m4027getPrimary0d7_KjU() : j5;
        long jM4021getError0d7_KjU = (i5 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m4021getError0d7_KjU() : j6;
        long jM8227copywmQWz5c$default8 = (i5 & 32) != 0 ? Color.m8227copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m4027getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j7;
        long jM8227copywmQWz5c$default9 = (i5 & 64) != 0 ? Color.m8227copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m4026getOnSurface0d7_KjU(), 0.42f, 0.0f, 0.0f, 0.0f, 14, null) : j8;
        if ((i5 & 128) != 0) {
            long j28 = jM8227copywmQWz5c$default9;
            jM8227copywmQWz5c$default = Color.m8227copywmQWz5c$default(j28, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j23 = j28;
        } else {
            j23 = jM8227copywmQWz5c$default9;
            jM8227copywmQWz5c$default = j9;
        }
        long jM4021getError0d7_KjU2 = (i5 & 256) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m4021getError0d7_KjU() : j10;
        long jM8227copywmQWz5c$default10 = (i5 & 512) != 0 ? Color.m8227copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m4026getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j11;
        if ((i5 & 1024) != 0) {
            long j29 = jM8227copywmQWz5c$default10;
            jM8227copywmQWz5c$default2 = Color.m8227copywmQWz5c$default(j29, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j24 = j29;
        } else {
            j24 = jM8227copywmQWz5c$default10;
            jM8227copywmQWz5c$default2 = j12;
        }
        long j30 = (i5 & 2048) != 0 ? j24 : j13;
        long jM8227copywmQWz5c$default11 = (i5 & 4096) != 0 ? Color.m8227copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m4026getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j14;
        if ((i5 & 8192) != 0) {
            long j31 = jM8227copywmQWz5c$default11;
            jM8227copywmQWz5c$default3 = Color.m8227copywmQWz5c$default(j31, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j25 = j31;
        } else {
            j25 = jM8227copywmQWz5c$default11;
            jM8227copywmQWz5c$default3 = j15;
        }
        long jM4021getError0d7_KjU3 = (i5 & 16384) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m4021getError0d7_KjU() : j16;
        long jM8227copywmQWz5c$default12 = (32768 & i5) != 0 ? Color.m8227copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m4027getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j17;
        long jM8227copywmQWz5c$default13 = (65536 & i5) != 0 ? Color.m8227copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m4026getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j18;
        if ((131072 & i5) != 0) {
            long j32 = jM8227copywmQWz5c$default13;
            jM8227copywmQWz5c$default4 = Color.m8227copywmQWz5c$default(j32, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j26 = j32;
        } else {
            j26 = jM8227copywmQWz5c$default13;
            jM8227copywmQWz5c$default4 = j19;
        }
        long jM4021getError0d7_KjU4 = (262144 & i5) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m4021getError0d7_KjU() : j20;
        long jM8227copywmQWz5c$default14 = (524288 & i5) != 0 ? Color.m8227copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m4026getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j21;
        long jM8227copywmQWz5c$default15 = (i5 & 1048576) != 0 ? Color.m8227copywmQWz5c$default(jM8227copywmQWz5c$default14, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j22;
        if (ComposerKt.isTraceInProgress()) {
            j27 = jM8227copywmQWz5c$default15;
            ComposerKt.traceEventStart(231892599, i2, i3, "androidx.compose.material.TextFieldDefaults.textFieldColors (TextFieldDefaults.kt:397)");
        } else {
            j27 = jM8227copywmQWz5c$default15;
        }
        DefaultTextFieldColors defaultTextFieldColors = new DefaultTextFieldColors(jM8227copywmQWz5c$default5, jM8227copywmQWz5c$default6, jM4027getPrimary0d7_KjU, jM4021getError0d7_KjU, jM8227copywmQWz5c$default8, j23, jM4021getError0d7_KjU2, jM8227copywmQWz5c$default, j24, jM8227copywmQWz5c$default2, j30, j25, jM8227copywmQWz5c$default3, jM4021getError0d7_KjU3, jM8227copywmQWz5c$default7, jM8227copywmQWz5c$default12, j26, jM8227copywmQWz5c$default4, jM4021getError0d7_KjU4, jM8227copywmQWz5c$default14, j27, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultTextFieldColors;
    }

    /* renamed from: textFieldWithLabelPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m4261textFieldWithLabelPaddinga9UjIt4(float f2, float f3, float f4, float f5) {
        return PaddingKt.m2751PaddingValuesa9UjIt4(f2, f4, f3, f5);
    }

    /* renamed from: textFieldWithoutLabelPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m4262textFieldWithoutLabelPaddinga9UjIt4(float f2, float f3, float f4, float f5) {
        return PaddingKt.m2751PaddingValuesa9UjIt4(f2, f3, f4, f5);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:199:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void OutlinedTextFieldDecorationBox(final java.lang.String r62, final h.g.a.p r63, final boolean r64, final boolean r65, final androidx.compose.ui.text.input.VisualTransformation r66, final androidx.compose.foundation.interaction.InteractionSource r67, boolean r68, h.g.a.p r69, h.g.a.p r70, h.g.a.p r71, h.g.a.p r72, androidx.compose.material.TextFieldColors r73, androidx.compose.foundation.layout.PaddingValues r74, h.g.a.p r75, androidx.compose.runtime.Composer r76, final int r77, final int r78, final int r79) {
        /*
            Method dump skipped, instructions count: 926
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox(java.lang.String, h.g.a.p, boolean, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.InteractionSource, boolean, h.g.a.p, h.g.a.p, h.g.a.p, h.g.a.p, androidx.compose.material.TextFieldColors, androidx.compose.foundation.layout.PaddingValues, h.g.a.p, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:192:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void TextFieldDecorationBox(final java.lang.String r58, final h.g.a.p r59, final boolean r60, final boolean r61, final androidx.compose.ui.text.input.VisualTransformation r62, final androidx.compose.foundation.interaction.InteractionSource r63, boolean r64, h.g.a.p r65, h.g.a.p r66, h.g.a.p r67, h.g.a.p r68, androidx.compose.material.TextFieldColors r69, androidx.compose.foundation.layout.PaddingValues r70, androidx.compose.runtime.Composer r71, final int r72, final int r73, final int r74) {
        /*
            Method dump skipped, instructions count: 840
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldDefaults.TextFieldDecorationBox(java.lang.String, h.g.a.p, boolean, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.InteractionSource, boolean, h.g.a.p, h.g.a.p, h.g.a.p, h.g.a.p, androidx.compose.material.TextFieldColors, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int, int, int):void");
    }
}
