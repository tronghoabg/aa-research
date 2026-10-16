package defpackage;

/* loaded from: classes2.dex */
public final class hje {
    public final hjd a;

    public /* synthetic */ hje(byte[] bArr) {
        this.a = new hjd(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hje) && affa.f(this.a, ((hje) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TemplateShapes(corner=" + this.a + ")";
    }

    public hje() {
        this(null);
    }
}
