package j$.time.temporal;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'JULIAN_DAY' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements j$.time.temporal.m {
    public static final j$.time.temporal.i JULIAN_DAY;
    public static final j$.time.temporal.i MODIFIED_JULIAN_DAY;
    public static final j$.time.temporal.i RATA_DIE;
    public static final /* synthetic */ j$.time.temporal.i[] d;
    private static final long serialVersionUID = -7501623920830201812L;
    public final transient java.lang.String a;
    public final transient j$.time.temporal.p b;
    public final transient int c;

    static {
        j$.time.temporal.ChronoUnit chronoUnit = j$.time.temporal.ChronoUnit.DAYS;
        j$.time.temporal.ChronoUnit chronoUnit2 = j$.time.temporal.ChronoUnit.FOREVER;
        j$.time.temporal.i iVar = new j$.time.temporal.i("JULIAN_DAY", 0, "JulianDay", chronoUnit, chronoUnit2, 2440588L);
        JULIAN_DAY = iVar;
        j$.time.temporal.i iVar2 = new j$.time.temporal.i("MODIFIED_JULIAN_DAY", 1, "ModifiedJulianDay", chronoUnit, chronoUnit2, 40587L);
        MODIFIED_JULIAN_DAY = iVar2;
        j$.time.temporal.i iVar3 = new j$.time.temporal.i("RATA_DIE", 2, "RataDie", chronoUnit, chronoUnit2, 719163L);
        RATA_DIE = iVar3;
        d = new j$.time.temporal.i[]{iVar, iVar2, iVar3};
    }

    public i(java.lang.String str, int i, java.lang.String str2, j$.time.temporal.ChronoUnit chronoUnit, j$.time.temporal.ChronoUnit chronoUnit2, long j) {
        super(str, i);
        this.a = str2;
        this.b = j$.time.temporal.p.f((-365243219162L) + j, 365241780471L + j);
        this.c = (int) j;
    }

    public static j$.time.temporal.i valueOf(java.lang.String str) {
        return (j$.time.temporal.i) java.lang.Enum.valueOf(j$.time.temporal.i.class, str);
    }

    public static j$.time.temporal.i[] values() {
        return (j$.time.temporal.i[]) d.clone();
    }

    @Override // j$.time.temporal.m
    public final boolean h(j$.time.temporal.TemporalAccessor temporalAccessor) {
        return temporalAccessor.d(j$.time.temporal.a.EPOCH_DAY);
    }

    @Override // j$.time.temporal.m
    public final boolean isDateBased() {
        return true;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.p k(j$.time.temporal.TemporalAccessor temporalAccessor) {
        if (temporalAccessor.d(j$.time.temporal.a.EPOCH_DAY)) {
            return this.b;
        }
        j$.time.g.g("Unsupported field: ".concat(java.lang.String.valueOf(this)));
        return null;
    }

    @Override // j$.time.temporal.m
    public final long l(j$.time.temporal.TemporalAccessor temporalAccessor) {
        return temporalAccessor.C(j$.time.temporal.a.EPOCH_DAY) + ((long) this.c);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.TemporalAccessor p(java.util.HashMap map, j$.time.format.c0 c0Var, j$.time.format.d0 d0Var) {
        long j = this.c;
        long jLongValue = ((java.lang.Long) map.remove(this)).longValue();
        j$.time.chrono.a aVarU = j$.desugar.sun.nio.fs.g.u(c0Var);
        if (d0Var == j$.time.format.d0.LENIENT) {
            return aVarU.p(j$.desugar.sun.nio.fs.g.I(jLongValue, j));
        }
        this.b.b(jLongValue, this);
        return aVarU.p(jLongValue - j);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.Temporal r(j$.time.temporal.Temporal temporal, long j) {
        if (this.b.e(j)) {
            return temporal.a(j$.desugar.sun.nio.fs.g.I(j, this.c), j$.time.temporal.a.EPOCH_DAY);
        }
        throw new j$.time.DateTimeException("Invalid value: " + this.a + " " + j);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.p range() {
        return this.b;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.a;
    }
}
