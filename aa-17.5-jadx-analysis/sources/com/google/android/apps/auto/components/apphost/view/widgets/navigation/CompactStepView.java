package com.google.android.apps.auto.components.apphost.view.widgets.navigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.apps.auto.components.apphost.view.widgets.common.CarTextView;
import com.google.android.projection.gearhead.R;
import defpackage.ghw;
import defpackage.hmb;
import defpackage.yph;

/* loaded from: classes2.dex */
public class CompactStepView extends LinearLayout {
    public ImageView a;
    public CarTextView b;
    public final hmb c;

    static {
        yph.c("CarApp.H.Tem");
    }

    public CompactStepView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.templateRoutingDefaultIconTint});
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        hmb hmbVar = hmb.a;
        this.c = new hmb(color, false, false, ghw.b, null, false, 0);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (ImageView) findViewById(R.id.compact_turn_symbol);
        this.b = (CarTextView) findViewById(R.id.compact_description_text);
    }

    public CompactStepView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CompactStepView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public CompactStepView(Context context) {
        this(context, null);
    }
}
