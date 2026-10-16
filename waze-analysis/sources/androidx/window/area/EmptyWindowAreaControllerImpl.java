package androidx.window.area;

import android.app.Activity;
import androidx.core.util.Consumer;
import h.a.i;
import h.g.b.x;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class EmptyWindowAreaControllerImpl extends WindowAreaController {
    @Override // androidx.window.area.WindowAreaController
    public void addWindowAreasListener(Executor executor, final Consumer<List<WindowArea>> consumer) {
        x.f(executor, "executor");
        x.f(consumer, "listener");
        executor.execute(new Runnable() { // from class: androidx.window.area.EmptyWindowAreaControllerImpl$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                consumer.accept(i.h());
            }
        });
    }

    @Override // androidx.window.area.WindowAreaController
    public WindowAreaSessionPresenter getActivePresentationSession(WindowAreaToken windowAreaToken) {
        x.f(windowAreaToken, "windowAreaToken");
        return null;
    }

    @Override // androidx.window.area.WindowAreaController
    public void presentContentOnWindowArea(WindowAreaToken windowAreaToken, Activity activity, Executor executor, WindowAreaPresentationSessionCallback windowAreaPresentationSessionCallback) {
        x.f(windowAreaToken, "windowAreaToken");
        x.f(activity, "activity");
        x.f(executor, "executor");
        x.f(windowAreaPresentationSessionCallback, "windowAreaPresentationSessionCallback");
        windowAreaPresentationSessionCallback.onSessionEnded(new IllegalStateException("There are no WindowAreas"));
    }

    @Override // androidx.window.area.WindowAreaController
    public void removeWindowAreasListener(Consumer<List<WindowArea>> consumer) {
        x.f(consumer, "listener");
    }

    @Override // androidx.window.area.WindowAreaController
    public void transferToWindowArea(WindowAreaToken windowAreaToken, Activity activity) {
        x.f(activity, "activity");
        throw new IllegalStateException("There are no WindowAreas");
    }
}
