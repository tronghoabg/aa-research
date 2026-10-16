package q;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.wynauto.wyn.R;
import ff.AbstractC2641B;
import p.C3751b;

/* renamed from: q.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3814h extends C3839u implements InterfaceC3818j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3816i f43787d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3814h(C3816i c3816i, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.f43787d = c3816i;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        AbstractC2641B.J(this, getContentDescription());
        setOnTouchListener(new C3751b(this, this));
    }

    @Override // q.InterfaceC3818j
    public final boolean a() {
        return false;
    }

    @Override // q.InterfaceC3818j
    public final boolean b() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f43787d.k();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i5, int i10, int i11, int i12) {
        boolean frame = super.setFrame(i5, i10, i11, i12);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }
}
