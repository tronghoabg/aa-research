package androidx.camera.camera2.impl;

import android.hardware.camera2.params.MeteringRectangle;
import androidx.camera.camera2.pipe.CameraControls3A;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.Result3A;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.core.Logger;
import com.waze.strings.DisplayStrings;
import e.b.c;
import h.a.r;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.am;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class UseCaseCameraRequestControlImpl$update3aRegions$1$1 extends g implements l<e<? super am<? extends Result3A>>, Object> {
    final /* synthetic */ List<MeteringRectangle> $aeRegions;
    final /* synthetic */ List<MeteringRectangle> $afRegions;
    final /* synthetic */ List<MeteringRectangle> $awbRegions;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ UseCaseCameraRequestControlImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UseCaseCameraRequestControlImpl$update3aRegions$1$1(UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl, List<MeteringRectangle> list, List<MeteringRectangle> list2, List<MeteringRectangle> list3, e<? super UseCaseCameraRequestControlImpl$update3aRegions$1$1> eVar) {
        super(1, eVar);
        this.this$0 = useCaseCameraRequestControlImpl;
        this.$aeRegions = list;
        this.$afRegions = list2;
        this.$awbRegions = list3;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(e<?> eVar) {
        return new UseCaseCameraRequestControlImpl$update3aRegions$1$1(this.this$0, this.$aeRegions, this.$afRegions, this.$awbRegions, eVar);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(e<? super am<Result3A>> eVar) {
        return ((UseCaseCameraRequestControlImpl$update3aRegions$1$1) create(eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) throws Exception {
        List<MeteringRectangle> listI;
        Object objAcquireSession;
        List<MeteringRectangle> listI2;
        List<MeteringRectangle> listI3;
        a aVar = a.f48038a;
        int i2 = this.label;
        try {
            if (i2 == 0) {
                c.b(obj);
                Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
                if (Logger.isDebugEnabled(Log.TAG)) {
                    android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "UseCaseCameraRequestControlImpl#update3aRegions");
                }
                UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.this$0;
                List<MeteringRectangle> list = this.$aeRegions;
                listI = this.$afRegions;
                List<MeteringRectangle> list2 = this.$awbRegions;
                this.L$0 = list;
                this.L$1 = listI;
                this.L$2 = list2;
                this.label = 1;
                objAcquireSession = useCaseCameraRequestControlImpl.useCaseCameraContext.getGraph().acquireSession(this);
                if (objAcquireSession == aVar) {
                    return aVar;
                }
                listI2 = list;
                listI3 = list2;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                listI3 = (List) this.L$2;
                List<MeteringRectangle> list3 = (List) this.L$1;
                listI2 = (List) this.L$0;
                c.b(obj);
                listI = list3;
                objAcquireSession = obj;
            }
            AutoCloseable autoCloseable = (AutoCloseable) objAcquireSession;
            try {
                UseCaseCameraRequestControlImpl$update3aRegions$1$1 useCaseCameraRequestControlImpl$update3aRegions$1$1 = this;
                CameraGraph.Session session = (CameraGraph.Session) autoCloseable;
                if (listI2 == null) {
                    listI2 = h.a.c.i(CameraGraph.Constants3A.INSTANCE.getMETERING_REGIONS_DEFAULT());
                }
                List<MeteringRectangle> list4 = listI2;
                if (listI == null) {
                    listI = h.a.c.i(CameraGraph.Constants3A.INSTANCE.getMETERING_REGIONS_DEFAULT());
                }
                List<MeteringRectangle> list5 = listI;
                if (listI3 == null) {
                    listI3 = h.a.c.i(CameraGraph.Constants3A.INSTANCE.getMETERING_REGIONS_DEFAULT());
                }
                am amVarM432update3Aznct4lo$default = CameraControls3A.CC.m432update3Aznct4lo$default(session, null, null, null, null, null, list4, list5, listI3, false, DisplayStrings.DS_TRIP_OVERVIEW_ECO_REGULATIONS_ALTERNATIVE_TRANSPORT_PUBLIC_TRANSPORT, null);
                r.y(autoCloseable, null);
                return amVarM432update3Aznct4lo$default;
            } finally {
            }
        } catch (CancellationException e2) {
            Camera2Logger camera2Logger2 = Camera2Logger.INSTANCE;
            CancellationException cancellationException = e2;
            if (Logger.isDebugEnabled(Log.TAG)) {
                android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "Cannot acquire the CameraGraph.Session", cancellationException);
            }
            return UseCaseCameraRequestControlImpl.submitFailedResult;
        }
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ Object invoke(e<? super am<? extends Result3A>> eVar) {
        return invoke2((e<? super am<Result3A>>) eVar);
    }
}
