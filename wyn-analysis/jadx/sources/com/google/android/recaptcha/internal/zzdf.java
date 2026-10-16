package com.google.android.recaptcha.internal;

import android.content.Context;
import java.util.MissingResourceException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class zzdf {

    @Nullable
    private static zzoa zza;

    @NotNull
    private final String zzb;

    @NotNull
    private final String zzc;

    @NotNull
    private final String zzd;

    @Nullable
    private final String zze;

    @NotNull
    private final zzdg zzf;

    @NotNull
    private final Context zzg;

    @Nullable
    private final Integer zzh;

    @NotNull
    private final String zzi = zznr.zzc(zznr.zzb(System.currentTimeMillis()));
    private final long zzj = System.currentTimeMillis();

    @NotNull
    private final int zzk;

    public zzdf(@NotNull int i5, @NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable String str4, @Nullable String str5, @NotNull zzdg zzdgVar, @NotNull zzbw zzbwVar, @NotNull Context context, @Nullable Integer num) {
        this.zzk = i5;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = str4;
        this.zzf = zzdgVar;
        this.zzg = context;
        this.zzh = num;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:59:0x00da
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Path cross not found for [B:34:0x00c2, B:38:0x00e1], limit reached: 71 */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0112 A[Catch: NameNotFoundException -> 0x0156, TryCatch #2 {NameNotFoundException -> 0x0156, blocks: (B:43:0x010e, B:45:0x0112, B:48:0x012f, B:49:0x0144), top: B:66:0x010e }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzc(int r12, com.google.android.recaptcha.internal.zzod r13) throws java.util.MissingResourceException {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdf.zzc(int, com.google.android.recaptcha.internal.zzod):void");
    }

    public final void zza() throws MissingResourceException {
        zzc(3, null);
    }

    public final void zzb(@NotNull zzbj zzbjVar) throws MissingResourceException {
        zzoc zzocVarZzg = zzod.zzg();
        zzocVarZzg.zzq(String.valueOf(zzbjVar.zzb().zza()));
        zzocVarZzg.zzd(zzbjVar.zza().zza());
        zzocVarZzg.zzp(zzbjVar.zzc().getErrorCode().getErrorCode());
        String strZzd = zzbjVar.zzd();
        if (strZzd != null) {
            zzocVarZzg.zze(strZzd);
        }
        zzc(4, (zzod) zzocVarZzg.zzj());
    }
}
