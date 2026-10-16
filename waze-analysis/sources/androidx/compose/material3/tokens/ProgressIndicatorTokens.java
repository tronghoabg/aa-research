package androidx.compose.material3.tokens;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ProgressIndicatorTokens {
    public static final int $stable = 0;
    private static final ShapeKeyTokens ActiveShape;
    private static final ColorSchemeKeyTokens StopColor;
    private static final ShapeKeyTokens StopShape;
    private static final ColorSchemeKeyTokens TrackColor;
    private static final ShapeKeyTokens TrackShape;
    public static final ProgressIndicatorTokens INSTANCE = new ProgressIndicatorTokens();
    private static final ColorSchemeKeyTokens ActiveIndicatorColor = ColorSchemeKeyTokens.Primary;

    static {
        ShapeKeyTokens shapeKeyTokens = ShapeKeyTokens.CornerFull;
        ActiveShape = shapeKeyTokens;
        StopColor = ColorSchemeKeyTokens.Primary;
        StopShape = shapeKeyTokens;
        TrackColor = ColorSchemeKeyTokens.SecondaryContainer;
        TrackShape = shapeKeyTokens;
    }

    private ProgressIndicatorTokens() {
    }

    public final ColorSchemeKeyTokens getActiveIndicatorColor() {
        return ActiveIndicatorColor;
    }

    public final ShapeKeyTokens getActiveShape() {
        return ActiveShape;
    }

    public final ColorSchemeKeyTokens getStopColor() {
        return StopColor;
    }

    public final ShapeKeyTokens getStopShape() {
        return StopShape;
    }

    public final ColorSchemeKeyTokens getTrackColor() {
        return TrackColor;
    }

    public final ShapeKeyTokens getTrackShape() {
        return TrackShape;
    }
}
