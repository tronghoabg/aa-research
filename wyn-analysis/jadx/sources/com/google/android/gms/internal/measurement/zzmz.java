package com.google.android.gms.internal.measurement;

import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes4.dex */
public enum zzmz {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(zzik.zza),
    ENUM(null),
    MESSAGE(null);

    zzmz(Object obj) {
    }
}
