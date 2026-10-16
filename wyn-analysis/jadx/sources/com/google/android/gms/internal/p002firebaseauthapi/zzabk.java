package com.google.android.gms.internal.p002firebaseauthapi;

import K8.J;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class zzabk extends zzady<Void, J> {
    private final zzagw zzu;

    public zzabk(String str, String str2, String str3) {
        super(4);
        AbstractC1732v.g(str, "code cannot be null or empty");
        AbstractC1732v.g(str2, "new password cannot be null or empty");
        this.zzu = new zzagw(str, str2, str3);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final String zza() {
        return "confirmPasswordReset";
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
