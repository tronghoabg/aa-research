package U8;

/* loaded from: classes4.dex */
public final class Q extends L0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f12461a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12462b;

    /* renamed from: c, reason: collision with root package name */
    public final S f12463c;

    /* renamed from: d, reason: collision with root package name */
    public final C0863d0 f12464d;

    /* renamed from: e, reason: collision with root package name */
    public final C0865e0 f12465e;

    /* renamed from: f, reason: collision with root package name */
    public final C0873i0 f12466f;

    public Q(long j8, String str, S s10, C0863d0 c0863d0, C0865e0 c0865e0, C0873i0 c0873i0) {
        this.f12461a = j8;
        this.f12462b = str;
        this.f12463c = s10;
        this.f12464d = c0863d0;
        this.f12465e = c0865e0;
        this.f12466f = c0873i0;
    }

    public final P a() {
        P p10 = new P();
        p10.f12453a = this.f12461a;
        p10.f12454b = this.f12462b;
        p10.f12455c = this.f12463c;
        p10.f12456d = this.f12464d;
        p10.f12457e = this.f12465e;
        p10.f12458f = this.f12466f;
        p10.f12459g = (byte) 1;
        return p10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof L0)) {
            return false;
        }
        Q q4 = (Q) ((L0) obj);
        if (this.f12461a != q4.f12461a) {
            return false;
        }
        if (!this.f12462b.equals(q4.f12462b) || !this.f12463c.equals(q4.f12463c) || !this.f12464d.equals(q4.f12464d)) {
            return false;
        }
        C0865e0 c0865e0 = q4.f12465e;
        C0865e0 c0865e02 = this.f12465e;
        if (c0865e02 == null) {
            if (c0865e0 != null) {
                return false;
            }
        } else if (!c0865e02.equals(c0865e0)) {
            return false;
        }
        C0873i0 c0873i0 = q4.f12466f;
        C0873i0 c0873i02 = this.f12466f;
        return c0873i02 == null ? c0873i0 == null : c0873i02.equals(c0873i0);
    }

    public final int hashCode() {
        long j8 = this.f12461a;
        int iHashCode = (((((((((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003) ^ this.f12462b.hashCode()) * 1000003) ^ this.f12463c.hashCode()) * 1000003) ^ this.f12464d.hashCode()) * 1000003;
        C0865e0 c0865e0 = this.f12465e;
        int iHashCode2 = (iHashCode ^ (c0865e0 == null ? 0 : c0865e0.hashCode())) * 1000003;
        C0873i0 c0873i0 = this.f12466f;
        return iHashCode2 ^ (c0873i0 != null ? c0873i0.hashCode() : 0);
    }

    public final String toString() {
        return "Event{timestamp=" + this.f12461a + ", type=" + this.f12462b + ", app=" + this.f12463c + ", device=" + this.f12464d + ", log=" + this.f12465e + ", rollouts=" + this.f12466f + "}";
    }
}
