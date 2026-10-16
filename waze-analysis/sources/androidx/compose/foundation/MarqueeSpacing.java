package androidx.compose.foundation;

import androidx.compose.ui.unit.Density;
import h.h.a;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface MarqueeSpacing {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final MarqueeSpacing fractionOfContainer(final float f2) {
            return new MarqueeSpacing() { // from class: androidx.compose.foundation.MarqueeSpacing$Companion$$ExternalSyntheticLambda0
                @Override // androidx.compose.foundation.MarqueeSpacing
                public final int calculateSpacing(Density density, int i2, int i3) {
                    return a.b(f2 * i3);
                }
            };
        }
    }

    int calculateSpacing(Density density, int i2, int i3);
}
