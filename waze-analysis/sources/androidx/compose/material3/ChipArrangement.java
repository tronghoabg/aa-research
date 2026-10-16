package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class ChipArrangement implements Arrangement.Horizontal {
    private final float leadingSpacing;
    private final float spacing;
    private final float trailingSpacing;

    private ChipArrangement(float f2, float f3) {
        this.leadingSpacing = f2;
        this.trailingSpacing = f3;
        this.spacing = (f2 + f3) / 2.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void arrange(androidx.compose.ui.unit.Density r9, int r10, int[] r11, androidx.compose.ui.unit.LayoutDirection r12, int[] r13) {
        /*
            r8 = this;
            int r0 = r11.length
            if (r0 != 0) goto L4
            goto L3c
        L4:
            float r1 = r8.leadingSpacing
            int r1 = r9.mo2121roundToPx0680j_4(r1)
            float r8 = r8.trailingSpacing
            int r8 = r9.mo2121roundToPx0680j_4(r8)
            r9 = 0
            r2 = r9
            r3 = r2
        L13:
            if (r2 >= r0) goto L3c
            r4 = r11[r2]
            int r5 = r3 + 1
            if (r3 == 0) goto L2e
            r6 = 1
            if (r3 == r6) goto L25
            r6 = 2
            if (r3 == r6) goto L22
            goto L2e
        L22:
            int r6 = r10 - r4
            goto L2f
        L25:
            r6 = r11[r9]
            if (r6 <= 0) goto L2b
            r7 = r1
            goto L2c
        L2b:
            r7 = r8
        L2c:
            int r6 = r6 + r7
            goto L2f
        L2e:
            r6 = r9
        L2f:
            androidx.compose.ui.unit.LayoutDirection r7 = androidx.compose.ui.unit.LayoutDirection.Ltr
            if (r12 == r7) goto L36
            int r6 = r10 - r6
            int r6 = r6 - r4
        L36:
            r13[r3] = r6
            int r2 = r2 + 1
            r3 = r5
            goto L13
        L3c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipArrangement.arrange(androidx.compose.ui.unit.Density, int, int[], androidx.compose.ui.unit.LayoutDirection, int[]):void");
    }

    /* renamed from: getLeadingSpacing-D9Ej5fM, reason: not valid java name */
    public final float m4494getLeadingSpacingD9Ej5fM() {
        return this.leadingSpacing;
    }

    @Override // androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
    /* renamed from: getSpacing-D9Ej5fM */
    public float mo2446getSpacingD9Ej5fM() {
        return this.spacing;
    }

    /* renamed from: getTrailingSpacing-D9Ej5fM, reason: not valid java name */
    public final float m4495getTrailingSpacingD9Ej5fM() {
        return this.trailingSpacing;
    }

    public /* synthetic */ ChipArrangement(float f2, float f3, o oVar) {
        this(f2, f3);
    }

    public /* synthetic */ ChipArrangement(float f2, o oVar) {
        this(f2);
    }

    private ChipArrangement(float f2) {
        this(f2, f2, null);
    }
}
