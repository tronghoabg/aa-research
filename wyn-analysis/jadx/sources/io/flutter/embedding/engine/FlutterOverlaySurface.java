package io.flutter.embedding.engine;

import android.view.Surface;
import androidx.annotation.Keep;

@Keep
/* loaded from: classes5.dex */
public class FlutterOverlaySurface {

    /* renamed from: id, reason: collision with root package name */
    private final int f36968id;
    private final Surface surface;

    public FlutterOverlaySurface(int i5, Surface surface) {
        this.f36968id = i5;
        this.surface = surface;
    }

    public int getId() {
        return this.f36968id;
    }

    public Surface getSurface() {
        return this.surface;
    }
}
