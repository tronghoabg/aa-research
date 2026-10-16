package com.google.android.gms.internal.p002firebaseauthapi;

import J8.C0627b;
import K8.J;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class zzacj extends zzady<Void, J> {
    private final zzagg zzu;

    public zzacj(String str, C0627b c0627b) {
        super(6);
        AbstractC1732v.g(str, "token cannot be null or empty");
        zzagg zzaggVar = new zzagg(4);
        this.zzu = zzaggVar;
        zzaggVar.zzd(str);
        if (c0627b != null) {
            zzaggVar.zza(c0627b);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final String zza() {
        return "sendEmailVerification";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzady
    public final void zzb() {
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final void zza(TaskCompletionSource taskCompletionSource, zzadh zzadhVar) {
        this.zzg = new zzaef(this, taskCompletionSource);
        zzadhVar.zza(this.zzu, this.zzb);
    }
}
