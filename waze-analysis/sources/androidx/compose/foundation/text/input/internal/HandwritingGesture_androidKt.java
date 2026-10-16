package androidx.compose.foundation.text.input.internal;

import android.graphics.PointF;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.TextGranularity;
import androidx.compose.ui.text.TextInclusionStrategy;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.EditingBuffer;
import androidx.media3.muxer.MuxerUtil;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class HandwritingGesture_androidKt {
    private static final int LINE_FEED_CODE_POINT = 10;
    private static final int NBSP_CODE_POINT = 160;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: adjustHandwritingDeleteGestureRange-72CqOWE, reason: not valid java name */
    public static final long m3539adjustHandwritingDeleteGestureRange72CqOWE(long j2, CharSequence charSequence) {
        int iM10546getStartimpl = TextRange.m10546getStartimpl(j2);
        int iCodePointBefore = iM10546getStartimpl > 0 ? Character.codePointBefore(charSequence, iM10546getStartimpl) : 10;
        int iM10541getEndimpl = TextRange.m10541getEndimpl(j2);
        int iCodePointAt = iM10541getEndimpl < charSequence.length() ? Character.codePointAt(charSequence, iM10541getEndimpl) : 10;
        if (isWhitespaceExceptNewline(iCodePointBefore) && (isWhitespace(iCodePointAt) || isPunctuation(iCodePointAt))) {
            do {
                iM10546getStartimpl -= Character.charCount(iCodePointBefore);
                if (iM10546getStartimpl == 0) {
                    break;
                }
                iCodePointBefore = Character.codePointBefore(charSequence, iM10546getStartimpl);
            } while (isWhitespaceExceptNewline(iCodePointBefore));
            return TextRangeKt.TextRange(iM10546getStartimpl, iM10541getEndimpl);
        }
        if (!isWhitespaceExceptNewline(iCodePointAt)) {
            return j2;
        }
        if (!isWhitespace(iCodePointBefore) && !isPunctuation(iCodePointBefore)) {
            return j2;
        }
        do {
            iM10541getEndimpl += Character.charCount(iCodePointAt);
            if (iM10541getEndimpl == charSequence.length()) {
                break;
            }
            iCodePointAt = Character.codePointAt(charSequence, iM10541getEndimpl);
        } while (isWhitespaceExceptNewline(iCodePointAt));
        return TextRangeKt.TextRange(iM10546getStartimpl, iM10541getEndimpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditCommand compoundEditCommand(final EditCommand... editCommandArr) {
        return new EditCommand() { // from class: androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.compoundEditCommand.1
            @Override // androidx.compose.ui.text.input.EditCommand
            public void applyTo(EditingBuffer editingBuffer) {
                for (EditCommand editCommand : editCommandArr) {
                    editCommand.applyTo(editingBuffer);
                }
            }
        };
    }

    /* renamed from: enclosure-pWDy79M, reason: not valid java name */
    private static final long m3540enclosurepWDy79M(long j2, long j3) {
        return TextRangeKt.TextRange(Math.min(TextRange.m10546getStartimpl(j2), TextRange.m10546getStartimpl(j2)), Math.max(TextRange.m10541getEndimpl(j3), TextRange.m10541getEndimpl(j3)));
    }

    /* renamed from: getLineForHandwritingGesture-d-4ec7I, reason: not valid java name */
    private static final int m3541getLineForHandwritingGestured4ec7I(MultiParagraph multiParagraph, long j2, ViewConfiguration viewConfiguration) {
        float handwritingGestureLineMargin = viewConfiguration != null ? viewConfiguration.getHandwritingGestureLineMargin() : 0.0f;
        int i2 = (int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j2);
        int lineForVerticalPosition = multiParagraph.getLineForVerticalPosition(Float.intBitsToFloat(i2));
        if (Float.intBitsToFloat(i2) >= multiParagraph.getLineTop(lineForVerticalPosition) - handwritingGestureLineMargin && Float.intBitsToFloat(i2) <= multiParagraph.getLineBottom(lineForVerticalPosition) + handwritingGestureLineMargin) {
            int i3 = (int) (j2 >> 32);
            if (Float.intBitsToFloat(i3) >= (-handwritingGestureLineMargin) && Float.intBitsToFloat(i3) <= multiParagraph.getWidth() + handwritingGestureLineMargin) {
                return lineForVerticalPosition;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getOffsetForHandwritingGesture-d-4ec7I, reason: not valid java name */
    public static final int m3542getOffsetForHandwritingGestured4ec7I(LegacyTextFieldState legacyTextFieldState, long j2, ViewConfiguration viewConfiguration) {
        TextLayoutResult value;
        MultiParagraph multiParagraph;
        TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
        if (layoutResult == null || (value = layoutResult.getValue()) == null || (multiParagraph = value.getMultiParagraph()) == null) {
            return -1;
        }
        return m3544getOffsetForHandwritingGestureubNVwUQ(multiParagraph, j2, legacyTextFieldState.getLayoutCoordinates(), viewConfiguration);
    }

    /* renamed from: getOffsetForHandwritingGesture-ubNVwUQ, reason: not valid java name */
    private static final int m3544getOffsetForHandwritingGestureubNVwUQ(MultiParagraph multiParagraph, long j2, LayoutCoordinates layoutCoordinates, ViewConfiguration viewConfiguration) {
        long jMo9749screenToLocalMKHz9U;
        int iM3541getLineForHandwritingGestured4ec7I;
        if (layoutCoordinates == null || (iM3541getLineForHandwritingGestured4ec7I = m3541getLineForHandwritingGestured4ec7I(multiParagraph, (jMo9749screenToLocalMKHz9U = layoutCoordinates.mo9749screenToLocalMKHz9U(j2)), viewConfiguration)) == -1) {
            return -1;
        }
        return multiParagraph.m10407getOffsetForPositionk4lQ0M(Offset.m7974copydBAh8RU$default(jMo9749screenToLocalMKHz9U, 0.0f, (multiParagraph.getLineTop(iM3541getLineForHandwritingGestured4ec7I) + multiParagraph.getLineBottom(iM3541getLineForHandwritingGestured4ec7I)) / 2.0f, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getRangeForRemoveSpaceGesture-5iVPX68, reason: not valid java name */
    public static final long m3545getRangeForRemoveSpaceGesture5iVPX68(TextLayoutResult textLayoutResult, long j2, long j3, LayoutCoordinates layoutCoordinates, ViewConfiguration viewConfiguration) {
        if (textLayoutResult == null || layoutCoordinates == null) {
            return TextRange.Companion.m10551getZerod9O1mEE();
        }
        long jMo9749screenToLocalMKHz9U = layoutCoordinates.mo9749screenToLocalMKHz9U(j2);
        long jMo9749screenToLocalMKHz9U2 = layoutCoordinates.mo9749screenToLocalMKHz9U(j3);
        int iM3541getLineForHandwritingGestured4ec7I = m3541getLineForHandwritingGestured4ec7I(textLayoutResult.getMultiParagraph(), jMo9749screenToLocalMKHz9U, viewConfiguration);
        int iM3541getLineForHandwritingGestured4ec7I2 = m3541getLineForHandwritingGestured4ec7I(textLayoutResult.getMultiParagraph(), jMo9749screenToLocalMKHz9U2, viewConfiguration);
        if (iM3541getLineForHandwritingGestured4ec7I == -1) {
            if (iM3541getLineForHandwritingGestured4ec7I2 == -1) {
                return TextRange.Companion.m10551getZerod9O1mEE();
            }
            iM3541getLineForHandwritingGestured4ec7I = iM3541getLineForHandwritingGestured4ec7I2;
        } else if (iM3541getLineForHandwritingGestured4ec7I2 != -1) {
            iM3541getLineForHandwritingGestured4ec7I = Math.min(iM3541getLineForHandwritingGestured4ec7I, iM3541getLineForHandwritingGestured4ec7I2);
        }
        int i2 = (int) (jMo9749screenToLocalMKHz9U2 >> 32);
        int i3 = (int) (jMo9749screenToLocalMKHz9U >> 32);
        float lineTop = (textLayoutResult.getLineTop(iM3541getLineForHandwritingGestured4ec7I) + textLayoutResult.getLineBottom(iM3541getLineForHandwritingGestured4ec7I)) / 2.0f;
        return textLayoutResult.getMultiParagraph().m10408getRangeForRect86BmAI(new Rect(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i2)), (-0.1f) + lineTop, Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i2)), lineTop + 0.1f), TextGranularity.Companion.m10508getCharacterDRrd7Zo(), TextInclusionStrategy.Companion.getAnyOverlap());
    }

    /* renamed from: getRangeForScreenRect-O048IG0, reason: not valid java name */
    private static final long m3546getRangeForScreenRectO048IG0(MultiParagraph multiParagraph, Rect rect, LayoutCoordinates layoutCoordinates, int i2, TextInclusionStrategy textInclusionStrategy) {
        return (multiParagraph == null || layoutCoordinates == null) ? TextRange.Companion.m10551getZerod9O1mEE() : multiParagraph.m10408getRangeForRect86BmAI(rect.m8017translatek4lQ0M(layoutCoordinates.mo9749screenToLocalMKHz9U(Offset.Companion.m7996getZeroF1C5BW0())), i2, textInclusionStrategy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getRangeForScreenRect-OH9lIzo, reason: not valid java name */
    public static final long m3547getRangeForScreenRectOH9lIzo(LegacyTextFieldState legacyTextFieldState, Rect rect, int i2, TextInclusionStrategy textInclusionStrategy) {
        TextLayoutResult value;
        TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
        MultiParagraph multiParagraph = null;
        if (layoutResult != null && (value = layoutResult.getValue()) != null) {
            multiParagraph = value.getMultiParagraph();
        }
        return m3546getRangeForScreenRectO048IG0(multiParagraph, rect, legacyTextFieldState.getLayoutCoordinates(), i2, textInclusionStrategy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getRangeForScreenRects-O048IG0, reason: not valid java name */
    public static final long m3549getRangeForScreenRectsO048IG0(LegacyTextFieldState legacyTextFieldState, Rect rect, Rect rect2, int i2, TextInclusionStrategy textInclusionStrategy) {
        long jM3547getRangeForScreenRectOH9lIzo = m3547getRangeForScreenRectOH9lIzo(legacyTextFieldState, rect, i2, textInclusionStrategy);
        if (TextRange.m10540getCollapsedimpl(jM3547getRangeForScreenRectOH9lIzo)) {
            return TextRange.Companion.m10551getZerod9O1mEE();
        }
        long jM3547getRangeForScreenRectOH9lIzo2 = m3547getRangeForScreenRectOH9lIzo(legacyTextFieldState, rect2, i2, textInclusionStrategy);
        return TextRange.m10540getCollapsedimpl(jM3547getRangeForScreenRectOH9lIzo2) ? TextRange.Companion.m10551getZerod9O1mEE() : m3540enclosurepWDy79M(jM3547getRangeForScreenRectOH9lIzo, jM3547getRangeForScreenRectOH9lIzo2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isBiDiBoundary(TextLayoutResult textLayoutResult, int i2) {
        int lineForOffset = textLayoutResult.getLineForOffset(i2);
        return (i2 == textLayoutResult.getLineStart(lineForOffset) || i2 == textLayoutResult.getLineEnd(lineForOffset, false & ((2 & 2) == 0))) ? textLayoutResult.getParagraphDirection(i2) != textLayoutResult.getBidiRunDirection(i2) : textLayoutResult.getBidiRunDirection(i2) != textLayoutResult.getBidiRunDirection(i2 + (-1));
    }

    private static final boolean isNewline(int i2) {
        int type = Character.getType(i2);
        return type == 14 || type == 13 || i2 == 10;
    }

    private static final boolean isPunctuation(int i2) {
        int type = Character.getType(i2);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    private static final boolean isWhitespace(int i2) {
        return Character.isWhitespace(i2) || i2 == 160;
    }

    private static final boolean isWhitespaceExceptNewline(int i2) {
        return isWhitespace(i2) && !isNewline(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long rangeOfWhitespaces(CharSequence charSequence, int i2) {
        int iCharCount = i2;
        while (iCharCount > 0) {
            int iCodePointBefore = CodepointHelpers_jvmAndAndroidKt.codePointBefore(charSequence, iCharCount);
            if (!isWhitespace(iCodePointBefore)) {
                break;
            }
            iCharCount -= Character.charCount(iCodePointBefore);
        }
        while (i2 < charSequence.length()) {
            int iCodePointAt = CodepointHelpers_jvmAndAndroidKt.codePointAt(charSequence, i2);
            if (!isWhitespace(iCodePointAt)) {
                break;
            }
            i2 += CodepointHelpers_jvmAndAndroidKt.charCount(iCodePointAt);
        }
        return TextRangeKt.TextRange(iCharCount, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long toOffset(PointF pointF) {
        float f2 = pointF.x;
        float f3 = pointF.y;
        return (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getRangeForScreenRect-OH9lIzo, reason: not valid java name */
    public static final long m3548getRangeForScreenRectOH9lIzo(TextLayoutState textLayoutState, Rect rect, int i2, TextInclusionStrategy textInclusionStrategy) {
        TextLayoutResult layoutResult = textLayoutState.getLayoutResult();
        return m3546getRangeForScreenRectO048IG0(layoutResult != null ? layoutResult.getMultiParagraph() : null, rect, textLayoutState.getTextLayoutNodeCoordinates(), i2, textInclusionStrategy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getOffsetForHandwritingGesture-d-4ec7I, reason: not valid java name */
    public static final int m3543getOffsetForHandwritingGestured4ec7I(TextLayoutState textLayoutState, long j2, ViewConfiguration viewConfiguration) {
        MultiParagraph multiParagraph;
        TextLayoutResult layoutResult = textLayoutState.getLayoutResult();
        if (layoutResult == null || (multiParagraph = layoutResult.getMultiParagraph()) == null) {
            return -1;
        }
        return m3544getOffsetForHandwritingGestureubNVwUQ(multiParagraph, j2, textLayoutState.getTextLayoutNodeCoordinates(), viewConfiguration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getRangeForScreenRects-O048IG0, reason: not valid java name */
    public static final long m3550getRangeForScreenRectsO048IG0(TextLayoutState textLayoutState, Rect rect, Rect rect2, int i2, TextInclusionStrategy textInclusionStrategy) {
        long jM3548getRangeForScreenRectOH9lIzo = m3548getRangeForScreenRectOH9lIzo(textLayoutState, rect, i2, textInclusionStrategy);
        if (TextRange.m10540getCollapsedimpl(jM3548getRangeForScreenRectOH9lIzo)) {
            return TextRange.Companion.m10551getZerod9O1mEE();
        }
        long jM3548getRangeForScreenRectOH9lIzo2 = m3548getRangeForScreenRectOH9lIzo(textLayoutState, rect2, i2, textInclusionStrategy);
        if (TextRange.m10540getCollapsedimpl(jM3548getRangeForScreenRectOH9lIzo2)) {
            return TextRange.Companion.m10551getZerod9O1mEE();
        }
        return m3540enclosurepWDy79M(jM3548getRangeForScreenRectOH9lIzo, jM3548getRangeForScreenRectOH9lIzo2);
    }
}
