package com.google.android.gms.internal.identity;

/* loaded from: classes.dex */
final class zzev extends zzet {
    private final zzex zza;

    public zzev(zzex zzexVar, int i5) {
        super(zzexVar.size(), i5);
        this.zza = zzexVar;
    }

    @Override // com.google.android.gms.internal.identity.zzet
    public final Object zza(int i5) {
        return this.zza.get(i5);
    }
}
