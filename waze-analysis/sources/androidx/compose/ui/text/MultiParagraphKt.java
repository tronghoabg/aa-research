package androidx.compose.ui.text;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.util.ListUtilsKt;
import h.a.i;
import h.ab;
import h.g.a.l;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class MultiParagraphKt {
    private static final <T> int fastBinarySearch(List<? extends T> list, l<? super T, Integer> lVar) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int iIntValue = lVar.invoke(list.get(i3)).intValue();
            if (iIntValue < 0) {
                i2 = i3 + 1;
            } else {
                if (iIntValue <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final int findParagraphByIndex(List<ParagraphInfo> list, int i2) {
        int i3;
        int endIndex = ((ParagraphInfo) i.T(list)).getEndIndex();
        if (i2 > ((ParagraphInfo) i.T(list)).getEndIndex()) {
            InlineClassHelperKt.throwIllegalArgumentException("Index " + i2 + " should be less or equal than last line's end " + endIndex);
        }
        int size = list.size() - 1;
        int i4 = 0;
        while (true) {
            if (i4 > size) {
                i3 = -(i4 + 1);
                break;
            }
            i3 = (i4 + size) >>> 1;
            ParagraphInfo paragraphInfo = list.get(i3);
            char c2 = paragraphInfo.getStartIndex() <= i2 ? paragraphInfo.getEndIndex() <= i2 ? (char) 65535 : (char) 0 : (char) 1;
            if (c2 >= 0) {
                if (c2 <= 0) {
                    break;
                }
                size = i3 - 1;
            } else {
                i4 = i3 + 1;
            }
        }
        int i5 = i3;
        if (i5 >= 0 && i5 < list.size()) {
            return i5;
        }
        InlineClassHelperKt.throwIllegalArgumentException("Found paragraph index " + i5 + " should be in range [0, " + list.size() + ").\nDebug info: index=" + i2 + ", paragraphs=[" + ListUtilsKt.fastJoinToString$default(list, null, null, null, 0, null, new l() { // from class: androidx.compose.ui.text.MultiParagraphKt$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return MultiParagraphKt.findParagraphByIndex$lambda$2$0((ParagraphInfo) obj);
            }
        }, 31, null) + ']');
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence findParagraphByIndex$lambda$2$0(ParagraphInfo paragraphInfo) {
        return "[" + paragraphInfo.getStartIndex() + ", " + paragraphInfo.getEndIndex() + ')';
    }

    public static final int findParagraphByLineIndex(List<ParagraphInfo> list, int i2) {
        int size = list.size() - 1;
        int i3 = 0;
        while (true) {
            if (i3 > size) {
                return -(i3 + 1);
            }
            int i4 = (i3 + size) >>> 1;
            ParagraphInfo paragraphInfo = list.get(i4);
            char c2 = paragraphInfo.getStartLineIndex() <= i2 ? paragraphInfo.getEndLineIndex() <= i2 ? (char) 65535 : (char) 0 : (char) 1;
            if (c2 < 0) {
                i3 = i4 + 1;
            } else {
                if (c2 <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
    }

    public static final int findParagraphByY(List<ParagraphInfo> list, float f2) {
        if (f2 <= 0.0f) {
            return 0;
        }
        if (f2 >= ((ParagraphInfo) i.T(list)).getBottom()) {
            return i.e(list);
        }
        int size = list.size() - 1;
        int i2 = 0;
        while (true) {
            if (i2 > size) {
                return -(i2 + 1);
            }
            int i3 = (i2 + size) >>> 1;
            ParagraphInfo paragraphInfo = list.get(i3);
            char c2 = paragraphInfo.getTop() <= f2 ? paragraphInfo.getBottom() <= f2 ? (char) 65535 : (char) 0 : (char) 1;
            if (c2 < 0) {
                i2 = i3 + 1;
            } else {
                if (c2 <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
    }

    /* renamed from: findParagraphsByRange-Sb-Bc2M, reason: not valid java name */
    public static final void m10413findParagraphsByRangeSbBc2M(List<ParagraphInfo> list, long j2, l<? super ParagraphInfo, ab> lVar) {
        int size = list.size();
        for (int iFindParagraphByIndex = findParagraphByIndex(list, TextRange.m10544getMinimpl(j2)); iFindParagraphByIndex < size; iFindParagraphByIndex++) {
            ParagraphInfo paragraphInfo = list.get(iFindParagraphByIndex);
            if (paragraphInfo.getStartIndex() >= TextRange.m10543getMaximpl(j2)) {
                return;
            }
            if (paragraphInfo.getStartIndex() != paragraphInfo.getEndIndex()) {
                lVar.invoke(paragraphInfo);
            }
        }
    }
}
