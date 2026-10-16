package com.google.android.apps.auto.components.system.layout;

/* JADX INFO: loaded from: classes2.dex */
public class FadePaddingFrameLayout extends android.widget.FrameLayout {
    private final android.graphics.Paint a;
    private final android.graphics.Paint b;
    private android.graphics.LinearGradient c;
    private android.graphics.Matrix d;

    public FadePaddingFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new android.graphics.Matrix();
        this.b = new android.graphics.Paint();
        android.graphics.Paint paint = new android.graphics.Paint();
        this.a = paint;
        float[] fArr = {com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 0.33f, 0.67f, 1.0f};
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_IN));
        android.graphics.LinearGradient linearGradient = new android.graphics.LinearGradient(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 1.0f, new int[]{16777215, 1090519039, -1862270977, -1}, fArr, android.graphics.Shader.TileMode.CLAMP);
        this.c = linearGradient;
        paint.setShader(linearGradient);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(android.graphics.Canvas canvas) {
        int iSaveLayer = canvas.saveLayer(null, this.b);
        super.dispatchDraw(canvas);
        try {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                this.d.reset();
                float f = paddingTop;
                this.d.setScale(1.0f, f);
                this.c.setLocalMatrix(this.d);
                canvas.drawRect(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, getWidth(), f, this.a);
            }
            int paddingBottom = getPaddingBottom();
            if (paddingBottom != 0) {
                this.d.reset();
                this.d.setScale(1.0f, -paddingBottom);
                this.d.postTranslate(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, getHeight());
                this.c.setLocalMatrix(this.d);
                canvas.drawRect(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, getHeight() - paddingBottom, getWidth(), getHeight(), this.a);
            }
        } finally {
            canvas.restoreToCount(iSaveLayer);
        }
    }

    public FadePaddingFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FadePaddingFrameLayout(android.content.Context context) {
        this(context, null);
    }
}
