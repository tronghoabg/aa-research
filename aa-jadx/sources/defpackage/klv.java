package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.afeo
public final class klv implements defpackage.kls {
    private final int a;

    @Override // defpackage.kls
    public final int a() {
        return this.a;
    }

    @Override // defpackage.kls
    public final int b() {
        return 6;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.klv) && this.a == ((defpackage.klv) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        return "CarAreaWheelValue(areaIdValue=" + this.a + ")";
    }
}
