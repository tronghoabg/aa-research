package androidx.camera.camera2.impl;

import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.core.Logger;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import java.util.List;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.am;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CapturePipelineImpl$invoke$7$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ List<am<Void>> $captureSignal;
    final /* synthetic */ l<e<? super ab>, Object> $postCapture;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CapturePipelineImpl$invoke$7$1(List<? extends am<Void>> list, l<? super e<? super ab>, ? extends Object> lVar, e<? super CapturePipelineImpl$invoke$7$1> eVar) {
        super(2, eVar);
        this.$captureSignal = list;
        this.$postCapture = lVar;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new CapturePipelineImpl$invoke$7$1(this.$captureSignal, this.$postCapture, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((CapturePipelineImpl$invoke$7$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (r6.invoke(r5) != r0) goto L21;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r5.label
            java.lang.String r2 = "CXCP"
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            e.b.c.b(r6)
            goto L5d
        L12:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L1a:
            e.b.c.b(r6)
            goto L42
        L1e:
            e.b.c.b(r6)
            androidx.camera.camera2.impl.Camera2Logger r6 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE
            boolean r6 = androidx.camera.core.Logger.isDebugEnabled(r2)
            if (r6 == 0) goto L32
            java.lang.String r6 = androidx.camera.camera2.impl.Camera2Logger.access$getTRUNCATED_TAG$p()
            java.lang.String r1 = "CapturePipeline#List<PipelineTask>.invoke: Waiting for POST_CAPTURE signal"
            android.util.Log.d(r6, r1)
        L32:
            java.util.List<kotlinx.coroutines.am<java.lang.Void>> r6 = r5.$captureSignal
            java.util.Collection r6 = (java.util.Collection) r6
            r1 = r5
            h.c.e r1 = (h.c.e) r1
            r5.label = r4
            java.lang.Object r6 = kotlinx.coroutines.aj.E(r6, r1)
            if (r6 != r0) goto L42
            goto L60
        L42:
            androidx.camera.camera2.impl.Camera2Logger r6 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE
            boolean r6 = androidx.camera.core.Logger.isDebugEnabled(r2)
            if (r6 == 0) goto L53
            java.lang.String r6 = androidx.camera.camera2.impl.Camera2Logger.access$getTRUNCATED_TAG$p()
            java.lang.String r1 = "CapturePipeline#List<PipelineTask>.invoke: Waiting for POST_CAPTURE signal done"
            android.util.Log.d(r6, r1)
        L53:
            h.g.a.l<h.c.e<? super h.ab>, java.lang.Object> r6 = r5.$postCapture
            r5.label = r3
            java.lang.Object r5 = r6.invoke(r5)
            if (r5 == r0) goto L60
        L5d:
            h.ab r5 = h.ab.f48028a
            return r5
        L60:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.CapturePipelineImpl$invoke$7$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled(Log.TAG)) {
            android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "CapturePipeline#List<PipelineTask>.invoke: Waiting for POST_CAPTURE signal");
        }
        aj.E(this.$captureSignal, this);
        if (Logger.isDebugEnabled(Log.TAG)) {
            android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "CapturePipeline#List<PipelineTask>.invoke: Waiting for POST_CAPTURE signal done");
        }
        this.$postCapture.invoke(this);
        return ab.f48028a;
    }
}
