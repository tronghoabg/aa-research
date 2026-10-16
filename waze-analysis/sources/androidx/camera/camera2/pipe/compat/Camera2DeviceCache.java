package androidx.camera.camera2.pipe.compat;

import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Trace;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.compat.Camera2DeviceCache;
import androidx.camera.camera2.pipe.config.CameraPipeContext;
import androidx.camera.camera2.pipe.config.CameraPipeJob;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.internal.CameraErrorListener;
import androidx.camera.camera2.pipe.internal.CameraPipeLifetime;
import androidx.camera.camera2.pipe.internal.CriticalCameraErrorListener;
import androidx.camera.featurecombinationquery.CameraDeviceSetupCompat;
import androidx.camera.featurecombinationquery.CameraDeviceSetupCompatFactory;
import h.a.i;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.a.ab;
import kotlinx.coroutines.a.ad;
import kotlinx.coroutines.a.s;
import kotlinx.coroutines.a.t;
import kotlinx.coroutines.ae;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.am;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.by;
import kotlinx.coroutines.b.bz;
import kotlinx.coroutines.b.k;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Camera2DeviceCache implements CriticalCameraErrorListener {
    private static final long CRITICAL_CAMERA_ERROR_READ_CAMERA_ID_INTERVAL;
    public static final int CRITICAL_CAMERA_ERROR_READ_CAMERA_ID_RETRY_COUNT = 3;
    public static final Companion Companion = new Companion(null);
    private final Map<CameraId, am<Camera2DeviceSetupWrapper>> camera2DeviceSetupWrapperCache;
    private final Map<CameraId, am<CameraDeviceSetupCompat>> cameraDeviceSetupCache;
    private final h.f cameraDeviceSetupCompatFactory$delegate;
    private final g.a.a<CameraDeviceSetupCompatFactory> cameraDeviceSetupCompatFactoryProvider;
    private final CameraErrorListener cameraErrorListener;
    private final k<List<CameraId>> cameraIds;
    private final g.a.a<CameraManager> cameraManager;
    private Set<? extends Set<CameraId>> concurrentCameras;
    private final Context context;
    private final Object lock;
    private final Camera2MetadataProvider metadataProvider;
    private final int minimumCameraCount;
    private List<CameraId> openableCameras;
    private final af scope;
    private final Threads threads;

    static {
        h.o.c cVar = h.o.a.f48264a;
        CRITICAL_CAMERA_ERROR_READ_CAMERA_ID_INTERVAL = h.o.c.i(300, h.o.d.f48272c);
    }

    public Camera2DeviceCache(g.a.a<CameraManager> aVar, Camera2MetadataProvider camera2MetadataProvider, Threads threads, @CameraPipeContext Context context, PackageManager packageManager, CameraErrorListener cameraErrorListener, g.a.a<CameraDeviceSetupCompatFactory> aVar2, CameraPipeLifetime cameraPipeLifetime, @CameraPipeJob br brVar) {
        x.f(aVar, "cameraManager");
        x.f(camera2MetadataProvider, "metadataProvider");
        x.f(threads, "threads");
        x.f(context, "context");
        x.f(packageManager, "packageManager");
        x.f(cameraErrorListener, "cameraErrorListener");
        x.f(aVar2, "cameraDeviceSetupCompatFactoryProvider");
        x.f(cameraPipeLifetime, "cameraPipeLifetime");
        x.f(brVar, "cameraPipeJob");
        this.cameraManager = aVar;
        this.metadataProvider = camera2MetadataProvider;
        this.threads = threads;
        this.context = context;
        this.cameraErrorListener = cameraErrorListener;
        this.cameraDeviceSetupCompatFactoryProvider = aVar2;
        af afVarE = aj.e(aj.P(brVar).plus(threads.getLightweightDispatcher()).plus(new ae("Camera2DeviceCache")));
        this.scope = afVarE;
        this.lock = new Object();
        this.cameraDeviceSetupCache = new LinkedHashMap();
        this.camera2DeviceSetupWrapperCache = new LinkedHashMap();
        this.minimumCameraCount = estimateMinInternalCameraCount(packageManager);
        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
            android.util.Log.d(Log.TAG, "Camera2DeviceCache: Expected minimum camera count = " + this.minimumCameraCount);
        }
        cameraPipeLifetime.addShutdownAction(CameraPipeLifetime.ShutdownType.SCOPE, new Runnable() { // from class: androidx.camera.camera2.pipe.compat.Camera2DeviceCache$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                aj.h(this.f$0.scope, null);
            }
        });
        k kVarY = ai.y(createCameraIdListFlow());
        int i2 = bz.f51630a;
        this.cameraIds = ai.aa(kVarY, afVarE, by.a(0L, 3));
        this.cameraDeviceSetupCompatFactory$delegate = h.g.a(new h.g.a.a() { // from class: androidx.camera.camera2.pipe.compat.Camera2DeviceCache$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return this.f$0.cameraDeviceSetupCompatFactoryProvider.get();
            }
        });
    }

    private final k<List<CameraId>> createCameraIdListFlow() {
        return ai.n(new AnonymousClass1(null));
    }

    private final int estimateMinInternalCameraCount(PackageManager packageManager) {
        boolean zHasSystemFeature = packageManager.hasSystemFeature("android.hardware.camera");
        return packageManager.hasSystemFeature("android.hardware.camera.front") ? (zHasSystemFeature ? 1 : 0) + 1 : zHasSystemFeature ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CameraDeviceSetupCompatFactory getCameraDeviceSetupCompatFactory() {
        return (CameraDeviceSetupCompatFactory) this.cameraDeviceSetupCompatFactory$delegate.getValue();
    }

    private final List<CameraId> getUpdatedCameraIds(List<CameraId> list, List<CameraId> list2) {
        return (list2 == null || !(isValidCameraIds(list2) || list == null)) ? list : list2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: isExternalCamera-0r8Bogc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1017isExternalCamera0r8Bogc(java.lang.String r5, h.c.e<? super java.lang.Boolean> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.camera.camera2.pipe.compat.Camera2DeviceCache$isExternalCamera$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.camera.camera2.pipe.compat.Camera2DeviceCache$isExternalCamera$1 r0 = (androidx.camera.camera2.pipe.compat.Camera2DeviceCache$isExternalCamera$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.camera.camera2.pipe.compat.Camera2DeviceCache$isExternalCamera$1 r0 = new androidx.camera.camera2.pipe.compat.Camera2DeviceCache$isExternalCamera$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r6)
            goto L3c
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            e.b.c.b(r6)
            androidx.camera.camera2.pipe.compat.Camera2MetadataProvider r4 = r4.metadataProvider
            r0.label = r3
            java.lang.Object r6 = r4.mo1049getCameraMetadata0r8Bogc(r5, r0)
            if (r6 == r1) goto L5c
        L3c:
            androidx.camera.camera2.pipe.CameraMetadata r6 = (androidx.camera.camera2.pipe.CameraMetadata) r6
            android.hardware.camera2.CameraCharacteristics$Key r4 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.String r5 = "LENS_FACING"
            h.g.b.x.e(r4, r5)
            java.lang.Object r4 = r6.get(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            r5 = 0
            if (r4 != 0) goto L50
        L4e:
            r3 = r5
            goto L57
        L50:
            int r4 = r4.intValue()
            r6 = 2
            if (r4 != r6) goto L4e
        L57:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            return r4
        L5c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.compat.Camera2DeviceCache.m1017isExternalCamera0r8Bogc(java.lang.String, h.c.e):java.lang.Object");
    }

    private final boolean isValidCameraIds(List<CameraId> list) {
        return list.size() >= this.minimumCameraCount;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCameraAvailabilityChanged(ad<? super List<CameraId>> adVar, String str, boolean z) throws CameraAccessException {
        List<CameraId> list;
        synchronized (this.lock) {
            list = this.openableCameras;
        }
        List<CameraId> cameraIds = null;
        if (z) {
            if (list != null) {
                List<CameraId> list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        if (x.n(((CameraId) it.next()).m553unboximpl(), str)) {
                            break;
                        }
                    }
                }
            } else {
                list = null;
            }
            if (Log.INSTANCE.getINFO_LOGGABLE()) {
                android.util.Log.i(Log.TAG, b.a(str, "New camera ", " detected"));
            }
            cameraIds = readCameraIds();
        } else {
            if (list != null) {
                List<CameraId> list3 = list;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator<T> it2 = list3.iterator();
                    while (it2.hasNext()) {
                        if (x.n(((CameraId) it2.next()).m553unboximpl(), str)) {
                        }
                    }
                }
            } else {
                list = null;
            }
            if (Log.INSTANCE.getINFO_LOGGABLE()) {
                android.util.Log.i(Log.TAG, b.a(str, "Unavailable camera ", " detected"));
            }
            cameraIds = readCameraIds();
        }
        List<CameraId> updatedCameraIds = getUpdatedCameraIds(list, cameraIds);
        if (updatedCameraIds != null) {
            sendCameraIdList(adVar, updatedCameraIds);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<CameraId> readCameraIds() throws CameraAccessException {
        try {
            String[] cameraIdList = this.cameraManager.get().getCameraIdList();
            x.e(cameraIdList, "getCameraIdList(...)");
            ArrayList arrayList = new ArrayList();
            int length = cameraIdList.length;
            for (int i2 = 0; i2 < length; i2++) {
                String str = cameraIdList[i2];
                x.c(str);
                CameraId.m547constructorimpl(str);
                CameraId cameraIdM546boximpl = str != null ? CameraId.m546boximpl(str) : null;
                if (cameraIdM546boximpl != null) {
                    arrayList.add(cameraIdM546boximpl);
                }
            }
            ArrayList arrayList2 = arrayList;
            if (isValidCameraIds(arrayList2)) {
                synchronized (this.lock) {
                    this.openableCameras = arrayList2;
                }
                if (Log.INSTANCE.getINFO_LOGGABLE()) {
                    arrayList2.toString();
                    android.util.Log.i(Log.TAG, "Loaded CameraIdList ".concat(arrayList2.toString()));
                    return arrayList2;
                }
            } else if (Log.INSTANCE.getWARN_LOGGABLE()) {
                android.util.Log.w(Log.TAG, a.a(arrayList2, "Failed to query camera ID list: Invalid list returned: ", "."));
            }
            return arrayList2;
        } catch (CameraAccessException e2) {
            CameraAccessException cameraAccessException = e2;
            if (Log.INSTANCE.getWARN_LOGGABLE()) {
                android.util.Log.w(Log.TAG, "Failed to query CameraManager#getCameraIdList!", cameraAccessException);
            }
            return null;
        } catch (ArrayIndexOutOfBoundsException e3) {
            ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = e3;
            if (Log.INSTANCE.getWARN_LOGGABLE()) {
                android.util.Log.w(Log.TAG, "Failed to query CameraManager#getCameraIdList!Unexpected ArrayIndexOutOfBoundsException thrown by framework.", arrayIndexOutOfBoundsException);
            }
            return null;
        } catch (NullPointerException e4) {
            NullPointerException nullPointerException = e4;
            if (Log.INSTANCE.getWARN_LOGGABLE()) {
                android.util.Log.w(Log.TAG, "Failed to query CameraManager#getCameraIdList!Null was returned by framework.", nullPointerException);
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendCameraIdList(ad<? super List<CameraId>> adVar, List<CameraId> list) {
        Object objE = ab.e(adVar, list);
        if (objE instanceof s) {
            t.d(objE);
            if (Log.INSTANCE.getERROR_LOGGABLE()) {
                android.util.Log.e(Log.TAG, a.a(list, "Failed to send camera ID list: ", "!"));
            }
        }
    }

    public final List<CameraId> awaitCameraIds() {
        List<CameraId> list;
        synchronized (this.lock) {
            list = this.openableCameras;
        }
        return list != null ? list : readCameraIds();
    }

    public final Set<Set<CameraId>> awaitConcurrentCameraIds() {
        Set set;
        if (Build.VERSION.SDK_INT < 30) {
            return e.c.d.a.p();
        }
        synchronized (this.lock) {
            set = this.concurrentCameras;
        }
        Set set2 = set;
        if (set2 != null && !set2.isEmpty()) {
            return set;
        }
        CameraManager cameraManager = this.cameraManager.get();
        try {
            x.c(cameraManager);
            Set<Set<String>> concurrentCameraIds = Api30Compat.getConcurrentCameraIds(cameraManager);
            if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                android.util.Log.d(Log.TAG, "Loaded ConcurrentCameraIdsSet " + concurrentCameraIds);
            }
            Set<Set<String>> set3 = concurrentCameraIds;
            ArrayList arrayList = new ArrayList(i.q(set3, 10));
            Iterator<T> it = set3.iterator();
            while (it.hasNext()) {
                Set<String> set4 = (Set) it.next();
                ArrayList arrayList2 = new ArrayList(i.q(set4, 10));
                for (String str : set4) {
                    CameraId.m547constructorimpl(str);
                    arrayList2.add(CameraId.m546boximpl(str));
                }
                arrayList.add(i.au(arrayList2));
            }
            return i.au(arrayList);
        } catch (CameraAccessException e2) {
            CameraAccessException cameraAccessException = e2;
            if (!Log.INSTANCE.getWARN_LOGGABLE()) {
                return null;
            }
            android.util.Log.w(Log.TAG, "Failed to query CameraManager#getConcurrentStreamingCameraIds", cameraAccessException);
            return null;
        }
    }

    public final Object getCameraIds(h.c.e<? super List<CameraId>> eVar) {
        List<CameraId> list;
        synchronized (this.lock) {
            list = this.openableCameras;
        }
        return list != null ? list : aj.v(this.threads.getBackgroundDispatcher(), new AnonymousClass2(null), eVar);
    }

    public final Object getConcurrentCameraIds(h.c.e<? super Set<? extends Set<CameraId>>> eVar) {
        Set<? extends Set<CameraId>> set;
        synchronized (this.lock) {
            set = this.concurrentCameras;
        }
        Set<? extends Set<CameraId>> set2 = set;
        return (set2 == null || set2.isEmpty()) ? aj.v(this.threads.getBackgroundDispatcher(), new C01572(null), eVar) : set;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: getOrInitializeDeviceSetupCompat-0r8Bogc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1018getOrInitializeDeviceSetupCompat0r8Bogc(java.lang.String r11, h.c.e<? super androidx.camera.featurecombinationquery.CameraDeviceSetupCompat> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof androidx.camera.camera2.pipe.compat.Camera2DeviceCache$getOrInitializeDeviceSetupCompat$1
            if (r0 == 0) goto L13
            r0 = r12
            androidx.camera.camera2.pipe.compat.Camera2DeviceCache$getOrInitializeDeviceSetupCompat$1 r0 = (androidx.camera.camera2.pipe.compat.Camera2DeviceCache$getOrInitializeDeviceSetupCompat$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.camera.camera2.pipe.compat.Camera2DeviceCache$getOrInitializeDeviceSetupCompat$1 r0 = new androidx.camera.camera2.pipe.compat.Camera2DeviceCache$getOrInitializeDeviceSetupCompat$1
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r11 = r0.L$1
            kotlinx.coroutines.am r11 = (kotlinx.coroutines.am) r11
            java.lang.Object r0 = r0.L$0
            java.lang.String r0 = (java.lang.String) r0
            e.b.c.b(r12)
            r2 = r11
            r11 = r0
            goto L7c
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L39:
            e.b.c.b(r12)
            int r12 = android.os.Build.VERSION.SDK_INT
            r2 = 35
            r4 = 0
            if (r12 >= r2) goto L44
            return r4
        L44:
            java.lang.Object r12 = r10.lock
            monitor-enter(r12)
            java.util.Map<androidx.camera.camera2.pipe.CameraId, kotlinx.coroutines.am<androidx.camera.featurecombinationquery.CameraDeviceSetupCompat>> r2 = r10.cameraDeviceSetupCache     // Catch: java.lang.Throwable -> Laa
            androidx.camera.camera2.pipe.CameraId r5 = androidx.camera.camera2.pipe.CameraId.m546boximpl(r11)     // Catch: java.lang.Throwable -> Laa
            java.lang.Object r6 = r2.get(r5)     // Catch: java.lang.Throwable -> Laa
            if (r6 != 0) goto L6c
            kotlinx.coroutines.af r6 = r10.scope     // Catch: java.lang.Throwable -> Laa
            androidx.camera.camera2.pipe.core.Threads r7 = r10.threads     // Catch: java.lang.Throwable -> Laa
            kotlinx.coroutines.ab r7 = r7.getBackgroundDispatcher()     // Catch: java.lang.Throwable -> Laa
            h.c.j r7 = (h.c.j) r7     // Catch: java.lang.Throwable -> Laa
            androidx.camera.camera2.pipe.compat.Camera2DeviceCache$getOrInitializeDeviceSetupCompat$deferred$1$1$1 r8 = new androidx.camera.camera2.pipe.compat.Camera2DeviceCache$getOrInitializeDeviceSetupCompat$deferred$1$1$1     // Catch: java.lang.Throwable -> Laa
            r8.<init>(r11, r10, r4)     // Catch: java.lang.Throwable -> Laa
            h.g.a.p r8 = (h.g.a.p) r8     // Catch: java.lang.Throwable -> Laa
            r9 = 2
            kotlinx.coroutines.am r6 = kotlinx.coroutines.aj.y(r6, r7, r4, r8, r9)     // Catch: java.lang.Throwable -> Laa
            r2.put(r5, r6)     // Catch: java.lang.Throwable -> Laa
        L6c:
            r2 = r6
            kotlinx.coroutines.am r2 = (kotlinx.coroutines.am) r2     // Catch: java.lang.Throwable -> Laa
            monitor-exit(r12)
            r0.L$0 = r11
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r12 = r2.c(r0)
            if (r12 == r1) goto La9
        L7c:
            androidx.camera.featurecombinationquery.CameraDeviceSetupCompat r12 = (androidx.camera.featurecombinationquery.CameraDeviceSetupCompat) r12
            if (r12 != 0) goto La8
            androidx.camera.camera2.pipe.core.Log r0 = androidx.camera.camera2.pipe.core.Log.INSTANCE
            boolean r0 = r0.getDEBUG_LOGGABLE()
            if (r0 == 0) goto L97
            java.lang.String r0 = androidx.camera.camera2.pipe.CameraId.m552toStringimpl(r11)
            java.lang.String r1 = "Removing null CameraDeviceSetupCompat from cache for "
            java.lang.String r3 = "CXCP"
            java.lang.String r0 = r1.concat(r0)
            android.util.Log.d(r3, r0)
        L97:
            java.lang.Object r0 = r10.lock
            monitor-enter(r0)
            java.util.Map<androidx.camera.camera2.pipe.CameraId, kotlinx.coroutines.am<androidx.camera.featurecombinationquery.CameraDeviceSetupCompat>> r10 = r10.cameraDeviceSetupCache     // Catch: java.lang.Throwable -> La5
            androidx.camera.camera2.pipe.CameraId r11 = androidx.camera.camera2.pipe.CameraId.m546boximpl(r11)     // Catch: java.lang.Throwable -> La5
            j$.util.Map.EL.remove(r10, r11, r2)     // Catch: java.lang.Throwable -> La5
            monitor-exit(r0)
            return r12
        La5:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        La8:
            return r12
        La9:
            return r1
        Laa:
            r10 = move-exception
            monitor-exit(r12)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.compat.Camera2DeviceCache.m1018getOrInitializeDeviceSetupCompat0r8Bogc(java.lang.String, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: getOrInitializeDeviceSetupWrapper-0r8Bogc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1019getOrInitializeDeviceSetupWrapper0r8Bogc(java.lang.String r11, h.c.e<? super androidx.camera.camera2.pipe.compat.Camera2DeviceSetupWrapper> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof androidx.camera.camera2.pipe.compat.Camera2DeviceCache$getOrInitializeDeviceSetupWrapper$1
            if (r0 == 0) goto L13
            r0 = r12
            androidx.camera.camera2.pipe.compat.Camera2DeviceCache$getOrInitializeDeviceSetupWrapper$1 r0 = (androidx.camera.camera2.pipe.compat.Camera2DeviceCache$getOrInitializeDeviceSetupWrapper$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.camera.camera2.pipe.compat.Camera2DeviceCache$getOrInitializeDeviceSetupWrapper$1 r0 = new androidx.camera.camera2.pipe.compat.Camera2DeviceCache$getOrInitializeDeviceSetupWrapper$1
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r11 = r0.L$1
            kotlinx.coroutines.am r11 = (kotlinx.coroutines.am) r11
            java.lang.Object r0 = r0.L$0
            java.lang.String r0 = (java.lang.String) r0
            e.b.c.b(r12)
            r2 = r11
            r11 = r0
            goto L75
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L39:
            e.b.c.b(r12)
            java.lang.Object r12 = r10.lock
            monitor-enter(r12)
            java.util.Map<androidx.camera.camera2.pipe.CameraId, kotlinx.coroutines.am<androidx.camera.camera2.pipe.compat.Camera2DeviceSetupWrapper>> r2 = r10.camera2DeviceSetupWrapperCache     // Catch: java.lang.Throwable -> La3
            androidx.camera.camera2.pipe.CameraId r4 = androidx.camera.camera2.pipe.CameraId.m546boximpl(r11)     // Catch: java.lang.Throwable -> La3
            java.lang.Object r5 = r2.get(r4)     // Catch: java.lang.Throwable -> La3
            if (r5 != 0) goto L65
            kotlinx.coroutines.af r5 = r10.scope     // Catch: java.lang.Throwable -> La3
            androidx.camera.camera2.pipe.core.Threads r6 = r10.threads     // Catch: java.lang.Throwable -> La3
            kotlinx.coroutines.ab r6 = r6.getBackgroundDispatcher()     // Catch: java.lang.Throwable -> La3
            h.c.j r6 = (h.c.j) r6     // Catch: java.lang.Throwable -> La3
            androidx.camera.camera2.pipe.compat.Camera2DeviceCache$getOrInitializeDeviceSetupWrapper$deferred$1$1$1 r7 = new androidx.camera.camera2.pipe.compat.Camera2DeviceCache$getOrInitializeDeviceSetupWrapper$deferred$1$1$1     // Catch: java.lang.Throwable -> La3
            r8 = 0
            r7.<init>(r11, r10, r8)     // Catch: java.lang.Throwable -> La3
            h.g.a.p r7 = (h.g.a.p) r7     // Catch: java.lang.Throwable -> La3
            r9 = 2
            kotlinx.coroutines.am r5 = kotlinx.coroutines.aj.y(r5, r6, r8, r7, r9)     // Catch: java.lang.Throwable -> La3
            r2.put(r4, r5)     // Catch: java.lang.Throwable -> La3
        L65:
            r2 = r5
            kotlinx.coroutines.am r2 = (kotlinx.coroutines.am) r2     // Catch: java.lang.Throwable -> La3
            monitor-exit(r12)
            r0.L$0 = r11
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r12 = r2.c(r0)
            if (r12 == r1) goto La2
        L75:
            androidx.camera.camera2.pipe.compat.Camera2DeviceSetupWrapper r12 = (androidx.camera.camera2.pipe.compat.Camera2DeviceSetupWrapper) r12
            if (r12 != 0) goto La1
            androidx.camera.camera2.pipe.core.Log r0 = androidx.camera.camera2.pipe.core.Log.INSTANCE
            boolean r0 = r0.getDEBUG_LOGGABLE()
            if (r0 == 0) goto L90
            java.lang.String r0 = androidx.camera.camera2.pipe.CameraId.m552toStringimpl(r11)
            java.lang.String r1 = "Removing null camera2DeviceSetupWrapper from cache for "
            java.lang.String r3 = "CXCP"
            java.lang.String r0 = r1.concat(r0)
            android.util.Log.d(r3, r0)
        L90:
            java.lang.Object r0 = r10.lock
            monitor-enter(r0)
            java.util.Map<androidx.camera.camera2.pipe.CameraId, kotlinx.coroutines.am<androidx.camera.camera2.pipe.compat.Camera2DeviceSetupWrapper>> r10 = r10.camera2DeviceSetupWrapperCache     // Catch: java.lang.Throwable -> L9e
            androidx.camera.camera2.pipe.CameraId r11 = androidx.camera.camera2.pipe.CameraId.m546boximpl(r11)     // Catch: java.lang.Throwable -> L9e
            j$.util.Map.EL.remove(r10, r11, r2)     // Catch: java.lang.Throwable -> L9e
            monitor-exit(r0)
            return r12
        L9e:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        La1:
            return r12
        La2:
            return r1
        La3:
            r10 = move-exception
            monitor-exit(r12)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.compat.Camera2DeviceCache.m1019getOrInitializeDeviceSetupWrapper0r8Bogc(java.lang.String, h.c.e):java.lang.Object");
    }

    @Override // androidx.camera.camera2.pipe.internal.CriticalCameraErrorListener
    /* renamed from: onCriticalCameraError-EfqyGwQ, reason: not valid java name */
    public void mo1020onCriticalCameraErrorEfqyGwQ(String str) {
        x.f(str, "cameraId");
        if (Build.VERSION.SDK_INT <= 36) {
            aj.z(this.scope, null, null, new Camera2DeviceCache$onCriticalCameraError$1(this, str, null), 3);
        }
    }

    public final void shutdown() {
        aj.h(this.scope, null);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getCRITICAL_CAMERA_ERROR_READ_CAMERA_ID_INTERVAL-UwyO8pc, reason: not valid java name */
        public final long m1021getCRITICAL_CAMERA_ERROR_READ_CAMERA_ID_INTERVALUwyO8pc() {
            return Camera2DeviceCache.CRITICAL_CAMERA_ERROR_READ_CAMERA_ID_INTERVAL;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.compat.Camera2DeviceCache$createCameraIdListFlow$1, reason: invalid class name */
    final class AnonymousClass1 extends h.c.b.a.g implements p<ad<? super List<? extends CameraId>>, h.c.e<? super h.ab>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(h.c.e<? super AnonymousClass1> eVar) {
            super(2, eVar);
        }

        static final h.ab invokeSuspend$lambda$1(CameraManager cameraManager, Camera2DeviceCache$createCameraIdListFlow$1$callback$1 camera2DeviceCache$createCameraIdListFlow$1$callback$1) {
            cameraManager.unregisterAvailabilityCallback(camera2DeviceCache$createCameraIdListFlow$1$callback$1);
            return h.ab.f48028a;
        }

        @Override // h.c.b.a.a
        public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
            AnonymousClass1 anonymousClass1 = Camera2DeviceCache.this.new AnonymousClass1(eVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(ad<? super List<CameraId>> adVar, h.c.e<? super h.ab> eVar) {
            return ((AnonymousClass1) create(adVar, eVar)).invokeSuspend(h.ab.f48028a);
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [androidx.camera.camera2.pipe.compat.Camera2DeviceCache$createCameraIdListFlow$1$callback$1] */
        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) throws CameraAccessException {
            List list;
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                e.b.c.b(obj);
                final ad adVar = (ad) this.L$0;
                final Camera2DeviceCache camera2DeviceCache = Camera2DeviceCache.this;
                final ?? r3 = new CameraManager.AvailabilityCallback() { // from class: androidx.camera.camera2.pipe.compat.Camera2DeviceCache$createCameraIdListFlow$1$callback$1
                    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
                    public void onCameraAvailable(String str) throws CameraAccessException {
                        x.f(str, "cameraId");
                        camera2DeviceCache.onCameraAvailabilityChanged(adVar, str, true);
                    }

                    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
                    public void onCameraUnavailable(String str) throws CameraAccessException {
                        x.f(str, "cameraId");
                        camera2DeviceCache.onCameraAvailabilityChanged(adVar, str, false);
                    }
                };
                final CameraManager cameraManager = (CameraManager) Camera2DeviceCache.this.cameraManager.get();
                cameraManager.registerAvailabilityCallback((CameraManager.AvailabilityCallback) r3, Camera2DeviceCache.this.threads.getCamera2Handler());
                Camera2DeviceCache camera2DeviceCache2 = Camera2DeviceCache.this;
                synchronized (camera2DeviceCache2.lock) {
                    list = camera2DeviceCache2.openableCameras;
                }
                Camera2DeviceCache camera2DeviceCache3 = Camera2DeviceCache.this;
                if (list != null) {
                    camera2DeviceCache3.sendCameraIdList(adVar, list);
                } else {
                    List cameraIds = camera2DeviceCache3.readCameraIds();
                    if (cameraIds != null) {
                        Camera2DeviceCache.this.sendCameraIdList(adVar, cameraIds);
                    }
                }
                this.label = 1;
                if (ab.a(adVar, new h.g.a.a() { // from class: androidx.camera.camera2.pipe.compat.Camera2DeviceCache$createCameraIdListFlow$1$$ExternalSyntheticLambda0
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return Camera2DeviceCache.AnonymousClass1.invokeSuspend$lambda$1(cameraManager, r3);
                    }
                }, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.b.c.b(obj);
            }
            return h.ab.f48028a;
        }

        @Override // h.g.a.p
        public /* bridge */ /* synthetic */ Object invoke(ad<? super List<? extends CameraId>> adVar, h.c.e<? super h.ab> eVar) {
            return invoke2((ad<? super List<CameraId>>) adVar, eVar);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.compat.Camera2DeviceCache$getCameraIds$2, reason: invalid class name */
    final class AnonymousClass2 extends h.c.b.a.g implements p<af, h.c.e<? super List<? extends CameraId>>, Object> {
        int label;

        AnonymousClass2(h.c.e<? super AnonymousClass2> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
            return Camera2DeviceCache.this.new AnonymousClass2(eVar);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(af afVar, h.c.e<? super List<CameraId>> eVar) {
            return ((AnonymousClass2) create(afVar, eVar)).invokeSuspend(h.ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.b.c.b(obj);
            Camera2DeviceCache camera2DeviceCache = Camera2DeviceCache.this;
            try {
                Trace.beginSection("readCameraIds");
                List cameraIds = camera2DeviceCache.readCameraIds();
                if (cameraIds == null) {
                    cameraIds = i.h();
                }
                return cameraIds;
            } finally {
                Trace.endSection();
            }
        }

        @Override // h.g.a.p
        public /* bridge */ /* synthetic */ Object invoke(af afVar, h.c.e<? super List<? extends CameraId>> eVar) {
            return invoke2(afVar, (h.c.e<? super List<CameraId>>) eVar);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.compat.Camera2DeviceCache$getConcurrentCameraIds$2, reason: invalid class name and case insensitive filesystem */
    final class C01572 extends h.c.b.a.g implements p<af, h.c.e<? super Set<? extends Set<? extends CameraId>>>, Object> {
        int label;

        C01572(h.c.e<? super C01572> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
            return Camera2DeviceCache.this.new C01572(eVar);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(af afVar, h.c.e<? super Set<? extends Set<CameraId>>> eVar) {
            return ((C01572) create(afVar, eVar)).invokeSuspend(h.ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.b.c.b(obj);
            Camera2DeviceCache camera2DeviceCache = Camera2DeviceCache.this;
            try {
                Trace.beginSection("readConcurrentCameraIds");
                Set<Set<CameraId>> setAwaitConcurrentCameraIds = camera2DeviceCache.awaitConcurrentCameraIds();
                Set<Set<CameraId>> set = setAwaitConcurrentCameraIds;
                if (set == null || set.isEmpty()) {
                    setAwaitConcurrentCameraIds = e.c.d.a.p();
                } else {
                    synchronized (camera2DeviceCache.lock) {
                        camera2DeviceCache.concurrentCameras = setAwaitConcurrentCameraIds;
                    }
                }
                return setAwaitConcurrentCameraIds;
            } finally {
                Trace.endSection();
            }
        }

        @Override // h.g.a.p
        public /* bridge */ /* synthetic */ Object invoke(af afVar, h.c.e<? super Set<? extends Set<? extends CameraId>>> eVar) {
            return invoke2(afVar, (h.c.e<? super Set<? extends Set<CameraId>>>) eVar);
        }
    }

    public final k<List<CameraId>> getCameraIds() {
        return this.cameraIds;
    }
}
