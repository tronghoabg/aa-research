package com.moloco.sdk.internal.services.init;

import android.net.Uri;
import com.moloco.sdk.BuildConfig;
import com.moloco.sdk.internal.services.v;
import com.moloco.sdk.internal.services.x;
import kotlin.jvm.internal.AbstractC3340k;
import wd.C4402c;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final v f29648a;

    /* renamed from: b, reason: collision with root package name */
    public final x f29649b;

    /* renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.usertracker.c f29650c;

    /* renamed from: d, reason: collision with root package name */
    public final C4402c f29651d;

    /* renamed from: e, reason: collision with root package name */
    public final Uri f29652e;

    public f(v deviceInfoService, x appInfoService, com.moloco.sdk.internal.services.usertracker.c userTrackerService, C4402c httpClient) {
        AbstractC3340k.e(deviceInfoService, "deviceInfoService");
        AbstractC3340k.e(appInfoService, "appInfoService");
        AbstractC3340k.e(userTrackerService, "userTrackerService");
        AbstractC3340k.e(httpClient, "httpClient");
        this.f29648a = deviceInfoService;
        this.f29649b = appInfoService;
        this.f29650c = userTrackerService;
        this.f29651d = httpClient;
        this.f29652e = Uri.parse(BuildConfig.MOLOCO_ENDPOINT_INIT_CONFIG);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x016b A[Catch: Exception -> 0x0199, TRY_LEAVE, TryCatch #4 {Exception -> 0x0199, blocks: (B:14:0x0043, B:44:0x0193, B:37:0x015d, B:39:0x016b, B:50:0x01a2, B:52:0x01aa, B:57:0x01f0), top: B:86:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01a2 A[Catch: Exception -> 0x0199, TryCatch #4 {Exception -> 0x0199, blocks: (B:14:0x0043, B:44:0x0193, B:37:0x015d, B:39:0x016b, B:50:0x01a2, B:52:0x01aa, B:57:0x01f0), top: B:86:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Type inference failed for: r0v30, types: [S3.s] */
    /* JADX WARN: Type inference failed for: r1v13, types: [com.moloco.sdk.acm.recorder.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [com.moloco.sdk.acm.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [com.moloco.sdk.internal.services.init.f] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.moloco.sdk.acm.recorder.c] */
    /* JADX WARN: Type inference failed for: r5v7, types: [com.moloco.sdk.acm.recorder.c] */
    /* JADX WARN: Type inference failed for: r8v12, types: [com.moloco.sdk.acm.recorder.c] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v6, types: [com.moloco.sdk.acm.recorder.c] */
    /* JADX WARN: Type inference failed for: r9v1, types: [com.moloco.sdk.internal.services.usertracker.c] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r26, com.moloco.sdk.publisher.MediationInfo r27, com.moloco.sdk.acm.recorder.b r28, lf.AbstractC3464c r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.services.init.f.a(java.lang.String, com.moloco.sdk.publisher.MediationInfo, com.moloco.sdk.acm.recorder.b, lf.c):java.lang.Object");
    }
}
