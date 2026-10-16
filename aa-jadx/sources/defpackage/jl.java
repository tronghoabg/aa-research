package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jl extends android.widget.RatingBar {
    private final defpackage.jj a;

    public jl(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, com.google.android.projection.gearhead.R.attr.ratingBarStyle);
        defpackage.ne.d(this, getContext());
        defpackage.jj jjVar = new defpackage.jj(this);
        this.a = jjVar;
        jjVar.b(attributeSet, com.google.android.projection.gearhead.R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        android.graphics.Bitmap bitmap = this.a.a;
        if (bitmap != null) {
            setMeasuredDimension(android.view.View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
