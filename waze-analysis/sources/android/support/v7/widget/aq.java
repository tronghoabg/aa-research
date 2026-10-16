package android.support.v7.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class aq extends RatingBar {

    /* renamed from: a, reason: collision with root package name */
    private final ao f1078a;

    public aq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        fz.d(this, getContext());
        ao aoVar = new ao(this);
        this.f1078a = aoVar;
        aoVar.c(attributeSet, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected final synchronized void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        Bitmap bitmapA = this.f1078a.a();
        if (bitmapA != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmapA.getWidth() * getNumStars(), i2, 0), getMeasuredHeight());
        }
    }
}
