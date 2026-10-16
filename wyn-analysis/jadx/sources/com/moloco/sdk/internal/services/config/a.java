package com.moloco.sdk.internal.services.config;

import Va.M6;
import com.moloco.sdk.internal.MolocoLogger;
import java.util.LinkedHashMap;
import java.util.List;
import r7.AbstractC3935e;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f29577a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f29578b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final List f29579c = AbstractC3935e.C(new com.moloco.sdk.internal.services.config.handlers.a());

    public final Object a(Class cls, Object obj) {
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "RemoteConfigService", M6.n(cls, "Retrieving config: "), false, 4, null);
        Object obj2 = this.f29577a.get(cls.getName());
        return obj2 == null ? obj : obj2;
    }
}
