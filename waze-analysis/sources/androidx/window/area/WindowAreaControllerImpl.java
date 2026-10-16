package androidx.window.area;

import android.app.Activity;
import android.os.Binder;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.core.util.Consumer;
import androidx.window.area.WindowArea;
import androidx.window.area.WindowAreaCapability;
import androidx.window.area.WindowAreaControllerImpl;
import androidx.window.area.adapter.WindowAreaAdapter;
import androidx.window.core.BuildConfig;
import androidx.window.core.ExtensionsUtil;
import androidx.window.core.VerificationMode;
import androidx.window.extensions.area.ExtensionWindowAreaPresentation;
import androidx.window.extensions.area.ExtensionWindowAreaStatus;
import androidx.window.extensions.area.WindowAreaComponent;
import androidx.window.layout.WindowMetrics;
import androidx.window.layout.WindowMetricsCalculator;
import androidx.window.reflection.Consumer2;
import h.a.i;
import h.a.r;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.o;
import h.g.b.x;
import h.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class WindowAreaControllerImpl extends WindowAreaController {
    public static final Companion Companion = new Companion(null);
    private static final WindowAreaToken REAR_DISPLAY_WINDOW_AREA_TOKEN;
    private static final String TAG;
    private boolean activeWindowAreaSession;
    private WindowAreaCapability.Status currentRearDisplayModeStatus;
    private WindowAreaCapability.Status currentRearDisplayPresentationStatus;
    private final HashMap<WindowAreaToken, WindowArea> currentWindowAreaMap;
    private final ArrayList<k<Executor, Consumer<List<WindowArea>>>> listeners;
    private final Object lock;
    private boolean presentationSessionActive;
    private final Consumer2<Integer> rearDisplayExtensionListener;
    private final Consumer2<ExtensionWindowAreaStatus> rearDisplayPresentationExtensionListener;
    private Consumer2<Integer> rearDisplaySessionConsumer;
    private final WindowAreaComponent windowAreaComponent;

    static {
        int i2 = ar.f48106a;
        TAG = new m(WindowAreaControllerImpl.class).c();
        REAR_DISPLAY_WINDOW_AREA_TOKEN = new WindowAreaToken(new Binder("WINDOW_AREA_REAR_DISPLAY"));
    }

    public WindowAreaControllerImpl(WindowAreaComponent windowAreaComponent) {
        x.f(windowAreaComponent, "windowAreaComponent");
        this.windowAreaComponent = windowAreaComponent;
        this.currentRearDisplayModeStatus = WindowAreaCapability.Status.Companion.getWINDOW_AREA_STATUS_UNKNOWN$window();
        this.currentRearDisplayPresentationStatus = WindowAreaCapability.Status.Companion.getWINDOW_AREA_STATUS_UNKNOWN$window();
        this.lock = new Object();
        this.currentWindowAreaMap = new HashMap<>();
        this.listeners = new ArrayList<>();
        this.rearDisplayExtensionListener = new Consumer2() { // from class: androidx.window.area.WindowAreaControllerImpl$$ExternalSyntheticLambda3
            @Override // androidx.window.reflection.Consumer2, androidx.window.extensions.core.util.function.Consumer
            public final void accept(Object obj) {
                WindowAreaControllerImpl.rearDisplayExtensionListener$lambda$0(this.f$0, ((Integer) obj).intValue());
            }
        };
        this.rearDisplayPresentationExtensionListener = new Consumer2() { // from class: androidx.window.area.WindowAreaControllerImpl$$ExternalSyntheticLambda4
            @Override // androidx.window.reflection.Consumer2, androidx.window.extensions.core.util.function.Consumer
            public final void accept(Object obj) {
                WindowAreaControllerImpl.rearDisplayPresentationExtensionListener$lambda$0(this.f$0, (ExtensionWindowAreaStatus) obj);
            }
        };
    }

    static final void addWindowAreasListener$lambda$1(Consumer consumer, WindowAreaControllerImpl windowAreaControllerImpl) {
        Collection<WindowArea> collectionValues = windowAreaControllerImpl.currentWindowAreaMap.values();
        x.e(collectionValues, "<get-values>(...)");
        consumer.accept(i.ao(collectionValues));
    }

    private final WindowAreaSessionPresenter createRearFacingPresentationSession() {
        ExtensionWindowAreaPresentation rearDisplayPresentation = this.windowAreaComponent.getRearDisplayPresentation();
        x.c(rearDisplayPresentation);
        return new RearDisplayPresentationSessionPresenterImpl(this.windowAreaComponent, rearDisplayPresentation, ExtensionsUtil.INSTANCE.getSafeVendorApiLevel());
    }

    private final WindowMetrics getRearDisplayMetrics(WindowAreaComponent windowAreaComponent) {
        DisplayMetrics displayMetrics;
        try {
            displayMetrics = windowAreaComponent.getRearDisplayMetrics();
        } catch (ClassCastException unused) {
            displayMetrics = new DisplayMetrics();
        }
        x.c(displayMetrics);
        return WindowMetricsCalculator.Companion.fromDisplayMetrics$window(displayMetrics);
    }

    private final void initializeExtensionListeners() {
        this.windowAreaComponent.addRearDisplayStatusListener(this.rearDisplayExtensionListener);
        this.windowAreaComponent.addRearDisplayPresentationStatusListener(this.rearDisplayPresentationExtensionListener);
    }

    private final void moveDeviceToDefaultWindowArea() {
        Object next;
        WindowArea windowArea;
        synchronized (this.lock) {
            Collection<WindowArea> collectionValues = this.currentWindowAreaMap.values();
            x.e(collectionValues, "<get-values>(...)");
            Iterator<T> it = collectionValues.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (x.n(((WindowArea) next).getCapability(WindowAreaCapability.Operation.OPERATION_TRANSFER_TO_AREA).getStatus(), WindowAreaCapability.Status.WINDOW_AREA_STATUS_ACTIVE)) {
                        break;
                    }
                }
            }
            windowArea = (WindowArea) next;
        }
        if (windowArea == null || !x.n(windowArea.getType(), WindowArea.Type.TYPE_REAR_FACING)) {
            return;
        }
        this.windowAreaComponent.endRearDisplaySession();
    }

    static final void rearDisplayExtensionListener$lambda$0(WindowAreaControllerImpl windowAreaControllerImpl, int i2) {
        windowAreaControllerImpl.updateRearDisplayAvailability(i2);
        windowAreaControllerImpl.updateWindowAreaListeners();
    }

    static final void rearDisplayPresentationExtensionListener$lambda$0(WindowAreaControllerImpl windowAreaControllerImpl, ExtensionWindowAreaStatus extensionWindowAreaStatus) {
        x.f(extensionWindowAreaStatus, "extensionWindowAreaStatus");
        windowAreaControllerImpl.updateRearDisplayPresentationAvailability(extensionWindowAreaStatus);
        windowAreaControllerImpl.updateWindowAreaListeners();
    }

    private final void removeExtensionListeners() {
        this.windowAreaComponent.removeRearDisplayStatusListener(this.rearDisplayExtensionListener);
        this.windowAreaComponent.removeRearDisplayPresentationStatusListener(this.rearDisplayPresentationExtensionListener);
    }

    private final boolean shouldRemoveWindowAreaInfo(WindowArea windowArea) {
        Iterator<WindowAreaCapability> it = windowArea.getCapabilityMap$window().values().iterator();
        while (it.hasNext()) {
            if (!x.n(it.next().getStatus(), WindowAreaCapability.Status.WINDOW_AREA_STATUS_UNSUPPORTED)) {
                return false;
            }
        }
        return true;
    }

    private final void startRearDisplayMode(Activity activity) {
        if (x.n(this.currentRearDisplayModeStatus, WindowAreaCapability.Status.WINDOW_AREA_STATUS_ACTIVE)) {
            throw new IllegalStateException("The WindowArea feature is currently active, WindowAreaInfo#getActiveSessioncan be used to get an instance of the current active session");
        }
        if (!x.n(this.currentRearDisplayModeStatus, WindowAreaCapability.Status.WINDOW_AREA_STATUS_AVAILABLE)) {
            throw new IllegalStateException("The WindowArea feature is currently not available to be entered");
        }
        this.activeWindowAreaSession = true;
        RearDisplaySessionConsumer rearDisplaySessionConsumer = new RearDisplaySessionConsumer();
        this.rearDisplaySessionConsumer = rearDisplaySessionConsumer;
        this.windowAreaComponent.startRearDisplaySession(activity, rearDisplaySessionConsumer);
    }

    private final void startRearDisplayPresentationMode(Activity activity, Executor executor, WindowAreaPresentationSessionCallback windowAreaPresentationSessionCallback) {
        if (!x.n(this.currentRearDisplayPresentationStatus, WindowAreaCapability.Status.WINDOW_AREA_STATUS_AVAILABLE)) {
            windowAreaPresentationSessionCallback.onSessionEnded(new IllegalStateException("The WindowArea feature is currently not available to be entered"));
            return;
        }
        this.presentationSessionActive = true;
        WindowAreaComponent windowAreaComponent = this.windowAreaComponent;
        windowAreaComponent.startRearDisplayPresentationSession(activity, new RearDisplayPresentationSessionConsumer(this, executor, windowAreaPresentationSessionCallback, windowAreaComponent));
    }

    private final void updateRearDisplayAvailability(int i2) {
        WindowMetrics rearDisplayMetrics = getRearDisplayMetrics(this.windowAreaComponent);
        this.currentRearDisplayModeStatus = WindowAreaAdapter.translate$window$default(WindowAreaAdapter.INSTANCE, i2, this.activeWindowAreaSession, 0, 4, null);
        updateRearDisplayWindowArea(WindowAreaCapability.Operation.OPERATION_TRANSFER_TO_AREA, this.currentRearDisplayModeStatus, rearDisplayMetrics);
    }

    private final void updateRearDisplayPresentationAvailability(ExtensionWindowAreaStatus extensionWindowAreaStatus) {
        this.currentRearDisplayPresentationStatus = WindowAreaAdapter.translate$window$default(WindowAreaAdapter.INSTANCE, extensionWindowAreaStatus.getWindowAreaStatus(), this.presentationSessionActive, 0, 4, null);
        updateRearDisplayWindowArea(WindowAreaCapability.Operation.OPERATION_PRESENT_ON_AREA, this.currentRearDisplayPresentationStatus, getRearDisplayMetrics(this.windowAreaComponent));
    }

    private final void updateRearDisplayWindowArea(WindowAreaCapability.Operation operation, WindowAreaCapability.Status status, WindowMetrics windowMetrics) {
        WindowAreaToken windowAreaToken;
        WindowArea windowArea;
        Map<WindowAreaCapability.Operation, WindowAreaCapability> capabilityMap$window;
        synchronized (this.lock) {
            HashMap<WindowAreaToken, WindowArea> map = this.currentWindowAreaMap;
            windowAreaToken = REAR_DISPLAY_WINDOW_AREA_TOKEN;
            windowArea = map.get(windowAreaToken);
        }
        if (x.n(status, WindowAreaCapability.Status.WINDOW_AREA_STATUS_UNSUPPORTED) && (windowArea == null || shouldRemoveWindowAreaInfo(windowArea))) {
            synchronized (this.lock) {
                this.currentWindowAreaMap.remove(windowAreaToken);
            }
            return;
        }
        WindowAreaCapability windowAreaCapability = new WindowAreaCapability(operation, status);
        HashMap map2 = (windowArea == null || (capabilityMap$window = windowArea.getCapabilityMap$window()) == null) ? new HashMap() : r.t(capabilityMap$window);
        map2.put(operation, windowAreaCapability);
        WindowArea windowArea2 = new WindowArea(windowMetrics, WindowArea.Type.TYPE_REAR_FACING, windowAreaToken, r.r(map2));
        synchronized (this.lock) {
            this.currentWindowAreaMap.put(windowArea2.getToken(), windowArea2);
        }
    }

    private final void updateWindowAreaListeners() {
        synchronized (this.lock) {
            Iterator<T> it = this.listeners.iterator();
            while (it.hasNext()) {
                final k kVar = (k) it.next();
                ((Executor) kVar.c()).execute(new Runnable() { // from class: androidx.window.area.WindowAreaControllerImpl$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        WindowAreaControllerImpl.updateWindowAreaListeners$lambda$0$0$0(kVar, this);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateWindowAreaListeners$lambda$0$0$0(k kVar, WindowAreaControllerImpl windowAreaControllerImpl) {
        Consumer consumer = (Consumer) kVar.d();
        Collection<WindowArea> collectionValues = windowAreaControllerImpl.currentWindowAreaMap.values();
        x.e(collectionValues, "<get-values>(...)");
        consumer.accept(i.ao(collectionValues));
    }

    @Override // androidx.window.area.WindowAreaController
    public void addWindowAreasListener(Executor executor, final Consumer<List<WindowArea>> consumer) {
        x.f(executor, "executor");
        x.f(consumer, "listener");
        synchronized (this.lock) {
            boolean zIsEmpty = this.listeners.isEmpty();
            Iterator<k<Executor, Consumer<List<WindowArea>>>> it = this.listeners.iterator();
            x.e(it, "iterator(...)");
            while (it.hasNext()) {
                k<Executor, Consumer<List<WindowArea>>> next = it.next();
                x.e(next, "next(...)");
                if (x.n(next.d(), consumer)) {
                    return;
                }
            }
            this.listeners.add(new k<>(executor, consumer));
            if (zIsEmpty) {
                initializeExtensionListeners();
            } else {
                executor.execute(new Runnable() { // from class: androidx.window.area.WindowAreaControllerImpl$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        WindowAreaControllerImpl.addWindowAreasListener$lambda$1(consumer, this);
                    }
                });
            }
        }
    }

    @Override // androidx.window.area.WindowAreaController
    public WindowAreaSessionPresenter getActivePresentationSession(WindowAreaToken windowAreaToken) {
        WindowArea windowArea;
        x.f(windowAreaToken, "windowAreaToken");
        synchronized (this.lock) {
            windowArea = this.currentWindowAreaMap.get(windowAreaToken);
        }
        if (x.n(windowArea != null ? windowArea.getType() : null, WindowArea.Type.TYPE_REAR_FACING) && x.n(windowArea.getCapability(WindowAreaCapability.Operation.OPERATION_PRESENT_ON_AREA).getStatus(), WindowAreaCapability.Status.WINDOW_AREA_STATUS_ACTIVE)) {
            return createRearFacingPresentationSession();
        }
        return null;
    }

    public final Consumer2<Integer> getRearDisplayExtensionListener() {
        return this.rearDisplayExtensionListener;
    }

    public final Consumer2<ExtensionWindowAreaStatus> getRearDisplayPresentationExtensionListener() {
        return this.rearDisplayPresentationExtensionListener;
    }

    @Override // androidx.window.area.WindowAreaController
    public void presentContentOnWindowArea(WindowAreaToken windowAreaToken, Activity activity, Executor executor, final WindowAreaPresentationSessionCallback windowAreaPresentationSessionCallback) {
        WindowArea windowArea;
        x.f(windowAreaToken, "windowAreaToken");
        x.f(activity, "activity");
        x.f(executor, "executor");
        x.f(windowAreaPresentationSessionCallback, "windowAreaPresentationSessionCallback");
        synchronized (this.lock) {
            windowArea = this.currentWindowAreaMap.get(windowAreaToken);
        }
        if (x.n(windowArea != null ? windowArea.getType() : null, WindowArea.Type.TYPE_REAR_FACING)) {
            startRearDisplayPresentationMode(activity, executor, windowAreaPresentationSessionCallback);
        } else {
            executor.execute(new Runnable() { // from class: androidx.window.area.WindowAreaControllerImpl$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    windowAreaPresentationSessionCallback.onSessionEnded(new IllegalArgumentException("Invalid WindowAreaInfo token"));
                }
            });
        }
    }

    @Override // androidx.window.area.WindowAreaController
    public void removeWindowAreasListener(Consumer<List<WindowArea>> consumer) {
        Object next;
        boolean zIsEmpty;
        x.f(consumer, "listener");
        synchronized (this.lock) {
            Iterator<T> it = this.listeners.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (x.n(((k) next).d(), consumer)) {
                        break;
                    }
                }
            }
            k kVar = (k) next;
            if (kVar != null) {
                this.listeners.remove(kVar);
            }
            zIsEmpty = this.listeners.isEmpty();
        }
        if (zIsEmpty) {
            removeExtensionListeners();
        }
    }

    @Override // androidx.window.area.WindowAreaController
    public void transferToWindowArea(WindowAreaToken windowAreaToken, Activity activity) {
        x.f(activity, "activity");
        if (windowAreaToken == null) {
            moveDeviceToDefaultWindowArea();
            return;
        }
        WindowArea windowArea = this.currentWindowAreaMap.get(windowAreaToken);
        if (!x.n(windowArea != null ? windowArea.getType() : null, WindowArea.Type.TYPE_REAR_FACING)) {
            throw new IllegalArgumentException("Invalid WindowAreaInfo type");
        }
        startRearDisplayMode(activity);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final WindowAreaToken getREAR_DISPLAY_WINDOW_AREA_TOKEN$window() {
            return WindowAreaControllerImpl.REAR_DISPLAY_WINDOW_AREA_TOKEN;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* compiled from: WazeSource */
    public final class RearDisplayPresentationSessionConsumer implements Consumer2<Integer> {
        private final Executor executor;
        private int lastReportedSessionStatus;
        final /* synthetic */ WindowAreaControllerImpl this$0;
        private final WindowAreaComponent windowAreaComponent;
        private final WindowAreaPresentationSessionCallback windowAreaPresentationSessionCallback;

        public RearDisplayPresentationSessionConsumer(WindowAreaControllerImpl windowAreaControllerImpl, Executor executor, WindowAreaPresentationSessionCallback windowAreaPresentationSessionCallback, WindowAreaComponent windowAreaComponent) {
            x.f(executor, "executor");
            x.f(windowAreaPresentationSessionCallback, "windowAreaPresentationSessionCallback");
            x.f(windowAreaComponent, "windowAreaComponent");
            this.this$0 = windowAreaControllerImpl;
            this.executor = executor;
            this.windowAreaPresentationSessionCallback = windowAreaPresentationSessionCallback;
            this.windowAreaComponent = windowAreaComponent;
        }

        static final void accept$lambda$0(int i2, int i3, RearDisplayPresentationSessionConsumer rearDisplayPresentationSessionConsumer, WindowAreaControllerImpl windowAreaControllerImpl) {
            if (i2 == 0) {
                windowAreaControllerImpl.presentationSessionActive = false;
                rearDisplayPresentationSessionConsumer.windowAreaPresentationSessionCallback.onSessionEnded(null);
                return;
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    rearDisplayPresentationSessionConsumer.windowAreaPresentationSessionCallback.onContainerVisibilityChanged(true);
                    return;
                }
                Log.e(WindowAreaControllerImpl.TAG, "Invalid session state value received: " + i2);
                return;
            }
            if (i3 == 2) {
                rearDisplayPresentationSessionConsumer.windowAreaPresentationSessionCallback.onContainerVisibilityChanged(false);
                return;
            }
            WindowAreaPresentationSessionCallback windowAreaPresentationSessionCallback = rearDisplayPresentationSessionConsumer.windowAreaPresentationSessionCallback;
            WindowAreaComponent windowAreaComponent = rearDisplayPresentationSessionConsumer.windowAreaComponent;
            ExtensionWindowAreaPresentation rearDisplayPresentation = windowAreaComponent.getRearDisplayPresentation();
            x.c(rearDisplayPresentation);
            windowAreaPresentationSessionCallback.onSessionStarted(new RearDisplayPresentationSessionPresenterImpl(windowAreaComponent, rearDisplayPresentation, ExtensionsUtil.INSTANCE.getSafeVendorApiLevel()));
        }

        public void accept(final int i2) {
            final int i3 = this.lastReportedSessionStatus;
            this.lastReportedSessionStatus = i2;
            final WindowAreaControllerImpl windowAreaControllerImpl = this.this$0;
            this.executor.execute(new Runnable() { // from class: androidx.window.area.WindowAreaControllerImpl$RearDisplayPresentationSessionConsumer$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    WindowAreaControllerImpl.RearDisplayPresentationSessionConsumer.accept$lambda$0(i2, i3, this, windowAreaControllerImpl);
                }
            });
        }

        @Override // androidx.window.reflection.Consumer2, androidx.window.extensions.core.util.function.Consumer
        public /* bridge */ /* synthetic */ void accept(Object obj) {
            accept(((Number) obj).intValue());
        }
    }

    /* compiled from: WazeSource */
    public final class RearDisplaySessionConsumer implements Consumer2<Integer> {
        public RearDisplaySessionConsumer() {
        }

        public void accept(int i2) {
            if (i2 == 0) {
                WindowAreaControllerImpl.this.activeWindowAreaSession = false;
                return;
            }
            if (i2 != 1) {
                if (BuildConfig.INSTANCE.getVerificationMode() == VerificationMode.STRICT) {
                    Log.d(WindowAreaControllerImpl.TAG, "Received an unknown session status value: " + i2);
                }
                WindowAreaControllerImpl.this.activeWindowAreaSession = false;
            }
        }

        @Override // androidx.window.reflection.Consumer2, androidx.window.extensions.core.util.function.Consumer
        public /* bridge */ /* synthetic */ void accept(Object obj) {
            accept(((Number) obj).intValue());
        }
    }
}
