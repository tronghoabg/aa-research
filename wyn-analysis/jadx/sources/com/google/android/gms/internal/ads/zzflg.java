package com.google.android.gms.internal.ads;

import D6.A1;
import D6.C0369e0;
import D6.C0395s;
import D6.InterfaceC0362b0;
import D6.r1;
import D6.v1;
import D6.x1;
import G6.U;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public final class zzflg {
    public final r1 zza;
    public final zzbsi zzb;
    public final zzetk zzc;
    public final v1 zzd;
    public final Bundle zze;
    public final x1 zzf;
    public final String zzg;
    public final ArrayList zzh;
    public final ArrayList zzi;
    public final zzbma zzj;
    public final A1 zzk;
    public final int zzl;
    public final A6.a zzm;
    public final A6.g zzn;
    public final InterfaceC0362b0 zzo;
    public final zzfku zzp;
    public final boolean zzq;
    public final boolean zzr;
    public final boolean zzs;
    public final Bundle zzt;
    public final AtomicLong zzu;
    public final boolean zzv;
    public final JSONArray zzw;
    public final C0369e0 zzx;

    public zzflg(zzflf zzflfVar, byte[] bArr) {
        this.zzf = zzflfVar.zzF();
        this.zzg = zzflfVar.zzG();
        this.zzx = zzflfVar.zzac();
        this.zze = zzflfVar.zzE().f2503C;
        v1 v1VarZzE = zzflfVar.zzE();
        v1 v1VarZzE2 = zzflfVar.zzE();
        v1 v1VarZzE3 = zzflfVar.zzE();
        v1 v1VarZzE4 = zzflfVar.zzE();
        v1 v1VarZzE5 = zzflfVar.zzE();
        v1 v1VarZzE6 = zzflfVar.zzE();
        v1 v1VarZzE7 = zzflfVar.zzE();
        int i5 = zzflfVar.zzE().f2504a;
        long j8 = v1VarZzE7.f2505b;
        Bundle bundle = v1VarZzE6.f2506c;
        int i10 = v1VarZzE5.f2507d;
        List list = v1VarZzE4.f2508e;
        boolean z2 = v1VarZzE3.f2509f;
        int i11 = v1VarZzE2.f2510g;
        boolean z10 = true;
        if (!v1VarZzE.f2511h && !zzflfVar.zzI()) {
            z10 = false;
        }
        v1 v1Var = new v1(i5, j8, bundle, i10, list, z2, i11, z10, zzflfVar.zzE().f2512i, zzflfVar.zzE().f2513j, zzflfVar.zzE().k, zzflfVar.zzE().f2514l, zzflfVar.zzE().f2515m, zzflfVar.zzE().f2516n, zzflfVar.zzE().f2517o, zzflfVar.zzE().f2518p, zzflfVar.zzE().f2519q, zzflfVar.zzE().f2520r, zzflfVar.zzE().f2521s, zzflfVar.zzE().f2522t, zzflfVar.zzE().f2523u, zzflfVar.zzE().f2524v, U.u(zzflfVar.zzE().f2525w), zzflfVar.zzE().f2526x, zzflfVar.zzE().f2527y, zzflfVar.zzE().f2528z, zzflfVar.zzE().f2501A, zzflfVar.zzE().f2502B);
        this.zzd = v1Var;
        this.zza = zzflfVar.zzH() != null ? zzflfVar.zzH() : zzflfVar.zzL() != null ? zzflfVar.zzL().zzf : null;
        this.zzh = zzflfVar.zzJ();
        this.zzi = zzflfVar.zzK();
        this.zzj = zzflfVar.zzJ() == null ? null : zzflfVar.zzL() == null ? new zzbma(new A6.e(new A6.d())) : zzflfVar.zzL();
        this.zzk = zzflfVar.zzM();
        this.zzl = zzflfVar.zzQ();
        this.zzm = zzflfVar.zzN();
        this.zzn = zzflfVar.zzO();
        this.zzo = zzflfVar.zzP();
        this.zzb = zzflfVar.zzR();
        this.zzp = new zzfku(zzflfVar.zzS(), null);
        this.zzq = zzflfVar.zzT();
        this.zzr = zzflfVar.zzU();
        this.zzc = zzflfVar.zzV();
        this.zzs = zzflfVar.zzW();
        this.zzt = zzflfVar.zzX();
        long j10 = v1Var.f2501A;
        if (j10 != 0) {
            this.zzu = new AtomicLong(j10);
        } else {
            this.zzu = zzflfVar.zzY();
        }
        this.zzv = zzflfVar.zzZ();
        this.zzw = zzflfVar.zzaa();
    }

    public final boolean zza() {
        return this.zzg.matches((String) C0395s.f2489e.f2492c.zzd(zzbix.zzem));
    }
}
