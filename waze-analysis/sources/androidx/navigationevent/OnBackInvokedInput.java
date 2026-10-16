package androidx.navigationevent;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.a.a.a.a$$ExternalSyntheticApiModelOutline0;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class OnBackInvokedInput extends NavigationEventInput {
    private boolean backInvokedCallbackRegistered;
    private final OnBackInvokedCallback onBackInvokedCallback;
    private final int onBackInvokedCallbackPriority;
    private final OnBackInvokedDispatcher onBackInvokedDispatcher;

    private OnBackInvokedInput(OnBackInvokedDispatcher onBackInvokedDispatcher, int i2) {
        this.onBackInvokedDispatcher = onBackInvokedDispatcher;
        this.onBackInvokedCallbackPriority = i2;
        this.onBackInvokedCallback = Build.VERSION.SDK_INT == 33 ? new OnBackInvokedCallback() { // from class: androidx.navigationevent.OnBackInvokedInput$$ExternalSyntheticLambda0
            public final void onBackInvoked() {
                this.f$0.dispatchOnBackCompleted();
            }
        } : createOnBackAnimationCallback();
    }

    private final OnBackInvokedCallback createOnBackAnimationCallback() {
        return a$$ExternalSyntheticApiModelOutline0.m13487m((Object) new OnBackAnimationCallback() { // from class: androidx.navigationevent.OnBackInvokedInput.createOnBackAnimationCallback.1
            public void onBackCancelled() {
                OnBackInvokedInput.this.dispatchOnBackCancelled();
            }

            public void onBackInvoked() {
                OnBackInvokedInput.this.dispatchOnBackCompleted();
            }

            public void onBackProgressed(BackEvent backEvent) {
                x.f(backEvent, "backEvent");
                OnBackInvokedInput.this.dispatchOnBackProgressed(NavigationEventKt.toNavigationEvent(backEvent));
            }

            public void onBackStarted(BackEvent backEvent) {
                x.f(backEvent, "backEvent");
                OnBackInvokedInput.this.dispatchOnBackStarted(NavigationEventKt.toNavigationEvent(backEvent));
            }
        });
    }

    private final void updateBackInvokedCallbackState(boolean z) {
        boolean z2 = this.backInvokedCallbackRegistered;
        if (z) {
            if (z2) {
                return;
            }
            this.onBackInvokedDispatcher.registerOnBackInvokedCallback(this.onBackInvokedCallbackPriority, this.onBackInvokedCallback);
            this.backInvokedCallbackRegistered = true;
            return;
        }
        if (z2) {
            this.onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.onBackInvokedCallback);
            this.backInvokedCallbackRegistered = false;
        }
    }

    @Override // androidx.navigationevent.NavigationEventInput
    protected void onHasEnabledHandlersChanged(boolean z) {
        updateBackInvokedCallbackState(z);
    }

    @Override // androidx.navigationevent.NavigationEventInput
    protected void onRemoved() {
        updateBackInvokedCallbackState(false);
    }

    public /* synthetic */ OnBackInvokedInput(OnBackInvokedDispatcher onBackInvokedDispatcher, int i2, o oVar) {
        this(onBackInvokedDispatcher, i2);
    }
}
