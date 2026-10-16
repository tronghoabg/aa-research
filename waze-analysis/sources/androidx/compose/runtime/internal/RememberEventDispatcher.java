package androidx.compose.runtime.internal;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterMapKt;
import androidx.collection.ScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.GapRememberObserverHolder;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.Stack;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.composer.RememberManager;
import androidx.compose.runtime.tooling.CompositionErrorContext;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class RememberEventDispatcher implements RememberManager {
    public static final int $stable = 8;
    private Set<RememberObserver> abandoning;
    private MutableVector<RememberObserverHolder> currentRememberingList;
    private ScatterSet<RememberObserverHolder> ignoreLeavingSet;
    private final MutableVector<Object> leaving;
    private ArrayList<MutableVector<RememberObserverHolder>> nestedRemembersLists;
    private MutableScatterMap<RecomposeScopeImpl, PausedCompositionRemembers> pausedPlaceholders;
    private MutableScatterSet<ComposeNodeLifecycleCallback> releasing;
    private MutableScatterSet<RememberObserverHolder> rememberSet;
    private final MutableVector<RememberObserverHolder> remembering;
    private final MutableVector<a<ab>> sideEffects;
    private CompositionErrorContext traceContext;

    public RememberEventDispatcher() {
        MutableVector<RememberObserverHolder> mutableVector = new MutableVector<>(new RememberObserverHolder[16], 0);
        this.remembering = mutableVector;
        this.rememberSet = ScatterSetKt.mutableScatterSetOf();
        this.currentRememberingList = mutableVector;
        this.leaving = new MutableVector<>(new Object[16], 0);
        this.sideEffects = new MutableVector<>(new a[16], 0);
    }

    private final void dispatchRememberList(MutableVector<RememberObserverHolder> mutableVector) {
        Set<RememberObserver> set = this.abandoning;
        if (set == null) {
            return;
        }
        RememberObserverHolder[] rememberObserverHolderArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            RememberObserverHolder rememberObserverHolder = rememberObserverHolderArr[i2];
            RememberObserver wrapped = rememberObserverHolder.getWrapped();
            set.remove(wrapped);
            try {
                wrapped.onRemembered();
            } catch (Throwable th) {
                CompositionErrorContext compositionErrorContext = this.traceContext;
                if (compositionErrorContext != null) {
                    compositionErrorContext.attachComposeStackTrace(th, rememberObserverHolder);
                }
                throw th;
            }
        }
    }

    private static final boolean forgetting$removeFrom(RememberObserverHolder rememberObserverHolder, MutableVector<RememberObserverHolder> mutableVector) {
        RememberObserverHolder[] rememberObserverHolderArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            RememberObserver wrapped = rememberObserverHolderArr[i2].getWrapped();
            if (wrapped instanceof PausedCompositionRemembers) {
                MutableVector<RememberObserverHolder> pausedRemembers = ((PausedCompositionRemembers) wrapped).getPausedRemembers();
                if (pausedRemembers.remove(rememberObserverHolder) || forgetting$removeFrom(rememberObserverHolder, pausedRemembers)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void recordLeaving(Object obj) {
        this.leaving.add(obj);
    }

    private final <T> T withComposeStackTrace(Object obj, a<? extends T> aVar) {
        try {
            return aVar.invoke();
        } catch (Throwable th) {
            CompositionErrorContext compositionErrorContext = this.traceContext;
            if (compositionErrorContext != null) {
                compositionErrorContext.attachComposeStackTrace(th, obj);
            }
            throw th;
        }
    }

    public final void clear() {
        this.abandoning = null;
        this.traceContext = null;
        this.remembering.clear();
        this.rememberSet.clear();
        this.currentRememberingList = this.remembering;
        this.leaving.clear();
        this.sideEffects.clear();
        this.releasing = null;
        this.pausedPlaceholders = null;
        this.nestedRemembersLists = null;
    }

    @Override // androidx.compose.runtime.composer.RememberManager
    public void deactivating(ComposeNodeLifecycleCallback composeNodeLifecycleCallback) {
        recordLeaving(composeNodeLifecycleCallback);
    }

    public final void dispatchAbandons() {
        Set<RememberObserver> set = this.abandoning;
        if (set == null || set.isEmpty()) {
            return;
        }
        Trace.INSTANCE.beginSection("Compose:abandons");
        try {
            Iterator<RememberObserver> it = set.iterator();
            while (it.hasNext()) {
                RememberObserver next = it.next();
                it.remove();
                next.onAbandoned();
            }
        } finally {
            Trace.INSTANCE.endSection(null);
        }
    }

    public final void dispatchOnDeactivateIfNecessary(ComposeNodeLifecycleCallback composeNodeLifecycleCallback) {
        if (this.leaving.remove(composeNodeLifecycleCallback)) {
            composeNodeLifecycleCallback.onDeactivate();
        }
    }

    public final void dispatchRememberObservers() {
        Set<RememberObserver> set = this.abandoning;
        if (set == null) {
            return;
        }
        this.ignoreLeavingSet = null;
        if (this.leaving.getSize() != 0) {
            Trace.INSTANCE.beginSection("Compose:onForgotten");
            try {
                ScatterSet scatterSet = this.releasing;
                int size = this.leaving.getSize();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    Object obj = this.leaving.content[size];
                    try {
                        if (obj instanceof RememberObserverHolder) {
                            RememberObserver wrapped = ((RememberObserverHolder) obj).getWrapped();
                            set.remove(wrapped);
                            wrapped.onForgotten();
                        }
                        if (obj instanceof ComposeNodeLifecycleCallback) {
                            if (scatterSet == null || !scatterSet.contains(obj)) {
                                ((ComposeNodeLifecycleCallback) obj).onDeactivate();
                            } else {
                                ((ComposeNodeLifecycleCallback) obj).onRelease();
                            }
                        }
                    } catch (Throwable th) {
                        CompositionErrorContext compositionErrorContext = this.traceContext;
                        if (compositionErrorContext != null) {
                            compositionErrorContext.attachComposeStackTrace(th, obj);
                        }
                        throw th;
                    }
                }
            } finally {
            }
        }
        if (this.remembering.getSize() != 0) {
            Trace.INSTANCE.beginSection("Compose:onRemembered");
            try {
                dispatchRememberList(this.remembering);
            } finally {
            }
        }
    }

    public final void dispatchSideEffects() {
        if (this.sideEffects.getSize() != 0) {
            Trace.INSTANCE.beginSection("Compose:sideeffects");
            try {
                MutableVector<a<ab>> mutableVector = this.sideEffects;
                a<ab>[] aVarArr = mutableVector.content;
                int size = mutableVector.getSize();
                for (int i2 = 0; i2 < size; i2++) {
                    aVarArr[i2].invoke();
                }
                this.sideEffects.clear();
            } finally {
                Trace.INSTANCE.endSection(null);
            }
        }
    }

    @Override // androidx.compose.runtime.composer.RememberManager
    public void endResumingScope(RecomposeScopeImpl recomposeScopeImpl) {
        MutableVector<RememberObserverHolder> mutableVector;
        MutableScatterMap<RecomposeScopeImpl, PausedCompositionRemembers> mutableScatterMap = this.pausedPlaceholders;
        if (mutableScatterMap == null || mutableScatterMap.get(recomposeScopeImpl) == null) {
            return;
        }
        ArrayList<MutableVector<RememberObserverHolder>> arrayList = this.nestedRemembersLists;
        if (arrayList != null && (mutableVector = (MutableVector) Stack.m7336popimpl(arrayList)) != null) {
            this.currentRememberingList = mutableVector;
        }
        mutableScatterMap.remove(recomposeScopeImpl);
    }

    public final ScatterSet<RememberObserverHolder> extractRememberSet() {
        if (!this.rememberSet.isNotEmpty()) {
            return null;
        }
        MutableScatterSet<RememberObserverHolder> mutableScatterSet = this.rememberSet;
        this.rememberSet = ScatterSetKt.mutableScatterSetOf();
        this.remembering.clear();
        return mutableScatterSet;
    }

    @Override // androidx.compose.runtime.composer.RememberManager
    public void forgetting(RememberObserverHolder rememberObserverHolder) {
        if (!this.rememberSet.contains(rememberObserverHolder)) {
            ScatterSet<RememberObserverHolder> scatterSet = this.ignoreLeavingSet;
            if (scatterSet == null || !scatterSet.contains(rememberObserverHolder)) {
                recordLeaving(rememberObserverHolder);
                return;
            }
            return;
        }
        this.rememberSet.remove(rememberObserverHolder);
        if (!this.currentRememberingList.remove(rememberObserverHolder) && !this.remembering.remove(rememberObserverHolder)) {
            forgetting$removeFrom(rememberObserverHolder, this.remembering);
        }
        Set<RememberObserver> set = this.abandoning;
        if (set == null) {
            return;
        }
        set.add(rememberObserverHolder.getWrapped());
    }

    public final void ignoreForgotten(ScatterSet<RememberObserverHolder> scatterSet) {
        this.ignoreLeavingSet = scatterSet;
    }

    public final void prepare(Set<RememberObserver> set, CompositionErrorContext compositionErrorContext) {
        clear();
        this.abandoning = set;
        this.traceContext = compositionErrorContext;
    }

    @Override // androidx.compose.runtime.composer.RememberManager
    public void releasing(ComposeNodeLifecycleCallback composeNodeLifecycleCallback) {
        MutableScatterSet<ComposeNodeLifecycleCallback> mutableScatterSetMutableScatterSetOf = this.releasing;
        if (mutableScatterSetMutableScatterSetOf == null) {
            mutableScatterSetMutableScatterSetOf = ScatterSetKt.mutableScatterSetOf();
            this.releasing = mutableScatterSetMutableScatterSetOf;
        }
        mutableScatterSetMutableScatterSetOf.plusAssign((MutableScatterSet<ComposeNodeLifecycleCallback>) composeNodeLifecycleCallback);
        recordLeaving(composeNodeLifecycleCallback);
    }

    @Override // androidx.compose.runtime.composer.RememberManager
    public void rememberPausingScope(RecomposeScopeImpl recomposeScopeImpl) {
        Set<RememberObserver> set = this.abandoning;
        if (set == null) {
            return;
        }
        PausedCompositionRemembers pausedCompositionRemembers = new PausedCompositionRemembers(set);
        MutableScatterMap<RecomposeScopeImpl, PausedCompositionRemembers> mutableScatterMapMutableScatterMapOf = this.pausedPlaceholders;
        if (mutableScatterMapMutableScatterMapOf == null) {
            mutableScatterMapMutableScatterMapOf = ScatterMapKt.mutableScatterMapOf();
            this.pausedPlaceholders = mutableScatterMapMutableScatterMapOf;
        }
        mutableScatterMapMutableScatterMapOf.set(recomposeScopeImpl, pausedCompositionRemembers);
        this.currentRememberingList.add(new GapRememberObserverHolder(pausedCompositionRemembers, -1));
    }

    @Override // androidx.compose.runtime.composer.RememberManager
    public void remembering(RememberObserverHolder rememberObserverHolder) {
        this.currentRememberingList.add(rememberObserverHolder);
        this.rememberSet.add(rememberObserverHolder);
    }

    @Override // androidx.compose.runtime.composer.RememberManager
    public void sideEffect(a<ab> aVar) {
        this.sideEffects.add(aVar);
    }

    @Override // androidx.compose.runtime.composer.RememberManager
    public void startResumingScope(RecomposeScopeImpl recomposeScopeImpl) {
        MutableScatterMap<RecomposeScopeImpl, PausedCompositionRemembers> mutableScatterMap = this.pausedPlaceholders;
        PausedCompositionRemembers pausedCompositionRemembers = mutableScatterMap != null ? mutableScatterMap.get(recomposeScopeImpl) : null;
        if (pausedCompositionRemembers != null) {
            ArrayList<MutableVector<RememberObserverHolder>> arrayListM7327constructorimpl$default = this.nestedRemembersLists;
            if (arrayListM7327constructorimpl$default == null) {
                arrayListM7327constructorimpl$default = Stack.m7327constructorimpl$default(null, 1, null);
                this.nestedRemembersLists = arrayListM7327constructorimpl$default;
            }
            Stack.m7337pushimpl(arrayListM7327constructorimpl$default, this.currentRememberingList);
            this.currentRememberingList = pausedCompositionRemembers.getPausedRemembers();
        }
    }

    public final void use(Set<RememberObserver> set, CompositionErrorContext compositionErrorContext, l<? super RememberEventDispatcher, ab> lVar) {
        try {
            prepare(set, compositionErrorContext);
            lVar.invoke(this);
        } finally {
            clear();
        }
    }
}
