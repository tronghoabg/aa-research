package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.ComponentName;
import android.net.wifi.ScanResult;
import android.os.PatternMatcher;
import com.google.android.apps.auto.wireless.setup.service.impl.WirelessSetupSharedService;
import com.google.android.gms.carsetup.CarInfoInternal;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final /* synthetic */ class pcx implements Predicate {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ pcx(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.b) {
        }
        return Predicate$CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* renamed from: negate */
    public final /* synthetic */ Predicate mo56negate() {
        switch (this.b) {
        }
        return Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.b) {
        }
        return Predicate$CC.$default$or(this, predicate);
    }

    /* JADX WARN: Type inference failed for: r4v52, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v58, types: [java.lang.Comparable, java.lang.Object] */
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        Instant instantAi;
        switch (this.b) {
            case 0:
                ScanResult scanResult = (ScanResult) obj;
                yph yphVar = pdh.a;
                String str = scanResult.SSID;
                ozy ozyVar = (ozy) this.a;
                return ozyVar.a.equals(str) && ozyVar.b.equals(scanResult.BSSID);
            case 1:
                ygr ygrVar = oqx.a;
                return !((yfq) this.a).contains(((BluetoothDevice) obj).getAddress());
            case 2:
                return woy.at(((ScanResult) obj).BSSID, ((pcz) this.a).a.u.b);
            case 3:
                return ((String) this.a).matches((String) obj);
            case 4:
                return !Objects.equals((pbw) obj, ((pgf) this.a).a);
            case 5:
                return ((Enum) this.a).equals((pfz) obj);
            case 6:
                yph yphVar2 = WirelessSetupSharedService.a;
                return ((jlo) this.a).c((String) obj, false).f();
            case 7:
                return ((jlo) this.a).c(((BluetoothDevice) obj).getAddress(), false).f();
            case 8:
                return ((yfg) this.a).contains((uzn) obj);
            case 9:
                int i = qim.c;
                return ((mqc) obj).a().getPackageName().equals(((ComponentName) this.a).getPackageName());
            case 10:
                mqc mqcVar = (mqc) obj;
                Object obj2 = mqcVar.b;
                int i2 = qim.c;
                Object obj3 = this.a;
                if (obj3 == mpz.e) {
                    obj3 = mpz.d;
                }
                return obj2 == obj3 && mqcVar.a.e();
            case 11:
                return ((ComponentName) this.a).equals((ComponentName) obj);
            case 12:
                return ((ComponentName) obj).getPackageName().equals(((qkk) this.a).g.O());
            case 13:
                return Collection.EL.stream(this.a).anyMatch(new pcx((String) obj, 14));
            case 14:
                return ((PatternMatcher) obj).match((String) this.a);
            case 15:
                Duration duration = (Duration) obj;
                yph yphVar3 = tgj.a;
                duration.getClass();
                return ysi.d(this.a, duration);
            case 16:
                ajgw ajgwVar = (ajgw) obj;
                int i3 = ajgwVar.c;
                if (i3 == 1) {
                    abpt abptVar = ((ajfr) ajgwVar.d).e;
                    if (abptVar == null) {
                        abptVar = abpt.a;
                    }
                    instantAi = wox.ai(abptVar);
                } else {
                    abpt abptVar2 = (i3 == 3 ? (ajhb) ajgwVar.d : ajhb.a).d;
                    if (abptVar2 == null) {
                        abptVar2 = abpt.a;
                    }
                    instantAi = wox.ai(abptVar2);
                }
                return instantAi.isAfter((Instant) this.a);
            case 17:
                String str2 = (String) obj;
                Pattern pattern = vvv.a;
                String str3 = (String) this.a;
                return str3.equals(str2) || str3.endsWith(".".concat(String.valueOf(str2)));
            case 18:
                return ((String) this.a).contains((String) obj);
            case 19:
                return Objects.equals(((CarInfoInternal) obj).a.d, this.a);
            default:
                String str4 = zyb.a;
                acef acefVarB = acef.b(((aceg) obj).e);
                if (acefVarB == null) {
                    acefVarB = acef.UNKNOWN_TYPE;
                }
                return this.a == acefVarB;
        }
    }
}
