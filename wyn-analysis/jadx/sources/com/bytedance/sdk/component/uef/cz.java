package com.bytedance.sdk.component.uef;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class cz {
    dj bcc;
    boolean cq;
    wrv cz;
    boolean ivm;
    Context lw;
    xs moa;

    /* renamed from: oa, reason: collision with root package name */
    uef f25082oa;
    WebView uef;
    boolean xs;
    String yo = "IESJSBridge";
    String zjm = "host";
    final Set<String> dj = new LinkedHashSet();
    final Set<String> wrv = new LinkedHashSet();

    public cz(WebView webView) {
        this.uef = webView;
    }

    public cz oa(boolean z2) {
        this.xs = z2;
        return this;
    }

    public cz uef(uef uefVar) {
        this.f25082oa = uefVar;
        return this;
    }

    private void oa() {
        if ((this.uef == null && !this.cq && this.f25082oa == null) || ((TextUtils.isEmpty(this.yo) && this.uef != null) || this.moa == null)) {
            throw new IllegalArgumentException("Requested arguments aren't set properly when building JsBridge.");
        }
    }

    public cz uef(String str) {
        this.yo = str;
        return this;
    }

    public cz uef(zjm zjmVar) {
        this.moa = xs.uef(zjmVar);
        return this;
    }

    public cz uef(boolean z2) {
        this.ivm = z2;
        return this;
    }

    public wk uef() {
        oa();
        return new wk(this);
    }

    public cz() {
    }
}
