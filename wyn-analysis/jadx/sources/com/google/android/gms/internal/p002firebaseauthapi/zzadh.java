package com.google.android.gms.internal.p002firebaseauthapi;

import J8.B;
import J8.F;
import J8.s;
import J8.u;
import J8.y;
import android.content.Context;
import com.google.android.gms.common.internal.AbstractC1732v;
import h7.C2793a;
import java.util.concurrent.ScheduledExecutorService;
import s8.g;

/* loaded from: classes.dex */
public final class zzadh {
    private static final C2793a zza = new C2793a("FirebaseAuth", "FirebaseAuthFallback:");
    private final zzzk zzb;
    private final zzaew zzc;

    public zzadh(g gVar, ScheduledExecutorService scheduledExecutorService) {
        AbstractC1732v.i(gVar);
        gVar.a();
        Context context = gVar.f45328a;
        AbstractC1732v.i(context);
        this.zzb = new zzzk(new zzadv(gVar, zzads.zza()));
        this.zzc = new zzaew(context, scheduledExecutorService);
    }

    public final void zza(String str, String str2, zzadf zzadfVar) {
        AbstractC1732v.f(str);
        AbstractC1732v.i(zzadfVar);
        this.zzb.zza(str, str2, new zzade(zzadfVar, zza));
    }

    public final void zzb(String str, String str2, zzadf zzadfVar) {
        AbstractC1732v.f(str);
        AbstractC1732v.f(str2);
        AbstractC1732v.i(zzadfVar);
        this.zzb.zzb(str, str2, new zzade(zzadfVar, zza));
    }

    public final void zzc(String str, String str2, zzadf zzadfVar) {
        AbstractC1732v.f(str);
        AbstractC1732v.f(str2);
        AbstractC1732v.i(zzadfVar);
        this.zzb.zzc(str, str2, new zzade(zzadfVar, zza));
    }

    public final void zzd(String str, String str2, zzadf zzadfVar) {
        AbstractC1732v.f(str);
        AbstractC1732v.i(zzadfVar);
        this.zzb.zzd(str, str2, new zzade(zzadfVar, zza));
    }

    public final void zze(String str, String str2, zzadf zzadfVar) {
        AbstractC1732v.f(str);
        this.zzb.zze(str, str2, new zzade(zzadfVar, zza));
    }

    public final void zzf(String str, String str2, zzadf zzadfVar) {
        AbstractC1732v.f(str);
        AbstractC1732v.f(str2);
        AbstractC1732v.i(zzadfVar);
        this.zzb.zzf(str, str2, new zzade(zzadfVar, zza));
    }

    public final void zze(String str, zzadf zzadfVar) {
        AbstractC1732v.f(str);
        AbstractC1732v.i(zzadfVar);
        this.zzb.zzf(str, new zzade(zzadfVar, zza));
    }

    public final void zza(zzagw zzagwVar, zzadf zzadfVar) {
        AbstractC1732v.i(zzagwVar);
        AbstractC1732v.f(zzagwVar.zzb());
        AbstractC1732v.i(zzadfVar);
        this.zzb.zza(zzagwVar, new zzade(zzadfVar, zza));
    }

    public final void zzd(String str, zzadf zzadfVar) {
        AbstractC1732v.i(zzadfVar);
        this.zzb.zze(str, new zzade(zzadfVar, zza));
    }

    public final void zzb(String str, zzadf zzadfVar) {
        AbstractC1732v.f(str);
        AbstractC1732v.i(zzadfVar);
        this.zzb.zzb(str, new zzade(zzadfVar, zza));
    }

    public final void zzc(String str, zzadf zzadfVar) {
        AbstractC1732v.f(str);
        AbstractC1732v.i(zzadfVar);
        this.zzb.zzc(str, new zzade(zzadfVar, zza));
    }

    public final void zza(String str, String str2, String str3, String str4, zzadf zzadfVar) {
        AbstractC1732v.f(str);
        AbstractC1732v.f(str2);
        AbstractC1732v.i(zzadfVar);
        this.zzb.zza(str, str2, str3, str4, new zzade(zzadfVar, zza));
    }

    public final void zzb(zzagg zzaggVar, zzadf zzadfVar) {
        AbstractC1732v.i(zzaggVar);
        AbstractC1732v.f(zzaggVar.zzc());
        AbstractC1732v.i(zzadfVar);
        this.zzb.zzb(zzaggVar, new zzade(zzadfVar, zza));
    }

    public final void zzc(zzagg zzaggVar, zzadf zzadfVar) {
        AbstractC1732v.i(zzaggVar);
        this.zzb.zzc(zzaggVar, new zzade(zzadfVar, zza));
    }

    public final void zza(String str, zzadf zzadfVar) {
        AbstractC1732v.f(str);
        AbstractC1732v.i(zzadfVar);
        this.zzb.zza(str, new zzade(zzadfVar, zza));
    }

    public final void zzb(String str, String str2, String str3, String str4, zzadf zzadfVar) {
        AbstractC1732v.f(str);
        AbstractC1732v.f(str2);
        AbstractC1732v.i(zzadfVar);
        this.zzb.zzb(str, str2, str3, str4, new zzade(zzadfVar, zza));
    }

