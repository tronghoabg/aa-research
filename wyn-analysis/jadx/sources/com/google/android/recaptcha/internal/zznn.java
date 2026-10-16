package com.google.android.recaptcha.internal;

import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes4.dex */
public enum zznn {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(zziv.zzb),
    ENUM(null),
    MESSAGE(null);

    zznn(Object obj) {
    }
}
