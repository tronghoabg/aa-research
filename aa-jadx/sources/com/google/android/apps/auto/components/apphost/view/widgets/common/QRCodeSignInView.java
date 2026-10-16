package com.google.android.apps.auto.components.apphost.view.widgets.common;

/* JADX INFO: loaded from: classes2.dex */
public class QRCodeSignInView extends android.widget.FrameLayout {
    public android.widget.ImageView a;

    public QRCodeSignInView(android.content.Context context) {
        this(context, null);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (android.widget.ImageView) findViewById(com.google.android.projection.gearhead.R.id.qr_code);
    }

    public QRCodeSignInView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public QRCodeSignInView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public QRCodeSignInView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
