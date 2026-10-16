package com.google.android.gms.internal.measurement;

import j$.util.DesugarCollections;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
final class zzly extends zzlv {
    public zzly() {
        super();
    }

    @Override // com.google.android.gms.internal.measurement.zzlv
    public final void zzd() {
        if (!zze()) {
            for (int i5 = 0; i5 < zza(); i5++) {
                Map.Entry entryZza = zza(i5);
                if (((zzjo) entryZza.getKey()).zze()) {
                    entryZza.setValue(DesugarCollections.unmodifiableList((List) entryZza.getValue()));
                }
            }
            for (Map.Entry entry : zzb()) {
                if (((zzjo) entry.getKey()).zze()) {
                    entry.setValue(DesugarCollections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zzd();
    }
}