    public final void zza(s sVar, String str, String str2, String str3, zzadf zzadfVar) {
        zzafp zzafpVarZza;
        AbstractC1732v.i(sVar);
        AbstractC1732v.g(str, "cachedTokenState should not be empty.");
        AbstractC1732v.i(zzadfVar);
        if (sVar instanceof y) {
            u uVar = ((y) sVar).f5832a;
            String str4 = uVar.f5817a;
            AbstractC1732v.i(str4);
            String str5 = uVar.f5818b;
            AbstractC1732v.i(str5);
            zzafpVarZza = zzaft.zza(str, str4, str5, str2, str3);
        } else if (sVar instanceof B) {
            B b5 = (B) sVar;
            K8.B b10 = b5.f5732b;
            AbstractC1732v.i(b10);
            AbstractC1732v.f(str2);
            String str6 = b10.f6573f;
            AbstractC1732v.f(str6);
            String str7 = b5.f5731a;
            AbstractC1732v.f(str7);
            zzafpVarZza = zzafv.zza(str, str2, str6, str7, str3);
        } else {
            throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
        }
        this.zzb.zza(zzafpVarZza, str, new zzade(zzadfVar, zza));
    }

    public final void zza(String str, s sVar, String str2, zzadf zzadfVar) {
        AbstractC1732v.f(str);
        AbstractC1732v.i(sVar);
        AbstractC1732v.i(zzadfVar);
        if (sVar instanceof y) {
            zzzk zzzkVar = this.zzb;
            u uVar = ((y) sVar).f5832a;
            String str3 = uVar.f5817a;
            AbstractC1732v.i(str3);
            String str4 = uVar.f5818b;
            AbstractC1732v.i(str4);
            zzzkVar.zza(zzafw.zza(str, str3, str4, str2), new zzade(zzadfVar, zza));
            return;
        }
        if (sVar instanceof B) {
            B b5 = (B) sVar;
            zzzk zzzkVar2 = this.zzb;
            String str5 = b5.f5731a;
            AbstractC1732v.f(str5);
            String str6 = b5.f5733c;
            AbstractC1732v.f(str6);
            zzzkVar2.zza(zzafy.zza(str, str5, str2, str6), new zzade(zzadfVar, zza));
            return;
        }
        throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
    }

    public final void zza(zzagi zzagiVar, zzadf zzadfVar) {
        AbstractC1732v.i(zzagiVar);
        this.zzb.zza(zzagiVar, new zzade(zzadfVar, zza));
    }

    public final void zza(zzagj zzagjVar, zzadf zzadfVar) {
        AbstractC1732v.i(zzagjVar);
        this.zzb.zza(zzagjVar, new zzade(zzadfVar, zza));
    }

    public final void zza(String str, String str2, String str3, String str4, String str5, zzadf zzadfVar) {
        AbstractC1732v.f(str);
        AbstractC1732v.f(str2);
        AbstractC1732v.f(str3);
        AbstractC1732v.i(zzadfVar);
        this.zzb.zza(str, str2, str3, str4, str5, new zzade(zzadfVar, zza));
    }

    public final void zza(String str, zzahr zzahrVar, zzadf zzadfVar) {
        AbstractC1732v.f(str);
        AbstractC1732v.i(zzahrVar);
        AbstractC1732v.i(zzadfVar);
        this.zzb.zza(str, zzahrVar, new zzade(zzadfVar, zza));
    }

    public final void zza(zzagp zzagpVar, zzadf zzadfVar) {
        AbstractC1732v.i(zzadfVar);
        AbstractC1732v.i(zzagpVar);
        String strZzb = zzagpVar.zzb();
        AbstractC1732v.f(strZzb);
        this.zzb.zza(strZzb, zzagpVar.zza(), new zzade(zzadfVar, zza));
    }

    public final void zza(zzagy zzagyVar, zzadf zzadfVar) {
        AbstractC1732v.i(zzagyVar);
        this.zzb.zza(zzagyVar, new zzade(zzadfVar, zza));
    }

    public final void zza(zzagg zzaggVar, zzadf zzadfVar) {
        AbstractC1732v.i(zzaggVar);
        AbstractC1732v.f(zzaggVar.zzd());
        AbstractC1732v.i(zzadfVar);
        this.zzb.zza(zzaggVar, new zzade(zzadfVar, zza));
    }

    public final void zza(zzagz zzagzVar, zzadf zzadfVar) {
        AbstractC1732v.i(zzadfVar);
        AbstractC1732v.i(zzagzVar);
        String strZzd = zzagzVar.zzd();
        zzade zzadeVar = new zzade(zzadfVar, zza);
        if (this.zzc.zzd(strZzd)) {
            if (zzagzVar.zze()) {
                this.zzc.zzc(strZzd);
            } else {
                this.zzc.zzb(zzadeVar, strZzd);
                return;
            }
        }
        long jZzb = zzagzVar.zzb();
        boolean zZzf = zzagzVar.zzf();
        if (zza(jZzb, zZzf)) {
            zzagzVar.zza(new zzafg(this.zzc.zzb()));
        }
        this.zzc.zza(strZzd, zzadeVar, jZzb, zZzf);
        this.zzb.zza(zzagzVar, this.zzc.zza(zzadeVar, strZzd));
    }

