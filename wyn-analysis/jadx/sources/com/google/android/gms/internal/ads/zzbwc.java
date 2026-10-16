package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import j$.util.Objects;
import x6.C4470a;

/* loaded from: classes3.dex */
final class zzbwc implements J6.c {
    final /* synthetic */ zzbvp zza;
    final /* synthetic */ J6.a zzb;
    final /* synthetic */ zzbwk zzc;

    public zzbwc(zzbwk zzbwkVar, zzbvp zzbvpVar, J6.a aVar) {
        this.zza = zzbvpVar;
        this.zzb = aVar;
        Objects.requireNonNull(zzbwkVar);
        this.zzc = zzbwkVar;
    }

    @Override // J6.c
    public final void onFailure(C4470a c4470a) {
        try {
            String canonicalName = this.zzb.getClass().getCanonicalName();
            int iA = c4470a.a();
            String str = c4470a.f47721b;
            String str2 = c4470a.f47722c;
            StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 41 + String.valueOf(iA).length() + 17 + String.valueOf(str).length() + 16 + String.valueOf(str2).length());
            sb2.append(canonicalName);
            sb2.append("failed to load mediation ad: ErrorCode = ");
            sb2.append(iA);
            sb2.append(". ErrorMessage = ");
            sb2.append(str);
            sb2.append(". ErrorDomain = ");
            sb2.append(str2);
            H6.l.a(sb2.toString());
            zzbvp zzbvpVar = this.zza;
            zzbvpVar.zzx(c4470a.b());
            zzbvpVar.zzw(c4470a.a(), str);
            zzbvpVar.zzg(c4470a.a());
        } catch (RemoteException e7) {
            H6.l.d("", e7);
        }
    }

    public final /* synthetic */ Object onSuccess(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
        try {
            this.zzc.zzT(null);
            this.zza.zzj();
        } catch (RemoteException e7) {
            H6.l.d("", e7);
        }
        return new zzbwa(this.zza);
    }
}
