package androidx.compose.foundation.text;

import androidx.compose.foundation.ComposeFoundationFlags;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.contextmenu.modifier.ToolbarRequesterImpl;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.CodepointTransformation;
import androidx.compose.foundation.text.input.internal.TextFieldCoreModifier;
import androidx.compose.foundation.text.input.internal.TextFieldTextLayoutModifier;
import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt;
import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.foundation.text.selection.OffsetProvider;
import androidx.compose.foundation.text.selection.PlatformSelectionBehaviors;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.Clipboard;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import h.ab;
import h.c.e;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.g.b.x;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.bm;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class BasicTextFieldKt {
    private static final TextFieldDecorator DefaultTextFieldDecorator = BasicTextFieldKt$DefaultTextFieldDecorator$1.INSTANCE;
    private static final long MinTouchTargetSizeForHandles = DpKt.m11186DpSizeYgX7TsA(40.0f, 40.0f);

    /* JADX WARN: Removed duplicated region for block: B:104:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0665  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0705  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0711  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0715  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x077c  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x079d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x07c2  */
    /* JADX WARN: Removed duplicated region for block: B:394:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void BasicTextField(final androidx.compose.foundation.text.input.TextFieldState r59, androidx.compose.ui.Modifier r60, boolean r61, boolean r62, androidx.compose.foundation.text.input.InputTransformation r63, androidx.compose.ui.text.TextStyle r64, androidx.compose.foundation.text.KeyboardOptions r65, androidx.compose.foundation.text.input.KeyboardActionHandler r66, androidx.compose.foundation.text.input.TextFieldLineLimits r67, h.g.a.p<? super androidx.compose.ui.unit.Density, ? super h.g.a.a<androidx.compose.ui.text.TextLayoutResult>, h.ab> r68, androidx.compose.foundation.interaction.MutableInteractionSource r69, androidx.compose.ui.graphics.Brush r70, androidx.compose.foundation.text.input.internal.CodepointTransformation r71, androidx.compose.foundation.text.input.OutputTransformation r72, androidx.compose.foundation.text.input.TextFieldDecorator r73, androidx.compose.foundation.ScrollState r74, boolean r75, androidx.compose.runtime.Composer r76, final int r77, final int r78, final int r79) {
        /*
            Method dump skipped, instructions count: 2008
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(androidx.compose.foundation.text.input.TextFieldState, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.foundation.text.input.InputTransformation, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.input.KeyboardActionHandler, androidx.compose.foundation.text.input.TextFieldLineLimits, h.g.a.p, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, androidx.compose.foundation.text.input.internal.CodepointTransformation, androidx.compose.foundation.text.input.OutputTransformation, androidx.compose.foundation.text.input.TextFieldDecorator, androidx.compose.foundation.ScrollState, boolean, androidx.compose.runtime.Composer, int, int, int):void");
    }

    static final ab BasicTextField$lambda$0(TextFieldState textFieldState, Modifier modifier, boolean z, boolean z2, InputTransformation inputTransformation, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, TextFieldLineLimits textFieldLineLimits, p pVar, MutableInteractionSource mutableInteractionSource, Brush brush, OutputTransformation outputTransformation, TextFieldDecorator textFieldDecorator, ScrollState scrollState, int i2, int i3, int i4, Composer composer, int i5) {
        BasicTextField(textFieldState, modifier, z, z2, inputTransformation, textStyle, keyboardOptions, keyboardActionHandler, textFieldLineLimits, (p<? super Density, ? super a<TextLayoutResult>, ab>) pVar, mutableInteractionSource, brush, outputTransformation, textFieldDecorator, scrollState, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab BasicTextField$lambda$11$0(TransformedTextFieldState transformedTextFieldState, InputTransformation inputTransformation, TextFieldSelectionState textFieldSelectionState, HapticFeedback hapticFeedback, Clipboard clipboard, BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1 basicTextFieldKt$BasicTextField$textToolbarHandler$1$1, Density density, boolean z, boolean z2, boolean z3) {
        transformedTextFieldState.update(inputTransformation);
        textFieldSelectionState.update(hapticFeedback, clipboard, basicTextFieldKt$BasicTextField$textToolbarHandler$1$1, density, z, z2, z3);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult BasicTextField$lambda$12$0(final TextFieldSelectionState textFieldSelectionState, DisposableEffectScope disposableEffectScope) {
        return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$lambda$12$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                textFieldSelectionState.dispose();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab BasicTextField$lambda$13$0(boolean z, bm bmVar) {
        if (z) {
            bmVar.c(ab.f48028a);
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab BasicTextField$lambda$14$0(TextFieldDecorator textFieldDecorator, final TextFieldLineLimits textFieldLineLimits, final TextStyle textStyle, final TextLayoutState textLayoutState, final boolean z, final boolean z2, final boolean z3, final TransformedTextFieldState transformedTextFieldState, final TextFieldSelectionState textFieldSelectionState, final Brush brush, final boolean z4, final boolean z5, final ScrollState scrollState, final Orientation orientation, final ToolbarRequesterImpl toolbarRequesterImpl, final PlatformSelectionBehaviors platformSelectionBehaviors, final p pVar, final KeyboardOptions keyboardOptions, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-673241599, i2, -1, "androidx.compose.foundation.text.BasicTextField.<anonymous>.<anonymous> (BasicTextField.kt:469)");
            }
            (textFieldDecorator == null ? DefaultTextFieldDecorator : textFieldDecorator).Decoration(ComposableLambdaKt.rememberComposableLambda(1969169726, true, new p() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$$ExternalSyntheticLambda26
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return BasicTextFieldKt.BasicTextField$lambda$14$0$0(textFieldLineLimits, textStyle, textLayoutState, z, z2, z3, transformedTextFieldState, textFieldSelectionState, brush, z4, z5, scrollState, orientation, toolbarRequesterImpl, platformSelectionBehaviors, pVar, keyboardOptions, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab BasicTextField$lambda$14$0$0(TextFieldLineLimits textFieldLineLimits, TextStyle textStyle, TextLayoutState textLayoutState, boolean z, boolean z2, boolean z3, TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, Brush brush, boolean z4, boolean z5, ScrollState scrollState, Orientation orientation, ToolbarRequesterImpl toolbarRequesterImpl, PlatformSelectionBehaviors platformSelectionBehaviors, p pVar, KeyboardOptions keyboardOptions, Composer composer, int i2) {
        int i3;
        int maxHeightInLines;
        TextStyle textStyle2;
        Modifier modifierTextFieldMinSize;
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            boolean z6 = !z;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1969169726, i2, -1, "androidx.compose.foundation.text.BasicTextField.<anonymous>.<anonymous>.<anonymous> (BasicTextField.kt:471)");
            }
            if (textFieldLineLimits instanceof TextFieldLineLimits.MultiLine) {
                TextFieldLineLimits.MultiLine multiLine = (TextFieldLineLimits.MultiLine) textFieldLineLimits;
                int minHeightInLines = multiLine.getMinHeightInLines();
                maxHeightInLines = multiLine.getMaxHeightInLines();
                i3 = minHeightInLines;
            } else {
                i3 = 1;
                maxHeightInLines = 1;
            }
            if (ComposeFoundationFlags.isBasicTextFieldSizeOptimizationEnabled) {
                modifierTextFieldMinSize = TextFieldDefaultSizeModifierKt.textFieldSize(Modifier.Companion, textStyle, textLayoutState, i3, maxHeightInLines, z6);
                textStyle2 = textStyle;
            } else {
                textStyle2 = textStyle;
                modifierTextFieldMinSize = TextFieldSizeKt.textFieldMinSize(HeightInLinesModifierKt.heightInLines(heightForSingleLineField(Modifier.Companion, textLayoutState), textStyle2, z6, i3, maxHeightInLines), textStyle2);
            }
            Modifier modifierThen = ClipKt.clipToBounds(modifierTextFieldMinSize).then(new TextFieldCoreModifier(z2, z3, textLayoutState, transformedTextFieldState, textFieldSelectionState, brush, z4 && !z5, scrollState, orientation, toolbarRequesterImpl, platformSelectionBehaviors));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), true);
            int iM = BasicTextFieldKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierThen);
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
            BoxKt.Box(new TextFieldTextLayoutModifier(textLayoutState, transformedTextFieldState, textStyle2, z, pVar, keyboardOptions), composer, 0);
            if (z4 && z2 && textFieldSelectionState.isInTouchMode()) {
                composer.startReplaceGroup(-810654004);
                TextFieldSelectionHandles(textFieldSelectionState, composer, 0);
                if (z5) {
                    composer.startReplaceGroup(-810412514);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(-810526873);
                    TextFieldCursorHandle(textFieldSelectionState, composer, 0);
                    composer.endReplaceGroup();
                }
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-810390690);
                composer.endReplaceGroup();
            }
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab BasicTextField$lambda$15(TextFieldState textFieldState, Modifier modifier, boolean z, boolean z2, InputTransformation inputTransformation, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, TextFieldLineLimits textFieldLineLimits, p pVar, MutableInteractionSource mutableInteractionSource, Brush brush, CodepointTransformation codepointTransformation, OutputTransformation outputTransformation, TextFieldDecorator textFieldDecorator, ScrollState scrollState, boolean z3, int i2, int i3, int i4, Composer composer, int i5) {
        BasicTextField(textFieldState, modifier, z, z2, inputTransformation, textStyle, keyboardOptions, keyboardActionHandler, textFieldLineLimits, pVar, mutableInteractionSource, brush, codepointTransformation, outputTransformation, textFieldDecorator, scrollState, z3, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab BasicTextField$lambda$16$0(TextLayoutResult textLayoutResult) {
        return ab.f48028a;
    }

    private static final TextFieldValue BasicTextField$lambda$18(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab BasicTextField$lambda$20$0(TextFieldValue textFieldValue, MutableState mutableState) {
        if (!TextRange.m10539equalsimpl0(textFieldValue.m10831getSelectiond9O1mEE(), BasicTextField$lambda$18(mutableState).m10831getSelectiond9O1mEE()) || !x.n(textFieldValue.m10830getCompositionMzsxiRA(), BasicTextField$lambda$18(mutableState).m10830getCompositionMzsxiRA())) {
            mutableState.setValue(textFieldValue);
        }
        return ab.f48028a;
    }

    private static final String BasicTextField$lambda$22(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab BasicTextField$lambda$24$0(l lVar, MutableState mutableState, MutableState mutableState2, TextFieldValue textFieldValue) {
        mutableState.setValue(textFieldValue);
        boolean zN = x.n(BasicTextField$lambda$22(mutableState2), textFieldValue.getText());
        mutableState2.setValue(textFieldValue.getText());
        if (!zN) {
            lVar.invoke(textFieldValue.getText());
        }
        return ab.f48028a;
    }

    static final ab BasicTextField$lambda$25(String str, l lVar, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z3, int i2, int i3, VisualTransformation visualTransformation, l lVar2, MutableInteractionSource mutableInteractionSource, Brush brush, q qVar, int i4, int i5, int i6, Composer composer, int i7) {
        BasicTextField(str, (l<? super String, ab>) lVar, modifier, z, z2, textStyle, keyboardOptions, keyboardActions, z3, i2, i3, visualTransformation, (l<? super TextLayoutResult, ab>) lVar2, mutableInteractionSource, brush, (q<? super p<? super Composer, ? super Integer, ab>, ? super Composer, ? super Integer, ab>) qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab BasicTextField$lambda$26$0(TextLayoutResult textLayoutResult) {
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab BasicTextField$lambda$27$0(TextFieldValue textFieldValue, l lVar, TextFieldValue textFieldValue2) {
        if (!x.n(textFieldValue, textFieldValue2)) {
            lVar.invoke(textFieldValue2);
        }
        return ab.f48028a;
    }

    static final ab BasicTextField$lambda$28(TextFieldValue textFieldValue, l lVar, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z3, int i2, int i3, VisualTransformation visualTransformation, l lVar2, MutableInteractionSource mutableInteractionSource, Brush brush, q qVar, int i4, int i5, int i6, Composer composer, int i7) {
        BasicTextField(textFieldValue, (l<? super TextFieldValue, ab>) lVar, modifier, z, z2, textStyle, keyboardOptions, keyboardActions, z3, i2, i3, visualTransformation, (l<? super TextLayoutResult, ab>) lVar2, mutableInteractionSource, brush, (q<? super p<? super Composer, ? super Integer, ab>, ? super Composer, ? super Integer, ab>) qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab BasicTextField$lambda$29$0(TextLayoutResult textLayoutResult) {
        return ab.f48028a;
    }

    static final ab BasicTextField$lambda$31(String str, l lVar, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z3, int i2, VisualTransformation visualTransformation, l lVar2, MutableInteractionSource mutableInteractionSource, Brush brush, q qVar, int i3, int i4, int i5, Composer composer, int i6) {
        BasicTextField(str, lVar, modifier, z, z2, textStyle, keyboardOptions, keyboardActions, z3, i2, visualTransformation, lVar2, mutableInteractionSource, brush, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab BasicTextField$lambda$32$0(TextLayoutResult textLayoutResult) {
        return ab.f48028a;
    }

    static final ab BasicTextField$lambda$34(TextFieldValue textFieldValue, l lVar, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z3, int i2, VisualTransformation visualTransformation, l lVar2, MutableInteractionSource mutableInteractionSource, Brush brush, q qVar, int i3, int i4, int i5, Composer composer, int i6) {
        BasicTextField(textFieldValue, lVar, modifier, z, z2, textStyle, keyboardOptions, keyboardActions, z3, i2, visualTransformation, lVar2, mutableInteractionSource, brush, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
        return ab.f48028a;
    }

    static final ab BasicTextField$lambda$8(TextFieldSelectionState textFieldSelectionState, AnnotatedString annotatedString) {
        textFieldSelectionState.onPasteEvent$foundation(annotatedString, false & ((2 & 2) == 0));
        return ab.f48028a;
    }

    public static final void TextFieldCursorHandle(final TextFieldSelectionState textFieldSelectionState, Composer composer, final int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1991581797);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(textFieldSelectionState) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1991581797, i3, -1, "androidx.compose.foundation.text.TextFieldCursorHandle (BasicTextField.kt:584)");
            }
            boolean zChanged = composerStartRestartGroup.changed(textFieldSelectionState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.derivedStateOf(new a() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$$ExternalSyntheticLambda27
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return Boolean.valueOf(BasicTextFieldKt.TextFieldCursorHandle$lambda$0$0(textFieldSelectionState));
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            if (TextFieldCursorHandle$lambda$1((State) objRememberedValue)) {
                composerStartRestartGroup.startReplaceGroup(535437134);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(textFieldSelectionState);
                OffsetProvider offsetProviderRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || offsetProviderRememberedValue == Composer.Companion.getEmpty()) {
                    offsetProviderRememberedValue = new OffsetProvider() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldCursorHandle$1$1
                        @Override // androidx.compose.foundation.text.selection.OffsetProvider
                        /* renamed from: provide-F1C5BW0, reason: not valid java name */
                        public final long mo3222provideF1C5BW0() {
                            return textFieldSelectionState.getCursorHandleState$foundation(true).m3741getPositionF1C5BW0();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(offsetProviderRememberedValue);
                }
                OffsetProvider offsetProvider = (OffsetProvider) offsetProviderRememberedValue;
                Modifier.Companion companion = Modifier.Companion;
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(textFieldSelectionState);
                PointerInputEventHandler pointerInputEventHandlerRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || pointerInputEventHandlerRememberedValue == Composer.Companion.getEmpty()) {
                    pointerInputEventHandlerRememberedValue = new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldCursorHandle$2$1
                        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                        public final Object invoke(PointerInputScope pointerInputScope, e<? super ab> eVar) {
                            Object objCursorHandleGestures = textFieldSelectionState.cursorHandleGestures(pointerInputScope, eVar);
                            return objCursorHandleGestures == h.c.a.a.f48038a ? objCursorHandleGestures : ab.f48028a;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(pointerInputEventHandlerRememberedValue);
                }
                AndroidCursorHandle_androidKt.m3202CursorHandleUSBMPiE(offsetProvider, SuspendingPointerInputFilterKt.pointerInput(companion, textFieldSelectionState, (PointerInputEventHandler) pointerInputEventHandlerRememberedValue), MinTouchTargetSizeForHandles, composerStartRestartGroup, 384, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(535820573);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$$ExternalSyntheticLambda28
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return BasicTextFieldKt.TextFieldCursorHandle$lambda$4(textFieldSelectionState, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean TextFieldCursorHandle$lambda$0$0(TextFieldSelectionState textFieldSelectionState) {
        return textFieldSelectionState.getCursorHandleState$foundation(false).getVisible();
    }

    private static final boolean TextFieldCursorHandle$lambda$1(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    static final ab TextFieldCursorHandle$lambda$4(TextFieldSelectionState textFieldSelectionState, int i2, Composer composer, int i3) {
        TextFieldCursorHandle(textFieldSelectionState, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    public static final void TextFieldSelectionHandles(final TextFieldSelectionState textFieldSelectionState, Composer composer, final int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(2025287684);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(textFieldSelectionState) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2025287684, i3, -1, "androidx.compose.foundation.text.TextFieldSelectionHandles (BasicTextField.kt:605)");
            }
            boolean zChanged = composerStartRestartGroup.changed(textFieldSelectionState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.derivedStateOf(new a() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$$ExternalSyntheticLambda7
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return BasicTextFieldKt.TextFieldSelectionHandles$lambda$0$0(textFieldSelectionState);
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            TextFieldHandleState textFieldHandleStateTextFieldSelectionHandles$lambda$1 = TextFieldSelectionHandles$lambda$1((State) objRememberedValue);
            if (textFieldHandleStateTextFieldSelectionHandles$lambda$1.getVisible()) {
                composerStartRestartGroup.startReplaceGroup(-354609545);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(textFieldSelectionState);
                OffsetProvider offsetProviderRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || offsetProviderRememberedValue == Composer.Companion.getEmpty()) {
                    offsetProviderRememberedValue = new OffsetProvider() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$1$1
                        @Override // androidx.compose.foundation.text.selection.OffsetProvider
                        /* renamed from: provide-F1C5BW0 */
                        public final long mo3222provideF1C5BW0() {
                            return textFieldSelectionState.getSelectionHandleState$foundation(true, true).m3741getPositionF1C5BW0();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(offsetProviderRememberedValue);
                }
                OffsetProvider offsetProvider = (OffsetProvider) offsetProviderRememberedValue;
                ResolvedTextDirection direction = textFieldHandleStateTextFieldSelectionHandles$lambda$1.getDirection();
                boolean handlesCrossed = textFieldHandleStateTextFieldSelectionHandles$lambda$1.getHandlesCrossed();
                Modifier.Companion companion = Modifier.Companion;
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(textFieldSelectionState);
                PointerInputEventHandler pointerInputEventHandlerRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || pointerInputEventHandlerRememberedValue == Composer.Companion.getEmpty()) {
                    pointerInputEventHandlerRememberedValue = new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$2$1
                        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                        public final Object invoke(PointerInputScope pointerInputScope, e<? super ab> eVar) {
                            Object objSelectionHandleGestures = textFieldSelectionState.selectionHandleGestures(pointerInputScope, true, eVar);
                            return objSelectionHandleGestures == h.c.a.a.f48038a ? objSelectionHandleGestures : ab.f48028a;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(pointerInputEventHandlerRememberedValue);
                }
                AndroidSelectionHandles_androidKt.m3840SelectionHandlewLIcFTc(offsetProvider, true, direction, handlesCrossed, MinTouchTargetSizeForHandles, textFieldHandleStateTextFieldSelectionHandles$lambda$1.getLineHeight(), SuspendingPointerInputFilterKt.pointerInput(companion, textFieldSelectionState, (PointerInputEventHandler) pointerInputEventHandlerRememberedValue), composerStartRestartGroup, 24624, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-353981826);
                composerStartRestartGroup.endReplaceGroup();
            }
            boolean zChanged2 = composerStartRestartGroup.changed(textFieldSelectionState);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.derivedStateOf(new a() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$$ExternalSyntheticLambda8
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return BasicTextFieldKt.TextFieldSelectionHandles$lambda$4$0(textFieldSelectionState);
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            TextFieldHandleState textFieldHandleStateTextFieldSelectionHandles$lambda$5 = TextFieldSelectionHandles$lambda$5((State) objRememberedValue2);
            if (textFieldHandleStateTextFieldSelectionHandles$lambda$5.getVisible()) {
                composerStartRestartGroup.startReplaceGroup(-353488678);
                boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(textFieldSelectionState);
                OffsetProvider offsetProviderRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance3 || offsetProviderRememberedValue2 == Composer.Companion.getEmpty()) {
                    offsetProviderRememberedValue2 = new OffsetProvider() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$3$1
                        @Override // androidx.compose.foundation.text.selection.OffsetProvider
                        /* renamed from: provide-F1C5BW0 */
                        public final long mo3222provideF1C5BW0() {
                            return textFieldSelectionState.getSelectionHandleState$foundation(false, true).m3741getPositionF1C5BW0();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(offsetProviderRememberedValue2);
                }
                OffsetProvider offsetProvider2 = (OffsetProvider) offsetProviderRememberedValue2;
                ResolvedTextDirection direction2 = textFieldHandleStateTextFieldSelectionHandles$lambda$5.getDirection();
                boolean handlesCrossed2 = textFieldHandleStateTextFieldSelectionHandles$lambda$5.getHandlesCrossed();
                Modifier.Companion companion2 = Modifier.Companion;
                boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(textFieldSelectionState);
                PointerInputEventHandler pointerInputEventHandlerRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance4 || pointerInputEventHandlerRememberedValue2 == Composer.Companion.getEmpty()) {
                    pointerInputEventHandlerRememberedValue2 = new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$4$1
                        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                        public final Object invoke(PointerInputScope pointerInputScope, e<? super ab> eVar) {
                            Object objSelectionHandleGestures = textFieldSelectionState.selectionHandleGestures(pointerInputScope, false, eVar);
                            return objSelectionHandleGestures == h.c.a.a.f48038a ? objSelectionHandleGestures : ab.f48028a;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(pointerInputEventHandlerRememberedValue2);
                }
                AndroidSelectionHandles_androidKt.m3840SelectionHandlewLIcFTc(offsetProvider2, false, direction2, handlesCrossed2, MinTouchTargetSizeForHandles, textFieldHandleStateTextFieldSelectionHandles$lambda$5.getLineHeight(), SuspendingPointerInputFilterKt.pointerInput(companion2, textFieldSelectionState, (PointerInputEventHandler) pointerInputEventHandlerRememberedValue2), composerStartRestartGroup, 24624, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-352863842);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$$ExternalSyntheticLambda9
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return BasicTextFieldKt.TextFieldSelectionHandles$lambda$8(textFieldSelectionState, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldHandleState TextFieldSelectionHandles$lambda$0$0(TextFieldSelectionState textFieldSelectionState) {
        return textFieldSelectionState.getSelectionHandleState$foundation(true, false);
    }

    private static final TextFieldHandleState TextFieldSelectionHandles$lambda$1(State<TextFieldHandleState> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldHandleState TextFieldSelectionHandles$lambda$4$0(TextFieldSelectionState textFieldSelectionState) {
        return textFieldSelectionState.getSelectionHandleState$foundation(false, false);
    }

    private static final TextFieldHandleState TextFieldSelectionHandles$lambda$5(State<TextFieldHandleState> state) {
        return state.getValue();
    }

    static final ab TextFieldSelectionHandles$lambda$8(TextFieldSelectionState textFieldSelectionState, int i2, Composer composer, int i3) {
        TextFieldSelectionHandles(textFieldSelectionState, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    private static final Modifier addContextMenuComponents(Modifier modifier, TextFieldSelectionState textFieldSelectionState, af afVar) {
        return ComposeFoundationFlags.isNewContextMenuEnabled ? TextFieldSelectionState_androidKt.addBasicTextFieldTextContextMenuComponents(modifier, textFieldSelectionState, afVar) : modifier;
    }

    private static final Modifier heightForSingleLineField(Modifier modifier, final TextLayoutState textLayoutState) {
        if (ComposeFoundationFlags.isBasicTextFieldMinSizeOptimizationEnabled) {
            return LayoutModifierKt.layout(modifier, new q() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$$ExternalSyntheticLambda25
                @Override // h.g.a.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return BasicTextFieldKt.heightForSingleLineField$lambda$0(textLayoutState, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
                }
            });
        }
        float fMo3341getHeightForSingleLineFieldD9Ej5fM = textLayoutState.mo3341getHeightForSingleLineFieldD9Ej5fM();
        return SizeKt.m2809heightInVpY3zN4(modifier, fMo3341getHeightForSingleLineFieldD9Ej5fM, Dp.m11169equalsimpl0(fMo3341getHeightForSingleLineFieldD9Ej5fM, 0.0f) ? Dp.Companion.m11184getUnspecifiedD9Ej5fM() : fMo3341getHeightForSingleLineFieldD9Ej5fM);
    }

    static final MeasureResult heightForSingleLineField$lambda$0(TextLayoutState textLayoutState, MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        float fMo3341getHeightForSingleLineFieldD9Ej5fM = textLayoutState.mo3341getHeightForSingleLineFieldD9Ej5fM();
        int i2 = measureScope.mo2121roundToPx0680j_4(fMo3341getHeightForSingleLineFieldD9Ej5fM);
        final Placeable placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(ConstraintsKt.m11122constrainN9IONVI(constraints.m11113unboximpl(), ConstraintsKt.Constraints(0, Integer.MAX_VALUE, i2, true != Dp.m11169equalsimpl0(fMo3341getHeightForSingleLineFieldD9Ej5fM, 0.0f) ? i2 : Integer.MAX_VALUE)));
        return MeasureScope.CC.layout$default(measureScope, placeableMo9741measureBRTryo0.getWidth(), placeableMo9741measureBRTryo0.getHeight(), null, new l() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$$ExternalSyntheticLambda16
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return BasicTextFieldKt.heightForSingleLineField$lambda$0$0(placeableMo9741measureBRTryo0, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab heightForSingleLineField$lambda$0$0(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:237:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void BasicTextField(final androidx.compose.foundation.text.input.TextFieldState r36, androidx.compose.ui.Modifier r37, boolean r38, boolean r39, androidx.compose.foundation.text.input.InputTransformation r40, androidx.compose.ui.text.TextStyle r41, androidx.compose.foundation.text.KeyboardOptions r42, androidx.compose.foundation.text.input.KeyboardActionHandler r43, androidx.compose.foundation.text.input.TextFieldLineLimits r44, h.g.a.p<? super androidx.compose.ui.unit.Density, ? super h.g.a.a<androidx.compose.ui.text.TextLayoutResult>, h.ab> r45, androidx.compose.foundation.interaction.MutableInteractionSource r46, androidx.compose.ui.graphics.Brush r47, androidx.compose.foundation.text.input.OutputTransformation r48, androidx.compose.foundation.text.input.TextFieldDecorator r49, androidx.compose.foundation.ScrollState r50, androidx.compose.runtime.Composer r51, final int r52, final int r53, final int r54) {
        /*
            Method dump skipped, instructions count: 865
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(androidx.compose.foundation.text.input.TextFieldState, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.foundation.text.input.InputTransformation, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.input.KeyboardActionHandler, androidx.compose.foundation.text.input.TextFieldLineLimits, h.g.a.p, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, androidx.compose.foundation.text.input.OutputTransformation, androidx.compose.foundation.text.input.TextFieldDecorator, androidx.compose.foundation.ScrollState, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:271:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void BasicTextField(final androidx.compose.ui.text.input.TextFieldValue r36, final h.g.a.l<? super androidx.compose.ui.text.input.TextFieldValue, h.ab> r37, androidx.compose.ui.Modifier r38, boolean r39, boolean r40, androidx.compose.ui.text.TextStyle r41, androidx.compose.foundation.text.KeyboardOptions r42, androidx.compose.foundation.text.KeyboardActions r43, boolean r44, int r45, int r46, androidx.compose.ui.text.input.VisualTransformation r47, h.g.a.l<? super androidx.compose.ui.text.TextLayoutResult, h.ab> r48, androidx.compose.foundation.interaction.MutableInteractionSource r49, androidx.compose.ui.graphics.Brush r50, h.g.a.q<? super h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r51, androidx.compose.runtime.Composer r52, final int r53, final int r54, final int r55) {
        /*
            Method dump skipped, instructions count: 1084
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(androidx.compose.ui.text.input.TextFieldValue, h.g.a.l, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.ui.text.input.VisualTransformation, h.g.a.l, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, h.g.a.q, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:227:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void BasicTextField(final androidx.compose.ui.text.input.TextFieldValue r35, final h.g.a.l r36, androidx.compose.ui.Modifier r37, boolean r38, boolean r39, androidx.compose.ui.text.TextStyle r40, androidx.compose.foundation.text.KeyboardOptions r41, androidx.compose.foundation.text.KeyboardActions r42, boolean r43, int r44, androidx.compose.ui.text.input.VisualTransformation r45, h.g.a.l r46, androidx.compose.foundation.interaction.MutableInteractionSource r47, androidx.compose.ui.graphics.Brush r48, h.g.a.q r49, androidx.compose.runtime.Composer r50, final int r51, final int r52, final int r53) {
        /*
            Method dump skipped, instructions count: 846
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(androidx.compose.ui.text.input.TextFieldValue, h.g.a.l, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.ui.text.input.VisualTransformation, h.g.a.l, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, h.g.a.q, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:282:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void BasicTextField(final java.lang.String r37, final h.g.a.l<? super java.lang.String, h.ab> r38, androidx.compose.ui.Modifier r39, boolean r40, boolean r41, androidx.compose.ui.text.TextStyle r42, androidx.compose.foundation.text.KeyboardOptions r43, androidx.compose.foundation.text.KeyboardActions r44, boolean r45, int r46, int r47, androidx.compose.ui.text.input.VisualTransformation r48, h.g.a.l<? super androidx.compose.ui.text.TextLayoutResult, h.ab> r49, androidx.compose.foundation.interaction.MutableInteractionSource r50, androidx.compose.ui.graphics.Brush r51, h.g.a.q<? super h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r52, androidx.compose.runtime.Composer r53, final int r54, final int r55, final int r56) {
        /*
            Method dump skipped, instructions count: 1189
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(java.lang.String, h.g.a.l, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.ui.text.input.VisualTransformation, h.g.a.l, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, h.g.a.q, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:227:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void BasicTextField(final java.lang.String r35, final h.g.a.l r36, androidx.compose.ui.Modifier r37, boolean r38, boolean r39, androidx.compose.ui.text.TextStyle r40, androidx.compose.foundation.text.KeyboardOptions r41, androidx.compose.foundation.text.KeyboardActions r42, boolean r43, int r44, androidx.compose.ui.text.input.VisualTransformation r45, h.g.a.l r46, androidx.compose.foundation.interaction.MutableInteractionSource r47, androidx.compose.ui.graphics.Brush r48, h.g.a.q r49, androidx.compose.runtime.Composer r50, final int r51, final int r52, final int r53) {
        /*
            Method dump skipped, instructions count: 846
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(java.lang.String, h.g.a.l, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.ui.text.input.VisualTransformation, h.g.a.l, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, h.g.a.q, androidx.compose.runtime.Composer, int, int, int):void");
    }
}
