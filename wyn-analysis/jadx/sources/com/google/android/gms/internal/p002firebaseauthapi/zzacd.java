package com.google.android.gms.internal.p002firebaseauthapi;

import K8.C0693e;
import K8.J;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class zzacd extends zzady<Void, J> {
    private final String zzu;
    private final String zzv;
    private final String zzw;
    private final String zzx;

    public zzacd(String str, String str2, String str3, String str4) {
        super(2);
        AbstractC1732v.g(str, "email cannot be null or empty");
        AbstractC1732v.g(str2, "password cannot be null or empty");
        this.zzu = str;
        this.zzv = str2;
        this.zzw = str3;
        this.zzx = str4;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final String zza() {
        return "reauthenticateWithEmailPassword";
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
        zzadhVar.zzb(this.zzu, this.zzv, this.zzw, this.zzx, this.zzb);
    }
}
