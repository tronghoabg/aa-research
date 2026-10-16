package j$.time;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final class LocalTime implements j$.time.temporal.Temporal, j$.time.temporal.k, java.lang.Comparable<j$.time.LocalTime>, java.io.Serializable {
    public static final j$.time.LocalTime e;
    public static final j$.time.LocalTime f;
    public static final j$.time.LocalTime g;
    public static final j$.time.LocalTime[] h = new j$.time.LocalTime[24];
    private static final long serialVersionUID = 6414437269572265201L;
    public final byte a;
    public final byte b;
    public final byte c;
    public final int d;

    static {
        int i = 0;
        while (true) {
            j$.time.LocalTime[] localTimeArr = h;
            if (i >= localTimeArr.length) {
                j$.time.LocalTime localTime = localTimeArr[0];
                g = localTime;
                j$.time.LocalTime localTime2 = localTimeArr[12];
                e = localTime;
                f = new j$.time.LocalTime(23, 59, 59, 999999999);
                return;
            }
            localTimeArr[i] = new j$.time.LocalTime(i, 0, 0, 0);
            i++;
        }
    }

    public LocalTime(int i, int i2, int i3, int i4) {
        this.a = (byte) i;
        this.b = (byte) i2;
        this.c = (byte) i3;
        this.d = i4;
    }

    public static j$.time.LocalTime A(j$.time.temporal.TemporalAccessor temporalAccessor) {
        j$.util.Objects.a(temporalAccessor, "temporal");
        j$.time.LocalTime localTime = (j$.time.LocalTime) temporalAccessor.w(j$.time.temporal.n.g);
        if (localTime != null) {
            return localTime;
        }
        j$.time.g.g(j$.time.e.a("Unable to obtain LocalTime from TemporalAccessor: ", java.lang.String.valueOf(temporalAccessor), " of type ", temporalAccessor.getClass().getName()));
        return null;
    }

    public static j$.time.LocalTime H(int i, int i2, int i3, int i4) {
        j$.time.temporal.a.HOUR_OF_DAY.s(i);
        j$.time.temporal.a.MINUTE_OF_HOUR.s(i2);
        j$.time.temporal.a.SECOND_OF_MINUTE.s(i3);
        j$.time.temporal.a.NANO_OF_SECOND.s(i4);
        return s(i, i2, i3, i4);
    }

    public static j$.time.LocalTime I(long j) {
        j$.time.temporal.a.NANO_OF_DAY.s(j);
        int i = (int) (j / 3600000000000L);
        long j2 = j - (((long) i) * 3600000000000L);
        int i2 = (int) (j2 / 60000000000L);
        long j3 = j2 - (((long) i2) * 60000000000L);
        int i3 = (int) (j3 / 1000000000);
        return s(i, i2, i3, (int) (j3 - (((long) i3) * 1000000000)));
    }

    public static j$.time.LocalTime O(java.io.ObjectInput objectInput) throws java.io.IOException {
        int i;
        int i2;
        int i3 = objectInput.readByte();
        int i4 = 0;
        if (i3 < 0) {
            i3 = ~i3;
            i2 = 0;
            i = 0;
        } else {
            byte b = objectInput.readByte();
            if (b < 0) {
                int i5 = ~b;
                i = 0;
                i4 = i5;
                i2 = 0;
            } else {
                byte b2 = objectInput.readByte();
                if (b2 < 0) {
                    i2 = ~b2;
                    i = 0;
                    i4 = b;
                } else {
                    i = objectInput.readInt();
                    i4 = b;
                    i2 = b2;
                }
            }
        }
        return H(i3, i4, i2, i);
    }

    public static j$.time.LocalTime ofSecondOfDay(long j) {
        j$.time.temporal.a.SECOND_OF_DAY.s(j);
        int i = (int) (j / 3600);
        long j2 = j - ((long) (i * 3600));
        int i2 = (int) (j2 / 60);
        return s(i, i2, (int) (j2 - ((long) (i2 * 60))), 0);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    public static j$.time.LocalTime s(int i, int i2, int i3, int i4) {
        return ((i2 | i3) | i4) == 0 ? h[i] : new j$.time.LocalTime(i, i2, i3, i4);
    }

    private java.lang.Object writeReplace() {
        return new j$.time.q((byte) 4, this);
    }

    public final int B(j$.time.temporal.m mVar) {
        int i = j$.time.i.a[((j$.time.temporal.a) mVar).ordinal()];
        byte b = this.b;
        int i2 = this.d;
        byte b2 = this.a;
        switch (i) {
            case 1:
                return i2;
            case 2:
                j$.time.g.e("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
                return 0;
            case 3:
                return i2 / 1000;
            case 4:
                j$.time.g.e("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
                return 0;
            case 5:
                return i2 / 1000000;
            case 6:
                return (int) (P() / 1000000);
            case 7:
                return this.c;
            case 8:
                return toSecondOfDay();
            case 9:
                return b;
            case 10:
                return (b2 * 60) + b;
            case 11:
                return b2 % 12;
            case 12:
                int i3 = b2 % 12;
                if (i3 % 12 == 0) {
                    return 12;
                }
                return i3;
            case 14:
                if (b2 == 0) {
                    return 24;
                }
            case 13:
                return b2;
            case 15:
                return b2 / 12;
            default:
                j$.time.g.e("Unsupported field: ".concat(java.lang.String.valueOf(mVar)));
                return 0;
        }
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long C(j$.time.temporal.m mVar) {
        if (!(mVar instanceof j$.time.temporal.a)) {
            return mVar.l(this);
        }
        if (mVar == j$.time.temporal.a.NANO_OF_DAY) {
            return P();
        }
        return mVar == j$.time.temporal.a.MICRO_OF_DAY ? P() / 1000 : B(mVar);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public final j$.time.LocalTime b(long j, j$.time.temporal.TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof j$.time.temporal.ChronoUnit)) {
            return (j$.time.LocalTime) temporalUnit.k(this, j);
        }
        switch (j$.time.i.b[((j$.time.temporal.ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return M(j);
            case 2:
                return M((j % 86400000000L) * 1000);
            case 3:
                return M((j % 86400000) * 1000000);
            case 4:
                return N(j);
            case 5:
                return L(j);
            case 6:
                return K(j);
            case 7:
                return K((j % 2) * 12);
            default:
                j$.time.g.e("Unsupported unit: ".concat(java.lang.String.valueOf(temporalUnit)));
                return null;
        }
    }

    public final j$.time.LocalTime K(long j) {
        if (j == 0) {
            return this;
        }
        return s(((((int) (j % 24)) + this.a) + 24) % 24, this.b, this.c, this.d);
    }

    public final j$.time.LocalTime L(long j) {
        if (j != 0) {
            int i = (this.a * 60) + this.b;
            int i2 = ((((int) (j % 1440)) + i) + 1440) % 1440;
            if (i != i2) {
                return s(i2 / 60, i2 % 60, this.c, this.d);
            }
        }
        return this;
    }

    public final j$.time.LocalTime M(long j) {
        if (j != 0) {
            long jP = P();
            long j2 = (((j % 86400000000000L) + jP) + 86400000000000L) % 86400000000000L;
            if (jP != j2) {
                return s((int) (j2 / 3600000000000L), (int) ((j2 / 60000000000L) % 60), (int) ((j2 / 1000000000) % 60), (int) (j2 % 1000000000));
            }
        }
        return this;
    }

    public final j$.time.LocalTime N(long j) {
        if (j != 0) {
            int i = (this.b * 60) + (this.a * 3600) + this.c;
            int i2 = ((((int) (j % 86400)) + i) + 86400) % 86400;
            if (i != i2) {
                return s(i2 / 3600, (i2 / 60) % 60, i2 % 60, this.d);
            }
        }
        return this;
    }

    public final long P() {
        return (((long) this.c) * 1000000000) + (((long) this.b) * 60000000000L) + (((long) this.a) * 3600000000000L) + ((long) this.d);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final j$.time.LocalTime a(long j, j$.time.temporal.m mVar) {
        if (!(mVar instanceof j$.time.temporal.a)) {
            return (j$.time.LocalTime) mVar.r(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) mVar;
        aVar.s(j);
        int i = j$.time.i.a[aVar.ordinal()];
        int i2 = this.d;
        byte b = this.c;
        byte b2 = this.b;
        byte b3 = this.a;
        switch (i) {
            case 1:
                return R((int) j);
            case 2:
                return I(j);
            case 3:
                return R(((int) j) * 1000);
            case 4:
                return I(j * 1000);
            case 5:
                return R(((int) j) * 1000000);
            case 6:
                return I(j * 1000000);
            case 7:
                int i3 = (int) j;
                if (b != i3) {
                    j$.time.temporal.a.SECOND_OF_MINUTE.s(i3);
                    return s(b3, b2, i3, i2);
                }
                return this;
            case 8:
                return N(j - ((long) toSecondOfDay()));
            case 9:
                int i4 = (int) j;
                if (b2 != i4) {
                    j$.time.temporal.a.MINUTE_OF_HOUR.s(i4);
                    return s(b3, i4, b, i2);
                }
                return this;
            case 10:
                return L(j - ((long) ((b3 * 60) + b2)));
            case 11:
                return K(j - ((long) (b3 % 12)));
            case 12:
                if (j == 12) {
                    j = 0;
                }
                return K(j - ((long) (b3 % 12)));
            case 13:
                int i5 = (int) j;
                if (b3 != i5) {
                    j$.time.temporal.a.HOUR_OF_DAY.s(i5);
                    return s(i5, b2, b, i2);
                }
                return this;
            case 14:
                if (j == 24) {
                    j = 0;
                }
                int i6 = (int) j;
                if (b3 != i6) {
                    j$.time.temporal.a.HOUR_OF_DAY.s(i6);
                    return s(i6, b2, b, i2);
                }
                return this;
            case 15:
                return K((j - ((long) (b3 / 12))) * 12);
            default:
                j$.time.g.e("Unsupported field: ".concat(java.lang.String.valueOf(mVar)));
                return null;
        }
    }

    public final j$.time.LocalTime R(int i) {
        if (this.d == i) {
            return this;
        }
        j$.time.temporal.a.NANO_OF_SECOND.s(i);
        return s(this.a, this.b, this.c, i);
    }

    public final void S(java.io.DataOutput dataOutput) throws java.io.IOException {
        byte b = this.a;
        byte b2 = this.c;
        byte b3 = this.b;
        int i = this.d;
        if (i != 0) {
            dataOutput.writeByte(b);
            dataOutput.writeByte(b3);
            dataOutput.writeByte(b2);
            dataOutput.writeInt(i);
            return;
        }
        if (b2 != 0) {
            dataOutput.writeByte(b);
            dataOutput.writeByte(b3);
            dataOutput.writeByte(~b2);
        } else if (b3 == 0) {
            dataOutput.writeByte(~b);
        } else {
            dataOutput.writeByte(b);
            dataOutput.writeByte(~b3);
        }
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean d(j$.time.temporal.m mVar) {
        if (mVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) mVar).w();
        }
        return mVar != null && mVar.h(this);
    }

    @Override // j$.time.temporal.Temporal
    public final long e(j$.time.temporal.Temporal temporal, j$.time.temporal.TemporalUnit temporalUnit) {
        j$.time.LocalTime localTimeA = A(temporal);
        if (!(temporalUnit instanceof j$.time.temporal.ChronoUnit)) {
            return temporalUnit.h(this, localTimeA);
        }
        long jP = localTimeA.P() - P();
        switch (j$.time.i.b[((j$.time.temporal.ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return jP;
            case 2:
                return jP / 1000;
            case 3:
                return jP / 1000000;
            case 4:
                return jP / 1000000000;
            case 5:
                return jP / 60000000000L;
            case 6:
                return jP / 3600000000000L;
            case 7:
                return jP / 43200000000000L;
            default:
                j$.time.g.e("Unsupported unit: ".concat(java.lang.String.valueOf(temporalUnit)));
                return 0L;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j$.time.LocalTime) {
            j$.time.LocalTime localTime = (j$.time.LocalTime) obj;
            if (this.a == localTime.a && this.b == localTime.b && this.c == localTime.c && this.d == localTime.d) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int h(j$.time.temporal.m mVar) {
        return mVar instanceof j$.time.temporal.a ? B(mVar) : j$.time.temporal.n.a(this, mVar);
    }

    public final int hashCode() {
        long jP = P();
        return (int) (jP ^ (jP >>> 32));
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: k */
    public final j$.time.temporal.Temporal x(j$.time.LocalDate localDate) {
        localDate.getClass();
        return (j$.time.LocalTime) j$.desugar.sun.nio.fs.g.a(localDate, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p l(j$.time.temporal.m mVar) {
        return j$.time.temporal.n.d(this, mVar);
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.Temporal p(j$.time.temporal.Temporal temporal) {
        return temporal.a(P(), j$.time.temporal.a.NANO_OF_DAY);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final int compareTo(j$.time.LocalTime localTime) {
        int iCompare = java.lang.Integer.compare(this.a, localTime.a);
        return (iCompare == 0 && (iCompare = java.lang.Integer.compare(this.b, localTime.b)) == 0 && (iCompare = java.lang.Integer.compare(this.c, localTime.c)) == 0) ? java.lang.Integer.compare(this.d, localTime.d) : iCompare;
    }

    public int toSecondOfDay() {
        return (this.b * 60) + (this.a * 3600) + this.c;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(18);
        byte b = this.a;
        sb.append(b < 10 ? com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings.DBG_VALUE : "");
        sb.append((int) b);
        byte b2 = this.b;
        sb.append(b2 < 10 ? ":0" : ":");
        sb.append((int) b2);
        byte b3 = this.c;
        int i = this.d;
        if (b3 > 0 || i > 0) {
            sb.append(b3 < 10 ? ":0" : ":");
            sb.append((int) b3);
            if (i > 0) {
                sb.append('.');
                if (i % 1000000 == 0) {
                    sb.append(java.lang.Integer.toString((i / 1000000) + 1000).substring(1));
                } else if (i % 1000 == 0) {
                    sb.append(java.lang.Integer.toString((i / 1000) + 1000000).substring(1));
                } else {
                    sb.append(java.lang.Integer.toString(i + 1000000000).substring(1));
                }
            }
        }
        return sb.toString();
    }

    public j$.time.LocalTime truncatedTo(j$.time.temporal.TemporalUnit temporalUnit) {
        if (temporalUnit == j$.time.temporal.ChronoUnit.NANOS) {
            return this;
        }
        j$.time.Duration duration = temporalUnit.getDuration();
        if (duration.getSeconds() > 86400) {
            j$.time.g.e("Unit is too large to be used for truncation");
            return null;
        }
        long nanos = duration.toNanos();
        if (86400000000000L % nanos == 0) {
            return I((P() / nanos) * nanos);
        }
        j$.time.g.e("Unit must divide into a standard day without remainder");
        return null;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final java.lang.Object w(j$.desugar.sun.nio.fs.n nVar) {
        if (nVar == j$.time.temporal.n.b || nVar == j$.time.temporal.n.a || nVar == j$.time.temporal.n.e || nVar == j$.time.temporal.n.d) {
            return null;
        }
        if (nVar == j$.time.temporal.n.g) {
            return this;
        }
        if (nVar == j$.time.temporal.n.f) {
            return null;
        }
        return nVar == j$.time.temporal.n.c ? j$.time.temporal.ChronoUnit.NANOS : nVar.c(this);
    }

    @Override // j$.time.temporal.Temporal
    public final j$.time.temporal.Temporal y(long j, j$.time.temporal.ChronoUnit chronoUnit) {
        long j2;
        if (j == Long.MIN_VALUE) {
            this = b(Long.MAX_VALUE, chronoUnit);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return this.b(j2, chronoUnit);
    }
}
