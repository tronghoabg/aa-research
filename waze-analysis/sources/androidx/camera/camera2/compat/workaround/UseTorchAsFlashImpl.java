package androidx.camera.camera2.compat.workaround;

import android.hardware.camera2.CaptureResult;
import androidx.camera.camera2.compat.quirk.CameraQuirks;
import androidx.camera.camera2.compat.quirk.UltraWideFlashCaptureUnderexposureQuirk;
import androidx.camera.camera2.internal.IntrinsicZoomCalculator;
import androidx.camera.camera2.pipe.CameraDevices;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.FrameMetadata;
import androidx.camera.camera2.pipe.core.Log;
import h.c.b.a.c;
import h.c.e;
import h.f;
import h.g;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class UseTorchAsFlashImpl implements UseTorchAsFlash {
    private final CameraDevices cameraDevices;
    private final CameraQuirks cameraQuirks;
    private final f hasUwCameraUnderexposedFlashCaptureQuirk$delegate;
    private final IntrinsicZoomCalculator intrinsicZoomCalculator;

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.compat.workaround.UseTorchAsFlashImpl$shouldUseTorchAsFlash$1, reason: invalid class name */
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
            return UseTorchAsFlashImpl.this.shouldUseTorchAsFlash(null, this);
        }
    }

    public UseTorchAsFlashImpl(CameraQuirks cameraQuirks, CameraDevices cameraDevices, IntrinsicZoomCalculator intrinsicZoomCalculator) {
        x.f(cameraQuirks, "cameraQuirks");
        x.f(cameraDevices, "cameraDevices");
        x.f(intrinsicZoomCalculator, "intrinsicZoomCalculator");
        this.cameraQuirks = cameraQuirks;
        this.cameraDevices = cameraDevices;
        this.intrinsicZoomCalculator = intrinsicZoomCalculator;
        this.hasUwCameraUnderexposedFlashCaptureQuirk$delegate = g.a(new h.g.a.a() { // from class: androidx.camera.camera2.compat.workaround.UseTorchAsFlashImpl$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(this.f$0.cameraQuirks.getQuirks().contains(UltraWideFlashCaptureUnderexposureQuirk.class));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHasUwCameraUnderexposedFlashCaptureQuirk() {
        return ((Boolean) this.hasUwCameraUnderexposedFlashCaptureQuirk$delegate.getValue()).booleanValue();
    }

    private final Boolean isUltraWideCamera(FrameMetadata frameMetadata) {
        CaptureResult.Key key = CaptureResult.LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID;
        x.e(key, "LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID");
        String str = (String) frameMetadata.get(key);
        if (str == null) {
            if (!Log.INSTANCE.getWARN_LOGGABLE()) {
                return null;
            }
            android.util.Log.w(Log.TAG, "isUltraWideCamera: could not get active physical camera ID to identify if it's ultra wide camera.");
            return null;
        }
        CameraDevices cameraDevices = this.cameraDevices;
        CameraId.m547constructorimpl(str);
        CameraMetadata cameraMetadataMo434awaitCameraMetadataEfqyGwQ = cameraDevices.mo434awaitCameraMetadataEfqyGwQ(str);
        if (cameraMetadataMo434awaitCameraMetadataEfqyGwQ == null) {
            if (!Log.INSTANCE.getWARN_LOGGABLE()) {
                return null;
            }
            android.util.Log.w(Log.TAG, "isUltraWideCamera: failed to get CameraMetadata for ".concat(str));
            return null;
        }
        Float fCalculateIntrinsicZoomRatio = this.intrinsicZoomCalculator.calculateIntrinsicZoomRatio(cameraMetadataMo434awaitCameraMetadataEfqyGwQ);
        if (fCalculateIntrinsicZoomRatio == null) {
            if (!Log.INSTANCE.getWARN_LOGGABLE()) {
                return null;
            }
            android.util.Log.w(Log.TAG, "isUltraWideCamera: could not calculate intrinsic zoom ratio.");
            return null;
        }
        float fFloatValue = fCalculateIntrinsicZoomRatio.floatValue();
        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
            android.util.Log.d(Log.TAG, "isUltraWideCamera: cameraId = " + str + ", intrinsicZoomRatio = " + fFloatValue);
        }
        return Boolean.valueOf(fFloatValue < 1.0f);
    }

    @Override // androidx.camera.camera2.compat.workaround.UseTorchAsFlash
    public boolean shouldDisableAePrecapture() {
        return !getHasUwCameraUnderexposedFlashCaptureQuirk();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.camera.camera2.compat.workaround.UseTorchAsFlash
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object shouldUseTorchAsFlash(h.g.a.l<? super h.c.e<? super androidx.camera.camera2.pipe.FrameMetadata>, ? extends java.lang.Object> r7, h.c.e<? super java.lang.Boolean> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.camera.camera2.compat.workaround.UseTorchAsFlashImpl.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.camera.camera2.compat.workaround.UseTorchAsFlashImpl$shouldUseTorchAsFlash$1 r0 = (androidx.camera.camera2.compat.workaround.UseTorchAsFlashImpl.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.camera.camera2.compat.workaround.UseTorchAsFlashImpl$shouldUseTorchAsFlash$1 r0 = new androidx.camera.camera2.compat.workaround.UseTorchAsFlashImpl$shouldUseTorchAsFlash$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            java.lang.String r3 = "CXCP"
            r4 = 1
            if (r2 == 0) goto L31
            if (r2 != r4) goto L29
            e.b.c.b(r8)
            goto L64
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            e.b.c.b(r8)
            androidx.camera.camera2.pipe.core.Log r8 = androidx.camera.camera2.pipe.core.Log.INSTANCE
            boolean r8 = r8.getDEBUG_LOGGABLE()
            if (r8 == 0) goto L51
            boolean r8 = access$getHasUwCameraUnderexposedFlashCaptureQuirk(r6)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "shouldUseTorchAsFlash: hasUwCameraUnderexposedFlashCaptureQuirk = "
            r2.<init>(r5)
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            android.util.Log.d(r3, r8)
        L51:
            boolean r8 = r6.getHasUwCameraUnderexposedFlashCaptureQuirk()
            if (r8 != 0) goto L5c
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            return r6
        L5c:
            r0.label = r4
            java.lang.Object r8 = r7.invoke(r0)
            if (r8 == r1) goto L89
        L64:
            androidx.camera.camera2.pipe.FrameMetadata r8 = (androidx.camera.camera2.pipe.FrameMetadata) r8
            if (r8 != 0) goto L7a
            androidx.camera.camera2.pipe.core.Log r6 = androidx.camera.camera2.pipe.core.Log.INSTANCE
            boolean r6 = r6.getWARN_LOGGABLE()
            if (r6 == 0) goto L75
            java.lang.String r6 = "shouldUseTorchAsFlash: frameMetadata is null, defaulting to workaround for safety."
            android.util.Log.w(r3, r6)
        L75:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            return r6
        L7a:
            java.lang.Boolean r6 = r6.isUltraWideCamera(r8)
            if (r6 == 0) goto L84
            boolean r4 = r6.booleanValue()
        L84:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            return r6
        L89:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.compat.workaround.UseTorchAsFlashImpl.shouldUseTorchAsFlash(h.g.a.l, h.c.e):java.lang.Object");
    }
}
