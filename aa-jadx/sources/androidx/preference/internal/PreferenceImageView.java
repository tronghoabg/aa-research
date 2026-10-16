package androidx.preference.internal;

/* JADX INFO: loaded from: classes2.dex */
public class PreferenceImageView extends android.widget.ImageView {
    private int a;
    private int b;

    public PreferenceImageView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY;
        this.b = androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.eyn.j, i, 0);
        setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(3, androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY));
        setMaxHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(2, androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.ImageView
    public final int getMaxHeight() {
        return this.b;
    }

    @Override // android.widget.ImageView
    public final int getMaxWidth() {
        return this.a;
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        int mode = android.view.View.MeasureSpec.getMode(i);
        int i4 = 0;
        if (mode == Integer.MIN_VALUE) {
            int size = android.view.View.MeasureSpec.getSize(i);
            i3 = this.a;
            if (i3 != Integer.MAX_VALUE && (i3 < size || mode == 0)) {
                i = android.view.View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
            }
        } else if (mode == 0) {
            mode = 0;
            int size2 = android.view.View.MeasureSpec.getSize(i);
            i3 = this.a;
            if (i3 != Integer.MAX_VALUE) {
                i = android.view.View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
            }
        }
        int mode2 = android.view.View.MeasureSpec.getMode(i2);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
            }
            super.onMeasure(i, i2);
        }
        i4 = mode2;
        int size3 = android.view.View.MeasureSpec.getSize(i2);
        int i5 = this.b;
        if (i5 != Integer.MAX_VALUE && (i5 < size3 || i4 == 0)) {
            i2 = android.view.View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.ImageView
    public final void setMaxHeight(int i) {
        this.b = i;
        super.setMaxHeight(i);
    }

    @Override // android.widget.ImageView
    public final void setMaxWidth(int i) {
        this.a = i;
        super.setMaxWidth(i);
    }

    public PreferenceImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreferenceImageView(android.content.Context context) {
        this(context, null);
    }
}
