package io.flutter.view;

import android.view.Surface;
import androidx.annotation.Keep;

@Keep
/* loaded from: classes5.dex */
public interface TextureRegistry$SurfaceProducer {
    Surface getForcedNewSurface();

    int getHeight();

    Surface getSurface();

    int getWidth();

    boolean handlesCropAndRotation();

    /* synthetic */ long id();

    /* synthetic */ void release();

    void scheduleFrame();

    void setCallback(q qVar);

    void setSize(int i5, int i10);
}
