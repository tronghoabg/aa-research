package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import Hf.e0;
import Hf.v0;
import a2.C1323c;
import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.webkit.WebViewClientCompat;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class O extends t0 {

    /* renamed from: b, reason: collision with root package name */
    public final P f30382b;

    /* renamed from: c, reason: collision with root package name */
    public final e0 f30383c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(Context context, C1323c c1323c) {
        super(context);
        AbstractC3340k.e(context, "context");
        WebView.setWebContentsDebuggingEnabled(false);
        setScrollBarStyle(0);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setScrollContainer(false);
        WebSettings settings = getSettings();
        settings.setSupportZoom(false);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setMediaPlaybackRequiresUserGesture(true);
        setVisibility(8);
        P p10 = new P(context, c1323c);
        setWebViewClient(p10);
        this.f30382b = p10;
        this.f30383c = p10.f30389f;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0, android.webkit.WebView
    public final void destroy() {
        super.destroy();
        setWebViewClient(new WebViewClientCompat());
    }

    @NotNull
    public final v0 getUnrecoverableError() {
        return this.f30383c;
    }
}
