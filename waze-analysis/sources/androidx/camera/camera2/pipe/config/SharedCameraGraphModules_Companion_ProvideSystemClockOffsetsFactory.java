package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.core.SystemClockOffsets;
import c.b.c;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class SharedCameraGraphModules_Companion_ProvideSystemClockOffsetsFactory implements c<SystemClockOffsets> {

    /* compiled from: WazeSource */
    final class InstanceHolder {
        static final SharedCameraGraphModules_Companion_ProvideSystemClockOffsetsFactory INSTANCE = new SharedCameraGraphModules_Companion_ProvideSystemClockOffsetsFactory();

        private InstanceHolder() {
        }
    }

    public static SharedCameraGraphModules_Companion_ProvideSystemClockOffsetsFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static SystemClockOffsets provideSystemClockOffsets() {
        return SharedCameraGraphModules.Companion.provideSystemClockOffsets();
    }

    @Override // g.a.a, f.a.a
    public SystemClockOffsets get() {
        return provideSystemClockOffsets();
    }
}
