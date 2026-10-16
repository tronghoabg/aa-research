package com.google.android.libraries.handwriting.gui;

/* JADX INFO: loaded from: classes3.dex */
public interface AbstractCandidateView {

    public interface OnPickSuggestionListener {
        void onPickSuggestion(int i, java.lang.CharSequence charSequence, com.google.android.libraries.handwriting.base.RecognitionResult recognitionResult);
    }

    void clear();

    boolean clickable();

    com.google.android.libraries.handwriting.base.RecognitionResult getCurrentResult();

    android.view.View getView();

    void setDefaultCandidates(java.lang.String[] strArr, java.lang.String[] strArr2);

    void setListener(com.google.android.libraries.handwriting.gui.AbstractCandidateView.OnPickSuggestionListener onPickSuggestionListener);

    void setResult(com.google.android.libraries.handwriting.base.RecognitionResult recognitionResult, boolean z);

    void setSelectedWord(java.lang.String str);

    void setTypeface(android.graphics.Typeface typeface);
}
