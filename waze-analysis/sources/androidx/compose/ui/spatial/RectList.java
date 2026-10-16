package androidx.compose.ui.spatial;

import androidx.collection.SieveCacheKt;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.g.a.r;
import h.g.a.s;
import h.g.a.t;
import h.g.b.x;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class RectList {
    public static final int $stable = 8;
    public int itemsSize;
    public long[] items = new long[192];
    public long[] stack = new long[192];

    private final int allocateItemsIndex() {
        long[] jArr = this.items;
        int i2 = this.itemsSize;
        int i3 = i2 + 3;
        this.itemsSize = i3;
        int length = jArr.length;
        if (length <= i3) {
            resizeStorage(length, i2, jArr);
        }
        return i2;
    }

    private final void resizeStorage(int i2, int i3, long[] jArr) {
        int iMax = Math.max(i2 + i2, i3 + 3);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
        x.e(jArrCopyOf, "copyOf(...)");
        this.items = jArrCopyOf;
        long[] jArrCopyOf2 = Arrays.copyOf(this.stack, iMax);
        x.e(jArrCopyOf2, "copyOf(...)");
        this.stack = jArrCopyOf2;
    }

    private final void updateSubhierarchy(long j2, int i2, int i3) {
        int i4;
        long[] jArr;
        char c2;
        char c3;
        long[] jArr2 = this.items;
        long[] jArr3 = this.stack;
        int i5 = this.itemsSize;
        jArr3[0] = j2;
        int i6 = 1;
        while (i6 > 0) {
            i6--;
            long j3 = jArr3[i6];
            int i7 = (int) j3;
            char c4 = 25;
            char c5 = '2';
            int i8 = (int) (j3 >> 25);
            char c6 = 1023;
            int i9 = ((int) (j3 >> 50)) & 1023;
            int i10 = 33554431;
            int i11 = i8 & 33554431;
            int i12 = i9 == 1023 ? i5 : (i9 * 3) + i11;
            while (i11 < i5 - 2 && i11 <= i12) {
                int i13 = i7 & i10;
                int i14 = i11 + 3;
                int i15 = i11 + 2;
                long j4 = jArr2[i15];
                int i16 = i10;
                char c7 = c5;
                if ((((int) (j4 >> c4)) & i16) == i13) {
                    long j5 = jArr2[i11];
                    int i17 = i11 + 1;
                    c2 = c4;
                    long j6 = jArr2[i17];
                    i4 = i5;
                    jArr = jArr2;
                    jArr[i11] = ((((int) (j5 >> 32)) + i2) << 32) | ((((int) j5) + i3) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
                    jArr[i17] = ((((int) (j6 >> 32)) + i2) << 32) | ((((int) j6) + i3) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
                    jArr[i15] = (((j4 >> 63) & 1) << 60) | j4;
                    c3 = 1023;
                    if ((((int) (j4 >> c7)) & 1023) > 0) {
                        jArr3[i6] = (RectListKt.getEverythingButParentId() & j4) | ((i14 & i16) << c2);
                        i6++;
                    }
                } else {
                    i4 = i5;
                    jArr = jArr2;
                    c2 = c4;
                    c3 = c6;
                }
                c5 = c7;
                i10 = i16;
                c4 = c2;
                c6 = c3;
                i11 = i14;
                jArr2 = jArr;
                i5 = i4;
            }
            jArr2 = jArr2;
            i5 = i5;
        }
    }

    public final void clearUpdated() {
        long[] jArr = this.items;
        int i2 = this.itemsSize;
        for (int i3 = 0; i3 < jArr.length - 2 && i3 < i2; i3 += 3) {
            int i4 = i3 + 2;
            jArr[i4] = jArr[i4] & (-1152921504606846977L);
        }
    }

    public final boolean contains(int i2) {
        return indexOf(i2) != -4;
    }

    public final String debugString() {
        StringBuilder sb = new StringBuilder();
        long[] jArr = this.items;
        int i2 = 0;
        for (int i3 = this.itemsSize; i2 < jArr.length - 2 && i2 < i3; i3 = i3) {
            long j2 = jArr[i2];
            long j3 = jArr[i2 + 1];
            long j4 = jArr[i2 + 2];
            sb = sb;
            sb.append("id=" + (((int) j4) & 33554431) + ", rect=[" + ((int) (j2 >> 32)) + ',' + ((int) j2) + ',' + ((int) (j3 >> 32)) + ',' + ((int) j3) + "], parent=" + (((int) (j4 >> 25)) & 33554431) + ", lastChildOffset=" + (((int) (j4 >> 50)) & 1023) + ", updated=" + (((int) (j4 >> 60)) & 1) + ", focusable=" + (((int) (j4 >> 61)) & 1) + ", gesturable=" + (((int) (j4 >> 62)) & 1));
            sb.append('\n');
            i2 += 3;
            jArr = jArr;
        }
        return sb.toString();
    }

    public final void defragment() {
        long[] jArr = this.items;
        int i2 = this.itemsSize;
        long[] jArr2 = this.stack;
        int i3 = 0;
        for (int i4 = 0; i4 < jArr.length - 2 && i3 < jArr2.length - 2 && i4 < i2; i4 += 3) {
            int i5 = i4 + 2;
            if (jArr[i5] != RectListKt.getTombStone()) {
                jArr2[i3] = jArr[i4];
                jArr2[i3 + 1] = jArr[i4 + 1];
                jArr2[i3 + 2] = jArr[i5];
                i3 += 3;
            }
        }
        this.itemsSize = i3;
        this.items = jArr2;
        this.stack = jArr;
    }

    public final void findKNearestNeighbors(int i2, int i3, int i4, int i5, int i6, int i7, t<? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ab> tVar) {
        long[] jArr;
        int[] iArr;
        int i8;
        int i9;
        int[] iArrNeighborsScoredByDistance$ui = neighborsScoredByDistance$ui(i2, i4, i5, i6, i7);
        long[] jArr2 = this.items;
        int i10 = 1;
        int i11 = 0;
        int i12 = 0;
        while (i11 <= i3) {
            int iMin = Integer.MAX_VALUE;
            int i13 = 0;
            while (i13 < iArrNeighborsScoredByDistance$ui.length) {
                int i14 = iArrNeighborsScoredByDistance$ui[i13];
                if (i14 > i10) {
                    iMin = Math.min(iMin, i14);
                }
                if (i14 == i10) {
                    int i15 = i13 * 3;
                    long j2 = jArr2[i15];
                    long j3 = jArr2[i15 + 1];
                    i8 = i10;
                    int i16 = (int) jArr2[i15 + 2];
                    i9 = i11;
                    jArr = jArr2;
                    iArr = iArrNeighborsScoredByDistance$ui;
                    tVar.invoke(Integer.valueOf(i14), Integer.valueOf(i16 & 33554431), Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) j2), Integer.valueOf((int) (j3 >> 32)), Integer.valueOf((int) j3));
                    i12++;
                    if (i12 == i3) {
                        return;
                    }
                } else {
                    jArr = jArr2;
                    iArr = iArrNeighborsScoredByDistance$ui;
                    i8 = i10;
                    i9 = i11;
                }
                i13++;
                i10 = i8;
                iArrNeighborsScoredByDistance$ui = iArr;
                i11 = i9;
                jArr2 = jArr;
            }
            i11++;
            i10 = iMin;
        }
    }

    public final int findNearestNeighbor(int i2, int i3, int i4, int i5, int i6) {
        int length;
        long[] jArr = this.items;
        int i7 = this.itemsSize;
        int i8 = Integer.MAX_VALUE;
        int i9 = 0;
        int i10 = -1;
        while (true) {
            length = jArr.length;
            if (i9 >= length - 2 || i9 >= i7) {
                break;
            }
            long j2 = jArr[i9];
            int i11 = i9 + 1;
            long j3 = jArr[i11];
            int iDistanceScore = RectListKt.distanceScore(i2, i3, i4, i5, i6, (int) (j2 >> 32), (int) j2, (int) (j3 >> 32), (int) j3);
            boolean z = (iDistanceScore > 0) & (iDistanceScore < i8);
            if (true == z) {
                i8 = iDistanceScore;
            }
            if (true == z) {
                i10 = i11;
            }
            i9 += 3;
        }
        if (i10 < 0 || i10 >= length) {
            return -1;
        }
        return ((int) jArr[i10]) & 33554431;
    }

    public final void forEachFocusableIntersection(int i2, int i3, int i4, int i5, l<? super Integer, ab> lVar) {
        int i6;
        long[] jArr;
        int i7 = this.itemsSize;
        int i8 = 0;
        for (long[] jArr2 = this.items; i8 < jArr2.length - 2 && i8 < i7; jArr2 = jArr) {
            long j2 = jArr2[i8 + 2];
            if ((((int) (j2 >> 61)) & 1) != 0) {
                i6 = i7;
                jArr = jArr2;
                long j3 = jArr[i8];
                long j4 = jArr[i8 + 1];
                if (((((((i5 & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (i4 << 32)) - j3) - 4294967297L) | ((j4 - ((i2 << 32) | (i3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE))) - 4294967297L)) & (-9223372034707292160L)) == 0) {
                    lVar.invoke(Integer.valueOf(((int) j2) & 33554431));
                }
                i8 += 3;
                i7 = i6;
            } else {
                i6 = i7;
                jArr = jArr2;
            }
            i8 += 3;
            i7 = i6;
        }
    }

    public final void forEachGesturableIntersection(int i2, int i3, int i4, int i5, l<? super Integer, ab> lVar) {
        int i6;
        long[] jArr;
        int i7 = this.itemsSize;
        int i8 = 0;
        for (long[] jArr2 = this.items; i8 < jArr2.length - 2 && i8 < i7; jArr2 = jArr) {
            long j2 = jArr2[i8 + 2];
            if ((((int) (j2 >> 62)) & 1) != 0) {
                i6 = i7;
                jArr = jArr2;
                long j3 = jArr[i8];
                long j4 = jArr[i8 + 1];
                if (((((((i5 & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (i4 << 32)) - j3) - 4294967297L) | ((j4 - ((i2 << 32) | (i3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE))) - 4294967297L)) & (-9223372034707292160L)) == 0) {
                    lVar.invoke(Integer.valueOf(((int) j2) & 33554431));
                }
                i8 += 3;
                i7 = i6;
            } else {
                i6 = i7;
                jArr = jArr2;
            }
            i8 += 3;
            i7 = i6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void forEachIntersectingRectWithValueAt(int r20, h.g.a.s<? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, h.ab> r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            long[] r2 = r0.items
            int r0 = r0.itemsSize
            r3 = r2[r1]
            int r5 = r1 + 1
            r5 = r2[r5]
            r7 = 0
        Lf:
            int r8 = r2.length
            int r8 = r8 + (-2)
            if (r7 >= r8) goto L6e
            if (r7 >= r0) goto L6e
            int r8 = r7 + 3
            if (r7 != r1) goto L1c
        L1a:
            r10 = r0
            goto L69
        L1c:
            r9 = r2[r7]
            int r11 = r7 + 1
            r11 = r2[r11]
            long r13 = r5 - r9
            long r15 = r11 - r3
            r17 = -4294967297(0xfffffffeffffffff, double:NaN)
            long r13 = r13 + r17
            long r15 = r15 + r17
            long r13 = r13 | r15
            r15 = -9223372034707292160(0x8000000080000000, double:-1.0609978955E-314)
            long r13 = r13 & r15
            r15 = 0
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 != 0) goto L1a
            r13 = 32
            long r14 = r9 >> r13
            int r9 = (int) r9
            r10 = r0
            long r0 = r11 >> r13
            int r11 = (int) r11
            int r7 = r7 + 2
            int r0 = (int) r0
            int r1 = (int) r14
            java.lang.Integer r13 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r9)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r16 = java.lang.Integer.valueOf(r11)
            r0 = r2[r7]
            int r0 = (int) r0
            r1 = 33554431(0x1ffffff, float:9.403954E-38)
            r0 = r0 & r1
            java.lang.Integer r17 = java.lang.Integer.valueOf(r0)
            r12 = r21
            r12.invoke(r13, r14, r15, r16, r17)
        L69:
            r1 = r20
            r7 = r8
            r0 = r10
            goto Lf
        L6e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.spatial.RectList.forEachIntersectingRectWithValueAt(int, h.g.a.s):void");
    }

    public final void forEachIntersection(int i2, int i3, int i4, int i5, l<? super Integer, ab> lVar) {
        long[] jArr = this.items;
        int i6 = this.itemsSize;
        for (int i7 = 0; i7 < i6 - 2 && i7 < i6; i7 += 3) {
            long j2 = jArr[i7];
            long j3 = jArr[i7 + 1];
            if (((((((i5 & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (i4 << 32)) - j2) - 4294967297L) | ((j3 - ((i2 << 32) | (i3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE))) - 4294967297L)) & (-9223372034707292160L)) == 0) {
                lVar.invoke(Integer.valueOf(((int) jArr[i7 + 2]) & 33554431));
            }
        }
    }

    public final void forEachRect(s<? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ab> sVar) {
        long[] jArr = this.items;
        int i2 = this.itemsSize;
        for (int i3 = 0; i3 < jArr.length - 2 && i3 < i2; i3 += 3) {
            long j2 = jArr[i3];
            long j3 = jArr[i3 + 1];
            int i4 = (int) (j2 >> 32);
            sVar.invoke(Integer.valueOf(((int) jArr[i3 + 2]) & 33554431), Integer.valueOf(i4), Integer.valueOf((int) j2), Integer.valueOf((int) (j3 >> 32)), Integer.valueOf((int) j3));
        }
    }

    public final void forEachUpdatedRect(q<? super Integer, ? super Long, ? super Long, ab> qVar) {
        long[] jArr = this.items;
        int i2 = this.itemsSize;
        for (int i3 = 0; i3 < jArr.length - 2 && i3 < i2; i3 += 3) {
            long j2 = jArr[i3 + 2];
            if ((((int) (j2 >> 60)) & 1) != 0) {
                qVar.invoke(Integer.valueOf(((int) j2) & 33554431), Long.valueOf(jArr[i3]), Long.valueOf(jArr[i3 + 1]));
            }
        }
    }

    public final int getSize() {
        return this.itemsSize / 3;
    }

    public final long getTopLeftAt(int i2) {
        return this.items[i2];
    }

    public final int indexOf(int i2) {
        long[] jArr = this.items;
        int i3 = this.itemsSize;
        for (int i4 = 0; i4 < i3 - 2; i4 += 3) {
            if ((33554431 & ((int) jArr[i4 + 2])) == (i2 & 33554431)) {
                return i4;
            }
        }
        return -4;
    }

    public final int insert(int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, boolean z2, boolean z3) {
        long[] jArr = this.items;
        int i9 = this.itemsSize;
        int i10 = i9 + 3;
        this.itemsSize = i10;
        int length = jArr.length;
        if (length <= i10) {
            resizeStorage(length, i9, jArr);
        }
        int i11 = i2 & 33554431;
        long[] jArr2 = this.items;
        jArr2[i9] = (i3 << 32) | (i4 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        jArr2[i9 + 1] = (i5 << 32) | (i6 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        int i12 = i7 & 33554431;
        jArr2[i9 + 2] = ((z3 ? 1L : 0L) << 63) | ((z2 ? 1L : 0L) << 62) | ((z ? 1L : 0L) << 61) | 1152921504606846976L | (Math.min(0, 1023) << 50) | (i12 << 25) | i11;
        if (i7 == -1) {
            return i9;
        }
        int i13 = -4;
        if (i8 == -4) {
            InlineClassHelperKt.throwIllegalStateException("Inserted child " + i11 + " without valid parent index");
        } else {
            i13 = i8;
        }
        int i14 = i13 + 2;
        long j2 = jArr2[i14];
        if ((33554431 & ((int) j2)) != i12) {
            InlineClassHelperKt.throwIllegalStateException("Inserted child " + i11 + " without valid parent index or parent " + i12 + " not found");
        }
        jArr2[i14] = (Math.min((i9 - i13) / 3, 1023) << 50) | (RectListKt.getEverythingButLastChildOffset() & j2);
        return i9;
    }

    public final int insertBasedOnParentOffset(int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, boolean z2, boolean z3) {
        long[] jArr = this.items;
        int i9 = i2 & 33554431;
        if ((((int) jArr[i4 + 2]) & 33554431) != (i3 & 33554431)) {
            InlineClassHelperKt.throwIllegalArgumentException("Inserted child " + i9 + " without valid parent index or parent " + i3 + " not found");
        }
        long j2 = jArr[i4];
        int i10 = (int) j2;
        int i11 = ((int) (j2 >> 32)) + i5;
        int i12 = i10 + i6;
        return insert(i9, i11, i12, i11 + i7, i12 + i8, i3, i4, z, z2, z3);
    }

    public final void markUpdatedAt(int i2) {
        long[] jArr = this.items;
        int i3 = i2 + 2;
        long j2 = jArr[i3];
        jArr[i3] = j2 | (((j2 >> 63) & 1) << 60);
    }

    public final long metaAt(int i2) {
        return this.items[i2 + 2];
    }

    public final void moveAt(int i2, int i3, int i4, int i5, int i6) {
        long[] jArr = this.items;
        long j2 = jArr[i2];
        jArr[i2] = (i3 << 32) | (i4 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        jArr[i2 + 1] = (i6 & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (i5 << 32);
        int i7 = i2 + 2;
        long j3 = jArr[i7];
        jArr[i7] = (((j3 >> 63) & 1) << 60) | j3;
        int i8 = i3 - ((int) (j2 >> 32));
        int i9 = i4 - ((int) j2);
        if (i8 == 0) {
            if (i9 == 0) {
                return;
            } else {
                i8 = 0;
            }
        }
        updateSubhierarchy(j3, i2, i8, i9);
    }

    public final void moveBasedOnParentOffset(int i2, int i3, int i4, int i5, int i6, int i7) {
        long[] jArr = this.items;
        long j2 = jArr[i3];
        long j3 = j2 >> 32;
        long j4 = jArr[i2];
        long j5 = j4 >> 32;
        int i8 = (int) j4;
        int i9 = i2 + 2;
        long j6 = jArr[i9];
        int i10 = ((int) j2) + i5;
        int i11 = ((int) j3) + i4;
        jArr[i2] = (i11 << 32) | (i10 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        jArr[i2 + 1] = ((i10 + i7) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | ((i11 + i6) << 32);
        jArr[i9] = (((j6 >> 63) & 1) << 60) | j6;
        int i12 = i11 - ((int) j5);
        int i13 = i10 - i8;
        if (i12 == 0) {
            if (i13 == 0) {
                return;
            } else {
                i12 = 0;
            }
        }
        updateSubhierarchy(j6, i2, i12, i13);
    }

    public final int[] neighborsScoredByDistance$ui(int i2, int i3, int i4, int i5, int i6) {
        long[] jArr = this.items;
        int i7 = this.itemsSize / 3;
        int[] iArr = new int[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            int i9 = i8 * 3;
            if (i9 < 0 || i9 >= jArr.length - 1) {
                break;
            }
            long j2 = jArr[i9];
            long j3 = jArr[i9 + 1];
            int i10 = (int) (j3 >> 32);
            iArr[i8] = RectListKt.distanceScore(i2, i3, i4, i5, i6, (int) (j2 >> 32), (int) j2, i10, (int) j3);
        }
        return iArr;
    }

    public final void removeAt(int i2) {
        long[] jArr = this.items;
        jArr[i2] = -1;
        jArr[i2 + 1] = -1;
        jArr[i2 + 2] = RectListKt.getTombStone();
    }

    public final void updateAt(int i2, int i3, int i4, int i5, int i6) {
        long j2 = i3;
        long j3 = i4 & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
        long[] jArr = this.items;
        jArr[i2] = j3 | (j2 << 32);
        jArr[i2 + 1] = (i6 & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (i5 << 32);
        int i7 = i2 + 2;
        long j4 = jArr[i7];
        jArr[i7] = j4 | (((j4 >> 63) & 1) << 60);
    }

    public final void updateFlagsAt(int i2, boolean z, boolean z2) {
        long[] jArr = this.items;
        int i3 = i2 + 2;
        long j2 = jArr[i3] & (-6917529027641081857L);
        long j3 = z ? 1L : 0L;
        jArr[i3] = ((z2 ? 1L : 0L) * SieveCacheKt.NodeVisitedBit) | j2 | (j3 * 2305843009213693952L);
    }

    public final void updateHasCallbacksAt(int i2, boolean z) {
        long[] jArr = this.items;
        int i3 = i2 + 2;
        long j2 = jArr[i3] & 8070450532247928831L;
        long j3 = z ? 1L : 0L;
        jArr[i3] = j2 | (1152921504606846976L * j3) | (j3 * Long.MIN_VALUE);
    }

    public final void withRectAt(int i2, r<? super Integer, ? super Integer, ? super Integer, ? super Integer, ab> rVar) {
        long[] jArr = this.items;
        long j2 = jArr[i2];
        long j3 = jArr[i2 + 1];
        rVar.invoke(Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) j2), Integer.valueOf((int) (j3 >> 32)), Integer.valueOf((int) j3));
    }

    public final void withTopLeftBottomRightAt(int i2, p<? super Long, ? super Long, ab> pVar) {
        long[] jArr = this.items;
        pVar.invoke(Long.valueOf(jArr[i2]), Long.valueOf(jArr[i2 + 1]));
    }

    public final int indexOf(int i2, int i3) {
        return (i3 < 0 || i3 >= this.itemsSize + (-2) || (((int) this.items[i3 + 2]) & 33554431) != (33554431 & i2)) ? indexOf(i2) : i3;
    }

    public final void forEachIntersection(int i2, int i3, l<? super Integer, ab> lVar) {
        long[] jArr = this.items;
        int i4 = this.itemsSize;
        for (int i5 = 0; i5 < jArr.length - 2 && i5 < i4; i5 += 3) {
            long j2 = jArr[i5];
            long j3 = jArr[i5 + 1];
            long j4 = (i3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (i2 << 32);
            if (((((j4 - j2) - 4294967297L) | ((j3 - j4) - 4294967297L)) & (-9223372034707292160L)) == 0) {
                lVar.invoke(Integer.valueOf(((int) jArr[i5 + 2]) & 33554431));
            }
        }
    }

    public final void updateSubhierarchy(long j2, int i2, int i3, int i4) {
        if ((((int) (j2 >> 50)) & 1023) > 0) {
            updateSubhierarchy((j2 & RectListKt.getEverythingButParentId()) | ((i2 & 33554431) << 25), i3, i4);
        }
    }
}
