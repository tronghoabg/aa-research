package androidx.camera.camera2.pipe.graph;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import androidx.camera.camera2.pipe.AeMode;
import androidx.camera.camera2.pipe.AfMode;
import androidx.camera.camera2.pipe.AwbMode;
import androidx.camera.camera2.pipe.ControlMode;
import androidx.camera.camera2.pipe.FlashMode;
import h.g.b.x;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class GraphState3AKt {
    public static final Map<CaptureRequest.Key<?>, Object> toCaptureRequestParameterMap(State3A state3A) {
        x.f(state3A, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AeMode aeModeM1183getAeModeO_cDUUs = state3A.m1183getAeModeO_cDUUs();
        if (aeModeM1183getAeModeO_cDUUs != null) {
            int iM303unboximpl = aeModeM1183getAeModeO_cDUUs.m303unboximpl();
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
            x.e(key, "CONTROL_AE_MODE");
            linkedHashMap.put(key, Integer.valueOf(iM303unboximpl));
        }
        AfMode afModeM1184getAfMode32_E3BI = state3A.m1184getAfMode32_E3BI();
        if (afModeM1184getAfMode32_E3BI != null) {
            int iM322unboximpl = afModeM1184getAfMode32_E3BI.m322unboximpl();
            CaptureRequest.Key key2 = CaptureRequest.CONTROL_AF_MODE;
            x.e(key2, "CONTROL_AF_MODE");
            linkedHashMap.put(key2, Integer.valueOf(iM322unboximpl));
        }
        AwbMode awbModeM1185getAwbModeaLFtWSU = state3A.m1185getAwbModeaLFtWSU();
        if (awbModeM1185getAwbModeaLFtWSU != null) {
            int iM348unboximpl = awbModeM1185getAwbModeaLFtWSU.m348unboximpl();
            CaptureRequest.Key key3 = CaptureRequest.CONTROL_AWB_MODE;
            x.e(key3, "CONTROL_AWB_MODE");
            linkedHashMap.put(key3, Integer.valueOf(iM348unboximpl));
        }
        ControlMode controlModeM1186getControlModeM0tcWMk = state3A.m1186getControlModeM0tcWMk();
        if (controlModeM1186getControlModeM0tcWMk != null) {
            int iM613unboximpl = controlModeM1186getControlModeM0tcWMk.m613unboximpl();
            CaptureRequest.Key key4 = CaptureRequest.CONTROL_MODE;
            x.e(key4, "CONTROL_MODE");
            linkedHashMap.put(key4, Integer.valueOf(iM613unboximpl));
        }
        FlashMode flashModeM1187getFlashModecL19HE = state3A.m1187getFlashModecL19HE();
        if (flashModeM1187getFlashModecL19HE != null) {
            int iM636unboximpl = flashModeM1187getFlashModecL19HE.m636unboximpl();
            CaptureRequest.Key key5 = CaptureRequest.FLASH_MODE;
            x.e(key5, "FLASH_MODE");
            linkedHashMap.put(key5, Integer.valueOf(iM636unboximpl));
        }
        List<MeteringRectangle> aeRegions = state3A.getAeRegions();
        if (aeRegions != null) {
            CaptureRequest.Key key6 = CaptureRequest.CONTROL_AE_REGIONS;
            x.e(key6, "CONTROL_AE_REGIONS");
            linkedHashMap.put(key6, aeRegions.toArray(new MeteringRectangle[0]));
        }
        List<MeteringRectangle> afRegions = state3A.getAfRegions();
        if (afRegions != null) {
            CaptureRequest.Key key7 = CaptureRequest.CONTROL_AF_REGIONS;
            x.e(key7, "CONTROL_AF_REGIONS");
            linkedHashMap.put(key7, afRegions.toArray(new MeteringRectangle[0]));
        }
        List<MeteringRectangle> awbRegions = state3A.getAwbRegions();
        if (awbRegions != null) {
            CaptureRequest.Key key8 = CaptureRequest.CONTROL_AWB_REGIONS;
            x.e(key8, "CONTROL_AWB_REGIONS");
            linkedHashMap.put(key8, awbRegions.toArray(new MeteringRectangle[0]));
        }
        Boolean aeLock = state3A.getAeLock();
        if (aeLock != null) {
            aeLock.booleanValue();
            CaptureRequest.Key key9 = CaptureRequest.CONTROL_AE_LOCK;
            x.e(key9, "CONTROL_AE_LOCK");
            linkedHashMap.put(key9, aeLock);
        }
        Boolean awbLock = state3A.getAwbLock();
        if (awbLock != null) {
            awbLock.booleanValue();
            CaptureRequest.Key key10 = CaptureRequest.CONTROL_AWB_LOCK;
            x.e(key10, "CONTROL_AWB_LOCK");
            linkedHashMap.put(key10, awbLock);
        }
        return linkedHashMap;
    }

    public static final boolean wasAeLocked(State3A state3A, State3A state3A2) {
        Boolean aeLock;
        x.f(state3A, "<this>");
        x.f(state3A2, "current");
        Boolean aeLock2 = state3A.getAeLock();
        return (aeLock2 == null || !aeLock2.booleanValue()) && (aeLock = state3A2.getAeLock()) != null && aeLock.booleanValue();
    }

    public static final boolean wasAeUnlocked(State3A state3A, State3A state3A2) {
        x.f(state3A, "<this>");
        x.f(state3A2, "current");
        Boolean aeLock = state3A.getAeLock();
        if (aeLock == null || !aeLock.booleanValue()) {
            return false;
        }
        Boolean aeLock2 = state3A2.getAeLock();
        return aeLock2 == null || !aeLock2.booleanValue();
    }

    public static final boolean wasAfLocked(State3A state3A, State3A state3A2) {
        Boolean afLock;
        x.f(state3A, "<this>");
        x.f(state3A2, "current");
        Boolean afLock2 = state3A.getAfLock();
        return (afLock2 == null || !afLock2.booleanValue()) && (afLock = state3A2.getAfLock()) != null && afLock.booleanValue();
    }

    public static final boolean wasAfUnlocked(State3A state3A, State3A state3A2) {
        x.f(state3A, "<this>");
        x.f(state3A2, "current");
        Boolean afLock = state3A.getAfLock();
        if (afLock == null || !afLock.booleanValue()) {
            return false;
        }
        Boolean afLock2 = state3A2.getAfLock();
        return afLock2 == null || !afLock2.booleanValue();
    }

    public static final boolean wasAwbLocked(State3A state3A, State3A state3A2) {
        Boolean awbLock;
        x.f(state3A, "<this>");
        x.f(state3A2, "current");
        Boolean awbLock2 = state3A.getAwbLock();
        return (awbLock2 == null || !awbLock2.booleanValue()) && (awbLock = state3A2.getAwbLock()) != null && awbLock.booleanValue();
    }

    public static final boolean wasAwbUnlocked(State3A state3A, State3A state3A2) {
        x.f(state3A, "<this>");
        x.f(state3A2, "current");
        Boolean awbLock = state3A.getAwbLock();
        if (awbLock == null || !awbLock.booleanValue()) {
            return false;
        }
        Boolean awbLock2 = state3A2.getAwbLock();
        return awbLock2 == null || !awbLock2.booleanValue();
    }
}
