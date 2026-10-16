package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class MultiParagraphIntrinsicsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final List<AnnotatedString.Range<Placeholder>> getLocalPlaceholders(List<AnnotatedString.Range<Placeholder>> list, int i2, int i3) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            AnnotatedString.Range<Placeholder> range = list.get(i4);
            if (AnnotatedStringKt.intersect(i2, i3, range.getStart(), range.getEnd())) {
                ArrayList arrayList2 = arrayList;
                if (i2 > range.getStart() || range.getEnd() > i3) {
                    InlineClassHelperKt.throwIllegalArgumentException("placeholder can not overlap with paragraph.");
                }
                arrayList2.add(new AnnotatedString.Range(range.getItem(), range.getStart() - i2, range.getEnd() - i2));
            }
        }
        return arrayList;
    }
}
