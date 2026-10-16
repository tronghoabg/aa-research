package androidx.compose.runtime;

import h.e;
import h.g.a.a;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ComputedProvidableCompositionLocal<T> extends ProvidableCompositionLocal<T> {
    public static final int $stable = 0;
    private final ComputedValueHolder<T> defaultValueHolder;

    public ComputedProvidableCompositionLocal(l<? super CompositionLocalAccessorScope, ? extends T> lVar) {
        super(new a() { // from class: androidx.compose.runtime.ComputedProvidableCompositionLocal$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return ComputedProvidableCompositionLocal._init_$lambda$0();
            }
        });
        this.defaultValueHolder = new ComputedValueHolder<>(lVar);
    }

    static final Object _init_$lambda$0() {
        ComposerKt.composeRuntimeError("Unexpected call to default provider");
        throw new e();
    }

    @Override // androidx.compose.runtime.ProvidableCompositionLocal
    public ProvidedValue<T> defaultProvidedValue$runtime(T t) {
        return new ProvidedValue<>(this, t, t == null, null, null, null, true);
    }

    @Override // androidx.compose.runtime.CompositionLocal
    public ComputedValueHolder<T> getDefaultValueHolder$runtime() {
        return this.defaultValueHolder;
    }
}
