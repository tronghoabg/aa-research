package com.waze.utils;

import android.app.DownloadManager;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class aj implements af {

    /* renamed from: a, reason: collision with root package name */
    private final DownloadManager f44843a;

    public aj(DownloadManager downloadManager, com.waze.uid.c.al alVar, kotlinx.coroutines.af afVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(alVar, "config");
        h.g.b.x.f(afVar, "coroutineScope");
        h.g.b.x.f(eVar, "logger");
        this.f44843a = downloadManager;
    }

    public static final /* synthetic */ DownloadManager b(aj ajVar) {
        DownloadManager downloadManager = ajVar.f44843a;
        if (downloadManager != null) {
            return downloadManager;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.waze.utils.ah, h.c.e] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r1v0, types: [h.c.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    @Override // com.waze.utils.af
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.net.Uri r12, android.net.Uri r13, h.c.e r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.utils.aj.a(android.net.Uri, android.net.Uri, h.c.e):java.lang.Object");
    }
}
