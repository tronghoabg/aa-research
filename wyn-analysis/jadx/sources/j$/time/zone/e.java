package j$.time.zone;

import j$.time.DayOfWeek;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.chrono.t;
import j$.time.k;
import j$.time.m;
import j$.time.temporal.n;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes2.dex */
public final class e implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;

    /* renamed from: a, reason: collision with root package name */
    private final m f37719a;

    /* renamed from: b, reason: collision with root package name */
    private final byte f37720b;

    /* renamed from: c, reason: collision with root package name */
    private final DayOfWeek f37721c;

    /* renamed from: d, reason: collision with root package name */
    private final k f37722d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f37723e;

    /* renamed from: f, reason: collision with root package name */
    private final d f37724f;

    /* renamed from: g, reason: collision with root package name */
    private final ZoneOffset f37725g;

    /* renamed from: h, reason: collision with root package name */
    private final ZoneOffset f37726h;

    /* renamed from: i, reason: collision with root package name */
    private final ZoneOffset f37727i;

    e(m mVar, int i5, DayOfWeek dayOfWeek, k kVar, boolean z2, d dVar, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, ZoneOffset zoneOffset3) {
        this.f37719a = mVar;
        this.f37720b = (byte) i5;
        this.f37721c = dayOfWeek;
        this.f37722d = kVar;
        this.f37723e = z2;
        this.f37724f = dVar;
        this.f37725g = zoneOffset;
        this.f37726h = zoneOffset2;
        this.f37727i = zoneOffset3;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 3, this);
    }

    final void writeExternal(ObjectOutput objectOutput) {
        k kVar = this.f37722d;
        boolean z2 = this.f37723e;
        int iK0 = z2 ? 86400 : kVar.k0();
        int iZ = this.f37725g.Z();
        ZoneOffset zoneOffset = this.f37726h;
        int iZ2 = zoneOffset.Z() - iZ;
        ZoneOffset zoneOffset2 = this.f37727i;
        int iZ3 = zoneOffset2.Z() - iZ;
        int iV = iK0 % 3600 == 0 ? z2 ? 24 : kVar.V() : 31;
        int i5 = iZ % 900 == 0 ? (iZ / 900) + 128 : 255;
        int i10 = (iZ2 == 0 || iZ2 == 1800 || iZ2 == 3600) ? iZ2 / 1800 : 3;
        int i11 = (iZ3 == 0 || iZ3 == 1800 || iZ3 == 3600) ? iZ3 / 1800 : 3;
        DayOfWeek dayOfWeek = this.f37721c;
        objectOutput.writeInt((this.f37719a.getValue() << 28) + ((this.f37720b + 32) << 22) + ((dayOfWeek == null ? 0 : dayOfWeek.getValue()) << 19) + (iV << 14) + (this.f37724f.ordinal() << 12) + (i5 << 4) + (i10 << 2) + i11);
        if (iV == 31) {
            objectOutput.writeInt(iK0);
        }
        if (i5 == 255) {
            objectOutput.writeInt(iZ);
        }
        if (i10 == 3) {
            objectOutput.writeInt(zoneOffset.Z());
        }
        if (i11 == 3) {
            objectOutput.writeInt(zoneOffset2.Z());
        }
    }

    static e b(ObjectInput objectInput) {
        int i5 = objectInput.readInt();
        m mVarU = m.U(i5 >>> 28);
        int i10 = ((264241152 & i5) >>> 22) - 32;
        int i11 = (3670016 & i5) >>> 19;
        DayOfWeek dayOfWeekR = i11 == 0 ? null : DayOfWeek.R(i11);
        int i12 = (507904 & i5) >>> 14;
        d dVar = d.values()[(i5 & 12288) >>> 12];
        int i13 = (i5 & 4080) >>> 4;
        int i14 = (i5 & 12) >>> 2;
        int i15 = i5 & 3;
        k kVarC0 = i12 == 31 ? k.c0(objectInput.readInt()) : k.Z(i12 % 24);
        ZoneOffset zoneOffsetC0 = ZoneOffset.c0(i13 == 255 ? objectInput.readInt() : (i13 - 128) * 900);
        ZoneOffset zoneOffsetC02 = ZoneOffset.c0(i14 == 3 ? objectInput.readInt() : (i14 * 1800) + zoneOffsetC0.Z());
        ZoneOffset zoneOffsetC03 = i15 == 3 ? ZoneOffset.c0(objectInput.readInt()) : ZoneOffset.c0((i15 * 1800) + zoneOffsetC0.Z());
        boolean z2 = i12 == 24;
        Objects.requireNonNull(mVarU, "month");
        Objects.requireNonNull(kVarC0, "time");
        Objects.requireNonNull(dVar, "timeDefnition");
        Objects.requireNonNull(zoneOffsetC0, "standardOffset");
        Objects.requireNonNull(zoneOffsetC02, "offsetBefore");
        Objects.requireNonNull(zoneOffsetC03, "offsetAfter");
        if (i10 < -28 || i10 > 31 || i10 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if (z2 && !kVarC0.equals(k.f37642g)) {
            throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
        }
        if (kVarC0.X() != 0) {
            throw new IllegalArgumentException("Time's nano-of-second must be zero");
        }
        return new e(mVarU, i10, dayOfWeekR, kVarC0, z2, dVar, zoneOffsetC0, zoneOffsetC02, zoneOffsetC03);
    }

    public final b a(int i5) {
        j$.time.g gVarH0;
        DayOfWeek dayOfWeek = this.f37721c;
        m mVar = this.f37719a;
        byte b5 = this.f37720b;
        if (b5 < 0) {
            t.f37543d.getClass();
            gVarH0 = j$.time.g.h0(i5, mVar, mVar.S(t.S(i5)) + 1 + b5);
            if (dayOfWeek != null) {
                gVarH0 = gVarH0.l(new n(dayOfWeek.getValue(), 1));
            }
        } else {
            gVarH0 = j$.time.g.h0(i5, mVar, b5);
            if (dayOfWeek != null) {
                gVarH0 = gVarH0.l(new n(dayOfWeek.getValue(), 0));
            }
        }
        if (this.f37723e) {
            gVarH0 = gVarH0.l0(1L);
        }
        LocalDateTime localDateTimeF0 = LocalDateTime.f0(gVarH0, this.f37722d);
        d dVar = this.f37724f;
        dVar.getClass();
        int i10 = c.f37717a[dVar.ordinal()];
        ZoneOffset zoneOffset = this.f37726h;
        if (i10 == 1) {
            localDateTimeF0 = localDateTimeF0.i0(zoneOffset.Z() - ZoneOffset.UTC.Z());
        } else if (i10 == 2) {
            localDateTimeF0 = localDateTimeF0.i0(zoneOffset.Z() - this.f37725g.Z());
        }
        return new b(localDateTimeF0, zoneOffset, this.f37727i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f37719a == eVar.f37719a && this.f37720b == eVar.f37720b && this.f37721c == eVar.f37721c && this.f37724f == eVar.f37724f && this.f37722d.equals(eVar.f37722d) && this.f37723e == eVar.f37723e && this.f37725g.equals(eVar.f37725g) && this.f37726h.equals(eVar.f37726h) && this.f37727i.equals(eVar.f37727i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iK0 = ((this.f37722d.k0() + (this.f37723e ? 1 : 0)) << 15) + (this.f37719a.ordinal() << 11) + ((this.f37720b + 32) << 5);
        DayOfWeek dayOfWeek = this.f37721c;
        return ((this.f37725g.hashCode() ^ (this.f37724f.ordinal() + (iK0 + ((dayOfWeek == null ? 7 : dayOfWeek.ordinal()) << 2)))) ^ this.f37726h.hashCode()) ^ this.f37727i.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TransitionRule[");
        ZoneOffset zoneOffset = this.f37726h;
        ZoneOffset zoneOffset2 = this.f37727i;
        sb2.append(zoneOffset.compareTo(zoneOffset2) > 0 ? "Gap " : "Overlap ");
        sb2.append(zoneOffset);
        sb2.append(" to ");
        sb2.append(zoneOffset2);
        sb2.append(", ");
        m mVar = this.f37719a;
        byte b5 = this.f37720b;
        DayOfWeek dayOfWeek = this.f37721c;
        if (dayOfWeek == null) {
            sb2.append(mVar.name());
            sb2.append(' ');
            sb2.append((int) b5);
        } else if (b5 == -1) {
            sb2.append(dayOfWeek.name());
            sb2.append(" on or before last day of ");
            sb2.append(mVar.name());
        } else if (b5 < 0) {
            sb2.append(dayOfWeek.name());
            sb2.append(" on or before last day minus ");
            sb2.append((-b5) - 1);
            sb2.append(" of ");
            sb2.append(mVar.name());
        } else {
            sb2.append(dayOfWeek.name());
            sb2.append(" on or after ");
            sb2.append(mVar.name());
            sb2.append(' ');
            sb2.append((int) b5);
        }
        sb2.append(" at ");
        sb2.append(this.f37723e ? "24:00" : this.f37722d.toString());
        sb2.append(StringUtils.SPACE);
        sb2.append(this.f37724f);
        sb2.append(", standard offset ");
        sb2.append(this.f37725g);
        sb2.append(']');
        return sb2.toString();
    }
}
