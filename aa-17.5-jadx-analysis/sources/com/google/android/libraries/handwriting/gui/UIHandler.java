package com.google.android.libraries.handwriting.gui;

import android.content.res.Resources;
import android.inputmethodservice.KeyboardView;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import com.google.android.libraries.handwriting.base.HandwritingRecognizer;
import com.google.android.libraries.handwriting.base.LogV;
import com.google.android.libraries.handwriting.base.RecognitionResult;
import com.google.android.libraries.handwriting.base.ScoredCandidate;
import com.google.android.libraries.handwriting.base.Stroke;
import com.google.android.libraries.handwriting.base.StrokeList;
import com.google.android.libraries.handwriting.gui.AbstractCandidateView;
import com.google.android.libraries.handwriting.gui.BookKeeper;
import com.google.android.libraries.handwriting.gui.ImeHandwritingRecognizer;
import com.google.android.libraries.handwriting.gui.UndoButtonInterface;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import defpackage.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class UIHandler extends Handler implements AbstractCandidateView.OnPickSuggestionListener, HandwritingOverlayListener, KeyboardView.OnKeyboardActionListener {
    private static final char CHARACTER_SPACE = ' ';
    private static final String FEEDBACK_ASK_SECONDARY = "ask-secondary";
    private static final String FEEDBACK_AUTO = "auto";
    private static final String FEEDBACK_CONFIRMED = "confirmed";
    private static final String FEEDBACK_FINISHED = "finish";
    private static final String FEEDBACK_ONKEY = "onkey";
    private static final String FEEDBACK_REMOVED_LAST_STROKE = "removed-last-stroke";
    private static final String FEEDBACK_SELECTED = "selected";
    private static final int MSG_AUTO_SELECT_SUGGESTION = 2;
    private static final int MSG_FINISH_COMPOSING = 6;
    private static final int MSG_SET_RESULTS = 1;
    private static final int MSG_SET_RESULTS_FROM_CWM = 3;
    private static final int MSG_SHOW_HINT = 5;
    private static final int MSG_UPDATE_RESULT = 4;
    private static final String TAG = "HWRUIHandler";
    private final int codeSpaceDoubleTap;
    Stroke currentStylusButtonStroke;
    private TextView handwritingHintTextView;
    private String lastHint;
    private final UIHandlerCallback mCallback;
    private AbstractCandidateView mCandidateView;
    private final int mCodeAction;
    private final int mCodeDelete;
    private final int mCodeEmojiMode;
    private final int mCodeGlobe;
    private final int mCodeSpace;
    private View mHandwritingImeView;
    private HandwritingOverlayView mHandwritingOverlayView;
    private final Object mInputConnectionLock;
    private boolean mJustAfterSuggestionSelected;
    private final ImeHandwritingRecognizer mRecognizer;
    private UndoButtonInterface mUndoButtonInterfaceView;
    private View mVoiceButton;
    int mCurrentStrokeStylusButtonState = 0;
    private final BookKeeper mBookKeeper = new BookKeeper();
    private final SpannableStringBuilder mLastCommittedText = new SpannableStringBuilder();
    private boolean mLastConfirmationWasNonSpace = false;
    private String mFullStopCharacter = ".";
    private int hintShownCounter = 0;
    private boolean abortAnimation = false;
    private boolean autoSelectEnabled = true;
    private boolean voiceButtonDesired = true;
    private boolean mInkWasBroughtBack = false;
    private final CursorState mCursorState = new CursorState();
    private String mLastAddedToComposing = "";
    private boolean mResultInkHidden = false;
    ContinuousWritingQueue continuousWritingQueue = new ContinuousWritingQueue(this);

    static class ClickableResult {
        final boolean clickable;
        final RecognitionResult result;

        public ClickableResult(RecognitionResult recognitionResult, boolean z) {
            this.clickable = z;
            this.result = recognitionResult;
        }
    }

    static class ContinuousWritingQueue implements ImeHandwritingRecognizer.RecognitionRunnable.Callback {
        public static final RecognitionResult PENDING_RESULT = new RecognitionResult("");
        public static final String PLACEHOLDER = "…";
        private static final String TAG = "HWRContWritingQueue";
        private final ArrayList<RunnableAndResult> queue = new ArrayList<>();
        private final UIHandler uiHandler;

        private static class RunnableAndResult {
            final int primaryCode;
            RecognitionResult result = ContinuousWritingQueue.PENDING_RESULT;
            final ImeHandwritingRecognizer.RecognitionRunnable runnable;

            public RunnableAndResult(ImeHandwritingRecognizer.RecognitionRunnable recognitionRunnable, int i) {
                this.runnable = recognitionRunnable;
                this.primaryCode = i;
            }
        }

        public ContinuousWritingQueue(UIHandler uIHandler) {
            this.uiHandler = uIHandler;
        }

        public void add(ImeHandwritingRecognizer.RecognitionRunnable recognitionRunnable, int i) {
            LogV.i(3, TAG, "add: ".concat(String.valueOf(String.valueOf(recognitionRunnable))));
            synchronized (this.queue) {
                this.queue.add(new RunnableAndResult(recognitionRunnable, i));
            }
        }

        public void clear() {
            synchronized (this.queue) {
                this.queue.clear();
            }
        }

        @Override // com.google.android.libraries.handwriting.gui.ImeHandwritingRecognizer.RecognitionRunnable.Callback
        public void recognitionEnded(ImeHandwritingRecognizer.RecognitionRunnable recognitionRunnable, StrokeList strokeList, RecognitionResult recognitionResult) {
            RecognitionResult recognitionResult2;
            synchronized (this.queue) {
                String strValueOf = "";
                this.uiHandler.mLastAddedToComposing = "";
                LogV.i(3, "HWRContWritingQueue.recognitionEnded", "start " + String.valueOf(recognitionResult) + " runnable: " + String.valueOf(recognitionRunnable) + " queue.size(): " + this.queue.size());
                Iterator<RunnableAndResult> it = this.queue.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    RunnableAndResult next = it.next();
                    LogV.i(3, "HWRContWritingQueue.recognitionEnded", "trying to insert: " + String.valueOf(next.runnable));
                    if (recognitionRunnable == next.runnable) {
                        next.result = recognitionResult;
                        LogV.i(3, "HWRContWritingQueue.recognitionEnded", "inserting");
                        next.result.setStrokes(strokeList);
                        break;
                    }
                }
                synchronized (this.uiHandler.mInputConnectionLock) {
                    InputConnection currentInputConnection = this.uiHandler.mCallback.getCurrentInputConnection();
                    if (currentInputConnection == null) {
                        return;
                    }
                    currentInputConnection.beginBatchEdit();
                    removePlaceHolderFromComposingTextAndBookkeeper();
                    LogV.i(3, "HWRContWritingQueue.recognitionEnded", "updating composingText");
                    int i = -1;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= this.queue.size()) {
                            break;
                        }
                        LogV.i(3, "HWRContWritingQueue.recognitionEnded", a.bp(i2, "updating composingText "));
                        RunnableAndResult runnableAndResult = this.queue.get(i2);
                        RecognitionResult recognitionResult3 = runnableAndResult.result;
                        if (recognitionResult3 == PENDING_RESULT) {
                            LogV.i(3, "HWRContWritingQueue.recognitionEnded", a.bp(i2, "pending result at "));
                            break;
                        }
                        if (recognitionResult3.numResult() == 0) {
                            LogV.i(3, "HWRContWritingQueue.recognitionEnded", a.bp(i2, "no results at "));
                            break;
                        }
                        LogV.i(3, TAG, a.bp(i2, "not pending at "));
                        String str = runnableAndResult.result.get(0).word;
                        int i3 = i2 + 1;
                        if (i3 < this.queue.size()) {
                            this.uiHandler.addTextToComposingRegion(str, runnableAndResult.result, "", false);
                            if (runnableAndResult.primaryCode != 32 || ImeUiUtils.spaceAfterString(str)) {
                                this.uiHandler.addTextToComposingRegion(String.valueOf((char) runnableAndResult.primaryCode), RecognitionResult.EMPTY, "", false);
                            }
                        }
                        LogV.i(3, "HWRContWritingQueue.recognitionEnded", "BookKeeper: '" + this.uiHandler.mBookKeeper.contentsAsString() + "'");
                        i = i2;
                        i2 = i3;
                    }
                    LogV.i(3, "HWRContWritingQueue.recognitionEnded", a.bp(i, "LastOneThatHasResult: "));
                    if (i != -1) {
                        recognitionResult2 = this.queue.get(i).result;
                        strValueOf = String.valueOf((char) this.queue.get(i).primaryCode);
                    } else {
                        recognitionResult2 = null;
                    }
                    for (int i4 = 0; i4 <= i; i4++) {
                        LogV.i(3, "HWRContWritingQueue.recognitionEnded", a.bp(i4, "Removing from queue: "));
                        if (this.queue.size() > i4) {
                            this.queue.remove(i4);
                        }
                    }
                    if (!this.queue.isEmpty()) {
                        currentInputConnection.finishComposingText();
                        this.uiHandler.clearBookKeeper();
                        LogV.i(3, "HWRContWritingQueue.recognitionEnded", "Appending placeholder");
                        this.uiHandler.addTextToComposingRegion(PLACEHOLDER, PENDING_RESULT, "", false);
                        this.uiHandler.mLastAddedToComposing = "";
                    }
                    LogV.i(3, "HWRUIHandler.recognitionEnded", "Finished updates - composing text: '" + this.uiHandler.getComposingText(currentInputConnection) + "'.");
                    currentInputConnection.endBatchEdit();
                    if (this.queue.isEmpty() && recognitionResult2 != null) {
                        LogV.i(3, "HWRUIHandler.recognitionEnded", "queue.isEmpty()");
                        this.uiHandler.dispatchSetResultsFromCWMToMainThread(recognitionResult2, strValueOf);
                    }
                    LogV.i(3, "HWRContWritingQueue.recognitionEnded", "done");
                }
            }
        }

        @Override // com.google.android.libraries.handwriting.gui.ImeHandwritingRecognizer.RecognitionRunnable.Callback
        public void recognitionFailed(ImeHandwritingRecognizer.RecognitionRunnable recognitionRunnable, StrokeList strokeList, HandwritingRecognizer.RecognitionFailedException recognitionFailedException) {
            Log.e(UIHandler.TAG, "Continuous writing recognition failed. Removing runnable from queue and pretending innocence.");
            ArrayList<RunnableAndResult> arrayList = this.queue;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                RunnableAndResult runnableAndResult = arrayList.get(i);
                i++;
                if (recognitionRunnable == runnableAndResult.runnable) {
                    this.queue.remove(runnableAndResult);
                    if (this.queue.isEmpty()) {
                        removePlaceHolderFromComposingTextAndBookkeeper();
                        return;
                    }
                    return;
                }
            }
        }

        public void removePlaceHolderFromComposingTextAndBookkeeper() {
            synchronized (this.uiHandler.mInputConnectionLock) {
                InputConnection currentInputConnection = this.uiHandler.mCallback.getCurrentInputConnection();
                if (currentInputConnection == null) {
                    return;
                }
                currentInputConnection.beginBatchEdit();
                String composingText = this.uiHandler.getComposingText(currentInputConnection);
                BookKeeper bookKeeper = this.uiHandler.mBookKeeper;
                int iIndexOf = composingText.indexOf(PLACEHOLDER);
                int iIndexOf2 = bookKeeper.contentsAsString().indexOf(PLACEHOLDER);
                if (iIndexOf != iIndexOf2) {
                    LogV.i(1, "HWRUIHandler.recognitionEnded", a.bn(iIndexOf2, "posOfPlaceHolderBk: ", " != posOfPlaceHolder"));
                }
                LogV.i(3, "HWRUIHandler.recognitionEnded", a.bp(iIndexOf, "posOfPlaceHolder: "));
                if (iIndexOf != -1) {
                    bookKeeper.update(iIndexOf, iIndexOf + 1, "", RecognitionResult.EMPTY);
                    currentInputConnection.setComposingText(composingText.substring(0, iIndexOf), 1);
                } else if (iIndexOf2 != -1) {
                    bookKeeper.update(iIndexOf2, iIndexOf2 + 1, "", RecognitionResult.EMPTY);
                }
                currentInputConnection.endBatchEdit();
            }
        }

        public int size() {
            int size;
            synchronized (this.queue) {
                size = this.queue.size();
            }
            return size;
        }
    }

    static class CursorState {
        int composeEnd;
        int composeStart;
        int selectionEnd;
        int selectionStart;

        public String toString() {
            return String.format("cursorState: selection: %d:%d compose: %d:%d", Integer.valueOf(this.selectionStart), Integer.valueOf(this.selectionEnd), Integer.valueOf(this.composeStart), Integer.valueOf(this.composeEnd));
        }

        public void update(int i, int i2, int i3, int i4) {
            this.selectionStart = i;
            this.selectionEnd = i2;
            this.composeStart = i3;
            this.composeEnd = i4;
        }
    }

    private enum Location {
        GONE,
        LEFT,
        RIGHT,
        TOP
    }

    public UIHandler(UIHandlerCallback uIHandlerCallback, ImeHandwritingRecognizer imeHandwritingRecognizer, Object obj) {
        this.mCallback = uIHandlerCallback;
        this.mInputConnectionLock = obj;
        this.mRecognizer = imeHandwritingRecognizer;
        Resources resources = uIHandlerCallback.getContext().getResources();
        this.mCodeSpace = resources.getInteger(com.google.android.projection.gearhead.R.integer.space);
        this.mCodeDelete = resources.getInteger(com.google.android.projection.gearhead.R.integer.delete);
        this.mCodeGlobe = resources.getInteger(com.google.android.projection.gearhead.R.integer.globe_key);
        this.mCodeAction = resources.getInteger(com.google.android.projection.gearhead.R.integer.action);
        this.mCodeEmojiMode = resources.getInteger(com.google.android.projection.gearhead.R.integer.emoji_mode);
        this.codeSpaceDoubleTap = resources.getInteger(com.google.android.projection.gearhead.R.integer.space_double_tap);
        LogV.setLogVerbosity(9);
    }

    private void autoSelectSuggestion(Message message) {
        GuiUtils.assertOnMainThread();
        makeAutoSelectTopCandidate(((RecognitionResult) message.obj).get(0).word);
        setLastConfirmationWasNonSpace(true);
    }

    private void confirmAllInBookkeeper(String str) {
        BookKeeper.RecognitionResultAndSelectedText bookkeepingEntry = null;
        for (int i = 0; i < this.mBookKeeper.size(); i++) {
            if (bookkeepingEntry != this.mBookKeeper.getBookkeepingEntry(i)) {
                bookkeepingEntry = this.mBookKeeper.getBookkeepingEntry(i);
                this.mRecognizer.logFeedback(bookkeepingEntry.selectedWord, str, bookkeepingEntry.recognitionResult, "");
            }
        }
    }

    private void finishComposing() {
        GuiUtils.assertOnMainThread();
        InputConnection currentInputConnection = this.mCallback.getCurrentInputConnection();
        if (currentInputConnection == null) {
            return;
        }
        currentInputConnection.finishComposingText();
    }

    private Location getPreviousInkTargetLocationFromLanguageCode(String str) {
        return ImeUiUtils.isRTLLanguage(str) ? Location.RIGHT : ImeUiUtils.isAutoLanguage(str) ? Location.GONE : Location.LEFT;
    }

    private boolean handleButtonStateChange(float f, float f2, long j, float f3, int i) {
        if (i == 0) {
            if (this.mCurrentStrokeStylusButtonState == 0) {
                return false;
            }
            i = 0;
        }
        if (this.mCurrentStrokeStylusButtonState == 0) {
            this.mCurrentStrokeStylusButtonState = i;
            Stroke currentStroke = this.mRecognizer.getCurrentStroke();
            this.currentStylusButtonStroke = currentStroke;
            Log.i(TAG, "currentStylusButtonStroke: ".concat(String.valueOf(String.valueOf(currentStroke))));
            this.mRecognizer.resetCurrentStroke();
        }
        this.currentStylusButtonStroke.addPoint(f, f2, j, f3);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void lastThingFromBookkeeperDisplay(boolean r15) {
        /*
            r14 = this;
            r14.resetAbortAnimation()
            java.lang.String r2 = "lastThingFromBookkeeperdisplay: "
            java.lang.String r2 = defpackage.a.bR(r15, r2)
            r3 = 2
            java.lang.String r4 = "HWRUIHandler"
            com.google.android.libraries.handwriting.base.LogV.i(r3, r4, r2)
            java.lang.String r2 = r14.getLanguage()
            com.google.android.libraries.handwriting.gui.UIHandler$Location r2 = r14.getPreviousInkTargetLocationFromLanguageCode(r2)
            com.google.android.libraries.handwriting.gui.HandwritingOverlayView r4 = r14.mHandwritingOverlayView
            r4.clear()
            com.google.android.libraries.handwriting.gui.BookKeeper r4 = r14.mBookKeeper
            com.google.android.libraries.handwriting.gui.BookKeeper$RecognitionResultAndSelectedText r4 = r4.getLastEntry()
            if (r4 != 0) goto L25
            return
        L25:
            com.google.android.libraries.handwriting.base.RecognitionResult r5 = r4.recognitionResult
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r6 = "TAG"
            java.lang.String r7 = "lastthingFromBookkeperdisplay: "
            java.lang.String r5 = r7.concat(r5)
            r7 = 3
            com.google.android.libraries.handwriting.base.LogV.i(r7, r6, r5)
            com.google.android.libraries.handwriting.base.RecognitionResult r4 = r4.recognitionResult
            com.google.android.libraries.handwriting.base.StrokeList r6 = r4.getStrokes()
            com.google.android.libraries.handwriting.base.BoundingBox r4 = new com.google.android.libraries.handwriting.base.BoundingBox
            r4.<init>(r6)
            com.google.android.libraries.handwriting.gui.UndoButtonInterface$UndoButtonState r5 = com.google.android.libraries.handwriting.gui.UndoButtonInterface.UndoButtonState.BACK
            r14.setUndoButtonState(r5)
            android.graphics.Paint r13 = new android.graphics.Paint
            com.google.android.libraries.handwriting.gui.HandwritingOverlayView r5 = r14.mHandwritingOverlayView
            android.graphics.Paint r5 = r5.getStrokePreviouslyRecognizedPaint()
            r13.<init>(r5)
            int r2 = r2.ordinal()
            r5 = 1
            r8 = 0
            if (r2 == r5) goto L81
            r5 = 1063675494(0x3f666666, float:0.9)
            if (r2 == r3) goto L73
            if (r2 == r7) goto L6b
            r2 = 0
            r13.setAlpha(r2)
            r7 = r8
            goto L8a
        L6b:
            float r2 = r4.bottom()
            float r2 = r2 * r5
            r7 = r8
            r8 = r2
            goto L8a
        L73:
            com.google.android.libraries.handwriting.gui.ImeHandwritingRecognizer r2 = r14.mRecognizer
            int r2 = r2.getWritingGuideWidth()
            float r2 = (float) r2
            float r4 = r4.left()
            float r2 = r2 - r4
            float r2 = r2 * r5
            goto L89
        L81:
            float r2 = r4.right()
            r4 = -1083808154(0xffffffffbf666666, float:-0.9)
            float r2 = r2 * r4
        L89:
            r7 = r2
        L8a:
            if (r15 == 0) goto Lb2
            android.view.animation.Interpolator r0 = r14.getInterpolator()
            float[] r2 = new float[r3]
            r2 = {x00c0: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r2)
            android.animation.ArgbEvaluator r5 = new android.animation.ArgbEvaluator
            r5.<init>()
            r3 = 400(0x190, double:1.976E-321)
            r2.setDuration(r3)
            r3 = r0
            com.google.android.libraries.handwriting.gui.UIHandler$2 r0 = new com.google.android.libraries.handwriting.gui.UIHandler$2
            r1 = r14
            r4 = r13
            r0.<init>(r1)
            r2.addUpdateListener(r0)
            r2.start()
            return
        Lb2:
            r4 = r13
            com.google.android.libraries.handwriting.gui.HandwritingOverlayView r0 = r14.mHandwritingOverlayView
            r10 = 1065353216(0x3f800000, float:1.0)
            r9 = r6
            r11 = r7
            r12 = r8
            r8 = r0
            r8.replaceAnimationStrokes(r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.handwriting.gui.UIHandler.lastThingFromBookkeeperDisplay(boolean):void");
    }

    private void onSpaceDoubleTap() {
        String strValueOf = String.valueOf(this.mFullStopCharacter);
        InputConnection currentInputConnection = this.mCallback.getCurrentInputConnection();
        if (currentInputConnection != null && shouldReplacePeriod(currentInputConnection.getTextBeforeCursor(3, 0))) {
            String strConcat = strValueOf.concat(" ");
            if (this.mCallback.replaceLastCharacter(strConcat)) {
                LogV.i(3, TAG, a.bq(strConcat, "replaced space by '", "' after space double tap."));
                return;
            }
        }
        onKeyNormal(32);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetAbortAnimation() {
        this.abortAnimation = false;
    }

    private void resetButtonState() {
        this.mCurrentStrokeStylusButtonState = 0;
        this.currentStylusButtonStroke = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void setResults(int r9, com.google.android.libraries.handwriting.gui.UIHandler.ClickableResult r10) {
        /*
            r8 = this;
            java.lang.String r0 = "handleMessage: selectionIsEmpty:"
            com.google.android.libraries.handwriting.gui.GuiUtils.assertOnMainThread()
            com.google.android.libraries.handwriting.base.RecognitionResult r1 = r10.result
            monitor-enter(r8)
            java.lang.String r2 = "HWRUIHandler.handleMessage"
            java.lang.String r3 = "results="
            java.lang.String r4 = "result: "
            java.lang.String r3 = defpackage.a.bL(r1, r10, r3, r4)     // Catch: java.lang.Throwable -> Lbb
            r4 = 3
            com.google.android.libraries.handwriting.base.LogV.i(r4, r2, r3)     // Catch: java.lang.Throwable -> Lbb
            com.google.android.libraries.handwriting.gui.AbstractCandidateView r2 = r8.mCandidateView     // Catch: java.lang.Throwable -> Lbb
            if (r2 == 0) goto L28
            com.google.android.libraries.handwriting.base.RecognitionResult r2 = r2.getCurrentResult()     // Catch: java.lang.Throwable -> Lbb
            int r2 = r2.getFirstStrokeId()     // Catch: java.lang.Throwable -> Lbb
            int r3 = r1.getFirstStrokeId()     // Catch: java.lang.Throwable -> Lbb
            if (r2 < r3) goto L2b
        L28:
            if (r9 != r4) goto L2f
            r9 = r4
        L2b:
            java.lang.String r2 = ""
            r8.mLastAddedToComposing = r2     // Catch: java.lang.Throwable -> Lbb
        L2f:
            boolean r10 = r10.clickable     // Catch: java.lang.Throwable -> Lbb
            r8.updateResultsInCandidateView(r1, r10)     // Catch: java.lang.Throwable -> Lbb
            com.google.android.libraries.handwriting.base.RecognitionResult r10 = com.google.android.libraries.handwriting.base.RecognitionResult.EMPTY     // Catch: java.lang.Throwable -> Lbb
            r2 = 0
            r3 = 1
            if (r1 == r10) goto L43
            int r10 = r1.numResult()     // Catch: java.lang.Throwable -> Lbb
            if (r10 != 0) goto L41
            goto L43
        L41:
            r10 = r2
            goto L44
        L43:
            r10 = r3
        L44:
            android.view.View r5 = r8.mVoiceButton     // Catch: java.lang.Throwable -> Lbb
            if (r5 == 0) goto L54
            r6 = 8
            if (r10 == 0) goto L51
            boolean r7 = r8.voiceButtonDesired     // Catch: java.lang.Throwable -> Lbb
            if (r7 == 0) goto L51
            r6 = r2
        L51:
            r5.setVisibility(r6)     // Catch: java.lang.Throwable -> Lbb
        L54:
            java.lang.String r5 = "HWRUIHandler"
            boolean r6 = r8.selectionIsEmpty()     // Catch: java.lang.Throwable -> Lbb
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbb
            r7.<init>(r0)     // Catch: java.lang.Throwable -> Lbb
            r7.append(r6)     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r0 = " resultWithoutCandidates:"
            r7.append(r0)     // Catch: java.lang.Throwable -> Lbb
            r7.append(r10)     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r10 = r7.toString()     // Catch: java.lang.Throwable -> Lbb
            android.util.Log.i(r5, r10)     // Catch: java.lang.Throwable -> Lbb
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Lbb
            if (r9 != r3) goto L75
            goto Lba
        L75:
            r10 = 4
            if (r9 != r10) goto L8e
            int r9 = r1.numResult()
            if (r9 <= 0) goto Lba
            boolean r9 = r8.autoSelectEnabled
            if (r9 == 0) goto Lba
            com.google.android.libraries.handwriting.base.ScoredCandidate r9 = r1.get(r2)
            java.lang.String r9 = r9.word
            java.lang.String r10 = r8.mLastAddedToComposing
            r8.addTextToComposingRegion(r9, r1, r10, r3)
            return
        L8e:
            if (r9 != r4) goto Lba
            int r9 = r1.numResult()
            if (r9 <= 0) goto La1
            com.google.android.libraries.handwriting.base.ScoredCandidate r9 = r1.get(r2)
            java.lang.String r9 = r9.word
            java.lang.String r10 = r8.mLastAddedToComposing
            r8.addTextToComposingRegion(r9, r1, r10, r3)
        La1:
            com.google.android.libraries.handwriting.gui.ImeHandwritingRecognizer r9 = r8.mRecognizer
            com.google.android.libraries.handwriting.base.StrokeList r9 = r9.strokes()
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto Lba
            com.google.android.libraries.handwriting.gui.ImeHandwritingRecognizer r9 = r8.mRecognizer
            com.google.android.libraries.handwriting.base.Stroke r9 = r9.currentStroke
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto Lba
            r8.lastThingFromBookkeeperDisplay(r2)
        Lba:
            return
        Lbb:
            r9 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Lbb
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.handwriting.gui.UIHandler.setResults(int, com.google.android.libraries.handwriting.gui.UIHandler$ClickableResult):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUndoButtonState(UndoButtonInterface.UndoButtonState undoButtonState) {
        LogV.i(3, TAG, "setUndoButtonState: ".concat(String.valueOf(String.valueOf(undoButtonState))));
        UndoButtonInterface undoButtonInterface = this.mUndoButtonInterfaceView;
        if (undoButtonInterface == null) {
            LogV.i(3, TAG, "setUndoButtonVisible: FAIL");
        } else {
            undoButtonInterface.setState(undoButtonState);
            LogV.i(3, TAG, "setUndoButtonVisible: Done");
        }
    }

    private boolean shouldAddPeriod(int i) {
        return Character.isLetterOrDigit(i);
    }

    private boolean shouldReplacePeriod(CharSequence charSequence) {
        int length = charSequence != null ? charSequence.length() : 0;
        if (length >= 2) {
            int i = length - 1;
            if (charSequence.charAt(i) == ' ' && shouldAddPeriod(Character.codePointBefore(charSequence, i))) {
                return true;
            }
        }
        return false;
    }

    private void startContinuousWritingRequest(int i) {
        LogV.i(3, TAG, a.bp(i, "startContinuousWritingRequest "));
        StrokeList strokeList = new StrokeList(this.mRecognizer.strokes(), true);
        maybeInsertPlaceHolderIntoComposingRegion();
        ImeHandwritingRecognizer.RecognitionRunnable recognitionRunnableCreateRecognitionRunnable = this.mRecognizer.createRecognitionRunnable(strokeList, this.continuousWritingQueue);
        this.continuousWritingQueue.add(recognitionRunnableCreateRecognitionRunnable, i);
        this.mRecognizer.recognitionExecutor.submit(recognitionRunnableCreateRecognitionRunnable);
    }

    private void updatePreAndPostContextInRecognizer() {
        this.mRecognizer.setPreContext(getPreContext());
        this.mRecognizer.setPostContext(getPostContext());
    }

    public void abortAnimation() {
        this.abortAnimation = true;
    }

    public void addTextToComposingRegion(CharSequence charSequence, RecognitionResult recognitionResult, String str, boolean z) {
        LogV.i(2, "HWRUIHandler.addTextToComposingRegion", "text: '" + String.valueOf(charSequence) + "' mLastAdded: '" + str + "'");
        String strContentsAsString = this.mBookKeeper.contentsAsString();
        LogV.i(1, "HWRUIHandler.addTextToComposingRegion", "currentComposingText: ".concat(String.valueOf(strContentsAsString)));
        if (strContentsAsString.endsWith(str)) {
            strContentsAsString = strContentsAsString.substring(0, strContentsAsString.length() - str.length());
        }
        Log.i(TAG, "currentComposingText: ".concat(String.valueOf(strContentsAsString)));
        String strConcat = String.valueOf(strContentsAsString).concat(String.valueOf(String.valueOf(charSequence)));
        Log.i(TAG, a.bq(strConcat, "newComposingText: '", "'"));
        synchronized (this.mInputConnectionLock) {
            InputConnection currentInputConnection = this.mCallback.getCurrentInputConnection();
            if (currentInputConnection == null) {
                return;
            }
            currentInputConnection.setComposingText(strConcat, 1);
            this.mBookKeeper.update(strContentsAsString.length(), this.mBookKeeper.size(), charSequence.toString(), recognitionResult);
            if (z) {
                this.mLastAddedToComposing = charSequence.toString();
            }
            Log.i(TAG, "addTextToComposingRegion - done: ".concat(String.valueOf(this.mBookKeeper.contentsAsString())));
        }
    }

    public void askTheRecognizerAgain() {
        RecognitionResult recognitionResult;
        LogV.i(3, "HWRUIHandler.askTheRecognizerAgain", "start");
        cancelAutoSelect();
        setResultInkHidden(false);
        ImeHandwritingRecognizer imeHandwritingRecognizer = this.mRecognizer;
        LogV.i(3, "HWRUIHandler.askTheRecognizerAgain", "mLastAdded: " + this.mLastAddedToComposing + " strokes:" + imeHandwritingRecognizer.strokes().size());
        this.mBookKeeper.logState();
        this.mHandwritingOverlayView.clear();
        if (this.mRecognizer.strokes().isEmpty()) {
            BookKeeper.RecognitionResultAndSelectedText lastEntry = this.mBookKeeper.getLastEntry();
            if (lastEntry == null || (recognitionResult = lastEntry.recognitionResult) == null || recognitionResult == RecognitionResult.EMPTY || recognitionResult.getStrokes().isEmpty()) {
                LogV.i(3, TAG, "No ink. Forgetting it.");
                return;
            }
            LogV.i(3, "HWRUIHandler.askTheRecognizerAgain", "strokes: " + lastEntry.recognitionResult.getStrokes().size());
            this.mRecognizer.setStrokes(lastEntry.recognitionResult.getStrokes());
            String str = lastEntry.selectedWord;
            this.mLastAddedToComposing = str;
            this.mRecognizer.logFeedback(str, FEEDBACK_ASK_SECONDARY, lastEntry.recognitionResult, "");
        }
        LogV.i(3, "HWRUIHandler.askTheRecognizerAgain", "strokes: " + this.mRecognizer.strokes().size());
        LogV.i(3, "HWRUIHandler.askTheRecognizerAgain", "mLastAdded: ".concat(String.valueOf(this.mLastAddedToComposing)));
        this.mHandwritingOverlayView.drawStrokeList(this.mRecognizer.strokes(), false);
        this.mRecognizer.askTheRecognizerAgain();
    }

    public void cancelAutoSelect() {
        this.mJustAfterSuggestionSelected = false;
        removeMessages(2);
    }

    public void cancelRecognitionTasks() {
        if (this.continuousWritingQueue.size() > 0) {
            this.continuousWritingQueue.removePlaceHolderFromComposingTextAndBookkeeper();
            this.continuousWritingQueue.clear();
        }
        this.mRecognizer.cancelAllRunningRecognitionTasks();
    }

    public void clearBookKeeper() {
        this.mBookKeeper.clear();
    }

    public void clearRecognizer() {
        LogV.i(3, TAG, "clearRecognizer");
        abortAnimation();
        HandwritingOverlayView handwritingOverlayView = this.mHandwritingOverlayView;
        if (handwritingOverlayView != null) {
            handwritingOverlayView.clear();
        }
        this.mRecognizer.clear();
        setUndoButtonState(UndoButtonInterface.UndoButtonState.NONE);
        this.mLastAddedToComposing = "";
        setResultInkHidden(false);
        updatePreAndPostContextInRecognizer();
        setHintText(this.lastHint);
    }

    public void clearResults() {
        dispatchSetResultsToMainThread(RecognitionResult.EMPTY, false);
        this.mJustAfterSuggestionSelected = false;
    }

    public void commitText(CharSequence charSequence) {
        LogV.i(2, TAG, ".commitText: ".concat(String.valueOf(String.valueOf(charSequence))));
        synchronized (this.mInputConnectionLock) {
            InputConnection currentInputConnection = this.mCallback.getCurrentInputConnection();
            if (currentInputConnection != null) {
                currentInputConnection.commitText(charSequence, 1);
            }
        }
    }

    public void dispatchAutoSelectSuggestionToMainThread(RecognitionResult recognitionResult, int i) {
        LogV.i(2, TAG, "dispatchAutoSelectSuggestionToMainThread: Triggering auto select of " + recognitionResult.get(0).word + " in " + i + "ms.");
        sendMessageDelayed(obtainMessage(2, recognitionResult), (long) i);
    }

    public void dispatchFinishComposingToMainThread() {
        obtainMessage(6).sendToTarget();
    }

    public void dispatchSetResultsFromCWMToMainThread(RecognitionResult recognitionResult, String str) {
        this.mRecognizer.logFeedback(recognitionResult.get(0).word, FEEDBACK_ONKEY, recognitionResult, "cont");
        LogV.i(2, TAG, "Set results From CWM: ".concat(String.valueOf(String.valueOf(recognitionResult))));
        for (int i = 0; i < recognitionResult.numResult(); i++) {
            ScoredCandidate scoredCandidate = recognitionResult.get(i);
            String strValueOf = String.valueOf(scoredCandidate.word);
            String strValueOf2 = String.valueOf(str);
            recognitionResult.set(i, new ScoredCandidate(strValueOf.concat(strValueOf2), scoredCandidate.score, scoredCandidate.completions));
        }
        obtainMessage(3, new ClickableResult(recognitionResult, true)).sendToTarget();
    }

    public void dispatchSetResultsToMainThread(RecognitionResult recognitionResult, boolean z) {
        LogV.i(2, TAG, "Set results: ".concat(String.valueOf(String.valueOf(recognitionResult))));
        obtainMessage(1, new ClickableResult(recognitionResult, z)).sendToTarget();
    }

    public void dispatchUpdateResultsToMainThread(RecognitionResult recognitionResult) {
        LogV.i(2, TAG, "dispatchUpdateResultsToMainThread: ".concat(String.valueOf(String.valueOf(recognitionResult))));
        obtainMessage(4, new ClickableResult(recognitionResult, true)).sendToTarget();
    }

    public void errorMessage(int i, Exception exc, String str) {
        Log.e(TAG, "errorMessage: (" + i + ") " + str, exc);
        if ((exc instanceof HandwritingRecognizer.RecognitionFailedException) && (((HandwritingRecognizer.RecognitionFailedException) exc).getCause() instanceof IOException)) {
            Log.e(TAG, "network problems: prompting for ondevice recognition");
            this.mCallback.cloudRecognitionFailed();
        }
    }

    public void finishAndClear() {
        GuiUtils.assertOnMainThread();
        dispatchFinishComposingToMainThread();
        cancelAutoSelect();
        clearRecognizer();
        clearResults();
        clearBookKeeper();
    }

    public void finishInput(boolean z) {
        confirmAllInBookkeeper(FEEDBACK_FINISHED);
        InputConnection currentInputConnection = this.mCallback.getCurrentInputConnection();
        if (currentInputConnection != null) {
            currentInputConnection.finishComposingText();
        }
        cancelAutoSelect();
        clearRecognizer();
        clearResults();
        this.mBookKeeper.clear();
    }

    public String getComposingText(InputConnection inputConnection) {
        return this.mBookKeeper.contentsAsString();
    }

    public int getDeleteCode() {
        return this.mCodeDelete;
    }

    public HandwritingOverlayView getHandwritingOverlayView() {
        return this.mHandwritingOverlayView;
    }

    public Interpolator getInterpolator() {
        return new PathInterpolator(0.4f, BitmapDescriptorFactory.HUE_RED, 0.2f, 1.0f);
    }

    public String getLanguage() {
        return this.mRecognizer.getLanguage();
    }

    public boolean getLastConfirmationWasNonSpace() {
        LogV.i(2, TAG, "getLastConfirmationWasNonSpace: " + this.mLastConfirmationWasNonSpace);
        return this.mLastConfirmationWasNonSpace;
    }

    public String getPostContext() {
        CharSequence textAfterCursor;
        InputConnection currentInputConnection = this.mCallback.getCurrentInputConnection();
        return (currentInputConnection == null || (textAfterCursor = currentInputConnection.getTextAfterCursor(20, 0)) == null) ? "" : textAfterCursor.toString();
    }

    public String getPreContext() {
        InputConnection currentInputConnection = this.mCallback.getCurrentInputConnection();
        if (currentInputConnection == null) {
            LogV.i(1, TAG, "problem with IC");
            return "";
        }
        CharSequence textBeforeCursor = currentInputConnection.getTextBeforeCursor(20, 0);
        if (textBeforeCursor == null) {
            LogV.i(1, TAG, "no text before cursor");
            return "";
        }
        String string = textBeforeCursor.toString();
        LogV.i(1, TAG, "preContext = ".concat(String.valueOf(string)));
        return string;
    }

    public int getSpaceCode() {
        return this.mCodeSpace;
    }

    public UIHandlerCallback getUIHandlerCallback() {
        return this.mCallback;
    }

    public boolean goBackToPreviousResult() {
        LogV.i(3, TAG, "goBackToPreviousResult");
        if (!this.mRecognizer.strokes().isEmpty()) {
            LogV.i(3, TAG, "fling is only allowed if the recognizer is empty");
            return false;
        }
        BookKeeper.RecognitionResultAndSelectedText lastEntry = this.mBookKeeper.getLastEntry();
        if (lastEntry == null) {
            LogV.i(3, TAG, "fling is only allowed if there is something to fling back");
            return false;
        }
        dispatchSetResultsToMainThread(lastEntry.recognitionResult, true);
        setResultInkHidden(false);
        this.mInkWasBroughtBack = true;
        this.mHandwritingOverlayView.clear();
        if (this.mRecognizer.strokes().isEmpty()) {
            BookKeeper.RecognitionResultAndSelectedText lastEntry2 = this.mBookKeeper.getLastEntry();
            LogV.i(3, TAG, "strokes: " + lastEntry2.recognitionResult.getStrokes().size());
            this.mRecognizer.setStrokes(this.mBookKeeper.getLastEntry().recognitionResult.getStrokes());
            this.mLastAddedToComposing = lastEntry2.selectedWord;
        }
        this.mHandwritingOverlayView.drawStrokeList(this.mRecognizer.strokes(), false);
        cancelAutoSelect();
        return true;
    }

    public boolean handleButtonStateChangePenUp(float f, float f2, long j, float f3, int i) {
        if (!handleButtonStateChange(f, f2, j, f3, i)) {
            return false;
        }
        StrokeList strokeListStrokes = this.mRecognizer.strokes();
        for (int size = strokeListStrokes.size() - 1; size >= 0; size--) {
            if (Stroke.strokeCutPoint(strokeListStrokes.get(size), this.currentStylusButtonStroke) != -1) {
                strokeListStrokes.remove(size);
            }
        }
        this.mHandwritingOverlayView.clear();
        this.mHandwritingOverlayView.drawStrokeList(this.mRecognizer.strokes(), false);
        if (strokeListStrokes.isEmpty()) {
            finishAndClear();
        } else {
            this.mRecognizer.askTheRecognizerAgain();
        }
        resetButtonState();
        return true;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        LogV.i(3, "HWRUIHandler.handleMessage", "Handling message: ".concat(String.valueOf(String.valueOf(message))));
        switch (message.what) {
            case 1:
            case 3:
            case 4:
                setResults(message.what, (ClickableResult) message.obj);
                break;
            case 2:
                autoSelectSuggestion(message);
                break;
            case 5:
                setHandwritingHintVisibilityForString((String) message.obj);
                break;
            case 6:
                finishComposing();
                break;
            default:
                super.handleMessage(message);
                break;
        }
    }

    public void imeViewAttachedToWindow() {
        LogV.i(2, TAG, "imeAttachedToWindow");
    }

    public boolean imeVisible() {
        View view = this.mHandwritingImeView;
        if (view == null) {
            LogV.i(3, TAG, "imeVisible: false");
            return false;
        }
        boolean z = view.getWindowVisibility() == 0;
        LogV.i(3, TAG, a.bR(z, "imeVisible: "));
        return z;
    }

    public void insertLastInkHash() {
        commitText(this.mBookKeeper.lastHash());
    }

    public boolean isVoiceButtonDesired() {
        return this.voiceButtonDesired;
    }

    public void makeAutoSelectTopCandidate(CharSequence charSequence) {
        LogV.i(2, "HWRUIHandler.makeAutoSelectTopCandidate", "Auto select received ".concat(String.valueOf(String.valueOf(charSequence))));
        if (this.mJustAfterSuggestionSelected) {
            LogV.i(2, "HWRUIHandler.makeAutoSelectTopCandidate", "mJustAfterSuggestionSelected -> cancelling auto select");
        } else {
            LogV.i(2, "HWRUIHandler.makeAutoSelectTopCandidate", "!mJustAfterSuggestionSelected doing it");
            this.mRecognizer.logFeedback(charSequence.toString(), FEEDBACK_AUTO, this.mCandidateView.getCurrentResult(), "");
            putResultIntoComposingRegion(charSequence, false, CHARACTER_SPACE);
        }
        this.mJustAfterSuggestionSelected = true;
    }

    public void maybeInsertPlaceHolderIntoComposingRegion() {
        LogV.i(3, TAG, "maybeInsertPlaceHolder");
        if (this.continuousWritingQueue.size() != 0 || this.mBookKeeper.contentsAsString().contains(ContinuousWritingQueue.PLACEHOLDER)) {
            return;
        }
        LogV.i(3, TAG, "YESInsertPlaceHolder");
        addTextToComposingRegion(ContinuousWritingQueue.PLACEHOLDER, ContinuousWritingQueue.PENDING_RESULT, this.mLastAddedToComposing, false);
    }

    @Override // android.inputmethodservice.KeyboardView.OnKeyboardActionListener
    public void onKey(int i, int[] iArr) {
        LogV.i(1, TAG, a.bp(i, "onKey "));
        cancelAutoSelect();
        if (i >= 0) {
            onKeyNormal(i);
        } else if (i == this.mCodeDelete) {
            onKeyDelete();
        } else if (i == this.mCodeGlobe) {
            HandwritingAnalytics.pressedGlobeKey();
            this.mCallback.switchToNextInputMethod();
        } else if (i == this.mCodeEmojiMode) {
            Log.i(TAG, "mCodeEmojiMode");
            this.mCallback.toggleEmojiMode();
        } else if (i == this.codeSpaceDoubleTap) {
            onSpaceDoubleTap();
        } else {
            Log.e(TAG, a.bp(i, "unknown keycode: "));
        }
        clearResults();
    }

    public void onKeyDelete() {
        LogV.i(3, TAG, "onKeyDelete");
        InputConnection currentInputConnection = this.mCallback.getCurrentInputConnection();
        if (currentInputConnection == null) {
            return;
        }
        CharSequence textBeforeCursor = currentInputConnection.getTextBeforeCursor(1, 0);
        if (this.mRecognizer.strokes().isEmpty() && (textBeforeCursor == null || textBeforeCursor.length() == 0)) {
            CursorState cursorState = this.mCursorState;
            if (cursorState.selectionStart == cursorState.selectionEnd) {
                LogV.i(3, TAG, "no text and no ink to delete; returning.");
                return;
            }
        }
        HandwritingAnalytics.pressedBackspace();
        if (!this.mRecognizer.strokes().isEmpty()) {
            cancelAutoSelect();
            this.mRecognizer.cancelAllRunningRecognitionTasks();
            this.mRecognizer.clear();
            this.mHandwritingOverlayView.clear();
            return;
        }
        if (this.mCandidateView.getCurrentResult() != RecognitionResult.EMPTY) {
            dispatchFinishComposingToMainThread();
        }
        this.mCallback.handleBackspace();
        this.mBookKeeper.clear();
        clearRecognizer();
        this.mHandwritingOverlayView.clear();
    }

    public void onKeyNormal(int i) {
        String str;
        RecognitionResult currentResult = this.mCandidateView.getCurrentResult();
        String strValueOf = String.valueOf(currentResult);
        boolean zClickable = this.mCandidateView.clickable();
        boolean zIsEmpty = this.mRecognizer.strokes().isEmpty();
        int requestId = currentResult.getRequestId();
        ImeHandwritingRecognizer imeHandwritingRecognizer = this.mRecognizer;
        LogV.i(3, "HWRUIHandler.onKeyNormal", "currentResult:" + strValueOf + " clickable:" + zClickable + " strokes.empty() " + zIsEmpty + " currentResult.getRequestId()" + requestId + " mRecognizer.getCurrentRequestId():" + imeHandwritingRecognizer.getCurrentRequestId() + " mRecognizer.hasPendingRequests():" + imeHandwritingRecognizer.hasPendingRequests());
        if (!this.mRecognizer.strokes().isEmpty() && (currentResult == RecognitionResult.EMPTY || (currentResult.getRequestId() < this.mRecognizer.getCurrentRequestId() && this.mRecognizer.hasPendingRequests()))) {
            LogV.i(1, TAG, "onKeyNormal cont");
            if (!this.mInkWasBroughtBack) {
                this.mLastAddedToComposing = "";
            }
            this.mRecognizer.cancelAllRunningRecognitionTasks();
            startContinuousWritingRequest(i);
            this.mRecognizer.clear();
            this.mHandwritingOverlayView.clear();
            str = "cwm";
        } else {
            if (this.continuousWritingQueue.size() > 0) {
                return;
            }
            RecognitionResult recognitionResult = RecognitionResult.EMPTY;
            boolean z = currentResult == recognitionResult;
            LogV.i(2, "HWRUIHandler.onKeyNormal", "noncont.  mJustAfterSuggestionSelected: " + this.mJustAfterSuggestionSelected + " hidden: " + resultInkHidden() + " EMPTY: " + z);
            String str2 = currentResult == recognitionResult ? "normal" : "confirm";
            if (!z && currentResult.numResult() > 0) {
                String str3 = currentResult.get(0).word;
                boolean zResultInkHidden = resultInkHidden();
                if (this.mBookKeeper.size() > 0) {
                    int requestId2 = this.mBookKeeper.getLastEntry().recognitionResult.getRequestId();
                    zResultInkHidden = zResultInkHidden && requestId2 == currentResult.getRequestId();
                    LogV.i(1, "HWRUIHandler.onKeyNormal", "lastReqIdBk: " + requestId2 + " crtReqId: " + currentResult.getRequestId());
                }
                if (!zResultInkHidden) {
                    addTextToComposingRegion(str3, currentResult, this.mLastAddedToComposing, true);
                    str2 = "select";
                }
                LogV.i(2, "HWRUIHandler.onKeyNormal", a.bR(zResultInkHidden, "noncont - result was submitted: "));
            }
            str = str2;
            InputConnection currentInputConnection = this.mCallback.getCurrentInputConnection();
            if (currentInputConnection != null) {
                currentInputConnection.finishComposingText();
            }
            String strContentsAsString = this.mBookKeeper.contentsAsString();
            confirmAllInBookkeeper(FEEDBACK_CONFIRMED);
            if (i != 32) {
                this.mCallback.sendKeyChar((char) i);
                clearRecognizer();
                clearResults();
                this.mBookKeeper.clear();
            } else if (ImeUiUtils.spaceAfterString(strContentsAsString)) {
                i = 32;
                this.mCallback.sendKeyChar((char) i);
                clearRecognizer();
                clearResults();
                this.mBookKeeper.clear();
            } else {
                i = 32;
                clearRecognizer();
                clearResults();
                this.mBookKeeper.clear();
            }
        }
        this.mInkWasBroughtBack = false;
        if (i == this.mCodeAction) {
            HandwritingAnalytics.pressedEnter(str);
        } else if (i == this.mCodeSpace) {
            HandwritingAnalytics.pressedSpace(str);
        }
    }

    public void onLastStrokeWasRemoved() {
        LogV.i(2, TAG, "onLastStrokeWasRemoved");
        this.mHandwritingOverlayView.clear();
        if (!this.mRecognizer.strokes().isEmpty()) {
            LogV.i(2, TAG, "onLastStrokeWasRemoved: strokes not empty");
            this.mHandwritingOverlayView.drawStrokeList(this.mRecognizer.strokes(), false);
            return;
        }
        LogV.i(2, TAG, "onLastStrokeWasRemoved: strokes empty");
        String strRemoveLastEntryFromBookKeeperAndComposing = removeLastEntryFromBookKeeperAndComposing(FEEDBACK_REMOVED_LAST_STROKE);
        LogV.i(2, TAG, "new composing: ".concat(String.valueOf(strRemoveLastEntryFromBookKeeperAndComposing)));
        InputConnection currentInputConnection = this.mCallback.getCurrentInputConnection();
        if (currentInputConnection != null) {
            currentInputConnection.setComposingText(strRemoveLastEntryFromBookKeeperAndComposing, 1);
        }
        clearRecognizer();
        if (strRemoveLastEntryFromBookKeeperAndComposing.length() <= 0 || this.mBookKeeper.size() <= strRemoveLastEntryFromBookKeeperAndComposing.length() - 1) {
            clearResults();
        } else {
            RecognitionResult recognitionResult = this.mBookKeeper.getBookkeepingEntry(strRemoveLastEntryFromBookKeeperAndComposing.length() - 1).recognitionResult;
            if (recognitionResult != RecognitionResult.EMPTY && recognitionResult.numResult() > 0) {
                LogV.i(2, TAG, "from BookKeeper: ".concat(String.valueOf(recognitionResult.get(0).word)));
            }
            this.mCandidateView.setResult(recognitionResult, true);
            lastThingFromBookkeeperDisplay(false);
        }
        setResultInkHidden(true);
    }

    @Override // com.google.android.libraries.handwriting.gui.HandwritingOverlayListener
    public /* synthetic */ void onPenCancel(float f, float f2, long j, float f3, int i) {
        onPenUp(f, f2, j, f3, i);
    }

    @Override // com.google.android.libraries.handwriting.gui.HandwritingOverlayListener
    public void onPenDown(float f, float f2, long j, float f3, int i) {
        setHintText("");
        if (this.mCallback.ensureUserHasAcceptedTOS()) {
            cancelAutoSelect();
            this.mLastCommittedText.clear();
            if (handleButtonStateChange(f, f2, j, f3, i)) {
                return;
            }
            this.mRecognizer.onPenDown(f, f2, j, f3);
        }
    }

    @Override // com.google.android.libraries.handwriting.gui.HandwritingOverlayListener
    public void onPenMove(float f, float f2, long j, float f3, int i) {
        cancelAutoSelect();
        if (handleButtonStateChange(f, f2, j, f3, i)) {
            return;
        }
        this.mRecognizer.onPenMove(f, f2, j, f3);
    }

    @Override // com.google.android.libraries.handwriting.gui.HandwritingOverlayListener
    public void onPenUp(float f, float f2, long j, float f3, int i) {
        setUndoButtonState(UndoButtonInterface.UndoButtonState.UNDO);
        if (handleButtonStateChangePenUp(f, f2, j, f3, i)) {
            return;
        }
        this.mRecognizer.onPenUp(f, f2, j, f3);
    }

    @Override // com.google.android.libraries.handwriting.gui.AbstractCandidateView.OnPickSuggestionListener
    public void onPickSuggestion(int i, CharSequence charSequence, RecognitionResult recognitionResult) {
        HandwritingAnalytics.selectedCandidate(i);
        LogV.i(3, "HWRUIHandler.onPickSuggestion", "index: " + i + " selected: " + String.valueOf(charSequence) + " result: " + String.valueOf(recognitionResult));
        cancelAutoSelect();
        InputConnection currentInputConnection = this.mCallback.getCurrentInputConnection();
        if (currentInputConnection != null) {
            synchronized (this.mInputConnectionLock) {
                if (this.mCandidateView.getCurrentResult() == RecognitionResult.EMPTY) {
                    currentInputConnection.finishComposingText();
                    currentInputConnection.setComposingText(charSequence, 1);
                } else {
                    String composingText = getComposingText(currentInputConnection);
                    RecognitionResult currentResult = this.mCandidateView.getCurrentResult();
                    if (composingText.length() > 0 && currentResult != RecognitionResult.EMPTY && currentResult.numResult() > 0) {
                        String str = currentResult.get(0).word;
                        if (composingText.endsWith(str)) {
                            composingText = composingText.substring(0, composingText.length() - str.length());
                        }
                    }
                    currentInputConnection.setComposingText(composingText + String.valueOf(charSequence), 1);
                    this.mRecognizer.logFeedback(charSequence.toString(), FEEDBACK_SELECTED, recognitionResult, a.bp(i, "cand="));
                }
                currentInputConnection.finishComposingText();
            }
        }
        clearResults();
        clearRecognizer();
        this.mBookKeeper.clear();
    }

    @Override // com.google.android.libraries.handwriting.gui.HandwritingOverlayListener
    public void onSizeChanged(int i, int i2) {
        LogV.i(2, TAG, a.bo(i2, i, "onSizeChanged: ", " "));
        this.mRecognizer.setWritingGuide(i, i2);
    }

    public void onStartInput(EditorInfo editorInfo, boolean z) {
        LogV.i(2, "HWRUIHandler.onStartInput", "start: " + String.valueOf(editorInfo) + ", " + z);
        cancelAutoSelect();
        synchronized (this.mInputConnectionLock) {
            InputConnection currentInputConnection = this.mCallback.getCurrentInputConnection();
            if (currentInputConnection != null) {
                currentInputConnection.finishComposingText();
            }
            this.mBookKeeper.clear();
        }
        clearRecognizer();
        this.continuousWritingQueue.clear();
        clearResults();
        setUndoButtonState(UndoButtonInterface.UndoButtonState.NONE);
    }

    public void onUpdateSelection(int i, int i2, int i3, int i4, int i5, int i6) {
        boolean z;
        boolean z2 = false;
        LogV.i(3, "HWRUIHandler.onUpdateSelection", String.format("old selection: [%d, %d] new selection: [%d, %d], composing: [%d, %d]", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)));
        this.mCursorState.update(i3, i4, i5, i6);
        if (i5 == -1 && i6 == -1) {
            i6 = -1;
            z = false;
        } else {
            z = true;
        }
        boolean z3 = i3 != i4;
        boolean z4 = z && i4 != i6;
        if (!z && i4 != i2) {
            z2 = true;
        }
        LogV.i(3, "HWRUIHandleronUpdateSelection", "hasComposingArea: " + z + "  userSelectedText: " + z3 + " cursorMovedFromEndOfComposing: " + z4 + " cursorMovedInSmartTextField: " + z2);
        if (z3 || z4 || z2) {
            LogV.i(3, "HWRUIHandler.onUpdateSelection", "clearing composing area.");
            InputConnection currentInputConnection = this.mCallback.getCurrentInputConnection();
            if (currentInputConnection != null) {
                currentInputConnection.finishComposingText();
            }
            clearRecognizer();
            clearResults();
            this.mBookKeeper.clear();
        }
    }

    public void putResultIntoComposingRegion(CharSequence charSequence, boolean z, char c) {
        this.mLastCommittedText.clear();
        this.mLastCommittedText.append(charSequence);
        addTextToComposingRegion(this.mLastCommittedText, this.mCandidateView.getCurrentResult(), this.mLastAddedToComposing, true);
        LogV.i(2, "HWRUIHandler.putResultIntoComposingRegion", "commitSuggestion: text='" + String.valueOf(this.mLastCommittedText) + "'");
        clearRecognizer();
        setResultInkHidden(true);
        lastThingFromBookkeeperDisplay(true);
    }

    public String removeLastEntryFromBookKeeperAndComposing(String str) {
        LogV.i(3, TAG, "removeLastEntryFromBookKeeperAndComposing feedbackMode:".concat(String.valueOf(str)));
        InputConnection currentInputConnection = this.mCallback.getCurrentInputConnection();
        String composingText = currentInputConnection == null ? "" : getComposingText(currentInputConnection);
        if (this.mCandidateView.getCurrentResult().numResult() > 0) {
            String str2 = this.mCandidateView.getCurrentResult().get(0).word;
            LogV.i(2, TAG, a.bM(str2, composingText, "composing: ", " top1: "));
            LogV.i(2, TAG, "currentBookkeeper: ".concat(String.valueOf(this.mBookKeeper.contentsAsString())));
            this.mBookKeeper.update(composingText.length() - str2.length(), composingText.length(), "", RecognitionResult.EMPTY);
            LogV.i(2, TAG, "currentBookkeeper: ".concat(String.valueOf(this.mBookKeeper.contentsAsString())));
            this.mRecognizer.logFeedback(str2, str, this.mCandidateView.getCurrentResult(), "");
            if (composingText.endsWith(str2)) {
                return composingText.substring(0, composingText.length() - str2.length());
            }
        }
        return composingText;
    }

    public boolean resultInkHidden() {
        return this.mResultInkHidden;
    }

    public boolean selectionIsEmpty() {
        CursorState cursorState = this.mCursorState;
        return cursorState.selectionStart == cursorState.selectionEnd;
    }

    public void setAutoSelectEnabled(boolean z) {
        this.autoSelectEnabled = z;
    }

    public void setCandidateView(AbstractCandidateView abstractCandidateView) {
        this.mCandidateView = abstractCandidateView;
    }

    public void setFullStopCharacter(String str) {
        this.mFullStopCharacter = str;
    }

    public void setHandwritingHintTextView(TextView textView) {
        this.handwritingHintTextView = textView;
    }

    public void setHandwritingHintVisibilityForString(final String str) {
        if (this.handwritingHintTextView == null) {
            return;
        }
        boolean zIsEmpty = str.isEmpty();
        TextView textView = this.handwritingHintTextView;
        if (zIsEmpty) {
            textView.setVisibility(8);
            return;
        }
        int visibility = textView.getVisibility();
        TextView textView2 = this.handwritingHintTextView;
        if (visibility == 0) {
            textView2.setText(str);
            return;
        }
        textView2.setText("");
        this.handwritingHintTextView.setContentDescription(str);
        this.handwritingHintTextView.setVisibility(0);
        int length = str.length();
        int i = 200 / length;
        for (final int i2 = 0; i2 < length + 1; i2++) {
            postDelayed(new Runnable(this) { // from class: com.google.android.libraries.handwriting.gui.UIHandler.1
                final /* synthetic */ UIHandler this$0;

                {
                    this.getClass();
                    this.this$0 = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    int i3 = i2;
                    this.this$0.handwritingHintTextView.setText(str.subSequence(0, i3));
                    this.this$0.handwritingHintTextView.setContentDescription(str);
                }
            }, i2 * i);
        }
    }

    public void setHandwritingImeView(View view) {
        this.mHandwritingImeView = view;
    }

    public void setHandwritingOverlayView(HandwritingOverlayView handwritingOverlayView) {
        this.mHandwritingOverlayView = handwritingOverlayView;
    }

    public void setHintText(String str) {
        GuiUtils.assertOnMainThread();
        removeMessages(5);
        if (str == null || str.isEmpty()) {
            obtainMessage(5, "").sendToTarget();
            return;
        }
        if (!str.equals(this.lastHint)) {
            obtainMessage(5, str).sendToTarget();
            this.lastHint = str;
            this.hintShownCounter = 0;
        } else {
            int i = this.hintShownCounter + 1;
            this.hintShownCounter = i;
            if (i <= 3) {
                obtainMessage(5, str).sendToTarget();
            } else {
                sendMessageDelayed(obtainMessage(5, str), 10000L);
            }
        }
    }

    public void setLastConfirmationWasNonSpace(boolean z) {
        LogV.i(2, TAG, a.bR(z, "setLastConfirmationWasNonSpace: "));
        this.mLastConfirmationWasNonSpace = z;
    }

    public void setResultInkHidden(boolean z) {
        LogV.i(3, TAG, a.bR(z, "hideResultInk: "));
        this.mResultInkHidden = z;
        if (z) {
            this.mInkWasBroughtBack = false;
        }
    }

    public void setUndoButtonView(UndoButtonInterface undoButtonInterface) {
        this.mUndoButtonInterfaceView = undoButtonInterface;
        if (undoButtonInterface == null) {
            return;
        }
        undoButtonInterface.setOnClickListener(new View.OnClickListener(this) { // from class: com.google.android.libraries.handwriting.gui.UIHandler.3
            final /* synthetic */ UIHandler this$0;

            {
                this.getClass();
                this.this$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                view.performHapticFeedback(3);
                HandwritingAnalytics.pressedUndo();
                UndoButtonInterface.UndoButtonState state = this.this$0.mUndoButtonInterfaceView.getState();
                UndoButtonInterface.UndoButtonState undoButtonState = UndoButtonInterface.UndoButtonState.NONE;
                UIHandler uIHandler = this.this$0;
                if (state == undoButtonState) {
                    uIHandler.onKeyDelete();
                    return;
                }
                uIHandler.abortAnimation();
                boolean zUndoLastStrokes = this.this$0.mRecognizer.undoLastStrokes();
                UIHandler uIHandler2 = this.this$0;
                if (zUndoLastStrokes) {
                    uIHandler2.setUndoButtonState(UndoButtonInterface.UndoButtonState.UNDO);
                    this.this$0.setHintText("");
                    return;
                }
                uIHandler2.setHintText(uIHandler2.lastHint);
                int size = this.this$0.mBookKeeper.size();
                UIHandler uIHandler3 = this.this$0;
                if (size == 0) {
                    uIHandler3.setUndoButtonState(UndoButtonInterface.UndoButtonState.NONE);
                } else {
                    uIHandler3.setUndoButtonState(UndoButtonInterface.UndoButtonState.BACK);
                }
            }
        });
    }

    public void setVoiceButton(View view) {
        this.mVoiceButton = view;
    }

    public void setVoiceButtonDesired(boolean z) {
        this.voiceButtonDesired = z;
    }

    public void updateResultsInCandidateView(RecognitionResult recognitionResult, boolean z) {
        LogV.i(2, "HWRUIHandler.updateResultsInCandidateView", "start");
        AbstractCandidateView abstractCandidateView = this.mCandidateView;
        if (abstractCandidateView != null) {
            abstractCandidateView.setResult(recognitionResult, z);
            LogV.i(2, "HWRUIHandler.updateResultsInCandidateView", "suggestions.size() = " + recognitionResult.numResult() + " mHandwritingView.getVisibility = " + this.mHandwritingImeView.getVisibility() + " mHandwritingView.getWindowVisibility = " + this.mHandwritingImeView.getWindowVisibility());
        }
    }

    @Override // android.inputmethodservice.KeyboardView.OnKeyboardActionListener
    public void swipeDown() {
    }

    @Override // android.inputmethodservice.KeyboardView.OnKeyboardActionListener
    public void swipeLeft() {
    }

    @Override // android.inputmethodservice.KeyboardView.OnKeyboardActionListener
    public void swipeRight() {
    }

    @Override // android.inputmethodservice.KeyboardView.OnKeyboardActionListener
    public void swipeUp() {
    }

    @Override // android.inputmethodservice.KeyboardView.OnKeyboardActionListener
    public void onPress(int i) {
    }

    @Override // android.inputmethodservice.KeyboardView.OnKeyboardActionListener
    public void onRelease(int i) {
    }

    @Override // android.inputmethodservice.KeyboardView.OnKeyboardActionListener
    public void onText(CharSequence charSequence) {
    }
}
