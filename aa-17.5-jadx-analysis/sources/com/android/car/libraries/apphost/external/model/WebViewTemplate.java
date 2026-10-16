package com.android.car.libraries.apphost.external.model;

import androidx.car.app.model.ActionStrip;
import defpackage.gkr;
import defpackage.gks;
import defpackage.rb;
import defpackage.wb;
import java.util.ArrayList;
import java.util.List;

@rb
/* loaded from: classes2.dex */
public class WebViewTemplate implements wb {
    private final ActionStrip actionStrip;
    private final boolean isDomStorageEnabled;
    private final boolean isJavascriptEnabled;
    private final boolean shouldBlockNetworkLoads;
    private final String url;
    private final List<String> urlsToOpenOnPhone;

    private WebViewTemplate(gkr gkrVar) {
        this.url = gkrVar.a;
        this.actionStrip = gkrVar.b;
        this.isDomStorageEnabled = gkrVar.c;
        this.isJavascriptEnabled = gkrVar.e;
        this.shouldBlockNetworkLoads = gkrVar.d;
        this.urlsToOpenOnPhone = gkrVar.f;
    }

    public ActionStrip getActionStrip() {
        return this.actionStrip;
    }

    public String getUrl() {
        String str = this.url;
        str.getClass();
        return str;
    }

    public List<String> getUrlsToOpenOnPhone() {
        return this.urlsToOpenOnPhone;
    }

    public boolean isDomStorageEnabled() {
        return this.isDomStorageEnabled;
    }

    public boolean isJavascriptEnabled() {
        return this.isJavascriptEnabled;
    }

    public boolean shouldBlockNetworkLoads() {
        return this.shouldBlockNetworkLoads;
    }

    private WebViewTemplate() {
        this.url = null;
        this.actionStrip = null;
        this.isDomStorageEnabled = false;
        this.shouldBlockNetworkLoads = false;
        this.isJavascriptEnabled = false;
        this.urlsToOpenOnPhone = new ArrayList();
    }

    public /* synthetic */ WebViewTemplate(gkr gkrVar, gks gksVar) {
        this(gkrVar);
    }
}
