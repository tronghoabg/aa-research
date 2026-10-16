package com.bytedance.sdk.component.lw.uef;

import android.util.Log;
import com.applovin.shadow.okio.Segment;
import com.bytedance.sdk.component.lw.lw;
import com.bytedance.sdk.component.utils.zjm;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class uef implements com.bytedance.sdk.component.lw.moa<yo> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v7 */
    @Override // com.bytedance.sdk.component.lw.moa
    /* renamed from: oa, reason: merged with bridge method [inline-methods] */
    public yo<byte[]> uef(lw lwVar) throws Throwable {
        Closeable closeable;
        InputStream inputStream;
        byte[] byteArray;
        ByteArrayOutputStream byteArrayOutputStream;
        String message;
        Closeable closeable2;
        HttpURLConnection httpURLConnection;
        InputStream inputStream2 = null;
        Map<String, String> mapUef = null;
        int i5 = 0;
        try {
            try {
                httpURLConnection = (HttpURLConnection) new URL(lwVar.uef()).openConnection();
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.setReadTimeout(5000);
                httpURLConnection.connect();
                inputStream = httpURLConnection.getInputStream();
            } catch (Throwable th) {
                th = th;
            }
            try {
                byte[] bArr = new byte[Segment.SHARE_MINIMUM];
                byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    try {
                        int i10 = inputStream.read(bArr);
                        if (i10 == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, i10);
                    } catch (MalformedURLException e7) {
                        e = e7;
                        byteArray = null;
                    } catch (IOException e10) {
                        e = e10;
                        byteArray = null;
                    }
                }
                i5 = 200;
                byteArray = byteArrayOutputStream.toByteArray();
                try {
                    mapUef = lwVar.oa() ? uef(httpURLConnection) : null;
                    zjm.uef(inputStream);
                    zjm.uef(byteArrayOutputStream);
                    message = "success";
                } catch (MalformedURLException e11) {
                    e = e11;
                    Log.w("InternalHttpClient", "MalformedURLException:" + e.getMessage());
                    message = e.getMessage();
                    closeable2 = byteArrayOutputStream;
                    zjm.uef(inputStream);
                    zjm.uef(closeable2);
                    return new yo<>(i5, byteArray, message, mapUef);
                } catch (IOException e12) {
                    e = e12;
                    Log.w("InternalHttpClient", "IOException:" + e.getMessage());
                    message = e.getMessage();
                    closeable2 = byteArrayOutputStream;
                    zjm.uef(inputStream);
                    zjm.uef(closeable2);
                    return new yo<>(i5, byteArray, message, mapUef);
                }
            } catch (MalformedURLException e13) {
                e = e13;
                byteArray = null;
                byteArrayOutputStream = byteArray;
                Log.w("InternalHttpClient", "MalformedURLException:" + e.getMessage());
                message = e.getMessage();
                closeable2 = byteArrayOutputStream;
                zjm.uef(inputStream);
                zjm.uef(closeable2);
                return new yo<>(i5, byteArray, message, mapUef);
            } catch (IOException e14) {
                e = e14;
                byteArray = null;
                byteArrayOutputStream = byteArray;
                Log.w("InternalHttpClient", "IOException:" + e.getMessage());
                message = e.getMessage();
                closeable2 = byteArrayOutputStream;
                zjm.uef(inputStream);
                zjm.uef(closeable2);
                return new yo<>(i5, byteArray, message, mapUef);
            } catch (Throwable th2) {
                th = th2;
                closeable = null;
                inputStream2 = inputStream;
                zjm.uef(inputStream2);
                zjm.uef(closeable);
                throw th;
            }
        } catch (MalformedURLException e15) {
            e = e15;
            inputStream = null;
            byteArray = null;
        } catch (IOException e16) {
            e = e16;
            inputStream = null;
            byteArray = null;
        } catch (Throwable th3) {
            th = th3;
            closeable = null;
            zjm.uef(inputStream2);
            zjm.uef(closeable);
            throw th;
        }
        return new yo<>(i5, byteArray, message, mapUef);
    }

    private Map<String, String> uef(HttpURLConnection httpURLConnection) {
        HashMap map = new HashMap();
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        for (String str : headerFields.keySet()) {
            List<String> list = headerFields.get(str);
            if (list != null && list.size() > 0) {
                map.put(str, list.get(0));
            }
        }
        return map;
    }
}
