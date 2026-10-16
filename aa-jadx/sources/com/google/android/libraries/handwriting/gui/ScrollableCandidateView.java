package com.google.android.libraries.handwriting.gui;

/* JADX INFO: loaded from: classes3.dex */
public class ScrollableCandidateView extends android.widget.HorizontalScrollView implements android.view.View.OnClickListener, com.google.android.libraries.handwriting.gui.AbstractCandidateView {
    private static final int MAX_SUGGESTIONS = 32;
    boolean clickable;
    private final int mCandidateBackgroundId;
    private final int mCandidateHeight;
    private final int mCandidateMinWidth;
    private final int mCandidatePadding;
    private final int mCandidateTextColor;
    final android.widget.LinearLayout mCandidatesBar;
    private com.google.android.libraries.handwriting.gui.AbstractCandidateView.OnPickSuggestionListener mListener;
    private final android.graphics.drawable.Drawable mPreSpaceDrawable;
    private com.google.android.libraries.handwriting.base.RecognitionResult mResult;
    private java.lang.String mSelectedWord;
    private final java.lang.String mSpaceContentDescription;
    private final java.util.ArrayList<android.view.View> mWords;

    public ScrollableCandidateView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mWords = new java.util.ArrayList<>();
        this.mResult = com.google.android.libraries.handwriting.base.RecognitionResult.EMPTY;
        android.view.View.inflate(context, com.google.android.projection.gearhead.R.layout.scrollable_candidates, this);
        this.mCandidatesBar = (android.widget.LinearLayout) findViewById(com.google.android.projection.gearhead.R.id.scrollable_candidates);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.google.android.libraries.handwriting.gui.R.styleable.ScrollableCandidateView);
        try {
            android.graphics.drawable.Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(5);
            this.mCandidateBackgroundId = typedArrayObtainStyledAttributes.getResourceId(com.google.android.libraries.handwriting.gui.R.styleable.ScrollableCandidateView_hwrCandidateBackground, 0);
            int color = typedArrayObtainStyledAttributes.getColor(6, -65536);
            this.mCandidateTextColor = color;
            float dimension = typedArrayObtainStyledAttributes.getDimension(7, 15.0f);
            this.mCandidatePadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0);
            this.mCandidateMinWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
            float dimension2 = typedArrayObtainStyledAttributes.getDimension(9, 3.0f);
            this.mSpaceContentDescription = typedArrayObtainStyledAttributes.getString(11);
            this.mCandidateHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
            setFadingEdgeLength(typedArrayObtainStyledAttributes.getDimensionPixelSize(10, 10));
            typedArrayObtainStyledAttributes.recycle();
            this.mPreSpaceDrawable = com.google.android.libraries.handwriting.gui.GuiUtils.getPrespaceDrawable(context.getResources(), dimension, color, dimension2);
            android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(context);
            int i2 = 0;
            while (i2 < 32) {
                android.view.View viewInflate = layoutInflaterFrom.inflate(com.google.android.projection.gearhead.R.layout.candidate, (android.view.ViewGroup) null);
                android.widget.TextView textView = (android.widget.TextView) viewInflate.findViewById(com.google.android.projection.gearhead.R.id.candidate_word);
                textView.setTextColor(this.mCandidateTextColor);
                textView.setBackgroundResource(this.mCandidateBackgroundId);
                textView.setTextSize(0, dimension);
                textView.setMinWidth(this.mCandidateMinWidth);
                textView.setPadding(this.mCandidatePadding, textView.getPaddingTop(), this.mCandidatePadding, textView.getPaddingBottom());
                textView.setTag(java.lang.Integer.valueOf(i2));
                textView.setOnClickListener(this);
                textView.setHeight(this.mCandidateHeight);
                android.widget.ImageView imageView = (android.widget.ImageView) viewInflate.findViewById(com.google.android.projection.gearhead.R.id.candidate_divider);
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(i2 == 0 ? 8 : 0);
                this.mWords.add(viewInflate);
                i2++;
            }
            scrollTo(0, getScrollY());
        } catch (java.lang.Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    private void updateSuggestions(java.lang.String str) {
        clear();
        int iNumResult = this.mResult.numResult();
        if (iNumResult > 31) {
            iNumResult = 31;
        }
        for (int i = 0; i < iNumResult; i++) {
            java.lang.String str2 = this.mResult.get(i).word;
            if (str2 != null) {
                android.view.View view = this.mWords.get(i);
                android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.google.android.projection.gearhead.R.id.candidate_word);
                textView.setLongClickable(false);
                textView.setBackgroundResource(this.mCandidateBackgroundId);
                int i2 = this.mCandidatePadding;
                textView.setPadding(i2, 0, i2, 0);
                textView.setMinWidth(this.mCandidateMinWidth);
                textView.setHeight(this.mCandidateHeight);
                com.google.android.libraries.handwriting.gui.GuiUtils.formatResultTextInTextView(str2.toString(), textView, -1.0f, this.mSpaceContentDescription, this.mPreSpaceDrawable);
                textView.setClickable(this.clickable);
                this.mCandidatesBar.addView(view);
            }
        }
        scrollTo(0, getScrollY());
        requestLayout();
    }

    @Override // com.google.android.libraries.handwriting.gui.AbstractCandidateView
    public void clear() {
        this.mCandidatesBar.removeAllViews();
    }

    @Override // com.google.android.libraries.handwriting.gui.AbstractCandidateView
    public boolean clickable() {
        return this.clickable;
    }

    @Override // com.google.android.libraries.handwriting.gui.AbstractCandidateView
    public com.google.android.libraries.handwriting.base.RecognitionResult getCurrentResult() {
        return this.mResult;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        int iIntValue = ((java.lang.Integer) view.getTag()).intValue();
        this.mListener.onPickSuggestion(iIntValue, this.mResult.get(iIntValue).word, this.mResult);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // com.google.android.libraries.handwriting.gui.AbstractCandidateView
    public void setListener(com.google.android.libraries.handwriting.gui.AbstractCandidateView.OnPickSuggestionListener onPickSuggestionListener) {
        this.mListener = onPickSuggestionListener;
    }

    @Override // com.google.android.libraries.handwriting.gui.AbstractCandidateView
    public void setResult(com.google.android.libraries.handwriting.base.RecognitionResult recognitionResult, boolean z) {
        this.mSelectedWord = "";
        this.mResult = recognitionResult;
        this.clickable = z;
        updateSuggestions("");
    }

    @Override // com.google.android.libraries.handwriting.gui.AbstractCandidateView
    public void setSelectedWord(java.lang.String str) {
        this.mSelectedWord = str;
    }

    @Override // com.google.android.libraries.handwriting.gui.AbstractCandidateView
    public void setTypeface(android.graphics.Typeface typeface) {
        java.util.ArrayList<android.view.View> arrayList = this.mWords;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((android.widget.TextView) arrayList.get(i).findViewById(com.google.android.projection.gearhead.R.id.candidate_word)).setTypeface(typeface);
        }
    }

    @Override // com.google.android.libraries.handwriting.gui.AbstractCandidateView
    public android.view.View getView() {
        return this;
    }

    @Override // com.google.android.libraries.handwriting.gui.AbstractCandidateView
    public void setDefaultCandidates(java.lang.String[] strArr, java.lang.String[] strArr2) {
    }

    public ScrollableCandidateView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
