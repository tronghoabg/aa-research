package androidx.camera.camera2.compat.workaround;

import androidx.camera.camera2.compat.quirk.CameraQuirks;
import androidx.camera.camera2.compat.workaround.UseTorchAsFlash;
import androidx.camera.camera2.internal.IntrinsicZoomCalculator;
import androidx.camera.camera2.pipe.CameraDevices;
import c.b.c;
import c.b.e;
import com.waze.web.r;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class UseTorchAsFlash_Bindings_Companion_ProvideUseTorchAsFlashFactory implements c<UseTorchAsFlash> {
    private final e<CameraDevices> cameraDevicesProvider;
    private final e<CameraQuirks> cameraQuirksProvider;
    private final e<IntrinsicZoomCalculator> intrinsicZoomCalculatorProvider;

    private UseTorchAsFlash_Bindings_Companion_ProvideUseTorchAsFlashFactory(e<CameraQuirks> eVar, e<CameraDevices> eVar2, e<IntrinsicZoomCalculator> eVar3) {
        this.cameraQuirksProvider = eVar;
        this.cameraDevicesProvider = eVar2;
        this.intrinsicZoomCalculatorProvider = eVar3;
    }

    public static UseTorchAsFlash_Bindings_Companion_ProvideUseTorchAsFlashFactory create(e<CameraQuirks> eVar, e<CameraDevices> eVar2, e<IntrinsicZoomCalculator> eVar3) {
        return new UseTorchAsFlash_Bindings_Companion_ProvideUseTorchAsFlashFactory(eVar, eVar2, eVar3);
    }

    public static UseTorchAsFlash provideUseTorchAsFlash(CameraQuirks cameraQuirks, CameraDevices cameraDevices, IntrinsicZoomCalculator intrinsicZoomCalculator) {
        UseTorchAsFlash useTorchAsFlashProvideUseTorchAsFlash = UseTorchAsFlash.Bindings.Companion.provideUseTorchAsFlash(cameraQuirks, cameraDevices, intrinsicZoomCalculator);
        r.g(useTorchAsFlashProvideUseTorchAsFlash);
        return useTorchAsFlashProvideUseTorchAsFlash;
    }

    @Override // g.a.a, f.a.a
    public UseTorchAsFlash get() {
        return provideUseTorchAsFlash(this.cameraQuirksProvider.get(), this.cameraDevicesProvider.get(), this.intrinsicZoomCalculatorProvider.get());
    }
}
