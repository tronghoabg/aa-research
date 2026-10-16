package defpackage;

import android.content.ComponentName;
import com.google.android.gms.carsetup.CarInfoInternal;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class koj implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ koj(int i) {
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
                yph yphVar = koo.a;
                return new ArrayList();
            case 1:
                return Collection.EL.stream((List) obj);
            case 2:
                yph yphVar2 = koo.a;
                return new ArrayList();
            case 3:
                yph yphVar3 = kox.a;
                switch (((rsa) obj).ordinal()) {
                    case 0:
                        return yxi.USB_ENTERED_ACCESSORY_MODE;
                    case 1:
                        return yxi.USB_EXITED_ACCESSORY_MODE;
                    case 2:
                        return yxi.USB_CONFIGURED;
                    case 3:
                        return yxi.USB_LOST_CONFIGURED;
                    case 4:
                        return yxi.USB_CONNECTED;
                    case 5:
                        return yxi.USB_DISCONNECTED;
                    case 6:
                        return yxi.USB_ENTERED_MTP_MODE;
                    case 7:
                        return yxi.USB_EXITED_MTP_MODE;
                    case 8:
                        return yxi.USB_ENTERED_PTP_MODE;
                    case 9:
                        return yxi.USB_EXITED_PTP_MODE;
                    case 10:
                        return yxi.USB_DATA_UNLOCKED;
                    case 11:
                        return yxi.USB_DATA_LOCKED;
                    case 12:
                        return yxi.USB_ENTERED_ADB_MODE;
                    case 13:
                        return yxi.USB_EXITED_ADB_MODE;
                    case 14:
                        return yxi.USB_ENTERED_AUDIO_SOURCE_MODE;
                    case 15:
                        return yxi.USB_EXITED_AUDIO_SOURCE_MODE;
                    default:
                        throw new RuntimeException(null, null);
                }
            case 4:
                yph yphVar4 = kox.a;
                switch (((rrz) obj).ordinal()) {
                    case 0:
                        return yxi.USB_ISSUE_CHARGE_ONLY_DETECTED;
                    case 1:
                        return yxi.USB_ISSUE_CHARGE_ONLY_OVER;
                    case 2:
                        return yxi.USB_ISSUE_NO_ACCESSORY_MODE;
                    case 3:
                        return yxi.USB_ISSUE_FIRST_ACTIVITY_NOT_LAUNCHED;
                    case 4:
                        return yxi.USB_ISSUE_PROJECTION_NOT_STARTED;
                    case 5:
                        return yxi.USB_ISSUE_NO_ACCESSORY_MODE_FALSE_POSITIVE;
                    case 6:
                        return yxi.USB_ISSUE_FIRST_ACTIVITY_NOT_LAUNCHED_FALSE_POSITIVE;
                    case 7:
                        return yxi.USB_ISSUE_PROJECTION_NOT_STARTED_FALSE_POSITIVE;
                    case 8:
                        return yxi.USB_ISSUE_RESET_SUPPRESSED;
                    case 9:
                        return yxi.USB_ISSUE_FLAKEY_DETECTED;
                    case 10:
                        return yxi.USB_ISSUE_FLAKEY_OVER;
                    case 11:
                        return yxi.USB_ISSUE_LOST_ACCESSORY;
                    default:
                        throw new RuntimeException(null, null);
                }
            case 5:
                yph yphVar5 = kox.a;
                int iOrdinal = ((rrr) obj).ordinal();
                if (iOrdinal == 0) {
                    return yxi.CAR_STARTUP_CHARGE_ONLY_SHOWN;
                }
                if (iOrdinal == 1) {
                    return yxi.CAR_STARTUP_CHARGE_ONLY_MORE_INFO_SELECTED;
                }
                throw new RuntimeException(null, null);
            case 6:
                yph yphVar6 = kox.a;
                int iOrdinal2 = ((rrv) obj).ordinal();
                if (iOrdinal2 == 0) {
                    return yxi.PROJECTION_STARTED_UNKNOWN;
                }
                if (iOrdinal2 == 1) {
                    return yxi.PROJECTION_ENDED_UNKNOWN;
                }
                if (iOrdinal2 == 2) {
                    return yxi.PROCESS_STATE_CACHED_GMSCORE_CAR;
                }
                if (iOrdinal2 == 3) {
                    return yxi.PROCESS_STATE_CACHED_GEARHEAD_PROJECTION;
                }
                if (iOrdinal2 == 4) {
                    return yxi.PROCESS_STATE_CACHED_GEARHEAD_CAR;
                }
                throw new RuntimeException(null, null);
            case 7:
                yph yphVar7 = kox.a;
                int iOrdinal3 = ((rrw) obj).ordinal();
                if (iOrdinal3 == 0) {
                    return yxi.PROJECTION_ENDED_UNKNOWN;
                }
                if (iOrdinal3 == 1) {
                    return yxi.PROJECTION_ENDED_USB;
                }
                if (iOrdinal3 == 2) {
                    return yxi.PROJECTION_ENDED_WIFI;
                }
                throw new RuntimeException(null, null);
            case 8:
                yph yphVar8 = kox.a;
                int iOrdinal4 = ((rru) obj).ordinal();
                if (iOrdinal4 == 0) {
                    return yxi.PROCESS_STATE_CACHED_GEARHEAD_PROJECTION;
                }
                if (iOrdinal4 == 1) {
                    return yxi.PROCESS_STATE_CACHED_GEARHEAD_CAR;
                }
                if (iOrdinal4 == 2) {
                    return yxi.PROCESS_STATE_CACHED_GMSCORE_CAR;
                }
                throw new RuntimeException(null, null);
            case 9:
                kqf kqfVarA = kqg.a();
                kqfVarA.c = Optional.of((CarInfoInternal) obj);
                return kqfVarA.a();
            case 10:
                osj osjVar = ((orz) obj).e;
                if (osjVar == null) {
                    osjVar = osj.a;
                }
                osk oskVar = osjVar.f;
                if (oskVar == null) {
                    oskVar = osk.a;
                }
                return oskVar.b;
            case 11:
                return ((mqc) obj).a;
            case 12:
                return ((mqb) obj).a;
            case 13:
                return ((mqc) obj).a();
            case 14:
                return ((ComponentName) obj).getPackageName();
            case 15:
                return ((mqc) obj).a;
            case 16:
                return ((mqb) obj).a;
            case 17:
                return kzd.g((String) obj);
            case 18:
                String[] strArrSplit = ((String) obj).split(";", 2);
                woy.O(strArrSplit.length == 2, "There must be a name and a URL separated by a semi-colon");
                return new ogz(strArrSplit[0], strArrSplit[1]);
            case 19:
                String str = (String) obj;
                str.getClass();
                if (str.length() == 0) {
                    return new lgk("", null);
                }
                String[] strArr = (String[]) afyh.L(str, new String[]{"@"}, 2).toArray(new String[0]);
                int length = strArr.length;
                if (length != 0) {
                    return new lgk(strArr[0], length == 2 ? strArr[1] : null);
                }
                throw new IllegalStateException("Check failed.");
            default:
                String str2 = (String) obj;
                str2.getClass();
                String[] strArr2 = (String[]) afyh.L(str2, new String[]{"@"}, 3).toArray(new String[0]);
                if (strArr2.length == 3) {
                    return new lgl(strArr2[0], strArr2[1], strArr2[2]);
                }
                throw new IllegalStateException("Check failed.");
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$compose(this, function);
    }
}
