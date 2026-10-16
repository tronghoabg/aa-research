package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzarm {
    public final int zza;
    public final String zzb;
    public final int zzc;
    public final List zzd;
    public final byte[] zze;

    public zzarm(int i5, String str, int i10, List list, byte[] bArr) {
        this.zza = i5;
        this.zzb = str;
        this.zzc = i10;
        this.zzd = list == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(list);
        this.zze = bArr;
    }

    public final int zza() {
        int i5 = this.zzc;
        if (i5 != 2) {
            return i5 != 3 ? 0 : 512;
        }
        return 2048;
    }
}
