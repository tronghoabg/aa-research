package com.google.android.gms.internal.p002firebaseauthapi;

import J8.x;
import J8.z;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class zzacs extends zzady<Void, x> {
    private final zzzj zzu;

    public zzacs(z zVar, String str, String str2, long j8, boolean z2, boolean z10, String str3, String str4, String str5, boolean z11) {
        super(8);
        AbstractC1732v.i(zVar);
        AbstractC1732v.f(str);
        this.zzu = new zzzj(zVar, str, str2, j8, z2, z10, str3, str4, str5, z11);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final String zza() {
        return "startMfaSignInWithPhoneNumber";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzady
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final void zza(TaskCompletionSource taskCompletionSource, zzadh zzadhVar) {
        this.zzg = new zzaef(this, taskCompletionSource);
        zzadhVar.zza(this.zzu, this.zzb);
    }
}
