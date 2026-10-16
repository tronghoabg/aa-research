package com.google.android.gms.internal.ads;

import D6.A1;
import D6.C0369e0;
import D6.InterfaceC0362b0;
import D6.r1;
import D6.v1;
import D6.x1;
import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC1732v;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public final class zzflf {
    private v1 zza;
    private x1 zzb;
    private String zzc;
    private r1 zzd;
    private boolean zze;
    private ArrayList zzf;
    private ArrayList zzg;
    private zzbma zzh;
    private A1 zzi;
    private A6.a zzj;
    private A6.g zzk;
    private InterfaceC0362b0 zzl;
    private zzbsi zzn;
    private zzetk zzr;
    private Bundle zzt;
    private JSONArray zzw;
    private C0369e0 zzx;
    private int zzm = 1;
    private final zzfkt zzo = new zzfkt();
    private boolean zzp = false;
    private boolean zzq = false;
    private boolean zzs = false;
    private final AtomicLong zzu = new AtomicLong();
    private boolean zzv = false;

    public final zzflf zzA(zzflg zzflgVar) {
        this.zzo.zza(zzflgVar.zzp.zza);
        this.zza = zzflgVar.zzd;
        this.zzb = zzflgVar.zzf;
        this.zzx = zzflgVar.zzx;
        this.zzc = zzflgVar.zzg;
        this.zzd = zzflgVar.zza;
        this.zzf = zzflgVar.zzh;
        this.zzg = zzflgVar.zzi;
        this.zzh = zzflgVar.zzj;
        this.zzi = zzflgVar.zzk;
        zzs(zzflgVar.zzm);
        zzr(zzflgVar.zzn);
        this.zzp = zzflgVar.zzq;
        this.zzq = zzflgVar.zzr;
        this.zzr = zzflgVar.zzc;
        this.zzs = zzflgVar.zzs;
        this.zzt = zzflgVar.zzt;
        this.zzu.set(zzflgVar.zzu.get());
        this.zzv = zzflgVar.zzv;
        this.zzw = zzflgVar.zzw;
        return this;
    }

    public final zzflg zzB() {
        AbstractC1732v.j(this.zzc, "ad unit must not be null");
        AbstractC1732v.j(this.zzb, "ad size must not be null");
        AbstractC1732v.j(this.zza, "ad request must not be null");
        return new zzflg(this, null);
    }

    public final boolean zzC() {
        return this.zzp;
    }

    public final boolean zzD() {
        return this.zzq;
    }

    public final /* synthetic */ v1 zzE() {
        return this.zza;
    }

    public final /* synthetic */ x1 zzF() {
        return this.zzb;
    }

    public final /* synthetic */ String zzG() {
        return this.zzc;
    }

    public final /* synthetic */ r1 zzH() {
        return this.zzd;
    }

    public final /* synthetic */ boolean zzI() {
        return this.zze;
    }

    public final /* synthetic */ ArrayList zzJ() {
        return this.zzf;
    }

    public final /* synthetic */ ArrayList zzK() {
        return this.zzg;
    }

    public final /* synthetic */ zzbma zzL() {
        return this.zzh;
    }

    public final /* synthetic */ A1 zzM() {
        return this.zzi;
    }

    public final /* synthetic */ A6.a zzN() {
        return this.zzj;
    }

    public final /* synthetic */ A6.g zzO() {
        return this.zzk;
    }

    public final /* synthetic */ InterfaceC0362b0 zzP() {
        return this.zzl;
    }

    public final /* synthetic */ int zzQ() {
        return this.zzm;
    }

    public final /* synthetic */ zzbsi zzR() {
        return this.zzn;
    }

    public final /* synthetic */ zzfkt zzS() {
        return this.zzo;
    }

    public final /* synthetic */ boolean zzT() {
        return this.zzp;
    }

    public final /* synthetic */ boolean zzU() {
        return this.zzq;
    }

    public final /* synthetic */ zzetk zzV() {
        return this.zzr;
    }

    public final /* synthetic */ boolean zzW() {
        return this.zzs;
    }

    public final /* synthetic */ Bundle zzX() {
        return this.zzt;
    }

    public final /* synthetic */ AtomicLong zzY() {
        return this.zzu;
    }

    public final /* synthetic */ boolean zzZ() {
        return this.zzv;
    }

    public final zzflf zza(v1 v1Var) {
        this.zza = v1Var;
        return this;
    }

    public final /* synthetic */ JSONArray zzaa() {
        return this.zzw;
    }

    public final zzflf zzab(C0369e0 c0369e0) {
        this.zzx = c0369e0;
        return this;
    }

    public final /* synthetic */ C0369e0 zzac() {
        return this.zzx;
    }

    public final v1 zzb() {
        return this.zza;
    }

    public final zzflf zzc(x1 x1Var) {
        this.zzb = x1Var;
        return this;
    }

    public final zzflf zzd(boolean z2) {
        this.zzp = z2;
        return this;
    }

    public final zzflf zze(boolean z2) {
        this.zzq = z2;
        return this;
    }

    public final x1 zzf() {
        return this.zzb;
    }

    public final zzflf zzg(String str) {
        this.zzc = str;
        return this;
    }

    public final String zzh() {
        return this.zzc;
    }

    public final zzflf zzi(r1 r1Var) {
        this.zzd = r1Var;
        return this;
    }

    public final zzfkt zzj() {
        return this.zzo;
    }

    public final zzflf zzk(boolean z2) {
        this.zze = z2;
        return this;
    }

    public final zzflf zzl(int i5) {
        this.zzm = i5;
        return this;
    }

    public final zzflf zzm(ArrayList arrayList) {
        this.zzf = arrayList;
        return this;
    }

    public final zzflf zzn(ArrayList arrayList) {
        this.zzg = arrayList;
        return this;
    }

    public final zzflf zzo(zzbma zzbmaVar) {
        this.zzh = zzbmaVar;
        return this;
    }

    public final zzflf zzp(A1 a12) {
        this.zzi = a12;
        return this;
    }

    public final zzflf zzq(zzbsi zzbsiVar) {
        this.zzn = zzbsiVar;
        this.zzd = new r1(false, true, false);
        return this;
    }

    public final zzflf zzr(A6.g gVar) {
        this.zzk = gVar;
        if (gVar != null) {
            this.zze = gVar.f404a;
            this.zzl = gVar.f405b;
        }
        return this;
    }

    public final zzflf zzs(A6.a aVar) {
        this.zzj = aVar;
        if (aVar != null) {
            this.zze = aVar.f385a;
        }
        return this;
    }

    public final zzflf zzt(zzetk zzetkVar) {
        this.zzr = zzetkVar;
        return this;
    }

    public final zzflf zzu(boolean z2) {
        this.zzs = true;
        return this;
    }

    public final zzflf zzv(Bundle bundle) {
        this.zzt = bundle;
        return this;
    }

    public final long zzw() {
        return this.zzu.get();
    }

    public final zzflf zzx(long j8) {
        this.zzu.set(j8);
        return this;
    }

    public final zzflf zzy(boolean z2) {
        this.zzv = true;
        return this;
    }

    public final zzflf zzz(JSONArray jSONArray) {
        this.zzw = jSONArray;
        return this;
    }
}
