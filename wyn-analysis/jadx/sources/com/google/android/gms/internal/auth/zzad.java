package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;

/* loaded from: classes3.dex */
final class zzad extends zzah {
    final /* synthetic */ zzae zza;

    public zzad(zzae zzaeVar) {
        this.zza = zzaeVar;
    }

    @Override // com.google.android.gms.internal.auth.zzah, U6.c
    public final void zzb(Account account) {
        this.zza.setResult((zzae) new zzai(account != null ? Status.f26424e : zzal.zza, account));
    }
}
