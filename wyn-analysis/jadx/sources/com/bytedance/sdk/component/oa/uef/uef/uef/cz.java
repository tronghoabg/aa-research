package com.bytedance.sdk.component.oa.uef.uef.uef;

import com.applovin.shadow.okio.Segment;
import com.bytedance.sdk.component.oa.uef.wk;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* loaded from: classes.dex */
public class cz extends wk {

    /* renamed from: oa, reason: collision with root package name */
    InputStream f25066oa;
    HttpURLConnection uef;

    public cz(HttpURLConnection httpURLConnection) throws IOException {
        this.uef = httpURLConnection;
        this.f25066oa = new xs(httpURLConnection.getInputStream(), httpURLConnection);
    }

    @Override // com.bytedance.sdk.component.oa.uef.wk, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            this.f25066oa.close();
            this.uef.disconnect();
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.oa.uef.wk
    public com.bytedance.sdk.component.oa.uef.cz lw() {
        if (this.uef.getContentType() != null) {
            return com.bytedance.sdk.component.oa.uef.cz.uef(this.uef.getContentType());
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.oa.uef.wk
    public byte[] moa() throws IOException {
        try {
            byte[] bArr = new byte[Segment.SHARE_MINIMUM];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int i5 = this.f25066oa.read(bArr);
                if (i5 == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i5);
            }
        } catch (Exception unused) {
            return new byte[0];
        }
    }

    @Override // com.bytedance.sdk.component.oa.uef.wk
    public String oa() throws IOException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f25066oa));
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    String string = stringBuffer.toString();
                    close();
                    return string;
                }
                stringBuffer.append(line + "\n");
            }
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.bytedance.sdk.component.oa.uef.wk
    public long uef() {
        try {
            return this.uef.getContentLength();
        } catch (Exception unused) {
            return 0L;
        }
    }

    @Override // com.bytedance.sdk.component.oa.uef.wk
    public InputStream yo() {
        return this.f25066oa;
    }

    public cz(HttpURLConnection httpURLConnection, InputStream inputStream) {
        this.uef = httpURLConnection;
        this.f25066oa = new xs(inputStream, httpURLConnection);
    }
}
