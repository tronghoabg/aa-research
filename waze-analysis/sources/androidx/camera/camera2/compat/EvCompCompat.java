package androidx.camera.camera2.compat;

import android.util.Range;
import android.util.Rational;
import androidx.camera.camera2.impl.UseCaseCameraRequestControl;
import kotlinx.coroutines.am;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface EvCompCompat {

    /* compiled from: WazeSource */
    public abstract class Bindings {
        public abstract EvCompCompat bindEvCompImpl(EvCompImpl evCompImpl);
    }

    am<Integer> applyAsync(int i2, UseCaseCameraRequestControl useCaseCameraRequestControl, boolean z);

    Range<Integer> getRange();

    Rational getStep();

    boolean getSupported();

    void stopRunningTask(Throwable th);
}
