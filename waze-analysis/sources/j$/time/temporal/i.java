package j$.time.temporal;

import j$.time.chrono.Chronology;
import j$.time.format.a0;
import j$.time.format.b0;
import java.util.HashMap;

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
/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class i implements m {
    public static final i JULIAN_DAY;
    public static final i MODIFIED_JULIAN_DAY;
    public static final i RATA_DIE;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ i[] f50058d;
    private static final long serialVersionUID = -7501623920830201812L;

    /* renamed from: a, reason: collision with root package name */
    public final transient String f50059a;

    /* renamed from: b, reason: collision with root package name */
    public final transient p f50060b;

    /* renamed from: c, reason: collision with root package name */
    public final transient long f50061c;

    static {
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        ChronoUnit chronoUnit2 = ChronoUnit.FOREVER;
        i iVar = new i("JULIAN_DAY", 0, "JulianDay", chronoUnit, chronoUnit2, 2440588L);
        JULIAN_DAY = iVar;
        i iVar2 = new i("MODIFIED_JULIAN_DAY", 1, "ModifiedJulianDay", chronoUnit, chronoUnit2, 40587L);
        MODIFIED_JULIAN_DAY = iVar2;
        i iVar3 = new i("RATA_DIE", 2, "RataDie", chronoUnit, chronoUnit2, 719163L);
        RATA_DIE = iVar3;
        f50058d = new i[]{iVar, iVar2, iVar3};
    }

    public i(String str, int i2, String str2, ChronoUnit chronoUnit, ChronoUnit chronoUnit2, long j2) {
        this.f50059a = str2;
        this.f50060b = p.f((-365243219162L) + j2, 365241780471L + j2);
        this.f50061c = j2;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f50058d.clone();
    }

    @Override // j$.time.temporal.m
    public final boolean f(TemporalAccessor temporalAccessor) {
        return temporalAccessor.c(a.EPOCH_DAY);
    }

    @Override // j$.time.temporal.m
    public final p h(TemporalAccessor temporalAccessor) {
        if (temporalAccessor.c(a.EPOCH_DAY)) {
            return this.f50060b;
        }
        j$.time.f.h("Unsupported field: ".concat(String.valueOf(this)));
        return null;
    }

    @Override // j$.time.temporal.m
    public final boolean isDateBased() {
        return true;
    }

    @Override // j$.time.temporal.m
    public final long k(TemporalAccessor temporalAccessor) {
        return temporalAccessor.D(a.EPOCH_DAY) + this.f50061c;
    }

    @Override // j$.time.temporal.m
    public final TemporalAccessor m(HashMap map, a0 a0Var, b0 b0Var) {
        long jLongValue = ((Long) map.remove(this)).longValue();
        Chronology chronologyA = Chronology.CC.a(a0Var);
        b0 b0Var2 = b0.LENIENT;
        long j2 = this.f50061c;
        if (b0Var == b0Var2) {
            return chronologyA.dateEpochDay(j$.com.android.tools.r8.a.R(jLongValue, j2));
        }
        this.f50060b.b(jLongValue, this);
        return chronologyA.dateEpochDay(jLongValue - j2);
    }

    @Override // j$.time.temporal.m
    public final p range() {
        return this.f50060b;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f50059a;
    }

    @Override // j$.time.temporal.m
    public final Temporal x(Temporal temporal, long j2) {
        if (this.f50060b.e(j2)) {
            return temporal.a(j$.com.android.tools.r8.a.R(j2, this.f50061c), a.EPOCH_DAY);
        }
        throw new j$.time.c("Invalid value: " + this.f50059a + " " + j2);
    }
}
