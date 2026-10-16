package com.google.android.gms.internal.p002firebaseauthapi;

import J8.C0627b;
import K8.J;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class zzaci extends zzady<Void, J> {
    private final zzagg zzu;
    private final String zzv;

    public zzaci(String str, C0627b c0627b, String str2, String str3, String str4) {
        super(4);
        AbstractC1732v.g(str, "email cannot be null or empty");
        zzagg zzaggVar = new zzagg(c0627b.f5792i);
        this.zzu = zzaggVar;
        zzaggVar.zzb(str);
        zzaggVar.zza(c0627b);
        zzaggVar.zzc(str2);
        zzaggVar.zza(str3);
        this.zzv = str4;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final String zza() {
        return this.zzv;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzady
    public final void zzb() {
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final void zza(TaskCompletionSource taskCompletionSource, zzadh zzadhVar) {
        this.zzg = new zzaef(this, taskCompletionSource);
        zzadhVar.zzb(this.zzu, this.zzb);
    }
}
