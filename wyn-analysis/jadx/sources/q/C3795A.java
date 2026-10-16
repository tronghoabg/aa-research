package q;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.wynauto.wyn.R;

/* renamed from: q.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3795A extends SeekBar {

    /* renamed from: a, reason: collision with root package name */
    public final C3796B f43611a;

    public C3795A(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        e1.a(getContext(), this);
        C3796B c3796b = new C3796B(this);
        this.f43611a = c3796b;
        c3796b.b(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C3796B c3796b = this.f43611a;
        Drawable drawable = c3796b.f43613f;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        C3795A c3795a = c3796b.f43612e;
        if (drawable.setState(c3795a.getDrawableState())) {
            c3795a.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f43611a.f43613f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f43611a.g(canvas);
    }
}
