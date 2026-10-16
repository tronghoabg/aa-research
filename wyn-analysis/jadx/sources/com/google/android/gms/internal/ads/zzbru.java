package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.InterfaceC1714c;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzbru implements InterfaceC1714c {
    final /* synthetic */ zzcgd zza;

    public zzbru(zzbrv zzbrvVar, zzcgd zzcgdVar) {
        this.zza = zzcgdVar;
        Objects.requireNonNull(zzbrvVar);
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1714c
    public final void onConnectionFailed(d7.b bVar) {
        this.zza.zzd(new RuntimeException("Connection failed."));
    }
}
