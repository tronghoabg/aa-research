package com.google.android.apps.auto.components.apphost.view.widgets.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.apps.auto.components.apphost.view.widgets.common.CarTextView;
import com.google.android.projection.gearhead.R;
import defpackage.ghw;
import defpackage.hmb;

/* loaded from: classes2.dex */
public class ResponsiveTurnCardViewContainer extends LinearLayout {
    public FrameLayout a;
    public View b;
    public View c;
    public ImageView d;
    public CarTextView e;
    public CarTextView f;
    public FrameLayout g;
    public ImageView h;
    public int i;
    public final hmb j;
    public ImageView k;
    public CarTextView l;
    public CarTextView m;

    public ResponsiveTurnCardViewContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.templateRoutingDefaultIconTint});
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        hmb hmbVar = hmb.a;
        this.j = new hmb(color, false, false, ghw.b, null, false, 0);
    }

    public final void a(int i) throws Resources.NotFoundException {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.b.getLayoutParams();
        layoutParams.bottomMargin = dimensionPixelSize;
        this.b.setLayoutParams(layoutParams);
    }

    public final void b(CarTextView carTextView, int i) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{i});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        carTextView.setTextAppearance(resourceId);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (FrameLayout) findViewById(R.id.responsive_step_view_holder);
    }

    public ResponsiveTurnCardViewContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ResponsiveTurnCardViewContainer(Context context) {
        this(context, null);
    }
}
