package com.google.android.gms.internal.p002firebaseauthapi;

import J8.AbstractC0640o;
import J8.N;
import K8.C0693e;
import K8.InterfaceC0701m;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;

/* loaded from: classes.dex */
final class zzabm extends zzady<Void, InterfaceC0701m> {
    public zzabm() {
        super(5);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final String zza() {
        return "delete";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzady
    public final void zzb() {
        N n10 = (N) ((InterfaceC0701m) this.zze);
        FirebaseAuth firebaseAuth = n10.f5774b;
        AbstractC0640o abstractC0640o = firebaseAuth.f27288f;
        if (abstractC0640o != null && ((C0693e) abstractC0640o).f6628b.f6614a.equalsIgnoreCase(((C0693e) n10.f5773a).f6628b.f6614a)) {
            firebaseAuth.q();
        }
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final void zza(TaskCompletionSource taskCompletionSource, zzadh zzadhVar) {
        this.zzg = new zzaef(this, taskCompletionSource);
        zzadhVar.zza(((C0693e) this.zzd).f6627a.zzf(), this.zzb);
    }
}
