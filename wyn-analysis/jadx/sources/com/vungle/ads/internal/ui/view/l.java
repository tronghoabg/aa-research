package com.vungle.ads.internal.ui.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.vungle.ads.internal.util.a0;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class l extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public ImageView f33791a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f33792b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context) {
        super(context);
        AbstractC3340k.e(context, "context");
        a(context);
    }

    public final void a(Context context) {
        this.f33791a = new ImageView(context);
        int iA = a0.a(context, 20);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iA, iA);
        ImageView imageView = this.f33791a;
        if (imageView == null) {
            AbstractC3340k.m("icon");
            throw null;
        }
        imageView.setLayoutParams(layoutParams);
        ImageView imageView2 = this.f33791a;
        if (imageView2 != null) {
            addView(imageView2);
        } else {
            AbstractC3340k.m("icon");
            throw null;
        }
    }

    @NotNull
    public final ImageView getPrivacyIcon$vungle_ads_release() {
        ImageView imageView = this.f33791a;
        if (imageView != null) {
            return imageView;
        }
        AbstractC3340k.m("icon");
        throw null;
    }

    public final void a(FrameLayout rootView, int i5) {
        AbstractC3340k.e(rootView, "rootView");
        if (getParent() != null) {
            ViewParent parent = getParent();
            AbstractC3340k.c(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(this);
        }
        rootView.addView(this);
        Context context = getContext();
        AbstractC3340k.d(context, "context");
        int iA = a0.a(context, 20);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iA, iA);
        if (i5 == 0) {
            layoutParams.gravity = 8388659;
        } else if (i5 == 1) {
            layoutParams.gravity = 8388661;
        } else if (i5 == 2) {
            layoutParams.gravity = 8388691;
        } else if (i5 != 3) {
            layoutParams.gravity = 8388661;
        } else {
            layoutParams.gravity = 8388693;
        }
        setLayoutParams(layoutParams);
        rootView.requestLayout();
    }

    public final void a() {
        ImageView imageView;
        if (this.f33792b) {
            return;
        }
        this.f33792b = true;
        try {
            imageView = this.f33791a;
        } catch (Exception e7) {
            boolean z2 = u.f33874a;
            StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("error msg: ");
            sbA.append(e7.getLocalizedMessage());
            t.c("NativeAd", sbA.toString());
        }
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                if (!bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            }
            ImageView imageView2 = this.f33791a;
            if (imageView2 != null) {
                imageView2.setImageDrawable(null);
                removeAllViews();
                if (getParent() != null) {
                    ViewParent parent = getParent();
                    AbstractC3340k.c(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                    ((ViewGroup) parent).removeView(this);
                    return;
                }
                return;
            }
            AbstractC3340k.m("icon");
            throw null;
        }
        AbstractC3340k.m("icon");
        throw null;
    }
}
