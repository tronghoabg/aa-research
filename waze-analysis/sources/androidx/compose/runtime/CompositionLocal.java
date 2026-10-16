package androidx.compose.runtime;

import h.g.a.a;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class CompositionLocal<T> {
    public static final int $stable = 0;
    private final ValueHolder<T> defaultValueHolder;

    private CompositionLocal(a<? extends T> aVar) {
        this.defaultValueHolder = new LazyValueHolder(aVar);
    }

    public final T getCurrent(Composer composer, int i2) {
        return (T) composer.consume(this);
    }

    public ValueHolder<T> getDefaultValueHolder$runtime() {
        return this.defaultValueHolder;
    }

    public abstract ValueHolder<T> updatedStateOf$runtime(ProvidedValue<T> providedValue, ValueHolder<T> valueHolder);

    public /* synthetic */ CompositionLocal(a aVar, o oVar) {
        this(aVar);
    }

    public static /* synthetic */ void getCurrent$annotations(Composer composer, int i2) {
    }
}
