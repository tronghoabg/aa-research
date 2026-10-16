package com.moloco.sdk.internal;

import com.moloco.sdk.publisher.MolocoAdError;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public abstract class s {
    public static final r a(String adUnitId, MolocoAdError.ErrorType errorType, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c subErrorType, Map map) {
        AbstractC3340k.e(adUnitId, "adUnitId");
        AbstractC3340k.e(errorType, "errorType");
        AbstractC3340k.e(subErrorType, "subErrorType");
        return new r(new MolocoAdError("Moloco", adUnitId, errorType, null, 8, null), subErrorType, map);
    }
}
