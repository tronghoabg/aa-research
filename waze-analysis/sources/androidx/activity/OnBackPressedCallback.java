package androidx.activity;

import androidx.core.app.NotificationCompat;
import androidx.navigationevent.NavigationEvent;
import androidx.navigationevent.NavigationEventHandler;
import androidx.navigationevent.NavigationEventInfo;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class OnBackPressedCallback {
    private boolean isEnabled;
    private final List<OnBackPressedEventHandler> eventHandlers = new ArrayList();
    private final CopyOnWriteArrayList<AutoCloseable> closeables = new CopyOnWriteArrayList<>();

    /* compiled from: WazeSource */
    /* loaded from: classes2.dex */
    public final class OnBackPressedEventHandler extends NavigationEventHandler<NavigationEventInfo> {
        private boolean isLifecycleActive;
        private final OnBackPressedCallback onBackPressedCallback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnBackPressedEventHandler(OnBackPressedCallback onBackPressedCallback, NavigationEventInfo navigationEventInfo) {
            super(navigationEventInfo, onBackPressedCallback.isEnabled());
            x.f(onBackPressedCallback, "onBackPressedCallback");
            x.f(navigationEventInfo, "info");
            this.onBackPressedCallback = onBackPressedCallback;
            this.isLifecycleActive = true;
        }

        public final boolean isLifecycleActive() {
            return this.isLifecycleActive;
        }

        @Override // androidx.navigationevent.NavigationEventHandler
        protected void onBackCancelled() {
            this.onBackPressedCallback.handleOnBackCancelled();
        }

        @Override // androidx.navigationevent.NavigationEventHandler
        protected void onBackCompleted() {
            this.onBackPressedCallback.handleOnBackPressed();
        }

        @Override // androidx.navigationevent.NavigationEventHandler
        protected void onBackProgressed(NavigationEvent navigationEvent) {
            x.f(navigationEvent, NotificationCompat.CATEGORY_EVENT);
            this.onBackPressedCallback.handleOnBackProgressed(new BackEventCompat(navigationEvent));
        }

        @Override // androidx.navigationevent.NavigationEventHandler
        protected void onBackStarted(NavigationEvent navigationEvent) {
            x.f(navigationEvent, NotificationCompat.CATEGORY_EVENT);
            this.onBackPressedCallback.handleOnBackStarted(new BackEventCompat(navigationEvent));
        }

        public final void setLifecycleActive(boolean z) {
            this.isLifecycleActive = z;
            boolean z2 = false;
            if (z && this.onBackPressedCallback.isEnabled()) {
                z2 = true;
            }
            setBackEnabled(z2);
        }
    }

    public OnBackPressedCallback(boolean z) {
        this.isEnabled = z;
    }

    public final void addCloseable$activity(AutoCloseable autoCloseable) {
        x.f(autoCloseable, "closeable");
        this.closeables.add(autoCloseable);
    }

    public final OnBackPressedEventHandler createNavigationEventHandler$activity(NavigationEventInfo navigationEventInfo) {
        x.f(navigationEventInfo, "info");
        OnBackPressedEventHandler onBackPressedEventHandler = new OnBackPressedEventHandler(this, navigationEventInfo);
        this.eventHandlers.add(onBackPressedEventHandler);
        return onBackPressedEventHandler;
    }

    public abstract void handleOnBackPressed();

    public void handleOnBackProgressed(BackEventCompat backEventCompat) {
        x.f(backEventCompat, "backEvent");
    }

    public void handleOnBackStarted(BackEventCompat backEventCompat) {
        x.f(backEventCompat, "backEvent");
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final void remove() throws Exception {
        Iterator<AutoCloseable> it = this.closeables.iterator();
        x.e(it, "iterator(...)");
        while (it.hasNext()) {
            OnBackPressedCallback$$ExternalSyntheticAutoCloseableDispatcher0.m(it.next());
        }
        this.closeables.clear();
        Iterator<OnBackPressedEventHandler> it2 = this.eventHandlers.iterator();
        while (it2.hasNext()) {
            it2.next().remove();
        }
        this.eventHandlers.clear();
    }

    public final void removeCloseable$activity(AutoCloseable autoCloseable) {
        x.f(autoCloseable, "closeable");
        this.closeables.remove(autoCloseable);
    }

    public final void setEnabled(boolean z) {
        this.isEnabled = z;
        for (OnBackPressedEventHandler onBackPressedEventHandler : this.eventHandlers) {
            boolean z2 = false;
            if (onBackPressedEventHandler.isLifecycleActive() && z) {
                z2 = true;
            }
            onBackPressedEventHandler.setBackEnabled(z2);
        }
    }

    public void handleOnBackCancelled() {
    }
}
