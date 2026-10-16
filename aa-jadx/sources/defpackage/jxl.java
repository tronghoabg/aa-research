package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jxl extends android.widget.FrameLayout {
    private final android.view.ViewGroup a;

    public jxl(android.content.Context context) {
        super(context, null, 0, 0);
        setFocusable(true);
        setClickable(true);
        android.view.LayoutInflater.from(context).inflate(com.google.android.projection.gearhead.R.layout.alpha_jump_affordance, (android.view.ViewGroup) this, true);
        android.view.View viewFindViewById = findViewById(com.google.android.projection.gearhead.R.id.visible_button);
        viewFindViewById.getClass();
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) viewFindViewById;
        this.a = viewGroup;
        defpackage.lem.a.a();
        android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{com.google.android.projection.gearhead.R.attr.alphaJumpTextColor, com.google.android.projection.gearhead.R.attr.alphaJumpOutlineColor});
        typedArrayObtainStyledAttributes.getClass();
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        int color2 = typedArrayObtainStyledAttributes.getColor(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (color != 0) {
            android.view.View viewFindViewById2 = findViewById(com.google.android.projection.gearhead.R.id.button_text);
            viewFindViewById2.getClass();
            ((android.widget.TextView) viewFindViewById2).setTextColor(color);
        }
        if (color2 != 0) {
            android.graphics.drawable.Drawable drawable = getResources().getDrawable(com.google.android.projection.gearhead.R.drawable.button_secondary_background);
            drawable.getClass();
            android.graphics.drawable.LayerDrawable layerDrawable = (android.graphics.drawable.LayerDrawable) drawable;
            android.graphics.drawable.Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(com.google.android.projection.gearhead.R.id.outline_stroke);
            drawableFindDrawableByLayerId.getClass();
            ((android.graphics.drawable.GradientDrawable) drawableFindDrawableByLayerId).setStroke(getResources().getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.button_secondary_stroke_width), color2);
            viewGroup.setBackground(layerDrawable);
        }
    }
}
