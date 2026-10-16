package com.google.android.gms.internal.ads;

import android.view.View;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzbyf implements View.OnClickListener {
    final /* synthetic */ zzbyh zza;

    public zzbyf(zzbyh zzbyhVar) {
        Objects.requireNonNull(zzbyhVar);
        this.zza = zzbyhVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.zza.zzb(true);
    }
}
