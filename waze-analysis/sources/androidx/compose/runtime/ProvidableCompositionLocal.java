package androidx.compose.runtime;

import h.g.a.a;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class ProvidableCompositionLocal<T> extends CompositionLocal<T> {
    public static final int $stable = 0;

    public ProvidableCompositionLocal(a<? extends T> aVar) {
        super(aVar, null);
    }

    private final ValueHolder<T> valueHolderOf(ProvidedValue<T> providedValue) {
        if (!providedValue.isDynamic$runtime()) {
            return providedValue.getCompute$runtime() != null ? new ComputedValueHolder(providedValue.getCompute$runtime()) : providedValue.getState$runtime() != null ? new DynamicValueHolder(providedValue.getState$runtime()) : new StaticValueHolder(providedValue.getEffectiveValue$runtime());
        }
        MutableState<T> state$runtime = providedValue.getState$runtime();
        if (state$runtime == null) {
            T value = providedValue.getValue();
            SnapshotMutationPolicy<T> mutationPolicy$runtime = providedValue.getMutationPolicy$runtime();
            if (mutationPolicy$runtime == null) {
                mutationPolicy$runtime = SnapshotStateKt.structuralEqualityPolicy();
            }
            state$runtime = SnapshotStateKt.mutableStateOf(value, mutationPolicy$runtime);
        }
        return new DynamicValueHolder(state$runtime);
    }

    public abstract ProvidedValue<T> defaultProvidedValue$runtime(T t);

    public final ProvidedValue<T> provides(T t) {
        return defaultProvidedValue$runtime(t);
    }

    public final ProvidedValue<T> providesComputed(l<? super CompositionLocalAccessorScope, ? extends T> lVar) {
        return new ProvidedValue<>(this, null, false, null, null, lVar, false);
    }

    public final ProvidedValue<T> providesDefault(T t) {
        return defaultProvidedValue$runtime(t).ifNotAlreadyProvided$runtime();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.CompositionLocal
    public ValueHolder<T> updatedStateOf$runtime(ProvidedValue<T> providedValue, ValueHolder<T> valueHolder) {
        DynamicValueHolder dynamicValueHolder = null;
        if (valueHolder instanceof DynamicValueHolder) {
            if (providedValue.isDynamic$runtime()) {
                dynamicValueHolder = (DynamicValueHolder) valueHolder;
                dynamicValueHolder.getState().setValue(providedValue.getEffectiveValue$runtime());
            }
            dynamicValueHolder = dynamicValueHolder;
        } else if (valueHolder instanceof StaticValueHolder) {
            if (providedValue.isStatic$runtime()) {
                StaticValueHolder staticValueHolder = (StaticValueHolder) valueHolder;
                if (x.n(providedValue.getEffectiveValue$runtime(), staticValueHolder.getValue())) {
                    dynamicValueHolder = staticValueHolder;
                }
            }
            dynamicValueHolder = dynamicValueHolder;
        } else if (valueHolder instanceof ComputedValueHolder) {
            ComputedValueHolder computedValueHolder = (ComputedValueHolder) valueHolder;
            if (providedValue.getCompute$runtime() == computedValueHolder.getCompute()) {
                dynamicValueHolder = computedValueHolder;
            }
            dynamicValueHolder = dynamicValueHolder;
        }
        return dynamicValueHolder == null ? valueHolderOf(providedValue) : dynamicValueHolder;
    }
}
