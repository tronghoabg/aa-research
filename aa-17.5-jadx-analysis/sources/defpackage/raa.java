package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gearhead.appdecor.AppDecorService;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.CarRegionId;

/* loaded from: classes.dex */
public final class raa extends ijo implements rab {
    public final CarRegionId a;
    private volatile boolean b;

    public raa(CarRegionId carRegionId) {
        super("com.google.android.gms.car.ISystemUiService");
        this.b = true;
        this.a = carRegionId;
    }

    public final void a() {
        this.b = false;
    }

    @Override // defpackage.rab
    public final void e() {
        CarRegionId carRegionId = this.a;
        if (!CarDisplayId.b(carRegionId.h)) {
            ((ype) ((ype) AppDecorService.a.h()).ai((char) 7027)).y("SystemUiService#requestIncreaseContentArea not implemented for region: %s", carRegionId);
        } else if (!this.b) {
            ((ype) ((ype) AppDecorService.a.h()).ai((char) 7026)).y("requestIncreaseContentArea called after the region %s for the activity was removed, ignoring.", carRegionId);
        } else {
            ((ype) ((ype) AppDecorService.a.f()).ai((char) 7025)).y("requestIncreaseContentArea for region: %s", carRegionId);
            szp.u(new qct(this, 9));
        }
    }

    @Override // defpackage.rab
    public final void f(int i) {
        yph yphVar = AppDecorService.a;
        ype ypeVar = (ype) yphVar.l().ai(7028);
        CarRegionId carRegionId = this.a;
        ypeVar.D("setSystemUiVisibility(%s) for region %s", i, carRegionId);
        if (!this.b) {
            ((ype) ((ype) yphVar.h()).ai(7030)).D("setSystemUiVisibility called with %d after the region %s for the activity was removed, ignoring.", i, carRegionId);
        } else if (CarDisplayId.b(carRegionId.h)) {
            szp.u(new hhx(this, i, 18));
        } else {
            ((ype) ((ype) yphVar.h()).ai((char) 7029)).y("SystemUiService#setSystemUiVisibility not implemented for region: %s", carRegionId);
        }
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        switch (i) {
            case 1:
                Intent intent = (Intent) ijp.a(parcel, Intent.CREATOR);
                ijp.d(parcel);
                h(intent);
                parcel2.writeNoException();
                return true;
            case 2:
                int i2 = parcel.readInt();
                ijp.d(parcel);
                f(i2);
                parcel2.writeNoException();
                return true;
            case 3:
                CharSequence charSequenceB = ijp.b(parcel);
                int i3 = parcel.readInt();
                ijp.d(parcel);
                g(charSequenceB, i3, null);
                parcel2.writeNoException();
                return true;
            case 4:
                e();
                parcel2.writeNoException();
                return true;
            case 5:
                boolean zI = i();
                parcel2.writeNoException();
                ClassLoader classLoader = ijp.a;
                parcel2.writeInt(zI ? 1 : 0);
                return true;
            case 6:
                CharSequence charSequenceB2 = ijp.b(parcel);
                int i4 = parcel.readInt();
                ComponentName componentName = (ComponentName) ijp.a(parcel, ComponentName.CREATOR);
                ijp.d(parcel);
                g(charSequenceB2, i4, componentName);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.rab
    public final void g(CharSequence charSequence, int i, ComponentName componentName) {
        CarRegionId carRegionId = this.a;
        if (!CarDisplayId.b(carRegionId.h)) {
            ((ype) ((ype) AppDecorService.a.h()).ai((char) 7032)).y("SystemUiService#showToast not implemented for region: %s", carRegionId);
        } else if (this.b) {
            szp.u(new isp(this, componentName, charSequence, i, 12));
        } else {
            ((ype) ((ype) AppDecorService.a.h()).ai((char) 7031)).y("showToast called after the region %s for the activity was removed, ignoring.", carRegionId);
        }
    }

    @Override // defpackage.rab
    public final void h(Intent intent) {
        yph yphVar = AppDecorService.a;
        ype ypeVar = (ype) yphVar.l().ai(7033);
        CarRegionId carRegionId = this.a;
        ypeVar.M("startCarActivity for %s on %s", intent, carRegionId);
        woy.Z(kio.b().q());
        if (!this.b) {
            ((ype) ((ype) yphVar.h()).ai(7037)).M("startCarActivity called for %s after the region %s for the activity was removed, ignoring.", intent, carRegionId);
            return;
        }
        intent.getClass();
        if (!roc.bs(intent)) {
            ((ype) ((ype) yphVar.g()).ai((char) 7036)).y("Unsupported intent: %s", intent);
            return;
        }
        try {
            if (CarDisplayId.b(carRegionId.h)) {
                ((ype) yphVar.l().ai(7035)).u("startCarActivity on primary display, skipping StartCarActivityHelper");
                mpe.a().i(intent);
            } else {
                int i = mpk.a;
                ((mpk) msd.a().f(carRegionId).i(mpk.class)).a(intent);
            }
        } catch (IllegalStateException e) {
            ((ype) ((ype) ((ype) AppDecorService.a.h()).p(e)).ai((char) 7034)).y("Unable to start activity: %s", intent);
        }
    }

    @Override // defpackage.rab
    public final boolean i() {
        CarRegionId carRegionId = this.a;
        if (!CarDisplayId.b(carRegionId.h)) {
            ((ype) ((ype) AppDecorService.a.h()).ai((char) 7024)).y("SystemUiService#canIncreaseContentArea not implemented for region: %s", carRegionId);
            return false;
        }
        if (this.b) {
            return ((Boolean) szp.t(Looper.getMainLooper(), new qfe(this, 0))).booleanValue();
        }
        ((ype) ((ype) AppDecorService.a.h()).ai((char) 7023)).y("canIncreaseContentArea called after the region %s for the activity was removed, ignoring.", carRegionId);
        return false;
    }

    public raa() {
        throw null;
    }
}
