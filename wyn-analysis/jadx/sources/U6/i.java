package u6;

import N1.C0762k;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Object f46678a;

    /* renamed from: b, reason: collision with root package name */
    public C0762k f46679b = new C0762k(1);

    /* renamed from: c, reason: collision with root package name */
    public boolean f46680c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f46681d;

    public i(Object obj) {
        this.f46678a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        return this.f46678a.equals(((i) obj).f46678a);
    }

    public final int hashCode() {
        return this.f46678a.hashCode();
    }
}
