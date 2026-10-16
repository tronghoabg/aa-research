package androidx.camera.core.impl.utils;

import androidx.arch.core.util.Function;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class RedirectableLiveData<T> extends MappingRedirectableLiveData<T, T> {
    private final T initialValue;

    public RedirectableLiveData(T t) {
        super(t, new Function() { // from class: androidx.camera.core.impl.utils.RedirectableLiveData$$ExternalSyntheticLambda0
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return obj;
            }
        });
        this.initialValue = t;
    }

    static final Object _init_$lambda$0(Object obj) {
        return obj;
    }
}
