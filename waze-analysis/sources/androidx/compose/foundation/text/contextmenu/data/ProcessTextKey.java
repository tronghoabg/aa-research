package androidx.compose.foundation.text.contextmenu.data;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ProcessTextKey {
    public static final int $stable = 0;
    private final int id;

    public ProcessTextKey(int i2) {
        this.id = i2;
    }

    public boolean equals(Object obj) {
        return (obj instanceof ProcessTextKey) && this.id == ((ProcessTextKey) obj).id;
    }

    public final int getId() {
        return this.id;
    }

    public int hashCode() {
        return this.id;
    }
}
