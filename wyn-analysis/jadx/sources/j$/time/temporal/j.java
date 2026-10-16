package j$.time.temporal;

import j$.time.chrono.AbstractC2901i;
import j$.time.format.y;
import java.util.HashMap;
import org.apache.tika.utils.StringUtils;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'JULIAN_DAY' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
final class j implements q {
    public static final j JULIAN_DAY;
    public static final j MODIFIED_JULIAN_DAY;
    public static final j RATA_DIE;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ j[] f37679d;
    private static final long serialVersionUID = -7501623920830201812L;

    /* renamed from: a, reason: collision with root package name */
    private final transient String f37680a;

    /* renamed from: b, reason: collision with root package name */
    private final transient t f37681b;

    /* renamed from: c, reason: collision with root package name */
    private final transient long f37682c;

    @Override // j$.time.temporal.q
    public final boolean D() {
        return true;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f37679d.clone();
    }

    static {
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        ChronoUnit chronoUnit2 = ChronoUnit.FOREVER;
        j jVar = new j("JULIAN_DAY", 0, "JulianDay", chronoUnit, chronoUnit2, 2440588L);
        JULIAN_DAY = jVar;
        j jVar2 = new j("MODIFIED_JULIAN_DAY", 1, "ModifiedJulianDay", chronoUnit, chronoUnit2, 40587L);
        MODIFIED_JULIAN_DAY = jVar2;
        j jVar3 = new j("RATA_DIE", 2, "RataDie", chronoUnit, chronoUnit2, 719163L);
        RATA_DIE = jVar3;
        f37679d = new j[]{jVar, jVar2, jVar3};
    }

    private j(String str, int i5, String str2, ChronoUnit chronoUnit, ChronoUnit chronoUnit2, long j8) {
        this.f37680a = str2;
        this.f37681b = t.j((-365243219162L) + j8, 365241780471L + j8);
        this.f37682c = j8;
    }

    @Override // j$.time.temporal.q
    public final t o() {
        return this.f37681b;
    }

    @Override // j$.time.temporal.q
    public final t B(TemporalAccessor temporalAccessor) {
        if (temporalAccessor.g(a.EPOCH_DAY)) {
            return this.f37681b;
        }
        throw new j$.time.c("Unsupported field: " + this);
    }

    @Override // j$.time.temporal.q
    public final boolean t(TemporalAccessor temporalAccessor) {
        return temporalAccessor.g(a.EPOCH_DAY);
    }

    @Override // j$.time.temporal.q
    public final long s(TemporalAccessor temporalAccessor) {
        return temporalAccessor.w(a.EPOCH_DAY) + this.f37682c;
    }

    @Override // j$.time.temporal.q
    public final Temporal w(Temporal temporal, long j8) {
        if (!this.f37681b.i(j8)) {
            throw new j$.time.c("Invalid value: " + this.f37680a + StringUtils.SPACE + j8);
        }
        return temporal.d(j$.time.b.h(j8, this.f37682c), a.EPOCH_DAY);
    }

    @Override // j$.time.temporal.q
    public final TemporalAccessor q(HashMap map, TemporalAccessor temporalAccessor, y yVar) {
        long jLongValue = ((Long) map.remove(this)).longValue();
        j$.time.chrono.m mVarQ = AbstractC2901i.q(temporalAccessor);
        y yVar2 = y.LENIENT;
        long j8 = this.f37682c;
        if (yVar == yVar2) {
            return mVarQ.m(j$.time.b.h(jLongValue, j8));
        }
        this.f37681b.b(jLongValue, this);
        return mVarQ.m(jLongValue - j8);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f37680a;
    }
}
