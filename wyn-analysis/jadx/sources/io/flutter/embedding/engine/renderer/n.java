package io.flutter.embedding.engine.renderer;

import A7.A;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.TextureRegistry$GLTextureConsumer;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import io.flutter.view.q;

/* loaded from: classes5.dex */
public final class n implements TextureRegistry$SurfaceProducer, TextureRegistry$GLTextureConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final long f37016a;

    /* renamed from: b, reason: collision with root package name */
    public int f37017b;

    /* renamed from: c, reason: collision with root package name */
    public int f37018c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f37019d;

    /* renamed from: e, reason: collision with root package name */
    public Surface f37020e;

    /* renamed from: f, reason: collision with root package name */
    public final i f37021f;

    /* renamed from: g, reason: collision with root package name */
    public final Handler f37022g;

    /* renamed from: h, reason: collision with root package name */
    public final FlutterJNI f37023h;

    public n(long j8, Handler handler, FlutterJNI flutterJNI, i iVar) {
        this.f37016a = j8;
        this.f37022g = handler;
        this.f37023h = flutterJNI;
        this.f37021f = iVar;
    }

    public final void finalize() throws Throwable {
        try {
            if (this.f37019d) {
                return;
            }
            release();
            this.f37022g.post(new A(this.f37016a, this.f37023h));
        } finally {
            super.finalize();
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final Surface getForcedNewSurface() {
        this.f37020e = null;
        return getSurface();
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final int getHeight() {
        return this.f37018c;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final Surface getSurface() {
        if (this.f37020e == null) {
            this.f37020e = new Surface(this.f37021f.f36987b.surfaceTexture());
        }
        return this.f37020e;
    }

    @Override // io.flutter.view.TextureRegistry$GLTextureConsumer
    public final SurfaceTexture getSurfaceTexture() {
        return this.f37021f.f36987b.surfaceTexture();
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final int getWidth() {
        return this.f37017b;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final boolean handlesCropAndRotation() {
        return true;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final long id() {
        return this.f37016a;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final void release() {
        this.f37021f.release();
        this.f37020e.release();
        this.f37020e = null;
        this.f37019d = true;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final void scheduleFrame() {
        this.f37023h.markTextureFrameAvailable(this.f37016a);
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final void setCallback(q qVar) {
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final void setSize(int i5, int i10) {
        this.f37017b = i5;
        this.f37018c = i10;
        this.f37021f.f36987b.surfaceTexture().setDefaultBufferSize(i5, i10);
    }
}
