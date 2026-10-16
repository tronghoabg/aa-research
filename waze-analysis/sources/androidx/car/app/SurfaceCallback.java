package androidx.car.app;

import android.graphics.Rect;
import androidx.car.app.annotations.RequiresCarApi;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface SurfaceCallback {
    @RequiresCarApi(5)
    void onClick(float f2, float f3);

    @RequiresCarApi(2)
    void onFling(float f2, float f3);

    @RequiresCarApi(2)
    void onScale(float f2, float f3, float f4);

    @RequiresCarApi(2)
    void onScroll(float f2, float f3);

    void onStableAreaChanged(Rect rect);

    void onSurfaceAvailable(SurfaceContainer surfaceContainer);

    void onSurfaceDestroyed(SurfaceContainer surfaceContainer);

    void onVisibleAreaChanged(Rect rect);

    /* compiled from: WazeSource */
    /* renamed from: androidx.car.app.SurfaceCallback$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$onStableAreaChanged(SurfaceCallback surfaceCallback, Rect rect) {
        }

        public static void $default$onSurfaceAvailable(SurfaceCallback surfaceCallback, SurfaceContainer surfaceContainer) {
        }

        public static void $default$onSurfaceDestroyed(SurfaceCallback surfaceCallback, SurfaceContainer surfaceContainer) {
        }

        public static void $default$onVisibleAreaChanged(SurfaceCallback surfaceCallback, Rect rect) {
        }

        @RequiresCarApi(5)
        public static void $default$onClick(SurfaceCallback surfaceCallback, float f2, float f3) {
        }

        @RequiresCarApi(2)
        public static void $default$onFling(SurfaceCallback surfaceCallback, float f2, float f3) {
        }

        @RequiresCarApi(2)
        public static void $default$onScroll(SurfaceCallback surfaceCallback, float f2, float f3) {
        }

        @RequiresCarApi(2)
        public static void $default$onScale(SurfaceCallback surfaceCallback, float f2, float f3, float f4) {
        }
    }
}
