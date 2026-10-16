package com.applovin.impl;

import cb.AbstractC1593a;
import com.applovin.impl.sdk.utils.CollectionUtils;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class h2 implements g2 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f21646a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f21647b;

    public h2(com.applovin.impl.sdk.k kVar) {
        this.f21646a = kVar;
        this.f21647b = kVar.O();
    }

    @Override // com.applovin.impl.g2
    public InputStream a(String str, Map map) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setConnectTimeout(((Integer) this.f21646a.a(y4.f23738Y2)).intValue());
        httpURLConnection.setReadTimeout(((Integer) this.f21646a.a(y4.f23745Z2)).intValue());
        httpURLConnection.setDefaultUseCaches(true);
        httpURLConnection.setUseCaches(true);
        httpURLConnection.setAllowUserInteraction(false);
        httpURLConnection.setInstanceFollowRedirects(true);
        int responseCode = httpURLConnection.getResponseCode();
        this.f21646a.D().a("loadResource", str, responseCode, httpURLConnection.getResponseMessage());
        if (AbstractC1659r0.a(responseCode)) {
            return null;
        }
        if (com.applovin.impl.sdk.o.a()) {
            AbstractC1593a.s("Opened stream to resource ", str, this.f21647b, "HttpUrlConnectionLoader");
        }
        InputStream inputStream = httpURLConnection.getInputStream();
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("url", str);
        mapHashMap.putAll(map);
        CollectionUtils.putStringIfValid("source", "HttpUrlConnectionLoader", mapHashMap);
        this.f21646a.g().d(d2.f21284P, mapHashMap);
        return inputStream;
    }
}
