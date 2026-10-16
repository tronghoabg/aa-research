package com.google.android.gms.internal.p002firebaseauthapi;

import J8.u;
import J8.w;
import J8.x;
import s8.j;

/* loaded from: classes.dex */
final class zzaeu extends x {
    private final /* synthetic */ x zza;
    private final /* synthetic */ String zzb;

    public zzaeu(x xVar, String str) {
        this.zza = xVar;
        this.zzb = str;
    }

    @Override // J8.x
    public final void onCodeAutoRetrievalTimeOut(String str) {
        zzaer.zza.remove(this.zzb);
        this.zza.onCodeAutoRetrievalTimeOut(str);
    }

    @Override // J8.x
    public final void onCodeSent(String str, w wVar) {
        this.zza.onCodeSent(str, wVar);
    }

    @Override // J8.x
    public final void onVerificationCompleted(u uVar) {
        zzaer.zza.remove(this.zzb);
        this.zza.onVerificationCompleted(uVar);
    }

    @Override // J8.x
    public final void onVerificationFailed(j jVar) {
        zzaer.zza.remove(this.zzb);
        this.zza.onVerificationFailed(jVar);
    }
}
