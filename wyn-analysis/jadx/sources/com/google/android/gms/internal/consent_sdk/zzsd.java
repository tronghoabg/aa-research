package com.google.android.gms.internal.consent_sdk;

import j$.util.DesugarCollections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class zzsd extends zzsi {
    public zzsd() {
        super(null);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsi
    public final void zza() {
        if (!zzj()) {
            for (int i5 = 0; i5 < zzc(); i5++) {
                Map.Entry entryZzg = zzg(i5);
                if (((zzqe) ((zzse) entryZzg).zza()).zze()) {
                    entryZzg.setValue(DesugarCollections.unmodifiableList((List) entryZzg.getValue()));
                }
            }
            for (Map.Entry entry : zzd()) {
                if (((zzqe) entry.getKey()).zze()) {
                    entry.setValue(DesugarCollections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}
