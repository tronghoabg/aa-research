package androidx.camera.core.impl;

import androidx.camera.core.CameraIdentifier;
import androidx.camera.core.CameraPresenceListener;
import androidx.camera.core.CameraState;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraFactory;
import androidx.camera.core.impl.CameraPresenceProvider;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.lifecycle.Observer;
import e.c.d.a;
import h.a.i;
import h.a.r;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraPresenceProvider {
    public static final Companion Companion = new Companion(null);
    private static final int MAX_SCAN_RETRIES = 3;
    private static final long RETRY_DELAY_MS = 400;
    private static final String TAG = "CameraPresencePrvdr";
    private final Executor backgroundExecutor;
    private CameraFactory cameraFactory;
    private CameraRepository cameraRepository;
    private final Map<String, Observer<CameraState>> cameraStateObservers;
    private CameraValidator cameraValidator;
    private volatile List<CameraIdentifier> currentFilteredIds;
    private final CopyOnWriteArrayList<InternalCameraPresenceListener> dependentInternalListeners;
    private final AtomicBoolean isMonitoring;
    private final Object observerLock;
    private final CopyOnWriteArrayList<ListenerWrapper> publicApiListeners;
    private final Object retryLock;
    private ScheduledFuture<?> retryScanFuture;
    private final ScheduledExecutorService scheduledExecutor;
    private final SourceObservableObserver sourceObserver;
    private Observable<List<CameraIdentifier>> sourcePresenceObservable;

    /* compiled from: WazeSource */
    final class ListenerWrapper {
        private final Executor executor;
        private final CameraPresenceListener listener;

        public ListenerWrapper(CameraPresenceListener cameraPresenceListener, Executor executor) {
            x.f(cameraPresenceListener, "listener");
            x.f(executor, "executor");
            this.listener = cameraPresenceListener;
            this.executor = executor;
        }

        public static /* synthetic */ ListenerWrapper copy$default(ListenerWrapper listenerWrapper, CameraPresenceListener cameraPresenceListener, Executor executor, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                cameraPresenceListener = listenerWrapper.listener;
            }
            if ((i2 & 2) != 0) {
                executor = listenerWrapper.executor;
            }
            return listenerWrapper.copy(cameraPresenceListener, executor);
        }

        public final CameraPresenceListener component1() {
            return this.listener;
        }

        public final Executor component2() {
            return this.executor;
        }

        public final ListenerWrapper copy(CameraPresenceListener cameraPresenceListener, Executor executor) {
            x.f(cameraPresenceListener, "listener");
            x.f(executor, "executor");
            return new ListenerWrapper(cameraPresenceListener, executor);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ListenerWrapper)) {
                return false;
            }
            ListenerWrapper listenerWrapper = (ListenerWrapper) obj;
            return x.n(this.listener, listenerWrapper.listener) && x.n(this.executor, listenerWrapper.executor);
        }

        public final Executor getExecutor() {
            return this.executor;
        }

        public final CameraPresenceListener getListener() {
            return this.listener;
        }

        public int hashCode() {
            return (this.listener.hashCode() * 31) + this.executor.hashCode();
        }

        public String toString() {
            return "ListenerWrapper(listener=" + this.listener + ", executor=" + this.executor + ")";
        }
    }

    public CameraPresenceProvider(Executor executor, ScheduledExecutorService scheduledExecutorService) {
        x.f(executor, "backgroundExecutor");
        x.f(scheduledExecutorService, "scheduledExecutor");
        this.backgroundExecutor = executor;
        this.scheduledExecutor = scheduledExecutorService;
        this.observerLock = new Object();
        this.retryLock = new Object();
        this.sourceObserver = new SourceObservableObserver();
        this.currentFilteredIds = i.h();
        this.isMonitoring = new AtomicBoolean(false);
        this.dependentInternalListeners = new CopyOnWriteArrayList<>();
        this.publicApiListeners = new CopyOnWriteArrayList<>();
        this.cameraStateObservers = new LinkedHashMap();
    }

    static final void addCameraPresenceListener$lambda$0(CameraPresenceProvider cameraPresenceProvider, CameraPresenceListener cameraPresenceListener) {
        Set<CameraIdentifier> setAu = i.au(cameraPresenceProvider.currentFilteredIds);
        if (setAu.isEmpty()) {
            return;
        }
        cameraPresenceListener.onCamerasAdded(setAu);
    }

    private final void clearAllCameraStateObservers() {
        Object next;
        synchronized (this.observerLock) {
            if (this.cameraStateObservers.isEmpty()) {
                return;
            }
            Map mapR = r.r(this.cameraStateObservers);
            this.cameraStateObservers.clear();
            CameraRepository cameraRepository = this.cameraRepository;
            if (cameraRepository != null) {
                LinkedHashSet<CameraInternal> cameras = cameraRepository.getCameras();
                x.e(cameras, "getCameras(...)");
                Logger.d(TAG, "Clearing all " + mapR.size() + " state observers.");
                for (Map.Entry entry : mapR.entrySet()) {
                    final String str = (String) entry.getKey();
                    final Observer observer = (Observer) entry.getValue();
                    Iterator<T> it = cameras.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            if (x.n(((CameraInternal) next).getCameraInfoInternal().getCameraId(), str)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    final CameraInternal cameraInternal = (CameraInternal) next;
                    if (cameraInternal != null) {
                        Runnable runnable = new Runnable() { // from class: androidx.camera.core.impl.CameraPresenceProvider$$ExternalSyntheticLambda1
                            @Override // java.lang.Runnable
                            public final void run() {
                                CameraPresenceProvider.clearAllCameraStateObservers$lambda$1$1(cameraInternal, observer, str);
                            }
                        };
                        if (Threads.isMainThread()) {
                            runnable.run();
                        } else {
                            CameraXExecutors.mainThreadExecutor().execute(runnable);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clearAllCameraStateObservers$lambda$1$1(CameraInternal cameraInternal, Observer observer, String str) {
        try {
            cameraInternal.getCameraInfoInternal().getCameraState().removeObserver(observer);
        } catch (RuntimeException e2) {
            Logger.e(TAG, "Failed to remove state observer for camera ".concat(String.valueOf(str)), e2);
        }
    }

    private final void conditionallySetupCameraStateObserver(String str) {
        CameraRepository cameraRepository = this.cameraRepository;
        if (cameraRepository == null) {
            return;
        }
        try {
            CameraInternal camera = cameraRepository.getCamera(str);
            x.e(camera, "getCamera(...)");
            CameraInfoInternal cameraInfoInternal = camera.getCameraInfoInternal();
            x.e(cameraInfoInternal, "getCameraInfoInternal(...)");
            setupCameraStateObserver(cameraInfoInternal);
        } catch (IllegalArgumentException unused) {
            Logger.w(TAG, "CameraInternal not found for " + str + ". Cannot setup state observer.");
        }
    }

    private final void notifyPublicCamerasAdded(final Set<CameraIdentifier> set) {
        for (final ListenerWrapper listenerWrapper : this.publicApiListeners) {
            listenerWrapper.getExecutor().execute(new Runnable() { // from class: androidx.camera.core.impl.CameraPresenceProvider$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    CameraPresenceProvider.notifyPublicCamerasAdded$lambda$0$0(listenerWrapper, set);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyPublicCamerasAdded$lambda$0$0(ListenerWrapper listenerWrapper, Set set) {
        listenerWrapper.getListener().onCamerasAdded(set);
    }

    private final void notifyPublicCamerasRemoved(final Set<CameraIdentifier> set) {
        for (final ListenerWrapper listenerWrapper : this.publicApiListeners) {
            listenerWrapper.getExecutor().execute(new Runnable() { // from class: androidx.camera.core.impl.CameraPresenceProvider$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    CameraPresenceProvider.notifyPublicCamerasRemoved$lambda$0$0(listenerWrapper, set);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyPublicCamerasRemoved$lambda$0$0(ListenerWrapper listenerWrapper, Set set) {
        listenerWrapper.getListener().onCamerasRemoved(set);
    }

    private final void notifyPublicListeners(Set<CameraIdentifier> set, Set<CameraIdentifier> set2) {
        if (!set.isEmpty()) {
            Logger.i(TAG, "Notifying " + set.size() + " cameras added.");
            notifyPublicCamerasAdded(set);
        }
        if (set2.isEmpty()) {
            return;
        }
        Logger.i(TAG, "Notifying " + set2.size() + " cameras removed.");
        notifyPublicCamerasRemoved(set2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processFilteredCameraIdUpdate(List<CameraIdentifier> list) {
        List listAo = i.ao(this.currentFilteredIds);
        if (x.n(list, listAo)) {
            return;
        }
        synchronized (this.retryLock) {
            if (this.retryScanFuture != null) {
                Logger.d(TAG, "Camera list updated. Cancelling any pending retries.");
                ScheduledFuture<?> scheduledFuture = this.retryScanFuture;
                x.c(scheduledFuture);
                scheduledFuture.cancel(false);
                this.retryScanFuture = null;
            }
        }
        List list2 = listAo;
        Set setAu = i.au(list2);
        List<CameraIdentifier> list3 = list;
        Set setAu2 = i.au(list3);
        Set<CameraIdentifier> setT = a.t(setAu2, setAu);
        Set<CameraIdentifier> setT2 = a.t(setAu, setAu2);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(i.q(list3, 10));
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            arrayList2.add(((CameraIdentifier) it.next()).getInternalId());
        }
        ArrayList arrayList3 = arrayList2;
        try {
            Iterator<T> it2 = setT2.iterator();
            while (it2.hasNext()) {
                removeCameraStateObserver(((CameraIdentifier) it2.next()).getInternalId());
            }
            CameraRepository cameraRepository = this.cameraRepository;
            if (cameraRepository != null) {
                Logger.d(TAG, "Updating CameraRepository...");
                cameraRepository.onCamerasUpdated(arrayList3);
                arrayList.add(cameraRepository);
                Logger.d(TAG, "CameraRepository updated successfully.");
            }
            if (!this.dependentInternalListeners.isEmpty()) {
                Logger.d(TAG, "Updating " + this.dependentInternalListeners.size() + " dependent listeners...");
                for (InternalCameraPresenceListener internalCameraPresenceListener : this.dependentInternalListeners) {
                    internalCameraPresenceListener.onCamerasUpdated(arrayList3);
                    x.c(internalCameraPresenceListener);
                    arrayList.add(internalCameraPresenceListener);
                }
            }
            this.currentFilteredIds = list;
            Iterator<T> it3 = setT.iterator();
            while (it3.hasNext()) {
                conditionallySetupCameraStateObserver(((CameraIdentifier) it3.next()).getInternalId());
            }
            notifyPublicListeners(setT, setT2);
        } catch (Exception e2) {
            Logger.e(TAG, "A core module failed to update. Rolling back changes.", e2);
            ArrayList arrayList4 = new ArrayList(i.q(list2, 10));
            Iterator it4 = list2.iterator();
            while (it4.hasNext()) {
                arrayList4.add(((CameraIdentifier) it4.next()).getInternalId());
            }
            ArrayList arrayList5 = arrayList4;
            for (InternalCameraPresenceListener internalCameraPresenceListener2 : i.E(arrayList)) {
                try {
                    internalCameraPresenceListener2.onCamerasUpdated(arrayList5);
                } catch (Exception e3) {
                    Objects.toString(internalCameraPresenceListener2);
                    Logger.e(TAG, "Failed to rollback listener: ".concat(String.valueOf(internalCameraPresenceListener2)), e3);
                }
            }
            Iterator<T> it5 = setT2.iterator();
            while (it5.hasNext()) {
                conditionallySetupCameraStateObserver(((CameraIdentifier) it5.next()).getInternalId());
            }
            Iterator<T> it6 = setT.iterator();
            while (it6.hasNext()) {
                removeCameraStateObserver(((CameraIdentifier) it6.next()).getInternalId());
            }
        }
    }

    private final void removeCameraStateObserver(final String str) {
        synchronized (this.observerLock) {
            final Observer<CameraState> observerRemove = this.cameraStateObservers.remove(str);
            CameraRepository cameraRepository = this.cameraRepository;
            if (observerRemove != null && cameraRepository != null) {
                try {
                    final CameraInternal camera = cameraRepository.getCamera(str);
                    x.e(camera, "getCamera(...)");
                    Runnable runnable = new Runnable() { // from class: androidx.camera.core.impl.CameraPresenceProvider$$ExternalSyntheticLambda2
                        @Override // java.lang.Runnable
                        public final void run() {
                            CameraPresenceProvider.removeCameraStateObserver$lambda$0$0(camera, observerRemove, str);
                        }
                    };
                    if (Threads.isMainThread()) {
                        runnable.run();
                    } else {
                        CameraXExecutors.mainThreadExecutor().execute(runnable);
                    }
                    Logger.d(TAG, "Removed state observer for: " + str);
                } catch (IllegalArgumentException unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeCameraStateObserver$lambda$0$0(CameraInternal cameraInternal, Observer observer, String str) {
        try {
            cameraInternal.getCameraInfoInternal().getCameraState().removeObserver(observer);
        } catch (RuntimeException e2) {
            Logger.e(TAG, "Failed to remove state observer for camera: ".concat(String.valueOf(str)), e2);
        }
    }

    private final void scheduleRetryAttempt(final int i2, final List<CameraIdentifier> list) {
        if (i2 > 0 && this.isMonitoring.get()) {
            this.retryScanFuture = this.scheduledExecutor.schedule(new Runnable() { // from class: androidx.camera.core.impl.CameraPresenceProvider$$ExternalSyntheticLambda10
                @Override // java.lang.Runnable
                public final void run() {
                    CameraPresenceProvider cameraPresenceProvider = this.f$0;
                    cameraPresenceProvider.backgroundExecutor.execute(new Runnable() { // from class: androidx.camera.core.impl.CameraPresenceProvider$$ExternalSyntheticLambda7
                        @Override // java.lang.Runnable
                        public final void run() {
                            CameraPresenceProvider.scheduleRetryAttempt$lambda$0$0(cameraPresenceProvider, list, i);
                        }
                    });
                }
            }, i2 == 3 ? 0L : RETRY_DELAY_MS, TimeUnit.MILLISECONDS);
        } else if (i2 <= 0) {
            Logger.w(TAG, "Exhausted all retries for camera list refresh.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleRetryAttempt$lambda$0$0(CameraPresenceProvider cameraPresenceProvider, List list, int i2) {
        if (cameraPresenceProvider.isMonitoring.get() && x.n(cameraPresenceProvider.currentFilteredIds, list)) {
            Logger.d(TAG, "Triggering refresh. Attempts left: " + i2);
            Observable<List<CameraIdentifier>> observable = cameraPresenceProvider.sourcePresenceObservable;
            if (observable != null) {
                observable.fetchData();
            }
            cameraPresenceProvider.scheduleRetryAttempt(i2 - 1, list);
        }
    }

    private final void setupCameraStateObserver(final CameraInfoInternal cameraInfoInternal) {
        final String cameraId = cameraInfoInternal.getCameraId();
        x.e(cameraId, "getCameraId(...)");
        if (this.isMonitoring.get()) {
            synchronized (this.observerLock) {
                if (!this.cameraStateObservers.containsKey(cameraId)) {
                    final Observer<CameraState> observer = new Observer() { // from class: androidx.camera.core.impl.CameraPresenceProvider$$ExternalSyntheticLambda8
                        @Override // androidx.lifecycle.Observer
                        public final void onChanged(Object obj) {
                            CameraPresenceProvider.setupCameraStateObserver$lambda$0$0(this.f$0, cameraId, (CameraState) obj);
                        }
                    };
                    Runnable runnable = new Runnable() { // from class: androidx.camera.core.impl.CameraPresenceProvider$$ExternalSyntheticLambda9
                        @Override // java.lang.Runnable
                        public final void run() {
                            CameraPresenceProvider.setupCameraStateObserver$lambda$0$1(cameraInfoInternal, observer, cameraId);
                        }
                    };
                    if (Threads.isMainThread()) {
                        runnable.run();
                    } else {
                        CameraXExecutors.mainThreadExecutor().execute(runnable);
                    }
                    this.cameraStateObservers.put(cameraId, observer);
                    Logger.d(TAG, "Registered state observer for camera: " + cameraId);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupCameraStateObserver$lambda$0$0(final CameraPresenceProvider cameraPresenceProvider, String str, CameraState cameraState) {
        if (!cameraPresenceProvider.isMonitoring.get()) {
            Logger.d(TAG, "Ignore camera state change handling since already stop monitoring");
            return;
        }
        if (cameraState.getError() != null) {
            CameraState.Type type = cameraState.getType();
            CameraState.StateError error = cameraState.getError();
            Logger.w(TAG, "Camera " + str + " state changed to " + type + " with error: " + (error != null ? Integer.valueOf(error.getCode()) : null) + ". Triggering refresh.");
            cameraPresenceProvider.backgroundExecutor.execute(new Runnable() { // from class: androidx.camera.core.impl.CameraPresenceProvider$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.triggerRefreshWithRetries();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupCameraStateObserver$lambda$0$1(CameraInfoInternal cameraInfoInternal, Observer observer, String str) {
        try {
            cameraInfoInternal.getCameraState().observeForever(observer);
        } catch (RuntimeException e2) {
            Logger.e(TAG, "Failed to observe camera state for camera: ".concat(String.valueOf(str)), e2);
        }
    }

    static final void startup$lambda$1(CameraPresenceProvider cameraPresenceProvider) {
        Iterator<T> it = cameraPresenceProvider.currentFilteredIds.iterator();
        while (it.hasNext()) {
            cameraPresenceProvider.conditionallySetupCameraStateObserver(((CameraIdentifier) it.next()).getInternalId());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void triggerRefreshWithRetries() {
        synchronized (this.retryLock) {
            ScheduledFuture<?> scheduledFuture = this.retryScanFuture;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            Logger.d(TAG, "Starting new refresh-with-retries sequence.");
            scheduleRetryAttempt(3, this.currentFilteredIds);
        }
    }

    public final void addCameraPresenceListener(final CameraPresenceListener cameraPresenceListener, Executor executor) {
        x.f(cameraPresenceListener, "listener");
        x.f(executor, "executor");
        this.publicApiListeners.add(new ListenerWrapper(cameraPresenceListener, executor));
        executor.execute(new Runnable() { // from class: androidx.camera.core.impl.CameraPresenceProvider$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                CameraPresenceProvider.addCameraPresenceListener$lambda$0(this.f$0, cameraPresenceListener);
            }
        });
    }

    public final void addDependentInternalListener(InternalCameraPresenceListener internalCameraPresenceListener) {
        x.f(internalCameraPresenceListener, "listener");
        this.dependentInternalListeners.add(internalCameraPresenceListener);
    }

    public final void removeCameraPresenceListener(final CameraPresenceListener cameraPresenceListener) {
        x.f(cameraPresenceListener, "listener");
        i.aQ(this.publicApiListeners, new l() { // from class: androidx.camera.core.impl.CameraPresenceProvider$$ExternalSyntheticLambda11
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(x.n(((CameraPresenceProvider.ListenerWrapper) obj).getListener(), cameraPresenceListener));
            }
        });
    }

    public final void removeDependentInternalListener(InternalCameraPresenceListener internalCameraPresenceListener) {
        x.f(internalCameraPresenceListener, "listener");
        this.dependentInternalListeners.remove(internalCameraPresenceListener);
    }

    public final void shutdown() {
        if (!this.isMonitoring.getAndSet(false)) {
            Logger.d(TAG, "Shutdown called when not monitoring. Ignoring.");
            return;
        }
        Logger.i(TAG, "Shutting down CameraPresenceProvider monitoring.");
        synchronized (this.retryLock) {
            ScheduledFuture<?> scheduledFuture = this.retryScanFuture;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.retryScanFuture = null;
        }
        Observable<List<CameraIdentifier>> observable = this.sourcePresenceObservable;
        if (observable != null) {
            observable.removeObserver(this.sourceObserver);
        }
        clearAllCameraStateObservers();
        this.cameraValidator = null;
        this.dependentInternalListeners.clear();
        this.publicApiListeners.clear();
        this.currentFilteredIds = i.h();
        this.cameraFactory = null;
        this.cameraRepository = null;
    }

    public final void startup(CameraValidator cameraValidator, CameraFactory cameraFactory, CameraRepository cameraRepository) {
        x.f(cameraValidator, "cameraValidator");
        x.f(cameraFactory, "cameraFactory");
        x.f(cameraRepository, "cameraRepository");
        if (this.isMonitoring.compareAndSet(false, true)) {
            Logger.i(TAG, "Starting CameraPresenceProvider monitoring.");
            this.cameraValidator = cameraValidator;
            Set<String> availableCameraIds = cameraFactory.getAvailableCameraIds();
            x.e(availableCameraIds, "getAvailableCameraIds(...)");
            Set<String> set = availableCameraIds;
            ArrayList arrayList = new ArrayList(i.q(set, 10));
            for (String str : set) {
                x.c(str);
                arrayList.add(CameraIdentifier.Factory.create$default(str, null, null, 6, null));
            }
            this.currentFilteredIds = arrayList;
            this.cameraFactory = cameraFactory;
            this.cameraRepository = cameraRepository;
            this.sourcePresenceObservable = cameraFactory.getCameraPresenceSource();
            this.backgroundExecutor.execute(new Runnable() { // from class: androidx.camera.core.impl.CameraPresenceProvider$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    CameraPresenceProvider.startup$lambda$1(this.f$0);
                }
            });
            Observable<List<CameraIdentifier>> observable = this.sourcePresenceObservable;
            if (observable != null) {
                Executor executor = this.backgroundExecutor;
                observable.addObserver(CameraXExecutors.newSequentialExecutor(executor), this.sourceObserver);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* compiled from: WazeSource */
    final class SourceObservableObserver implements Observable.Observer<List<? extends CameraIdentifier>> {
        public SourceObservableObserver() {
        }

        @Override // androidx.camera.core.impl.Observable.Observer
        public void onError(Throwable th) {
            x.f(th, "t");
            if (CameraPresenceProvider.this.isMonitoring.get()) {
                Logger.e(CameraPresenceProvider.TAG, "Error from source camera presence observable. Triggering refresh.", th);
                Observable observable = CameraPresenceProvider.this.sourcePresenceObservable;
                if (observable != null) {
                    observable.fetchData();
                }
            }
        }

        /* renamed from: onNewData, reason: avoid collision after fix types in other method */
        public void onNewData2(List<CameraIdentifier> list) {
            CameraFactory cameraFactory;
            CameraRepository cameraRepository;
            CameraValidator cameraValidator;
            ArrayList arrayListH;
            if (!CameraPresenceProvider.this.isMonitoring.get() || (cameraFactory = CameraPresenceProvider.this.cameraFactory) == null || (cameraRepository = CameraPresenceProvider.this.cameraRepository) == null || (cameraValidator = CameraPresenceProvider.this.cameraValidator) == null) {
                return;
            }
            if (list != null) {
                List<CameraIdentifier> list2 = list;
                ArrayList arrayList = new ArrayList(i.q(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((CameraIdentifier) it.next()).getInternalId());
                }
                arrayListH = arrayList;
            } else {
                arrayListH = i.h();
            }
            if (cameraFactory instanceof CameraFactory.Interrogator) {
                try {
                    List list3 = CameraPresenceProvider.this.currentFilteredIds;
                    List<String> availableCameraIds = ((CameraFactory.Interrogator) cameraFactory).getAvailableCameraIds(arrayListH);
                    x.e(availableCameraIds, "getAvailableCameraIds(...)");
                    List<String> list4 = availableCameraIds;
                    ArrayList arrayList2 = new ArrayList(i.q(list4, 10));
                    for (String str : list4) {
                        x.c(str);
                        arrayList2.add(CameraIdentifier.Factory.create$default(str, null, null, 6, null));
                    }
                    Set<CameraIdentifier> setT = a.t(i.au(list3), i.au(arrayList2));
                    if (!setT.isEmpty()) {
                        LinkedHashSet<CameraInternal> cameras = cameraRepository.getCameras();
                        x.e(cameras, "getCameras(...)");
                        if (cameraValidator.isChangeInvalid(cameras, setT)) {
                            Logger.w(CameraPresenceProvider.TAG, "Camera removal update invalid. Aborting.");
                            return;
                        }
                    }
                } catch (Exception e2) {
                    Logger.w(CameraPresenceProvider.TAG, "Failed to interrogate camera factory. Falling back to full update.", e2);
                }
            }
            try {
                cameraFactory.onCameraIdsUpdated(arrayListH);
                Set<String> availableCameraIds2 = cameraFactory.getAvailableCameraIds();
                x.e(availableCameraIds2, "getAvailableCameraIds(...)");
                Set<String> set = availableCameraIds2;
                ArrayList arrayList3 = new ArrayList(i.q(set, 10));
                for (String str2 : set) {
                    x.c(str2);
                    arrayList3.add(CameraIdentifier.Factory.create$default(str2, null, null, 6, null));
                }
                ArrayList arrayList4 = arrayList3;
                if (x.n(arrayList4, CameraPresenceProvider.this.currentFilteredIds)) {
                    return;
                }
                CameraPresenceProvider.this.processFilteredCameraIdUpdate(arrayList4);
            } catch (Exception e3) {
                Logger.w(CameraPresenceProvider.TAG, "CameraFactory failed to update. The camera list may be stale until the next update.", e3);
            }
        }

        @Override // androidx.camera.core.impl.Observable.Observer
        public /* bridge */ /* synthetic */ void onNewData(List<? extends CameraIdentifier> list) {
            onNewData2((List<CameraIdentifier>) list);
        }
    }
}
