package com.bytedance.sdk.openadsdk.zjm;

import A0.j;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import com.bytedance.sdk.component.lw.ab;
import com.bytedance.sdk.component.lw.dj;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.wk;
import com.bytedance.sdk.openadsdk.utils.km;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public class yo implements ab {

    /* renamed from: oa, reason: collision with root package name */
    private final String f26213oa = "ImageLoaderToViewWrapper";
    private final WeakReference<ImageView> uef;
    private ab yo;

    private yo(ImageView imageView, ab abVar) {
        this.uef = new WeakReference<>(imageView);
        this.yo = abVar;
    }

    public static ab uef(gzw gzwVar, String str, ImageView imageView) {
        return new oa(gzwVar, str, new yo(imageView));
    }

    public static ab uef(gzw gzwVar, String str, ImageView imageView, ab abVar) {
        return new oa(gzwVar, str, new yo(imageView, abVar));
    }

    private yo(ImageView imageView) {
        this.uef = new WeakReference<>(imageView);
    }

    @Override // com.bytedance.sdk.component.lw.ab
    public void uef(dj djVar) {
        final ImageView imageView = this.uef.get();
        if (imageView != null) {
            final Object objOa = djVar.oa();
            if (objOa instanceof Bitmap) {
                if (km.ivm()) {
                    imageView.setImageBitmap((Bitmap) objOa);
                } else {
                    wk.yo().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.zjm.yo.1
                        @Override // java.lang.Runnable
                        public void run() {
                            imageView.setImageBitmap((Bitmap) objOa);
                        }
                    });
                }
                ab abVar = this.yo;
                if (abVar != null) {
                    abVar.uef(djVar);
                    return;
                }
                return;
            }
            if (objOa instanceof Drawable) {
                if (km.ivm()) {
                    uef(objOa, imageView);
                } else {
                    wk.yo().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.zjm.yo.2
                        @Override // java.lang.Runnable
                        public void run() {
                            yo.this.uef(objOa, imageView);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(Object obj, ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 28 && j.B(obj)) {
            j.k(obj).start();
        }
        imageView.setImageDrawable((Drawable) obj);
    }

    @Override // com.bytedance.sdk.component.lw.ab
    public void uef(int i5, String str, Throwable th) {
        ab abVar = this.yo;
        if (abVar != null) {
            abVar.uef(i5, str, th);
        }
    }
}
