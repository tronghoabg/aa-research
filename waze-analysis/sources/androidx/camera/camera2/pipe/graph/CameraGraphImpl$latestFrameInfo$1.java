package androidx.camera.camera2.pipe.graph;

import androidx.camera.camera2.pipe.FrameInfo;
import e.b.c;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import kotlinx.coroutines.a.ad;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class CameraGraphImpl$latestFrameInfo$1 extends g implements p<ad<? super FrameInfo>, e<? super ab>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CameraGraphImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CameraGraphImpl$latestFrameInfo$1(CameraGraphImpl cameraGraphImpl, e<? super CameraGraphImpl$latestFrameInfo$1> eVar) {
        super(2, eVar);
        this.this$0 = cameraGraphImpl;
    }

    static final ab invokeSuspend$lambda$0(ad adVar, FrameInfo frameInfo) {
        adVar.i(frameInfo);
        return ab.f48028a;
    }

    static final ab invokeSuspend$lambda$1(CameraGraphImpl cameraGraphImpl, LatestFrameInfoListener latestFrameInfoListener) {
        cameraGraphImpl.getListeners().remove(latestFrameInfoListener);
        return ab.f48028a;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        CameraGraphImpl$latestFrameInfo$1 cameraGraphImpl$latestFrameInfo$1 = new CameraGraphImpl$latestFrameInfo$1(this.this$0, eVar);
        cameraGraphImpl$latestFrameInfo$1.L$0 = obj;
        return cameraGraphImpl$latestFrameInfo$1;
    }

    @Override // h.g.a.p
    public final Object invoke(ad<? super FrameInfo> adVar, e<? super ab> eVar) {
        return ((CameraGraphImpl$latestFrameInfo$1) create(adVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            final ad adVar = (ad) this.L$0;
            final LatestFrameInfoListener latestFrameInfoListener = new LatestFrameInfoListener(new l() { // from class: androidx.camera.camera2.pipe.graph.CameraGraphImpl$latestFrameInfo$1$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj2) {
                    return CameraGraphImpl$latestFrameInfo$1.invokeSuspend$lambda$0(adVar, (FrameInfo) obj2);
                }
            });
            this.this$0.getListeners().add(latestFrameInfoListener);
            final CameraGraphImpl cameraGraphImpl = this.this$0;
            this.label = 1;
            if (kotlinx.coroutines.a.ab.a(adVar, new h.g.a.a() { // from class: androidx.camera.camera2.pipe.graph.CameraGraphImpl$latestFrameInfo$1$$ExternalSyntheticLambda1
                @Override // h.g.a.a
                public final Object invoke() {
                    return CameraGraphImpl$latestFrameInfo$1.invokeSuspend$lambda$1(cameraGraphImpl, latestFrameInfoListener);
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
