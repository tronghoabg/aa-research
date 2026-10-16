package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.RoundedCorner;
import android.view.WindowInsets;
import b1.C1494c;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes3.dex */
public final class zzevd implements zzfcs {
    private final zzfcs zza;
    private final zzflg zzb;
    private final Context zzc;
    private final zzcfk zzd;

    public zzevd(zzexg zzexgVar, zzflg zzflgVar, Context context, zzcfk zzcfkVar) {
        this.zza = zzexgVar;
        this.zzb = zzflgVar;
        this.zzc = context;
        this.zzd = zzcfkVar;
    }

    private static final int zzd(WindowInsets windowInsets, int i5) {
        RoundedCorner roundedCorner = windowInsets.getRoundedCorner(i5);
        if (roundedCorner != null) {
            return roundedCorner.getRadius();
        }
        return 0;
    }

    private static final int zze(int i5, float f10) {
        if (f10 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return 0;
        }
        return (int) Math.ceil(i5 / f10);
    }

    private static final C1494c zzf(C1494c c1494c, float f10) {
        return f10 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? C1494c.f19120e : C1494c.b((int) Math.ceil(c1494c.f19121a / f10), (int) Math.ceil(c1494c.f19122b / f10), (int) Math.ceil(c1494c.f19123c / f10), (int) Math.ceil(c1494c.f19124d / f10));
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final p8.p zza() {
        return zzhcf.zzk(this.zza.zza(), new zzgti() { // from class: com.google.android.gms.internal.ads.zzevc
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzc((zzfdb) obj);
            }
        }, zzcfy.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 7;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v1 com.google.android.gms.internal.ads.zzeve, still in use, count: 4, list:
          (r3v1 com.google.android.gms.internal.ads.zzeve) from 0x02d2: MOVE (r22v0 com.google.android.gms.internal.ads.zzeve) = (r3v1 com.google.android.gms.internal.ads.zzeve) (LINE:723)
          (r3v1 com.google.android.gms.internal.ads.zzeve) from 0x01ab: MOVE (r22v3 com.google.android.gms.internal.ads.zzeve) = (r3v1 com.google.android.gms.internal.ads.zzeve) (LINE:428)
          (r3v1 com.google.android.gms.internal.ads.zzeve) from 0x01ca: MOVE (r22v7 com.google.android.gms.internal.ads.zzeve) = (r3v1 com.google.android.gms.internal.ads.zzeve) (LINE:459)
          (r3v1 com.google.android.gms.internal.ads.zzeve) from 0x0186: MOVE (r22v9 com.google.android.gms.internal.ads.zzeve) = (r3v1 com.google.android.gms.internal.ads.zzeve) (LINE:391)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public final com.google.android.gms.internal.ads.zzeve zzc(com.google.android.gms.internal.ads.zzfdb r28) {
        /*
            Method dump skipped, instructions count: 964
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzevd.zzc(com.google.android.gms.internal.ads.zzfdb):com.google.android.gms.internal.ads.zzeve");
    }
}
