package j$.time.zone;

import j$.time.Duration;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.chrono.AbstractC2901i;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class b implements Comparable, Serializable {
    private static final long serialVersionUID = -6946044323557704546L;

    /* renamed from: a, reason: collision with root package name */
    private final long f37713a;

    /* renamed from: b, reason: collision with root package name */
    private final LocalDateTime f37714b;

    /* renamed from: c, reason: collision with root package name */
    private final ZoneOffset f37715c;

    /* renamed from: d, reason: collision with root package name */
    private final ZoneOffset f37716d;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f37713a, ((b) obj).f37713a);
    }

    b(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        localDateTime.getClass();
        this.f37713a = AbstractC2901i.o(localDateTime, zoneOffset);
        this.f37714b = localDateTime;
        this.f37715c = zoneOffset;
        this.f37716d = zoneOffset2;
    }

    b(long j8, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.f37713a = j8;
        this.f37714b = LocalDateTime.g0(j8, 0, zoneOffset);
        this.f37715c = zoneOffset;
        this.f37716d = zoneOffset2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 2, this);
    }

    final void writeExternal(ObjectOutput objectOutput) {
        a.c(this.f37713a, objectOutput);
        a.d(this.f37715c, objectOutput);
        a.d(this.f37716d, objectOutput);
    }

    public final long Q() {
        return this.f37713a;
    }

    public final LocalDateTime q() {
        return this.f37714b;
    }

    public final ZoneOffset w() {
        return this.f37715c;
    }

    public final ZoneOffset t() {
        return this.f37716d;
    }

    public final LocalDateTime o() {
        return this.f37714b.i0(this.f37716d.Z() - this.f37715c.Z());
    }

    public final Duration s() {
        return Duration.w(this.f37716d.Z() - this.f37715c.Z());
    }

    public final boolean D() {
        return this.f37716d.Z() > this.f37715c.Z();
    }

    final List B() {
        return D() ? Collections.EMPTY_LIST : j$.time.b.d(new Object[]{this.f37715c, this.f37716d});
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f37713a == bVar.f37713a && this.f37715c.equals(bVar.f37715c) && this.f37716d.equals(bVar.f37716d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f37714b.hashCode() ^ this.f37715c.hashCode()) ^ Integer.rotateLeft(this.f37716d.hashCode(), 16);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Transition[");
        sb2.append(D() ? "Gap" : "Overlap");
        sb2.append(" at ");
        sb2.append(this.f37714b);
        sb2.append(this.f37715c);
        sb2.append(" to ");
        sb2.append(this.f37716d);
        sb2.append(']');
        return sb2.toString();
    }
}
