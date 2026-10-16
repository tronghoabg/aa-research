package defpackage;

import com.google.android.gms.car.RadioProgramSelector;
import java.util.function.ToLongFunction;
import mesquite.messaging.model.Message;

/* loaded from: classes.dex */
public final /* synthetic */ class luz implements ToLongFunction {
    private final /* synthetic */ int a;

    public /* synthetic */ luz(int i) {
        this.a = i;
    }

    @Override // java.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        int i = this.a;
        if (i == 0) {
            yfq yfqVar = ((lug) obj).d;
            int i2 = lva.c;
            return ((Message) yrm.an(yfqVar)).f;
        }
        if (i == 1) {
            yfq yfqVar2 = ((lug) obj).d;
            yph yphVar = luw.a;
            return ((Message) yrm.an(yfqVar2)).f;
        }
        if (i != 2) {
            return i != 3 ? i != 4 ? i != 5 ? ((RadioProgramSelector) obj).a.b : ((Long) lws.g((RadioProgramSelector) obj, 6).orElse(0L)).longValue() : ((Long) lws.f((RadioProgramSelector) obj).orElse(0L)).longValue() : ((Long) lws.f((RadioProgramSelector) obj).orElse(0L)).longValue();
        }
        Long l = (Long) obj;
        l.longValue();
        return l.longValue();
    }
}
