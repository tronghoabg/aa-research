package com.google.android.gms.internal.ads;

import G6.U;
import android.content.DialogInterface;
import android.content.Intent;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzbyc implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbye zza;

    public zzbyc(zzbye zzbyeVar) {
        Objects.requireNonNull(zzbyeVar);
        this.zza = zzbyeVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i5) {
        zzbye zzbyeVar = this.zza;
        Intent intentZzb = zzbyeVar.zzb();
        U u10 = C6.n.f1857D.f1863c;
        U.s(zzbyeVar.zzc(), intentZzb);
    }
}
