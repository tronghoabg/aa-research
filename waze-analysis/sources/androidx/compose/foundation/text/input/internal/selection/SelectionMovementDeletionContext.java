package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.StringHelpersKt;
import androidx.compose.foundation.text.StringHelpers_androidKt;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.internal.SelectionWedgeAffinity;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.WedgeAffinity;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.b.o;
import h.k.n;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SelectionMovementDeletionContext {
    public static final int NoCharacterFound = -1;
    private final TextFieldCharSequence initialValue;
    private final SelectionWedgeAffinity initialWedgeAffinity;
    private final boolean isFromHardwareSource;
    private final boolean isFromSoftKeyboard;
    private long selection;
    private final TransformedTextFieldState state;
    private final String text;
    private final TextLayoutResult textLayoutResult;
    private final TextFieldPreparedSelectionState textPreparedSelectionState;
    private final float visibleTextLayoutHeight;
    private WedgeAffinity wedgeAffinity;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public SelectionMovementDeletionContext(TransformedTextFieldState transformedTextFieldState, TextLayoutResult textLayoutResult, boolean z, boolean z2, float f2, TextFieldPreparedSelectionState textFieldPreparedSelectionState) {
        this.state = transformedTextFieldState;
        this.textLayoutResult = textLayoutResult;
        this.isFromSoftKeyboard = z;
        this.isFromHardwareSource = z2;
        this.visibleTextLayoutHeight = f2;
        this.textPreparedSelectionState = textFieldPreparedSelectionState;
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        l<Object, ab> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            TextFieldCharSequence visualText = transformedTextFieldState.getVisualText();
            this.initialValue = visualText;
            this.initialWedgeAffinity = transformedTextFieldState.getSelectionWedgeAffinity();
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
            this.selection = visualText.m3484getSelectiond9O1mEE();
            this.text = visualText.getText().toString();
        } catch (Throwable th) {
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
            throw th;
        }
    }

    private final SelectionMovementDeletionContext applyIfNotEmpty(boolean z, l<? super SelectionMovementDeletionContext, ab> lVar) {
        if (z) {
            this.textPreparedSelectionState.resetCachedX();
        }
        if (this.text.length() > 0) {
            lVar.invoke(this);
        }
        return this;
    }

    static /* synthetic */ SelectionMovementDeletionContext applyIfNotEmpty$default(SelectionMovementDeletionContext selectionMovementDeletionContext, boolean z, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0 || z) {
            selectionMovementDeletionContext.textPreparedSelectionState.resetCachedX();
        }
        if (selectionMovementDeletionContext.text.length() > 0) {
            lVar.invoke(selectionMovementDeletionContext);
        }
        return selectionMovementDeletionContext;
    }

    private final int charOffset(int i2) {
        return n.i(i2, this.text.length() - 1);
    }

    private final int getLineEndByOffsetForLayout(TextLayoutResult textLayoutResult, int i2) {
        return textLayoutResult.getLineEnd(textLayoutResult.getLineForOffset(i2), true);
    }

    static /* synthetic */ int getLineEndByOffsetForLayout$default(SelectionMovementDeletionContext selectionMovementDeletionContext, TextLayoutResult textLayoutResult, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = TextRange.m10543getMaximpl(selectionMovementDeletionContext.selection);
        }
        return selectionMovementDeletionContext.getLineEndByOffsetForLayout(textLayoutResult, i2);
    }

    private final int getLineStartByOffsetForLayout(TextLayoutResult textLayoutResult, int i2) {
        return textLayoutResult.getLineStart(textLayoutResult.getLineForOffset(i2));
    }

    static /* synthetic */ int getLineStartByOffsetForLayout$default(SelectionMovementDeletionContext selectionMovementDeletionContext, TextLayoutResult textLayoutResult, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = TextRange.m10544getMinimpl(selectionMovementDeletionContext.selection);
        }
        return selectionMovementDeletionContext.getLineStartByOffsetForLayout(textLayoutResult, i2);
    }

    private final int getNextWordOffsetForLayout(TextLayoutResult textLayoutResult, int i2) {
        while (i2 < this.initialValue.length()) {
            long jM10518getWordBoundaryjx7JFs = textLayoutResult.m10518getWordBoundaryjx7JFs(charOffset(i2));
            if (TextRange.m10541getEndimpl(jM10518getWordBoundaryjx7JFs) > i2) {
                return TextRange.m10541getEndimpl(jM10518getWordBoundaryjx7JFs);
            }
            i2++;
        }
        return this.initialValue.length();
    }

    static /* synthetic */ int getNextWordOffsetForLayout$default(SelectionMovementDeletionContext selectionMovementDeletionContext, TextLayoutResult textLayoutResult, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = TextRange.m10541getEndimpl(selectionMovementDeletionContext.selection);
        }
        return selectionMovementDeletionContext.getNextWordOffsetForLayout(textLayoutResult, i2);
    }

    private final int getPrevWordOffsetForLayout(TextLayoutResult textLayoutResult, int i2) {
        while (i2 > 0) {
            long jM10518getWordBoundaryjx7JFs = textLayoutResult.m10518getWordBoundaryjx7JFs(charOffset(i2));
            if (TextRange.m10546getStartimpl(jM10518getWordBoundaryjx7JFs) < i2) {
                return TextRange.m10546getStartimpl(jM10518getWordBoundaryjx7JFs);
            }
            i2--;
        }
        return 0;
    }

    static /* synthetic */ int getPrevWordOffsetForLayout$default(SelectionMovementDeletionContext selectionMovementDeletionContext, TextLayoutResult textLayoutResult, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = TextRange.m10541getEndimpl(selectionMovementDeletionContext.selection);
        }
        return selectionMovementDeletionContext.getPrevWordOffsetForLayout(textLayoutResult, i2);
    }

    private final boolean isLtr() {
        ResolvedTextDirection paragraphDirection;
        TextLayoutResult textLayoutResult = this.textLayoutResult;
        return textLayoutResult == null || (paragraphDirection = textLayoutResult.getParagraphDirection(TextRange.m10541getEndimpl(this.selection))) == null || paragraphDirection == ResolvedTextDirection.Ltr;
    }

    private final int jumpByLinesOffset(TextLayoutResult textLayoutResult, int i2) {
        int iM10541getEndimpl = TextRange.m10541getEndimpl(this.selection);
        if (Float.isNaN(this.textPreparedSelectionState.getCachedX())) {
            this.textPreparedSelectionState.setCachedX(textLayoutResult.getCursorRect(iM10541getEndimpl).getLeft());
        }
        int lineForOffset = textLayoutResult.getLineForOffset(iM10541getEndimpl) + i2;
        if (lineForOffset < 0) {
            return Integer.MIN_VALUE;
        }
        if (lineForOffset >= textLayoutResult.getLineCount()) {
            return Integer.MAX_VALUE;
        }
        float lineBottom = textLayoutResult.getLineBottom(lineForOffset) - 1.0f;
        float cachedX = this.textPreparedSelectionState.getCachedX();
        if ((isLtr() && cachedX >= textLayoutResult.getLineRight(lineForOffset)) || (!isLtr() && cachedX <= textLayoutResult.getLineLeft(lineForOffset))) {
            return textLayoutResult.getLineEnd(lineForOffset, true);
        }
        return textLayoutResult.m10516getOffsetForPositionk4lQ0M((Float.floatToRawIntBits(cachedX) << 32) | (Float.floatToRawIntBits(lineBottom) & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
    }

    private final int jumpByPagesOffset(int i2) {
        int iM10541getEndimpl = TextRange.m10541getEndimpl(this.initialValue.m3484getSelectiond9O1mEE());
        if (this.textLayoutResult == null || Float.isNaN(this.visibleTextLayoutHeight)) {
            return iM10541getEndimpl;
        }
        Rect rectTranslate = this.textLayoutResult.getCursorRect(iM10541getEndimpl).translate(0.0f, this.visibleTextLayoutHeight * i2);
        float lineBottom = this.textLayoutResult.getLineBottom(this.textLayoutResult.getLineForVerticalPosition(rectTranslate.getTop()));
        float fAbs = Math.abs(rectTranslate.getTop() - lineBottom);
        float fAbs2 = Math.abs(rectTranslate.getBottom() - lineBottom);
        TextLayoutResult textLayoutResult = this.textLayoutResult;
        return fAbs > fAbs2 ? textLayoutResult.m10516getOffsetForPositionk4lQ0M(rectTranslate.m8015getTopLeftF1C5BW0()) : textLayoutResult.m10516getOffsetForPositionk4lQ0M(rectTranslate.m8008getBottomLeftF1C5BW0());
    }

    private final SelectionMovementDeletionContext moveCursorTo(boolean z, a<Integer> aVar) {
        if (z) {
            this.textPreparedSelectionState.resetCachedX();
        }
        if (this.text.length() > 0) {
            int iM10541getEndimpl = TextRange.m10541getEndimpl(m3735getSelectiond9O1mEE());
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(aVar.invoke().intValue(), iM10541getEndimpl, this.state);
            int iM3723component1impl = CursorAndWedgeAffinity.m3723component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity wedgeAffinityM3724component2impl = CursorAndWedgeAffinity.m3724component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (iM3723component1impl != iM10541getEndimpl || !TextRange.m10540getCollapsedimpl(m3735getSelectiond9O1mEE())) {
                m3736setSelection5zctL8(TextRangeKt.TextRange(iM3723component1impl));
            }
            if (wedgeAffinityM3724component2impl != null) {
                setWedgeAffinity(wedgeAffinityM3724component2impl);
            }
        }
        return this;
    }

    static /* synthetic */ SelectionMovementDeletionContext moveCursorTo$default(SelectionMovementDeletionContext selectionMovementDeletionContext, boolean z, a aVar, int i2, Object obj) {
        if ((i2 & 1) != 0 || z) {
            selectionMovementDeletionContext.textPreparedSelectionState.resetCachedX();
        }
        if (selectionMovementDeletionContext.text.length() > 0) {
            int iM10541getEndimpl = TextRange.m10541getEndimpl(selectionMovementDeletionContext.m3735getSelectiond9O1mEE());
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(((Number) aVar.invoke()).intValue(), iM10541getEndimpl, selectionMovementDeletionContext.state);
            int iM3723component1impl = CursorAndWedgeAffinity.m3723component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity wedgeAffinityM3724component2impl = CursorAndWedgeAffinity.m3724component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (iM3723component1impl != iM10541getEndimpl || !TextRange.m10540getCollapsedimpl(selectionMovementDeletionContext.m3735getSelectiond9O1mEE())) {
                selectionMovementDeletionContext.m3736setSelection5zctL8(TextRangeKt.TextRange(iM3723component1impl));
            }
            if (wedgeAffinityM3724component2impl != null) {
                selectionMovementDeletionContext.setWedgeAffinity(wedgeAffinityM3724component2impl);
            }
        }
        return selectionMovementDeletionContext;
    }

    public final SelectionMovementDeletionContext collapseLeftOr(l<? super SelectionMovementDeletionContext, ab> lVar) {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            if (TextRange.m10540getCollapsedimpl(this.selection)) {
                lVar.invoke(this);
                return this;
            }
            boolean zIsLtr = isLtr();
            long j2 = this.selection;
            if (zIsLtr) {
                this.selection = TextRangeKt.TextRange(TextRange.m10544getMinimpl(j2));
                return this;
            }
            this.selection = TextRangeKt.TextRange(TextRange.m10543getMaximpl(j2));
        }
        return this;
    }

    public final SelectionMovementDeletionContext collapseRightOr(l<? super SelectionMovementDeletionContext, ab> lVar) {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            if (TextRange.m10540getCollapsedimpl(this.selection)) {
                lVar.invoke(this);
                return this;
            }
            boolean zIsLtr = isLtr();
            long j2 = this.selection;
            if (zIsLtr) {
                this.selection = TextRangeKt.TextRange(TextRange.m10543getMaximpl(j2));
                return this;
            }
            this.selection = TextRangeKt.TextRange(TextRange.m10544getMinimpl(j2));
        }
        return this;
    }

    public final SelectionMovementDeletionContext deleteMovement() {
        if (this.text.length() > 0) {
            boolean zM10540getCollapsedimpl = TextRange.m10540getCollapsedimpl(this.initialValue.m3484getSelectiond9O1mEE());
            TransformedTextFieldState transformedTextFieldState = this.state;
            if (zM10540getCollapsedimpl) {
                TransformedTextFieldState.m3707replaceTextLepunE$default(transformedTextFieldState, "", TextRangeKt.TextRange(TextRange.m10546getStartimpl(this.initialValue.m3484getSelectiond9O1mEE()), TextRange.m10541getEndimpl(this.selection)), null, !this.isFromSoftKeyboard, this.isFromHardwareSource, 4, null);
            } else {
                transformedTextFieldState.deleteSelectedText(this.isFromHardwareSource);
            }
            this.selection = this.state.getVisualText().m3484getSelectiond9O1mEE();
            this.wedgeAffinity = WedgeAffinity.Start;
        }
        return this;
    }

    public final SelectionMovementDeletionContext deselect() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            this.selection = TextRangeKt.TextRange(TextRange.m10541getEndimpl(this.selection));
        }
        return this;
    }

    public final TextFieldCharSequence getInitialValue() {
        return this.initialValue;
    }

    public final SelectionWedgeAffinity getInitialWedgeAffinity() {
        return this.initialWedgeAffinity;
    }

    public final int getNextCharacterIndex() {
        return StringHelpers_androidKt.findFollowingBreak(this.text, TextRange.m10541getEndimpl(this.selection));
    }

    public final int getPrecedingCharacterIndex() {
        return StringHelpers_androidKt.findPrecedingBreak(this.text, TextRange.m10541getEndimpl(this.selection));
    }

    /* renamed from: getSelection-d9O1mEE, reason: not valid java name */
    public final long m3735getSelectiond9O1mEE() {
        return this.selection;
    }

    public final WedgeAffinity getWedgeAffinity() {
        return this.wedgeAffinity;
    }

    public final SelectionMovementDeletionContext moveCursorDownByLine() {
        TextLayoutResult textLayoutResult = this.textLayoutResult;
        int iJumpByLinesOffset = textLayoutResult != null ? jumpByLinesOffset(textLayoutResult, 1) : Integer.MAX_VALUE;
        if (iJumpByLinesOffset == Integer.MAX_VALUE) {
            this.textPreparedSelectionState.resetCachedX();
        }
        if (this.text.length() > 0) {
            int iM10541getEndimpl = TextRange.m10541getEndimpl(m3735getSelectiond9O1mEE());
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(n.i(iJumpByLinesOffset, this.text.length()), iM10541getEndimpl, this.state);
            int iM3723component1impl = CursorAndWedgeAffinity.m3723component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity wedgeAffinityM3724component2impl = CursorAndWedgeAffinity.m3724component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (iM3723component1impl != iM10541getEndimpl || !TextRange.m10540getCollapsedimpl(m3735getSelectiond9O1mEE())) {
                m3736setSelection5zctL8(TextRangeKt.TextRange(iM3723component1impl));
            }
            if (wedgeAffinityM3724component2impl != null) {
                setWedgeAffinity(wedgeAffinityM3724component2impl);
            }
        }
        return this;
    }

    public final SelectionMovementDeletionContext moveCursorDownByPage() {
        if (this.text.length() > 0) {
            int iM10541getEndimpl = TextRange.m10541getEndimpl(m3735getSelectiond9O1mEE());
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(jumpByPagesOffset(1), iM10541getEndimpl, this.state);
            int iM3723component1impl = CursorAndWedgeAffinity.m3723component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity wedgeAffinityM3724component2impl = CursorAndWedgeAffinity.m3724component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (iM3723component1impl != iM10541getEndimpl || !TextRange.m10540getCollapsedimpl(m3735getSelectiond9O1mEE())) {
                m3736setSelection5zctL8(TextRangeKt.TextRange(iM3723component1impl));
            }
            if (wedgeAffinityM3724component2impl != null) {
                setWedgeAffinity(wedgeAffinityM3724component2impl);
            }
        }
        return this;
    }

    public final SelectionMovementDeletionContext moveCursorLeftByChar() {
        if (isLtr()) {
            moveCursorPrevByChar();
            return this;
        }
        moveCursorNextByChar();
        return this;
    }

    public final SelectionMovementDeletionContext moveCursorLeftByWord() {
        if (isLtr()) {
            moveCursorPrevByWord();
            return this;
        }
        moveCursorNextByWord();
        return this;
    }

    public final SelectionMovementDeletionContext moveCursorNextByChar() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            int iM10541getEndimpl = TextRange.m10541getEndimpl(m3735getSelectiond9O1mEE());
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(StringHelpers_androidKt.findFollowingBreak(this.text, TextRange.m10541getEndimpl(this.selection)), iM10541getEndimpl, this.state);
            int iM3723component1impl = CursorAndWedgeAffinity.m3723component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity wedgeAffinityM3724component2impl = CursorAndWedgeAffinity.m3724component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (iM3723component1impl != iM10541getEndimpl || !TextRange.m10540getCollapsedimpl(m3735getSelectiond9O1mEE())) {
                m3736setSelection5zctL8(TextRangeKt.TextRange(iM3723component1impl));
            }
            if (wedgeAffinityM3724component2impl != null) {
                setWedgeAffinity(wedgeAffinityM3724component2impl);
            }
        }
        return this;
    }

    public final SelectionMovementDeletionContext moveCursorNextByParagraph() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            int iM10541getEndimpl = TextRange.m10541getEndimpl(m3735getSelectiond9O1mEE());
            int iFindParagraphEnd = StringHelpersKt.findParagraphEnd(this.text, TextRange.m10543getMaximpl(this.selection));
            if (iFindParagraphEnd == TextRange.m10543getMaximpl(this.selection) && iFindParagraphEnd != this.text.length()) {
                iFindParagraphEnd = StringHelpersKt.findParagraphEnd(this.text, iFindParagraphEnd + 1);
            }
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(iFindParagraphEnd, iM10541getEndimpl, this.state);
            int iM3723component1impl = CursorAndWedgeAffinity.m3723component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity wedgeAffinityM3724component2impl = CursorAndWedgeAffinity.m3724component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (iM3723component1impl != iM10541getEndimpl || !TextRange.m10540getCollapsedimpl(m3735getSelectiond9O1mEE())) {
                m3736setSelection5zctL8(TextRangeKt.TextRange(iM3723component1impl));
            }
            if (wedgeAffinityM3724component2impl != null) {
                setWedgeAffinity(wedgeAffinityM3724component2impl);
            }
        }
        return this;
    }

    public final SelectionMovementDeletionContext moveCursorNextByWord() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            int iM10541getEndimpl = TextRange.m10541getEndimpl(m3735getSelectiond9O1mEE());
            TextLayoutResult textLayoutResult = this.textLayoutResult;
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(textLayoutResult != null ? getNextWordOffsetForLayout$default(this, textLayoutResult, 0, 1, null) : this.text.length(), iM10541getEndimpl, this.state);
            int iM3723component1impl = CursorAndWedgeAffinity.m3723component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity wedgeAffinityM3724component2impl = CursorAndWedgeAffinity.m3724component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (iM3723component1impl != iM10541getEndimpl || !TextRange.m10540getCollapsedimpl(m3735getSelectiond9O1mEE())) {
                m3736setSelection5zctL8(TextRangeKt.TextRange(iM3723component1impl));
            }
            if (wedgeAffinityM3724component2impl != null) {
                setWedgeAffinity(wedgeAffinityM3724component2impl);
            }
        }
        return this;
    }

    public final SelectionMovementDeletionContext moveCursorPrevByChar() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            int iM10541getEndimpl = TextRange.m10541getEndimpl(m3735getSelectiond9O1mEE());
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(StringHelpers_androidKt.findPrecedingBreak(this.text, TextRange.m10541getEndimpl(this.selection)), iM10541getEndimpl, this.state);
            int iM3723component1impl = CursorAndWedgeAffinity.m3723component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity wedgeAffinityM3724component2impl = CursorAndWedgeAffinity.m3724component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (iM3723component1impl != iM10541getEndimpl || !TextRange.m10540getCollapsedimpl(m3735getSelectiond9O1mEE())) {
                m3736setSelection5zctL8(TextRangeKt.TextRange(iM3723component1impl));
            }
            if (wedgeAffinityM3724component2impl != null) {
                setWedgeAffinity(wedgeAffinityM3724component2impl);
            }
        }
        return this;
    }

    public final SelectionMovementDeletionContext moveCursorPrevByCodePointOrEmoji() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            int iM10541getEndimpl = TextRange.m10541getEndimpl(m3735getSelectiond9O1mEE());
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(StringHelpers_androidKt.findCodePointOrEmojiStartBefore(this.text, TextRange.m10541getEndimpl(this.selection), -1), iM10541getEndimpl, this.state);
            int iM3723component1impl = CursorAndWedgeAffinity.m3723component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity wedgeAffinityM3724component2impl = CursorAndWedgeAffinity.m3724component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (iM3723component1impl != iM10541getEndimpl || !TextRange.m10540getCollapsedimpl(m3735getSelectiond9O1mEE())) {
                m3736setSelection5zctL8(TextRangeKt.TextRange(iM3723component1impl));
            }
            if (wedgeAffinityM3724component2impl != null) {
                setWedgeAffinity(wedgeAffinityM3724component2impl);
            }
        }
        return this;
    }

    public final SelectionMovementDeletionContext moveCursorPrevByParagraph() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            int iM10541getEndimpl = TextRange.m10541getEndimpl(m3735getSelectiond9O1mEE());
            int iFindParagraphStart = StringHelpersKt.findParagraphStart(this.text, TextRange.m10544getMinimpl(this.selection));
            if (iFindParagraphStart == TextRange.m10544getMinimpl(this.selection) && iFindParagraphStart != 0) {
                iFindParagraphStart = StringHelpersKt.findParagraphStart(this.text, iFindParagraphStart - 1);
            }
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(iFindParagraphStart, iM10541getEndimpl, this.state);
            int iM3723component1impl = CursorAndWedgeAffinity.m3723component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity wedgeAffinityM3724component2impl = CursorAndWedgeAffinity.m3724component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (iM3723component1impl != iM10541getEndimpl || !TextRange.m10540getCollapsedimpl(m3735getSelectiond9O1mEE())) {
                m3736setSelection5zctL8(TextRangeKt.TextRange(iM3723component1impl));
            }
            if (wedgeAffinityM3724component2impl != null) {
                setWedgeAffinity(wedgeAffinityM3724component2impl);
            }
        }
        return this;
    }

    public final SelectionMovementDeletionContext moveCursorPrevByWord() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            int iM10541getEndimpl = TextRange.m10541getEndimpl(m3735getSelectiond9O1mEE());
            TextLayoutResult textLayoutResult = this.textLayoutResult;
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(textLayoutResult != null ? getPrevWordOffsetForLayout$default(this, textLayoutResult, 0, 1, null) : 0, iM10541getEndimpl, this.state);
            int iM3723component1impl = CursorAndWedgeAffinity.m3723component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity wedgeAffinityM3724component2impl = CursorAndWedgeAffinity.m3724component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (iM3723component1impl != iM10541getEndimpl || !TextRange.m10540getCollapsedimpl(m3735getSelectiond9O1mEE())) {
                m3736setSelection5zctL8(TextRangeKt.TextRange(iM3723component1impl));
            }
            if (wedgeAffinityM3724component2impl != null) {
                setWedgeAffinity(wedgeAffinityM3724component2impl);
            }
        }
        return this;
    }

    public final SelectionMovementDeletionContext moveCursorRightByChar() {
        if (isLtr()) {
            moveCursorNextByChar();
            return this;
        }
        moveCursorPrevByChar();
        return this;
    }

    public final SelectionMovementDeletionContext moveCursorRightByWord() {
        if (isLtr()) {
            moveCursorNextByWord();
            return this;
        }
        moveCursorPrevByWord();
        return this;
    }

    public final SelectionMovementDeletionContext moveCursorToEnd() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            int iM10541getEndimpl = TextRange.m10541getEndimpl(m3735getSelectiond9O1mEE());
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(this.text.length(), iM10541getEndimpl, this.state);
            int iM3723component1impl = CursorAndWedgeAffinity.m3723component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity wedgeAffinityM3724component2impl = CursorAndWedgeAffinity.m3724component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (iM3723component1impl != iM10541getEndimpl || !TextRange.m10540getCollapsedimpl(m3735getSelectiond9O1mEE())) {
                m3736setSelection5zctL8(TextRangeKt.TextRange(iM3723component1impl));
            }
            if (wedgeAffinityM3724component2impl != null) {
                setWedgeAffinity(wedgeAffinityM3724component2impl);
            }
        }
        return this;
    }

    public final SelectionMovementDeletionContext moveCursorToHome() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            int iM10541getEndimpl = TextRange.m10541getEndimpl(m3735getSelectiond9O1mEE());
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(0, iM10541getEndimpl, this.state);
            int iM3723component1impl = CursorAndWedgeAffinity.m3723component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity wedgeAffinityM3724component2impl = CursorAndWedgeAffinity.m3724component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (iM3723component1impl != iM10541getEndimpl || !TextRange.m10540getCollapsedimpl(m3735getSelectiond9O1mEE())) {
                m3736setSelection5zctL8(TextRangeKt.TextRange(iM3723component1impl));
            }
            if (wedgeAffinityM3724component2impl != null) {
                setWedgeAffinity(wedgeAffinityM3724component2impl);
            }
        }
        return this;
    }

    public final SelectionMovementDeletionContext moveCursorToLineEnd() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            int iM10541getEndimpl = TextRange.m10541getEndimpl(m3735getSelectiond9O1mEE());
            TextLayoutResult textLayoutResult = this.textLayoutResult;
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(textLayoutResult != null ? getLineEndByOffsetForLayout$default(this, textLayoutResult, 0, 1, null) : this.text.length(), iM10541getEndimpl, this.state);
            int iM3723component1impl = CursorAndWedgeAffinity.m3723component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity wedgeAffinityM3724component2impl = CursorAndWedgeAffinity.m3724component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (iM3723component1impl != iM10541getEndimpl || !TextRange.m10540getCollapsedimpl(m3735getSelectiond9O1mEE())) {
                m3736setSelection5zctL8(TextRangeKt.TextRange(iM3723component1impl));
            }
            if (wedgeAffinityM3724component2impl != null) {
                setWedgeAffinity(wedgeAffinityM3724component2impl);
            }
        }
        return this;
    }

    public final SelectionMovementDeletionContext moveCursorToLineLeftSide() {
        if (isLtr()) {
            moveCursorToLineStart();
            return this;
        }
        moveCursorToLineEnd();
        return this;
    }

    public final SelectionMovementDeletionContext moveCursorToLineRightSide() {
        if (isLtr()) {
            moveCursorToLineEnd();
            return this;
        }
        moveCursorToLineStart();
        return this;
    }

    public final SelectionMovementDeletionContext moveCursorToLineStart() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            int iM10541getEndimpl = TextRange.m10541getEndimpl(m3735getSelectiond9O1mEE());
            TextLayoutResult textLayoutResult = this.textLayoutResult;
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(textLayoutResult != null ? getLineStartByOffsetForLayout$default(this, textLayoutResult, 0, 1, null) : 0, iM10541getEndimpl, this.state);
            int iM3723component1impl = CursorAndWedgeAffinity.m3723component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity wedgeAffinityM3724component2impl = CursorAndWedgeAffinity.m3724component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (iM3723component1impl != iM10541getEndimpl || !TextRange.m10540getCollapsedimpl(m3735getSelectiond9O1mEE())) {
                m3736setSelection5zctL8(TextRangeKt.TextRange(iM3723component1impl));
            }
            if (wedgeAffinityM3724component2impl != null) {
                setWedgeAffinity(wedgeAffinityM3724component2impl);
            }
        }
        return this;
    }

    public final SelectionMovementDeletionContext moveCursorUpByLine() {
        TextLayoutResult textLayoutResult = this.textLayoutResult;
        int iJumpByLinesOffset = textLayoutResult != null ? jumpByLinesOffset(textLayoutResult, -1) : Integer.MIN_VALUE;
        if (iJumpByLinesOffset == Integer.MIN_VALUE) {
            this.textPreparedSelectionState.resetCachedX();
        }
        if (this.text.length() > 0) {
            int iM10541getEndimpl = TextRange.m10541getEndimpl(m3735getSelectiond9O1mEE());
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(n.h(iJumpByLinesOffset, 0), iM10541getEndimpl, this.state);
            int iM3723component1impl = CursorAndWedgeAffinity.m3723component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity wedgeAffinityM3724component2impl = CursorAndWedgeAffinity.m3724component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (iM3723component1impl != iM10541getEndimpl || !TextRange.m10540getCollapsedimpl(m3735getSelectiond9O1mEE())) {
                m3736setSelection5zctL8(TextRangeKt.TextRange(iM3723component1impl));
            }
            if (wedgeAffinityM3724component2impl != null) {
                setWedgeAffinity(wedgeAffinityM3724component2impl);
            }
        }
        return this;
    }

    public final SelectionMovementDeletionContext moveCursorUpByPage() {
        if (this.text.length() > 0) {
            int iM10541getEndimpl = TextRange.m10541getEndimpl(m3735getSelectiond9O1mEE());
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(jumpByPagesOffset(-1), iM10541getEndimpl, this.state);
            int iM3723component1impl = CursorAndWedgeAffinity.m3723component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity wedgeAffinityM3724component2impl = CursorAndWedgeAffinity.m3724component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (iM3723component1impl != iM10541getEndimpl || !TextRange.m10540getCollapsedimpl(m3735getSelectiond9O1mEE())) {
                m3736setSelection5zctL8(TextRangeKt.TextRange(iM3723component1impl));
            }
            if (wedgeAffinityM3724component2impl != null) {
                setWedgeAffinity(wedgeAffinityM3724component2impl);
            }
        }
        return this;
    }

    public final SelectionMovementDeletionContext selectAll() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            this.selection = TextRangeKt.TextRange(0, this.text.length());
        }
        return this;
    }

    public final SelectionMovementDeletionContext selectMovement() {
        if (this.text.length() > 0) {
            this.selection = TextRangeKt.TextRange(TextRange.m10546getStartimpl(this.initialValue.m3484getSelectiond9O1mEE()), TextRange.m10541getEndimpl(this.selection));
        }
        return this;
    }

    /* renamed from: setSelection-5zc-tL8, reason: not valid java name */
    public final void m3736setSelection5zctL8(long j2) {
        this.selection = j2;
    }

    public final void setWedgeAffinity(WedgeAffinity wedgeAffinity) {
        this.wedgeAffinity = wedgeAffinity;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
