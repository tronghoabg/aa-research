package com.android.car.libraries.apphost.view;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import defpackage.ajmd;
import defpackage.gks;
import defpackage.hln;

/* loaded from: classes2.dex */
public class TextureViewContainer extends TextureView implements TextureView.SurfaceTextureListener, hln {
    private Surface b;
    private boolean c;
    private ajmd d;

    public TextureViewContainer(Context context) {
        this(context, null);
    }

    @Override // defpackage.hln
    public final int a() {
        return getResources().getDisplayMetrics().densityDpi;
    }

    @Override // defpackage.hln
    public final Surface b() {
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (!this.c || surfaceTexture == null) {
            return null;
        }
        Surface surface = this.b;
        if (surface != null) {
            return surface;
        }
        Surface surface2 = new Surface(surfaceTexture);
        this.b = surface2;
        return surface2;
    }

    @Override // defpackage.hln
    public final void c() {
        setVisibility(8);
    }

    @Override // defpackage.hln
    public final void d() {
        setAlpha(BitmapDescriptorFactory.HUE_RED);
    }

    @Override // defpackage.hln
    public final void e() {
        setVisibility(0);
    }

    @Override // defpackage.hln
    public final void f() {
        setAlpha(1.0f);
    }

    @Override // defpackage.hln
    public final void h(ajmd ajmdVar) {
        this.d = ajmdVar;
    }

    @Override // android.view.TextureView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setSurfaceTextureListener(this);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.c = true;
        if (this.d != null) {
            gks.b("CarApp.H.Tem", "SurfaceProvider: Surface created");
            this.d.L();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.c = false;
        ajmd ajmdVar = this.d;
        if (ajmdVar != null) {
            ajmdVar.M();
        }
        Surface surface = this.b;
        if (surface == null) {
            return true;
        }
        surface.release();
        this.b = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        ajmd ajmdVar = this.d;
        if (ajmdVar != null) {
            ajmdVar.L();
        }
    }

    public TextureViewContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TextureViewContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // defpackage.hln
    public final void g() {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // defpackage.hln
    public final void setZOrderOnTop(boolean z) {
    }
}
