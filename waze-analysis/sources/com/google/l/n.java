package com.google.l;

import com.google.l.b.ac;
import j$.util.Objects;
import java.math.BigDecimal;
import java.math.BigInteger;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class n extends i {

    /* renamed from: a, reason: collision with root package name */
    private final Object f12461a;

    public n(Boolean bool) {
        this.f12461a = Objects.requireNonNull(bool);
    }

    private static boolean m(n nVar) {
        Object obj = nVar.f12461a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    @Override // com.google.l.i
    public final int a() {
        return k() ? d().intValue() : Integer.parseInt(c());
    }

    public final double b() {
        return k() ? d().doubleValue() : Double.parseDouble(c());
    }

    @Override // com.google.l.i
    public final String c() {
        Object obj = this.f12461a;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (k()) {
            return d().toString();
        }
        if (j()) {
            return ((Boolean) obj).toString();
        }
        throw new AssertionError("Unexpected value type: ".concat(String.valueOf(String.valueOf(obj.getClass()))));
    }

    public final Number d() {
        Object obj = this.f12461a;
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            return new com.google.l.b.n((String) obj);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        Object obj2 = this.f12461a;
        if (obj2 == null) {
            return nVar.f12461a == null;
        }
        if (m(this) && m(nVar)) {
            return ((obj2 instanceof BigInteger) || (nVar.f12461a instanceof BigInteger)) ? h().equals(nVar.h()) : d().longValue() == nVar.d().longValue();
        }
        if (obj2 instanceof Number) {
            Object obj3 = nVar.f12461a;
            if (obj3 instanceof Number) {
                if ((obj2 instanceof BigDecimal) && (obj3 instanceof BigDecimal)) {
                    return g().compareTo(nVar.g()) == 0;
                }
                double dB = b();
                double dB2 = nVar.b();
                if (dB != dB2) {
                    return Double.isNaN(dB) && Double.isNaN(dB2);
                }
                return true;
            }
        }
        return obj2.equals(nVar.f12461a);
    }

    public final BigDecimal g() {
        Object obj = this.f12461a;
        return obj instanceof BigDecimal ? (BigDecimal) obj : ac.g(c());
    }

    public final BigInteger h() {
        Object obj = this.f12461a;
        return obj instanceof BigInteger ? (BigInteger) obj : m(this) ? BigInteger.valueOf(d().longValue()) : ac.h(c());
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        Object obj = this.f12461a;
        if (obj == null) {
            return 31;
        }
        if (m(this)) {
            jDoubleToLongBits = d().longValue();
        } else {
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(d().doubleValue());
        }
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public final boolean i() {
        return j() ? ((Boolean) this.f12461a).booleanValue() : Boolean.parseBoolean(c());
    }

    public final boolean j() {
        return this.f12461a instanceof Boolean;
    }

    public final boolean k() {
        return this.f12461a instanceof Number;
    }

    public final boolean l() {
        return this.f12461a instanceof String;
    }

    public n(Number number) {
        this.f12461a = Objects.requireNonNull(number);
    }

    public n(String str) {
        this.f12461a = Objects.requireNonNull(str);
    }
}
