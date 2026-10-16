package androidx.compose.runtime.composer.linkbuffer;

import androidx.collection.IntIntMapKt;
import androidx.collection.IntObjectMapKt;
import androidx.collection.IntSetKt;
import androidx.collection.MutableIntIntMap;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableIntSet;
import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.IntStack;
import androidx.media3.muxer.MuxerUtil;
import h.a.c;
import h.ab;
import h.e;
import h.e.b;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SlotTableAddressSpace {
    private MutableIntIntMap _largeSizes;
    private MutableIntObjectMap<LinkAnchor> anchors;
    private MutableIntObjectMap<MutableIntSet> calledByMap;
    private int freeSlotCount;
    private int[] groups;
    private Object[] slots;
    private MutableScatterMap<LinkAnchor, LinkGroupSourceInformation> sourceInformationMap;
    private int unallocatedEnd;
    private int unallocatedStart;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int[] EmptyGroupData = SlotTableAddresSpaceKt.newGroupsArray(6);
    private static final Object[] EmptySlotData = SlotTableAddresSpaceKt.newSlotsArray(0);

    public SlotTableAddressSpace() {
        this(EmptyGroupData, EmptySlotData);
        int[] iArr = this.groups;
        if (iArr[0] == 0 && iArr[1] == -1 && iArr[2] == 0 && iArr[3] == 6 && iArr[4] == 0) {
            int i2 = iArr[5];
        }
    }

    private final int allocateSlots(int i2) {
        int i3 = this.unallocatedStart;
        int i4 = i3 + i2;
        if (i4 <= this.unallocatedEnd) {
            this.unallocatedStart = i4;
            if (i2 > 15) {
                getLargeSizes().set(i3, i2);
            }
            Object[] objArr = this.slots;
            Object empty = Composer.Companion.getEmpty();
            x.f(objArr, "<this>");
            Arrays.fill(objArr, i3, i4, empty);
            return SlotTableAddresSpaceKt.slotRangeFromAddressAndSize(i3, i2);
        }
        compactAndMaybeGrow(i2);
        int i5 = this.unallocatedStart;
        int i6 = i5 + i2;
        if (i6 > this.unallocatedEnd) {
            ComposerKt.composeRuntimeError("compactAndMaybeGrow did not grow enough");
            throw new e();
        }
        this.unallocatedStart = i6;
        if (i2 > 15) {
            getLargeSizes().set(i5, i2);
        }
        Object[] objArr2 = this.slots;
        Object empty2 = Composer.Companion.getEmpty();
        x.f(objArr2, "<this>");
        Arrays.fill(objArr2, i5, i6, empty2);
        return SlotTableAddresSpaceKt.slotRangeFromAddressAndSize(i5, i2);
    }

    private final void compactAndMaybeGrow(int i2) {
        Object[] objArrNewSlotsArray;
        int i3;
        Object[] objArr = this.slots;
        int length = objArr.length;
        int i4 = length - ((this.unallocatedEnd - this.unallocatedStart) + this.freeSlotCount);
        int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros((i2 + i4) + (length >> 5)));
        if (iNumberOfLeadingZeros < length) {
            iNumberOfLeadingZeros = length;
        }
        if (iNumberOfLeadingZeros != length) {
            if (iNumberOfLeadingZeros < 256) {
                iNumberOfLeadingZeros = 256;
            }
            objArrNewSlotsArray = SlotTableAddresSpaceKt.newSlotsArray(iNumberOfLeadingZeros);
        } else {
            objArrNewSlotsArray = objArr;
        }
        MutableIntIntMap mutableIntIntMapMutableIntIntMapOf = IntIntMapKt.mutableIntIntMapOf();
        int i5 = this.groups[3];
        SlotMoveManager slotMoveManager = new SlotMoveManager(objArr, objArrNewSlotsArray);
        int i6 = 6;
        int iD = b.d(6, i5 - 1, 6);
        if (iD >= 6) {
            i3 = 0;
            while (true) {
                int i7 = i6 + 5;
                int i8 = this.groups[i7];
                if (i8 != -1) {
                    int i9 = (i8 & 15) + 1;
                    int i10 = i8 >> 4;
                    if (i9 > 15) {
                        i9 = getLargeSizes().get(i10);
                    }
                    slotMoveManager.move(i3, i10, i10 + i9);
                    if (i9 > 15) {
                        mutableIntIntMapMutableIntIntMapOf.set(i3, i9);
                    }
                    this.groups[i7] = SlotTableAddresSpaceKt.slotRangeFromAddressAndSize(i3, i9);
                    i3 += i9;
                }
                if (i6 == iD) {
                    break;
                } else {
                    i6 += 6;
                }
            }
        } else {
            i3 = 0;
        }
        if (i3 != i4) {
            ComposerKt.composeImmediateRuntimeError("Unexpected slot compaction result, computed we had " + i4 + " slots, but copied " + i3 + " slots");
        }
        this.slots = slotMoveManager.done();
        if (true != mutableIntIntMapMutableIntIntMapOf.isNotEmpty()) {
            mutableIntIntMapMutableIntIntMapOf = null;
        }
        this._largeSizes = mutableIntIntMapMutableIntIntMapOf;
        this.unallocatedStart = i3;
        this.unallocatedEnd = objArrNewSlotsArray.length;
        this.freeSlotCount = 0;
    }

    private static final int copyTreeFrom$copyGroup(SlotTableAddressSpace slotTableAddressSpace, SlotTableAddressSpace slotTableAddressSpace2, int i2, int i3) {
        int[] iArr = slotTableAddressSpace.groups;
        Object[] objArr = slotTableAddressSpace.slots;
        int i4 = iArr[i3 + 4];
        int i5 = iArr[i3];
        int iGroupAllocate = SlotTableAddresSpaceKt.groupAllocate(slotTableAddressSpace2.getGroups(), i5, i2, i4);
        if (iGroupAllocate < 0) {
            slotTableAddressSpace2.growGroups();
            iGroupAllocate = SlotTableAddresSpaceKt.groupAllocate(slotTableAddressSpace2.getGroups(), i5, i2, i4);
        }
        slotTableAddressSpace2.moveSourceInformation(slotTableAddressSpace, slotTableAddressSpace2.moveAnchorFrom(slotTableAddressSpace, i3, iGroupAllocate));
        int i6 = iArr[i3 + 5];
        if (i6 != -1) {
            int i7 = (i6 & 15) + 1;
            int i8 = i6 >> 4;
            if (i7 > 15) {
                i7 = slotTableAddressSpace.getLargeSizes().get(i8);
            }
            int iAllocateSlots = slotTableAddressSpace2.allocateSlots(i7);
            c.at(objArr, slotTableAddressSpace2.slots, iAllocateSlots >> 4, i8, i7 + i8);
            slotTableAddressSpace2.groups[iGroupAllocate + 5] = iAllocateSlots;
        }
        int i9 = iArr[i3 + 3];
        int i10 = -1;
        while (i9 != -1) {
            int iCopyTreeFrom$copyGroup = copyTreeFrom$copyGroup(slotTableAddressSpace, slotTableAddressSpace2, iGroupAllocate, i9);
            if (i10 == -1) {
                slotTableAddressSpace2.groups[iGroupAllocate + 3] = iCopyTreeFrom$copyGroup;
            } else {
                slotTableAddressSpace2.groups[i10 + 1] = iCopyTreeFrom$copyGroup;
            }
            i9 = iArr[i9 + 1];
            i10 = iCopyTreeFrom$copyGroup;
        }
        return iGroupAllocate;
    }

    private final void freeGroup(int i2) {
        int[] iArr = this.groups;
        if (i2 + 6 > iArr.length) {
            return;
        }
        int i3 = i2 + 4;
        if ((iArr[i3] & GroupFlagsSpec.CHILD_NODE_COUNT_MASK) == 8388607) {
            ComposerKt.composeImmediateRuntimeError(a.a(i2, "Recursive loop in group structure detected at "));
        }
        LinkAnchor linkAnchor = this.anchors.get(i2);
        if (linkAnchor != null) {
            linkAnchor.setAddress(-1);
            this.anchors.remove(i2);
            MutableScatterMap<LinkAnchor, LinkGroupSourceInformation> mutableScatterMap = this.sourceInformationMap;
            if (mutableScatterMap != null) {
                mutableScatterMap.remove(linkAnchor);
            }
        }
        int i4 = i2 + 5;
        freeSlots(iArr[i4]);
        iArr[i4] = -1;
        int i5 = iArr[i2 + 3];
        while (i5 != -1) {
            if (i5 + 6 > iArr.length) {
                return;
            }
            int i6 = iArr[i5 + 1];
            freeGroup(i5);
            i5 = i6;
        }
        iArr[i2 + 1] = iArr[1];
        iArr[i2 + 2] = -1;
        iArr[1] = i2;
        iArr[i3] = 8388607;
    }

    private final void freeSlots(int i2) {
        if (i2 != -1) {
            int i3 = i2 & 15;
            int i4 = i2 >> 4;
            int i5 = i3 + 1;
            if (i5 > 15) {
                i5 = getLargeSizes().get(i4);
            }
            freeSlotsAt(i4, i5);
        }
    }

    private final void freeSlotsAt(int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = i2 + 1;
        Object[] objArr = this.slots;
        if (i4 == i5) {
            objArr[i2] = SlotTableAddresSpaceKt.Unallocated;
        } else {
            Object obj = SlotTableAddresSpaceKt.Unallocated;
            x.f(objArr, "<this>");
            Arrays.fill(objArr, i2, i4, obj);
        }
        this.freeSlotCount += i3;
        if (i3 > 15) {
            getLargeSizes().remove(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MutableIntIntMap getLargeSizes() {
        MutableIntIntMap mutableIntIntMap = this._largeSizes;
        if (mutableIntIntMap != null) {
            return mutableIntIntMap;
        }
        MutableIntIntMap mutableIntIntMapMutableIntIntMapOf = IntIntMapKt.mutableIntIntMapOf();
        this._largeSizes = mutableIntIntMapMutableIntIntMapOf;
        return mutableIntIntMapMutableIntIntMapOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void growGroups() {
        int[] iArr = this.groups;
        int length = iArr.length;
        int i2 = length + length;
        if (i2 < 768) {
            i2 = 768;
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, i2);
        x.e(iArrCopyOf, "copyOf(...)");
        this.groups = iArrCopyOf;
        SlotTableAddresSpaceKt.initGroups(iArrCopyOf, length);
    }

    private final int growSlotRangeAtGroup(int i2, int i3, int i4) {
        int i5;
        int i6 = this.unallocatedStart;
        int i7 = this.unallocatedEnd;
        int i8 = i2 + 5;
        int i9 = this.groups[i8] >> 4;
        int i10 = i9 + i3;
        int i11 = i4 - i3;
        if (i10 == i6 && (i5 = i9 + i4) <= i7) {
            int i12 = i10 + 1;
            this.unallocatedStart = i6 + i11;
            if (i4 > 15) {
                getLargeSizes().set(i9, i4);
            }
            int iSlotRangeFromAddressAndSize = SlotTableAddresSpaceKt.slotRangeFromAddressAndSize(i9, i4);
            Object[] objArr = this.slots;
            if (i5 == i12) {
                objArr[i10] = SlotTableAddresSpaceKt.Unallocated;
            } else {
                Object obj = SlotTableAddresSpaceKt.Unallocated;
                x.f(objArr, "<this>");
                Arrays.fill(objArr, i10, i5, obj);
            }
            this.groups[i8] = iSlotRangeFromAddressAndSize;
            return iSlotRangeFromAddressAndSize;
        }
        Object[] objArr2 = this.slots;
        int i13 = i10 + i11;
        if (i13 < objArr2.length) {
            for (int i14 = i10; i14 < i13; i14++) {
                if (objArr2[i14] == SlotTableAddresSpaceKt.Unallocated) {
                }
            }
            int i15 = i10 + 1;
            if (i4 > 15) {
                getLargeSizes().set(i9, i4);
            }
            int iSlotRangeFromAddressAndSize2 = SlotTableAddresSpaceKt.slotRangeFromAddressAndSize(i9, i4);
            Object[] objArr3 = this.slots;
            int i16 = i9 + i4;
            if (i16 == i15) {
                objArr3[i10] = SlotTableAddresSpaceKt.Unallocated;
            } else {
                Object obj2 = SlotTableAddresSpaceKt.Unallocated;
                x.f(objArr3, "<this>");
                Arrays.fill(objArr3, i10, i16, obj2);
            }
            this.groups[i8] = iSlotRangeFromAddressAndSize2;
            this.freeSlotCount -= i11;
            return iSlotRangeFromAddressAndSize2;
        }
        int i17 = i4 + 8;
        int iShrinkSlotRange = shrinkSlotRange(allocateSlots(i17), i17, i4);
        int i18 = iShrinkSlotRange >> 4;
        int i19 = this.groups[i8] >> 4;
        if (i18 != i19) {
            Object[] objArr4 = this.slots;
            c.at(objArr4, objArr4, i18, i19, i19 + i3);
            freeSlotsAt(i19, i3);
        }
        this.groups[i8] = iShrinkSlotRange;
        return iShrinkSlotRange;
    }

    private final void removeSourceInformation(int i2) {
        LinkAnchor linkAnchor;
        LinkAnchor linkAnchor2;
        LinkGroupSourceInformation linkGroupSourceInformation;
        MutableScatterMap<LinkAnchor, LinkGroupSourceInformation> mutableScatterMap = this.sourceInformationMap;
        if (mutableScatterMap == null || (linkAnchor = this.anchors.get(i2)) == null || (linkAnchor2 = this.anchors.get(this.groups[i2 + 2])) == null || (linkGroupSourceInformation = mutableScatterMap.get(linkAnchor2)) == null) {
            return;
        }
        linkGroupSourceInformation.removeGroup(linkAnchor);
    }

    private final int shrinkSlotRange(int i2, int i3, int i4) {
        int i5 = i2 >> 4;
        if (i4 == 0) {
            if (i2 != -1) {
                freeSlotsAt(i5, i3);
            }
            return -1;
        }
        int i6 = i3 - i4;
        int i7 = i5 + i4;
        if (i6 > 0) {
            freeSlotsAt(i7, i6);
        }
        if (i4 > 15) {
            getLargeSizes().set(i5, i4);
        }
        return SlotTableAddresSpaceKt.slotRangeFromAddressAndSize(i5, i4);
    }

    private final int shrinkSlotRangeAtGroup(int i2, int i3, int i4) {
        int i5 = i2 + 5;
        int iShrinkSlotRange = shrinkSlotRange(this.groups[i5], i3, i4);
        this.groups[i5] = iShrinkSlotRange;
        return iShrinkSlotRange;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void traverseGroup$runtime$default(androidx.compose.runtime.composer.linkbuffer.SlotTableAddressSpace r2, int r3, boolean r4, h.g.a.l r5, int r6, java.lang.Object r7) {
        /*
            if (r3 >= 0) goto L3
            goto L38
        L3:
            androidx.compose.runtime.IntStack r7 = new androidx.compose.runtime.IntStack
            r7.<init>()
            int[] r2 = r2.getGroups()
            r0 = r3
        Ld:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r5.invoke(r1)
            if (r0 != r3) goto L20
            r1 = r6 & 2
            if (r1 == 0) goto L1c
            r1 = 0
            goto L1d
        L1c:
            r1 = 1
        L1d:
            r1 = r1 & r4
            if (r1 == 0) goto L29
        L20:
            int r1 = r0 + 1
            r1 = r2[r1]
            if (r1 < 0) goto L29
            r7.push(r1)
        L29:
            int r0 = r0 + 3
            r0 = r2[r0]
            if (r0 >= 0) goto Ld
            int r0 = r7.tos
            if (r0 == 0) goto L38
            int r0 = r7.pop()
            goto Ld
        L38:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.composer.linkbuffer.SlotTableAddressSpace.traverseGroup$runtime$default(androidx.compose.runtime.composer.linkbuffer.SlotTableAddressSpace, int, boolean, h.g.a.l, int, java.lang.Object):void");
    }

    public static /* synthetic */ void traverseGroupAndParents$runtime$default(SlotTableAddressSpace slotTableAddressSpace, int i2, boolean z, l lVar, int i3, Object obj) {
        int i4 = i3 & 2;
        int[] groups = slotTableAddressSpace.getGroups();
        int i5 = !(z | ((i4 == 0) ^ true)) ? groups[i2 + 2] : i2;
        while (i5 > 0) {
            lVar.invoke(Integer.valueOf(i5));
            i5 = groups[i5 + 2];
        }
        if (i5 != 0) {
            return;
        }
        ComposerKt.composeImmediateRuntimeError(a.a(i2, "Traversing parent of group not in the slot table: "));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void traverseGroupPartially$runtime$default(androidx.compose.runtime.composer.linkbuffer.SlotTableAddressSpace r3, int r4, boolean r5, h.g.a.l r6, int r7, java.lang.Object r8) {
        /*
            if (r4 >= 0) goto L3
            goto L41
        L3:
            androidx.compose.runtime.IntStack r8 = new androidx.compose.runtime.IntStack
            r8.<init>()
            int[] r3 = r3.getGroups()
            r0 = r4
        Ld:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r6.invoke(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r0 != r4) goto L27
            r2 = r7 & 2
            if (r2 == 0) goto L23
            r2 = 0
            goto L24
        L23:
            r2 = 1
        L24:
            r2 = r2 & r5
            if (r2 == 0) goto L30
        L27:
            int r2 = r0 + 1
            r2 = r3[r2]
            if (r2 < 0) goto L30
            r8.push(r2)
        L30:
            int r0 = r0 + 3
            r0 = r3[r0]
            if (r1 == 0) goto L38
            if (r0 >= 0) goto Ld
        L38:
            int r0 = r8.tos
            if (r0 == 0) goto L41
            int r0 = r8.pop()
            goto Ld
        L41:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.composer.linkbuffer.SlotTableAddressSpace.traverseGroupPartially$runtime$default(androidx.compose.runtime.composer.linkbuffer.SlotTableAddressSpace, int, boolean, h.g.a.l, int, java.lang.Object):void");
    }

    private final void validateSlotReferences(int[] iArr) {
        MutableIntIntMap mutableIntIntMapMutableIntIntMapOf = IntIntMapKt.mutableIntIntMapOf();
        int length = this.slots.length;
        int i2 = 6;
        int iD = b.d(6, iArr[3] - 1, 6);
        if (iD >= 6) {
            while (true) {
                int i3 = iArr[i2 + 5];
                if (i3 != -1) {
                    int i4 = i3 & 15;
                    int i5 = i3 >> 4;
                    int i6 = i4 + 1;
                    if (i6 > 15) {
                        i6 = getLargeSizes().get(i5);
                    }
                    if (i5 < 0) {
                        throw new IllegalStateException("Group " + i2 + " has an invalid slot address");
                    }
                    int i7 = i6 + i5;
                    if (i7 > length) {
                        throw new IllegalStateException("Group " + i2 + " slot range extends beyond the slot size");
                    }
                    while (i5 < i7) {
                        if (mutableIntIntMapMutableIntIntMapOf.containsKey(i5)) {
                            int i8 = mutableIntIntMapMutableIntIntMapOf.get(i5);
                            throw new IllegalStateException("Group " + i2 + " contains a slot address (" + validateSlotReferences$slotRangeTextOf(this, iArr, i2) + ") that overlaps with group " + i8 + "'s address (" + validateSlotReferences$slotRangeTextOf(this, iArr, i8) + ')');
                        }
                        mutableIntIntMapMutableIntIntMapOf.set(i5, i2);
                        i5++;
                    }
                }
                if (i2 == iD) {
                    break;
                } else {
                    i2 += 6;
                }
            }
        }
        int length2 = (this.slots.length - mutableIntIntMapMutableIntIntMapOf.getSize()) - (this.unallocatedEnd - this.unallocatedStart);
        if (this.freeSlotCount == length2) {
            return;
        }
        throw new IllegalStateException("Unexpected freeSlotCount, " + this.freeSlotCount + ", expected " + length2);
    }

    private static final String validateSlotReferences$slotRangeTextOf(SlotTableAddressSpace slotTableAddressSpace, int[] iArr, int i2) {
        int i3 = iArr[i2 + 5];
        int i4 = i3 & 15;
        int i5 = i3 >> 4;
        int i6 = i4 + 1;
        if (i6 > 15) {
            i6 = slotTableAddressSpace.getLargeSizes().get(i5);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i5);
        sb.append('-');
        sb.append(i5 + i6);
        return sb.toString();
    }

    public final int allocateGroup(int i2, int i3, int i4) {
        int iGroupAllocate = SlotTableAddresSpaceKt.groupAllocate(getGroups(), i2, i3, i4);
        if (iGroupAllocate >= 0) {
            return iGroupAllocate;
        }
        growGroups();
        return SlotTableAddresSpaceKt.groupAllocate(getGroups(), i2, i3, i4);
    }

    public final LinkAnchor anchorOfAddress(int i2) {
        if (i2 == -1) {
            return LinkAnchorKt.getNullAnchor();
        }
        if (i2 == 0) {
            return LinkAnchorKt.getLazyAnchor();
        }
        if (i2 < 0) {
            ComposerKt.composeImmediateRuntimeError(a.a(i2, "Invalid anchor address "));
        }
        MutableIntObjectMap<LinkAnchor> mutableIntObjectMap = this.anchors;
        LinkAnchor linkAnchor = mutableIntObjectMap.get(i2);
        if (linkAnchor == null) {
            linkAnchor = new LinkAnchor(i2);
            mutableIntObjectMap.set(i2, linkAnchor);
        }
        return linkAnchor;
    }

    public final boolean contains(int i2) {
        return i2 > 0 && i2 < this.groups[3];
    }

    public final int copyTreeFrom(SlotTableAddressSpace slotTableAddressSpace, int i2) {
        return copyTreeFrom$copyGroup(slotTableAddressSpace, this, -1, i2);
    }

    public final int distanceFrom$runtime(int i2, int i3) {
        int[] iArr = this.groups;
        int i4 = 0;
        while (i2 != i3 && i2 >= 0) {
            i2 = iArr[i2 + 2];
            i4++;
        }
        return i4;
    }

    public final void freeGroupTree(int i2) {
        removeSourceInformation(i2);
        freeGroup(i2);
    }

    public final MutableIntObjectMap<MutableIntSet> getCalledByMap$runtime() {
        return this.calledByMap;
    }

    public final int[] getGroups() {
        return this.groups;
    }

    public final Object[] getSlots() {
        return this.slots;
    }

    public final MutableScatterMap<LinkAnchor, LinkGroupSourceInformation> getSourceInformationMap() {
        return this.sourceInformationMap;
    }

    public final LinkAnchor moveAnchorFrom(SlotTableAddressSpace slotTableAddressSpace, int i2, int i3) {
        this.anchors.containsKey(i3);
        LinkAnchor linkAnchorRemove = slotTableAddressSpace.anchors.remove(i2);
        if (linkAnchorRemove == null) {
            return null;
        }
        linkAnchorRemove.setAddress(i3);
        this.anchors.set(i3, linkAnchorRemove);
        return linkAnchorRemove;
    }

    public final void moveSourceInformation(SlotTableAddressSpace slotTableAddressSpace, LinkAnchor linkAnchor) {
        MutableScatterMap<LinkAnchor, LinkGroupSourceInformation> mutableScatterMap;
        LinkGroupSourceInformation linkGroupSourceInformation;
        if (linkAnchor == null || (mutableScatterMap = slotTableAddressSpace.sourceInformationMap) == null || (linkGroupSourceInformation = mutableScatterMap.get(linkAnchor)) == null) {
            return;
        }
        MutableScatterMap<LinkAnchor, LinkGroupSourceInformation> mutableScatterMapMutableScatterMapOf = this.sourceInformationMap;
        if (mutableScatterMapMutableScatterMapOf == null) {
            mutableScatterMapMutableScatterMapOf = ScatterMapKt.mutableScatterMapOf();
            this.sourceInformationMap = mutableScatterMapMutableScatterMapOf;
        } else {
            mutableScatterMapMutableScatterMapOf.contains(linkAnchor);
        }
        mutableScatterMapMutableScatterMapOf.set(linkAnchor, linkGroupSourceInformation);
        mutableScatterMap.remove(linkAnchor);
    }

    public final boolean ownsAnchor(LinkAnchor linkAnchor) {
        return this.anchors.get(linkAnchor.getAddress()) == linkAnchor;
    }

    public final Object readSlot(int i2, int i3) {
        return this.slots[(this.groups[i2 + 5] >> 4) + i3];
    }

    public final void recordCalledBy(int i2, int i3) {
        MutableIntObjectMap<MutableIntSet> mutableIntObjectMapMutableIntObjectMapOf = this.calledByMap;
        if (mutableIntObjectMapMutableIntObjectMapOf == null) {
            mutableIntObjectMapMutableIntObjectMapOf = IntObjectMapKt.mutableIntObjectMapOf();
            this.calledByMap = mutableIntObjectMapMutableIntObjectMapOf;
        }
        MutableIntSet mutableIntSetMutableIntSetOf = mutableIntObjectMapMutableIntObjectMapOf.get(i2);
        if (mutableIntSetMutableIntSetOf == null) {
            mutableIntSetMutableIntSetOf = IntSetKt.mutableIntSetOf();
            mutableIntObjectMapMutableIntObjectMapOf.set(i2, mutableIntSetMutableIntSetOf);
        }
        mutableIntSetMutableIntSetOf.add(i3);
    }

    public final void recordLargeBlock(int i2, int i3) {
        getLargeSizes().set(i2, i3);
    }

    public final void recordMovedSourceInformation(int i2, int i3) {
        LinkGroupSourceInformation linkGroupSourceInformation;
        MutableScatterMap<LinkAnchor, LinkGroupSourceInformation> mutableScatterMap = this.sourceInformationMap;
        if (mutableScatterMap == null) {
            return;
        }
        LinkAnchor linkAnchor = this.anchors.get(this.groups[i2 + 2]);
        if (linkAnchor == null || (linkGroupSourceInformation = mutableScatterMap.get(linkAnchor)) == null) {
            return;
        }
        linkGroupSourceInformation.addGroupAfter(i3 != -1 ? anchorOfAddress(i3) : null, anchorOfAddress(i2));
    }

    public final LinkGroupSourceInformation recordSourceInformation(int i2, String str, int i3) {
        MutableScatterMap<LinkAnchor, LinkGroupSourceInformation> mutableScatterMapMutableScatterMapOf = this.sourceInformationMap;
        if (mutableScatterMapMutableScatterMapOf == null) {
            mutableScatterMapMutableScatterMapOf = ScatterMapKt.mutableScatterMapOf();
            this.sourceInformationMap = mutableScatterMapMutableScatterMapOf;
        }
        LinkAnchor linkAnchorAnchorOfAddress = anchorOfAddress(i2);
        LinkGroupSourceInformation linkGroupSourceInformation = mutableScatterMapMutableScatterMapOf.get(linkAnchorAnchorOfAddress);
        if (linkGroupSourceInformation == null) {
            linkGroupSourceInformation = new LinkGroupSourceInformation(0, str, 0);
            if (str == null) {
                int i4 = this.groups[i2 + 3];
                while (i4 != i3 && i4 != -1) {
                    linkGroupSourceInformation.reportGroup(anchorOfAddress(i4));
                    i4 = this.groups[i4 + 1];
                }
            }
            mutableScatterMapMutableScatterMapOf.set(linkAnchorAnchorOfAddress, linkGroupSourceInformation);
        }
        return linkGroupSourceInformation;
    }

    public final long reserveSlots() {
        int i2 = this.unallocatedStart;
        int i3 = this.unallocatedEnd;
        this.unallocatedStart = i3;
        return ((i3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE) << 32) | (i2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    public final int resizeSlotRangeAtGroup(int i2, int i3) {
        int i4;
        int i5 = this.groups[i2 + 5];
        if (i5 == -1) {
            if (i3 == 0) {
                return -1;
            }
            i5 = -1;
        }
        if (i5 == -1) {
            i4 = 0;
        } else {
            int i6 = (i5 & 15) + 1;
            i4 = i6 > 15 ? getLargeSizes().get(i5 >> 4) : i6;
        }
        return resizeSlotRangeAtGroup(i2, i4, i3);
    }

    public final void restoreSlots(int i2, int i3) {
        if (i3 == this.unallocatedEnd) {
            this.unallocatedStart = i2;
        }
    }

    public final void setCalledByMap$runtime(MutableIntObjectMap<MutableIntSet> mutableIntObjectMap) {
        this.calledByMap = mutableIntObjectMap;
    }

    public final void setGroups(int[] iArr) {
        this.groups = iArr;
    }

    public final void setSlots(Object[] objArr) {
        this.slots = objArr;
    }

    public final void setSourceInformationMap(MutableScatterMap<LinkAnchor, LinkGroupSourceInformation> mutableScatterMap) {
        this.sourceInformationMap = mutableScatterMap;
    }

    public final <R> R slotAddressAndSize(int i2, p<? super Integer, ? super Integer, ? extends R> pVar) {
        int i3 = (i2 & 15) + 1;
        int i4 = i2 >> 4;
        if (i3 > 15) {
            i3 = getLargeSizes().get(i4);
        }
        return pVar.invoke(Integer.valueOf(i4), Integer.valueOf(i3));
    }

    public final int slotSize(int i2) {
        if (i2 == -1) {
            return 0;
        }
        int i3 = (i2 & 15) + 1;
        return i3 > 15 ? getLargeSizes().get(i2 >> 4) : i3;
    }

    public final LinkGroupSourceInformation sourceInformationOf(int i2) {
        LinkAnchor linkAnchor;
        MutableScatterMap<LinkAnchor, LinkGroupSourceInformation> mutableScatterMap = this.sourceInformationMap;
        if (mutableScatterMap == null || (linkAnchor = this.anchors.get(i2)) == null) {
            return null;
        }
        return mutableScatterMap.get(linkAnchor);
    }

    public final String toDebugString() {
        StringBuilder sb = new StringBuilder("SlotTableAddressSpace:\n  Group size: ");
        int[] iArr = this.groups;
        int length = iArr.length;
        sb.append(length);
        sb.append("\n  Slots size: ");
        sb.append(this.slots.length);
        sb.append("\n\n Groups:\n  Unallocated groups: ");
        int i2 = (length - iArr[3]) / 6;
        sb.append(i2);
        sb.append('\n');
        int i3 = 0;
        for (int i4 = iArr[1]; i4 != -1; i4 = iArr[i4 + 1]) {
            i3++;
        }
        sb.append("  Free groups:        ");
        sb.append(i3);
        sb.append("\n  Total free groups:  ");
        sb.append(i3 + i2);
        sb.append("\n  Used group%:        ");
        sb.append((r1 - r5) / (iArr.length / 6));
        int i5 = this.unallocatedEnd - this.unallocatedStart;
        sb.append("\n\n Slots:\n  Unallocated slots: ");
        sb.append(i5);
        sb.append("\n  Slot used%:    ");
        sb.append(((r2 - this.freeSlotCount) - i5) / this.slots.length);
        sb.append('\n');
        return sb.toString();
    }

    public final void traverseAllChildren$runtime(int i2, l<? super Integer, ab> lVar) {
        int iPop;
        if (i2 < 0 || (iPop = getGroups()[i2 + 3]) < 0) {
            return;
        }
        IntStack intStack = new IntStack();
        int[] groups = getGroups();
        while (true) {
            lVar.invoke(Integer.valueOf(iPop));
            int i3 = groups[iPop + 1];
            if (i3 >= 0) {
                intStack.push(i3);
            }
            iPop = groups[iPop + 3];
            if (iPop < 0) {
                if (intStack.tos == 0) {
                    return;
                } else {
                    iPop = intStack.pop();
                }
            }
        }
    }

    public final void traverseChildren$runtime(int i2, l<? super Integer, ab> lVar) {
        int[] groups = getGroups();
        for (int i3 = groups[i2 + 3]; i3 > 0; i3 = groups[i3 + 1]) {
            lVar.invoke(Integer.valueOf(i3));
        }
    }

    public final void traverseGroup$runtime(int i2, boolean z, l<? super Integer, ab> lVar) {
        int i3;
        if (i2 < 0) {
            return;
        }
        IntStack intStack = new IntStack();
        int[] groups = getGroups();
        int iPop = i2;
        while (true) {
            lVar.invoke(Integer.valueOf(iPop));
            if ((iPop != i2 || z) && (i3 = groups[iPop + 1]) >= 0) {
                intStack.push(i3);
            }
            iPop = groups[iPop + 3];
            if (iPop < 0) {
                if (intStack.tos == 0) {
                    return;
                } else {
                    iPop = intStack.pop();
                }
            }
        }
    }

    public final void traverseGroupAndParents$runtime(int i2, boolean z, l<? super Integer, ab> lVar) {
        int[] groups = getGroups();
        int i3 = !z ? groups[i2 + 2] : i2;
        while (i3 > 0) {
            lVar.invoke(Integer.valueOf(i3));
            i3 = groups[i3 + 2];
        }
        if (i3 != 0) {
            return;
        }
        ComposerKt.composeImmediateRuntimeError(a.a(i2, "Traversing parent of group not in the slot table: "));
    }

    public final void traverseGroupPartially$runtime(int i2, boolean z, l<? super Integer, Boolean> lVar) {
        int i3;
        if (i2 < 0) {
            return;
        }
        IntStack intStack = new IntStack();
        int[] groups = getGroups();
        int iPop = i2;
        while (true) {
            boolean zBooleanValue = lVar.invoke(Integer.valueOf(iPop)).booleanValue();
            if ((iPop != i2 || z) && (i3 = groups[iPop + 1]) >= 0) {
                intStack.push(i3);
            }
            iPop = groups[iPop + 3];
            if (!zBooleanValue || iPop < 0) {
                if (intStack.tos == 0) {
                    return;
                } else {
                    iPop = intStack.pop();
                }
            }
        }
    }

    public final void traverseParents$runtime(int i2, l<? super Integer, ab> lVar) {
        int[] groups = getGroups();
        int i3 = groups[i2 + 2];
        while (i3 > 0) {
            lVar.invoke(Integer.valueOf(i3));
            i3 = groups[i3 + 2];
        }
        if (i3 != 0) {
            return;
        }
        ComposerKt.composeImmediateRuntimeError(a.a(i2, "Traversing parent of group not in the slot table: "));
    }

    public final void traverseSiblings$runtime(int i2, l<? super Integer, ab> lVar) {
        int[] groups = getGroups();
        while (i2 >= 0) {
            lVar.invoke(Integer.valueOf(i2));
            i2 = groups[i2 + 1];
        }
    }

    public final void traverseSiblingsAfter$runtime(int i2, l<? super Integer, ab> lVar) {
        int[] groups = getGroups();
        for (int i3 = groups[i2 + 1]; i3 >= 0; i3 = groups[i3 + 1]) {
            lVar.invoke(Integer.valueOf(i3));
        }
    }

    public final void validate() {
        SlotTableAddresSpaceKt.validateFreeList(this.groups);
        validateSlotReferences(this.groups);
    }

    public final int writeSlot(int i2, int i3, Object obj) {
        int[] iArr = this.groups;
        int i4 = i2 + 5;
        int iGrowSlotRangeAtGroup = iArr[i4];
        if (iGrowSlotRangeAtGroup == -1) {
            iGrowSlotRangeAtGroup = allocateSlots(i3 + 1);
            iArr[i4] = iGrowSlotRangeAtGroup;
        } else {
            int i5 = (iGrowSlotRangeAtGroup & 15) + 1;
            int i6 = iGrowSlotRangeAtGroup >> 4;
            if (i5 > 15) {
                i5 = getLargeSizes().get(i6);
            }
            if (i3 >= i5) {
                iGrowSlotRangeAtGroup = growSlotRangeAtGroup(i2, i5, i3 + 1);
            }
        }
        this.slots[(iGrowSlotRangeAtGroup >> 4) + i3] = obj;
        return iGrowSlotRangeAtGroup;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public static /* synthetic */ void getSourceInformationMap$annotations() {
    }

    public SlotTableAddressSpace(int i2, int i3) {
        this(SlotTableAddresSpaceKt.newGroupsArray(i2), SlotTableAddresSpaceKt.newSlotsArray(i3));
    }

    public SlotTableAddressSpace(int[] iArr, Object[] objArr) {
        this.groups = iArr;
        this.slots = objArr;
        this.unallocatedEnd = objArr.length;
        this.anchors = IntObjectMapKt.mutableIntObjectMapOf();
    }

    public final int resizeSlotRangeAtGroup(int i2, int i3, int i4) {
        if (i4 == i3) {
            return this.groups[i2 + 5];
        }
        if (i4 > i3) {
            return growSlotRangeAtGroup(i2, i3, i4);
        }
        return shrinkSlotRangeAtGroup(i2, i3, i4);
    }
}
