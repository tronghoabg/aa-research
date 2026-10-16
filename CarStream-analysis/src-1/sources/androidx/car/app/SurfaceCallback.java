package androidx.car.app;

import android.graphics.Rect;
import androidx.car.app.annotations.RequiresCarApi;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public interface SurfaceCallback {
    default void onStableAreaChanged(Rect rect) {
    }

    default void onSurfaceAvailable(SurfaceContainer surfaceContainer) {
    }

    default void onSurfaceDestroyed(SurfaceContainer surfaceContainer) {
    }

    default void onVisibleAreaChanged(Rect rect) {
    }

    @RequiresCarApi(5)
    default void onClick(float f, float f2) {
    }

    @RequiresCarApi(2)
    default void onFling(float f, float f2) {
    }

    @RequiresCarApi(2)
    default void onScroll(float f, float f2) {
    }

    @RequiresCarApi(2)
    default void onScale(float f, float f2, float f3) {
    }
}
