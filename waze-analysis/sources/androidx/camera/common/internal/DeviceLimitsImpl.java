package androidx.camera.common.internal;

import android.util.Size;
import h.a.r;
import h.g.b.o;
import h.g.b.x;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class DeviceLimitsImpl extends MutableDeviceLimits {
    private Map<Integer, Size> maxOutputSizes;
    private Map<Integer, Size> maxOutputSizes16by9;
    private Map<Integer, Size> maxOutputSizes4by3;
    private Size maxPreviewSize;
    private Size maxRecordSize;
    private Map<Integer, Size> maxUltraOutputSizes;

    public /* synthetic */ DeviceLimitsImpl(Size size, Size size2, Map map, Map map2, Map map3, Map map4, int i2, o oVar) {
        this((i2 & 1) != 0 ? new Size(0, 0) : size, (i2 & 2) != 0 ? new Size(0, 0) : size2, (i2 & 4) != 0 ? r.j() : map, (i2 & 8) != 0 ? r.j() : map2, (i2 & 16) != 0 ? r.j() : map3, (i2 & 32) != 0 ? r.j() : map4);
    }

    private static final void build$requirePositiveArea(Map<Integer, Size> map, String str) {
        for (Map.Entry<Integer, Size> entry : map.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            Size value = entry.getValue();
            if (value.getWidth() <= 0 || value.getHeight() <= 0) {
                throw new IllegalArgumentException(str + "[" + iIntValue + "] must be a valid non-zero area");
            }
        }
    }

    private static final void build$validateMaxSizeMaps(Map<Integer, Size> map, Map<Integer, Size> map2, String str) {
        for (Map.Entry<Integer, Size> entry : map2.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            Size value = entry.getValue();
            Size size = map.get(Integer.valueOf(iIntValue));
            if (size == null) {
                throw new IllegalArgumentException(str + " contains format " + iIntValue + " which is missing from maxOutputSizes");
            }
            if (value.getWidth() > size.getWidth() || value.getHeight() > size.getHeight()) {
                throw new IllegalArgumentException(str + "[" + iIntValue + "] (" + value + ") exceeds maxOutputSizes[" + iIntValue + "] (" + size + ")");
            }
        }
    }

    public static /* synthetic */ DeviceLimitsImpl copy$default(DeviceLimitsImpl deviceLimitsImpl, Size size, Size size2, Map map, Map map2, Map map3, Map map4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            size = deviceLimitsImpl.maxPreviewSize;
        }
        if ((i2 & 2) != 0) {
            size2 = deviceLimitsImpl.maxRecordSize;
        }
        if ((i2 & 4) != 0) {
            map = deviceLimitsImpl.maxOutputSizes;
        }
        if ((i2 & 8) != 0) {
            map2 = deviceLimitsImpl.maxOutputSizes4by3;
        }
        if ((i2 & 16) != 0) {
            map3 = deviceLimitsImpl.maxOutputSizes16by9;
        }
        if ((i2 & 32) != 0) {
            map4 = deviceLimitsImpl.maxUltraOutputSizes;
        }
        Map map5 = map3;
        Map map6 = map4;
        return deviceLimitsImpl.copy(size, size2, map, map2, map5, map6);
    }

    @Override // androidx.camera.common.internal.MutableDeviceLimits
    public DeviceLimits build() {
        Size maxPreviewSize = getMaxPreviewSize();
        Size maxRecordSize = getMaxRecordSize();
        Map<Integer, Size> maxOutputSizes = getMaxOutputSizes();
        Map<Integer, Size> maxOutputSizes4by3 = getMaxOutputSizes4by3();
        Map<Integer, Size> maxOutputSizes16by9 = getMaxOutputSizes16by9();
        if (maxPreviewSize.getWidth() <= 0 || maxPreviewSize.getHeight() <= 0) {
            throw new IllegalArgumentException("maxPreviewSize must be a valid non-zero size");
        }
        if (maxRecordSize.getWidth() <= 0 || maxRecordSize.getHeight() <= 0) {
            throw new IllegalArgumentException("maxRecordSize must be a valid non-zero size");
        }
        if (maxOutputSizes.isEmpty()) {
            throw new IllegalArgumentException("maxOutputSizes must not be empty");
        }
        build$requirePositiveArea(maxOutputSizes, "maxOutputSizes");
        build$requirePositiveArea(maxOutputSizes4by3, "maxOutputSizes4by3");
        build$requirePositiveArea(maxOutputSizes16by9, "maxOutputSizes16by9");
        build$requirePositiveArea(getMaxUltraOutputSizes(), "maxUltraOutputSizes");
        build$validateMaxSizeMaps(maxOutputSizes, maxOutputSizes4by3, "maxOutputSizes4by3");
        build$validateMaxSizeMaps(maxOutputSizes, maxOutputSizes16by9, "maxOutputSizes16by9");
        return copy$default(this, null, null, null, null, null, null, 63, null);
    }

    public final Size component1() {
        return this.maxPreviewSize;
    }

    public final Size component2() {
        return this.maxRecordSize;
    }

    public final Map<Integer, Size> component3() {
        return this.maxOutputSizes;
    }

    public final Map<Integer, Size> component4() {
        return this.maxOutputSizes4by3;
    }

    public final Map<Integer, Size> component5() {
        return this.maxOutputSizes16by9;
    }

    public final Map<Integer, Size> component6() {
        return this.maxUltraOutputSizes;
    }

    public final DeviceLimitsImpl copy(Size size, Size size2, Map<Integer, Size> map, Map<Integer, Size> map2, Map<Integer, Size> map3, Map<Integer, Size> map4) {
        x.f(size, "maxPreviewSize");
        x.f(size2, "maxRecordSize");
        x.f(map, "maxOutputSizes");
        x.f(map2, "maxOutputSizes4by3");
        x.f(map3, "maxOutputSizes16by9");
        x.f(map4, "maxUltraOutputSizes");
        return new DeviceLimitsImpl(size, size2, map, map2, map3, map4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceLimitsImpl)) {
            return false;
        }
        DeviceLimitsImpl deviceLimitsImpl = (DeviceLimitsImpl) obj;
        return x.n(this.maxPreviewSize, deviceLimitsImpl.maxPreviewSize) && x.n(this.maxRecordSize, deviceLimitsImpl.maxRecordSize) && x.n(this.maxOutputSizes, deviceLimitsImpl.maxOutputSizes) && x.n(this.maxOutputSizes4by3, deviceLimitsImpl.maxOutputSizes4by3) && x.n(this.maxOutputSizes16by9, deviceLimitsImpl.maxOutputSizes16by9) && x.n(this.maxUltraOutputSizes, deviceLimitsImpl.maxUltraOutputSizes);
    }

    @Override // androidx.camera.common.internal.MutableDeviceLimits, androidx.camera.common.internal.DeviceLimits
    public Map<Integer, Size> getMaxOutputSizes() {
        return this.maxOutputSizes;
    }

    @Override // androidx.camera.common.internal.MutableDeviceLimits, androidx.camera.common.internal.DeviceLimits
    public Map<Integer, Size> getMaxOutputSizes16by9() {
        return this.maxOutputSizes16by9;
    }

    @Override // androidx.camera.common.internal.MutableDeviceLimits, androidx.camera.common.internal.DeviceLimits
    public Map<Integer, Size> getMaxOutputSizes4by3() {
        return this.maxOutputSizes4by3;
    }

    @Override // androidx.camera.common.internal.MutableDeviceLimits, androidx.camera.common.internal.DeviceLimits
    public Size getMaxPreviewSize() {
        return this.maxPreviewSize;
    }

    @Override // androidx.camera.common.internal.MutableDeviceLimits, androidx.camera.common.internal.DeviceLimits
    public Size getMaxRecordSize() {
        return this.maxRecordSize;
    }

    @Override // androidx.camera.common.internal.MutableDeviceLimits, androidx.camera.common.internal.DeviceLimits
    public Map<Integer, Size> getMaxUltraOutputSizes() {
        return this.maxUltraOutputSizes;
    }

    public int hashCode() {
        return (((((((((this.maxPreviewSize.hashCode() * 31) + this.maxRecordSize.hashCode()) * 31) + this.maxOutputSizes.hashCode()) * 31) + this.maxOutputSizes4by3.hashCode()) * 31) + this.maxOutputSizes16by9.hashCode()) * 31) + this.maxUltraOutputSizes.hashCode();
    }

    @Override // androidx.camera.common.internal.MutableDeviceLimits
    public void setMaxOutputSizes(Map<Integer, Size> map) {
        x.f(map, "<set-?>");
        this.maxOutputSizes = map;
    }

    @Override // androidx.camera.common.internal.MutableDeviceLimits
    public void setMaxOutputSizes16by9(Map<Integer, Size> map) {
        x.f(map, "<set-?>");
        this.maxOutputSizes16by9 = map;
    }

    @Override // androidx.camera.common.internal.MutableDeviceLimits
    public void setMaxOutputSizes4by3(Map<Integer, Size> map) {
        x.f(map, "<set-?>");
        this.maxOutputSizes4by3 = map;
    }

    @Override // androidx.camera.common.internal.MutableDeviceLimits
    public void setMaxPreviewSize(Size size) {
        x.f(size, "<set-?>");
        this.maxPreviewSize = size;
    }

    @Override // androidx.camera.common.internal.MutableDeviceLimits
    public void setMaxRecordSize(Size size) {
        x.f(size, "<set-?>");
        this.maxRecordSize = size;
    }

    @Override // androidx.camera.common.internal.MutableDeviceLimits
    public void setMaxUltraOutputSizes(Map<Integer, Size> map) {
        x.f(map, "<set-?>");
        this.maxUltraOutputSizes = map;
    }

    public String toString() {
        return "DeviceLimitsImpl(maxPreviewSize=" + this.maxPreviewSize + ", maxRecordSize=" + this.maxRecordSize + ", maxOutputSizes=" + this.maxOutputSizes + ", maxOutputSizes4by3=" + this.maxOutputSizes4by3 + ", maxOutputSizes16by9=" + this.maxOutputSizes16by9 + ", maxUltraOutputSizes=" + this.maxUltraOutputSizes + ")";
    }

    public DeviceLimitsImpl(Size size, Size size2, Map<Integer, Size> map, Map<Integer, Size> map2, Map<Integer, Size> map3, Map<Integer, Size> map4) {
        x.f(size, "maxPreviewSize");
        x.f(size2, "maxRecordSize");
        x.f(map, "maxOutputSizes");
        x.f(map2, "maxOutputSizes4by3");
        x.f(map3, "maxOutputSizes16by9");
        x.f(map4, "maxUltraOutputSizes");
        this.maxPreviewSize = size;
        this.maxRecordSize = size2;
        this.maxOutputSizes = map;
        this.maxOutputSizes4by3 = map2;
        this.maxOutputSizes16by9 = map3;
        this.maxUltraOutputSizes = map4;
    }

    public DeviceLimitsImpl() {
        this(null, null, null, null, null, null, 63, null);
    }
}
