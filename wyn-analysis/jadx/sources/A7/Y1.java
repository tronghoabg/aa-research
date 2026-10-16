package A7;

import com.google.android.gms.internal.measurement.zzfo;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class Y1 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f760a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f761b;

    static {
        int[] iArr = new int[zzfo.zzd.zzb.values().length];
        f761b = iArr;
        try {
            iArr[zzfo.zzd.zzb.LESS_THAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f761b[zzfo.zzd.zzb.GREATER_THAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f761b[zzfo.zzd.zzb.EQUAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f761b[zzfo.zzd.zzb.BETWEEN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[zzfo.zzf.zzb.values().length];
        f760a = iArr2;
        try {
            iArr2[zzfo.zzf.zzb.REGEXP.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f760a[zzfo.zzf.zzb.BEGINS_WITH.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f760a[zzfo.zzf.zzb.ENDS_WITH.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f760a[zzfo.zzf.zzb.PARTIAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f760a[zzfo.zzf.zzb.EXACT.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f760a[zzfo.zzf.zzb.IN_LIST.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
    }
}
