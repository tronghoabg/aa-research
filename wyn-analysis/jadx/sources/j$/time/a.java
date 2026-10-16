package j$.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
final class a extends b implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    static final a f37496b;
    private static final long serialVersionUID = 6740630888130243051L;

    /* renamed from: a, reason: collision with root package name */
    private final ZoneId f37497a;

    a(ZoneId zoneId) {
        this.f37497a = zoneId;
    }

    static {
        System.currentTimeMillis();
        f37496b = new a(ZoneOffset.UTC);
    }

    @Override // j$.time.b
    public final ZoneId a() {
        return this.f37497a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return this.f37497a.equals(((a) obj).f37497a);
    }

    public final int hashCode() {
        return this.f37497a.hashCode() + 1;
    }

    public final String toString() {
        return "SystemClock[" + this.f37497a + "]";
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
    }
}
