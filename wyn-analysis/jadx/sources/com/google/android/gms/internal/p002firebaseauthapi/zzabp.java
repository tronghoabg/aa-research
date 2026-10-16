package com.google.android.gms.internal.p002firebaseauthapi;

import K8.C0699k;
import K8.J;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;

/* loaded from: classes.dex */
final class zzabp extends zzady<C0699k, J> {
    private final String zzu;
    private final String zzv;

    public zzabp(String str, String str2) {
        super(3);
        AbstractC1732v.g(str, "email cannot be null or empty");
        this.zzu = str;
        this.zzv = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final String zza() {
        return "fetchSignInMethodsForEmail";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzady
    public final void zzb() {
        List<String> listZzh;
        if (this.zzl.zza() == null) {
            listZzh = zzal.zzh();
        } else {
            List<String> listZza = this.zzl.zza();
            AbstractC1732v.i(listZza);
            listZzh = listZza;
        }
        zzb(new C0699k(listZzh));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final void zza(TaskCompletionSource taskCompletionSource, zzadh zzadhVar) {
        this.zzg = new zzaef(this, taskCompletionSource);
        zzadhVar.zze(this.zzu, this.zzv, this.zzb);
    }
}
