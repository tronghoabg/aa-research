package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* loaded from: classes3.dex */
public final class zzhvg {
    private zzhvj zza = null;
    private zzibl zzb = null;

    private zzhvg() {
    }

    public final zzhvg zza(zzhvj zzhvjVar) {
        this.zza = zzhvjVar;
        return this;
    }

    public final zzhvg zzb(zzibl zziblVar) {
        this.zzb = zziblVar;
        return this;
    }

    public final zzhvh zzc() throws GeneralSecurityException {
        zzhvj zzhvjVar = this.zza;
        if (zzhvjVar == null) {
            throw new GeneralSecurityException("Cannot build without a ecdsa public key");
        }
        zzibl zziblVar = this.zzb;
        if (zziblVar == null) {
            throw new GeneralSecurityException("Cannot build without a private value");
        }
        BigInteger bigIntegerZzb = zziblVar.zzb(zzhdx.zza());
        ECPoint eCPointZzd = zzhvjVar.zzd();
        zzhvb zzhvbVarZzd = zzhvjVar.zzf().zzd();
        BigInteger order = zzhvbVarZzd.zza().getOrder();
        if (bigIntegerZzb.signum() <= 0 || bigIntegerZzb.compareTo(order) >= 0) {
            throw new GeneralSecurityException("Invalid private value");
        }
        if (zzhlt.zzd(bigIntegerZzb, zzhvbVarZzd.zza()).equals(eCPointZzd)) {
            return new zzhvh(this.zza, this.zzb, null);
        }
        throw new GeneralSecurityException("Invalid private value");
    }

    public /* synthetic */ zzhvg(byte[] bArr) {
    }
}
