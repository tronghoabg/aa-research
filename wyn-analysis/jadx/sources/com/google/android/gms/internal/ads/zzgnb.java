package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final class zzgnb implements zzgmp {
    private final Context zza;
    private final ExecutorService zzb;
    private final zzgep zzc;
    private final String zzd;
    private final String zze;
    private final zzgqo zzf;
    private final zzgnd zzg;
    private final int zzh;

    public zzgnb(Context context, ExecutorService executorService, zzgdq zzgdqVar, zzgep zzgepVar, zzgqo zzgqoVar, zzgnd zzgndVar) {
        this.zza = context;
        this.zzb = executorService;
        this.zzc = zzgepVar;
        this.zzf = zzgqoVar;
        this.zzg = zzgndVar;
        this.zzd = zzgdqVar.zzd();
        this.zzh = zzbec.zzb(zzgdp.zza(zzgdqVar.zzM()));
        this.zze = zzgdqVar.zzk().zzc();
    }

    private static zzgfz zze(int i5) {
        zzgfy zzgfyVarZzd = zzgfz.zzd();
        zzgfyVarZzd.zzd(i5);
        return (zzgfz) zzgfyVarZzd.zzbu();
    }

    @Override // com.google.android.gms.internal.ads.zzgmp
    public final p8.p zza() {
        int i5;
        zzbdq zzbdqVarZza = zzbdr.zza();
        byte[] bArrZza = zzavh.zza();
        zzidl zzidlVar = zzidl.zza;
        zzbdqVarZza.zza(zzidl.zzt(bArrZza, 0, bArrZza.length));
        zzbdqVarZza.zzb(Build.VERSION.SDK_INT);
        zzbdqVarZza.zzc(Build.MODEL);
        Context context = this.zza;
        zzbdqVarZza.zzd(context.getPackageName());
        try {
            i5 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            i5 = -1;
        }
        zzgep zzgepVar = this.zzc;
        zzgqo zzgqoVar = this.zzf;
        zzbdqVarZza.zze(i5);
        zzbdqVarZza.zzf(this.zzd);
        zzbdqVarZza.zzg(3);
        zzbdqVarZza.zzh(this.zzh);
        zzhbx zzhbxVar = (zzhbx) zzhcf.zzg((zzhbx) zzhcf.zzg((zzhbx) zzhcf.zzk(zzhbx.zzw(zzgepVar.zza(Uri.parse(this.zze).buildUpon().appendQueryParameter("aspq", zzgel.zza(((zzbdr) zzbdqVarZza.zzbu()).zzaN(), true)).build().toString())), new zzgti() { // from class: com.google.android.gms.internal.ads.zzgna
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzb((zzgeo) obj);
            }
        }, this.zzb), UnknownHostException.class, new zzgti() { // from class: com.google.android.gms.internal.ads.zzgmy
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzc((UnknownHostException) obj);
            }
        }, zzhcw.zza()), SocketException.class, new zzgti() { // from class: com.google.android.gms.internal.ads.zzgmz
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzd((SocketException) obj);
            }
        }, zzhcw.zza());
        zzgqoVar.zze(20002, zzhbxVar);
        return zzhbxVar;
    }

    public final /* synthetic */ zzgfz zzb(zzgeo zzgeoVar) {
        if (zzgeoVar.zza() != 200) {
            this.zzf.zzc(20003, new String(zzavh.zza(), StandardCharsets.UTF_8));
            return zze(7);
        }
        try {
            String strZzb = zzgeoVar.zzb();
            if (TextUtils.isEmpty(strZzb)) {
                this.zzf.zzb(20004);
                return zze(8);
            }
            zzbdt zzbdtVarZzc = zzbdt.zzc(zzgel.zzb(strZzb, true), zzidz.zzc());
            if (zzbdtVarZzc.zza().zzc() && zzbdtVarZzc.zza().zza()) {
                if (!this.zzg.zza(zzbdtVarZzc)) {
                    this.zzf.zzb(20006);
                    return zze(12);
                }
                zzgfy zzgfyVarZzd = zzgfz.zzd();
                zzgga zzggaVarZzg = zzggb.zzg();
                zzggaVarZzg.zzb(zzbdtVarZzc.zza().zzb());
                zzggaVarZzg.zzd(zzbdtVarZzc.zzb());
                zzgfyVarZzd.zza((zzggb) zzggaVarZzg.zzbu());
                zzgfyVarZzd.zzb(zzbdtVarZzc.zza().zzd());
                zzgfyVarZzd.zzd(2);
                return (zzgfz) zzgfyVarZzd.zzbu();
            }
            this.zzf.zzb(20004);
            return zze(8);
        } catch (Throwable th) {
            this.zzf.zzd(20005, th);
            return zze(6);
        }
    }

    public final /* synthetic */ zzgfz zzc(UnknownHostException unknownHostException) {
        this.zzf.zzb(20007);
        return zze(13);
    }

    public final /* synthetic */ zzgfz zzd(SocketException socketException) {
        this.zzf.zzb(20008);
        return zze(13);
    }
}
