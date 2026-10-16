package androidx.camera.camera2.pipe.internal;

import android.os.Trace;
import androidx.camera.camera2.pipe.CameraBackend;
import androidx.camera.camera2.pipe.CameraBackendId;
import androidx.camera.camera2.pipe.CameraBackends;
import androidx.camera.camera2.pipe.CameraDevices;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.core.Log;
import h.a.i;
import h.ab;
import h.c.b.a.c;
import h.c.e;
import h.g.b.x;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.am;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraDevicesImpl implements CameraDevices {
    private final CameraBackends cameraBackends;

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.internal.CameraDevicesImpl$ids$1, reason: invalid class name */
    final class AnonymousClass1 extends c {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CameraDevicesImpl.this.ids(this);
        }
    }

    public CameraDevicesImpl(CameraBackends cameraBackends) {
        x.f(cameraBackends, "cameraBackends");
        this.cameraBackends = cameraBackends;
    }

    /* renamed from: getCameraBackend-SeavPBo, reason: not valid java name */
    private final CameraBackend m1202getCameraBackendSeavPBo(String str) {
        try {
            Trace.beginSection("getCameraBackend");
            if (str == null) {
                str = this.cameraBackends.getDefault().mo362getIdQwmhuAM();
            }
            CameraBackend cameraBackendMo389getSG3A4s8 = this.cameraBackends.mo389getSG3A4s8(str);
            if (cameraBackendMo389getSG3A4s8 != null) {
                return cameraBackendMo389getSG3A4s8;
            }
            throw new IllegalStateException("Failed to load CameraBackend " + CameraBackendId.m387toStringimpl(str));
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.camera.camera2.pipe.CameraDevices
    public /* synthetic */ List awaitCameraIds() {
        return CameraDevices.CC.$default$awaitCameraIds(this);
    }

    @Override // androidx.camera.camera2.pipe.CameraDevices
    /* renamed from: awaitCameraIds-SeavPBo */
    public List<CameraId> mo433awaitCameraIdsSeavPBo(String str) {
        CameraBackend cameraBackendM1202getCameraBackendSeavPBo = m1202getCameraBackendSeavPBo(str);
        List<CameraId> listAwaitCameraIds = cameraBackendM1202getCameraBackendSeavPBo.awaitCameraIds();
        if (listAwaitCameraIds != null || !Log.INSTANCE.getWARN_LOGGABLE()) {
            return listAwaitCameraIds;
        }
        android.util.Log.w(Log.TAG, "Failed to load cameraIds from ".concat(CameraBackendId.m387toStringimpl(cameraBackendM1202getCameraBackendSeavPBo.mo362getIdQwmhuAM())));
        return null;
    }

    @Override // androidx.camera.camera2.pipe.CameraDevices
    /* renamed from: awaitCameraMetadata-EfqyGwQ */
    public /* synthetic */ CameraMetadata mo434awaitCameraMetadataEfqyGwQ(String str) {
        return CameraDevices.CC.m451$default$awaitCameraMetadataEfqyGwQ(this, str);
    }

    @Override // androidx.camera.camera2.pipe.CameraDevices
    /* renamed from: awaitCameraMetadata-FpsL5FU */
    public CameraMetadata mo435awaitCameraMetadataFpsL5FU(String str, String str2) {
        x.f(str, "cameraId");
        CameraBackend cameraBackendM1202getCameraBackendSeavPBo = m1202getCameraBackendSeavPBo(str2);
        CameraMetadata cameraMetadataMo358awaitCameraMetadataEfqyGwQ = cameraBackendM1202getCameraBackendSeavPBo.mo358awaitCameraMetadataEfqyGwQ(str);
        if (cameraMetadataMo358awaitCameraMetadataEfqyGwQ != null || !Log.INSTANCE.getWARN_LOGGABLE()) {
            return cameraMetadataMo358awaitCameraMetadataEfqyGwQ;
        }
        android.util.Log.w(Log.TAG, "Failed to load metadata for " + CameraId.m552toStringimpl(str) + " from " + CameraBackendId.m387toStringimpl(cameraBackendM1202getCameraBackendSeavPBo.mo362getIdQwmhuAM()));
        return null;
    }

    @Override // androidx.camera.camera2.pipe.CameraDevices
    public /* synthetic */ Set awaitConcurrentCameraIds() {
        return CameraDevices.CC.$default$awaitConcurrentCameraIds(this);
    }

    @Override // androidx.camera.camera2.pipe.CameraDevices
    /* renamed from: awaitConcurrentCameraIds-SeavPBo */
    public Set<Set<CameraId>> mo436awaitConcurrentCameraIdsSeavPBo(String str) {
        return m1202getCameraBackendSeavPBo(str).awaitConcurrentCameraIds();
    }

    @Override // androidx.camera.camera2.pipe.CameraDevices
    /* renamed from: awaitMetadata-EfqyGwQ */
    public CameraMetadata mo437awaitMetadataEfqyGwQ(String str) {
        x.f(str, "camera");
        CameraMetadata cameraMetadataMo434awaitCameraMetadataEfqyGwQ = mo434awaitCameraMetadataEfqyGwQ(str);
        if (cameraMetadataMo434awaitCameraMetadataEfqyGwQ != null) {
            return cameraMetadataMo434awaitCameraMetadataEfqyGwQ;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // androidx.camera.camera2.pipe.CameraDevices
    public /* synthetic */ k cameraIdsFlow() {
        return CameraDevices.CC.$default$cameraIdsFlow(this);
    }

    @Override // androidx.camera.camera2.pipe.CameraDevices
    /* renamed from: cameraIdsFlow-SeavPBo */
    public k<List<CameraId>> mo438cameraIdsFlowSeavPBo(String str) {
        return m1202getCameraBackendSeavPBo(str).getCameraIds();
    }

    @Override // androidx.camera.camera2.pipe.CameraDevices
    /* renamed from: disconnect-EfqyGwQ */
    public /* synthetic */ void mo439disconnectEfqyGwQ(String str) {
        CameraDevices.CC.m452$default$disconnectEfqyGwQ(this, str);
    }

    @Override // androidx.camera.camera2.pipe.CameraDevices
    /* renamed from: disconnect-FpsL5FU */
    public void mo440disconnectFpsL5FU(String str, String str2) {
        x.f(str, "cameraId");
        m1202getCameraBackendSeavPBo(str2).mo359disconnectEfqyGwQ(str);
    }

    @Override // androidx.camera.camera2.pipe.CameraDevices
    public /* synthetic */ void disconnectAll() {
        mo441disconnectAllSeavPBo(null);
    }

    @Override // androidx.camera.camera2.pipe.CameraDevices
    /* renamed from: disconnectAll-SeavPBo */
    public void mo441disconnectAllSeavPBo(String str) {
        m1202getCameraBackendSeavPBo(str).disconnectAll();
    }

    @Override // androidx.camera.camera2.pipe.CameraDevices
    public /* synthetic */ am disconnectAllAsync() {
        return CameraDevices.CC.$default$disconnectAllAsync(this);
    }

    @Override // androidx.camera.camera2.pipe.CameraDevices
    /* renamed from: disconnectAllAsync-SeavPBo */
    public am<ab> mo442disconnectAllAsyncSeavPBo(String str) {
        return m1202getCameraBackendSeavPBo(str).disconnectAllAsync();
    }

    @Override // androidx.camera.camera2.pipe.CameraDevices
    /* renamed from: disconnectAsync-EfqyGwQ */
    public /* synthetic */ am mo443disconnectAsyncEfqyGwQ(String str) {
        return CameraDevices.CC.m453$default$disconnectAsyncEfqyGwQ(this, str);
    }

    @Override // androidx.camera.camera2.pipe.CameraDevices
    /* renamed from: disconnectAsync-FpsL5FU */
    public am<ab> mo444disconnectAsyncFpsL5FU(String str, String str2) {
        x.f(str, "cameraId");
        return m1202getCameraBackendSeavPBo(str2).mo360disconnectAsyncEfqyGwQ(str);
    }

    @Override // androidx.camera.camera2.pipe.CameraDevices
    public List<CameraId> findAll() {
        List<CameraId> listAwaitCameraIds = awaitCameraIds();
        return listAwaitCameraIds == null ? i.h() : listAwaitCameraIds;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.camera.camera2.pipe.CameraDevices
    /* renamed from: getCameraIds-iAq86To */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo445getCameraIdsiAq86To(java.lang.String r5, h.c.e<? super java.util.List<androidx.camera.camera2.pipe.CameraId>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.camera.camera2.pipe.internal.CameraDevicesImpl$getCameraIds$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.camera.camera2.pipe.internal.CameraDevicesImpl$getCameraIds$1 r0 = (androidx.camera.camera2.pipe.internal.CameraDevicesImpl$getCameraIds$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.camera.camera2.pipe.internal.CameraDevicesImpl$getCameraIds$1 r0 = new androidx.camera.camera2.pipe.internal.CameraDevicesImpl$getCameraIds$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.L$0
            androidx.camera.camera2.pipe.CameraBackend r4 = (androidx.camera.camera2.pipe.CameraBackend) r4
            e.b.c.b(r6)
            goto L44
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            e.b.c.b(r6)
            androidx.camera.camera2.pipe.CameraBackend r4 = r4.m1202getCameraBackendSeavPBo(r5)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r4.getCameraIds(r0)
            if (r6 == r1) goto L66
        L44:
            java.util.List r6 = (java.util.List) r6
            if (r6 != 0) goto L65
            androidx.camera.camera2.pipe.core.Log r5 = androidx.camera.camera2.pipe.core.Log.INSTANCE
            boolean r5 = r5.getWARN_LOGGABLE()
            if (r5 == 0) goto L65
            java.lang.String r4 = r4.mo362getIdQwmhuAM()
            java.lang.String r4 = androidx.camera.camera2.pipe.CameraBackendId.m387toStringimpl(r4)
            java.lang.String r5 = "Failed to load cameraIds from "
            java.lang.String r4 = r5.concat(r4)
            java.lang.String r5 = "CXCP"
            android.util.Log.w(r5, r4)
            r4 = 0
            return r4
        L65:
            return r6
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.internal.CameraDevicesImpl.mo445getCameraIdsiAq86To(java.lang.String, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.camera.camera2.pipe.CameraDevices
    /* renamed from: getCameraMetadata-_mltaTw */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo446getCameraMetadata_mltaTw(java.lang.String r5, java.lang.String r6, h.c.e<? super androidx.camera.camera2.pipe.CameraMetadata> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.camera.camera2.pipe.internal.CameraDevicesImpl$getCameraMetadata$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.camera.camera2.pipe.internal.CameraDevicesImpl$getCameraMetadata$1 r0 = (androidx.camera.camera2.pipe.internal.CameraDevicesImpl$getCameraMetadata$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.camera.camera2.pipe.internal.CameraDevicesImpl$getCameraMetadata$1 r0 = new androidx.camera.camera2.pipe.internal.CameraDevicesImpl$getCameraMetadata$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.L$1
            androidx.camera.camera2.pipe.CameraBackend r4 = (androidx.camera.camera2.pipe.CameraBackend) r4
            java.lang.Object r5 = r0.L$0
            java.lang.String r5 = (java.lang.String) r5
            e.b.c.b(r7)
            goto L4a
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            e.b.c.b(r7)
            androidx.camera.camera2.pipe.CameraBackend r4 = r4.m1202getCameraBackendSeavPBo(r6)
            r0.L$0 = r5
            r0.L$1 = r4
            r0.label = r3
            java.lang.Object r7 = r4.mo361getCameraMetadata0r8Bogc(r5, r0)
            if (r7 == r1) goto L80
        L4a:
            androidx.camera.camera2.pipe.CameraMetadata r7 = (androidx.camera.camera2.pipe.CameraMetadata) r7
            if (r7 != 0) goto L7f
            androidx.camera.camera2.pipe.core.Log r6 = androidx.camera.camera2.pipe.core.Log.INSTANCE
            boolean r6 = r6.getWARN_LOGGABLE()
            if (r6 == 0) goto L7f
            java.lang.String r5 = androidx.camera.camera2.pipe.CameraId.m552toStringimpl(r5)
            java.lang.String r4 = r4.mo362getIdQwmhuAM()
            java.lang.String r4 = androidx.camera.camera2.pipe.CameraBackendId.m387toStringimpl(r4)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Failed to load metadata for "
            r6.<init>(r7)
            r6.append(r5)
            java.lang.String r5 = " from "
            r6.append(r5)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            java.lang.String r5 = "CXCP"
            android.util.Log.w(r5, r4)
            r4 = 0
            return r4
        L7f:
            return r7
        L80:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.internal.CameraDevicesImpl.mo446getCameraMetadata_mltaTw(java.lang.String, java.lang.String, h.c.e):java.lang.Object");
    }

    @Override // androidx.camera.camera2.pipe.CameraDevices
    /* renamed from: getConcurrentCameraIds-iAq86To */
    public Object mo447getConcurrentCameraIdsiAq86To(String str, e<? super Set<? extends Set<CameraId>>> eVar) {
        return m1202getCameraBackendSeavPBo(str).getConcurrentCameraIds(eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.camera.camera2.pipe.CameraDevices
    /* renamed from: getMetadata-0r8Bogc */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo448getMetadata0r8Bogc(java.lang.String r8, h.c.e<? super androidx.camera.camera2.pipe.CameraMetadata> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof androidx.camera.camera2.pipe.internal.CameraDevicesImpl$getMetadata$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.camera.camera2.pipe.internal.CameraDevicesImpl$getMetadata$1 r0 = (androidx.camera.camera2.pipe.internal.CameraDevicesImpl$getMetadata$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.camera.camera2.pipe.internal.CameraDevicesImpl$getMetadata$1 r0 = new androidx.camera.camera2.pipe.internal.CameraDevicesImpl$getMetadata$1
            r0.<init>(r7, r9)
        L18:
            r4 = r0
            java.lang.Object r9 = r4.result
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L28
            e.b.c.b(r9)
            goto L42
        L28:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L30:
            e.b.c.b(r9)
            r1 = r7
            androidx.camera.camera2.pipe.CameraDevices r1 = (androidx.camera.camera2.pipe.CameraDevices) r1
            r4.label = r2
            r5 = 2
            r6 = 0
            r3 = 0
            r2 = r8
            java.lang.Object r9 = androidx.camera.camera2.pipe.CameraDevices.CC.m460getCameraMetadata_mltaTw$default(r1, r2, r3, r4, r5, r6)
            if (r9 == r0) goto L4d
        L42:
            if (r9 == 0) goto L45
            return r9
        L45:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Required value was null."
            r7.<init>(r8)
            throw r7
        L4d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.internal.CameraDevicesImpl.mo448getMetadata0r8Bogc(java.lang.String, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.camera.camera2.pipe.CameraDevices
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object ids(h.c.e<? super java.util.List<androidx.camera.camera2.pipe.CameraId>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.camera.camera2.pipe.internal.CameraDevicesImpl.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.camera.camera2.pipe.internal.CameraDevicesImpl$ids$1 r0 = (androidx.camera.camera2.pipe.internal.CameraDevicesImpl.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.camera.camera2.pipe.internal.CameraDevicesImpl$ids$1 r0 = new androidx.camera.camera2.pipe.internal.CameraDevicesImpl$ids$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            e.b.c.b(r5)
            androidx.camera.camera2.pipe.CameraDevices r4 = (androidx.camera.camera2.pipe.CameraDevices) r4
            r0.label = r3
            r5 = 0
            java.lang.Object r5 = androidx.camera.camera2.pipe.CameraDevices.CC.m459getCameraIdsiAq86To$default(r4, r5, r0, r3, r5)
            if (r5 == r1) goto L47
        L3d:
            java.util.List r5 = (java.util.List) r5
            if (r5 != 0) goto L46
            java.util.List r4 = h.a.i.h()
            return r4
        L46:
            return r5
        L47:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.internal.CameraDevicesImpl.ids(h.c.e):java.lang.Object");
    }

    @Override // androidx.camera.camera2.pipe.CameraDevices
    /* renamed from: prewarm-EfqyGwQ */
    public /* synthetic */ void mo449prewarmEfqyGwQ(String str) {
        CameraDevices.CC.m454$default$prewarmEfqyGwQ(this, str);
    }

    @Override // androidx.camera.camera2.pipe.CameraDevices
    /* renamed from: prewarm-FpsL5FU */
    public void mo450prewarmFpsL5FU(String str, String str2) {
        x.f(str, "cameraId");
        m1202getCameraBackendSeavPBo(str2).mo364prewarmEfqyGwQ(str);
    }
}
