package androidx.compose.foundation.gestures;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface DraggableAnchors<T> {
    T anchorAt(int i2);

    T closestAnchor(float f2);

    T closestAnchor(float f2, boolean z);

    int getSize();

    boolean hasPositionFor(T t);

    float maxPosition();

    float minPosition();

    float positionAt(int i2);

    float positionOf(T t);
}
