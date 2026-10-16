package defpackage;

import j$.time.Duration;
import j$.time.temporal.ChronoUnit;
import java.lang.reflect.Type;

/* loaded from: classes3.dex */
public final class aiqq {
    private aiqq() {
    }

    public static final long a(Duration duration) {
        if (duration.compareTo(Duration.ZERO) <= 0) {
            return 0L;
        }
        if (duration.compareTo(ChronoUnit.MILLIS.getDuration()) <= 0) {
            return 1L;
        }
        if (duration.getSeconds() < 9223372036854775L || (duration.getSeconds() == 9223372036854775L && duration.getNano() < 807000000)) {
            return duration.toMillis();
        }
        return Long.MAX_VALUE;
    }

    public static final Object b(Duration duration, afeg afegVar, afck afckVar) {
        return aikc.b(a(duration), afegVar, afckVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ aiqc create$default(aiqq aiqqVar, aiqc aiqcVar, aiqc aiqcVar2, boolean z, afdr afdrVar, int i, Object obj) {
        if ((i & 8) != 0) {
            afdrVar = null;
        }
        return aiqqVar.create(aiqcVar, aiqcVar2, z, afdrVar);
    }

    public final aiqc create(aiqc aiqcVar, aiqc aiqcVar2, boolean z, afdr<? extends Type> afdrVar) {
        aiqcVar.getClass();
        aiqcVar2.getClass();
        return affa.f(aiqcVar, aiqcVar2) ? aiqcVar : new aiqr(aiqcVar, aiqcVar2, z, afdrVar, null);
    }

    public /* synthetic */ aiqq(afeu afeuVar) {
        this();
    }
}
