package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import ka.AbstractC3256n;

/* loaded from: classes3.dex */
public final class zzhhq {
    private zzhhs zza;
    private String zzb;
    private zzhhr zzc;
    private zzhfh zzd;

    private zzhhq() {
        throw null;
    }

    public final zzhhq zza(zzhhs zzhhsVar) {
        this.zza = zzhhsVar;
        return this;
    }

    public final zzhhq zzb(String str) {
        this.zzb = str;
        return this;
    }

    public final zzhhq zzc(zzhhr zzhhrVar) {
        this.zzc = zzhhrVar;
        return this;
    }

    public final zzhhq zzd(zzhfh zzhfhVar) {
        this.zzd = zzhfhVar;
        return this;
    }

    public final zzhht zze() throws GeneralSecurityException {
        if (this.zza == null) {
            this.zza = zzhhs.zzb;
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("kekUri must be set");
        }
        zzhhr zzhhrVar = this.zzc;
        if (zzhhrVar == null) {
            throw new GeneralSecurityException("dekParsingStrategy must be set");
        }
        zzhfh zzhfhVar = this.zzd;
        if (zzhfhVar == null) {
            throw new GeneralSecurityException("dekParametersForNewKeys must be set");
        }
        if (zzhfhVar.zza()) {
            throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
        }
        if ((zzhhrVar.equals(zzhhr.zza) && (zzhfhVar instanceof zzhgk)) || ((zzhhrVar.equals(zzhhr.zzc) && (zzhfhVar instanceof zzhgz)) || ((zzhhrVar.equals(zzhhr.zzb) && (zzhfhVar instanceof zzhiv)) || ((zzhhrVar.equals(zzhhr.zzd) && (zzhfhVar instanceof zzhft)) || ((zzhhrVar.equals(zzhhr.zze) && (zzhfhVar instanceof zzhgb)) || (zzhhrVar.equals(zzhhr.zzf) && (zzhfhVar instanceof zzhgt))))))) {
            return new zzhht(this.zza, this.zzb, this.zzc, this.zzd, null);
        }
        String string = this.zzc.toString();
        String strValueOf = String.valueOf(this.zzd);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + string.length() + 67 + 1);
        AbstractC3256n.p(sb2, "Cannot use parsing strategy ", string, " when new keys are picked according to ", strValueOf);
        sb2.append(".");
        throw new GeneralSecurityException(sb2.toString());
    }

    public /* synthetic */ zzhhq(byte[] bArr) {
    }
}
