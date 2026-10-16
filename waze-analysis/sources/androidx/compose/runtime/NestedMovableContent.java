package androidx.compose.runtime;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class NestedMovableContent {
    private final MovableContentStateReference container;
    private final MovableContentStateReference content;

    public NestedMovableContent(MovableContentStateReference movableContentStateReference, MovableContentStateReference movableContentStateReference2) {
        this.content = movableContentStateReference;
        this.container = movableContentStateReference2;
    }

    public final MovableContentStateReference getContainer() {
        return this.container;
    }

    public final MovableContentStateReference getContent() {
        return this.content;
    }
}
