package androidx.lifecycle;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import h.a.i;
import h.ab;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public class LifecycleRegistry extends Lifecycle {
    public static final Companion Companion = new Companion(null);
    private final bn<Lifecycle.State> _currentStateFlow;
    private int addingObserverCounter;
    private final boolean enforceMainThread;
    private boolean handlingEvent;
    private final WeakReference<LifecycleOwner> lifecycleOwner;
    private boolean newEventOccurred;
    private FastSafeIterableMap<LifecycleObserver, ObserverWithState> observerMap;
    private List<Lifecycle.State> parentStates;
    private Lifecycle.State state;

    /* compiled from: WazeSource */
    public final class ObserverWithState {
        private LifecycleEventObserver lifecycleObserver;
        private Lifecycle.State state;

        public ObserverWithState(LifecycleObserver lifecycleObserver, Lifecycle.State state) {
            x.f(state, "initialState");
            this.state = state;
            if (lifecycleObserver == null) {
                x.g();
            }
            this.lifecycleObserver = Lifecycling.lifecycleEventObserver(lifecycleObserver);
        }

        public final void dispatchEvent(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            x.f(event, NotificationCompat.CATEGORY_EVENT);
            Lifecycle.State targetState = event.getTargetState();
            this.state = LifecycleRegistryKt.min(this.state, targetState);
            LifecycleEventObserver lifecycleEventObserver = this.lifecycleObserver;
            if (lifecycleOwner == null) {
                x.g();
            }
            lifecycleEventObserver.onStateChanged(lifecycleOwner, event);
            this.state = targetState;
        }

        public final LifecycleEventObserver getLifecycleObserver() {
            return this.lifecycleObserver;
        }

        public final Lifecycle.State getState() {
            return this.state;
        }

        public final void setLifecycleObserver(LifecycleEventObserver lifecycleEventObserver) {
            x.f(lifecycleEventObserver, "<set-?>");
            this.lifecycleObserver = lifecycleEventObserver;
        }

        public final void setState(Lifecycle.State state) {
            x.f(state, "<set-?>");
            this.state = state;
        }
    }

    private LifecycleRegistry(LifecycleOwner lifecycleOwner, boolean z) {
        this.enforceMainThread = z;
        this.observerMap = new FastSafeIterableMap<>();
        this.lifecycleOwner = new WeakReference<>(lifecycleOwner);
        this.parentStates = new ArrayList();
        Lifecycle.State state = Lifecycle.State.INITIALIZED;
        this.state = state;
        this._currentStateFlow = ck.b(state);
    }

    private final void backwardPass(final LifecycleOwner lifecycleOwner) {
        this.observerMap.forEachReversed(new l() { // from class: androidx.lifecycle.LifecycleRegistry$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return LifecycleRegistry.backwardPass$lambda$0(this.f$0, lifecycleOwner, (Map.Entry) obj);
            }
        });
    }

    static final ab backwardPass$lambda$0(LifecycleRegistry lifecycleRegistry, LifecycleOwner lifecycleOwner, Map.Entry entry) {
        x.f(entry, "<destruct>");
        LifecycleObserver lifecycleObserver = (LifecycleObserver) entry.getKey();
        ObserverWithState observerWithState = (ObserverWithState) entry.getValue();
        while (observerWithState.getState().compareTo(lifecycleRegistry.state) > 0 && !lifecycleRegistry.newEventOccurred && lifecycleRegistry.observerMap.contains(lifecycleObserver)) {
            Lifecycle.Event eventDownFrom = Lifecycle.Event.Companion.downFrom(observerWithState.getState());
            if (eventDownFrom == null) {
                Lifecycle.State state = observerWithState.getState();
                Objects.toString(state);
                throw new IllegalStateException("no event down from ".concat(String.valueOf(state)));
            }
            lifecycleRegistry.parentStates.add(eventDownFrom.getTargetState());
            observerWithState.dispatchEvent(lifecycleOwner, eventDownFrom);
            i.x(lifecycleRegistry.parentStates);
        }
        return ab.f48028a;
    }

    private final Lifecycle.State calculateTargetState(LifecycleObserver lifecycleObserver) {
        ObserverWithState value;
        Map.Entry<LifecycleObserver, ObserverWithState> entryCeil = this.observerMap.ceil(lifecycleObserver);
        Lifecycle.State state = null;
        Lifecycle.State state2 = (entryCeil == null || (value = entryCeil.getValue()) == null) ? null : value.getState();
        if (!this.parentStates.isEmpty()) {
            state = this.parentStates.get(r0.size() - 1);
        }
        return LifecycleRegistryKt.min(LifecycleRegistryKt.min(this.state, state2), state);
    }

    public static final LifecycleRegistry createUnsafe(LifecycleOwner lifecycleOwner) {
        return Companion.createUnsafe(lifecycleOwner);
    }

    private final void enforceMainThreadIfNeeded(String str) {
        if (!this.enforceMainThread || LifecycleRegistry_androidKt.isMainThread()) {
            return;
        }
        throw new IllegalStateException("Method " + str + " must be called on the main thread");
    }

    private final void forwardPass(final LifecycleOwner lifecycleOwner) {
        this.observerMap.forEachWithAdditions(new l() { // from class: androidx.lifecycle.LifecycleRegistry$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return LifecycleRegistry.forwardPass$lambda$0(this.f$0, lifecycleOwner, (Map.Entry) obj);
            }
        });
    }

    static final ab forwardPass$lambda$0(LifecycleRegistry lifecycleRegistry, LifecycleOwner lifecycleOwner, Map.Entry entry) {
        x.f(entry, "<destruct>");
        LifecycleObserver lifecycleObserver = (LifecycleObserver) entry.getKey();
        ObserverWithState observerWithState = (ObserverWithState) entry.getValue();
        while (observerWithState.getState().compareTo(lifecycleRegistry.state) < 0 && !lifecycleRegistry.newEventOccurred && lifecycleRegistry.observerMap.contains(lifecycleObserver)) {
            lifecycleRegistry.parentStates.add(observerWithState.getState());
            Lifecycle.Event eventUpFrom = Lifecycle.Event.Companion.upFrom(observerWithState.getState());
            if (eventUpFrom == null) {
                Lifecycle.State state = observerWithState.getState();
                Objects.toString(state);
                throw new IllegalStateException("no event up from ".concat(String.valueOf(state)));
            }
            observerWithState.dispatchEvent(lifecycleOwner, eventUpFrom);
            i.x(lifecycleRegistry.parentStates);
        }
        return ab.f48028a;
    }

    private final boolean isSynced() {
        if (this.observerMap.size() == 0) {
            return true;
        }
        Lifecycle.State state = this.observerMap.first().getValue().getState();
        Lifecycle.State state2 = this.observerMap.last().getValue().getState();
        return state == state2 && this.state == state2;
    }

    private final void moveToState(Lifecycle.State state) {
        if (this.state == state) {
            return;
        }
        LifecycleRegistryKt.checkLifecycleStateTransition(this.lifecycleOwner.get(), this.state, state);
        this.state = state;
        if (this.handlingEvent || this.addingObserverCounter != 0) {
            this.newEventOccurred = true;
            return;
        }
        this.handlingEvent = true;
        sync();
        this.handlingEvent = false;
        if (this.state == Lifecycle.State.DESTROYED) {
            this.observerMap = new FastSafeIterableMap<>();
        }
    }

    private final void sync() {
        LifecycleOwner lifecycleOwner = this.lifecycleOwner.get();
        if (lifecycleOwner == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        while (!isSynced()) {
            this.newEventOccurred = false;
            if (this.state.compareTo(this.observerMap.first().getValue().getState()) < 0) {
                backwardPass(lifecycleOwner2);
            }
            Map.Entry<LifecycleObserver, ObserverWithState> entryLastOrNull = this.observerMap.lastOrNull();
            if (!this.newEventOccurred && entryLastOrNull != null && this.state.compareTo(entryLastOrNull.getValue().getState()) > 0) {
                forwardPass(lifecycleOwner2);
            }
        }
        this.newEventOccurred = false;
        this._currentStateFlow.e(getCurrentState());
    }

    @Override // androidx.lifecycle.Lifecycle
    public void addObserver(LifecycleObserver lifecycleObserver) {
        LifecycleOwner lifecycleOwner;
        x.f(lifecycleObserver, "observer");
        enforceMainThreadIfNeeded("addObserver");
        Lifecycle.State state = this.state;
        Lifecycle.State state2 = Lifecycle.State.DESTROYED;
        if (state != state2) {
            state2 = Lifecycle.State.INITIALIZED;
        }
        ObserverWithState observerWithState = new ObserverWithState(lifecycleObserver, state2);
        if (this.observerMap.putIfAbsent(lifecycleObserver, observerWithState) == null && (lifecycleOwner = this.lifecycleOwner.get()) != null) {
            boolean z = this.addingObserverCounter != 0 || this.handlingEvent;
            Lifecycle.State stateCalculateTargetState = calculateTargetState(lifecycleObserver);
            this.addingObserverCounter++;
            while (observerWithState.getState().compareTo(stateCalculateTargetState) < 0 && this.observerMap.contains(lifecycleObserver)) {
                this.parentStates.add(observerWithState.getState());
                Lifecycle.Event eventUpFrom = Lifecycle.Event.Companion.upFrom(observerWithState.getState());
                if (eventUpFrom == null) {
                    Lifecycle.State state3 = observerWithState.getState();
                    Objects.toString(state3);
                    throw new IllegalStateException("no event up from ".concat(String.valueOf(state3)));
                }
                observerWithState.dispatchEvent(lifecycleOwner, eventUpFrom);
                i.x(this.parentStates);
                stateCalculateTargetState = calculateTargetState(lifecycleObserver);
            }
            if (!z) {
                sync();
            }
            this.addingObserverCounter--;
        }
    }

    @Override // androidx.lifecycle.Lifecycle
    public Lifecycle.State getCurrentState() {
        return this.state;
    }

    @Override // androidx.lifecycle.Lifecycle
    public ch<Lifecycle.State> getCurrentStateFlow() {
        return ai.U(this._currentStateFlow);
    }

    public int getObserverCount() {
        enforceMainThreadIfNeeded("getObserverCount");
        return this.observerMap.size();
    }

    public void handleLifecycleEvent(Lifecycle.Event event) {
        x.f(event, NotificationCompat.CATEGORY_EVENT);
        enforceMainThreadIfNeeded("handleLifecycleEvent");
        moveToState(event.getTargetState());
    }

    public void markState(Lifecycle.State state) {
        x.f(state, "state");
        enforceMainThreadIfNeeded("markState");
        setCurrentState(state);
    }

    @Override // androidx.lifecycle.Lifecycle
    public void removeObserver(LifecycleObserver lifecycleObserver) {
        x.f(lifecycleObserver, "observer");
        enforceMainThreadIfNeeded("removeObserver");
        this.observerMap.remove(lifecycleObserver);
    }

    public void setCurrentState(Lifecycle.State state) {
        x.f(state, "state");
        enforceMainThreadIfNeeded("setCurrentState");
        moveToState(state);
    }

    /* compiled from: WazeSource */
    /* loaded from: classes3.dex */
    public final class Companion {
        private Companion() {
        }

        public final LifecycleRegistry createUnsafe(LifecycleOwner lifecycleOwner) {
            x.f(lifecycleOwner, "owner");
            return new LifecycleRegistry(lifecycleOwner, false, null);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LifecycleRegistry(LifecycleOwner lifecycleOwner) {
        this(lifecycleOwner, true);
        x.f(lifecycleOwner, "provider");
    }

    public /* synthetic */ LifecycleRegistry(LifecycleOwner lifecycleOwner, boolean z, o oVar) {
        this(lifecycleOwner, z);
    }
}
