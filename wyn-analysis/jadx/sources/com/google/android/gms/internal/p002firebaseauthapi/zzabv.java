package com.google.android.gms.internal.p002firebaseauthapi;

import J8.C0630e;
import K8.C0693e;
import K8.J;
import K8.T;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class zzabv extends zzady<T, J> {
    private final C0630e zzu;
    private final String zzv;

    public zzabv(C0630e c0630e, String str) {
        super(2);
        AbstractC1732v.j(c0630e, "credential cannot be null");
        this.zzu = c0630e;
        AbstractC1732v.g(c0630e.f5798a, "email cannot be null");
        AbstractC1732v.g(c0630e.f5799b, "password cannot be null");
        this.zzv = str;
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
        String str = c0630e.f5798a;
        String str2 = c0630e.f5799b;
        AbstractC1732v.f(str2);
        zzadhVar.zza(str, str2, ((C0693e) this.zzd).f6627a.zzf(), this.zzd.V(), this.zzv, this.zzb);
    }
}
