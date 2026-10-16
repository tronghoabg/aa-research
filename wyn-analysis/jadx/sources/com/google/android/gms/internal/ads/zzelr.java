package com.google.android.gms.internal.ads;

import com.unity3d.services.core.device.MimeTypes;

/* loaded from: classes3.dex */
public enum zzelr {
    HTML_DISPLAY("htmlDisplay"),
    NATIVE_DISPLAY("nativeDisplay"),
    VIDEO(MimeTypes.BASE_TYPE_VIDEO);

    private final String zzd;

    zzelr(String str) {
        this.zzd = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zzd;
    }
}
