package androidx.navigationevent;

import androidx.core.app.NotificationCompat;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class NavigationEventInput {
    private NavigationEventDispatcher currentDispatcher;
    private boolean isPredictiveBackInProgress;
    private boolean isPredictiveForwardInProgress;

    protected final void dispatchOnBackCancelled() {
        NavigationEventDispatcher navigationEventDispatcher = this.currentDispatcher;
        if (navigationEventDispatcher == null) {
            return;
        }
        if (!this.isPredictiveBackInProgress) {
            navigationEventDispatcher.dispatchOnStarted$navigationevent(this, -1, null);
        }
        navigationEventDispatcher.dispatchOnCancelled$navigationevent(this, -1);
        this.isPredictiveBackInProgress = false;
    }

    protected final void dispatchOnBackCompleted() {
        NavigationEventDispatcher navigationEventDispatcher = this.currentDispatcher;
        if (navigationEventDispatcher == null) {
            return;
        }
        if (!this.isPredictiveBackInProgress) {
            navigationEventDispatcher.dispatchOnStarted$navigationevent(this, -1, null);
        }
        navigationEventDispatcher.dispatchOnCompleted$navigationevent(this, -1);
        this.isPredictiveBackInProgress = false;
    }

    protected final void dispatchOnBackProgressed(NavigationEvent navigationEvent) {
        x.f(navigationEvent, NotificationCompat.CATEGORY_EVENT);
        NavigationEventDispatcher navigationEventDispatcher = this.currentDispatcher;
        if (navigationEventDispatcher != null && this.isPredictiveBackInProgress) {
            navigationEventDispatcher.dispatchOnProgressed$navigationevent(this, -1, navigationEvent);
        }
    }

    protected final void dispatchOnBackStarted(NavigationEvent navigationEvent) {
        x.f(navigationEvent, NotificationCompat.CATEGORY_EVENT);
        NavigationEventDispatcher navigationEventDispatcher = this.currentDispatcher;
        if (navigationEventDispatcher == null || this.isPredictiveBackInProgress) {
            return;
        }
        navigationEventDispatcher.dispatchOnStarted$navigationevent(this, -1, navigationEvent);
        this.isPredictiveBackInProgress = true;
    }

    protected final void dispatchOnForwardCancelled() {
        NavigationEventDispatcher navigationEventDispatcher = this.currentDispatcher;
        if (navigationEventDispatcher == null) {
            return;
        }
        if (!this.isPredictiveForwardInProgress) {
            navigationEventDispatcher.dispatchOnStarted$navigationevent(this, 1, null);
        }
        navigationEventDispatcher.dispatchOnCancelled$navigationevent(this, 1);
        this.isPredictiveForwardInProgress = false;
    }

    protected final void dispatchOnForwardCompleted() {
        NavigationEventDispatcher navigationEventDispatcher = this.currentDispatcher;
        if (navigationEventDispatcher == null) {
            return;
        }
        if (!this.isPredictiveForwardInProgress) {
            navigationEventDispatcher.dispatchOnStarted$navigationevent(this, 1, null);
        }
        navigationEventDispatcher.dispatchOnCompleted$navigationevent(this, 1);
        this.isPredictiveForwardInProgress = false;
    }

    protected final void dispatchOnForwardProgressed(NavigationEvent navigationEvent) {
        x.f(navigationEvent, NotificationCompat.CATEGORY_EVENT);
        NavigationEventDispatcher navigationEventDispatcher = this.currentDispatcher;
        if (navigationEventDispatcher != null && this.isPredictiveForwardInProgress) {
            navigationEventDispatcher.dispatchOnProgressed$navigationevent(this, 1, navigationEvent);
        }
    }

    protected final void dispatchOnForwardStarted(NavigationEvent navigationEvent) {
        x.f(navigationEvent, NotificationCompat.CATEGORY_EVENT);
        NavigationEventDispatcher navigationEventDispatcher = this.currentDispatcher;
        if (navigationEventDispatcher == null || this.isPredictiveForwardInProgress) {
            return;
        }
        navigationEventDispatcher.dispatchOnStarted$navigationevent(this, 1, navigationEvent);
        this.isPredictiveForwardInProgress = true;
    }

    public final void doOnAdded$navigationevent(NavigationEventDispatcher navigationEventDispatcher) {
        x.f(navigationEventDispatcher, "dispatcher");
        NavigationEventDispatcher navigationEventDispatcher2 = this.currentDispatcher;
        if (navigationEventDispatcher2 == null) {
            this.currentDispatcher = navigationEventDispatcher;
            onAdded(navigationEventDispatcher);
            return;
        }
        throw new IllegalArgumentException("Input '" + this + "' is already added to dispatcher " + navigationEventDispatcher2 + ".");
    }

    public final void doOnHasEnabledHandlersChanged$navigationevent(boolean z) {
        onHasEnabledHandlersChanged(z);
    }

    public final void doOnHistoryChanged$navigationevent(NavigationEventHistory navigationEventHistory) {
        x.f(navigationEventHistory, "history");
        onHistoryChanged(navigationEventHistory);
    }

    public final void doOnRemoved$navigationevent() {
        this.currentDispatcher = null;
        this.isPredictiveBackInProgress = false;
        this.isPredictiveForwardInProgress = false;
        onRemoved();
    }

    protected void onAdded(NavigationEventDispatcher navigationEventDispatcher) {
        x.f(navigationEventDispatcher, "dispatcher");
    }

    protected void onHasEnabledHandlersChanged(boolean z) {
    }

    protected void onHistoryChanged(NavigationEventHistory navigationEventHistory) {
        x.f(navigationEventHistory, "history");
    }

    protected void onRemoved() {
    }
}
