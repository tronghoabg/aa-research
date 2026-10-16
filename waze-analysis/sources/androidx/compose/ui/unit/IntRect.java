package androidx.compose.ui.unit;

import androidx.media3.muxer.MuxerUtil;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class IntRect {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final IntRect Zero = new IntRect(0, 0, 0, 0);
    private final int bottom;
    private final int left;
    private final int right;
    private final int top;

    public IntRect(int i2, int i3, int i4, int i5) {
        this.left = i2;
        this.top = i3;
        this.right = i4;
        this.bottom = i5;
    }

    public static /* synthetic */ IntRect copy$default(IntRect intRect, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i2 = intRect.left;
        }
        if ((i6 & 2) != 0) {
            i3 = intRect.top;
        }
        if ((i6 & 4) != 0) {
            i4 = intRect.right;
        }
        if ((i6 & 8) != 0) {
            i5 = intRect.bottom;
        }
        return intRect.copy(i2, i3, i4, i5);
    }

    public final int component1() {
        return this.left;
    }

    public final int component2() {
        return this.top;
    }

    public final int component3() {
        return this.right;
    }

    public final int component4() {
        return this.bottom;
    }

    /* renamed from: contains--gyyYBs, reason: not valid java name */
    public final boolean m11316containsgyyYBs(long j2) {
        return IntOffset.m11296getXimpl(j2) >= this.left && IntOffset.m11296getXimpl(j2) < this.right && IntOffset.m11297getYimpl(j2) >= this.top && IntOffset.m11297getYimpl(j2) < this.bottom;
    }

    public final IntRect copy(int i2, int i3, int i4, int i5) {
        return new IntRect(i2, i3, i4, i5);
    }

    public final IntRect deflate(int i2) {
        return inflate(-i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntRect)) {
            return false;
        }
        IntRect intRect = (IntRect) obj;
        return this.left == intRect.left && this.top == intRect.top && this.right == intRect.right && this.bottom == intRect.bottom;
    }

    public final int getBottom() {
        return this.bottom;
    }

    /* renamed from: getBottomCenter-nOcc-ac, reason: not valid java name */
    public final long m11317getBottomCenternOccac() {
        return ((this.left + (getWidth() / 2)) << 32) | (this.bottom & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: getBottomLeft-nOcc-ac, reason: not valid java name */
    public final long m11318getBottomLeftnOccac() {
        return (this.left << 32) | (this.bottom & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: getBottomRight-nOcc-ac, reason: not valid java name */
    public final long m11319getBottomRightnOccac() {
        return (this.right << 32) | (this.bottom & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: getCenter-nOcc-ac, reason: not valid java name */
    public final long m11320getCenternOccac() {
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        return ((this.top + height) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | ((this.left + width) << 32);
    }

    /* renamed from: getCenterLeft-nOcc-ac, reason: not valid java name */
    public final long m11321getCenterLeftnOccac() {
        int height = getHeight() / 2;
        return (this.left << 32) | ((this.top + height) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: getCenterRight-nOcc-ac, reason: not valid java name */
    public final long m11322getCenterRightnOccac() {
        int height = getHeight() / 2;
        return (this.right << 32) | ((this.top + height) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    public final int getHeight() {
        return this.bottom - this.top;
    }

    public final int getLeft() {
        return this.left;
    }

    public final int getMaxDimension() {
        return Math.max(Math.abs(getWidth()), Math.abs(getHeight()));
    }

    public final int getMinDimension() {
        return Math.min(Math.abs(getWidth()), Math.abs(getHeight()));
    }

    public final int getRight() {
        return this.right;
    }

    /* renamed from: getSize-YbymL2g, reason: not valid java name */
    public final long m11323getSizeYbymL2g() {
        return (getWidth() << 32) | (getHeight() & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    public final int getTop() {
        return this.top;
    }

    /* renamed from: getTopCenter-nOcc-ac, reason: not valid java name */
    public final long m11324getTopCenternOccac() {
        return ((this.left + (getWidth() / 2)) << 32) | (this.top & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: getTopLeft-nOcc-ac, reason: not valid java name */
    public final long m11325getTopLeftnOccac() {
        return (this.left << 32) | (this.top & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: getTopRight-nOcc-ac, reason: not valid java name */
    public final long m11326getTopRightnOccac() {
        return (this.right << 32) | (this.top & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    public final int getWidth() {
        return this.right - this.left;
    }

    public int hashCode() {
        return (((((this.left * 31) + this.top) * 31) + this.right) * 31) + this.bottom;
    }

    public final IntRect inflate(int i2) {
        int i3 = this.bottom;
        int i4 = this.right;
        return new IntRect(this.left - i2, this.top - i2, i4 + i2, i3 + i2);
    }

    public final IntRect intersect(IntRect intRect) {
        return new IntRect(Math.max(this.left, intRect.left), Math.max(this.top, intRect.top), Math.min(this.right, intRect.right), Math.min(this.bottom, intRect.bottom));
    }

    public final boolean isEmpty() {
        return this.left >= this.right || this.top >= this.bottom;
    }

    public final boolean overlaps(IntRect intRect) {
        return this.right > intRect.left && intRect.right > this.left && this.bottom > intRect.top && intRect.bottom > this.top;
    }

    public String toString() {
        return "IntRect.fromLTRB(" + this.left + ", " + this.top + ", " + this.right + ", " + this.bottom + ')';
    }

    public final IntRect translate(int i2, int i3) {
        int i4 = this.bottom;
        int i5 = this.right;
        return new IntRect(this.left + i2, this.top + i3, i5 + i2, i4 + i3);
    }

    /* renamed from: translate--gyyYBs, reason: not valid java name */
    public final IntRect m11327translategyyYBs(long j2) {
        int i2 = this.bottom;
        int iM11297getYimpl = IntOffset.m11297getYimpl(j2);
        int i3 = this.right;
        int iM11296getXimpl = IntOffset.m11296getXimpl(j2);
        return new IntRect(this.left + IntOffset.m11296getXimpl(j2), this.top + IntOffset.m11297getYimpl(j2), i3 + iM11296getXimpl, i2 + iM11297getYimpl);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final IntRect getZero() {
            return IntRect.Zero;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public static /* synthetic */ void getZero$annotations() {
        }
    }

    public static /* synthetic */ void getBottom$annotations() {
    }

    public static /* synthetic */ void getHeight$annotations() {
    }

    public static /* synthetic */ void getLeft$annotations() {
    }

    public static /* synthetic */ void getRight$annotations() {
    }

    /* renamed from: getSize-YbymL2g$annotations, reason: not valid java name */
    public static /* synthetic */ void m11315getSizeYbymL2g$annotations() {
    }

    public static /* synthetic */ void getTop$annotations() {
    }

    public static /* synthetic */ void getWidth$annotations() {
    }

    public static /* synthetic */ void isEmpty$annotations() {
    }
}
