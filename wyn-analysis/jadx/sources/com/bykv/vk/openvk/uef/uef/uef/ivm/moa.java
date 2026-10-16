package com.bykv.vk.openvk.uef.uef.uef.ivm;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.bykv.vk.openvk.uef.uef.uef.ivm.oa;

/* loaded from: classes.dex */
public class moa extends TextureView implements TextureView.SurfaceTextureListener, oa {

    /* renamed from: oa, reason: collision with root package name */
    private oa.uef f24512oa;
    private uef uef;

    public moa(Context context) {
        this(context, null);
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.ivm.oa
    public SurfaceHolder getHolder() {
        return null;
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.ivm.oa
    public View getView() {
        return this;
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.TextureView, android.view.View
    public void onSizeChanged(int i5, int i10, int i11, int i12) {
        super.onSizeChanged(i5, i10, i11, i12);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i5, int i10) {
        uef uefVar = this.uef;
        if (uefVar != null) {
            uefVar.uef(surfaceTexture, i5, i10);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        uef uefVar = this.uef;
        if (uefVar != null) {
            return uefVar.uef(surfaceTexture);
        }
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i5, int i10) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        uef uefVar = this.uef;
        if (uefVar != null) {
            uefVar.oa(surfaceTexture);
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i5) {
        super.onWindowVisibilityChanged(i5);
    }

    public void setWindowVisibilityChangedListener(oa.uef uefVar) {
        this.f24512oa = uefVar;
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.ivm.oa
    public void uef(uef uefVar) {
        this.uef = uefVar;
        setSurfaceTextureListener(this);
    }

    public moa(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.ivm.oa
    public void uef(int i5, int i10) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i10;
        layoutParams.width = i5;
        setLayoutParams(layoutParams);
    }
}
