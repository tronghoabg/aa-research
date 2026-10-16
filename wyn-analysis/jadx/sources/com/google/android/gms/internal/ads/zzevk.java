package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.os.Bundle;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzevk implements zzfcs {
    private final zzhcp zza;
    private final zzdxk zzb;
    private final zzece zzc;
    private final zzevm zzd;

    public zzevk(zzhcp zzhcpVar, zzdxk zzdxkVar, zzece zzeceVar, zzevm zzevmVar) {
        this.zza = zzhcpVar;
        this.zzb = zzdxkVar;
        this.zzc = zzeceVar;
        this.zzd = zzevmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final p8.p zza() {
        zzbio zzbioVar = zzbix.zzno;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
            zzevm zzevmVar = this.zzd;
            if (zzevmVar.zzd() != null) {
                zzevl zzevlVarZzd = zzevmVar.zzd();
                zzevlVarZzd.getClass();
                return zzhcf.zza(zzevlVarZzd);
            }
        }
        if (zzgui.zzc((String) c0395s.f2492c.zzd(zzbix.zzch)) || (!((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue() && (this.zzd.zzb() || !this.zzc.zze()))) {
            return zzhcf.zza(new zzevl(new Bundle()));
        }
        this.zzd.zza(true);
        return this.zza.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzevj
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 1;
    }

    public final zzevl zzc() {
        List<String> listAsList = Arrays.asList(((String) C0395s.f2489e.f2492c.zzd(zzbix.zzch)).split(";"));
        Bundle bundle = new Bundle();
        for (String str : listAsList) {
            try {
                zzfme zzfmeVarZza = this.zzb.zza(str, new JSONObject());
                zzfmeVarZza.zzn();
                boolean zZze = this.zzc.zze();
                Bundle bundle2 = new Bundle();
                if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzno)).booleanValue() || zZze) {
                    try {
                        zzbxx zzbxxVarZzC = zzfmeVarZza.zzC();
                        if (zzbxxVarZzC != null) {
                            bundle2.putString("sdk_version", zzbxxVarZzC.toString());
                        }
                    } catch (zzfln unused) {
                    }
                }
                try {
                    zzbxx zzbxxVarZzB = zzfmeVarZza.zzB();
                    if (zzbxxVarZzB != null) {
                        bundle2.putString("adapter_version", zzbxxVarZzB.toString());
                    }
                } catch (zzfln unused2) {
                }
                bundle.putBundle(str, bundle2);
            } catch (zzfln unused3) {
            }
        }
        zzevl zzevlVar = new zzevl(bundle);
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzno)).booleanValue()) {
            this.zzd.zzc(zzevlVar);
        }
        return zzevlVar;
    }
}
