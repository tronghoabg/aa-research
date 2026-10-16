package io.flutter.plugin.platform;

import android.view.Surface;

/* loaded from: classes5.dex */
public interface g {
    void a(int i5, int i10);

    int getHeight();

    long getId();

    Surface getSurface();

    int getWidth();

    void release();

    void scheduleFrame();
}
