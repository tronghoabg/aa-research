package com.bytedance.adsdk.oa.moa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* loaded from: classes.dex */
public class uef implements moa {
    private final HttpURLConnection uef;

    public uef(HttpURLConnection httpURLConnection) {
        this.uef = httpURLConnection;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.uef.disconnect();
    }

    @Override // com.bytedance.adsdk.oa.moa.moa
    public String moa() {
        try {
            if (uef()) {
                return null;
            }
            return "Unable to fetch " + this.uef.getURL() + ". Failed with " + this.uef.getResponseCode() + "\n" + uef(this.uef);
        } catch (IOException e7) {
            return e7.getMessage();
        }
    }

    @Override // com.bytedance.adsdk.oa.moa.moa
    public InputStream oa() throws IOException {
        return this.uef.getInputStream();
    }

    @Override // com.bytedance.adsdk.oa.moa.moa
    public boolean uef() {
        try {
            return this.uef.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // com.bytedance.adsdk.oa.moa.moa
    public String yo() {
        return this.uef.getContentType();
    }

    private String uef(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb2.append(line);
                    sb2.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } finally {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
            }
        }
        return sb2.toString();
    }
}
