package androidx.compose.ui.layout;

import androidx.compose.ui.layout.Placeable;
import androidx.media3.muxer.MuxerUtil;
import h.g.a.p;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class HorizontalRuler extends Ruler {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    public HorizontalRuler() {
        this(null);
    }

    @Override // androidx.compose.ui.layout.Ruler
    public float calculateCoordinate$ui(float f2, LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2) {
        return Float.intBitsToFloat((int) (layoutCoordinates2.mo9744localPositionOfR5De75A(layoutCoordinates, (Float.floatToRawIntBits(((int) (layoutCoordinates.mo9743getSizeYbymL2g() >> 32)) / 2.0f) << 32) | (Float.floatToRawIntBits(f2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final HorizontalRuler derived(p<? super Placeable.PlacementScope, ? super Float, Float> pVar) {
            return new HorizontalRuler(pVar, null);
        }

        public final HorizontalRuler maxOf(HorizontalRuler... horizontalRulerArr) {
            return new HorizontalRuler(new HorizontalRuler$Companion$maxOf$1(horizontalRulerArr), null);
        }

        public final HorizontalRuler minOf(HorizontalRuler... horizontalRulerArr) {
            return new HorizontalRuler(new HorizontalRuler$Companion$minOf$1(horizontalRulerArr), null);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* synthetic */ HorizontalRuler(p pVar, o oVar) {
        this(pVar);
    }

    private HorizontalRuler(p<? super Placeable.PlacementScope, ? super Float, Float> pVar) {
        super(pVar, null);
    }
}
