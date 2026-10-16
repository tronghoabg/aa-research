package androidx.camera.camera2.adapter;

import androidx.camera.camera2.impl.Camera2Logger;
import androidx.camera.camera2.internal.CameraCompatibilityFilter;
import androidx.camera.camera2.pipe.CameraDevices;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.CameraPipe;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.core.CameraIdentifier;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.InitializationException;
import androidx.camera.core.Logger;
import androidx.camera.core.concurrent.CameraCoordinator;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.CameraRepository;
import androidx.camera.core.impl.CameraUpdateException;
import androidx.camera.core.impl.InternalCameraPresenceListener;
import h.a.i;
import h.a.r;
import h.g.b.x;
import h.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraCoordinatorAdapter implements CameraCoordinator, InternalCameraPresenceListener {
    private List<? extends CameraInfo> activeConcurrentCameraInfosList;
    private final CameraDevices cameraDevices;
    private CameraPipe cameraPipe;
    private CameraRepository cameraRepository;
    private Map<String, ? extends List<String>> concurrentCameraIdMap;
    private Set<? extends Set<CameraId>> concurrentCameraIdsSet;
    private int concurrentMode;
    private boolean concurrentModeOn;
    private final Object lock;
    private List<String> pendingCameraIds;

    public CameraCoordinatorAdapter(CameraPipe cameraPipe, CameraDevices cameraDevices) {
        x.f(cameraDevices, "cameraDevices");
        this.cameraPipe = cameraPipe;
        this.cameraDevices = cameraDevices;
        this.lock = new Object();
        this.concurrentCameraIdsSet = e.c.d.a.p();
        this.concurrentCameraIdMap = r.j();
        this.activeConcurrentCameraInfosList = i.h();
        this.pendingCameraIds = new ArrayList();
    }

    private final void tryStartConcurrentGraph() {
        CameraInternal camera;
        synchronized (this.lock) {
            if (!this.activeConcurrentCameraInfosList.isEmpty() && !this.pendingCameraIds.isEmpty()) {
                List<? extends CameraInfo> list = this.activeConcurrentCameraInfosList;
                ArrayList arrayList = new ArrayList(i.q(list, 10));
                Iterator<T> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        String strM181getCameraIdzjxgSG8 = CameraInfoAdapter.Companion.m181getCameraIdzjxgSG8((CameraInfo) it.next());
                        CameraId cameraIdM546boximpl = strM181getCameraIdzjxgSG8 != null ? CameraId.m546boximpl(strM181getCameraIdzjxgSG8) : null;
                        if (cameraIdM546boximpl == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        arrayList.add(cameraIdM546boximpl.m553unboximpl());
                    } else if (x.n(i.au(arrayList), i.au(this.pendingCameraIds))) {
                        this.pendingCameraIds.clear();
                        List<? extends CameraInfo> list2 = this.activeConcurrentCameraInfosList;
                        synchronized (this.lock) {
                            CameraRepository cameraRepository = this.cameraRepository;
                            if (cameraRepository == null) {
                                Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
                                if (Logger.isErrorEnabled(Log.TAG)) {
                                    android.util.Log.e(Camera2Logger.TRUNCATED_TAG, "Coordinator has not been initialized with a CameraRepository.");
                                }
                                return;
                            }
                            ArrayList arrayList2 = new ArrayList();
                            Iterator<T> it2 = list2.iterator();
                            while (it2.hasNext()) {
                                try {
                                    String strM181getCameraIdzjxgSG82 = CameraInfoAdapter.Companion.m181getCameraIdzjxgSG8((CameraInfo) it2.next());
                                    x.c(strM181getCameraIdzjxgSG82);
                                    camera = cameraRepository.getCamera(strM181getCameraIdzjxgSG82);
                                } catch (IllegalArgumentException unused) {
                                }
                                CameraInternalAdapter cameraInternalAdapter = camera instanceof CameraInternalAdapter ? (CameraInternalAdapter) camera : null;
                                if (cameraInternalAdapter != null) {
                                    arrayList2.add(cameraInternalAdapter);
                                }
                            }
                            ArrayList arrayList3 = arrayList2;
                            ArrayList arrayList4 = new ArrayList(i.q(arrayList3, 10));
                            Iterator it3 = arrayList3.iterator();
                            while (it3.hasNext()) {
                                CameraGraph.Config deferredCameraGraphConfig$camera_camera2 = ((CameraInternalAdapter) it3.next()).getDeferredCameraGraphConfig$camera_camera2();
                                if (deferredCameraGraphConfig$camera_camera2 == null) {
                                    throw new IllegalStateException("Every CameraInternal instance is expected to have a deferred CameraGraph config");
                                }
                                arrayList4.add(deferredCameraGraphConfig$camera_camera2);
                            }
                            ArrayList arrayList5 = arrayList4;
                            CameraPipe cameraPipe = this.cameraPipe;
                            if (cameraPipe == null) {
                                throw new IllegalStateException("Required value was null.");
                            }
                            List<CameraGraph> listCreateCameraGraphs = cameraPipe.createCameraGraphs(new CameraGraph.ConcurrentConfig(arrayList5));
                            if (listCreateCameraGraphs.size() != arrayList5.size()) {
                                throw new IllegalStateException("Check failed.");
                            }
                            for (k kVar : i.ar(arrayList3, listCreateCameraGraphs)) {
                                ((CameraInternalAdapter) kVar.a()).resumeDeferredCameraGraphCreation$camera_camera2((CameraGraph) kVar.b());
                            }
                            return;
                        }
                    }
                }
            }
        }
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public void addListener(CameraCoordinator.ConcurrentCameraModeListener concurrentCameraModeListener) {
        x.f(concurrentCameraModeListener, "listener");
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public void addPendingCameraInfo(CameraInfo cameraInfo) {
        x.f(cameraInfo, "cameraInfo");
        synchronized (this.lock) {
            if (this.concurrentModeOn) {
                List<String> list = this.pendingCameraIds;
                String strM181getCameraIdzjxgSG8 = CameraInfoAdapter.Companion.m181getCameraIdzjxgSG8(cameraInfo);
                CameraId cameraIdM546boximpl = strM181getCameraIdzjxgSG8 != null ? CameraId.m546boximpl(strM181getCameraIdzjxgSG8) : null;
                if (cameraIdM546boximpl == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                list.add(cameraIdM546boximpl.m553unboximpl());
                tryStartConcurrentGraph();
            }
        }
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public List<CameraInfo> getActiveConcurrentCameraInfos() {
        ArrayList arrayList;
        synchronized (this.lock) {
            arrayList = new ArrayList(this.activeConcurrentCameraInfosList);
        }
        return arrayList;
    }

    public final List<CameraInfo> getActiveConcurrentCameraInfosList() {
        return this.activeConcurrentCameraInfosList;
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public int getCameraOperatingMode() {
        int i2;
        synchronized (this.lock) {
            i2 = this.concurrentMode;
        }
        return i2;
    }

    public final CameraRepository getCameraRepository() {
        return this.cameraRepository;
    }

    public final Map<String, List<String>> getConcurrentCameraIdMap() {
        return this.concurrentCameraIdMap;
    }

    public final Set<Set<CameraId>> getConcurrentCameraIdsSet() {
        return this.concurrentCameraIdsSet;
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public List<List<CameraSelector>> getConcurrentCameraSelectors() {
        List<List<CameraSelector>> listAo;
        synchronized (this.lock) {
            Set<? extends Set<CameraId>> set = this.concurrentCameraIdsSet;
            ArrayList arrayList = new ArrayList(i.q(set, 10));
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                Set set2 = (Set) it.next();
                ArrayList arrayList2 = new ArrayList(i.q(set2, 10));
                Iterator it2 = set2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(CameraSelector.of(CameraIdentifier.Factory.create$default(((CameraId) it2.next()).m553unboximpl(), null, null, 6, null)));
                }
                arrayList.add(i.ao(arrayList2));
            }
            listAo = i.ao(arrayList);
        }
        return listAo;
    }

    public final int getConcurrentMode() {
        return this.concurrentMode;
    }

    public final boolean getConcurrentModeOn() {
        return this.concurrentModeOn;
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public String getPairedConcurrentCameraId(String str) {
        String str2;
        x.f(str, "cameraId");
        synchronized (this.lock) {
            List<String> list = this.concurrentCameraIdMap.get(str);
            str2 = null;
            if (list != null) {
                Iterator<String> it = list.iterator();
                loop0: while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String next = it.next();
                    Iterator<? extends CameraInfo> it2 = this.activeConcurrentCameraInfosList.iterator();
                    while (it2.hasNext()) {
                        String strM181getCameraIdzjxgSG8 = CameraInfoAdapter.Companion.m181getCameraIdzjxgSG8(it2.next());
                        if (strM181getCameraIdzjxgSG8 == null) {
                            strM181getCameraIdzjxgSG8 = null;
                        }
                        if (x.n(next, strM181getCameraIdzjxgSG8)) {
                            str2 = next;
                            break loop0;
                        }
                    }
                }
            }
        }
        return str2;
    }

    public final List<String> getPendingCameraIds() {
        return this.pendingCameraIds;
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public void init(CameraRepository cameraRepository) throws CameraUpdateException {
        ArrayList arrayListH;
        x.f(cameraRepository, "repository");
        synchronized (this.lock) {
            this.cameraRepository = cameraRepository;
        }
        List<CameraId> listAwaitCameraIds = this.cameraDevices.awaitCameraIds();
        if (listAwaitCameraIds != null) {
            List<CameraId> list = listAwaitCameraIds;
            ArrayList arrayList = new ArrayList(i.q(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((CameraId) it.next()).m553unboximpl());
            }
            arrayListH = arrayList;
        } else {
            arrayListH = i.h();
        }
        onCamerasUpdated(arrayListH);
    }

    @Override // androidx.camera.core.impl.InternalCameraPresenceListener
    public void onCamerasUpdated(List<String> list) throws CameraUpdateException {
        x.f(list, "cameraIds");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            Set<Set<CameraId>> setAwaitConcurrentCameraIds = this.cameraDevices.awaitConcurrentCameraIds();
            if (setAwaitConcurrentCameraIds == null) {
                setAwaitConcurrentCameraIds = e.c.d.a.p();
            }
            for (Set<CameraId> set : setAwaitConcurrentCameraIds) {
                Set<CameraId> set2 = set;
                ArrayList arrayList = new ArrayList(i.q(set2, 10));
                Iterator<T> it = set2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((CameraId) it.next()).m553unboximpl());
                }
                Set setAu = i.au(arrayList);
                if (list.containsAll(setAu)) {
                    List listAo = i.ao(set);
                    if (listAo.size() >= 2) {
                        String strM553unboximpl = ((CameraId) listAo.get(0)).m553unboximpl();
                        String strM553unboximpl2 = ((CameraId) listAo.get(1)).m553unboximpl();
                        try {
                            if (CameraCompatibilityFilter.isBackwardCompatible(strM553unboximpl, this.cameraDevices) && CameraCompatibilityFilter.isBackwardCompatible(strM553unboximpl2, this.cameraDevices)) {
                                linkedHashSet.add(set);
                                if (!linkedHashMap.containsKey(strM553unboximpl)) {
                                    linkedHashMap.put(strM553unboximpl, new ArrayList());
                                }
                                Object obj = linkedHashMap.get(strM553unboximpl);
                                x.c(obj);
                                ((List) obj).add(strM553unboximpl2);
                                if (!linkedHashMap.containsKey(strM553unboximpl2)) {
                                    linkedHashMap.put(strM553unboximpl2, new ArrayList());
                                }
                                Object obj2 = linkedHashMap.get(strM553unboximpl2);
                                x.c(obj2);
                                ((List) obj2).add(strM553unboximpl);
                            }
                        } catch (InitializationException e2) {
                            Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
                            if (Logger.isWarnEnabled(Log.TAG)) {
                                android.util.Log.w(Camera2Logger.TRUNCATED_TAG, "Skipping incompatible concurrent pair: " + set + " due to " + e2.getMessage());
                            }
                        }
                    }
                } else {
                    Camera2Logger camera2Logger2 = Camera2Logger.INSTANCE;
                    if (Logger.isWarnEnabled(Log.TAG)) {
                        android.util.Log.w(Camera2Logger.TRUNCATED_TAG, "Failed to retrieve concurrent camera: " + setAu + " from " + list);
                    }
                }
            }
            synchronized (this.lock) {
                this.concurrentCameraIdsSet = linkedHashSet;
                this.concurrentCameraIdMap = linkedHashMap;
            }
        } catch (Exception e3) {
            throw new CameraUpdateException("Failed to retrieve concurrent camera id info for camera-pipe.", e3);
        }
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public void removeListener(CameraCoordinator.ConcurrentCameraModeListener concurrentCameraModeListener) {
        x.f(concurrentCameraModeListener, "listener");
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public void removePendingCameraInfo(CameraInfo cameraInfo) {
        x.f(cameraInfo, "cameraInfo");
        synchronized (this.lock) {
            if (this.concurrentModeOn) {
                List<String> list = this.pendingCameraIds;
                String strM181getCameraIdzjxgSG8 = CameraInfoAdapter.Companion.m181getCameraIdzjxgSG8(cameraInfo);
                CameraId cameraIdM546boximpl = strM181getCameraIdzjxgSG8 != null ? CameraId.m546boximpl(strM181getCameraIdzjxgSG8) : null;
                if (cameraIdM546boximpl == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                list.remove(cameraIdM546boximpl.m553unboximpl());
            }
        }
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public void setActiveConcurrentCameraInfos(List<? extends CameraInfo> list) {
        x.f(list, "cameraInfos");
        synchronized (this.lock) {
            this.activeConcurrentCameraInfosList = list;
            tryStartConcurrentGraph();
        }
    }

    public final void setActiveConcurrentCameraInfosList(List<? extends CameraInfo> list) {
        x.f(list, "<set-?>");
        this.activeConcurrentCameraInfosList = list;
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public void setCameraOperatingMode(int i2) {
        CameraRepository cameraRepository;
        synchronized (this.lock) {
            this.concurrentMode = i2;
            cameraRepository = this.cameraRepository;
        }
        if (cameraRepository == null) {
            return;
        }
        boolean z = i2 == 2;
        this.concurrentModeOn = z;
        if (!z) {
            this.activeConcurrentCameraInfosList = i.h();
        }
        Iterator<CameraInternal> it = cameraRepository.getCameras().iterator();
        x.e(it, "iterator(...)");
        while (it.hasNext()) {
            CameraInternal next = it.next();
            CameraInternalAdapter cameraInternalAdapter = next instanceof CameraInternalAdapter ? (CameraInternalAdapter) next : null;
            if (cameraInternalAdapter != null) {
                if (i2 == 1) {
                    cameraInternalAdapter.setCameraGraphCreationMode$camera_camera2(true);
                } else if (i2 == 2) {
                    cameraInternalAdapter.setCameraGraphCreationMode$camera_camera2(false);
                }
            }
        }
    }

    public final void setCameraRepository(CameraRepository cameraRepository) {
        this.cameraRepository = cameraRepository;
    }

    public final void setConcurrentCameraIdMap(Map<String, ? extends List<String>> map) {
        x.f(map, "<set-?>");
        this.concurrentCameraIdMap = map;
    }

    public final void setConcurrentCameraIdsSet(Set<? extends Set<CameraId>> set) {
        x.f(set, "<set-?>");
        this.concurrentCameraIdsSet = set;
    }

    public final void setConcurrentMode(int i2) {
        this.concurrentMode = i2;
    }

    public final void setConcurrentModeOn(boolean z) {
        this.concurrentModeOn = z;
    }

    public final void setPendingCameraIds(List<String> list) {
        x.f(list, "<set-?>");
        this.pendingCameraIds = list;
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public void shutdown() {
        this.cameraPipe = null;
        this.concurrentModeOn = false;
        synchronized (this.lock) {
            this.cameraRepository = null;
            this.concurrentCameraIdsSet = e.c.d.a.p();
            this.concurrentCameraIdMap = r.j();
            this.activeConcurrentCameraInfosList = i.h();
            this.concurrentMode = 0;
            this.pendingCameraIds.clear();
        }
    }

    public static /* synthetic */ void getActiveConcurrentCameraInfosList$annotations() {
    }

    public static /* synthetic */ void getCameraRepository$annotations() {
    }

    public static /* synthetic */ void getConcurrentCameraIdMap$annotations() {
    }

    public static /* synthetic */ void getConcurrentCameraIdsSet$annotations() {
    }

    public static /* synthetic */ void getConcurrentMode$annotations() {
    }

    public static /* synthetic */ void getConcurrentModeOn$annotations() {
    }
}
