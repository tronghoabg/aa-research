package androidx.compose.material3;

import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.LayoutDirection;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class DefaultTooltipCaretShape implements Shape {
    public static final int $stable = 0;
    private final long caretSize;

    public /* synthetic */ DefaultTooltipCaretShape(long j2, int i2, o oVar) {
        this((i2 & 1) != 0 ? TooltipDefaults.INSTANCE.m6041getCaretSizeMYxV2XQ() : j2, null);
    }

    @Override // androidx.compose.ui.graphics.Shape
    /* renamed from: createOutline-Pq9zytI */
    public Outline mo2037createOutlinePq9zytI(long j2, LayoutDirection layoutDirection, Density density) {
        long j3 = this.caretSize;
        Path Path = AndroidPath_androidKt.Path();
        float fMo2127toPx0680j_4 = density.mo2127toPx0680j_4(DpSize.m11262getWidthD9Ej5fM(j3));
        float fMo2127toPx0680j_42 = density.mo2127toPx0680j_4(DpSize.m11260getHeightD9Ej5fM(this.caretSize));
        Path.moveTo(0.0f, 0.0f);
        Path.lineTo(fMo2127toPx0680j_4 / 2.0f, 0.0f);
        Path.lineTo(0.0f, fMo2127toPx0680j_42);
        Path.lineTo((-fMo2127toPx0680j_4) / 2.0f, 0.0f);
        Path.close();
        return new Outline.Generic(Path);
    }

    /* renamed from: getCaretSize-MYxV2XQ, reason: not valid java name */
    public final long m4757getCaretSizeMYxV2XQ() {
        return this.caretSize;
    }

    public /* synthetic */ DefaultTooltipCaretShape(long j2, o oVar) {
        this(j2);
    }

    private DefaultTooltipCaretShape(long j2) {
        this.caretSize = j2;
    }
}
