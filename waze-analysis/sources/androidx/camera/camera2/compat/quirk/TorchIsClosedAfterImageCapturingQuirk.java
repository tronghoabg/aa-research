package androidx.camera.camera2.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.Quirk;
import h.a.i;
import h.g.b.o;
import h.g.b.x;
import java.util.List;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class TorchIsClosedAfterImageCapturingQuirk implements Quirk {
    public static final Companion Companion = new Companion(null);
    private static final List<String> BUILD_MODELS = i.i("mi a1", "mi a2", "mi a2 lite", "redmi 4x", "redmi 5a", "redmi note 5", "redmi note 5 pro", "redmi 6 pro", "redmi note 6 pro");

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final boolean isEnabled() {
            List list = TorchIsClosedAfterImageCapturingQuirk.BUILD_MODELS;
            String str = Build.MODEL;
            x.e(str, "MODEL");
            String lowerCase = str.toLowerCase(Locale.ROOT);
            x.e(lowerCase, "toLowerCase(...)");
            return list.contains(lowerCase);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
