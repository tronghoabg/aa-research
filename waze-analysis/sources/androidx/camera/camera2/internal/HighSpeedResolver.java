package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Range;
import android.util.Size;
import androidx.camera.camera2.compat.StreamConfigurationMapCompat;
import androidx.camera.camera2.compat.workaround.OutputSizesCorrector;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.AttachedSurfaceInfo;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.internal.utils.SizeUtil;
import e.b.c;
import h.a.i;
import h.a.r;
import h.f;
import h.g;
import h.g.a.a;
import h.g.b.o;
import h.g.b.x;
import h.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class HighSpeedResolver {
    public static final Companion Companion = new Companion(null);
    private static final Range<Integer> DEFAULT_FPS;
    private static final String TAG = "HighSpeedResolver";
    private final CameraMetadata cameraMetadata;
    private final f isHighSpeedSupported$delegate;
    private final f maxSize$delegate;
    private final f streamConfigurationMapCompat$delegate;
    private final f supportedSizes$delegate;

    static {
        Integer num = (Comparable) 120;
        DEFAULT_FPS = new Range<>(num, num);
    }

    public HighSpeedResolver(CameraMetadata cameraMetadata) {
        x.f(cameraMetadata, "cameraMetadata");
        this.cameraMetadata = cameraMetadata;
        this.isHighSpeedSupported$delegate = g.a(new a() { // from class: androidx.camera.camera2.internal.HighSpeedResolver$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(HighSpeedResolver.isHighSpeedSupported_delegate$lambda$0(this.f$0));
            }
        });
        this.maxSize$delegate = g.a(new a() { // from class: androidx.camera.camera2.internal.HighSpeedResolver$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return HighSpeedResolver.maxSize_delegate$lambda$0(this.f$0);
            }
        });
        this.streamConfigurationMapCompat$delegate = g.a(new a() { // from class: androidx.camera.camera2.internal.HighSpeedResolver$$ExternalSyntheticLambda2
            @Override // h.g.a.a
            public final Object invoke() {
                return HighSpeedResolver.streamConfigurationMapCompat_delegate$lambda$0(this.f$0);
            }
        });
        this.supportedSizes$delegate = g.a(new a() { // from class: androidx.camera.camera2.internal.HighSpeedResolver$$ExternalSyntheticLambda3
            @Override // h.g.a.a
            public final Object invoke() {
                return HighSpeedResolver.supportedSizes_delegate$lambda$0(this.f$0);
            }
        });
    }

    private final <T> List<T> findCommonElements(List<? extends List<? extends T>> list) {
        if (list.isEmpty()) {
            return i.h();
        }
        List<T> listAq = i.aq((Collection) i.P(list));
        Iterator<T> it = i.ab(list, 1).iterator();
        while (it.hasNext()) {
            listAq.retainAll((List) it.next());
        }
        return listAq;
    }

    private final List<Range<Integer>> getHighSpeedVideoFpsRangesFor(Size size) {
        Object objA;
        List<Range<Integer>> listAo;
        try {
            HighSpeedResolver highSpeedResolver = this;
            objA = getStreamConfigurationMapCompat().getHighSpeedVideoFpsRangesFor(size);
        } catch (Throwable th) {
            objA = c.a(th);
        }
        if (true == (objA instanceof l)) {
            objA = null;
        }
        Range[] rangeArr = (Range[]) objA;
        return (rangeArr == null || (listAo = i.ao(h.a.c.R(rangeArr))) == null) ? i.h() : listAo;
    }

    private final StreamConfigurationMapCompat getStreamConfigurationMapCompat() {
        return (StreamConfigurationMapCompat) this.streamConfigurationMapCompat$delegate.getValue();
    }

    private final List<Size> getSupportedSizes() {
        return (List) this.supportedSizes$delegate.getValue();
    }

    public static final boolean isHighSpeedOn(Collection<? extends AttachedSurfaceInfo> collection, Collection<? extends UseCaseConfig<?>> collection2) {
        return Companion.isHighSpeedOn(collection, collection2);
    }

    static final boolean isHighSpeedSupported_delegate$lambda$0(HighSpeedResolver highSpeedResolver) {
        CameraMetadata cameraMetadata = highSpeedResolver.cameraMetadata;
        CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
        x.e(key, "REQUEST_AVAILABLE_CAPABILITIES");
        int[] iArr = (int[]) cameraMetadata.get(key);
        if (iArr != null) {
            for (int i2 : iArr) {
                if (i2 == 9) {
                    return true;
                }
            }
        }
        return false;
    }

    static final Size maxSize_delegate$lambda$0(HighSpeedResolver highSpeedResolver) {
        List<Size> supportedSizes = highSpeedResolver.getSupportedSizes();
        if (true == supportedSizes.isEmpty()) {
            supportedSizes = null;
        }
        if (supportedSizes == null) {
            return null;
        }
        Iterator<T> it = supportedSizes.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            int area = SizeUtil.getArea((Size) next);
            while (true) {
                Object next2 = it.next();
                int area2 = SizeUtil.getArea((Size) next2);
                int i2 = area < area2 ? area2 : area;
                if (area < area2) {
                    next = next2;
                }
                if (!it.hasNext()) {
                    break;
                }
                area = i2;
            }
        }
        return (Size) next;
    }

    static final StreamConfigurationMapCompat streamConfigurationMapCompat_delegate$lambda$0(HighSpeedResolver highSpeedResolver) {
        CameraMetadata cameraMetadata = highSpeedResolver.cameraMetadata;
        CameraCharacteristics.Key key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
        x.e(key, "SCALER_STREAM_CONFIGURATION_MAP");
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraMetadata.get(key);
        if (streamConfigurationMap != null) {
            return new StreamConfigurationMapCompat(streamConfigurationMap, new OutputSizesCorrector(highSpeedResolver.cameraMetadata, streamConfigurationMap));
        }
        throw new IllegalArgumentException("Cannot retrieve SCALER_STREAM_CONFIGURATION_MAP");
    }

    static final List supportedSizes_delegate$lambda$0(HighSpeedResolver highSpeedResolver) {
        List listX;
        Size[] highSpeedVideoSizes = highSpeedResolver.getStreamConfigurationMapCompat().getHighSpeedVideoSizes();
        return (highSpeedVideoSizes == null || (listX = h.a.c.X(highSpeedVideoSizes)) == null) ? i.h() : listX;
    }

    public final <T> Map<T, List<Size>> filterCommonSupportedSizes(Map<T, ? extends List<Size>> map) {
        x.f(map, "sizesMap");
        List<T> listFindCommonElements = findCommonElements(i.ao(map.values()));
        ArrayList arrayList = new ArrayList();
        for (T t : listFindCommonElements) {
            if (getSupportedSizes().contains((Size) t)) {
                arrayList.add(t);
            }
        }
        ArrayList arrayList2 = arrayList;
        LinkedHashMap linkedHashMap = new LinkedHashMap(r.a(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            List list = (List) entry.getValue();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : list) {
                if (arrayList2.contains((Size) obj)) {
                    arrayList3.add(obj);
                }
            }
            linkedHashMap.put(key, arrayList3);
        }
        return linkedHashMap;
    }

    public final Range<Integer>[] getFrameRateRangesFor(List<Size> list) {
        x.f(list, "surfaceSizes");
        int size = list.size();
        if (size > 0 && size < 3 && i.aa(list).size() == 1) {
            ArrayList highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(list.get(0));
            if (true == highSpeedVideoFpsRangesFor.isEmpty()) {
                highSpeedVideoFpsRangesFor = null;
            }
            if (highSpeedVideoFpsRangesFor != null) {
                if (list.size() == 2) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : highSpeedVideoFpsRangesFor) {
                        Range range = (Range) obj;
                        if (x.n(range.getLower(), range.getUpper())) {
                            arrayList.add(obj);
                        }
                    }
                    highSpeedVideoFpsRangesFor = arrayList;
                }
                return (Range[]) highSpeedVideoFpsRangesFor.toArray(new Range[0]);
            }
        }
        return null;
    }

    public final int getMaxFrameRate(Size size) {
        x.f(size, "size");
        List<Range<Integer>> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(size);
        if (true == highSpeedVideoFpsRangesFor.isEmpty()) {
            highSpeedVideoFpsRangesFor = null;
        }
        if (highSpeedVideoFpsRangesFor == null) {
            Objects.toString(size);
            Logger.w(TAG, "No supported high speed  fps for ".concat(String.valueOf(size)));
            return 0;
        }
        Iterator<T> it = highSpeedVideoFpsRangesFor.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Integer num = (Integer) ((Range) it.next()).getUpper();
        while (it.hasNext()) {
            Integer num2 = (Integer) ((Range) it.next()).getUpper();
            if (num.compareTo(num2) < 0) {
                num = num2;
            }
        }
        x.e(num, "maxOf(...)");
        return num.intValue();
    }

    public final Size getMaxSize() {
        return (Size) this.maxSize$delegate.getValue();
    }

    public final List<List<Size>> getSizeArrangements(List<? extends List<Size>> list) {
        x.f(list, "sizesList");
        if (list.isEmpty()) {
            return i.h();
        }
        List<Size> listFindCommonElements = findCommonElements(list);
        ArrayList arrayList = new ArrayList(i.q(listFindCommonElements, 10));
        for (Size size : listFindCommonElements) {
            int size2 = list.size();
            ArrayList arrayList2 = new ArrayList(size2);
            for (int i2 = 0; i2 < size2; i2++) {
                arrayList2.add(size);
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

    public final boolean isHighSpeedSupported() {
        return ((Boolean) this.isHighSpeedSupported$delegate.getValue()).booleanValue();
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final Range<Integer> getDEFAULT_FPS() {
            return HighSpeedResolver.DEFAULT_FPS;
        }

        public final boolean isHighSpeedOn(Collection<? extends AttachedSurfaceInfo> collection, Collection<? extends UseCaseConfig<?>> collection2) {
            boolean z;
            x.f(collection, "attachedSurfaces");
            x.f(collection2, "newUseCaseConfigs");
            Collection<? extends AttachedSurfaceInfo> collection3 = collection;
            ArrayList arrayList = new ArrayList(i.q(collection3, 10));
            Iterator<T> it = collection3.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((AttachedSurfaceInfo) it.next()).getSessionType()));
            }
            ArrayList arrayList2 = arrayList;
            Collection<? extends UseCaseConfig<?>> collection4 = collection2;
            ArrayList arrayList3 = new ArrayList(i.q(collection4, 10));
            Iterator<T> it2 = collection4.iterator();
            while (true) {
                z = false;
                if (!it2.hasNext()) {
                    break;
                }
                arrayList3.add(Integer.valueOf(((UseCaseConfig) it2.next()).getSessionType(0)));
            }
            List listAf = i.af(arrayList2, arrayList3);
            boolean z2 = listAf instanceof Collection;
            if (!z2 || !listAf.isEmpty()) {
                Iterator it3 = listAf.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    if (((Number) it3.next()).intValue() == 1) {
                        z = true;
                        break;
                    }
                }
            }
            if (z && (!z2 || !listAf.isEmpty())) {
                Iterator it4 = listAf.iterator();
                while (it4.hasNext()) {
                    if (((Number) it4.next()).intValue() != 1) {
                        throw new IllegalArgumentException("All sessionTypes should be high-speed when any of them is high-speed");
                    }
                }
            }
            return z;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
