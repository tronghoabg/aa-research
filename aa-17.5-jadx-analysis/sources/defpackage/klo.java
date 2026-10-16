package defpackage;

@afdo
/* loaded from: classes2.dex */
public final class klo implements kll {
    private final int a;

    @Override // defpackage.kll
    public final int a() {
        return this.a;
    }

    @Override // defpackage.kll
    public final int b() {
        return 6;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof klo) && this.a == ((klo) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "CarAreaWheelValue(areaIdValue=" + this.a + ")";
    }
}
