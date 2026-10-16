package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes3.dex */
final class zzifl {
    public static final List zza(Object obj, long j8) {
        zzifb zzifbVar = (zzifb) zzihk.zzm(obj, j8);
        if (zzifbVar.zza()) {
            return zzifbVar;
        }
        int size = zzifbVar.size();
        zzifb zzifbVarZzh = zzifbVar.zzh(size == 0 ? 10 : size + size);
        zzihk.zzn(obj, j8, zzifbVarZzh);
        return zzifbVarZzh;
    }
}
