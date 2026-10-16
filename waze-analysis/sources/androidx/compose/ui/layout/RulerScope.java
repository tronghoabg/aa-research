package androidx.compose.ui.layout;

import androidx.compose.ui.unit.Density;

/* compiled from: WazeSource */
@MeasureScopeMarker
/* loaded from: classes.dex */
public interface RulerScope extends Density {
    LayoutCoordinates getCoordinates();

    void provides(Ruler ruler, float f2);

    void providesRelative(VerticalRuler verticalRuler, float f2);
}
