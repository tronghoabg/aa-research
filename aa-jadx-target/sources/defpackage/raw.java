package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class raw extends defpackage.ijw implements rax {
    public final com.google.android.gms.car.display.CarRegionId a;
    private volatile boolean b;

    public raw(com.google.android.gms.car.display.CarRegionId carRegionId) {
        super("com.google.android.gms.car.ISystemUiService");
        this.b = true;
        this.a = carRegionId;
    }

    public final void a() {
        this.b = false;
    }

    public final void e() {
        com.google.android.gms.car.display.CarRegionId carRegionId = this.a;
        if (!com.google.android.gms.car.display.CarDisplayId.b(carRegionId.h)) {
            ((defpackage.yqj) ((defpackage.yqj) com.google.android.gearhead.appdecor.AppDecorService.a.h()).ai((char) 7052)).y("SystemUiService#requestIncreaseContentArea not implemented for region: %s", carRegionId);
        } else if (!this.b) {
            ((defpackage.yqj) ((defpackage.yqj) com.google.android.gearhead.appdecor.AppDecorService.a.h()).ai((char) 7051)).y("requestIncreaseContentArea called after the region %s for the activity was removed, ignoring.", carRegionId);
        } else {
            ((defpackage.yqj) ((defpackage.yqj) com.google.android.gearhead.appdecor.AppDecorService.a.f()).ai((char) 7050)).y("requestIncreaseContentArea for region: %s", carRegionId);
            defpackage.tna.i(new pyi(this, 18));
        }
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        switch (i) {
            case 1:
                android.content.Intent intent = (android.content.Intent) defpackage.ijx.a(parcel, android.content.Intent.CREATOR);
                defpackage.ijx.d(parcel);
                h(intent);
                parcel2.writeNoException();
                return true;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                int i2 = parcel.readInt();
                defpackage.ijx.d(parcel);
                f(i2);
                parcel2.writeNoException();
                return true;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                java.lang.CharSequence charSequenceB = defpackage.ijx.b(parcel);
                int i3 = parcel.readInt();
                defpackage.ijx.d(parcel);
                g(charSequenceB, i3, null);
                parcel2.writeNoException();
                return true;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                e();
                parcel2.writeNoException();
                return true;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                boolean zI = i();
                parcel2.writeNoException();
                java.lang.ClassLoader classLoader = defpackage.ijx.a;
                parcel2.writeInt(zI ? 1 : 0);
                return true;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                java.lang.CharSequence charSequenceB2 = defpackage.ijx.b(parcel);
                int i4 = parcel.readInt();
                android.content.ComponentName componentName = (android.content.ComponentName) defpackage.ijx.a(parcel, android.content.ComponentName.CREATOR);
                defpackage.ijx.d(parcel);
                g(charSequenceB2, i4, componentName);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    public final void f(int i) {
        defpackage.yqm yqmVar = com.google.android.gearhead.appdecor.AppDecorService.a;
        defpackage.yqj yqjVar = (defpackage.yqj) yqmVar.l().ai(7053);
        com.google.android.gms.car.display.CarRegionId carRegionId = this.a;
        yqjVar.D("setSystemUiVisibility(%s) for region %s", i, carRegionId);
        if (!this.b) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai(7055)).D("setSystemUiVisibility called with %d after the region %s for the activity was removed, ignoring.", i, carRegionId);
        } else if (com.google.android.gms.car.display.CarDisplayId.b(carRegionId.h)) {
            defpackage.tna.i(new defpackage.hif(this, i, 19));
        } else {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 7054)).y("SystemUiService#setSystemUiVisibility not implemented for region: %s", carRegionId);
        }
    }

    public final void g(java.lang.CharSequence charSequence, int i, android.content.ComponentName componentName) {
        com.google.android.gms.car.display.CarRegionId carRegionId = this.a;
        if (!com.google.android.gms.car.display.CarDisplayId.b(carRegionId.h)) {
            ((defpackage.yqj) ((defpackage.yqj) com.google.android.gearhead.appdecor.AppDecorService.a.h()).ai((char) 7057)).y("SystemUiService#showToast not implemented for region: %s", carRegionId);
        } else if (this.b) {
            defpackage.tna.i(new isx(this, componentName, charSequence, i, 12));
        } else {
            ((defpackage.yqj) ((defpackage.yqj) com.google.android.gearhead.appdecor.AppDecorService.a.h()).ai((char) 7056)).y("showToast called after the region %s for the activity was removed, ignoring.", carRegionId);
        }
    }

    public final void h(android.content.Intent intent) {
        defpackage.yqm yqmVar = com.google.android.gearhead.appdecor.AppDecorService.a;
        defpackage.yqj yqjVar = (defpackage.yqj) yqmVar.l().ai(7058);
        com.google.android.gms.car.display.CarRegionId carRegionId = this.a;
        yqjVar.M("startCarActivity for %s on %s", intent, carRegionId);
        defpackage.ysr.bj(defpackage.kit.b().q());
        if (!this.b) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai(7062)).M("startCarActivity called for %s after the region %s for the activity was removed, ignoring.", intent, carRegionId);
            return;
        }
        intent.getClass();
        if (!defpackage.rox.Z(intent)) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.g()).ai((char) 7061)).y("Unsupported intent: %s", intent);
            return;
        }
        try {
            if (com.google.android.gms.car.display.CarDisplayId.b(carRegionId.h)) {
                ((defpackage.yqj) yqmVar.l().ai(7060)).u("startCarActivity on primary display, skipping StartCarActivityHelper");
                defpackage.mpk.a().i(intent);
            } else {
                int i = defpackage.mpq.a;
                ((defpackage.mpq) defpackage.msh.a().f(carRegionId).i(defpackage.mpq.class)).a(intent);
            }
        } catch (java.lang.IllegalStateException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) com.google.android.gearhead.appdecor.AppDecorService.a.h()).p(e)).ai((char) 7059)).y("Unable to start activity: %s", intent);
        }
    }

    public final boolean i() {
        com.google.android.gms.car.display.CarRegionId carRegionId = this.a;
        if (!com.google.android.gms.car.display.CarDisplayId.b(carRegionId.h)) {
            ((defpackage.yqj) ((defpackage.yqj) com.google.android.gearhead.appdecor.AppDecorService.a.h()).ai((char) 7049)).y("SystemUiService#canIncreaseContentArea not implemented for region: %s", carRegionId);
            return false;
        }
        if (this.b) {
            return ((java.lang.Boolean) defpackage.tna.h(android.os.Looper.getMainLooper(), new qfz(this, 0))).booleanValue();
        }
        ((defpackage.yqj) ((defpackage.yqj) com.google.android.gearhead.appdecor.AppDecorService.a.h()).ai((char) 7048)).y("canIncreaseContentArea called after the region %s for the activity was removed, ignoring.", carRegionId);
        return false;
    }

    public raw() {
        throw null;
    }
}
