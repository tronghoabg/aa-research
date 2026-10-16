package com.google.android.gms.internal.ads;

import com.unity3d.services.UnityAdsConstants;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzb' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes3.dex */
public final class zzifj {
    public static final zzifj zza;
    public static final zzifj zzb;
    public static final zzifj zzc;
    public static final zzifj zzd;
    public static final zzifj zze;
    public static final zzifj zzf;
    public static final zzifj zzg;
    public static final zzifj zzh;
    public static final zzifj zzi;
    public static final zzifj zzj;
    private static final /* synthetic */ zzifj[] zzl;
    private final Class zzk;

    static {
        zzifj zzifjVar = new zzifj("VOID", 0, Void.class, Void.class, null);
        zza = zzifjVar;
        Class cls = Integer.TYPE;
        zzifj zzifjVar2 = new zzifj("INT", 1, cls, Integer.class, 0);
        zzb = zzifjVar2;
        zzifj zzifjVar3 = new zzifj("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = zzifjVar3;
        zzifj zzifjVar4 = new zzifj("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        zzd = zzifjVar4;
        zzifj zzifjVar5 = new zzifj("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = zzifjVar5;
        zzifj zzifjVar6 = new zzifj("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = zzifjVar6;
        zzifj zzifjVar7 = new zzifj("STRING", 6, String.class, String.class, "");
        zzg = zzifjVar7;
        zzifj zzifjVar8 = new zzifj("BYTE_STRING", 7, zzidl.class, zzidl.class, zzidl.zza);
        zzh = zzifjVar8;
        zzifj zzifjVar9 = new zzifj("ENUM", 8, cls, Integer.class, null);
        zzi = zzifjVar9;
        zzifj zzifjVar10 = new zzifj("MESSAGE", 9, Object.class, Object.class, null);
        zzj = zzifjVar10;
        zzl = new zzifj[]{zzifjVar, zzifjVar2, zzifjVar3, zzifjVar4, zzifjVar5, zzifjVar6, zzifjVar7, zzifjVar8, zzifjVar9, zzifjVar10};
    }

    private zzifj(String str, int i5, Class cls, Class cls2, Object obj) {
        this.zzk = cls2;
    }

    public static zzifj[] values() {
        return (zzifj[]) zzl.clone();
    }

    public final Class zza() {
        return this.zzk;
    }
}
