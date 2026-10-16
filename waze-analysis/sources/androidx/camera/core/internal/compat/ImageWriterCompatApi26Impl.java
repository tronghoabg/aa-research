package androidx.camera.core.internal.compat;

import android.media.ImageWriter;
import android.util.Log;
import android.view.Surface;
import androidx.core.util.Preconditions;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class ImageWriterCompatApi26Impl {
    private static final String TAG = "ImageWriterCompatApi26";
    private static Method sNewInstanceMethod;

    static {
        try {
            Class cls = Integer.TYPE;
            sNewInstanceMethod = ImageWriter.class.getMethod("newInstance", Surface.class, cls, cls);
        } catch (NoSuchMethodException e2) {
            Log.i(TAG, "Unable to initialize via reflection.", e2);
        }
    }

    private ImageWriterCompatApi26Impl() {
    }

    static ImageWriter newInstance(Surface surface, int i2, int i3) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            try {
                Object objInvoke = sNewInstanceMethod.invoke(null, surface, Integer.valueOf(i2), Integer.valueOf(i3));
                Preconditions.checkNotNull(objInvoke);
                return (ImageWriter) objInvoke;
            } catch (InvocationTargetException e2) {
                e = e2;
                throw new RuntimeException("Unable to invoke newInstance(Surface, int, int) via reflection.", e);
            }
        } catch (IllegalAccessException | InvocationTargetException e3) {
            e = e3;
        }
    }
}
