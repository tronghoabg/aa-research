package com.google.android.apps.auto.components.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;
import defpackage.leh;
import defpackage.onj;
import defpackage.onk;
import defpackage.onl;
import defpackage.onm;
import defpackage.onn;

/* loaded from: classes2.dex */
public class Button extends FrameLayout {
    final ViewGroup a;
    final TextView b;
    final ImageView c;
    int d;
    int e;
    private final boolean f;
    private final onj g;

    public Button(Context context, AttributeSet attributeSet, int i, int i2, onm onmVar, onk onkVar) {
        onl onlVar;
        super(context, attributeSet, i, i2);
        setFocusable(true);
        setClickable(true);
        if (onkVar.ordinal() != 1) {
            onlVar = new onl(this, 0);
            this.g = onlVar;
        } else {
            onlVar = new onl(this, 1);
            this.g = onlVar;
        }
        LayoutInflater.from(context).inflate(R.layout.button_tuned, (ViewGroup) this, true);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.visible_button);
        this.a = viewGroup;
        this.b = (TextView) findViewById(R.id.button_text);
        this.c = (ImageView) findViewById(R.id.button_icon);
        leh.a();
        this.f = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.scrollBarViewColor, R.attr.alphaJumpOutlineColor});
        this.d = typedArrayObtainStyledAttributes.getColor(0, 0);
        this.e = typedArrayObtainStyledAttributes.getColor(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        layoutParams.height = onlVar.a();
        viewGroup.setLayoutParams(layoutParams);
        c(onmVar);
        d();
    }

    private final void d() {
        this.b.setVisibility(8);
        ImageView imageView = this.c;
        imageView.setVisibility(0);
        int iB = this.g.b();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.setMarginStart(iB);
        layoutParams.setMarginEnd(iB);
        imageView.setLayoutParams(layoutParams);
    }

    private final void e() {
        TextView textView = this.b;
        if (TextUtils.isEmpty(textView.getText())) {
            d();
            return;
        }
        ImageView imageView = this.c;
        if (imageView.getDrawable() == null) {
            imageView.setVisibility(8);
            textView.setVisibility(0);
            Resources resources = getContext().getResources();
            int iE = this.g.e();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
            layoutParams.setMarginStart(iE);
            layoutParams.setMarginEnd(iE);
            textView.setLayoutParams(layoutParams);
            textView.setMaxEms(resources.getInteger(R.integer.button_max_ems_no_icon));
            return;
        }
        textView.setVisibility(0);
        imageView.setVisibility(0);
        Resources resources2 = getContext().getResources();
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) imageView.getLayoutParams();
        onj onjVar = this.g;
        layoutParams2.setMarginStart(onjVar.d());
        layoutParams2.setMarginEnd(resources2.getDimensionPixelSize(R.dimen.button_icon_to_text_space));
        imageView.setLayoutParams(layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) textView.getLayoutParams();
        layoutParams3.setMarginStart(0);
        layoutParams3.setMarginEnd(onjVar.c());
        textView.setLayoutParams(layoutParams3);
        textView.setMaxEms(resources2.getInteger(R.integer.button_max_ems_with_icon));
    }

    public final void a(int i) {
        int i2;
        ImageView imageView = this.c;
        imageView.setImageResource(i);
        if (this.f && (i2 = this.d) != 0) {
            imageView.setColorFilter(i2);
        }
        e();
    }

    public final void b(CharSequence charSequence) {
        this.b.setText(charSequence);
        e();
    }

    public final void c(onm onmVar) {
        int iOrdinal = onmVar.ordinal();
        if (iOrdinal == 0) {
            this.a.setBackgroundResource(R.drawable.button_primary_background);
            return;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                this.a.setBackgroundResource(R.drawable.button_no_outline_background);
                return;
            } else {
                if (iOrdinal != 3) {
                    return;
                }
                this.a.setBackgroundResource(R.drawable.button_primary_blue_background);
                return;
            }
        }
        if (!this.f || this.e == 0) {
            this.a.setBackgroundResource(R.drawable.button_secondary_background);
            return;
        }
        LayerDrawable layerDrawable = (LayerDrawable) getResources().getDrawable(R.drawable.button_secondary_background);
        ((GradientDrawable) layerDrawable.findDrawableByLayerId(R.id.outline_stroke)).setStroke(getResources().getDimensionPixelSize(R.dimen.button_secondary_stroke_width), this.e);
        this.a.setBackground(layerDrawable);
    }

    public Button(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Button(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Button(Context context, AttributeSet attributeSet, int i, int i2) {
        onm onmVar;
        onk onkVar;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, onn.a, i, i2);
        try {
            int i3 = typedArrayObtainStyledAttributes.getInt(1, -1);
            onm onmVar2 = onm.PRIMARY;
            onm[] onmVarArrValues = onm.values();
            int length = onmVarArrValues.length;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    onmVar = onmVar2;
                    break;
                }
                onm onmVar3 = onmVarArrValues[i5];
                if (onmVar3.e == i3) {
                    onmVar = onmVar3;
                    break;
                }
                i5++;
            }
            typedArrayObtainStyledAttributes.recycle();
            typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, onn.a, i, i2);
            try {
                int i6 = typedArrayObtainStyledAttributes.getInt(0, -1);
                onk onkVar2 = onk.SMALL;
                onk[] onkVarArrValues = onk.values();
                int length2 = onkVarArrValues.length;
                while (true) {
                    if (i4 >= length2) {
                        onkVar = onkVar2;
                        break;
                    }
                    onk onkVar3 = onkVarArrValues[i4];
                    if (onkVar3.c == i6) {
                        onkVar = onkVar3;
                        break;
                    }
                    i4++;
                }
                typedArrayObtainStyledAttributes.recycle();
                this(context, attributeSet, i, i2, onmVar, onkVar);
            } finally {
            }
        } finally {
        }
    }

    public Button(Context context) {
        this(context, null);
    }

    public Button(Context context, onm onmVar, onk onkVar) {
        this(context, null, 0, 0, onmVar, onkVar);
    }
}
