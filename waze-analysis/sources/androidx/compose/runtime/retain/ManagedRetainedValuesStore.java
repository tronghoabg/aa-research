package androidx.compose.runtime.retain;

import androidx.collection.MutableScatterMap;
import androidx.compose.runtime.retain.impl.PreconditionsKt;
import androidx.compose.runtime.retain.impl.SafeMultiValueMap;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ManagedRetainedValuesStore implements RetainedValuesStore {
    public static final int $stable = 8;
    private boolean isContentComposed;
    private boolean isDisposed;
    private boolean isEnabled = true;
    private final MutableScatterMap<Object, Object> keptExitedValues = SafeMultiValueMap.m7597constructorimpl$default(null, 1, null);

    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void purgeUnusedExitedValues() {
        /*
            r15 = this;
            androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> r0 = r15.keptExitedValues
            androidx.collection.ScatterMap r0 = (androidx.collection.ScatterMap) r0
            java.lang.Object[] r1 = r0.values
            long[] r0 = r0.metadata
            int r2 = r0.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L6f
            r3 = 0
            r4 = r3
        Lf:
            r5 = r0[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L6a
            int r7 = r4 - r2
            r8 = r3
        L22:
            int r9 = ~r7
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            if (r8 >= r9) goto L68
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r5
            r13 = 128(0x80, double:6.3E-322)
            int r9 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r9 >= 0) goto L64
            int r9 = r4 << 3
            int r9 = r9 + r8
            r9 = r1[r9]
            boolean r11 = r9 instanceof androidx.collection.MutableObjectList
            if (r11 == 0) goto L5b
            java.lang.String r11 = "null cannot be cast to non-null type androidx.collection.MutableObjectList<V of androidx.compose.runtime.retain.impl.SafeMultiValueMap>"
            h.g.b.x.d(r9, r11)
            androidx.collection.MutableObjectList r9 = (androidx.collection.MutableObjectList) r9
            androidx.collection.ObjectList r9 = (androidx.collection.ObjectList) r9
            java.lang.Object[] r11 = r9.content
            int r9 = r9._size
            r12 = r3
        L4b:
            if (r12 >= r9) goto L64
            r13 = r11[r12]
            boolean r14 = r13 instanceof androidx.compose.runtime.retain.RetainObserver
            if (r14 == 0) goto L58
            androidx.compose.runtime.retain.RetainObserver r13 = (androidx.compose.runtime.retain.RetainObserver) r13
            r13.onRetired()
        L58:
            int r12 = r12 + 1
            goto L4b
        L5b:
            boolean r11 = r9 instanceof androidx.compose.runtime.retain.RetainObserver
            if (r11 == 0) goto L64
            androidx.compose.runtime.retain.RetainObserver r9 = (androidx.compose.runtime.retain.RetainObserver) r9
            r9.onRetired()
        L64:
            long r5 = r5 >> r10
            int r8 = r8 + 1
            goto L22
        L68:
            if (r9 != r10) goto L6f
        L6a:
            if (r4 == r2) goto L6f
            int r4 = r4 + 1
            goto Lf
        L6f:
            androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> r15 = r15.keptExitedValues
            androidx.compose.runtime.retain.impl.SafeMultiValueMap.m7595clearimpl(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.retain.ManagedRetainedValuesStore.purgeUnusedExitedValues():void");
    }

    @Override // androidx.compose.runtime.retain.RetainedValuesStore
    public Object consumeExitedValueOrDefault(Object obj, Object obj2) {
        return SafeMultiValueMap.m7608removeLastimpl(this.keptExitedValues, obj, obj2);
    }

    public final void disableRetainingExitedValues() {
        this.isEnabled = false;
        purgeUnusedExitedValues();
    }

    public final void dispose() {
        this.isDisposed = true;
        disableRetainingExitedValues();
    }

    public final void enableRetainingExitedValues() {
        if (this.isDisposed) {
            PreconditionsKt.throwIllegalStateException("Cannot call enableRetainingExitedValues on a disposed store");
        }
        this.isEnabled = true;
    }

    public final boolean isRetainingExitedValues() {
        return this.isEnabled && !this.isContentComposed;
    }

    @Override // androidx.compose.runtime.retain.RetainedValuesStore
    public void onContentEnteredComposition() {
        if (this.isDisposed) {
            return;
        }
        if (this.isContentComposed) {
            PreconditionsKt.throwIllegalStateException("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
        }
        purgeUnusedExitedValues();
        this.isContentComposed = true;
    }

    @Override // androidx.compose.runtime.retain.RetainedValuesStore
    public void onContentExitComposition() {
        if (this.isDisposed) {
            return;
        }
        if (!this.isContentComposed) {
            PreconditionsKt.throwIllegalStateException("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
        }
        if (!SafeMultiValueMap.m7604isEmptyimpl(this.keptExitedValues)) {
            PreconditionsKt.throwIllegalStateException("Attempted to start retaining exited values with pending exited values");
        }
        this.isContentComposed = false;
    }

    @Override // androidx.compose.runtime.retain.RetainedValuesStore
    public void saveExitingValue(Object obj, Object obj2) {
        if (isRetainingExitedValues()) {
            SafeMultiValueMap.m7593addimpl(this.keptExitedValues, obj, obj2);
        } else if (obj2 instanceof RetainObserver) {
            ((RetainObserver) obj2).onRetired();
        }
    }
}
