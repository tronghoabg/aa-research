package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zztz implements zzsd {
    final /* synthetic */ zzua zza;

    public /* synthetic */ zztz(zzua zzuaVar, byte[] bArr) {
        Objects.requireNonNull(zzuaVar);
        this.zza = zzuaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final void zza(Exception exc) {
        zzeh.zzf("MediaCodecAudioRenderer", "Audio sink error", exc);
        this.zza.zzaB().zzi(exc);
    }
}
