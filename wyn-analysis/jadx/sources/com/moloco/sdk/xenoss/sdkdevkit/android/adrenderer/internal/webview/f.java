package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview;

import Hf.InterfaceC0592c0;
import android.content.Context;
import android.webkit.WebView;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t;
import com.wynauto.wyn.R;
import kotlin.jvm.internal.AbstractC3340k;
import tf.p;
import u0.L;

/* loaded from: classes4.dex */
public final /* synthetic */ class f implements tf.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f32306a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f32307b;

    public /* synthetic */ f(long j8, p pVar) {
        this.f32306a = j8;
        this.f32307b = pVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        WebView webView = (WebView) obj2;
        InterfaceC0592c0 canClose = (InterfaceC0592c0) obj4;
        tf.l onButtonRendered = (tf.l) obj5;
        tf.a onCloseOrSkipButtonShown = (tf.a) obj7;
        boolean zBooleanValue = ((Boolean) obj10).booleanValue();
        AbstractC3340k.e(webView, "webView");
        AbstractC3340k.e(canClose, "canClose");
        AbstractC3340k.e(onButtonRendered, "onButtonRendered");
        AbstractC3340k.e(onCloseOrSkipButtonShown, "onCloseOrSkipButtonShown");
        L l10 = new L((Context) obj);
        l10.setId(R.id.moloco_fullscreen_ad_view_id);
        p pVar = this.f32307b;
        l10.setContent(new V.d(553564605, true, new j(webView, canClose, ((Integer) obj3).intValue(), onButtonRendered, (tf.a) obj6, onCloseOrSkipButtonShown, this.f32306a, pVar, (t) obj8, (L0.d) obj9, zBooleanValue, 1)));
        return l10;
    }
}
