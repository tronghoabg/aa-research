package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface TwoWayConverter<T, V extends AnimationVector> {
    l<V, T> getConvertFromVector();

    l<T, V> getConvertToVector();
}
