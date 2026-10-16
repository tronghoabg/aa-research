package kc;

import android.content.Context;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes5.dex */
public final class p extends TextureView implements io.flutter.embedding.engine.renderer.m {

    /* renamed from: a, reason: collision with root package name */
    public boolean f39507a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f39508b;

    /* renamed from: c, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.k f39509c;

    /* renamed from: d, reason: collision with root package name */
    public Surface f39510d;

    public p(Context context) {
        super(context, null);
        this.f39507a = false;
        this.f39508b = false;
        setSurfaceTextureListener(new o(this));
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void a(io.flutter.embedding.engine.renderer.k kVar) {
        io.flutter.embedding.engine.renderer.k kVar2 = this.f39509c;
        if (kVar2 != null) {
            kVar2.g();
        }
        this.f39509c = kVar;
        resume();
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void b() {
        if (this.f39509c == null) {
            Log.w("FlutterTextureView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            io.flutter.embedding.engine.renderer.k kVar = this.f39509c;
            if (kVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            kVar.g();
            Surface surface = this.f39510d;
            if (surface != null) {
                surface.release();
                this.f39510d = null;
            }
        }
        this.f39509c = null;
    }

    public final void c() {
        if (this.f39509c == null || getSurfaceTexture() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
        }
        Surface surface = this.f39510d;
        if (surface != null) {
            surface.release();
            this.f39510d = null;
        }
        Surface surface2 = new Surface(getSurfaceTexture());
        this.f39510d = surface2;
        io.flutter.embedding.engine.renderer.k kVar = this.f39509c;
        boolean z2 = this.f39508b;
        if (!z2) {
            kVar.g();
        }
        kVar.f37010c = surface2;
        FlutterJNI flutterJNI = kVar.f37008a;
        if (z2) {
            flutterJNI.onSurfaceWindowChanged(surface2);
        } else {
            flutterJNI.onSurfaceCreated(surface2);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public io.flutter.embedding.engine.renderer.k getAttachedRenderer() {
        return this.f39509c;
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void pause() {
        if (this.f39509c == null) {
            Log.w("FlutterTextureView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f39508b = true;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void resume() {
        if (this.f39509c == null) {
            Log.w("FlutterTextureView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (this.f39507a) {
            c();
        }
        this.f39508b = false;
    }

    public void setRenderSurface(Surface surface) {
        this.f39510d = surface;
    }
}
