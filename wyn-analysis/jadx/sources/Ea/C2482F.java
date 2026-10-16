package ea;

/* renamed from: ea.F, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2482F {

    /* renamed from: a, reason: collision with root package name */
    public final N f34458a;

    /* renamed from: b, reason: collision with root package name */
    public final C2487b f34459b;

    public C2482F(N n10, C2487b c2487b) {
        this.f34458a = n10;
        this.f34459b = c2487b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2482F)) {
            return false;
        }
        C2482F c2482f = (C2482F) obj;
        c2482f.getClass();
        return this.f34458a.equals(c2482f.f34458a) && this.f34459b.equals(c2482f.f34459b);
    }

    public final int hashCode() {
        return this.f34459b.hashCode() + ((this.f34458a.hashCode() + (EnumC2496k.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + EnumC2496k.SESSION_START + ", sessionData=" + this.f34458a + ", applicationInfo=" + this.f34459b + ')';
    }
}
