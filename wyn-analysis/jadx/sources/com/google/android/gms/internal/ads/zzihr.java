package com.google.android.gms.internal.ads;

import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes3.dex */
public enum zzihr {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(zzidl.zza),
    ENUM(null),
    MESSAGE(null);

    zzihr(Object obj) {
    }
}
