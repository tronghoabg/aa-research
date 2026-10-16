package androidx.compose.material3.carousel;

import androidx.compose.material3.carousel.KeylineListScope;
import androidx.compose.ui.unit.Density;
import h.a.c;
import h.ab;
import h.g.a.l;
import h.k.n;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class KeylinesKt {
    private static final float calculateMediumChildSize(float f2, float f3, float f4) {
        float fMax = Math.max(1.5f * f4, f2);
        float f5 = 0.85f * f3;
        return fMax > f5 ? Math.min(Math.max(f5, f4 * 1.2f), f3) : fMax;
    }

    public static final KeylineList createCenterAlignedKeylineList(float f2, float f3, final float f4, final float f5, final Arrangement arrangement) {
        return KeylineListKt.m6176keylineListOfWNYm7Xg(f2, f3, CarouselAlignment.Companion.m6155getCenterNUL3oTo(), new l() { // from class: androidx.compose.material3.carousel.KeylinesKt$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return KeylinesKt.createCenterAlignedKeylineList$lambda$0(f4, arrangement, f5, (KeylineListScope) obj);
            }
        });
    }

    static final ab createCenterAlignedKeylineList$lambda$0(float f2, Arrangement arrangement, float f3, KeylineListScope keylineListScope) {
        keylineListScope.add(f2, true);
        int smallCount = arrangement.getSmallCount() / 2;
        for (int i2 = 0; i2 < smallCount; i2++) {
            KeylineListScope.CC.add$default(keylineListScope, arrangement.getSmallSize(), false, 2, null);
        }
        int mediumCount = arrangement.getMediumCount() / 2;
        for (int i3 = 0; i3 < mediumCount; i3++) {
            KeylineListScope.CC.add$default(keylineListScope, arrangement.getMediumSize(), false, 2, null);
        }
        int largeCount = arrangement.getLargeCount();
        for (int i4 = 0; i4 < largeCount; i4++) {
            KeylineListScope.CC.add$default(keylineListScope, arrangement.getLargeSize(), false, 2, null);
        }
        int mediumCount2 = arrangement.getMediumCount() / 2;
        for (int i5 = 0; i5 < mediumCount2; i5++) {
            KeylineListScope.CC.add$default(keylineListScope, arrangement.getMediumSize(), false, 2, null);
        }
        int smallCount2 = arrangement.getSmallCount() / 2;
        for (int i6 = 0; i6 < smallCount2; i6++) {
            KeylineListScope.CC.add$default(keylineListScope, arrangement.getSmallSize(), false, 2, null);
        }
        keylineListScope.add(f3, true);
        return ab.f48028a;
    }

    public static final KeylineList createLeftAlignedKeylineList(float f2, float f3, final float f4, final float f5, final Arrangement arrangement) {
        return KeylineListKt.m6176keylineListOfWNYm7Xg(f2, f3, CarouselAlignment.Companion.m6157getStartNUL3oTo(), new l() { // from class: androidx.compose.material3.carousel.KeylinesKt$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return KeylinesKt.createLeftAlignedKeylineList$lambda$0(f4, arrangement, f5, (KeylineListScope) obj);
            }
        });
    }

    static final ab createLeftAlignedKeylineList$lambda$0(float f2, Arrangement arrangement, float f3, KeylineListScope keylineListScope) {
        keylineListScope.add(f2, true);
        int largeCount = arrangement.getLargeCount();
        for (int i2 = 0; i2 < largeCount; i2++) {
            KeylineListScope.CC.add$default(keylineListScope, arrangement.getLargeSize(), false, 2, null);
        }
        int mediumCount = arrangement.getMediumCount();
        for (int i3 = 0; i3 < mediumCount; i3++) {
            KeylineListScope.CC.add$default(keylineListScope, arrangement.getMediumSize(), false, 2, null);
        }
        int smallCount = arrangement.getSmallCount();
        for (int i4 = 0; i4 < smallCount; i4++) {
            KeylineListScope.CC.add$default(keylineListScope, arrangement.getSmallSize(), false, 2, null);
        }
        keylineListScope.add(f3, true);
        return ab.f48028a;
    }

    public static final KeylineList heroKeylineList(Density density, float f2, Float f3, float f4, int i2, boolean z, float f5, float f6) {
        int[] iArr;
        if (f2 == 0.0f) {
            return KeylineListKt.emptyKeylineList();
        }
        boolean z2 = z && i2 >= 3;
        if (i2 <= 1) {
            iArr = new int[]{0};
        } else {
            iArr = new int[1];
            if (z2) {
                iArr[0] = 2;
            } else {
                iArr[0] = 1;
            }
        }
        float fMin = Math.min(f3 != null ? f3.floatValue() : f2, f2);
        float fG = n.g(fMin / 3.0f, f5, f6);
        if (f2 < (c.D(iArr) * f5) + (1.25f * f5)) {
            iArr = new int[]{0};
        }
        int iCeil = (int) Math.ceil(f2 / fMin);
        int iMax = (iCeil - Math.max(1, (int) Math.floor((f2 - (c.D(iArr) * f5)) / fMin))) + 1;
        int[] iArr2 = new int[iMax];
        for (int i3 = 0; i3 < iMax; i3++) {
            iArr2[i3] = iCeil - i3;
        }
        float fMo2127toPx0680j_4 = density.mo2127toPx0680j_4(CarouselDefaults.INSTANCE.m6158getAnchorSizeD9Ej5fM$material3());
        Arrangement arrangementFindLowestCostArrangement = Arrangement.Companion.findLowestCostArrangement(f2, f4, fG, f5, f6, iArr, 0.0f, new int[]{0}, fMin, iArr2);
        return arrangementFindLowestCostArrangement == null ? KeylineListKt.emptyKeylineList() : (!z2 || i2 < arrangementFindLowestCostArrangement.itemCount()) ? createLeftAlignedKeylineList(f2, f4, fMo2127toPx0680j_4, fMo2127toPx0680j_4, arrangementFindLowestCostArrangement) : createCenterAlignedKeylineList(f2, f4, fMo2127toPx0680j_4, fMo2127toPx0680j_4, arrangementFindLowestCostArrangement);
    }

    public static /* synthetic */ KeylineList heroKeylineList$default(Density density, float f2, Float f3, float f4, int i2, boolean z, float f5, float f6, int i3, Object obj) {
        if ((i3 & 64) != 0) {
            f5 = density.mo2127toPx0680j_4(CarouselDefaults.INSTANCE.m6160getMinSmallItemSizeD9Ej5fM());
        }
        float f7 = f5;
        if ((i3 & 128) != 0) {
            f6 = density.mo2127toPx0680j_4(CarouselDefaults.INSTANCE.m6159getMaxSmallItemSizeD9Ej5fM());
        }
        return heroKeylineList(density, f2, f3, f4, i2, ((i3 & 32) == 0) & z, f7, f6);
    }

    public static final KeylineList multiBrowseKeylineList(Density density, float f2, float f3, float f4, int i2, float f5, float f6) {
        float f7;
        if (f2 == 0.0f || f3 == 0.0f) {
            return KeylineListKt.emptyKeylineList();
        }
        int[] iArr = {1};
        int[] iArr2 = {1, 0};
        float fMin = Math.min(f3, f2);
        float fG = n.g(fMin / 3.0f, f5, f6);
        float f8 = fMin + fG;
        if (f2 < f5 + f5) {
            iArr = new int[]{0};
        }
        float f9 = f8 / 2.0f;
        int iCeil = (int) Math.ceil(f2 / fMin);
        int iMax = (iCeil - Math.max(1, (int) Math.floor(((f2 - (c.D(iArr2) * f9)) - (c.D(iArr) * f6)) / fMin))) + 1;
        int[] iArr3 = new int[iMax];
        for (int i3 = 0; i3 < iMax; i3++) {
            iArr3[i3] = iCeil - i3;
        }
        float fMo2127toPx0680j_4 = density.mo2127toPx0680j_4(CarouselDefaults.INSTANCE.m6158getAnchorSizeD9Ej5fM$material3());
        Arrangement arrangementFindLowestCostArrangement = Arrangement.Companion.findLowestCostArrangement(f2, f4, fG, f5, f6, iArr, f9, iArr2, fMin, iArr3);
        if (arrangementFindLowestCostArrangement == null || arrangementFindLowestCostArrangement.itemCount() <= i2) {
            f7 = f2;
        } else {
            int smallCount = arrangementFindLowestCostArrangement.getSmallCount();
            int mediumCount = arrangementFindLowestCostArrangement.getMediumCount();
            for (int iItemCount = arrangementFindLowestCostArrangement.itemCount() - i2; iItemCount > 0; iItemCount--) {
                if (smallCount > 0) {
                    smallCount--;
                } else if (mediumCount > 1) {
                    mediumCount--;
                }
            }
            f7 = f2;
            arrangementFindLowestCostArrangement = Arrangement.Companion.findLowestCostArrangement(f7, f4, fG, f5, f6, new int[]{smallCount}, f9, new int[]{mediumCount}, fMin, iArr3);
        }
        return arrangementFindLowestCostArrangement == null ? KeylineListKt.emptyKeylineList() : createLeftAlignedKeylineList(f7, f4, fMo2127toPx0680j_4, fMo2127toPx0680j_4, arrangementFindLowestCostArrangement);
    }

    public static /* synthetic */ KeylineList multiBrowseKeylineList$default(Density density, float f2, float f3, float f4, int i2, float f5, float f6, int i3, Object obj) {
        if ((i3 & 32) != 0) {
            f5 = density.mo2127toPx0680j_4(CarouselDefaults.INSTANCE.m6160getMinSmallItemSizeD9Ej5fM());
        }
        float f7 = f5;
        if ((i3 & 64) != 0) {
            f6 = density.mo2127toPx0680j_4(CarouselDefaults.INSTANCE.m6159getMaxSmallItemSizeD9Ej5fM());
        }
        return multiBrowseKeylineList(density, f2, f3, f4, i2, f7, f6);
    }

    public static final KeylineList uncontainedKeylineList(Density density, float f2, float f3, float f4) {
        if (f2 == 0.0f || f3 == 0.0f) {
            return KeylineListKt.emptyKeylineList();
        }
        float fMin = Math.min(f3 + f4, f2);
        int iMax = Math.max(1, (int) Math.floor(f2 / fMin));
        float f5 = f2 - (iMax * fMin);
        int i2 = f5 <= 0.0f ? 0 : 1;
        float fMo2127toPx0680j_4 = density.mo2127toPx0680j_4(CarouselDefaults.INSTANCE.m6158getAnchorSizeD9Ej5fM$material3());
        float fCalculateMediumChildSize = calculateMediumChildSize(fMo2127toPx0680j_4, fMin, f5);
        return createLeftAlignedKeylineList(f2, f4, Math.max(Math.min(fMo2127toPx0680j_4, f3), fCalculateMediumChildSize * 0.5f), fMo2127toPx0680j_4, new Arrangement(0, 0.0f, 0, fCalculateMediumChildSize, i2, fMin, iMax));
    }
}
