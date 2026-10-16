package com.google.android.apps.auto.components.apphost.view.widgets.navigation;

/* JADX INFO: loaded from: classes2.dex */
public class ResponsiveTurnCardViewContainer extends android.widget.LinearLayout {
    public android.widget.FrameLayout a;
    public android.view.View b;
    public android.view.View c;
    public android.widget.ImageView d;
    public com.google.android.apps.auto.components.apphost.view.widgets.common.CarTextView e;
    public com.google.android.apps.auto.components.apphost.view.widgets.common.CarTextView f;
    public android.widget.FrameLayout g;
    public android.widget.ImageView h;
    public int i;
    public final defpackage.hmh j;
    public android.widget.ImageView k;
    public com.google.android.apps.auto.components.apphost.view.widgets.common.CarTextView l;
    public com.google.android.apps.auto.components.apphost.view.widgets.common.CarTextView m;

    public ResponsiveTurnCardViewContainer(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{com.google.android.projection.gearhead.R.attr.templateRoutingDefaultIconTint});
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        defpackage.hmh hmhVar = defpackage.hmh.a;
        this.j = new defpackage.hmh(color, false, false, defpackage.gic.b, null, false, 0);
    }

    public final void a(int i) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i);
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.b.getLayoutParams();
        layoutParams.bottomMargin = dimensionPixelSize;
        this.b.setLayoutParams(layoutParams);
    }

    public final void b(com.google.android.apps.auto.components.apphost.view.widgets.common.CarTextView carTextView, int i) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{i});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        carTextView.setTextAppearance(resourceId);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (android.widget.FrameLayout) findViewById(com.google.android.projection.gearhead.R.id.responsive_step_view_holder);
    }

    public ResponsiveTurnCardViewContainer(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ResponsiveTurnCardViewContainer(android.content.Context context) {
        this(context, null);
    }
}
