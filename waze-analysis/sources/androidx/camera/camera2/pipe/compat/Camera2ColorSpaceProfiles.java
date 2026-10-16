package androidx.camera.camera2.pipe.compat;

import android.graphics.ColorSpace;
import android.hardware.camera2.params.ColorSpaceProfiles;
import android.support.v4.app.j$$ExternalSyntheticApiModelOutline1;
import androidx.camera.camera2.pipe.CameraColorSpace;
import androidx.camera.camera2.pipe.CameraColorSpaceProfiles;
import androidx.camera.camera2.pipe.OutputStream;
import androidx.camera.camera2.pipe.StreamFormat;
import androidx.camera.camera2.pipe.UnsafeWrapper;
import androidx.camera.camera2.pipe.core.Log;
import androidx.core.view.DisplayCompat$$ExternalSyntheticApiModelOutline1;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.a.i;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Camera2ColorSpaceProfiles implements CameraColorSpaceProfiles {
    private final ColorSpaceProfiles colorSpaceProfiles;

    public Camera2ColorSpaceProfiles(ColorSpaceProfiles colorSpaceProfiles) {
        x.f(colorSpaceProfiles, "colorSpaceProfiles");
        this.colorSpaceProfiles = colorSpaceProfiles;
    }

    @Override // androidx.camera.camera2.pipe.CameraColorSpaceProfiles
    /* renamed from: getSupportedColorSpaces-hNQ4ISI */
    public Set<CameraColorSpace> mo419getSupportedColorSpaceshNQ4ISI(int i2) {
        Set supportedColorSpaces = this.colorSpaceProfiles.getSupportedColorSpaces(i2);
        x.e(supportedColorSpaces, "getSupportedColorSpaces(...)");
        ArrayList arrayList = new ArrayList();
        Iterator it = supportedColorSpaces.iterator();
        while (it.hasNext()) {
            ColorSpace.Named namedM58m = j$$ExternalSyntheticApiModelOutline1.m58m(it.next());
            CameraColorSpace.Companion companion = CameraColorSpace.Companion;
            x.c(namedM58m);
            String strM399fromColorSpaceNamed5GKeQC8 = companion.m399fromColorSpaceNamed5GKeQC8(namedM58m);
            if (strM399fromColorSpaceNamed5GKeQC8 == null && Log.INSTANCE.getWARN_LOGGABLE()) {
                android.util.Log.w(Log.TAG, "Unsupported color space: ".concat(String.valueOf(namedM58m.name())));
            }
            CameraColorSpace cameraColorSpaceM390boximpl = strM399fromColorSpaceNamed5GKeQC8 != null ? CameraColorSpace.m390boximpl(strM399fromColorSpaceNamed5GKeQC8) : null;
            if (cameraColorSpaceM390boximpl != null) {
                arrayList.add(cameraColorSpaceM390boximpl);
            }
        }
        return i.au(arrayList);
    }

    @Override // androidx.camera.camera2.pipe.CameraColorSpaceProfiles
    /* renamed from: getSupportedColorSpacesForDynamicRange-sNWL0t8 */
    public Set<CameraColorSpace> mo420getSupportedColorSpacesForDynamicRangesNWL0t8(int i2, long j2) {
        Set supportedColorSpacesForDynamicRange = this.colorSpaceProfiles.getSupportedColorSpacesForDynamicRange(i2, j2);
        x.e(supportedColorSpacesForDynamicRange, "getSupportedColorSpacesForDynamicRange(...)");
        ArrayList arrayList = new ArrayList();
        Iterator it = supportedColorSpacesForDynamicRange.iterator();
        while (it.hasNext()) {
            ColorSpace.Named namedM58m = j$$ExternalSyntheticApiModelOutline1.m58m(it.next());
            CameraColorSpace.Companion companion = CameraColorSpace.Companion;
            x.c(namedM58m);
            String strM399fromColorSpaceNamed5GKeQC8 = companion.m399fromColorSpaceNamed5GKeQC8(namedM58m);
            if (strM399fromColorSpaceNamed5GKeQC8 == null && Log.INSTANCE.getWARN_LOGGABLE()) {
                android.util.Log.w(Log.TAG, "Unsupported color space: ".concat(String.valueOf(namedM58m.name())));
            }
            CameraColorSpace cameraColorSpaceM390boximpl = strM399fromColorSpaceNamed5GKeQC8 != null ? CameraColorSpace.m390boximpl(strM399fromColorSpaceNamed5GKeQC8) : null;
            if (cameraColorSpaceM390boximpl != null) {
                arrayList.add(cameraColorSpaceM390boximpl);
            }
        }
        return i.au(arrayList);
    }

    @Override // androidx.camera.camera2.pipe.CameraColorSpaceProfiles
    /* renamed from: getSupportedDynamicRangeProfiles-6Yu6yh8 */
    public Set<OutputStream.DynamicRangeProfile> mo421getSupportedDynamicRangeProfiles6Yu6yh8(String str, int i2) {
        x.f(str, "cameraColorSpace");
        ColorSpace.Named namedM396toColorSpaceNamedimpl = CameraColorSpace.m396toColorSpaceNamedimpl(str);
        if (namedM396toColorSpaceNamedimpl == null) {
            if (Log.INSTANCE.getWARN_LOGGABLE()) {
                android.util.Log.w(Log.TAG, "Unsupported color space: ".concat(String.valueOf(str)));
            }
            return e.c.d.a.p();
        }
        Set supportedDynamicRangeProfiles = this.colorSpaceProfiles.getSupportedDynamicRangeProfiles(namedM396toColorSpaceNamedimpl, i2);
        x.e(supportedDynamicRangeProfiles, "getSupportedDynamicRangeProfiles(...)");
        Set<Long> set = supportedDynamicRangeProfiles;
        ArrayList arrayList = new ArrayList(i.q(set, 10));
        for (Long l2 : set) {
            x.c(l2);
            arrayList.add(OutputStream.DynamicRangeProfile.m774boximpl(l2.longValue()));
        }
        return i.au(arrayList);
    }

    @Override // androidx.camera.camera2.pipe.CameraColorSpaceProfiles
    /* renamed from: getSupportedImageFormatsForColorSpace-jRxjvBE */
    public Set<StreamFormat> mo422getSupportedImageFormatsForColorSpacejRxjvBE(String str) {
        x.f(str, "cameraColorSpace");
        ColorSpace.Named namedM396toColorSpaceNamedimpl = CameraColorSpace.m396toColorSpaceNamedimpl(str);
        if (namedM396toColorSpaceNamedimpl == null) {
            if (Log.INSTANCE.getWARN_LOGGABLE()) {
                android.util.Log.w(Log.TAG, "Unsupported color space: ".concat(String.valueOf(str)));
            }
            return e.c.d.a.p();
        }
        Set supportedImageFormatsForColorSpace = this.colorSpaceProfiles.getSupportedImageFormatsForColorSpace(namedM396toColorSpaceNamedimpl);
        x.e(supportedImageFormatsForColorSpace, "getSupportedImageFormatsForColorSpace(...)");
        Set<Integer> set = supportedImageFormatsForColorSpace;
        ArrayList arrayList = new ArrayList(i.q(set, 10));
        for (Integer num : set) {
            x.c(num);
            arrayList.add(StreamFormat.m918boximpl(num.intValue()));
        }
        return i.au(arrayList);
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper, androidx.camera.common.UnsafeWrapper
    public <T> T unwrapAs(Class<T> cls) {
        x.f(cls, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        if (x.n(cls, DisplayCompat$$ExternalSyntheticApiModelOutline1.m11787m())) {
            Object obj = this.colorSpaceProfiles;
            x.d(obj, "null cannot be cast to non-null type T of androidx.camera.camera2.pipe.compat.Camera2ColorSpaceProfiles.unwrapAs");
            return (T) obj;
        }
        if (x.n(cls, Camera2ColorSpaceProfiles.class)) {
            return (T) this;
        }
        return null;
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public /* synthetic */ Object unwrapAs(h.l.c cVar) {
        return UnsafeWrapper.CC.$default$unwrapAs(this, cVar);
    }
}
