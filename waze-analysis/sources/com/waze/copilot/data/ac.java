package com.waze.copilot.data;

import com.waze.NativeManager;
import com.waze.hw;
import com.waze.jni.protos.copilot.data.CarRenderingInfo;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class ac {
    public static final int $stable = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setSelectedCar$default(ac acVar, CarRenderingInfo carRenderingInfo, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setSelectedCar");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        acVar.setSelectedCar(carRenderingInfo, lVar);
    }

    static final h.ab setSelectedCar$lambda$0(ac acVar, CarRenderingInfo carRenderingInfo) {
        h.g.b.x.d(acVar, "null cannot be cast to non-null type com.waze.copilot.data.CopilotNativeManager");
        ((CopilotNativeManager) acVar).setSelectedCarNTV(carRenderingInfo != null ? carRenderingInfo.toByteArray() : null);
        return null;
    }

    public void setSelectedCar(final CarRenderingInfo carRenderingInfo, final h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new hw() { // from class: com.waze.copilot.data.aa
            @Override // com.waze.hw
            public final Object a() {
                ac.setSelectedCar$lambda$0(this.f22939a, carRenderingInfo);
                return null;
            }
        }, lVar != null ? new com.waze.jni.a() { // from class: com.waze.copilot.data.ab
            @Override // com.waze.jni.a
            public final void a(Object obj) {
                lVar.invoke((h.ab) obj);
            }
        } : null);
    }

    public final void setSelectedCar(CarRenderingInfo carRenderingInfo) {
        setSelectedCar$default(this, carRenderingInfo, null, 2, null);
    }
}
