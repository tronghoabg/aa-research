package androidx.camera.camera2.compat;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import androidx.camera.camera2.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.compat.quirk.PixelJpegRSupportedQuirk;
import h.g.b.x;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class StreamConfigurationMapCompatApi34Impl extends StreamConfigurationMapCompatBaseImpl {
    public StreamConfigurationMapCompatApi34Impl(StreamConfigurationMap streamConfigurationMap) {
        super(streamConfigurationMap);
    }

    private final boolean getHasJpegRQuirk() {
        return DeviceQuirks.INSTANCE.get(PixelJpegRSupportedQuirk.class) != null;
    }

    @Override // androidx.camera.camera2.compat.StreamConfigurationMapCompatBaseImpl, androidx.camera.camera2.compat.StreamConfigurationMapCompat.StreamConfigurationMapCompatImpl
    public Size[] getHighResolutionOutputSizes(int i2) {
        if (i2 == 4101) {
            if (getHasJpegRQuirk()) {
                return null;
            }
            i2 = 4101;
        }
        return super.getHighResolutionOutputSizes(i2);
    }

    @Override // androidx.camera.camera2.compat.StreamConfigurationMapCompatBaseImpl, androidx.camera.camera2.compat.StreamConfigurationMapCompat.StreamConfigurationMapCompatImpl
    public Integer[] getOutputFormats() {
        Integer[] outputFormats = super.getOutputFormats();
        if (!getHasJpegRQuirk()) {
            return outputFormats;
        }
        if (outputFormats == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : outputFormats) {
            if (num.intValue() != 4101) {
                arrayList.add(num);
            }
        }
        return (Integer[]) arrayList.toArray(new Integer[0]);
    }

    @Override // androidx.camera.camera2.compat.StreamConfigurationMapCompatBaseImpl, androidx.camera.camera2.compat.StreamConfigurationMapCompat.StreamConfigurationMapCompatImpl
    public long getOutputMinFrameDuration(int i2, Size size) {
        x.f(size, "size");
        if (i2 == 4101) {
            if (getHasJpegRQuirk()) {
                return 0L;
            }
            i2 = 4101;
        }
        return super.getOutputMinFrameDuration(i2, size);
    }

    @Override // androidx.camera.camera2.compat.StreamConfigurationMapCompatBaseImpl, androidx.camera.camera2.compat.StreamConfigurationMapCompat.StreamConfigurationMapCompatImpl
    public Size[] getOutputSizes(int i2) {
        if (i2 == 4101) {
            if (getHasJpegRQuirk()) {
                return null;
            }
            i2 = 4101;
        }
        return super.getOutputSizes(i2);
    }
}
