package androidx.camera.camera2.pipe.compat;

import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class CameraStateOpener$tryOpenCamera$2 extends h.c.b.a.g implements p<af, h.c.e<? super OpenCameraResult>, Object> {
    final /* synthetic */ String $cameraId;
    final /* synthetic */ AndroidCameraState $cameraState;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ CameraStateOpener this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CameraStateOpener$tryOpenCamera$2(CameraStateOpener cameraStateOpener, String str, AndroidCameraState androidCameraState, h.c.e<? super CameraStateOpener$tryOpenCamera$2> eVar) {
        super(2, eVar);
        this.this$0 = cameraStateOpener;
        this.$cameraId = str;
        this.$cameraState = androidCameraState;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        CameraStateOpener$tryOpenCamera$2 cameraStateOpener$tryOpenCamera$2 = new CameraStateOpener$tryOpenCamera$2(this.this$0, this.$cameraId, this.$cameraState, eVar);
        cameraStateOpener$tryOpenCamera$2.L$0 = obj;
        return cameraStateOpener$tryOpenCamera$2;
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, h.c.e<? super OpenCameraResult> eVar) {
        return ((CameraStateOpener$tryOpenCamera$2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0094 A[Catch: all -> 0x0025, TRY_ENTER, TryCatch #0 {all -> 0x0025, blocks: (B:6:0x0020, B:29:0x0104, B:15:0x0094, B:17:0x00a8, B:18:0x00b6, B:20:0x00bc, B:21:0x00ca, B:23:0x00d0, B:24:0x00de, B:26:0x00e4, B:27:0x00f2, B:31:0x0108, B:33:0x0110, B:34:0x0124, B:36:0x012a, B:37:0x012f, B:39:0x0135, B:40:0x013a, B:42:0x0140, B:43:0x0143, B:45:0x0149), top: B:55:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0108 A[Catch: all -> 0x0025, TryCatch #0 {all -> 0x0025, blocks: (B:6:0x0020, B:29:0x0104, B:15:0x0094, B:17:0x00a8, B:18:0x00b6, B:20:0x00bc, B:21:0x00ca, B:23:0x00d0, B:24:0x00de, B:26:0x00e4, B:27:0x00f2, B:31:0x0108, B:33:0x0110, B:34:0x0124, B:36:0x012a, B:37:0x012f, B:39:0x0135, B:40:0x013a, B:42:0x0140, B:43:0x0143, B:45:0x0149), top: B:55:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0102 -> B:29:0x0104). Please report as a decompilation issue!!! */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.compat.CameraStateOpener$tryOpenCamera$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
