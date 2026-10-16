package com.google.android.gms.internal.ads;

import D6.InterfaceC0358a;

/* loaded from: classes3.dex */
public final class zzdvi extends zzdut implements zzdlg {
    private zzdlg zza;

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final synchronized void zzdR() {
        zzdlg zzdlgVar = this.zza;
        if (zzdlgVar != null) {
            zzdlgVar.zzdR();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final synchronized void zzdu() {
        zzdlg zzdlgVar = this.zza;
        if (zzdlgVar != null) {
            zzdlgVar.zzdu();
        }
    }

    public final synchronized void zzn(InterfaceC0358a interfaceC0358a, zzbon zzbonVar, F6.o oVar, zzbop zzbopVar, F6.c cVar, zzdlg zzdlgVar) throws Throwable {
        try {
            try {
                zzm(interfaceC0358a, zzbonVar, oVar, zzbopVar, cVar);
                this.zza = zzdlgVar;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }
}
