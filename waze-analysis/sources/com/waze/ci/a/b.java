package com.waze.ci.a;

import android.content.Context;
import android.os.Looper;
import android.util.Log;
import com.waze.a.af;
import com.waze.authentication.aj;
import com.waze.authentication.al;
import com.waze.authentication.k;
import com.waze.config.ConfigValues;
import com.waze.shared_infra.i.h;
import com.waze.web.r;
import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static b f22418a;

    /* renamed from: b, reason: collision with root package name */
    private static String f22419b;

    /* renamed from: c, reason: collision with root package name */
    private final aj f22420c = af.n((al) r.h(al.class));

    private b() {
    }

    public static b a() {
        b bVar = f22418a;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b();
        f22418a = bVar2;
        return bVar2;
    }

    public static final void b(Context context, String str) {
        k kVarO;
        String strB = f22419b;
        if (strB == null) {
            strB = ConfigValues.CONFIG_VALUE_REALTIME_WEB_SERVICE_SECURED_ADDRESS.b();
            f22419b = strB;
        }
        if (strB == null || strB.length() <= 0) {
            Log.e("sendOfflineCommand", "server url is null");
            return;
        }
        b bVarA = a();
        String string = com.waze.be.b.f16231a.a(context).getString("client_info", "");
        final String strConcat = null;
        if (string != null && !string.isEmpty() && (kVarO = af.o(bVarA.f22420c)) != null) {
            String strConcat2 = string.concat("\n");
            String strB2 = kVarO.b();
            String strA = kVarO.a();
            String strConcat3 = (strConcat2 + "Authenticate," + Integer.toString(146) + "," + strB2 + "," + strA + "\n").concat(str);
            if (!str.endsWith("\n")) {
                strConcat3 = strConcat3.concat("\n");
            }
            strConcat = strConcat3.concat("Logout\n");
        }
        if (strConcat == null) {
            Log.e("sendOfflineCommand", "build command failed");
            return;
        }
        final DefaultHttpClient defaultHttpClient = new DefaultHttpClient();
        final HttpPost httpPost = new HttpPost(strB.concat("/distrib/static"));
        Runnable runnable = new Runnable() { // from class: com.waze.ci.a.a
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                HttpClient httpClient = defaultHttpClient;
                HttpPost httpPost2 = httpPost;
                String str2 = strConcat;
                try {
                    httpPost2.addHeader("Content-Type", "binary/octet-stream");
                    httpPost2.setEntity(new StringEntity(str2));
                    HttpResponse httpResponseExecute = httpClient.execute(httpPost2);
                    if (httpResponseExecute.getStatusLine().getStatusCode() != 200) {
                        h.c("Authenticate failed [error =" + httpResponseExecute.getStatusLine().getStatusCode() + "]");
                    }
                } catch (IOException e2) {
                    h.c("Authenticate error [error=" + e2.getMessage() + "]");
                }
            }
        };
        if (Looper.myLooper() == Looper.getMainLooper()) {
            new Thread(runnable).start();
        } else {
            runnable.run();
        }
    }
}
