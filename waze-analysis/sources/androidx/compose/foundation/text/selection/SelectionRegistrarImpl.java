package androidx.compose.foundation.text.selection;

import androidx.collection.LongObjectMap;
import androidx.collection.LongObjectMapKt;
import androidx.collection.MutableLongObjectMap;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.media3.muxer.MuxerUtil;
import h.a.i;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.a.r;
import h.g.a.t;
import h.g.b.o;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SelectionRegistrarImpl implements SelectionRegistrar {
    private final MutableLongObjectMap<Selectable> _selectableMap;
    private final List<Selectable> _selectables;
    private l<? super Long, ab> afterSelectableUnsubscribe;
    private AtomicLong incrementId;
    private l<? super Long, ab> onPositionChangeCallback;
    private l<? super Long, ab> onSelectableChangeCallback;
    private t<? super Boolean, ? super LayoutCoordinates, ? super Offset, ? super Offset, ? super Boolean, ? super SelectionAdjustment, Boolean> onSelectionUpdateCallback;
    private a<ab> onSelectionUpdateEndCallback;
    private p<? super Boolean, ? super Long, ab> onSelectionUpdateSelectAll;
    private r<? super Boolean, ? super LayoutCoordinates, ? super Offset, ? super SelectionAdjustment, ab> onSelectionUpdateStartCallback;
    private boolean sorted;
    private final MutableState subselections$delegate;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final Saver<SelectionRegistrarImpl, Long> Saver = SaverKt.Saver(new p() { // from class: androidx.compose.foundation.text.selection.SelectionRegistrarImpl$$ExternalSyntheticLambda0
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            return Long.valueOf(((SelectionRegistrarImpl) obj2).incrementId.get());
        }
    }, new l() { // from class: androidx.compose.foundation.text.selection.SelectionRegistrarImpl$$ExternalSyntheticLambda1
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return SelectionRegistrarImpl.Saver$lambda$1(((Long) obj).longValue());
        }
    });

    private SelectionRegistrarImpl(long j2) {
        this._selectables = new ArrayList();
        this._selectableMap = LongObjectMapKt.mutableLongObjectMapOf();
        this.incrementId = new AtomicLong(j2);
        this.subselections$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(LongObjectMapKt.emptyLongObjectMap(), null, 2, null);
    }

    static final SelectionRegistrarImpl Saver$lambda$1(long j2) {
        return new SelectionRegistrarImpl(j2);
    }

    static final int sort$lambda$0(LayoutCoordinates layoutCoordinates, Selectable selectable, Selectable selectable2) {
        long jM7996getZeroF1C5BW0;
        long jM7996getZeroF1C5BW02;
        long jM7996getZeroF1C5BW03;
        long jM7996getZeroF1C5BW04;
        LayoutCoordinates layoutCoordinates2 = selectable.getLayoutCoordinates();
        LayoutCoordinates layoutCoordinates3 = selectable2.getLayoutCoordinates();
        if (layoutCoordinates2 != null) {
            jM7996getZeroF1C5BW0 = layoutCoordinates.mo9744localPositionOfR5De75A(layoutCoordinates2, Offset.Companion.m7996getZeroF1C5BW0());
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jM7996getZeroF1C5BW0 >> 32)) + ((int) (layoutCoordinates2.mo9743getSizeYbymL2g() >> 32));
            jM7996getZeroF1C5BW02 = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (jM7996getZeroF1C5BW0 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) + ((int) (layoutCoordinates2.mo9743getSizeYbymL2g() & MuxerUtil.UNSIGNED_INT_MAX_VALUE))) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        } else {
            jM7996getZeroF1C5BW0 = Offset.Companion.m7996getZeroF1C5BW0();
            jM7996getZeroF1C5BW02 = Offset.Companion.m7996getZeroF1C5BW0();
        }
        long j2 = jM7996getZeroF1C5BW0;
        long j3 = jM7996getZeroF1C5BW02;
        if (layoutCoordinates3 != null) {
            jM7996getZeroF1C5BW03 = layoutCoordinates.mo9744localPositionOfR5De75A(layoutCoordinates3, Offset.Companion.m7996getZeroF1C5BW0());
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM7996getZeroF1C5BW03 >> 32)) + ((int) (layoutCoordinates3.mo9743getSizeYbymL2g() >> 32));
            jM7996getZeroF1C5BW04 = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (jM7996getZeroF1C5BW03 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) + ((int) (layoutCoordinates3.mo9743getSizeYbymL2g() & MuxerUtil.UNSIGNED_INT_MAX_VALUE))) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(fIntBitsToFloat2) << 32);
        } else {
            jM7996getZeroF1C5BW03 = Offset.Companion.m7996getZeroF1C5BW0();
            jM7996getZeroF1C5BW04 = Offset.Companion.m7996getZeroF1C5BW0();
        }
        long j4 = jM7996getZeroF1C5BW03;
        return SelectionRegistrarImplKt.m3908inARowzwwh4xc(j2, j3, j4, jM7996getZeroF1C5BW04) ? h.b.a.a(Float.valueOf(Float.intBitsToFloat((int) (j2 >> 32))), Float.valueOf(Float.intBitsToFloat((int) (j4 >> 32)))) : h.b.a.a(Float.valueOf(Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE))), Float.valueOf(Float.intBitsToFloat((int) (j4 & MuxerUtil.UNSIGNED_INT_MAX_VALUE))));
    }

    public final l<Long, ab> getAfterSelectableUnsubscribe$foundation() {
        return this.afterSelectableUnsubscribe;
    }

    public final l<Long, ab> getOnPositionChangeCallback$foundation() {
        return this.onPositionChangeCallback;
    }

    public final l<Long, ab> getOnSelectableChangeCallback$foundation() {
        return this.onSelectableChangeCallback;
    }

    public final t<Boolean, LayoutCoordinates, Offset, Offset, Boolean, SelectionAdjustment, Boolean> getOnSelectionUpdateCallback$foundation() {
        return this.onSelectionUpdateCallback;
    }

    public final a<ab> getOnSelectionUpdateEndCallback$foundation() {
        return this.onSelectionUpdateEndCallback;
    }

    public final p<Boolean, Long, ab> getOnSelectionUpdateSelectAll$foundation() {
        return this.onSelectionUpdateSelectAll;
    }

    public final r<Boolean, LayoutCoordinates, Offset, SelectionAdjustment, ab> getOnSelectionUpdateStartCallback$foundation() {
        return this.onSelectionUpdateStartCallback;
    }

    public final LongObjectMap<Selectable> getSelectableMap$foundation() {
        return this._selectableMap;
    }

    public final List<Selectable> getSelectables$foundation() {
        return this._selectables;
    }

    public final boolean getSorted$foundation() {
        return this.sorted;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public LongObjectMap<Selection> getSubselections() {
        return (LongObjectMap) this.subselections$delegate.getValue();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public long nextSelectableId() {
        long andIncrement = this.incrementId.getAndIncrement();
        while (andIncrement == 0) {
            andIncrement = this.incrementId.getAndIncrement();
        }
        return andIncrement;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void notifyPositionChange(long j2) {
        this.sorted = false;
        l<? super Long, ab> lVar = this.onPositionChangeCallback;
        if (lVar != null) {
            lVar.invoke(Long.valueOf(j2));
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void notifySelectableChange(long j2) {
        l<? super Long, ab> lVar = this.onSelectableChangeCallback;
        if (lVar != null) {
            lVar.invoke(Long.valueOf(j2));
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    /* renamed from: notifySelectionUpdate-njBpvok */
    public boolean mo3906notifySelectionUpdatenjBpvok(LayoutCoordinates layoutCoordinates, long j2, long j3, boolean z, SelectionAdjustment selectionAdjustment, boolean z2) {
        t<? super Boolean, ? super LayoutCoordinates, ? super Offset, ? super Offset, ? super Boolean, ? super SelectionAdjustment, Boolean> tVar = this.onSelectionUpdateCallback;
        if (tVar != null) {
            return tVar.invoke(Boolean.valueOf(z2), layoutCoordinates, Offset.m7969boximpl(j2), Offset.m7969boximpl(j3), Boolean.valueOf(z), selectionAdjustment).booleanValue();
        }
        return true;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void notifySelectionUpdateEnd() {
        a<ab> aVar = this.onSelectionUpdateEndCallback;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void notifySelectionUpdateSelectAll(long j2, boolean z) {
        p<? super Boolean, ? super Long, ab> pVar = this.onSelectionUpdateSelectAll;
        if (pVar != null) {
            pVar.invoke(Boolean.valueOf(z), Long.valueOf(j2));
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    /* renamed from: notifySelectionUpdateStart-ubNVwUQ */
    public void mo3907notifySelectionUpdateStartubNVwUQ(LayoutCoordinates layoutCoordinates, long j2, SelectionAdjustment selectionAdjustment, boolean z) {
        r<? super Boolean, ? super LayoutCoordinates, ? super Offset, ? super SelectionAdjustment, ab> rVar = this.onSelectionUpdateStartCallback;
        if (rVar != null) {
            rVar.invoke(Boolean.valueOf(z), layoutCoordinates, Offset.m7969boximpl(j2), selectionAdjustment);
        }
    }

    public final void setAfterSelectableUnsubscribe$foundation(l<? super Long, ab> lVar) {
        this.afterSelectableUnsubscribe = lVar;
    }

    public final void setOnPositionChangeCallback$foundation(l<? super Long, ab> lVar) {
        this.onPositionChangeCallback = lVar;
    }

    public final void setOnSelectableChangeCallback$foundation(l<? super Long, ab> lVar) {
        this.onSelectableChangeCallback = lVar;
    }

    public final void setOnSelectionUpdateCallback$foundation(t<? super Boolean, ? super LayoutCoordinates, ? super Offset, ? super Offset, ? super Boolean, ? super SelectionAdjustment, Boolean> tVar) {
        this.onSelectionUpdateCallback = tVar;
    }

    public final void setOnSelectionUpdateEndCallback$foundation(a<ab> aVar) {
        this.onSelectionUpdateEndCallback = aVar;
    }

    public final void setOnSelectionUpdateSelectAll$foundation(p<? super Boolean, ? super Long, ab> pVar) {
        this.onSelectionUpdateSelectAll = pVar;
    }

    public final void setOnSelectionUpdateStartCallback$foundation(r<? super Boolean, ? super LayoutCoordinates, ? super Offset, ? super SelectionAdjustment, ab> rVar) {
        this.onSelectionUpdateStartCallback = rVar;
    }

    public final void setSorted$foundation(boolean z) {
        this.sorted = z;
    }

    public void setSubselections(LongObjectMap<Selection> longObjectMap) {
        this.subselections$delegate.setValue(longObjectMap);
    }

    public final List<Selectable> sort(final LayoutCoordinates layoutCoordinates) {
        if (!this.sorted) {
            List<Selectable> list = this._selectables;
            final p pVar = new p() { // from class: androidx.compose.foundation.text.selection.SelectionRegistrarImpl$$ExternalSyntheticLambda2
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return Integer.valueOf(SelectionRegistrarImpl.sort$lambda$0(layoutCoordinates, (Selectable) obj, (Selectable) obj2));
                }
            };
            i.t(list, new Comparator() { // from class: androidx.compose.foundation.text.selection.SelectionRegistrarImpl$$ExternalSyntheticLambda3
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ((Number) pVar.invoke(obj, obj2)).intValue();
                }
            });
            this.sorted = true;
        }
        return getSelectables$foundation();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public Selectable subscribe(Selectable selectable) {
        if (selectable.getSelectableId() == 0) {
            InlineClassHelperKt.throwIllegalArgumentException("The selectable contains an invalid id: " + selectable.getSelectableId());
        }
        if (this._selectableMap.containsKey(selectable.getSelectableId())) {
            InlineClassHelperKt.throwIllegalArgumentException("Another selectable with the id: " + selectable + ".selectableId has already subscribed.");
        }
        this._selectableMap.set(selectable.getSelectableId(), selectable);
        this._selectables.add(selectable);
        this.sorted = false;
        return selectable;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void unsubscribe(Selectable selectable) {
        if (this._selectableMap.containsKey(selectable.getSelectableId())) {
            this._selectables.remove(selectable);
            this._selectableMap.remove(selectable.getSelectableId());
            l<? super Long, ab> lVar = this.afterSelectableUnsubscribe;
            if (lVar != null) {
                lVar.invoke(Long.valueOf(selectable.getSelectableId()));
            }
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final Saver<SelectionRegistrarImpl, Long> getSaver() {
            return SelectionRegistrarImpl.Saver;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public SelectionRegistrarImpl() {
        this(1L);
    }
}
