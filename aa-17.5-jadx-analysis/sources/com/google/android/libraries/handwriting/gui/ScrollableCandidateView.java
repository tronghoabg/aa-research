package com.google.android.libraries.handwriting.gui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.libraries.handwriting.base.RecognitionResult;
import com.google.android.libraries.handwriting.gui.AbstractCandidateView;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class ScrollableCandidateView extends HorizontalScrollView implements View.OnClickListener, AbstractCandidateView {
    private static final int MAX_SUGGESTIONS = 32;
    boolean clickable;
    private final int mCandidateBackgroundId;
    private final int mCandidateHeight;
    private final int mCandidateMinWidth;
    private final int mCandidatePadding;
    private final int mCandidateTextColor;
    final LinearLayout mCandidatesBar;
    private AbstractCandidateView.OnPickSuggestionListener mListener;
    private final Drawable mPreSpaceDrawable;
    private RecognitionResult mResult;
    private String mSelectedWord;
    private final String mSpaceContentDescription;
    private final ArrayList<View> mWords;

    public ScrollableCandidateView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mWords = new ArrayList<>();
        this.mResult = RecognitionResult.EMPTY;
        View.inflate(context, com.google.android.projection.gearhead.R.layout.scrollable_candidates, this);
        this.mCandidatesBar = (LinearLayout) findViewById(com.google.android.projection.gearhead.R.id.scrollable_candidates);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ScrollableCandidateView);
        try {
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(5);
            this.mCandidateBackgroundId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.ScrollableCandidateView_hwrCandidateBackground, 0);
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
            this.mPreSpaceDrawable = GuiUtils.getPrespaceDrawable(context.getResources(), dimension, color, dimension2);
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
            int i2 = 0;
            while (i2 < 32) {
                View viewInflate = layoutInflaterFrom.inflate(com.google.android.projection.gearhead.R.layout.candidate, (ViewGroup) null);
                TextView textView = (TextView) viewInflate.findViewById(com.google.android.projection.gearhead.R.id.candidate_word);
                textView.setTextColor(this.mCandidateTextColor);
                textView.setBackgroundResource(this.mCandidateBackgroundId);
                textView.setTextSize(0, dimension);
                textView.setMinWidth(this.mCandidateMinWidth);
                textView.setPadding(this.mCandidatePadding, textView.getPaddingTop(), this.mCandidatePadding, textView.getPaddingBottom());
                textView.setTag(Integer.valueOf(i2));
                textView.setOnClickListener(this);
                textView.setHeight(this.mCandidateHeight);
                ImageView imageView = (ImageView) viewInflate.findViewById(com.google.android.projection.gearhead.R.id.candidate_divider);
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(i2 == 0 ? 8 : 0);
                this.mWords.add(viewInflate);
                i2++;
            }
            scrollTo(0, getScrollY());
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    private void updateSuggestions(String str) {
        clear();
        int iNumResult = this.mResult.numResult();
        if (iNumResult > 31) {
            iNumResult = 31;
        }
        for (int i = 0; i < iNumResult; i++) {
            String str2 = this.mResult.get(i).word;
            if (str2 != null) {
                View view = this.mWords.get(i);
                TextView textView = (TextView) view.findViewById(com.google.android.projection.gearhead.R.id.candidate_word);
                textView.setLongClickable(false);
                textView.setBackgroundResource(this.mCandidateBackgroundId);
                int i2 = this.mCandidatePadding;
                textView.setPadding(i2, 0, i2, 0);
                textView.setMinWidth(this.mCandidateMinWidth);
                textView.setHeight(this.mCandidateHeight);
                GuiUtils.formatResultTextInTextView(str2.toString(), textView, -1.0f, this.mSpaceContentDescription, this.mPreSpaceDrawable);
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
    public RecognitionResult getCurrentResult() {
        return this.mResult;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int iIntValue = ((Integer) view.getTag()).intValue();
        this.mListener.onPickSuggestion(iIntValue, this.mResult.get(iIntValue).word, this.mResult);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // com.google.android.libraries.handwriting.gui.AbstractCandidateView
    public void setListener(AbstractCandidateView.OnPickSuggestionListener onPickSuggestionListener) {
        this.mListener = onPickSuggestionListener;
    }

    @Override // com.google.android.libraries.handwriting.gui.AbstractCandidateView
    public void setResult(RecognitionResult recognitionResult, boolean z) {
        this.mSelectedWord = "";
        this.mResult = recognitionResult;
        this.clickable = z;
        updateSuggestions("");
    }

    @Override // com.google.android.libraries.handwriting.gui.AbstractCandidateView
    public void setSelectedWord(String str) {
        this.mSelectedWord = str;
    }

    @Override // com.google.android.libraries.handwriting.gui.AbstractCandidateView
    public void setTypeface(Typeface typeface) {
        ArrayList<View> arrayList = this.mWords;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((TextView) arrayList.get(i).findViewById(com.google.android.projection.gearhead.R.id.candidate_word)).setTypeface(typeface);
        }
    }

    @Override // com.google.android.libraries.handwriting.gui.AbstractCandidateView
    public View getView() {
        return this;
    }

    @Override // com.google.android.libraries.handwriting.gui.AbstractCandidateView
    public void setDefaultCandidates(String[] strArr, String[] strArr2) {
    }

    public ScrollableCandidateView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
