package com.google.android.gms.internal.p002firebaseauthapi;

import J8.w;
import J8.x;

/* loaded from: classes.dex */
final class zzadz implements zzaeg {
    private final /* synthetic */ String zza;

    public zzadz(zzaea zzaeaVar, String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeg
    public final void zza(x xVar, Object... objArr) {
        xVar.onCodeSent(this.zza, new w());
    }
}
