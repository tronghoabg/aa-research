package androidx.navigationevent;

import androidx.collection.MutableOrderedScatterSet;
import androidx.collection.OrderedScatterSet;
import androidx.collection.OrderedScatterSetKt;
import androidx.collection.SieveCacheKt;
import androidx.core.app.NotificationCompat;
import h.a.u;
import h.g.b.o;
import h.g.b.x;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class NavigationEventDispatcher {
    public static final Companion Companion = new Companion(null);
    public static final int PRIORITY_DEFAULT = 1;
    public static final int PRIORITY_OVERLAY = 0;
    private final MutableOrderedScatterSet<NavigationEventDispatcher> childDispatchers;
    private final MutableOrderedScatterSet<NavigationEventHandler<?>> handlers;
    private final MutableOrderedScatterSet<NavigationEventInput> inputs;
    private boolean isDisposed;
    private boolean isEnabled;
    private final OnBackCompletedFallback onBackCompletedFallback;
    private final OnForwardCompletedFallback onForwardCompletedFallback;
    private NavigationEventDispatcher parent;
    private final NavigationEventProcessor sharedProcessor;

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Priority {
    }

    private NavigationEventDispatcher(NavigationEventDispatcher navigationEventDispatcher, OnBackCompletedFallback onBackCompletedFallback, OnForwardCompletedFallback onForwardCompletedFallback) {
        NavigationEventProcessor navigationEventProcessor;
        this.parent = navigationEventDispatcher;
        this.onBackCompletedFallback = onBackCompletedFallback;
        this.onForwardCompletedFallback = onForwardCompletedFallback;
        this.isEnabled = true;
        this.sharedProcessor = (navigationEventDispatcher == null || (navigationEventProcessor = navigationEventDispatcher.sharedProcessor) == null) ? new NavigationEventProcessor() : navigationEventProcessor;
        this.childDispatchers = OrderedScatterSetKt.mutableOrderedScatterSetOf();
        this.handlers = OrderedScatterSetKt.mutableOrderedScatterSetOf();
        this.inputs = OrderedScatterSetKt.mutableOrderedScatterSetOf();
        NavigationEventDispatcher navigationEventDispatcher2 = this.parent;
        if (navigationEventDispatcher2 != null) {
            navigationEventDispatcher2.childDispatchers.plusAssign((MutableOrderedScatterSet<NavigationEventDispatcher>) this);
        }
    }

    public static /* synthetic */ void addHandler$default(NavigationEventDispatcher navigationEventDispatcher, NavigationEventHandler navigationEventHandler, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        navigationEventDispatcher.addHandler(navigationEventHandler, i2);
    }

    private final void checkInvariants() {
        if (isDisposed()) {
            throw new IllegalStateException("This NavigationEventDispatcher has already been disposed and cannot be used.");
        }
    }

    private final boolean isDisposed() {
        NavigationEventDispatcher navigationEventDispatcher = this.parent;
        if (navigationEventDispatcher == null || !navigationEventDispatcher.isDisposed()) {
            return this.isDisposed;
        }
        return true;
    }

    public final void addHandler(NavigationEventHandler<?> navigationEventHandler, int i2) {
        x.f(navigationEventHandler, "handler");
        checkInvariants();
        if (this.handlers.add(navigationEventHandler)) {
            this.sharedProcessor.addHandler(this, navigationEventHandler, i2);
        }
    }

    public final void addInput(NavigationEventInput navigationEventInput, int i2) {
        x.f(navigationEventInput, "input");
        checkInvariants();
        if (i2 != 1 && i2 != 0) {
            throw new IllegalArgumentException("Unsupported priority value: " + i2);
        }
        if (this.inputs.add(navigationEventInput)) {
            this.sharedProcessor.addInput(this, navigationEventInput, i2);
        }
    }

    public final void dispatchOnCancelled$navigationevent(NavigationEventInput navigationEventInput, int i2) {
        x.f(navigationEventInput, "input");
        checkInvariants();
        if (isEnabled()) {
            this.sharedProcessor.dispatchOnCancelled(navigationEventInput, i2);
        }
    }

    public final void dispatchOnCompleted$navigationevent(NavigationEventInput navigationEventInput, int i2) {
        x.f(navigationEventInput, "input");
        checkInvariants();
        if (isEnabled()) {
            this.sharedProcessor.dispatchOnCompleted(navigationEventInput, i2, this.onBackCompletedFallback, this.onForwardCompletedFallback);
        }
    }

    public final void dispatchOnProgressed$navigationevent(NavigationEventInput navigationEventInput, int i2, NavigationEvent navigationEvent) {
        x.f(navigationEventInput, "input");
        x.f(navigationEvent, NotificationCompat.CATEGORY_EVENT);
        checkInvariants();
        if (isEnabled()) {
            this.sharedProcessor.dispatchOnProgressed(navigationEventInput, i2, navigationEvent);
        }
    }

    public final void dispatchOnStarted$navigationevent(NavigationEventInput navigationEventInput, int i2, NavigationEvent navigationEvent) {
        x.f(navigationEventInput, "input");
        checkInvariants();
        if (isEnabled()) {
            this.sharedProcessor.dispatchOnStarted(navigationEventInput, i2, navigationEvent);
        }
    }

    public final void dispose() {
        MutableOrderedScatterSet<NavigationEventDispatcher> mutableOrderedScatterSet;
        checkInvariants();
        this.isDisposed = true;
        u uVar = new u();
        u uVar2 = uVar;
        uVar2.add(this);
        while (!uVar2.isEmpty()) {
            NavigationEventDispatcher navigationEventDispatcher = (NavigationEventDispatcher) uVar.removeFirst();
            navigationEventDispatcher.isDisposed = true;
            MutableOrderedScatterSet<NavigationEventDispatcher> mutableOrderedScatterSet2 = navigationEventDispatcher.childDispatchers;
            Object[] objArr = mutableOrderedScatterSet2.elements;
            long[] jArr = mutableOrderedScatterSet2.nodes;
            int i2 = mutableOrderedScatterSet2.tail;
            while (i2 != Integer.MAX_VALUE) {
                long j2 = SieveCacheKt.NodeLinkMask & (jArr[i2] >> 31);
                uVar2.add((NavigationEventDispatcher) objArr[i2]);
                i2 = (int) j2;
            }
            OrderedScatterSet orderedScatterSet = NavigationEventDispatcherKt.toOrderedScatterSet(navigationEventDispatcher.inputs);
            Object[] objArr2 = orderedScatterSet.elements;
            long[] jArr2 = orderedScatterSet.nodes;
            int i3 = orderedScatterSet.tail;
            while (i3 != Integer.MAX_VALUE) {
                long j3 = (jArr2[i3] >> 31) & SieveCacheKt.NodeLinkMask;
                this.sharedProcessor.removeInput((NavigationEventInput) objArr2[i3]);
                i3 = (int) j3;
            }
            navigationEventDispatcher.inputs.clear();
            OrderedScatterSet orderedScatterSet2 = NavigationEventDispatcherKt.toOrderedScatterSet(navigationEventDispatcher.handlers);
            Object[] objArr3 = orderedScatterSet2.elements;
            long[] jArr3 = orderedScatterSet2.nodes;
            int i4 = orderedScatterSet2.tail;
            while (i4 != Integer.MAX_VALUE) {
                long j4 = (jArr3[i4] >> 31) & SieveCacheKt.NodeLinkMask;
                ((NavigationEventHandler) objArr3[i4]).remove();
                i4 = (int) j4;
            }
            navigationEventDispatcher.handlers.clear();
            navigationEventDispatcher.childDispatchers.clear();
            NavigationEventDispatcher navigationEventDispatcher2 = navigationEventDispatcher.parent;
            if (navigationEventDispatcher2 != null && (mutableOrderedScatterSet = navigationEventDispatcher2.childDispatchers) != null) {
                mutableOrderedScatterSet.remove(navigationEventDispatcher);
            }
            navigationEventDispatcher.parent = null;
        }
    }

    public final MutableOrderedScatterSet<NavigationEventDispatcher> getChildDispatchers$navigationevent() {
        return this.childDispatchers;
    }

    public final ch<NavigationEventHistory> getHistory() {
        return this.sharedProcessor.getHistory();
    }

    public final NavigationEventProcessor getSharedProcessor$navigationevent() {
        return this.sharedProcessor;
    }

    public final ch<NavigationEventTransitionState> getTransitionState() {
        return this.sharedProcessor.getTransitionState();
    }

    public final boolean isEnabled() {
        NavigationEventDispatcher navigationEventDispatcher = this.parent;
        if (navigationEventDispatcher == null || navigationEventDispatcher.isEnabled()) {
            return this.isEnabled;
        }
        return false;
    }

    public final void removeHandler$navigationevent(NavigationEventHandler<?> navigationEventHandler) {
        x.f(navigationEventHandler, "handler");
        if (this.handlers.remove(navigationEventHandler)) {
            this.sharedProcessor.removeHandler(navigationEventHandler);
        }
    }

    public final void removeInput(NavigationEventInput navigationEventInput) {
        x.f(navigationEventInput, "input");
        checkInvariants();
        if (this.inputs.remove(navigationEventInput)) {
            this.sharedProcessor.removeInput(navigationEventInput);
        }
    }

    public final void setEnabled(boolean z) {
        checkInvariants();
        if (this.isEnabled == z) {
            return;
        }
        this.isEnabled = z;
        this.sharedProcessor.refreshEnabledHandlers();
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public final void addHandler(NavigationEventHandler<?> navigationEventHandler) {
        x.f(navigationEventHandler, "handler");
        addHandler$default(this, navigationEventHandler, 0, 2, null);
    }

    public final void addInput(NavigationEventInput navigationEventInput) {
        x.f(navigationEventInput, "input");
        checkInvariants();
        if (this.inputs.add(navigationEventInput)) {
            this.sharedProcessor.addInput(this, navigationEventInput, -1);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavigationEventDispatcher(NavigationEventDispatcher navigationEventDispatcher) {
        this(navigationEventDispatcher, null, null);
        x.f(navigationEventDispatcher, "parent");
    }

    public NavigationEventDispatcher() {
        this(null, null, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavigationEventDispatcher(OnBackCompletedFallback onBackCompletedFallback) {
        this(null, onBackCompletedFallback, null);
        x.f(onBackCompletedFallback, "onBackCompletedFallback");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavigationEventDispatcher(OnBackCompletedFallback onBackCompletedFallback, OnForwardCompletedFallback onForwardCompletedFallback) {
        this(null, onBackCompletedFallback, onForwardCompletedFallback);
        x.f(onBackCompletedFallback, "onBackCompletedFallback");
        x.f(onForwardCompletedFallback, "onForwardCompletedFallback");
    }
}
