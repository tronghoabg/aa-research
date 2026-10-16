package com.google.android.gms.internal.ads;

import D6.x1;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import b1.C1494c;
import com.google.android.gms.common.internal.AbstractC1732v;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class zzeve implements zzfcq {
    public final x1 zza;
    public final String zzb;
    public final boolean zzc;
    public final String zzd;
    public final float zze;
    public final int zzf;
    public final int zzg;
    public final String zzh;
    public final int zzi;
    public final boolean zzj;
    public final C1494c zzk;
    public final zzevb zzl;

    public zzeve(x1 x1Var, String str, boolean z2, String str2, float f10, int i5, int i10, String str3, int i11, boolean z10, C1494c c1494c, zzevb zzevbVar) {
        AbstractC1732v.j(x1Var, "the adSize must not be null");
        this.zza = x1Var;
        this.zzb = str;
        this.zzc = z2;
        this.zzd = str2;
        this.zze = f10;
        this.zzf = i5;
        this.zzg = i10;
        this.zzh = str3;
        this.zzi = i11;
        this.zzj = z10;
        this.zzk = c1494c;
        this.zzl = zzevbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        x1 x1Var = this.zza;
        Bundle bundle = (Bundle) obj;
        int i5 = x1Var.f2534e;
        zzflv.zzb(bundle, "smart_w", "full", i5 == -1);
        int i10 = x1Var.f2531b;
        zzflv.zzb(bundle, "smart_h", "auto", i10 == -2);
        zzflv.zzd(bundle, "ene", true, x1Var.f2539j);
        zzflv.zzb(bundle, "rafmt", "102", x1Var.f2541m);
        zzflv.zzb(bundle, "rafmt", "108", x1Var.f2544p);
        zzflv.zzb(bundle, "rafmt", "103", x1Var.f2542n);
        boolean z2 = x1Var.f2543o;
        zzflv.zzb(bundle, "rafmt", "105", z2);
        zzflv.zzd(bundle, "inline_adaptive_slot", true, this.zzj);
        zzflv.zzd(bundle, "interscroller_slot", true, z2);
        zzflv.zze(bundle, "format", this.zzb);
        zzflv.zzb(bundle, "fluid", "height", this.zzc);
        zzflv.zzb(bundle, "sz", this.zzd, !TextUtils.isEmpty(r5));
        bundle.putFloat("u_sd", this.zze);
        bundle.putInt("sw", this.zzf);
        bundle.putInt("sh", this.zzg);
        String str = this.zzh;
        zzflv.zzb(bundle, "sc", str, true ^ TextUtils.isEmpty(str));
        int i11 = this.zzi;
        if (i11 != -1) {
            bundle.putInt("u_mso", i11);
        }
        C1494c c1494c = this.zzk;
        if (c1494c != null) {
            bundle.putInt("sam_t", c1494c.f19122b);
            bundle.putInt("sam_b", c1494c.f19124d);
            bundle.putInt("sam_l", c1494c.f19121a);
            bundle.putInt("sam_r", c1494c.f19123c);
        }
        zzevb zzevbVar = this.zzl;
        if (zzevbVar != null) {
            bundle.putInt("rc_tl", zzevbVar.zza);
            bundle.putInt("rc_tr", zzevbVar.zzb);
            bundle.putInt("rc_bl", zzevbVar.zzc);
            bundle.putInt("rc_br", zzevbVar.zzd);
        }
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        x1[] x1VarArr = x1Var.f2536g;
        if (x1VarArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", i10);
            bundle2.putInt("width", i5);
            bundle2.putBoolean("is_fluid_height", x1Var.f2538i);
            arrayList.add(bundle2);
        } else {
            for (x1 x1Var2 : x1VarArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", x1Var2.f2538i);
                bundle3.putInt("height", x1Var2.f2531b);
                bundle3.putInt("width", x1Var2.f2534e);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }
}
