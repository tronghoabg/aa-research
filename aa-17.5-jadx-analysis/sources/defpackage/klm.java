package defpackage;

@afdo
/* loaded from: classes2.dex */
public final class klm implements kll {
    private final int a;

    @Override // defpackage.kll
    public final int a() {
        return this.a;
    }

    @Override // defpackage.kll
    public final int b() {
        return 5;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof klm) && this.a == ((klm) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "CarAreaMirrorValue(areaIdValue=" + this.a + ")";
    }
}
