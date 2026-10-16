package j$.time;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final class Duration implements j$.time.temporal.TemporalAmount, java.lang.Comparable<j$.time.Duration>, java.io.Serializable {
    public static final j$.time.Duration ZERO = new j$.time.Duration(0, 0);
    public static final java.math.BigInteger c = java.math.BigInteger.valueOf(1000000000);
    private static final long serialVersionUID = 3078945930695997490L;
    public final long a;
    public final int b;

    public Duration(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public static j$.time.Duration between(j$.time.temporal.Temporal temporal, j$.time.temporal.Temporal temporal2) {
        try {
            return ofNanos(temporal.e(temporal2, j$.time.temporal.ChronoUnit.NANOS));
        } catch (j$.time.DateTimeException | java.lang.ArithmeticException unused) {
            long jE = temporal.e(temporal2, j$.time.temporal.ChronoUnit.SECONDS);
            long j = 0;
            try {
                j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_SECOND;
                long jC = temporal2.C(aVar) - temporal.C(aVar);
                if (jE > 0 && jC < 0) {
                    jE++;
                } else if (jE < 0 && jC > 0) {
                    jE--;
                }
                j = jC;
            } catch (j$.time.DateTimeException unused2) {
            }
            return ofSeconds(jE, j);
        }
    }

    public static j$.time.Duration k(long j, int i) {
        return (((long) i) | j) == 0 ? ZERO : new j$.time.Duration(j, i);
    }

    public static j$.time.Duration l(java.math.BigDecimal bigDecimal) {
        java.math.BigInteger bigIntegerExact = bigDecimal.movePointRight(9).toBigIntegerExact();
        java.math.BigInteger[] bigIntegerArrDivideAndRemainder = bigIntegerExact.divideAndRemainder(c);
        if (bigIntegerArrDivideAndRemainder[0].bitLength() <= 63) {
            return ofSeconds(bigIntegerArrDivideAndRemainder[0].longValue(), bigIntegerArrDivideAndRemainder[1].intValue());
        }
        throw new java.lang.ArithmeticException("Exceeds capacity of Duration: ".concat(java.lang.String.valueOf(bigIntegerExact)));
    }

    public static j$.time.Duration of(long j, j$.time.temporal.TemporalUnit temporalUnit) {
        j$.time.Duration duration = ZERO;
        duration.getClass();
        j$.util.Objects.a(temporalUnit, "unit");
        if (temporalUnit == j$.time.temporal.ChronoUnit.DAYS) {
            return duration.p(j$.desugar.sun.nio.fs.g.H(j, 86400L), 0L);
        }
        if (temporalUnit.isDurationEstimated()) {
            j$.time.g.e("Unit must not have an estimated duration");
            return null;
        }
        if (j == 0) {
            return duration;
        }
        if (!(temporalUnit instanceof j$.time.temporal.ChronoUnit)) {
            j$.time.Duration durationMultipliedBy = temporalUnit.getDuration().multipliedBy(j);
            return duration.plusSeconds(durationMultipliedBy.getSeconds()).plusNanos(durationMultipliedBy.getNano());
        }
        int i = j$.time.c.a[((j$.time.temporal.ChronoUnit) temporalUnit).ordinal()];
        if (i == 1) {
            return duration.plusNanos(j);
        }
        if (i == 2) {
            return duration.plusSeconds((j / 1000000000) * 1000).plusNanos((j % 1000000000) * 1000);
        }
        if (i != 3) {
            return i != 4 ? duration.plusSeconds(j$.desugar.sun.nio.fs.g.H(temporalUnit.getDuration().a, j)) : duration.plusSeconds(j);
        }
        return duration.r(j);
    }

    public static j$.time.Duration ofDays(long j) {
        return k(j$.desugar.sun.nio.fs.g.H(j, 86400L), 0);
    }

    public static j$.time.Duration ofHours(long j) {
        return k(j$.desugar.sun.nio.fs.g.H(j, 3600L), 0);
    }

    public static j$.time.Duration ofMillis(long j) {
        long j2 = j / 1000;
        int i = (int) (j % 1000);
        if (i < 0) {
            i += 1000;
            j2--;
        }
        return k(j2, i * 1000000);
    }

    public static j$.time.Duration ofMinutes(long j) {
        return k(j$.desugar.sun.nio.fs.g.H(j, 60L), 0);
    }

    public static j$.time.Duration ofNanos(long j) {
        long j2 = j / 1000000000;
        int i = (int) (j % 1000000000);
        if (i < 0) {
            i = (int) (((long) i) + 1000000000);
            j2--;
        }
        return k(j2, i);
    }

    public static j$.time.Duration ofSeconds(long j, long j2) {
        return k(j$.desugar.sun.nio.fs.g.G(j, j$.desugar.sun.nio.fs.g.y(j2, 1000000000L)), (int) j$.desugar.sun.nio.fs.g.F(j2, 1000000000L));
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    private java.lang.Object writeReplace() {
        return new j$.time.q((byte) 1, this);
    }

    public j$.time.Duration abs() {
        return isNegative() ? multipliedBy(-1L) : this;
    }

    @Override // java.lang.Comparable
    public int compareTo(j$.time.Duration duration) {
        int iCompare = java.lang.Long.compare(this.a, duration.a);
        return iCompare != 0 ? iCompare : this.b - duration.b;
    }

    public j$.time.Duration dividedBy(long j) {
        if (j != 0) {
            return j == 1 ? this : l(java.math.BigDecimal.valueOf(this.a).add(java.math.BigDecimal.valueOf(this.b, 9)).divide(java.math.BigDecimal.valueOf(j), java.math.RoundingMode.DOWN));
        }
        throw new java.lang.ArithmeticException("Cannot divide by zero");
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j$.time.Duration) {
            j$.time.Duration duration = (j$.time.Duration) obj;
            if (this.a == duration.a && this.b == duration.b) {
                return true;
            }
        }
        return false;
    }

    public int getNano() {
        return this.b;
    }

    public long getSeconds() {
        return this.a;
    }

    @Override // j$.time.temporal.TemporalAmount
    public final j$.time.temporal.Temporal h(j$.time.temporal.Temporal temporal) {
        long j = this.a;
        if (j != 0) {
            temporal = temporal.b(j, j$.time.temporal.ChronoUnit.SECONDS);
        }
        int i = this.b;
        return i != 0 ? temporal.b(i, j$.time.temporal.ChronoUnit.NANOS) : temporal;
    }

    public int hashCode() {
        long j = this.a;
        return (this.b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public boolean isNegative() {
        return this.a < 0;
    }

    public boolean isZero() {
        return (((long) this.b) | this.a) == 0;
    }

    public j$.time.Duration minus(j$.time.Duration duration) {
        long seconds = duration.getSeconds();
        int nano = duration.getNano();
        return seconds == Long.MIN_VALUE ? p(Long.MAX_VALUE, -nano).p(1L, 0L) : p(-seconds, -nano);
    }

    public j$.time.Duration minusDays(long j) {
        long j2;
        if (j == Long.MIN_VALUE) {
            this = p(j$.desugar.sun.nio.fs.g.H(Long.MAX_VALUE, 86400L), 0L);
            this.getClass();
            j2 = 1;
        } else {
            j2 = -j;
        }
        return this.p(j$.desugar.sun.nio.fs.g.H(j2, 86400L), 0L);
    }

    public j$.time.Duration minusHours(long j) {
        long j2;
        if (j == Long.MIN_VALUE) {
            this = p(j$.desugar.sun.nio.fs.g.H(Long.MAX_VALUE, 3600L), 0L);
            this.getClass();
            j2 = 1;
        } else {
            j2 = -j;
        }
        return this.p(j$.desugar.sun.nio.fs.g.H(j2, 3600L), 0L);
    }

    public j$.time.Duration minusMillis(long j) {
        long j2;
        if (j == Long.MIN_VALUE) {
            this = r(Long.MAX_VALUE);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return this.r(j2);
    }

    public j$.time.Duration multipliedBy(long j) {
        if (j == 0) {
            return ZERO;
        }
        return j == 1 ? this : l(java.math.BigDecimal.valueOf(this.a).add(java.math.BigDecimal.valueOf(this.b, 9)).multiply(java.math.BigDecimal.valueOf(j)));
    }

    public final j$.time.Duration p(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return ofSeconds(j$.desugar.sun.nio.fs.g.G(j$.desugar.sun.nio.fs.g.G(this.a, j), j2 / 1000000000), ((long) this.b) + (j2 % 1000000000));
    }

    public j$.time.Duration plus(j$.time.Duration duration) {
        return p(duration.getSeconds(), duration.getNano());
    }

    public j$.time.Duration plusNanos(long j) {
        return p(0L, j);
    }

    public j$.time.Duration plusSeconds(long j) {
        return p(j, 0L);
    }

    public final j$.time.Duration r(long j) {
        return p(j / 1000, (j % 1000) * 1000000);
    }

    public long toDays() {
        return this.a / 86400;
    }

    public long toHours() {
        return this.a / 3600;
    }

    public int toHoursPart() {
        return (int) (toHours() % 24);
    }

    public long toMillis() {
        long j = this.b;
        long j2 = this.a;
        if (j2 < 0) {
            j2++;
            j -= 1000000000;
        }
        return j$.desugar.sun.nio.fs.g.G(j$.desugar.sun.nio.fs.g.H(j2, 1000L), j / 1000000);
    }

    public int toMillisPart() {
        return this.b / 1000000;
    }

    public long toMinutes() {
        return this.a / 60;
    }

    public int toMinutesPart() {
        return (int) (toMinutes() % 60);
    }

    public long toNanos() {
        long j = this.b;
        long j2 = this.a;
        if (j2 < 0) {
            j2++;
            j -= 1000000000;
        }
        return j$.desugar.sun.nio.fs.g.G(j$.desugar.sun.nio.fs.g.H(j2, 1000000000L), j);
    }

    public long toSeconds() {
        return this.a;
    }

    public int toSecondsPart() {
        return (int) (this.a % 60);
    }

    public final java.lang.String toString() {
        if (this == ZERO) {
            return "PT0S";
        }
        long j = this.a;
        int i = this.b;
        long j2 = (j >= 0 || i <= 0) ? j : 1 + j;
        long j3 = j2 / 3600;
        int i2 = (int) ((j2 % 3600) / 60);
        int i3 = (int) (j2 % 60);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(24);
        sb.append("PT");
        if (j3 != 0) {
            sb.append(j3);
            sb.append('H');
        }
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        if (i3 == 0 && i == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (j >= 0 || i <= 0 || i3 != 0) {
            sb.append(i3);
        } else {
            sb.append("-0");
        }
        if (i > 0) {
            int length = sb.length();
            if (j < 0) {
                sb.append(2000000000 - ((long) i));
            } else {
                sb.append(((long) i) + 1000000000);
            }
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, '.');
        }
        sb.append('S');
        return sb.toString();
    }

    public static j$.time.Duration ofSeconds(long j) {
        return k(j, 0);
    }
}
