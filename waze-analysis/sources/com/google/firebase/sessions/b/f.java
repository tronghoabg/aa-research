package com.google.firebase.sessions.b;

import h.ab;
import java.util.Map;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class f extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f10880a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f10881b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Map f10882c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ h.g.a.p f10883d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ h.g.a.p f10884e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(g gVar, Map map, h.g.a.p pVar, h.g.a.p pVar2, h.c.e eVar) {
        super(2, eVar);
        this.f10881b = gVar;
        this.f10882c = map;
        this.f10883d = pVar;
        this.f10884e = pVar2;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new f(this.f10881b, this.f10882c, this.f10883d, this.f10884e, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((f) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c4, code lost:
    
        if (r7.invoke(r1, r6) == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00da, code lost:
    
        if (r1.invoke(r2, r6) != r0) goto L34;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.io.IOException {
        /*
            r6 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r6.f10880a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L19
            if (r1 == r3) goto L11
            if (r1 == r2) goto L11
            e.b.c.b(r7)
            goto Ldd
        L11:
            e.b.c.b(r7)     // Catch: java.lang.Exception -> L16
            goto Ldd
        L16:
            r7 = move-exception
            goto Lc7
        L19:
            e.b.c.b(r7)
            com.google.firebase.sessions.b.g r7 = r6.f10881b     // Catch: java.lang.Exception -> L16
            java.net.URL r7 = com.google.firebase.sessions.b.g.b(r7)     // Catch: java.lang.Exception -> L16
            java.net.URLConnection r7 = r7.openConnection()     // Catch: java.lang.Exception -> L16
            java.lang.String r1 = "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection"
            h.g.b.x.d(r7, r1)     // Catch: java.lang.Exception -> L16
            javax.net.ssl.HttpsURLConnection r7 = (javax.net.ssl.HttpsURLConnection) r7     // Catch: java.lang.Exception -> L16
            java.lang.String r1 = "GET"
            r7.setRequestMethod(r1)     // Catch: java.lang.Exception -> L16
            java.lang.String r1 = "Accept"
            java.lang.String r4 = "application/json"
            r7.setRequestProperty(r1, r4)     // Catch: java.lang.Exception -> L16
            java.util.Map r1 = r6.f10882c     // Catch: java.lang.Exception -> L16
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Exception -> L16
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L16
        L43:
            boolean r4 = r1.hasNext()     // Catch: java.lang.Exception -> L16
            if (r4 == 0) goto L5f
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Exception -> L16
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch: java.lang.Exception -> L16
            java.lang.Object r5 = r4.getKey()     // Catch: java.lang.Exception -> L16
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> L16
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Exception -> L16
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> L16
            r7.setRequestProperty(r5, r4)     // Catch: java.lang.Exception -> L16
            goto L43
        L5f:
            int r1 = r7.getResponseCode()     // Catch: java.lang.Exception -> L16
            r4 = 200(0xc8, float:2.8E-43)
            if (r1 != r4) goto Lab
            java.io.InputStream r7 = r7.getInputStream()     // Catch: java.lang.Exception -> L16
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Exception -> L16
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Exception -> L16
            r2.<init>(r7)     // Catch: java.lang.Exception -> L16
            java.io.Reader r2 = (java.io.Reader) r2     // Catch: java.lang.Exception -> L16
            r1.<init>(r2)     // Catch: java.lang.Exception -> L16
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L16
            r2.<init>()     // Catch: java.lang.Exception -> L16
            h.g.b.aq r4 = new h.g.b.aq     // Catch: java.lang.Exception -> L16
            r4.<init>()     // Catch: java.lang.Exception -> L16
        L81:
            java.lang.String r5 = r1.readLine()     // Catch: java.lang.Exception -> L16
            r4.f48105a = r5     // Catch: java.lang.Exception -> L16
            if (r5 == 0) goto L91
            java.lang.Object r5 = r4.f48105a     // Catch: java.lang.Exception -> L16
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> L16
            r2.append(r5)     // Catch: java.lang.Exception -> L16
            goto L81
        L91:
            r1.close()     // Catch: java.lang.Exception -> L16
            r7.close()     // Catch: java.lang.Exception -> L16
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: java.lang.Exception -> L16
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Exception -> L16
            r7.<init>(r1)     // Catch: java.lang.Exception -> L16
            h.g.a.p r1 = r6.f10883d     // Catch: java.lang.Exception -> L16
            r6.f10880a = r3     // Catch: java.lang.Exception -> L16
            java.lang.Object r6 = r1.invoke(r7, r6)     // Catch: java.lang.Exception -> L16
            if (r6 != r0) goto Ldd
            goto Ldc
        Lab:
            h.g.a.p r7 = r6.f10884e     // Catch: java.lang.Exception -> L16
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L16
            r3.<init>()     // Catch: java.lang.Exception -> L16
            java.lang.String r4 = "Bad response code: "
            r3.append(r4)     // Catch: java.lang.Exception -> L16
            r3.append(r1)     // Catch: java.lang.Exception -> L16
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Exception -> L16
            r6.f10880a = r2     // Catch: java.lang.Exception -> L16
            java.lang.Object r6 = r7.invoke(r1, r6)     // Catch: java.lang.Exception -> L16
            if (r6 != r0) goto Ldd
            goto Ldc
        Lc7:
            h.g.a.p r1 = r6.f10884e
            java.lang.String r2 = r7.getMessage()
            if (r2 != 0) goto Ld3
            java.lang.String r2 = r7.toString()
        Ld3:
            r7 = 3
            r6.f10880a = r7
            java.lang.Object r6 = r1.invoke(r2, r6)
            if (r6 != r0) goto Ldd
        Ldc:
            return r0
        Ldd:
            h.ab r6 = h.ab.f48028a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.b.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
