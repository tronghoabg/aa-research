package com.google.android.gms.internal.ads;

import D6.BinderC0363b1;
import D6.L0;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.services.UnityAdsConstants;
import java.util.Collections;
import java.util.List;
import q7.BinderC3877b;
import q7.InterfaceC3876a;
import x.C4429v;

/* loaded from: classes3.dex */
public final class zzdqb {
    private int zza;
    private L0 zzb;
    private zzbme zzc;
    private View zzd;
    private List zze;
    private BinderC0363b1 zzg;
    private Bundle zzh;
    private zzclb zzi;
    private zzclb zzj;
    private zzclb zzk;
    private zzelv zzl;
    private p8.p zzm;
    private zzcgd zzn;
    private View zzo;
    private View zzp;
    private InterfaceC3876a zzq;
    private double zzr;
    private zzbml zzs;
    private zzbml zzt;
    private String zzu;
    private float zzx;
    private String zzy;
    private final C4429v zzv = new C4429v(0);
    private final C4429v zzw = new C4429v(0);
    private List zzf = Collections.EMPTY_LIST;

    public static zzdqb zzaf(zzbvy zzbvyVar) {
        try {
            return zzak(zzam(zzbvyVar.zzn(), zzbvyVar), zzbvyVar.zzo(), (View) zzal(zzbvyVar.zzp()), zzbvyVar.zze(), zzbvyVar.zzf(), zzbvyVar.zzg(), zzbvyVar.zzs(), zzbvyVar.zzi(), (View) zzal(zzbvyVar.zzq()), zzbvyVar.zzr(), zzbvyVar.zzl(), zzbvyVar.zzm(), zzbvyVar.zzk(), zzbvyVar.zzh(), zzbvyVar.zzj(), zzbvyVar.zzz());
        } catch (RemoteException e7) {
            int i5 = G6.L.f4523b;
            H6.l.g("Failed to get native ad assets from unified ad mapper", e7);
            return null;
        }
    }

    public static zzdqb zzag(zzbvv zzbvvVar) {
        try {
            zzdqa zzdqaVarZzam = zzam(zzbvvVar.zzs(), null);
            zzbme zzbmeVarZzt = zzbvvVar.zzt();
            View view = (View) zzal(zzbvvVar.zzr());
            String strZze = zzbvvVar.zze();
            List listZzf = zzbvvVar.zzf();
            String strZzg = zzbvvVar.zzg();
            Bundle bundleZzp = zzbvvVar.zzp();
            String strZzi = zzbvvVar.zzi();
            View view2 = (View) zzal(zzbvvVar.zzu());
            InterfaceC3876a interfaceC3876aZzv = zzbvvVar.zzv();
            String strZzj = zzbvvVar.zzj();
            zzbml zzbmlVarZzh = zzbvvVar.zzh();
            zzdqb zzdqbVar = new zzdqb();
            zzdqbVar.zza = 1;
            zzdqbVar.zzb = zzdqaVarZzam;
            zzdqbVar.zzc = zzbmeVarZzt;
            zzdqbVar.zzd = view;
            zzdqbVar.zzs("headline", strZze);
            zzdqbVar.zze = listZzf;
            zzdqbVar.zzs("body", strZzg);
            zzdqbVar.zzh = bundleZzp;
            zzdqbVar.zzs("call_to_action", strZzi);
            zzdqbVar.zzo = view2;
            zzdqbVar.zzq = interfaceC3876aZzv;
            zzdqbVar.zzs("advertiser", strZzj);
            zzdqbVar.zzt = zzbmlVarZzh;
            return zzdqbVar;
        } catch (RemoteException e7) {
            int i5 = G6.L.f4523b;
            H6.l.g("Failed to get native ad from content ad mapper", e7);
            return null;
        }
    }

    public static zzdqb zzah(zzbvu zzbvuVar) {
        zzdqb zzdqbVar;
        try {
            zzdqa zzdqaVarZzam = zzam(zzbvuVar.zzt(), null);
            zzbme zzbmeVarZzv = zzbvuVar.zzv();
            View view = (View) zzal(zzbvuVar.zzu());
            String strZze = zzbvuVar.zze();
            List listZzf = zzbvuVar.zzf();
            String strZzg = zzbvuVar.zzg();
            Bundle bundleZzr = zzbvuVar.zzr();
            String strZzi = zzbvuVar.zzi();
            View view2 = (View) zzal(zzbvuVar.zzw());
            InterfaceC3876a interfaceC3876aZzx = zzbvuVar.zzx();
            String strZzk = zzbvuVar.zzk();
            String strZzl = zzbvuVar.zzl();
            double dZzj = zzbvuVar.zzj();
            zzbml zzbmlVarZzh = zzbvuVar.zzh();
            zzdqbVar = null;
            try {
                zzdqb zzdqbVar2 = new zzdqb();
                zzdqbVar2.zza = 2;
                zzdqbVar2.zzb = zzdqaVarZzam;
                zzdqbVar2.zzc = zzbmeVarZzv;
                zzdqbVar2.zzd = view;
                zzdqbVar2.zzs("headline", strZze);
                zzdqbVar2.zze = listZzf;
                zzdqbVar2.zzs("body", strZzg);
                zzdqbVar2.zzh = bundleZzr;
                zzdqbVar2.zzs("call_to_action", strZzi);
                zzdqbVar2.zzo = view2;
                zzdqbVar2.zzq = interfaceC3876aZzx;
                zzdqbVar2.zzs("store", strZzk);
                zzdqbVar2.zzs(InAppPurchaseMetaData.KEY_PRICE, strZzl);
                zzdqbVar2.zzr = dZzj;
                zzdqbVar2.zzs = zzbmlVarZzh;
                return zzdqbVar2;
            } catch (RemoteException e7) {
                e = e7;
                int i5 = G6.L.f4523b;
                H6.l.g("Failed to get native ad from app install ad mapper", e);
                return zzdqbVar;
            }
        } catch (RemoteException e10) {
            e = e10;
            zzdqbVar = null;
        }
    }

