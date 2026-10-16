package androidx.camera.camera2.pipe.compat;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class Camera2Backend$isConfigSupported$1 extends h.c.b.a.c {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Camera2Backend this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Camera2Backend$isConfigSupported$1(Camera2Backend camera2Backend, h.c.e<? super Camera2Backend$isConfigSupported$1> eVar) {
        super(eVar);
        this.this$0 = camera2Backend;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo363isConfigSupportedNpXggIU(null, this);
    }
}
