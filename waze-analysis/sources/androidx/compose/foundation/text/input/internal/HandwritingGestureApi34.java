package androidx.compose.foundation.text.input.internal;

import android.os.CancellationSignal;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextHighlightType;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextGranularity;
import androidx.compose.ui.text.TextInclusionStrategy;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.DeleteSurroundingTextCommand;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.SetSelectionCommand;
import androidx.core.view.DisplayCompat$$ExternalSyntheticApiModelOutline1;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.b.ao;
import h.g.b.x;
import h.n.g;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class HandwritingGestureApi34 {
    public static final int $stable = 0;
    public static final HandwritingGestureApi34 INSTANCE = new HandwritingGestureApi34();

    private HandwritingGestureApi34() {
    }

    private final int fallback(TransformedTextFieldState transformedTextFieldState, HandwritingGesture handwritingGesture) {
        TextFieldState textFieldState = transformedTextFieldState.textFieldState;
        InputTransformation inputTransformation = transformedTextFieldState.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer$foundation().getChangeTracker$foundation().clearChanges();
        TextFieldBuffer mainBuffer$foundation = textFieldState.getMainBuffer$foundation();
        mainBuffer$foundation.clearHighlight$foundation();
        transformedTextFieldState.updateWedgeAffinity(mainBuffer$foundation);
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
        textFieldState.setUserCommit(true);
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        TransformedTextFieldState.replaceSelectedText$default(transformedTextFieldState, fallbackText, true, null, false, false, 28, null);
        return 5;
    }

    private final int fallbackOnLegacyTextField(HandwritingGesture handwritingGesture, l<? super EditCommand, ab> lVar) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        lVar.invoke(new CommitTextCommand(fallbackText, 1));
        return 5;
    }

    /* renamed from: highlightRange-XJREzCE, reason: not valid java name */
    private final void m3526highlightRangeXJREzCE(TransformedTextFieldState transformedTextFieldState, long j2, int i2) {
        if (!TextRange.m10540getCollapsedimpl(j2)) {
            transformedTextFieldState.m3709highlightCharsIn7RAjNK8(i2, j2);
            return;
        }
        TextFieldState textFieldState = transformedTextFieldState.textFieldState;
        InputTransformation inputTransformation = transformedTextFieldState.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer$foundation().getChangeTracker$foundation().clearChanges();
        TextFieldBuffer mainBuffer$foundation = textFieldState.getMainBuffer$foundation();
        mainBuffer$foundation.clearHighlight$foundation();
        transformedTextFieldState.updateWedgeAffinity(mainBuffer$foundation);
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
        textFieldState.setUserCommit(true);
    }

    private final int performDeleteGesture(LegacyTextFieldState legacyTextFieldState, DeleteGesture deleteGesture, AnnotatedString annotatedString, l<? super EditCommand, ab> lVar) {
        int iM3530toTextGranularityNUwxegE = m3530toTextGranularityNUwxegE(deleteGesture.getGranularity());
        long jM3547getRangeForScreenRectOH9lIzo = HandwritingGesture_androidKt.m3547getRangeForScreenRectOH9lIzo(legacyTextFieldState, RectHelper_androidKt.toComposeRect(deleteGesture.getDeletionArea()), iM3530toTextGranularityNUwxegE, TextInclusionStrategy.Companion.getContainsCenter());
        if (TextRange.m10540getCollapsedimpl(jM3547getRangeForScreenRectOH9lIzo)) {
            return INSTANCE.fallbackOnLegacyTextField(DisplayCompat$$ExternalSyntheticApiModelOutline1.m11781m((Object) deleteGesture), lVar);
        }
        m3528performDeletionOnLegacyTextFieldvJH6DeI(jM3547getRangeForScreenRectOH9lIzo, annotatedString, TextGranularity.m10504equalsimpl0(iM3530toTextGranularityNUwxegE, TextGranularity.Companion.m10509getWordDRrd7Zo()), lVar);
        return 1;
    }

    private final int performDeleteRangeGesture(LegacyTextFieldState legacyTextFieldState, DeleteRangeGesture deleteRangeGesture, AnnotatedString annotatedString, l<? super EditCommand, ab> lVar) {
        int iM3530toTextGranularityNUwxegE = m3530toTextGranularityNUwxegE(deleteRangeGesture.getGranularity());
        long jM3549getRangeForScreenRectsO048IG0 = HandwritingGesture_androidKt.m3549getRangeForScreenRectsO048IG0(legacyTextFieldState, RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionStartArea()), RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionEndArea()), iM3530toTextGranularityNUwxegE, TextInclusionStrategy.Companion.getContainsCenter());
        if (TextRange.m10540getCollapsedimpl(jM3549getRangeForScreenRectsO048IG0)) {
            return INSTANCE.fallbackOnLegacyTextField(DisplayCompat$$ExternalSyntheticApiModelOutline1.m11781m((Object) deleteRangeGesture), lVar);
        }
        m3528performDeletionOnLegacyTextFieldvJH6DeI(jM3549getRangeForScreenRectsO048IG0, annotatedString, TextGranularity.m10504equalsimpl0(iM3530toTextGranularityNUwxegE, TextGranularity.Companion.m10509getWordDRrd7Zo()), lVar);
        return 1;
    }

    /* renamed from: performDeletion-Sb-Bc2M, reason: not valid java name */
    private final void m3527performDeletionSbBc2M(TransformedTextFieldState transformedTextFieldState, long j2, boolean z) {
        if (z) {
            j2 = HandwritingGesture_androidKt.m3539adjustHandwritingDeleteGestureRange72CqOWE(j2, transformedTextFieldState.getVisualText());
        }
        TransformedTextFieldState.m3707replaceTextLepunE$default(transformedTextFieldState, "", j2, null, false, false, 28, null);
    }

    /* renamed from: performDeletionOnLegacyTextField-vJH6DeI, reason: not valid java name */
    private final void m3528performDeletionOnLegacyTextFieldvJH6DeI(long j2, AnnotatedString annotatedString, boolean z, l<? super EditCommand, ab> lVar) {
        if (z) {
            j2 = HandwritingGesture_androidKt.m3539adjustHandwritingDeleteGestureRange72CqOWE(j2, annotatedString);
        }
        lVar.invoke(HandwritingGesture_androidKt.compoundEditCommand(new SetSelectionCommand(TextRange.m10541getEndimpl(j2), TextRange.m10541getEndimpl(j2)), new DeleteSurroundingTextCommand(TextRange.m10542getLengthimpl(j2), 0)));
    }

    private final int performInsertGesture(LegacyTextFieldState legacyTextFieldState, InsertGesture insertGesture, ViewConfiguration viewConfiguration, l<? super EditCommand, ab> lVar) {
        TextLayoutResultProxy layoutResult;
        TextLayoutResult value;
        if (viewConfiguration == null) {
            return fallbackOnLegacyTextField(DisplayCompat$$ExternalSyntheticApiModelOutline1.m11781m((Object) insertGesture), lVar);
        }
        int iM3542getOffsetForHandwritingGestured4ec7I = HandwritingGesture_androidKt.m3542getOffsetForHandwritingGestured4ec7I(legacyTextFieldState, HandwritingGesture_androidKt.toOffset(insertGesture.getInsertionPoint()), viewConfiguration);
        if (iM3542getOffsetForHandwritingGestured4ec7I == -1 || !((layoutResult = legacyTextFieldState.getLayoutResult()) == null || (value = layoutResult.getValue()) == null || !HandwritingGesture_androidKt.isBiDiBoundary(value, iM3542getOffsetForHandwritingGestured4ec7I))) {
            return fallbackOnLegacyTextField(DisplayCompat$$ExternalSyntheticApiModelOutline1.m11781m((Object) insertGesture), lVar);
        }
        performInsertionOnLegacyTextField(iM3542getOffsetForHandwritingGestured4ec7I, insertGesture.getTextToInsert(), lVar);
        return 1;
    }

    private final void performInsertionOnLegacyTextField(int i2, String str, l<? super EditCommand, ab> lVar) {
        lVar.invoke(HandwritingGesture_androidKt.compoundEditCommand(new SetSelectionCommand(i2, i2), new CommitTextCommand(str, 1)));
    }

    private final int performJoinOrSplitGesture(TransformedTextFieldState transformedTextFieldState, JoinOrSplitGesture joinOrSplitGesture, TextLayoutState textLayoutState, ViewConfiguration viewConfiguration) {
        TextLayoutResult layoutResult;
        if (transformedTextFieldState.getOutputText() != transformedTextFieldState.getUntransformedText()) {
            return 3;
        }
        int iM3543getOffsetForHandwritingGestured4ec7I = HandwritingGesture_androidKt.m3543getOffsetForHandwritingGestured4ec7I(textLayoutState, HandwritingGesture_androidKt.toOffset(joinOrSplitGesture.getJoinOrSplitPoint()), viewConfiguration);
        if (iM3543getOffsetForHandwritingGestured4ec7I == -1 || ((layoutResult = textLayoutState.getLayoutResult()) != null && HandwritingGesture_androidKt.isBiDiBoundary(layoutResult, iM3543getOffsetForHandwritingGestured4ec7I))) {
            return fallback(transformedTextFieldState, DisplayCompat$$ExternalSyntheticApiModelOutline1.m11781m((Object) joinOrSplitGesture));
        }
        long jRangeOfWhitespaces = HandwritingGesture_androidKt.rangeOfWhitespaces(transformedTextFieldState.getVisualText(), iM3543getOffsetForHandwritingGestured4ec7I);
        if (TextRange.m10540getCollapsedimpl(jRangeOfWhitespaces)) {
            TransformedTextFieldState.m3707replaceTextLepunE$default(transformedTextFieldState, " ", jRangeOfWhitespaces, null, false, false, 28, null);
        } else {
            m3527performDeletionSbBc2M(transformedTextFieldState, jRangeOfWhitespaces, false);
        }
        return 1;
    }

    private final int performRemoveSpaceGesture(LegacyTextFieldState legacyTextFieldState, RemoveSpaceGesture removeSpaceGesture, AnnotatedString annotatedString, ViewConfiguration viewConfiguration, l<? super EditCommand, ab> lVar) {
        int i2;
        TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
        long jM3545getRangeForRemoveSpaceGesture5iVPX68 = HandwritingGesture_androidKt.m3545getRangeForRemoveSpaceGesture5iVPX68(layoutResult != null ? layoutResult.getValue() : null, HandwritingGesture_androidKt.toOffset(removeSpaceGesture.getStartPoint()), HandwritingGesture_androidKt.toOffset(removeSpaceGesture.getEndPoint()), legacyTextFieldState.getLayoutCoordinates(), viewConfiguration);
        if (TextRange.m10540getCollapsedimpl(jM3545getRangeForRemoveSpaceGesture5iVPX68)) {
            return INSTANCE.fallbackOnLegacyTextField(DisplayCompat$$ExternalSyntheticApiModelOutline1.m11781m((Object) removeSpaceGesture), lVar);
        }
        final ao aoVar = new ao();
        aoVar.f48103a = -1;
        final ao aoVar2 = new ao();
        aoVar2.f48103a = -1;
        String strC = new h.n.l("\\s+").c(TextRangeKt.m10553substringFDrldGo(annotatedString, jM3545getRangeForRemoveSpaceGesture5iVPX68), new l() { // from class: androidx.compose.foundation.text.input.internal.HandwritingGestureApi34$$ExternalSyntheticLambda2
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return HandwritingGestureApi34.performRemoveSpaceGesture$lambda$3(aoVar, aoVar2, (g) obj);
            }
        });
        int i3 = aoVar.f48103a;
        if (i3 == -1 || (i2 = aoVar2.f48103a) == -1) {
            return fallbackOnLegacyTextField(DisplayCompat$$ExternalSyntheticApiModelOutline1.m11781m((Object) removeSpaceGesture), lVar);
        }
        int iM10546getStartimpl = TextRange.m10546getStartimpl(jM3545getRangeForRemoveSpaceGesture5iVPX68) + i3;
        int iM10546getStartimpl2 = TextRange.m10546getStartimpl(jM3545getRangeForRemoveSpaceGesture5iVPX68);
        String strSubstring = strC.substring(i3, strC.length() - (TextRange.m10542getLengthimpl(jM3545getRangeForRemoveSpaceGesture5iVPX68) - aoVar2.f48103a));
        x.e(strSubstring, "substring(...)");
        lVar.invoke(HandwritingGesture_androidKt.compoundEditCommand(new SetSelectionCommand(iM10546getStartimpl, iM10546getStartimpl2 + i2), new CommitTextCommand(strSubstring, 1)));
        return 1;
    }

    static final CharSequence performRemoveSpaceGesture$lambda$1(ao aoVar, ao aoVar2, g gVar) {
        if (aoVar.f48103a == -1) {
            aoVar.f48103a = gVar.c().a();
        }
        aoVar2.f48103a = gVar.c().b() + 1;
        return "";
    }

    static final CharSequence performRemoveSpaceGesture$lambda$3(ao aoVar, ao aoVar2, g gVar) {
        if (aoVar.f48103a == -1) {
            aoVar.f48103a = gVar.c().a();
        }
        aoVar2.f48103a = gVar.c().b() + 1;
        return "";
    }

    private final int performSelectGesture(TransformedTextFieldState transformedTextFieldState, SelectGesture selectGesture, TextLayoutState textLayoutState, a<ab> aVar) {
        long jM3548getRangeForScreenRectOH9lIzo = HandwritingGesture_androidKt.m3548getRangeForScreenRectOH9lIzo(textLayoutState, RectHelper_androidKt.toComposeRect(selectGesture.getSelectionArea()), m3530toTextGranularityNUwxegE(selectGesture.getGranularity()), TextInclusionStrategy.Companion.getContainsCenter());
        if (TextRange.m10540getCollapsedimpl(jM3548getRangeForScreenRectOH9lIzo)) {
            return INSTANCE.fallback(transformedTextFieldState, DisplayCompat$$ExternalSyntheticApiModelOutline1.m11781m((Object) selectGesture));
        }
        transformedTextFieldState.m3715selectCharsIn5zctL8(jM3548getRangeForScreenRectOH9lIzo);
        if (aVar == null) {
            return 1;
        }
        aVar.invoke();
        return 1;
    }

    private final int performSelectRangeGesture(TransformedTextFieldState transformedTextFieldState, SelectRangeGesture selectRangeGesture, TextLayoutState textLayoutState, a<ab> aVar) {
        long jM3550getRangeForScreenRectsO048IG0 = HandwritingGesture_androidKt.m3550getRangeForScreenRectsO048IG0(textLayoutState, RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionStartArea()), RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionEndArea()), m3530toTextGranularityNUwxegE(selectRangeGesture.getGranularity()), TextInclusionStrategy.Companion.getContainsCenter());
        if (TextRange.m10540getCollapsedimpl(jM3550getRangeForScreenRectsO048IG0)) {
            return INSTANCE.fallback(transformedTextFieldState, DisplayCompat$$ExternalSyntheticApiModelOutline1.m11781m((Object) selectRangeGesture));
        }
        transformedTextFieldState.m3715selectCharsIn5zctL8(jM3550getRangeForScreenRectsO048IG0);
        if (aVar == null) {
            return 1;
        }
        aVar.invoke();
        return 1;
    }

    /* renamed from: performSelectionOnLegacyTextField-8ffj60Q, reason: not valid java name */
    private final void m3529performSelectionOnLegacyTextField8ffj60Q(long j2, TextFieldSelectionManager textFieldSelectionManager, l<? super EditCommand, ab> lVar) {
        lVar.invoke(new SetSelectionCommand(TextRange.m10546getStartimpl(j2), TextRange.m10541getEndimpl(j2)));
        if (textFieldSelectionManager != null) {
            textFieldSelectionManager.enterSelectionMode$foundation(true);
        }
    }

    private final void previewDeleteGesture(TransformedTextFieldState transformedTextFieldState, DeleteGesture deleteGesture, TextLayoutState textLayoutState) {
        m3526highlightRangeXJREzCE(transformedTextFieldState, HandwritingGesture_androidKt.m3548getRangeForScreenRectOH9lIzo(textLayoutState, RectHelper_androidKt.toComposeRect(deleteGesture.getDeletionArea()), m3530toTextGranularityNUwxegE(deleteGesture.getGranularity()), TextInclusionStrategy.Companion.getContainsCenter()), TextHighlightType.Companion.m3497getHandwritingDeletePreviewsxJuwY());
    }

    private final void previewDeleteRangeGesture(TransformedTextFieldState transformedTextFieldState, DeleteRangeGesture deleteRangeGesture, TextLayoutState textLayoutState) {
        m3526highlightRangeXJREzCE(transformedTextFieldState, HandwritingGesture_androidKt.m3550getRangeForScreenRectsO048IG0(textLayoutState, RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionStartArea()), RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionEndArea()), m3530toTextGranularityNUwxegE(deleteRangeGesture.getGranularity()), TextInclusionStrategy.Companion.getContainsCenter()), TextHighlightType.Companion.m3497getHandwritingDeletePreviewsxJuwY());
    }

    static final void previewHandwritingGesture$lambda$0(TransformedTextFieldState transformedTextFieldState) {
        TextFieldState textFieldState = transformedTextFieldState.textFieldState;
        InputTransformation inputTransformation = transformedTextFieldState.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer$foundation().getChangeTracker$foundation().clearChanges();
        TextFieldBuffer mainBuffer$foundation = textFieldState.getMainBuffer$foundation();
        mainBuffer$foundation.clearHighlight$foundation();
        transformedTextFieldState.updateWedgeAffinity(mainBuffer$foundation);
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
        textFieldState.setUserCommit(true);
    }

    static final void previewHandwritingGesture$lambda$1(TextFieldSelectionManager textFieldSelectionManager) {
        if (textFieldSelectionManager != null) {
            textFieldSelectionManager.clearPreviewHighlight$foundation();
        }
    }

    private final void previewSelectGesture(TransformedTextFieldState transformedTextFieldState, SelectGesture selectGesture, TextLayoutState textLayoutState) {
        m3526highlightRangeXJREzCE(transformedTextFieldState, HandwritingGesture_androidKt.m3548getRangeForScreenRectOH9lIzo(textLayoutState, RectHelper_androidKt.toComposeRect(selectGesture.getSelectionArea()), m3530toTextGranularityNUwxegE(selectGesture.getGranularity()), TextInclusionStrategy.Companion.getContainsCenter()), TextHighlightType.Companion.m3498getHandwritingSelectPreviewsxJuwY());
    }

    private final void previewSelectRangeGesture(TransformedTextFieldState transformedTextFieldState, SelectRangeGesture selectRangeGesture, TextLayoutState textLayoutState) {
        m3526highlightRangeXJREzCE(transformedTextFieldState, HandwritingGesture_androidKt.m3550getRangeForScreenRectsO048IG0(textLayoutState, RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionStartArea()), RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionEndArea()), m3530toTextGranularityNUwxegE(selectRangeGesture.getGranularity()), TextInclusionStrategy.Companion.getContainsCenter()), TextHighlightType.Companion.m3498getHandwritingSelectPreviewsxJuwY());
    }

    /* renamed from: toTextGranularity-NUwxegE, reason: not valid java name */
    private final int m3530toTextGranularityNUwxegE(int i2) {
        return i2 != 1 ? i2 != 2 ? TextGranularity.Companion.m10508getCharacterDRrd7Zo() : TextGranularity.Companion.m10508getCharacterDRrd7Zo() : TextGranularity.Companion.m10509getWordDRrd7Zo();
    }

    public final int performHandwritingGesture$foundation(LegacyTextFieldState legacyTextFieldState, HandwritingGesture handwritingGesture, TextFieldSelectionManager textFieldSelectionManager, ViewConfiguration viewConfiguration, l<? super EditCommand, ab> lVar) {
        TextLayoutResult value;
        TextLayoutInput layoutInput;
        AnnotatedString untransformedText = legacyTextFieldState.getUntransformedText();
        if (untransformedText == null) {
            return 3;
        }
        TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
        AnnotatedString text = null;
        if (layoutResult != null && (value = layoutResult.getValue()) != null && (layoutInput = value.getLayoutInput()) != null) {
            text = layoutInput.getText();
        }
        if (!x.n(untransformedText, text)) {
            return 3;
        }
        if (DisplayCompat$$ExternalSyntheticApiModelOutline1.m$4(handwritingGesture)) {
            return performSelectGesture(legacyTextFieldState, DisplayCompat$$ExternalSyntheticApiModelOutline1.m11785m((Object) handwritingGesture), textFieldSelectionManager, lVar);
        }
        if (DisplayCompat$$ExternalSyntheticApiModelOutline1.m11796m((Object) handwritingGesture)) {
            return performDeleteGesture(legacyTextFieldState, DisplayCompat$$ExternalSyntheticApiModelOutline1.m11779m((Object) handwritingGesture), untransformedText, lVar);
        }
        if (DisplayCompat$$ExternalSyntheticApiModelOutline1.m$1(handwritingGesture)) {
            return performSelectRangeGesture(legacyTextFieldState, DisplayCompat$$ExternalSyntheticApiModelOutline1.m11786m((Object) handwritingGesture), textFieldSelectionManager, lVar);
        }
        if (DisplayCompat$$ExternalSyntheticApiModelOutline1.m$2(handwritingGesture)) {
            return performDeleteRangeGesture(legacyTextFieldState, DisplayCompat$$ExternalSyntheticApiModelOutline1.m11780m((Object) handwritingGesture), untransformedText, lVar);
        }
        if (DisplayCompat$$ExternalSyntheticApiModelOutline1.m$3(handwritingGesture)) {
            return performJoinOrSplitGesture(legacyTextFieldState, DisplayCompat$$ExternalSyntheticApiModelOutline1.m11783m((Object) handwritingGesture), untransformedText, viewConfiguration, lVar);
        }
        if (DisplayCompat$$ExternalSyntheticApiModelOutline1.m$5(handwritingGesture)) {
            return performInsertGesture(legacyTextFieldState, DisplayCompat$$ExternalSyntheticApiModelOutline1.m11782m((Object) handwritingGesture), viewConfiguration, lVar);
        }
        if (DisplayCompat$$ExternalSyntheticApiModelOutline1.m$6(handwritingGesture)) {
            return performRemoveSpaceGesture(legacyTextFieldState, DisplayCompat$$ExternalSyntheticApiModelOutline1.m11784m((Object) handwritingGesture), untransformedText, viewConfiguration, lVar);
        }
        return 2;
    }

    public final boolean previewHandwritingGesture$foundation(LegacyTextFieldState legacyTextFieldState, PreviewableHandwritingGesture previewableHandwritingGesture, final TextFieldSelectionManager textFieldSelectionManager, CancellationSignal cancellationSignal) {
        TextLayoutResult value;
        TextLayoutInput layoutInput;
        AnnotatedString untransformedText = legacyTextFieldState.getUntransformedText();
        if (untransformedText == null) {
            return false;
        }
        TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
        AnnotatedString text = null;
        if (layoutResult != null && (value = layoutResult.getValue()) != null && (layoutInput = value.getLayoutInput()) != null) {
            text = layoutInput.getText();
        }
        if (!x.n(untransformedText, text)) {
            return false;
        }
        if (DisplayCompat$$ExternalSyntheticApiModelOutline1.m$4(previewableHandwritingGesture)) {
            previewSelectGesture(legacyTextFieldState, DisplayCompat$$ExternalSyntheticApiModelOutline1.m11785m((Object) previewableHandwritingGesture), textFieldSelectionManager);
        } else if (DisplayCompat$$ExternalSyntheticApiModelOutline1.m11796m((Object) previewableHandwritingGesture)) {
            previewDeleteGesture(legacyTextFieldState, DisplayCompat$$ExternalSyntheticApiModelOutline1.m11779m((Object) previewableHandwritingGesture), textFieldSelectionManager);
        } else if (DisplayCompat$$ExternalSyntheticApiModelOutline1.m$1(previewableHandwritingGesture)) {
            previewSelectRangeGesture(legacyTextFieldState, DisplayCompat$$ExternalSyntheticApiModelOutline1.m11786m((Object) previewableHandwritingGesture), textFieldSelectionManager);
        } else {
            if (!DisplayCompat$$ExternalSyntheticApiModelOutline1.m$2(previewableHandwritingGesture)) {
                return false;
            }
            previewDeleteRangeGesture(legacyTextFieldState, DisplayCompat$$ExternalSyntheticApiModelOutline1.m11780m((Object) previewableHandwritingGesture), textFieldSelectionManager);
        }
        if (cancellationSignal == null) {
            return true;
        }
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.compose.foundation.text.input.internal.HandwritingGestureApi34$$ExternalSyntheticLambda3
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                HandwritingGestureApi34.previewHandwritingGesture$lambda$1(textFieldSelectionManager);
            }
        });
        return true;
    }

    private final void previewDeleteGesture(LegacyTextFieldState legacyTextFieldState, DeleteGesture deleteGesture, TextFieldSelectionManager textFieldSelectionManager) {
        if (textFieldSelectionManager != null) {
            textFieldSelectionManager.m3928setDeletionPreviewHighlight5zctL8$foundation(HandwritingGesture_androidKt.m3547getRangeForScreenRectOH9lIzo(legacyTextFieldState, RectHelper_androidKt.toComposeRect(deleteGesture.getDeletionArea()), m3530toTextGranularityNUwxegE(deleteGesture.getGranularity()), TextInclusionStrategy.Companion.getContainsCenter()));
        }
    }

    private final void previewSelectGesture(LegacyTextFieldState legacyTextFieldState, SelectGesture selectGesture, TextFieldSelectionManager textFieldSelectionManager) {
        if (textFieldSelectionManager != null) {
            textFieldSelectionManager.m3930setSelectionPreviewHighlight5zctL8$foundation(HandwritingGesture_androidKt.m3547getRangeForScreenRectOH9lIzo(legacyTextFieldState, RectHelper_androidKt.toComposeRect(selectGesture.getSelectionArea()), m3530toTextGranularityNUwxegE(selectGesture.getGranularity()), TextInclusionStrategy.Companion.getContainsCenter()));
        }
    }

    private final void previewDeleteRangeGesture(LegacyTextFieldState legacyTextFieldState, DeleteRangeGesture deleteRangeGesture, TextFieldSelectionManager textFieldSelectionManager) {
        if (textFieldSelectionManager != null) {
            textFieldSelectionManager.m3928setDeletionPreviewHighlight5zctL8$foundation(HandwritingGesture_androidKt.m3549getRangeForScreenRectsO048IG0(legacyTextFieldState, RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionStartArea()), RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionEndArea()), m3530toTextGranularityNUwxegE(deleteRangeGesture.getGranularity()), TextInclusionStrategy.Companion.getContainsCenter()));
        }
    }

    private final void previewSelectRangeGesture(LegacyTextFieldState legacyTextFieldState, SelectRangeGesture selectRangeGesture, TextFieldSelectionManager textFieldSelectionManager) {
        if (textFieldSelectionManager != null) {
            textFieldSelectionManager.m3930setSelectionPreviewHighlight5zctL8$foundation(HandwritingGesture_androidKt.m3549getRangeForScreenRectsO048IG0(legacyTextFieldState, RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionStartArea()), RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionEndArea()), m3530toTextGranularityNUwxegE(selectRangeGesture.getGranularity()), TextInclusionStrategy.Companion.getContainsCenter()));
        }
    }

    private final int performSelectGesture(LegacyTextFieldState legacyTextFieldState, SelectGesture selectGesture, TextFieldSelectionManager textFieldSelectionManager, l<? super EditCommand, ab> lVar) {
        long jM3547getRangeForScreenRectOH9lIzo = HandwritingGesture_androidKt.m3547getRangeForScreenRectOH9lIzo(legacyTextFieldState, RectHelper_androidKt.toComposeRect(selectGesture.getSelectionArea()), m3530toTextGranularityNUwxegE(selectGesture.getGranularity()), TextInclusionStrategy.Companion.getContainsCenter());
        if (TextRange.m10540getCollapsedimpl(jM3547getRangeForScreenRectOH9lIzo)) {
            return INSTANCE.fallbackOnLegacyTextField(DisplayCompat$$ExternalSyntheticApiModelOutline1.m11781m((Object) selectGesture), lVar);
        }
        m3529performSelectionOnLegacyTextField8ffj60Q(jM3547getRangeForScreenRectOH9lIzo, textFieldSelectionManager, lVar);
        return 1;
    }

    private final int performDeleteGesture(TransformedTextFieldState transformedTextFieldState, DeleteGesture deleteGesture, TextLayoutState textLayoutState) {
        int iM3530toTextGranularityNUwxegE = m3530toTextGranularityNUwxegE(deleteGesture.getGranularity());
        long jM3548getRangeForScreenRectOH9lIzo = HandwritingGesture_androidKt.m3548getRangeForScreenRectOH9lIzo(textLayoutState, RectHelper_androidKt.toComposeRect(deleteGesture.getDeletionArea()), iM3530toTextGranularityNUwxegE, TextInclusionStrategy.Companion.getContainsCenter());
        if (TextRange.m10540getCollapsedimpl(jM3548getRangeForScreenRectOH9lIzo)) {
            return INSTANCE.fallback(transformedTextFieldState, DisplayCompat$$ExternalSyntheticApiModelOutline1.m11781m((Object) deleteGesture));
        }
        m3527performDeletionSbBc2M(transformedTextFieldState, jM3548getRangeForScreenRectOH9lIzo, TextGranularity.m10504equalsimpl0(iM3530toTextGranularityNUwxegE, TextGranularity.Companion.m10509getWordDRrd7Zo()));
        return 1;
    }

    private final int performSelectRangeGesture(LegacyTextFieldState legacyTextFieldState, SelectRangeGesture selectRangeGesture, TextFieldSelectionManager textFieldSelectionManager, l<? super EditCommand, ab> lVar) {
        long jM3549getRangeForScreenRectsO048IG0 = HandwritingGesture_androidKt.m3549getRangeForScreenRectsO048IG0(legacyTextFieldState, RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionStartArea()), RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionEndArea()), m3530toTextGranularityNUwxegE(selectRangeGesture.getGranularity()), TextInclusionStrategy.Companion.getContainsCenter());
        if (TextRange.m10540getCollapsedimpl(jM3549getRangeForScreenRectsO048IG0)) {
            return INSTANCE.fallbackOnLegacyTextField(DisplayCompat$$ExternalSyntheticApiModelOutline1.m11781m((Object) selectRangeGesture), lVar);
        }
        m3529performSelectionOnLegacyTextField8ffj60Q(jM3549getRangeForScreenRectsO048IG0, textFieldSelectionManager, lVar);
        return 1;
    }

    private final int performInsertGesture(TransformedTextFieldState transformedTextFieldState, InsertGesture insertGesture, TextLayoutState textLayoutState, ViewConfiguration viewConfiguration) {
        int iM3543getOffsetForHandwritingGestured4ec7I = HandwritingGesture_androidKt.m3543getOffsetForHandwritingGestured4ec7I(textLayoutState, HandwritingGesture_androidKt.toOffset(insertGesture.getInsertionPoint()), viewConfiguration);
        if (iM3543getOffsetForHandwritingGestured4ec7I != -1) {
            TransformedTextFieldState.m3707replaceTextLepunE$default(transformedTextFieldState, insertGesture.getTextToInsert(), TextRangeKt.TextRange(iM3543getOffsetForHandwritingGestured4ec7I), null, false, false, 28, null);
            return 1;
        }
        return fallback(transformedTextFieldState, DisplayCompat$$ExternalSyntheticApiModelOutline1.m11781m((Object) insertGesture));
    }

    private final int performDeleteRangeGesture(TransformedTextFieldState transformedTextFieldState, DeleteRangeGesture deleteRangeGesture, TextLayoutState textLayoutState) {
        int iM3530toTextGranularityNUwxegE = m3530toTextGranularityNUwxegE(deleteRangeGesture.getGranularity());
        long jM3550getRangeForScreenRectsO048IG0 = HandwritingGesture_androidKt.m3550getRangeForScreenRectsO048IG0(textLayoutState, RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionStartArea()), RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionEndArea()), iM3530toTextGranularityNUwxegE, TextInclusionStrategy.Companion.getContainsCenter());
        if (TextRange.m10540getCollapsedimpl(jM3550getRangeForScreenRectsO048IG0)) {
            return INSTANCE.fallback(transformedTextFieldState, DisplayCompat$$ExternalSyntheticApiModelOutline1.m11781m((Object) deleteRangeGesture));
        }
        m3527performDeletionSbBc2M(transformedTextFieldState, jM3550getRangeForScreenRectsO048IG0, TextGranularity.m10504equalsimpl0(iM3530toTextGranularityNUwxegE, TextGranularity.Companion.m10509getWordDRrd7Zo()));
        return 1;
    }

    private final int performJoinOrSplitGesture(LegacyTextFieldState legacyTextFieldState, JoinOrSplitGesture joinOrSplitGesture, AnnotatedString annotatedString, ViewConfiguration viewConfiguration, l<? super EditCommand, ab> lVar) {
        TextLayoutResultProxy layoutResult;
        TextLayoutResult value;
        if (viewConfiguration != null) {
            int iM3542getOffsetForHandwritingGestured4ec7I = HandwritingGesture_androidKt.m3542getOffsetForHandwritingGestured4ec7I(legacyTextFieldState, HandwritingGesture_androidKt.toOffset(joinOrSplitGesture.getJoinOrSplitPoint()), viewConfiguration);
            if (iM3542getOffsetForHandwritingGestured4ec7I != -1 && ((layoutResult = legacyTextFieldState.getLayoutResult()) == null || (value = layoutResult.getValue()) == null || !HandwritingGesture_androidKt.isBiDiBoundary(value, iM3542getOffsetForHandwritingGestured4ec7I))) {
                long jRangeOfWhitespaces = HandwritingGesture_androidKt.rangeOfWhitespaces(annotatedString, iM3542getOffsetForHandwritingGestured4ec7I);
                if (TextRange.m10540getCollapsedimpl(jRangeOfWhitespaces)) {
                    performInsertionOnLegacyTextField(TextRange.m10546getStartimpl(jRangeOfWhitespaces), " ", lVar);
                } else {
                    m3528performDeletionOnLegacyTextFieldvJH6DeI(jRangeOfWhitespaces, annotatedString, false, lVar);
                }
                return 1;
            }
            return fallbackOnLegacyTextField(DisplayCompat$$ExternalSyntheticApiModelOutline1.m11781m((Object) joinOrSplitGesture), lVar);
        }
        return fallbackOnLegacyTextField(DisplayCompat$$ExternalSyntheticApiModelOutline1.m11781m((Object) joinOrSplitGesture), lVar);
    }

    public final boolean previewHandwritingGesture$foundation(final TransformedTextFieldState transformedTextFieldState, PreviewableHandwritingGesture previewableHandwritingGesture, TextLayoutState textLayoutState, CancellationSignal cancellationSignal) {
        if (DisplayCompat$$ExternalSyntheticApiModelOutline1.m$4(previewableHandwritingGesture)) {
            previewSelectGesture(transformedTextFieldState, DisplayCompat$$ExternalSyntheticApiModelOutline1.m11785m((Object) previewableHandwritingGesture), textLayoutState);
        } else if (DisplayCompat$$ExternalSyntheticApiModelOutline1.m11796m((Object) previewableHandwritingGesture)) {
            previewDeleteGesture(transformedTextFieldState, DisplayCompat$$ExternalSyntheticApiModelOutline1.m11779m((Object) previewableHandwritingGesture), textLayoutState);
        } else if (DisplayCompat$$ExternalSyntheticApiModelOutline1.m$1(previewableHandwritingGesture)) {
            previewSelectRangeGesture(transformedTextFieldState, DisplayCompat$$ExternalSyntheticApiModelOutline1.m11786m((Object) previewableHandwritingGesture), textLayoutState);
        } else {
            if (!DisplayCompat$$ExternalSyntheticApiModelOutline1.m$2(previewableHandwritingGesture)) {
                return false;
            }
            previewDeleteRangeGesture(transformedTextFieldState, DisplayCompat$$ExternalSyntheticApiModelOutline1.m11780m((Object) previewableHandwritingGesture), textLayoutState);
        }
        if (cancellationSignal == null) {
            return true;
        }
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.compose.foundation.text.input.internal.HandwritingGestureApi34$$ExternalSyntheticLambda1
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                HandwritingGestureApi34.previewHandwritingGesture$lambda$0(transformedTextFieldState);
            }
        });
        return true;
    }

    public final int performHandwritingGesture$foundation(TransformedTextFieldState transformedTextFieldState, HandwritingGesture handwritingGesture, TextLayoutState textLayoutState, a<ab> aVar, ViewConfiguration viewConfiguration) {
        if (DisplayCompat$$ExternalSyntheticApiModelOutline1.m$4(handwritingGesture)) {
            return performSelectGesture(transformedTextFieldState, DisplayCompat$$ExternalSyntheticApiModelOutline1.m11785m((Object) handwritingGesture), textLayoutState, aVar);
        }
        if (DisplayCompat$$ExternalSyntheticApiModelOutline1.m11796m((Object) handwritingGesture)) {
            return performDeleteGesture(transformedTextFieldState, DisplayCompat$$ExternalSyntheticApiModelOutline1.m11779m((Object) handwritingGesture), textLayoutState);
        }
        if (DisplayCompat$$ExternalSyntheticApiModelOutline1.m$1(handwritingGesture)) {
            return performSelectRangeGesture(transformedTextFieldState, DisplayCompat$$ExternalSyntheticApiModelOutline1.m11786m((Object) handwritingGesture), textLayoutState, aVar);
        }
        if (DisplayCompat$$ExternalSyntheticApiModelOutline1.m$2(handwritingGesture)) {
            return performDeleteRangeGesture(transformedTextFieldState, DisplayCompat$$ExternalSyntheticApiModelOutline1.m11780m((Object) handwritingGesture), textLayoutState);
        }
        if (DisplayCompat$$ExternalSyntheticApiModelOutline1.m$3(handwritingGesture)) {
            return performJoinOrSplitGesture(transformedTextFieldState, DisplayCompat$$ExternalSyntheticApiModelOutline1.m11783m((Object) handwritingGesture), textLayoutState, viewConfiguration);
        }
        if (DisplayCompat$$ExternalSyntheticApiModelOutline1.m$5(handwritingGesture)) {
            return performInsertGesture(transformedTextFieldState, DisplayCompat$$ExternalSyntheticApiModelOutline1.m11782m((Object) handwritingGesture), textLayoutState, viewConfiguration);
        }
        if (DisplayCompat$$ExternalSyntheticApiModelOutline1.m$6(handwritingGesture)) {
            return performRemoveSpaceGesture(transformedTextFieldState, DisplayCompat$$ExternalSyntheticApiModelOutline1.m11784m((Object) handwritingGesture), textLayoutState, viewConfiguration);
        }
        return 2;
    }

    private final int performRemoveSpaceGesture(TransformedTextFieldState transformedTextFieldState, RemoveSpaceGesture removeSpaceGesture, TextLayoutState textLayoutState, ViewConfiguration viewConfiguration) {
        int i2;
        long jM3545getRangeForRemoveSpaceGesture5iVPX68 = HandwritingGesture_androidKt.m3545getRangeForRemoveSpaceGesture5iVPX68(textLayoutState.getLayoutResult(), HandwritingGesture_androidKt.toOffset(removeSpaceGesture.getStartPoint()), HandwritingGesture_androidKt.toOffset(removeSpaceGesture.getEndPoint()), textLayoutState.getTextLayoutNodeCoordinates(), viewConfiguration);
        if (TextRange.m10540getCollapsedimpl(jM3545getRangeForRemoveSpaceGesture5iVPX68)) {
            return INSTANCE.fallback(transformedTextFieldState, DisplayCompat$$ExternalSyntheticApiModelOutline1.m11781m((Object) removeSpaceGesture));
        }
        final ao aoVar = new ao();
        aoVar.f48103a = -1;
        final ao aoVar2 = new ao();
        aoVar2.f48103a = -1;
        String strC = new h.n.l("\\s+").c(TextRangeKt.m10553substringFDrldGo(transformedTextFieldState.getVisualText(), jM3545getRangeForRemoveSpaceGesture5iVPX68), new l() { // from class: androidx.compose.foundation.text.input.internal.HandwritingGestureApi34$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return HandwritingGestureApi34.performRemoveSpaceGesture$lambda$1(aoVar, aoVar2, (g) obj);
            }
        });
        int i3 = aoVar.f48103a;
        if (i3 != -1 && (i2 = aoVar2.f48103a) != -1) {
            long jTextRange = TextRangeKt.TextRange(TextRange.m10546getStartimpl(jM3545getRangeForRemoveSpaceGesture5iVPX68) + i3, TextRange.m10546getStartimpl(jM3545getRangeForRemoveSpaceGesture5iVPX68) + i2);
            String strSubstring = strC.substring(aoVar.f48103a, strC.length() - (TextRange.m10542getLengthimpl(jM3545getRangeForRemoveSpaceGesture5iVPX68) - aoVar2.f48103a));
            x.e(strSubstring, "substring(...)");
            TransformedTextFieldState.m3707replaceTextLepunE$default(transformedTextFieldState, strSubstring, jTextRange, null, false, false, 28, null);
            return 1;
        }
        return fallback(transformedTextFieldState, DisplayCompat$$ExternalSyntheticApiModelOutline1.m11781m((Object) removeSpaceGesture));
    }
}
