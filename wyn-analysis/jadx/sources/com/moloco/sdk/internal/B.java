package com.moloco.sdk.internal;

import android.net.Uri;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.n f28484a;

    public B(com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.n persistentHttpRequest) {
        AbstractC3340k.e(persistentHttpRequest, "persistentHttpRequest");
        this.f28484a = persistentHttpRequest;
    }

    public final boolean a(String url, long j8, r rVar) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar;
        AbstractC3340k.e(url, "url");
        if (rVar != null) {
            try {
                cVar = rVar.f29364b;
            } catch (Exception e7) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, "SdkEventUrlTrackerImpl", e7.toString(), null, false, 12, null);
                return false;
            }
        } else {
            cVar = null;
        }
        if (cVar != null) {
            String errorCode = cVar.a();
            AbstractC3340k.e(errorCode, "errorCode");
            url = Bf.r.h0(url, "[ERROR_CODE]", errorCode, false);
        }
        Uri uriBuild = Uri.parse(Bf.r.h0(url, "[HAPPENED_AT_TS]", String.valueOf(j8), false)).buildUpon().build();
        com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.n nVar = this.f28484a;
        String string = uriBuild.toString();
        AbstractC3340k.d(string, "toString(...)");
        nVar.a(string);
        return true;
    }
}
