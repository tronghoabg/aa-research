package com.moloco.sdk.internal.services.analytics;

import com.moloco.sdk.internal.services.events.e;
import com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.n;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final n f29404a;

    /* renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.events.c f29405b;

    /* renamed from: c, reason: collision with root package name */
    public final e f29406c;

    public c(n persistentHttpRequest, com.moloco.sdk.internal.services.events.c cVar, e configService) {
        AbstractC3340k.e(persistentHttpRequest, "persistentHttpRequest");
        AbstractC3340k.e(configService, "configService");
        this.f29404a = persistentHttpRequest;
        this.f29405b = cVar;
        this.f29406c = configService;
    }
}
