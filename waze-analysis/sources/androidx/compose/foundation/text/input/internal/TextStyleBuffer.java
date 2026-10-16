package androidx.compose.foundation.text.input.internal;

import androidx.collection.MutableIntList;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.input.ExpandPolicy;
import androidx.compose.foundation.text.input.LiveRange;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import h.a.i;
import h.g.b.o;
import h.g.b.x;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextStyleBuffer<T> {
    public static final int $stable = 8;
    private int gapEnd;
    private int gapStart;
    private final IntIntervalTree<T> intervalTree;
    private final boolean mutable;

    /* JADX WARN: Multi-variable type inference failed */
    public TextStyleBuffer(TextStyleBuffer<T> textStyleBuffer, boolean z) {
        int i2;
        IntIntervalTree<T> intIntervalTree;
        this.mutable = z;
        this.intervalTree = (textStyleBuffer == null || (intIntervalTree = textStyleBuffer.intervalTree) == null) ? new IntIntervalTree<>(null, 1, 0 == true ? 1 : 0) : intIntervalTree.copy();
        if (textStyleBuffer != null) {
            this.gapStart = textStyleBuffer.gapStart;
            i2 = textStyleBuffer.gapEnd;
        } else {
            this.gapStart = 0;
            i2 = 1000;
        }
        this.gapEnd = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void deleteAfterGap(int r22) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.TextStyleBuffer.deleteAfterGap(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void deleteBeforeGap(int r22) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.TextStyleBuffer.deleteBeforeGap(int):void");
    }

    private final void deleteText(int i2, int i3) {
        int i4 = this.gapStart;
        if (i2 < i4 && i3 <= i4) {
            moveGapLeft(i4 - i3);
            deleteBeforeGap(i3 - i2);
        } else if (i2 >= i4 || i3 < i4) {
            moveGapRight(i2 - i4);
            deleteAfterGap(i3 - i2);
        } else {
            deleteBeforeGap(i4 - i2);
            deleteAfterGap(i3 - i4);
        }
    }

    private final void enlargeGapIfNeeded(int i2) {
        int i3;
        if (!this.intervalTree.isEmpty() && getGapLength() < i2) {
            int gapLength = getGapLength() - i2;
            IntIntervalTree<T> intIntervalTree = this.intervalTree;
            int i4 = this.gapStart;
            MutableIntList tempArray = intIntervalTree.getTempArray();
            if (!Node.m3640equalsimpl0(intIntervalTree.m3587getRoot27flxzM(), intIntervalTree.m3590getTerminator27flxzM()) && intIntervalTree.m3582getMax330cO7A(intIntervalTree.m3587getRoot27flxzM()) >= i4) {
                intIntervalTree.m3583getMin330cO7A(intIntervalTree.m3587getRoot27flxzM());
                int iM3587getRoot27flxzM = intIntervalTree.m3587getRoot27flxzM();
                loop0: while (true) {
                    boolean z = false;
                    while (!Node.m3640equalsimpl0(iM3587getRoot27flxzM, intIntervalTree.m3590getTerminator27flxzM())) {
                        if (z) {
                            if (!z) {
                                if (!Node.m3640equalsimpl0(intIntervalTree.m3585getParentbLpG9ms(iM3587getRoot27flxzM), intIntervalTree.m3590getTerminator27flxzM())) {
                                    z = true != Node.m3640equalsimpl0(iM3587getRoot27flxzM, intIntervalTree.m3581getLeftbLpG9ms(intIntervalTree.m3585getParentbLpG9ms(iM3587getRoot27flxzM))) ? 2 : true;
                                }
                                iM3587getRoot27flxzM = intIntervalTree.m3585getParentbLpG9ms(iM3587getRoot27flxzM);
                            } else {
                                intIntervalTree.m3588getStart330cO7A(iM3587getRoot27flxzM);
                                if (intIntervalTree.m3576getEnd330cO7A(iM3587getRoot27flxzM) >= i4) {
                                    tempArray.add(iM3587getRoot27flxzM);
                                }
                                if (Node.m3640equalsimpl0(intIntervalTree.m3586getRightbLpG9ms(iM3587getRoot27flxzM), intIntervalTree.m3590getTerminator27flxzM()) || intIntervalTree.m3582getMax330cO7A(intIntervalTree.m3586getRightbLpG9ms(iM3587getRoot27flxzM)) < i4) {
                                    z = 2;
                                } else {
                                    intIntervalTree.m3583getMin330cO7A(intIntervalTree.m3586getRightbLpG9ms(iM3587getRoot27flxzM));
                                    iM3587getRoot27flxzM = intIntervalTree.m3586getRightbLpG9ms(iM3587getRoot27flxzM);
                                }
                            }
                        } else if (Node.m3640equalsimpl0(intIntervalTree.m3581getLeftbLpG9ms(iM3587getRoot27flxzM), intIntervalTree.m3590getTerminator27flxzM()) || intIntervalTree.m3582getMax330cO7A(intIntervalTree.m3581getLeftbLpG9ms(iM3587getRoot27flxzM)) < i4) {
                            z = true;
                        } else {
                            iM3587getRoot27flxzM = intIntervalTree.m3581getLeftbLpG9ms(iM3587getRoot27flxzM);
                        }
                    }
                    break loop0;
                }
            }
            int i5 = tempArray._size;
            int i6 = i4;
            int i7 = 0;
            int i8 = 0;
            while (true) {
                i3 = gapLength + 1000;
                if (i7 >= i5) {
                    break;
                }
                int i9 = tempArray.get(i7);
                long jM3589getStartEnd6gIMNq8 = intIntervalTree.m3589getStartEnd6gIMNq8(i9);
                int iM3618getStartimpl = Interval.m3618getStartimpl(jM3589getStartEnd6gIMNq8);
                int i10 = this.gapStart;
                long jM3610constructorimpl = Interval.m3610constructorimpl(iM3618getStartimpl > i10 ? Interval.m3618getStartimpl(jM3589getStartEnd6gIMNq8) + i3 : Interval.m3618getStartimpl(jM3589getStartEnd6gIMNq8), Interval.m3615getEndimpl(jM3589getStartEnd6gIMNq8) > i10 ? Interval.m3615getEndimpl(jM3589getStartEnd6gIMNq8) + i3 : Interval.m3615getEndimpl(jM3589getStartEnd6gIMNq8), TextStyleBufferKt.m3704getStartExpandsw2M8Wck(jM3589getStartEnd6gIMNq8), TextStyleBufferKt.m3703getEndExpandsw2M8Wck(jM3589getStartEnd6gIMNq8));
                int iM3588getStart330cO7A = intIntervalTree.m3588getStart330cO7A(i9);
                intIntervalTree.m3606setStartEndlzRq0xI(i9, jM3610constructorimpl);
                intIntervalTree.m3569updateNodeMinMax330cO7A(i9);
                int iM3618getStartimpl2 = Interval.m3618getStartimpl(jM3610constructorimpl);
                if (iM3618getStartimpl2 >= Interval.m3615getEndimpl(jM3610constructorimpl)) {
                    intIntervalTree.m3558detachNode330cO7A(i9);
                    intIntervalTree.m3559disposeNode9hnwElY(i9, false);
                } else if (iM3618getStartimpl2 < i6 || (iM3618getStartimpl2 != iM3588getStart330cO7A && iM3588getStart330cO7A < i4)) {
                    intIntervalTree.m3558detachNode330cO7A(i9);
                    tempArray.set(i8, tempArray.get(i7));
                    i8++;
                } else {
                    i6 = iM3618getStartimpl2;
                }
                i7++;
            }
            for (int i11 = 0; i11 < i8; i11++) {
                int i12 = tempArray.get(i11);
                intIntervalTree.m3598setColor9hnwElY(i12, 0);
                intIntervalTree.m3602setMinMaxlzRq0xI(i12, intIntervalTree.m3589getStartEnd6gIMNq8(i12));
                intIntervalTree.m3601setLeftcfX_BQo(i12, intIntervalTree.m3590getTerminator27flxzM());
                intIntervalTree.m3604setRightcfX_BQo(i12, intIntervalTree.m3590getTerminator27flxzM());
                intIntervalTree.m3574attachNode330cO7A(i12);
            }
            tempArray.clear();
            intIntervalTree.cleanDeletedNodesIfNeeded();
            this.gapEnd += i3;
        }
    }

    private final int gapBufferToOriginalIndex(int i2) {
        return i2 <= this.gapStart ? i2 : i2 - getGapLength();
    }

    private final int getGapLength() {
        return this.gapEnd - this.gapStart;
    }

    private final void moveGapLeft(int i2) {
        int iM3618getStartimpl;
        int iM3615getEndimpl;
        if (i2 == 0) {
            return;
        }
        int i3 = this.gapStart;
        int i4 = i3 - i2;
        IntIntervalTree<T> intIntervalTree = this.intervalTree;
        MutableIntList tempArray = intIntervalTree.getTempArray();
        if (!Node.m3640equalsimpl0(intIntervalTree.m3587getRoot27flxzM(), intIntervalTree.m3590getTerminator27flxzM()) && intIntervalTree.m3582getMax330cO7A(intIntervalTree.m3587getRoot27flxzM()) >= i4 && intIntervalTree.m3583getMin330cO7A(intIntervalTree.m3587getRoot27flxzM()) <= i3) {
            int iM3587getRoot27flxzM = intIntervalTree.m3587getRoot27flxzM();
            loop0: while (true) {
                boolean z = false;
                while (!Node.m3640equalsimpl0(iM3587getRoot27flxzM, intIntervalTree.m3590getTerminator27flxzM())) {
                    if (z) {
                        if (!z) {
                            if (!Node.m3640equalsimpl0(intIntervalTree.m3585getParentbLpG9ms(iM3587getRoot27flxzM), intIntervalTree.m3590getTerminator27flxzM())) {
                                z = true != Node.m3640equalsimpl0(iM3587getRoot27flxzM, intIntervalTree.m3581getLeftbLpG9ms(intIntervalTree.m3585getParentbLpG9ms(iM3587getRoot27flxzM))) ? 2 : true;
                            }
                            iM3587getRoot27flxzM = intIntervalTree.m3585getParentbLpG9ms(iM3587getRoot27flxzM);
                        } else {
                            if (intIntervalTree.m3588getStart330cO7A(iM3587getRoot27flxzM) <= i3 && intIntervalTree.m3576getEnd330cO7A(iM3587getRoot27flxzM) >= i4) {
                                tempArray.add(iM3587getRoot27flxzM);
                            }
                            if (Node.m3640equalsimpl0(intIntervalTree.m3586getRightbLpG9ms(iM3587getRoot27flxzM), intIntervalTree.m3590getTerminator27flxzM()) || intIntervalTree.m3582getMax330cO7A(intIntervalTree.m3586getRightbLpG9ms(iM3587getRoot27flxzM)) < i4 || intIntervalTree.m3583getMin330cO7A(intIntervalTree.m3586getRightbLpG9ms(iM3587getRoot27flxzM)) > i3) {
                                z = 2;
                            } else {
                                iM3587getRoot27flxzM = intIntervalTree.m3586getRightbLpG9ms(iM3587getRoot27flxzM);
                            }
                        }
                    } else if (Node.m3640equalsimpl0(intIntervalTree.m3581getLeftbLpG9ms(iM3587getRoot27flxzM), intIntervalTree.m3590getTerminator27flxzM()) || intIntervalTree.m3582getMax330cO7A(intIntervalTree.m3581getLeftbLpG9ms(iM3587getRoot27flxzM)) < i4) {
                        z = true;
                    } else {
                        iM3587getRoot27flxzM = intIntervalTree.m3581getLeftbLpG9ms(iM3587getRoot27flxzM);
                    }
                }
                break loop0;
            }
        }
        int i5 = tempArray._size;
        int i6 = i4;
        int i7 = 0;
        for (int i8 = 0; i8 < i5; i8++) {
            int i9 = tempArray.get(i8);
            long jM3589getStartEnd6gIMNq8 = intIntervalTree.m3589getStartEnd6gIMNq8(i9);
            if (Interval.m3618getStartimpl(jM3589getStartEnd6gIMNq8) == i4 && TextStyleBufferKt.m3704getStartExpandsw2M8Wck(jM3589getStartEnd6gIMNq8)) {
                iM3618getStartimpl = Interval.m3618getStartimpl(jM3589getStartEnd6gIMNq8);
            } else {
                int i10 = this.gapStart;
                int iM3618getStartimpl2 = Interval.m3618getStartimpl(jM3589getStartEnd6gIMNq8);
                iM3618getStartimpl = (i4 > iM3618getStartimpl2 || iM3618getStartimpl2 > i10) ? Interval.m3618getStartimpl(jM3589getStartEnd6gIMNq8) : Interval.m3618getStartimpl(jM3589getStartEnd6gIMNq8) + getGapLength();
            }
            if (Interval.m3615getEndimpl(jM3589getStartEnd6gIMNq8) != i4 || TextStyleBufferKt.m3703getEndExpandsw2M8Wck(jM3589getStartEnd6gIMNq8)) {
                int i11 = this.gapStart;
                int iM3615getEndimpl2 = Interval.m3615getEndimpl(jM3589getStartEnd6gIMNq8);
                iM3615getEndimpl = (i4 > iM3615getEndimpl2 || iM3615getEndimpl2 > i11) ? Interval.m3615getEndimpl(jM3589getStartEnd6gIMNq8) : Interval.m3615getEndimpl(jM3589getStartEnd6gIMNq8) + getGapLength();
            } else {
                iM3615getEndimpl = Interval.m3615getEndimpl(jM3589getStartEnd6gIMNq8);
            }
            long jM3610constructorimpl = Interval.m3610constructorimpl(iM3618getStartimpl, iM3615getEndimpl, TextStyleBufferKt.m3704getStartExpandsw2M8Wck(jM3589getStartEnd6gIMNq8), TextStyleBufferKt.m3703getEndExpandsw2M8Wck(jM3589getStartEnd6gIMNq8));
            int iM3588getStart330cO7A = intIntervalTree.m3588getStart330cO7A(i9);
            intIntervalTree.m3606setStartEndlzRq0xI(i9, jM3610constructorimpl);
            intIntervalTree.m3569updateNodeMinMax330cO7A(i9);
            int iM3618getStartimpl3 = Interval.m3618getStartimpl(jM3610constructorimpl);
            if (iM3618getStartimpl3 >= Interval.m3615getEndimpl(jM3610constructorimpl)) {
                intIntervalTree.m3558detachNode330cO7A(i9);
                intIntervalTree.m3559disposeNode9hnwElY(i9, false);
            } else if (iM3618getStartimpl3 < i6 || iM3618getStartimpl3 > i3 || (iM3618getStartimpl3 != iM3588getStart330cO7A && iM3588getStart330cO7A < i4)) {
                intIntervalTree.m3558detachNode330cO7A(i9);
                tempArray.set(i7, tempArray.get(i8));
                i7++;
            } else {
                i6 = iM3618getStartimpl3;
            }
        }
        for (int i12 = 0; i12 < i7; i12++) {
            int i13 = tempArray.get(i12);
            intIntervalTree.m3598setColor9hnwElY(i13, 0);
            intIntervalTree.m3602setMinMaxlzRq0xI(i13, intIntervalTree.m3589getStartEnd6gIMNq8(i13));
            intIntervalTree.m3601setLeftcfX_BQo(i13, intIntervalTree.m3590getTerminator27flxzM());
            intIntervalTree.m3604setRightcfX_BQo(i13, intIntervalTree.m3590getTerminator27flxzM());
            intIntervalTree.m3574attachNode330cO7A(i13);
        }
        tempArray.clear();
        intIntervalTree.cleanDeletedNodesIfNeeded();
        this.gapStart -= i2;
        this.gapEnd -= i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void moveGapRight(int r17) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.TextStyleBuffer.moveGapRight(int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int originalIndexToGapBuffer(int i2, boolean z, boolean z2) {
        int i3 = this.gapStart;
        return i2 >= i3 ? (i2 != i3 || (z ^ z2)) ? i2 + getGapLength() : i2 : i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: addStyle-l7BaIrg, reason: not valid java name */
    public final /* synthetic */ <R extends T> LiveRange<R> m3695addStylel7BaIrg(R r, long j2) {
        if (!this.mutable) {
            InlineClassHelperKt.throwIllegalStateException("This TextStyleBuffer is immutable");
        }
        return new LiveRange<>(getIntervalTree().m3573addIntervalZYjWoSQ(r, Interval.m3610constructorimpl(originalIndexToGapBuffer(Interval.m3618getStartimpl(j2), true, TextStyleBufferKt.m3704getStartExpandsw2M8Wck(j2)), originalIndexToGapBuffer(Interval.m3615getEndimpl(j2), false, TextStyleBufferKt.m3703getEndExpandsw2M8Wck(j2)), TextStyleBufferKt.m3704getStartExpandsw2M8Wck(j2), TextStyleBufferKt.m3703getEndExpandsw2M8Wck(j2))), null);
    }

    public final void clear() {
        this.intervalTree.clear();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStyleBuffer)) {
            return false;
        }
        TextStyleBuffer textStyleBuffer = (TextStyleBuffer) obj;
        if (this.gapStart == textStyleBuffer.gapStart && this.gapEnd == textStyleBuffer.gapEnd) {
            return x.n(this.intervalTree, textStyleBuffer.intervalTree);
        }
        return false;
    }

    /* renamed from: getActiveIntervalHandle-tAAvWxc$foundation, reason: not valid java name */
    public final long m3696getActiveIntervalHandletAAvWxc$foundation(LiveRange<?> liveRange) {
        liveRange.m3469setIntervalHandleNDTVn_k$foundation(this.intervalTree.m3596refreshIntervalHandleM8hg4EM(liveRange.m3468getIntervalHandlemo69AQQ$foundation()));
        if (IntervalHandle.m3627equalsimpl0(liveRange.m3468getIntervalHandlemo69AQQ$foundation(), IntervalHandle.Companion.m3633getInvalidmo69AQQ())) {
            throw new IllegalStateException("LiveRange is not found.");
        }
        return liveRange.m3468getIntervalHandlemo69AQQ$foundation();
    }

    public final List<AnnotatedString.Range<T>> getAllStyles() {
        T tM3579getItem330cO7A;
        ArrayList arrayList = new ArrayList();
        IntIntervalTree<T> intIntervalTree = this.intervalTree;
        if (!Node.m3640equalsimpl0(intIntervalTree.m3587getRoot27flxzM(), intIntervalTree.m3590getTerminator27flxzM())) {
            for (int i2 = 4; i2 < ((IntIntervalTree) intIntervalTree).nodeInfo._size; i2 += 4) {
                if (!intIntervalTree.m3591isDeleted330cO7A(i2) && (tM3579getItem330cO7A = intIntervalTree.m3579getItem330cO7A(i2)) != null) {
                    long jM3589getStartEnd6gIMNq8 = intIntervalTree.m3589getStartEnd6gIMNq8(i2);
                    arrayList.add(new AnnotatedString.Range(tM3579getItem330cO7A, gapBufferToOriginalIndex(Interval.m3618getStartimpl(jM3589getStartEnd6gIMNq8)), gapBufferToOriginalIndex(Interval.m3615getEndimpl(jM3589getStartEnd6gIMNq8))));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: getExpandPolicy-DIMv-cw$foundation, reason: not valid java name */
    public final int m3697getExpandPolicyDIMvcw$foundation(LiveRange<?> liveRange) {
        long jM3578getIntervalveTUMZY = this.intervalTree.m3578getIntervalveTUMZY(m3696getActiveIntervalHandletAAvWxc$foundation(liveRange));
        return ExpandPolicy.m3456constructorimpl(TextStyleBufferKt.m3704getStartExpandsw2M8Wck(jM3578getIntervalveTUMZY), TextStyleBufferKt.m3703getEndExpandsw2M8Wck(jM3578getIntervalveTUMZY));
    }

    public final int getGapEnd() {
        return this.gapEnd;
    }

    public final int getGapStart() {
        return this.gapStart;
    }

    public final IntIntervalTree<T> getIntervalTree() {
        return this.intervalTree;
    }

    public final /* synthetic */ <R extends T> R getItem$foundation(LiveRange liveRange) {
        IntIntervalTree<T> intervalTree = getIntervalTree();
        long jM3696getActiveIntervalHandletAAvWxc$foundation = m3696getActiveIntervalHandletAAvWxc$foundation(liveRange);
        if (IntervalHandle.m3627equalsimpl0(jM3696getActiveIntervalHandletAAvWxc$foundation, IntervalHandle.Companion.m3633getInvalidmo69AQQ())) {
            return null;
        }
        T tM3579getItem330cO7A = intervalTree.m3579getItem330cO7A(intervalTree.m3560findNodevbMxnkM(jM3696getActiveIntervalHandletAAvWxc$foundation));
        x.i();
        return tM3579getItem330cO7A;
    }

    /* renamed from: getRange--jx7JFs$foundation, reason: not valid java name */
    public final long m3698getRangejx7JFs$foundation(LiveRange<?> liveRange) {
        long jM3578getIntervalveTUMZY = this.intervalTree.m3578getIntervalveTUMZY(m3696getActiveIntervalHandletAAvWxc$foundation(liveRange));
        return TextRangeKt.TextRange(gapBufferToOriginalIndex(Interval.m3618getStartimpl(jM3578getIntervalveTUMZY)), gapBufferToOriginalIndex(Interval.m3615getEndimpl(jM3578getIntervalveTUMZY)));
    }

    public final /* synthetic */ <R extends T> List<LiveRange<R>> getStyles(int i2, int i3) {
        int iOriginalIndexToGapBuffer;
        int iOriginalIndexToGapBuffer2;
        if (i2 > i3) {
            return i.h();
        }
        if (i2 == i3 && i2 == getGapStart()) {
            iOriginalIndexToGapBuffer = getGapEnd();
            iOriginalIndexToGapBuffer2 = getGapEnd();
        } else {
            iOriginalIndexToGapBuffer = originalIndexToGapBuffer(i2, true, true);
            iOriginalIndexToGapBuffer2 = originalIndexToGapBuffer(i3, false, true);
        }
        IntIntervalTree<T> intervalTree = getIntervalTree();
        MutableIntList tempArray = intervalTree.getTempArray();
        if (!Node.m3640equalsimpl0(intervalTree.m3587getRoot27flxzM(), intervalTree.m3590getTerminator27flxzM()) && intervalTree.m3582getMax330cO7A(intervalTree.m3587getRoot27flxzM()) >= iOriginalIndexToGapBuffer && intervalTree.m3583getMin330cO7A(intervalTree.m3587getRoot27flxzM()) <= iOriginalIndexToGapBuffer2) {
            int iM3587getRoot27flxzM = intervalTree.m3587getRoot27flxzM();
            loop0: while (true) {
                boolean z = false;
                while (!Node.m3640equalsimpl0(iM3587getRoot27flxzM, intervalTree.m3590getTerminator27flxzM())) {
                    if (z) {
                        if (!z) {
                            if (!Node.m3640equalsimpl0(intervalTree.m3585getParentbLpG9ms(iM3587getRoot27flxzM), intervalTree.m3590getTerminator27flxzM())) {
                                z = true != Node.m3640equalsimpl0(iM3587getRoot27flxzM, intervalTree.m3581getLeftbLpG9ms(intervalTree.m3585getParentbLpG9ms(iM3587getRoot27flxzM))) ? 2 : true;
                            }
                            iM3587getRoot27flxzM = intervalTree.m3585getParentbLpG9ms(iM3587getRoot27flxzM);
                        } else {
                            if (intervalTree.m3594overlapsXzpGiIY(iM3587getRoot27flxzM, iOriginalIndexToGapBuffer, iOriginalIndexToGapBuffer2)) {
                                T tM3579getItem330cO7A = intervalTree.m3579getItem330cO7A(iM3587getRoot27flxzM);
                                x.i();
                                if (tM3579getItem330cO7A instanceof Object) {
                                    tempArray.add(iM3587getRoot27flxzM);
                                }
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
                break loop0;
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
        ArrayList arrayList2 = arrayList;
        tempArray.clear();
        return arrayList2;
    }

    public int hashCode() {
        return (((this.intervalTree.hashCode() * 31) + this.gapStart) * 31) + this.gapEnd;
    }

    public final boolean isRemoved$foundation(LiveRange<?> liveRange) {
        liveRange.m3469setIntervalHandleNDTVn_k$foundation(this.intervalTree.m3596refreshIntervalHandleM8hg4EM(liveRange.m3468getIntervalHandlemo69AQQ$foundation()));
        return IntervalHandle.m3627equalsimpl0(liveRange.m3468getIntervalHandlemo69AQQ$foundation(), IntervalHandle.Companion.m3633getInvalidmo69AQQ());
    }

    public final int nextTransition(int i2, int i3) {
        if (i3 < i2) {
            throw new IllegalArgumentException("limit (" + i3 + ") cannot be less than start (" + i2 + ')');
        }
        if (i2 == i3) {
            return i3;
        }
        int i4 = this.gapStart;
        if (i2 >= i4) {
            i2 += getGapLength();
        }
        if (i3 >= i4) {
            i3 += getGapLength();
        }
        return gapBufferToOriginalIndex(this.intervalTree.nextTransition(i2, i3));
    }

    public final int previousTransition(int i2, int i3) {
        if (i3 > i2) {
            throw new IllegalArgumentException("limit (" + i3 + ") cannot be greater than start (" + i2 + ')');
        }
        if (i2 == i3) {
            return i3;
        }
        int i4 = this.gapStart;
        if (i2 > i4) {
            i2 += getGapLength();
        }
        if (i3 > i4) {
            i3 += getGapLength();
        }
        return gapBufferToOriginalIndex(this.intervalTree.previousTransition(i2, i3));
    }

    public final boolean removeStyle(LiveRange<?> liveRange) {
        if (!this.mutable) {
            InlineClassHelperKt.throwIllegalStateException("This buffer is immutable");
        }
        return this.intervalTree.m3597removeIntervalNDTVn_k(liveRange.m3468getIntervalHandlemo69AQQ$foundation());
    }

    public final boolean replaceText(int i2, int i3, int i4) {
        if (!this.mutable) {
            InlineClassHelperKt.throwIllegalStateException("This buffer is immutable");
        }
        if (this.intervalTree.isEmpty()) {
            return false;
        }
        enlargeGapIfNeeded(i4 - (i3 - i2));
        deleteText(i2, i3);
        this.gapStart += i4;
        return true;
    }

    /* renamed from: setExpandPolicy-JFYQ5Ro$foundation, reason: not valid java name */
    public final void m3699setExpandPolicyJFYQ5Ro$foundation(LiveRange<?> liveRange, int i2) {
        if (!this.mutable) {
            InlineClassHelperKt.throwIllegalStateException("This TextStyleBuffer is immutable");
        }
        long jM3578getIntervalveTUMZY = this.intervalTree.m3578getIntervalveTUMZY(m3696getActiveIntervalHandletAAvWxc$foundation(liveRange));
        this.intervalTree.m3607updateIntervaldxd_mtc(m3696getActiveIntervalHandletAAvWxc$foundation(liveRange), Interval.m3610constructorimpl(Interval.m3618getStartimpl(jM3578getIntervalveTUMZY), Interval.m3615getEndimpl(jM3578getIntervalveTUMZY), ExpandPolicy.m3460getStartExpandsimpl$foundation(i2), ExpandPolicy.m3459getEndExpandsimpl$foundation(i2)));
    }

    public final void setGapEnd(int i2) {
        this.gapEnd = i2;
    }

    public final void setGapStart(int i2) {
        this.gapStart = i2;
    }

    public final <R extends T> void setItem$foundation(LiveRange<R> liveRange, R r) {
        if (!this.mutable) {
            InlineClassHelperKt.throwIllegalStateException("This TextStyleBuffer is immutable");
        }
        this.intervalTree.m3608updateItemXc3goxU(m3696getActiveIntervalHandletAAvWxc$foundation(liveRange), r);
    }

    /* renamed from: setRange-FDrldGo$foundation, reason: not valid java name */
    public final void m3700setRangeFDrldGo$foundation(LiveRange<?> liveRange, long j2) {
        if (!this.mutable) {
            InlineClassHelperKt.throwIllegalStateException("This TextStyleBuffer is immutable");
        }
        if (TextRange.m10546getStartimpl(j2) >= TextRange.m10541getEndimpl(j2)) {
            throw new IllegalArgumentException("Reversed or collapsed range is not accepted.");
        }
        long jM3578getIntervalveTUMZY = this.intervalTree.m3578getIntervalveTUMZY(m3696getActiveIntervalHandletAAvWxc$foundation(liveRange));
        this.intervalTree.m3607updateIntervaldxd_mtc(m3696getActiveIntervalHandletAAvWxc$foundation(liveRange), Interval.m3610constructorimpl(originalIndexToGapBuffer(TextRange.m10546getStartimpl(j2), true, TextStyleBufferKt.m3704getStartExpandsw2M8Wck(jM3578getIntervalveTUMZY)), originalIndexToGapBuffer(TextRange.m10541getEndimpl(j2), false, TextStyleBufferKt.m3703getEndExpandsw2M8Wck(jM3578getIntervalveTUMZY)), TextStyleBufferKt.m3704getStartExpandsw2M8Wck(jM3578getIntervalveTUMZY), TextStyleBufferKt.m3703getEndExpandsw2M8Wck(jM3578getIntervalveTUMZY)));
    }

    public final void syncTo(TextStyleBuffer<T> textStyleBuffer) {
        if (!this.mutable) {
            InlineClassHelperKt.throwIllegalStateException("This buffer is immutable");
        }
        this.gapStart = textStyleBuffer.gapStart;
        this.gapEnd = textStyleBuffer.gapEnd;
        this.intervalTree.syncTo(textStyleBuffer.intervalTree);
    }

    public final TextStyleBuffer<T> toImmutable() {
        return new TextStyleBuffer<>(this, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TextStyleBuffer() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ TextStyleBuffer(TextStyleBuffer textStyleBuffer, boolean z, int i2, o oVar) {
        this(1 == (i2 & 1) ? null : textStyleBuffer, z | (!((i2 & 2) == 0)));
    }
}
