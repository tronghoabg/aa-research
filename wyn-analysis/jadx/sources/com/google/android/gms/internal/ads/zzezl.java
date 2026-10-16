package com.google.android.gms.internal.ads;

import D6.C0395s;
import G6.U;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzezl implements zzfcs {
    private final Context zza;
    private final zzhcp zzb;

    public zzezl(Context context, zzhcp zzhcpVar) {
        this.zza = context;
        this.zzb = zzhcpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final p8.p zza() {
        return this.zzb.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzezk
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 18;
    }

    public final zzezj zzc() {
        Bundle bundle;
        C6.n nVar = C6.n.f1857D;
        U u10 = nVar.f1863c;
        zzbio zzbioVar = zzbix.zzhf;
        C0395s c0395s = C0395s.f2489e;
        String string = !((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue() ? "" : this.zza.getSharedPreferences("mobileads_consent", 0).getString("consent_string", "");
        String string2 = ((Boolean) c0395s.f2492c.zzd(zzbix.zzhh)).booleanValue() ? this.zza.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", "") : "";
        U u11 = nVar.f1863c;
        Context context = this.zza;
        if (((Boolean) c0395s.f2492c.zzd(zzbix.zzhg)).booleanValue()) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            bundle = new Bundle();
            if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
                bundle.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
            }
            String[] strArr = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
            for (int i5 = 0; i5 < 4; i5++) {
                String str = strArr[i5];
                if (defaultSharedPreferences.contains(str)) {
                    bundle.putString(str, defaultSharedPreferences.getString(str, null));
                }
            }
        } else {
            bundle = null;
        }
        return new zzezj(string, string2, bundle, null);
    }
}
