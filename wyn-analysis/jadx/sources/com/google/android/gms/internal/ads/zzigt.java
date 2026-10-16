package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzigt extends zzigx {
    public zzigt() {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.zzigx
    public final void zza() {
        if (!zzb()) {
            for (int i5 = 0; i5 < zzc(); i5++) {
                Map.Entry entryZzd = zzd(i5);
                if (((zzied) ((zzigu) entryZzd).zza()).zzd()) {
                    entryZzd.setValue(DesugarCollections.unmodifiableList((List) entryZzd.getValue()));
                }
            }
            for (Map.Entry entry : zze()) {
                if (((zzied) entry.getKey()).zzd()) {
                    entry.setValue(DesugarCollections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}
