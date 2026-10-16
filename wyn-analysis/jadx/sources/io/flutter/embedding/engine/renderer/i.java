package io.flutter.embedding.engine.renderer;

import A7.A;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import io.flutter.view.TextureRegistry$SurfaceTextureEntry;
import io.flutter.view.o;
import io.flutter.view.p;

/* loaded from: classes5.dex */
public final class i implements TextureRegistry$SurfaceTextureEntry, p {

    /* renamed from: a, reason: collision with root package name */
    public final long f36986a;

    /* renamed from: b, reason: collision with root package name */
    public final SurfaceTextureWrapper f36987b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f36988c;

    /* renamed from: d, reason: collision with root package name */
    public p f36989d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k f36990e;

    public i(k kVar, long j8, SurfaceTexture surfaceTexture) {
        this.f36990e = kVar;
        this.f36986a = j8;
        SurfaceTextureWrapper surfaceTextureWrapper = new SurfaceTextureWrapper(surfaceTexture, new d(this, 1));
        this.f36987b = surfaceTextureWrapper;
        surfaceTextureWrapper.surfaceTexture().setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: io.flutter.embedding.engine.renderer.h
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                i iVar = this.f36985a;
                if (iVar.f36988c) {
                    return;
                }
                k kVar2 = iVar.f36990e;
                if (kVar2.f37008a.isAttached()) {
                    iVar.f36987b.markDirty();
                    kVar2.f37008a.scheduleFrame();
                }
            }
        }, new Handler());
    }

    public final void finalize() throws Throwable {
        try {
            if (this.f36988c) {
                return;
            }
            k kVar = this.f36990e;
            kVar.f37012e.post(new A(this.f36986a, kVar.f37008a));
        } finally {
            super.finalize();
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final long id() {
        return this.f36986a;
    }

    @Override // io.flutter.view.p
    public final void onTrimMemory(int i5) {
        p pVar = this.f36989d;
        if (pVar != null) {
            pVar.onTrimMemory(i5);
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final void release() {
        if (this.f36988c) {
            return;
        }
        this.f36987b.release();
        k kVar = this.f36990e;
        kVar.f37008a.unregisterTexture(this.f36986a);
        kVar.f(this);
        this.f36988c = true;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final void setOnFrameConsumedListener(o oVar) {
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final void setOnTrimMemoryListener(p pVar) {
        this.f36989d = pVar;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final SurfaceTexture surfaceTexture() {
        return this.f36987b.surfaceTexture();
    }
}
