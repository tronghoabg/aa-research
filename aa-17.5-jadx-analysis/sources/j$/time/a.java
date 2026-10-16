package j$.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class a extends Clock implements Serializable {
    public static final a c;
    private static final long serialVersionUID = 6740630888130243051L;
    public final ZoneId b;

    static {
        System.currentTimeMillis();
        c = new a(ZoneOffset.UTC);
    }

    public a(ZoneId zoneId) {
        this.b = zoneId;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
    }

    @Override // j$.time.Clock
    public final ZoneId a() {
        return this.b;
    }

    @Override // j$.time.Clock
    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return this.b.equals(((a) obj).b);
    }

    @Override // j$.time.Clock
    public final int hashCode() {
        return this.b.hashCode() + 1;
    }

    @Override // j$.time.Clock
    public final Instant instant() {
        return Instant.ofEpochMilli(System.currentTimeMillis());
    }

    public final String toString() {
        return "SystemClock[" + String.valueOf(this.b) + "]";
    }
}
