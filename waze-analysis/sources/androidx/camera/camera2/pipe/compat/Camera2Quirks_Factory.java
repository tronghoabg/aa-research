package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.StrictMode;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Camera2Quirks_Factory implements c.b.c<Camera2Quirks> {
    private final c.b.e<Camera2MetadataProvider> metadataProvider;
    private final c.b.e<StrictMode> strictModeProvider;

    private Camera2Quirks_Factory(c.b.e<Camera2MetadataProvider> eVar, c.b.e<StrictMode> eVar2) {
        this.metadataProvider = eVar;
        this.strictModeProvider = eVar2;
    }

    public static Camera2Quirks_Factory create(c.b.e<Camera2MetadataProvider> eVar, c.b.e<StrictMode> eVar2) {
        return new Camera2Quirks_Factory(eVar, eVar2);
    }

    public static Camera2Quirks newInstance(Camera2MetadataProvider camera2MetadataProvider, StrictMode strictMode) {
        return new Camera2Quirks(camera2MetadataProvider, strictMode);
    }

    @Override // g.a.a, f.a.a
    public Camera2Quirks get() {
        return newInstance(this.metadataProvider.get(), this.strictModeProvider.get());
    }
}
