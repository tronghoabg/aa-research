package com.google.android.apps.auto.components.ui.widget;

/* JADX INFO: loaded from: classes2.dex */
public class Button extends android.widget.FrameLayout {
    final android.view.ViewGroup a;
    final android.widget.TextView b;
    final android.widget.ImageView c;
    int d;
    int e;
    private final boolean f;
    private final defpackage.oob g;

    public Button(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, defpackage.ooe ooeVar, defpackage.ooc oocVar) {
        defpackage.ood oodVar;
        super(context, attributeSet, i, i2);
        setFocusable(true);
        setClickable(true);
        if (oocVar.ordinal() != 1) {
            oodVar = new defpackage.ood(this, 0);
            this.g = oodVar;
        } else {
            oodVar = new defpackage.ood(this, 1);
            this.g = oodVar;
        }
        android.view.LayoutInflater.from(context).inflate(com.google.android.projection.gearhead.R.layout.button_tuned, (android.view.ViewGroup) this, true);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById(com.google.android.projection.gearhead.R.id.visible_button);
        this.a = viewGroup;
        this.b = (android.widget.TextView) findViewById(com.google.android.projection.gearhead.R.id.button_text);
        this.c = (android.widget.ImageView) findViewById(com.google.android.projection.gearhead.R.id.button_icon);
        defpackage.lem.a();
        this.f = true;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{com.google.android.projection.gearhead.R.attr.scrollBarViewColor, com.google.android.projection.gearhead.R.attr.alphaJumpOutlineColor});
        this.d = typedArrayObtainStyledAttributes.getColor(0, 0);
        this.e = typedArrayObtainStyledAttributes.getColor(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        layoutParams.height = oodVar.a();
        viewGroup.setLayoutParams(layoutParams);
        c(ooeVar);
        d();
    }

    private final void d() {
        this.b.setVisibility(8);
        android.widget.ImageView imageView = this.c;
        imageView.setVisibility(0);
        int iB = this.g.b();
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.setMarginStart(iB);
        layoutParams.setMarginEnd(iB);
        imageView.setLayoutParams(layoutParams);
    }

    private final void e() {
        android.widget.TextView textView = this.b;
        if (android.text.TextUtils.isEmpty(textView.getText())) {
            d();
            return;
        }
        android.widget.ImageView imageView = this.c;
        if (imageView.getDrawable() == null) {
            imageView.setVisibility(8);
            textView.setVisibility(0);
            android.content.res.Resources resources = getContext().getResources();
            int iE = this.g.e();
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) textView.getLayoutParams();
            layoutParams.setMarginStart(iE);
            layoutParams.setMarginEnd(iE);
            textView.setLayoutParams(layoutParams);
            textView.setMaxEms(resources.getInteger(com.google.android.projection.gearhead.R.integer.button_max_ems_no_icon));
            return;
        }
        textView.setVisibility(0);
        imageView.setVisibility(0);
        android.content.res.Resources resources2 = getContext().getResources();
        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) imageView.getLayoutParams();
        defpackage.oob oobVar = this.g;
        layoutParams2.setMarginStart(oobVar.d());
        layoutParams2.setMarginEnd(resources2.getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.button_icon_to_text_space));
        imageView.setLayoutParams(layoutParams2);
        android.widget.LinearLayout.LayoutParams layoutParams3 = (android.widget.LinearLayout.LayoutParams) textView.getLayoutParams();
        layoutParams3.setMarginStart(0);
        layoutParams3.setMarginEnd(oobVar.c());
        textView.setLayoutParams(layoutParams3);
        textView.setMaxEms(resources2.getInteger(com.google.android.projection.gearhead.R.integer.button_max_ems_with_icon));
    }

    public final void a(int i) {
        int i2;
        android.widget.ImageView imageView = this.c;
        imageView.setImageResource(i);
        if (this.f && (i2 = this.d) != 0) {
            imageView.setColorFilter(i2);
        }
        e();
    }

    public final void b(java.lang.CharSequence charSequence) {
        this.b.setText(charSequence);
        e();
    }

    public final void c(defpackage.ooe ooeVar) {
        int iOrdinal = ooeVar.ordinal();
        if (iOrdinal == 0) {
            this.a.setBackgroundResource(com.google.android.projection.gearhead.R.drawable.button_primary_background);
            return;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                this.a.setBackgroundResource(com.google.android.projection.gearhead.R.drawable.button_no_outline_background);
                return;
            } else {
                if (iOrdinal != 3) {
                    return;
                }
                this.a.setBackgroundResource(com.google.android.projection.gearhead.R.drawable.button_primary_blue_background);
                return;
            }
        }
        if (!this.f || this.e == 0) {
            this.a.setBackgroundResource(com.google.android.projection.gearhead.R.drawable.button_secondary_background);
            return;
        }
        android.graphics.drawable.LayerDrawable layerDrawable = (android.graphics.drawable.LayerDrawable) getResources().getDrawable(com.google.android.projection.gearhead.R.drawable.button_secondary_background);
        ((android.graphics.drawable.GradientDrawable) layerDrawable.findDrawableByLayerId(com.google.android.projection.gearhead.R.id.outline_stroke)).setStroke(getResources().getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.button_secondary_stroke_width), this.e);
        this.a.setBackground(layerDrawable);
    }

    public Button(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Button(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Button(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        defpackage.ooe ooeVar;
        defpackage.ooc oocVar;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, defpackage.oof.a, i, i2);
        try {
            int i3 = typedArrayObtainStyledAttributes.getInt(1, -1);
            defpackage.ooe ooeVar2 = defpackage.ooe.PRIMARY;
            defpackage.ooe[] ooeVarArrValues = defpackage.ooe.values();
            int length = ooeVarArrValues.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    ooeVar = ooeVar2;
                    break;
                }
                defpackage.ooe ooeVar3 = ooeVarArrValues[i4];
                if (ooeVar3.e == i3) {
                    ooeVar = ooeVar3;
                    break;
                }
                i4++;
            }
            typedArrayObtainStyledAttributes.recycle();
            android.content.res.TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(attributeSet, defpackage.oof.a, i, i2);
            try {
                int i5 = typedArrayObtainStyledAttributes2.getInt(0, -1);
                defpackage.ooc oocVar2 = defpackage.ooc.SMALL;
                for (defpackage.ooc oocVar3 : defpackage.ooc.values()) {
                    if (oocVar3.c == i5) {
                        oocVar = oocVar3;
                        typedArrayObtainStyledAttributes2.recycle();
                        this(context, attributeSet, i, i2, ooeVar, oocVar);
                    }
                }
                oocVar = oocVar2;
                typedArrayObtainStyledAttributes2.recycle();
                this(context, attributeSet, i, i2, ooeVar, oocVar);
            } catch (java.lang.Throwable th) {
                typedArrayObtainStyledAttributes2.recycle();
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public Button(android.content.Context context) {
        this(context, null);
    }

    public Button(android.content.Context context, defpackage.ooe ooeVar, defpackage.ooc oocVar) {
        this(context, null, 0, 0, ooeVar, oocVar);
    }
}
