package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import j$.util.Objects;
import java.util.Iterator;

/* loaded from: classes3.dex */
final class zzcej implements SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ zzcem zza;
    private final String zzb;

    public zzcej(zzcem zzcemVar, String str) {
        Objects.requireNonNull(zzcemVar);
        this.zza = zzcemVar;
        this.zzb = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        zzcem zzcemVar = this.zza;
        synchronized (zzcemVar) {
            try {
                Iterator it = zzcemVar.zzd().iterator();
                while (it.hasNext()) {
                    ((zzcek) it.next()).zza(sharedPreferences, this.zzb, str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
