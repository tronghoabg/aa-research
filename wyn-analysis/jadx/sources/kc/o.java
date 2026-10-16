package kc;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;

/* loaded from: classes5.dex */
public final class o implements TextureView.SurfaceTextureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f39506a;

    public o(p pVar) {
        this.f39506a = pVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i5, int i10) {
        p pVar = this.f39506a;
        pVar.f39507a = true;
        if ((pVar.f39509c == null || pVar.f39508b) ? false : true) {
            pVar.c();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        p pVar = this.f39506a;
        boolean z2 = false;
        pVar.f39507a = false;
        io.flutter.embedding.engine.renderer.k kVar = pVar.f39509c;
        if (kVar != null && !pVar.f39508b) {
            z2 = true;
        }
        if (z2) {
            if (kVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            kVar.g();
            Surface surface = pVar.f39510d;
            if (surface != null) {
                surface.release();
                pVar.f39510d = null;
            }
        }
        Surface surface2 = pVar.f39510d;
        if (surface2 != null) {
            surface2.release();
            pVar.f39510d = null;
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i5, int i10) {
        p pVar = this.f39506a;
        io.flutter.embedding.engine.renderer.k kVar = pVar.f39509c;
        if (kVar == null || pVar.f39508b) {
            return;
        }
        if (kVar == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        kVar.f37008a.onSurfaceChanged(i5, i10);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
