package androidx.camera.view;

import androidx.arch.core.util.Function;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Pair;
import com.google.d.m.a.bm;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
class PendingValue<T> {
    private Pair<CallbackToFutureAdapter.Completer<Void>, T> mCompleterAndValue;

    PendingValue() {
    }

    /* renamed from: lambda$setValue$0$androidx-camera-view-PendingValue, reason: not valid java name */
    /* synthetic */ Object m1528lambda$setValue$0$androidxcameraviewPendingValue(Object obj, CallbackToFutureAdapter.Completer completer) {
        Pair<CallbackToFutureAdapter.Completer<Void>, T> pair = this.mCompleterAndValue;
        if (pair != null) {
            ((CallbackToFutureAdapter.Completer) Objects.requireNonNull(pair.first)).setCancelled();
        }
        this.mCompleterAndValue = new Pair<>(completer, obj);
        java.util.Objects.toString(obj);
        return "PendingValue ".concat(String.valueOf(obj));
    }

    void propagateIfHasValue(Function<T, bm<Void>> function) {
        Threads.checkMainThread();
        Pair<CallbackToFutureAdapter.Completer<Void>, T> pair = this.mCompleterAndValue;
        if (pair != null) {
            Futures.propagate(function.apply(pair.second), (CallbackToFutureAdapter.Completer) Objects.requireNonNull(this.mCompleterAndValue.first));
            this.mCompleterAndValue = null;
        }
    }

    bm<Void> setValue(final T t) {
        Threads.checkMainThread();
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.view.PendingValue$$ExternalSyntheticLambda0
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return this.f$0.m1528lambda$setValue$0$androidxcameraviewPendingValue(t, completer);
            }
        });
    }
}
