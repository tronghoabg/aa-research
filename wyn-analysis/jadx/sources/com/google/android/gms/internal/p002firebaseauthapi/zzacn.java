package com.google.android.gms.internal.p002firebaseauthapi;

import J8.AbstractC0629d;
import K8.C0693e;
import K8.J;
import K8.T;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.tasks.TaskCompletionSource;
import gc.b;

/* loaded from: classes.dex */
final class zzacn extends zzady<T, J> {
    private final zzahr zzu;

    public zzacn(AbstractC0629d abstractC0629d, String str) {
        super(2);
        AbstractC1732v.j(abstractC0629d, "credential cannot be null");
        this.zzu = b.P(abstractC0629d, str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final String zza() {
        return "signInWithCredential";
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
