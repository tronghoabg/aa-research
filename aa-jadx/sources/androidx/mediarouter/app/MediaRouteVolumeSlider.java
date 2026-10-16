package androidx.mediarouter.app;

/* JADX INFO: loaded from: classes2.dex */
class MediaRouteVolumeSlider extends defpackage.jm {
    private final float a;
    private android.graphics.drawable.Drawable b;

    public MediaRouteVolumeSlider(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        android.util.TypedValue typedValue = new android.util.TypedValue();
        this.a = context.getTheme().resolveAttribute(android.R.attr.disabledAlpha, typedValue, true) ? typedValue.getFloat() : 0.5f;
    }

    @Override // defpackage.jm, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int i = isEnabled() ? 255 : (int) (this.a * 255.0f);
        this.b.setColorFilter(0, android.graphics.PorterDuff.Mode.SRC_IN);
        this.b.setAlpha(i);
        android.graphics.drawable.Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable instanceof android.graphics.drawable.LayerDrawable) {
            android.graphics.drawable.LayerDrawable layerDrawable = (android.graphics.drawable.LayerDrawable) getProgressDrawable();
            progressDrawable = layerDrawable.findDrawableByLayerId(android.R.id.progress);
            layerDrawable.findDrawableByLayerId(android.R.id.background).setColorFilter(0, android.graphics.PorterDuff.Mode.SRC_IN);
        }
        progressDrawable.setColorFilter(0, android.graphics.PorterDuff.Mode.SRC_IN);
        progressDrawable.setAlpha(i);
    }

    @Override // android.widget.AbsSeekBar
    public final void setThumb(android.graphics.drawable.Drawable drawable) {
        this.b = drawable;
        super.setThumb(drawable);
    }

    public MediaRouteVolumeSlider(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.projection.gearhead.R.attr.seekBarStyle);
    }

    public MediaRouteVolumeSlider(android.content.Context context) {
        this(context, null);
    }
}
