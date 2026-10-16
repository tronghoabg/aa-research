package com.google.android.apps.auto.components.apphost.view.widgets.navigation;

/* JADX INFO: loaded from: classes2.dex */
public class MessageView extends android.widget.LinearLayout {
    public android.widget.ImageView a;
    public com.google.android.apps.auto.components.apphost.view.widgets.common.CarTextView b;
    public com.google.android.apps.auto.components.apphost.view.widgets.common.CarTextView c;
    public final defpackage.hmh d;

    static {
        defpackage.yqm.c("CarApp.H.Tem");
    }

    public MessageView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{com.google.android.projection.gearhead.R.attr.templateRoutingDefaultIconTint});
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        defpackage.hmh hmhVar = defpackage.hmh.a;
        this.d = new defpackage.hmh(color, false, false, defpackage.gic.b, null, false, 0);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (android.widget.ImageView) findViewById(com.google.android.projection.gearhead.R.id.message_image);
        this.b = (com.google.android.apps.auto.components.apphost.view.widgets.common.CarTextView) findViewById(com.google.android.projection.gearhead.R.id.message_title);
        this.c = (com.google.android.apps.auto.components.apphost.view.widgets.common.CarTextView) findViewById(com.google.android.projection.gearhead.R.id.message_text);
    }

    public MessageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MessageView(android.content.Context context) {
        this(context, null);
    }
}
