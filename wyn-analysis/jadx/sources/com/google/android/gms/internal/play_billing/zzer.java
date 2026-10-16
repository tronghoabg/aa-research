package com.google.android.gms.internal.play_billing;

import j$.util.DesugarCollections;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
final class zzer extends zzfb {
    public zzer(int i5) {
        super(i5, null);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfb
    public final void zza() {
        if (!zzj()) {
            for (int i5 = 0; i5 < zzb(); i5++) {
                Map.Entry entryZzg = zzg(i5);
                if (((zzch) entryZzg.getKey()).zzg()) {
                    entryZzg.setValue(DesugarCollections.unmodifiableList((List) entryZzg.getValue()));
                }
            }
            for (Map.Entry entry : zzc()) {
                if (((zzch) entry.getKey()).zzg()) {
                    entry.setValue(DesugarCollections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}
