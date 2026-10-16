package com.google.android.libraries.phenotype.client.stable;

import androidx.browser.trusted.sharing.ShareTarget;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import j$.net.URLEncoder;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.net.ssl.HttpsURLConnection;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final Object f6131a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f6132b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f6133c;

    public j() {
        this.f6131a = new AtomicBoolean(false);
        new ConcurrentHashMap();
        this.f6132b = new ConcurrentHashMap();
        new ConcurrentHashMap();
        this.f6133c = new ConcurrentHashMap();
    }

    public static /* synthetic */ String c(j jVar, String str, String str2) {
        com.google.d.g.h hVarA = com.google.d.g.j.a().a();
        hVarA.d(str.getBytes());
        hVarA.a();
        hVarA.d(str2.getBytes());
        return ((com.google.d.h.f) jVar.f6131a).o(hVarA.k().d());
    }

    /* JADX WARN: Removed duplicated region for block: B:42:? A[LOOP:1: B:12:0x004f->B:42:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.google.v.v r9, java.util.Set r10, java.lang.String r11) {
        /*
            r8 = this;
            boolean r0 = r10.isEmpty()
            r1 = 1
            if (r0 != 0) goto L1d
            java.lang.Object r0 = r8.f6131a
            java.util.concurrent.atomic.AtomicBoolean r0 = (java.util.concurrent.atomic.AtomicBoolean) r0
            boolean r0 = r0.getAndSet(r1)
            if (r0 != 0) goto L1d
            com.google.android.gms.d.b r0 = com.google.android.gms.d.b.a()
            com.google.android.libraries.phenotype.client.stable.h r2 = new com.google.android.libraries.phenotype.client.stable.h
            r2.<init>()
            r0.b(r2)
        L1d:
            byte[] r9 = r9.x()
            java.lang.Object r0 = r8.f6132b
            com.waze.an.a.a.av r2 = new com.waze.an.a.a.av
            r2.<init>(r9, r1)
            j$.util.concurrent.ConcurrentMap.EL.compute(r0, r11, r2)
            java.util.Iterator r10 = r10.iterator()
        L2f:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto Lbf
            java.lang.Object r0 = r10.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r2 = r8.f6133c
            java.util.concurrent.atomic.AtomicReference r3 = new java.util.concurrent.atomic.AtomicReference
            com.google.android.libraries.phenotype.client.stable.i r4 = new com.google.android.libraries.phenotype.client.stable.i
            r4.<init>(r11, r9)
            r3.<init>(r4)
            java.lang.Object r0 = r2.putIfAbsent(r0, r3)
            java.util.concurrent.atomic.AtomicReference r0 = (java.util.concurrent.atomic.AtomicReference) r0
            if (r0 == 0) goto L2f
        L4f:
            java.lang.Object r2 = r0.get()
            boolean r3 = r2 instanceof com.google.android.libraries.phenotype.client.stable.i
            r4 = 0
            if (r3 == 0) goto L87
            r3 = r2
            com.google.android.libraries.phenotype.client.stable.i r3 = (com.google.android.libraries.phenotype.client.stable.i) r3
            java.lang.String r5 = com.google.android.libraries.phenotype.client.stable.i.a(r3)
            boolean r5 = r11.equals(r5)
            if (r5 == 0) goto L69
            com.google.android.libraries.phenotype.client.stable.i.b(r3, r9)
            goto L2f
        L69:
            com.google.android.libraries.phenotype.client.stable.i r5 = new com.google.android.libraries.phenotype.client.stable.i
            r5.<init>(r11, r9)
            java.lang.String r6 = com.google.android.libraries.phenotype.client.stable.i.a(r3)
            int r6 = r11.compareTo(r6)
            r7 = 2
            if (r6 >= 0) goto L80
            com.google.android.libraries.phenotype.client.stable.i[] r6 = new com.google.android.libraries.phenotype.client.stable.i[r7]
            r6[r4] = r5
            r6[r1] = r3
            goto Lb7
        L80:
            com.google.android.libraries.phenotype.client.stable.i[] r6 = new com.google.android.libraries.phenotype.client.stable.i[r7]
            r6[r4] = r3
            r6[r1] = r5
            goto Lb7
        L87:
            r3 = r2
            com.google.android.libraries.phenotype.client.stable.i[] r3 = (com.google.android.libraries.phenotype.client.stable.i[]) r3
            int r5 = java.util.Arrays.binarySearch(r3, r11)
            if (r5 < 0) goto L96
            r0 = r3[r5]
            com.google.android.libraries.phenotype.client.stable.i.b(r0, r9)
            goto L2f
        L96:
            int r5 = ~r5
            int r6 = r3.length
            int r7 = r6 + 1
            int r6 = r6 - r5
            if (r6 != 0) goto La5
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r7)
            com.google.android.libraries.phenotype.client.stable.i[] r3 = (com.google.android.libraries.phenotype.client.stable.i[]) r3
            r6 = r3
            goto Lb0
        La5:
            com.google.android.libraries.phenotype.client.stable.i[] r7 = new com.google.android.libraries.phenotype.client.stable.i[r7]
            java.lang.System.arraycopy(r3, r4, r7, r4, r5)
            int r4 = r5 + 1
            java.lang.System.arraycopy(r3, r5, r7, r4, r6)
            r6 = r7
        Lb0:
            com.google.android.libraries.phenotype.client.stable.i r3 = new com.google.android.libraries.phenotype.client.stable.i
            r3.<init>(r11, r9)
            r6[r5] = r3
        Lb7:
            boolean r2 = a.a.c(r0, r2, r6)
            if (r2 == 0) goto L4f
            goto L2f
        Lbf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.phenotype.client.stable.j.a(com.google.v.v, java.util.Set, java.lang.String):void");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.d.b.aj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.google.d.b.aj, java.lang.Object] */
    public final File b() {
        return new File(((String) this.f6132b.get()) + DomExceptionUtils.SEPARATOR + ((String) this.f6133c.get()) + ".pb");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final void e(String str, String str2) {
        this.f6132b.put(str, str2);
    }

    public final String f() {
        return (String) this.f6131a;
    }

    public final String g() {
        return (String) this.f6132b;
    }

    public final String h() {
        return (String) this.f6133c;
    }

    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    public final com.google.firebase.remoteconfig.internal.u i() throws Throwable {
        HttpsURLConnection httpsURLConnection;
        Object objConcat;
        InputStream inputStream = null;
        String string = null;
        inputStream = null;
        try {
            Object obj = this.f6131a;
            ?? r4 = this.f6133c;
            StringBuilder sb = new StringBuilder();
            Iterator it = r4.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            sb.append((String) entry.getKey());
            sb.append("=");
            sb.append(entry.getValue() != null ? URLEncoder.encode((String) entry.getValue(), "UTF-8") : "");
            while (it.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it.next();
                sb.append("&");
                sb.append((String) entry2.getKey());
                sb.append("=");
                sb.append(entry2.getValue() != null ? URLEncoder.encode((String) entry2.getValue(), "UTF-8") : "");
            }
            String string2 = sb.toString();
            if (string2.isEmpty()) {
                objConcat = obj;
            } else if (((String) obj).contains("?")) {
                if (!((String) obj).endsWith("&")) {
                    string2 = "&".concat(string2);
                }
                objConcat = ((String) obj).concat(string2);
            } else {
                objConcat = ((String) obj) + "?" + string2;
            }
            com.google.firebase.crashlytics.a.i.a().g("GET Request URL: " + ((String) objConcat));
            httpsURLConnection = (HttpsURLConnection) new URL((String) objConcat).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod(ShareTarget.METHOD_GET);
                for (Map.Entry entry3 : this.f6132b.entrySet()) {
                    httpsURLConnection.addRequestProperty((String) entry3.getKey(), (String) entry3.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream2, "UTF-8"));
                        char[] cArr = new char[8192];
                        StringBuilder sb2 = new StringBuilder();
                        while (true) {
                            int i2 = bufferedReader.read(cArr);
                            if (i2 == -1) {
                                break;
                            }
                            sb2.append(cArr, 0, i2);
                        }
                        string = sb2.toString();
                    } catch (Throwable th) {
                        th = th;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                if (httpsURLConnection != null) {
                    httpsURLConnection.disconnect();
                }
                return new com.google.firebase.remoteconfig.internal.u(responseCode, string);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            httpsURLConnection = null;
        }
    }

    public j(com.google.v.v vVar, final String str, final String str2) {
        this.f6131a = com.google.d.h.f.n();
        this.f6132b = com.google.d.b.an.a(new bf(this, vVar, 1));
        this.f6133c = com.google.d.b.an.a(new com.google.d.b.aj() { // from class: com.google.android.libraries.phenotype.client.b.i
            @Override // com.google.d.b.aj
            public final Object get() {
                return com.google.android.libraries.phenotype.client.stable.j.c(this.f5983c, str, str2);
            }
        });
    }

    public j(String str, Map map) {
        this.f6131a = str;
        this.f6133c = map;
        this.f6132b = new HashMap();
    }

    public j(String str, String str2, String str3) {
        this.f6133c = str;
        this.f6131a = str2;
        this.f6132b = str3;
    }
}
