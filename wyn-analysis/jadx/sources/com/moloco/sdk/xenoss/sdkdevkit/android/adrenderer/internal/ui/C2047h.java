package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G0;
import com.wynauto.wyn.R;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2047h extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final G0 f30872a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageButton f30873b;

    /* renamed from: c, reason: collision with root package name */
    public tf.l f30874c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2047h(G0 externalLinkHandler, Context context) {
        super(context, null, 0);
        AbstractC3340k.e(externalLinkHandler, "externalLinkHandler");
        AbstractC3340k.e(context, "context");
        this.f30872a = externalLinkHandler;
        ImageButton imageButton = new ImageButton(context);
        float f10 = 12;
        imageButton.setLayoutParams(new FrameLayout.LayoutParams((int) (context.getResources().getDisplayMetrics().density * f10), (int) (f10 * context.getResources().getDisplayMetrics().density)));
        imageButton.setImageResource(R.drawable.info_badge);
        imageButton.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageButton.setClipToOutline(true);
        imageButton.setBackground(null);
        imageButton.setOnClickListener(new Lb.h(this, 4));
        this.f30873b = imageButton;
        addView(imageButton);
        imageButton.setContentDescription("Ad Badge");
        imageButton.setTag("Ad Badge");
    }

    @NotNull
    public final ImageButton getAdButton() {
        return this.f30873b;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i5, int i10, int i11, int i12) {
        super.onLayout(z2, i5, i10, i11, i12);
        if (z2) {
            float f10 = getResources().getDisplayMetrics().density;
            ImageButton imageButton = this.f30873b;
            imageButton.getLocationOnScreen(new int[2]);
            com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d dVar = new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c.f32411g, new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g(r6[0] / f10, r6[1] / f10), new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.h(imageButton.getWidth() / f10, imageButton.getHeight() / f10));
            tf.l lVar = this.f30874c;
            if (lVar != null) {
                lVar.invoke(dVar);
            }
        }
    }

    public final void setOnButtonRenderedListener(@NotNull tf.l listener) {
        AbstractC3340k.e(listener, "listener");
        this.f30874c = listener;
    }

    public final void setPrivacyUrl(@NotNull final String url) {
        AbstractC3340k.e(url, "url");
        this.f30873b.setOnClickListener(new View.OnClickListener() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f30870a.f30872a.a(url);
            }
        });
    }
}
