package androidx.camera.camera2.pipe.compat;

import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class Camera2Backend$prewarmIsConfigSupported$1 extends h.c.b.a.g implements p<af, h.c.e<? super ab>, Object> {
    final /* synthetic */ String $cameraId;
    int label;
    final /* synthetic */ Camera2Backend this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Camera2Backend$prewarmIsConfigSupported$1(Camera2Backend camera2Backend, String str, h.c.e<? super Camera2Backend$prewarmIsConfigSupported$1> eVar) {
        super(2, eVar);
        this.this$0 = camera2Backend;
        this.$cameraId = str;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new Camera2Backend$prewarmIsConfigSupported$1(this.this$0, this.$cameraId, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, h.c.e<? super ab> eVar) {
        return ((Camera2Backend$prewarmIsConfigSupported$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if (r6.camera2DeviceCache.m1019getOrInitializeDeviceSetupWrapper0r8Bogc(r1, r5) != r0) goto L15;
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
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            e.b.c.b(r6)
            goto L46
        L10:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L18:
            e.b.c.b(r6)
            goto L33
        L1c:
            e.b.c.b(r6)
            androidx.camera.camera2.pipe.compat.Camera2Backend r6 = r5.this$0
            java.lang.String r1 = r5.$cameraId
            androidx.camera.camera2.pipe.compat.Camera2DeviceCache r6 = androidx.camera.camera2.pipe.compat.Camera2Backend.access$getCamera2DeviceCache$p(r6)
            r4 = r5
            h.c.e r4 = (h.c.e) r4
            r5.label = r3
            java.lang.Object r6 = r6.m1018getOrInitializeDeviceSetupCompat0r8Bogc(r1, r4)
            if (r6 != r0) goto L33
            goto L49
        L33:
            androidx.camera.camera2.pipe.compat.Camera2Backend r6 = r5.this$0
            java.lang.String r1 = r5.$cameraId
            androidx.camera.camera2.pipe.compat.Camera2DeviceCache r6 = androidx.camera.camera2.pipe.compat.Camera2Backend.access$getCamera2DeviceCache$p(r6)
            r3 = r5
            h.c.e r3 = (h.c.e) r3
            r5.label = r2
            java.lang.Object r5 = r6.m1019getOrInitializeDeviceSetupWrapper0r8Bogc(r1, r3)
            if (r5 == r0) goto L49
        L46:
            h.ab r5 = h.ab.f48028a
            return r5
        L49:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.compat.Camera2Backend$prewarmIsConfigSupported$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
