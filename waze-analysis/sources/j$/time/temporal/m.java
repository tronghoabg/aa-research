package j$.time.temporal;

import j$.time.format.a0;
import j$.time.format.b0;
import java.util.HashMap;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public interface m {
    boolean f(TemporalAccessor temporalAccessor);

    p h(TemporalAccessor temporalAccessor);

    boolean isDateBased();

    long k(TemporalAccessor temporalAccessor);

    TemporalAccessor m(HashMap map, a0 a0Var, b0 b0Var);

    p range();

    Temporal x(Temporal temporal, long j2);
}
