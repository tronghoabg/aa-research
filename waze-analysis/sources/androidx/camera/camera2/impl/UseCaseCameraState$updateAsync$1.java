package androidx.camera.camera2.impl;

import h.c.b.a.c;
import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class UseCaseCameraState$updateAsync$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UseCaseCameraState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UseCaseCameraState$updateAsync$1(UseCaseCameraState useCaseCameraState, e<? super UseCaseCameraState$updateAsync$1> eVar) {
        super(eVar);
        this.this$0 = useCaseCameraState;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m292updateAsyncTp9XwKQ(null, false, null, false, null, null, null, this);
    }
}
