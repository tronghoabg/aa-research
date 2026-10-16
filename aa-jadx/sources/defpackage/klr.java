package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.afeo
public final class klr implements defpackage.kls {
    private final int a;

    @Override // defpackage.kls
    public final int a() {
        return this.a;
    }

    @Override // defpackage.kls
    public final int b() {
        return 4;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.klr) && this.a == ((defpackage.klr) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        return "CarAreaDoorValue(areaIdValue=" + this.a + ")";
    }
}
