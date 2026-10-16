package androidx.camera.camera2.pipe.graph;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import androidx.camera.camera2.pipe.AeMode;
import androidx.camera.camera2.pipe.AfMode;
import androidx.camera.camera2.pipe.AwbMode;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.ControlMode;
import androidx.camera.camera2.pipe.Converge3ABehavior;
import androidx.camera.camera2.pipe.FlashMode;
import androidx.camera.camera2.pipe.FrameMetadata;
import androidx.camera.camera2.pipe.Lock3ABehavior;
import androidx.camera.camera2.pipe.Result3A;
import androidx.camera.camera2.pipe.config.CameraGraphScope;
import androidx.camera.camera2.pipe.core.Log;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.strings.DisplayStrings;
import h.a.i;
import h.a.r;
import h.c.e;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import h.k;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
@CameraGraphScope
/* loaded from: classes2.dex */
public final class Controller3A {
    private static final Map<CaptureRequest.Key<?>, Object> aePrecaptureAndAfCancelParams;
    private static final Map<CaptureRequest.Key<?>, Object> aePrecaptureCancelParams;
    private static final List<Integer> afUnlockedStateList;
    private static final List<Integer> awbUnlockedStateList;
    private static final CompletableDeferred<Result3A> deferredResult3AOk;
    private static final l<FrameMetadata, Boolean> unlock3APostCaptureAfUnlockedCondition;
    private static final Map<? extends CaptureRequest.Key<? extends Object>, Object> unlock3APostCaptureLockAeAndCancelAfParams;
    private static final Map<CaptureRequest.Key<Boolean>, Boolean> unlock3APostCaptureLockAeParams;
    private static final Map<CaptureRequest.Key<?>, Object> unlock3APostCaptureUnlockAeParams;
    private final Listener3A graphListener3A;
    private final GraphProcessor graphProcessor;
    private final GraphState3A graphState3A;
    private am<Result3A> lastUpdate3AResult;
    private final CameraMetadata metadata;
    public static final Companion Companion = new Companion(null);
    private static final List<Integer> aeConvergedStateList = i.i(2, 4, 3);
    private static final List<Integer> awbConvergedStateList = i.i(2, 3);
    private static final List<Integer> afConvergedStateList = i.i(2, 6, 4, 5);
    private static final List<Integer> aeLockedStateList = i.d(3);
    private static final List<Integer> awbLockedStateList = i.d(3);
    private static final List<Integer> afLockedStateList = i.i(4, 5);
    private static final List<Integer> aePostPrecaptureStateList = i.i(2, 4, 3);
    private static final List<Integer> awbPostPrecaptureStateList = i.i(2, 3);
    private static final Map<CaptureRequest.Key<?>, Object> parameterForAfTriggerStart = r.e(new k(CaptureRequest.CONTROL_AF_TRIGGER, 1));
    private static final Map<CaptureRequest.Key<?>, Object> parameterForAfTriggerCancel = r.e(new k(CaptureRequest.CONTROL_AF_TRIGGER, 2));
    private static final Map<CaptureRequest.Key<?>, Object> parametersForAePrecapture = r.e(new k(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1));
    private static final Map<CaptureRequest.Key<?>, Object> parametersForAePrecaptureAndAfTrigger = r.k(new k(CaptureRequest.CONTROL_AF_TRIGGER, 1), new k(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1));
    private static final CompletableDeferred<Result3A> deferredResult3ASubmitFailed = bo.h(new Result3A(Result3A.Status.Companion.m909getSUBMIT_FAILEDJvTi9ms(), null, null, 6, null));
    private static final List<Integer> aeUnlockedStateList = i.i(0, 1, 2, 4);

    static {
        List<Integer> listI = i.i(0, 3, 1, 2, 6);
        afUnlockedStateList = listI;
        awbUnlockedStateList = i.i(0, 1, 2);
        unlock3APostCaptureLockAeParams = r.e(new k(CaptureRequest.CONTROL_AE_LOCK, true));
        unlock3APostCaptureLockAeAndCancelAfParams = r.k(new k(CaptureRequest.CONTROL_AF_TRIGGER, 2), new k(CaptureRequest.CONTROL_AE_LOCK, true));
        unlock3APostCaptureUnlockAeParams = r.e(new k(CaptureRequest.CONTROL_AE_LOCK, false));
        aePrecaptureCancelParams = r.e(new k(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2));
        aePrecaptureAndAfCancelParams = r.k(new k(CaptureRequest.CONTROL_AF_TRIGGER, 2), new k(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2));
        unlock3APostCaptureAfUnlockedCondition = Result3AStateListenerKt.toConditionChecker(r.e(new k(CaptureResult.CONTROL_AF_STATE, listI)));
        deferredResult3AOk = bo.h(new Result3A(Result3A.Status.Companion.m907getOKJvTi9ms(), null, null, 4, null));
    }

    public Controller3A(GraphProcessor graphProcessor, CameraMetadata cameraMetadata, GraphState3A graphState3A, Listener3A listener3A) {
        x.f(graphProcessor, "graphProcessor");
        x.f(cameraMetadata, TtmlNode.TAG_METADATA);
        x.f(graphState3A, "graphState3A");
        x.f(listener3A, "graphListener3A");
        this.graphProcessor = graphProcessor;
        this.metadata = cameraMetadata;
        this.graphState3A = graphState3A;
        this.graphListener3A = listener3A;
    }

