package androidx.camera.camera2.pipe.graph;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.pipe.AeMode;
import androidx.camera.camera2.pipe.AfMode;
import androidx.camera.camera2.pipe.AwbMode;
import androidx.camera.camera2.pipe.ControlMode;
import androidx.camera.camera2.pipe.FlashMode;
import androidx.camera.camera2.pipe.config.CameraGraphScope;
import h.e.b;
import h.g.b.x;
import java.util.List;
import java.util.Map;
import kotlinx.a.d;

/* compiled from: WazeSource */
@CameraGraphScope
/* loaded from: classes2.dex */
public final class GraphState3A {
    private final d<State3A> _state = b.h(new State3A(null, null, null, null, null, null, null, null, null, null, null, 2047, null));

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: update-Gb-YQs0$default, reason: not valid java name */
    public static /* synthetic */ void m1159updateGbYQs0$default(GraphState3A graphState3A, AeMode aeMode, AfMode afMode, AwbMode awbMode, ControlMode controlMode, FlashMode flashMode, List list, List list2, List list3, Boolean bool, Boolean bool2, Boolean bool3, int i2, Object obj) {
        if (1 == (i2 & 1)) {
            aeMode = null;
        }
        if ((i2 & 2) != 0) {
            afMode = null;
        }
        if ((i2 & 4) != 0) {
            awbMode = null;
        }
        if ((i2 & 8) != 0) {
            controlMode = null;
        }
        if ((i2 & 16) != 0) {
            flashMode = null;
        }
        if ((i2 & 32) != 0) {
            list = null;
        }
        if ((i2 & 64) != 0) {
            list2 = null;
        }
        if ((i2 & 128) != 0) {
            list3 = null;
        }
        if ((i2 & 256) != 0) {
            bool = null;
        }
        if ((i2 & 512) != 0) {
            bool2 = null;
        }
        if ((i2 & 1024) != 0) {
            bool3 = null;
        }
        graphState3A.m1160updateGbYQs0(aeMode, afMode, awbMode, controlMode, flashMode, list, list2, list3, bool, bool2, bool3);
    }

    public final State3A getCurrent() {
        return (State3A) this._state.b();
    }

    public final void setCurrent(State3A state3A) {
        x.f(state3A, "value");
        this._state.d(state3A);
    }

    public final Map<CaptureRequest.Key<?>, Object> toCaptureRequestParametersMap() {
        return GraphState3AKt.toCaptureRequestParameterMap(getCurrent());
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0076  */
    /* renamed from: update-Gb-YQs0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1160updateGbYQs0(androidx.camera.camera2.pipe.AeMode r17, androidx.camera.camera2.pipe.AfMode r18, androidx.camera.camera2.pipe.AwbMode r19, androidx.camera.camera2.pipe.ControlMode r20, androidx.camera.camera2.pipe.FlashMode r21, java.util.List<android.hardware.camera2.params.MeteringRectangle> r22, java.util.List<android.hardware.camera2.params.MeteringRectangle> r23, java.util.List<android.hardware.camera2.params.MeteringRectangle> r24, java.lang.Boolean r25, java.lang.Boolean r26, java.lang.Boolean r27) {
        /*
            r16 = this;
            r0 = r16
        L2:
            kotlinx.a.d<androidx.camera.camera2.pipe.graph.State3A> r1 = r0._state
            java.lang.Object r2 = r1.b()
            r3 = r2
            androidx.camera.camera2.pipe.graph.State3A r3 = (androidx.camera.camera2.pipe.graph.State3A) r3
            if (r17 != 0) goto L12
            androidx.camera.camera2.pipe.AeMode r4 = r3.m1183getAeModeO_cDUUs()
            goto L14
        L12:
            r4 = r17
        L14:
            if (r18 != 0) goto L1b
            androidx.camera.camera2.pipe.AfMode r5 = r3.m1184getAfMode32_E3BI()
            goto L1d
        L1b:
            r5 = r18
        L1d:
            if (r19 != 0) goto L24
            androidx.camera.camera2.pipe.AwbMode r6 = r3.m1185getAwbModeaLFtWSU()
            goto L26
        L24:
            r6 = r19
        L26:
            if (r20 != 0) goto L2d
            androidx.camera.camera2.pipe.ControlMode r7 = r3.m1186getControlModeM0tcWMk()
            goto L2f
        L2d:
            r7 = r20
        L2f:
            if (r21 != 0) goto L36
            androidx.camera.camera2.pipe.FlashMode r8 = r3.m1187getFlashModecL19HE()
            goto L38
        L36:
            r8 = r21
        L38:
            r9 = 0
            r10 = 1
            if (r22 == 0) goto L4b
            r11 = r22
            java.util.Collection r11 = (java.util.Collection) r11
            boolean r12 = r11.isEmpty()
            if (r10 != r12) goto L47
            r11 = r9
        L47:
            java.util.List r11 = (java.util.List) r11
            if (r11 != 0) goto L4f
        L4b:
            java.util.List r11 = r3.getAeRegions()
        L4f:
            if (r23 == 0) goto L60
            r12 = r23
            java.util.Collection r12 = (java.util.Collection) r12
            boolean r13 = r12.isEmpty()
            if (r10 != r13) goto L5c
            r12 = r9
        L5c:
            java.util.List r12 = (java.util.List) r12
            if (r12 != 0) goto L64
        L60:
            java.util.List r12 = r3.getAfRegions()
        L64:
            if (r24 == 0) goto L76
            r13 = r24
            java.util.Collection r13 = (java.util.Collection) r13
            boolean r14 = r13.isEmpty()
            if (r10 != r14) goto L71
            goto L72
        L71:
            r9 = r13
        L72:
            java.util.List r9 = (java.util.List) r9
            if (r9 != 0) goto L7a
        L76:
            java.util.List r9 = r3.getAwbRegions()
        L7a:
            if (r25 != 0) goto L81
            java.lang.Boolean r10 = r3.getAeLock()
            goto L83
        L81:
            r10 = r25
        L83:
            if (r26 != 0) goto L8a
            java.lang.Boolean r13 = r3.getAfLock()
            goto L8c
        L8a:
            r13 = r26
        L8c:
            if (r27 != 0) goto L99
            java.lang.Boolean r14 = r3.getAwbLock()
            r15 = r11
            r11 = r9
            r9 = r15
            r15 = r12
            r12 = r10
            r10 = r15
            goto La1
        L99:
            r14 = r11
            r11 = r9
            r9 = r14
            r14 = r12
            r12 = r10
            r10 = r14
            r14 = r27
        La1:
            androidx.camera.camera2.pipe.graph.State3A r3 = r3.m1182copyGbYQs0(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r1 = r1.e(r2, r3)
            if (r1 == 0) goto L2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.graph.GraphState3A.m1160updateGbYQs0(androidx.camera.camera2.pipe.AeMode, androidx.camera.camera2.pipe.AfMode, androidx.camera.camera2.pipe.AwbMode, androidx.camera.camera2.pipe.ControlMode, androidx.camera.camera2.pipe.FlashMode, java.util.List, java.util.List, java.util.List, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean):void");
    }
}
