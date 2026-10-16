package defpackage;

import android.content.Intent;
import j$.util.OptionalInt;
import java.util.function.Function;

/* loaded from: classes.dex */
public final class kox {
    public static final yph a = yph.c("GH.ConnBroadcast");

    public static void a(Intent intent, String str, Enum[] enumArr, Function function, OptionalInt optionalInt) throws rrt {
        Enum enumJ = ols.J(intent, enumArr);
        intent.getClass();
        long longExtra = intent.getLongExtra("event_time_since_boot", -1L);
        yxi yxiVar = (yxi) function.apply(enumJ);
        StringBuilder sb = new StringBuilder(str);
        sb.append(enumJ);
        sb.append(", at ");
        sb.append(longExtra);
        if (yxiVar != null) {
            ((kna) mki.a.i(kna.class)).g(yxiVar, optionalInt, longExtra);
        } else {
            sb.append(", not logging to clearcut (corresponding event is null).");
        }
        ((ype) a.l().ai((char) 3294)).y("%s", sb);
    }

    public static void b(Intent intent, yxi yxiVar, yxi yxiVar2, yxi yxiVar3) throws rrt {
        int i = 1;
        a(intent, String.format("%s: state=", intent.getAction()), rrx.values(), new wco(yxiVar, yxiVar2, yxiVar3, i), (OptionalInt) ols.I(intent, "failure_reason").a(new kpi(i)).d(OptionalInt.empty()));
    }
}
