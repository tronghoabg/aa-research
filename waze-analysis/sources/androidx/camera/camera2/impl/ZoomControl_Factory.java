package androidx.camera.camera2.impl;

import androidx.camera.camera2.compat.ZoomCompat;
import c.b.c;
import c.b.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ZoomControl_Factory implements c<ZoomControl> {
    private final e<ZoomCompat> zoomCompatProvider;

    private ZoomControl_Factory(e<ZoomCompat> eVar) {
        this.zoomCompatProvider = eVar;
    }

    public static ZoomControl_Factory create(e<ZoomCompat> eVar) {
        return new ZoomControl_Factory(eVar);
    }

    public static ZoomControl newInstance(ZoomCompat zoomCompat) {
        return new ZoomControl(zoomCompat);
    }

    @Override // g.a.a, f.a.a
    public ZoomControl get() {
        return newInstance(this.zoomCompatProvider.get());
    }
}
