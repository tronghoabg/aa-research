package j$.time.chrono;

import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;

/* renamed from: j$.time.chrono.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC2894b extends Temporal, j$.time.temporal.m, Comparable {
    n E();

    InterfaceC2894b I(j$.time.temporal.p pVar);

    InterfaceC2894b M(long j8, TemporalUnit temporalUnit);

    /* renamed from: O */
    int compareTo(InterfaceC2894b interfaceC2894b);

    m a();

    @Override // j$.time.temporal.Temporal
    InterfaceC2894b d(long j8, j$.time.temporal.q qVar);

    @Override // j$.time.temporal.Temporal
    InterfaceC2894b e(long j8, TemporalUnit temporalUnit);

    boolean equals(Object obj);

    @Override // j$.time.temporal.Temporal
    long f(Temporal temporal, TemporalUnit temporalUnit);

    @Override // j$.time.temporal.TemporalAccessor
    boolean g(j$.time.temporal.q qVar);

    int hashCode();

    /* renamed from: l */
    InterfaceC2894b s(j$.time.temporal.m mVar);

    String toString();

    long x();

    InterfaceC2897e z(j$.time.k kVar);
}
