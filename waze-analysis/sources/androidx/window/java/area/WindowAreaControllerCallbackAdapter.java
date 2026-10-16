package androidx.window.java.area;

import android.app.Activity;
import androidx.core.util.Consumer;
import androidx.window.area.WindowArea;
import androidx.window.area.WindowAreaController;
import androidx.window.area.WindowAreaPresentationSessionCallback;
import androidx.window.area.WindowAreaSessionPresenter;
import androidx.window.area.WindowAreaToken;
import h.g.b.x;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class WindowAreaControllerCallbackAdapter {
    private final WindowAreaController controller;

    public WindowAreaControllerCallbackAdapter(WindowAreaController windowAreaController) {
        x.f(windowAreaController, "controller");
        this.controller = windowAreaController;
    }

    public final void addWindowAreasListener(Executor executor, Consumer<List<WindowArea>> consumer) {
        x.f(executor, "executor");
        x.f(consumer, "listener");
        this.controller.addWindowAreasListener(executor, consumer);
    }

    public final WindowAreaSessionPresenter getActivePresentationSession(WindowAreaToken windowAreaToken) {
        x.f(windowAreaToken, "windowAreaToken");
        return this.controller.getActivePresentationSession(windowAreaToken);
    }

    public final void presentContentOnWindowArea(WindowAreaToken windowAreaToken, Activity activity, Executor executor, WindowAreaPresentationSessionCallback windowAreaPresentationSessionCallback) {
        x.f(windowAreaToken, "windowAreaToken");
        x.f(activity, "activity");
        x.f(executor, "executor");
        x.f(windowAreaPresentationSessionCallback, "windowAreaPresentationSessionCallback");
        this.controller.presentContentOnWindowArea(windowAreaToken, activity, executor, windowAreaPresentationSessionCallback);
    }

    public final void removeWindowAreasListener(Consumer<List<WindowArea>> consumer) {
        x.f(consumer, "listener");
        this.controller.removeWindowAreasListener(consumer);
    }

    public final void transferToWindowArea(WindowAreaToken windowAreaToken, Activity activity) {
        x.f(activity, "activity");
        this.controller.transferToWindowArea(windowAreaToken, activity);
    }
}
