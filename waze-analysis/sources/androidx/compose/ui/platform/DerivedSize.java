package androidx.compose.ui.platform;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class DerivedSize {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final DerivedSize Zero = new DerivedSize(IntSize.Companion.m11344getZeroYbymL2g(), DpSize.Companion.m11272getZeroMYxV2XQ(), null);
    private final long dpSize;
    private final long pxSize;

    private DerivedSize(long j2, long j3) {
        this.pxSize = j2;
        this.dpSize = j3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DerivedSize)) {
            return false;
        }
        DerivedSize derivedSize = (DerivedSize) obj;
        return IntSize.m11337equalsimpl0(this.pxSize, derivedSize.pxSize) && DpSize.m11259equalsimpl0(this.dpSize, derivedSize.dpSize);
    }

    /* renamed from: getDpSize-MYxV2XQ, reason: not valid java name */
    public final long m10226getDpSizeMYxV2XQ() {
        return this.dpSize;
    }

    /* renamed from: getPxSize-YbymL2g, reason: not valid java name */
    public final long m10227getPxSizeYbymL2g() {
        return this.pxSize;
    }

    public int hashCode() {
        return (IntSize.m11340hashCodeimpl(this.pxSize) * 31) + DpSize.m11264hashCodeimpl(this.dpSize);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: fromDpSize-itqla9I, reason: not valid java name */
        public final DerivedSize m10228fromDpSizeitqla9I(long j2, Density density) {
            return new DerivedSize(IntSizeKt.m11350toIntSizeuvyYCjk(density.mo2128toSizeXkaWNTQ(j2)), j2, null);
        }

        /* renamed from: fromPxSize-viCIZxY, reason: not valid java name */
        public final DerivedSize m10229fromPxSizeviCIZxY(long j2, Density density) {
            return new DerivedSize(j2, density.mo2125toDpSizekrfVVM(IntSizeKt.m11351toSizeozmzZPI(j2)), null);
        }

        public final DerivedSize getZero() {
            return DerivedSize.Zero;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* synthetic */ DerivedSize(long j2, long j3, o oVar) {
        this(j2, j3);
    }
}
