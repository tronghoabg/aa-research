package defpackage;

import androidx.car.app.hardware.common.CarResultStub;
import androidx.car.app.hardware.info.EnergyLevel;
import androidx.car.app.hardware.info.EnergyProfile;
import androidx.car.app.hardware.info.EvStatus;
import androidx.car.app.hardware.info.Mileage;
import androidx.car.app.hardware.info.Model;
import androidx.car.app.hardware.info.Speed;
import androidx.car.app.hardware.info.TollCard;

/* loaded from: classes2.dex */
public final class sc implements rv {
    public sc(rr rrVar) {
        new CarResultStub(1, null, true, new Model(new sb()), rrVar);
        new CarResultStub(2, null, true, new EnergyProfile(new ry()), rrVar);
        new CarResultStub(3, null, false, new TollCard(new sf()), rrVar);
        new CarResultStub(4, null, false, new EnergyLevel(new rx()), rrVar);
        new CarResultStub(5, null, false, new Speed(new se()), rrVar);
        new CarResultStub(6, null, false, new Mileage(new sa()), rrVar);
        new CarResultStub(7, null, false, new EvStatus(new rz()), rrVar);
    }
}
