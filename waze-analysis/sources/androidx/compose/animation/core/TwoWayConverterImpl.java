package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class TwoWayConverterImpl<T, V extends AnimationVector> implements TwoWayConverter<T, V> {
    private final l<V, T> convertFromVector;
    private final l<T, V> convertToVector;

    /* JADX WARN: Multi-variable type inference failed */
    public TwoWayConverterImpl(l<? super T, ? extends V> lVar, l<? super V, ? extends T> lVar2) {
        this.convertToVector = lVar;
        this.convertFromVector = lVar2;
    }

    @Override // androidx.compose.animation.core.TwoWayConverter
    public l<V, T> getConvertFromVector() {
        return this.convertFromVector;
    }

    @Override // androidx.compose.animation.core.TwoWayConverter
    public l<T, V> getConvertToVector() {
        return this.convertToVector;
    }
}
