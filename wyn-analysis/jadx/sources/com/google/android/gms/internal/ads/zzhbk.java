package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes3.dex */
final class zzhbk extends zzhbi {
    private zzhbk() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzhbi
    public final void zza(zzhbl zzhblVar, Set set, Set set2) {
        synchronized (zzhblVar) {
            try {
                if (zzhblVar.seenExceptionsField == null) {
                    zzhblVar.seenExceptionsField = set2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbi
    public final int zzb(zzhbl zzhblVar) {
        int i5;
        synchronized (zzhblVar) {
            i5 = zzhblVar.remainingField - 1;
            zzhblVar.remainingField = i5;
        }
        return i5;
    }

    public /* synthetic */ zzhbk(byte[] bArr) {
        super(null);
    }
}
