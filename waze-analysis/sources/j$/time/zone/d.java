package j$.time.zone;

import androidx.compose.foundation.style.StylePropertiesKt;
import androidx.work.WorkInfo;
import com.waze.strings.DisplayStrings;
import j$.time.DayOfWeek;
import j$.time.LocalTime;
import j$.time.Month;
import j$.time.ZoneOffset;
import j$.util.Objects;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class d implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;

    /* renamed from: a, reason: collision with root package name */
    public final Month f50104a;

    /* renamed from: b, reason: collision with root package name */
    public final byte f50105b;

    /* renamed from: c, reason: collision with root package name */
    public final DayOfWeek f50106c;

    /* renamed from: d, reason: collision with root package name */
    public final LocalTime f50107d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f50108e;

    /* renamed from: f, reason: collision with root package name */
    public final c f50109f;

    /* renamed from: g, reason: collision with root package name */
    public final ZoneOffset f50110g;

    /* renamed from: h, reason: collision with root package name */
    public final ZoneOffset f50111h;

    /* renamed from: i, reason: collision with root package name */
    public final ZoneOffset f50112i;

    public d(Month month, int i2, DayOfWeek dayOfWeek, LocalTime localTime, boolean z, c cVar, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, ZoneOffset zoneOffset3) {
        this.f50104a = month;
        this.f50105b = (byte) i2;
        this.f50106c = dayOfWeek;
        this.f50107d = localTime;
        this.f50108e = z;
        this.f50109f = cVar;
        this.f50110g = zoneOffset;
        this.f50111h = zoneOffset2;
        this.f50112i = zoneOffset3;
    }

    public static d a(ObjectInput objectInput) throws IOException {
        LocalTime localTimeOfSecondOfDay;
        int i2 = objectInput.readInt();
        Month monthN = Month.N(i2 >>> 28);
        int i3 = ((264241152 & i2) >>> 22) - 32;
        int i4 = (3670016 & i2) >>> 19;
        DayOfWeek dayOfWeekB = i4 == 0 ? null : DayOfWeek.B(i4);
        int i5 = (507904 & i2) >>> 14;
        c cVar = c.values()[(i2 & 12288) >>> 12];
        int i6 = (i2 & 4080) >>> 4;
        int i7 = (i2 & 12) >>> 2;
        int i8 = i2 & 3;
        if (i5 == 31) {
            localTimeOfSecondOfDay = LocalTime.ofSecondOfDay(objectInput.readInt());
        } else {
            int i9 = i5 % 24;
            LocalTime localTime = LocalTime.f49807e;
            j$.time.temporal.a.HOUR_OF_DAY.z(i9);
            localTimeOfSecondOfDay = LocalTime.f49809g[i9];
        }
        ZoneOffset zoneOffsetS = ZoneOffset.S(i6 == 255 ? objectInput.readInt() : (i6 + WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) * 900);
        ZoneOffset zoneOffsetS2 = ZoneOffset.S(i7 == 3 ? objectInput.readInt() : (i7 * DisplayStrings.DS_BEACONS_GO_TO_SETTINGS_FOR_PERMISSIONS_BUTTON2) + zoneOffsetS.getTotalSeconds());
        ZoneOffset zoneOffsetS3 = i8 == 3 ? ZoneOffset.S(objectInput.readInt()) : ZoneOffset.S((i8 * DisplayStrings.DS_BEACONS_GO_TO_SETTINGS_FOR_PERMISSIONS_BUTTON2) + zoneOffsetS.getTotalSeconds());
        boolean z = i5 == 24;
        Objects.requireNonNull(monthN, "month");
        Objects.requireNonNull(localTimeOfSecondOfDay, "time");
        Objects.requireNonNull(cVar, "timeDefnition");
        Objects.requireNonNull(zoneOffsetS, "standardOffset");
        Objects.requireNonNull(zoneOffsetS2, "offsetBefore");
        Objects.requireNonNull(zoneOffsetS3, "offsetAfter");
        if (i3 < -28 || i3 > 31 || i3 == 0) {
            j$.time.f.b("Day of month indicator must be between -28 and 31 inclusive excluding zero");
            return null;
        }
        if (z && !localTimeOfSecondOfDay.equals(LocalTime.MIDNIGHT)) {
            j$.time.f.b("Time must be midnight when end of day flag is true");
            return null;
        }
        if (localTimeOfSecondOfDay.f49813d == 0) {
            return new d(monthN, i3, dayOfWeekB, localTimeOfSecondOfDay, z, cVar, zoneOffsetS, zoneOffsetS2, zoneOffsetS3);
        }
        j$.time.f.b("Time's nano-of-second must be zero");
        return null;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 3, this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f50104a == dVar.f50104a && this.f50105b == dVar.f50105b && this.f50106c == dVar.f50106c && this.f50109f == dVar.f50109f && this.f50107d.equals(dVar.f50107d) && this.f50108e == dVar.f50108e && this.f50110g.equals(dVar.f50110g) && this.f50111h.equals(dVar.f50111h) && this.f50112i.equals(dVar.f50112i);
    }

    public final int hashCode() {
        int secondOfDay = ((this.f50107d.toSecondOfDay() + (this.f50108e ? 1 : 0)) << 15) + (this.f50104a.ordinal() << 11) + ((this.f50105b + StylePropertiesKt.ZIndexId) << 5);
        DayOfWeek dayOfWeek = this.f50106c;
        return this.f50112i.f49827b ^ ((this.f50110g.f49827b ^ (this.f50109f.ordinal() + (secondOfDay + ((dayOfWeek == null ? 7 : dayOfWeek.ordinal()) << 2)))) ^ this.f50111h.f49827b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransitionRule[");
        ZoneOffset zoneOffset = this.f50112i;
        int i2 = zoneOffset.f49827b;
        ZoneOffset zoneOffset2 = this.f50111h;
        sb.append(i2 - zoneOffset2.f49827b > 0 ? "Gap " : "Overlap ");
        sb.append(zoneOffset2);
        sb.append(" to ");
        sb.append(zoneOffset);
        sb.append(", ");
        Month month = this.f50104a;
        byte b2 = this.f50105b;
        DayOfWeek dayOfWeek = this.f50106c;
        if (dayOfWeek == null) {
            sb.append(month.name());
            sb.append(' ');
            sb.append((int) b2);
        } else if (b2 == -1) {
            sb.append(dayOfWeek.name());
            sb.append(" on or before last day of ");
            sb.append(month.name());
        } else if (b2 < 0) {
            sb.append(dayOfWeek.name());
            sb.append(" on or before last day minus ");
            sb.append((-b2) - 1);
            sb.append(" of ");
            sb.append(month.name());
        } else {
            sb.append(dayOfWeek.name());
            sb.append(" on or after ");
            sb.append(month.name());
            sb.append(' ');
            sb.append((int) b2);
        }
        sb.append(" at ");
        sb.append(this.f50108e ? "24:00" : this.f50107d.toString());
        sb.append(" ");
        sb.append(this.f50109f);
        sb.append(", standard offset ");
        sb.append(this.f50110g);
        sb.append(']');
        return sb.toString();
    }

    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        LocalTime localTime = this.f50107d;
        boolean z = this.f50108e;
        int secondOfDay = z ? 86400 : localTime.toSecondOfDay();
        int totalSeconds = this.f50110g.getTotalSeconds();
        ZoneOffset zoneOffset = this.f50111h;
        int totalSeconds2 = zoneOffset.getTotalSeconds() - totalSeconds;
        ZoneOffset zoneOffset2 = this.f50112i;
        int totalSeconds3 = zoneOffset2.getTotalSeconds() - totalSeconds;
        byte b2 = secondOfDay % DisplayStrings.DS_CONVERSATIONAL_REPORTING_TTS_HAZARD_REPORTED == 0 ? z ? StylePropertiesKt.TranslationXId : localTime.f49810a : (byte) 31;
        int i2 = totalSeconds % 900 == 0 ? (totalSeconds / 900) + 128 : 255;
        int i3 = (totalSeconds2 == 0 || totalSeconds2 == 1800 || totalSeconds2 == 3600) ? totalSeconds2 / DisplayStrings.DS_BEACONS_GO_TO_SETTINGS_FOR_PERMISSIONS_BUTTON2 : 3;
        int i4 = (totalSeconds3 == 0 || totalSeconds3 == 1800 || totalSeconds3 == 3600) ? totalSeconds3 / DisplayStrings.DS_BEACONS_GO_TO_SETTINGS_FOR_PERMISSIONS_BUTTON2 : 3;
        DayOfWeek dayOfWeek = this.f50106c;
        objectOutput.writeInt((this.f50104a.getValue() << 28) + ((this.f50105b + StylePropertiesKt.ZIndexId) << 22) + ((dayOfWeek == null ? 0 : dayOfWeek.getValue()) << 19) + (b2 << StylePropertiesKt.TopId) + (this.f50109f.ordinal() << 12) + (i2 << 4) + (i3 << 2) + i4);
        if (b2 == 31) {
            objectOutput.writeInt(secondOfDay);
        }
        if (i2 == 255) {
            objectOutput.writeInt(totalSeconds);
        }
        if (i3 == 3) {
            objectOutput.writeInt(zoneOffset.getTotalSeconds());
        }
        if (i4 == 3) {
            objectOutput.writeInt(zoneOffset2.getTotalSeconds());
        }
    }
}
