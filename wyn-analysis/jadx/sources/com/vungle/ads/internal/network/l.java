package com.vungle.ads.internal.network;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/* loaded from: classes5.dex */
public final class l implements Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f33417a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f33418b;

    public l(m mVar, a aVar) {
        this.f33417a = mVar;
        this.f33418b = aVar;
    }

    @Override // okhttp3.Callback
    public final void onFailure(Call call, IOException e7) throws Throwable {
        AbstractC3340k.e(call, "call");
        AbstractC3340k.e(e7, "e");
        try {
            this.f33418b.a(e7);
        } catch (Throwable th) {
            h.a(th);
            boolean z2 = com.vungle.ads.internal.util.u.f33874a;
            com.vungle.ads.internal.util.t.a("OkHttpCall", "Cannot pass failure to callback", th);
        }
    }

    @Override // okhttp3.Callback
    public final void onResponse(Call call, Response response) throws Throwable {
        AbstractC3340k.e(call, "call");
        AbstractC3340k.e(response, "response");
        try {
            try {
                this.f33418b.a(this.f33417a.a(response));
            } catch (Throwable th) {
                h.a(th);
                boolean z2 = com.vungle.ads.internal.util.u.f33874a;
                com.vungle.ads.internal.util.t.a("OkHttpCall", "Cannot pass response to callback", th);
            }
        } catch (Throwable th2) {
            boolean z10 = com.vungle.ads.internal.util.u.f33874a;
            StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("[enqueue] Failed to parse response: ");
            sbA.append(th2.getLocalizedMessage());
            com.vungle.ads.internal.util.t.b("OkHttpCall", sbA.toString());
            h.a(th2);
            try {
                this.f33418b.a(th2);
            } catch (Throwable th3) {
                h.a(th3);
                boolean z11 = com.vungle.ads.internal.util.u.f33874a;
                com.vungle.ads.internal.util.t.a("OkHttpCall", "Cannot pass failure to callback", th3);
            }
        }
    }
}
