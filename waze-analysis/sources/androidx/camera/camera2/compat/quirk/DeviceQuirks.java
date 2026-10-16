package androidx.camera.camera2.compat.quirk;

import androidx.camera.core.Logger;
import androidx.camera.core.impl.Quirk;
import androidx.camera.core.impl.QuirkSettings;
import androidx.camera.core.impl.QuirkSettingsHolder;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.core.util.Consumer;
import androidx.media3.extractor.text.ttml.TtmlNode;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class DeviceQuirks {
    public static final DeviceQuirks INSTANCE = new DeviceQuirks();
    private static final String TAG = "DeviceQuirks";
    public static volatile Quirks all;

    static {
        QuirkSettingsHolder.instance().observe(CameraXExecutors.directExecutor(), new Consumer() { // from class: androidx.camera.camera2.compat.quirk.DeviceQuirks$$ExternalSyntheticLambda0
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                DeviceQuirks._init_$lambda$0((QuirkSettings) obj);
            }
        });
    }

    private DeviceQuirks() {
    }

    static final void _init_$lambda$0(QuirkSettings quirkSettings) {
        DeviceQuirksLoader deviceQuirksLoader = DeviceQuirksLoader.INSTANCE;
        x.c(quirkSettings);
        setAll(new Quirks(deviceQuirksLoader.loadQuirks(quirkSettings)));
        Logger.d(TAG, "camera2 DeviceQuirks = ".concat(Quirks.toString(getAll())));
    }

    public static final Quirks getAll() {
        Quirks quirks = all;
        if (quirks != null) {
            return quirks;
        }
        x.j(TtmlNode.COMBINE_ALL);
        return null;
    }

    public static final void setAll(Quirks quirks) {
        x.f(quirks, "<set-?>");
        all = quirks;
    }

    public final <T extends Quirk> T get(Class<T> cls) {
        x.f(cls, "quirkClass");
        return (T) getAll().get(cls);
    }

    public static /* synthetic */ void getAll$annotations() {
    }
}
