package com.google.android.gms.internal.p002firebaseauthapi;

import J8.u;
import K8.C0693e;
import K8.J;
import K8.T;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class zzacr extends zzady<T, J> {
    private final zzzg zzu;

    public zzacr(u uVar, String str) {
        super(2);
        AbstractC1732v.i(uVar);
        this.zzu = new zzzg(uVar, str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final String zza() {
        return "signInWithPhoneNumber";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzady
    public final void zzb() {
        C0693e c0693eZza = zzabj.zza(this.zzc, this.zzk);
        ((J) this.zze).a(this.zzj, c0693eZza);
        zzb(new T(c0693eZza));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final void zza(TaskCompletionSource taskCompletionSource, zzadh zzadhVar) {
        this.zzg = new zzaef(this, taskCompletionSource);
        zzadhVar.zza(this.zzu, this.zzb);
    }
}
