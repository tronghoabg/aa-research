package com.google.android.gms.internal.p002firebaseauthapi;

import J8.x;

/* loaded from: classes.dex */
final class zzaeb implements zzaeg {
    private final /* synthetic */ String zza;

    public zzaeb(zzaea zzaeaVar, String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeg
    public final void zza(x xVar, Object... objArr) {
        xVar.onCodeAutoRetrievalTimeOut(this.zza);
    }
}
