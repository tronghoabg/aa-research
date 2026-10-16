package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;

/* loaded from: classes3.dex */
final /* synthetic */ class zzhvl implements zzhma {
    static final /* synthetic */ zzhvl zza = new zzhvl();

    private /* synthetic */ zzhvl() {
    }

    @Override // com.google.android.gms.internal.ads.zzhma
    public final /* synthetic */ zzhdz zza(zzheq zzheqVar, Integer num) throws GeneralSecurityException {
        zzhvf zzhvfVar = (zzhvf) zzheqVar;
        int i5 = zzhvn.zza;
        ECParameterSpec eCParameterSpecZza = zzhvfVar.zzd().zza();
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) zziak.zze.zzb("EC");
        keyPairGenerator.initialize(eCParameterSpecZza);
        KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
        ECPublicKey eCPublicKey = (ECPublicKey) keyPairGenerateKeyPair.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) keyPairGenerateKeyPair.getPrivate();
        zzhvi zzhviVar = new zzhvi(null);
        zzhviVar.zza(zzhvfVar);
        zzhviVar.zzc(num);
        zzhviVar.zzb(eCPublicKey.getW());
        zzhvj zzhvjVarZzd = zzhviVar.zzd();
        zzhvg zzhvgVar = new zzhvg(null);
        zzhvgVar.zza(zzhvjVarZzd);
        zzhvgVar.zzb(zzibl.zza(eCPrivateKey.getS(), zzhdx.zza()));
        return zzhvgVar.zzc();
    }
}
