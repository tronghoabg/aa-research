package defpackage;

/* loaded from: classes2.dex */
public final class klq {
    public final int a;
    public final kll b;

    public klq(int i, kll kllVar) {
        kllVar.getClass();
        this.a = i;
        this.b = kllVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof klq)) {
            return false;
        }
        klq klqVar = (klq) obj;
        return a.Y(this.a, klqVar.a) && affa.f(this.b, klqVar.b);
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "CarPropertyId(typeId=" + klr.a(this.a) + ", areaId=" + this.b + ")";
    }
}
