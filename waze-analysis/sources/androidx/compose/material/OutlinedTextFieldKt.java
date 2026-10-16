package androidx.compose.material;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.material.OutlinedTextFieldKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.media3.muxer.MuxerUtil;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.g.b.x;
import h.k.n;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class OutlinedTextFieldKt {
    public static final String BorderId = "border";
    private static final float OutlinedTextFieldInnerPadding = 4.0f;
    private static final long OutlinedTextFieldTopPadding = TextUnitKt.getSp(8);

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$3, reason: invalid class name */
    final class AnonymousClass3 implements TextFieldDecorator {
        final /* synthetic */ TextFieldColors $colors;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ boolean $isError;
        final /* synthetic */ p<Composer, Integer, ab> $label;
        final /* synthetic */ p<Composer, Integer, ab> $leadingIcon;
        final /* synthetic */ TextFieldLineLimits $lineLimits;
        final /* synthetic */ OutputTransformation $outputTransformation;
        final /* synthetic */ p<Composer, Integer, ab> $placeholder;
        final /* synthetic */ Shape $shape;
        final /* synthetic */ TextFieldState $state;
        final /* synthetic */ p<Composer, Integer, ab> $trailingIcon;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(OutputTransformation outputTransformation, TextFieldState textFieldState, TextFieldLineLimits textFieldLineLimits, boolean z, MutableInteractionSource mutableInteractionSource, boolean z2, p<? super Composer, ? super Integer, ab> pVar, p<? super Composer, ? super Integer, ab> pVar2, p<? super Composer, ? super Integer, ab> pVar3, p<? super Composer, ? super Integer, ab> pVar4, Shape shape, TextFieldColors textFieldColors) {
            this.$outputTransformation = outputTransformation;
            this.$state = textFieldState;
            this.$lineLimits = textFieldLineLimits;
            this.$enabled = z;
            this.$interactionSource = mutableInteractionSource;
            this.$isError = z2;
            this.$label = pVar;
            this.$placeholder = pVar2;
            this.$leadingIcon = pVar3;
            this.$trailingIcon = pVar4;
            this.$shape = shape;
            this.$colors = textFieldColors;
        }

        static final ab Decoration$lambda$2(boolean z, boolean z2, MutableInteractionSource mutableInteractionSource, TextFieldColors textFieldColors, Shape shape, Composer composer, int i2) {
            if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(413830957, i2, -1, "androidx.compose.material.OutlinedTextField.<no name provided>.Decoration.<anonymous> (OutlinedTextField.kt:247)");
                }
                TextFieldDefaults.INSTANCE.m4252BorderBoxnbWgWpA(z, z2, mutableInteractionSource, textFieldColors, shape, 0.0f, 0.0f, composer, 12582912, 96);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer.skipToGroupEnd();
            }
            return ab.f48028a;
        }

        static final ab Decoration$lambda$3(AnonymousClass3 anonymousClass3, p pVar, int i2, Composer composer, int i3) {
            anonymousClass3.Decoration(pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
            return ab.f48028a;
        }

        @Override // androidx.compose.foundation.text.input.TextFieldDecorator
        public final void Decoration(final p<? super Composer, ? super Integer, ab> pVar, Composer composer, final int i2) {
            int i3;
            Composer composer2;
            String string;
            int i4 = i2 & 6;
            Composer composerStartRestartGroup = composer.startRestartGroup(1251830469);
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
                    ComposerKt.traceEventStart(1251830469, i3, -1, "androidx.compose.material.OutlinedTextField.<no name provided>.Decoration (OutlinedTextField.kt:219)");
                }
                OutputTransformation outputTransformation = this.$outputTransformation;
                TextFieldState textFieldState = this.$state;
                if (outputTransformation == null) {
                    string = textFieldState.getText().toString();
                } else {
                    TextFieldBuffer textFieldBufferStartEdit = textFieldState.startEdit();
                    try {
                        textFieldState.commitEdit(textFieldBufferStartEdit);
                        textFieldState.finishEditing();
                        this.$outputTransformation.transformOutput(textFieldBufferStartEdit);
                        string = textFieldBufferStartEdit.asCharSequence().toString();
                    } catch (Throwable th) {
                        textFieldState.finishEditing();
                        throw th;
                    }
                }
                int i5 = i3;
                TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                VisualTransformation none = VisualTransformation.Companion.getNone();
                boolean zN = x.n(this.$lineLimits, TextFieldLineLimits.SingleLine.INSTANCE);
                final boolean z = this.$enabled;
                final MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                final boolean z2 = this.$isError;
                p<Composer, Integer, ab> pVar2 = this.$label;
                p<Composer, Integer, ab> pVar3 = this.$placeholder;
                p<Composer, Integer, ab> pVar4 = this.$leadingIcon;
                p<Composer, Integer, ab> pVar5 = this.$trailingIcon;
                final Shape shape = this.$shape;
                final TextFieldColors textFieldColors = this.$colors;
                composer2 = composerStartRestartGroup;
                textFieldDefaults.OutlinedTextFieldDecorationBox(string, pVar, z, zN, none, mutableInteractionSource, z2, pVar2, pVar3, pVar4, pVar5, shape, textFieldColors, null, ComposableLambdaKt.rememberComposableLambda(413830957, true, new p() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$3$$ExternalSyntheticLambda0
                    @Override // h.g.a.p
                    public final Object invoke(Object obj, Object obj2) {
                        return OutlinedTextFieldKt.AnonymousClass3.Decoration$lambda$2(z, z2, mutableInteractionSource, textFieldColors, shape, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, composerStartRestartGroup, 54), composer2, ((i5 << 3) & 112) | 24576, 221184, 8192);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$3$$ExternalSyntheticLambda1
                    @Override // h.g.a.p
                    public final Object invoke(Object obj, Object obj2) {
                        return OutlinedTextFieldKt.AnonymousClass3.Decoration$lambda$3(this.f$0, pVar, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
    }

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:333:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void OutlinedTextField(final androidx.compose.ui.text.input.TextFieldValue r77, final h.g.a.l<? super androidx.compose.ui.text.input.TextFieldValue, h.ab> r78, androidx.compose.ui.Modifier r79, boolean r80, boolean r81, androidx.compose.ui.text.TextStyle r82, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r83, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r84, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r85, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r86, boolean r87, androidx.compose.ui.text.input.VisualTransformation r88, androidx.compose.foundation.text.KeyboardOptions r89, androidx.compose.foundation.text.KeyboardActions r90, boolean r91, int r92, int r93, androidx.compose.foundation.interaction.MutableInteractionSource r94, androidx.compose.ui.graphics.Shape r95, androidx.compose.material.TextFieldColors r96, androidx.compose.runtime.Composer r97, final int r98, final int r99, final int r100) {
        /*
            Method dump skipped, instructions count: 1747
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField(androidx.compose.ui.text.input.TextFieldValue, h.g.a.l, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, h.g.a.p, h.g.a.p, h.g.a.p, h.g.a.p, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }

    static final ab OutlinedTextField$lambda$10(String str, l lVar, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, p pVar, p pVar2, p pVar3, p pVar4, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i2, int i3, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, int i4, int i5, int i6, Composer composer, int i7) {
        OutlinedTextField(str, (l<? super String, ab>) lVar, modifier, z, z2, textStyle, (p<? super Composer, ? super Integer, ab>) pVar, (p<? super Composer, ? super Integer, ab>) pVar2, (p<? super Composer, ? super Integer, ab>) pVar3, (p<? super Composer, ? super Integer, ab>) pVar4, z3, visualTransformation, keyboardOptions, keyboardActions, z4, i2, i3, mutableInteractionSource, shape, textFieldColors, composer, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
        return ab.f48028a;
    }

    static final ab OutlinedTextField$lambda$12(String str, l lVar, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, p pVar, p pVar2, p pVar3, p pVar4, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i2, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, int i3, int i4, int i5, Composer composer, int i6) {
        OutlinedTextField(str, lVar, modifier, z, z2, textStyle, pVar, pVar2, pVar3, pVar4, z3, visualTransformation, keyboardOptions, keyboardActions, z4, i2, mutableInteractionSource, shape, textFieldColors, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab OutlinedTextField$lambda$15$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return ab.f48028a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static final ab OutlinedTextField$lambda$17(TextFieldValue textFieldValue, final boolean z, boolean z2, VisualTransformation visualTransformation, final MutableInteractionSource mutableInteractionSource, final boolean z3, p pVar, p pVar2, p pVar3, p pVar4, final Shape shape, final TextFieldColors textFieldColors, p pVar5, Composer composer, int i2) {
        p pVar6;
        int i3;
        if ((i2 & 6) == 0) {
            pVar6 = pVar5;
            i3 = i2 | (true != composer.changedInstance(pVar6) ? 2 : 4);
        } else {
            pVar6 = pVar5;
            i3 = i2;
        }
        if (composer.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1881867558, i3, -1, "androidx.compose.material.OutlinedTextField.<anonymous> (OutlinedTextField.kt:589)");
            }
            TextFieldDefaults.INSTANCE.OutlinedTextFieldDecorationBox(textFieldValue.getText(), pVar6, z, z2, visualTransformation, mutableInteractionSource, z3, pVar, pVar2, pVar3, pVar4, shape, textFieldColors, null, ComposableLambdaKt.rememberComposableLambda(-185364670, true, new p() { // from class: androidx.compose.material.OutlinedTextFieldKt$$ExternalSyntheticLambda8
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return OutlinedTextFieldKt.OutlinedTextField$lambda$17$0(z, z3, mutableInteractionSource, textFieldColors, shape, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, (i3 << 3) & 112, 221184, 8192);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab OutlinedTextField$lambda$17$0(boolean z, boolean z2, MutableInteractionSource mutableInteractionSource, TextFieldColors textFieldColors, Shape shape, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-185364670, i2, -1, "androidx.compose.material.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:604)");
            }
            TextFieldDefaults.INSTANCE.m4252BorderBoxnbWgWpA(z, z2, mutableInteractionSource, textFieldColors, shape, 0.0f, 0.0f, composer, 12582912, 96);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab OutlinedTextField$lambda$18(TextFieldValue textFieldValue, l lVar, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, p pVar, p pVar2, p pVar3, p pVar4, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i2, int i3, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, int i4, int i5, int i6, Composer composer, int i7) {
        OutlinedTextField(textFieldValue, (l<? super TextFieldValue, ab>) lVar, modifier, z, z2, textStyle, (p<? super Composer, ? super Integer, ab>) pVar, (p<? super Composer, ? super Integer, ab>) pVar2, (p<? super Composer, ? super Integer, ab>) pVar3, (p<? super Composer, ? super Integer, ab>) pVar4, z3, visualTransformation, keyboardOptions, keyboardActions, z4, i2, i3, mutableInteractionSource, shape, textFieldColors, composer, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab OutlinedTextField$lambda$2$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return ab.f48028a;
    }

    static final ab OutlinedTextField$lambda$20(TextFieldValue textFieldValue, l lVar, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, p pVar, p pVar2, p pVar3, p pVar4, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i2, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, int i3, int i4, int i5, Composer composer, int i6) {
        OutlinedTextField(textFieldValue, lVar, modifier, z, z2, textStyle, pVar, pVar2, pVar3, pVar4, z3, visualTransformation, keyboardOptions, keyboardActions, z4, i2, mutableInteractionSource, shape, textFieldColors, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
        return ab.f48028a;
    }

    static final ab OutlinedTextField$lambda$4(TextFieldState textFieldState, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, p pVar, p pVar2, p pVar3, p pVar4, boolean z3, InputTransformation inputTransformation, OutputTransformation outputTransformation, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, TextFieldLineLimits textFieldLineLimits, ScrollState scrollState, Shape shape, TextFieldColors textFieldColors, MutableInteractionSource mutableInteractionSource, int i2, int i3, int i4, Composer composer, int i5) {
        OutlinedTextField(textFieldState, modifier, z, z2, textStyle, (p<? super Composer, ? super Integer, ab>) pVar, (p<? super Composer, ? super Integer, ab>) pVar2, (p<? super Composer, ? super Integer, ab>) pVar3, (p<? super Composer, ? super Integer, ab>) pVar4, z3, inputTransformation, outputTransformation, keyboardOptions, keyboardActionHandler, textFieldLineLimits, scrollState, shape, textFieldColors, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab OutlinedTextField$lambda$7$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return ab.f48028a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static final ab OutlinedTextField$lambda$9(String str, final boolean z, boolean z2, VisualTransformation visualTransformation, final MutableInteractionSource mutableInteractionSource, final boolean z3, p pVar, p pVar2, p pVar3, p pVar4, final Shape shape, final TextFieldColors textFieldColors, p pVar5, Composer composer, int i2) {
        p pVar6;
        int i3;
        if ((i2 & 6) == 0) {
            pVar6 = pVar5;
            i3 = i2 | (true != composer.changedInstance(pVar6) ? 2 : 4);
        } else {
            pVar6 = pVar5;
            i3 = i2;
        }
        if (composer.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-591103097, i3, -1, "androidx.compose.material.OutlinedTextField.<anonymous> (OutlinedTextField.kt:382)");
            }
            TextFieldDefaults.INSTANCE.OutlinedTextFieldDecorationBox(str, pVar6, z, z2, visualTransformation, mutableInteractionSource, z3, pVar, pVar2, pVar3, pVar4, shape, textFieldColors, null, ComposableLambdaKt.rememberComposableLambda(-1118701585, true, new p() { // from class: androidx.compose.material.OutlinedTextFieldKt$$ExternalSyntheticLambda4
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return OutlinedTextFieldKt.OutlinedTextField$lambda$9$0(z, z3, mutableInteractionSource, textFieldColors, shape, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, (i3 << 3) & 112, 221184, 8192);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab OutlinedTextField$lambda$9$0(boolean z, boolean z2, MutableInteractionSource mutableInteractionSource, TextFieldColors textFieldColors, Shape shape, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1118701585, i2, -1, "androidx.compose.material.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:397)");
            }
            TextFieldDefaults.INSTANCE.m4252BorderBoxnbWgWpA(z, z2, mutableInteractionSource, textFieldColors, shape, 0.0f, 0.0f, composer, 12582912, 96);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    public static final void OutlinedTextFieldLayout(final Modifier modifier, final p<? super Composer, ? super Integer, ab> pVar, final q<? super Modifier, ? super Composer, ? super Integer, ab> qVar, p<? super Composer, ? super Integer, ab> pVar2, final p<? super Composer, ? super Integer, ab> pVar3, final p<? super Composer, ? super Integer, ab> pVar4, final boolean z, final float f2, final l<? super Size, ab> lVar, final p<? super Composer, ? super Integer, ab> pVar5, final PaddingValues paddingValues, Composer composer, final int i2, final int i3) {
        int i4;
        boolean z2;
        int i5;
        final p<? super Composer, ? super Integer, ab> pVar6;
        int i6 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(36320288);
        if (i6 == 0) {
            i4 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(pVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(qVar) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(pVar2) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(pVar3) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(pVar4) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            i4 |= true != composerStartRestartGroup.changed(z) ? 524288 : 1048576;
        }
        if ((12582912 & i2) == 0) {
            i4 |= true != composerStartRestartGroup.changed(f2) ? 4194304 : 8388608;
        }
        if ((100663296 & i2) == 0) {
            z2 = true;
            i4 |= true != composerStartRestartGroup.changedInstance(lVar) ? GroupFlagsKt.HasAuxSlotFlag : 67108864;
        } else {
            z2 = true;
        }
        if ((805306368 & i2) == 0) {
            i4 |= z2 != composerStartRestartGroup.changedInstance(pVar5) ? 268435456 : 536870912;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (true != composerStartRestartGroup.changed(paddingValues) ? 2 : 4);
        } else {
            i5 = i3;
        }
        if (composerStartRestartGroup.shouldExecute(((306783379 & i4) == 306783378 && (i5 & 3) == 2) ? false : true, i4 & 1)) {
            int i7 = i4 >> 3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(36320288, i4, i5, "androidx.compose.material.OutlinedTextFieldLayout (OutlinedTextField.kt:685)");
            }
            boolean z3 = (234881024 & i4) == 67108864;
            int i8 = i4;
            boolean z4 = (3670016 & i4) == 1048576;
            boolean z5 = (i8 & 29360128) == 8388608;
            boolean z6 = (i5 & 14) == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((z5 | z3 | z4 | z6) || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new OutlinedTextFieldMeasurePolicy(lVar, z, f2, paddingValues);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy = (OutlinedTextFieldMeasurePolicy) objRememberedValue;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
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
            Updater.m7351setimpl(composerStartRestartGroup, outlinedTextFieldMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, ab> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerStartRestartGroup.getInserting() || !x.n(composerStartRestartGroup.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                Integer numValueOf = Integer.valueOf(currentCompositeKeyHash);
                composerStartRestartGroup.updateRememberedValue(numValueOf);
                composerStartRestartGroup.apply(numValueOf, setCompositeKeyHash);
            }
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            pVar5.invoke(composerStartRestartGroup, Integer.valueOf((i8 >> 27) & 14));
            if (pVar3 != null) {
                composerStartRestartGroup.startReplaceGroup(1336978507);
                Modifier modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(LayoutIdKt.layoutId(Modifier.Companion, "Leading"));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierMinimumInteractiveComponentSize);
                a<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Updater.m7351setimpl(composerStartRestartGroup, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                p<ComposeUiNode, Integer, ab> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (composerStartRestartGroup.getInserting() || !x.n(composerStartRestartGroup.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    Integer numValueOf2 = Integer.valueOf(currentCompositeKeyHash2);
                    composerStartRestartGroup.updateRememberedValue(numValueOf2);
                    composerStartRestartGroup.apply(numValueOf2, setCompositeKeyHash2);
                }
                Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                pVar3.invoke(composerStartRestartGroup, Integer.valueOf((i8 >> 12) & 14));
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1337224523);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (pVar4 != null) {
                composerStartRestartGroup.startReplaceGroup(1337267241);
                Modifier modifierMinimumInteractiveComponentSize2 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(LayoutIdKt.layoutId(Modifier.Companion, "Trailing"));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierMinimumInteractiveComponentSize2);
                a<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Updater.m7351setimpl(composerStartRestartGroup, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                p<ComposeUiNode, Integer, ab> setCompositeKeyHash3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (composerStartRestartGroup.getInserting() || !x.n(composerStartRestartGroup.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    Integer numValueOf3 = Integer.valueOf(currentCompositeKeyHash3);
                    composerStartRestartGroup.updateRememberedValue(numValueOf3);
                    composerStartRestartGroup.apply(numValueOf3, setCompositeKeyHash3);
                }
                Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                pVar4.invoke(composerStartRestartGroup, Integer.valueOf((i8 >> 15) & 14));
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1337515179);
                composerStartRestartGroup.endReplaceGroup();
            }
            float fCalculateStartPadding = PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
            float fCalculateEndPadding = PaddingKt.calculateEndPadding(paddingValues, layoutDirection);
            Modifier.Companion companion = Modifier.Companion;
            if (pVar3 != null) {
                fCalculateStartPadding = n.e(fCalculateStartPadding - TextFieldImplKt.getHorizontalIconPadding(), 0.0f);
            }
            float f3 = fCalculateStartPadding;
            if (pVar4 != null) {
                fCalculateEndPadding = n.e(fCalculateEndPadding - TextFieldImplKt.getHorizontalIconPadding(), 0.0f);
            }
            Modifier modifierM2759paddingqDBjuR0$default = PaddingKt.m2759paddingqDBjuR0$default(companion, f3, 0.0f, fCalculateEndPadding, 0.0f, 10, null);
            if (qVar != null) {
                composerStartRestartGroup.startReplaceGroup(1338367152);
                qVar.invoke(LayoutIdKt.layoutId(Modifier.Companion, "Hint").then(modifierM2759paddingqDBjuR0$default), composerStartRestartGroup, Integer.valueOf(i7 & 112));
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1338454603);
                composerStartRestartGroup.endReplaceGroup();
            }
            Modifier modifierThen = LayoutIdKt.layoutId(Modifier.Companion, "TextField").then(modifierM2759paddingqDBjuR0$default);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), true);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen);
            a<ComposeUiNode> constructor4 = ComposeUiNode.Companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor4);
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyMaybeCachedBoxMeasurePolicy3, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap4, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, ab> setCompositeKeyHash4 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerStartRestartGroup.getInserting() || !x.n(composerStartRestartGroup.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                Integer numValueOf4 = Integer.valueOf(currentCompositeKeyHash4);
                composerStartRestartGroup.updateRememberedValue(numValueOf4);
                composerStartRestartGroup.apply(numValueOf4, setCompositeKeyHash4);
            }
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier4, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
            pVar.invoke(composerStartRestartGroup, Integer.valueOf(i7 & 14));
            composerStartRestartGroup.endNode();
            if (pVar2 != null) {
                composerStartRestartGroup.startReplaceGroup(1338685429);
                Modifier modifierLayoutId = LayoutIdKt.layoutId(Modifier.Companion, "Label");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierLayoutId);
                a<ComposeUiNode> constructor5 = ComposeUiNode.Companion.getConstructor();
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor5);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Updater.m7351setimpl(composerStartRestartGroup, measurePolicyMaybeCachedBoxMeasurePolicy4, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap5, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                p<ComposeUiNode, Integer, ab> setCompositeKeyHash5 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (composerStartRestartGroup.getInserting() || !x.n(composerStartRestartGroup.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    Integer numValueOf5 = Integer.valueOf(currentCompositeKeyHash5);
                    composerStartRestartGroup.updateRememberedValue(numValueOf5);
                    composerStartRestartGroup.apply(numValueOf5, setCompositeKeyHash5);
                }
                Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier5, ComposeUiNode.Companion.getSetModifier());
                BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                pVar6 = pVar2;
                pVar6.invoke(composerStartRestartGroup, Integer.valueOf((i8 >> 9) & 14));
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                pVar6 = pVar2;
                composerStartRestartGroup.startReplaceGroup(1338768075);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            pVar6 = pVar2;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material.OutlinedTextFieldKt$$ExternalSyntheticLambda9
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return OutlinedTextFieldKt.OutlinedTextFieldLayout$lambda$2(modifier, pVar, qVar, pVar6, pVar3, pVar4, z, f2, lVar, pVar5, paddingValues, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab OutlinedTextFieldLayout$lambda$2(Modifier modifier, p pVar, q qVar, p pVar2, p pVar3, p pVar4, boolean z, float f2, l lVar, p pVar5, PaddingValues paddingValues, int i2, int i3, Composer composer, int i4) {
        OutlinedTextFieldLayout(modifier, pVar, qVar, pVar2, pVar3, pVar4, z, f2, lVar, pVar5, paddingValues, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3));
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateHeight-O3s9Psw, reason: not valid java name */
    public static final int m4141calculateHeightO3s9Psw(int i2, int i3, int i4, int i5, int i6, float f2, long j2, float f3, PaddingValues paddingValues) {
        int iMax = Math.max(i4, Math.max(i6, MathHelpersKt.lerp(i5, 0, f2)));
        float fMo2707calculateTopPaddingD9Ej5fM = paddingValues.mo2707calculateTopPaddingD9Ej5fM() * f3;
        return ConstraintsKt.m11123constrainHeightK40F9xA(j2, Math.max(i2, Math.max(i3, h.h.a.b(MathHelpersKt.lerp(fMo2707calculateTopPaddingD9Ej5fM, Math.max(fMo2707calculateTopPaddingD9Ej5fM, i5 / 2.0f), f2) + iMax + (paddingValues.mo2704calculateBottomPaddingD9Ej5fM() * f3)))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateWidth-O3s9Psw, reason: not valid java name */
    public static final int m4142calculateWidthO3s9Psw(int i2, int i3, int i4, int i5, int i6, float f2, long j2, float f3, PaddingValues paddingValues) {
        return ConstraintsKt.m11124constrainWidthK40F9xA(j2, Math.max(i2 + Math.max(i4, Math.max(MathHelpersKt.lerp(i5, 0, f2), i6)) + i3, h.h.a.b((i5 + ((paddingValues.mo2705calculateLeftPaddingu2uoSUM(LayoutDirection.Ltr) + paddingValues.mo2706calculateRightPaddingu2uoSUM(LayoutDirection.Ltr)) * f3)) * f2)));
    }

    public static final long getOutlinedTextFieldTopPadding() {
        return OutlinedTextFieldTopPadding;
    }

    /* renamed from: outlineCutout-12SF9DM, reason: not valid java name */
    public static final Modifier m4143outlineCutout12SF9DM(Modifier modifier, final long j2, final PaddingValues paddingValues) {
        return DrawModifierKt.drawWithContent(modifier, new l() { // from class: androidx.compose.material.OutlinedTextFieldKt$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return OutlinedTextFieldKt.outlineCutout_12SF9DM$lambda$0(j2, paddingValues, (ContentDrawScope) obj);
            }
        });
    }

    static final ab outlineCutout_12SF9DM$lambda$0(long j2, PaddingValues paddingValues, ContentDrawScope contentDrawScope) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        if (fIntBitsToFloat > 0.0f) {
            float f2 = contentDrawScope.mo2127toPx0680j_4(OutlinedTextFieldInnerPadding);
            float f3 = contentDrawScope.mo2127toPx0680j_4(paddingValues.mo2705calculateLeftPaddingu2uoSUM(contentDrawScope.getLayoutDirection())) - f2;
            LayoutDirection layoutDirection = contentDrawScope.getLayoutDirection();
            LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
            float fIntBitsToFloat2 = fIntBitsToFloat + f3 + f2 + f2;
            float fE = layoutDirection.ordinal() != 1 ? n.e(f3, 0.0f) : Float.intBitsToFloat((int) (contentDrawScope.mo8751getSizeNHjbRc() >> 32)) - fIntBitsToFloat2;
            if (contentDrawScope.getLayoutDirection().ordinal() == 1) {
                fIntBitsToFloat2 = Float.intBitsToFloat((int) (contentDrawScope.mo8751getSizeNHjbRc() >> 32)) - n.e(f3, 0.0f);
            }
            float f4 = fIntBitsToFloat2;
            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
            float f5 = -fIntBitsToFloat3;
            float f6 = fIntBitsToFloat3 / 2.0f;
            int iM8216getDifferencertfAjoo = ClipOp.Companion.m8216getDifferencertfAjoo();
            DrawContext drawContext = contentDrawScope.getDrawContext();
            long jMo8758getSizeNHjbRc = drawContext.mo8758getSizeNHjbRc();
            drawContext.getCanvas().save();
            try {
                drawContext.getTransform().mo8761clipRectN_I0leg(fE, f5 / 2.0f, f4, f6, iM8216getDifferencertfAjoo);
                contentDrawScope.drawContent();
            } finally {
                drawContext.getCanvas().restore();
                drawContext.mo8759setSizeuvyYCjk(jMo8758getSizeNHjbRc);
            }
        } else {
            contentDrawScope.drawContent();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void place(Placeable.PlacementScope placementScope, int i2, int i3, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, float f2, boolean z, float f3, LayoutDirection layoutDirection, PaddingValues paddingValues) {
        int iB = h.h.a.b(paddingValues.mo2707calculateTopPaddingD9Ej5fM() * f3);
        int iB2 = h.h.a.b(PaddingKt.calculateStartPadding(paddingValues, layoutDirection) * f3);
        float horizontalIconPadding = TextFieldImplKt.getHorizontalIconPadding() * f3;
        if (placeable != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, Alignment.Companion.getCenterVertically().align(placeable.getHeight(), i2), 0.0f, 4, null);
        }
        if (placeable2 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i3 - placeable2.getWidth(), Alignment.Companion.getCenterVertically().align(placeable2.getHeight(), i2), 0.0f, 4, null);
        }
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, h.h.a.b(placeable == null ? 0.0f : (TextFieldImplKt.widthOrZero(placeable) - horizontalIconPadding) * (1.0f - f2)) + iB2, MathHelpersKt.lerp(z ? Alignment.Companion.getCenterVertically().align(placeable4.getHeight(), i2) : iB, -(placeable4.getHeight() / 2), f2), 0.0f, 4, null);
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, TextFieldImplKt.widthOrZero(placeable), Math.max(z ? Alignment.Companion.getCenterVertically().align(placeable3.getHeight(), i2) : iB, TextFieldImplKt.heightOrZero(placeable4) / 2), 0.0f, 4, null);
        if (placeable5 != null) {
            if (z) {
                iB = Alignment.Companion.getCenterVertically().align(placeable5.getHeight(), i2);
            }
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, TextFieldImplKt.widthOrZero(placeable), Math.max(iB, TextFieldImplKt.heightOrZero(placeable4) / 2), 0.0f, 4, null);
        }
        Placeable.PlacementScope.m9813place70tqf50$default(placementScope, placeable6, IntOffset.Companion.m11307getZeronOccac(), 0.0f, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:316:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void OutlinedTextField(final androidx.compose.foundation.text.input.TextFieldState r75, androidx.compose.ui.Modifier r76, boolean r77, boolean r78, androidx.compose.ui.text.TextStyle r79, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r80, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r81, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r82, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r83, boolean r84, androidx.compose.foundation.text.input.InputTransformation r85, androidx.compose.foundation.text.input.OutputTransformation r86, androidx.compose.foundation.text.KeyboardOptions r87, androidx.compose.foundation.text.input.KeyboardActionHandler r88, androidx.compose.foundation.text.input.TextFieldLineLimits r89, androidx.compose.foundation.ScrollState r90, androidx.compose.ui.graphics.Shape r91, androidx.compose.material.TextFieldColors r92, androidx.compose.foundation.interaction.MutableInteractionSource r93, androidx.compose.runtime.Composer r94, final int r95, final int r96, final int r97) {
        /*
            Method dump skipped, instructions count: 1672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField(androidx.compose.foundation.text.input.TextFieldState, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, h.g.a.p, h.g.a.p, h.g.a.p, h.g.a.p, boolean, androidx.compose.foundation.text.input.InputTransformation, androidx.compose.foundation.text.input.OutputTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.input.KeyboardActionHandler, androidx.compose.foundation.text.input.TextFieldLineLimits, androidx.compose.foundation.ScrollState, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:297:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void OutlinedTextField(final androidx.compose.ui.text.input.TextFieldValue r73, final h.g.a.l r74, androidx.compose.ui.Modifier r75, boolean r76, boolean r77, androidx.compose.ui.text.TextStyle r78, h.g.a.p r79, h.g.a.p r80, h.g.a.p r81, h.g.a.p r82, boolean r83, androidx.compose.ui.text.input.VisualTransformation r84, androidx.compose.foundation.text.KeyboardOptions r85, androidx.compose.foundation.text.KeyboardActions r86, boolean r87, int r88, androidx.compose.foundation.interaction.MutableInteractionSource r89, androidx.compose.ui.graphics.Shape r90, androidx.compose.material.TextFieldColors r91, androidx.compose.runtime.Composer r92, final int r93, final int r94, final int r95) {
        /*
            Method dump skipped, instructions count: 1233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField(androidx.compose.ui.text.input.TextFieldValue, h.g.a.l, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, h.g.a.p, h.g.a.p, h.g.a.p, h.g.a.p, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x066e  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:329:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void OutlinedTextField(final java.lang.String r76, final h.g.a.l<? super java.lang.String, h.ab> r77, androidx.compose.ui.Modifier r78, boolean r79, boolean r80, androidx.compose.ui.text.TextStyle r81, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r82, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r83, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r84, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r85, boolean r86, androidx.compose.ui.text.input.VisualTransformation r87, androidx.compose.foundation.text.KeyboardOptions r88, androidx.compose.foundation.text.KeyboardActions r89, boolean r90, int r91, int r92, androidx.compose.foundation.interaction.MutableInteractionSource r93, androidx.compose.ui.graphics.Shape r94, androidx.compose.material.TextFieldColors r95, androidx.compose.runtime.Composer r96, final int r97, final int r98, final int r99) {
        /*
            Method dump skipped, instructions count: 1712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField(java.lang.String, h.g.a.l, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, h.g.a.p, h.g.a.p, h.g.a.p, h.g.a.p, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:296:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void OutlinedTextField(final java.lang.String r74, final h.g.a.l r75, androidx.compose.ui.Modifier r76, boolean r77, boolean r78, androidx.compose.ui.text.TextStyle r79, h.g.a.p r80, h.g.a.p r81, h.g.a.p r82, h.g.a.p r83, boolean r84, androidx.compose.ui.text.input.VisualTransformation r85, androidx.compose.foundation.text.KeyboardOptions r86, androidx.compose.foundation.text.KeyboardActions r87, boolean r88, int r89, androidx.compose.foundation.interaction.MutableInteractionSource r90, androidx.compose.ui.graphics.Shape r91, androidx.compose.material.TextFieldColors r92, androidx.compose.runtime.Composer r93, final int r94, final int r95, final int r96) {
        /*
            Method dump skipped, instructions count: 1250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField(java.lang.String, h.g.a.l, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, h.g.a.p, h.g.a.p, h.g.a.p, h.g.a.p, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }
}
