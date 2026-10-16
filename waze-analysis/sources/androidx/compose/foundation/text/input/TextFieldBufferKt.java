package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import h.ab;
import h.g.a.p;
import h.g.a.r;
import h.k.n;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextFieldBufferKt {
    /* renamed from: adjustTextRange-vJH6DeI, reason: not valid java name */
    public static final long m3482adjustTextRangevJH6DeI(long j2, int i2, int i3, int i4) {
        int i5;
        int iM10544getMinimpl = TextRange.m10544getMinimpl(j2);
        int iM10543getMaximpl = TextRange.m10543getMaximpl(j2);
        if (iM10543getMaximpl < i2) {
            return j2;
        }
        if (iM10544getMinimpl > i2 || i3 > iM10543getMaximpl) {
            if (iM10544getMinimpl > i2 && iM10543getMaximpl < i3) {
                i2 += i4;
                iM10544getMinimpl = i2;
            } else if (iM10544getMinimpl >= i3) {
                int i6 = i4 - (i3 - i2);
                i2 = iM10543getMaximpl + i6;
                iM10544getMinimpl += i6;
            } else if (i2 < iM10544getMinimpl) {
                iM10544getMinimpl = i2 + i4;
                i5 = i4 - (i3 - i2);
            }
            return TextRangeKt.TextRange(iM10544getMinimpl, i2);
        }
        i5 = i4 - (i3 - i2);
        if (iM10544getMinimpl == iM10543getMaximpl) {
            iM10544getMinimpl += i5;
        }
        i2 = iM10543getMaximpl + i5;
        return TextRangeKt.TextRange(iM10544getMinimpl, i2);
    }

    public static final void delete(TextFieldBuffer textFieldBuffer, int i2, int i3) {
        textFieldBuffer.replace(i2, i3, "");
    }

    public static final void findCommonPrefixAndSuffix(CharSequence charSequence, CharSequence charSequence2, r<? super Integer, ? super Integer, ? super Integer, ? super Integer, ab> rVar) {
        int i2;
        int length = charSequence.length();
        int length2 = charSequence2.length();
        int i3 = 0;
        if (charSequence.length() <= 0 || charSequence2.length() <= 0) {
            i2 = 0;
        } else {
            int i4 = 0;
            i2 = 0;
            boolean z = false;
            while (true) {
                if (i3 == 0) {
                    if (charSequence.charAt(i4) == charSequence2.charAt(i2)) {
                        i4++;
                        i2++;
                    } else {
                        i3 = 1;
                    }
                }
                if (!z) {
                    int i5 = length - 1;
                    int i6 = length2 - 1;
                    if (charSequence.charAt(i5) == charSequence2.charAt(i6)) {
                        length = i5;
                        length2 = i6;
                    } else {
                        z = true;
                    }
                }
                if (i4 >= length || i2 >= length2 || (i3 != 0 && z)) {
                    break;
                }
            }
            i3 = i4;
        }
        if (i3 < length || i2 < length2) {
            rVar.invoke(Integer.valueOf(i3), Integer.valueOf(length), Integer.valueOf(i2), Integer.valueOf(length2));
        }
    }

    public static final void forEachChange(TextFieldBuffer.ChangeList changeList, p<? super TextRange, ? super TextRange, ab> pVar) {
        for (int i2 = 0; i2 < changeList.getChangeCount(); i2++) {
            pVar.invoke(TextRange.m10534boximpl(changeList.mo3481getRangejx7JFs(i2)), TextRange.m10534boximpl(changeList.mo3480getOriginalRangejx7JFs(i2)));
        }
    }

    public static final void forEachChangeReversed(TextFieldBuffer.ChangeList changeList, p<? super TextRange, ? super TextRange, ab> pVar) {
        int changeCount = changeList.getChangeCount();
        while (true) {
            changeCount--;
            if (changeCount < 0) {
                return;
            } else {
                pVar.invoke(TextRange.m10534boximpl(changeList.mo3481getRangejx7JFs(changeCount)), TextRange.m10534boximpl(changeList.mo3480getOriginalRangejx7JFs(changeCount)));
            }
        }
    }

    public static final void insert(TextFieldBuffer textFieldBuffer, int i2, String str) {
        textFieldBuffer.replace(i2, i2, str);
    }

    public static final void placeCursorAtEnd(TextFieldBuffer textFieldBuffer) {
        textFieldBuffer.placeCursorBeforeCharAt(textFieldBuffer.getLength());
    }

    public static final void selectAll(TextFieldBuffer textFieldBuffer) {
        textFieldBuffer.m3478setSelection5zctL8(TextRangeKt.TextRange(0, textFieldBuffer.getLength()));
    }

    public static final void setSelectionCoerced(TextFieldBuffer textFieldBuffer, int i2, int i3) {
        textFieldBuffer.m3478setSelection5zctL8(TextRangeKt.TextRange(n.j(i2, 0, textFieldBuffer.getLength()), n.j(i3, 0, textFieldBuffer.getLength())));
    }

    public static /* synthetic */ void setSelectionCoerced$default(TextFieldBuffer textFieldBuffer, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = i2;
        }
        setSelectionCoerced(textFieldBuffer, i2, i3);
    }
}
