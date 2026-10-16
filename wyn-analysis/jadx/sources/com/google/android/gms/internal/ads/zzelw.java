package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import j$.util.Objects;

/* loaded from: classes3.dex */
public final class zzelw {
    private e3.e zza;
    private final Context zzb;

    public zzelw(Context context) {
        this.zzb = context;
    }

    public final p8.p zza() {
        try {
            e3.d dVarA = e3.e.a(this.zzb);
            this.zza = dVarA;
            return dVarA == null ? zzhcf.zzc(new IllegalStateException("MeasurementManagerFutures is null")) : dVarA.d();
        } catch (Exception e7) {
            return zzhcf.zzc(e7);
        }
    }

    public final p8.p zzb(Uri uri, InputEvent inputEvent) {
        try {
            e3.e eVar = this.zza;
            Objects.requireNonNull(eVar);
            return eVar.b(uri, inputEvent);
        } catch (Exception e7) {
            return zzhcf.zzc(e7);
        }
    }
}
