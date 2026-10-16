package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class oct {
    private static final android.view.animation.Interpolator d = new defpackage.fif(2);
    public float b;
    public float a = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
    public final java.util.List c = new java.util.ArrayList();

    public oct(float f) {
        this.b = f;
    }

    public final defpackage.ocs a() {
        return new defpackage.ocs(this, d, this.b);
    }
}
