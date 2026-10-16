package androidx.compose.material;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface DraggableAnchors<T> {
    T closestAnchor(float f2);

    T closestAnchor(float f2, boolean z);

    int getSize();

    boolean hasAnchorFor(T t);

    float maxAnchor();

    float minAnchor();

    float positionOf(T t);
}
