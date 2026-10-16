package A7;

import com.google.android.gms.internal.measurement.zzfr;
import com.google.android.gms.internal.measurement.zzs;

/* renamed from: A7.j0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC0261j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f914a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f915b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f916c;

    static {
        int[] iArr = new int[zzfr.zza.zzd.values().length];
        f916c = iArr;
        try {
            iArr[zzfr.zza.zzd.DENIED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f916c[zzfr.zza.zzd.GRANTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[zzfr.zza.zze.values().length];
        f915b = iArr2;
        try {
            iArr2[zzfr.zza.zze.AD_STORAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f915b[zzfr.zza.zze.ANALYTICS_STORAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f915b[zzfr.zza.zze.AD_USER_DATA.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f915b[zzfr.zza.zze.AD_PERSONALIZATION.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        int[] iArr3 = new int[zzs.values().length];
        f914a = iArr3;
        try {
            iArr3[zzs.DEBUG.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f914a[zzs.ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f914a[zzs.WARN.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f914a[zzs.VERBOSE.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
    }
}
