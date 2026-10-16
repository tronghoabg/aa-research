package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class urj {
    public static final yob a = yob.c("com/google/android/libraries/geo/mapcore/internal/v3/observers/CountersLoggingTransportImpl");
    private final erb b;

    public urj(erb erbVar) {
        this.b = erbVar;
    }

    public final void a(zqm zqmVar, qbu qbuVar) {
        if (zql.a(zqmVar.b) != zql.a) {
            ynz ynzVar = (ynz) a.a(uys.a).ai(9619);
            zqo zqoVarB = zqo.b(zqmVar.d);
            if (zqoVarB == null) {
                zqoVarB = zqo.COUNTERS_METRIC_NONE;
            }
            ynzVar.M("Expected BucketEvent for integer metric %s, but got %s", zqoVarB.name(), zql.a(zqmVar.b));
            return;
        }
        abnp abnpVarN = zbu.a.n();
        zqq zqqVar = zqmVar.e;
        if (zqqVar == null) {
            zqqVar = zqq.a;
        }
        abnpVarN.t();
        zbu zbuVar = (zbu) abnpVarN.b;
        zqqVar.getClass();
        zbuVar.s = zqqVar;
        zbuVar.e |= 2;
        try {
            qbf qbfVar = (qbf) this.b.R(qbuVar);
            if ((zqmVar.b == 2 ? (zqj) zqmVar.c : zqj.a).b != ((int) r0)) {
                throw new ArithmeticException();
            }
            long j = (zqmVar.b == 2 ? (zqj) zqmVar.c : zqj.a).c;
            sik sikVar = qbfVar.a;
        } catch (ArithmeticException unused) {
            ynz ynzVar2 = (ynz) a.h();
            zqo zqoVarB2 = zqo.b(zqmVar.d);
            if (zqoVarB2 == null) {
                zqoVarB2 = zqo.COUNTERS_METRIC_NONE;
            }
            ynz ynzVar3 = (ynz) ((ynz) ((ynz) ynzVar2.m(zqoVarB2)).l(60, TimeUnit.MINUTES)).ai(9618);
            zqo zqoVarB3 = zqo.b(zqmVar.d);
            if (zqoVarB3 == null) {
                zqoVarB3 = zqo.COUNTERS_METRIC_NONE;
            }
            ynzVar3.y("Expected integer bucket key for metric: %s", zqoVarB3.name());
        }
    }

    public final void b(zqm zqmVar, qbv qbvVar) {
        if (zql.a(zqmVar.b) != zql.a) {
            ynz ynzVar = (ynz) a.a(uys.a).ai(9620);
            zqo zqoVarB = zqo.b(zqmVar.d);
            if (zqoVarB == null) {
                zqoVarB = zqo.COUNTERS_METRIC_NONE;
            }
            ynzVar.M("Expected BucketEvent for metric %s, but got %s", zqoVarB.name(), zql.a(zqmVar.b));
            return;
        }
        abnp abnpVarN = zbu.a.n();
        zqq zqqVar = zqmVar.e;
        if (zqqVar == null) {
            zqqVar = zqq.a;
        }
        abnpVarN.t();
        zbu zbuVar = (zbu) abnpVarN.b;
        zqqVar.getClass();
        zbuVar.s = zqqVar;
        zbuVar.e |= 2;
        long j = (zqmVar.b == 2 ? (zqj) zqmVar.c : zqj.a).b;
        long j2 = (zqmVar.b == 2 ? (zqj) zqmVar.c : zqj.a).c;
    }

    public final void c(zqm zqmVar, qbr qbrVar) {
        if (zql.a(zqmVar.b) != zql.b) {
            ynz ynzVar = (ynz) a.a(uys.a).ai(9621);
            zqo zqoVarB = zqo.b(zqmVar.d);
            if (zqoVarB == null) {
                zqoVarB = zqo.COUNTERS_METRIC_NONE;
            }
            ynzVar.M("Expected CountEvent for metric %s, but got %s", zqoVarB.name(), zql.a(zqmVar.b));
            return;
        }
        abnp abnpVarN = zbu.a.n();
        zqq zqqVar = zqmVar.e;
        if (zqqVar == null) {
            zqqVar = zqq.a;
        }
        abnpVarN.t();
        zbu zbuVar = (zbu) abnpVarN.b;
        zqqVar.getClass();
        zbuVar.s = zqqVar;
        zbuVar.e |= 2;
        qbe qbeVar = (qbe) this.b.R(qbrVar);
        long j = (zqmVar.b == 3 ? (zqk) zqmVar.c : zqk.a).b;
        sii siiVar = qbeVar.a;
    }

    public final void d(zqm zqmVar, qbv qbvVar) {
        if (zql.a(zqmVar.b) != zql.c) {
            ynz ynzVar = (ynz) a.a(uys.a).ai(9623);
            zqo zqoVarB = zqo.b(zqmVar.d);
            if (zqoVarB == null) {
                zqoVarB = zqo.COUNTERS_METRIC_NONE;
            }
            ynzVar.M("Expected TimerEvent for metric %s, but got %s", zqoVarB.name(), zql.a(zqmVar.b));
            return;
        }
        abnp abnpVarN = zbu.a.n();
        zqq zqqVar = zqmVar.e;
        if (zqqVar == null) {
            zqqVar = zqq.a;
        }
        abnpVarN.t();
        zbu zbuVar = (zbu) abnpVarN.b;
        zqqVar.getClass();
        zbuVar.s = zqqVar;
        zbuVar.e |= 2;
        long j = (zqmVar.b == 4 ? (zqt) zqmVar.c : zqt.a).b;
    }
}
