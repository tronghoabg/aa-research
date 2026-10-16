package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;

/* loaded from: classes3.dex */
public final class zzcdv implements SharedPreferences.OnSharedPreferenceChangeListener {
    private final Context zza;
    private final SharedPreferences zzb;
    private final G6.N zzc;
    private String zzd = "-1";
    private int zze = -1;

    public zzcdv(Context context, G6.N n10) {
        this.zzb = PreferenceManager.getDefaultSharedPreferences(context);
        this.zzc = n10;
        this.zza = context;
    }

    private final void zzb(String str, int i5) {
        Context context;
        zzbio zzbioVar = zzbix.zzbr;
        C0395s c0395s = C0395s.f2489e;
        boolean z2 = true;
        boolean z10 = (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue() && this.zzb.getInt("IABTCF_gdprApplies", -1) == 0) ? false : true;
        if (!((Boolean) c0395s.f2492c.zzd(zzbix.zzbo)).booleanValue() ? !((str.isEmpty() || str.charAt(0) != '1') && z10) : !(i5 == 0 || ((str.isEmpty() || (str.charAt(0) != '1' && !str.equals("-1"))) && z10))) {
            z2 = false;
        }
        ((G6.O) this.zzc).C(z2);
        if (((Boolean) c0395s.f2492c.zzd(zzbix.zzhn)).booleanValue() && z2 && (context = this.zza) != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
    }

    private final void zzc() {
        ((G6.O) this.zzc).C(true);
        Fe.c.J(this.zza);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a7  */
    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSharedPreferenceChanged(android.content.SharedPreferences r10, java.lang.String r11) {
        /*
            r9 = this;
            java.lang.String r0 = "IABTCF_PurposeConsents"
            com.google.android.gms.internal.ads.zzbio r1 = com.google.android.gms.internal.ads.zzbix.zzbq     // Catch: java.lang.Throwable -> L35
            D6.s r2 = D6.C0395s.f2489e     // Catch: java.lang.Throwable -> L35
            com.google.android.gms.internal.ads.zzbiv r3 = r2.f2492c     // Catch: java.lang.Throwable -> L35
            java.lang.Object r1 = r3.zzd(r1)     // Catch: java.lang.Throwable -> L35
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L35
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L35
            com.google.android.gms.internal.ads.zzbiv r2 = r2.f2492c
            java.lang.String r3 = "-1"
            java.lang.String r4 = "gad_has_consent_for_cookies"
            r5 = -1
            if (r1 == 0) goto L7b
            boolean r0 = j$.util.Objects.equals(r11, r4)     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L3e
            int r10 = r10.getInt(r4, r5)     // Catch: java.lang.Throwable -> L35
            G6.N r11 = r9.zzc     // Catch: java.lang.Throwable -> L35
            r0 = r11
            G6.O r0 = (G6.O) r0     // Catch: java.lang.Throwable -> L35
            r0.l()     // Catch: java.lang.Throwable -> L35
            int r0 = r0.f4542m     // Catch: java.lang.Throwable -> L35
            if (r10 == r0) goto L38
            r9.zzc()     // Catch: java.lang.Throwable -> L35
            goto L38
        L35:
            r10 = move-exception
            goto Ldb
        L38:
            G6.O r11 = (G6.O) r11     // Catch: java.lang.Throwable -> L35
            r11.b(r10)     // Catch: java.lang.Throwable -> L35
            return
        L3e:
            java.lang.String r0 = "IABTCF_TCString"
            boolean r0 = j$.util.Objects.equals(r11, r0)     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto Lda
            java.lang.String r11 = r10.getString(r11, r3)     // Catch: java.lang.Throwable -> L35
            G6.N r0 = r9.zzc     // Catch: java.lang.Throwable -> L35
            r1 = r0
            G6.O r1 = (G6.O) r1     // Catch: java.lang.Throwable -> L35
            r1.l()     // Catch: java.lang.Throwable -> L35
            java.lang.String r1 = r1.f4541l     // Catch: java.lang.Throwable -> L35
            G6.O r0 = (G6.O) r0     // Catch: java.lang.Throwable -> L35
            r0.a(r11)     // Catch: java.lang.Throwable -> L35
            com.google.android.gms.internal.ads.zzbio r0 = com.google.android.gms.internal.ads.zzbix.zzbr     // Catch: java.lang.Throwable -> L35
            java.lang.Object r0 = r2.zzd(r0)     // Catch: java.lang.Throwable -> L35
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L35
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L71
            java.lang.String r0 = "IABTCF_gdprApplies"
            int r10 = r10.getInt(r0, r5)     // Catch: java.lang.Throwable -> L35
            if (r10 != 0) goto L71
            goto Lda
        L71:
            boolean r10 = j$.util.Objects.equals(r11, r1)     // Catch: java.lang.Throwable -> L35
            if (r10 != 0) goto Lda
            r9.zzc()     // Catch: java.lang.Throwable -> L35
            return
        L7b:
            java.lang.String r1 = r10.getString(r0, r3)     // Catch: java.lang.Throwable -> L35
            int r10 = r10.getInt(r4, r5)     // Catch: java.lang.Throwable -> L35
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch: java.lang.Throwable -> L35
            int r6 = r11.hashCode()     // Catch: java.lang.Throwable -> L35
            r7 = -2004976699(0xffffffff887e7bc5, float:-7.6580835E-34)
            r8 = 1
            if (r6 == r7) goto L9f
            r0 = -527267622(0xffffffffe09288da, float:-8.447143E19)
            if (r6 == r0) goto L97
            goto La7
        L97:
            boolean r11 = r11.equals(r4)
            if (r11 == 0) goto La7
            r11 = r8
            goto La8
        L9f:
            boolean r11 = r11.equals(r0)
            if (r11 == 0) goto La7
            r11 = 0
            goto La8
        La7:
            r11 = r5
        La8:
            if (r11 == 0) goto Lc7
            if (r11 == r8) goto Lad
            goto Lda
        Lad:
            com.google.android.gms.internal.ads.zzbio r11 = com.google.android.gms.internal.ads.zzbix.zzbo     // Catch: java.lang.Throwable -> L35
            java.lang.Object r11 = r2.zzd(r11)     // Catch: java.lang.Throwable -> L35
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L35
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r11 == 0) goto Lda
            if (r10 == r5) goto Lda
            int r11 = r9.zze     // Catch: java.lang.Throwable -> L35
            if (r11 == r10) goto Lda
            r9.zze = r10     // Catch: java.lang.Throwable -> L35
            r9.zzb(r1, r10)     // Catch: java.lang.Throwable -> L35
            return
        Lc7:
            boolean r11 = r1.equals(r3)     // Catch: java.lang.Throwable -> L35
            if (r11 != 0) goto Lda
            java.lang.String r11 = r9.zzd     // Catch: java.lang.Throwable -> L35
            boolean r11 = r11.equals(r1)     // Catch: java.lang.Throwable -> L35
            if (r11 != 0) goto Lda
            r9.zzd = r1     // Catch: java.lang.Throwable -> L35
            r9.zzb(r1, r10)     // Catch: java.lang.Throwable -> L35
        Lda:
            return
        Ldb:
            C6.n r11 = C6.n.f1857D
            com.google.android.gms.internal.ads.zzcfk r11 = r11.f1868h
            java.lang.String r0 = "AdMobPlusIdlessListener.onSharedPreferenceChanged"
            r11.zzh(r10, r0)
            java.lang.String r11 = "onSharedPreferenceChanged, errorMessage = "
            G6.L.l(r11, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcdv.onSharedPreferenceChanged(android.content.SharedPreferences, java.lang.String):void");
    }

    public final void zza() {
        SharedPreferences sharedPreferences = this.zzb;
        sharedPreferences.registerOnSharedPreferenceChangeListener(this);
        onSharedPreferenceChanged(sharedPreferences, "gad_has_consent_for_cookies");
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzbq)).booleanValue()) {
            onSharedPreferenceChanged(sharedPreferences, AndroidTcfDataSource.TCF_TCSTRING_KEY);
        } else {
            onSharedPreferenceChanged(sharedPreferences, "IABTCF_PurposeConsents");
        }
    }
}
