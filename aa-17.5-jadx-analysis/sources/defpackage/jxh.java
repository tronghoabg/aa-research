package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class jxh extends FrameLayout {
    private final ViewGroup a;

    public jxh(Context context) throws Resources.NotFoundException {
        super(context, null, 0, 0);
        setFocusable(true);
        setClickable(true);
        LayoutInflater.from(context).inflate(R.layout.alpha_jump_affordance, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R.id.visible_button);
        viewFindViewById.getClass();
        ViewGroup viewGroup = (ViewGroup) viewFindViewById;
        this.a = viewGroup;
        leh.a.a();
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.alphaJumpTextColor, R.attr.alphaJumpOutlineColor});
        typedArrayObtainStyledAttributes.getClass();
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        int color2 = typedArrayObtainStyledAttributes.getColor(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (color != 0) {
            View viewFindViewById2 = findViewById(R.id.button_text);
            viewFindViewById2.getClass();
            ((TextView) viewFindViewById2).setTextColor(color);
        }
        if (color2 != 0) {
            Drawable drawable = getResources().getDrawable(R.drawable.button_secondary_background);
            drawable.getClass();
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.outline_stroke);
            drawableFindDrawableByLayerId.getClass();
            ((GradientDrawable) drawableFindDrawableByLayerId).setStroke(getResources().getDimensionPixelSize(R.dimen.button_secondary_stroke_width), color2);
            viewGroup.setBackground(layerDrawable);
        }
    }
}
