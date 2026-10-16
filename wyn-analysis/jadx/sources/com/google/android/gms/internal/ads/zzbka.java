package com.google.android.gms.internal.ads;

import j$.util.Objects;
import org.json.JSONException;

/* loaded from: classes3.dex */
final class zzbka extends Q6.b {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbkc zzb;

    public zzbka(zzbkc zzbkcVar, String str) {
        this.zza = str;
        Objects.requireNonNull(zzbkcVar);
        this.zzb = zzbkcVar;
    }

    @Override // Q6.b
    public final void onFailure(String str) {
        int i5 = G6.L.f4523b;
        H6.l.f("Failed to generate query info for Custom Tab error: ".concat(String.valueOf(str)));
        try {
            zzbkc zzbkcVar = this.zzb;
            zzbkcVar.zzi().a(zzbkcVar.zze(this.zza, str).toString());
        } catch (JSONException e7) {
            H6.l.d("Error creating PACT Error Response JSON: ", e7);
        }
    }

    @Override // Q6.b
    public final void onSuccess(Q6.a aVar) {
        String str = aVar.f9884a.f2412a;
        try {
            zzbkc zzbkcVar = this.zzb;
            zzbkcVar.zzi().a(zzbkcVar.zzf(this.zza, str).toString());
        } catch (JSONException e7) {
            int i5 = G6.L.f4523b;
            H6.l.d("Error creating PACT Signal Response JSON: ", e7);
        }
    }
}
