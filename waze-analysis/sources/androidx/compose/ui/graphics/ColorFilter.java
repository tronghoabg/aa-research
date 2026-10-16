package androidx.compose.ui.graphics;

import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public class ColorFilter {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final android.graphics.ColorFilter nativeColorFilter;

    public ColorFilter(android.graphics.ColorFilter colorFilter) {
        this.nativeColorFilter = colorFilter;
    }

    public final android.graphics.ColorFilter getNativeColorFilter$ui_graphics() {
        return this.nativeColorFilter;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: tint-xETnrds$default, reason: not valid java name */
        public static /* synthetic */ ColorFilter m8269tintxETnrds$default(Companion companion, long j2, int i2, int i3, Object obj) {
            if ((i3 & 2) != 0) {
                i2 = BlendMode.Companion.m8166getSrcIn0nO6VwU();
            }
            return companion.m8272tintxETnrds(j2, i2);
        }

        /* renamed from: colorMatrix-jHG-Opc, reason: not valid java name */
        public final ColorFilter m8270colorMatrixjHGOpc(float[] fArr) {
            return new ColorMatrixColorFilter(fArr, (o) null);
        }

        /* renamed from: lighting--OWjLjI, reason: not valid java name */
        public final ColorFilter m8271lightingOWjLjI(long j2, long j3) {
            return new LightingColorFilter(j2, j3, (o) null);
        }

        /* renamed from: tint-xETnrds, reason: not valid java name */
        public final ColorFilter m8272tintxETnrds(long j2, int i2) {
            return new BlendModeColorFilter(j2, i2, (o) null);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
