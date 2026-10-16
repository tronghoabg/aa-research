package com.google.android.gms.internal.p002firebaseauthapi;

import J8.u;
import K8.C0693e;
import K8.J;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class zzacy extends zzady<Void, J> {
    private final u zzu;

    public zzacy(u uVar) {
        super(2);
        AbstractC1732v.i(uVar);
        this.zzu = uVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final String zza() {
        return "updatePhoneNumber";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzady
    public final void zzb() {
        ((J) this.zze).a(this.zzj, zzabj.zza(this.zzc, this.zzk));
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final void zza(TaskCompletionSource taskCompletionSource, zzadh zzadhVar) {
        this.zzg = new zzaef(this, taskCompletionSource);
        zzadhVar.zza(new zzagp(((C0693e) this.zzd).f6627a.zzf(), zzaeq.zza(this.zzu)), this.zzb);
    }
}
