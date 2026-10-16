package j$.time.format;

import j$.time.ZoneId;
import j$.time.chrono.InterfaceC2894b;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import java.util.Locale;

/* loaded from: classes2.dex */
final class t {

    /* renamed from: a, reason: collision with root package name */
    private TemporalAccessor f37616a;

    /* renamed from: b, reason: collision with root package name */
    private DateTimeFormatter f37617b;

    /* renamed from: c, reason: collision with root package name */
    private int f37618c;

    t(TemporalAccessor temporalAccessor, DateTimeFormatter dateTimeFormatter) {
        j$.time.chrono.m mVarA = dateTimeFormatter.a();
        if (mVarA != null) {
            j$.time.chrono.m mVar = (j$.time.chrono.m) temporalAccessor.B(j$.time.temporal.l.e());
            ZoneId zoneId = (ZoneId) temporalAccessor.B(j$.time.temporal.l.k());
            InterfaceC2894b interfaceC2894bR = null;
            mVarA = Objects.equals(mVarA, mVar) ? null : mVarA;
            Objects.equals(null, zoneId);
            if (mVarA != null) {
                j$.time.chrono.m mVar2 = mVarA != null ? mVarA : mVar;
                if (mVarA != null) {
                    if (temporalAccessor.g(j$.time.temporal.a.EPOCH_DAY)) {
                        interfaceC2894bR = mVar2.r(temporalAccessor);
                    } else if (mVarA != j$.time.chrono.t.f37543d || mVar != null) {
                        for (j$.time.temporal.a aVar : j$.time.temporal.a.values()) {
                            if (aVar.D() && temporalAccessor.g(aVar)) {
                                throw new j$.time.c("Unable to apply override chronology '" + mVarA + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + temporalAccessor);
                            }
                        }
                    }
                }
                temporalAccessor = new s(interfaceC2894bR, temporalAccessor, mVar2, zoneId);
            }
        }
        this.f37616a = temporalAccessor;
        this.f37617b = dateTimeFormatter;
    }

    final TemporalAccessor d() {
        return this.f37616a;
    }

    final Locale c() {
        return this.f37617b.c();
    }

    final w b() {
        return this.f37617b.b();
    }

    final void g() {
        this.f37618c++;
    }

    final void a() {
        this.f37618c--;
    }

    final Object f(C2904a c2904a) {
        TemporalAccessor temporalAccessor = this.f37616a;
        Object objB = temporalAccessor.B(c2904a);
        if (objB != null || this.f37618c != 0) {
            return objB;
        }
        throw new j$.time.c("Unable to extract " + c2904a + " from temporal " + temporalAccessor);
    }

    final Long e(j$.time.temporal.q qVar) {
        int i5 = this.f37618c;
        TemporalAccessor temporalAccessor = this.f37616a;
        if (i5 <= 0 || temporalAccessor.g(qVar)) {
            return Long.valueOf(temporalAccessor.w(qVar));
        }
        return null;
    }

    public final String toString() {
        return this.f37616a.toString();
    }
}
