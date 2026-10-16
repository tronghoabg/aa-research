package com.google.android.gms.internal.p002firebaseauthapi;

import J8.u;
import K8.C0693e;
import K8.J;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class zzacf extends zzady<Void, J> {
    private final zzzg zzu;

    public zzacf(u uVar, String str) {
        super(2);
        AbstractC1732v.j(uVar, "credential cannot be null");
        uVar.f5820d = false;
        this.zzu = new zzzg(uVar, str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final String zza() {
        return "reauthenticateWithPhoneCredential";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzady
    public final void zzb() {
        C0693e c0693eZza = zzabj.zza(this.zzc, this.zzk);
        if (!((C0693e) this.zzd).f6628b.f6614a.equalsIgnoreCase(c0693eZza.f6628b.f6614a)) {
            zza(new Status(17024, null, null, null));
        } else {
            ((J) this.zze).a(this.zzj, c0693eZza);
            zzb(null);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final void zza(TaskCompletionSource taskCompletionSource, zzadh zzadhVar) {
        this.zzg = new zzaef(this, taskCompletionSource);
        zzadhVar.zza(this.zzu, this.zzb);
    }
}
