package androidx.camera.video.internal;

import androidx.camera.core.impl.Observable;
import com.google.d.m.a.bm;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface BufferProvider<T> extends Observable<State> {

    /* compiled from: WazeSource */
    public enum State {
        ACTIVE,
        INACTIVE
    }

    bm<T> acquireBuffer();
}
