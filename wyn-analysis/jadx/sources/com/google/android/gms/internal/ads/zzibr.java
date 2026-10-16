package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes3.dex */
public class zzibr {
    @Deprecated
    public zzibr() {
    }

    public final String toString() {
        try {
            StringBuilder sb2 = new StringBuilder();
            zzicq zzicqVar = new zzicq(zzicl.zza(sb2));
            zzicqVar.zza(zzibw.LENIENT);
            zzicm.zza.zza(zzicqVar, this);
            return sb2.toString();
        } catch (IOException e7) {
            throw new AssertionError(e7);
        }
    }

    public String zzd() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final zzibt zze() {
        if (this instanceof zzibt) {
            return (zzibt) this;
        }
        throw new IllegalStateException("Not a JSON Object: ".concat(toString()));
    }

    public final zzibq zzf() {
        if (this instanceof zzibq) {
            return (zzibq) this;
        }
        throw new IllegalStateException("Not a JSON Array: ".concat(toString()));
    }

    public final zzibv zzg() {
        if (this instanceof zzibv) {
            return (zzibv) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: ".concat(toString()));
    }
}
