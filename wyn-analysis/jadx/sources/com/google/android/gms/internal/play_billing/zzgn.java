package com.google.android.gms.internal.play_billing;

/* loaded from: classes4.dex */
final class zzgn implements zzcw {
    static final zzcw zza = new zzgn();

    private zzgn() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzcw
    public final boolean zza(int i5) {
        zzgo zzgoVar = zzgo.BROADCAST_ACTION_UNSPECIFIED;
        return (i5 != 0 ? i5 != 1 ? i5 != 2 ? i5 != 3 ? null : zzgo.ALTERNATIVE_BILLING_ACTION : zzgo.LOCAL_PURCHASES_UPDATED_ACTION : zzgo.PURCHASES_UPDATED_ACTION : zzgo.BROADCAST_ACTION_UNSPECIFIED) != null;
    }
}
