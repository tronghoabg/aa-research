package com.google.android.gms.internal.p002firebaseauthapi;

import J8.AbstractC0640o;
import J8.s;
import K8.C0693e;
import K8.J;
import K8.T;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class zzabr extends zzady<T, J> {
    private final s zzu;
    private final String zzv;
    private final String zzw;

    public zzabr(s sVar, String str, String str2) {
        super(2);
        AbstractC1732v.i(sVar);
        this.zzu = sVar;
        AbstractC1732v.f(str);
        this.zzv = str;
        this.zzw = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final String zza() {
        return "finalizeMfaSignIn";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzady
    public final void zzb() {
        C0693e c0693eZza = zzabj.zza(this.zzc, this.zzk);
        AbstractC0640o abstractC0640o = this.zzd;
        if (abstractC0640o != null && !((C0693e) abstractC0640o).f6628b.f6614a.equalsIgnoreCase(c0693eZza.f6628b.f6614a)) {
            zza(new Status(17024, null, null, null));
        } else {
            ((J) this.zze).a(this.zzj, c0693eZza);
            zzb(new T(c0693eZza));
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final void zza(TaskCompletionSource taskCompletionSource, zzadh zzadhVar) {
        this.zzg = new zzaef(this, taskCompletionSource);
        zzadhVar.zza(this.zzv, this.zzu, this.zzw, this.zzb);
    }
}
