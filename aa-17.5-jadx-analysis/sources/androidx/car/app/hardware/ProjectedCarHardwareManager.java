package androidx.car.app.hardware;

import defpackage.qn;
import defpackage.qr;
import defpackage.rb;
import defpackage.rm;
import defpackage.rn;
import defpackage.rr;
import defpackage.rv;
import defpackage.rw;
import defpackage.sc;
import defpackage.sd;

@rb
/* loaded from: classes2.dex */
public class ProjectedCarHardwareManager implements rm {
    private final sc mVehicleInfo;
    private final sd mVehicleSensors = new sd();

    public ProjectedCarHardwareManager(qn qnVar, qr qrVar) {
        this.mVehicleInfo = new sc(new rr(qrVar));
    }

    public /* synthetic */ rn getCarClimate() {
        throw new UnsupportedOperationException();
    }

    public rv getCarInfo() {
        return this.mVehicleInfo;
    }

    public rw getCarSensors() {
        return this.mVehicleSensors;
    }
}
