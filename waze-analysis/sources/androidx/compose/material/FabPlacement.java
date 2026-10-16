package androidx.compose.material;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class FabPlacement {
    public static final int $stable = 0;
    private final int height;
    private final boolean isDocked;
    private final int left;
    private final int width;

    public FabPlacement(boolean z, int i2, int i3, int i4) {
        this.isDocked = z;
        this.left = i2;
        this.width = i3;
        this.height = i4;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getLeft() {
        return this.left;
    }

    public final int getWidth() {
        return this.width;
    }

    public final boolean isDocked() {
        return this.isDocked;
    }
}
