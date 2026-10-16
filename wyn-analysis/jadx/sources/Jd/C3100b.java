package jd;

import U1.InterfaceC0843m;
import hd.AbstractC2817a;
import hd.o;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import io.flutter.view.q;

/* renamed from: jd.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3100b extends o implements q {

    /* renamed from: e, reason: collision with root package name */
    public boolean f38755e;

    @Override // hd.o
    public final AbstractC2817a a(InterfaceC0843m interfaceC0843m, TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer) {
        if (textureRegistry$SurfaceProducer == null) {
            throw new IllegalArgumentException("surfaceProducer cannot be null to create an ExoPlayerEventListener for TextureVideoPlayer.");
        }
        boolean zHandlesCropAndRotation = textureRegistry$SurfaceProducer.handlesCropAndRotation();
        C3099a c3099a = new C3099a(interfaceC0843m, this.f36421a);
        c3099a.f38754e = zHandlesCropAndRotation;
        return c3099a;
    }

    @Override // hd.o
    public final void b() {
        super.b();
        this.f36422b.release();
    }
}
