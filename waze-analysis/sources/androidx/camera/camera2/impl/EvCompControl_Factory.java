package androidx.camera.camera2.impl;

import androidx.camera.camera2.compat.EvCompCompat;
import c.b.c;
import c.b.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class EvCompControl_Factory implements c<EvCompControl> {
    private final e<EvCompCompat> compatProvider;

    private EvCompControl_Factory(e<EvCompCompat> eVar) {
        this.compatProvider = eVar;
    }

    public static EvCompControl_Factory create(e<EvCompCompat> eVar) {
        return new EvCompControl_Factory(eVar);
    }

    public static EvCompControl newInstance(EvCompCompat evCompCompat) {
        return new EvCompControl(evCompCompat);
    }

    @Override // g.a.a, f.a.a
    public EvCompControl get() {
        return newInstance(this.compatProvider.get());
    }
}
