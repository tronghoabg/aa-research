package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import h.ab;
import h.g.a;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class ObservableScopeInvalidator {
    private final MutableState<ab> state;

    private /* synthetic */ ObservableScopeInvalidator(MutableState mutableState) {
        this.state = mutableState;
    }

    /* renamed from: attachToScope-impl, reason: not valid java name */
    public static final void m2964attachToScopeimpl(MutableState<ab> mutableState) {
        mutableState.getValue();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ObservableScopeInvalidator m2965boximpl(MutableState mutableState) {
        return new ObservableScopeInvalidator(mutableState);
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ MutableState m2967constructorimpl$default(MutableState mutableState, int i2, o oVar) {
        return (i2 & 1) != 0 ? SnapshotStateKt.mutableStateOf(ab.f48028a, SnapshotStateKt.neverEqualPolicy()) : mutableState;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2968equalsimpl(MutableState<ab> mutableState, Object obj) {
        return (obj instanceof ObservableScopeInvalidator) && x.n(mutableState, ((ObservableScopeInvalidator) obj).m2973unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2969equalsimpl0(MutableState<ab> mutableState, MutableState<ab> mutableState2) {
        return x.n(mutableState, mutableState2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2970hashCodeimpl(MutableState<ab> mutableState) {
        return mutableState.hashCode();
    }

    /* renamed from: invalidateScope-impl, reason: not valid java name */
    public static final void m2971invalidateScopeimpl(MutableState<ab> mutableState) {
        mutableState.setValue(ab.f48028a);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2972toStringimpl(MutableState<ab> mutableState) {
        return "ObservableScopeInvalidator(state=" + mutableState + ')';
    }

    public boolean equals(Object obj) {
        return m2968equalsimpl(this.state, obj);
    }

    public int hashCode() {
        return m2970hashCodeimpl(this.state);
    }

    public String toString() {
        return m2972toStringimpl(this.state);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ MutableState m2973unboximpl() {
        return this.state;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static MutableState<ab> m2966constructorimpl(MutableState<ab> mutableState) {
        return mutableState;
    }
}
