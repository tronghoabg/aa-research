package androidx.compose.material3.carousel;

import h.a.i;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class KeylineListScopeImpl implements KeylineListScope {
    private float focalItemSize;
    private float pivotOffset;
    private int firstFocalIndex = -1;
    private int pivotIndex = -1;
    private final List<TmpKeyline> tmpKeylines = new ArrayList();

    /* compiled from: WazeSource */
    final class TmpKeyline {
        private final boolean isAnchor;
        private final float size;

        public TmpKeyline(float f2, boolean z) {
            this.size = f2;
            this.isAnchor = z;
        }

        public static /* synthetic */ TmpKeyline copy$default(TmpKeyline tmpKeyline, float f2, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                f2 = tmpKeyline.size;
            }
            if ((i2 & 2) != 0) {
                z = tmpKeyline.isAnchor;
            }
            return tmpKeyline.copy(f2, z);
        }

        public final float component1() {
            return this.size;
        }

        public final boolean component2() {
            return this.isAnchor;
        }

        public final TmpKeyline copy(float f2, boolean z) {
            return new TmpKeyline(f2, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TmpKeyline)) {
                return false;
            }
            TmpKeyline tmpKeyline = (TmpKeyline) obj;
            return Float.compare(this.size, tmpKeyline.size) == 0 && this.isAnchor == tmpKeyline.isAnchor;
        }

        public final float getSize() {
            return this.size;
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.size) * 31) + KeylineListScopeImpl$TmpKeyline$$ExternalSyntheticBackport0.m(this.isAnchor);
        }

        public final boolean isAnchor() {
            return this.isAnchor;
        }

        public String toString() {
            return "TmpKeyline(size=" + this.size + ", isAnchor=" + this.isAnchor + ')';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<androidx.compose.material3.carousel.Keyline> createKeylinesWithPivot(int r28, float r29, int r30, int r31, float r32, float r33, float r34, java.util.List<androidx.compose.material3.carousel.KeylineListScopeImpl.TmpKeyline> r35) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.carousel.KeylineListScopeImpl.createKeylinesWithPivot(int, float, int, int, float, float, float, java.util.List):java.util.List");
    }

    private final int findLastFocalIndex() {
        int i2 = this.firstFocalIndex;
        while (i2 < i.e(this.tmpKeylines)) {
            int i3 = i2 + 1;
            if (this.tmpKeylines.get(i3).getSize() != this.focalItemSize) {
                break;
            }
            i2 = i3;
        }
        return i2;
    }

    private final boolean isCutoffLeft(float f2, float f3) {
        float f4 = f2 / 2.0f;
        return f3 - f4 < 0.0f && f3 + f4 > 0.0f;
    }

    private final boolean isCutoffRight(float f2, float f3, float f4) {
        float f5 = f2 / 2.0f;
        return f3 - f5 < f4 && f3 + f5 > f4;
    }

    @Override // androidx.compose.material3.carousel.KeylineListScope
    public void add(float f2, boolean z) {
        this.tmpKeylines.add(new TmpKeyline(f2, z));
        if (f2 > this.focalItemSize) {
            this.firstFocalIndex = i.e(this.tmpKeylines);
            this.focalItemSize = f2;
        }
    }

    /* renamed from: createWithAlignment-waks0t8, reason: not valid java name */
    public final KeylineList m6177createWithAlignmentwaks0t8(float f2, float f3, int i2) {
        float f4;
        float f5;
        int iFindLastFocalIndex = findLastFocalIndex();
        int i3 = this.firstFocalIndex;
        int i4 = iFindLastFocalIndex - i3;
        this.pivotIndex = i3;
        if (CarouselAlignment.m6151equalsimpl0(i2, CarouselAlignment.Companion.m6155getCenterNUL3oTo())) {
            float f6 = 0.0f;
            if (f3 != 0.0f) {
                int i5 = i4 % 2;
                if (i5 + ((((i5 ^ 2) & ((-i5) | i5)) >> 31) & 2) != 0) {
                    f6 = f3 / 2.0f;
                }
            }
            f4 = this.focalItemSize;
            f5 = (((f2 / 2.0f) - ((f4 / 2.0f) * i4)) - f6) - ((i4 / 2) * f3);
        } else {
            boolean zM6151equalsimpl0 = CarouselAlignment.m6151equalsimpl0(i2, CarouselAlignment.Companion.m6156getEndNUL3oTo());
            f4 = this.focalItemSize;
            f5 = zM6151equalsimpl0 ? f2 - (f4 / 2.0f) : f4 / 2.0f;
        }
        float f7 = f5;
        this.pivotOffset = f7;
        return new KeylineList(createKeylinesWithPivot(this.pivotIndex, f7, this.firstFocalIndex, iFindLastFocalIndex, f4, f2, f3, this.tmpKeylines));
    }

    public final KeylineList createWithPivot(float f2, float f3, int i2, float f4) {
        return new KeylineList(createKeylinesWithPivot(i2, f4, this.firstFocalIndex, findLastFocalIndex(), this.focalItemSize, f2, f3, this.tmpKeylines));
    }
}
