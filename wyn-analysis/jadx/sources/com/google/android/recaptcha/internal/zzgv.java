package com.google.android.recaptcha.internal;

import Ef.C0514u;
import Ef.InterfaceC0513t;
import Ef.L0;
import android.content.Context;
import android.webkit.WebView;
import ef.C2515C;
import ff.o;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.MissingResourceException;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class zzgv extends zze {
    public InterfaceC0513t zza;
    public zzdv zzb;

    @NotNull
    private final WebView zzc;

    @NotNull
    private final Context zzd;

    @NotNull
    private final zzbv zze;

    @NotNull
    private final zzdc zzf;

    @NotNull
    private final zzdq zzg;

    @NotNull
    private final Map zzh = zzgw.zza();

    @NotNull
    private final Map zzi = new LinkedHashMap();

    @NotNull
    private final zzgz zzj = zzgz.zzc();

    @NotNull
    private final zzgo zzk;

    @NotNull
    private final zzdc zzl;

    @Nullable
    private zzdf zzm;

    @NotNull
    private final zzbo zzn;

    public zzgv(@NotNull WebView webView, @NotNull Context context, @NotNull zzbv zzbvVar, @NotNull zzdc zzdcVar, @NotNull zzbo zzboVar, @NotNull zzdq zzdqVar) {
        this.zzc = webView;
        this.zzd = context;
        this.zze = zzbvVar;
        this.zzf = zzdcVar;
        this.zzn = zzboVar;
        this.zzg = zzdqVar;
        zzgo zzgoVar = new zzgo(this);
        this.zzk = zzgoVar;
        zzdc zzdcVarZza = zzdcVar.zza();
        zzdcVarZza.zzc(zzdcVar.zzd());
        this.zzl = zzdcVarZza;
        webView.getSettings().setJavaScriptEnabled(true);
        webView.addJavascriptInterface(zzgoVar, "RN");
        webView.setWebViewClient(new zzgp(this));
    }

    public static final /* synthetic */ void zzv(zzgv zzgvVar, String str) throws MissingResourceException {
        zzgvVar.zzm = zzgvVar.zzl.zzf(26);
        try {
            zzgvVar.zzc.loadDataWithBaseURL(zzgvVar.zze.zza(), str, "text/html", "utf-8", null);
        } catch (Exception unused) {
            zzbj zzbjVar = new zzbj(zzbh.zzb, zzbg.zzU, null);
            zzdf zzdfVar = zzgvVar.zzm;
            if (zzdfVar != null) {
                zzdfVar.zzb(zzbjVar);
            }
            zzgvVar.zzm = null;
            ((C0514u) zzgvVar.zzu()).Y(zzbjVar);
        }
    }

    @Override // com.google.android.recaptcha.internal.zze
    @NotNull
    public final zzdf zza(@NotNull String str) {
        zzdc zzdcVar = this.zzf;
        zzdcVar.zzc(str);
        return zzdcVar.zzf(33);
    }

    @Override // com.google.android.recaptcha.internal.zze
    @NotNull
    public final zzdf zzb() {
        zzdc zzdcVar = this.zzf;
        zzdcVar.zzc(zzdcVar.zzd());
        return zzdcVar.zzf(32);
    }

    @Override // com.google.android.recaptcha.internal.zze
    @Nullable
    public final Object zzd(@NotNull String str, @NotNull InterfaceC3103c interfaceC3103c) {
        zzpv zzpvVarZzf = zzpw.zzf();
        zzpvVarZzf.zzd(str);
        return zzpvVarZzf.zzj();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.internal.zze
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzf(@org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.NotNull jf.InterfaceC3103c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.google.android.recaptcha.internal.zzgs
            if (r0 == 0) goto L13
            r0 = r9
            com.google.android.recaptcha.internal.zzgs r0 = (com.google.android.recaptcha.internal.zzgs) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzgs r0 = new com.google.android.recaptcha.internal.zzgs
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.zza
            kf.a r1 = kf.a.f39711a
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.String r8 = r0.zze
            com.google.android.recaptcha.internal.zzgv r0 = r0.zzd
            Fe.e.U(r9)     // Catch: java.lang.Exception -> L2b
            goto L7b
        L2b:
            r9 = move-exception
            goto Lad
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            Fe.e.U(r9)
            Ef.u r9 = Ef.H.b()     // Catch: java.lang.Exception -> Lab
            java.util.Map r2 = r7.zzi     // Catch: java.lang.Exception -> Lab
            r2.put(r8, r9)     // Catch: java.lang.Exception -> Lab
            com.google.android.recaptcha.internal.zzqw r2 = com.google.android.recaptcha.internal.zzqx.zzf()     // Catch: java.lang.Exception -> Lab
            r2.zzd(r8)     // Catch: java.lang.Exception -> Lab
            com.google.android.recaptcha.internal.zzks r2 = r2.zzj()     // Catch: java.lang.Exception -> Lab
            com.google.android.recaptcha.internal.zzqx r2 = (com.google.android.recaptcha.internal.zzqx) r2     // Catch: java.lang.Exception -> Lab
            byte[] r2 = r2.zzd()     // Catch: java.lang.Exception -> Lab
            com.google.android.recaptcha.internal.zzhz r4 = com.google.android.recaptcha.internal.zzhz.zzh()     // Catch: java.lang.Exception -> Lab
            int r5 = r2.length     // Catch: java.lang.Exception -> Lab
            r6 = 0
            java.lang.String r2 = r4.zzi(r2, r6, r5)     // Catch: java.lang.Exception -> Lab
            com.google.android.recaptcha.internal.zzbo r4 = r7.zzn     // Catch: java.lang.Exception -> Lab
            Ef.E r4 = r4.zzb()     // Catch: java.lang.Exception -> Lab
            com.google.android.recaptcha.internal.zzgt r5 = new com.google.android.recaptcha.internal.zzgt     // Catch: java.lang.Exception -> Lab
            r6 = 0
            r5.<init>(r7, r2, r6)     // Catch: java.lang.Exception -> Lab
            r2 = 3
            Ef.H.D(r4, r6, r5, r2)     // Catch: java.lang.Exception -> Lab
            r0.zzd = r7     // Catch: java.lang.Exception -> Lab
            r0.zze = r8     // Catch: java.lang.Exception -> Lab
            r0.zzc = r3     // Catch: java.lang.Exception -> Lab
            java.lang.Object r9 = r9.p(r0)     // Catch: java.lang.Exception -> Lab
            if (r9 != r1) goto L7a
            return r1
        L7a:
            r0 = r7
        L7b:
            com.google.android.recaptcha.internal.zzpw r9 = (com.google.android.recaptcha.internal.zzpw) r9     // Catch: java.lang.Exception -> L2b
            com.google.android.recaptcha.internal.zzkm r1 = r9.zzq()     // Catch: java.lang.Exception -> L2b
            com.google.android.recaptcha.internal.zzpv r1 = (com.google.android.recaptcha.internal.zzpv) r1     // Catch: java.lang.Exception -> L2b
            com.google.android.recaptcha.internal.zzpz r2 = com.google.android.recaptcha.internal.zzqa.zzf()     // Catch: java.lang.Exception -> L2b
            java.lang.String r3 = r9.zzJ()     // Catch: java.lang.Exception -> L2b
            r2.zzd(r3)     // Catch: java.lang.Exception -> L2b
            r1.zzp(r2)     // Catch: java.lang.Exception -> L2b
            com.google.android.recaptcha.internal.zzpx r2 = com.google.android.recaptcha.internal.zzpy.zzf()     // Catch: java.lang.Exception -> L2b
            java.lang.String r3 = r9.zzj()     // Catch: java.lang.Exception -> L2b
            r2.zzd(r3)     // Catch: java.lang.Exception -> L2b
            java.lang.String r9 = r9.zzK()     // Catch: java.lang.Exception -> L2b
            r2.zze(r9)     // Catch: java.lang.Exception -> L2b
            r1.zzq(r2)     // Catch: java.lang.Exception -> L2b
            com.google.android.recaptcha.internal.zzks r8 = r1.zzj()     // Catch: java.lang.Exception -> L2b
            return r8
        Lab:
            r9 = move-exception
            r0 = r7
        Lad:
            java.lang.Class r1 = r9.getClass()
            com.google.android.recaptcha.internal.zzbj r2 = new com.google.android.recaptcha.internal.zzbj
            com.google.android.recaptcha.internal.zzbh r3 = com.google.android.recaptcha.internal.zzbh.zzb
            com.google.android.recaptcha.internal.zzbg r4 = com.google.android.recaptcha.internal.zzbg.zzW
            java.lang.String r1 = r1.getSimpleName()
            r2.<init>(r3, r4, r1)
            com.google.android.recaptcha.internal.zzbj r9 = com.google.android.recaptcha.internal.zzf.zza(r9, r2)
            java.util.Map r0 = r0.zzi
            java.lang.Object r8 = r0.remove(r8)
            Ef.t r8 = (Ef.InterfaceC0513t) r8
            if (r8 == 0) goto Ld1
            Ef.u r8 = (Ef.C0514u) r8
            r8.Y(r9)
        Ld1:
            ef.m r8 = Fe.e.z(r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzgv.zzf(java.lang.String, jf.c):java.lang.Object");
    }

    @Override // com.google.android.recaptcha.internal.zze
    @Nullable
    public final Object zzg(@NotNull zzbj zzbjVar, @NotNull InterfaceC3103c interfaceC3103c) throws MissingResourceException {
        if (AbstractC3340k.a(zzbjVar.zza(), zzbg.zzb)) {
            zzdf zzdfVar = this.zzm;
            if (zzdfVar != null) {
                zzdfVar.zzb(zzbjVar);
            }
            this.zzm = null;
        }
        return C2515C.f34653a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.internal.zze
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzh(@org.jetbrains.annotations.NotNull com.google.android.recaptcha.internal.zzpq r6, @org.jetbrains.annotations.NotNull jf.InterfaceC3103c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzgu
            if (r0 == 0) goto L13
            r0 = r7
            com.google.android.recaptcha.internal.zzgu r0 = (com.google.android.recaptcha.internal.zzgu) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzgu r0 = new com.google.android.recaptcha.internal.zzgu
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.zza
            kf.a r1 = kf.a.f39711a
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            Fe.e.U(r7)     // Catch: java.lang.Exception -> L27
            goto L8b
        L27:
            r6 = move-exception
            goto L8f
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            Fe.e.U(r7)
            com.google.android.recaptcha.internal.zzcb r7 = new com.google.android.recaptcha.internal.zzcb     // Catch: java.lang.Exception -> L27
            com.google.android.recaptcha.internal.zziv r2 = r6.zzf()     // Catch: java.lang.Exception -> L27
            r7.<init>(r2)     // Catch: java.lang.Exception -> L27
            com.google.android.recaptcha.internal.zzea r7 = r5.zzy(r6, r7)     // Catch: java.lang.Exception -> L27
            r5.zzb = r7     // Catch: java.lang.Exception -> L27
            Ef.u r7 = Ef.H.b()     // Catch: java.lang.Exception -> L27
            r5.zza = r7     // Catch: java.lang.Exception -> L27
            Ef.t r7 = r5.zzu()     // Catch: java.lang.Exception -> L27
            int r7 = r7.hashCode()     // Catch: java.lang.Exception -> L27
            java.lang.Integer r2 = new java.lang.Integer     // Catch: java.lang.Exception -> L27
            r2.<init>(r7)     // Catch: java.lang.Exception -> L27
            com.google.android.recaptcha.internal.zzgz r7 = r5.zzj     // Catch: java.lang.Exception -> L27
            r7.zzd()     // Catch: java.lang.Exception -> L27
            com.google.android.recaptcha.internal.zzgz r7 = r5.zzj     // Catch: java.lang.Exception -> L27
            r7.zze()     // Catch: java.lang.Exception -> L27
            com.google.android.recaptcha.internal.zzbo r7 = r5.zzn     // Catch: java.lang.Exception -> L27
            Ef.E r7 = r7.zza()     // Catch: java.lang.Exception -> L27
            com.google.android.recaptcha.internal.zzgr r2 = new com.google.android.recaptcha.internal.zzgr     // Catch: java.lang.Exception -> L27
            r4 = 0
            r2.<init>(r5, r6, r4)     // Catch: java.lang.Exception -> L27
            r6 = 3
            Ef.H.D(r7, r4, r2, r6)     // Catch: java.lang.Exception -> L27
            Ef.t r6 = r5.zzu()     // Catch: java.lang.Exception -> L27
            int r6 = r6.hashCode()     // Catch: java.lang.Exception -> L27
            java.lang.Integer r7 = new java.lang.Integer     // Catch: java.lang.Exception -> L27
            r7.<init>(r6)     // Catch: java.lang.Exception -> L27
            Ef.t r6 = r5.zzu()     // Catch: java.lang.Exception -> L27
            r0.zzc = r3     // Catch: java.lang.Exception -> L27
            Ef.u r6 = (Ef.C0514u) r6     // Catch: java.lang.Exception -> L27
            java.lang.Object r6 = r6.p(r0)     // Catch: java.lang.Exception -> L27
            if (r6 == r1) goto L8e
        L8b:
            ef.C r6 = ef.C2515C.f34653a     // Catch: java.lang.Exception -> L27
            return r6
        L8e:
            return r1
        L8f:
            r6.getMessage()
            java.lang.Class r7 = r6.getClass()
            com.google.android.recaptcha.internal.zzbj r0 = new com.google.android.recaptcha.internal.zzbj
            com.google.android.recaptcha.internal.zzbh r1 = com.google.android.recaptcha.internal.zzbh.zzb
            com.google.android.recaptcha.internal.zzbg r2 = com.google.android.recaptcha.internal.zzbg.zzV
            java.lang.String r7 = r7.getSimpleName()
            r0.<init>(r1, r2, r7)
            com.google.android.recaptcha.internal.zzbj r6 = com.google.android.recaptcha.internal.zzf.zza(r6, r0)
            ef.m r6 = Fe.e.z(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzgv.zzh(com.google.android.recaptcha.internal.zzpq, jf.c):java.lang.Object");
    }

    @Override // com.google.android.recaptcha.internal.zze
    @Nullable
    public final Object zzi(@NotNull String str, long j8, @NotNull Exception exc, @NotNull InterfaceC3103c interfaceC3103c) {
        InterfaceC0513t interfaceC0513t = (InterfaceC0513t) this.zzi.remove(str);
        if (interfaceC0513t != null) {
            ((C0514u) interfaceC0513t).Y(exc);
        }
        return C2515C.f34653a;
    }

    @Override // com.google.android.recaptcha.internal.zze
    @Nullable
    public final Object zzj(@NotNull Exception exc, @NotNull InterfaceC3103c interfaceC3103c) {
        Long lZza = this.zzk.zza();
        if ((exc instanceof L0) && lZza == null) {
            return new zzbj(zzbh.zzc, zzbg.zzH, null);
        }
        return zzf.zza(exc, new zzbj(zzbh.zzb, zzbg.zzV, exc.getClass().getSimpleName()));
    }

    @NotNull
    public final WebView zzm() {
        return this.zzc;
    }

    @NotNull
    public final zzdq zzp() {
        return this.zzg;
    }

    @NotNull
    public final zzgo zzq() {
        return this.zzk;
    }

    @NotNull
    public final InterfaceC0513t zzu() {
        InterfaceC0513t interfaceC0513t = this.zza;
        if (interfaceC0513t != null) {
            return interfaceC0513t;
        }
        return null;
    }

    @NotNull
    public final zzea zzy(@NotNull zzpq zzpqVar, @NotNull zzcb zzcbVar) {
        zzed zzedVar = new zzed(this.zzc, this.zzn.zzb());
        zzgf zzgfVar = new zzgf();
        zzgfVar.zzb(o.T0(zzpqVar.zzN()));
        zzem zzemVar = new zzem(zzedVar, zzcbVar, new zzbu());
        zzgg zzggVar = new zzgg(zzgfVar, new zzgd());
        zzemVar.zze(3, this.zzd);
        zzemVar.zze(5, zzgm.class.getMethod("cs", new Object[0].getClass()));
        zzemVar.zze(6, new zzgh(this.zzd));
        zzemVar.zze(7, new zzgj());
        zzemVar.zze(8, new zzgn(this.zzd));
        zzemVar.zze(9, new zzgk(this.zzd));
        zzemVar.zze(10, new zzgi(this.zzd));
        return new zzea(this.zzn.zzd(), zzemVar, zzggVar, zzdu.zza());
    }
}
