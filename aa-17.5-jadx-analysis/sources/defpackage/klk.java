package defpackage;

@afdo
/* loaded from: classes2.dex */
public final class klk implements kll {
    private final int a;

    @Override // defpackage.kll
    public final int a() {
        return this.a;
    }

    @Override // defpackage.kll
    public final int b() {
        return 4;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof klk) && this.a == ((klk) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "CarAreaDoorValue(areaIdValue=" + this.a + ")";
    }
}
