package androidx.compose.runtime;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface ValueHolder<T> {
    T readValue(PersistentCompositionLocalMap persistentCompositionLocalMap);

    ProvidedValue<T> toProvided(CompositionLocal<T> compositionLocal);
}
