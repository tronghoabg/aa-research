package com.google.android.gms.internal.ads;

import D6.AbstractBinderC0359a0;

/* loaded from: classes3.dex */
public final class zzbfm extends AbstractBinderC0359a0 {
    private final y6.f zza;

    public zzbfm(y6.f fVar) {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
        this.zza = fVar;
    }

    @Override // D6.InterfaceC0362b0
    public final void zzb(String str, String str2) {
        this.zza.onAppEvent(str, str2);
    }

    public final y6.f zzc() {
        return this.zza;
    }
}
