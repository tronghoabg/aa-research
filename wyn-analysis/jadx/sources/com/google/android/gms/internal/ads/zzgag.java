package com.google.android.gms.internal.ads;

import java.io.Closeable;

/* loaded from: classes3.dex */
public abstract class zzgag implements Closeable {
    public static zzgas zza() {
        return new zzgas();
    }

    public static zzgas zzb(zzguj<Integer> zzgujVar, zzguj<Integer> zzgujVar2, zzgai zzgaiVar) {
        return new zzgas(zzgujVar, zzgujVar2, zzgaiVar);
    }

    public static zzgas zzc(final int i5, zzgai zzgaiVar) {
        return new zzgas(new zzguj() { // from class: com.google.android.gms.internal.ads.zzgaf
            @Override // com.google.android.gms.internal.ads.zzguj
            public final /* synthetic */ Object zza() {
                return Integer.valueOf(i5);
            }
        }, zzgae.zza, zzgaiVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer zzf() {
        return -1;
    }
}
