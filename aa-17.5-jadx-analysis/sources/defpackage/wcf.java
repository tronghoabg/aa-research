package defpackage;

import com.google.android.gms.car.CarInfo;
import j$.util.function.BiFunction$CC;
import j$.util.stream.Stream;
import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class wcf implements BiFunction {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ wcf(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return this.b != 0 ? BiFunction$CC.$default$andThen(this, function) : BiFunction$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, jes] */
    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        if (this.b == 0) {
            byte[] bArr = (byte[]) obj2;
            Object obj3 = this.a;
            return Arrays.equals(bArr, (byte[]) obj3) ? bArr : obj3;
        }
        Integer num = (Integer) obj;
        Boolean boolValueOf = (Boolean) obj2;
        yph yphVar = jou.a;
        if (!boolValueOf.booleanValue()) {
            abru abruVarL = acmj.a.gu().l();
            if (!abruVarL.b.isEmpty()) {
                CarInfo carInfoT = this.a.t();
                carInfoT.getClass();
                yph yphVar2 = kjf.a;
                Stream streamD = tgx.d(new ilq(17), abruVarL);
                int i = yfq.d;
                boolValueOf = Boolean.valueOf(kjf.h(carInfoT, (yfq) streamD.collect(ycm.a)));
            }
        }
        iqq iqqVarQ = ips.q();
        acrb acrbVar = acrb.a;
        iqqVarQ.b(acrbVar.gu().j());
        iqqVarQ.d(acrbVar.gu().o());
        if (boolValueOf.booleanValue()) {
            if (num.intValue() == 3) {
                iqqVarQ.c(acrb.d());
                iqqVarQ.e(acrb.f());
            } else {
                iqqVarQ.c(acrb.e());
                iqqVarQ.e(acrb.g());
            }
        } else if (num.intValue() == 3) {
            iqqVarQ.c(acrbVar.gu().k());
            iqqVarQ.e(acrbVar.gu().r());
        } else {
            iqqVarQ.c(acrbVar.gu().l());
            iqqVarQ.e(acrbVar.gu().s());
        }
        return iqqVarQ.a();
    }
}
