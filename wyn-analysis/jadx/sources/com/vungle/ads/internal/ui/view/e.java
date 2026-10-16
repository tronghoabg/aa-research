package com.vungle.ads.internal.ui.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.vungle.ads.internal.r1;
import com.vungle.ads.nativead.NativeVideoListener;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes5.dex */
public class e extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    public final r1 f33780a;

    /* renamed from: b, reason: collision with root package name */
    public ImageView f33781b;

    /* renamed from: c, reason: collision with root package name */
    public NativeVideoListener f33782c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, r1 internal) {
        super(context);
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(internal, "internal");
        this.f33780a = internal;
        ImageView imageView = new ImageView(context);
        this.f33781b = imageView;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        imageView.setLayoutParams(layoutParams);
        imageView.setAdjustViewBounds(true);
        addView(imageView);
    }

    public void a(Context context) {
        AbstractC3340k.e(context, "context");
        ImageView imageView = this.f33781b;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        this.f33780a.b(this.f33781b);
        requestLayout();
    }

    @Nullable
    public final ImageView getImageView$vungle_ads_release() {
        return this.f33781b;
    }

    @NotNull
    public final r1 getInternal() {
        return this.f33780a;
    }

    @Nullable
    public final NativeVideoListener getNativeVideoListener() {
        return this.f33782c;
    }

    public final void setImageView$vungle_ads_release(@Nullable ImageView imageView) {
        this.f33781b = imageView;
    }

    public final void setNativeVideoListener(@Nullable NativeVideoListener nativeVideoListener) {
        this.f33782c = nativeVideoListener;
    }

    public void a() {
        removeAllViews();
        try {
            ImageView imageView = this.f33781b;
            Drawable drawable = imageView != null ? imageView.getDrawable() : null;
            if (drawable instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                if (!bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            }
        } catch (Throwable th) {
            Fe.e.z(th);
        }
        ImageView imageView2 = this.f33781b;
        if (imageView2 != null) {
            imageView2.setImageDrawable(null);
        }
    }
}
