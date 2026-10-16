package androidx.car.app.suggestion;

import androidx.car.app.CarContext;
import androidx.car.app.HostCall;
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
import h.g.b.x;
import j$.util.Objects;
import java.util.List;

/* compiled from: WazeSource */
@RequiresCarApi(5)
/* loaded from: classes2.dex */
public class SuggestionManager implements Manager {
    private final HostDispatcher mHostDispatcher;

    protected SuggestionManager(CarContext carContext, HostDispatcher hostDispatcher, final Lifecycle lifecycle) {
        Objects.requireNonNull(carContext);
        this.mHostDispatcher = (HostDispatcher) Objects.requireNonNull(hostDispatcher);
        lifecycle.addObserver(new DefaultLifecycleObserver() { // from class: androidx.car.app.suggestion.SuggestionManager.1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
                x.f(lifecycleOwner, "owner");
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(LifecycleOwner lifecycleOwner) {
                lifecycle.removeObserver(this);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
                x.f(lifecycleOwner, "owner");
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
                x.f(lifecycleOwner, "owner");
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
                x.f(lifecycleOwner, "owner");
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
                x.f(lifecycleOwner, "owner");
            }
        });
    }

    public static SuggestionManager create(CarContext carContext, HostDispatcher hostDispatcher, Lifecycle lifecycle) {
        Objects.requireNonNull(carContext);
        Objects.requireNonNull(hostDispatcher);
        Objects.requireNonNull(lifecycle);
        return new SuggestionManager(carContext, hostDispatcher, lifecycle);
    }

    static /* synthetic */ Object lambda$updateSuggestions$0(Bundleable bundleable, ISuggestionHost iSuggestionHost) {
        iSuggestionHost.updateSuggestions(bundleable);
        return null;
    }

    public void updateSuggestions(List<Suggestion> list) {
        ThreadUtils.checkMainThread();
        try {
            final Bundleable bundleableCreate = Bundleable.create(list);
            this.mHostDispatcher.dispatch(CarContext.SUGGESTION_SERVICE, "updateSuggestions", new HostCall() { // from class: androidx.car.app.suggestion.SuggestionManager$$ExternalSyntheticLambda0
                @Override // androidx.car.app.HostCall
                public final Object dispatch(Object obj) {
                    SuggestionManager.lambda$updateSuggestions$0(bundleableCreate, (ISuggestionHost) obj);
                    return null;
                }
            });
        } catch (BundlerException e2) {
            throw new IllegalArgumentException("Serialization failure", e2);
        }
    }
}
