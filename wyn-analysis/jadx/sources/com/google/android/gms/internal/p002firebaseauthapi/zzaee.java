package com.google.android.gms.internal.p002firebaseauthapi;

import J8.x;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
final class zzaee implements zzaeg {
    private final /* synthetic */ Status zza;

    public zzaee(zzaea zzaeaVar, Status status) {
        this.zza = status;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeg
    public final void zza(x xVar, Object... objArr) {
        xVar.onVerificationFailed(zzadg.zza(this.zza));
    }
}
