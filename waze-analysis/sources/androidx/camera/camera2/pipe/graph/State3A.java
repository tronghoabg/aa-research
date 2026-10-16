package androidx.camera.camera2.pipe.graph;

import android.hardware.camera2.params.MeteringRectangle;
import androidx.camera.camera2.pipe.AeMode;
import androidx.camera.camera2.pipe.AfMode;
import androidx.camera.camera2.pipe.AwbMode;
import androidx.camera.camera2.pipe.ControlMode;
import androidx.camera.camera2.pipe.FlashMode;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class State3A {
    private final Boolean aeLock;
    private final AeMode aeMode;
    private final List<MeteringRectangle> aeRegions;
    private final Boolean afLock;
    private final AfMode afMode;
    private final List<MeteringRectangle> afRegions;
    private final Boolean awbLock;
    private final AwbMode awbMode;
    private final List<MeteringRectangle> awbRegions;
    private final ControlMode controlMode;
    private final FlashMode flashMode;

    public /* synthetic */ State3A(AeMode aeMode, AfMode afMode, AwbMode awbMode, ControlMode controlMode, FlashMode flashMode, List list, List list2, List list3, Boolean bool, Boolean bool2, Boolean bool3, int i2, o oVar) {
        this(1 == (i2 & 1) ? null : aeMode, (i2 & 2) != 0 ? null : afMode, (i2 & 4) != 0 ? null : awbMode, (i2 & 8) != 0 ? null : controlMode, (i2 & 16) != 0 ? null : flashMode, (i2 & 32) != 0 ? null : list, (i2 & 64) != 0 ? null : list2, (i2 & 128) != 0 ? null : list3, (i2 & 256) != 0 ? null : bool, (i2 & 512) != 0 ? null : bool2, (i2 & 1024) != 0 ? null : bool3, null);
    }

    /* renamed from: copy-Gb-YQs0$default, reason: not valid java name */
    public static /* synthetic */ State3A m1176copyGbYQs0$default(State3A state3A, AeMode aeMode, AfMode afMode, AwbMode awbMode, ControlMode controlMode, FlashMode flashMode, List list, List list2, List list3, Boolean bool, Boolean bool2, Boolean bool3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            aeMode = state3A.aeMode;
        }
        if ((i2 & 2) != 0) {
            afMode = state3A.afMode;
        }
        if ((i2 & 4) != 0) {
            awbMode = state3A.awbMode;
        }
        if ((i2 & 8) != 0) {
            controlMode = state3A.controlMode;
        }
        if ((i2 & 16) != 0) {
            flashMode = state3A.flashMode;
        }
        if ((i2 & 32) != 0) {
            list = state3A.aeRegions;
        }
        if ((i2 & 64) != 0) {
            list2 = state3A.afRegions;
        }
        if ((i2 & 128) != 0) {
            list3 = state3A.awbRegions;
        }
        if ((i2 & 256) != 0) {
            bool = state3A.aeLock;
        }
        if ((i2 & 512) != 0) {
            bool2 = state3A.afLock;
        }
        if ((i2 & 1024) != 0) {
            bool3 = state3A.awbLock;
        }
        Boolean bool4 = bool2;
        Boolean bool5 = bool3;
        List list4 = list3;
        Boolean bool6 = bool;
        List list5 = list;
        List list6 = list2;
        FlashMode flashMode2 = flashMode;
        AwbMode awbMode2 = awbMode;
        return state3A.m1182copyGbYQs0(aeMode, afMode, awbMode2, controlMode, flashMode2, list5, list6, list4, bool6, bool4, bool5);
    }

    /* renamed from: component1-O_cDUUs, reason: not valid java name */
    public final AeMode m1177component1O_cDUUs() {
        return this.aeMode;
    }

    public final Boolean component10() {
        return this.afLock;
    }

    public final Boolean component11() {
        return this.awbLock;
    }

    /* renamed from: component2-32_E3BI, reason: not valid java name */
    public final AfMode m1178component232_E3BI() {
        return this.afMode;
    }

    /* renamed from: component3-aLFtWSU, reason: not valid java name */
    public final AwbMode m1179component3aLFtWSU() {
        return this.awbMode;
    }

    /* renamed from: component4-M0tcWMk, reason: not valid java name */
    public final ControlMode m1180component4M0tcWMk() {
        return this.controlMode;
    }

    /* renamed from: component5-cL-19HE, reason: not valid java name */
    public final FlashMode m1181component5cL19HE() {
        return this.flashMode;
    }

    public final List<MeteringRectangle> component6() {
        return this.aeRegions;
    }

    public final List<MeteringRectangle> component7() {
        return this.afRegions;
    }

    public final List<MeteringRectangle> component8() {
        return this.awbRegions;
    }

    public final Boolean component9() {
        return this.aeLock;
    }

    /* renamed from: copy-Gb-YQs0, reason: not valid java name */
    public final State3A m1182copyGbYQs0(AeMode aeMode, AfMode afMode, AwbMode awbMode, ControlMode controlMode, FlashMode flashMode, List<MeteringRectangle> list, List<MeteringRectangle> list2, List<MeteringRectangle> list3, Boolean bool, Boolean bool2, Boolean bool3) {
        return new State3A(aeMode, afMode, awbMode, controlMode, flashMode, list, list2, list3, bool, bool2, bool3, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof State3A)) {
            return false;
        }
        State3A state3A = (State3A) obj;
        return x.n(this.aeMode, state3A.aeMode) && x.n(this.afMode, state3A.afMode) && x.n(this.awbMode, state3A.awbMode) && x.n(this.controlMode, state3A.controlMode) && x.n(this.flashMode, state3A.flashMode) && x.n(this.aeRegions, state3A.aeRegions) && x.n(this.afRegions, state3A.afRegions) && x.n(this.awbRegions, state3A.awbRegions) && x.n(this.aeLock, state3A.aeLock) && x.n(this.afLock, state3A.afLock) && x.n(this.awbLock, state3A.awbLock);
    }

    public final Boolean getAeLock() {
        return this.aeLock;
    }

    /* renamed from: getAeMode-O_cDUUs, reason: not valid java name */
    public final AeMode m1183getAeModeO_cDUUs() {
        return this.aeMode;
    }

    public final List<MeteringRectangle> getAeRegions() {
        return this.aeRegions;
    }

    public final Boolean getAfLock() {
        return this.afLock;
    }

    /* renamed from: getAfMode-32_E3BI, reason: not valid java name */
    public final AfMode m1184getAfMode32_E3BI() {
        return this.afMode;
    }

    public final List<MeteringRectangle> getAfRegions() {
        return this.afRegions;
    }

    public final Boolean getAwbLock() {
        return this.awbLock;
    }

    /* renamed from: getAwbMode-aLFtWSU, reason: not valid java name */
    public final AwbMode m1185getAwbModeaLFtWSU() {
        return this.awbMode;
    }

    public final List<MeteringRectangle> getAwbRegions() {
        return this.awbRegions;
    }

    /* renamed from: getControlMode-M0tcWMk, reason: not valid java name */
    public final ControlMode m1186getControlModeM0tcWMk() {
        return this.controlMode;
    }

    /* renamed from: getFlashMode-cL-19HE, reason: not valid java name */
    public final FlashMode m1187getFlashModecL19HE() {
        return this.flashMode;
    }

    public int hashCode() {
        AeMode aeMode = this.aeMode;
        int iM303unboximpl = aeMode == null ? 0 : aeMode.m303unboximpl();
        AfMode afMode = this.afMode;
        int iM322unboximpl = afMode == null ? 0 : afMode.m322unboximpl();
        int i2 = iM303unboximpl * 31;
        AwbMode awbMode = this.awbMode;
        int iM348unboximpl = (((i2 + iM322unboximpl) * 31) + (awbMode == null ? 0 : awbMode.m348unboximpl())) * 31;
        ControlMode controlMode = this.controlMode;
        int iM613unboximpl = (iM348unboximpl + (controlMode == null ? 0 : controlMode.m613unboximpl())) * 31;
        FlashMode flashMode = this.flashMode;
        int iM636unboximpl = (iM613unboximpl + (flashMode == null ? 0 : flashMode.m636unboximpl())) * 31;
        List<MeteringRectangle> list = this.aeRegions;
        int iHashCode = (iM636unboximpl + (list == null ? 0 : list.hashCode())) * 31;
        List<MeteringRectangle> list2 = this.afRegions;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<MeteringRectangle> list3 = this.awbRegions;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Boolean bool = this.aeLock;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.afLock;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.awbLock;
        return iHashCode5 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public String toString() {
        return "State3A(aeMode=" + this.aeMode + ", afMode=" + this.afMode + ", awbMode=" + this.awbMode + ", controlMode=" + this.controlMode + ", flashMode=" + this.flashMode + ", aeRegions=" + this.aeRegions + ", afRegions=" + this.afRegions + ", awbRegions=" + this.awbRegions + ", aeLock=" + this.aeLock + ", afLock=" + this.afLock + ", awbLock=" + this.awbLock + ")";
    }

    public /* synthetic */ State3A(AeMode aeMode, AfMode afMode, AwbMode awbMode, ControlMode controlMode, FlashMode flashMode, List list, List list2, List list3, Boolean bool, Boolean bool2, Boolean bool3, o oVar) {
        this(aeMode, afMode, awbMode, controlMode, flashMode, list, list2, list3, bool, bool2, bool3);
    }

    private State3A(AeMode aeMode, AfMode afMode, AwbMode awbMode, ControlMode controlMode, FlashMode flashMode, List<MeteringRectangle> list, List<MeteringRectangle> list2, List<MeteringRectangle> list3, Boolean bool, Boolean bool2, Boolean bool3) {
        this.aeMode = aeMode;
        this.afMode = afMode;
        this.awbMode = awbMode;
        this.controlMode = controlMode;
        this.flashMode = flashMode;
        this.aeRegions = list;
        this.afRegions = list2;
        this.awbRegions = list3;
        this.aeLock = bool;
        this.afLock = bool2;
        this.awbLock = bool3;
    }
}
