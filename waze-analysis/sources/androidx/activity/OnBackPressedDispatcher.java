package androidx.activity;

import android.window.OnBackInvokedDispatcher;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.app.NotificationCompat;
import androidx.core.util.Consumer;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigationevent.NavigationEvent;
import androidx.navigationevent.NavigationEventDispatcher;
import androidx.navigationevent.NavigationEventInput;
import androidx.navigationevent.OnBackCompletedFallback;
import androidx.navigationevent.OnBackInvokedDefaultInput;
import androidx.navigationevent.OnBackInvokedOverlayInput;
import h.f;
import h.g;
import h.g.a.a;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {
    private final f eventInput$delegate;
    private final Runnable fallbackOnBackPressed;
    private boolean hasEnabledCallbacks;
    private final Consumer<Boolean> onHasEnabledCallbacksChanged;

    /* compiled from: WazeSource */
    /* loaded from: classes2.dex */
    final class OnBackPressedEventInput extends NavigationEventInput {
        private final NavigationEventDispatcher dispatcher;

        public OnBackPressedEventInput() {
            NavigationEventDispatcher navigationEventDispatcher = new NavigationEventDispatcher(new OnBackCompletedFallback() { // from class: androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0
                @Override // androidx.navigationevent.OnBackCompletedFallback
                public final void onBackCompletedFallback() {
                    OnBackPressedDispatcher.OnBackPressedEventInput.dispatcher$lambda$0(onBackPressedDispatcher);
                }
            });
            navigationEventDispatcher.addInput(this);
            this.dispatcher = navigationEventDispatcher;
        }

        static final void dispatcher$lambda$0(OnBackPressedDispatcher onBackPressedDispatcher) {
            Runnable runnable = onBackPressedDispatcher.fallbackOnBackPressed;
            if (runnable != null) {
                runnable.run();
            }
        }

        public final void backCancelled() {
            dispatchOnBackCancelled();
        }

        public final void backCompleted() {
            dispatchOnBackCompleted();
        }

        public final void backProgressed(NavigationEvent navigationEvent) {
            x.f(navigationEvent, NotificationCompat.CATEGORY_EVENT);
            dispatchOnBackProgressed(navigationEvent);
        }

        public final void backStarted(NavigationEvent navigationEvent) {
            x.f(navigationEvent, NotificationCompat.CATEGORY_EVENT);
            dispatchOnBackStarted(navigationEvent);
        }

        public final NavigationEventDispatcher getDispatcher() {
            return this.dispatcher;
        }

        @Override // androidx.navigationevent.NavigationEventInput
        protected void onHasEnabledHandlersChanged(boolean z) {
            OnBackPressedDispatcher.this.hasEnabledCallbacks = z;
            Consumer consumer = OnBackPressedDispatcher.this.onHasEnabledCallbacksChanged;
            if (consumer != null) {
                consumer.accept(Boolean.valueOf(z));
            }
        }
    }

    public OnBackPressedDispatcher(Runnable runnable, Consumer<Boolean> consumer) {
        this.fallbackOnBackPressed = runnable;
        this.onHasEnabledCallbacksChanged = consumer;
        this.eventInput$delegate = g.a(new a() { // from class: androidx.activity.OnBackPressedDispatcher$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return OnBackPressedDispatcher.eventInput_delegate$lambda$0(this.f$0);
            }
        });
    }

    static final OnBackPressedEventInput eventInput_delegate$lambda$0(OnBackPressedDispatcher onBackPressedDispatcher) {
        return onBackPressedDispatcher.new OnBackPressedEventInput();
    }

    private final OnBackPressedEventInput getEventInput() {
        return (OnBackPressedEventInput) this.eventInput$delegate.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.activity.OnBackPressedDispatcher$addCallback$observer$1] */
    public final void addCallback(LifecycleOwner lifecycleOwner, OnBackPressedCallback onBackPressedCallback) {
        x.f(lifecycleOwner, "owner");
        x.f(onBackPressedCallback, "onBackPressedCallback");
        final Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        final OnBackPressedCallback.OnBackPressedEventHandler onBackPressedEventHandlerCreateNavigationEventHandler$activity = onBackPressedCallback.createNavigationEventHandler$activity(new OnBackPressedCallbackInfo(onBackPressedCallback, lifecycleOwner));
        if (ActivityFlags.isOnBackPressedLifecycleOrderMaintained) {
            onBackPressedEventHandlerCreateNavigationEventHandler$activity.setLifecycleActive(false);
            NavigationEventDispatcher.addHandler$default(getEventDispatcher$activity(), onBackPressedEventHandlerCreateNavigationEventHandler$activity, 0, 2, null);
        }
        final ?? r1 = new LifecycleEventObserver() { // from class: androidx.activity.OnBackPressedDispatcher$addCallback$observer$1

            /* compiled from: WazeSource */
            public final /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[Lifecycle.Event.values().length];
                    try {
                        iArr[Lifecycle.Event.ON_START.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[Lifecycle.Event.ON_STOP.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                x.f(lifecycleOwner2, "source");
                x.f(event, NotificationCompat.CATEGORY_EVENT);
                Lifecycle.Event.Companion companion = Lifecycle.Event.Companion;
                int iOrdinal = event.ordinal();
                if (iOrdinal == 1) {
                    if (ActivityFlags.isOnBackPressedLifecycleOrderMaintained) {
                        onBackPressedEventHandlerCreateNavigationEventHandler$activity.setLifecycleActive(true);
                        return;
                    }
                    OnBackPressedDispatcher onBackPressedDispatcher = this;
                    NavigationEventDispatcher.addHandler$default(onBackPressedDispatcher.getEventDispatcher$activity(), onBackPressedEventHandlerCreateNavigationEventHandler$activity, 0, 2, null);
                    return;
                }
                if (iOrdinal != 4) {
                    if (iOrdinal != 5) {
                        return;
                    }
                    onBackPressedEventHandlerCreateNavigationEventHandler$activity.remove();
                    lifecycle.removeObserver(this);
                    return;
                }
                boolean z = ActivityFlags.isOnBackPressedLifecycleOrderMaintained;
                OnBackPressedCallback.OnBackPressedEventHandler onBackPressedEventHandler = onBackPressedEventHandlerCreateNavigationEventHandler$activity;
                if (z) {
                    onBackPressedEventHandler.setLifecycleActive(false);
                } else {
                    onBackPressedEventHandler.remove();
                }
            }
        };
        lifecycle.addObserver((LifecycleObserver) r1);
        onBackPressedCallback.addCloseable$activity(new AutoCloseable() { // from class: androidx.activity.OnBackPressedDispatcher$$ExternalSyntheticLambda1
            @Override // java.lang.AutoCloseable
            public final void close() {
                lifecycle.removeObserver(r1);
            }
        });
    }

    public final void dispatchOnBackCancelled() {
        getEventInput().backCancelled();
    }

    public final void dispatchOnBackProgressed(BackEventCompat backEventCompat) {
        x.f(backEventCompat, "backEvent");
        getEventInput().backProgressed(backEventCompat.toNavigationEvent());
    }

    public final void dispatchOnBackStarted(BackEventCompat backEventCompat) {
        x.f(backEventCompat, "backEvent");
        getEventInput().backStarted(backEventCompat.toNavigationEvent());
    }

    public final NavigationEventDispatcher getEventDispatcher$activity() {
        return getEventInput().getDispatcher();
    }

    public final boolean hasEnabledCallbacks() {
        return this.hasEnabledCallbacks;
    }

    public final void onBackPressed() {
        getEventInput().backCompleted();
    }

    public final void setOnBackInvokedDispatcher(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        x.f(onBackInvokedDispatcher, "invoker");
        getEventDispatcher$activity().addInput(new OnBackInvokedDefaultInput(onBackInvokedDispatcher), 1);
        getEventDispatcher$activity().addInput(new OnBackInvokedOverlayInput(onBackInvokedDispatcher), 0);
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this(runnable, null);
    }

    public /* synthetic */ OnBackPressedDispatcher(Runnable runnable, int i2, o oVar) {
        this(1 == (i2 & 1) ? null : runnable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OnBackPressedDispatcher() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void addCallback(OnBackPressedCallback onBackPressedCallback) {
        x.f(onBackPressedCallback, "onBackPressedCallback");
        NavigationEventDispatcher.addHandler$default(getEventDispatcher$activity(), onBackPressedCallback.createNavigationEventHandler$activity(new OnBackPressedCallbackInfo(onBackPressedCallback, null, 2, 0 == true ? 1 : 0)), 0, 2, null);
    }
}
