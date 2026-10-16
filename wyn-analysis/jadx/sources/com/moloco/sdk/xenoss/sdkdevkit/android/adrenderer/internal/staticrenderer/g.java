package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer;

import Ef.E;
import Ef.H;
import Ef.S;
import Hf.e0;
import Hf.g0;
import Hf.j0;
import Hf.v0;
import Jf.n;
import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebSettings;
import com.moloco.sdk.internal.services.B;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s;
import ff.m;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class g extends t0 {

    /* renamed from: b, reason: collision with root package name */
    public final E f30539b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f30540c;

    /* renamed from: d, reason: collision with root package name */
    public final i f30541d;

    /* renamed from: e, reason: collision with root package name */
    public final e0 f30542e;

    /* renamed from: f, reason: collision with root package name */
    public final j0 f30543f;

    /* renamed from: g, reason: collision with root package name */
    public final e0 f30544g;

    public g(Context context, B clickthroughService, s buttonTracker, boolean z2, int i5) {
        Lf.e eVar = S.f3698a;
        Kd.a aVarC = H.c(n.f6132a);
        z2 = (i5 & 16) != 0 ? false : z2;
        i iVar = new i(aVarC, clickthroughService, buttonTracker);
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(clickthroughService, "clickthroughService");
        AbstractC3340k.e(buttonTracker, "buttonTracker");
        super(context);
        this.f30539b = aVarC;
        this.f30540c = z2;
        this.f30541d = iVar;
        setWebViewClient(iVar);
        setScrollBarStyle(0);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        WebSettings settings = getSettings();
        settings.setSupportZoom(false);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        setBackgroundColor(0);
        setVisibility(8);
        this.f30542e = iVar.f30557i;
        this.f30543f = iVar.k;
        this.f30544g = iVar.f30555g;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0, android.webkit.WebView
    public final void destroy() {
        super.destroy();
        H.j(this.f30539b, null);
    }

    @NotNull
    public final g0 getClickthroughEvent() {
        return this.f30543f;
    }

    @NotNull
    public final v0 getUnrecoverableError() {
        return this.f30542e;
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        AbstractC3340k.e(event, "event");
        if (this.f30540c) {
            return false;
        }
        if (event.getAction() == 0) {
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a aVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a(m.t0(iArr), m.B0(iArr), getHeight(), getWidth(), (int) (event.getX() + m.t0(iArr)), (int) (event.getY() + m.B0(iArr)));
            i iVar = this.f30541d;
            iVar.getClass();
            iVar.f30559l = aVar;
        }
        return super.onTouchEvent(event);
    }
}
