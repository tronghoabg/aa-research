package com.google.android.recaptcha.internal;

import Ef.E;
import android.content.Context;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r7.AbstractC3935e;

/* loaded from: classes4.dex */
public final class zzx extends zze {

    @NotNull
    private final zzdc zza;

    @NotNull
    private final List zzb;
    private zziv zzc;

    @NotNull
    private final Map zzd;

    public /* synthetic */ zzx(zzbl zzblVar, Context context, zzdc zzdcVar, zzbo zzboVar, List list, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        zzad zzadVar = new zzad(zzdcVar.zza());
        zzp zzpVar = new zzp(zzdcVar.zza(), zzblVar);
        zzm zzmVar = new zzm(zzdcVar.zza(), context.getContentResolver());
        zzn zznVar = new zzn(zzdcVar.zza());
        zzdc zzdcVarZza = zzdcVar.zza();
        E eZzc = zzboVar.zzc();
        List listD = AbstractC3935e.D(zzadVar, zzpVar, zzmVar, zznVar, new zzag(zzdcVarZza, context, eZzc, new zzap(context, eZzc, zzdcVarZza, IntegrityManagerFactory.createStandard(context), 28800000L), zzbz.zza(context)));
        this.zza = zzdcVar;
        this.zzb = listD;
        this.zzd = new LinkedHashMap();
    }

    public static final /* synthetic */ String zzo(zzx zzxVar, zzri zzriVar) {
        zziv zzivVar = zzxVar.zzc;
        if (zzivVar == null) {
            zzivVar = null;
        }
        byte[] bArrZzd = zzriVar.zzd();
        return zzca.zza(zzhz.zzh().zzi(bArrZzd, 0, bArrZzd.length), zzivVar);
    }

    public static final /* synthetic */ String zzp(zzx zzxVar, zzrm zzrmVar) {
        zziv zzivVar = zzxVar.zzc;
        if (zzivVar == null) {
            zzivVar = null;
        }
        byte[] bArrZzd = zzrmVar.zzd();
        return zzca.zza(zzhz.zzh().zzi(bArrZzd, 0, bArrZzd.length), zzivVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzpw zzt(String str) {
        zzqm zzqmVar = (zzqm) this.zzd.remove(str);
        zzpv zzpvVarZzf = zzpw.zzf();
        zzpvVarZzf.zzd(str);
        if (zzqmVar != null) {
            byte[] bArrZzd = ((zzqn) zzqmVar.zzj()).zzd();
            String strZzi = zzhz.zzh().zzi(bArrZzd, 0, bArrZzd.length);
            zzpt zzptVarZzf = zzpu.zzf();
            zzptVarZzf.zzd(strZzi);
            zzpvVarZzf.zze(zzptVarZzf);
        }
        return (zzpw) zzpvVarZzf.zzj();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzu(java.lang.String r5, com.google.android.recaptcha.internal.zzaa r6, jf.InterfaceC3103c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzq
            if (r0 == 0) goto L13
            r0 = r7
            com.google.android.recaptcha.internal.zzq r0 = (com.google.android.recaptcha.internal.zzq) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzq r0 = new com.google.android.recaptcha.internal.zzq
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.zza
            kf.a r1 = kf.a.f39711a
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            Fe.e.U(r7)
            return r7
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            Fe.e.U(r7)
            com.google.android.recaptcha.internal.zzr r7 = new com.google.android.recaptcha.internal.zzr
            r2 = 0
            r7.<init>(r6, r5, r4, r2)
            r0.zzc = r3
            java.lang.Object r5 = Ef.H.l(r7, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzx.zzu(java.lang.String, com.google.android.recaptcha.internal.zzaa, jf.c):java.lang.Object");
    }

    @Override // com.google.android.recaptcha.internal.zze
    @NotNull
    public final zzdf zza(@NotNull String str) {
        zzdc zzdcVar = this.zza;
        zzdcVar.zzc(str);
        return zzdcVar.zzf(35);
    }

    @Override // com.google.android.recaptcha.internal.zze
    @NotNull
    public final zzdf zzb() {
        zzdc zzdcVar = this.zza;
        zzdcVar.zzc(zzdcVar.zzd());
        return zzdcVar.zzf(34);
    }

    @Override // com.google.android.recaptcha.internal.zze
    @Nullable
    public final Object zzd(@NotNull String str, @NotNull InterfaceC3103c interfaceC3103c) {
        return zzt(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.internal.zze
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzf(@org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.NotNull jf.InterfaceC3103c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.recaptcha.internal.zzs
            if (r0 == 0) goto L13
            r0 = r6
            com.google.android.recaptcha.internal.zzs r0 = (com.google.android.recaptcha.internal.zzs) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzs r0 = new com.google.android.recaptcha.internal.zzs
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.zza
            kf.a r1 = kf.a.f39711a
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            Fe.e.U(r6)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            Fe.e.U(r6)
            com.google.android.recaptcha.internal.zzu r6 = new com.google.android.recaptcha.internal.zzu
            r2 = 0
            r6.<init>(r5, r4, r2)
            r0.zzc = r3
            java.lang.Object r6 = Ef.H.l(r6, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            ef.n r6 = (ef.C2530n) r6
            java.lang.Object r5 = r6.f34674a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzx.zzf(java.lang.String, jf.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.internal.zze
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzh(@org.jetbrains.annotations.NotNull com.google.android.recaptcha.internal.zzpq r5, @org.jetbrains.annotations.NotNull jf.InterfaceC3103c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.recaptcha.internal.zzv
            if (r0 == 0) goto L13
            r0 = r6
            com.google.android.recaptcha.internal.zzv r0 = (com.google.android.recaptcha.internal.zzv) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzv r0 = new com.google.android.recaptcha.internal.zzv
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.zza
            kf.a r1 = kf.a.f39711a
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            Fe.e.U(r6)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            Fe.e.U(r6)
            com.google.android.recaptcha.internal.zzw r6 = new com.google.android.recaptcha.internal.zzw
            r2 = 0
            r6.<init>(r5, r4, r2)
            r0.zzc = r3
            java.lang.Object r6 = Ef.H.l(r6, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            ef.n r6 = (ef.C2530n) r6
            java.lang.Object r5 = r6.f34674a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzx.zzh(com.google.android.recaptcha.internal.zzpq, jf.c):java.lang.Object");
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final void zzk(@NotNull zzqf zzqfVar) {
        Iterator it = this.zzb.iterator();
        while (it.hasNext()) {
            ((zzaa) it.next()).zze(zzqfVar);
        }
    }

    @NotNull
    public final Map zzr() {
        return this.zzd;
    }
}
