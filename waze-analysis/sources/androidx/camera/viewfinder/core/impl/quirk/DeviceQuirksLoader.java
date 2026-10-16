package androidx.camera.viewfinder.core.impl.quirk;

import h.a.i;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class DeviceQuirksLoader {
    public static final DeviceQuirksLoader INSTANCE = new DeviceQuirksLoader();

    private DeviceQuirksLoader() {
    }

    public static final List<Quirk> loadQuirks() {
        List listB = i.b();
        if (SurfaceViewStretchedQuirk.load()) {
            listB.add(SurfaceViewStretchedQuirk.INSTANCE);
        }
        if (SurfaceViewNotCroppedByParentQuirk.load()) {
            listB.add(SurfaceViewNotCroppedByParentQuirk.INSTANCE);
        }
        return i.a(listB);
    }
}
