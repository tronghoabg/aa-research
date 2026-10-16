package com.applovin.impl;

import cb.AbstractC1593a;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.shadow.okhttp3.OkHttpClient;
import com.applovin.shadow.okhttp3.Request;
import com.applovin.shadow.okhttp3.Response;
import com.applovin.shadow.okhttp3.ResponseBody;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class d4 implements g2 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f21365a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f21366b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicReference f21367c = new AtomicReference();

    public d4(com.applovin.impl.sdk.k kVar) {
        this.f21365a = kVar;
        this.f21366b = kVar.O();
    }

    private OkHttpClient a() {
        Object objBuild = this.f21367c.get();
        if (objBuild == null) {
            synchronized (this.f21367c) {
                try {
                    objBuild = this.f21367c.get();
                    if (objBuild == null) {
                        OkHttpClient.Builder builder = new OkHttpClient.Builder();
                        long jIntValue = ((Integer) this.f21365a.a(y4.f23738Y2)).intValue();
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        objBuild = builder.connectTimeout(jIntValue, timeUnit).readTimeout(((Integer) this.f21365a.a(y4.f23745Z2)).intValue(), timeUnit).followRedirects(true).followSslRedirects(true).build();
                        if (objBuild == null) {
                            objBuild = this.f21367c;
                        }
                        this.f21367c.set(objBuild);
                    }
                } finally {
                }
            }
        }
        if (objBuild == this.f21367c) {
            objBuild = null;
        }
        return (OkHttpClient) objBuild;
    }

    @Override // com.applovin.impl.g2
    public InputStream a(String str, Map map) throws IOException {
        Response responseExecute = a().newCall(new Request.Builder().url(str).get().build()).execute();
        int iCode = responseExecute.code();
        this.f21365a.D().a("loadResource", str, iCode, responseExecute.message());
        if (AbstractC1659r0.a(iCode)) {
            return null;
        }
        if (com.applovin.impl.sdk.o.a()) {
            AbstractC1593a.s("Opened stream to resource ", str, this.f21366b, "OkHttpLoader");
        }
        ResponseBody responseBodyBody = responseExecute.body();
        if (responseBodyBody == null) {
            return null;
        }
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("url", str);
        mapHashMap.putAll(map);
        CollectionUtils.putStringIfValid("source", "OkHttpLoader", mapHashMap);
        CollectionUtils.putStringIfValid("details", responseExecute.protocol().name(), mapHashMap);
        this.f21365a.g().d(d2.f21284P, mapHashMap);
        return responseBodyBody.byteStream();
    }
}
