package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wti {
    protected defpackage.wtj j;
    protected final java.util.List k = new java.util.ArrayList();

    protected wti(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            this.k.add(new defpackage.wtf());
        }
    }

    protected static final float h(int i, int i2, int i3) {
        return defpackage.duc.b((i - i2) / i3, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 1.0f);
    }

    public abstract void a();

    public abstract void b();

    public abstract void c(defpackage.fhn fhnVar);

    public abstract void d();

    public abstract void f();

    public abstract void g();
}
