package com.waze.network.b;

import androidx.media3.extractor.metadata.icy.IcyHeaders;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ah {

    /* renamed from: a, reason: collision with root package name */
    private static final com.waze.k f31937a;

    /* renamed from: b, reason: collision with root package name */
    private static final String f31938b;

    static {
        com.waze.k kVar = new com.waze.k("NetworkStatusAlerter", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, "NetworkStatusAlerter:1");
        f31937a = kVar;
        f31938b = kVar.a() + "_" + kVar.b();
    }
}
