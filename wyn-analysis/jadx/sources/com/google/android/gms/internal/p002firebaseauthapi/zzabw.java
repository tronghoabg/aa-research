package com.google.android.gms.internal.p002firebaseauthapi;

import J8.AbstractC0640o;
import J8.C0630e;
import K8.C0693e;
import K8.J;
import K8.T;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class zzabw extends zzady<T, J> {
    private final C0630e zzu;

    public zzabw(C0630e c0630e) {
        super(2);
        AbstractC1732v.j(c0630e, "credential cannot be null");
        this.zzu = c0630e;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final String zza() {
        return "linkEmailAuthCredential";
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
        C0630e c0630e = this.zzu;
        AbstractC0640o abstractC0640o = this.zzd;
        c0630e.getClass();
        c0630e.f5801d = ((C0693e) abstractC0640o).f6627a.zzf();
        c0630e.f5802e = true;
        zzadhVar.zza(new zzafn(c0630e, null, null), this.zzb);
    }
}
