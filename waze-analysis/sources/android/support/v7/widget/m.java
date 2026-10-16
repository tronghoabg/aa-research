package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.DrawableCompat;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class m extends AppCompatImageView implements q {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ p f1600a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p pVar, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.f1600a = pVar;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        setTooltipText(getContentDescription());
        setOnTouchListener(new l(this, this));
    }

    @Override // android.support.v7.widget.q
    public final boolean e() {
        return false;
    }

    @Override // android.support.v7.widget.q
    public final boolean f() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f1600a.v();
        return true;
    }

    @Override // android.widget.ImageView
    protected final boolean setFrame(int i2, int i3, int i4, int i5) {
        boolean frame = super.setFrame(i2, i3, i4, i5);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = getPaddingLeft() - getPaddingRight();
            int i6 = (width + paddingLeft) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            DrawableCompat.setHotspotBounds(background, i6 - iMax, paddingTop - iMax, i6 + iMax, paddingTop + iMax);
        }
        return frame;
    }
}
