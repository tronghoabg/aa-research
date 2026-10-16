package com.google.android.apps.auto.components.apphost.view.widgets.navigation;

/* JADX INFO: loaded from: classes2.dex */
public class DetailedStepView extends android.widget.LinearLayout {
    public android.widget.ImageView a;
    public android.widget.TextView b;
    public com.google.android.apps.auto.components.apphost.view.widgets.common.CarTextView c;
    public android.widget.ImageView d;
    public android.widget.LinearLayout e;
    public android.widget.FrameLayout f;
    public final defpackage.hmh g;

    static {
        defpackage.yqm.c("CarApp.H.Tem");
    }

    public DetailedStepView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{com.google.android.projection.gearhead.R.attr.templateRoutingDefaultIconTint});
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        defpackage.hmh hmhVar = defpackage.hmh.a;
        this.g = new defpackage.hmh(color, false, false, defpackage.gic.b, null, false, 0);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (android.widget.ImageView) findViewById(com.google.android.projection.gearhead.R.id.turn_symbol);
        this.b = (android.widget.TextView) findViewById(com.google.android.projection.gearhead.R.id.distance_text);
        this.c = (com.google.android.apps.auto.components.apphost.view.widgets.common.CarTextView) findViewById(com.google.android.projection.gearhead.R.id.description_text);
        this.d = (android.widget.ImageView) findViewById(com.google.android.projection.gearhead.R.id.lanes_image);
        this.e = (android.widget.LinearLayout) findViewById(com.google.android.projection.gearhead.R.id.turn_container);
        this.f = (android.widget.FrameLayout) findViewById(com.google.android.projection.gearhead.R.id.lanes_image_container);
    }

    public DetailedStepView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DetailedStepView(android.content.Context context) {
        this(context, null);
    }
}
