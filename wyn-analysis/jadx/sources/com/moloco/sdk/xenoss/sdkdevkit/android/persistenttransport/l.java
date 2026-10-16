package com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport;

import Ef.H;
import Ef.S;
import Jd.C0672f;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import kotlin.jvm.internal.AbstractC3340k;
import wd.C4402c;

/* loaded from: classes4.dex */
public final class l implements e {

    /* renamed from: a, reason: collision with root package name */
    public final C4402c f32461a;

    /* renamed from: b, reason: collision with root package name */
    public final Kd.a f32462b;

    public l(C4402c httpClient) {
        AbstractC3340k.e(httpClient, "httpClient");
        this.f32461a = httpClient;
        this.f32462b = H.c(S.f3698a);
    }

    public static boolean b(Context context) {
        Object systemService = context.getSystemService("connectivity");
        AbstractC3340k.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        return networkCapabilities != null && (networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(3));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e
    public final void a(String str) {
        H.D(this.f32462b, null, new j(this, str, null), 3);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e
    public final void a(String str, byte[] bArr, C0672f contentType, String str2) {
        AbstractC3340k.e(contentType, "contentType");
        H.D(this.f32462b, null, new k(this, str, bArr, contentType, null), 3);
    }
}
