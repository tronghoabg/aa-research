package androidx.core.os;

import android.os.Bundle;
import androidx.core.os.ProfilingRequestBuilder;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public abstract class ProfilingRequestBuilder<T extends ProfilingRequestBuilder<T>> {
    private android.os.CancellationSignal mCancellationSignal;
    private String mTag;

    public final ProfilingRequest build() {
        return new ProfilingRequest(getProfilingType(), getParams(), this.mTag, this.mCancellationSignal);
    }

    protected abstract Bundle getParams();

    protected abstract int getProfilingType();

    protected abstract T getThis();

    public final T setCancellationSignal(android.os.CancellationSignal cancellationSignal) {
        x.f(cancellationSignal, "cancellationSignal");
        this.mCancellationSignal = cancellationSignal;
        return (T) getThis();
    }

    public final T setTag(String str) {
        x.f(str, "tag");
        this.mTag = str;
        return (T) getThis();
    }
}
