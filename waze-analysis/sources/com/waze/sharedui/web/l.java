package com.waze.sharedui.web;

import android.net.Uri;
import android.webkit.JsResult;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class l extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f39358a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final ai f39359b;

    /* renamed from: c, reason: collision with root package name */
    private final h.g.a.l f39360c;

    /* renamed from: d, reason: collision with root package name */
    private ValueCallback f39361d;

    public l(ai aiVar, h.g.a.l lVar) {
        h.g.b.x.f(aiVar, "baseWebChromeClient");
        h.g.b.x.f(lVar, "onMediaPickRequest");
        this.f39359b = aiVar;
        this.f39360c = lVar;
    }

    public final void a(Uri uri) {
        ValueCallback valueCallback = this.f39361d;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(uri);
        }
        this.f39361d = null;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        h.g.b.x.f(webView, "view");
        h.g.b.x.f(str, "url");
        h.g.b.x.f(str2, "message");
        h.g.b.x.f(jsResult, "result");
        this.f39359b.onJsConfirm(webView, str, str2, jsResult);
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f5  */
    @Override // android.webkit.WebChromeClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onShowFileChooser(android.webkit.WebView r8, final android.webkit.ValueCallback r9, android.webkit.WebChromeClient.FileChooserParams r10) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sharedui.web.l.onShowFileChooser(android.webkit.WebView, android.webkit.ValueCallback, android.webkit.WebChromeClient$FileChooserParams):boolean");
    }
}
