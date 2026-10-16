package z;

import A.InterfaceC0227u;

/* renamed from: z.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4600e {

    /* renamed from: a, reason: collision with root package name */
    public final Z.d f48215a;

    /* renamed from: b, reason: collision with root package name */
    public final tf.l f48216b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0227u f48217c;

    public C4600e(Z.d dVar, tf.l lVar, InterfaceC0227u interfaceC0227u) {
        this.f48215a = dVar;
        this.f48216b = lVar;
        this.f48217c = interfaceC0227u;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4600e)) {
            return false;
        }
        C4600e c4600e = (C4600e) obj;
        return this.f48215a.equals(c4600e.f48215a) && this.f48216b.equals(c4600e.f48216b) && this.f48217c.equals(c4600e.f48217c);
    }

    public final int hashCode() {
        return ((this.f48217c.hashCode() + ((this.f48216b.hashCode() + (this.f48215a.hashCode() * 31)) * 31)) * 31) + 1;
    }

    public final String toString() {
        return "ChangeSize(alignment=" + this.f48215a + ", size=" + this.f48216b + ", animationSpec=" + this.f48217c + ", clip=true)";
    }
}
