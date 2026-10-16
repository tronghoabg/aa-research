package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class jm extends android.widget.SeekBar {
    private final defpackage.jn a;

    public jm(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        defpackage.ne.d(this, getContext());
        defpackage.jn jnVar = new defpackage.jn(this);
        this.a = jnVar;
        jnVar.b(attributeSet, i);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        defpackage.jn jnVar = this.a;
        android.graphics.drawable.Drawable drawable = jnVar.c;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        android.widget.SeekBar seekBar = jnVar.b;
        if (drawable.setState(seekBar.getDrawableState())) {
            seekBar.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        android.graphics.drawable.Drawable drawable = this.a.c;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected final synchronized void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        defpackage.jn jnVar = this.a;
        if (jnVar.c != null) {
            android.widget.SeekBar seekBar = jnVar.b;
            int max = seekBar.getMax();
            if (max > 1) {
                int intrinsicWidth = jnVar.c.getIntrinsicWidth();
                int intrinsicHeight = jnVar.c.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth >> 1 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight >> 1 : 1;
                jnVar.c.setBounds(-i, -i2, i, i2);
                int width = (seekBar.getWidth() - seekBar.getPaddingLeft()) - seekBar.getPaddingRight();
                int iSave = canvas.save();
                canvas.translate(seekBar.getPaddingLeft(), seekBar.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    jnVar.c.draw(canvas);
                    canvas.translate(width / max, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    public jm(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.projection.gearhead.R.attr.seekBarStyle);
    }

    public jm(android.content.Context context) {
        this(context, null);
    }
}
