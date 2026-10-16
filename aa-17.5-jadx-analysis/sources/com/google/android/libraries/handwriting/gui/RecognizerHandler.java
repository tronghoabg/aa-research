package com.google.android.libraries.handwriting.gui;

import android.util.Log;
import android.view.View;
import android.widget.TextView;
import com.google.android.libraries.handwriting.base.LogV;
import com.google.android.libraries.handwriting.base.RecognitionResult;
import com.google.android.libraries.handwriting.base.StrokeList;

/* loaded from: classes3.dex */
public class RecognizerHandler implements RecognizerClient {
    private static final String TAG = "HWRRecoHandler";
    private boolean isInitializing;
    private int mAutoSelectMilli;
    private View mBusyDisplay;
    private TextView mDebugTextView;
    private HandwritingOverlayView mHandwritingOverlayView;
    private boolean mRecognizerInitialized;
    private boolean mShowDebugInformation;
    private UIHandler mUIHandler;

    @Override // com.google.android.libraries.handwriting.gui.RecognizerClient
    public void clear() {
        this.mUIHandler.clearRecognizer();
        this.mUIHandler.clearResults();
        this.mUIHandler.onKeyDelete();
    }

    @Override // com.google.android.libraries.handwriting.gui.RecognizerClient
    public void confirmFirstCandidate() {
        this.mUIHandler.onKeyNormal(-32);
        this.mUIHandler.setLastConfirmationWasNonSpace(true);
    }

    @Override // com.google.android.libraries.handwriting.gui.RecognizerClient
    public void delete() {
        this.mUIHandler.onKeyDelete();
        this.mUIHandler.clearResults();
    }

    @Override // com.google.android.libraries.handwriting.gui.RecognizerClient
    public void errorMessage(int i, Exception exc, String str) {
        this.mUIHandler.errorMessage(i, exc, str);
    }

    @Override // com.google.android.libraries.handwriting.gui.RecognizerClient
    public String getPostContext() {
        UIHandler uIHandler = this.mUIHandler;
        return uIHandler == null ? "" : uIHandler.getPostContext();
    }

    @Override // com.google.android.libraries.handwriting.gui.RecognizerClient
    public String getPreContext() {
        UIHandler uIHandler = this.mUIHandler;
        return uIHandler == null ? "" : uIHandler.getPreContext();
    }

    @Override // com.google.android.libraries.handwriting.gui.RecognizerClient
    public void initializing() {
        this.isInitializing = true;
        this.mRecognizerInitialized = false;
        View view = this.mBusyDisplay;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public boolean isInitialized() {
        return this.mRecognizerInitialized;
    }

    public boolean isInitializing() {
        return this.isInitializing;
    }

    @Override // com.google.android.libraries.handwriting.gui.RecognizerClient
    public boolean isShowDebugInfo() {
        return this.mShowDebugInformation;
    }

    @Override // com.google.android.libraries.handwriting.gui.RecognizerClient
    public boolean onGoBacktoPreviousRecognition() {
        return this.mUIHandler.goBackToPreviousResult();
    }

    @Override // com.google.android.libraries.handwriting.gui.RecognizerClient
    public void onInitialized(boolean z) {
        if (!z) {
            this.mRecognizerInitialized = false;
            this.isInitializing = false;
            Log.e(TAG, "Recognizer initialization unsuccessful.");
        } else {
            this.mRecognizerInitialized = true;
            this.isInitializing = false;
            View view = this.mBusyDisplay;
            if (view != null) {
                view.setVisibility(8);
            }
        }
    }

    @Override // com.google.android.libraries.handwriting.gui.RecognizerClient
    public void onLastStrokeWasRemoved() {
        this.mUIHandler.onLastStrokeWasRemoved();
    }

    @Override // com.google.android.libraries.handwriting.gui.RecognizerClient
    public void onRecognitionEnd(final RecognitionResult recognitionResult, int i, boolean z) {
        LogV.i(1, TAG, "onRecognitionEnd: " + String.valueOf(recognitionResult) + " strokes = " + String.valueOf(recognitionResult.getStrokes()));
        boolean z2 = i == 0;
        this.mUIHandler.dispatchSetResultsToMainThread(recognitionResult, z2);
        if (recognitionResult.numResult() > 0 && z2 && z) {
            LogV.i(1, TAG, "triggering auto select");
            this.mUIHandler.dispatchAutoSelectSuggestionToMainThread(recognitionResult, this.mAutoSelectMilli);
        } else {
            LogV.i(1, TAG, "NOT triggering auto select");
            this.mUIHandler.dispatchUpdateResultsToMainThread(recognitionResult);
        }
        if (this.mHandwritingOverlayView == null || recognitionResult.getStrokes() == StrokeList.EMPTY) {
            return;
        }
        this.mHandwritingOverlayView.post(new Runnable(this) { // from class: com.google.android.libraries.handwriting.gui.RecognizerHandler.1
            final /* synthetic */ RecognizerHandler this$0;

            {
                this.getClass();
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.this$0.mHandwritingOverlayView.drawStrokeList(recognitionResult.getStrokes(), true);
            }
        });
    }

    public void setAutoSelectMilli(int i) {
        this.mAutoSelectMilli = i;
    }

    public void setBusyDisplay(View view) {
        this.mBusyDisplay = view;
    }

    public void setDebugView(TextView textView) {
        this.mDebugTextView = textView;
    }

    public void setHandwritingOverlayView(HandwritingOverlayView handwritingOverlayView) {
        this.mHandwritingOverlayView = handwritingOverlayView;
    }

    public void setShowDebugInformation(boolean z) {
        this.mShowDebugInformation = z;
    }

    @Override // com.google.android.libraries.handwriting.gui.RecognizerClient
    public void setStatusText(String str) {
        TextView textView = this.mDebugTextView;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setUIHandler(UIHandler uIHandler) {
        this.mUIHandler = uIHandler;
    }

    @Override // com.google.android.libraries.handwriting.gui.RecognizerClient
    public void space() {
        this.mUIHandler.onKeyNormal(32);
        this.mUIHandler.setLastConfirmationWasNonSpace(false);
    }
}
