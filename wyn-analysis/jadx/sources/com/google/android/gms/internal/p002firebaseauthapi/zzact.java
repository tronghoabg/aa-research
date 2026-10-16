package com.google.android.gms.internal.p002firebaseauthapi;

import K8.C0698j;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class zzact extends zzady<zzahh, Void> {
    private final zzaho zzu;

    public zzact(C0698j c0698j, String str) {
        super(12);
        AbstractC1732v.i(c0698j);
        String str2 = c0698j.f6652a;
        AbstractC1732v.f(str2);
        this.zzu = zzaho.zza(str2, str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final String zza() {
        return "startMfaEnrollment";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzady
    public final void zzb() {
        zzb(this.zzt);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final void zza(TaskCompletionSource taskCompletionSource, zzadh zzadhVar) {
        this.zzg = new zzaef(this, taskCompletionSource);
        zzadhVar.zza(this.zzu, this.zzb);
    }
}
