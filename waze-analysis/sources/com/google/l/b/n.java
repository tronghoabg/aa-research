package com.google.l.b;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.math.BigDecimal;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class n extends Number {

    /* renamed from: a, reason: collision with root package name */
    private final String f12383a;

    public n(String str) {
        this.f12383a = str;
    }

    private final BigDecimal a() {
        return ac.g(this.f12383a);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() {
        return a();
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f12383a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            return this.f12383a.equals(((n) obj).f12383a);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f12383a);
    }

    public final int hashCode() {
        return this.f12383a.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        try {
            try {
                return Integer.parseInt(this.f12383a);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.f12383a);
            }
        } catch (NumberFormatException unused2) {
            return this.a().intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        try {
            return Long.parseLong(this.f12383a);
        } catch (NumberFormatException unused) {
            return a().longValue();
        }
    }

    public final String toString() {
        return this.f12383a;
    }
}
