package defpackage;

@afdo
/* loaded from: classes2.dex */
public final class klr {
    public final int a;

    public /* synthetic */ klr(int i) {
        this.a = i;
    }

    public static String a(int i) {
        return a.bn(i, "CarPropertyTypeId(value=", ")");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof klr) && this.a == ((klr) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return a(this.a);
    }
}
