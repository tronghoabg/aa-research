package com.google.android.gms.internal.p002firebaseauthapi;

import J8.C0627b;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class zzada extends zzady<Void, Void> {
    private final zzagg zzu;

    public zzada(String str, String str2, C0627b c0627b) {
        super(6);
        AbstractC1732v.f(str);
        AbstractC1732v.f(str2);
        AbstractC1732v.i(c0627b);
        this.zzu = zzagg.zza(c0627b, str, str2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final String zza() {
        return "verifyBeforeUpdateEmail";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzady
    public final void zzb() {
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final void zza(TaskCompletionSource taskCompletionSource, zzadh zzadhVar) {
        this.zzg = new zzaef(this, taskCompletionSource);
        zzadhVar.zzc(this.zzu, this.zzb);
    }
}
