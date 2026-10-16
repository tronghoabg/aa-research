package com.moloco.sdk.publisher.bidrequest;

import com.moloco.sdk.D0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/moloco/sdk/D0;", "Lcom/moloco/sdk/publisher/bidrequest/Geo;", "toGeo", "(Lcom/moloco/sdk/D0;)Lcom/moloco/sdk/publisher/bidrequest/Geo;", "moloco-sdk_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GeoKt {
    @NotNull
    public static final Geo toGeo(@NotNull D0 d02) {
        AbstractC3340k.e(d02, "<this>");
        return new Geo(d02.b(), d02.d(), d02.c(), d02.g(), Float.valueOf(d02.e()), Float.valueOf(d02.f()));
    }
}
