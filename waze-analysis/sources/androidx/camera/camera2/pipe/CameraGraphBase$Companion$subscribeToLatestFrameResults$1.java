package androidx.camera.camera2.pipe;

import android.hardware.camera2.CaptureResult;
import androidx.camera.camera2.pipe.Metadata;
import androidx.camera.camera2.pipe.Request;
import e.b.c;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import java.util.Set;
import kotlinx.coroutines.a.ad;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class CameraGraphBase$Companion$subscribeToLatestFrameResults$1 extends g implements p<ad<? super LatestFrameMetadata>, e<? super ab>, Object> {
    final /* synthetic */ Set<CaptureResult.Key<?>> $captureResultKeys;
    final /* synthetic */ l<RequestMetadata, Boolean> $filter;
    final /* synthetic */ Set<Metadata.Key<?>> $metadataKeys;
    final /* synthetic */ CameraGraphBase<?> $this_subscribeToLatestFrameResults;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CameraGraphBase$Companion$subscribeToLatestFrameResults$1(Set<? extends CaptureResult.Key<?>> set, Set<? extends Metadata.Key<?>> set2, l<? super RequestMetadata, Boolean> lVar, CameraGraphBase<?> cameraGraphBase, e<? super CameraGraphBase$Companion$subscribeToLatestFrameResults$1> eVar) {
        super(2, eVar);
        this.$captureResultKeys = set;
        this.$metadataKeys = set2;
        this.$filter = lVar;
        this.$this_subscribeToLatestFrameResults = cameraGraphBase;
    }

    static final ab invokeSuspend$lambda$0(ad adVar, LatestFrameMetadata latestFrameMetadata) {
        adVar.i(latestFrameMetadata);
        return ab.f48028a;
    }

    static final ab invokeSuspend$lambda$1(CameraGraphBase cameraGraphBase, Request.Listener listener) {
        cameraGraphBase.getListeners().remove(listener);
        return ab.f48028a;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        CameraGraphBase$Companion$subscribeToLatestFrameResults$1 cameraGraphBase$Companion$subscribeToLatestFrameResults$1 = new CameraGraphBase$Companion$subscribeToLatestFrameResults$1(this.$captureResultKeys, this.$metadataKeys, this.$filter, this.$this_subscribeToLatestFrameResults, eVar);
        cameraGraphBase$Companion$subscribeToLatestFrameResults$1.L$0 = obj;
        return cameraGraphBase$Companion$subscribeToLatestFrameResults$1;
    }

    @Override // h.g.a.p
    public final Object invoke(ad<? super LatestFrameMetadata> adVar, e<? super ab> eVar) {
        return ((CameraGraphBase$Companion$subscribeToLatestFrameResults$1) create(adVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            final ad adVar = (ad) this.L$0;
            final Request.Listener listenerCreateLatestFrameMetadataListener = RequestListeners.Companion.createLatestFrameMetadataListener(this.$captureResultKeys, this.$metadataKeys, this.$filter, new l() { // from class: androidx.camera.camera2.pipe.CameraGraphBase$Companion$subscribeToLatestFrameResults$1$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj2) {
                    return CameraGraphBase$Companion$subscribeToLatestFrameResults$1.invokeSuspend$lambda$0(adVar, (LatestFrameMetadata) obj2);
                }
            });
            this.$this_subscribeToLatestFrameResults.getListeners().add(listenerCreateLatestFrameMetadataListener);
            final CameraGraphBase<?> cameraGraphBase = this.$this_subscribeToLatestFrameResults;
            this.label = 1;
            if (kotlinx.coroutines.a.ab.a(adVar, new h.g.a.a() { // from class: androidx.camera.camera2.pipe.CameraGraphBase$Companion$subscribeToLatestFrameResults$1$$ExternalSyntheticLambda1
                @Override // h.g.a.a
                public final Object invoke() {
                    return CameraGraphBase$Companion$subscribeToLatestFrameResults$1.invokeSuspend$lambda$1(cameraGraphBase, listenerCreateLatestFrameMetadataListener);
                }
            }, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
        }
        return ab.f48028a;
    }
}
