package U1;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* loaded from: classes.dex */
public final class r implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0850u f12116a;

    public r(C0850u c0850u) {
        this.f12116a = c0850u;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i5, int i10) {
        C0850u c0850u = this.f12116a;
        c0850u.getClass();
        Surface surface = new Surface(surfaceTexture);
        c0850u.K0(surface);
        c0850u.f12134O = surface;
        c0850u.y0(i5, i10);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C0850u c0850u = this.f12116a;
        c0850u.K0(null);
        c0850u.y0(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i5, int i10) {
        this.f12116a.y0(i5, i10);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i5, int i10, int i11) {
        this.f12116a.y0(i10, i11);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        C0850u c0850u = this.f12116a;
        if (c0850u.f12136Q) {
            c0850u.K0(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C0850u c0850u = this.f12116a;
        if (c0850u.f12136Q) {
            c0850u.K0(null);
        }
        c0850u.y0(0, 0);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
