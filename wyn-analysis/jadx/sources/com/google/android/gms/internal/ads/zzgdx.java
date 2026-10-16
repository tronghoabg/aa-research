package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
final class zzgdx implements zzgdm {
    private ExecutorService zza;
    private Context zzb;
    private zzgdq zzc;

    private zzgdx() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgdm
    public final zzgdn zza() {
        zzinh.zzc(this.zza, ExecutorService.class);
        zzinh.zzc(this.zzb, Context.class);
        zzinh.zzc(this.zzc, zzgdq.class);
        return new zzgdw(new zzgjr(), new zzgjt(), new zzgjv(), this.zza, this.zzb, this.zzc);
    }

    public final zzgdx zzb(ExecutorService executorService) {
        executorService.getClass();
        this.zza = executorService;
        return this;
    }

    public final zzgdx zzc(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    public final zzgdx zzd(zzgdq zzgdqVar) {
        zzgdqVar.getClass();
        this.zzc = zzgdqVar;
        return this;
    }

    public /* synthetic */ zzgdx(byte[] bArr) {
    }
}
