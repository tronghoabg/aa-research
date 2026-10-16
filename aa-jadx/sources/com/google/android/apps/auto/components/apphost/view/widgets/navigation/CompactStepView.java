package com.google.android.apps.auto.components.apphost.view.widgets.navigation;

/* JADX INFO: loaded from: classes2.dex */
public class CompactStepView extends android.widget.LinearLayout {
    public android.widget.ImageView a;
    public com.google.android.apps.auto.components.apphost.view.widgets.common.CarTextView b;
    public final defpackage.hmh c;

    static {
        defpackage.yqm.c("CarApp.H.Tem");
    }

    public CompactStepView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{com.google.android.projection.gearhead.R.attr.templateRoutingDefaultIconTint});
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        defpackage.hmh hmhVar = defpackage.hmh.a;
        this.c = new defpackage.hmh(color, false, false, defpackage.gic.b, null, false, 0);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (android.widget.ImageView) findViewById(com.google.android.projection.gearhead.R.id.compact_turn_symbol);
        this.b = (com.google.android.apps.auto.components.apphost.view.widgets.common.CarTextView) findViewById(com.google.android.projection.gearhead.R.id.compact_description_text);
    }

    public CompactStepView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CompactStepView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public CompactStepView(android.content.Context context) {
        this(context, null);
    }
}
