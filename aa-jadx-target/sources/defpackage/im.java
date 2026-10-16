package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class im extends defpackage.jg implements defpackage.iq {
    final /* synthetic */ defpackage.ip a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public im(defpackage.ip ipVar, android.content.Context context) {
        super(context, null, 2130968611);
        this.a = ipVar;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        a$.ExternalSyntheticApiModelOutline1.m(this, getContentDescription());
        setOnTouchListener(new defpackage.il(this, this));
    }

    @Override // defpackage.iq
    public final boolean c() {
        return false;
    }

    @Override // defpackage.iq
    public final boolean d() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.a.m();
        return true;
    }

    @Override // android.widget.ImageView
    protected final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        android.graphics.drawable.Drawable drawable = getDrawable();
        android.graphics.drawable.Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = java.lang.Math.max(width, height) / 2;
            int paddingLeft = getPaddingLeft() - getPaddingRight();
            int i5 = (width + paddingLeft) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(i5 - iMax, paddingTop - iMax, i5 + iMax, paddingTop + iMax);
        }
        return frame;
    }
}
