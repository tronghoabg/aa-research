package j$.time;

import j$.time.temporal.Temporal;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.apache.tika.mime.MimeTypesReaderMetKeys;

/* loaded from: classes2.dex */
public abstract class ZoneId implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f37486a;
    private static final long serialVersionUID = 8352817235686L;

    public abstract j$.time.zone.f S();

    abstract void W(ObjectOutput objectOutput);

    public abstract String n();

    static {
        Map.Entry[] entryArr = {b.c("ACT", "Australia/Darwin"), b.c("AET", "Australia/Sydney"), b.c("AGT", "America/Argentina/Buenos_Aires"), b.c("ART", "Africa/Cairo"), b.c("AST", "America/Anchorage"), b.c("BET", "America/Sao_Paulo"), b.c("BST", "Asia/Dhaka"), b.c("CAT", "Africa/Harare"), b.c("CNT", "America/St_Johns"), b.c("CST", "America/Chicago"), b.c("CTT", "Asia/Shanghai"), b.c("EAT", "Africa/Addis_Ababa"), b.c("ECT", "Europe/Paris"), b.c("IET", "America/Indiana/Indianapolis"), b.c("IST", "Asia/Kolkata"), b.c("JST", "Asia/Tokyo"), b.c("MIT", "Pacific/Apia"), b.c("NET", "Asia/Yerevan"), b.c("NST", "Pacific/Auckland"), b.c("PLT", "Asia/Karachi"), b.c("PNT", "America/Phoenix"), b.c("PRT", "America/Puerto_Rico"), b.c("PST", "America/Los_Angeles"), b.c("SST", "Pacific/Guadalcanal"), b.c("VST", "Asia/Ho_Chi_Minh"), b.c("EST", "-05:00"), b.c("MST", "-07:00"), b.c("HST", "-10:00")};
        HashMap map = new HashMap(28);
        for (int i5 = 0; i5 < 28; i5++) {
            Map.Entry entry = entryArr[i5];
            Object objRequireNonNull = Objects.requireNonNull(entry.getKey());
            if (map.put(objRequireNonNull, Objects.requireNonNull(entry.getValue())) != null) {
                throw new IllegalArgumentException("duplicate key: " + objRequireNonNull);
            }
        }
        f37486a = Collections.unmodifiableMap(map);
    }

    public static ZoneId of(String str) {
        return T(str, true);
    }

    public static ZoneId U(String str, ZoneOffset zoneOffset) {
        Objects.requireNonNull(str, "prefix");
        Objects.requireNonNull(zoneOffset, MimeTypesReaderMetKeys.MATCH_OFFSET_ATTR);
        if (str.isEmpty()) {
            return zoneOffset;
        }
        if (!str.equals("GMT") && !str.equals("UTC") && !str.equals("UT")) {
            throw new IllegalArgumentException("prefix should be GMT, UTC or UT, is: ".concat(str));
        }
        if (zoneOffset.Z() != 0) {
            str = str.concat(zoneOffset.n());
        }
        return new y(str, j$.time.zone.f.h(zoneOffset));
    }

    static ZoneId T(String str, boolean z2) {
        Objects.requireNonNull(str, "zoneId");
        if (str.length() <= 1 || str.startsWith("+") || str.startsWith("-")) {
            return ZoneOffset.a0(str);
        }
        if (str.startsWith("UTC") || str.startsWith("GMT")) {
            return V(str, 3, z2);
        }
        if (str.startsWith("UT")) {
            return V(str, 2, z2);
        }
        return y.X(str, z2);
    }

    private static ZoneId V(String str, int i5, boolean z2) {
        String strSubstring = str.substring(0, i5);
        if (str.length() == i5) {
            return U(strSubstring, ZoneOffset.UTC);
        }
        if (str.charAt(i5) != '+' && str.charAt(i5) != '-') {
            return y.X(str, z2);
        }
        try {
            ZoneOffset zoneOffsetA0 = ZoneOffset.a0(str.substring(i5));
            if (zoneOffsetA0 == ZoneOffset.UTC) {
                return U(strSubstring, zoneOffsetA0);
            }
            return U(strSubstring, zoneOffsetA0);
        } catch (c e7) {
            throw new c("Invalid ID for offset-based ZoneId: ".concat(str), e7);
        }
    }

    public static ZoneId R(Temporal temporal) {
        ZoneId zoneId = (ZoneId) temporal.B(j$.time.temporal.l.j());
        if (zoneId != null) {
            return zoneId;
        }
        throw new c("Unable to obtain ZoneId from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName());
    }

    ZoneId() {
        if (getClass() != ZoneOffset.class && getClass() != y.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneId) {
            return n().equals(((ZoneId) obj).n());
        }
        return false;
    }

    public int hashCode() {
        return n().hashCode();
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public String toString() {
        return n();
    }

    private Object writeReplace() {
        return new t((byte) 7, this);
    }
}
