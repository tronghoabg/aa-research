package com.google.android.gms.internal.p002firebaseauthapi;

import J8.u;
import J8.x;

/* loaded from: classes.dex */
final class zzaec implements zzaeg {
    private final /* synthetic */ u zza;

    public zzaec(zzaea zzaeaVar, u uVar) {
        this.zza = uVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeg
    public final void zza(x xVar, Object... objArr) {
        xVar.onVerificationCompleted(this.zza);
    }
}
