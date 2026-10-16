package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class khy implements java.util.function.Function {
    private final /* synthetic */ int a;

    public /* synthetic */ khy(int i) {
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
                return j$.util.Collection.-EL.stream((java.util.List) obj);
            case 1:
                defpackage.yqm yqmVar = com.google.android.apps.auto.components.bugreport.BugreportRequester.a;
                return ((com.google.android.gms.car.display.CarDisplay) obj).a;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.yqm yqmVar2 = defpackage.kou.a;
                return new java.util.ArrayList();
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.yqm yqmVar3 = defpackage.kou.a;
                return new java.util.ArrayList();
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.yqm yqmVar4 = defpackage.kpd.a;
                switch (((defpackage.rsu) obj).ordinal()) {
                    case defpackage.abnt.b /* 0 */:
                        return defpackage.yyn.USB_ENTERED_ACCESSORY_MODE;
                    case 1:
                        return defpackage.yyn.USB_EXITED_ACCESSORY_MODE;
                    case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                        return defpackage.yyn.USB_CONFIGURED;
                    case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                        return defpackage.yyn.USB_LOST_CONFIGURED;
                    case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                        return defpackage.yyn.USB_CONNECTED;
                    case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                        return defpackage.yyn.USB_DISCONNECTED;
                    case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                        return defpackage.yyn.USB_ENTERED_MTP_MODE;
                    case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                        return defpackage.yyn.USB_EXITED_MTP_MODE;
                    case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                        return defpackage.yyn.USB_ENTERED_PTP_MODE;
                    case 9:
                        return defpackage.yyn.USB_EXITED_PTP_MODE;
                    case 10:
                        return defpackage.yyn.USB_DATA_UNLOCKED;
                    case 11:
                        return defpackage.yyn.USB_DATA_LOCKED;
                    case 12:
                        return defpackage.yyn.USB_ENTERED_ADB_MODE;
                    case 13:
                        return defpackage.yyn.USB_EXITED_ADB_MODE;
                    case 14:
                        return defpackage.yyn.USB_ENTERED_AUDIO_SOURCE_MODE;
                    case 15:
                        return defpackage.yyn.USB_EXITED_AUDIO_SOURCE_MODE;
                    default:
                        throw new java.lang.RuntimeException(null, null);
                }
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.yqm yqmVar5 = defpackage.kpd.a;
                switch (((defpackage.rst) obj).ordinal()) {
                    case defpackage.abnt.b /* 0 */:
                        return defpackage.yyn.USB_ISSUE_CHARGE_ONLY_DETECTED;
                    case 1:
                        return defpackage.yyn.USB_ISSUE_CHARGE_ONLY_OVER;
                    case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                        return defpackage.yyn.USB_ISSUE_NO_ACCESSORY_MODE;
                    case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                        return defpackage.yyn.USB_ISSUE_FIRST_ACTIVITY_NOT_LAUNCHED;
                    case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                        return defpackage.yyn.USB_ISSUE_PROJECTION_NOT_STARTED;
                    case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                        return defpackage.yyn.USB_ISSUE_NO_ACCESSORY_MODE_FALSE_POSITIVE;
                    case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                        return defpackage.yyn.USB_ISSUE_FIRST_ACTIVITY_NOT_LAUNCHED_FALSE_POSITIVE;
                    case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                        return defpackage.yyn.USB_ISSUE_PROJECTION_NOT_STARTED_FALSE_POSITIVE;
                    case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                        return defpackage.yyn.USB_ISSUE_RESET_SUPPRESSED;
                    case 9:
                        return defpackage.yyn.USB_ISSUE_FLAKEY_DETECTED;
                    case 10:
                        return defpackage.yyn.USB_ISSUE_FLAKEY_OVER;
                    case 11:
                        return defpackage.yyn.USB_ISSUE_LOST_ACCESSORY;
                    default:
                        throw new java.lang.RuntimeException(null, null);
                }
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.yqm yqmVar6 = defpackage.kpd.a;
                int iOrdinal = ((defpackage.rsl) obj).ordinal();
                if (iOrdinal == 0) {
                    return defpackage.yyn.CAR_STARTUP_CHARGE_ONLY_SHOWN;
                }
                if (iOrdinal == 1) {
                    return defpackage.yyn.CAR_STARTUP_CHARGE_ONLY_MORE_INFO_SELECTED;
                }
                throw new java.lang.RuntimeException(null, null);
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.yqm yqmVar7 = defpackage.kpd.a;
                int iOrdinal2 = ((defpackage.rsp) obj).ordinal();
                if (iOrdinal2 == 0) {
                    return defpackage.yyn.PROJECTION_STARTED_UNKNOWN;
                }
                if (iOrdinal2 == 1) {
                    return defpackage.yyn.PROJECTION_ENDED_UNKNOWN;
                }
                if (iOrdinal2 == 2) {
                    return defpackage.yyn.PROCESS_STATE_CACHED_GMSCORE_CAR;
                }
                if (iOrdinal2 == 3) {
                    return defpackage.yyn.PROCESS_STATE_CACHED_GEARHEAD_PROJECTION;
                }
                if (iOrdinal2 == 4) {
                    return defpackage.yyn.PROCESS_STATE_CACHED_GEARHEAD_CAR;
                }
                throw new java.lang.RuntimeException(null, null);
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.yqm yqmVar8 = defpackage.kpd.a;
                int iOrdinal3 = ((defpackage.rsq) obj).ordinal();
                if (iOrdinal3 == 0) {
                    return defpackage.yyn.PROJECTION_ENDED_UNKNOWN;
                }
                if (iOrdinal3 == 1) {
                    return defpackage.yyn.PROJECTION_ENDED_USB;
                }
                if (iOrdinal3 == 2) {
                    return defpackage.yyn.PROJECTION_ENDED_WIFI;
                }
                throw new java.lang.RuntimeException(null, null);
            case 9:
                defpackage.yqm yqmVar9 = defpackage.kpd.a;
                int iOrdinal4 = ((defpackage.rso) obj).ordinal();
                if (iOrdinal4 == 0) {
                    return defpackage.yyn.PROCESS_STATE_CACHED_GEARHEAD_PROJECTION;
                }
                if (iOrdinal4 == 1) {
                    return defpackage.yyn.PROCESS_STATE_CACHED_GEARHEAD_CAR;
                }
                if (iOrdinal4 == 2) {
                    return defpackage.yyn.PROCESS_STATE_CACHED_GMSCORE_CAR;
                }
                throw new java.lang.RuntimeException(null, null);
            case 10:
                kqn kqnVarA = kqo.a();
                kqnVarA.c = j$.util.Optional.of((com.google.android.gms.carsetup.CarInfoInternal) obj);
                return kqnVarA.a();
            case 11:
                otg otgVar = ((osw) obj).e;
                if (otgVar == null) {
                    otgVar = otg.a;
                }
                oth othVar = otgVar.f;
                if (othVar == null) {
                    othVar = oth.a;
                }
                return othVar.b;
            case 12:
                return ((defpackage.mqj) obj).a;
            case 13:
                return ((defpackage.mqi) obj).a;
            case 14:
                return ((defpackage.mqj) obj).a();
            case 15:
                return ((android.content.ComponentName) obj).getPackageName();
            case 16:
                return ((defpackage.mqj) obj).a;
            case 17:
                return ((defpackage.mqi) obj).a;
            case 18:
                return defpackage.kzi.g((java.lang.String) obj);
            case 19:
                java.lang.String[] strArrSplit = ((java.lang.String) obj).split(";", 2);
                defpackage.ysr.aY(strArrSplit.length == 2, "There must be a name and a URL separated by a semi-colon");
                return new ohy(strArrSplit[0], strArrSplit[1]);
            default:
                java.lang.String str = (java.lang.String) obj;
                str.getClass();
                if (str.length() == 0) {
                    return new defpackage.lgq("", null);
                }
                java.lang.String[] strArr = (java.lang.String[]) afzh.L(str, new java.lang.String[]{"@"}, 2).toArray(new java.lang.String[0]);
                int length = strArr.length;
                if (length != 0) {
                    return new defpackage.lgq(strArr[0], length == 2 ? strArr[1] : null);
                }
                throw new java.lang.IllegalStateException("Check failed.");
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
