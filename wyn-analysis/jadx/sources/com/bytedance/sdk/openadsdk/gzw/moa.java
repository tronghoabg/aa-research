package com.bytedance.sdk.openadsdk.gzw;

import android.text.TextUtils;
import android.util.Log;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class moa {
    private uef moa;

    /* renamed from: oa, reason: collision with root package name */
    private yo f25922oa;
    private ivm yo;
    private final String uef = "StrategyCenter";
    private int lw = 0;
    private final ConcurrentHashMap<String, Object> ivm = new ConcurrentHashMap<>();
    private Runnable xs = new Runnable() { // from class: com.bytedance.sdk.openadsdk.gzw.moa.2
        @Override // java.lang.Runnable
        public void run() {
            moa.this.oa();
        }
    };

    public moa(ivm ivmVar) {
        this.f25922oa = null;
        xs xsVar = new xs(ivmVar);
        this.yo = xsVar;
        String strYo = xsVar.yo();
        if (!TextUtils.isEmpty(strYo) && !strYo.startsWith("pag")) {
            strYo = "pag_".concat(strYo);
        }
        this.f25922oa = new yo(this.yo.oa(), strYo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oa() {
        ivm ivmVar = this.yo;
        if (ivmVar == null || ivmVar.lw() == null || this.yo.ivm() == null || this.yo.bcc()) {
            return;
        }
        this.yo.uef().execute(new Runnable() { // from class: com.bytedance.sdk.openadsdk.gzw.moa.1
            @Override // java.lang.Runnable
            public void run() {
                OutputStream outputStream;
                moa.this.lw++;
                try {
                    if (moa.this.moa != null) {
                        moa.this.moa.uef();
                    }
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(moa.this.yo.lw()).openConnection();
                    if (moa.this.yo.xs() != null && moa.this.yo.xs().size() > 0) {
                        for (Map.Entry<String, String> entry : moa.this.yo.xs().entrySet()) {
                            httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                        }
                    }
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setRequestProperty("Content-Type", "application/json");
                    try {
                        outputStream = httpURLConnection.getOutputStream();
                        try {
                            outputStream.write(moa.this.yo.ivm().toString().getBytes());
                            outputStream.close();
                            int responseCode = httpURLConnection.getResponseCode();
                            Log.i("StrategyCenter", "executing strategy fetch");
                            if (responseCode == 200) {
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                                StringBuffer stringBuffer = new StringBuffer();
                                while (true) {
                                    String line = bufferedReader.readLine();
                                    if (line == null) {
                                        break;
                                    } else {
                                        stringBuffer.append(line);
                                    }
                                }
                                bufferedReader.close();
                                JSONObject jSONObjectUef = moa.this.yo.uef(new JSONObject(stringBuffer.toString()));
                                moa.this.f25922oa.uef();
                                moa.this.yo();
                                moa.this.f25922oa.uef(jSONObjectUef);
                                if (moa.this.moa != null) {
                                    moa.this.moa.oa();
                                }
                            } else if (moa.this.moa != null) {
                                moa.this.moa.uef(responseCode, httpURLConnection.getResponseMessage());
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        outputStream = null;
                    }
                } catch (Throwable th3) {
                    Log.e("StrategyCenter", th3.getMessage() == null ? "error " : th3.getMessage());
                    if (moa.this.moa != null) {
                        moa.this.moa.uef(-1, th3.getMessage());
                    }
                }
                moa.this.f25922oa.uef("local_last_update_time", System.currentTimeMillis());
                moa.this.uef();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yo() {
        this.ivm.clear();
    }

    public void uef(uef uefVar) {
        this.moa = uefVar;
    }

    public void uef() {
        if (this.yo != null) {
            int i5 = 3600000;
            int iUef = this.f25922oa.uef("req_interval", 3600000);
            long j8 = 0;
            long jOa = this.f25922oa.oa("local_last_update_time", 0L);
            if (iUef >= 600000 && iUef <= 86400000) {
                i5 = iUef;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - jOa;
            Log.i("StrategyCenter", "before  realInterval=".concat(String.valueOf(jCurrentTimeMillis)));
            if (jCurrentTimeMillis >= 0) {
                long j10 = i5;
                if (jCurrentTimeMillis <= j10) {
                    j8 = j10 - jCurrentTimeMillis;
                }
            }
            Log.i("StrategyCenter", "after  realInterval=".concat(String.valueOf(j8)));
            this.yo.moa().removeCallbacks(this.xs);
            if (this.lw > 24) {
                return;
            }
            this.yo.moa().postDelayed(this.xs, j8);
        }
    }

    public int uef(String str, int i5) {
        yo yoVar = this.f25922oa;
        return yoVar == null ? i5 : yoVar.uef(str, i5);
    }

    public String uef(String str, String str2) {
        yo yoVar = this.f25922oa;
        return yoVar == null ? str2 : yoVar.uef(str, str2);
    }

    public boolean uef(String str, boolean z2) {
        yo yoVar = this.f25922oa;
        return yoVar == null ? z2 : yoVar.uef(str, z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
    
        if (r4.getClass().isInstance(r0) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> T uef(java.lang.String r3, T r4, com.bytedance.sdk.openadsdk.gzw.oa.uef<T> r5) {
        /*
            r2 = this;
            com.bytedance.sdk.openadsdk.gzw.yo r0 = r2.f25922oa
            if (r0 == 0) goto L2c
            if (r3 != 0) goto L7
            goto L2c
        L7:
            j$.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r0 = r2.ivm
            java.lang.Object r0 = r0.get(r3)
            if (r0 == 0) goto L1c
            if (r4 == 0) goto L1b
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.Exception -> L1c
            boolean r1 = r1.isInstance(r0)     // Catch: java.lang.Exception -> L1c
            if (r1 == 0) goto L1c
        L1b:
            return r0
        L1c:
            if (r5 == 0) goto L2c
            com.bytedance.sdk.openadsdk.gzw.yo r0 = r2.f25922oa     // Catch: java.lang.Exception -> L2c
            java.lang.Object r5 = r0.uef(r3, r4, r5)     // Catch: java.lang.Exception -> L2c
            if (r5 == 0) goto L2c
            j$.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r0 = r2.ivm     // Catch: java.lang.Exception -> L2c
            r0.put(r3, r5)     // Catch: java.lang.Exception -> L2c
            return r5
        L2c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.gzw.moa.uef(java.lang.String, java.lang.Object, com.bytedance.sdk.openadsdk.gzw.oa$uef):java.lang.Object");
    }
}