    /* renamed from: converge3A-3VUeUZc$default, reason: not valid java name */
    public static /* synthetic */ am m1138converge3A3VUeUZc$default(Controller3A controller3A, List list, List list2, List list3, Converge3ABehavior converge3ABehavior, Converge3ABehavior converge3ABehavior2, Converge3ABehavior converge3ABehavior3, l lVar, Integer num, Long l2, int i2, Object obj) {
        List list4;
        Integer num2;
        Long l3;
        l lVar2;
        Converge3ABehavior converge3ABehavior4;
        Converge3ABehavior converge3ABehavior5;
        Controller3A controller3A2;
        Integer num3 = (i2 & 128) != 0 ? 60 : num;
        Long lValueOf = (i2 & 256) != 0 ? Long.valueOf(CameraGraph.Constants3A.DEFAULT_TIME_LIMIT_NS) : l2;
        int i3 = i2 & 32;
        int i4 = i2 & 16;
        int i5 = i2 & 8;
        int i6 = i2 & 4;
        int i7 = i2 & 2;
        int i8 = i2 & 1;
        l lVar3 = (i2 & 64) != 0 ? null : lVar;
        Converge3ABehavior converge3ABehavior6 = i3 != 0 ? null : converge3ABehavior3;
        Converge3ABehavior converge3ABehavior7 = i4 != 0 ? null : converge3ABehavior2;
        if (i5 != 0) {
            converge3ABehavior = null;
        }
        if (i6 != 0) {
            list3 = null;
        }
        if (i7 != 0) {
            list2 = null;
        }
        Converge3ABehavior converge3ABehavior8 = converge3ABehavior;
        List list5 = list3;
        List list6 = list2;
        if (1 == i8) {
            list4 = null;
            controller3A2 = controller3A;
            num2 = num3;
            l3 = lValueOf;
            lVar2 = lVar3;
            converge3ABehavior4 = converge3ABehavior6;
            converge3ABehavior5 = converge3ABehavior7;
        } else {
            list4 = list;
            num2 = num3;
            l3 = lValueOf;
            lVar2 = lVar3;
            converge3ABehavior4 = converge3ABehavior6;
            converge3ABehavior5 = converge3ABehavior7;
            controller3A2 = controller3A;
        }
        return controller3A2.m1147converge3A3VUeUZc(list4, list6, list5, converge3ABehavior8, converge3ABehavior5, converge3ABehavior4, lVar2, num2, l3);
    }

    private final Result3AStateListenerImpl createConvergeListener(boolean z, boolean z2, boolean z3, l<? super FrameMetadata, Boolean> lVar, Integer num, Long l2) {
        if (lVar == null) {
            lVar = Result3AStateListenerKt.toConditionChecker(createConverged3AExitConditions(z, z2, z3));
        }
        return new Result3AStateListenerImpl(lVar, num, l2);
    }

