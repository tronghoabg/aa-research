package androidx.compose.ui.text.android;

import android.graphics.RectF;
import android.text.GraphemeClusterSegmentFinder;
import android.text.Layout$TextInclusionStrategy;
import androidx.compose.ui.text.android.selection.Api34SegmentFinder;
import androidx.compose.ui.text.android.selection.WordSegmentFinder;
import androidx.core.view.DisplayCompat$$ExternalSyntheticApiModelOutline1;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AndroidLayoutApi34 {
    public static final int $stable = 0;
    public static final AndroidLayoutApi34 INSTANCE = new AndroidLayoutApi34();

    private AndroidLayoutApi34() {
    }

    public final int[] getRangeForRect$ui_text(TextLayout textLayout, RectF rectF, int i2, final p<? super RectF, ? super RectF, Boolean> pVar) {
        return textLayout.getLayout().getRangeForRect(rectF, i2 == 1 ? Api34SegmentFinder.INSTANCE.toAndroidSegmentFinder$ui_text(new WordSegmentFinder(textLayout.getText(), textLayout.getWordIterator())) : DisplayCompat$$ExternalSyntheticApiModelOutline1.m11778m((Object) new GraphemeClusterSegmentFinder(textLayout.getText(), textLayout.getTextPaint())), new Layout$TextInclusionStrategy() { // from class: androidx.compose.ui.text.android.AndroidLayoutApi34$$ExternalSyntheticLambda0
            public final boolean isSegmentInside(RectF rectF2, RectF rectF3) {
                return ((Boolean) pVar.invoke(rectF2, rectF3)).booleanValue();
            }
        });
    }
}
