package androidx.compose.runtime.saveable;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface Saver<Original, Saveable> {
    Original restore(Saveable saveable);

    Saveable save(SaverScope saverScope, Original original);
}
