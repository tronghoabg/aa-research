package j$.time.zone;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class b implements Comparable, Serializable {
    private static final long serialVersionUID = -6946044323557704546L;

    /* renamed from: a, reason: collision with root package name */
    public final long f50099a;

    /* renamed from: b, reason: collision with root package name */
    public final LocalDateTime f50100b;

    /* renamed from: c, reason: collision with root package name */
    public final ZoneOffset f50101c;

    /* renamed from: d, reason: collision with root package name */
    public final ZoneOffset f50102d;

    public b(long j2, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.f50099a = j2;
        this.f50100b = LocalDateTime.O(j2, 0, zoneOffset);
        this.f50101c = zoneOffset;
        this.f50102d = zoneOffset2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 2, this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f50099a, ((b) obj).f50099a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f50099a == bVar.f50099a && this.f50101c.equals(bVar.f50101c) && this.f50102d.equals(bVar.f50102d)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return this.f50102d.getTotalSeconds() > this.f50101c.getTotalSeconds();
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.f50102d.f49827b, 16) ^ (this.f50100b.hashCode() ^ this.f50101c.f49827b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Transition[");
        sb.append(f() ? "Gap" : "Overlap");
        sb.append(" at ");
        sb.append(this.f50100b);
        sb.append(this.f50101c);
        sb.append(" to ");
        sb.append(this.f50102d);
        sb.append(']');
        return sb.toString();
    }

    public b(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.f50099a = localDateTime.toEpochSecond(zoneOffset);
        this.f50100b = localDateTime;
        this.f50101c = zoneOffset;
        this.f50102d = zoneOffset2;
    }
}
