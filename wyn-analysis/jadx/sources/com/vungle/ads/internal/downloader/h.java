package com.vungle.ads.internal.downloader;

import cg.AbstractC1613b;
import cg.r;
import com.vungle.ads.OutOfMemory;
import com.vungle.ads.internal.util.PathProvider;
import ef.InterfaceC2525i;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.RealResponseBody;
import org.apache.tika.metadata.HttpHeaders;

/* loaded from: classes5.dex */
public final class h implements m {

    /* renamed from: a, reason: collision with root package name */
    public final com.vungle.ads.internal.executor.j f32953a;

    /* renamed from: b, reason: collision with root package name */
    public final PathProvider f32954b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2525i f32955c;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f32956d;

    public h(com.vungle.ads.internal.executor.j downloadExecutor, PathProvider pathProvider) {
        AbstractC3340k.e(downloadExecutor, "downloadExecutor");
        AbstractC3340k.e(pathProvider, "pathProvider");
        this.f32953a = downloadExecutor;
        this.f32954b = pathProvider;
        this.f32955c = Fe.c.z(new g(this));
        this.f32956d = new CopyOnWriteArrayList();
    }

    public final void a(k kVar, com.vungle.ads.internal.load.c cVar) {
        this.f32956d.add(kVar);
        this.f32953a.a(new f(kVar, this, cVar), new Ab.a(kVar, this, cVar, 0));
    }

    public static final void a(k kVar, h this$0, d dVar) {
        AbstractC3340k.e(this$0, "this$0");
        b bVar = new b(-1, new OutOfMemory("Failed to execute download request: " + kVar.a().h()), 4);
        if (dVar != null) {
            ((com.vungle.ads.internal.load.c) dVar).a(bVar, kVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x034a, code lost:
    
        r24.flush();
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0352, code lost:
    
        if (r5.b() != 1) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0354, code lost:
    
        r5.b(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0358, code lost:
    
        if (r29 == null) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x035a, code lost:
    
        ((com.vungle.ads.internal.load.c) r29).a(r5, r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0361, code lost:
    
        r0 = r14.f42401g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0363, code lost:
    
        if (r0 == null) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0365, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0368, code lost:
    
        r12.cancel();
        com.vungle.ads.internal.util.n.a(r24);
        com.vungle.ads.internal.util.n.a(r15);
        r0 = com.vungle.ads.internal.util.u.f33874a;
        r0 = com.iab.omid.library.vungle.internal.l.a("download status: ");
        r0.append(r5.b());
        com.vungle.ads.internal.util.t.a("AssetDownloader", r0.toString());
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x024d, code lost:
    
        r5.b(3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0250, code lost:
    
        r24 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:158:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0420 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x018c A[Catch: all -> 0x01a1, Exception -> 0x01a6, TryCatch #0 {all -> 0x01a1, blocks: (B:39:0x0184, B:41:0x018c, B:43:0x0190, B:51:0x01ad, B:53:0x01b9, B:55:0x01c2, B:159:0x039e, B:160:0x03a5), top: B:213:0x0184 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.vungle.ads.internal.downloader.b a(com.vungle.ads.internal.downloader.k r28, com.vungle.ads.internal.downloader.d r29) {
        /*
            Method dump skipped, instructions count: 1207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.downloader.h.a(com.vungle.ads.internal.downloader.k, com.vungle.ads.internal.downloader.d):com.vungle.ads.internal.downloader.b");
    }

    public static ResponseBody a(Response response) {
        ResponseBody responseBody = response.f42401g;
        if (!"gzip".equalsIgnoreCase(Response.b(HttpHeaders.CONTENT_ENCODING, response)) || responseBody == null) {
            return responseBody;
        }
        return new RealResponseBody(Response.b("Content-Type", response), -1L, AbstractC1613b.d(new r(responseBody.getF42426f())));
    }
}
