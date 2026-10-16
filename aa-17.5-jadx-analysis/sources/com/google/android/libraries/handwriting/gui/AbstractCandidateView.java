package com.google.android.libraries.handwriting.gui;

import android.graphics.Typeface;
import android.view.View;
import com.google.android.libraries.handwriting.base.RecognitionResult;

/* loaded from: classes3.dex */
public interface AbstractCandidateView {

    public interface OnPickSuggestionListener {
        void onPickSuggestion(int i, CharSequence charSequence, RecognitionResult recognitionResult);
    }

    void clear();

    boolean clickable();

    RecognitionResult getCurrentResult();

    View getView();

    void setDefaultCandidates(String[] strArr, String[] strArr2);

    void setListener(OnPickSuggestionListener onPickSuggestionListener);

    void setResult(RecognitionResult recognitionResult, boolean z);

    void setSelectedWord(String str);

    void setTypeface(Typeface typeface);
}
