package na;

/* loaded from: classes4.dex */
public final class h extends Number {

    /* renamed from: a, reason: collision with root package name */
    public final String f40972a;

    public h(String str) {
        this.f40972a = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f40972a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            return this.f40972a.equals(((h) obj).f40972a);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f40972a);
    }

    public final int hashCode() {
        return this.f40972a.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f40972a;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(str);
            }
        } catch (NumberFormatException unused2) {
            return d.j(str).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f40972a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return d.j(str).longValue();
        }
    }

    public final String toString() {
        return this.f40972a;
    }
}
