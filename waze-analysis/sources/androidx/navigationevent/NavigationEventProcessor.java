package androidx.navigationevent;

import androidx.collection.MutableOrderedScatterSet;
import androidx.collection.OrderedScatterSetKt;
import androidx.collection.SieveCacheKt;
import androidx.core.app.NotificationCompat;
import androidx.navigationevent.NavigationEventTransitionState;
import h.a.u;
import h.g.a.l;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class NavigationEventProcessor {
    private final bn<NavigationEventHistory> _history;
    private final bn<NavigationEventTransitionState> _transitionState;
    private final u<NavigationEventHandler<?>> defaultHandlers;
    private final MutableOrderedScatterSet<NavigationEventInput> defaultInputs;
    private boolean hasEnabledAnyHandlers;
    private boolean hasEnabledDefaultHandlers;
    private boolean hasEnabledOverlayHandlers;
    private final ch<NavigationEventHistory> history;
    private int inProgressDirection;
    private NavigationEventHandler<?> inProgressHandler;
    private NavigationEventInput inProgressInput;
    private final u<NavigationEventHandler<?>> overlayHandlers;
    private final MutableOrderedScatterSet<NavigationEventInput> overlayInputs;
    private final ch<NavigationEventTransitionState> transitionState;
    private final MutableOrderedScatterSet<NavigationEventInput> unspecifiedInputs;

    public NavigationEventProcessor() {
        bn<NavigationEventTransitionState> bnVarB = ck.b(NavigationEventTransitionState.Idle.INSTANCE);
        this._transitionState = bnVarB;
        this.transitionState = ai.U(bnVarB);
        bn<NavigationEventHistory> bnVarB2 = ck.b(new NavigationEventHistory());
        this._history = bnVarB2;
        this.history = ai.U(bnVarB2);
        this.overlayHandlers = new u<>();
        this.defaultHandlers = new u<>();
        this.unspecifiedInputs = OrderedScatterSetKt.mutableOrderedScatterSetOf();
        this.defaultInputs = OrderedScatterSetKt.mutableOrderedScatterSetOf();
        this.overlayInputs = OrderedScatterSetKt.mutableOrderedScatterSetOf();
    }

    public static /* synthetic */ void addHandler$default(NavigationEventProcessor navigationEventProcessor, NavigationEventDispatcher navigationEventDispatcher, NavigationEventHandler navigationEventHandler, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 1;
        }
        navigationEventProcessor.addHandler(navigationEventDispatcher, navigationEventHandler, i2);
    }

    public static /* synthetic */ void dispatchOnStarted$default(NavigationEventProcessor navigationEventProcessor, NavigationEventInput navigationEventInput, int i2, NavigationEvent navigationEvent, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            navigationEvent = null;
        }
        navigationEventProcessor.dispatchOnStarted(navigationEventInput, i2, navigationEvent);
    }

    private final NavigationEventHandler<?> findHandler(l<? super NavigationEventHandler<?>, Boolean> lVar) {
        NavigationEventHandler<?> navigationEventHandler;
        NavigationEventHandler<?> next;
        Iterator<NavigationEventHandler<?>> it = this.overlayHandlers.iterator();
        while (true) {
            navigationEventHandler = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (lVar.invoke(next).booleanValue()) {
                break;
            }
        }
        NavigationEventHandler<?> navigationEventHandler2 = next;
        if (navigationEventHandler2 != null) {
            return navigationEventHandler2;
        }
        Iterator<NavigationEventHandler<?>> it2 = this.defaultHandlers.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            NavigationEventHandler<?> next2 = it2.next();
            if (lVar.invoke(next2).booleanValue()) {
                navigationEventHandler = next2;
                break;
            }
        }
        return navigationEventHandler;
    }

    private static /* synthetic */ void getInProgressDirection$annotations() {
    }

    private final List<NavigationEventInfo> resolveCombinedBackInfo() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.overlayHandlers.iterator();
        while (it.hasNext()) {
            NavigationEventHandler navigationEventHandler = (NavigationEventHandler) it.next();
            if (navigationEventHandler.isBackEnabled() && !navigationEventHandler.getBackInfo().isEmpty()) {
                arrayList.addAll(navigationEventHandler.getBackInfo());
            }
        }
        Iterator it2 = this.defaultHandlers.iterator();
        while (it2.hasNext()) {
            NavigationEventHandler navigationEventHandler2 = (NavigationEventHandler) it2.next();
            if (navigationEventHandler2.isBackEnabled() && !navigationEventHandler2.getBackInfo().isEmpty()) {
                arrayList.addAll(navigationEventHandler2.getBackInfo());
            }
        }
        return arrayList;
    }

    private final NavigationEventHandler<?> resolveEnabledHandler(int i2) {
        NavigationEventHandler<?> next;
        NavigationEventHandler<?> next2;
        NavigationEventHandler<?> next3;
        NavigationEventHandler<?> navigationEventHandler = null;
        if (i2 == -1) {
            Iterator<NavigationEventHandler<?>> it = this.overlayHandlers.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.isBackEnabled()) {
                    break;
                }
            }
            NavigationEventHandler<?> navigationEventHandler2 = next;
            if (navigationEventHandler2 != null) {
                return navigationEventHandler2;
            }
            Iterator<NavigationEventHandler<?>> it2 = this.defaultHandlers.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                NavigationEventHandler<?> next4 = it2.next();
                if (next4.isBackEnabled()) {
                    navigationEventHandler = next4;
                    break;
                }
            }
            return navigationEventHandler;
        }
        if (i2 == 0) {
            Iterator<NavigationEventHandler<?>> it3 = this.overlayHandlers.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it3.next();
                NavigationEventHandler<?> navigationEventHandler3 = next2;
                if (navigationEventHandler3.isBackEnabled() || navigationEventHandler3.isForwardEnabled()) {
                    break;
                }
            }
            NavigationEventHandler<?> navigationEventHandler4 = next2;
            if (navigationEventHandler4 != null) {
                return navigationEventHandler4;
            }
            for (NavigationEventHandler<?> navigationEventHandler5 : this.defaultHandlers) {
                NavigationEventHandler<?> navigationEventHandler6 = navigationEventHandler5;
                if (navigationEventHandler6.isBackEnabled() || navigationEventHandler6.isForwardEnabled()) {
                    navigationEventHandler = navigationEventHandler5;
                    break;
                }
            }
            return navigationEventHandler;
        }
        if (i2 != 1) {
            throw new IllegalStateException("Unsupported direction: '" + i2 + "'.");
        }
        Iterator<NavigationEventHandler<?>> it4 = this.overlayHandlers.iterator();
        while (true) {
            if (!it4.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it4.next();
            if (next3.isForwardEnabled()) {
                break;
            }
        }
        NavigationEventHandler<?> navigationEventHandler7 = next3;
        if (navigationEventHandler7 != null) {
            return navigationEventHandler7;
        }
        Iterator<NavigationEventHandler<?>> it5 = this.defaultHandlers.iterator();
        while (true) {
            if (!it5.hasNext()) {
                break;
            }
            NavigationEventHandler<?> next5 = it5.next();
            if (next5.isForwardEnabled()) {
                navigationEventHandler = next5;
                break;
            }
        }
        return navigationEventHandler;
    }

    static /* synthetic */ NavigationEventHandler resolveEnabledHandler$default(NavigationEventProcessor navigationEventProcessor, int i2, int i3, Object obj) {
        if (1 == (i3 & 1)) {
            i2 = 0;
        }
        return navigationEventProcessor.resolveEnabledHandler(i2);
    }

    public final void addHandler(NavigationEventDispatcher navigationEventDispatcher, NavigationEventHandler<?> navigationEventHandler, int i2) {
        x.f(navigationEventDispatcher, "dispatcher");
        x.f(navigationEventHandler, "handler");
        if (navigationEventHandler.getDispatcher$navigationevent() != null) {
            throw new IllegalArgumentException("Handler '" + navigationEventHandler + "' is already registered with a dispatcher");
        }
        if (i2 == 0) {
            this.overlayHandlers.addFirst(navigationEventHandler);
        } else {
            if (i2 != 1) {
                throw new IllegalArgumentException("Unsupported priority value: " + i2);
            }
            this.defaultHandlers.addFirst(navigationEventHandler);
        }
        navigationEventHandler.setDispatcher$navigationevent(navigationEventDispatcher);
        refreshEnabledHandlers();
    }

    public final void addInput(NavigationEventDispatcher navigationEventDispatcher, NavigationEventInput navigationEventInput, int i2) {
        x.f(navigationEventDispatcher, "dispatcher");
        x.f(navigationEventInput, "input");
        (i2 != 0 ? i2 != 1 ? this.unspecifiedInputs : this.defaultInputs : this.overlayInputs).plusAssign((MutableOrderedScatterSet<NavigationEventInput>) navigationEventInput);
        navigationEventInput.doOnAdded$navigationevent(navigationEventDispatcher);
        navigationEventInput.doOnHistoryChanged$navigationevent((NavigationEventHistory) this.history.d());
        navigationEventInput.doOnHasEnabledHandlersChanged$navigationevent(i2 != 0 ? i2 != 1 ? this.hasEnabledAnyHandlers : this.hasEnabledDefaultHandlers : this.hasEnabledOverlayHandlers);
    }

    public final void dispatchOnCancelled(NavigationEventInput navigationEventInput, int i2) {
        x.f(navigationEventInput, "input");
        if (x.n(navigationEventInput, this.inProgressInput) && i2 == this.inProgressDirection) {
            NavigationEventHandler<?> navigationEventHandlerResolveEnabledHandler = this.inProgressHandler;
            if (navigationEventHandlerResolveEnabledHandler == null) {
                navigationEventHandlerResolveEnabledHandler = resolveEnabledHandler(i2);
            }
            this.inProgressHandler = null;
            this.inProgressDirection = 0;
            this.inProgressInput = null;
            if (i2 != -1) {
                if (i2 == 1 && navigationEventHandlerResolveEnabledHandler != null) {
                    navigationEventHandlerResolveEnabledHandler.doOnForwardCancelled$navigationevent();
                }
            } else if (navigationEventHandlerResolveEnabledHandler != null) {
                navigationEventHandlerResolveEnabledHandler.doOnBackCancelled$navigationevent();
            }
            this._transitionState.e(NavigationEventTransitionState.Idle.INSTANCE);
        }
    }

    public final void dispatchOnCompleted(NavigationEventInput navigationEventInput, int i2, OnBackCompletedFallback onBackCompletedFallback, OnForwardCompletedFallback onForwardCompletedFallback) {
        x.f(navigationEventInput, "input");
        if (x.n(navigationEventInput, this.inProgressInput) && i2 == this.inProgressDirection) {
            NavigationEventHandler<?> navigationEventHandlerResolveEnabledHandler = this.inProgressHandler;
            if (navigationEventHandlerResolveEnabledHandler == null) {
                navigationEventHandlerResolveEnabledHandler = resolveEnabledHandler(i2);
            }
            this.inProgressHandler = null;
            this.inProgressDirection = 0;
            this.inProgressInput = null;
            if (i2 != -1) {
                if (i2 == 1) {
                    if (navigationEventHandlerResolveEnabledHandler != null) {
                        navigationEventHandlerResolveEnabledHandler.doOnForwardCompleted$navigationevent();
                    } else if (onForwardCompletedFallback != null) {
                        onForwardCompletedFallback.onForwardCompletedFallback();
                    }
                }
            } else if (navigationEventHandlerResolveEnabledHandler != null) {
                navigationEventHandlerResolveEnabledHandler.doOnBackCompleted$navigationevent();
            } else if (onBackCompletedFallback != null) {
                onBackCompletedFallback.onBackCompletedFallback();
            }
            this._transitionState.e(NavigationEventTransitionState.Idle.INSTANCE);
        }
    }

    public final void dispatchOnProgressed(NavigationEventInput navigationEventInput, int i2, NavigationEvent navigationEvent) {
        x.f(navigationEventInput, "input");
        x.f(navigationEvent, NotificationCompat.CATEGORY_EVENT);
        if (x.n(navigationEventInput, this.inProgressInput) && i2 == this.inProgressDirection) {
            NavigationEventHandler<?> navigationEventHandlerResolveEnabledHandler = this.inProgressHandler;
            if (navigationEventHandlerResolveEnabledHandler == null) {
                navigationEventHandlerResolveEnabledHandler = resolveEnabledHandler(i2);
            }
            if (i2 != -1) {
                if (i2 == 1 && navigationEventHandlerResolveEnabledHandler != null) {
                    navigationEventHandlerResolveEnabledHandler.doOnForwardProgressed$navigationevent(navigationEvent);
                }
            } else if (navigationEventHandlerResolveEnabledHandler != null) {
                navigationEventHandlerResolveEnabledHandler.doOnBackProgressed$navigationevent(navigationEvent);
            }
            this._transitionState.e(new NavigationEventTransitionState.InProgress(navigationEvent, i2));
        }
    }

    public final void dispatchOnStarted(NavigationEventInput navigationEventInput, int i2, NavigationEvent navigationEvent) {
        x.f(navigationEventInput, "input");
        if (this.inProgressDirection != 0) {
            return;
        }
        NavigationEventHandler<?> navigationEventHandlerResolveEnabledHandler = resolveEnabledHandler(i2);
        this.inProgressHandler = navigationEventHandlerResolveEnabledHandler;
        this.inProgressDirection = i2;
        this.inProgressInput = navigationEventInput;
        if (navigationEvent != null) {
            if (i2 != -1) {
                if (i2 == 1 && navigationEventHandlerResolveEnabledHandler != null) {
                    navigationEventHandlerResolveEnabledHandler.doOnForwardStarted$navigationevent(navigationEvent);
                }
            } else if (navigationEventHandlerResolveEnabledHandler != null) {
                navigationEventHandlerResolveEnabledHandler.doOnBackStarted$navigationevent(navigationEvent);
            }
            this._transitionState.e(new NavigationEventTransitionState.InProgress(navigationEvent, i2));
        }
    }

    public final ch<NavigationEventHistory> getHistory() {
        return this.history;
    }

    public final ch<NavigationEventTransitionState> getTransitionState() {
        return this.transitionState;
    }

    public final void refreshEnabledHandlers() {
        boolean z;
        boolean z2;
        u<NavigationEventHandler<?>> uVar = this.overlayHandlers;
        if ((uVar instanceof Collection) && uVar.isEmpty()) {
            z = false;
        } else {
            for (NavigationEventHandler<?> navigationEventHandler : uVar) {
                if (navigationEventHandler.isBackEnabled() || navigationEventHandler.isForwardEnabled()) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        u<NavigationEventHandler<?>> uVar2 = this.defaultHandlers;
        if ((uVar2 instanceof Collection) && uVar2.isEmpty()) {
            z2 = false;
        } else {
            for (NavigationEventHandler<?> navigationEventHandler2 : uVar2) {
                if (navigationEventHandler2.isBackEnabled() || navigationEventHandler2.isForwardEnabled()) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        }
        boolean z3 = z || z2;
        boolean z4 = this.hasEnabledOverlayHandlers;
        boolean z5 = this.hasEnabledDefaultHandlers;
        boolean z6 = this.hasEnabledAnyHandlers;
        if (z4 != z) {
            MutableOrderedScatterSet<NavigationEventInput> mutableOrderedScatterSet = this.overlayInputs;
            Object[] objArr = mutableOrderedScatterSet.elements;
            long[] jArr = mutableOrderedScatterSet.nodes;
            int i2 = mutableOrderedScatterSet.tail;
            while (i2 != Integer.MAX_VALUE) {
                long j2 = (jArr[i2] >> 31) & SieveCacheKt.NodeLinkMask;
                ((NavigationEventInput) objArr[i2]).doOnHasEnabledHandlersChanged$navigationevent(z);
                i2 = (int) j2;
            }
        }
        if (z5 != z2) {
            MutableOrderedScatterSet<NavigationEventInput> mutableOrderedScatterSet2 = this.defaultInputs;
            Object[] objArr2 = mutableOrderedScatterSet2.elements;
            long[] jArr2 = mutableOrderedScatterSet2.nodes;
            int i3 = mutableOrderedScatterSet2.tail;
            while (i3 != Integer.MAX_VALUE) {
                long j3 = (jArr2[i3] >> 31) & SieveCacheKt.NodeLinkMask;
                ((NavigationEventInput) objArr2[i3]).doOnHasEnabledHandlersChanged$navigationevent(z2);
                i3 = (int) j3;
            }
        }
        if (z6 != z3) {
            MutableOrderedScatterSet<NavigationEventInput> mutableOrderedScatterSet3 = this.unspecifiedInputs;
            Object[] objArr3 = mutableOrderedScatterSet3.elements;
            long[] jArr3 = mutableOrderedScatterSet3.nodes;
            int i4 = mutableOrderedScatterSet3.tail;
            while (i4 != Integer.MAX_VALUE) {
                long j4 = (jArr3[i4] >> 31) & SieveCacheKt.NodeLinkMask;
                ((NavigationEventInput) objArr3[i4]).doOnHasEnabledHandlersChanged$navigationevent(z3);
                i4 = (int) j4;
            }
        }
        this.hasEnabledOverlayHandlers = z;
        this.hasEnabledDefaultHandlers = z2;
        this.hasEnabledAnyHandlers = z3;
        NavigationEventHandler<?> navigationEventHandlerResolveEnabledHandler$default = this.inProgressHandler;
        if (navigationEventHandlerResolveEnabledHandler$default == null) {
            navigationEventHandlerResolveEnabledHandler$default = resolveEnabledHandler$default(this, 0, 1, null);
        }
        updateEnabledHandlerInfo$navigationevent(navigationEventHandlerResolveEnabledHandler$default);
    }

    public final void removeHandler(NavigationEventHandler<?> navigationEventHandler) {
        x.f(navigationEventHandler, "handler");
        if (x.n(navigationEventHandler, this.inProgressHandler)) {
            int i2 = this.inProgressDirection;
            if (i2 == -1) {
                navigationEventHandler.doOnBackCancelled$navigationevent();
            } else if (i2 == 1) {
                navigationEventHandler.doOnForwardCancelled$navigationevent();
            }
            this.inProgressHandler = null;
            this.inProgressDirection = 0;
            this.inProgressInput = null;
        }
        this.overlayHandlers.remove(navigationEventHandler);
        this.defaultHandlers.remove(navigationEventHandler);
        navigationEventHandler.setDispatcher$navigationevent(null);
        refreshEnabledHandlers();
    }

    public final void removeInput(NavigationEventInput navigationEventInput) {
        x.f(navigationEventInput, "input");
        this.overlayInputs.remove(navigationEventInput);
        this.defaultInputs.remove(navigationEventInput);
        this.unspecifiedInputs.remove(navigationEventInput);
        navigationEventInput.doOnRemoved$navigationevent();
    }

    public final void updateEnabledHandlerInfo$navigationevent(NavigationEventHandler<?> navigationEventHandler) {
        NavigationEventHistory navigationEventHistory;
        NavigationEventHandler<?> navigationEventHandlerResolveEnabledHandler$default = this.inProgressHandler;
        if (navigationEventHandlerResolveEnabledHandler$default == null) {
            navigationEventHandlerResolveEnabledHandler$default = resolveEnabledHandler$default(this, 0, 1, null);
        }
        if (x.n(navigationEventHandlerResolveEnabledHandler$default, navigationEventHandler)) {
            if (navigationEventHandlerResolveEnabledHandler$default == null) {
                navigationEventHistory = new NavigationEventHistory();
            } else {
                navigationEventHistory = new NavigationEventHistory(navigationEventHandlerResolveEnabledHandler$default.getCurrentInfo(), resolveCombinedBackInfo(), navigationEventHandlerResolveEnabledHandler$default.getForwardInfo());
            }
            if (x.n((NavigationEventHistory) this._history.d(), navigationEventHistory)) {
                return;
            }
            this._history.e(navigationEventHistory);
            MutableOrderedScatterSet<NavigationEventInput> mutableOrderedScatterSet = this.overlayInputs;
            Object[] objArr = mutableOrderedScatterSet.elements;
            long[] jArr = mutableOrderedScatterSet.nodes;
            int i2 = mutableOrderedScatterSet.tail;
            while (i2 != Integer.MAX_VALUE) {
                long j2 = SieveCacheKt.NodeLinkMask & (jArr[i2] >> 31);
                ((NavigationEventInput) objArr[i2]).doOnHistoryChanged$navigationevent(navigationEventHistory);
                i2 = (int) j2;
            }
            MutableOrderedScatterSet<NavigationEventInput> mutableOrderedScatterSet2 = this.defaultInputs;
            Object[] objArr2 = mutableOrderedScatterSet2.elements;
            long[] jArr2 = mutableOrderedScatterSet2.nodes;
            int i3 = mutableOrderedScatterSet2.tail;
            while (i3 != Integer.MAX_VALUE) {
                long j3 = (jArr2[i3] >> 31) & SieveCacheKt.NodeLinkMask;
                ((NavigationEventInput) objArr2[i3]).doOnHistoryChanged$navigationevent(navigationEventHistory);
                i3 = (int) j3;
            }
            MutableOrderedScatterSet<NavigationEventInput> mutableOrderedScatterSet3 = this.unspecifiedInputs;
            Object[] objArr3 = mutableOrderedScatterSet3.elements;
            long[] jArr3 = mutableOrderedScatterSet3.nodes;
            int i4 = mutableOrderedScatterSet3.tail;
            while (i4 != Integer.MAX_VALUE) {
                long j4 = (jArr3[i4] >> 31) & SieveCacheKt.NodeLinkMask;
                ((NavigationEventInput) objArr3[i4]).doOnHistoryChanged$navigationevent(navigationEventHistory);
                i4 = (int) j4;
            }
        }
    }
}
