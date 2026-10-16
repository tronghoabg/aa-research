package q9;

import java.math.RoundingMode;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class d {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f44179a;

    static {
        int[] iArr = new int[RoundingMode.values().length];
        f44179a = iArr;
        try {
            iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f44179a[RoundingMode.DOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f44179a[RoundingMode.UP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f44179a[RoundingMode.CEILING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f44179a[RoundingMode.FLOOR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f44179a[RoundingMode.HALF_EVEN.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f44179a[RoundingMode.HALF_DOWN.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f44179a[RoundingMode.HALF_UP.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
