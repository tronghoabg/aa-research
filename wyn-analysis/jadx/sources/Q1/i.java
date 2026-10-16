package Q1;

import N1.C0762k;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Object f9675a;

    /* renamed from: b, reason: collision with root package name */
    public C0762k f9676b = new C0762k(0);

    /* renamed from: c, reason: collision with root package name */
    public boolean f9677c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9678d;

    public i(Object obj) {
        this.f9675a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        return this.f9675a.equals(((i) obj).f9675a);
    }

    public final int hashCode() {
        return this.f9675a.hashCode();
    }
}
