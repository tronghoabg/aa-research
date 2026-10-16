package androidx.camera.camera2.adapter;

import android.hardware.camera2.CameraAccessException;
import android.util.Log;
import androidx.camera.core.CameraIdentifier;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import e.b.c;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.b.x;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class PipeCameraPresenceSource$fetchData$1$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ CallbackToFutureAdapter.Completer<List<CameraIdentifier>> $completer;
    int label;
    final /* synthetic */ PipeCameraPresenceSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PipeCameraPresenceSource$fetchData$1$1(PipeCameraPresenceSource pipeCameraPresenceSource, CallbackToFutureAdapter.Completer<List<CameraIdentifier>> completer, e<? super PipeCameraPresenceSource$fetchData$1$1> eVar) {
        super(2, eVar);
        this.this$0 = pipeCameraPresenceSource;
        this.$completer = completer;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new PipeCameraPresenceSource$fetchData$1$1(this.this$0, this.$completer, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((PipeCameraPresenceSource$fetchData$1$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) throws CameraAccessException {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c.b(obj);
        try {
            String[] cameraIdList = this.this$0.cameraManager.getCameraIdList();
            x.e(cameraIdList, "getCameraIdList(...)");
            ArrayList arrayList = new ArrayList();
            for (String str : cameraIdList) {
                CameraIdentifier cameraIdentifierCreate$default = null;
                try {
                    x.c(str);
                    cameraIdentifierCreate$default = CameraIdentifier.Factory.create$default(str, null, null, 6, null);
                } catch (IllegalArgumentException e2) {
                    Log.w("PipePresenceSrc", "Could not create CameraIdentifier for system ID: " + str, e2);
                }
                if (cameraIdentifierCreate$default != null) {
                    arrayList.add(cameraIdentifierCreate$default);
                }
            }
            ArrayList arrayList2 = arrayList;
            Log.d("PipePresenceSrc", "[FetchData] Refreshed camera list from hardware: " + arrayList2);
            this.this$0.updateData(arrayList2);
            this.$completer.set(arrayList2);
        } catch (Exception e3) {
            Exception exc = e3;
            Log.e("PipePresenceSrc", "[FetchData] Failed to refresh camera list from hardware.", exc);
            this.this$0.updateError(exc);
            this.$completer.setException(exc);
        }
        return ab.f48028a;
    }
}