    public final void zza(zzahd zzahdVar, zzadf zzadfVar) {
        AbstractC1732v.i(zzahdVar);
        AbstractC1732v.i(zzadfVar);
        this.zzb.zzd(zzahdVar.zza(), new zzade(zzadfVar, zza));
    }

    public final void zza(zzahr zzahrVar, zzadf zzadfVar) {
        AbstractC1732v.i(zzahrVar);
        AbstractC1732v.i(zzadfVar);
        this.zzb.zza(zzahrVar, new zzade(zzadfVar, zza));
    }

    public final void zza(zzahw zzahwVar, zzadf zzadfVar) {
        AbstractC1732v.i(zzahwVar);
        AbstractC1732v.i(zzadfVar);
        this.zzb.zza(zzahwVar, new zzade(zzadfVar, zza));
    }

    public final void zza(zzafn zzafnVar, zzadf zzadfVar) {
        AbstractC1732v.i(zzadfVar);
        AbstractC1732v.i(zzafnVar.zzb());
        this.zzb.zza(zzafnVar.zzb(), zzafnVar.zzc(), new zzade(zzadfVar, zza));
    }

    public final void zza(zzzg zzzgVar, zzadf zzadfVar) {
        AbstractC1732v.i(zzadfVar);
        AbstractC1732v.i(zzzgVar);
        u uVarZza = zzzgVar.zza();
        AbstractC1732v.i(uVarZza);
        this.zzb.zza(zzaeq.zza(uVarZza), new zzade(zzadfVar, zza));
    }

    public final void zza(String str, String str2, String str3, long j8, boolean z2, boolean z10, String str4, String str5, String str6, boolean z11, zzadf zzadfVar) {
        AbstractC1732v.g(str, "idToken should not be empty.");
        AbstractC1732v.i(zzadfVar);
        zzade zzadeVar = new zzade(zzadfVar, zza);
        if (this.zzc.zzd(str2)) {
            if (z2) {
                this.zzc.zzc(str2);
            } else {
                this.zzc.zzb(zzadeVar, str2);
                return;
            }
        }
        zzahm zzahmVarZza = zzahm.zza(str, str2, str3, str4, str5, str6, null);
        if (zza(j8, z11)) {
            zzahmVarZza.zza(new zzafg(this.zzc.zzb()));
        }
        this.zzc.zza(str2, zzadeVar, j8, z11);
        this.zzb.zza(zzahmVarZza, this.zzc.zza(zzadeVar, str2));
    }

    public final void zza(zzzj zzzjVar, zzadf zzadfVar) {
        AbstractC1732v.i(zzzjVar);
        AbstractC1732v.i(zzadfVar);
        String str = zzzjVar.zzb().f5836d;
        zzade zzadeVar = new zzade(zzadfVar, zza);
        if (this.zzc.zzd(str)) {
            if (zzzjVar.zzh()) {
                this.zzc.zzc(str);
            } else {
                this.zzc.zzb(zzadeVar, str);
                return;
            }
        }
        long jZza = zzzjVar.zza();
        boolean zZzi = zzzjVar.zzi();
        zzahk zzahkVarZza = zzahk.zza(zzzjVar.zze(), zzzjVar.zzb().f5833a, zzzjVar.zzb().f5836d, zzzjVar.zzd(), zzzjVar.zzg(), zzzjVar.zzf(), zzzjVar.zzc());
        if (zza(jZza, zZzi)) {
            zzahkVarZza.zza(new zzafg(this.zzc.zzb()));
        }
        this.zzc.zza(str, zzadeVar, jZza, zZzi);
        this.zzb.zza(zzahkVarZza, this.zzc.zza(zzadeVar, str));
    }

    public final void zza(zzaho zzahoVar, zzadf zzadfVar) {
        AbstractC1732v.i(zzadfVar);
        this.zzb.zza(zzahoVar, new zzade(zzadfVar, zza));
    }

    public final void zza(String str, String str2, String str3, zzadf zzadfVar) {
        AbstractC1732v.g(str, "cachedTokenState should not be empty.");
        AbstractC1732v.g(str2, "uid should not be empty.");
        AbstractC1732v.i(zzadfVar);
        this.zzb.zza(str, str2, str3, new zzade(zzadfVar, zza));
    }

    public final void zza(String str, F f10, zzadf zzadfVar) {
        AbstractC1732v.f(str);
        AbstractC1732v.i(f10);
        AbstractC1732v.i(zzadfVar);
        this.zzb.zza(str, f10, new zzade(zzadfVar, zza));
    }

    private static boolean zza(long j8, boolean z2) {
        if (j8 > 0 && z2) {
            return true;
        }
        zza.f("App hash will not be appended to the request.", new Object[0]);
        return false;
    }
}
