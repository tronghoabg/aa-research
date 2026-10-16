package com.google.android.gms.internal.ads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzc' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes3.dex */
public final class zzihq {
    public static final zzihq zza;
    public static final zzihq zzb;
    public static final zzihq zzc;
    public static final zzihq zzd;
    public static final zzihq zze;
    public static final zzihq zzf;
    public static final zzihq zzg;
    public static final zzihq zzh;
    public static final zzihq zzi;
    public static final zzihq zzj;
    public static final zzihq zzk;
    public static final zzihq zzl;
    public static final zzihq zzm;
    public static final zzihq zzn;
    public static final zzihq zzo;
    public static final zzihq zzp;
    public static final zzihq zzq;
    public static final zzihq zzr;
    private static final /* synthetic */ zzihq[] zzu;
    private final zzihr zzs;
    private final int zzt;

    static {
        zzihq zzihqVar = new zzihq("DOUBLE", 0, zzihr.DOUBLE, 1);
        zza = zzihqVar;
        zzihq zzihqVar2 = new zzihq("FLOAT", 1, zzihr.FLOAT, 5);
        zzb = zzihqVar2;
        zzihr zzihrVar = zzihr.LONG;
        zzihq zzihqVar3 = new zzihq("INT64", 2, zzihrVar, 0);
        zzc = zzihqVar3;
        zzihq zzihqVar4 = new zzihq("UINT64", 3, zzihrVar, 0);
        zzd = zzihqVar4;
        zzihr zzihrVar2 = zzihr.INT;
        zzihq zzihqVar5 = new zzihq("INT32", 4, zzihrVar2, 0);
        zze = zzihqVar5;
        zzihq zzihqVar6 = new zzihq("FIXED64", 5, zzihrVar, 1);
        zzf = zzihqVar6;
        zzihq zzihqVar7 = new zzihq("FIXED32", 6, zzihrVar2, 5);
        zzg = zzihqVar7;
        zzihq zzihqVar8 = new zzihq("BOOL", 7, zzihr.BOOLEAN, 0);
        zzh = zzihqVar8;
        zzihq zzihqVar9 = new zzihq("STRING", 8, zzihr.STRING, 2);
        zzi = zzihqVar9;
        zzihr zzihrVar3 = zzihr.MESSAGE;
        zzihq zzihqVar10 = new zzihq("GROUP", 9, zzihrVar3, 3);
        zzj = zzihqVar10;
        zzihq zzihqVar11 = new zzihq("MESSAGE", 10, zzihrVar3, 2);
        zzk = zzihqVar11;
        zzihq zzihqVar12 = new zzihq("BYTES", 11, zzihr.BYTE_STRING, 2);
        zzl = zzihqVar12;
        zzihq zzihqVar13 = new zzihq("UINT32", 12, zzihrVar2, 0);
        zzm = zzihqVar13;
        zzihq zzihqVar14 = new zzihq("ENUM", 13, zzihr.ENUM, 0);
        zzn = zzihqVar14;
        zzihq zzihqVar15 = new zzihq("SFIXED32", 14, zzihrVar2, 5);
        zzo = zzihqVar15;
        zzihq zzihqVar16 = new zzihq("SFIXED64", 15, zzihrVar, 1);
        zzp = zzihqVar16;
        zzihq zzihqVar17 = new zzihq("SINT32", 16, zzihrVar2, 0);
        zzq = zzihqVar17;
        zzihq zzihqVar18 = new zzihq("SINT64", 17, zzihrVar, 0);
        zzr = zzihqVar18;
        zzu = new zzihq[]{zzihqVar, zzihqVar2, zzihqVar3, zzihqVar4, zzihqVar5, zzihqVar6, zzihqVar7, zzihqVar8, zzihqVar9, zzihqVar10, zzihqVar11, zzihqVar12, zzihqVar13, zzihqVar14, zzihqVar15, zzihqVar16, zzihqVar17, zzihqVar18};
    }

    private zzihq(String str, int i5, zzihr zzihrVar, int i10) {
        this.zzs = zzihrVar;
        this.zzt = i10;
    }

    public static zzihq[] values() {
        return (zzihq[]) zzu.clone();
    }

    public final zzihr zza() {
        return this.zzs;
    }

    public final int zzb() {
        return this.zzt;
    }
}
