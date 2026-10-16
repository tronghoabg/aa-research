package androidx.navigationevent;

import androidx.core.app.NotificationCompat;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class DirectNavigationEventInput extends NavigationEventInput {
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

    public final void forwardCancelled() {
        dispatchOnForwardCancelled();
    }

    public final void forwardCompleted() {
        dispatchOnForwardCompleted();
    }

    public final void forwardProgressed(NavigationEvent navigationEvent) {
        x.f(navigationEvent, NotificationCompat.CATEGORY_EVENT);
        dispatchOnForwardProgressed(navigationEvent);
    }

    public final void forwardStarted(NavigationEvent navigationEvent) {
        x.f(navigationEvent, NotificationCompat.CATEGORY_EVENT);
        dispatchOnForwardStarted(navigationEvent);
    }
}
