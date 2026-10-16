package androidx.camera.camera2.pipe.compat;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class RetryingCameraStateOpenerImpl$openCameraWithRetry$1 extends h.c.b.a.c {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RetryingCameraStateOpenerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RetryingCameraStateOpenerImpl$openCameraWithRetry$1(RetryingCameraStateOpenerImpl retryingCameraStateOpenerImpl, h.c.e<? super RetryingCameraStateOpenerImpl$openCameraWithRetry$1> eVar) {
        super(eVar);
        this.this$0 = retryingCameraStateOpenerImpl;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo1092openCameraWithRetryzDSwpeU(null, null, null, null, this);
    }
}
