package defpackage;

import android.view.animation.AnimationUtils;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.io.Closeable;

/* loaded from: classes2.dex */
public final class pkb implements Closeable {
    private final oct a;

    public pkb(std stdVar) {
        vja.q(false).getClass();
        vja.q(new tnj(tnk.a)).getClass();
        stdVar.getClass();
        this.a = new oct((byte[]) null, (byte[]) null);
    }

    public final synchronized void a(pkd pkdVar) {
        pkdVar.a = null;
        pkdVar.b = Float.NaN;
        pkdVar.c = BitmapDescriptorFactory.HUE_RED;
        pkdVar.g = 0;
        pkdVar.d = false;
        pkdVar.f = Math.abs(BitmapDescriptorFactory.HUE_RED) + Math.abs(BitmapDescriptorFactory.HUE_RED) > 1.0f;
        pkdVar.e = BitmapDescriptorFactory.HUE_RED;
        pkdVar.b = Float.NaN;
        pkdVar.g = 0;
        pkdVar.h = 0.32000002f;
        pkdVar.i = (float) ((Math.abs(Math.sin(((AnimationUtils.currentAnimationTimeMillis() % 2500) * 6.283185307179586d) / 2500.0d)) * 0.15d) + 0.925d);
        pkdVar.j = 1.0f;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
