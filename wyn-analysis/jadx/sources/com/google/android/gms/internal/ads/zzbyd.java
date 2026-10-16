package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import j$.util.Objects;
import org.json.JSONException;

/* loaded from: classes3.dex */
final class zzbyd implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbye zza;

    public zzbyd(zzbye zzbyeVar) {
        Objects.requireNonNull(zzbyeVar);
        this.zza = zzbyeVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i5) throws JSONException {
        this.zza.zzg("Operation denied by user.");
    }
}
