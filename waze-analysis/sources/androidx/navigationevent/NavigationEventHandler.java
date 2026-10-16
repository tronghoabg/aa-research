package androidx.navigationevent;

import androidx.core.app.NotificationCompat;
import androidx.navigationevent.NavigationEventInfo;
import androidx.navigationevent.NavigationEventTransitionState;
import h.a.i;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class NavigationEventHandler<T extends NavigationEventInfo> {
    private List<? extends T> backInfo;
    private T currentInfo;
    private NavigationEventDispatcher dispatcher;
    private List<? extends T> forwardInfo;
    private boolean isBackEnabled;
    private boolean isForwardEnabled;
    private NavigationEventTransitionState transitionState;

    public NavigationEventHandler(T t, boolean z, boolean z2) {
        x.f(t, "initialInfo");
        this.currentInfo = t;
        this.backInfo = i.h();
        this.forwardInfo = i.h();
        this.transitionState = NavigationEventTransitionState.Idle.INSTANCE;
        this.isBackEnabled = z;
        this.isForwardEnabled = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setInfo$default(NavigationEventHandler navigationEventHandler, NavigationEventInfo navigationEventInfo, List list, List list2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setInfo");
        }
        if ((i2 & 2) != 0) {
            list = i.h();
        }
        if ((i2 & 4) != 0) {
            list2 = i.h();
        }
        navigationEventHandler.setInfo(navigationEventInfo, list, list2);
    }

    public final void doOnBackCancelled$navigationevent() {
        this.transitionState = NavigationEventTransitionState.Idle.INSTANCE;
        onBackCancelled();
    }

    public final void doOnBackCompleted$navigationevent() {
        this.transitionState = NavigationEventTransitionState.Idle.INSTANCE;
        onBackCompleted();
    }

    public final void doOnBackProgressed$navigationevent(NavigationEvent navigationEvent) {
        x.f(navigationEvent, NotificationCompat.CATEGORY_EVENT);
        this.transitionState = new NavigationEventTransitionState.InProgress(navigationEvent, -1);
        onBackProgressed(navigationEvent);
    }

    public final void doOnBackStarted$navigationevent(NavigationEvent navigationEvent) {
        x.f(navigationEvent, NotificationCompat.CATEGORY_EVENT);
        this.transitionState = new NavigationEventTransitionState.InProgress(navigationEvent, -1);
        onBackStarted(navigationEvent);
    }

    public final void doOnForwardCancelled$navigationevent() {
        this.transitionState = NavigationEventTransitionState.Idle.INSTANCE;
        onForwardCancelled();
    }

    public final void doOnForwardCompleted$navigationevent() {
        this.transitionState = NavigationEventTransitionState.Idle.INSTANCE;
        onForwardCompleted();
    }

    public final void doOnForwardProgressed$navigationevent(NavigationEvent navigationEvent) {
        x.f(navigationEvent, NotificationCompat.CATEGORY_EVENT);
        this.transitionState = new NavigationEventTransitionState.InProgress(navigationEvent, 1);
        onForwardProgressed(navigationEvent);
    }

    public final void doOnForwardStarted$navigationevent(NavigationEvent navigationEvent) {
        x.f(navigationEvent, NotificationCompat.CATEGORY_EVENT);
        this.transitionState = new NavigationEventTransitionState.InProgress(navigationEvent, 1);
        onForwardStarted(navigationEvent);
    }

    public final List<T> getBackInfo() {
        return this.backInfo;
    }

    public final T getCurrentInfo() {
        return this.currentInfo;
    }

    public final NavigationEventDispatcher getDispatcher$navigationevent() {
        return this.dispatcher;
    }

    public final List<T> getForwardInfo() {
        return this.forwardInfo;
    }

    public final NavigationEventTransitionState getTransitionState() {
        return this.transitionState;
    }

    public final boolean isBackEnabled() {
        NavigationEventDispatcher navigationEventDispatcher = this.dispatcher;
        if (navigationEventDispatcher == null || navigationEventDispatcher.isEnabled()) {
            return this.isBackEnabled;
        }
        return false;
    }

    public final boolean isForwardEnabled() {
        NavigationEventDispatcher navigationEventDispatcher = this.dispatcher;
        if (navigationEventDispatcher == null || navigationEventDispatcher.isEnabled()) {
            return this.isForwardEnabled;
        }
        return false;
    }

    protected void onBackCancelled() {
    }

    protected void onBackCompleted() {
        throw new UnsupportedOperationException("A handler that receives a 'backCompleted' event must override 'onBackCompleted()' to handle the callback.");
    }

    protected void onBackProgressed(NavigationEvent navigationEvent) {
        x.f(navigationEvent, NotificationCompat.CATEGORY_EVENT);
    }

    protected void onBackStarted(NavigationEvent navigationEvent) {
        x.f(navigationEvent, NotificationCompat.CATEGORY_EVENT);
    }

    protected void onForwardCancelled() {
    }

    protected void onForwardCompleted() {
        throw new UnsupportedOperationException("A handler that receives a 'forwardCompleted' event must override 'onForwardCompleted()' to handle the callback.");
    }

    protected void onForwardProgressed(NavigationEvent navigationEvent) {
        x.f(navigationEvent, NotificationCompat.CATEGORY_EVENT);
    }

    protected void onForwardStarted(NavigationEvent navigationEvent) {
        x.f(navigationEvent, NotificationCompat.CATEGORY_EVENT);
    }

    public final void remove() {
        NavigationEventDispatcher navigationEventDispatcher = this.dispatcher;
        if (navigationEventDispatcher != null) {
            navigationEventDispatcher.removeHandler$navigationevent(this);
        }
    }

    public final void setBackEnabled(boolean z) {
        NavigationEventProcessor sharedProcessor$navigationevent;
        if (this.isBackEnabled == z) {
            return;
        }
        this.isBackEnabled = z;
        NavigationEventDispatcher navigationEventDispatcher = this.dispatcher;
        if (navigationEventDispatcher == null || (sharedProcessor$navigationevent = navigationEventDispatcher.getSharedProcessor$navigationevent()) == null) {
            return;
        }
        sharedProcessor$navigationevent.refreshEnabledHandlers();
    }

    public final void setDispatcher$navigationevent(NavigationEventDispatcher navigationEventDispatcher) {
        this.dispatcher = navigationEventDispatcher;
    }

    public final void setForwardEnabled(boolean z) {
        NavigationEventProcessor sharedProcessor$navigationevent;
        if (this.isForwardEnabled == z) {
            return;
        }
        this.isForwardEnabled = z;
        NavigationEventDispatcher navigationEventDispatcher = this.dispatcher;
        if (navigationEventDispatcher == null || (sharedProcessor$navigationevent = navigationEventDispatcher.getSharedProcessor$navigationevent()) == null) {
            return;
        }
        sharedProcessor$navigationevent.refreshEnabledHandlers();
    }

    public final void setInfo(T t, List<? extends T> list, List<? extends T> list2) {
        NavigationEventProcessor sharedProcessor$navigationevent;
        x.f(t, "currentInfo");
        x.f(list, "backInfo");
        x.f(list2, "forwardInfo");
        this.currentInfo = t;
        this.backInfo = list;
        this.forwardInfo = list2;
        NavigationEventDispatcher navigationEventDispatcher = this.dispatcher;
        if (navigationEventDispatcher == null || (sharedProcessor$navigationevent = navigationEventDispatcher.getSharedProcessor$navigationevent()) == null) {
            return;
        }
        sharedProcessor$navigationevent.updateEnabledHandlerInfo$navigationevent(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavigationEventHandler(T t, boolean z) {
        this(t, z, false);
        x.f(t, "initialInfo");
    }

    public final void setInfo(T t, List<? extends T> list) {
        x.f(t, "currentInfo");
        x.f(list, "backInfo");
        setInfo$default(this, t, list, null, 4, null);
    }

    public final void setInfo(T t) {
        x.f(t, "currentInfo");
        setInfo$default(this, t, null, null, 6, null);
    }
}
