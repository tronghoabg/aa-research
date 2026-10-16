package com.google.android.gms.internal.p002firebaseauthapi;

import j$.util.DesugarCollections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class zzalz extends zzalw {
    public zzalz() {
        super();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalw
    public final void zzd() {
        if (!zze()) {
            for (int i5 = 0; i5 < zza(); i5++) {
                Map.Entry entryZza = zza(i5);
                if (((zzajt) entryZza.getKey()).zze()) {
                    entryZza.setValue(DesugarCollections.unmodifiableList((List) entryZza.getValue()));
                }
            }
            for (Map.Entry entry : zzb()) {
                if (((zzajt) entry.getKey()).zze()) {
                    entry.setValue(DesugarCollections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zzd();
    }
}
