package androidx.compose.ui.text.android.selection;

import androidx.core.view.DisplayCompat$$ExternalSyntheticApiModelOutline1;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class Api34SegmentFinder {
    public static final int $stable = 0;
    public static final Api34SegmentFinder INSTANCE = new Api34SegmentFinder();

    private Api34SegmentFinder() {
    }

    public final android.text.SegmentFinder toAndroidSegmentFinder$ui_text(final SegmentFinder segmentFinder) {
        return DisplayCompat$$ExternalSyntheticApiModelOutline1.m11778m((Object) new android.text.SegmentFinder() { // from class: androidx.compose.ui.text.android.selection.Api34SegmentFinder$toAndroidSegmentFinder$1
            public int nextEndBoundary(int i2) {
                return segmentFinder.nextEndBoundary(i2);
            }

            public int nextStartBoundary(int i2) {
                return segmentFinder.nextStartBoundary(i2);
            }

            public int previousEndBoundary(int i2) {
                return segmentFinder.previousEndBoundary(i2);
            }

            public int previousStartBoundary(int i2) {
                return segmentFinder.previousStartBoundary(i2);
            }
        });
    }
}
