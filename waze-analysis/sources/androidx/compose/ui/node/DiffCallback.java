package androidx.compose.ui.node;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface DiffCallback {
    boolean areItemsTheSame(int i2, int i3);

    void insert(int i2);

    void remove(int i2, int i3);

    void same(int i2, int i3);
}
