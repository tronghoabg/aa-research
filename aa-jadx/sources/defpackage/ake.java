package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ake extends android.widget.EdgeEffect {
    public final float a;
    public float b;

    public ake(android.content.Context context) {
        super(context);
        this.a = defpackage.dln.t(context).dI(1.0f);
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i) {
        this.b = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        super.onAbsorb(i);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f) {
        this.b = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        super.onPull(f);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.b = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f, float f2) {
        this.b = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        super.onPull(f, f2);
    }
}
