package androidx.camera.camera2.impl;

import androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl;
import androidx.camera.camera2.pipe.RequestTemplate;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CaptureConfig;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.b.x;
import java.util.List;
import kotlinx.coroutines.am;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class UseCaseCameraRequestControlImpl$issueSingleCaptureAsync$1$1 extends g implements l<e<? super List<? extends am<? extends Void>>>, Object> {
    final /* synthetic */ int $captureMode;
    final /* synthetic */ List<CaptureConfig> $captureSequence;
    final /* synthetic */ int $flashMode;
    final /* synthetic */ int $flashType;
    int label;
    final /* synthetic */ UseCaseCameraRequestControlImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UseCaseCameraRequestControlImpl$issueSingleCaptureAsync$1$1(UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl, List<CaptureConfig> list, int i2, int i3, int i4, e<? super UseCaseCameraRequestControlImpl$issueSingleCaptureAsync$1$1> eVar) {
        super(1, eVar);
        this.this$0 = useCaseCameraRequestControlImpl;
        this.$captureSequence = list;
        this.$captureMode = i2;
        this.$flashType = i3;
        this.$flashMode = i4;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(e<?> eVar) {
        return new UseCaseCameraRequestControlImpl$issueSingleCaptureAsync$1$1(this.this$0, this.$captureSequence, this.$captureMode, this.$flashType, this.$flashMode, eVar);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(e<? super List<? extends am<Void>>> eVar) {
        return ((UseCaseCameraRequestControlImpl$issueSingleCaptureAsync$1$1) create(eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
            if (Logger.isDebugEnabled(Log.TAG)) {
                android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "UseCaseCameraRequestControlImpl#issueSingleCaptureAsync");
            }
            if (this.this$0.hasInvalidSurface(this.$captureSequence)) {
                this.this$0.failedResults(this.$captureSequence.size(), "Capture request failed due to invalid surface");
            }
            UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.this$0;
            UseCaseCameraRequestControlImpl.InfoBundle infoBundleMerge = useCaseCameraRequestControlImpl.merge(useCaseCameraRequestControlImpl.infoBundleMap);
            UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl2 = this.this$0;
            List<CaptureConfig> list = this.$captureSequence;
            int i3 = this.$captureMode;
            int i4 = this.$flashType;
            int i5 = this.$flashMode;
            if (Logger.isDebugEnabled(Log.TAG)) {
                android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "UseCaseCameraRequestControl: Submitting still captures to capture pipeline");
            }
            CapturePipeline capturePipeline = useCaseCameraRequestControlImpl2.getCapturePipeline();
            RequestTemplate requestTemplateM288getTemplateejQnlcg = infoBundleMerge.m288getTemplateejQnlcg();
            x.c(requestTemplateM288getTemplateejQnlcg);
            int iM894unboximpl = requestTemplateM288getTemplateejQnlcg.m894unboximpl();
            Camera2ImplConfig camera2ImplConfigBuild = infoBundleMerge.getOptions().build();
            this.label = 1;
            obj = capturePipeline.mo224submitStillCapturesBvXKQx0(list, iM894unboximpl, camera2ImplConfigBuild, i3, i4, i5, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
        }
        return (List) obj;
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ Object invoke(e<? super List<? extends am<? extends Void>>> eVar) {
        return invoke2((e<? super List<? extends am<Void>>>) eVar);
    }
}
