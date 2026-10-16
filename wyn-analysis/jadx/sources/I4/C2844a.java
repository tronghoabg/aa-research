package i4;

import p7.AbstractC3772b;

/* renamed from: i4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2844a extends AbstractC3772b {

    /* renamed from: e, reason: collision with root package name */
    public final int f36782e;

    public C2844a(int i5) {
        this.f36782e = i5;
        if (i5 <= 0) {
            throw new IllegalArgumentException("px must be > 0.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2844a) {
            return this.f36782e == ((C2844a) obj).f36782e;
        }
        return false;
    }

    public final int hashCode() {
        return this.f36782e;
    }

    public final String toString() {
        return String.valueOf(this.f36782e);
    }
}
