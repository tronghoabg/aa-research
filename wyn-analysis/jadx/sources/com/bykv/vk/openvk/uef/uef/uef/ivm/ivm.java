package com.bykv.vk.openvk.uef.uef.uef.ivm;

import android.view.SurfaceHolder;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class ivm implements SurfaceHolder.Callback {
    private final WeakReference<SurfaceHolder.Callback> uef;

    public ivm(SurfaceHolder.Callback callback) {
        this.uef = new WeakReference<>(callback);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i5, int i10, int i11) {
        SurfaceHolder.Callback callback = this.uef.get();
        if (callback != null) {
            callback.surfaceChanged(surfaceHolder, i5, i10, i11);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        SurfaceHolder.Callback callback = this.uef.get();
        if (callback != null) {
            callback.surfaceCreated(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        SurfaceHolder.Callback callback = this.uef.get();
        if (callback != null) {
            callback.surfaceDestroyed(surfaceHolder);
        }
    }

    public SurfaceHolder.Callback uef() {
        return this.uef.get();
    }
}
