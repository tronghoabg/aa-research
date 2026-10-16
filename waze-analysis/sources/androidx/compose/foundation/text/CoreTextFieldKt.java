package androidx.compose.foundation.text;

import androidx.compose.foundation.ComposeFoundationFlags;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter;
import androidx.compose.foundation.text.selection.OffsetProvider;
import androidx.compose.foundation.text.selection.SelectionHandleAnchor;
import androidx.compose.foundation.text.selection.SelectionHandleInfo;
import androidx.compose.foundation.text.selection.SelectionHandlesKt;
import androidx.compose.foundation.text.selection.SimpleLayoutKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.media3.muxer.MuxerUtil;
import com.waze.strings.DisplayStrings;
import e.b.c;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import kotlinx.coroutines.af;
import kotlinx.coroutines.ag;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class CoreTextFieldKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x06f4  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0728  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x075c  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0764  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x076d  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x077b  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0813  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0823  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0868 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0879  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x08a5  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x08b0  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x08cd  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x08d3  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x08e3  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x08eb  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0905  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0907  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x094a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0969  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0974  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x09bd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x09c5  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0a2e  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0a32  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0a3b  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x0a96  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0aba  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0ae1  */
    /* JADX WARN: Removed duplicated region for block: B:464:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x012d  */
    /* JADX WARN: Type inference failed for: r33v5 */
    /* JADX WARN: Type inference failed for: r33v6 */
    /* JADX WARN: Type inference failed for: r33v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void CoreTextField(final androidx.compose.ui.text.input.TextFieldValue r47, final h.g.a.l<? super androidx.compose.ui.text.input.TextFieldValue, h.ab> r48, androidx.compose.ui.Modifier r49, androidx.compose.ui.text.TextStyle r50, androidx.compose.ui.text.input.VisualTransformation r51, h.g.a.l<? super androidx.compose.ui.text.TextLayoutResult, h.ab> r52, androidx.compose.foundation.interaction.MutableInteractionSource r53, androidx.compose.ui.graphics.Brush r54, boolean r55, int r56, int r57, androidx.compose.ui.text.input.ImeOptions r58, androidx.compose.foundation.text.KeyboardActions r59, boolean r60, boolean r61, h.g.a.q<? super h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r62, androidx.compose.foundation.text.TextFieldScrollerPosition r63, androidx.compose.runtime.Composer r64, final int r65, final int r66, final int r67) {
        /*
            Method dump skipped, instructions count: 2809
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField(androidx.compose.ui.text.input.TextFieldValue, h.g.a.l, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.input.VisualTransformation, h.g.a.l, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, boolean, int, int, androidx.compose.ui.text.input.ImeOptions, androidx.compose.foundation.text.KeyboardActions, boolean, boolean, h.g.a.q, androidx.compose.foundation.text.TextFieldScrollerPosition, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab CoreTextField$lambda$0$0(TextLayoutResult textLayoutResult) {
        return ab.f48028a;
    }

    static final ab CoreTextField$lambda$10(TextFieldSelectionManager textFieldSelectionManager, AnnotatedString annotatedString) {
        textFieldSelectionManager.paste$foundation(annotatedString);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab CoreTextField$lambda$13$0(LegacyTextFieldState legacyTextFieldState, boolean z, boolean z2, TextInputService textInputService, TextFieldValue textFieldValue, ImeOptions imeOptions, OffsetMapping offsetMapping, TextFieldSelectionManager textFieldSelectionManager, af afVar, BringIntoViewRequester bringIntoViewRequester, FocusState focusState) {
        TextLayoutResultProxy layoutResult;
        if (legacyTextFieldState.getHasFocus() != focusState.isFocused()) {
            legacyTextFieldState.setHasFocus(focusState.isFocused());
            if (legacyTextFieldState.getHasFocus() && z && !z2) {
                startInputSession(textInputService, legacyTextFieldState, textFieldValue, imeOptions, offsetMapping);
            } else {
                endInputSession(legacyTextFieldState);
            }
            if (focusState.isFocused() && (layoutResult = legacyTextFieldState.getLayoutResult()) != null) {
                aj.z(afVar, null, null, new CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1(bringIntoViewRequester, textFieldValue, legacyTextFieldState, layoutResult, offsetMapping, null), 3);
            }
            if (!focusState.isFocused()) {
                TextFieldSelectionManager.m3918deselect_kEHs6E$foundation$default(textFieldSelectionManager, null, 1, null);
            }
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CoreTextField$lambda$14(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab CoreTextField$lambda$16$0(LegacyTextFieldState legacyTextFieldState, boolean z, WindowInfo windowInfo, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, OffsetMapping offsetMapping, LayoutCoordinates layoutCoordinates) {
        TextInputSession inputSession;
        legacyTextFieldState.setLayoutCoordinates(layoutCoordinates);
        TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
        if (layoutResult != null) {
            layoutResult.setInnerTextFieldCoordinates(layoutCoordinates);
        }
        if (z) {
            if (legacyTextFieldState.getHandleState() == HandleState.Selection) {
                if (legacyTextFieldState.getShowFloatingToolbar() && windowInfo.isWindowFocused()) {
                    textFieldSelectionManager.showSelectionToolbar$foundation();
                } else {
                    textFieldSelectionManager.hideSelectionToolbar$foundation();
                }
                legacyTextFieldState.setShowSelectionHandleStart(TextFieldSelectionManager_androidKt.isSelectionHandleInVisibleBound(textFieldSelectionManager, true));
                legacyTextFieldState.setShowSelectionHandleEnd(TextFieldSelectionManager_androidKt.isSelectionHandleInVisibleBound(textFieldSelectionManager, false));
                legacyTextFieldState.setShowCursorHandle(TextRange.m10540getCollapsedimpl(textFieldValue.m10831getSelectiond9O1mEE()));
            } else if (legacyTextFieldState.getHandleState() == HandleState.Cursor) {
                legacyTextFieldState.setShowCursorHandle(TextFieldSelectionManager_androidKt.isSelectionHandleInVisibleBound(textFieldSelectionManager, true));
            }
            notifyFocusedRect(legacyTextFieldState, textFieldValue, offsetMapping);
            TextLayoutResultProxy layoutResult2 = legacyTextFieldState.getLayoutResult();
            if (layoutResult2 != null && (inputSession = legacyTextFieldState.getInputSession()) != null && legacyTextFieldState.getHasFocus()) {
                TextFieldDelegate.Companion.updateTextLayoutResult$foundation(inputSession, textFieldValue, offsetMapping, layoutResult2);
            }
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult CoreTextField$lambda$17$0(final TextFieldSelectionManager textFieldSelectionManager, DisposableEffectScope disposableEffectScope) {
        return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$lambda$17$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                textFieldSelectionManager.hideSelectionToolbar$foundation();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult CoreTextField$lambda$18$0(LegacyTextFieldState legacyTextFieldState, TextInputService textInputService, TextFieldValue textFieldValue, ImeOptions imeOptions, DisposableEffectScope disposableEffectScope) {
        if (legacyTextFieldState.getHasFocus()) {
            legacyTextFieldState.setInputSession(TextFieldDelegate.Companion.restartInput$foundation(textInputService, textFieldValue, legacyTextFieldState.getProcessor(), imeOptions, legacyTextFieldState.getOnValueChange(), legacyTextFieldState.getOnImeActionPerformed()));
        }
        return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$lambda$18$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab CoreTextField$lambda$19$0(boolean z, LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter) {
        if (z) {
            legacyPlatformTextInputServiceAdapter.startStylusHandwriting();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab CoreTextField$lambda$20$0(LegacyTextFieldState legacyTextFieldState, Brush brush, ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        if (legacyTextFieldState.getAutofillHighlightOn() || legacyTextFieldState.getJustAutofilled()) {
            DrawScope.CC.m8835drawRectAsUm42w$default(contentDrawScope, brush, 0L, 0L, 0.0f, null, null, 0, 126, null);
        }
        return ab.f48028a;
    }

    static final ab CoreTextField$lambda$21(LegacyTextFieldState legacyTextFieldState, LayoutCoordinates layoutCoordinates) {
        TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
        if (layoutResult != null) {
            layoutResult.setDecorationBoxCoordinates(layoutCoordinates);
        }
        return ab.f48028a;
    }

    static final ab CoreTextField$lambda$22(q qVar, final TextStyle textStyle, final LegacyTextFieldState legacyTextFieldState, final int i2, final int i3, final boolean z, final boolean z2, final TextFieldScrollerPosition textFieldScrollerPosition, final TextFieldValue textFieldValue, final VisualTransformation visualTransformation, final OverscrollEffect overscrollEffect, final Modifier modifier, final Modifier modifier2, final Modifier modifier3, final Modifier modifier4, final BringIntoViewRequester bringIntoViewRequester, final TextFieldSelectionManager textFieldSelectionManager, final boolean z3, final boolean z4, final WindowInfo windowInfo, final af afVar, final l lVar, final OffsetMapping offsetMapping, final Density density, Composer composer, int i4) {
        if (composer.shouldExecute((i4 & 3) != 2, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-814563849, i4, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous> (CoreTextField.kt:552)");
            }
            qVar.invoke(ComposableLambdaKt.rememberComposableLambda(-44346382, true, new p() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda19
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return CoreTextFieldKt.CoreTextField$lambda$22$0(textStyle, legacyTextFieldState, i2, i3, z, z2, textFieldScrollerPosition, textFieldValue, visualTransformation, overscrollEffect, modifier, modifier2, modifier3, modifier4, bringIntoViewRequester, textFieldSelectionManager, z3, z4, windowInfo, afVar, lVar, offsetMapping, density, (Composer) obj, ((Integer) obj2).intValue());
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
    public static final ab CoreTextField$lambda$22$0(TextStyle textStyle, final LegacyTextFieldState legacyTextFieldState, int i2, int i3, boolean z, boolean z2, TextFieldScrollerPosition textFieldScrollerPosition, final TextFieldValue textFieldValue, VisualTransformation visualTransformation, OverscrollEffect overscrollEffect, Modifier modifier, Modifier modifier2, Modifier modifier3, Modifier modifier4, final BringIntoViewRequester bringIntoViewRequester, final TextFieldSelectionManager textFieldSelectionManager, final boolean z3, final boolean z4, final WindowInfo windowInfo, final af afVar, final l lVar, final OffsetMapping offsetMapping, final Density density, Composer composer, int i4) {
        TextStyle textStyle2;
        final int i5;
        Modifier modifierHeightInLines;
        if (composer.shouldExecute((i4 & 3) != 2, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-44346382, i4, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous> (CoreTextField.kt:555)");
            }
            if (ComposeFoundationFlags.isBasicTextFieldSizeOptimizationEnabled) {
                textStyle2 = textStyle;
                modifierHeightInLines = TextFieldDefaultSizeModifierKt.textFieldSize(Modifier.Companion, textStyle2, legacyTextFieldState, i2, i3, !z);
                i5 = i3;
            } else {
                textStyle2 = textStyle;
                Modifier.Companion companion = Modifier.Companion;
                float fMo3341getHeightForSingleLineFieldD9Ej5fM = legacyTextFieldState.mo3341getHeightForSingleLineFieldD9Ej5fM();
                i5 = i3;
                modifierHeightInLines = HeightInLinesModifierKt.heightInLines(SizeKt.m2809heightInVpY3zN4(companion, fMo3341getHeightForSingleLineFieldD9Ej5fM, Dp.m11169equalsimpl0(fMo3341getHeightForSingleLineFieldD9Ej5fM, 0.0f) ? Dp.Companion.m11184getUnspecifiedD9Ej5fM() : fMo3341getHeightForSingleLineFieldD9Ej5fM), textStyle2, z2, i2, i5);
            }
            Modifier modifier5 = modifierHeightInLines;
            boolean zChangedInstance = composer.changedInstance(legacyTextFieldState);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new a() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda21
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return legacyTextFieldState.getLayoutResult();
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            SimpleLayoutKt.SimpleLayout(BringIntoViewRequesterKt.bringIntoViewRequester(TextFieldScroll_androidKt.textFieldScroll(modifier5, textFieldScrollerPosition, textFieldValue, visualTransformation, overscrollEffect, (a) objRememberedValue).then(modifier).then(modifier2).then(!ComposeFoundationFlags.isBasicTextFieldSizeOptimizationEnabled ? TextFieldSizeKt.textFieldMinSize(Modifier.Companion, textStyle2) : Modifier.Companion).then(modifier3).then(modifier4), bringIntoViewRequester), ComposableLambdaKt.rememberComposableLambda(1412697320, true, new p() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda22
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return CoreTextFieldKt.CoreTextField$lambda$22$0$2(textFieldSelectionManager, legacyTextFieldState, z3, z4, windowInfo, afVar, lVar, textFieldValue, offsetMapping, density, bringIntoViewRequester, i5, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final h.ab CoreTextField$lambda$22$0$2(androidx.compose.foundation.text.selection.TextFieldSelectionManager r14, androidx.compose.foundation.text.LegacyTextFieldState r15, boolean r16, boolean r17, androidx.compose.ui.platform.WindowInfo r18, kotlinx.coroutines.af r19, h.g.a.l r20, androidx.compose.ui.text.input.TextFieldValue r21, androidx.compose.ui.text.input.OffsetMapping r22, androidx.compose.ui.unit.Density r23, androidx.compose.foundation.relocation.BringIntoViewRequester r24, int r25, androidx.compose.runtime.Composer r26, int r27) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField$lambda$22$0$2(androidx.compose.foundation.text.selection.TextFieldSelectionManager, androidx.compose.foundation.text.LegacyTextFieldState, boolean, boolean, androidx.compose.ui.platform.WindowInfo, kotlinx.coroutines.af, h.g.a.l, androidx.compose.ui.text.input.TextFieldValue, androidx.compose.ui.text.input.OffsetMapping, androidx.compose.ui.unit.Density, androidx.compose.foundation.relocation.BringIntoViewRequester, int, androidx.compose.runtime.Composer, int):h.ab");
    }

    static final ab CoreTextField$lambda$23(TextFieldValue textFieldValue, l lVar, Modifier modifier, TextStyle textStyle, VisualTransformation visualTransformation, l lVar2, MutableInteractionSource mutableInteractionSource, Brush brush, boolean z, int i2, int i3, ImeOptions imeOptions, KeyboardActions keyboardActions, boolean z2, boolean z3, q qVar, TextFieldScrollerPosition textFieldScrollerPosition, int i4, int i5, int i6, Composer composer, int i7) {
        CoreTextField(textFieldValue, lVar, modifier, textStyle, visualTransformation, lVar2, mutableInteractionSource, brush, z, i2, i3, imeOptions, keyboardActions, z2, z3, qVar, textFieldScrollerPosition, composer, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldScrollerPosition CoreTextField$lambda$4$0(Orientation orientation) {
        return new TextFieldScrollerPosition(orientation, 0.0f, 2, null);
    }

    private static final void CoreTextFieldRootBox(final Modifier modifier, final TextFieldSelectionManager textFieldSelectionManager, final p<? super Composer, ? super Integer, ab> pVar, Composer composer, final int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(2036174316);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(textFieldSelectionManager) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2036174316, i3, -1, "androidx.compose.foundation.text.CoreTextFieldRootBox (CoreTextField.kt:709)");
            }
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), true);
            int iM = CoreTextFieldKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
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
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ContextMenu_androidKt.ContextMenuArea(textFieldSelectionManager, pVar, composerStartRestartGroup, (i3 >> 3) & 126);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda1
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return CoreTextFieldKt.CoreTextFieldRootBox$lambda$1(modifier, textFieldSelectionManager, pVar, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab CoreTextFieldRootBox$lambda$1(Modifier modifier, TextFieldSelectionManager textFieldSelectionManager, p pVar, int i2, Composer composer, int i3) {
        CoreTextFieldRootBox(modifier, textFieldSelectionManager, pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    private static final void SelectionToolbarAndHandles(final TextFieldSelectionManager textFieldSelectionManager, final boolean z, Composer composer, final int i2) {
        int i3;
        TextLayoutResultProxy layoutResult;
        TextLayoutResult value;
        LegacyTextFieldState state$foundation;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(626339208);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(textFieldSelectionManager) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(z) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(626339208, i3, -1, "androidx.compose.foundation.text.SelectionToolbarAndHandles (CoreTextField.kt:1062)");
            }
            if (z) {
                composerStartRestartGroup.startReplaceGroup(1530097388);
                LegacyTextFieldState state$foundation2 = textFieldSelectionManager.getState$foundation();
                TextLayoutResult textLayoutResult = null;
                if (state$foundation2 != null && (layoutResult = state$foundation2.getLayoutResult()) != null && (value = layoutResult.getValue()) != null && (state$foundation = textFieldSelectionManager.getState$foundation()) != null && !state$foundation.isLayoutResultStale()) {
                    textLayoutResult = value;
                }
                if (textLayoutResult == null) {
                    composerStartRestartGroup.startReplaceGroup(1530097387);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1530097388);
                    if (TextRange.m10540getCollapsedimpl(textFieldSelectionManager.getValue$foundation().m10831getSelectiond9O1mEE())) {
                        composerStartRestartGroup.startReplaceGroup(2110860558);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(2109807302);
                        int iOriginalToTransformed = textFieldSelectionManager.getOffsetMapping$foundation().originalToTransformed(TextRange.m10546getStartimpl(textFieldSelectionManager.getValue$foundation().m10831getSelectiond9O1mEE()));
                        int iOriginalToTransformed2 = textFieldSelectionManager.getOffsetMapping$foundation().originalToTransformed(TextRange.m10541getEndimpl(textFieldSelectionManager.getValue$foundation().m10831getSelectiond9O1mEE()));
                        ResolvedTextDirection bidiRunDirection = textLayoutResult.getBidiRunDirection(iOriginalToTransformed);
                        ResolvedTextDirection bidiRunDirection2 = textLayoutResult.getBidiRunDirection(Math.max(iOriginalToTransformed2 - 1, 0));
                        LegacyTextFieldState state$foundation3 = textFieldSelectionManager.getState$foundation();
                        if (state$foundation3 == null || !state$foundation3.getShowSelectionHandleStart()) {
                            composerStartRestartGroup.startReplaceGroup(2110490542);
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            int i5 = ((i3 << 6) & DisplayStrings.DS_TAP_TO_VERIFY) | 6;
                            composerStartRestartGroup.startReplaceGroup(2110225306);
                            TextFieldSelectionManagerKt.TextFieldSelectionHandle(true, bidiRunDirection, textFieldSelectionManager, composerStartRestartGroup, i5);
                            composerStartRestartGroup.endReplaceGroup();
                        }
                        LegacyTextFieldState state$foundation4 = textFieldSelectionManager.getState$foundation();
                        if (state$foundation4 == null || !state$foundation4.getShowSelectionHandleEnd()) {
                            composerStartRestartGroup.startReplaceGroup(2110838734);
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            int i6 = ((i3 << 6) & DisplayStrings.DS_TAP_TO_VERIFY) | 6;
                            composerStartRestartGroup.startReplaceGroup(2110574459);
                            TextFieldSelectionManagerKt.TextFieldSelectionHandle(false, bidiRunDirection2, textFieldSelectionManager, composerStartRestartGroup, i6);
                            composerStartRestartGroup.endReplaceGroup();
                        }
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    LegacyTextFieldState state$foundation5 = textFieldSelectionManager.getState$foundation();
                    if (state$foundation5 != null) {
                        if (textFieldSelectionManager.isTextChanged$foundation()) {
                            state$foundation5.setShowFloatingToolbar(false);
                        }
                        if (state$foundation5.getHasFocus()) {
                            if (state$foundation5.getShowFloatingToolbar()) {
                                textFieldSelectionManager.showSelectionToolbar$foundation();
                            } else {
                                textFieldSelectionManager.hideSelectionToolbar$foundation();
                            }
                        }
                    }
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1989076778);
                composerStartRestartGroup.endReplaceGroup();
                textFieldSelectionManager.hideSelectionToolbar$foundation();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda18
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return CoreTextFieldKt.SelectionToolbarAndHandles$lambda$1(textFieldSelectionManager, z, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab SelectionToolbarAndHandles$lambda$1(TextFieldSelectionManager textFieldSelectionManager, boolean z, int i2, Composer composer, int i3) {
        SelectionToolbarAndHandles(textFieldSelectionManager, z, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    public static final void TextFieldCursorHandle(final TextFieldSelectionManager textFieldSelectionManager, Composer composer, final int i2) {
        int i3;
        AnnotatedString transformedText$foundation;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1436003720);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(textFieldSelectionManager) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1436003720, i3, -1, "androidx.compose.foundation.text.TextFieldCursorHandle (CoreTextField.kt:1109)");
            }
            LegacyTextFieldState state$foundation = textFieldSelectionManager.getState$foundation();
            if (state$foundation == null || !state$foundation.getShowCursorHandle() || (transformedText$foundation = textFieldSelectionManager.getTransformedText$foundation()) == null || transformedText$foundation.length() <= 0) {
                composerStartRestartGroup.startReplaceGroup(-2111042550);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-2112351432);
                boolean zChanged = composerStartRestartGroup.changed(textFieldSelectionManager);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = textFieldSelectionManager.cursorDragObserver$foundation();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final TextDragObserver textDragObserver = (TextDragObserver) objRememberedValue;
                final long jM3924getCursorPositiontuRUvjQ$foundation = textFieldSelectionManager.m3924getCursorPositiontuRUvjQ$foundation((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity()));
                boolean zChanged2 = composerStartRestartGroup.changed(jM3924getCursorPositiontuRUvjQ$foundation);
                OffsetProvider offsetProviderRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || offsetProviderRememberedValue == Composer.Companion.getEmpty()) {
                    offsetProviderRememberedValue = new OffsetProvider() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$1$1
                        @Override // androidx.compose.foundation.text.selection.OffsetProvider
                        /* renamed from: provide-F1C5BW0 */
                        public final long mo3222provideF1C5BW0() {
                            return jM3924getCursorPositiontuRUvjQ$foundation;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(offsetProviderRememberedValue);
                }
                OffsetProvider offsetProvider = (OffsetProvider) offsetProviderRememberedValue;
                Modifier.Companion companion = Modifier.Companion;
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(textDragObserver) | composerStartRestartGroup.changedInstance(textFieldSelectionManager);
                PointerInputEventHandler pointerInputEventHandlerRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || pointerInputEventHandlerRememberedValue == Composer.Companion.getEmpty()) {
                    pointerInputEventHandlerRememberedValue = new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1

                        /* compiled from: WazeSource */
                        /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1, reason: invalid class name */
                        final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
                            final /* synthetic */ TextFieldSelectionManager $manager;
                            final /* synthetic */ TextDragObserver $observer;
                            final /* synthetic */ PointerInputScope $this_pointerInput;
                            private /* synthetic */ Object L$0;
                            int label;

                            /* compiled from: WazeSource */
                            /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$1, reason: invalid class name and collision with other inner class name */
                            final class C00421 extends g implements p<af, e<? super ab>, Object> {
                                final /* synthetic */ TextDragObserver $observer;
                                final /* synthetic */ PointerInputScope $this_pointerInput;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                C00421(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, e<? super C00421> eVar) {
                                    super(2, eVar);
                                    this.$this_pointerInput = pointerInputScope;
                                    this.$observer = textDragObserver;
                                }

                                @Override // h.c.b.a.a
                                public final e<ab> create(Object obj, e<?> eVar) {
                                    return new C00421(this.$this_pointerInput, this.$observer, eVar);
                                }

                                @Override // h.g.a.p
                                public final Object invoke(af afVar, e<? super ab> eVar) {
                                    return ((C00421) create(afVar, eVar)).invokeSuspend(ab.f48028a);
                                }

                                @Override // h.c.b.a.a
                                public final Object invokeSuspend(Object obj) {
                                    h.c.a.a aVar = h.c.a.a.f48038a;
                                    int i2 = this.label;
                                    if (i2 == 0) {
                                        c.b(obj);
                                        this.label = 1;
                                        if (LongPressTextDragObserverKt.detectDownAndDragGesturesWithObserver(this.$this_pointerInput, this.$observer, this) == aVar) {
                                            return aVar;
                                        }
                                    } else {
                                        if (i2 != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        c.b(obj);
                                    }
                                    return ab.f48028a;
                                }
                            }

                            /* compiled from: WazeSource */
                            /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$2, reason: invalid class name */
                            final class AnonymousClass2 extends g implements p<af, e<? super ab>, Object> {
                                final /* synthetic */ TextFieldSelectionManager $manager;
                                final /* synthetic */ PointerInputScope $this_pointerInput;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                AnonymousClass2(PointerInputScope pointerInputScope, TextFieldSelectionManager textFieldSelectionManager, e<? super AnonymousClass2> eVar) {
                                    super(2, eVar);
                                    this.$this_pointerInput = pointerInputScope;
                                    this.$manager = textFieldSelectionManager;
                                }

                                static final ab invokeSuspend$lambda$0(TextFieldSelectionManager textFieldSelectionManager, Offset offset) {
                                    textFieldSelectionManager.showSelectionToolbar$foundation();
                                    return ab.f48028a;
                                }

                                @Override // h.c.b.a.a
                                public final e<ab> create(Object obj, e<?> eVar) {
                                    return new AnonymousClass2(this.$this_pointerInput, this.$manager, eVar);
                                }

                                @Override // h.g.a.p
                                public final Object invoke(af afVar, e<? super ab> eVar) {
                                    return ((AnonymousClass2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
                                }

                                @Override // h.c.b.a.a
                                public final Object invokeSuspend(Object obj) {
                                    h.c.a.a aVar = h.c.a.a.f48038a;
                                    int i2 = this.label;
                                    if (i2 == 0) {
                                        c.b(obj);
                                        PointerInputScope pointerInputScope = this.$this_pointerInput;
                                        final TextFieldSelectionManager textFieldSelectionManager = this.$manager;
                                        this.label = 1;
                                        if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, 
                                        /*  JADX ERROR: Method code generation error
                                            jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$2$$ExternalSyntheticLambda0, state: NOT_LOADED
                                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                            	at jadx.core.codegen.ConditionGen.addCompare(ConditionGen.java:129)
                                            	at jadx.core.codegen.ConditionGen.add(ConditionGen.java:57)
                                            	at jadx.core.codegen.ConditionGen.add(ConditionGen.java:46)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:115)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                            */
                                        /*
                                            this = this;
                                            h.c.a.a r0 = h.c.a.a.f48038a
                                            int r1 = r9.label
                                            r2 = 1
                                            if (r1 == 0) goto L15
                                            if (r1 != r2) goto Ld
                                            e.b.c.b(r10)
                                            goto L32
                                        Ld:
                                            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                                            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                                            r9.<init>(r10)
                                            throw r9
                                        L15:
                                            e.b.c.b(r10)
                                            androidx.compose.ui.input.pointer.PointerInputScope r1 = r9.$this_pointerInput
                                            androidx.compose.foundation.text.selection.TextFieldSelectionManager r10 = r9.$manager
                                            androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$2$$ExternalSyntheticLambda0 r5 = new androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$2$$ExternalSyntheticLambda0
                                            r5.<init>(r10)
                                            r6 = r9
                                            h.c.e r6 = (h.c.e) r6
                                            r9.label = r2
                                            r7 = 7
                                            r8 = 0
                                            r2 = 0
                                            r3 = 0
                                            r4 = 0
                                            java.lang.Object r9 = androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapGestures$default(r1, r2, r3, r4, r5, r6, r7, r8)
                                            if (r9 != r0) goto L32
                                            return r0
                                        L32:
                                            h.ab r9 = h.ab.f48028a
                                            return r9
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1.AnonymousClass1.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
                                    }
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                AnonymousClass1(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, TextFieldSelectionManager textFieldSelectionManager, e<? super AnonymousClass1> eVar) {
                                    super(2, eVar);
                                    this.$this_pointerInput = pointerInputScope;
                                    this.$observer = textDragObserver;
                                    this.$manager = textFieldSelectionManager;
                                }

                                @Override // h.c.b.a.a
                                public final e<ab> create(Object obj, e<?> eVar) {
                                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_pointerInput, this.$observer, this.$manager, eVar);
                                    anonymousClass1.L$0 = obj;
                                    return anonymousClass1;
                                }

                                @Override // h.g.a.p
                                public final Object invoke(af afVar, e<? super ab> eVar) {
                                    return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
                                }

                                @Override // h.c.b.a.a
                                public final Object invokeSuspend(Object obj) {
                                    h.c.a.a aVar = h.c.a.a.f48038a;
                                    if (this.label != 0) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    c.b(obj);
                                    af afVar = (af) this.L$0;
                                    PointerInputScope pointerInputScope = this.$this_pointerInput;
                                    TextDragObserver textDragObserver = this.$observer;
                                    ag agVar = ag.f51345d;
                                    aj.z(afVar, null, agVar, new C00421(pointerInputScope, textDragObserver, null), 1);
                                    aj.z(afVar, null, agVar, new AnonymousClass2(this.$this_pointerInput, this.$manager, null), 1);
                                    return ab.f48028a;
                                }
                            }

                            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                            public final Object invoke(PointerInputScope pointerInputScope, e<? super ab> eVar) {
                                Object objD = aj.d(new AnonymousClass1(pointerInputScope, textDragObserver, textFieldSelectionManager, null), eVar);
                                return objD == h.c.a.a.f48038a ? objD : ab.f48028a;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(pointerInputEventHandlerRememberedValue);
                    }
                    Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(companion, textDragObserver, (PointerInputEventHandler) pointerInputEventHandlerRememberedValue);
                    boolean zChanged3 = composerStartRestartGroup.changed(jM3924getCursorPositiontuRUvjQ$foundation);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                        objRememberedValue2 = new l() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda16
                            @Override // h.g.a.l
                            public final Object invoke(Object obj) {
                                return CoreTextFieldKt.TextFieldCursorHandle$lambda$3$0(jM3924getCursorPositiontuRUvjQ$foundation, (SemanticsPropertyReceiver) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    AndroidCursorHandle_androidKt.m3202CursorHandleUSBMPiE(offsetProvider, SemanticsModifierKt.semantics(modifierPointerInput, 1 == ((false ? 1 : 0) & ((1 & 1) ^ 1)), (l) objRememberedValue2), 0L, composerStartRestartGroup, 0, 4);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda17
                    @Override // h.g.a.p
                    public final Object invoke(Object obj, Object obj2) {
                        return CoreTextFieldKt.TextFieldCursorHandle$lambda$4(textFieldSelectionManager, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ab TextFieldCursorHandle$lambda$3$0(long j2, SemanticsPropertyReceiver semanticsPropertyReceiver) {
            semanticsPropertyReceiver.set(SelectionHandlesKt.getSelectionHandleInfoKey(), new SelectionHandleInfo(Handle.Cursor, j2, SelectionHandleAnchor.Middle, true, null));
            return ab.f48028a;
        }

        static final ab TextFieldCursorHandle$lambda$4(TextFieldSelectionManager textFieldSelectionManager, int i2, Composer composer, int i3) {
            TextFieldCursorHandle(textFieldSelectionManager, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
            return ab.f48028a;
        }

        private static final Modifier addContextMenuComponents(Modifier modifier, TextFieldSelectionManager textFieldSelectionManager, af afVar) {
            return ComposeFoundationFlags.isNewContextMenuEnabled ? TextFieldSelectionManager_androidKt.addBasicTextFieldTextContextMenuComponents(modifier, textFieldSelectionManager, afVar) : modifier;
        }

        public static final Object bringSelectionEndIntoView(BringIntoViewRequester bringIntoViewRequester, TextFieldValue textFieldValue, TextDelegate textDelegate, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping, e<? super ab> eVar) {
            int iOriginalToTransformed = offsetMapping.originalToTransformed(TextRange.m10543getMaximpl(textFieldValue.m10831getSelectiond9O1mEE()));
            Object objBringIntoView = bringIntoViewRequester.bringIntoView(iOriginalToTransformed < textLayoutResult.getLayoutInput().getText().length() ? textLayoutResult.getBoundingBox(iOriginalToTransformed) : iOriginalToTransformed != 0 ? textLayoutResult.getBoundingBox(iOriginalToTransformed - 1) : new Rect(0.0f, 0.0f, 1.0f, (int) (TextFieldDelegateKt.computeSizeForDefaultText$default(textDelegate.getStyle(), textDelegate.getDensity(), textDelegate.getFontFamilyResolver(), 0, 8, null) & MuxerUtil.UNSIGNED_INT_MAX_VALUE)), eVar);
            return objBringIntoView == h.c.a.a.f48038a ? objBringIntoView : ab.f48028a;
        }

        public static final Modifier defaultTextFieldDraw(Modifier modifier, final LegacyTextFieldState legacyTextFieldState, final TextFieldValue textFieldValue, final OffsetMapping offsetMapping) {
            return DrawModifierKt.drawBehind(modifier, new l() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda20
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return CoreTextFieldKt.defaultTextFieldDraw$lambda$0(legacyTextFieldState, textFieldValue, offsetMapping, (DrawScope) obj);
                }
            });
        }

        static final ab defaultTextFieldDraw$lambda$0(LegacyTextFieldState legacyTextFieldState, TextFieldValue textFieldValue, OffsetMapping offsetMapping, DrawScope drawScope) {
            TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
            if (layoutResult != null) {
                TextFieldDelegate.Companion.m3394drawQ1vqE60$foundation(drawScope.getDrawContext().getCanvas(), textFieldValue, legacyTextFieldState.m3343getSelectionPreviewHighlightRanged9O1mEE(), legacyTextFieldState.m3340getDeletionPreviewHighlightRanged9O1mEE(), offsetMapping, layoutResult.getValue(), legacyTextFieldState.getHighlightPaint(), legacyTextFieldState.m3342getSelectionBackgroundColor0d7_KjU());
            }
            return ab.f48028a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void endInputSession(LegacyTextFieldState legacyTextFieldState) {
            TextInputSession inputSession = legacyTextFieldState.getInputSession();
            if (inputSession != null) {
                TextFieldDelegate.Companion.onBlur$foundation(inputSession, legacyTextFieldState.getProcessor(), legacyTextFieldState.getOnValueChange());
            }
            legacyTextFieldState.setInputSession(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void notifyFocusedRect(LegacyTextFieldState legacyTextFieldState, TextFieldValue textFieldValue, OffsetMapping offsetMapping) {
            TextInputSession inputSession;
            LayoutCoordinates layoutCoordinates;
            Snapshot.Companion companion = Snapshot.Companion;
            Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
            l<Object, ab> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
            try {
                TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
                if (layoutResult != null && (inputSession = legacyTextFieldState.getInputSession()) != null && (layoutCoordinates = legacyTextFieldState.getLayoutCoordinates()) != null) {
                    TextFieldDelegate.Companion.notifyFocusedRect$foundation(textFieldValue, legacyTextFieldState.getTextDelegate(), layoutResult.getValue(), layoutCoordinates, inputSession, legacyTextFieldState.getHasFocus(), offsetMapping);
                }
            } finally {
                companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
            }
        }

        private static final Modifier previewKeyEventToDeselectOnBack(Modifier modifier, final LegacyTextFieldState legacyTextFieldState, final TextFieldSelectionManager textFieldSelectionManager) {
            return KeyInputModifierKt.onPreviewKeyEvent(modifier, new l<KeyEvent, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.previewKeyEventToDeselectOnBack.1
                @Override // h.g.a.l
                public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                    return m3271invokeZmokQxo(keyEvent.m9424unboximpl());
                }

                /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                public final Boolean m3271invokeZmokQxo(android.view.KeyEvent keyEvent) {
                    boolean z = false;
                    if (legacyTextFieldState.getHandleState() == HandleState.Selection && KeyEventHelpers_androidKt.m3274cancelsTextSelectionZmokQxo(keyEvent)) {
                        z = true;
                        TextFieldSelectionManager.m3918deselect_kEHs6E$foundation$default(textFieldSelectionManager, null, 1, null);
                    }
                    return Boolean.valueOf(z);
                }
            });
        }

        public static final void requestFocusAndShowKeyboardIfNeeded(LegacyTextFieldState legacyTextFieldState, FocusRequester focusRequester, boolean z) {
            SoftwareKeyboardController keyboardController;
            if (!legacyTextFieldState.getHasFocus()) {
                FocusRequester.m7885requestFocus3ESFkO8$default(focusRequester, 0, 1, null);
            } else {
                if (!z || (keyboardController = legacyTextFieldState.getKeyboardController()) == null) {
                    return;
                }
                keyboardController.show();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void startInputSession(TextInputService textInputService, LegacyTextFieldState legacyTextFieldState, TextFieldValue textFieldValue, ImeOptions imeOptions, OffsetMapping offsetMapping) {
            legacyTextFieldState.setInputSession(TextFieldDelegate.Companion.onFocus$foundation(textInputService, textFieldValue, legacyTextFieldState.getProcessor(), imeOptions, legacyTextFieldState.getOnValueChange(), legacyTextFieldState.getOnImeActionPerformed()));
            notifyFocusedRect(legacyTextFieldState, textFieldValue, offsetMapping);
        }
    }
