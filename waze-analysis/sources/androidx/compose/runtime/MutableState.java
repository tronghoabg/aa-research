package androidx.compose.runtime;

import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface MutableState<T> extends State<T> {
    T component1();

    l<T, ab> component2();

    @Override // androidx.compose.runtime.State
    T getValue();

    void setValue(T t);
}
