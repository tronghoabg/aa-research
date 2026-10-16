package defpackage;

@afdo
/* loaded from: classes.dex */
public final class cpk {
    public final int a;

    public final boolean equals(Object obj) {
        return (obj instanceof cpk) && this.a == ((cpk) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "IndirectPointerEventPrimaryDirectionalMotionAxis(value=" + this.a + ")";
    }
}
