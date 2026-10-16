package androidx.compose.foundation.pager;

import androidx.compose.foundation.internal.InlineClassHelperKt;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface PagerSnapDistance {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final PagerSnapDistance atMost(int i2) {
            if (i2 < 0) {
                InlineClassHelperKt.throwIllegalArgumentException("pages should be greater than or equal to 0. You have used " + i2 + '.');
            }
            return new PagerSnapDistanceMaxPages(i2);
        }
    }

    int calculateTargetPage(int i2, int i3, float f2, int i4, int i5);
}
