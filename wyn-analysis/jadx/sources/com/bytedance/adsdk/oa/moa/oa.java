package com.bytedance.adsdk.oa.moa;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes.dex */
public class oa implements ivm {
    @Override // com.bytedance.adsdk.oa.moa.ivm
    public moa uef(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new uef(httpURLConnection);
    }
}
