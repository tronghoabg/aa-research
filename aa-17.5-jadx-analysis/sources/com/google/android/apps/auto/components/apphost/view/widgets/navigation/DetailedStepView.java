package com.google.android.apps.auto.components.apphost.view.widgets.navigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.auto.components.apphost.view.widgets.common.CarTextView;
import com.google.android.projection.gearhead.R;
import defpackage.ghw;
import defpackage.hmb;
import defpackage.yph;

/* loaded from: classes2.dex */
public class DetailedStepView extends LinearLayout {
    public ImageView a;
    public TextView b;
    public CarTextView c;
    public ImageView d;
    public LinearLayout e;
    public FrameLayout f;
    public final hmb g;

    static {
        yph.c("CarApp.H.Tem");
    }

    public DetailedStepView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.templateRoutingDefaultIconTint});
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        hmb hmbVar = hmb.a;
        this.g = new hmb(color, false, false, ghw.b, null, false, 0);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (ImageView) findViewById(R.id.turn_symbol);
        this.b = (TextView) findViewById(R.id.distance_text);
        this.c = (CarTextView) findViewById(R.id.description_text);
        this.d = (ImageView) findViewById(R.id.lanes_image);
        this.e = (LinearLayout) findViewById(R.id.turn_container);
        this.f = (FrameLayout) findViewById(R.id.lanes_image_container);
    }

    public DetailedStepView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DetailedStepView(Context context) {
        this(context, null);
    }
}
