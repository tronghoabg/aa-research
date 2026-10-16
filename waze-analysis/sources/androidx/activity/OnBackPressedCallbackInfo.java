package androidx.activity;

import androidx.lifecycle.LifecycleOwner;
import androidx.navigationevent.NavigationEventInfo;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class OnBackPressedCallbackInfo extends NavigationEventInfo {
    private final OnBackPressedCallback callback;
    private final LifecycleOwner owner;

    public OnBackPressedCallbackInfo(OnBackPressedCallback onBackPressedCallback, LifecycleOwner lifecycleOwner) {
        x.f(onBackPressedCallback, "callback");
        this.callback = onBackPressedCallback;
        this.owner = lifecycleOwner;
    }

    public static /* synthetic */ OnBackPressedCallbackInfo copy$default(OnBackPressedCallbackInfo onBackPressedCallbackInfo, OnBackPressedCallback onBackPressedCallback, LifecycleOwner lifecycleOwner, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            onBackPressedCallback = onBackPressedCallbackInfo.callback;
        }
        if ((i2 & 2) != 0) {
            lifecycleOwner = onBackPressedCallbackInfo.owner;
        }
        return onBackPressedCallbackInfo.copy(onBackPressedCallback, lifecycleOwner);
    }

    public final OnBackPressedCallback component1() {
        return this.callback;
    }

    public final LifecycleOwner component2() {
        return this.owner;
    }

    public final OnBackPressedCallbackInfo copy(OnBackPressedCallback onBackPressedCallback, LifecycleOwner lifecycleOwner) {
        x.f(onBackPressedCallback, "callback");
        return new OnBackPressedCallbackInfo(onBackPressedCallback, lifecycleOwner);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnBackPressedCallbackInfo)) {
            return false;
        }
        OnBackPressedCallbackInfo onBackPressedCallbackInfo = (OnBackPressedCallbackInfo) obj;
        return x.n(this.callback, onBackPressedCallbackInfo.callback) && x.n(this.owner, onBackPressedCallbackInfo.owner);
    }

    public final OnBackPressedCallback getCallback() {
        return this.callback;
    }

    public final LifecycleOwner getOwner() {
        return this.owner;
    }

    public int hashCode() {
        int iHashCode = this.callback.hashCode() * 31;
        LifecycleOwner lifecycleOwner = this.owner;
        return iHashCode + (lifecycleOwner == null ? 0 : lifecycleOwner.hashCode());
    }

    public String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.callback + ", owner=" + this.owner + ")";
    }

    public /* synthetic */ OnBackPressedCallbackInfo(OnBackPressedCallback onBackPressedCallback, LifecycleOwner lifecycleOwner, int i2, o oVar) {
        this(onBackPressedCallback, (i2 & 2) != 0 ? null : lifecycleOwner);
    }
}
