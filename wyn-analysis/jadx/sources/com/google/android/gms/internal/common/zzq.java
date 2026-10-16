package com.google.android.gms.internal.common;

import j$.util.Objects;

/* loaded from: classes3.dex */
public final class zzq {
    public static final CharSequence zza(Object obj, String str) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }
}
