package j$.nio.file.attribute;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final class FileTime implements java.lang.Comparable<j$.nio.file.attribute.FileTime> {
    public final long a;
    public j$.time.Instant b = null;
    public java.lang.String c;

    public FileTime(long j) {
        this.a = j;
    }

    public static void h(java.lang.StringBuilder sb, int i, int i2) {
        while (i > 0) {
            sb.append((char) ((i2 / i) + 48));
            i2 %= i;
            i /= 10;
        }
    }

    public static long l(long j, long j2, long j3) {
        if (j > j3) {
            return Long.MAX_VALUE;
        }
        if (j < (-j3)) {
            return Long.MIN_VALUE;
        }
        return j * j2;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof j$.nio.file.attribute.FileTime) && compareTo((j$.nio.file.attribute.FileTime) obj) == 0;
    }

    public final int hashCode() {
        return r().hashCode();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final int compareTo(j$.nio.file.attribute.FileTime fileTime) {
        long j = this.a;
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        if (timeUnit != null) {
            fileTime.getClass();
            return java.lang.Long.compare(j, fileTime.a);
        }
        long epochSecond = r().getEpochSecond();
        int iCompare = java.lang.Long.compare(epochSecond, fileTime.r().getEpochSecond());
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = java.lang.Long.compare(r().getNano(), fileTime.r().getNano());
        if (iCompare2 != 0) {
            return iCompare2;
        }
        if (epochSecond != 31556889864403199L && epochSecond != -31557014167219200L) {
            return 0;
        }
        long epochSecond2 = timeUnit != null ? j / 86400000 : r().getEpochSecond() / 86400;
        long epochSecond3 = timeUnit != null ? fileTime.a / 86400000 : fileTime.r().getEpochSecond() / 86400;
        return epochSecond2 == epochSecond3 ? java.lang.Long.compare(p(epochSecond2), fileTime.p(epochSecond3)) : java.lang.Long.compare(epochSecond2, epochSecond3);
    }

    public final long p(long j) {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.DAYS;
        java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.MILLISECONDS;
        if (timeUnit2 != null) {
            return timeUnit2.toNanos(this.a - timeUnit2.convert(j, timeUnit));
        }
        return java.util.concurrent.TimeUnit.SECONDS.toNanos(r().getEpochSecond() - timeUnit.toSeconds(j));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x007d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0082  */
    /* JADX WARN: Code duplicated, block: B:21:0x008b  */
    /* JADX WARN: Code duplicated, block: B:23:0x0090  */
    public final j$.time.Instant r() {
        long jY;
        j$.time.Instant instant = this.b;
        if (instant != null) {
            return instant;
        }
        int i = j$.nio.file.attribute.e0.a[java.util.concurrent.TimeUnit.MILLISECONDS.ordinal()];
        long jL = this.a;
        int iF = 0;
        switch (i) {
            case 1:
                jL = l(this.a, 86400L, 106751991167300L);
                if (jL <= -31557014167219200L) {
                    j$.time.Instant instant2 = j$.time.Instant.MIN;
                    this.b = instant2;
                    return instant2;
                }
                if (jL >= 31556889864403199L) {
                    j$.time.Instant instant3 = j$.time.Instant.MAX;
                    this.b = instant3;
                    return instant3;
                }
                j$.time.Instant instantOfEpochSecond = j$.time.Instant.ofEpochSecond(jL, iF);
                this.b = instantOfEpochSecond;
                return instantOfEpochSecond;
            case 2:
                jL = l(this.a, 3600L, 2562047788015215L);
                if (jL <= -31557014167219200L) {
                    j$.time.Instant instant4 = j$.time.Instant.MIN;
                    this.b = instant4;
                    return instant4;
                }
                if (jL >= 31556889864403199L) {
                    j$.time.Instant instant5 = j$.time.Instant.MAX;
                    this.b = instant5;
                    return instant5;
                }
                j$.time.Instant instantOfEpochSecond2 = j$.time.Instant.ofEpochSecond(jL, iF);
                this.b = instantOfEpochSecond2;
                return instantOfEpochSecond2;
            case 3:
                jL = l(this.a, 60L, 153722867280912930L);
                if (jL <= -31557014167219200L) {
                    j$.time.Instant instant6 = j$.time.Instant.MIN;
                    this.b = instant6;
                    return instant6;
                }
                if (jL >= 31556889864403199L) {
                    j$.time.Instant instant7 = j$.time.Instant.MAX;
                    this.b = instant7;
                    return instant7;
                }
                j$.time.Instant instantOfEpochSecond3 = j$.time.Instant.ofEpochSecond(jL, iF);
                this.b = instantOfEpochSecond3;
                return instantOfEpochSecond3;
            case 4:
                if (jL <= -31557014167219200L) {
                    j$.time.Instant instant8 = j$.time.Instant.MIN;
                    this.b = instant8;
                    return instant8;
                }
                if (jL >= 31556889864403199L) {
                    j$.time.Instant instant9 = j$.time.Instant.MAX;
                    this.b = instant9;
                    return instant9;
                }
                j$.time.Instant instantOfEpochSecond4 = j$.time.Instant.ofEpochSecond(jL, iF);
                this.b = instantOfEpochSecond4;
                return instantOfEpochSecond4;
            case 5:
                jY = j$.desugar.sun.nio.fs.g.y(jL, 1000L);
                iF = ((int) j$.desugar.sun.nio.fs.g.F(jL, 1000L)) * 1000000;
                jL = jY;
                if (jL <= -31557014167219200L) {
                    j$.time.Instant instant10 = j$.time.Instant.MIN;
                    this.b = instant10;
                    return instant10;
                }
                if (jL >= 31556889864403199L) {
                    j$.time.Instant instant11 = j$.time.Instant.MAX;
                    this.b = instant11;
                    return instant11;
                }
                j$.time.Instant instantOfEpochSecond5 = j$.time.Instant.ofEpochSecond(jL, iF);
                this.b = instantOfEpochSecond5;
                return instantOfEpochSecond5;
            case 6:
                jY = j$.desugar.sun.nio.fs.g.y(jL, 1000000L);
                iF = ((int) j$.desugar.sun.nio.fs.g.F(jL, 1000000L)) * 1000;
                jL = jY;
                if (jL <= -31557014167219200L) {
                    j$.time.Instant instant12 = j$.time.Instant.MIN;
                    this.b = instant12;
                    return instant12;
                }
                if (jL >= 31556889864403199L) {
                    j$.time.Instant instant13 = j$.time.Instant.MAX;
                    this.b = instant13;
                    return instant13;
                }
                j$.time.Instant instantOfEpochSecond6 = j$.time.Instant.ofEpochSecond(jL, iF);
                this.b = instantOfEpochSecond6;
                return instantOfEpochSecond6;
            case 7:
                jY = j$.desugar.sun.nio.fs.g.y(jL, 1000000000L);
                iF = (int) j$.desugar.sun.nio.fs.g.F(jL, 1000000000L);
                jL = jY;
                if (jL <= -31557014167219200L) {
                    j$.time.Instant instant14 = j$.time.Instant.MIN;
                    this.b = instant14;
                    return instant14;
                }
                if (jL >= 31556889864403199L) {
                    j$.time.Instant instant15 = j$.time.Instant.MAX;
                    this.b = instant15;
                    return instant15;
                }
                j$.time.Instant instantOfEpochSecond7 = j$.time.Instant.ofEpochSecond(jL, iF);
                this.b = instantOfEpochSecond7;
                return instantOfEpochSecond7;
            default:
                throw new java.lang.AssertionError("Unit not handled");
        }
    }

    public long toMillis() {
        if (java.util.concurrent.TimeUnit.MILLISECONDS != null) {
            return this.a;
        }
        long epochSecond = this.b.getEpochSecond();
        int nano = this.b.getNano();
        long j = epochSecond * 1000;
        if (((java.lang.Math.abs(epochSecond) | 1000) >>> 31) == 0 || j / 1000 == epochSecond) {
            return j + ((long) (nano / 1000000));
        }
        return epochSecond < 0 ? Long.MIN_VALUE : Long.MAX_VALUE;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    public final java.lang.String toString() {
        long epochSecond;
        int nano;
        long jY;
        j$.time.LocalDateTime localDateTimeH;
        int i;
        java.lang.String str = this.c;
        if (str != null) {
            return str;
        }
        if (this.b == null) {
            if (java.util.concurrent.TimeUnit.MILLISECONDS.compareTo(java.util.concurrent.TimeUnit.SECONDS) >= 0) {
                epochSecond = this.a / 1000;
                nano = 0;
            } else {
                epochSecond = r().getEpochSecond();
                nano = r().getNano();
            }
        } else {
            epochSecond = r().getEpochSecond();
            nano = r().getNano();
        }
        if (epochSecond >= -62167219200L) {
            long j = epochSecond - 253402300800L;
            jY = j$.desugar.sun.nio.fs.g.y(j, 315569520000L) + 1;
            localDateTimeH = j$.time.LocalDateTime.H(j$.desugar.sun.nio.fs.g.F(j, 315569520000L) - 62167219200L, nano, j$.time.ZoneOffset.UTC);
            i = localDateTimeH.a.a;
        } else {
            long j2 = epochSecond + 62167219200L;
            jY = j2 / 315569520000L;
            localDateTimeH = j$.time.LocalDateTime.H((j2 % 315569520000L) - 62167219200L, nano, j$.time.ZoneOffset.UTC);
            i = localDateTimeH.a.a;
        }
        int i2 = (((int) jY) * 10000) + i;
        j$.time.LocalDate localDate = localDateTimeH.a;
        j$.time.LocalTime localTime = localDateTimeH.b;
        if (i2 <= 0) {
            i2--;
        }
        int i3 = localTime.d;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(64);
        sb.append(i2 < 0 ? "-" : "");
        int iAbs = java.lang.Math.abs(i2);
        if (iAbs < 10000) {
            h(sb, 1000, java.lang.Math.abs(iAbs));
        } else {
            sb.append(java.lang.String.valueOf(iAbs));
        }
        sb.append('-');
        h(sb, 10, localDate.b);
        sb.append('-');
        h(sb, 10, localDate.getDayOfMonth());
        sb.append('T');
        h(sb, 10, localTime.a);
        sb.append(':');
        h(sb, 10, localTime.b);
        sb.append(':');
        h(sb, 10, localTime.c);
        if (i3 != 0) {
            sb.append('.');
            int i4 = 100000000;
            while (i3 % 10 == 0) {
                i3 /= 10;
                i4 /= 10;
            }
            h(sb, i4, i3);
        }
        sb.append('Z');
        java.lang.String string = sb.toString();
        this.c = string;
        return string;
    }
}
