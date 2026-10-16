package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class ngh implements java.util.function.Function {
    private final /* synthetic */ int a;

    public /* synthetic */ ngh(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
        switch (this.a) {
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
        return j$.util.function.Function.-CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                return ((defpackage.ngi) obj).i;
            case 1:
                return ((mrp) obj).i();
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.yqm yqmVar = defpackage.ntb.a;
                return ((com.google.android.gms.car.display.CarDisplayNativeUiElement) obj).a;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.yqm yqmVar2 = defpackage.ntb.a;
                return ((com.google.android.gms.car.display.CarDisplayNativeUiElement) obj).a;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.yqm yqmVar3 = defpackage.ntb.a;
                return ((com.google.android.gms.car.display.CarDisplayNativeUiElement) obj).a;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.yqm yqmVar4 = defpackage.ntb.a;
                return ((com.google.android.gms.car.display.CarDisplayNativeUiElement) obj).a;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((nyg) obj).a;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                int i = defpackage.ofw.b;
                java.util.List listI = defpackage.xzd.c(':').i((java.lang.String) obj);
                java.lang.String str = (java.lang.String) listI.get(0);
                java.lang.String str2 = (java.lang.String) listI.get(1);
                str.getClass();
                str2.getClass();
                return new java.util.AbstractMap.SimpleImmutableEntry(str, str2);
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return ((defpackage.mqj) obj).a;
            case 9:
                return ((defpackage.mqi) obj).a;
            case 10:
                return ((android.content.ComponentName) obj).getPackageName();
            case 11:
                return java.lang.Integer.valueOf(((okf) obj).q() - 3);
            case 12:
                return ((android.bluetooth.BluetoothDevice) obj).getAddress();
            case 13:
                return ag$.ExternalSyntheticApiModelOutline0.m(ag$.ExternalSyntheticApiModelOutline0.m(obj));
            case 14:
                defpackage.yqm yqmVar5 = ozu.a;
                return (android.os.ParcelUuid) ((android.os.Parcelable) obj);
            case 15:
                defpackage.yqm yqmVar6 = pdh.a;
                java.lang.String[] strArrSplit = ((java.lang.String) obj).split(":", 2);
                android.content.ComponentName componentNameUnflattenFromString = android.content.ComponentName.unflattenFromString(strArrSplit[0]);
                if (componentNameUnflattenFromString == null) {
                    ((defpackage.yqj) ((defpackage.yqj) pdh.a.g()).ai(6328)).y("Failed to unflatten component name: %s", strArrSplit[0]);
                    return null;
                }
                try {
                    long j = 0;
                    if (strArrSplit.length > 1 && !strArrSplit[1].isEmpty()) {
                        j = java.lang.Long.parseLong(strArrSplit[1]);
                        break;
                    }
                    return new java.util.AbstractMap.SimpleImmutableEntry(componentNameUnflattenFromString, java.lang.Long.valueOf(j));
                } catch (java.lang.NumberFormatException unused) {
                    ((defpackage.yqj) ((defpackage.yqj) pdh.a.g()).ai(6327)).y("Failed to parse value as long: %s", strArrSplit[1]);
                    return null;
                }
            case 16:
                defpackage.yqm yqmVar7 = ped.a;
                android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) ((android.content.Context) obj).getSystemService(android.net.ConnectivityManager.class);
                connectivityManager.getClass();
                return defpackage.kou.n() ? new pdg(connectivityManager) : new pcw(connectivityManager);
            case 17:
                return ((phg) obj).a;
            case 18:
                return ((pwv) obj).a();
            case 19:
                throw null;
            default:
                return ((ovo) obj).name();
        }
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        switch (this.a) {
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
        return j$.util.function.Function.-CC.$default$compose(this, function);
    }
}
