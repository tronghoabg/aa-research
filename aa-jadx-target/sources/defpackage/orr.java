package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class orr implements java.util.function.Predicate {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ orr(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ java.util.function.Predicate and(java.util.function.Predicate predicate) {
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                break;
            case 1:
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                break;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                break;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
        }
        return j$.util.function.Predicate.-CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ java.util.function.Predicate negate() {
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                break;
            case 1:
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                break;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                break;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
        }
        return j$.util.function.Predicate.-CC.$default$negate(this);
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ java.util.function.Predicate or(java.util.function.Predicate predicate) {
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                break;
            case 1:
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                break;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                break;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
        }
        return j$.util.function.Predicate.-CC.$default$or(this, predicate);
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v54, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v60, types: [java.lang.Comparable, java.lang.Object] */
    @Override // java.util.function.Predicate
    public final boolean test(java.lang.Object obj) {
        j$.time.Instant instantZ;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                defpackage.yhx yhxVar = defpackage.ors.a;
                return !((defpackage.ygw) this.a).contains(((android.bluetooth.BluetoothDevice) obj).getAddress());
            case 1:
                return ((java.lang.Boolean) this.a.invoke(obj)).booleanValue();
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                android.net.wifi.ScanResult scanResult = (android.net.wifi.ScanResult) obj;
                defpackage.yqm yqmVar = ped.a;
                java.lang.String str = scanResult.SSID;
                pav pavVar = (pav) this.a;
                return pavVar.a.equals(str) && pavVar.b.equals(scanResult.BSSID);
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return defpackage.ysr.bD(((android.net.wifi.ScanResult) obj).BSSID, ((pdv) this.a).a.u.b);
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return ((java.lang.String) this.a).matches((java.lang.String) obj);
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return !j$.util.Objects.equals((pcu) obj, ((phb) this.a).a);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((java.lang.Enum) this.a).equals((pgv) obj);
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.yqm yqmVar2 = com.google.android.apps.auto.wireless.setup.service.impl.WirelessSetupSharedService.a;
                return ((defpackage.jlv) this.a).c((java.lang.String) obj, false).f();
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return ((defpackage.jlv) this.a).c(((android.bluetooth.BluetoothDevice) obj).getAddress(), false).f();
            case 9:
                return ((defpackage.ygm) this.a).contains((vak) obj);
            case 10:
                int i = defpackage.qji.c;
                return ((defpackage.mqj) obj).a().getPackageName().equals(((android.content.ComponentName) this.a).getPackageName());
            case 11:
                defpackage.mqj mqjVar = (defpackage.mqj) obj;
                java.lang.Object obj2 = mqjVar.b;
                int i2 = defpackage.qji.c;
                java.lang.Object obj3 = this.a;
                if (obj3 == defpackage.mqg.PHONE_MEDIA) {
                    obj3 = defpackage.mqg.MEDIA;
                }
                return obj2 == obj3 && mqjVar.a.e();
            case 12:
                return ((android.content.ComponentName) this.a).equals((android.content.ComponentName) obj);
            case 13:
                return ((android.content.ComponentName) obj).getPackageName().equals(((qlf) this.a).g.O());
            case 14:
                return j$.util.Collection.-EL.stream((java.util.Collection) this.a).anyMatch(new defpackage.orr((java.lang.String) obj, 15));
            case 15:
                return ((android.os.PatternMatcher) obj).match((java.lang.String) this.a);
            case 16:
                j$.time.Duration duration = (j$.time.Duration) obj;
                defpackage.yqm yqmVar3 = defpackage.thf.a;
                duration.getClass();
                return defpackage.ytn.d(this.a, duration);
            case 17:
                ajhv ajhvVar = (ajhv) obj;
                int i3 = ajhvVar.c;
                if (i3 == 1) {
                    defpackage.abqv abqvVar = ((ajgq) ajhvVar.d).e;
                    if (abqvVar == null) {
                        abqvVar = defpackage.abqv.a;
                    }
                    instantZ = defpackage.acmh.z(abqvVar);
                } else {
                    defpackage.abqv abqvVar2 = (i3 == 3 ? (ajia) ajhvVar.d : ajia.a).d;
                    if (abqvVar2 == null) {
                        abqvVar2 = defpackage.abqv.a;
                    }
                    instantZ = defpackage.acmh.z(abqvVar2);
                }
                return instantZ.isAfter((j$.time.Instant) this.a);
            case 18:
                java.lang.String str2 = (java.lang.String) obj;
                java.util.regex.Pattern pattern = defpackage.vwq.a;
                java.lang.String str3 = (java.lang.String) this.a;
                return str3.equals(str2) || str3.endsWith(".".concat(java.lang.String.valueOf(str2)));
            case 19:
                return ((java.lang.String) this.a).contains((java.lang.String) obj);
            default:
                return j$.util.Objects.equals(((com.google.android.gms.carsetup.CarInfoInternal) obj).a.d, this.a);
        }
    }
}
