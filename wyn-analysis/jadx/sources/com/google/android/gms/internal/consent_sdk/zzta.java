package com.google.android.gms.internal.consent_sdk;

import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes.dex */
public enum zzta {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(zzpm.zzb),
    ENUM(null),
    MESSAGE(null);

    zzta(Object obj) {
    }
}
