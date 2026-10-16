package com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport;

import A7.C0237b0;
import Jd.C0672f;
import S3.p;
import android.os.Build;
import com.moloco.sdk.internal.MolocoLogger;
import ef.C2527k;
import ff.x;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class n implements e {

    /* renamed from: a, reason: collision with root package name */
    public final o f32464a;

    public n(o oVar) {
        this.f32464a = oVar;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e
    public final void a(String url) {
        J3.h hVarA;
        AbstractC3340k.e(url, "url");
        if (Fe.c.h(url)) {
            try {
                C2527k[] c2527kArr = {new C2527k("url", url)};
                J3.g gVar = new J3.g(0);
                C2527k c2527k = c2527kArr[0];
                gVar.i(c2527k.f34672b, (String) c2527k.f34671a);
                hVarA = gVar.a();
            } catch (Exception e7) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, "PersistentHttpRequest", e7.getMessage() + ". Url: " + url, null, false, 12, null);
                hVarA = null;
            }
            if (hVarA == null) {
                return;
            }
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "PersistentHttpRequest", "Enqueuing request to ".concat(url), null, false, 12, null);
            C0237b0 c0237b0 = new C0237b0(UrlGetRequestWorker.class);
            ((p) c0237b0.f814d).f10986j = new J3.d(2, false, false, false, false, -1L, -1L, Build.VERSION.SDK_INT >= 24 ? ff.o.X0(new LinkedHashSet()) : x.f35434a);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            c0237b0.r(2);
            ((p) c0237b0.f814d).f10981e = hVarA;
            AbstractC3340k.d(this.f32464a.f32465a.a(c0237b0.i()), "enqueue(...)");
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e
    public final void a(String url, byte[] bArr, C0672f contentType, String str) {
        Set setX0;
        AbstractC3340k.e(url, "url");
        AbstractC3340k.e(contentType, "contentType");
        if (Fe.c.h(url)) {
            try {
                C2527k[] c2527kArr = {new C2527k("url", url), new C2527k("body", bArr), new C2527k("contentType", contentType.toString()), new C2527k("contentEncoding", str)};
                J3.g gVar = new J3.g(0);
                for (int i5 = 0; i5 < 4; i5++) {
                    C2527k c2527k = c2527kArr[i5];
                    gVar.i(c2527k.f34672b, (String) c2527k.f34671a);
                }
                J3.h hVarA = gVar.a();
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "PersistentHttpRequest", "Enqueuing request to ".concat(url), null, false, 12, null);
                C0237b0 c0237b0 = new C0237b0(UrlPostRequestWorker.class);
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                if (Build.VERSION.SDK_INT >= 24) {
                    setX0 = ff.o.X0(linkedHashSet);
                } else {
                    setX0 = x.f35434a;
                }
                ((p) c0237b0.f814d).f10986j = new J3.d(2, false, false, false, false, -1L, -1L, setX0);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                c0237b0.r(2);
                ((p) c0237b0.f814d).f10981e = hVarA;
                AbstractC3340k.d(this.f32464a.f32465a.a(c0237b0.i()), "enqueue(...)");
            } catch (Exception e7) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, "PersistentHttpRequest", "Failed to enqueue persistent request for url: ".concat(url), e7, false, 8, null);
            }
        }
    }
}
