package com.google.android.apps.auto.components.ui.widget.navigation;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public class DetailedNavigationStepView extends LinearLayout {
    public ImageView a;
    public TextView b;
    public TextView c;
    public ImageView d;
    public LinearLayout e;
    public FrameLayout f;

    public DetailedNavigationStepView(Context context) {
        this(context, null);
    }

    public final void a(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        TextView textView = this.c;
        if (zIsEmpty) {
            textView.setText((CharSequence) null);
            this.c.setVisibility(8);
        } else {
            textView.setText(charSequence);
            this.c.setVisibility(0);
        }
    }

    public final void b(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        TextView textView = this.b;
        if (zIsEmpty) {
            textView.setText((CharSequence) null);
            this.b.setVisibility(8);
        } else {
            textView.setText(charSequence);
            this.b.setVisibility(0);
        }
    }

    public final void c(Drawable drawable) {
        ImageView imageView = this.a;
        if (drawable == null) {
            imageView.setVisibility(8);
            return;
        }
        imageView.setImageDrawable(drawable);
        this.a.setVisibility(0);
        this.a.setScaleX(1.0f);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (ImageView) findViewById(R.id.turn_symbol);
        this.b = (TextView) findViewById(R.id.distance_text);
        this.c = (TextView) findViewById(R.id.description_text);
        this.d = (ImageView) findViewById(R.id.lanes_image);
        this.e = (LinearLayout) findViewById(R.id.turn_container);
        this.f = (FrameLayout) findViewById(R.id.lanes_image_container);
    }

    public DetailedNavigationStepView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DetailedNavigationStepView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
