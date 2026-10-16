package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fij extends android.view.ViewGroup.LayoutParams {
    public boolean a;
    public int b;
    public float c;
    public boolean d;
    public int e;
    public int f;

    public fij(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.viewpager.widget.ViewPager.a);
        this.b = typedArrayObtainStyledAttributes.getInteger(0, 48);
        typedArrayObtainStyledAttributes.recycle();
    }

    public fij() {
        super(-1, -1);
        this.c = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
    }
}
