package androidx.camera.camera2.pipe;

import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class CameraDevicesKt$find$1 extends g implements p<l<? super CameraMetadata>, e<? super ab>, Object> {
    final /* synthetic */ String $cameraBackendId;
    final /* synthetic */ boolean $includePhysicalCameraMetadata;
    final /* synthetic */ CameraDevices $this_find;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CameraDevicesKt$find$1(CameraDevices cameraDevices, String str, boolean z, e<? super CameraDevicesKt$find$1> eVar) {
        super(2, eVar);
        this.$this_find = cameraDevices;
        this.$cameraBackendId = str;
        this.$includePhysicalCameraMetadata = z;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        CameraDevicesKt$find$1 cameraDevicesKt$find$1 = new CameraDevicesKt$find$1(this.$this_find, this.$cameraBackendId, this.$includePhysicalCameraMetadata, eVar);
        cameraDevicesKt$find$1.L$0 = obj;
        return cameraDevicesKt$find$1;
    }

    @Override // h.g.a.p
    public final Object invoke(l<? super CameraMetadata> lVar, e<? super ab> eVar) {
        return ((CameraDevicesKt$find$1) create(lVar, eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0098, code lost:
    
        if (r15 != r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00fd, code lost:
    
        if (r9.emit(r15, r14) != r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x013b, code lost:
    
        r14.L$0 = r7;
        r14.L$1 = r5;
        r14.L$2 = r4;
        r14.L$3 = r1;
        r14.L$4 = r15;
        r14.label = 4;
        r8 = r14.$this_find.mo446getCameraMetadata_mltaTw(r15, r14.$cameraBackendId, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0152, code lost:
    
        if (r8 != r0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0155, code lost:
    
        r13 = r1;
        r1 = r15;
        r15 = r8;
        r8 = r7;
        r7 = r5;
        r5 = r4;
        r4 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0187, code lost:
    
        if (r8.emit(r15, r14) != r0) goto L55;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0127  */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r8v17, types: [java.util.Set] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00e7 -> B:32:0x00ff). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00fd -> B:32:0x00ff). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0113 -> B:39:0x0121). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0189 -> B:39:0x0121). Please report as a decompilation issue!!! */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.CameraDevicesKt$find$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
