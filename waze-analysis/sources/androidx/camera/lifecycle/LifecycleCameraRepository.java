package androidx.camera.lifecycle;

import androidx.camera.core.CameraIdentifier;
import androidx.camera.core.Logger;
import androidx.camera.core.RotationProvider;
import androidx.camera.core.SessionConfig;
import androidx.camera.core.concurrent.CameraCoordinator;
import androidx.camera.core.impl.utils.ContextUtil;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.core.util.Preconditions;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class LifecycleCameraRepository {
    private static final String TAG = "LifecycleCameraRepository";
    private final ArrayDeque<LifecycleOwner> mActiveLifecycleOwners;
    CameraCoordinator mCameraCoordinator;
    private final Map<Key, LifecycleCamera> mCameraMap;
    private final int mDeviceId;
    private final Map<LifecycleCameraRepositoryObserver, Set<Key>> mLifecycleObserverMap;
    private final Object mLock;

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    @interface FromUseCaseAdapter {
    }

    /* compiled from: WazeSource */
    abstract class Key {
        Key() {
        }

        static Key create(LifecycleOwner lifecycleOwner, CameraIdentifier cameraIdentifier) {
            return new AutoValue_LifecycleCameraRepository_Key(System.identityHashCode(lifecycleOwner), cameraIdentifier);
        }

        public abstract CameraIdentifier getCameraIdentifier();

        public abstract int getLifecycleOwnerHash();
    }

    /* compiled from: WazeSource */
    class LifecycleCameraRepositoryObserver implements LifecycleObserver {
        private final LifecycleCameraRepository mLifecycleCameraRepository;
        private final LifecycleOwner mLifecycleOwner;

        LifecycleCameraRepositoryObserver(LifecycleOwner lifecycleOwner, LifecycleCameraRepository lifecycleCameraRepository) {
            this.mLifecycleOwner = lifecycleOwner;
            this.mLifecycleCameraRepository = lifecycleCameraRepository;
        }

        LifecycleOwner getLifecycleOwner() {
            return this.mLifecycleOwner;
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        public void onDestroy(LifecycleOwner lifecycleOwner) {
            this.mLifecycleCameraRepository.unregisterLifecycle(lifecycleOwner);
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_START)
        public void onStart(LifecycleOwner lifecycleOwner) {
            this.mLifecycleCameraRepository.setActive(lifecycleOwner);
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
        public void onStop(LifecycleOwner lifecycleOwner) {
            this.mLifecycleCameraRepository.setInactive(lifecycleOwner);
        }
    }

    LifecycleCameraRepository(int i2) {
        this.mLock = new Object();
        this.mCameraMap = new HashMap();
        this.mLifecycleObserverMap = new HashMap();
        this.mActiveLifecycleOwners = new ArrayDeque<>();
        this.mDeviceId = i2;
    }

    private LifecycleCameraRepositoryObserver getLifecycleCameraRepositoryObserver(LifecycleOwner lifecycleOwner) {
        synchronized (this.mLock) {
            for (LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver : this.mLifecycleObserverMap.keySet()) {
                if (lifecycleOwner.equals(lifecycleCameraRepositoryObserver.getLifecycleOwner())) {
                    return lifecycleCameraRepositoryObserver;
                }
            }
            return null;
        }
    }

    private boolean hasUseCaseBound(LifecycleOwner lifecycleOwner) {
        synchronized (this.mLock) {
            LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver = getLifecycleCameraRepositoryObserver(lifecycleOwner);
            if (lifecycleCameraRepositoryObserver == null) {
                return false;
            }
            Iterator<Key> it = this.mLifecycleObserverMap.get(lifecycleCameraRepositoryObserver).iterator();
            while (it.hasNext()) {
                LifecycleCamera lifecycleCamera = this.mCameraMap.get(it.next());
                Preconditions.checkNotNull(lifecycleCamera);
                if (!lifecycleCamera.getUseCases().isEmpty()) {
                    return true;
                }
            }
            return false;
        }
    }

    private void pruneStaleLifecycleCameras(LifecycleOwner lifecycleOwner) {
        LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver = getLifecycleCameraRepositoryObserver(lifecycleOwner);
        if (lifecycleCameraRepositoryObserver == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        for (Key key : (Set) Objects.requireNonNull(this.mLifecycleObserverMap.get(lifecycleCameraRepositoryObserver))) {
            LifecycleCamera lifecycleCamera = this.mCameraMap.get(key);
            if (lifecycleCamera != null && lifecycleCamera.getCameraUseCaseAdapter().isRemoved()) {
                hashSet.add(key);
            }
        }
        if (hashSet.isEmpty()) {
            return;
        }
        Logger.w(TAG, "Removing " + hashSet.size() + " stale LifecycleCamera(s).");
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            unregisterCamera((LifecycleCamera) Objects.requireNonNull(this.mCameraMap.get((Key) it.next())));
        }
    }

    private void registerCamera(LifecycleCamera lifecycleCamera) {
        synchronized (this.mLock) {
            LifecycleOwner lifecycleOwner = lifecycleCamera.getLifecycleOwner();
            Key keyCreate = Key.create(lifecycleOwner, lifecycleCamera.getCameraUseCaseAdapter().getAdapterIdentifier());
            LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver = getLifecycleCameraRepositoryObserver(lifecycleOwner);
            Set<Key> hashSet = lifecycleCameraRepositoryObserver != null ? this.mLifecycleObserverMap.get(lifecycleCameraRepositoryObserver) : new HashSet<>();
            hashSet.add(keyCreate);
            this.mCameraMap.put(keyCreate, lifecycleCamera);
            if (lifecycleCameraRepositoryObserver == null) {
                LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver2 = new LifecycleCameraRepositoryObserver(lifecycleOwner, this);
                this.mLifecycleObserverMap.put(lifecycleCameraRepositoryObserver2, hashSet);
                lifecycleOwner.getLifecycle().addObserver(lifecycleCameraRepositoryObserver2);
            }
        }
    }

    private void suspendUseCases(LifecycleOwner lifecycleOwner) {
        synchronized (this.mLock) {
            LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver = getLifecycleCameraRepositoryObserver(lifecycleOwner);
            if (lifecycleCameraRepositoryObserver == null) {
                return;
            }
            Iterator<Key> it = this.mLifecycleObserverMap.get(lifecycleCameraRepositoryObserver).iterator();
            while (it.hasNext()) {
                LifecycleCamera lifecycleCamera = this.mCameraMap.get(it.next());
                Preconditions.checkNotNull(lifecycleCamera);
                lifecycleCamera.suspend();
            }
        }
    }

    private void unregisterCamera(LifecycleCamera lifecycleCamera) {
        synchronized (this.mLock) {
            LifecycleOwner lifecycleOwner = lifecycleCamera.getLifecycleOwner();
            Key keyCreate = Key.create(lifecycleOwner, lifecycleCamera.getCameraUseCaseAdapter().getAdapterIdentifier());
            this.mCameraMap.remove(keyCreate);
            HashSet hashSet = new HashSet();
            for (LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver : this.mLifecycleObserverMap.keySet()) {
                if (lifecycleOwner.equals(lifecycleCameraRepositoryObserver.getLifecycleOwner())) {
                    Set<Key> set = this.mLifecycleObserverMap.get(lifecycleCameraRepositoryObserver);
                    set.remove(keyCreate);
                    if (set.isEmpty()) {
                        hashSet.add(lifecycleCameraRepositoryObserver.getLifecycleOwner());
                    }
                }
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                unregisterLifecycle((LifecycleOwner) it.next());
            }
        }
    }

    private void unsuspendUseCases(LifecycleOwner lifecycleOwner) {
        synchronized (this.mLock) {
            Iterator<Key> it = this.mLifecycleObserverMap.get(getLifecycleCameraRepositoryObserver(lifecycleOwner)).iterator();
            while (it.hasNext()) {
                LifecycleCamera lifecycleCamera = this.mCameraMap.get(it.next());
                Preconditions.checkNotNull(lifecycleCamera);
                if (!lifecycleCamera.getUseCases().isEmpty()) {
                    lifecycleCamera.unsuspend();
                }
            }
        }
    }

    void bindToLifecycleCamera(LifecycleCamera lifecycleCamera, SessionConfig sessionConfig, CameraCoordinator cameraCoordinator) {
        synchronized (this.mLock) {
            Preconditions.checkArgument(!sessionConfig.getUseCases().isEmpty());
            this.mCameraCoordinator = cameraCoordinator;
            LifecycleOwner lifecycleOwner = lifecycleCamera.getLifecycleOwner();
            pruneStaleLifecycleCameras(lifecycleOwner);
            LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver = getLifecycleCameraRepositoryObserver(lifecycleOwner);
            if (lifecycleCameraRepositoryObserver == null) {
                return;
            }
            Set<Key> set = this.mLifecycleObserverMap.get(lifecycleCameraRepositoryObserver);
            CameraCoordinator cameraCoordinator2 = this.mCameraCoordinator;
            if (cameraCoordinator2 == null || cameraCoordinator2.getCameraOperatingMode() != 2) {
                Iterator<Key> it = set.iterator();
                while (it.hasNext()) {
                    LifecycleCamera lifecycleCamera2 = this.mCameraMap.get(it.next());
                    Preconditions.checkNotNull(lifecycleCamera2);
                    if (!lifecycleCamera2.equals(lifecycleCamera) && !lifecycleCamera2.getUseCases().isEmpty()) {
                        if (lifecycleCamera2.isLegacySessionConfigBound() || sessionConfig.isLegacy()) {
                            throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner. Please unbind first.");
                        }
                        lifecycleCamera2.unbindAll();
                    }
                }
            }
            try {
                lifecycleCamera.bind(sessionConfig);
                if (lifecycleOwner.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                    setActive(lifecycleOwner);
                }
            } catch (CameraUseCaseAdapter.CameraException e2) {
                throw new IllegalArgumentException(e2);
            }
        }
    }

    void clear() {
        synchronized (this.mLock) {
            Iterator it = new HashSet(this.mLifecycleObserverMap.keySet()).iterator();
            while (it.hasNext()) {
                unregisterLifecycle(((LifecycleCameraRepositoryObserver) it.next()).getLifecycleOwner());
            }
        }
    }

    LifecycleCamera createLifecycleCamera(LifecycleOwner lifecycleOwner, CameraUseCaseAdapter cameraUseCaseAdapter, RotationProvider rotationProvider) {
        synchronized (this.mLock) {
            Preconditions.checkArgument(this.mCameraMap.get(Key.create(lifecycleOwner, cameraUseCaseAdapter.getAdapterIdentifier())) == null, "LifecycleCamera already exists for the given LifecycleOwner and set of cameras");
            LifecycleCamera lifecycleCamera = new LifecycleCamera(lifecycleOwner, cameraUseCaseAdapter, rotationProvider);
            if (cameraUseCaseAdapter.getUseCases().isEmpty()) {
                lifecycleCamera.suspend();
            }
            if (lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
                return lifecycleCamera;
            }
            registerCamera(lifecycleCamera);
            return lifecycleCamera;
        }
    }

    int getDeviceId() {
        return this.mDeviceId;
    }

    LifecycleCamera getLifecycleCamera(LifecycleOwner lifecycleOwner, CameraIdentifier cameraIdentifier) {
        synchronized (this.mLock) {
            LifecycleCamera lifecycleCamera = this.mCameraMap.get(Key.create(lifecycleOwner, cameraIdentifier));
            if (lifecycleCamera == null || !lifecycleCamera.getCameraUseCaseAdapter().isRemoved()) {
                return lifecycleCamera;
            }
            unregisterCamera(lifecycleCamera);
            return null;
        }
    }

    Collection<LifecycleCamera> getLifecycleCameras() {
        Collection<LifecycleCamera> collectionUnmodifiableCollection;
        synchronized (this.mLock) {
            collectionUnmodifiableCollection = DesugarCollections.unmodifiableCollection(this.mCameraMap.values());
        }
        return collectionUnmodifiableCollection;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0015 A[Catch: all -> 0x0031, TryCatch #0 {, blocks: (B:5:0x0005, B:6:0x000b, B:7:0x000f, B:9:0x0015, B:11:0x0023, B:12:0x002f), top: B:17:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void removeLifecycleCameras(java.util.Set<androidx.camera.lifecycle.LifecycleCameraRepository.Key> r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            if (r4 != 0) goto Lb
            java.util.Map<androidx.camera.lifecycle.LifecycleCameraRepository$Key, androidx.camera.lifecycle.LifecycleCamera> r4 = r3.mCameraMap     // Catch: java.lang.Throwable -> L31
            java.util.Set r4 = r4.keySet()     // Catch: java.lang.Throwable -> L31
        Lb:
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L31
        Lf:
            boolean r1 = r4.hasNext()     // Catch: java.lang.Throwable -> L31
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r4.next()     // Catch: java.lang.Throwable -> L31
            androidx.camera.lifecycle.LifecycleCameraRepository$Key r1 = (androidx.camera.lifecycle.LifecycleCameraRepository.Key) r1     // Catch: java.lang.Throwable -> L31
            java.util.Map<androidx.camera.lifecycle.LifecycleCameraRepository$Key, androidx.camera.lifecycle.LifecycleCamera> r2 = r3.mCameraMap     // Catch: java.lang.Throwable -> L31
            boolean r2 = r2.containsKey(r1)     // Catch: java.lang.Throwable -> L31
            if (r2 == 0) goto Lf
            java.util.Map<androidx.camera.lifecycle.LifecycleCameraRepository$Key, androidx.camera.lifecycle.LifecycleCamera> r2 = r3.mCameraMap     // Catch: java.lang.Throwable -> L31
            java.lang.Object r1 = r2.get(r1)     // Catch: java.lang.Throwable -> L31
            androidx.camera.lifecycle.LifecycleCamera r1 = (androidx.camera.lifecycle.LifecycleCamera) r1     // Catch: java.lang.Throwable -> L31
            r3.unregisterCamera(r1)     // Catch: java.lang.Throwable -> L31
            goto Lf
        L2f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            return
        L31:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.lifecycle.LifecycleCameraRepository.removeLifecycleCameras(java.util.Set):void");
    }

    void setActive(LifecycleOwner lifecycleOwner) {
        synchronized (this.mLock) {
            if (hasUseCaseBound(lifecycleOwner)) {
                if (this.mActiveLifecycleOwners.isEmpty()) {
                    this.mActiveLifecycleOwners.push(lifecycleOwner);
                } else {
                    CameraCoordinator cameraCoordinator = this.mCameraCoordinator;
                    if (cameraCoordinator == null || cameraCoordinator.getCameraOperatingMode() != 2) {
                        LifecycleOwner lifecycleOwnerPeek = this.mActiveLifecycleOwners.peek();
                        if (!lifecycleOwner.equals(lifecycleOwnerPeek)) {
                            suspendUseCases(lifecycleOwnerPeek);
                            this.mActiveLifecycleOwners.remove(lifecycleOwner);
                            this.mActiveLifecycleOwners.push(lifecycleOwner);
                        }
                    }
                }
                unsuspendUseCases(lifecycleOwner);
            }
        }
    }

    void setInactive(LifecycleOwner lifecycleOwner) {
        synchronized (this.mLock) {
            this.mActiveLifecycleOwners.remove(lifecycleOwner);
            suspendUseCases(lifecycleOwner);
            if (!this.mActiveLifecycleOwners.isEmpty()) {
                unsuspendUseCases(this.mActiveLifecycleOwners.peek());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0015 A[Catch: all -> 0x004c, TryCatch #0 {, blocks: (B:5:0x0005, B:6:0x000b, B:7:0x000f, B:9:0x0015, B:11:0x0023, B:13:0x0038, B:15:0x0042, B:16:0x004a), top: B:21:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void unbind(androidx.camera.core.SessionConfig r4, java.util.Set<androidx.camera.lifecycle.LifecycleCameraRepository.Key> r5) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            if (r5 != 0) goto Lb
            java.util.Map<androidx.camera.lifecycle.LifecycleCameraRepository$Key, androidx.camera.lifecycle.LifecycleCamera> r5 = r3.mCameraMap     // Catch: java.lang.Throwable -> L4c
            java.util.Set r5 = r5.keySet()     // Catch: java.lang.Throwable -> L4c
        Lb:
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L4c
        Lf:
            boolean r1 = r5.hasNext()     // Catch: java.lang.Throwable -> L4c
            if (r1 == 0) goto L4a
            java.lang.Object r1 = r5.next()     // Catch: java.lang.Throwable -> L4c
            androidx.camera.lifecycle.LifecycleCameraRepository$Key r1 = (androidx.camera.lifecycle.LifecycleCameraRepository.Key) r1     // Catch: java.lang.Throwable -> L4c
            java.util.Map<androidx.camera.lifecycle.LifecycleCameraRepository$Key, androidx.camera.lifecycle.LifecycleCamera> r2 = r3.mCameraMap     // Catch: java.lang.Throwable -> L4c
            boolean r2 = r2.containsKey(r1)     // Catch: java.lang.Throwable -> L4c
            if (r2 == 0) goto Lf
            java.util.Map<androidx.camera.lifecycle.LifecycleCameraRepository$Key, androidx.camera.lifecycle.LifecycleCamera> r2 = r3.mCameraMap     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r1 = r2.get(r1)     // Catch: java.lang.Throwable -> L4c
            androidx.camera.lifecycle.LifecycleCamera r1 = (androidx.camera.lifecycle.LifecycleCamera) r1     // Catch: java.lang.Throwable -> L4c
            java.util.List r2 = r1.getUseCases()     // Catch: java.lang.Throwable -> L4c
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L4c
            r1.unbind(r4)     // Catch: java.lang.Throwable -> L4c
            if (r2 != 0) goto Lf
            java.util.List r2 = r1.getUseCases()     // Catch: java.lang.Throwable -> L4c
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L4c
            if (r2 == 0) goto Lf
            androidx.lifecycle.LifecycleOwner r1 = r1.getLifecycleOwner()     // Catch: java.lang.Throwable -> L4c
            r3.setInactive(r1)     // Catch: java.lang.Throwable -> L4c
            goto Lf
        L4a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4c
            return
        L4c:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4c
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.lifecycle.LifecycleCameraRepository.unbind(androidx.camera.core.SessionConfig, java.util.Set):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0015 A[Catch: all -> 0x0032, TryCatch #0 {, blocks: (B:5:0x0005, B:6:0x000b, B:7:0x000f, B:9:0x0015, B:11:0x0025, B:12:0x0030), top: B:17:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void unbindAll(java.util.Set<androidx.camera.lifecycle.LifecycleCameraRepository.Key> r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            if (r4 != 0) goto Lb
            java.util.Map<androidx.camera.lifecycle.LifecycleCameraRepository$Key, androidx.camera.lifecycle.LifecycleCamera> r4 = r3.mCameraMap     // Catch: java.lang.Throwable -> L32
            java.util.Set r4 = r4.keySet()     // Catch: java.lang.Throwable -> L32
        Lb:
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L32
        Lf:
            boolean r1 = r4.hasNext()     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L30
            java.lang.Object r1 = r4.next()     // Catch: java.lang.Throwable -> L32
            androidx.camera.lifecycle.LifecycleCameraRepository$Key r1 = (androidx.camera.lifecycle.LifecycleCameraRepository.Key) r1     // Catch: java.lang.Throwable -> L32
            java.util.Map<androidx.camera.lifecycle.LifecycleCameraRepository$Key, androidx.camera.lifecycle.LifecycleCamera> r2 = r3.mCameraMap     // Catch: java.lang.Throwable -> L32
            java.lang.Object r1 = r2.get(r1)     // Catch: java.lang.Throwable -> L32
            androidx.camera.lifecycle.LifecycleCamera r1 = (androidx.camera.lifecycle.LifecycleCamera) r1     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto Lf
            r1.unbindAll()     // Catch: java.lang.Throwable -> L32
            androidx.lifecycle.LifecycleOwner r1 = r1.getLifecycleOwner()     // Catch: java.lang.Throwable -> L32
            r3.setInactive(r1)     // Catch: java.lang.Throwable -> L32
            goto Lf
        L30:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return
        L32:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.lifecycle.LifecycleCameraRepository.unbindAll(java.util.Set):void");
    }

    void unregisterLifecycle(LifecycleOwner lifecycleOwner) {
        synchronized (this.mLock) {
            LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver = getLifecycleCameraRepositoryObserver(lifecycleOwner);
            if (lifecycleCameraRepositoryObserver == null) {
                return;
            }
            setInactive(lifecycleOwner);
            Iterator<Key> it = this.mLifecycleObserverMap.get(lifecycleCameraRepositoryObserver).iterator();
            while (it.hasNext()) {
                this.mCameraMap.remove(it.next());
            }
            this.mLifecycleObserverMap.remove(lifecycleCameraRepositoryObserver);
            lifecycleCameraRepositoryObserver.getLifecycleOwner().getLifecycle().removeObserver(lifecycleCameraRepositoryObserver);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    LifecycleCameraRepository() {
        this(0);
        int i2 = ContextUtil.f1641a;
    }

    void unbindAll() {
        unbindAll(null);
    }

    void unbind(SessionConfig sessionConfig) {
        unbind(sessionConfig, null);
    }
}
