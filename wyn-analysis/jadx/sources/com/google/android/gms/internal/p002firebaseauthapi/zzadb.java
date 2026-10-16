package com.google.android.gms.internal.p002firebaseauthapi;

import J8.F;
import K8.C0693e;
import K8.J;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class zzadb extends zzady<Void, J> {
    private final F zzu;

    public zzadb(F f10) {
        super(2);
        AbstractC1732v.j(f10, "request cannot be null");
        this.zzu = f10;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final String zza() {
        return "updateProfile";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzady
    public final void zzb() {
        ((J) this.zze).a(this.zzj, zzabj.zza(this.zzc, this.zzk));
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final void zza(TaskCompletionSource taskCompletionSource, zzadh zzadhVar) {
        this.zzg = new zzaef(this, taskCompletionSource);
        zzadhVar.zza(((C0693e) this.zzd).f6627a.zzf(), this.zzu, this.zzb);
    }
}
