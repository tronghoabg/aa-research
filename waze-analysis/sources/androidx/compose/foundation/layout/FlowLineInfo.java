package androidx.compose.foundation.layout;

import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class FlowLineInfo {
    public static final int $stable = 8;
    private int lineIndex;
    private float maxCrossAxisSize;
    private float maxMainAxisSize;
    private int positionInLine;

    public /* synthetic */ FlowLineInfo(int i2, int i3, float f2, float f3, int i4, o oVar) {
        this(1 == (i4 & 1) ? 0 : i2, (i4 & 2) != 0 ? 0 : i3, (i4 & 4) != 0 ? 0.0f : f2, (i4 & 8) != 0 ? 0.0f : f3, null);
    }

    public final int getLineIndex$foundation_layout() {
        return this.lineIndex;
    }

    /* renamed from: getMaxCrossAxisSize-D9Ej5fM$foundation_layout, reason: not valid java name */
    public final float m2610getMaxCrossAxisSizeD9Ej5fM$foundation_layout() {
        return this.maxCrossAxisSize;
    }

    /* renamed from: getMaxMainAxisSize-D9Ej5fM$foundation_layout, reason: not valid java name */
    public final float m2611getMaxMainAxisSizeD9Ej5fM$foundation_layout() {
        return this.maxMainAxisSize;
    }

    public final int getPositionInLine$foundation_layout() {
        return this.positionInLine;
    }

    public final void setLineIndex$foundation_layout(int i2) {
        this.lineIndex = i2;
    }

    /* renamed from: setMaxCrossAxisSize-0680j_4$foundation_layout, reason: not valid java name */
    public final void m2612setMaxCrossAxisSize0680j_4$foundation_layout(float f2) {
        this.maxCrossAxisSize = f2;
    }

    /* renamed from: setMaxMainAxisSize-0680j_4$foundation_layout, reason: not valid java name */
    public final void m2613setMaxMainAxisSize0680j_4$foundation_layout(float f2) {
        this.maxMainAxisSize = f2;
    }

    public final void setPositionInLine$foundation_layout(int i2) {
        this.positionInLine = i2;
    }

    /* renamed from: update-4j6BHR0$foundation_layout, reason: not valid java name */
    public final void m2614update4j6BHR0$foundation_layout(int i2, int i3, float f2, float f3) {
        this.lineIndex = i2;
        this.positionInLine = i3;
        this.maxMainAxisSize = f2;
        this.maxCrossAxisSize = f3;
    }

    public /* synthetic */ FlowLineInfo(int i2, int i3, float f2, float f3, o oVar) {
        this(i2, i3, f2, f3);
    }

    private FlowLineInfo(int i2, int i3, float f2, float f3) {
        this.lineIndex = i2;
        this.positionInLine = i3;
        this.maxMainAxisSize = f2;
        this.maxCrossAxisSize = f3;
    }
}
