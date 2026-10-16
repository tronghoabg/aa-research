package com.google.android.gms.internal.ads;

import android.view.View;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzclc implements View.OnAttachStateChangeListener {
    final /* synthetic */ zzcdu zza;
    final /* synthetic */ zzclm zzb;

    public zzclc(zzclm zzclmVar, zzcdu zzcduVar) {
        this.zza = zzcduVar;
        Objects.requireNonNull(zzclmVar);
        this.zzb = zzclmVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.zzb.zzZ(view, this.zza, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
