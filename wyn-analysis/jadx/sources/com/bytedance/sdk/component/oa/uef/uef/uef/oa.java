package com.bytedance.sdk.component.oa.uef.uef.uef;

import android.text.TextUtils;
import com.bytedance.sdk.component.oa.uef.bcc;
import com.bytedance.sdk.component.oa.uef.cq;
import com.bytedance.sdk.component.oa.uef.dj;
import com.bytedance.sdk.component.oa.uef.dz;
import com.bytedance.sdk.component.oa.uef.wrv;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class oa implements com.bytedance.sdk.component.oa.uef.oa {
    private static List<Object> lw;

    /* renamed from: oa, reason: collision with root package name */
    com.bytedance.sdk.component.oa.uef.moa f25068oa;
    wrv uef;
    private AtomicBoolean moa = new AtomicBoolean(false);
    private final String yo = System.identityHashCode(this) + "-" + System.currentTimeMillis();

    static {
        try {
            lw = new ArrayList();
            Class<?> cls = Class.forName("com.android.okhttp.Protocol");
            Enum enumValueOf = Enum.valueOf(cls, "HTTP_1_1");
            if (enumValueOf != null) {
                lw.add(enumValueOf);
            }
            Enum enumValueOf2 = Enum.valueOf(cls, "HTTP_2");
            if (enumValueOf2 != null) {
                lw.add(enumValueOf2);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public oa(wrv wrvVar, com.bytedance.sdk.component.oa.uef.moa moaVar) {
        this.uef = wrvVar;
        this.f25068oa = moaVar;
    }

    private boolean lw() {
        if (this.uef.ivm() == null) {
            return false;
        }
        return this.uef.ivm().containsKey("Content-Type");
    }

    private static void yo(HttpURLConnection httpURLConnection) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            Field declaredField = httpURLConnection.getClass().getDeclaredField("delegate");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(httpURLConnection);
            Field declaredField2 = obj.getClass().getDeclaredField("client");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            obj2.getClass().getDeclaredMethod("setRetryOnConnectionFailure", Boolean.TYPE).invoke(obj2, Boolean.FALSE);
        } catch (Exception unused) {
        }
    }

    /* renamed from: moa, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.oa.uef.oa clone() {
        return new oa(this.uef, this.f25068oa);
    }

    @Override // com.bytedance.sdk.component.oa.uef.oa
    public dz oa() throws IOException {
        List<com.bytedance.sdk.component.oa.uef.bcc> list;
        com.bytedance.sdk.component.yo.uef.uef uefVar;
        wrv wrvVar = this.uef;
        if (wrvVar != null && (uefVar = wrvVar.f25073oa) != null) {
            if (uefVar.dz() == 0) {
                this.uef.f25073oa.wk();
            }
            this.uef.f25073oa.uef();
        }
        this.f25068oa.yo().remove(this);
        this.f25068oa.moa().add(this);
        com.bytedance.sdk.component.oa.uef.moa moaVar = this.f25068oa;
        if (moaVar instanceof ivm) {
            if (this.f25068oa.moa().size() + moaVar.yo().size() > this.f25068oa.uef() || this.moa.get()) {
                this.f25068oa.moa().remove(this);
                return new bcc(bcc.uef, "Maximum number of requests exceeded", this.uef);
            }
        }
        try {
            dj djVar = this.uef.uef;
            if (djVar == null || (list = djVar.uef) == null || list.size() <= 0) {
                return uef(this.uef);
            }
            ArrayList arrayList = new ArrayList(this.uef.uef.uef);
            arrayList.add(new com.bytedance.sdk.component.oa.uef.bcc() { // from class: com.bytedance.sdk.component.oa.uef.uef.uef.oa.1
                @Override // com.bytedance.sdk.component.oa.uef.bcc
                public dz uef(bcc.uef uefVar2) throws IOException {
                    return oa.this.uef(uefVar2.uef());
                }
            });
            return ((com.bytedance.sdk.component.oa.uef.bcc) arrayList.get(0)).uef(new yo(arrayList, this.uef));
        } finally {
        }
    }

    @Override // com.bytedance.sdk.component.oa.uef.oa
    public wrv uef() {
        return this.uef;
    }

    private boolean uef(cq cqVar) {
        wrv wrvVar;
        byte[] bArr;
        return cqVar != null && (wrvVar = this.uef) != null && "POST".equalsIgnoreCase(wrvVar.lw()) && cqVar.ivm == cq.uef.BYTE_ARRAY_TYPE && (bArr = cqVar.lw) != null && bArr.length > 0;
    }

    public dz uef(wrv wrvVar) throws IOException {
        return uef(wrvVar, com.bytedance.sdk.component.xs.uef.lw());
    }

    public dz uef(wrv wrvVar, boolean z2) throws IOException {
        boolean zIvm = com.bytedance.sdk.component.xs.uef.ivm();
        List<String> listUef = wrvVar != null ? wrvVar.uef() : null;
        boolean z10 = (listUef == null || listUef.isEmpty()) ? false : true;
        if (zIvm && z10) {
            return uef(wrvVar, listUef);
        }
        return oa(wrvVar, z2);
    }

    @Override // com.bytedance.sdk.component.oa.uef.oa
    public void yo() {
        this.moa.set(true);
    }

    private wrv uef(wrv wrvVar, String str) {
        return wrvVar.dj().oa(str).oa();
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x013a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.bytedance.sdk.component.oa.uef.dz uef(com.bytedance.sdk.component.oa.uef.wrv r24, java.util.List<java.lang.String> r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.oa.uef.uef.uef.oa.uef(com.bytedance.sdk.component.oa.uef.wrv, java.util.List):com.bytedance.sdk.component.oa.uef.dz");
    }

    private boolean oa(cq cqVar) {
        wrv wrvVar;
        return (cqVar == null || (wrvVar = this.uef) == null || !"POST".equalsIgnoreCase(wrvVar.lw()) || cqVar.ivm != cq.uef.STRING_TYPE || TextUtils.isEmpty(cqVar.moa)) ? false : true;
    }

    private dz oa(wrv wrvVar, boolean z2) throws IOException {
        HttpURLConnection httpURLConnection;
        IOException e7;
        String strUef;
        int responseCode;
        int i5 = bcc.uef;
        HttpURLConnection httpURLConnection2 = null;
        try {
            httpURLConnection = (HttpURLConnection) new URL(wrvVar.moa().uef().toString()).openConnection();
            if (z2) {
                try {
                    if (!"setting".equals(wrvVar.bcc()) && !"gecko".equals(wrvVar.bcc()) && !"load_ug_t".equals(wrvVar.bcc())) {
                        oa(httpURLConnection);
                    }
                } catch (IOException e10) {
                    e7 = e10;
                    if (i5 == -1 && z2) {
                        wrvVar.moa().uef().toString();
                        return oa(wrvVar, false);
                    }
                    strUef = uef(httpURLConnection, e7);
                    return new bcc(i5, strUef, wrvVar);
                } catch (Exception e11) {
                    e = e11;
                    httpURLConnection2 = httpURLConnection;
                    strUef = uef(httpURLConnection2, e);
                    return new bcc(i5, strUef, wrvVar);
                }
            }
            if (wrvVar.ivm() != null && !wrvVar.ivm().isEmpty()) {
                for (Map.Entry<String, List<String>> entry : wrvVar.ivm().entrySet()) {
                    String key = entry.getKey();
                    for (String str : entry.getValue()) {
                        if ("_disable_retry".equals(key) && UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(str)) {
                            yo(httpURLConnection);
                        } else {
                            httpURLConnection.addRequestProperty(key, str);
                        }
                    }
                }
            }
            dj djVar = wrvVar.uef;
            if (djVar != null) {
                TimeUnit timeUnit = djVar.yo;
                if (timeUnit != null) {
                    httpURLConnection.setConnectTimeout((int) timeUnit.toMillis(djVar.f25057oa));
                }
                dj djVar2 = wrvVar.uef;
                TimeUnit timeUnit2 = djVar2.lw;
                if (timeUnit2 != null) {
                    httpURLConnection.setReadTimeout((int) timeUnit2.toMillis(djVar2.moa));
                }
            }
            if (wrvVar.zjm() == null) {
                httpURLConnection.setRequestMethod("GET");
            } else {
                if (!lw() && wrvVar.zjm().yo != null) {
                    httpURLConnection.addRequestProperty("Content-Type", wrvVar.zjm().yo.uef());
                }
                httpURLConnection.setRequestMethod(wrvVar.lw());
                if ("POST".equalsIgnoreCase(wrvVar.lw())) {
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    if (uef(wrvVar.zjm())) {
                        outputStream.write(wrvVar.zjm().lw);
                    } else if (oa(wrvVar.zjm())) {
                        outputStream.write(wrvVar.zjm().moa.getBytes());
                    }
                    outputStream.flush();
                    outputStream.close();
                }
            }
            com.bytedance.sdk.component.yo.uef.uef uefVar = wrvVar.f25073oa;
            if (uefVar != null) {
                uefVar.oa();
            }
            httpURLConnection.connect();
            com.bytedance.sdk.component.yo.uef.uef uefVar2 = wrvVar.f25073oa;
            if (uefVar2 != null) {
                uefVar2.yo();
            }
            responseCode = httpURLConnection.getResponseCode();
            com.bytedance.sdk.component.yo.uef.uef uefVar3 = wrvVar.f25073oa;
            if (uefVar3 != null) {
                uefVar3.lw();
            }
        } catch (IOException e12) {
            httpURLConnection = null;
            e7 = e12;
        } catch (Exception e13) {
            e = e13;
        }
        if (this.moa.get()) {
            i5 = bcc.f25065oa;
            uef(httpURLConnection);
            strUef = "internal error";
            return new bcc(i5, strUef, wrvVar);
        }
        return new bcc(httpURLConnection, wrvVar, responseCode);
    }

    private void uef(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e7) {
                e7.getMessage();
            }
        }
    }

    private static String uef(HttpURLConnection httpURLConnection, Exception exc) {
        try {
            return httpURLConnection.getErrorStream().toString();
        } catch (Throwable unused) {
            return exc.getMessage();
        }
    }

    @Override // com.bytedance.sdk.component.oa.uef.oa
    public void uef(final com.bytedance.sdk.component.oa.uef.yo yoVar) {
        com.bytedance.sdk.component.yo.uef.uef uefVar;
        wrv wrvVar = this.uef;
        if (wrvVar != null && (uefVar = wrvVar.f25073oa) != null) {
            uefVar.wk();
        }
        this.f25068oa.oa().submit(new com.bytedance.sdk.component.bcc.oa.yo(this.uef.bcc(), this.uef.cz()) { // from class: com.bytedance.sdk.component.oa.uef.uef.uef.oa.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    dz dzVarOa = oa.this.oa();
                    if (dzVarOa == null) {
                        yoVar.uef(oa.this, new IOException("response is null"));
                    } else {
                        yoVar.uef(oa.this, dzVarOa);
                    }
                } catch (IOException e7) {
                    yoVar.uef(oa.this, e7);
                }
            }
        });
    }

    private static void oa(HttpURLConnection httpURLConnection) {
        try {
            Field declaredField = httpURLConnection.getClass().getDeclaredField("delegate");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(httpURLConnection);
            Field declaredField2 = obj.getClass().getDeclaredField("client");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            if (lw.size() == 2) {
                obj2.getClass().getDeclaredMethod("setProtocols", List.class).invoke(obj2, lw);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
