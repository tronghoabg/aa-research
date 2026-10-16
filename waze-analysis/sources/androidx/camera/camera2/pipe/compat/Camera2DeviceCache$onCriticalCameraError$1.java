package androidx.camera.camera2.pipe.compat;

import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class Camera2DeviceCache$onCriticalCameraError$1 extends h.c.b.a.g implements p<af, h.c.e<? super ab>, Object> {
    final /* synthetic */ String $cameraId;
    int I$0;
    int label;
    final /* synthetic */ Camera2DeviceCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Camera2DeviceCache$onCriticalCameraError$1(Camera2DeviceCache camera2DeviceCache, String str, h.c.e<? super Camera2DeviceCache$onCriticalCameraError$1> eVar) {
        super(2, eVar);
        this.this$0 = camera2DeviceCache;
        this.$cameraId = str;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new Camera2DeviceCache$onCriticalCameraError$1(this.this$0, this.$cameraId, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, h.c.e<? super ab> eVar) {
        return ((Camera2DeviceCache$onCriticalCameraError$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        if (r8 != r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0091, code lost:
    
        if (kotlinx.coroutines.aj.r(androidx.camera.camera2.pipe.compat.Camera2DeviceCache.Companion.m1021getCRITICAL_CAMERA_ERROR_READ_CAMERA_ID_INTERVALUwyO8pc(), r7) != r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009e, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0091 -> B:28:0x0093). Please report as a decompilation issue!!! */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws android.hardware.camera2.CameraAccessException {
        /*
            r7 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r7.label
            java.lang.String r2 = "CXCP"
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L21
            if (r1 == r4) goto L1d
            if (r1 != r3) goto L15
            int r1 = r7.I$0
            e.b.c.b(r8)
            goto L93
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L1d:
            e.b.c.b(r8)
            goto L33
        L21:
            e.b.c.b(r8)
            androidx.camera.camera2.pipe.compat.Camera2DeviceCache r8 = r7.this$0
            java.lang.String r1 = r7.$cameraId
            r5 = r7
            h.c.e r5 = (h.c.e) r5
            r7.label = r4
            java.lang.Object r8 = androidx.camera.camera2.pipe.compat.Camera2DeviceCache.m1016access$isExternalCamera0r8Bogc(r8, r1, r5)
            if (r8 == r0) goto L9e
        L33:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L9b
            java.lang.String r8 = r7.$cameraId
            androidx.camera.camera2.pipe.core.Log r1 = androidx.camera.camera2.pipe.core.Log.INSTANCE
            boolean r1 = r1.getINFO_LOGGABLE()
            if (r1 == 0) goto L52
            java.lang.String r8 = androidx.camera.camera2.pipe.CameraId.m552toStringimpl(r8)
            java.lang.String r1 = "Critical camera error occurred on external "
            java.lang.String r8 = r1.concat(r8)
            android.util.Log.i(r2, r8)
        L52:
            androidx.camera.camera2.pipe.compat.Camera2DeviceCache r8 = r7.this$0
            java.util.List r8 = androidx.camera.camera2.pipe.compat.Camera2DeviceCache.access$readCameraIds(r8)
            r1 = r4
        L59:
            r5 = 4
            if (r1 >= r5) goto L9b
            if (r8 == 0) goto L80
            java.lang.String r5 = r7.$cameraId
            androidx.camera.camera2.pipe.CameraId r5 = androidx.camera.camera2.pipe.CameraId.m546boximpl(r5)
            boolean r8 = r8.contains(r5)
            if (r8 != 0) goto L80
            java.lang.String r7 = r7.$cameraId
            androidx.camera.camera2.pipe.core.Log r8 = androidx.camera.camera2.pipe.core.Log.INSTANCE
            boolean r8 = r8.getINFO_LOGGABLE()
            if (r8 == 0) goto L9b
            java.lang.String r8 = "External "
            java.lang.String r0 = " was removed"
            java.lang.String r7 = androidx.camera.camera2.pipe.compat.d.a(r7, r8, r0)
            android.util.Log.i(r2, r7)
            goto L9b
        L80:
            androidx.camera.camera2.pipe.compat.Camera2DeviceCache$Companion r8 = androidx.camera.camera2.pipe.compat.Camera2DeviceCache.Companion
            long r5 = r8.m1021getCRITICAL_CAMERA_ERROR_READ_CAMERA_ID_INTERVALUwyO8pc()
            r8 = r7
            h.c.e r8 = (h.c.e) r8
            r7.I$0 = r1
            r7.label = r3
            java.lang.Object r8 = kotlinx.coroutines.aj.r(r5, r8)
            if (r8 == r0) goto L9e
        L93:
            androidx.camera.camera2.pipe.compat.Camera2DeviceCache r8 = r7.this$0
            java.util.List r8 = androidx.camera.camera2.pipe.compat.Camera2DeviceCache.access$readCameraIds(r8)
            int r1 = r1 + r4
            goto L59
        L9b:
            h.ab r7 = h.ab.f48028a
            return r7
        L9e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.compat.Camera2DeviceCache$onCriticalCameraError$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
