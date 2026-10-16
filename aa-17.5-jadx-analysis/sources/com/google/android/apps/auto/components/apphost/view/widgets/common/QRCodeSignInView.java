package com.google.android.apps.auto.components.apphost.view.widgets.common;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public class QRCodeSignInView extends FrameLayout {
    public ImageView a;

    public QRCodeSignInView(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (ImageView) findViewById(R.id.qr_code);
    }

    public QRCodeSignInView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public QRCodeSignInView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public QRCodeSignInView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
