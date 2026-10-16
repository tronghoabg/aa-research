package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class wsl {
    protected wsm j;
    protected final List k = new ArrayList();

    protected wsl(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            this.k.add(new wsi());
        }
    }

    protected static final float h(int i, int i2, int i3) {
        return dlz.i((i - i2) / i3, BitmapDescriptorFactory.HUE_RED, 1.0f);
    }

    public abstract void a();

    public abstract void b();

    public abstract void c(fhh fhhVar);

    public abstract void d();

    public abstract void f();

    public abstract void g();
}
