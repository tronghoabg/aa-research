package com.google.android.gms.internal.ads;

import android.os.AsyncTask;

/* loaded from: classes3.dex */
public abstract class zzfxe extends AsyncTask {
    private zzfxf zza;
    protected final zzfww zzd;

    public zzfxe(zzfww zzfwwVar) {
        this.zzd = zzfwwVar;
    }

    @Override // android.os.AsyncTask
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        zzfxf zzfxfVar = this.zza;
        if (zzfxfVar != null) {
            zzfxfVar.zzb(this);
        }
    }

    public final void zzb(zzfxf zzfxfVar) {
        this.zza = zzfxfVar;
    }
}
