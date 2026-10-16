package androidx.compose.foundation.text.input;

import androidx.collection.MutableIntList;
import androidx.compose.foundation.ComposeFoundationFlags;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.input.internal.ChangeTracker;
import androidx.compose.foundation.text.input.internal.IntIntervalTree;
import androidx.compose.foundation.text.input.internal.Interval;
import androidx.compose.foundation.text.input.internal.IntervalHandle;
import androidx.compose.foundation.text.input.internal.Node;
import androidx.compose.foundation.text.input.internal.OffsetMappingCalculator;
import androidx.compose.foundation.text.input.internal.PartialGapBuffer;
import androidx.compose.foundation.text.input.internal.TextStyleBuffer;
import androidx.compose.foundation.text.input.internal.TextStyleBufferKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.ParagraphStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import h.a.i;
import h.g.a.l;
import h.g.b.o;
import h.k;
import h.k.n;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextFieldBuffer implements Appendable {
    public static final int $stable = 8;
    private ChangeTracker backingChangeTracker;
    private final PartialGapBuffer buffer;
    private boolean canCallAddStyle;
    private MutableVector<AnnotatedString.Range<AnnotatedString.Annotation>> composingAnnotations;
    private TextRange composition;
    private k<TextHighlightType, TextRange> highlight;
    private final OffsetMappingCalculator offsetMappingCalculator;
    private final TextFieldCharSequence originalValue;
    private List<AnnotatedString.Range<AnnotatedString.Annotation>> outputTransformationAnnotations;
    private long selectionInChars;
    private TextStyleBuffer<AnnotatedString.Annotation> textStyleBuffer;

    /* compiled from: WazeSource */
    public interface ChangeList {
        int getChangeCount();

        /* renamed from: getOriginalRange--jx7JFs, reason: not valid java name */
        long mo3480getOriginalRangejx7JFs(int i2);

        /* renamed from: getRange--jx7JFs, reason: not valid java name */
        long mo3481getRangejx7JFs(int i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [h.g.b.o] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public TextFieldBuffer(final TextFieldCharSequence textFieldCharSequence, ChangeTracker changeTracker, TextFieldCharSequence textFieldCharSequence2, OffsetMappingCalculator offsetMappingCalculator) {
        this.originalValue = textFieldCharSequence2;
        this.offsetMappingCalculator = offsetMappingCalculator;
        this.buffer = new PartialGapBuffer(textFieldCharSequence);
        MutableVector<AnnotatedString.Range<AnnotatedString.Annotation>> mutableVector = 0;
        mutableVector = 0;
        this.textStyleBuffer = textFieldCharSequence.getTextStyleBuffer() != null ? new TextStyleBuffer<>(textFieldCharSequence.getTextStyleBuffer(), false, 2, mutableVector) : null;
        this.backingChangeTracker = changeTracker != null ? new ChangeTracker(changeTracker) : null;
        this.selectionInChars = textFieldCharSequence.m3484getSelectiond9O1mEE();
        this.composition = textFieldCharSequence.m3483getCompositionMzsxiRA();
        List<AnnotatedString.Range<AnnotatedString.Annotation>> composingAnnotations = textFieldCharSequence.getComposingAnnotations();
        if (composingAnnotations != null && !composingAnnotations.isEmpty()) {
            int size = textFieldCharSequence.getComposingAnnotations().size();
            l lVar = new l() { // from class: androidx.compose.foundation.text.input.TextFieldBuffer$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return textFieldCharSequence.getComposingAnnotations().get(((Integer) obj).intValue());
                }
            };
            AnnotatedString.Range[] rangeArr = new AnnotatedString.Range[size];
            for (int i2 = 0; i2 < size; i2++) {
                rangeArr[i2] = (AnnotatedString.Range) lVar.invoke(Integer.valueOf(i2));
            }
            mutableVector = new MutableVector(rangeArr, size);
        }
        this.composingAnnotations = mutableVector;
        this.canCallAddStyle = this.offsetMappingCalculator != null;
    }

    private final void clearChangeList() {
        getChangeTracker$foundation().clearChanges();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTextWillChange(int i2, int i3, int i4, boolean z) {
        getChangeTracker$foundation().trackChange(i2, i3, i4, z);
        OffsetMappingCalculator offsetMappingCalculator = this.offsetMappingCalculator;
        if (offsetMappingCalculator != null) {
            offsetMappingCalculator.recordEditOperation(i2, i3, i4);
        }
        this.selectionInChars = TextFieldBufferKt.m3482adjustTextRangevJH6DeI(m3476getSelectiond9O1mEE(), i2, i3, i4);
        TextStyleBuffer<AnnotatedString.Annotation> textStyleBuffer = this.textStyleBuffer;
        if (textStyleBuffer != null) {
            textStyleBuffer.replaceText(i2, i3, i4);
        }
    }

    public static /* synthetic */ void replace$foundation$default(TextFieldBuffer textFieldBuffer, int i2, int i3, CharSequence charSequence, int i4, int i5, boolean z, int i6, Object obj) {
        if ((i6 & 16) != 0) {
            i5 = charSequence.length();
        }
        textFieldBuffer.replace$foundation(i2, i3, charSequence, (i6 & 8) != 0 ? 0 : i4, i5, ((i6 & 32) == 0) & z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final TextStyleBuffer<AnnotatedString.Annotation> requireTextFieldBuffer() {
        TextStyleBuffer<AnnotatedString.Annotation> textStyleBuffer = this.textStyleBuffer;
        if (textStyleBuffer != null) {
            return textStyleBuffer;
        }
        TextStyleBuffer<AnnotatedString.Annotation> textStyleBuffer2 = new TextStyleBuffer<>(null, false, 3, 0 == true ? 1 : 0);
        this.textStyleBuffer = textStyleBuffer2;
        return textStyleBuffer2;
    }

    private final void requireValidIndex(int i2, boolean z, boolean z2) {
        int length = getLength();
        if (!z2) {
            length++;
        }
        int i3 = true != z ? -1 : 0;
        if (i3 > i2 || i2 >= length) {
            InlineClassHelperKt.throwIllegalArgumentException("Expected " + i2 + " to be in [" + i3 + ", " + length + ')');
        }
    }

    /* renamed from: requireValidRange-5zc-tL8, reason: not valid java name */
    private final void m3470requireValidRange5zctL8(long j2) {
        long jTextRange = TextRangeKt.TextRange(0, getLength());
        if (TextRange.m10536contains5zctL8(jTextRange, j2)) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("Expected " + ((Object) TextRange.m10549toStringimpl(j2)) + " to be in " + ((Object) TextRange.m10549toStringimpl(jTextRange)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setComposition$foundation$default(TextFieldBuffer textFieldBuffer, int i2, int i3, List list, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            list = null;
        }
        textFieldBuffer.setComposition$foundation(i2, i3, list);
    }

    /* renamed from: setComposition-OEnZFl4, reason: not valid java name */
    private final void m3471setCompositionOEnZFl4(TextRange textRange) {
        if (textRange != null && !TextRange.m10540getCollapsedimpl(textRange.m10550unboximpl())) {
            this.composition = textRange;
            return;
        }
        this.composition = null;
        MutableVector<AnnotatedString.Range<AnnotatedString.Annotation>> mutableVector = this.composingAnnotations;
        if (mutableVector != null) {
            mutableVector.clear();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028 A[PHI: r10
  0x0028: PHI (r10v1 java.util.List) = (r10v0 java.util.List), (r10v2 java.util.List) binds: [B:9:0x0013, B:13:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: toTextFieldCharSequence-wFTz33Y$foundation$default, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ androidx.compose.foundation.text.input.TextFieldCharSequence m3472toTextFieldCharSequencewFTz33Y$foundation$default(androidx.compose.foundation.text.input.TextFieldBuffer r6, long r7, androidx.compose.ui.text.TextRange r9, java.util.List r10, java.util.List r11, int r12, java.lang.Object r13) {
        /*
            r13 = r12 & 1
            if (r13 == 0) goto L8
            long r7 = r6.m3476getSelectiond9O1mEE()
        L8:
            r1 = r7
            r7 = r12 & 2
            if (r7 == 0) goto Lf
            androidx.compose.ui.text.TextRange r9 = r6.composition
        Lf:
            r3 = r9
            r7 = r12 & 4
            r8 = 0
            if (r7 == 0) goto L28
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.text.AnnotatedString$Range<androidx.compose.ui.text.AnnotatedString$Annotation>> r7 = r6.composingAnnotations
            if (r7 == 0) goto L26
            java.util.List r10 = r7.asMutableList()
            r7 = r10
            java.util.Collection r7 = (java.util.Collection) r7
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L28
        L26:
            r4 = r8
            goto L29
        L28:
            r4 = r10
        L29:
            r7 = r12 & 8
            if (r7 == 0) goto L2f
            r5 = r8
            goto L30
        L2f:
            r5 = r11
        L30:
            r0 = r6
            androidx.compose.foundation.text.input.TextFieldCharSequence r6 = r0.m3479toTextFieldCharSequencewFTz33Y$foundation(r1, r3, r4, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.TextFieldBuffer.m3472toTextFieldCharSequencewFTz33Y$foundation$default(androidx.compose.foundation.text.input.TextFieldBuffer, long, androidx.compose.ui.text.TextRange, java.util.List, java.util.List, int, java.lang.Object):androidx.compose.foundation.text.input.TextFieldCharSequence");
    }

    public final void addAnnotation$foundation(AnnotatedString.Annotation annotation, int i2, int i3) {
        if (!this.canCallAddStyle) {
            InlineClassHelperKt.throwIllegalStateException("You can add styling to a [TextFieldBuffer] only from an [OutputTransformation].");
        }
        ArrayList arrayList = this.outputTransformationAnnotations;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.outputTransformationAnnotations = arrayList;
        }
        if (arrayList != null) {
            arrayList.add(new AnnotatedString.Range<>(annotation, i2, i3));
        }
    }

    /* renamed from: addAnnotationToBuffer-D-rsaOQ$foundation, reason: not valid java name */
    public final /* synthetic */ <T extends AnnotatedString.Annotation> LiveRange<T> m3473addAnnotationToBufferDrsaOQ$foundation(T t, int i2, int i3, int i4) {
        getChangeTracker$foundation().trackChange(i2, i3, i3 - i2, false);
        TextStyleBuffer textStyleBufferRequireTextFieldBuffer = requireTextFieldBuffer();
        if (!textStyleBufferRequireTextFieldBuffer.mutable) {
            InlineClassHelperKt.throwIllegalStateException("This TextStyleBuffer is immutable");
        }
        long jM3610constructorimpl = Interval.m3610constructorimpl(i2, i3, ExpandPolicy.m3460getStartExpandsimpl$foundation(i4), ExpandPolicy.m3459getEndExpandsimpl$foundation(i4));
        return new LiveRange<>(textStyleBufferRequireTextFieldBuffer.getIntervalTree().m3573addIntervalZYjWoSQ(t, Interval.m3610constructorimpl(textStyleBufferRequireTextFieldBuffer.originalIndexToGapBuffer(Interval.m3618getStartimpl(jM3610constructorimpl), true, TextStyleBufferKt.m3704getStartExpandsw2M8Wck(jM3610constructorimpl)), textStyleBufferRequireTextFieldBuffer.originalIndexToGapBuffer(Interval.m3615getEndimpl(jM3610constructorimpl), false, TextStyleBufferKt.m3703getEndExpandsw2M8Wck(jM3610constructorimpl)), TextStyleBufferKt.m3704getStartExpandsw2M8Wck(jM3610constructorimpl), TextStyleBufferKt.m3703getEndExpandsw2M8Wck(jM3610constructorimpl))), null);
    }

    public final void addStyle(ParagraphStyle paragraphStyle, int i2, int i3) {
        if (!ComposeFoundationFlags.isBasicTextFieldStyledTextEnabled) {
            addAnnotation$foundation(paragraphStyle, i2, i3);
            return;
        }
        ParagraphStyle paragraphStyle2 = paragraphStyle;
        int iM3465getAtEndRfBwNNI = ExpandPolicy.Companion.m3465getAtEndRfBwNNI();
        getChangeTracker$foundation().trackChange(i2, i3, i3 - i2, false);
        TextStyleBuffer textStyleBufferRequireTextFieldBuffer = requireTextFieldBuffer();
        long jM3610constructorimpl = Interval.m3610constructorimpl(i2, i3, ExpandPolicy.m3460getStartExpandsimpl$foundation(iM3465getAtEndRfBwNNI), ExpandPolicy.m3459getEndExpandsimpl$foundation(iM3465getAtEndRfBwNNI));
        if (!textStyleBufferRequireTextFieldBuffer.mutable) {
            InlineClassHelperKt.throwIllegalStateException("This TextStyleBuffer is immutable");
        }
        textStyleBufferRequireTextFieldBuffer.getIntervalTree().m3573addIntervalZYjWoSQ(paragraphStyle2, Interval.m3610constructorimpl(textStyleBufferRequireTextFieldBuffer.originalIndexToGapBuffer(Interval.m3618getStartimpl(jM3610constructorimpl), true, TextStyleBufferKt.m3704getStartExpandsw2M8Wck(jM3610constructorimpl)), textStyleBufferRequireTextFieldBuffer.originalIndexToGapBuffer(Interval.m3615getEndimpl(jM3610constructorimpl), false, TextStyleBufferKt.m3703getEndExpandsw2M8Wck(jM3610constructorimpl)), TextStyleBufferKt.m3704getStartExpandsw2M8Wck(jM3610constructorimpl), TextStyleBufferKt.m3703getEndExpandsw2M8Wck(jM3610constructorimpl)));
    }

    @Override // java.lang.Appendable
    public Appendable append(char c2) {
        onTextWillChange(getLength(), getLength(), 1, false);
        PartialGapBuffer partialGapBuffer = this.buffer;
        PartialGapBuffer.replace$default(partialGapBuffer, partialGapBuffer.length(), partialGapBuffer.length(), String.valueOf(c2), 0, 0, 24, null);
        return this;
    }

    public final CharSequence asCharSequence() {
        return this.buffer;
    }

    public final char charAt(int i2) {
        return this.buffer.charAt(i2);
    }

    public final void clearHighlight$foundation() {
        this.highlight = null;
    }

    public final void commitComposition$foundation() {
        m3471setCompositionOEnZFl4(null);
    }

    public final boolean getCanCallAddStyle$foundation() {
        return this.canCallAddStyle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ChangeTracker getChangeTracker$foundation() {
        ChangeTracker changeTracker = this.backingChangeTracker;
        if (changeTracker != null) {
            return changeTracker;
        }
        ChangeTracker changeTracker2 = new ChangeTracker(null, 1, 0 == true ? 1 : 0);
        this.backingChangeTracker = changeTracker2;
        return changeTracker2;
    }

    public final ChangeList getChanges() {
        return getChangeTracker$foundation();
    }

    public final MutableVector<AnnotatedString.Range<AnnotatedString.Annotation>> getComposingAnnotations$foundation() {
        return this.composingAnnotations;
    }

    /* renamed from: getComposition-MzsxiRA$foundation, reason: not valid java name */
    public final TextRange m3474getCompositionMzsxiRA$foundation() {
        return this.composition;
    }

    public final k<TextHighlightType, TextRange> getHighlight$foundation() {
        return this.highlight;
    }

    public final int getLength() {
        return this.buffer.length();
    }

    /* renamed from: getOriginalSelection-d9O1mEE, reason: not valid java name */
    public final long m3475getOriginalSelectiond9O1mEE() {
        return this.originalValue.m3484getSelectiond9O1mEE();
    }

    public final CharSequence getOriginalText() {
        return this.originalValue.getText();
    }

    public final TextFieldCharSequence getOriginalValue$foundation() {
        return this.originalValue;
    }

    public final List<AnnotatedString.Range<AnnotatedString.Annotation>> getOutputTransformationAnnotations$foundation() {
        return this.outputTransformationAnnotations;
    }

    public final List<AnnotatedString.Range<ParagraphStyle>> getParagraphStyles$foundation(int i2, int i3) {
        int iOriginalIndexToGapBuffer;
        int iOriginalIndexToGapBuffer2;
        ArrayList arrayListH;
        ParagraphStyle paragraphStyle;
        AnnotatedString.Range range;
        TextStyleBuffer<AnnotatedString.Annotation> textStyleBuffer = this.textStyleBuffer;
        if (textStyleBuffer == null) {
            return i.h();
        }
        if (i2 > i3) {
            arrayListH = i.h();
        } else {
            if (i2 == i3 && i2 == textStyleBuffer.getGapStart()) {
                iOriginalIndexToGapBuffer = textStyleBuffer.getGapEnd();
                iOriginalIndexToGapBuffer2 = textStyleBuffer.getGapEnd();
            } else {
                iOriginalIndexToGapBuffer = textStyleBuffer.originalIndexToGapBuffer(i2, true, true);
                iOriginalIndexToGapBuffer2 = textStyleBuffer.originalIndexToGapBuffer(i3, false, true);
            }
            IntIntervalTree<AnnotatedString.Annotation> intervalTree = textStyleBuffer.getIntervalTree();
            MutableIntList tempArray = intervalTree.getTempArray();
            if (!Node.m3640equalsimpl0(intervalTree.m3587getRoot27flxzM(), intervalTree.m3590getTerminator27flxzM()) && intervalTree.m3582getMax330cO7A(intervalTree.m3587getRoot27flxzM()) >= iOriginalIndexToGapBuffer && intervalTree.m3583getMin330cO7A(intervalTree.m3587getRoot27flxzM()) <= iOriginalIndexToGapBuffer2) {
                int iM3587getRoot27flxzM = intervalTree.m3587getRoot27flxzM();
                loop1: while (true) {
                    boolean z = false;
                    while (!Node.m3640equalsimpl0(iM3587getRoot27flxzM, intervalTree.m3590getTerminator27flxzM())) {
                        if (z) {
                            if (!z) {
                                if (!Node.m3640equalsimpl0(intervalTree.m3585getParentbLpG9ms(iM3587getRoot27flxzM), intervalTree.m3590getTerminator27flxzM())) {
                                    z = true != Node.m3640equalsimpl0(iM3587getRoot27flxzM, intervalTree.m3581getLeftbLpG9ms(intervalTree.m3585getParentbLpG9ms(iM3587getRoot27flxzM))) ? 2 : true;
                                }
                                iM3587getRoot27flxzM = intervalTree.m3585getParentbLpG9ms(iM3587getRoot27flxzM);
                            } else {
                                if (intervalTree.m3594overlapsXzpGiIY(iM3587getRoot27flxzM, iOriginalIndexToGapBuffer, iOriginalIndexToGapBuffer2) && (intervalTree.m3579getItem330cO7A(iM3587getRoot27flxzM) instanceof ParagraphStyle)) {
                                    tempArray.add(iM3587getRoot27flxzM);
                                }
                                if (Node.m3640equalsimpl0(intervalTree.m3586getRightbLpG9ms(iM3587getRoot27flxzM), intervalTree.m3590getTerminator27flxzM()) || intervalTree.m3582getMax330cO7A(intervalTree.m3586getRightbLpG9ms(iM3587getRoot27flxzM)) < iOriginalIndexToGapBuffer || intervalTree.m3583getMin330cO7A(intervalTree.m3586getRightbLpG9ms(iM3587getRoot27flxzM)) > iOriginalIndexToGapBuffer2) {
                                    z = 2;
                                } else {
                                    iM3587getRoot27flxzM = intervalTree.m3586getRightbLpG9ms(iM3587getRoot27flxzM);
                                }
                            }
                        } else if (Node.m3640equalsimpl0(intervalTree.m3581getLeftbLpG9ms(iM3587getRoot27flxzM), intervalTree.m3590getTerminator27flxzM()) || intervalTree.m3582getMax330cO7A(intervalTree.m3581getLeftbLpG9ms(iM3587getRoot27flxzM)) < iOriginalIndexToGapBuffer) {
                            z = true;
                        } else {
                            iM3587getRoot27flxzM = intervalTree.m3581getLeftbLpG9ms(iM3587getRoot27flxzM);
                        }
                    }
                    break loop1;
                }
            }
            tempArray.sort();
            int i4 = tempArray._size;
            ArrayList arrayList = new ArrayList(i4);
            for (int i5 = 0; i5 < i4; i5++) {
                int i6 = tempArray.get(i5);
                if (intervalTree.m3579getItem330cO7A(i6) == null) {
                    throw new IllegalStateException("IntIntervalTree's item should not be null");
                }
                arrayList.add(new LiveRange(IntervalHandle.m3624constructorimpl(intervalTree.m3577getId330cO7A(i6), i6), null));
            }
            arrayListH = arrayList;
            tempArray.clear();
        }
        ArrayList arrayList2 = new ArrayList(arrayListH.size());
        int size = arrayListH.size();
        for (int i7 = 0; i7 < size; i7++) {
            LiveRange<?> liveRange = (LiveRange) arrayListH.get(i7);
            IntIntervalTree<AnnotatedString.Annotation> intervalTree2 = textStyleBuffer.getIntervalTree();
            long jM3696getActiveIntervalHandletAAvWxc$foundation = textStyleBuffer.m3696getActiveIntervalHandletAAvWxc$foundation(liveRange);
            if (IntervalHandle.m3627equalsimpl0(jM3696getActiveIntervalHandletAAvWxc$foundation, IntervalHandle.Companion.m3633getInvalidmo69AQQ())) {
                paragraphStyle = null;
            } else {
                AnnotatedString.Annotation annotationM3579getItem330cO7A = intervalTree2.m3579getItem330cO7A(intervalTree2.m3560findNodevbMxnkM(jM3696getActiveIntervalHandletAAvWxc$foundation));
                if (true != (annotationM3579getItem330cO7A instanceof ParagraphStyle)) {
                    annotationM3579getItem330cO7A = null;
                }
                paragraphStyle = (ParagraphStyle) annotationM3579getItem330cO7A;
            }
            if (paragraphStyle == null) {
                range = null;
            } else {
                long jM3698getRangejx7JFs$foundation = textStyleBuffer.m3698getRangejx7JFs$foundation(liveRange);
                range = new AnnotatedString.Range(paragraphStyle, TextRange.m10546getStartimpl(jM3698getRangejx7JFs$foundation), TextRange.m10541getEndimpl(jM3698getRangejx7JFs$foundation));
            }
            if (range != null) {
                arrayList2.add(range);
            }
        }
        return arrayList2;
    }

    /* renamed from: getSelection-d9O1mEE, reason: not valid java name */
    public final long m3476getSelectiond9O1mEE() {
        return this.selectionInChars;
    }

    public final List<AnnotatedString.Range<SpanStyle>> getSpanStyles$foundation(int i2, int i3) {
        int iOriginalIndexToGapBuffer;
        int iOriginalIndexToGapBuffer2;
        ArrayList arrayListH;
        SpanStyle spanStyle;
        AnnotatedString.Range range;
        TextStyleBuffer<AnnotatedString.Annotation> textStyleBuffer = this.textStyleBuffer;
        if (textStyleBuffer == null) {
            return i.h();
        }
        if (i2 > i3) {
            arrayListH = i.h();
        } else {
            if (i2 == i3 && i2 == textStyleBuffer.getGapStart()) {
                iOriginalIndexToGapBuffer = textStyleBuffer.getGapEnd();
                iOriginalIndexToGapBuffer2 = textStyleBuffer.getGapEnd();
            } else {
                iOriginalIndexToGapBuffer = textStyleBuffer.originalIndexToGapBuffer(i2, true, true);
                iOriginalIndexToGapBuffer2 = textStyleBuffer.originalIndexToGapBuffer(i3, false, true);
            }
            IntIntervalTree<AnnotatedString.Annotation> intervalTree = textStyleBuffer.getIntervalTree();
            MutableIntList tempArray = intervalTree.getTempArray();
            if (!Node.m3640equalsimpl0(intervalTree.m3587getRoot27flxzM(), intervalTree.m3590getTerminator27flxzM()) && intervalTree.m3582getMax330cO7A(intervalTree.m3587getRoot27flxzM()) >= iOriginalIndexToGapBuffer && intervalTree.m3583getMin330cO7A(intervalTree.m3587getRoot27flxzM()) <= iOriginalIndexToGapBuffer2) {
                int iM3587getRoot27flxzM = intervalTree.m3587getRoot27flxzM();
                loop1: while (true) {
                    boolean z = false;
                    while (!Node.m3640equalsimpl0(iM3587getRoot27flxzM, intervalTree.m3590getTerminator27flxzM())) {
                        if (z) {
                            if (!z) {
                                if (!Node.m3640equalsimpl0(intervalTree.m3585getParentbLpG9ms(iM3587getRoot27flxzM), intervalTree.m3590getTerminator27flxzM())) {
                                    z = true != Node.m3640equalsimpl0(iM3587getRoot27flxzM, intervalTree.m3581getLeftbLpG9ms(intervalTree.m3585getParentbLpG9ms(iM3587getRoot27flxzM))) ? 2 : true;
                                }
                                iM3587getRoot27flxzM = intervalTree.m3585getParentbLpG9ms(iM3587getRoot27flxzM);
                            } else {
                                if (intervalTree.m3594overlapsXzpGiIY(iM3587getRoot27flxzM, iOriginalIndexToGapBuffer, iOriginalIndexToGapBuffer2) && (intervalTree.m3579getItem330cO7A(iM3587getRoot27flxzM) instanceof SpanStyle)) {
                                    tempArray.add(iM3587getRoot27flxzM);
                                }
                                if (Node.m3640equalsimpl0(intervalTree.m3586getRightbLpG9ms(iM3587getRoot27flxzM), intervalTree.m3590getTerminator27flxzM()) || intervalTree.m3582getMax330cO7A(intervalTree.m3586getRightbLpG9ms(iM3587getRoot27flxzM)) < iOriginalIndexToGapBuffer || intervalTree.m3583getMin330cO7A(intervalTree.m3586getRightbLpG9ms(iM3587getRoot27flxzM)) > iOriginalIndexToGapBuffer2) {
                                    z = 2;
                                } else {
                                    iM3587getRoot27flxzM = intervalTree.m3586getRightbLpG9ms(iM3587getRoot27flxzM);
                                }
                            }
                        } else if (Node.m3640equalsimpl0(intervalTree.m3581getLeftbLpG9ms(iM3587getRoot27flxzM), intervalTree.m3590getTerminator27flxzM()) || intervalTree.m3582getMax330cO7A(intervalTree.m3581getLeftbLpG9ms(iM3587getRoot27flxzM)) < iOriginalIndexToGapBuffer) {
                            z = true;
                        } else {
                            iM3587getRoot27flxzM = intervalTree.m3581getLeftbLpG9ms(iM3587getRoot27flxzM);
                        }
                    }
                    break loop1;
                }
            }
            tempArray.sort();
            int i4 = tempArray._size;
            ArrayList arrayList = new ArrayList(i4);
            for (int i5 = 0; i5 < i4; i5++) {
                int i6 = tempArray.get(i5);
                if (intervalTree.m3579getItem330cO7A(i6) == null) {
                    throw new IllegalStateException("IntIntervalTree's item should not be null");
                }
                arrayList.add(new LiveRange(IntervalHandle.m3624constructorimpl(intervalTree.m3577getId330cO7A(i6), i6), null));
            }
            arrayListH = arrayList;
            tempArray.clear();
        }
        ArrayList arrayList2 = new ArrayList(arrayListH.size());
        int size = arrayListH.size();
        for (int i7 = 0; i7 < size; i7++) {
            LiveRange<?> liveRange = (LiveRange) arrayListH.get(i7);
            IntIntervalTree<AnnotatedString.Annotation> intervalTree2 = textStyleBuffer.getIntervalTree();
            long jM3696getActiveIntervalHandletAAvWxc$foundation = textStyleBuffer.m3696getActiveIntervalHandletAAvWxc$foundation(liveRange);
            if (IntervalHandle.m3627equalsimpl0(jM3696getActiveIntervalHandletAAvWxc$foundation, IntervalHandle.Companion.m3633getInvalidmo69AQQ())) {
                spanStyle = null;
            } else {
                AnnotatedString.Annotation annotationM3579getItem330cO7A = intervalTree2.m3579getItem330cO7A(intervalTree2.m3560findNodevbMxnkM(jM3696getActiveIntervalHandletAAvWxc$foundation));
                if (true != (annotationM3579getItem330cO7A instanceof SpanStyle)) {
                    annotationM3579getItem330cO7A = null;
                }
                spanStyle = (SpanStyle) annotationM3579getItem330cO7A;
            }
            if (spanStyle == null) {
                range = null;
            } else {
                long jM3698getRangejx7JFs$foundation = textStyleBuffer.m3698getRangejx7JFs$foundation(liveRange);
                range = new AnnotatedString.Range(spanStyle, TextRange.m10546getStartimpl(jM3698getRangejx7JFs$foundation), TextRange.m10541getEndimpl(jM3698getRangejx7JFs$foundation));
            }
            if (range != null) {
                arrayList2.add(range);
            }
        }
        return arrayList2;
    }

    public final TextStyleBuffer<AnnotatedString.Annotation> getTextStyleBuffer$foundation() {
        return this.textStyleBuffer;
    }

    public final boolean hasComposition$foundation() {
        return this.composition != null;
    }

    public final boolean hasSelection() {
        return !TextRange.m10540getCollapsedimpl(m3476getSelectiond9O1mEE());
    }

    public final void placeCursorAfterCharAt(int i2) {
        requireValidIndex(i2, false, true);
        this.selectionInChars = TextRangeKt.TextRange(n.i(i2 + 1, getLength()));
    }

    public final void placeCursorBeforeCharAt(int i2) {
        requireValidIndex(i2, true, false);
        this.selectionInChars = TextRangeKt.TextRange(i2);
    }

    public final void replace(int i2, int i3, CharSequence charSequence) {
        replace$foundation$default(this, i2, i3, charSequence, 0, charSequence.length(), false, 32, null);
    }

    public final void replace$foundation(int i2, int i3, CharSequence charSequence, int i4, int i5, boolean z) {
        if (i2 > i3) {
            InlineClassHelperKt.throwIllegalArgumentException("Expected start=" + i2 + " <= end=" + i3);
        }
        if (i4 > i5) {
            InlineClassHelperKt.throwIllegalArgumentException("Expected textStart=" + i4 + " <= textEnd=" + i5);
        }
        int iJ = n.j(i2, 0, getLength());
        int iJ2 = n.j(i3, 0, getLength());
        int iJ3 = n.j(i4, 0, charSequence.length());
        int iJ4 = n.j(i5, 0, charSequence.length());
        onTextWillChange(iJ, iJ2, iJ4 - iJ3, z);
        this.buffer.replace(iJ, iJ2, charSequence, iJ3, iJ4);
        commitComposition$foundation();
        clearHighlight$foundation();
    }

    public final void revertAllChanges() {
        replace(0, getLength(), this.originalValue.toString());
        m3478setSelection5zctL8(this.originalValue.m3484getSelectiond9O1mEE());
        clearChangeList();
        if (ComposeFoundationFlags.isBasicTextFieldStyledTextEnabled) {
            if (this.originalValue.getTextStyleBuffer() != null) {
                requireTextFieldBuffer().syncTo(this.originalValue.getTextStyleBuffer());
                return;
            }
            TextStyleBuffer<AnnotatedString.Annotation> textStyleBuffer = this.textStyleBuffer;
            if (textStyleBuffer != null) {
                textStyleBuffer.clear();
            }
        }
    }

    public final void setCanCallAddStyle$foundation(boolean z) {
        this.canCallAddStyle = z;
    }

    public final void setComposition$foundation(int i2, int i3, List<AnnotatedString.Range<AnnotatedString.Annotation>> list) {
        if (i2 < 0 || i2 > this.buffer.length()) {
            throw new IndexOutOfBoundsException("start (" + i2 + ") offset is outside of text region " + this.buffer.length());
        }
        if (i3 < 0 || i3 > this.buffer.length()) {
            throw new IndexOutOfBoundsException("end (" + i3 + ") offset is outside of text region " + this.buffer.length());
        }
        if (i2 >= i3) {
            throw new IllegalArgumentException("Do not set reversed or empty range: " + i2 + " > " + i3);
        }
        m3471setCompositionOEnZFl4(TextRange.m10534boximpl(TextRangeKt.TextRange(i2, i3)));
        MutableVector<AnnotatedString.Range<AnnotatedString.Annotation>> mutableVector = this.composingAnnotations;
        if (mutableVector != null) {
            mutableVector.clear();
        }
        List<AnnotatedString.Range<AnnotatedString.Annotation>> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        if (this.composingAnnotations == null) {
            this.composingAnnotations = new MutableVector<>(new AnnotatedString.Range[16], 0);
        }
        int size = list2.size();
        for (int i4 = 0; i4 < size; i4++) {
            AnnotatedString.Range<AnnotatedString.Annotation> range = list.get(i4);
            MutableVector<AnnotatedString.Range<AnnotatedString.Annotation>> mutableVector2 = this.composingAnnotations;
            if (mutableVector2 != null) {
                mutableVector2.add(AnnotatedString.Range.copy$default(range, null, range.getStart() + i2, range.getEnd() + i2, null, 9, null));
            }
        }
    }

    /* renamed from: setHighlight-K7f2yys$foundation, reason: not valid java name */
    public final void m3477setHighlightK7f2yys$foundation(int i2, int i3, int i4) {
        if (i3 < i4) {
            this.highlight = new k<>(TextHighlightType.m3490boximpl(i2), TextRange.m10534boximpl(TextRangeKt.TextRange(n.j(i3, 0, getLength()), n.j(i4, 0, getLength()))));
        } else {
            throw new IllegalArgumentException("Do not set reversed or empty range: " + i3 + " > " + i4);
        }
    }

    public final void setOutputTransformationAnnotations$foundation(List<AnnotatedString.Range<AnnotatedString.Annotation>> list) {
        this.outputTransformationAnnotations = list;
    }

    /* renamed from: setSelection-5zc-tL8, reason: not valid java name */
    public final void m3478setSelection5zctL8(long j2) {
        m3470requireValidRange5zctL8(j2);
        this.selectionInChars = j2;
        this.highlight = null;
    }

    public final void setTextIfChanged$foundation(CharSequence charSequence) {
        int i2;
        int i3;
        int i4;
        PartialGapBuffer partialGapBuffer = this.buffer;
        int length = partialGapBuffer.length();
        int length2 = charSequence.length();
        boolean z = false;
        if (partialGapBuffer.length() <= 0 || charSequence.length() <= 0) {
            i2 = length2;
            i3 = 0;
            i4 = 0;
        } else {
            int i5 = 0;
            int i6 = 0;
            boolean z2 = false;
            while (true) {
                if (!z) {
                    if (partialGapBuffer.charAt(i5) == charSequence.charAt(i6)) {
                        i5++;
                        i6++;
                    } else {
                        z = true;
                    }
                }
                if (!z2) {
                    int i7 = length - 1;
                    int i8 = length2 - 1;
                    if (partialGapBuffer.charAt(i7) == charSequence.charAt(i8)) {
                        length = i7;
                        length2 = i8;
                    } else {
                        z2 = true;
                    }
                }
                if (i5 >= length || i6 >= length2 || (z && z2)) {
                    break;
                }
            }
            i3 = i5;
            i2 = length2;
            i4 = i6;
        }
        if (i3 < length || i4 < i2) {
            replace$foundation$default(this, i3, length, charSequence, i4, i2, false, 32, null);
        }
    }

    public final void setTextStyleBuffer$foundation(TextStyleBuffer<AnnotatedString.Annotation> textStyleBuffer) {
        this.textStyleBuffer = textStyleBuffer;
    }

    public String toString() {
        return this.buffer.toString();
    }

    /* renamed from: toTextFieldCharSequence-wFTz33Y$foundation, reason: not valid java name */
    public final TextFieldCharSequence m3479toTextFieldCharSequencewFTz33Y$foundation(long j2, TextRange textRange, List<AnnotatedString.Range<AnnotatedString.Annotation>> list, List<AnnotatedString.Range<AnnotatedString.Annotation>> list2) {
        TextStyleBuffer<AnnotatedString.Annotation> textStyleBuffer;
        String string = this.buffer.toString();
        TextStyleBuffer<AnnotatedString.Annotation> immutable = null;
        if (ComposeFoundationFlags.isBasicTextFieldStyledTextEnabled && (textStyleBuffer = this.textStyleBuffer) != null) {
            immutable = textStyleBuffer.toImmutable();
        }
        return new TextFieldCharSequence(string, j2, textRange, null, list, list2, immutable, 8, null);
    }

    public static /* synthetic */ void getChanges$annotations() {
    }

    @Override // java.lang.Appendable
    public Appendable append(CharSequence charSequence) {
        if (charSequence != null) {
            onTextWillChange(getLength(), getLength(), charSequence.length(), false);
            PartialGapBuffer partialGapBuffer = this.buffer;
            PartialGapBuffer.replace$default(partialGapBuffer, partialGapBuffer.length(), partialGapBuffer.length(), charSequence, 0, 0, 24, null);
        }
        return this;
    }

    @Override // java.lang.Appendable
    public Appendable append(CharSequence charSequence, int i2, int i3) {
        if (charSequence != null) {
            onTextWillChange(getLength(), getLength(), i3 - i2, false);
            PartialGapBuffer partialGapBuffer = this.buffer;
            PartialGapBuffer.replace$default(partialGapBuffer, partialGapBuffer.length(), partialGapBuffer.length(), charSequence.subSequence(i2, i3), 0, 0, 24, null);
        }
        return this;
    }

    public final void addStyle(SpanStyle spanStyle, int i2, int i3) {
        if (ComposeFoundationFlags.isBasicTextFieldStyledTextEnabled) {
            SpanStyle spanStyle2 = spanStyle;
            int iM3465getAtEndRfBwNNI = ExpandPolicy.Companion.m3465getAtEndRfBwNNI();
            getChangeTracker$foundation().trackChange(i2, i3, i3 - i2, false);
            TextStyleBuffer textStyleBufferRequireTextFieldBuffer = requireTextFieldBuffer();
            long jM3610constructorimpl = Interval.m3610constructorimpl(i2, i3, ExpandPolicy.m3460getStartExpandsimpl$foundation(iM3465getAtEndRfBwNNI), ExpandPolicy.m3459getEndExpandsimpl$foundation(iM3465getAtEndRfBwNNI));
            if (!textStyleBufferRequireTextFieldBuffer.mutable) {
                InlineClassHelperKt.throwIllegalStateException("This TextStyleBuffer is immutable");
            }
            textStyleBufferRequireTextFieldBuffer.getIntervalTree().m3573addIntervalZYjWoSQ(spanStyle2, Interval.m3610constructorimpl(textStyleBufferRequireTextFieldBuffer.originalIndexToGapBuffer(Interval.m3618getStartimpl(jM3610constructorimpl), true, TextStyleBufferKt.m3704getStartExpandsw2M8Wck(jM3610constructorimpl)), textStyleBufferRequireTextFieldBuffer.originalIndexToGapBuffer(Interval.m3615getEndimpl(jM3610constructorimpl), false, TextStyleBufferKt.m3703getEndExpandsw2M8Wck(jM3610constructorimpl)), TextStyleBufferKt.m3704getStartExpandsw2M8Wck(jM3610constructorimpl), TextStyleBufferKt.m3703getEndExpandsw2M8Wck(jM3610constructorimpl)));
            return;
        }
        addAnnotation$foundation(spanStyle, i2, i3);
    }

    public /* synthetic */ TextFieldBuffer(TextFieldCharSequence textFieldCharSequence, ChangeTracker changeTracker, TextFieldCharSequence textFieldCharSequence2, OffsetMappingCalculator offsetMappingCalculator, int i2, o oVar) {
        this(textFieldCharSequence, (i2 & 2) != 0 ? null : changeTracker, (i2 & 4) != 0 ? textFieldCharSequence : textFieldCharSequence2, (i2 & 8) != 0 ? null : offsetMappingCalculator);
    }
}
