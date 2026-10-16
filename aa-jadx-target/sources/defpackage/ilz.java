package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class ilz implements java.util.function.Function {
    private final /* synthetic */ int a;

    public /* synthetic */ ilz(int i) {
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
                defpackage.izx izxVar = defpackage.imi.a;
                return new java.util.concurrent.atomic.LongAdder();
            case 1:
                return defpackage.kjl.b((java.lang.String) obj);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return ((java.lang.String) obj).trim();
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                java.lang.Integer num = (java.lang.Integer) obj;
                int i = defpackage.inl.g;
                return num;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                android.content.Intent intent = defpackage.ioh.a;
                return ((android.content.pm.ResolveInfo) obj).serviceInfo;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return defpackage.kjl.b((java.lang.String) obj);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.xid xidVarB = defpackage.xid.b(((xib) obj).b);
                return xidVarB == null ? defpackage.xid.ACTION_UNKNOWN : xidVarB;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return defpackage.tht.f((java.lang.String) obj);
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.xzd xzdVar = defpackage.iyo.a;
                return new java.util.HashSet();
            case 9:
                return null;
            case 10:
                return null;
            case 11:
                defpackage.yhe yheVar = defpackage.jex.b;
                return java.lang.Integer.valueOf(((defpackage.xoz) ((java.util.Map.Entry) obj).getValue()).A);
            case 12:
                return (java.lang.Integer) ((java.util.Map.Entry) obj).getKey();
            case 13:
                return ((defpackage.jfg) obj).name();
            case 14:
                return defpackage.jfz.a((java.lang.String) obj);
            case 15:
                return defpackage.kjl.b((java.lang.String) obj);
            case 16:
                return defpackage.kjl.j((java.lang.String) obj);
            case 17:
                defpackage.yqm yqmVar = defpackage.kpd.a;
                switch (((defpackage.rsm) obj).ordinal()) {
                    case defpackage.abnt.b /* 0 */:
                        return defpackage.yyn.FIRST_ACTIVITY_LAUNCHED_UNKNOWN_INTENT;
                    case 1:
                        return defpackage.yyn.FIRST_ACTIVITY_LAUNCHED_INVALID_INTENT;
                    case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                        return defpackage.yyn.FIRST_ACTIVITY_LAUNCHED_ACCESSORY_ATTACHED;
                    case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                        return defpackage.yyn.FIRST_ACTIVITY_LAUNCHED_WIRELESS;
                    case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                        return defpackage.yyn.FIRST_ACTIVITY_LAUNCHED_WIRELESS_BRIDGE;
                    case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                        return defpackage.yyn.FIRST_ACTIVITY_LAUNCHED_CAR_SERVICE;
                    case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                        return defpackage.yyn.FIRST_ACTIVITY_LAUNCHED_RESTART;
                    case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                        return defpackage.yyn.FIRST_ACTIVITY_LAUNCHED_NEW_INTENT;
                    case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                        return defpackage.yyn.FIRST_ACTIVITY_FORCE_STARTED;
                    default:
                        throw new java.lang.RuntimeException(null, null);
                }
            case 18:
                defpackage.yqm yqmVar2 = defpackage.kpd.a;
                int iOrdinal = ((defpackage.rss) obj).ordinal();
                if (iOrdinal == 0) {
                    return defpackage.yyn.FIRST_ACTIVITY_CLASS_LOADED;
                }
                if (iOrdinal == 1) {
                    return defpackage.yyn.FACET_BAR_FIRST_RESUME;
                }
                if (iOrdinal == 2) {
                    return defpackage.yyn.CAR_SERVICE_VIDEO_FOCUS_GAINED;
                }
                if (iOrdinal == 3) {
                    return defpackage.yyn.PROJECTION_LIFECYCLE_LISTENER_ON_PROJECTION_START;
                }
                if (iOrdinal == 4) {
                    return defpackage.yyn.PRIMARY_REGION_FIRST_CAR_ACTIVITY_RESUME;
                }
                throw new java.lang.RuntimeException(null, null);
            case 19:
                defpackage.yqm yqmVar3 = defpackage.kpd.a;
                switch (((defpackage.rsk) obj).ordinal()) {
                    case defpackage.abnt.b /* 0 */:
                        return defpackage.yyn.CAR_SETUP_SERVICE_CREATE;
                    case 1:
                        return defpackage.yyn.CAR_SETUP_SERVICE_ALREADY_STARTED;
                    case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                        return defpackage.yyn.CAR_SETUP_SERVICE_DESTROY;
                    case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                        return defpackage.yyn.CAR_SETUP_SERVICE_SET_STATE_NOT_CONNECTED;
                    case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                        return defpackage.yyn.CAR_SETUP_SERVICE_SET_STATE_CONNECTING;
                    case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                        return defpackage.yyn.CAR_SETUP_SERVICE_SET_STATE_WAITING_FOR_PATCHER;
                    case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                        return defpackage.yyn.CAR_SETUP_SERVICE_SET_STATE_DISCOVERED;
                    case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                        return defpackage.yyn.CAR_SETUP_SERVICE_STATE_ALREADY_NOT_CONNECTED_IN_TEARDOWN;
                    case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                        return defpackage.yyn.CAR_SETUP_SERVICE_SECURITY_PATCHER_SUCCESS_SET_STATE_DISCOVERED;
                    case 9:
                        return defpackage.yyn.CAR_SETUP_SERVICE_SECURITY_PATCHER_SUCCESS_STATE_NOT_WAITING_FOR_PATCHER;
                    case 10:
                        return defpackage.yyn.CAR_SETUP_SERVICE_SECURITY_PATCHER_FAILURE;
                    case 11:
                        return defpackage.yyn.GEARHEAD_PROJECTION_ENABLED;
                    case 12:
                        return defpackage.yyn.GEARHEAD_PROJECTION_DISABLED;
                    default:
                        throw new java.lang.RuntimeException(null, null);
                }
            default:
                defpackage.yqm yqmVar4 = defpackage.kpd.a;
                int iOrdinal2 = ((defpackage.rsq) obj).ordinal();
                if (iOrdinal2 == 0) {
                    return defpackage.yyn.PROJECTION_STARTED_UNKNOWN;
                }
                if (iOrdinal2 == 1) {
                    return defpackage.yyn.PROJECTION_STARTED_USB;
                }
                if (iOrdinal2 == 2) {
                    return defpackage.yyn.PROJECTION_STARTED_WIFI;
                }
                throw new java.lang.RuntimeException(null, null);
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
