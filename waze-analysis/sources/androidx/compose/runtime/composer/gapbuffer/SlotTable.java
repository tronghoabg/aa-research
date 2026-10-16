package androidx.compose.runtime.composer.gapbuffer;

import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableIntSet;
import androidx.collection.MutableObjectList;
import androidx.collection.MutableScatterMap;
import androidx.collection.ObjectList;
import androidx.collection.ScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.GapComposerKt;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SlotStorage;
import androidx.compose.runtime.collection.ExtensionsKt;
import androidx.compose.runtime.composer.RememberManager;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionGroup;
import h.a.c;
import h.g.a.l;
import h.g.b.a.a;
import h.g.b.am;
import h.g.b.ao;
import h.g.b.x;
import h.m.k;
import h.n.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SlotTable extends SlotStorage implements CompositionData, Iterable<CompositionGroup>, a {
    public static final int $stable = 8;
    private MutableIntObjectMap<MutableIntSet> calledByMap;
    private int groupsSize;
    private int readers;
    private int slotsSize;
    private HashMap<GapAnchor, GapGroupSourceInformation> sourceInformationMap;
    private int version;
    private boolean writer;
    private int[] groups = new int[0];
    private Object[] slots = new Object[0];
    private final Object lock = new Object();
    private ArrayList<GapAnchor> anchors = new ArrayList<>();

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.runtime.composer.gapbuffer.SlotTable$getSlots$1, reason: invalid class name */
    public final class AnonymousClass1 implements Iterable<Object>, a {
        AnonymousClass1() {
        }

        @Override // java.lang.Iterable
        public Iterator<Object> iterator() {
            return k.a(new SlotTable$getSlots$1$iterator$1(SlotTable.this, null));
        }
    }

    private final List<Integer> dataIndexes() {
        return SlotTableKt.dataAnchors(this.groups, this.groupsSize * 5);
    }

    private final int emitGroup(StringBuilder sb, int i2, int i3) {
        String sourceInformation;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(' ');
        }
        sb.append("Group(");
        sb.append(i2);
        sb.append(")");
        GapGroupSourceInformation gapGroupSourceInformationSourceInformationOf = sourceInformationOf(i2);
        if (gapGroupSourceInformationSourceInformationOf != null && (sourceInformation = gapGroupSourceInformationSourceInformationOf.getSourceInformation()) != null && (o.ah(sourceInformation, "C(") || o.ah(sourceInformation, "CC("))) {
            String str = sourceInformation;
            int iX = o.X(str, "(", 0, false, 6) + 1;
            int iW = o.W(str, ')', 0, 6);
            sb.append(" ");
            String strSubstring = sourceInformation.substring(iX, iW);
            x.e(strSubstring, "substring(...)");
            sb.append(strSubstring);
            sb.append("()");
        }
        sb.append(" key=");
        int i5 = i2 * 5;
        sb.append(this.groups[i5]);
        int iGroupSize = SlotTableKt.groupSize(this.groups, i2);
        sb.append(", nodes=");
        int i6 = i5 + 1;
        sb.append(this.groups[i6] & 67108863);
        sb.append(", size=");
        sb.append(iGroupSize);
        if ((this.groups[i6] & 134217728) != 0) {
            sb.append(", mark");
        }
        if ((this.groups[i6] & 67108864) != 0) {
            sb.append(", contains mark");
        }
        int iEmitGroup$dataIndex = emitGroup$dataIndex(this, i2);
        int iEmitGroup = i2 + 1;
        int iEmitGroup$dataIndex2 = emitGroup$dataIndex(this, iEmitGroup);
        if (iEmitGroup$dataIndex < 0 || iEmitGroup$dataIndex > iEmitGroup$dataIndex2 || iEmitGroup$dataIndex2 > this.slotsSize) {
            sb.append(", *invalid data offsets " + iEmitGroup$dataIndex + '-' + iEmitGroup$dataIndex2 + '*');
        } else {
            int[] iArr = this.groups;
            if ((iArr[i6] & 536870912) != 0) {
                sb.append(" objectKey=".concat(String.valueOf(SlotTableKt.summarize(String.valueOf(this.slots[SlotTableKt.objectKeyIndex(iArr, i2)]), 10))));
            }
            int[] iArr2 = this.groups;
            if ((iArr2[i6] & 1073741824) != 0) {
                sb.append(" node=".concat(String.valueOf(SlotTableKt.summarize(String.valueOf(this.slots[iArr2[i5 + 4]]), 10))));
            }
            int[] iArr3 = this.groups;
            if ((iArr3[i6] & 268435456) != 0) {
                sb.append(" aux=".concat(String.valueOf(SlotTableKt.summarize(String.valueOf(this.slots[SlotTableKt.auxIndex(iArr3, i2)]), 10))));
            }
            int iSlotAnchor = SlotTableKt.slotAnchor(this.groups, i2);
            if (iSlotAnchor < iEmitGroup$dataIndex2) {
                sb.append(", slots=[");
                sb.append(iSlotAnchor);
                sb.append(": ");
                for (int i7 = iSlotAnchor; i7 < iEmitGroup$dataIndex2; i7++) {
                    if (i7 != iSlotAnchor) {
                        sb.append(", ");
                    }
                    sb.append(SlotTableKt.summarize(String.valueOf(this.slots[i7]), 10));
                }
                sb.append("]");
            }
        }
        sb.append('\n');
        int i8 = i2 + iGroupSize;
        while (iEmitGroup < i8) {
            iEmitGroup += emitGroup(sb, iEmitGroup, i3 + 1);
        }
        return iGroupSize;
    }

    private static final int emitGroup$dataIndex(SlotTable slotTable, int i2) {
        return i2 >= slotTable.groupsSize ? slotTable.slotsSize : slotTable.groups[(i2 * 5) + 4];
    }

    private static final void extractNestedStates$lambda$2$closeToGroupContaining(SlotWriter slotWriter, int i2) {
        while (slotWriter.getParent() >= 0 && slotWriter.getCurrentGroupEnd() <= i2) {
            slotWriter.skipToGroupEnd();
            slotWriter.endGroup();
        }
    }

    private static final void extractNestedStates$lambda$2$openParent(SlotWriter slotWriter, int i2) {
        extractNestedStates$lambda$2$closeToGroupContaining(slotWriter, i2);
        while (slotWriter.getCurrentGroup() != i2 && !slotWriter.isGroupEnd()) {
            if (i2 < SlotTableKt.getNextGroup(slotWriter)) {
                slotWriter.startGroup();
            } else {
                slotWriter.skipGroup();
            }
        }
        if (slotWriter.getCurrentGroup() != i2) {
            ComposerKt.composeImmediateRuntimeError("Unexpected slot table structure");
        }
        slotWriter.startGroup();
    }

    private final RecomposeScopeImpl findEffectiveRecomposeScope(int i2) {
        int i3 = i2;
        while (i3 > 0) {
            Iterator<Object> it = new DataIterator(this, i3).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof RecomposeScopeImpl) {
                    RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) next;
                    if (recomposeScopeImpl.getUsed() && i3 != i2) {
                        return recomposeScopeImpl;
                    }
                    recomposeScopeImpl.setForcedRecompose(true);
                }
            }
            i3 = this.groups[(i3 * 5) + 2];
        }
        return null;
    }

    private final List<Integer> groupSizes() {
        return SlotTableKt.groupSizes(this.groups, this.groupsSize * 5);
    }

    private static final void invalidateGroupsWithKey$lambda$2$scanGroup(SlotReader slotReader, MutableIntSet mutableIntSet, List<GapAnchor> list, am amVar, SlotTable slotTable, List<RecomposeScopeImpl> list2) {
        RecomposeScopeImpl recomposeScopeImplFindEffectiveRecomposeScope;
        int groupKey = slotReader.getGroupKey();
        if (!mutableIntSet.contains(groupKey)) {
            slotReader.startGroup();
            while (!slotReader.isGroupEnd()) {
                invalidateGroupsWithKey$lambda$2$scanGroup(slotReader, mutableIntSet, list, amVar, slotTable, list2);
            }
            slotReader.endGroup();
            return;
        }
        if (groupKey != -3) {
            list.add(SlotReader.anchor$default(slotReader, 0, 1, null));
        }
        if (amVar.f48101a) {
            RecomposeScopeImpl recomposeScopeImplFindEffectiveRecomposeScope2 = slotTable.findEffectiveRecomposeScope(slotReader.getCurrentGroup());
            if (recomposeScopeImplFindEffectiveRecomposeScope2 != null) {
                list2.add(recomposeScopeImplFindEffectiveRecomposeScope2);
                Anchor anchor = recomposeScopeImplFindEffectiveRecomposeScope2.getAnchor();
                if (anchor != null && GapAnchorKt.asGapAnchor(anchor).getLocation$runtime() == slotReader.getCurrentGroup() && (recomposeScopeImplFindEffectiveRecomposeScope = slotTable.findEffectiveRecomposeScope(slotReader.getParent())) != null) {
                    list2.add(recomposeScopeImplFindEffectiveRecomposeScope);
                }
            } else {
                amVar.f48101a = false;
                list2.clear();
            }
        }
        slotReader.skipGroup();
    }

    private final List<Integer> keys() {
        return SlotTableKt.keys(this.groups, this.groupsSize * 5);
    }

    private final List<Integer> nodes() {
        return SlotTableKt.nodeCounts(this.groups, this.groupsSize * 5);
    }

    private final List<Integer> parentIndexes() {
        return SlotTableKt.parentAnchors(this.groups, this.groupsSize * 5);
    }

    private final GapAnchor tryAnchor(int i2) {
        int i3;
        if (this.writer) {
            ComposerKt.composeImmediateRuntimeError("use active SlotWriter to crate an anchor for location instead");
        }
        if (i2 < 0 || i2 >= (i3 = this.groupsSize)) {
            return null;
        }
        return SlotTableKt.find(this.anchors, i2, i3);
    }

    private final void validateRecomposeScopeAnchors() {
        Object[] objArr = this.slots;
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            RecomposeScopeImpl recomposeScopeImpl = obj instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) obj : null;
            if (recomposeScopeImpl != null) {
                arrayList.add(recomposeScopeImpl);
            }
        }
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) arrayList2.get(i2);
            Anchor anchor = recomposeScopeImpl2.getAnchor();
            if (anchor != null) {
                GapAnchor gapAnchorAsGapAnchor = GapAnchorKt.asGapAnchor(anchor);
                if (!slotsOf$runtime(gapAnchorAsGapAnchor.toIndexFor(this)).contains(recomposeScopeImpl2)) {
                    PreconditionsKt.throwIllegalStateException("Misaligned anchor " + gapAnchorAsGapAnchor + " in scope " + recomposeScopeImpl2 + " encountered, scope found at " + c.C(this.slots, recomposeScopeImpl2));
                }
            }
        }
    }

    private static final int verifyWellFormed$validateGroup(ao aoVar, SlotTable slotTable, int i2, int i3) {
        int i4 = aoVar.f48103a;
        int i5 = i4 + 1;
        aoVar.f48103a = i5;
        int i6 = i4 * 5;
        int i7 = slotTable.groups[i6 + 2];
        if (i7 != i2) {
            PreconditionsKt.throwIllegalStateException("Invalid parent index detected at " + i4 + ", expected parent index to be " + i2 + " found " + i7);
        }
        int iGroupSize = SlotTableKt.groupSize(slotTable.groups, i4) + i4;
        if (iGroupSize > slotTable.groupsSize) {
            PreconditionsKt.throwIllegalStateException("A group extends past the end of the table at " + i4);
        }
        if (iGroupSize > i3) {
            PreconditionsKt.throwIllegalStateException("A group extends past its parent group at " + i4);
        }
        int[] iArr = slotTable.groups;
        int i8 = i6 + 4;
        int i9 = iArr[i8];
        int i10 = i4 >= slotTable.groupsSize + (-1) ? slotTable.slotsSize : iArr[(i5 * 5) + 4];
        if (i10 > slotTable.slots.length) {
            PreconditionsKt.throwIllegalStateException("Slots for " + i4 + " extend past the end of the slot table");
        }
        if (i9 > i10) {
            PreconditionsKt.throwIllegalStateException("Invalid data anchor at " + i4);
        }
        if (SlotTableKt.slotAnchor(slotTable.groups, i4) > i10) {
            PreconditionsKt.throwIllegalStateException("Slots start out of range at " + i4);
        }
        int i11 = i6 + 1;
        int i12 = slotTable.groups[i11];
        int iVerifyWellFormed$validateGroup = 0;
        if (i10 - i9 < ((i12 & 1073741824) != 0 ? 1 : 0) + ((536870912 & i12) != 0 ? 1 : 0) + ((i12 & 268435456) != 0 ? 1 : 0)) {
            PreconditionsKt.throwIllegalStateException("Not enough slots added for group " + i4);
        }
        int[] iArr2 = slotTable.groups;
        int i13 = iArr2[i11] & 1073741824;
        if (i13 != 0 && slotTable.slots[iArr2[i8]] == null) {
            PreconditionsKt.throwIllegalStateException("No node recorded for a node group at " + i4);
        }
        while (aoVar.f48103a < iGroupSize) {
            iVerifyWellFormed$validateGroup += verifyWellFormed$validateGroup(aoVar, slotTable, i4, iGroupSize);
        }
        int[] iArr3 = slotTable.groups;
        int i14 = iArr3[i11] & 67108863;
        int iGroupSize2 = SlotTableKt.groupSize(iArr3, i4);
        if (i14 != iVerifyWellFormed$validateGroup) {
            PreconditionsKt.throwIllegalStateException("Incorrect node count detected at " + i4 + ", expected " + i14 + ", received " + iVerifyWellFormed$validateGroup);
        }
        int i15 = aoVar.f48103a - i4;
        if (iGroupSize2 != i15) {
            PreconditionsKt.throwIllegalStateException("Incorrect slot count detected at " + i4 + ", expected " + iGroupSize2 + ", received " + i15);
        }
        int[] iArr4 = slotTable.groups;
        if ((iArr4[i11] & 201326592) != 0 && i4 > 0 && (iArr4[(i2 * 5) + 1] & 67108864) == 0) {
            PreconditionsKt.throwIllegalStateException("Expected group " + i2 + " to record it contains a mark because " + i4 + " does");
        }
        if (i13 != 0) {
            return 1;
        }
        return iVerifyWellFormed$validateGroup;
    }

    private static final void verifyWellFormed$verifySourceGroup(SlotTable slotTable, GapGroupSourceInformation gapGroupSourceInformation) {
        ArrayList<Object> groups = gapGroupSourceInformation.getGroups();
        if (groups != null) {
            ArrayList<Object> arrayList = groups;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj = arrayList.get(i2);
                if (obj instanceof GapAnchor) {
                    GapAnchor gapAnchor = (GapAnchor) obj;
                    if (!gapAnchor.getValid()) {
                        PreconditionsKt.throwIllegalArgumentException("Source map contains invalid anchor");
                    }
                    if (!slotTable.ownsAnchor(gapAnchor)) {
                        PreconditionsKt.throwIllegalArgumentException("Source map anchor is not owned by the slot table");
                    }
                } else if (obj instanceof GapGroupSourceInformation) {
                    verifyWellFormed$verifySourceGroup(slotTable, (GapGroupSourceInformation) obj);
                }
            }
        }
    }

    public final GapAnchor anchor(int i2) {
        if (this.writer) {
            ComposerKt.composeImmediateRuntimeError("use active SlotWriter to create an anchor location instead");
        }
        if (i2 < 0 || i2 >= this.groupsSize) {
            PreconditionsKt.throwIllegalArgumentException("Parameter index is out of range");
        }
        ArrayList<GapAnchor> arrayList = this.anchors;
        int iSearch = SlotTableKt.search(arrayList, i2, this.groupsSize);
        if (iSearch >= 0) {
            return arrayList.get(iSearch);
        }
        GapAnchor gapAnchor = new GapAnchor(i2);
        arrayList.add(-(iSearch + 1), gapAnchor);
        return gapAnchor;
    }

    public final int anchorIndex(GapAnchor gapAnchor) {
        if (this.writer) {
            ComposerKt.composeImmediateRuntimeError("Use active SlotWriter to determine anchor location instead");
        }
        if (!gapAnchor.getValid()) {
            PreconditionsKt.throwIllegalArgumentException("Anchor refers to a group that was removed");
        }
        return gapAnchor.getLocation$runtime();
    }

    @Override // androidx.compose.runtime.SlotStorage
    public void clear(RememberManager rememberManager) {
        SlotWriter slotWriterOpenWriter = openWriter();
        try {
            ComposerKt.removeCurrentGroup(slotWriterOpenWriter, rememberManager);
            slotWriterOpenWriter.close(true);
        } catch (Throwable th) {
            slotWriterOpenWriter.close(false);
            throw th;
        }
    }

    public final void close$runtime(SlotReader slotReader, HashMap<GapAnchor, GapGroupSourceInformation> map) {
        if (slotReader.getTable$runtime() != this || this.readers <= 0) {
            ComposerKt.composeImmediateRuntimeError("Unexpected reader close()");
        }
        this.readers--;
        if (map != null) {
            synchronized (this.lock) {
                HashMap<GapAnchor, GapGroupSourceInformation> map2 = this.sourceInformationMap;
                if (map2 != null) {
                    map2.putAll(map);
                } else {
                    this.sourceInformationMap = map;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.SlotStorage
    public void collectCalledByInformation() {
        this.calledByMap = new MutableIntObjectMap<>(0, 1, null);
    }

    @Override // androidx.compose.runtime.SlotStorage
    public void collectSourceInformation() {
        this.sourceInformationMap = new HashMap<>();
    }

    public final boolean containsMark() {
        return this.groupsSize > 0 && (this.groups[1] & 67108864) != 0;
    }

    @Override // androidx.compose.runtime.SlotStorage
    public void deactivateAll(RememberManager rememberManager) {
        SlotWriter slotWriterOpenWriter = openWriter();
        try {
            GapComposerKt.deactivateCurrentGroup(slotWriterOpenWriter, rememberManager);
            slotWriterOpenWriter.close(true);
        } catch (Throwable th) {
            slotWriterOpenWriter.close(false);
            throw th;
        }
    }

    @Override // androidx.compose.runtime.SlotStorage
    public void disposeUnusedMovableContent(RememberManager rememberManager, MovableContentState movableContentState) {
        SlotWriter slotWriterOpenWriter = openWriter();
        try {
            ComposerKt.removeCurrentGroup(slotWriterOpenWriter, rememberManager);
            slotWriterOpenWriter.close(true);
        } catch (Throwable th) {
            slotWriterOpenWriter.close(false);
            throw th;
        }
    }

    @Override // androidx.compose.runtime.SlotStorage
    public ScatterMap<MovableContentStateReference, MovableContentState> extractNestedStates(Applier<?> applier, ObjectList<MovableContentStateReference> objectList) {
        Object[] objArr = objectList.content;
        int i2 = objectList._size;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = 1;
            if (i4 >= i2) {
                break;
            }
            if (ownsAnchor(GapAnchorKt.asGapAnchor(((MovableContentStateReference) objArr[i4]).getAnchor$runtime()))) {
                i4++;
            } else {
                MutableObjectList mutableObjectList = new MutableObjectList(i3, i5, null);
                Object[] objArr2 = objectList.content;
                int i6 = objectList._size;
                for (int i7 = 0; i7 < i6; i7++) {
                    Object obj = objArr2[i7];
                    if (ownsAnchor(GapAnchorKt.asGapAnchor(((MovableContentStateReference) obj).getAnchor$runtime()))) {
                        mutableObjectList.add(obj);
                    }
                }
                objectList = mutableObjectList;
            }
        }
        ObjectList objectListSortedBy = ExtensionsKt.sortedBy(objectList, new l() { // from class: androidx.compose.runtime.composer.gapbuffer.SlotTable$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj2) {
                return Integer.valueOf(this.f$0.anchorIndex(GapAnchorKt.asGapAnchor(((MovableContentStateReference) obj2).getAnchor$runtime())));
            }
        });
        if (objectListSortedBy.isEmpty()) {
            return ScatterMapKt.emptyScatterMap();
        }
        MutableScatterMap mutableScatterMapMutableScatterMapOf = ScatterMapKt.mutableScatterMapOf();
        SlotWriter slotWriterOpenWriter = openWriter();
        try {
            Object[] objArr3 = objectListSortedBy.content;
            int i8 = objectListSortedBy._size;
            for (int i9 = 0; i9 < i8; i9++) {
                MovableContentStateReference movableContentStateReference = (MovableContentStateReference) objArr3[i9];
                int iAnchorIndex = slotWriterOpenWriter.anchorIndex(GapAnchorKt.asGapAnchor(movableContentStateReference.getAnchor$runtime()));
                int iParent = slotWriterOpenWriter.parent(iAnchorIndex);
                extractNestedStates$lambda$2$closeToGroupContaining(slotWriterOpenWriter, iParent);
                extractNestedStates$lambda$2$openParent(slotWriterOpenWriter, iParent);
                slotWriterOpenWriter.advanceBy(iAnchorIndex - slotWriterOpenWriter.getCurrentGroup());
                mutableScatterMapMutableScatterMapOf.set(movableContentStateReference, ComposerKt.extractMovableContentAtCurrent(movableContentStateReference.getComposition$runtime(), movableContentStateReference, slotWriterOpenWriter, applier));
            }
            extractNestedStates$lambda$2$closeToGroupContaining(slotWriterOpenWriter, Integer.MAX_VALUE);
            slotWriterOpenWriter.close(true);
            return mutableScatterMapMutableScatterMapOf;
        } catch (Throwable th) {
            slotWriterOpenWriter.close(false);
            throw th;
        }
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public CompositionGroup find(Object obj) {
        return new SlotTableGroup(this, 0, 0, 4, null).find(obj);
    }

    public final ArrayList<GapAnchor> getAnchors$runtime() {
        return this.anchors;
    }

    public final MutableIntObjectMap<MutableIntSet> getCalledByMap$runtime() {
        return this.calledByMap;
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public Iterable<CompositionGroup> getCompositionGroups() {
        return this;
    }

    public final int[] getGroups() {
        return this.groups;
    }

    public final int getGroupsSize() {
        return this.groupsSize;
    }

    @Override // androidx.compose.runtime.SlotStorage
    /* renamed from: getSlots */
    public Iterable<Object> mo7494getSlots() {
        return new AnonymousClass1();
    }

    public final int getSlotsSize() {
        return this.slotsSize;
    }

    public final HashMap<GapAnchor, GapGroupSourceInformation> getSourceInformationMap$runtime() {
        return this.sourceInformationMap;
    }

    public final int getVersion$runtime() {
        return this.version;
    }

    public final boolean getWriter$runtime() {
        return this.writer;
    }

    @Override // androidx.compose.runtime.SlotStorage
    public boolean groupContainsAnchor(int i2, Anchor anchor) {
        if (this.writer) {
            ComposerKt.composeImmediateRuntimeError("Writer is active");
        }
        if (i2 < 0 || i2 >= this.groupsSize) {
            ComposerKt.composeImmediateRuntimeError("Invalid group index");
        }
        GapAnchor gapAnchorAsGapAnchor = GapAnchorKt.asGapAnchor(anchor);
        if (!ownsAnchor(gapAnchorAsGapAnchor)) {
            return false;
        }
        int iGroupSize = SlotTableKt.groupSize(this.groups, i2) + i2;
        int location$runtime = gapAnchorAsGapAnchor.getLocation$runtime();
        return i2 <= location$runtime && location$runtime < iGroupSize;
    }

    @Override // androidx.compose.runtime.SlotStorage
    public boolean inGroup(Anchor anchor, Anchor anchor2) {
        int location$runtime = GapAnchorKt.asGapAnchor(anchor).getLocation$runtime();
        int iGroupSize = SlotTableKt.groupSize(this.groups, location$runtime) + location$runtime;
        int location$runtime2 = GapAnchorKt.asGapAnchor(anchor2).getLocation$runtime();
        return location$runtime <= location$runtime2 && location$runtime2 < iGroupSize;
    }

    @Override // androidx.compose.runtime.SlotStorage
    public void invalidateAll() {
        for (Object obj : this.slots) {
            RecomposeScope recomposeScope = obj instanceof RecomposeScope ? (RecomposeScope) obj : null;
            if (recomposeScope != null) {
                recomposeScope.invalidate();
            }
        }
    }

    @Override // androidx.compose.runtime.SlotStorage
    public List<RecomposeScopeImpl> invalidateGroupsWithKey(int i2) {
        MutableIntSet mutableIntSet;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        am amVar = new am();
        amVar.f48101a = true;
        MutableIntSet mutableIntSet2 = new MutableIntSet(0, 1, null);
        mutableIntSet2.add(i2);
        mutableIntSet2.add(-3);
        MutableIntObjectMap<MutableIntSet> mutableIntObjectMap = this.calledByMap;
        if (mutableIntObjectMap != null && (mutableIntSet = mutableIntObjectMap.get(i2)) != null) {
            mutableIntSet2.addAll(mutableIntSet);
        }
        SlotReader slotReaderOpenReader = openReader();
        try {
            invalidateGroupsWithKey$lambda$2$scanGroup(slotReaderOpenReader, mutableIntSet2, arrayList, amVar, this, arrayList2);
            slotReaderOpenReader.close();
            SlotWriter slotWriterOpenWriter = openWriter();
            try {
                slotWriterOpenWriter.startGroup();
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    GapAnchor gapAnchor = (GapAnchor) arrayList.get(i3);
                    if (gapAnchor.toIndexFor(slotWriterOpenWriter) >= slotWriterOpenWriter.getCurrentGroup()) {
                        slotWriterOpenWriter.seek(gapAnchor);
                        slotWriterOpenWriter.bashCurrentGroup();
                    }
                }
                slotWriterOpenWriter.skipToGroupEnd();
                slotWriterOpenWriter.endGroup();
                slotWriterOpenWriter.close(true);
                if (amVar.f48101a) {
                    return arrayList2;
                }
                return null;
            } catch (Throwable th) {
                slotWriterOpenWriter.close(false);
                throw th;
            }
        } catch (Throwable th2) {
            slotReaderOpenReader.close();
            throw th2;
        }
    }

    @Override // androidx.compose.runtime.SlotStorage, androidx.compose.runtime.tooling.CompositionData
    public boolean isEmpty() {
        return this.groupsSize == 0;
    }

    @Override // java.lang.Iterable
    public Iterator<CompositionGroup> iterator() {
        return new GroupIterator(this, 0, this.groupsSize);
    }

    public final SlotReader openReader() {
        if (this.writer) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.readers++;
        return new SlotReader(this);
    }

    public final SlotWriter openWriter() {
        if (this.writer) {
            ComposerKt.composeImmediateRuntimeError("Cannot start a writer when another writer is pending");
        }
        if (this.readers > 0) {
            ComposerKt.composeImmediateRuntimeError("Cannot start a writer when a reader is pending");
        }
        this.writer = true;
        this.version++;
        return new SlotWriter(this);
    }

    public final boolean ownsAnchor(GapAnchor gapAnchor) {
        int iSearch;
        return gapAnchor.getValid() && (iSearch = SlotTableKt.search(this.anchors, gapAnchor.getLocation$runtime(), this.groupsSize)) >= 0 && x.n(this.anchors.get(iSearch), gapAnchor);
    }

    @Override // androidx.compose.runtime.SlotStorage
    public boolean ownsRecomposeScope(RecomposeScopeImpl recomposeScopeImpl) {
        Anchor anchor = recomposeScopeImpl.getAnchor();
        return anchor != null && ownsAnchor(GapAnchorKt.asGapAnchor(anchor));
    }

    public final <T> T read(l<? super SlotReader, ? extends T> lVar) {
        SlotReader slotReaderOpenReader = openReader();
        try {
            return lVar.invoke(slotReaderOpenReader);
        } finally {
            slotReaderOpenReader.close();
        }
    }

    public final void setAnchors$runtime(ArrayList<GapAnchor> arrayList) {
        this.anchors = arrayList;
    }

    public final void setCalledByMap$runtime(MutableIntObjectMap<MutableIntSet> mutableIntObjectMap) {
        this.calledByMap = mutableIntObjectMap;
    }

    public final void setSourceInformationMap$runtime(HashMap<GapAnchor, GapGroupSourceInformation> map) {
        this.sourceInformationMap = map;
    }

    public final void setTo$runtime(int[] iArr, int i2, Object[] objArr, int i3, ArrayList<GapAnchor> arrayList, HashMap<GapAnchor, GapGroupSourceInformation> map, MutableIntObjectMap<MutableIntSet> mutableIntObjectMap) {
        this.groups = iArr;
        this.groupsSize = i2;
        this.slots = objArr;
        this.slotsSize = i3;
        this.anchors = arrayList;
        this.sourceInformationMap = map;
        this.calledByMap = mutableIntObjectMap;
    }

    public final void setVersion$runtime(int i2) {
        this.version = i2;
    }

    public final Object slot$runtime(int i2, int i3) {
        int iSlotAnchor = SlotTableKt.slotAnchor(this.groups, i2);
        int i4 = i2 + 1;
        return (i3 < 0 || i3 >= (i4 < this.groupsSize ? this.groups[(i4 * 5) + 4] : this.slots.length) - iSlotAnchor) ? Composer.Companion.getEmpty() : this.slots[iSlotAnchor + i3];
    }

    public final List<Object> slotsOf$runtime(int i2) {
        int[] iArr = this.groups;
        int i3 = iArr[(i2 * 5) + 4];
        int i4 = i2 + 1;
        return c.X(this.slots).subList(i3, i4 < this.groupsSize ? iArr[(i4 * 5) + 4] : this.slots.length);
    }

    public final GapGroupSourceInformation sourceInformationOf(int i2) {
        GapAnchor gapAnchorTryAnchor;
        HashMap<GapAnchor, GapGroupSourceInformation> map = this.sourceInformationMap;
        if (map == null || (gapAnchorTryAnchor = tryAnchor(i2)) == null) {
            return null;
        }
        return map.get(gapAnchorTryAnchor);
    }

    @Override // androidx.compose.runtime.SlotStorage
    public String toDebugString() {
        if (this.writer) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append('\n');
        int i2 = this.groupsSize;
        if (i2 > 0) {
            int iEmitGroup = 0;
            while (iEmitGroup < i2) {
                iEmitGroup += emitGroup(sb, iEmitGroup, 0);
            }
        } else {
            sb.append("<EMPTY>");
        }
        return sb.toString();
    }

    @Override // androidx.compose.runtime.SlotStorage
    public void verifyWellFormed() {
        int i2;
        int i3;
        ao aoVar = new ao();
        int i4 = -1;
        if (this.groupsSize > 0) {
            while (true) {
                i2 = aoVar.f48103a;
                i3 = this.groupsSize;
                if (i2 >= i3) {
                    break;
                } else {
                    verifyWellFormed$validateGroup(aoVar, this, -1, i2 + SlotTableKt.groupSize(this.groups, i2));
                }
            }
            if (i2 != i3) {
                PreconditionsKt.throwIllegalStateException("Incomplete group at root " + aoVar.f48103a + " expected to be " + this.groupsSize);
            }
        }
        int length = this.slots.length;
        for (int i5 = this.slotsSize; i5 < length; i5++) {
            if (this.slots[i5] != null) {
                PreconditionsKt.throwIllegalStateException("Non null value in the slot gap at index " + i5);
            }
        }
        ArrayList<GapAnchor> arrayList = this.anchors;
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            int indexFor = arrayList.get(i6).toIndexFor(this);
            if (indexFor < 0 || indexFor > this.groupsSize) {
                PreconditionsKt.throwIllegalArgumentException("Invalid anchor, location out of bound");
            }
            if (i4 >= indexFor) {
                PreconditionsKt.throwIllegalArgumentException("Anchor is out of order");
            }
            i6++;
            i4 = indexFor;
        }
        HashMap<GapAnchor, GapGroupSourceInformation> map = this.sourceInformationMap;
        if (map != null) {
            for (Map.Entry<GapAnchor, GapGroupSourceInformation> entry : map.entrySet()) {
                GapAnchor key = entry.getKey();
                GapGroupSourceInformation value = entry.getValue();
                if (!key.getValid()) {
                    PreconditionsKt.throwIllegalArgumentException("Source map contains invalid anchor");
                }
                if (!ownsAnchor(key)) {
                    PreconditionsKt.throwIllegalArgumentException("Source map anchor is not owned by the slot table");
                }
                verifyWellFormed$verifySourceGroup(this, value);
            }
        }
        validateRecomposeScopeAnchors();
    }

    public final <T> T write(l<? super SlotWriter, ? extends T> lVar) {
        SlotWriter slotWriterOpenWriter = openWriter();
        try {
            T tInvoke = lVar.invoke(slotWriterOpenWriter);
            slotWriterOpenWriter.close(true);
            return tInvoke;
        } catch (Throwable th) {
            slotWriterOpenWriter.close(false);
            throw th;
        }
    }

    /* renamed from: getSlots, reason: collision with other method in class */
    public final Object[] m7429getSlots() {
        return this.slots;
    }

    @Override // androidx.compose.runtime.SlotStorage
    public void dispose() {
    }

    public final void close$runtime(SlotWriter slotWriter, int[] iArr, int i2, Object[] objArr, int i3, ArrayList<GapAnchor> arrayList, HashMap<GapAnchor, GapGroupSourceInformation> map, MutableIntObjectMap<MutableIntSet> mutableIntObjectMap) {
        if (slotWriter.getTable$runtime() != this || !this.writer) {
            PreconditionsKt.throwIllegalArgumentException("Unexpected writer close()");
        }
        this.writer = false;
        setTo$runtime(iArr, i2, objArr, i3, arrayList, map, mutableIntObjectMap);
    }
}
