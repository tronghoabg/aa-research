package la;

import j$.util.Objects;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes4.dex */
public final class s extends o {

    /* renamed from: a, reason: collision with root package name */
    public final Serializable f40209a;

    public s(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f40209a = bool;
    }

    public static boolean g(s sVar) {
        Serializable serializable = sVar.f40209a;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    @Override // la.o
    public final boolean a() {
        Serializable serializable = this.f40209a;
        return serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(c());
    }

    @Override // la.o
    public final String c() {
        Serializable serializable = this.f40209a;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return f().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    public final BigInteger d() {
        Serializable serializable = this.f40209a;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (g(this)) {
            return BigInteger.valueOf(f().longValue());
        }
        String strC = c();
        na.d.d(strC);
        return new BigInteger(strC);
    }

    public final double e() {
        return this.f40209a instanceof Number ? f().doubleValue() : Double.parseDouble(c());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        Serializable serializable = this.f40209a;
        Serializable serializable2 = sVar.f40209a;
        if (serializable == null) {
            return serializable2 == null;
        }
        if (g(this) && g(sVar)) {
            return ((serializable instanceof BigInteger) || (serializable2 instanceof BigInteger)) ? d().equals(sVar.d()) : f().longValue() == sVar.f().longValue();
        }
        if (!(serializable instanceof Number) || !(serializable2 instanceof Number)) {
            return serializable.equals(serializable2);
        }
        if ((serializable instanceof BigDecimal) && (serializable2 instanceof BigDecimal)) {
            return (serializable instanceof BigDecimal ? (BigDecimal) serializable : na.d.j(c())).compareTo(serializable2 instanceof BigDecimal ? (BigDecimal) serializable2 : na.d.j(sVar.c())) == 0;
        }
        double dE = e();
        double dE2 = sVar.e();
        if (dE != dE2) {
            return Double.isNaN(dE) && Double.isNaN(dE2);
        }
        return true;
    }

    public final Number f() {
        Serializable serializable = this.f40209a;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new na.h((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        Serializable serializable = this.f40209a;
        if (serializable == null) {
            return 31;
        }
        if (g(this)) {
            jDoubleToLongBits = f().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(f().doubleValue());
        }
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public s(Number number) {
        Objects.requireNonNull(number);
        this.f40209a = number;
    }

    public s(String str) {
        Objects.requireNonNull(str);
        this.f40209a = str;
    }
}
