package androidx.compose.ui.platform;

import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.CancellationHandle;
import androidx.compose.runtime.retain.RetainedValuesStore;
import androidx.lifecycle.ViewModel;
import h.ab;
import h.g.a.a;
import java.util.concurrent.CancellationException;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class LifecycleRetainedValuesStoreOwner extends ViewModel {
    public static final int $stable = 8;
    private final MutableIntObjectMap<MutableObjectList<RetainedValuesStoreEntry>> scopes = IntObjectMapKt.mutableIntObjectMapOf();

    /* compiled from: WazeSource */
    public interface FrameEndScheduler {
        CancellationHandle scheduleFrameEndCallback(a<ab> aVar);
    }

    /* compiled from: WazeSource */
    public final class RetainedValuesStoreEntry {
        public static final int $stable = 8;
        private final LifecycleRetainedValuesStore _retainedValuesStore;
        private CancellationHandle endRetainCancellationHandle;
        private boolean isInUse;
        private final RetainedValuesStore retainedValuesStore;

        public RetainedValuesStoreEntry() {
            LifecycleRetainedValuesStore lifecycleRetainedValuesStore = new LifecycleRetainedValuesStore(null, 1, null);
            this._retainedValuesStore = lifecycleRetainedValuesStore;
            this.retainedValuesStore = lifecycleRetainedValuesStore;
        }

        private final void setEndRetainCancellationHandle(CancellationHandle cancellationHandle) {
            CancellationHandle cancellationHandle2 = this.endRetainCancellationHandle;
            if (cancellationHandle2 != null) {
                cancellationHandle2.cancel();
            }
            this.endRetainCancellationHandle = cancellationHandle;
        }

        public final RetainedValuesStore getRetainedValuesStore() {
            return this.retainedValuesStore;
        }

        public final boolean isInUse() {
            return this.isInUse;
        }

        public final void onCleared() {
            setEndRetainCancellationHandle(null);
            this._retainedValuesStore.dispose();
        }

        public final void release() {
            this.isInUse = false;
        }

        public final void setInUse(boolean z) {
            this.isInUse = z;
        }

        public final void startRetainingExitedValues() {
            if (this._retainedValuesStore.isRetainingExitedValues()) {
                setEndRetainCancellationHandle(null);
            } else {
                this._retainedValuesStore.startLifecycleTransition();
            }
        }

        public final void stopRetainingExitedValues(FrameEndScheduler frameEndScheduler) {
            CancellationHandle cancellationHandleScheduleFrameEndCallback;
            if (this._retainedValuesStore.isRetainingExitedValues()) {
                try {
                    cancellationHandleScheduleFrameEndCallback = frameEndScheduler.scheduleFrameEndCallback(new LifecycleRetainedValuesStoreOwner$RetainedValuesStoreEntry$stopRetainingExitedValues$1(this));
                } catch (CancellationException unused) {
                    this._retainedValuesStore.endLifecycleTransition();
                    cancellationHandleScheduleFrameEndCallback = null;
                }
                setEndRetainCancellationHandle(cancellationHandleScheduleFrameEndCallback);
            }
        }
    }

    public final RetainedValuesStoreEntry getOrCreateRetainedValuesStoreEntry(int i2) {
        Object obj;
        MutableIntObjectMap<MutableObjectList<RetainedValuesStoreEntry>> mutableIntObjectMap = this.scopes;
        MutableObjectList<RetainedValuesStoreEntry> mutableObjectList = mutableIntObjectMap.get(i2);
        if (mutableObjectList == null) {
            mutableObjectList = new MutableObjectList<>(1);
            mutableIntObjectMap.set(i2, mutableObjectList);
        }
        MutableObjectList<RetainedValuesStoreEntry> mutableObjectList2 = mutableObjectList;
        MutableObjectList<RetainedValuesStoreEntry> mutableObjectList3 = mutableObjectList2;
        Object[] objArr = mutableObjectList3.content;
        int i3 = mutableObjectList3._size;
        int i4 = 0;
        while (true) {
            if (i4 >= i3) {
                obj = null;
                break;
            }
            obj = objArr[i4];
            if (!((RetainedValuesStoreEntry) obj).isInUse()) {
                break;
            }
            i4++;
        }
        RetainedValuesStoreEntry retainedValuesStoreEntry = (RetainedValuesStoreEntry) obj;
        if (retainedValuesStoreEntry == null) {
            retainedValuesStoreEntry = new RetainedValuesStoreEntry();
            mutableObjectList2.add(retainedValuesStoreEntry);
        }
        retainedValuesStoreEntry.setInUse(true);
        return retainedValuesStoreEntry;
    }

    @Override // androidx.lifecycle.ViewModel
    protected void onCleared() {
        int i2;
        MutableIntObjectMap<MutableObjectList<RetainedValuesStoreEntry>> mutableIntObjectMap = this.scopes;
        int[] iArr = mutableIntObjectMap.keys;
        Object[] objArr = mutableIntObjectMap.values;
        long[] jArr = mutableIntObjectMap.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j2 = jArr[i3];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = i3 - length;
                int i5 = 0;
                while (true) {
                    i2 = 8 - ((~i4) >>> 31);
                    if (i5 >= i2) {
                        break;
                    }
                    if ((255 & j2) < 128) {
                        int i6 = (i3 << 3) + i5;
                        int i7 = iArr[i6];
                        MutableObjectList mutableObjectList = (MutableObjectList) objArr[i6];
                        Object[] objArr2 = mutableObjectList.content;
                        int i8 = mutableObjectList._size;
                        for (int i9 = 0; i9 < i8; i9++) {
                            ((RetainedValuesStoreEntry) objArr2[i9]).onCleared();
                        }
                    }
                    j2 >>= 8;
                    i5++;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i3 == length) {
                return;
            } else {
                i3++;
            }
        }
    }
}
