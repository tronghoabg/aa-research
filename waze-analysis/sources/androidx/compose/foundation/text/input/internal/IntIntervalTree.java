package androidx.compose.foundation.text.input.internal;

import androidx.collection.MutableIntList;
import androidx.collection.MutableLongList;
import androidx.collection.MutableObjectList;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;
import h.k.n;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class IntIntervalTree<T> {
    private static final int INFO_PARENT = 0;
    private static final int LEFT_RIGHT = 1;
    private static final int MIN_MAX = 3;
    private static final int NODE_CLEANUP_SIZE_THRESHOLD = 64;
    private static final int START_END = 2;
    private static final int STRIDE = 4;
    private MutableIntList _tempArray;
    private int deletedNodeCount;
    private final MutableObjectList<T> items;
    private int nextNodeId;
    private final MutableLongList nodeInfo;
    private int root;
    private final int terminator;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public IntIntervalTree(IntIntervalTree<T> intIntervalTree) {
        if (intIntervalTree == null) {
            int i2 = 0;
            int i3 = 1;
            o oVar = null;
            this.items = new MutableObjectList<>(i2, i3, oVar);
            this.nodeInfo = new MutableLongList(i2, i3, oVar);
            int iM3552NodeKb4LEoY = m3552NodeKb4LEoY(null, Interval.m3612constructorimpl$default(Integer.MAX_VALUE, Integer.MIN_VALUE, false, false, 12, null), 0, 1);
            this.terminator = iM3552NodeKb4LEoY;
            this.root = iM3552NodeKb4LEoY;
            this.deletedNodeCount = 0;
            this.nextNodeId = 1;
            return;
        }
        MutableObjectList<T> mutableObjectList = new MutableObjectList<>(intIntervalTree.items.getSize());
        mutableObjectList.addAll(intIntervalTree.items);
        this.items = mutableObjectList;
        MutableLongList mutableLongList = new MutableLongList(intIntervalTree.nodeInfo._size);
        mutableLongList.addAll(mutableLongList._size, intIntervalTree.nodeInfo);
        this.nodeInfo = mutableLongList;
        this.terminator = intIntervalTree.terminator;
        this.root = intIntervalTree.root;
        this.deletedNodeCount = intIntervalTree.deletedNodeCount;
        this.nextNodeId = intIntervalTree.nextNodeId;
    }

    /* renamed from: Node-Kb4LEoY, reason: not valid java name */
    private final int m3552NodeKb4LEoY(T t, long j2, int i2, int i3) {
        MutableLongList mutableLongList = this.nodeInfo;
        int i4 = mutableLongList._size;
        mutableLongList.add(IntervalKt.packValuesAndFlags(i3 == 0, i2, false, 0));
        this.nodeInfo.add(0L);
        this.nodeInfo.add(j2);
        this.nodeInfo.add(j2);
        this.items.add(t);
        return i4;
    }

    /* renamed from: Node-Kb4LEoY$default, reason: not valid java name */
    static /* synthetic */ int m3553NodeKb4LEoY$default(IntIntervalTree intIntervalTree, Object obj, long j2, int i2, int i3, int i4, Object obj2) {
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = 0;
        }
        return intIntervalTree.m3552NodeKb4LEoY(obj, j2, i2, i3);
    }

    private final void cleanDeletedNodes() {
        int i2;
        if (this.deletedNodeCount == 0) {
            return;
        }
        MutableIntList tempArray = getTempArray();
        tempArray.ensureCapacity(getTotalNodeCount());
        int totalNodeCount = getTotalNodeCount();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i2 = 4;
            if (i3 >= totalNodeCount) {
                break;
            }
            if (IntervalKt.unpackFlag2(this.nodeInfo.get(i3 * 4))) {
                i4++;
            }
            tempArray.add((i3 - i4) * 4);
            i3++;
        }
        this.root = cleanDeletedNodes$map(tempArray, this.root);
        int i5 = 4;
        while (true) {
            MutableLongList mutableLongList = this.nodeInfo;
            int i6 = mutableLongList._size;
            if (i2 >= i6) {
                mutableLongList.removeRange(i5, i6);
                MutableObjectList<T> mutableObjectList = this.items;
                mutableObjectList.removeRange(mutableObjectList.getSize() - this.deletedNodeCount, this.items.getSize());
                this.deletedNodeCount = 0;
                tempArray.clear();
                return;
            }
            int i7 = i2 + 4;
            long j2 = mutableLongList.get(i2);
            if (!IntervalKt.unpackFlag2(j2)) {
                int i8 = i2 + 1;
                if (i5 != i2) {
                    this.nodeInfo.set(i5, IntervalKt.packValue2(j2, cleanDeletedNodes$map(tempArray, IntervalKt.unpackValue2(j2))));
                    long j3 = this.nodeInfo.get(i8);
                    long j4 = j3 >> 32;
                    long j5 = j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
                    this.nodeInfo.set(i5 + 1, (cleanDeletedNodes$map(tempArray, (int) j5) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (cleanDeletedNodes$map(tempArray, (int) j4) << 32));
                    MutableLongList mutableLongList2 = this.nodeInfo;
                    mutableLongList2.set(i5 + 2, mutableLongList2.get(i2 + 2));
                    MutableLongList mutableLongList3 = this.nodeInfo;
                    mutableLongList3.set(i5 + 3, mutableLongList3.get(i2 + 3));
                    MutableObjectList<T> mutableObjectList2 = this.items;
                    mutableObjectList2.set(i5 / 4, mutableObjectList2.get(i2 / 4));
                } else {
                    this.nodeInfo.set(i5, IntervalKt.packValue2(j2, cleanDeletedNodes$map(tempArray, IntervalKt.unpackValue2(j2))));
                    long j6 = this.nodeInfo.get(i8);
                    long j7 = j6 >> 32;
                    long j8 = j6 & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
                    this.nodeInfo.set(i5 + 1, (cleanDeletedNodes$map(tempArray, (int) j8) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (cleanDeletedNodes$map(tempArray, (int) j7) << 32));
                }
                i5 += 4;
            }
            i2 = i7;
        }
    }

    private static final int cleanDeletedNodes$map(MutableIntList mutableIntList, int i2) {
        return mutableIntList.get(i2 / 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cleanDeletedNodesIfNeeded() {
        if (getTotalNodeCount() <= 64 || this.deletedNodeCount < getTotalNodeCount() / 2) {
            return;
        }
        cleanDeletedNodes();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: detachNode-330cO7A, reason: not valid java name */
    public final void m3558detachNode330cO7A(int i2) {
        int iM3585getParentbLpG9ms;
        int iM3581getLeftbLpG9ms;
        int iM3585getParentbLpG9ms2;
        int iM3575getColor330cO7A = m3575getColor330cO7A(i2);
        if (Node.m3640equalsimpl0(m3581getLeftbLpG9ms(i2), this.terminator)) {
            iM3581getLeftbLpG9ms = m3586getRightbLpG9ms(i2);
            iM3585getParentbLpG9ms2 = m3585getParentbLpG9ms(i2);
            m3567transplantcfX_BQo(i2, m3586getRightbLpG9ms(i2));
            m3570updateNodeMinMaxPostDetachcfX_BQo(iM3585getParentbLpG9ms2, this.terminator);
        } else if (Node.m3640equalsimpl0(m3586getRightbLpG9ms(i2), this.terminator)) {
            iM3581getLeftbLpG9ms = m3581getLeftbLpG9ms(i2);
            iM3585getParentbLpG9ms2 = m3585getParentbLpG9ms(i2);
            m3567transplantcfX_BQo(i2, m3581getLeftbLpG9ms(i2));
            m3570updateNodeMinMaxPostDetachcfX_BQo(iM3585getParentbLpG9ms2, this.terminator);
        } else {
            int iM3592lowestNodebLpG9ms = m3592lowestNodebLpG9ms(m3586getRightbLpG9ms(i2));
            int iM3575getColor330cO7A2 = m3575getColor330cO7A(iM3592lowestNodebLpG9ms);
            int iM3586getRightbLpG9ms = m3586getRightbLpG9ms(iM3592lowestNodebLpG9ms);
            if (Node.m3640equalsimpl0(m3585getParentbLpG9ms(iM3592lowestNodebLpG9ms), i2)) {
                iM3585getParentbLpG9ms = iM3592lowestNodebLpG9ms;
            } else {
                iM3585getParentbLpG9ms = m3585getParentbLpG9ms(iM3592lowestNodebLpG9ms);
                m3567transplantcfX_BQo(iM3592lowestNodebLpG9ms, m3586getRightbLpG9ms(iM3592lowestNodebLpG9ms));
                m3604setRightcfX_BQo(iM3592lowestNodebLpG9ms, m3586getRightbLpG9ms(i2));
                m3603setParentcfX_BQo(m3586getRightbLpG9ms(iM3592lowestNodebLpG9ms), iM3592lowestNodebLpG9ms);
            }
            m3601setLeftcfX_BQo(iM3592lowestNodebLpG9ms, m3581getLeftbLpG9ms(i2));
            m3603setParentcfX_BQo(m3581getLeftbLpG9ms(iM3592lowestNodebLpG9ms), iM3592lowestNodebLpG9ms);
            m3598setColor9hnwElY(iM3592lowestNodebLpG9ms, m3575getColor330cO7A(i2));
            m3602setMinMaxlzRq0xI(iM3592lowestNodebLpG9ms, m3584getMinMax6gIMNq8(i2));
            m3567transplantcfX_BQo(i2, iM3592lowestNodebLpG9ms);
            m3570updateNodeMinMaxPostDetachcfX_BQo(iM3585getParentbLpG9ms, iM3592lowestNodebLpG9ms);
            iM3575getColor330cO7A = iM3575getColor330cO7A2;
            iM3581getLeftbLpG9ms = iM3586getRightbLpG9ms;
            iM3585getParentbLpG9ms2 = iM3585getParentbLpG9ms;
        }
        if (iM3575getColor330cO7A == 1) {
            m3564rebalancePostDetachcfX_BQo(iM3581getLeftbLpG9ms, iM3585getParentbLpG9ms2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: disposeNode-9hnwElY, reason: not valid java name */
    public final void m3559disposeNode9hnwElY(int i2, boolean z) {
        m3599setDeleted9hnwElY(i2, true);
        this.deletedNodeCount++;
        if (z) {
            cleanDeletedNodesIfNeeded();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: findNode-vbMxnkM, reason: not valid java name */
    public final int m3560findNodevbMxnkM(long j2) {
        if (!IntervalHandle.m3627equalsimpl0(j2, IntervalHandle.Companion.m3633getInvalidmo69AQQ())) {
            int iM3628getIdimpl = IntervalHandle.m3628getIdimpl(j2);
            int i2 = n.i((IntervalHandle.m3629getOriginalNodeIndeximpl(j2) / 4) * 4, this.nodeInfo._size - 4);
            if (i2 <= 0 || m3577getId330cO7A(i2) != iM3628getIdimpl) {
                int i3 = (i2 / 4) - 1;
                int i4 = 1;
                while (true) {
                    if (i4 > i3) {
                        break;
                    }
                    int i5 = (i4 + i3) >>> 1;
                    int i6 = i5 * 4;
                    int iM3577getId330cO7A = m3577getId330cO7A(i6);
                    if (iM3577getId330cO7A < iM3628getIdimpl) {
                        i4 = i5 + 1;
                    } else if (iM3577getId330cO7A > iM3628getIdimpl) {
                        i3 = i5 - 1;
                    } else if (!m3591isDeleted330cO7A(i6)) {
                        return i6;
                    }
                }
            } else if (!m3591isDeleted330cO7A(i2)) {
                return i2;
            }
        }
        return this.terminator;
    }

    private final void forEachNodeInRange(int i2, int i3, l<? super Integer, ab> lVar) {
        if (Node.m3640equalsimpl0(m3587getRoot27flxzM(), m3590getTerminator27flxzM()) || m3582getMax330cO7A(m3587getRoot27flxzM()) < i2 || m3583getMin330cO7A(m3587getRoot27flxzM()) > i3) {
            return;
        }
        int iM3587getRoot27flxzM = m3587getRoot27flxzM();
        while (true) {
            boolean z = false;
            while (!Node.m3640equalsimpl0(iM3587getRoot27flxzM, m3590getTerminator27flxzM())) {
                if (z) {
                    if (!z) {
                        if (!Node.m3640equalsimpl0(m3585getParentbLpG9ms(iM3587getRoot27flxzM), m3590getTerminator27flxzM())) {
                            z = true != Node.m3640equalsimpl0(iM3587getRoot27flxzM, m3581getLeftbLpG9ms(m3585getParentbLpG9ms(iM3587getRoot27flxzM))) ? 2 : true;
                        }
                        iM3587getRoot27flxzM = m3585getParentbLpG9ms(iM3587getRoot27flxzM);
                    } else {
                        if (m3594overlapsXzpGiIY(iM3587getRoot27flxzM, i2, i3)) {
                            lVar.invoke(Integer.valueOf(iM3587getRoot27flxzM));
                        }
                        if (Node.m3640equalsimpl0(m3586getRightbLpG9ms(iM3587getRoot27flxzM), m3590getTerminator27flxzM()) || m3582getMax330cO7A(m3586getRightbLpG9ms(iM3587getRoot27flxzM)) < i2 || m3583getMin330cO7A(m3586getRightbLpG9ms(iM3587getRoot27flxzM)) > i3) {
                            z = 2;
                        } else {
                            iM3587getRoot27flxzM = m3586getRightbLpG9ms(iM3587getRoot27flxzM);
                        }
                    }
                } else if (Node.m3640equalsimpl0(m3581getLeftbLpG9ms(iM3587getRoot27flxzM), m3590getTerminator27flxzM()) || m3582getMax330cO7A(m3581getLeftbLpG9ms(iM3587getRoot27flxzM)) < i2) {
                    z = true;
                } else {
                    iM3587getRoot27flxzM = m3581getLeftbLpG9ms(iM3587getRoot27flxzM);
                }
            }
            return;
        }
    }

    static /* synthetic */ void forEachNodeInRange$default(IntIntervalTree intIntervalTree, int i2, int i3, l lVar, int i4, Object obj) {
        if (Node.m3640equalsimpl0(intIntervalTree.m3587getRoot27flxzM(), intIntervalTree.m3590getTerminator27flxzM()) || intIntervalTree.m3582getMax330cO7A(intIntervalTree.m3587getRoot27flxzM()) < i2) {
            return;
        }
        if ((i4 & 2) != 0) {
            i3 = i2;
        }
        if (intIntervalTree.m3583getMin330cO7A(intIntervalTree.m3587getRoot27flxzM()) > i3) {
            return;
        }
        int iM3587getRoot27flxzM = intIntervalTree.m3587getRoot27flxzM();
        while (true) {
            boolean z = false;
            while (!Node.m3640equalsimpl0(iM3587getRoot27flxzM, intIntervalTree.m3590getTerminator27flxzM())) {
                if (z) {
                    if (!z) {
                        if (!Node.m3640equalsimpl0(intIntervalTree.m3585getParentbLpG9ms(iM3587getRoot27flxzM), intIntervalTree.m3590getTerminator27flxzM())) {
                            z = true != Node.m3640equalsimpl0(iM3587getRoot27flxzM, intIntervalTree.m3581getLeftbLpG9ms(intIntervalTree.m3585getParentbLpG9ms(iM3587getRoot27flxzM))) ? 2 : true;
                        }
                        iM3587getRoot27flxzM = intIntervalTree.m3585getParentbLpG9ms(iM3587getRoot27flxzM);
                    } else {
                        if (intIntervalTree.m3594overlapsXzpGiIY(iM3587getRoot27flxzM, i2, i3)) {
                            lVar.invoke(Integer.valueOf(iM3587getRoot27flxzM));
                        }
                        if (Node.m3640equalsimpl0(intIntervalTree.m3586getRightbLpG9ms(iM3587getRoot27flxzM), intIntervalTree.m3590getTerminator27flxzM()) || intIntervalTree.m3582getMax330cO7A(intIntervalTree.m3586getRightbLpG9ms(iM3587getRoot27flxzM)) < i2 || intIntervalTree.m3583getMin330cO7A(intIntervalTree.m3586getRightbLpG9ms(iM3587getRoot27flxzM)) > i3) {
                            z = 2;
                        } else {
                            iM3587getRoot27flxzM = intIntervalTree.m3586getRightbLpG9ms(iM3587getRoot27flxzM);
                        }
                    }
                } else if (Node.m3640equalsimpl0(intIntervalTree.m3581getLeftbLpG9ms(iM3587getRoot27flxzM), intIntervalTree.m3590getTerminator27flxzM()) || intIntervalTree.m3582getMax330cO7A(intIntervalTree.m3581getLeftbLpG9ms(iM3587getRoot27flxzM)) < i2) {
                    z = true;
                } else {
                    iM3587getRoot27flxzM = intIntervalTree.m3581getLeftbLpG9ms(iM3587getRoot27flxzM);
                }
            }
            return;
        }
    }

    private final void forEachNodeMinMaxInRange(int i2, int i3, l<? super Integer, ab> lVar) {
        if (Node.m3640equalsimpl0(m3587getRoot27flxzM(), m3590getTerminator27flxzM()) || m3582getMax330cO7A(m3587getRoot27flxzM()) < i2 || m3583getMin330cO7A(m3587getRoot27flxzM()) > i3) {
            return;
        }
        int iM3587getRoot27flxzM = m3587getRoot27flxzM();
        while (true) {
            boolean z = false;
            while (!Node.m3640equalsimpl0(iM3587getRoot27flxzM, m3590getTerminator27flxzM())) {
                if (z) {
                    if (!z) {
                        if (!Node.m3640equalsimpl0(m3585getParentbLpG9ms(iM3587getRoot27flxzM), m3590getTerminator27flxzM())) {
                            z = true != Node.m3640equalsimpl0(iM3587getRoot27flxzM, m3581getLeftbLpG9ms(m3585getParentbLpG9ms(iM3587getRoot27flxzM))) ? 2 : true;
                        }
                        iM3587getRoot27flxzM = m3585getParentbLpG9ms(iM3587getRoot27flxzM);
                    } else {
                        lVar.invoke(Integer.valueOf(iM3587getRoot27flxzM));
                        if (Node.m3640equalsimpl0(m3586getRightbLpG9ms(iM3587getRoot27flxzM), m3590getTerminator27flxzM()) || m3582getMax330cO7A(m3586getRightbLpG9ms(iM3587getRoot27flxzM)) < i2 || m3583getMin330cO7A(m3586getRightbLpG9ms(iM3587getRoot27flxzM)) > i3) {
                            z = 2;
                        } else {
                            iM3587getRoot27flxzM = m3586getRightbLpG9ms(iM3587getRoot27flxzM);
                        }
                    }
                } else if (Node.m3640equalsimpl0(m3581getLeftbLpG9ms(iM3587getRoot27flxzM), m3590getTerminator27flxzM()) || m3582getMax330cO7A(m3581getLeftbLpG9ms(iM3587getRoot27flxzM)) < i2) {
                    z = true;
                } else {
                    iM3587getRoot27flxzM = m3581getLeftbLpG9ms(iM3587getRoot27flxzM);
                }
            }
            return;
        }
    }

    static /* synthetic */ void forEachNodeMinMaxInRange$default(IntIntervalTree intIntervalTree, int i2, int i3, l lVar, int i4, Object obj) {
        if (Node.m3640equalsimpl0(intIntervalTree.m3587getRoot27flxzM(), intIntervalTree.m3590getTerminator27flxzM()) || intIntervalTree.m3582getMax330cO7A(intIntervalTree.m3587getRoot27flxzM()) < i2) {
            return;
        }
        if ((i4 & 2) != 0) {
            i3 = i2;
        }
        if (intIntervalTree.m3583getMin330cO7A(intIntervalTree.m3587getRoot27flxzM()) > i3) {
            return;
        }
        int iM3587getRoot27flxzM = intIntervalTree.m3587getRoot27flxzM();
        while (true) {
            boolean z = false;
            while (!Node.m3640equalsimpl0(iM3587getRoot27flxzM, intIntervalTree.m3590getTerminator27flxzM())) {
                if (z) {
                    if (!z) {
                        if (!Node.m3640equalsimpl0(intIntervalTree.m3585getParentbLpG9ms(iM3587getRoot27flxzM), intIntervalTree.m3590getTerminator27flxzM())) {
                            z = true != Node.m3640equalsimpl0(iM3587getRoot27flxzM, intIntervalTree.m3581getLeftbLpG9ms(intIntervalTree.m3585getParentbLpG9ms(iM3587getRoot27flxzM))) ? 2 : true;
                        }
                        iM3587getRoot27flxzM = intIntervalTree.m3585getParentbLpG9ms(iM3587getRoot27flxzM);
                    } else {
                        lVar.invoke(Integer.valueOf(iM3587getRoot27flxzM));
                        if (Node.m3640equalsimpl0(intIntervalTree.m3586getRightbLpG9ms(iM3587getRoot27flxzM), intIntervalTree.m3590getTerminator27flxzM()) || intIntervalTree.m3582getMax330cO7A(intIntervalTree.m3586getRightbLpG9ms(iM3587getRoot27flxzM)) < i2 || intIntervalTree.m3583getMin330cO7A(intIntervalTree.m3586getRightbLpG9ms(iM3587getRoot27flxzM)) > i3) {
                            z = 2;
                        } else {
                            iM3587getRoot27flxzM = intIntervalTree.m3586getRightbLpG9ms(iM3587getRoot27flxzM);
                        }
                    }
                } else if (Node.m3640equalsimpl0(intIntervalTree.m3581getLeftbLpG9ms(iM3587getRoot27flxzM), intIntervalTree.m3590getTerminator27flxzM()) || intIntervalTree.m3582getMax330cO7A(intIntervalTree.m3581getLeftbLpG9ms(iM3587getRoot27flxzM)) < i2) {
                    z = true;
                } else {
                    iM3587getRoot27flxzM = intIntervalTree.m3581getLeftbLpG9ms(iM3587getRoot27flxzM);
                }
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MutableIntList getTempArray() {
        MutableIntList mutableIntList = this._tempArray;
        if (mutableIntList != null) {
            return mutableIntList;
        }
        MutableIntList mutableIntList2 = new MutableIntList(0, 1, null);
        this._tempArray = mutableIntList2;
        return mutableIntList2;
    }

    private final int getTotalNodeCount() {
        return this.nodeInfo._size / 4;
    }

    /* renamed from: nextTransition-XzpGiIY, reason: not valid java name */
    private final int m3561nextTransitionXzpGiIY(int i2, int i3, int i4) {
        if (i4 <= m3583getMin330cO7A(i2) || m3582getMax330cO7A(i2) <= i3) {
            return i4;
        }
        if (i3 < m3588getStart330cO7A(i2)) {
            return Math.min(m3588getStart330cO7A(i2), m3561nextTransitionXzpGiIY(m3581getLeftbLpG9ms(i2), i3, Math.min(i4, m3588getStart330cO7A(i2))));
        }
        if (i3 >= m3576getEnd330cO7A(i2)) {
            int iM3561nextTransitionXzpGiIY = m3561nextTransitionXzpGiIY(m3581getLeftbLpG9ms(i2), i3, i4);
            return Math.min(iM3561nextTransitionXzpGiIY, m3561nextTransitionXzpGiIY(m3586getRightbLpG9ms(i2), i3, iM3561nextTransitionXzpGiIY));
        }
        int iM3561nextTransitionXzpGiIY2 = m3561nextTransitionXzpGiIY(m3581getLeftbLpG9ms(i2), i3, Math.min(m3576getEnd330cO7A(i2), i4));
        return Math.min(iM3561nextTransitionXzpGiIY2, m3561nextTransitionXzpGiIY(m3586getRightbLpG9ms(i2), i3, iM3561nextTransitionXzpGiIY2));
    }

    /* renamed from: previousTransition-XzpGiIY, reason: not valid java name */
    private final int m3562previousTransitionXzpGiIY(int i2, int i3, int i4) {
        if (i3 <= m3583getMin330cO7A(i2) || m3582getMax330cO7A(i2) <= i4) {
            return i4;
        }
        if (i3 <= m3588getStart330cO7A(i2)) {
            return m3562previousTransitionXzpGiIY(m3581getLeftbLpG9ms(i2), i3, i4);
        }
        if (i3 <= m3576getEnd330cO7A(i2)) {
            int iM3562previousTransitionXzpGiIY = m3562previousTransitionXzpGiIY(m3581getLeftbLpG9ms(i2), i3, Math.max(m3588getStart330cO7A(i2), i4));
            return Math.max(iM3562previousTransitionXzpGiIY, m3562previousTransitionXzpGiIY(m3586getRightbLpG9ms(i2), i3, iM3562previousTransitionXzpGiIY));
        }
        int iM3562previousTransitionXzpGiIY2 = m3562previousTransitionXzpGiIY(m3581getLeftbLpG9ms(i2), i3, Math.max(m3576getEnd330cO7A(i2), i4));
        return Math.max(iM3562previousTransitionXzpGiIY2, m3562previousTransitionXzpGiIY(m3586getRightbLpG9ms(i2), i3, iM3562previousTransitionXzpGiIY2));
    }

    /* renamed from: rebalancePostAttach-330cO7A, reason: not valid java name */
    private final void m3563rebalancePostAttach330cO7A(int i2) {
        while (!Node.m3640equalsimpl0(i2, this.root) && m3575getColor330cO7A(m3585getParentbLpG9ms(i2)) == 0) {
            int iM3585getParentbLpG9ms = m3585getParentbLpG9ms(m3585getParentbLpG9ms(i2));
            if (Node.m3640equalsimpl0(m3585getParentbLpG9ms(i2), m3581getLeftbLpG9ms(iM3585getParentbLpG9ms))) {
                int iM3586getRightbLpG9ms = m3586getRightbLpG9ms(iM3585getParentbLpG9ms);
                if (m3575getColor330cO7A(iM3586getRightbLpG9ms) == 0) {
                    m3598setColor9hnwElY(iM3586getRightbLpG9ms, 1);
                    m3598setColor9hnwElY(m3585getParentbLpG9ms(i2), 1);
                    m3598setColor9hnwElY(iM3585getParentbLpG9ms, 0);
                    i2 = iM3585getParentbLpG9ms;
                } else {
                    if (Node.m3640equalsimpl0(i2, m3586getRightbLpG9ms(m3585getParentbLpG9ms(i2)))) {
                        i2 = m3585getParentbLpG9ms(i2);
                        m3565rotateLeft330cO7A(i2);
                    }
                    m3598setColor9hnwElY(m3585getParentbLpG9ms(i2), 1);
                    m3598setColor9hnwElY(iM3585getParentbLpG9ms, 0);
                    m3566rotateRight330cO7A(iM3585getParentbLpG9ms);
                }
            } else {
                int iM3581getLeftbLpG9ms = m3581getLeftbLpG9ms(iM3585getParentbLpG9ms);
                if (m3575getColor330cO7A(iM3581getLeftbLpG9ms) == 0) {
                    m3598setColor9hnwElY(iM3581getLeftbLpG9ms, 1);
                    m3598setColor9hnwElY(m3585getParentbLpG9ms(i2), 1);
                    m3598setColor9hnwElY(iM3585getParentbLpG9ms, 0);
                    i2 = iM3585getParentbLpG9ms;
                } else {
                    if (Node.m3640equalsimpl0(i2, m3581getLeftbLpG9ms(m3585getParentbLpG9ms(i2)))) {
                        i2 = m3585getParentbLpG9ms(i2);
                        m3566rotateRight330cO7A(i2);
                    }
                    m3598setColor9hnwElY(m3585getParentbLpG9ms(i2), 1);
                    m3598setColor9hnwElY(iM3585getParentbLpG9ms, 0);
                    m3565rotateLeft330cO7A(iM3585getParentbLpG9ms);
                }
            }
        }
        m3598setColor9hnwElY(this.root, 1);
    }

    /* renamed from: rebalancePostDetach-cfX_BQo, reason: not valid java name */
    private final void m3564rebalancePostDetachcfX_BQo(int i2, int i3) {
        int iM3585getParentbLpG9ms;
        while (!Node.m3640equalsimpl0(i2, this.root) && m3575getColor330cO7A(i2) == 1) {
            if (Node.m3640equalsimpl0(i2, m3581getLeftbLpG9ms(i3))) {
                int iM3586getRightbLpG9ms = m3586getRightbLpG9ms(i3);
                if (m3575getColor330cO7A(iM3586getRightbLpG9ms) == 0) {
                    m3598setColor9hnwElY(iM3586getRightbLpG9ms, 1);
                    m3598setColor9hnwElY(i3, 0);
                    m3565rotateLeft330cO7A(i3);
                    iM3586getRightbLpG9ms = m3586getRightbLpG9ms(i3);
                }
                if (m3575getColor330cO7A(m3581getLeftbLpG9ms(iM3586getRightbLpG9ms)) == 1 && m3575getColor330cO7A(m3586getRightbLpG9ms(iM3586getRightbLpG9ms)) == 1) {
                    m3598setColor9hnwElY(iM3586getRightbLpG9ms, 0);
                    iM3585getParentbLpG9ms = m3585getParentbLpG9ms(i3);
                    int i4 = i3;
                    i3 = iM3585getParentbLpG9ms;
                    i2 = i4;
                } else {
                    if (m3575getColor330cO7A(m3586getRightbLpG9ms(iM3586getRightbLpG9ms)) == 1) {
                        m3598setColor9hnwElY(m3581getLeftbLpG9ms(iM3586getRightbLpG9ms), 1);
                        m3598setColor9hnwElY(iM3586getRightbLpG9ms, 0);
                        m3566rotateRight330cO7A(iM3586getRightbLpG9ms);
                        iM3586getRightbLpG9ms = m3586getRightbLpG9ms(i3);
                    }
                    m3598setColor9hnwElY(iM3586getRightbLpG9ms, m3575getColor330cO7A(i3));
                    m3598setColor9hnwElY(i3, 1);
                    m3598setColor9hnwElY(m3586getRightbLpG9ms(iM3586getRightbLpG9ms), 1);
                    m3565rotateLeft330cO7A(i3);
                    i2 = this.root;
                }
            } else {
                int iM3581getLeftbLpG9ms = m3581getLeftbLpG9ms(i3);
                if (m3575getColor330cO7A(iM3581getLeftbLpG9ms) == 0) {
                    m3598setColor9hnwElY(iM3581getLeftbLpG9ms, 1);
                    m3598setColor9hnwElY(i3, 0);
                    m3566rotateRight330cO7A(i3);
                    iM3581getLeftbLpG9ms = m3581getLeftbLpG9ms(i3);
                }
                if (m3575getColor330cO7A(m3586getRightbLpG9ms(iM3581getLeftbLpG9ms)) == 1 && m3575getColor330cO7A(m3581getLeftbLpG9ms(iM3581getLeftbLpG9ms)) == 1) {
                    m3598setColor9hnwElY(iM3581getLeftbLpG9ms, 0);
                    iM3585getParentbLpG9ms = m3585getParentbLpG9ms(i3);
                    int i42 = i3;
                    i3 = iM3585getParentbLpG9ms;
                    i2 = i42;
                } else {
                    if (m3575getColor330cO7A(m3581getLeftbLpG9ms(iM3581getLeftbLpG9ms)) == 1) {
                        m3598setColor9hnwElY(m3586getRightbLpG9ms(iM3581getLeftbLpG9ms), 1);
                        m3598setColor9hnwElY(iM3581getLeftbLpG9ms, 0);
                        m3565rotateLeft330cO7A(iM3581getLeftbLpG9ms);
                        iM3581getLeftbLpG9ms = m3581getLeftbLpG9ms(i3);
                    }
                    m3598setColor9hnwElY(iM3581getLeftbLpG9ms, m3575getColor330cO7A(i3));
                    m3598setColor9hnwElY(i3, 1);
                    m3598setColor9hnwElY(m3581getLeftbLpG9ms(iM3581getLeftbLpG9ms), 1);
                    m3566rotateRight330cO7A(i3);
                    i2 = this.root;
                }
            }
        }
        m3598setColor9hnwElY(i2, 1);
    }

    /* renamed from: rotateLeft-330cO7A, reason: not valid java name */
    private final void m3565rotateLeft330cO7A(int i2) {
        int iM3586getRightbLpG9ms = m3586getRightbLpG9ms(i2);
        m3604setRightcfX_BQo(i2, m3581getLeftbLpG9ms(iM3586getRightbLpG9ms));
        if (!Node.m3640equalsimpl0(m3581getLeftbLpG9ms(iM3586getRightbLpG9ms), this.terminator)) {
            m3603setParentcfX_BQo(m3581getLeftbLpG9ms(iM3586getRightbLpG9ms), i2);
        }
        m3603setParentcfX_BQo(iM3586getRightbLpG9ms, m3585getParentbLpG9ms(i2));
        if (Node.m3640equalsimpl0(m3585getParentbLpG9ms(i2), this.terminator)) {
            this.root = iM3586getRightbLpG9ms;
        } else if (Node.m3640equalsimpl0(m3581getLeftbLpG9ms(m3585getParentbLpG9ms(i2)), i2)) {
            m3601setLeftcfX_BQo(m3585getParentbLpG9ms(i2), iM3586getRightbLpG9ms);
        } else {
            m3604setRightcfX_BQo(m3585getParentbLpG9ms(i2), iM3586getRightbLpG9ms);
        }
        m3601setLeftcfX_BQo(iM3586getRightbLpG9ms, i2);
        m3603setParentcfX_BQo(i2, iM3586getRightbLpG9ms);
        m3571updateNodeMinMaxPostRotate330cO7A(i2);
    }

    /* renamed from: rotateRight-330cO7A, reason: not valid java name */
    private final void m3566rotateRight330cO7A(int i2) {
        int iM3581getLeftbLpG9ms = m3581getLeftbLpG9ms(i2);
        m3601setLeftcfX_BQo(i2, m3586getRightbLpG9ms(iM3581getLeftbLpG9ms));
        if (!Node.m3640equalsimpl0(m3586getRightbLpG9ms(iM3581getLeftbLpG9ms), this.terminator)) {
            m3603setParentcfX_BQo(m3586getRightbLpG9ms(iM3581getLeftbLpG9ms), i2);
        }
        m3603setParentcfX_BQo(iM3581getLeftbLpG9ms, m3585getParentbLpG9ms(i2));
        if (Node.m3640equalsimpl0(m3585getParentbLpG9ms(i2), this.terminator)) {
            this.root = iM3581getLeftbLpG9ms;
        } else if (Node.m3640equalsimpl0(m3586getRightbLpG9ms(m3585getParentbLpG9ms(i2)), i2)) {
            m3604setRightcfX_BQo(m3585getParentbLpG9ms(i2), iM3581getLeftbLpG9ms);
        } else {
            m3601setLeftcfX_BQo(m3585getParentbLpG9ms(i2), iM3581getLeftbLpG9ms);
        }
        m3604setRightcfX_BQo(iM3581getLeftbLpG9ms, i2);
        m3603setParentcfX_BQo(i2, iM3581getLeftbLpG9ms);
        m3571updateNodeMinMaxPostRotate330cO7A(i2);
    }

    /* renamed from: transplant-cfX_BQo, reason: not valid java name */
    private final void m3567transplantcfX_BQo(int i2, int i3) {
        if (Node.m3640equalsimpl0(i2, i3)) {
            return;
        }
        if (Node.m3640equalsimpl0(m3585getParentbLpG9ms(i2), this.terminator)) {
            this.root = i3;
        } else if (Node.m3640equalsimpl0(i2, m3581getLeftbLpG9ms(m3585getParentbLpG9ms(i2)))) {
            m3601setLeftcfX_BQo(m3585getParentbLpG9ms(i2), i3);
        } else {
            m3604setRightcfX_BQo(m3585getParentbLpG9ms(i2), i3);
        }
        if (Node.m3640equalsimpl0(i3, this.terminator)) {
            return;
        }
        m3603setParentcfX_BQo(i3, m3585getParentbLpG9ms(i2));
    }

    /* renamed from: updateInterval-lzRq0xI, reason: not valid java name */
    private final void m3568updateIntervallzRq0xI(int i2, long j2) {
        if (m3588getStart330cO7A(i2) == Interval.m3618getStartimpl(j2)) {
            m3606setStartEndlzRq0xI(i2, j2);
            m3569updateNodeMinMax330cO7A(i2);
            return;
        }
        m3558detachNode330cO7A(i2);
        m3606setStartEndlzRq0xI(i2, j2);
        m3602setMinMaxlzRq0xI(i2, j2);
        m3601setLeftcfX_BQo(i2, this.terminator);
        m3604setRightcfX_BQo(i2, this.terminator);
        m3598setColor9hnwElY(i2, 0);
        m3574attachNode330cO7A(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: updateNodeMinMax-330cO7A, reason: not valid java name */
    public final void m3569updateNodeMinMax330cO7A(int i2) {
        while (!Node.m3640equalsimpl0(i2, this.terminator)) {
            long jM3584getMinMax6gIMNq8 = m3584getMinMax6gIMNq8(i2);
            int iMin = Math.min(m3588getStart330cO7A(i2), Math.min(m3583getMin330cO7A(m3581getLeftbLpG9ms(i2)), m3583getMin330cO7A(m3586getRightbLpG9ms(i2))));
            int iMax = Math.max(m3576getEnd330cO7A(i2), Math.max(m3582getMax330cO7A(m3581getLeftbLpG9ms(i2)), m3582getMax330cO7A(m3586getRightbLpG9ms(i2))));
            if (Interval.m3618getStartimpl(jM3584getMinMax6gIMNq8) == iMin && Interval.m3615getEndimpl(jM3584getMinMax6gIMNq8) == iMax) {
                return;
            }
            m3602setMinMaxlzRq0xI(i2, Interval.m3612constructorimpl$default(iMin, iMax, false, false, 12, null));
            i2 = m3585getParentbLpG9ms(i2);
        }
    }

    /* renamed from: updateNodeMinMaxPostDetach-cfX_BQo, reason: not valid java name */
    private final void m3570updateNodeMinMaxPostDetachcfX_BQo(int i2, int i3) {
        m3569updateNodeMinMax330cO7A(i2);
        m3569updateNodeMinMax330cO7A(i3);
    }

    /* renamed from: updateNodeMinMaxPostRotate-330cO7A, reason: not valid java name */
    private final void m3571updateNodeMinMaxPostRotate330cO7A(int i2) {
        m3569updateNodeMinMax330cO7A(i2);
        m3569updateNodeMinMax330cO7A(m3585getParentbLpG9ms(i2));
    }

    /* renamed from: add-ZlWbn38, reason: not valid java name */
    public final void m3572addZlWbn38(MutableIntList mutableIntList, int i2) {
        mutableIntList.add(i2);
    }

    /* renamed from: addInterval-ZYjWoSQ, reason: not valid java name */
    public final long m3573addIntervalZYjWoSQ(T t, long j2) {
        if (Interval.m3618getStartimpl(j2) >= Interval.m3615getEndimpl(j2)) {
            return IntervalHandle.Companion.m3633getInvalidmo69AQQ();
        }
        int i2 = this.nextNodeId;
        this.nextNodeId = i2 + 1;
        int iM3552NodeKb4LEoY = m3552NodeKb4LEoY(t, j2, i2, 0);
        m3574attachNode330cO7A(iM3552NodeKb4LEoY);
        return IntervalHandle.m3624constructorimpl(m3577getId330cO7A(iM3552NodeKb4LEoY), iM3552NodeKb4LEoY);
    }

    /* renamed from: attachNode-330cO7A, reason: not valid java name */
    public final void m3574attachNode330cO7A(int i2) {
        int i3;
        int i4 = this.terminator;
        int iM3581getLeftbLpG9ms = this.root;
        while (true) {
            int i5 = iM3581getLeftbLpG9ms;
            i3 = i4;
            i4 = i5;
            if (Node.m3640equalsimpl0(i4, this.terminator)) {
                break;
            } else {
                iM3581getLeftbLpG9ms = m3588getStart330cO7A(i2) <= m3588getStart330cO7A(i4) ? m3581getLeftbLpG9ms(i4) : m3586getRightbLpG9ms(i4);
            }
        }
        m3603setParentcfX_BQo(i2, i3);
        if (Node.m3640equalsimpl0(i3, this.terminator)) {
            this.root = i2;
        } else if (m3588getStart330cO7A(i2) <= m3588getStart330cO7A(i3)) {
            m3601setLeftcfX_BQo(i3, i2);
        } else {
            m3604setRightcfX_BQo(i3, i2);
        }
        m3569updateNodeMinMax330cO7A(i3);
        m3563rebalancePostAttach330cO7A(i2);
    }

    public final void clear() {
        this.root = this.terminator;
        MutableLongList mutableLongList = this.nodeInfo;
        mutableLongList.removeRange(4, mutableLongList._size);
        MutableObjectList<T> mutableObjectList = this.items;
        mutableObjectList.removeRange(1, mutableObjectList.getSize());
        this.deletedNodeCount = 0;
    }

    public final IntIntervalTree<T> copy() {
        cleanDeletedNodes();
        return new IntIntervalTree<>(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0093, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            boolean r1 = r9 instanceof androidx.compose.foundation.text.input.internal.IntIntervalTree
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            androidx.collection.MutableLongList r1 = r8.nodeInfo
            int r3 = r8.root
            int r3 = r3 + 3
            long r3 = r1.get(r3)
            androidx.compose.foundation.text.input.internal.IntIntervalTree r9 = (androidx.compose.foundation.text.input.internal.IntIntervalTree) r9
            androidx.collection.MutableLongList r1 = r9.nodeInfo
            int r5 = r9.root
            int r5 = r5 + 3
            long r5 = r1.get(r5)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L25
            return r2
        L25:
            int r1 = r8.getTotalNodeCount()
            int r3 = r8.deletedNodeCount
            int r1 = r1 - r3
            int r3 = r9.getTotalNodeCount()
            int r4 = r9.deletedNodeCount
            int r3 = r3 - r4
            if (r1 != r3) goto L94
            r1 = 4
            r3 = r1
        L37:
            androidx.collection.MutableLongList r4 = r8.nodeInfo
            r5 = r4
            androidx.collection.LongList r5 = (androidx.collection.LongList) r5
            int r5 = r5._size
            if (r1 >= r5) goto L93
            androidx.collection.MutableLongList r5 = r9.nodeInfo
            androidx.collection.LongList r5 = (androidx.collection.LongList) r5
            int r5 = r5._size
            if (r3 >= r5) goto L93
            long r4 = r4.get(r1)
            boolean r4 = androidx.compose.foundation.text.input.internal.IntervalKt.unpackFlag2(r4)
            if (r4 == 0) goto L55
            int r1 = r1 + 4
            goto L37
        L55:
            androidx.collection.MutableLongList r4 = r9.nodeInfo
            long r4 = r4.get(r3)
            boolean r4 = androidx.compose.foundation.text.input.internal.IntervalKt.unpackFlag2(r4)
            if (r4 == 0) goto L64
        L61:
            int r3 = r3 + 4
            goto L37
        L64:
            androidx.collection.MutableLongList r4 = r8.nodeInfo
            int r5 = r1 + 2
            long r4 = r4.get(r5)
            androidx.collection.MutableLongList r6 = r9.nodeInfo
            int r7 = r3 + 2
            long r6 = r6.get(r7)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L79
            return r2
        L79:
            androidx.collection.MutableObjectList<T> r4 = r8.items
            int r5 = r1 / 4
            java.lang.Object r4 = r4.get(r5)
            androidx.collection.MutableObjectList<T> r5 = r9.items
            int r6 = r3 / 4
            java.lang.Object r5 = r5.get(r6)
            boolean r4 = h.g.b.x.n(r4, r5)
            if (r4 != 0) goto L90
            return r2
        L90:
            int r1 = r1 + 4
            goto L61
        L93:
            return r0
        L94:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.IntIntervalTree.equals(java.lang.Object):boolean");
    }

    public final /* synthetic */ <R, M> List<M> findIntervalsInRange(int i2, int i3, l<? super Long, ? extends M> lVar) {
        MutableIntList tempArray = getTempArray();
        if (!Node.m3640equalsimpl0(m3587getRoot27flxzM(), m3590getTerminator27flxzM()) && m3582getMax330cO7A(m3587getRoot27flxzM()) >= i2 && m3583getMin330cO7A(m3587getRoot27flxzM()) <= i3) {
            int iM3587getRoot27flxzM = m3587getRoot27flxzM();
            loop0: while (true) {
                boolean z = false;
                while (!Node.m3640equalsimpl0(iM3587getRoot27flxzM, m3590getTerminator27flxzM())) {
                    if (z) {
                        if (!z) {
                            if (!Node.m3640equalsimpl0(m3585getParentbLpG9ms(iM3587getRoot27flxzM), m3590getTerminator27flxzM())) {
                                z = true != Node.m3640equalsimpl0(iM3587getRoot27flxzM, m3581getLeftbLpG9ms(m3585getParentbLpG9ms(iM3587getRoot27flxzM))) ? 2 : true;
                            }
                            iM3587getRoot27flxzM = m3585getParentbLpG9ms(iM3587getRoot27flxzM);
                        } else {
                            if (m3594overlapsXzpGiIY(iM3587getRoot27flxzM, i2, i3)) {
                                T tM3579getItem330cO7A = m3579getItem330cO7A(iM3587getRoot27flxzM);
                                x.i();
                                if (tM3579getItem330cO7A instanceof Object) {
                                    tempArray.add(iM3587getRoot27flxzM);
                                }
                            }
                            if (Node.m3640equalsimpl0(m3586getRightbLpG9ms(iM3587getRoot27flxzM), m3590getTerminator27flxzM()) || m3582getMax330cO7A(m3586getRightbLpG9ms(iM3587getRoot27flxzM)) < i2 || m3583getMin330cO7A(m3586getRightbLpG9ms(iM3587getRoot27flxzM)) > i3) {
                                z = 2;
                            } else {
                                iM3587getRoot27flxzM = m3586getRightbLpG9ms(iM3587getRoot27flxzM);
                            }
                        }
                    } else if (Node.m3640equalsimpl0(m3581getLeftbLpG9ms(iM3587getRoot27flxzM), m3590getTerminator27flxzM()) || m3582getMax330cO7A(m3581getLeftbLpG9ms(iM3587getRoot27flxzM)) < i2) {
                        z = true;
                    } else {
                        iM3587getRoot27flxzM = m3581getLeftbLpG9ms(iM3587getRoot27flxzM);
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
            if (m3579getItem330cO7A(i6) == null) {
                throw new IllegalStateException("IntIntervalTree's item should not be null");
            }
            arrayList.add(lVar.invoke(Long.valueOf(IntervalHandle.m3624constructorimpl(m3577getId330cO7A(i6), i6))));
        }
        ArrayList arrayList2 = arrayList;
        tempArray.clear();
        return arrayList2;
    }

    public final void forAllIntervals(p<? super T, ? super Long, ab> pVar) {
        T tM3579getItem330cO7A;
        if (Node.m3640equalsimpl0(m3587getRoot27flxzM(), m3590getTerminator27flxzM())) {
            return;
        }
        for (int i2 = 4; i2 < this.nodeInfo._size; i2 += 4) {
            if (!m3591isDeleted330cO7A(i2) && (tM3579getItem330cO7A = m3579getItem330cO7A(i2)) != null) {
                pVar.invoke(tM3579getItem330cO7A, Long.valueOf(m3589getStartEnd6gIMNq8(i2)));
            }
        }
    }

    public final void forEachIntervalInRange(int i2, int i3, p<? super T, ? super Long, ab> pVar) {
        MutableIntList tempArray = getTempArray();
        if (!Node.m3640equalsimpl0(m3587getRoot27flxzM(), m3590getTerminator27flxzM()) && m3582getMax330cO7A(m3587getRoot27flxzM()) >= i2 && m3583getMin330cO7A(m3587getRoot27flxzM()) <= i3) {
            int iM3587getRoot27flxzM = m3587getRoot27flxzM();
            loop0: while (true) {
                boolean z = false;
                while (!Node.m3640equalsimpl0(iM3587getRoot27flxzM, m3590getTerminator27flxzM())) {
                    if (z) {
                        if (!z) {
                            if (!Node.m3640equalsimpl0(m3585getParentbLpG9ms(iM3587getRoot27flxzM), m3590getTerminator27flxzM())) {
                                z = true != Node.m3640equalsimpl0(iM3587getRoot27flxzM, m3581getLeftbLpG9ms(m3585getParentbLpG9ms(iM3587getRoot27flxzM))) ? 2 : true;
                            }
                            iM3587getRoot27flxzM = m3585getParentbLpG9ms(iM3587getRoot27flxzM);
                        } else {
                            if (m3594overlapsXzpGiIY(iM3587getRoot27flxzM, i2, i3)) {
                                tempArray.add(iM3587getRoot27flxzM);
                            }
                            if (Node.m3640equalsimpl0(m3586getRightbLpG9ms(iM3587getRoot27flxzM), m3590getTerminator27flxzM()) || m3582getMax330cO7A(m3586getRightbLpG9ms(iM3587getRoot27flxzM)) < i2 || m3583getMin330cO7A(m3586getRightbLpG9ms(iM3587getRoot27flxzM)) > i3) {
                                z = 2;
                            } else {
                                iM3587getRoot27flxzM = m3586getRightbLpG9ms(iM3587getRoot27flxzM);
                            }
                        }
                    } else if (Node.m3640equalsimpl0(m3581getLeftbLpG9ms(iM3587getRoot27flxzM), m3590getTerminator27flxzM()) || m3582getMax330cO7A(m3581getLeftbLpG9ms(iM3587getRoot27flxzM)) < i2) {
                        z = true;
                    } else {
                        iM3587getRoot27flxzM = m3581getLeftbLpG9ms(iM3587getRoot27flxzM);
                    }
                }
                break loop0;
            }
        }
        tempArray.sort();
        MutableIntList mutableIntList = tempArray;
        int[] iArr = mutableIntList.content;
        int i4 = mutableIntList._size;
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = iArr[i5];
            T tM3579getItem330cO7A = m3579getItem330cO7A(i6);
            if (tM3579getItem330cO7A != null) {
                pVar.invoke(tM3579getItem330cO7A, Long.valueOf(m3589getStartEnd6gIMNq8(i6)));
            }
        }
        tempArray.clear();
    }

    /* renamed from: getColor-330cO7A, reason: not valid java name */
    public final int m3575getColor330cO7A(int i2) {
        return IntervalKt.unpackFlag1(this.nodeInfo.get(i2)) ? 0 : 1;
    }

    /* renamed from: getEnd-330cO7A, reason: not valid java name */
    public final int m3576getEnd330cO7A(int i2) {
        return Interval.m3615getEndimpl(m3589getStartEnd6gIMNq8(i2));
    }

    /* renamed from: getId-330cO7A, reason: not valid java name */
    public final int m3577getId330cO7A(int i2) {
        return IntervalKt.unpackValue1(this.nodeInfo.get(i2));
    }

    /* renamed from: getInterval-veTUMZY, reason: not valid java name */
    public final long m3578getIntervalveTUMZY(long j2) {
        int iM3560findNodevbMxnkM = m3560findNodevbMxnkM(j2);
        return Node.m3640equalsimpl0(iM3560findNodevbMxnkM, this.terminator) ? Interval.Companion.m3622getInvalid7D3R4FY() : m3589getStartEnd6gIMNq8(iM3560findNodevbMxnkM);
    }

    /* renamed from: getItem-330cO7A, reason: not valid java name */
    public final T m3579getItem330cO7A(int i2) {
        return this.items.get(i2 / 4);
    }

    /* renamed from: getItem-NDTVn_k, reason: not valid java name */
    public final /* synthetic */ <R extends T> R m3580getItemNDTVn_k(long j2) {
        if (IntervalHandle.m3627equalsimpl0(j2, IntervalHandle.Companion.m3633getInvalidmo69AQQ())) {
            return null;
        }
        T tM3579getItem330cO7A = m3579getItem330cO7A(m3560findNodevbMxnkM(j2));
        x.i();
        return tM3579getItem330cO7A;
    }

    /* renamed from: getLeft-bLpG9ms, reason: not valid java name */
    public final int m3581getLeftbLpG9ms(int i2) {
        return (int) (this.nodeInfo.get(i2 + 1) >> 32);
    }

    /* renamed from: getMax-330cO7A, reason: not valid java name */
    public final int m3582getMax330cO7A(int i2) {
        return Interval.m3615getEndimpl(m3584getMinMax6gIMNq8(i2));
    }

    /* renamed from: getMin-330cO7A, reason: not valid java name */
    public final int m3583getMin330cO7A(int i2) {
        return Interval.m3618getStartimpl(m3584getMinMax6gIMNq8(i2));
    }

    /* renamed from: getMinMax-6gIMNq8, reason: not valid java name */
    public final long m3584getMinMax6gIMNq8(int i2) {
        return this.nodeInfo.get(i2 + 3);
    }

    public final int getNextNodeId() {
        return this.nextNodeId;
    }

    /* renamed from: getParent-bLpG9ms, reason: not valid java name */
    public final int m3585getParentbLpG9ms(int i2) {
        return IntervalKt.unpackValue2(this.nodeInfo.get(i2));
    }

    /* renamed from: getRight-bLpG9ms, reason: not valid java name */
    public final int m3586getRightbLpG9ms(int i2) {
        return (int) (this.nodeInfo.get(i2 + 1) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: getRoot-27flxzM, reason: not valid java name */
    public final int m3587getRoot27flxzM() {
        return this.root;
    }

    /* renamed from: getStart-330cO7A, reason: not valid java name */
    public final int m3588getStart330cO7A(int i2) {
        return Interval.m3618getStartimpl(m3589getStartEnd6gIMNq8(i2));
    }

    /* renamed from: getStartEnd-6gIMNq8, reason: not valid java name */
    public final long m3589getStartEnd6gIMNq8(int i2) {
        return this.nodeInfo.get(i2 + 2);
    }

    /* renamed from: getTerminator-27flxzM, reason: not valid java name */
    public final int m3590getTerminator27flxzM() {
        return this.terminator;
    }

    public int hashCode() {
        int iHashCode = 0;
        for (int i2 = 4; i2 < this.nodeInfo._size; i2 += 4) {
            if (!m3591isDeleted330cO7A(i2)) {
                int iM3588getStart330cO7A = (((iHashCode * 31) + m3588getStart330cO7A(i2)) * 31) + m3576getEnd330cO7A(i2);
                T tM3579getItem330cO7A = m3579getItem330cO7A(i2);
                iHashCode = (iM3588getStart330cO7A * 31) + (tM3579getItem330cO7A != null ? tM3579getItem330cO7A.hashCode() : 0);
            }
        }
        return iHashCode;
    }

    /* renamed from: isDeleted-330cO7A, reason: not valid java name */
    public final boolean m3591isDeleted330cO7A(int i2) {
        return IntervalKt.unpackFlag2(this.nodeInfo.get(i2));
    }

    public final boolean isEmpty() {
        return Node.m3640equalsimpl0(this.root, this.terminator);
    }

    /* renamed from: lowestNode-bLpG9ms, reason: not valid java name */
    public final int m3592lowestNodebLpG9ms(int i2) {
        while (!Node.m3640equalsimpl0(m3581getLeftbLpG9ms(i2), this.terminator)) {
            i2 = m3581getLeftbLpG9ms(i2);
        }
        return i2;
    }

    public final void mapIntervals(int i2, int i3, l<? super Long, Long> lVar) {
        MutableIntList tempArray = getTempArray();
        if (!Node.m3640equalsimpl0(m3587getRoot27flxzM(), m3590getTerminator27flxzM()) && m3582getMax330cO7A(m3587getRoot27flxzM()) >= i2 && m3583getMin330cO7A(m3587getRoot27flxzM()) <= i3) {
            int iM3587getRoot27flxzM = m3587getRoot27flxzM();
            loop0: while (true) {
                boolean z = false;
                while (!Node.m3640equalsimpl0(iM3587getRoot27flxzM, m3590getTerminator27flxzM())) {
                    if (z) {
                        if (!z) {
                            if (!Node.m3640equalsimpl0(m3585getParentbLpG9ms(iM3587getRoot27flxzM), m3590getTerminator27flxzM())) {
                                z = true != Node.m3640equalsimpl0(iM3587getRoot27flxzM, m3581getLeftbLpG9ms(m3585getParentbLpG9ms(iM3587getRoot27flxzM))) ? 2 : true;
                            }
                            iM3587getRoot27flxzM = m3585getParentbLpG9ms(iM3587getRoot27flxzM);
                        } else {
                            if (m3588getStart330cO7A(iM3587getRoot27flxzM) <= i3 && m3576getEnd330cO7A(iM3587getRoot27flxzM) >= i2) {
                                tempArray.add(iM3587getRoot27flxzM);
                            }
                            if (Node.m3640equalsimpl0(m3586getRightbLpG9ms(iM3587getRoot27flxzM), m3590getTerminator27flxzM()) || m3582getMax330cO7A(m3586getRightbLpG9ms(iM3587getRoot27flxzM)) < i2 || m3583getMin330cO7A(m3586getRightbLpG9ms(iM3587getRoot27flxzM)) > i3) {
                                z = 2;
                            } else {
                                iM3587getRoot27flxzM = m3586getRightbLpG9ms(iM3587getRoot27flxzM);
                            }
                        }
                    } else if (Node.m3640equalsimpl0(m3581getLeftbLpG9ms(iM3587getRoot27flxzM), m3590getTerminator27flxzM()) || m3582getMax330cO7A(m3581getLeftbLpG9ms(iM3587getRoot27flxzM)) < i2) {
                        z = true;
                    } else {
                        iM3587getRoot27flxzM = m3581getLeftbLpG9ms(iM3587getRoot27flxzM);
                    }
                }
                break loop0;
            }
        }
        int i4 = tempArray._size;
        int i5 = i2;
        int i6 = 0;
        for (int i7 = 0; i7 < i4; i7++) {
            int i8 = tempArray.get(i7);
            long jLongValue = lVar.invoke(Long.valueOf(m3589getStartEnd6gIMNq8(i8))).longValue();
            int iM3588getStart330cO7A = m3588getStart330cO7A(i8);
            m3606setStartEndlzRq0xI(i8, jLongValue);
            m3569updateNodeMinMax330cO7A(i8);
            int iM3618getStartimpl = Interval.m3618getStartimpl(jLongValue);
            if (iM3618getStartimpl >= Interval.m3615getEndimpl(jLongValue)) {
                m3558detachNode330cO7A(i8);
                m3559disposeNode9hnwElY(i8, false);
            } else if (iM3618getStartimpl < i5 || iM3618getStartimpl > i3 || (iM3618getStartimpl != iM3588getStart330cO7A && iM3588getStart330cO7A < i2)) {
                m3558detachNode330cO7A(i8);
                tempArray.set(i6, tempArray.get(i7));
                i6++;
            } else {
                i5 = iM3618getStartimpl;
            }
        }
        for (int i9 = 0; i9 < i6; i9++) {
            int i10 = tempArray.get(i9);
            m3598setColor9hnwElY(i10, 0);
            m3602setMinMaxlzRq0xI(i10, m3589getStartEnd6gIMNq8(i10));
            m3601setLeftcfX_BQo(i10, m3590getTerminator27flxzM());
            m3604setRightcfX_BQo(i10, m3590getTerminator27flxzM());
            m3574attachNode330cO7A(i10);
        }
        tempArray.clear();
        cleanDeletedNodesIfNeeded();
    }

    /* renamed from: next-bLpG9ms, reason: not valid java name */
    public final int m3593nextbLpG9ms(int i2) {
        if (!Node.m3640equalsimpl0(m3586getRightbLpG9ms(i2), this.terminator)) {
            return m3592lowestNodebLpG9ms(m3586getRightbLpG9ms(i2));
        }
        int iM3585getParentbLpG9ms = m3585getParentbLpG9ms(i2);
        while (true) {
            int i3 = iM3585getParentbLpG9ms;
            int i4 = i2;
            i2 = i3;
            if (Node.m3640equalsimpl0(i2, this.terminator) || !Node.m3640equalsimpl0(i4, m3586getRightbLpG9ms(i2))) {
                break;
            }
            iM3585getParentbLpG9ms = m3585getParentbLpG9ms(i2);
        }
        return i2;
    }

    public final int nextTransition(int i2, int i3) {
        if (i3 >= i2) {
            return i3 == i2 ? i3 : m3561nextTransitionXzpGiIY(this.root, i2, i3);
        }
        throw new IllegalArgumentException("limit (" + i3 + ") cannot be less than start (" + i2 + ')');
    }

    /* renamed from: overlaps-XzpGiIY, reason: not valid java name */
    public final boolean m3594overlapsXzpGiIY(int i2, int i3, int i4) {
        return IntervalKt.m3634overlapsNFQVc3s(m3589getStartEnd6gIMNq8(i2), i3, i4);
    }

    /* renamed from: pop-2SV_EgM, reason: not valid java name */
    public final int m3595pop2SV_EgM(MutableIntList mutableIntList) {
        return mutableIntList.removeAt(mutableIntList._size - 1);
    }

    public final int previousTransition(int i2, int i3) {
        if (i3 <= i2) {
            return i3 == i2 ? i3 : m3562previousTransitionXzpGiIY(this.root, i2, i3);
        }
        throw new IllegalArgumentException("limit (" + i3 + ") cannot be greater than start (" + i2 + ')');
    }

    /* renamed from: refreshIntervalHandle-M8hg4EM, reason: not valid java name */
    public final long m3596refreshIntervalHandleM8hg4EM(long j2) {
        int iM3560findNodevbMxnkM = m3560findNodevbMxnkM(j2);
        return Node.m3640equalsimpl0(iM3560findNodevbMxnkM, this.terminator) ? IntervalHandle.Companion.m3633getInvalidmo69AQQ() : IntervalHandle.m3624constructorimpl(m3577getId330cO7A(iM3560findNodevbMxnkM), iM3560findNodevbMxnkM);
    }

    /* renamed from: removeInterval-NDTVn_k, reason: not valid java name */
    public final boolean m3597removeIntervalNDTVn_k(long j2) {
        int iM3560findNodevbMxnkM = m3560findNodevbMxnkM(j2);
        if (Node.m3640equalsimpl0(iM3560findNodevbMxnkM, this.terminator)) {
            return false;
        }
        m3558detachNode330cO7A(iM3560findNodevbMxnkM);
        m3559disposeNode9hnwElY(iM3560findNodevbMxnkM, true);
        return true;
    }

    /* renamed from: setColor-9hnwElY, reason: not valid java name */
    public final void m3598setColor9hnwElY(int i2, int i3) {
        this.nodeInfo.set(i2, IntervalKt.packFlag1(this.nodeInfo.get(i2), i3 == 0));
    }

    /* renamed from: setDeleted-9hnwElY, reason: not valid java name */
    public final void m3599setDeleted9hnwElY(int i2, boolean z) {
        this.nodeInfo.set(i2, IntervalKt.packFlag2(this.nodeInfo.get(i2), z));
    }

    /* renamed from: setItem-9hnwElY, reason: not valid java name */
    public final void m3600setItem9hnwElY(int i2, T t) {
        this.items.set(i2 / 4, t);
    }

    /* renamed from: setLeft-cfX_BQo, reason: not valid java name */
    public final void m3601setLeftcfX_BQo(int i2, int i3) {
        long j2 = ((int) (this.nodeInfo.get(r7) & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
        MutableLongList mutableLongList = this.nodeInfo;
        mutableLongList.set(i2 + 1, j2 | (i3 << 32));
    }

    /* renamed from: setMinMax-lzRq0xI, reason: not valid java name */
    public final void m3602setMinMaxlzRq0xI(int i2, long j2) {
        this.nodeInfo.set(i2 + 3, j2);
    }

    public final void setNextNodeId(int i2) {
        this.nextNodeId = i2;
    }

    /* renamed from: setParent-cfX_BQo, reason: not valid java name */
    public final void m3603setParentcfX_BQo(int i2, int i3) {
        this.nodeInfo.set(i2, IntervalKt.packValue2(this.nodeInfo.get(i2), i3));
    }

    /* renamed from: setRight-cfX_BQo, reason: not valid java name */
    public final void m3604setRightcfX_BQo(int i2, int i3) {
        this.nodeInfo.set(i2 + 1, (((int) (this.nodeInfo.get(r8) >> 32)) << 32) | (i3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
    }

    /* renamed from: setRoot-330cO7A, reason: not valid java name */
    public final void m3605setRoot330cO7A(int i2) {
        this.root = i2;
    }

    /* renamed from: setStartEnd-lzRq0xI, reason: not valid java name */
    public final void m3606setStartEndlzRq0xI(int i2, long j2) {
        this.nodeInfo.set(i2 + 2, j2);
    }

    public final void syncTo(IntIntervalTree<T> intIntervalTree) {
        if (intIntervalTree.isEmpty()) {
            clear();
            return;
        }
        this.nodeInfo.clear();
        MutableLongList mutableLongList = this.nodeInfo;
        mutableLongList.addAll(mutableLongList._size, intIntervalTree.nodeInfo);
        this.items.clear();
        this.items.addAll(intIntervalTree.items);
        this.root = intIntervalTree.root;
        this.deletedNodeCount = intIntervalTree.deletedNodeCount;
        this.nextNodeId = intIntervalTree.nextNodeId;
    }

    /* renamed from: updateInterval-dxd_mtc, reason: not valid java name */
    public final boolean m3607updateIntervaldxd_mtc(long j2, long j3) {
        int iM3560findNodevbMxnkM = m3560findNodevbMxnkM(j2);
        if (Node.m3640equalsimpl0(iM3560findNodevbMxnkM, this.terminator)) {
            return false;
        }
        m3568updateIntervallzRq0xI(iM3560findNodevbMxnkM, j3);
        return true;
    }

    /* renamed from: updateItem-Xc3goxU, reason: not valid java name */
    public final boolean m3608updateItemXc3goxU(long j2, T t) {
        int iM3560findNodevbMxnkM = m3560findNodevbMxnkM(j2);
        if (Node.m3640equalsimpl0(iM3560findNodevbMxnkM, this.terminator)) {
            return false;
        }
        m3600setItem9hnwElY(iM3560findNodevbMxnkM, t);
        return true;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IntIntervalTree() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ IntIntervalTree(IntIntervalTree intIntervalTree, int i2, o oVar) {
        this(1 == (i2 & 1) ? null : intIntervalTree);
    }
}
