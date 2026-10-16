package androidx.compose.ui.layout;

import androidx.compose.ui.layout.Placeable;
import h.g.a.p;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class Ruler {
    public static final int $stable = 0;
    private final p<Placeable.PlacementScope, Float, Float> calculate;

    /* JADX WARN: Multi-variable type inference failed */
    private Ruler(p<? super Placeable.PlacementScope, ? super Float, Float> pVar) {
        this.calculate = pVar;
    }

    public abstract float calculateCoordinate$ui(float f2, LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2);

    public final p<Placeable.PlacementScope, Float, Float> getCalculate$ui() {
        return this.calculate;
    }

    public /* synthetic */ Ruler(p pVar, o oVar) {
        this(pVar);
    }
}
