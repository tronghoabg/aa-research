package defpackage;

@afdo
/* loaded from: classes2.dex */
public final class klp implements kll {
    public final int a;

    public /* synthetic */ klp(int i) {
        this.a = i;
    }

    public static String c(int i) {
        return a.bn(i, "CarAreaWindowValue(areaIdValue=", ")");
    }

    @Override // defpackage.kll
    public final int a() {
        return this.a;
    }

    @Override // defpackage.kll
    public final int b() {
        return 2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof klp) && this.a == ((klp) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return c(this.a);
    }
}
