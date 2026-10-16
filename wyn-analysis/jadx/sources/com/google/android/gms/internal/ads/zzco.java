package com.google.android.gms.internal.ads;

import Va.M6;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes3.dex */
public final class zzco extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public zzco(String str, zzcl zzclVar) {
        String strValueOf = String.valueOf(zzclVar);
        super(M6.t(new StringBuilder(str.length() + 1 + strValueOf.length()), str, StringUtils.SPACE, strValueOf));
    }
}
