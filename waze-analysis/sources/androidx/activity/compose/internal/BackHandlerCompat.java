package androidx.activity.compose.internal;

import androidx.activity.BackEventCompat;
import androidx.activity.OnBackPressedCallback;
import androidx.navigationevent.NavigationEvent;
import androidx.navigationevent.NavigationEventHandler;
import androidx.navigationevent.NavigationEventInfo;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class BackHandlerCompat {
    public static final int $stable = 8;
    private final NavigationEventInfo info;
    private final NavigationEventHandler<NavigationEventInfo> navigationEventHandler;
    private final OnBackPressedCallback onBackPressedCallback = new OnBackPressedCallback() { // from class: androidx.activity.compose.internal.BackHandlerCompat$onBackPressedCallback$1
        {
            super(false);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackCancelled() {
            this.this$0.onBackCancelled();
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            this.this$0.onBackCompleted();
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackProgressed(BackEventCompat backEventCompat) {
            this.this$0.onBackProgressed(backEventCompat);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackStarted(BackEventCompat backEventCompat) {
            this.this$0.onBackStarted(backEventCompat);
        }
    };

    public BackHandlerCompat(final NavigationEventInfo navigationEventInfo) {
        this.info = navigationEventInfo;
        this.navigationEventHandler = new NavigationEventHandler<NavigationEventInfo>(navigationEventInfo) { // from class: androidx.activity.compose.internal.BackHandlerCompat$navigationEventHandler$1
            @Override // androidx.navigationevent.NavigationEventHandler
            protected void onBackCancelled() {
                this.this$0.onBackCancelled();
            }

            @Override // androidx.navigationevent.NavigationEventHandler
            protected void onBackCompleted() {
                this.this$0.onBackCompleted();
            }

            @Override // androidx.navigationevent.NavigationEventHandler
            protected void onBackProgressed(NavigationEvent navigationEvent) {
                this.this$0.onBackProgressed(new BackEventCompat(navigationEvent));
            }

            @Override // androidx.navigationevent.NavigationEventHandler
            protected void onBackStarted(NavigationEvent navigationEvent) {
                this.this$0.onBackStarted(new BackEventCompat(navigationEvent));
            }
        };
    }

    public final NavigationEventInfo getInfo() {
        return this.info;
    }

    public final NavigationEventHandler<NavigationEventInfo> getNavigationEventHandler() {
        return this.navigationEventHandler;
    }

    public final OnBackPressedCallback getOnBackPressedCallback() {
        return this.onBackPressedCallback;
    }

    public boolean isBackEnabled() {
        return this.onBackPressedCallback.isEnabled() && this.navigationEventHandler.isBackEnabled();
    }

    public abstract void onBackCompleted();

    public void setBackEnabled(boolean z) {
        this.onBackPressedCallback.setEnabled(z);
        this.navigationEventHandler.setBackEnabled(z);
    }

    public void onBackCancelled() {
    }

    public void onBackProgressed(BackEventCompat backEventCompat) {
    }

    public void onBackStarted(BackEventCompat backEventCompat) {
    }
}