    public static zzdqb zzai(zzbvu zzbvuVar) {
        try {
            return zzak(zzam(zzbvuVar.zzt(), null), zzbvuVar.zzv(), (View) zzal(zzbvuVar.zzu()), zzbvuVar.zze(), zzbvuVar.zzf(), zzbvuVar.zzg(), zzbvuVar.zzr(), zzbvuVar.zzi(), (View) zzal(zzbvuVar.zzw()), zzbvuVar.zzx(), zzbvuVar.zzk(), zzbvuVar.zzl(), zzbvuVar.zzj(), zzbvuVar.zzh(), null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } catch (RemoteException e7) {
            int i5 = G6.L.f4523b;
            H6.l.g("Failed to get native ad assets from app install ad mapper", e7);
            return null;
        }
    }

    public static zzdqb zzaj(zzbvv zzbvvVar) {
        try {
            return zzak(zzam(zzbvvVar.zzs(), null), zzbvvVar.zzt(), (View) zzal(zzbvvVar.zzr()), zzbvvVar.zze(), zzbvvVar.zzf(), zzbvvVar.zzg(), zzbvvVar.zzp(), zzbvvVar.zzi(), (View) zzal(zzbvvVar.zzu()), zzbvvVar.zzv(), null, null, -1.0d, zzbvvVar.zzh(), zzbvvVar.zzj(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } catch (RemoteException e7) {
            int i5 = G6.L.f4523b;
            H6.l.g("Failed to get native ad assets from content ad mapper", e7);
            return null;
        }
    }

    private static zzdqb zzak(L0 l02, zzbme zzbmeVar, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, InterfaceC3876a interfaceC3876a, String str4, String str5, double d3, zzbml zzbmlVar, String str6, float f10) {
        zzdqb zzdqbVar = new zzdqb();
        zzdqbVar.zza = 6;
        zzdqbVar.zzb = l02;
        zzdqbVar.zzc = zzbmeVar;
        zzdqbVar.zzd = view;
        zzdqbVar.zzs("headline", str);
        zzdqbVar.zze = list;
        zzdqbVar.zzs("body", str2);
        zzdqbVar.zzh = bundle;
        zzdqbVar.zzs("call_to_action", str3);
        zzdqbVar.zzo = view2;
        zzdqbVar.zzq = interfaceC3876a;
        zzdqbVar.zzs("store", str4);
        zzdqbVar.zzs(InAppPurchaseMetaData.KEY_PRICE, str5);
        zzdqbVar.zzr = d3;
        zzdqbVar.zzs = zzbmlVar;
        zzdqbVar.zzs("advertiser", str6);
        zzdqbVar.zzu(f10);
        return zzdqbVar;
    }

    private static Object zzal(InterfaceC3876a interfaceC3876a) {
        if (interfaceC3876a == null) {
            return null;
        }
        return BinderC3877b.S(interfaceC3876a);
    }

    private static zzdqa zzam(L0 l02, zzbvy zzbvyVar) {
        if (l02 == null) {
            return null;
        }
        return new zzdqa(l02, zzbvyVar);
    }

    public final synchronized View zzA() {
        return this.zzd;
    }

    public final synchronized String zzB() {
        return zzw("headline");
    }

    public final synchronized List zzC() {
        return this.zze;
    }

    public final zzbml zzD() {
        List list = this.zze;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Object obj = this.zze.get(0);
        if (obj instanceof IBinder) {
            return zzbmk.zzh((IBinder) obj);
        }
        return null;
    }

    public final synchronized List zzE() {
        return this.zzf;
    }

    public final synchronized BinderC0363b1 zzF() {
        return this.zzg;
    }

    public final synchronized String zzG() {
        return zzw("body");
    }

    public final synchronized Bundle zzH() {
        try {
            if (this.zzh == null) {
                this.zzh = new Bundle();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.zzh;
    }

    public final synchronized String zzI() {
        return zzw("call_to_action");
    }

    public final synchronized View zzJ() {
        return this.zzo;
    }

    public final synchronized View zzK() {
        return this.zzp;
    }

    public final synchronized InterfaceC3876a zzL() {
        return this.zzq;
    }

    public final synchronized String zzM() {
        return zzw("store");
    }

    public final synchronized String zzN() {
        return zzw(InAppPurchaseMetaData.KEY_PRICE);
    }

    public final synchronized double zzO() {
        return this.zzr;
    }

    public final synchronized zzbml zzP() {
        return this.zzs;
    }

    public final synchronized String zzQ() {
        return zzw("advertiser");
    }

    public final synchronized zzbml zzR() {
        return this.zzt;
    }

    public final synchronized String zzS() {
        return this.zzu;
    }

    public final synchronized zzclb zzT() {
        return this.zzi;
    }

    public final synchronized zzclb zzU() {
        return this.zzj;
    }

    public final synchronized boolean zzV() {
        return this.zzj != null;
    }

    public final synchronized zzclb zzW() {
        return this.zzk;
    }

    public final synchronized p8.p zzX() {
        return this.zzm;
    }

    public final synchronized zzcgd zzY() {
        return this.zzn;
    }

    public final synchronized zzelv zzZ() {
        return this.zzl;
    }

    public final synchronized void zza(int i5) {
        this.zza = i5;
    }

    public final synchronized C4429v zzaa() {
        return this.zzv;
    }

    public final synchronized float zzab() {
        return this.zzx;
    }

    public final synchronized String zzac() {
        return this.zzy;
    }

    public final synchronized C4429v zzad() {
        return this.zzw;
    }

    public final synchronized void zzae() {
        try {
            zzclb zzclbVar = this.zzi;
            if (zzclbVar != null) {
                zzclbVar.destroy();
                this.zzi = null;
            }
            zzclb zzclbVar2 = this.zzj;
            if (zzclbVar2 != null) {
                zzclbVar2.destroy();
                this.zzj = null;
            }
            zzclb zzclbVar3 = this.zzk;
            if (zzclbVar3 != null) {
                zzclbVar3.destroy();
                this.zzk = null;
            }
            p8.p pVar = this.zzm;
            if (pVar != null) {
                pVar.cancel(false);
                this.zzm = null;
            }
            zzcgd zzcgdVar = this.zzn;
            if (zzcgdVar != null) {
                zzcgdVar.cancel(false);
                this.zzn = null;
            }
            this.zzl = null;
            this.zzv.clear();
            this.zzw.clear();
            this.zzb = null;
            this.zzc = null;
            this.zzd = null;
            this.zze = null;
            this.zzh = null;
            this.zzo = null;
            this.zzp = null;
            this.zzq = null;
            this.zzs = null;
            this.zzt = null;
            this.zzu = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzb(L0 l02) {
        this.zzb = l02;
    }

    public final synchronized void zzc(zzbme zzbmeVar) {
        this.zzc = zzbmeVar;
    }

    public final synchronized void zzd(List list) {
        this.zze = list;
    }

    public final synchronized void zze(List list) {
        this.zzf = list;
    }

    public final synchronized void zzf(BinderC0363b1 binderC0363b1) {
        this.zzg = binderC0363b1;
    }

    public final synchronized void zzg(View view) {
        this.zzo = view;
    }

    public final synchronized void zzh(View view) {
        this.zzp = view;
    }

    public final synchronized void zzi(double d3) {
        this.zzr = d3;
    }

    public final synchronized void zzj(zzbml zzbmlVar) {
        this.zzs = zzbmlVar;
    }

    public final synchronized void zzk(zzbml zzbmlVar) {
        this.zzt = zzbmlVar;
    }

    public final synchronized void zzl(String str) {
        this.zzu = str;
    }

    public final synchronized void zzm(zzclb zzclbVar) {
        this.zzi = zzclbVar;
    }

    public final synchronized void zzn(zzclb zzclbVar) {
        this.zzj = zzclbVar;
    }

    public final synchronized void zzo(zzclb zzclbVar) {
        this.zzk = zzclbVar;
    }

    public final synchronized void zzp(p8.p pVar) {
        this.zzm = pVar;
    }

    public final synchronized void zzq(zzelv zzelvVar) {
        this.zzl = zzelvVar;
    }

    public final synchronized void zzr(zzcgd zzcgdVar) {
        this.zzn = zzcgdVar;
    }

    public final synchronized void zzs(String str, String str2) {
        if (str2 == null) {
            this.zzw.remove(str);
        } else {
            this.zzw.put(str, str2);
        }
    }

    public final synchronized void zzt(String str, zzblw zzblwVar) {
        if (zzblwVar == null) {
            this.zzv.remove(str);
        } else {
            this.zzv.put(str, zzblwVar);
        }
    }

    public final synchronized void zzu(float f10) {
        this.zzx = f10;
    }

    public final synchronized void zzv(String str) {
        this.zzy = str;
    }

    public final synchronized String zzw(String str) {
        return (String) this.zzw.get(str);
    }

    public final synchronized int zzx() {
        return this.zza;
    }

    public final synchronized L0 zzy() {
        return this.zzb;
    }

    public final synchronized zzbme zzz() {
        return this.zzc;
    }
}
