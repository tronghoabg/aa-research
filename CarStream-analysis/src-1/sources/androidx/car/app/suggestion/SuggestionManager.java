package androidx.car.app.suggestion;

import androidx.car.app.CarContext;
import androidx.car.app.HostDispatcher;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.managers.Manager;
import androidx.car.app.serialization.Bundleable;
import androidx.car.app.serialization.BundlerException;
import androidx.car.app.suggestion.model.Suggestion;
import androidx.car.app.utils.ThreadUtils;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import defpackage.s0;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@RequiresCarApi(5)
/* loaded from: classes.dex */
public class SuggestionManager implements Manager {
    private final HostDispatcher mHostDispatcher;

    public SuggestionManager(CarContext carContext, HostDispatcher hostDispatcher, final Lifecycle lifecycle) {
        Objects.requireNonNull(carContext);
        Objects.requireNonNull(hostDispatcher);
        this.mHostDispatcher = hostDispatcher;
        lifecycle.addObserver(new DefaultLifecycleObserver() { // from class: androidx.car.app.suggestion.SuggestionManager.1
            @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
            public void onDestroy(LifecycleOwner lifecycleOwner) {
                lifecycle.removeObserver(this);
            }
        });
    }

    public static SuggestionManager create(CarContext carContext, HostDispatcher hostDispatcher, Lifecycle lifecycle) {
        Objects.requireNonNull(carContext);
        Objects.requireNonNull(hostDispatcher);
        Objects.requireNonNull(lifecycle);
        return new SuggestionManager(carContext, hostDispatcher, lifecycle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$updateSuggestions$0(Bundleable bundleable, ISuggestionHost iSuggestionHost) {
        iSuggestionHost.updateSuggestions(bundleable);
        return null;
    }

    public void updateSuggestions(List<Suggestion> list) {
        ThreadUtils.checkMainThread();
        try {
            this.mHostDispatcher.dispatch(CarContext.SUGGESTION_SERVICE, "updateSuggestions", new s0(Bundleable.create(list), 3));
        } catch (BundlerException e) {
            throw new IllegalArgumentException("Serialization failure", e);
        }
    }
}
