package defpackage;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import j$.util.function.Function$CC;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.atomic.LongAdder;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class ilq implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ ilq(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo329andThen(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                izq izqVar = ima.a;
                return new LongAdder();
            case 1:
                return kjf.b((String) obj);
            case 2:
                return ((String) obj).trim();
            case 3:
                Integer num = (Integer) obj;
                int i = ine.g;
                return num;
            case 4:
                Intent intent = iob.a;
                return ((ResolveInfo) obj).serviceInfo;
            case 5:
                return kjf.b((String) obj);
            case 6:
                xhc xhcVarB = xhc.b(((xha) obj).b);
                return xhcVarB == null ? xhc.ACTION_UNKNOWN : xhcVarB;
            case 7:
                return iya.s((ResolveInfo) obj);
            case 8:
                return tgx.f((String) obj);
            case 9:
                xxx xxxVar = iyh.a;
                return new HashSet();
            case 10:
                return null;
            case 11:
                return null;
            case 12:
                yfy yfyVar = jep.b;
                return Integer.valueOf(((xny) ((Map.Entry) obj).getValue()).A);
            case 13:
                return (Integer) ((Map.Entry) obj).getKey();
            case 14:
                return ((jey) obj).name();
            case 15:
                return jfr.a((String) obj);
            case 16:
                return kjf.b((String) obj);
            case 17:
                return kjf.j((String) obj);
            case 18:
                yph yphVar = kox.a;
                switch (((rrs) obj).ordinal()) {
                    case 0:
                        return yxi.FIRST_ACTIVITY_LAUNCHED_UNKNOWN_INTENT;
                    case 1:
                        return yxi.FIRST_ACTIVITY_LAUNCHED_INVALID_INTENT;
                    case 2:
                        return yxi.FIRST_ACTIVITY_LAUNCHED_ACCESSORY_ATTACHED;
                    case 3:
                        return yxi.FIRST_ACTIVITY_LAUNCHED_WIRELESS;
                    case 4:
                        return yxi.FIRST_ACTIVITY_LAUNCHED_WIRELESS_BRIDGE;
                    case 5:
                        return yxi.FIRST_ACTIVITY_LAUNCHED_CAR_SERVICE;
                    case 6:
                        return yxi.FIRST_ACTIVITY_LAUNCHED_RESTART;
                    case 7:
                        return yxi.FIRST_ACTIVITY_LAUNCHED_NEW_INTENT;
                    case 8:
                        return yxi.FIRST_ACTIVITY_FORCE_STARTED;
                    default:
                        throw new RuntimeException(null, null);
                }
            case 19:
                yph yphVar2 = kox.a;
                int iOrdinal = ((rry) obj).ordinal();
                if (iOrdinal == 0) {
                    return yxi.FIRST_ACTIVITY_CLASS_LOADED;
                }
                if (iOrdinal == 1) {
                    return yxi.FACET_BAR_FIRST_RESUME;
                }
                if (iOrdinal == 2) {
                    return yxi.CAR_SERVICE_VIDEO_FOCUS_GAINED;
                }
                if (iOrdinal == 3) {
                    return yxi.PROJECTION_LIFECYCLE_LISTENER_ON_PROJECTION_START;
                }
                if (iOrdinal == 4) {
                    return yxi.PRIMARY_REGION_FIRST_CAR_ACTIVITY_RESUME;
                }
                throw new RuntimeException(null, null);
            default:
                yph yphVar3 = kox.a;
                switch (((rrq) obj).ordinal()) {
                    case 0:
                        return yxi.CAR_SETUP_SERVICE_CREATE;
                    case 1:
                        return yxi.CAR_SETUP_SERVICE_ALREADY_STARTED;
                    case 2:
                        return yxi.CAR_SETUP_SERVICE_DESTROY;
                    case 3:
                        return yxi.CAR_SETUP_SERVICE_SET_STATE_NOT_CONNECTED;
                    case 4:
                        return yxi.CAR_SETUP_SERVICE_SET_STATE_CONNECTING;
                    case 5:
                        return yxi.CAR_SETUP_SERVICE_SET_STATE_WAITING_FOR_PATCHER;
                    case 6:
                        return yxi.CAR_SETUP_SERVICE_SET_STATE_DISCOVERED;
                    case 7:
                        return yxi.CAR_SETUP_SERVICE_STATE_ALREADY_NOT_CONNECTED_IN_TEARDOWN;
                    case 8:
                        return yxi.CAR_SETUP_SERVICE_SECURITY_PATCHER_SUCCESS_SET_STATE_DISCOVERED;
                    case 9:
                        return yxi.CAR_SETUP_SERVICE_SECURITY_PATCHER_SUCCESS_STATE_NOT_WAITING_FOR_PATCHER;
                    case 10:
                        return yxi.CAR_SETUP_SERVICE_SECURITY_PATCHER_FAILURE;
                    case 11:
                        return yxi.GEARHEAD_PROJECTION_ENABLED;
                    case 12:
                        return yxi.GEARHEAD_PROJECTION_DISABLED;
                    default:
                        throw new RuntimeException(null, null);
                }
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$compose(this, function);
    }
}
