package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import com.google.android.gms.car.RadioMetadata;
import com.google.android.gms.car.RadioProgramInfo;
import com.google.android.gms.car.RadioProgramSelector;
import com.google.android.gms.carsetup.CarInfoInternal;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.function.Function;

/* loaded from: classes2.dex */
public final /* synthetic */ class miq implements Function {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ miq(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo329andThen(Function function) {
        switch (this.b) {
        }
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) throws PackageManager.NameNotFoundException, FileNotFoundException {
        String str;
        switch (this.b) {
            case 0:
                Integer num = (Integer) obj;
                yph yphVar = mir.a;
                int iIntValue = num.intValue();
                if (iIntValue == 1) {
                    str = "AM";
                } else if (iIntValue == 2) {
                    str = "FM";
                } else if (iIntValue != 3) {
                    ((ype) ((ype) mir.a.h()).ai((char) 4991)).y("Unknown radio band: %d", num);
                    str = "";
                } else {
                    str = "DAB";
                }
                RadioProgramSelector.RadioProgramIdentifier radioProgramIdentifier = (RadioProgramSelector.RadioProgramIdentifier) this.a;
                return String.format(Locale.ROOT, "%s:%s-%s-%s", str, wub.N(Integer.toHexString((byte) radioProgramIdentifier.a).toUpperCase(Locale.ROOT), 2), wub.N(Long.toHexString(radioProgramIdentifier.b).toUpperCase(Locale.ROOT), 16), wub.N(Integer.toHexString(radioProgramIdentifier.hashCode()).toUpperCase(Locale.ROOT), 8));
            case 1:
                lyf lyfVar = (lyf) this.a;
                mqc mqcVar = (mqc) obj;
                mqp mqpVar = (mqp) lyfVar.c.apply(mqcVar);
                if (mqpVar == null) {
                    ((ynz) ((ynz) lyf.a.h()).ai((char) 4451)).y("Could not load app info for component %s", mqcVar.a());
                    return Optional.empty();
                }
                Drawable drawableF = mqpVar.d.f(lyfVar.b, -1);
                if (drawableF != null) {
                    return Optional.of(new tlh(mqcVar.a().getPackageName(), new tll(mqcVar.a().getPackageName()), mqpVar.e, drawableF));
                }
                ((ynz) ((ynz) lyf.a.h()).ai((char) 4450)).y("Could not load app icon for app %s", mqcVar);
                return Optional.empty();
            case 2:
                return ((mit) this.a).c(((Integer) obj).intValue());
            case 3:
                return Long.valueOf(((Long) obj).longValue() + (lws.l(((RadioProgramSelector) this.a).a.a) ? lws.e(r8.b) : 0));
            case 4:
                RadioMetadata radioMetadata = ((RadioProgramInfo) this.a).b;
                radioMetadata.getClass();
                return radioMetadata.l ? Optional.of(2) : radioMetadata.k ? Optional.of(1) : Optional.empty();
            case 5:
                Stream stream = Collection.EL.stream((yfq) obj);
                kqg kqgVar = ((mkz) this.a).c;
                kqgVar.getClass();
                return stream.filter(new lou(kqgVar, 20)).findFirst();
            case 6:
                yph yphVar2 = oer.a;
                return Boolean.valueOf(((String) this.a).equals(((BluetoothDevice) obj).getAddress()));
            case 7:
                yph yphVar3 = oer.a;
                return Boolean.valueOf(Collection.EL.stream((java.util.Collection) obj).anyMatch(new mqu(this.a, 7)));
            case 8:
                return this.a;
            case 9:
                yph yphVar4 = pgr.a;
                return Boolean.valueOf(!((ozy) obj).a((ozy) this.a));
            case 10:
                return pgr.g((ozy) obj, (jbq) this.a);
            case 11:
                CarInfoInternal carInfoInternal = (CarInfoInternal) obj;
                boolean z = carInfoInternal.p;
                Object obj2 = this.a;
                if (!z) {
                    ((ype) ((ype) pgr.a.f()).ai((char) 6571)).u("Projection is not allowed for this car, will not start");
                    ((kny) ((pgr) obj2).aj.e).d(yxi.WIRELESS_SETUP_SHARED_SERVICE_CAR_REJECTED);
                    return false;
                }
                if (!kjf.e(carInfoInternal.a, aczv.P())) {
                    return true;
                }
                ((ype) ((ype) pgr.a.h()).ai((char) 6570)).u("HU is on denylist for not supporting wireless, will not start");
                ((kny) ((pgr) obj2).aj.e).d(yxi.WIRELESS_SETUP_REJECTING_WPP_ATTEMPT_DUE_TO_DENYLIST);
                return false;
            default:
                ypf ypfVar = qrg.a;
                return ((rgk) obj).b((String) this.a);
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.b) {
        }
        return Function$CC.$default$compose(this, function);
    }
}
