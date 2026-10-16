package com.bytedance.adsdk.oa;

/* loaded from: classes.dex */
public enum oib {
    AUTOMATIC,
    HARDWARE,
    SOFTWARE;

    /* renamed from: com.bytedance.adsdk.oa.oib$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] uef;

        static {
            int[] iArr = new int[oib.values().length];
            uef = iArr;
            try {
                iArr[oib.HARDWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                uef[oib.SOFTWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                uef[oib.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public boolean uef(int i5, boolean z2, int i10) {
        int i11 = AnonymousClass1.uef[ordinal()];
        if (i11 == 1) {
            return false;
        }
        if (i11 != 2) {
            return (z2 && i5 < 28) || i10 > 4 || i5 <= 25;
        }
        return true;
    }
}
