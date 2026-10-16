package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import j$.util.Objects;
import org.json.JSONException;

/* loaded from: classes3.dex */
final class zzbyj implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbyk zza;

    public zzbyj(zzbyk zzbykVar) {
        Objects.requireNonNull(zzbykVar);
        this.zza = zzbykVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i5) throws JSONException {
        this.zza.zzg("User canceled the download.");
    }
}
