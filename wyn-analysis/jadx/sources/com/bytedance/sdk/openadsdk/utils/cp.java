package com.bytedance.sdk.openadsdk.utils;

import A0.j;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public class cp implements com.bytedance.sdk.component.lw.ab {
    private final WeakReference<ImageView> uef;

    public cp(ImageView imageView) {
        this.uef = new WeakReference<>(imageView);
    }

    @Override // com.bytedance.sdk.component.lw.ab
    public void uef(com.bytedance.sdk.component.lw.dj djVar) {
        ImageView imageView = this.uef.get();
        if (imageView == null) {
            return;
        }
        try {
            Object objOa = djVar.oa();
            if (objOa instanceof Bitmap) {
                imageView.setImageBitmap((Bitmap) objOa);
                return;
            }
            if (!(objOa instanceof Drawable)) {
                imageView.setVisibility(8);
                return;
            }
            if (Build.VERSION.SDK_INT >= 28 && j.x((Drawable) objOa)) {
                j.j((Drawable) objOa).start();
            }
            imageView.setImageDrawable((Drawable) objOa);
        } catch (Throwable unused) {
            imageView.setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.component.lw.ab
    public void uef(int i5, String str, Throwable th) {
        ImageView imageView = this.uef.get();
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(8);
    }
}