    static /* synthetic */ Result3AStateListenerImpl createConvergeListener$default(Controller3A controller3A, boolean z, boolean z2, boolean z3, l lVar, Integer num, Long l2, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            lVar = null;
        }
        return controller3A.createConvergeListener(z, z2, z3, lVar, num, l2);
    }

    private final Map<CaptureResult.Key<?>, List<Object>> createConverged3AExitConditions(boolean z, boolean z2, boolean z3) {
        if (!z && !z2 && !z3) {
            return r.j();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (z) {
            linkedHashMap.put(CaptureResult.CONTROL_AE_STATE, aeConvergedStateList);
        }
        if (z3) {
            linkedHashMap.put(CaptureResult.CONTROL_AWB_STATE, awbConvergedStateList);
        }
        if (z2) {
            linkedHashMap.put(CaptureResult.CONTROL_AF_STATE, afConvergedStateList);
        }
        return linkedHashMap;
    }

    /* renamed from: createListenerFor3AParams-pdXxemM, reason: not valid java name */
    private final Result3AStateListenerImpl m1139createListenerFor3AParamspdXxemM(AeMode aeMode, AfMode afMode, AwbMode awbMode, ControlMode controlMode, FlashMode flashMode) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (aeMode != null) {
            int iM303unboximpl = aeMode.m303unboximpl();
            CaptureResult.Key key = CaptureResult.CONTROL_AE_MODE;
            x.e(key, "CONTROL_AE_MODE");
        }
        if (afMode != null) {
            int iM322unboximpl = afMode.m322unboximpl();
            CaptureResult.Key key2 = CaptureResult.CONTROL_AF_MODE;
            x.e(key2, "CONTROL_AF_MODE");
        }
        if (awbMode != null) {
            int iM348unboximpl = awbMode.m348unboximpl();
            CaptureResult.Key key3 = CaptureResult.CONTROL_AWB_MODE;
            x.e(key3, "CONTROL_AWB_MODE");
        }
        if (controlMode != null) {
            int iM613unboximpl = controlMode.m613unboximpl();
            CaptureResult.Key key4 = CaptureResult.CONTROL_MODE;
            x.e(key4, "CONTROL_MODE");
        }
        if (flashMode != null) {
            int iM636unboximpl = flashMode.m636unboximpl();
            CaptureResult.Key key5 = CaptureResult.FLASH_MODE;
            x.e(key5, "FLASH_MODE");
        }
        return new Result3AStateListenerImpl(r.r(linkedHashMap), (Integer) null, (Long) null, 6, (o) null);
    }

    /* renamed from: createListenerFor3AParams-pdXxemM$default, reason: not valid java name */
    static /* synthetic */ Result3AStateListenerImpl m1140createListenerFor3AParamspdXxemM$default(Controller3A controller3A, AeMode aeMode, AfMode afMode, AwbMode awbMode, ControlMode controlMode, FlashMode flashMode, int i2, Object obj) {
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
        return controller3A.m1139createListenerFor3AParamspdXxemM(aeMode, afMode, awbMode, controlMode, flashMode);
    }

    private final l<FrameMetadata, Boolean> createLock3AForCaptureExitConditions(final boolean z, final boolean z2) {
        return new l() { // from class: androidx.camera.camera2.pipe.graph.Controller3A$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(Controller3A.createLock3AForCaptureExitConditions$lambda$0(z2, z, (FrameMetadata) obj));
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static final boolean createLock3AForCaptureExitConditions$lambda$0(boolean r6, boolean r7, androidx.camera.camera2.pipe.FrameMetadata r8) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.graph.Controller3A.createLock3AForCaptureExitConditions$lambda$0(boolean, boolean, androidx.camera.camera2.pipe.FrameMetadata):boolean");
    }

    private final Map<CaptureResult.Key<?>, List<Object>> createLocked3AExitConditions(boolean z, boolean z2, boolean z3) {
        if (!z && !z2 && !z3) {
            return r.j();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (z) {
            linkedHashMap.put(CaptureResult.CONTROL_AE_STATE, aeLockedStateList);
        }
        if (z2) {
            linkedHashMap.put(CaptureResult.CONTROL_AF_STATE, afLockedStateList);
        }
        if (z3) {
            linkedHashMap.put(CaptureResult.CONTROL_AWB_STATE, awbLockedStateList);
        }
        return linkedHashMap;
    }

    private final Map<CaptureResult.Key<?>, List<Object>> createUnLocked3AExitConditions(boolean z, boolean z2, boolean z3) {
        if (!z && !z2 && !z3) {
            return r.j();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (z) {
            linkedHashMap.put(CaptureResult.CONTROL_AE_STATE, aeUnlockedStateList);
        }
        if (z2) {
            linkedHashMap.put(CaptureResult.CONTROL_AF_STATE, afUnlockedStateList);
        }
        if (z3) {
            linkedHashMap.put(CaptureResult.CONTROL_AWB_STATE, awbUnlockedStateList);
        }
        return linkedHashMap;
    }

    /* renamed from: lock3A-Qz1gx5w$default, reason: not valid java name */
    public static /* synthetic */ Object m1141lock3AQz1gx5w$default(Controller3A controller3A, List list, List list2, List list3, Lock3ABehavior lock3ABehavior, Lock3ABehavior lock3ABehavior2, Lock3ABehavior lock3ABehavior3, AeMode aeMode, l lVar, l lVar2, int i2, Long l2, Long l3, e eVar, int i3, Object obj) {
        int i4 = i3 & 1024;
        Long lValueOf = Long.valueOf(CameraGraph.Constants3A.DEFAULT_TIME_LIMIT_NS);
        Long l4 = i4 != 0 ? lValueOf : l2;
        Long l5 = (i3 & 2048) != 0 ? lValueOf : l3;
        int i5 = i3 & 256;
        int i6 = i3 & 128;
        int i7 = i3 & 64;
        int i8 = i3 & 32;
        int i9 = i3 & 16;
        int i10 = i3 & 8;
        int i11 = i3 & 4;
        int i12 = i3 & 2;
        int i13 = i3 & 1;
        int i14 = (i3 & 512) != 0 ? 60 : i2;
        l lVar3 = i5 != 0 ? null : lVar2;
        l lVar4 = i6 != 0 ? null : lVar;
        AeMode aeMode2 = i7 != 0 ? null : aeMode;
        Lock3ABehavior lock3ABehavior4 = i8 != 0 ? null : lock3ABehavior3;
        Lock3ABehavior lock3ABehavior5 = i9 != 0 ? null : lock3ABehavior2;
        Lock3ABehavior lock3ABehavior6 = i10 != 0 ? null : lock3ABehavior;
        List list4 = i11 != 0 ? null : list3;
        return controller3A.m1148lock3AQz1gx5w(1 == i13 ? null : list, i12 != 0 ? null : list2, list4, lock3ABehavior6, lock3ABehavior5, lock3ABehavior4, aeMode2, lVar4, lVar3, i14, l4, l5, eVar);
    }

    private final am<Result3A> lock3AForCapture(Map<CaptureRequest.Key<?>, ? extends Object> map, l<? super FrameMetadata, Boolean> lVar, int i2, long j2) {
        if (this.graphProcessor.getRepeatingRequest() == null) {
            return deferredResult3ASubmitFailed;
        }
        if (map == null) {
            map = parametersForAePrecaptureAndAfTrigger;
        }
        Iterator<Map.Entry<CaptureRequest.Key<?>, ? extends Object>> it = map.entrySet().iterator();
        boolean zN = false;
        while (it.hasNext()) {
            zN |= x.n(it.next().getValue(), 1);
        }
        if (lVar == null) {
            lVar = createLock3AForCaptureExitConditions(zN, false);
        }
        Result3AStateListenerImpl result3AStateListenerImpl = new Result3AStateListenerImpl(lVar, Integer.valueOf(i2), Long.valueOf(j2));
        Result3AStateListenerImpl result3AStateListenerImpl2 = result3AStateListenerImpl;
        this.graphListener3A.addListener(result3AStateListenerImpl2);
        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
            android.util.Log.d(Log.TAG, "lock3AForCapture - sending a request to trigger ae precapture metering and af.");
        }
        if (this.graphProcessor.trigger(map)) {
            this.graphProcessor.update3AParameters(this.graphState3A.toCaptureRequestParametersMap());
            return result3AStateListenerImpl.getResult();
        }
        this.graphListener3A.removeListener(result3AStateListenerImpl2);
        return deferredResult3ASubmitFailed;
    }

    public static /* synthetic */ am lock3AForCapture$default(Controller3A controller3A, boolean z, boolean z2, int i2, long j2, int i3, Object obj) {
        boolean z3 = z2 & ((i3 & 2) == 0);
        if ((i3 & 4) != 0) {
            i2 = 60;
        }
        if ((i3 & 8) != 0) {
            j2 = CameraGraph.Constants3A.DEFAULT_TIME_LIMIT_NS;
        }
        return controller3A.lock3AForCapture(1 == ((z ? 1 : 0) | (i3 & 1)), z3, i2, j2);
    }

    /* renamed from: lock3ANow-R6AlCjU, reason: not valid java name */
    private final am<Result3A> m1142lock3ANowR6AlCjU(Lock3ABehavior lock3ABehavior, Lock3ABehavior lock3ABehavior2, Lock3ABehavior lock3ABehavior3, AeMode aeMode, l<? super FrameMetadata, Boolean> lVar, Integer num, Long l2) {
        am<Result3A> result;
        AeMode aeModeM1183getAeModeO_cDUUs = null;
        Boolean bool = lock3ABehavior == null ? null : true;
        Boolean bool2 = lock3ABehavior3 == null ? null : true;
        Map<CaptureResult.Key<?>, List<Object>> mapCreateLocked3AExitConditions = createLocked3AExitConditions(bool != null, lock3ABehavior2 != null, bool2 != null);
        if (lVar == null && mapCreateLocked3AExitConditions.isEmpty()) {
            result = null;
        } else {
            Result3AStateListenerImpl result3AStateListenerImpl = new Result3AStateListenerImpl(lVar == null ? Result3AStateListenerKt.toConditionChecker(mapCreateLocked3AExitConditions) : lVar, num, l2);
            this.graphListener3A.addListener(result3AStateListenerImpl);
            GraphState3A.m1159updateGbYQs0$default(this.graphState3A, null, null, null, null, null, null, null, null, bool, null, bool2, DisplayStrings.DS_RANK, null);
            Boolean bool3 = bool;
            Boolean bool4 = bool2;
            if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                android.util.Log.d(Log.TAG, "lock3A - submitting request with aeLock=" + bool3 + " , awbLock=" + bool4);
            }
            this.graphProcessor.update3AParameters(this.graphState3A.toCaptureRequestParametersMap());
            result = result3AStateListenerImpl.getResult();
        }
        if (lock3ABehavior2 == null) {
            x.c(result);
            return result;
        }
        if (aeMode != null) {
            GraphState3A graphState3A = this.graphState3A;
            int iM303unboximpl = aeMode.m303unboximpl();
            aeModeM1183getAeModeO_cDUUs = graphState3A.getCurrent().m1183getAeModeO_cDUUs();
            GraphState3A.m1159updateGbYQs0$default(this.graphState3A, AeMode.m294boximpl(iM303unboximpl), null, null, null, null, null, null, null, null, null, null, 2046, null);
            this.graphProcessor.update3AParameters(this.graphState3A.toCaptureRequestParametersMap());
        }
        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
            android.util.Log.d(Log.TAG, "lock3A - submitting a request to lock af.");
        }
        if (!this.graphProcessor.trigger(parameterForAfTriggerStart)) {
            return deferredResult3ASubmitFailed;
        }
        GraphState3A.m1159updateGbYQs0$default(this.graphState3A, null, null, null, null, null, null, null, null, null, true, null, DisplayStrings.DS_MAP_POPUP_MY_LOCATION_SEND_LOCATION_BUTTON, null);
        if (aeModeM1183getAeModeO_cDUUs != null) {
            GraphState3A.m1159updateGbYQs0$default(this.graphState3A, AeMode.m294boximpl(aeModeM1183getAeModeO_cDUUs.m303unboximpl()), null, null, null, null, null, null, null, null, null, null, 2046, null);
            this.graphProcessor.update3AParameters(this.graphState3A.toCaptureRequestParametersMap());
        }
        x.c(result);
        return result;
    }

    /* renamed from: lock3ANow-R6AlCjU$default, reason: not valid java name */
    static /* synthetic */ am m1143lock3ANowR6AlCjU$default(Controller3A controller3A, Lock3ABehavior lock3ABehavior, Lock3ABehavior lock3ABehavior2, Lock3ABehavior lock3ABehavior3, AeMode aeMode, l lVar, Integer num, Long l2, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            aeMode = null;
        }
        return controller3A.m1142lock3ANowR6AlCjU(lock3ABehavior, lock3ABehavior2, lock3ABehavior3, aeMode, lVar, num, l2);
    }

    /* renamed from: setTorchOff-NqN7i0k$default, reason: not valid java name */
    public static /* synthetic */ am m1144setTorchOffNqN7i0k$default(Controller3A controller3A, AeMode aeMode, int i2, Object obj) {
        if (1 == (i2 & 1)) {
            aeMode = null;
        }
        return controller3A.m1149setTorchOffNqN7i0k(aeMode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: submit3A-ydBZfZg$default, reason: not valid java name */
    public static /* synthetic */ am m1145submit3AydBZfZg$default(Controller3A controller3A, AeMode aeMode, AfMode afMode, AwbMode awbMode, List list, List list2, List list3, int i2, Object obj) {
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
            list = null;
        }
        if ((i2 & 16) != 0) {
            list2 = null;
        }
        if ((i2 & 32) != 0) {
            list3 = null;
        }
        return controller3A.m1150submit3AydBZfZg(aeMode, afMode, awbMode, list, list2, list3);
    }

    public static /* synthetic */ am unlock3A$default(Controller3A controller3A, Boolean bool, Boolean bool2, Boolean bool3, l lVar, int i2, Long l2, int i3, Object obj) {
        if ((i3 & 32) != 0) {
            l2 = Long.valueOf(CameraGraph.Constants3A.DEFAULT_TIME_LIMIT_NS);
        }
        Long l3 = l2;
        int i4 = i3 & 16;
        int i5 = i3 & 8;
        int i6 = i3 & 4;
        int i7 = i3 & 2;
        int i8 = i3 & 1;
        if (i4 != 0) {
            i2 = 60;
        }
        int i9 = i2;
        l lVar2 = i5 != 0 ? null : lVar;
        Boolean bool4 = i6 != 0 ? null : bool3;
        if (i7 != 0) {
            bool2 = null;
        }
        return controller3A.unlock3A(1 == i8 ? null : bool, bool2, bool4, lVar2, i9, l3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final am<Result3A> unlock3APostCaptureAndroidMAndAbove(boolean z) {
        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
            android.util.Log.d(Log.TAG, "unlock3APostCapture - sending a request to reset af and ae precapture metering.");
        }
        if (!this.graphProcessor.trigger(z ? aePrecaptureAndAfCancelParams : aePrecaptureCancelParams)) {
            return deferredResult3ASubmitFailed;
        }
        Result3AStateListenerImpl result3AStateListenerImpl = z ? new Result3AStateListenerImpl(unlock3APostCaptureAfUnlockedCondition, (Integer) null, (Long) null, 6, (o) null) : new Result3AStateListenerImpl(r.j(), (Integer) null, (Long) null, 6, (o) null);
        this.graphListener3A.addListener(result3AStateListenerImpl);
        this.graphProcessor.update3AParameters(this.graphState3A.toCaptureRequestParametersMap());
        return result3AStateListenerImpl.getResult();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: update3A-0Pt5STg$default, reason: not valid java name */
    public static /* synthetic */ am m1146update3A0Pt5STg$default(Controller3A controller3A, AeMode aeMode, AfMode afMode, AwbMode awbMode, FlashMode flashMode, ControlMode controlMode, List list, List list2, List list3, boolean z, int i2, Object obj) {
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
            flashMode = null;
        }
        if ((i2 & 16) != 0) {
            controlMode = null;
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
        return controller3A.m1151update3A0Pt5STg(aeMode, afMode, awbMode, flashMode, controlMode, list, list2, list3, z & ((i2 & 256) == 0));
    }

    /* renamed from: converge3A-3VUeUZc, reason: not valid java name */
    public final am<Result3A> m1147converge3A3VUeUZc(List<MeteringRectangle> list, List<MeteringRectangle> list2, List<MeteringRectangle> list3, Converge3ABehavior converge3ABehavior, Converge3ABehavior converge3ABehavior2, Converge3ABehavior converge3ABehavior3, l<? super FrameMetadata, Boolean> lVar, Integer num, Long l2) {
        Long l3;
        String str;
        l<? super FrameMetadata, Boolean> lVar2;
        if (converge3ABehavior == null && converge3ABehavior2 == null && converge3ABehavior3 == null) {
            throw new IllegalArgumentException("Converge behavior must be specified for at least one of ae, af or awb.");
        }
        boolean z = true;
        Converge3ABehavior converge3ABehavior4 = true != CameraMetadata.Companion.getSupportsAutoFocusTrigger(this.metadata) ? null : converge3ABehavior2;
        if (converge3ABehavior == null && converge3ABehavior4 == null && converge3ABehavior3 == null) {
            return deferredResult3AOk;
        }
        if (this.graphProcessor.getRepeatingRequest() == null) {
            return deferredResult3ASubmitFailed;
        }
        if (list != null || list2 != null || list3 != null) {
            GraphState3A.m1159updateGbYQs0$default(this.graphState3A, null, null, null, null, null, list, list2, list3, null, null, null, DisplayStrings.DS_GAS_PRICES_AVAILABLE, null);
        }
        Boolean bool = Controller3AKt.m1152shouldUnlockeBHfGHg(converge3ABehavior) ? false : null;
        Boolean bool2 = Controller3AKt.m1152shouldUnlockeBHfGHg(converge3ABehavior3) ? false : null;
        if (bool != null || bool2 != null) {
            if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                android.util.Log.d(Log.TAG, "converge3A - setting aeLock=" + bool + ", awbLock=" + bool2 + " for rescan. Custom converge isSet=" + (lVar != null) + ")");
            }
            GraphState3A.m1159updateGbYQs0$default(this.graphState3A, null, null, null, null, null, null, null, null, bool, null, bool2, DisplayStrings.DS_RANK, null);
        }
        boolean z2 = converge3ABehavior != null;
        boolean z3 = converge3ABehavior4 != null;
        if (converge3ABehavior3 != null) {
            lVar2 = lVar;
            l3 = l2;
            str = Log.TAG;
        } else {
            z = false;
            l3 = l2;
            str = Log.TAG;
            lVar2 = lVar;
        }
        Result3AStateListenerImpl result3AStateListenerImplCreateConvergeListener = createConvergeListener(z2, z3, z, lVar2, num, l3);
        if (!Controller3AKt.m1152shouldUnlockeBHfGHg(converge3ABehavior4)) {
            this.graphListener3A.addListener(result3AStateListenerImplCreateConvergeListener);
            this.graphProcessor.update3AParameters(this.graphState3A.toCaptureRequestParametersMap());
            return result3AStateListenerImplCreateConvergeListener.getResult();
        }
        this.graphProcessor.update3AParameters(this.graphState3A.toCaptureRequestParametersMap());
        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
            android.util.Log.d(str, "converge3A - sending a single request to unlock af to start a new scan.");
        }
        if (!this.graphProcessor.trigger(parameterForAfTriggerCancel)) {
            return deferredResult3ASubmitFailed;
        }
        this.graphListener3A.addListener(result3AStateListenerImplCreateConvergeListener);
        this.graphProcessor.update3AParameters(this.graphState3A.toCaptureRequestParametersMap());
        return result3AStateListenerImplCreateConvergeListener.getResult();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ce, code lost:
    
        if (r30.graphProcessor.trigger(androidx.camera.camera2.pipe.graph.Controller3A.parameterForAfTriggerCancel) != false) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* renamed from: lock3A-Qz1gx5w, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1148lock3AQz1gx5w(java.util.List<android.hardware.camera2.params.MeteringRectangle> r31, java.util.List<android.hardware.camera2.params.MeteringRectangle> r32, java.util.List<android.hardware.camera2.params.MeteringRectangle> r33, androidx.camera.camera2.pipe.Lock3ABehavior r34, androidx.camera.camera2.pipe.Lock3ABehavior r35, androidx.camera.camera2.pipe.Lock3ABehavior r36, androidx.camera.camera2.pipe.AeMode r37, h.g.a.l<? super androidx.camera.camera2.pipe.FrameMetadata, java.lang.Boolean> r38, h.g.a.l<? super androidx.camera.camera2.pipe.FrameMetadata, java.lang.Boolean> r39, int r40, java.lang.Long r41, java.lang.Long r42, h.c.e<? super kotlinx.coroutines.am<androidx.camera.camera2.pipe.Result3A>> r43) {
        /*
            Method dump skipped, instructions count: 581
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.graph.Controller3A.m1148lock3AQz1gx5w(java.util.List, java.util.List, java.util.List, androidx.camera.camera2.pipe.Lock3ABehavior, androidx.camera.camera2.pipe.Lock3ABehavior, androidx.camera.camera2.pipe.Lock3ABehavior, androidx.camera.camera2.pipe.AeMode, h.g.a.l, h.g.a.l, int, java.lang.Long, java.lang.Long, h.c.e):java.lang.Object");
    }

    public final void reset3A(State3A state3A) {
        Controller3A controller3A;
        x.f(state3A, "initialState3A");
        State3A state3AState3ASnapshot = state3ASnapshot();
        if (x.n(state3AState3ASnapshot, state3A)) {
            return;
        }
        this.graphState3A.setCurrent(state3A);
        this.graphProcessor.update3AParameters(this.graphState3A.toCaptureRequestParametersMap());
        if (GraphState3AKt.wasAfLocked(state3A, state3AState3ASnapshot)) {
            controller3A = this;
            unlock3A$default(controller3A, null, true, null, null, 0, null, 61, null);
        } else {
            controller3A = this;
        }
        if (GraphState3AKt.wasAfUnlocked(state3A, state3AState3ASnapshot)) {
            controller3A.graphProcessor.trigger(parameterForAfTriggerStart);
        }
    }

    /* renamed from: setTorchOff-NqN7i0k, reason: not valid java name */
    public final am<Result3A> m1149setTorchOffNqN7i0k(AeMode aeMode) {
        return m1146update3A0Pt5STg$default(this, aeMode, null, null, FlashMode.m629boximpl(FlashMode.Companion.m638getOFFLe5xUZU()), null, null, null, null, false, 502, null);
    }

    public final am<Result3A> setTorchOn() {
        AeMode aeModeM1183getAeModeO_cDUUs = this.graphState3A.getCurrent().m1183getAeModeO_cDUUs();
        int iM307getONbOjpiJc = AeMode.Companion.m307getONbOjpiJc();
        AeMode aeModeM294boximpl = null;
        if (aeModeM1183getAeModeO_cDUUs == null || !AeMode.m297equalsimpl0(aeModeM1183getAeModeO_cDUUs.m303unboximpl(), iM307getONbOjpiJc)) {
            int iM306getOFFbOjpiJc = AeMode.Companion.m306getOFFbOjpiJc();
            if (aeModeM1183getAeModeO_cDUUs == null || !AeMode.m297equalsimpl0(aeModeM1183getAeModeO_cDUUs.m303unboximpl(), iM306getOFFbOjpiJc)) {
                aeModeM294boximpl = AeMode.m294boximpl(AeMode.Companion.m307getONbOjpiJc());
            }
        }
        return m1146update3A0Pt5STg$default(this, aeModeM294boximpl, null, null, FlashMode.m629boximpl(FlashMode.Companion.m640getTORCHLe5xUZU()), null, null, null, null, false, 502, null);
    }

    public final State3A state3ASnapshot() {
        return this.graphState3A.getCurrent();
    }

    /* renamed from: submit3A-ydBZfZg, reason: not valid java name */
    public final am<Result3A> m1150submit3AydBZfZg(AeMode aeMode, AfMode afMode, AwbMode awbMode, List<MeteringRectangle> list, List<MeteringRectangle> list2, List<MeteringRectangle> list3) {
        if (this.graphProcessor.getRepeatingRequest() == null) {
            return deferredResult3ASubmitFailed;
        }
        Result3AStateListenerImpl result3AStateListenerImplM1140createListenerFor3AParamspdXxemM$default = m1140createListenerFor3AParamspdXxemM$default(this, aeMode, afMode, awbMode, null, null, 24, null);
        Result3AStateListenerImpl result3AStateListenerImpl = result3AStateListenerImplM1140createListenerFor3AParamspdXxemM$default;
        this.graphListener3A.addListener(result3AStateListenerImpl);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (aeMode != null) {
            int iM303unboximpl = aeMode.m303unboximpl();
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
            x.e(key, "CONTROL_AE_MODE");
            linkedHashMap.put(key, Integer.valueOf(iM303unboximpl));
        }
        if (afMode != null) {
            int iM322unboximpl = afMode.m322unboximpl();
            CaptureRequest.Key key2 = CaptureRequest.CONTROL_AF_MODE;
            x.e(key2, "CONTROL_AF_MODE");
            linkedHashMap.put(key2, Integer.valueOf(iM322unboximpl));
        }
        if (awbMode != null) {
            int iM348unboximpl = awbMode.m348unboximpl();
            CaptureRequest.Key key3 = CaptureRequest.CONTROL_AWB_MODE;
            x.e(key3, "CONTROL_AWB_MODE");
            linkedHashMap.put(key3, Integer.valueOf(iM348unboximpl));
        }
        if (list != null) {
            CaptureRequest.Key key4 = CaptureRequest.CONTROL_AE_REGIONS;
            x.e(key4, "CONTROL_AE_REGIONS");
            linkedHashMap.put(key4, list.toArray(new MeteringRectangle[0]));
        }
        if (list2 != null) {
            CaptureRequest.Key key5 = CaptureRequest.CONTROL_AF_REGIONS;
            x.e(key5, "CONTROL_AF_REGIONS");
            linkedHashMap.put(key5, list2.toArray(new MeteringRectangle[0]));
        }
        if (list3 != null) {
            CaptureRequest.Key key6 = CaptureRequest.CONTROL_AWB_REGIONS;
            x.e(key6, "CONTROL_AWB_REGIONS");
            linkedHashMap.put(key6, list3.toArray(new MeteringRectangle[0]));
        }
        if (this.graphProcessor.trigger(linkedHashMap)) {
            return result3AStateListenerImplM1140createListenerFor3AParamspdXxemM$default.getResult();
        }
        this.graphListener3A.removeListener(result3AStateListenerImpl);
        return deferredResult3ASubmitFailed;
    }

    public final am<Result3A> unlock3A(Boolean bool, Boolean bool2, Boolean bool3, l<? super FrameMetadata, Boolean> lVar, int i2, Long l2) {
        Boolean bool4 = true != CameraMetadata.Companion.getSupportsAutoFocusTrigger(this.metadata) ? null : bool2;
        if (!x.n(bool, true) && !x.n(bool4, true) && !x.n(bool3, true)) {
            return deferredResult3AOk;
        }
        if (this.graphProcessor.getRepeatingRequest() == null) {
            return deferredResult3ASubmitFailed;
        }
        if (x.n(bool4, true)) {
            if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                android.util.Log.d(Log.TAG, "unlock3A - sending a request to unlock af first.");
            }
            if (!this.graphProcessor.trigger(parameterForAfTriggerCancel)) {
                if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                    android.util.Log.d(Log.TAG, "unlock3A - failed to send a request to unlock af first.");
                }
                return deferredResult3ASubmitFailed;
            }
            GraphState3A.m1159updateGbYQs0$default(this.graphState3A, null, null, null, null, null, null, null, null, null, false, null, DisplayStrings.DS_MAP_POPUP_MY_LOCATION_SEND_LOCATION_BUTTON, null);
        }
        Result3AStateListenerImpl result3AStateListenerImpl = new Result3AStateListenerImpl(lVar == null ? Result3AStateListenerKt.toConditionChecker(createUnLocked3AExitConditions(x.n(bool, true), x.n(bool4, true), x.n(bool3, true))) : lVar, Integer.valueOf(i2), l2);
        this.graphListener3A.addListener(result3AStateListenerImpl);
        Boolean bool5 = x.n(bool, true) ? false : null;
        Boolean bool6 = x.n(bool3, true) ? false : null;
        if (bool5 != null || bool6 != null) {
            if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                android.util.Log.d(Log.TAG, "unlock3A - updating graph state, aeLock=" + bool5 + ", awbLock=" + bool6);
            }
            GraphState3A.m1159updateGbYQs0$default(this.graphState3A, null, null, null, null, null, null, null, null, bool5, null, bool6, DisplayStrings.DS_RANK, null);
        }
        this.graphProcessor.update3AParameters(this.graphState3A.toCaptureRequestParametersMap());
        return result3AStateListenerImpl.getResult();
    }

    public final am<Result3A> unlock3APostCapture(boolean z) {
        return this.graphProcessor.getRepeatingRequest() == null ? deferredResult3ASubmitFailed : unlock3APostCaptureAndroidMAndAbove(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: update3A-0Pt5STg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlinx.coroutines.am<androidx.camera.camera2.pipe.Result3A> m1151update3A0Pt5STg(androidx.camera.camera2.pipe.AeMode r19, androidx.camera.camera2.pipe.AfMode r20, androidx.camera.camera2.pipe.AwbMode r21, androidx.camera.camera2.pipe.FlashMode r22, androidx.camera.camera2.pipe.ControlMode r23, java.util.List<android.hardware.camera2.params.MeteringRectangle> r24, java.util.List<android.hardware.camera2.params.MeteringRectangle> r25, java.util.List<android.hardware.camera2.params.MeteringRectangle> r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.graph.Controller3A.m1151update3A0Pt5STg(androidx.camera.camera2.pipe.AeMode, androidx.camera.camera2.pipe.AfMode, androidx.camera.camera2.pipe.AwbMode, androidx.camera.camera2.pipe.FlashMode, androidx.camera.camera2.pipe.ControlMode, java.util.List, java.util.List, java.util.List, boolean):kotlinx.coroutines.am");
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final Map<CaptureRequest.Key<?>, Object> getParameterForAfTriggerCancel() {
            return Controller3A.parameterForAfTriggerCancel;
        }

        public final Map<CaptureRequest.Key<?>, Object> getParameterForAfTriggerStart() {
            return Controller3A.parameterForAfTriggerStart;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ am lock3AForCapture$default(Controller3A controller3A, l lVar, int i2, long j2, int i3, Object obj) {
        if (1 == (i3 & 1)) {
            lVar = null;
        }
        if ((i3 & 2) != 0) {
            i2 = 60;
        }
        if ((i3 & 4) != 0) {
            j2 = CameraGraph.Constants3A.DEFAULT_TIME_LIMIT_NS;
        }
        return controller3A.lock3AForCapture(lVar, i2, j2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ am lock3AForCapture$default(Controller3A controller3A, Map map, l lVar, int i2, long j2, int i3, Object obj) {
        if (1 == (i3 & 1)) {
            map = null;
        }
        if ((i3 & 2) != 0) {
            lVar = null;
        }
        if ((i3 & 4) != 0) {
            i2 = 60;
        }
        if ((i3 & 8) != 0) {
            j2 = CameraGraph.Constants3A.DEFAULT_TIME_LIMIT_NS;
        }
        return controller3A.lock3AForCapture((Map<CaptureRequest.Key<?>, ? extends Object>) map, (l<? super FrameMetadata, Boolean>) lVar, i2, j2);
    }

    public final am<Result3A> lock3AForCapture(l<? super FrameMetadata, Boolean> lVar, int i2, long j2) {
        return lock3AForCapture((Map<CaptureRequest.Key<?>, ? extends Object>) null, lVar, i2, j2);
    }

    public final am<Result3A> lock3AForCapture(boolean z, boolean z2, int i2, long j2) {
        return lock3AForCapture(z ? parametersForAePrecaptureAndAfTrigger : parametersForAePrecapture, createLock3AForCaptureExitConditions(z, z2), i2, j2);
    }
}
