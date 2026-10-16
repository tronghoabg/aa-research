package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldBufferKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import h.ab;
import h.g.a.l;
import h.k.n;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ImeEditCommand_androidKt {
    public static final void commitText(ImeEditCommandScope imeEditCommandScope, final String str, final int i2) {
        imeEditCommandScope.edit(new l() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt$$ExternalSyntheticLambda3
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return ImeEditCommand_androidKt.commitText$lambda$0(str, i2, (TextFieldBuffer) obj);
            }
        });
    }

    static final ab commitText$lambda$0(String str, int i2, TextFieldBuffer textFieldBuffer) {
        TextRange textRangeM3474getCompositionMzsxiRA$foundation = textFieldBuffer.m3474getCompositionMzsxiRA$foundation();
        if (textRangeM3474getCompositionMzsxiRA$foundation != null) {
            imeReplace(textFieldBuffer, TextRange.m10546getStartimpl(textRangeM3474getCompositionMzsxiRA$foundation.m10550unboximpl()), TextRange.m10541getEndimpl(textRangeM3474getCompositionMzsxiRA$foundation.m10550unboximpl()), str);
        } else {
            imeReplace(textFieldBuffer, TextRange.m10544getMinimpl(textFieldBuffer.m3476getSelectiond9O1mEE()), TextRange.m10543getMaximpl(textFieldBuffer.m3476getSelectiond9O1mEE()), str);
        }
        textFieldBuffer.m3478setSelection5zctL8(TextRangeKt.TextRange(n.j(i2 > 0 ? (r0 + i2) - 1 : (TextRange.m10544getMinimpl(textFieldBuffer.m3476getSelectiond9O1mEE()) + i2) - str.length(), 0, textFieldBuffer.getLength())));
        return ab.f48028a;
    }

    public static final void deleteSurroundingText(final ImeEditCommandScope imeEditCommandScope, final int i2, final int i3) {
        imeEditCommandScope.edit(new l() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt$$ExternalSyntheticLambda4
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return ImeEditCommand_androidKt.deleteSurroundingText$lambda$0(i2, i3, imeEditCommandScope, (TextFieldBuffer) obj);
            }
        });
    }

    static final ab deleteSurroundingText$lambda$0(int i2, int i3, ImeEditCommandScope imeEditCommandScope, TextFieldBuffer textFieldBuffer) {
        if (i2 < 0 || i3 < 0) {
            InlineClassHelperKt.throwIllegalArgumentException("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i2 + " and " + i3 + " respectively.");
        }
        long jMo3513mapToTransformedGEjPoXI = imeEditCommandScope.mo3513mapToTransformedGEjPoXI(textFieldBuffer.m3476getSelectiond9O1mEE());
        int iM10543getMaximpl = TextRange.m10543getMaximpl(jMo3513mapToTransformedGEjPoXI);
        int transformedLength = iM10543getMaximpl + i3;
        if (((i3 ^ transformedLength) & (iM10543getMaximpl ^ transformedLength)) < 0) {
            transformedLength = imeEditCommandScope.getTransformedLength();
        }
        long jMo3512mapFromTransformedGEjPoXI = imeEditCommandScope.mo3512mapFromTransformedGEjPoXI(TextRangeKt.TextRange(TextRange.m10543getMaximpl(jMo3513mapToTransformedGEjPoXI), Math.min(transformedLength, imeEditCommandScope.getTransformedLength())));
        imeDelete(textFieldBuffer, TextRange.m10544getMinimpl(jMo3512mapFromTransformedGEjPoXI), TextRange.m10543getMaximpl(jMo3512mapFromTransformedGEjPoXI));
        int iM10544getMinimpl = TextRange.m10544getMinimpl(jMo3513mapToTransformedGEjPoXI);
        int i4 = iM10544getMinimpl - i2;
        if (((i2 ^ iM10544getMinimpl) & (iM10544getMinimpl ^ i4)) < 0) {
            i4 = 0;
        }
        long jMo3512mapFromTransformedGEjPoXI2 = imeEditCommandScope.mo3512mapFromTransformedGEjPoXI(TextRangeKt.TextRange(Math.max(0, i4), TextRange.m10544getMinimpl(jMo3513mapToTransformedGEjPoXI)));
        imeDelete(textFieldBuffer, TextRange.m10544getMinimpl(jMo3512mapFromTransformedGEjPoXI2), TextRange.m10543getMaximpl(jMo3512mapFromTransformedGEjPoXI2));
        return ab.f48028a;
    }

    public static final void deleteSurroundingTextInCodePoints(ImeEditCommandScope imeEditCommandScope, final int i2, final int i3) {
        imeEditCommandScope.edit(new l() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return ImeEditCommand_androidKt.deleteSurroundingTextInCodePoints$lambda$0(i2, i3, (TextFieldBuffer) obj);
            }
        });
    }

    static final ab deleteSurroundingTextInCodePoints$lambda$0(int i2, int i3, TextFieldBuffer textFieldBuffer) {
        int i4 = 0;
        if (i2 < 0 || i3 < 0) {
            InlineClassHelperKt.throwIllegalArgumentException("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i2 + " and " + i3 + " respectively.");
        }
        int i5 = 0;
        int iM10544getMinimpl = 0;
        while (true) {
            if (i5 < i2) {
                int i6 = iM10544getMinimpl + 1;
                if (TextRange.m10544getMinimpl(textFieldBuffer.m3476getSelectiond9O1mEE()) <= i6) {
                    iM10544getMinimpl = TextRange.m10544getMinimpl(textFieldBuffer.m3476getSelectiond9O1mEE());
                    break;
                }
                iM10544getMinimpl = isSurrogatePair(textFieldBuffer.asCharSequence().charAt((TextRange.m10544getMinimpl(textFieldBuffer.m3476getSelectiond9O1mEE()) - i6) + (-1)), textFieldBuffer.asCharSequence().charAt(TextRange.m10544getMinimpl(textFieldBuffer.m3476getSelectiond9O1mEE()) - i6)) ? iM10544getMinimpl + 2 : i6;
                i5++;
            } else {
                break;
            }
        }
        int length = 0;
        while (true) {
            if (i4 >= i3) {
                break;
            }
            int i7 = length + 1;
            if (TextRange.m10543getMaximpl(textFieldBuffer.m3476getSelectiond9O1mEE()) + i7 >= textFieldBuffer.getLength()) {
                length = textFieldBuffer.getLength() - TextRange.m10543getMaximpl(textFieldBuffer.m3476getSelectiond9O1mEE());
                break;
            }
            length = isSurrogatePair(textFieldBuffer.asCharSequence().charAt((TextRange.m10543getMaximpl(textFieldBuffer.m3476getSelectiond9O1mEE()) + i7) + (-1)), textFieldBuffer.asCharSequence().charAt(TextRange.m10543getMaximpl(textFieldBuffer.m3476getSelectiond9O1mEE()) + i7)) ? length + 2 : i7;
            i4++;
        }
        imeDelete(textFieldBuffer, TextRange.m10543getMaximpl(textFieldBuffer.m3476getSelectiond9O1mEE()), TextRange.m10543getMaximpl(textFieldBuffer.m3476getSelectiond9O1mEE()) + length);
        imeDelete(textFieldBuffer, TextRange.m10544getMinimpl(textFieldBuffer.m3476getSelectiond9O1mEE()) - iM10544getMinimpl, TextRange.m10544getMinimpl(textFieldBuffer.m3476getSelectiond9O1mEE()));
        return ab.f48028a;
    }

    public static final void finishComposingText(ImeEditCommandScope imeEditCommandScope) {
        imeEditCommandScope.edit(new l() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt$$ExternalSyntheticLambda5
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return ImeEditCommand_androidKt.finishComposingText$lambda$0((TextFieldBuffer) obj);
            }
        });
    }

    static final ab finishComposingText$lambda$0(TextFieldBuffer textFieldBuffer) {
        textFieldBuffer.commitComposition$foundation();
        return ab.f48028a;
    }

    public static final void imeDelete(TextFieldBuffer textFieldBuffer, int i2, int i3) {
        TextRange textRangeM3474getCompositionMzsxiRA$foundation = textFieldBuffer.m3474getCompositionMzsxiRA$foundation();
        int iMin = Math.min(i2, i3);
        int iMax = Math.max(i2, i3);
        TextFieldBufferKt.delete(textFieldBuffer, iMin, iMax);
        if (textRangeM3474getCompositionMzsxiRA$foundation != null) {
            long jM3482adjustTextRangevJH6DeI = TextFieldBufferKt.m3482adjustTextRangevJH6DeI(textRangeM3474getCompositionMzsxiRA$foundation.m10550unboximpl(), iMin, iMax, 0);
            if (TextRange.m10540getCollapsedimpl(jM3482adjustTextRangevJH6DeI)) {
                textFieldBuffer.commitComposition$foundation();
            } else {
                TextFieldBuffer.setComposition$foundation$default(textFieldBuffer, TextRange.m10544getMinimpl(jM3482adjustTextRangevJH6DeI), TextRange.m10543getMaximpl(jM3482adjustTextRangevJH6DeI), null, 4, null);
            }
        }
    }

    public static final void imeReplace(TextFieldBuffer textFieldBuffer, int i2, int i3, CharSequence charSequence) {
        TextFieldBuffer textFieldBuffer2;
        int iMin = Math.min(i2, i3);
        int iMax = Math.max(i2, i3);
        int i4 = 0;
        int i5 = iMin;
        while (i5 < iMax && i4 < charSequence.length() && charSequence.charAt(i4) == textFieldBuffer.asCharSequence().charAt(i5)) {
            i4++;
            i5++;
        }
        int length = charSequence.length();
        int i6 = iMax;
        while (i6 > i5 && length > i4) {
            int i7 = length - 1;
            int i8 = i6 - 1;
            if (charSequence.charAt(i7) != textFieldBuffer.asCharSequence().charAt(i8)) {
                break;
            }
            length = i7;
            i6 = i8;
        }
        if (i5 == i6 && i4 == length) {
            textFieldBuffer.commitComposition$foundation();
            textFieldBuffer.clearHighlight$foundation();
            textFieldBuffer2 = textFieldBuffer;
        } else {
            CharSequence charSequenceSubSequence = (i4 == 0 && length == charSequence.length()) ? charSequence : charSequence.subSequence(i4, length);
            textFieldBuffer2 = textFieldBuffer;
            TextFieldBuffer.replace$foundation$default(textFieldBuffer2, i5, i6, charSequenceSubSequence, 0, 0, false, 24, null);
        }
        textFieldBuffer2.m3478setSelection5zctL8(TextRangeKt.TextRange(iMin + charSequence.length()));
    }

    private static final boolean isSurrogatePair(char c2, char c3) {
        return Character.isHighSurrogate(c2) && Character.isLowSurrogate(c3);
    }

    public static final void setComposingRegion(final ImeEditCommandScope imeEditCommandScope, final int i2, final int i3) {
        imeEditCommandScope.edit(new l() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt$$ExternalSyntheticLambda6
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return ImeEditCommand_androidKt.setComposingRegion$lambda$0(i2, i3, imeEditCommandScope, (TextFieldBuffer) obj);
            }
        });
    }

    static final ab setComposingRegion$lambda$0(int i2, int i3, ImeEditCommandScope imeEditCommandScope, TextFieldBuffer textFieldBuffer) {
        if (textFieldBuffer.hasComposition$foundation()) {
            textFieldBuffer.commitComposition$foundation();
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (i3 < 0) {
            i3 = 0;
        }
        long jMo3512mapFromTransformedGEjPoXI = imeEditCommandScope.mo3512mapFromTransformedGEjPoXI(TextRangeKt.TextRange(i2, i3));
        int iJ = n.j(TextRange.m10544getMinimpl(jMo3512mapFromTransformedGEjPoXI), 0, textFieldBuffer.getLength());
        int iJ2 = n.j(TextRange.m10543getMaximpl(jMo3512mapFromTransformedGEjPoXI), 0, textFieldBuffer.getLength());
        if (iJ != iJ2) {
            if (iJ < iJ2) {
                TextFieldBuffer.setComposition$foundation$default(textFieldBuffer, iJ, iJ2, null, 4, null);
            } else {
                TextFieldBuffer.setComposition$foundation$default(textFieldBuffer, iJ2, iJ, null, 4, null);
            }
        }
        return ab.f48028a;
    }

    public static final void setComposingText(ImeEditCommandScope imeEditCommandScope, final String str, final int i2, final List<AnnotatedString.Range<AnnotatedString.Annotation>> list) {
        imeEditCommandScope.edit(new l() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt$$ExternalSyntheticLambda2
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return ImeEditCommand_androidKt.setComposingText$lambda$0(str, list, i2, (TextFieldBuffer) obj);
            }
        });
    }

    public static /* synthetic */ void setComposingText$default(ImeEditCommandScope imeEditCommandScope, String str, int i2, List list, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            list = null;
        }
        setComposingText(imeEditCommandScope, str, i2, list);
    }

    static final ab setComposingText$lambda$0(String str, List list, int i2, TextFieldBuffer textFieldBuffer) {
        TextRange textRangeM3474getCompositionMzsxiRA$foundation = textFieldBuffer.m3474getCompositionMzsxiRA$foundation();
        if (textRangeM3474getCompositionMzsxiRA$foundation != null) {
            String str2 = str;
            imeReplace(textFieldBuffer, TextRange.m10546getStartimpl(textRangeM3474getCompositionMzsxiRA$foundation.m10550unboximpl()), TextRange.m10541getEndimpl(textRangeM3474getCompositionMzsxiRA$foundation.m10550unboximpl()), str2);
            if (str2.length() > 0) {
                textFieldBuffer.setComposition$foundation(TextRange.m10546getStartimpl(textRangeM3474getCompositionMzsxiRA$foundation.m10550unboximpl()), TextRange.m10546getStartimpl(textRangeM3474getCompositionMzsxiRA$foundation.m10550unboximpl()) + str.length(), list);
            }
        } else {
            int iM10544getMinimpl = TextRange.m10544getMinimpl(textFieldBuffer.m3476getSelectiond9O1mEE());
            String str3 = str;
            imeReplace(textFieldBuffer, iM10544getMinimpl, TextRange.m10543getMaximpl(textFieldBuffer.m3476getSelectiond9O1mEE()), str3);
            if (str3.length() > 0) {
                textFieldBuffer.setComposition$foundation(iM10544getMinimpl, str.length() + iM10544getMinimpl, list);
            }
        }
        textFieldBuffer.m3478setSelection5zctL8(TextRangeKt.TextRange(n.j(i2 > 0 ? (r5 + i2) - 1 : (TextRange.m10544getMinimpl(textFieldBuffer.m3476getSelectiond9O1mEE()) + i2) - str.length(), 0, textFieldBuffer.getLength())));
        return ab.f48028a;
    }

    public static final void setSelection(final ImeEditCommandScope imeEditCommandScope, final int i2, final int i3) {
        imeEditCommandScope.edit(new l() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return ImeEditCommand_androidKt.setSelection$lambda$0(imeEditCommandScope, i2, i3, (TextFieldBuffer) obj);
            }
        });
    }

    static final ab setSelection$lambda$0(ImeEditCommandScope imeEditCommandScope, int i2, int i3, TextFieldBuffer textFieldBuffer) {
        long jMo3513mapToTransformedGEjPoXI = imeEditCommandScope.mo3513mapToTransformedGEjPoXI(TextRangeKt.TextRange(0, textFieldBuffer.getLength()));
        int iM10544getMinimpl = TextRange.m10544getMinimpl(jMo3513mapToTransformedGEjPoXI);
        int iM10543getMaximpl = TextRange.m10543getMaximpl(jMo3513mapToTransformedGEjPoXI);
        if (i2 < iM10544getMinimpl) {
            i2 = iM10544getMinimpl;
        }
        if (i2 <= iM10543getMaximpl) {
            iM10543getMaximpl = i2;
        }
        int iM10544getMinimpl2 = TextRange.m10544getMinimpl(jMo3513mapToTransformedGEjPoXI);
        int iM10543getMaximpl2 = TextRange.m10543getMaximpl(jMo3513mapToTransformedGEjPoXI);
        if (i3 < iM10544getMinimpl2) {
            i3 = iM10544getMinimpl2;
        }
        if (i3 <= iM10543getMaximpl2) {
            iM10543getMaximpl2 = i3;
        }
        textFieldBuffer.m3478setSelection5zctL8(imeEditCommandScope.mo3512mapFromTransformedGEjPoXI(TextRangeKt.TextRange(iM10543getMaximpl, iM10543getMaximpl2)));
        return ab.f48028a;
    }
}
