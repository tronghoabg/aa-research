package com.google.android.gms.internal.p002firebaseauthapi;

import J8.C0630e;
import K8.C0693e;
import K8.J;
import K8.T;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class zzaco extends zzady<T, J> {
    private final zzafn zzu;

    public zzaco(C0630e c0630e, String str) {
        super(2);
        AbstractC1732v.j(c0630e, "credential cannot be null");
        this.zzu = new zzafn(c0630e, null, str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final String zza() {
        return "sendSignInLinkToEmail";
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
