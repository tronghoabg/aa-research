package androidx.camera.core.processing;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface Node<I, O> {
    void release();

    O transform(I i2);
}
