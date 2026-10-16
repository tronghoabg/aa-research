package androidx.compose.ui.layout;

import androidx.compose.ui.layout.Placeable;
import androidx.media3.muxer.MuxerUtil;
import h.g.a.p;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class VerticalRuler extends Ruler {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    public VerticalRuler() {
        this(null);
    }

    @Override // androidx.compose.ui.layout.Ruler
    public float calculateCoordinate$ui(float f2, LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2) {
        long jMo9743getSizeYbymL2g = layoutCoordinates.mo9743getSizeYbymL2g() & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
        return Float.intBitsToFloat((int) (layoutCoordinates2.mo9744localPositionOfR5De75A(layoutCoordinates, (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(((int) jMo9743getSizeYbymL2g) / 2.0f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) >> 32));
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final VerticalRuler derived(p<? super Placeable.PlacementScope, ? super Float, Float> pVar) {
            return new VerticalRuler(pVar, null);
        }

        public final VerticalRuler maxOf(VerticalRuler... verticalRulerArr) {
            return derived(new VerticalRuler$Companion$maxOf$1(verticalRulerArr));
        }

        public final VerticalRuler minOf(VerticalRuler... verticalRulerArr) {
            return derived(new VerticalRuler$Companion$minOf$1(verticalRulerArr));
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* synthetic */ VerticalRuler(p pVar, o oVar) {
        this(pVar);
    }

    private VerticalRuler(p<? super Placeable.PlacementScope, ? super Float, Float> pVar) {
        super(pVar, null);
    }
}
