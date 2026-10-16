package q;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.wynauto.wyn.R;

/* renamed from: q.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3847y extends RatingBar {

    /* renamed from: a, reason: collision with root package name */
    public final C3845x f43942a;

    public C3847y(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        e1.a(getContext(), this);
        C3845x c3845x = new C3845x(this);
        this.f43942a = c3845x;
        c3845x.b(attributeSet, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i5, int i10) {
        super.onMeasure(i5, i10);
        Bitmap bitmap = (Bitmap) this.f43942a.f43941c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i5, 0), getMeasuredHeight());
        }
    }
}
