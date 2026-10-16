package defpackage;

import android.content.Context;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.CarRegionId;
import j$.util.function.Function$CC;
import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.Semaphore;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class kqm implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ kqm(int i) {
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
                return new kql((Context) obj);
            case 1:
                yph yphVar = kox.a;
                int iOrdinal = ((rrw) obj).ordinal();
                if (iOrdinal == 0) {
                    return yxi.PROJECTION_STARTED_UNKNOWN;
                }
                if (iOrdinal == 1) {
                    return yxi.PROJECTION_STARTED_USB;
                }
                if (iOrdinal == 2) {
                    return yxi.PROJECTION_STARTED_WIFI;
                }
                throw new RuntimeException(null, null);
            case 2:
                return ((mma) obj).name();
            case 3:
                return new nrd((CarDisplayId) obj);
            case 4:
                return Integer.valueOf(((nsm) obj).c);
            case 5:
                return Integer.valueOf(((nsm) obj).f);
            case 6:
                return Boolean.valueOf(((nsm) obj).d);
            case 7:
                return ((nsm) obj).g;
            case 8:
                return Integer.valueOf(((nsm) obj).i);
            case 9:
                return ((nsm) obj).j;
            case 10:
                return ((nsm) obj).b;
            case 11:
                return ((nsm) obj).e;
            case 12:
                return (CarRegionId) ((Map.Entry) obj).getKey();
            case 13:
                return Integer.valueOf(((nsm) obj).h);
            case 14:
                int i = ssu.c;
                return new spu();
            case 15:
                yph yphVar2 = tgj.a;
                return new EnumMap(tfy.class);
            case 16:
                return tgx.f((String) obj);
            case 17:
                return ((Map.Entry) obj).getKey();
            case 18:
                yph yphVar3 = tgx.a;
                return new ymp(((Map.Entry) obj).getValue());
            case 19:
                return Integer.valueOf(((vyv) obj).a().b);
            default:
                Long l = wfg.a;
                return new Semaphore(1);
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$compose(this, function);
    }
}
