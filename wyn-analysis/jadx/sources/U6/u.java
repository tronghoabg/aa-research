package u6;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.concurrent.CompletableFuture;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class u {
    public static /* synthetic */ OutputConfiguration b(Surface surface) {
        return new OutputConfiguration(surface);
    }

    public static /* bridge */ /* synthetic */ Class c() {
        return CompletableFuture.class;
    }
}
