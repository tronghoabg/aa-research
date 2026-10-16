package androidx.compose.material;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;
import h.m.h;
import h.m.k;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class DropdownMenuPositionProvider implements PopupPositionProvider {
    public static final int $stable = 0;
    private final long contentOffset;
    private final Density density;
    private final p<IntRect, IntRect, ab> onPositionCalculated;

    public /* synthetic */ DropdownMenuPositionProvider(long j2, Density density, p pVar, int i2, o oVar) {
        this(j2, density, (i2 & 4) != 0 ? new p() { // from class: androidx.compose.material.DropdownMenuPositionProvider$$ExternalSyntheticLambda0
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return ab.f48028a;
            }
        } : pVar, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: copy-rOJDEFc$default, reason: not valid java name */
    public static /* synthetic */ DropdownMenuPositionProvider m4074copyrOJDEFc$default(DropdownMenuPositionProvider dropdownMenuPositionProvider, long j2, Density density, p pVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = dropdownMenuPositionProvider.contentOffset;
        }
        if ((i2 & 2) != 0) {
            density = dropdownMenuPositionProvider.density;
        }
        if ((i2 & 4) != 0) {
            pVar = dropdownMenuPositionProvider.onPositionCalculated;
        }
        return dropdownMenuPositionProvider.m4076copyrOJDEFc(j2, density, pVar);
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo2094calculatePositionllwVHH4(IntRect intRect, long j2, LayoutDirection layoutDirection, long j3) {
        h hVarH;
        Object next;
        Object obj;
        int iMo2121roundToPx0680j_4 = this.density.mo2121roundToPx0680j_4(MenuKt.getMenuVerticalMargin());
        int iMo2121roundToPx0680j_42 = this.density.mo2121roundToPx0680j_4(DpOffset.m11225getXD9Ej5fM(this.contentOffset)) * (layoutDirection == LayoutDirection.Ltr ? 1 : -1);
        int iMo2121roundToPx0680j_43 = this.density.mo2121roundToPx0680j_4(DpOffset.m11227getYD9Ej5fM(this.contentOffset));
        int left = intRect.getLeft() + iMo2121roundToPx0680j_42;
        int i2 = (int) (j3 >> 32);
        int i3 = (int) (j2 >> 32);
        int i4 = i3 - i2;
        int right = (intRect.getRight() - i2) + iMo2121roundToPx0680j_42;
        if (layoutDirection == LayoutDirection.Ltr) {
            Integer numValueOf = Integer.valueOf(left);
            Integer numValueOf2 = Integer.valueOf(right);
            if (intRect.getLeft() < 0) {
                i4 = 0;
            }
            hVarH = k.h(numValueOf, numValueOf2, Integer.valueOf(i4));
        } else {
            Integer numValueOf3 = Integer.valueOf(right);
            Integer numValueOf4 = Integer.valueOf(left);
            if (intRect.getRight() <= i3) {
                i4 = 0;
            }
            hVarH = k.h(numValueOf3, numValueOf4, Integer.valueOf(i4));
        }
        Iterator it = hVarH.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            int iIntValue = ((Number) next).intValue();
            if (iIntValue >= 0 && iIntValue + i2 <= i3) {
                break;
            }
        }
        Integer num = (Integer) next;
        if (num != null) {
            right = num.intValue();
        }
        int iMax = Math.max(intRect.getBottom() + iMo2121roundToPx0680j_43, iMo2121roundToPx0680j_4);
        int top = intRect.getTop();
        int i5 = (int) (j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        int iIntValue2 = (top - i5) + iMo2121roundToPx0680j_43;
        int top2 = (intRect.getTop() - (i5 / 2)) + iMo2121roundToPx0680j_43;
        int i6 = (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        Iterator it2 = k.h(Integer.valueOf(iMax), Integer.valueOf(iIntValue2), Integer.valueOf(top2), Integer.valueOf((i6 - i5) - iMo2121roundToPx0680j_4)).iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            Object next2 = it2.next();
            int iIntValue3 = ((Number) next2).intValue();
            if (iIntValue3 >= iMo2121roundToPx0680j_4 && iIntValue3 + i5 <= i6 - iMo2121roundToPx0680j_4) {
                obj = next2;
                break;
            }
        }
        Integer num2 = (Integer) obj;
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        }
        this.onPositionCalculated.invoke(intRect, new IntRect(right, iIntValue2, right + i2, i5 + iIntValue2));
        return (right << 32) | (iIntValue2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: component1-RKDOV3M, reason: not valid java name */
    public final long m4075component1RKDOV3M() {
        return this.contentOffset;
    }

    public final Density component2() {
        return this.density;
    }

    public final p<IntRect, IntRect, ab> component3() {
        return this.onPositionCalculated;
    }

    /* renamed from: copy-rOJDEFc, reason: not valid java name */
    public final DropdownMenuPositionProvider m4076copyrOJDEFc(long j2, Density density, p<? super IntRect, ? super IntRect, ab> pVar) {
        return new DropdownMenuPositionProvider(j2, density, pVar, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DropdownMenuPositionProvider)) {
            return false;
        }
        DropdownMenuPositionProvider dropdownMenuPositionProvider = (DropdownMenuPositionProvider) obj;
        return DpOffset.m11224equalsimpl0(this.contentOffset, dropdownMenuPositionProvider.contentOffset) && x.n(this.density, dropdownMenuPositionProvider.density) && x.n(this.onPositionCalculated, dropdownMenuPositionProvider.onPositionCalculated);
    }

    /* renamed from: getContentOffset-RKDOV3M, reason: not valid java name */
    public final long m4077getContentOffsetRKDOV3M() {
        return this.contentOffset;
    }

    public final Density getDensity() {
        return this.density;
    }

    public final p<IntRect, IntRect, ab> getOnPositionCalculated() {
        return this.onPositionCalculated;
    }

    public int hashCode() {
        return (((DpOffset.m11229hashCodeimpl(this.contentOffset) * 31) + this.density.hashCode()) * 31) + this.onPositionCalculated.hashCode();
    }

    public String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) DpOffset.m11232toStringimpl(this.contentOffset)) + ", density=" + this.density + ", onPositionCalculated=" + this.onPositionCalculated + ')';
    }

    public /* synthetic */ DropdownMenuPositionProvider(long j2, Density density, p pVar, o oVar) {
        this(j2, density, pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private DropdownMenuPositionProvider(long j2, Density density, p<? super IntRect, ? super IntRect, ab> pVar) {
        this.contentOffset = j2;
        this.density = density;
        this.onPositionCalculated = pVar;
    }
}
