package com.waze.sharedui.web;

import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ai extends WebChromeClient {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f39314b = 0;

    /* renamed from: a, reason: collision with root package name */
    protected final com.waze.sharedui.a.e f39315a;

    ai(com.waze.sharedui.a.e eVar) {
        this.f39315a = eVar;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        com.waze.sharedui.d.a.b bVar = new com.waze.sharedui.d.a.b(this.f39315a);
        bVar.k("");
        bVar.f(str2);
        bVar.i(new ah(jsResult, 1));
        bVar.g(new ah(jsResult, 0));
        bVar.b().a();
        return true;
    }
}
