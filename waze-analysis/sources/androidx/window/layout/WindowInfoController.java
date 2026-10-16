package androidx.window.layout;

import android.content.Context;
import android.os.Build;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class WindowInfoController {
    public static final Companion Companion = new Companion(null);

    public static final WindowInfoController getInstance(Context context) {
        return Companion.getInstance(context);
    }

    public abstract void requestVisualState(Context context, VisualStateRequest visualStateRequest);

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final WindowInfoController getInstance(Context context) {
            x.f(context, "context");
            return Build.VERSION.SDK_INT >= 37 ? new WindowInfoControllerImpl() : new EmptyWindowInfoController();
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
