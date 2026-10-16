package j$.time;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.format.TextStyle;
import j$.time.format.b0;
import j$.time.temporal.TemporalAccessor;
import j$.time.zone.ZoneRules;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public abstract class ZoneId implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f49822a;
    private static final long serialVersionUID = 8352817235686L;

    static {
        Map.Entry[] entryArr = {j$.com.android.tools.r8.a.H("ACT", "Australia/Darwin"), j$.com.android.tools.r8.a.H("AET", "Australia/Sydney"), j$.com.android.tools.r8.a.H("AGT", "America/Argentina/Buenos_Aires"), j$.com.android.tools.r8.a.H("ART", "Africa/Cairo"), j$.com.android.tools.r8.a.H("AST", "America/Anchorage"), j$.com.android.tools.r8.a.H("BET", "America/Sao_Paulo"), j$.com.android.tools.r8.a.H("BST", "Asia/Dhaka"), j$.com.android.tools.r8.a.H("CAT", "Africa/Harare"), j$.com.android.tools.r8.a.H("CNT", "America/St_Johns"), j$.com.android.tools.r8.a.H("CST", "America/Chicago"), j$.com.android.tools.r8.a.H("CTT", "Asia/Shanghai"), j$.com.android.tools.r8.a.H("EAT", "Africa/Addis_Ababa"), j$.com.android.tools.r8.a.H("ECT", "Europe/Paris"), j$.com.android.tools.r8.a.H("IET", "America/Indiana/Indianapolis"), j$.com.android.tools.r8.a.H("IST", "Asia/Kolkata"), j$.com.android.tools.r8.a.H("JST", "Asia/Tokyo"), j$.com.android.tools.r8.a.H("MIT", "Pacific/Apia"), j$.com.android.tools.r8.a.H("NET", "Asia/Yerevan"), j$.com.android.tools.r8.a.H("NST", "Pacific/Auckland"), j$.com.android.tools.r8.a.H("PLT", "Asia/Karachi"), j$.com.android.tools.r8.a.H("PNT", "America/Phoenix"), j$.com.android.tools.r8.a.H("PRT", "America/Puerto_Rico"), j$.com.android.tools.r8.a.H("PST", "America/Los_Angeles"), j$.com.android.tools.r8.a.H("SST", "Pacific/Guadalcanal"), j$.com.android.tools.r8.a.H("VST", "Asia/Ho_Chi_Minh"), j$.com.android.tools.r8.a.H("EST", "-05:00"), j$.com.android.tools.r8.a.H("MST", "-07:00"), j$.com.android.tools.r8.a.H("HST", "-10:00")};
        HashMap map = new HashMap(28);
        for (int i2 = 0; i2 < 28; i2++) {
            Map.Entry entry = entryArr[i2];
            Object objRequireNonNull = Objects.requireNonNull(entry.getKey());
            if (map.put(objRequireNonNull, Objects.requireNonNull(entry.getValue())) != null) {
                throw new IllegalArgumentException("duplicate key: " + objRequireNonNull);
            }
        }
        f49822a = Collections.unmodifiableMap(map);
    }

    public ZoneId() {
        if (getClass() != ZoneOffset.class && getClass() != s.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public static ZoneId B(TemporalAccessor temporalAccessor) {
        ZoneId zoneId = (ZoneId) temporalAccessor.x(j$.time.temporal.n.f50069e);
        if (zoneId != null) {
            return zoneId;
        }
        f.h(j$.desugar.sun.nio.fs.h.b("Unable to obtain ZoneId from TemporalAccessor: ", String.valueOf(temporalAccessor), " of type ", temporalAccessor.getClass().getName()));
        return null;
    }

    public static ZoneId L(String str, boolean z) {
        Objects.requireNonNull(str, "zoneId");
        return (str.length() <= 1 || str.startsWith("+") || str.startsWith("-")) ? ZoneOffset.Q(str) : (str.startsWith("UTC") || str.startsWith("GMT")) ? N(str, 3, z) : str.startsWith("UT") ? N(str, 2, z) : s.P(str, z);
    }

    public static ZoneId M(String str, ZoneOffset zoneOffset) {
        Objects.requireNonNull(str, "prefix");
        Objects.requireNonNull(zoneOffset, TypedValues.CycleType.S_WAVE_OFFSET);
        if (str.isEmpty()) {
            return zoneOffset;
        }
        if (!str.equals("GMT") && !str.equals("UTC") && !str.equals("UT")) {
            f.b("prefix should be GMT, UTC or UT, is: ".concat(str));
            return null;
        }
        if (zoneOffset.getTotalSeconds() != 0) {
            str = str.concat(zoneOffset.f49828c);
        }
        return new s(str, zoneOffset.getRules());
    }

    public static ZoneId N(String str, int i2, boolean z) {
        String strSubstring = str.substring(0, i2);
        if (str.length() == i2) {
            return M(strSubstring, ZoneOffset.UTC);
        }
        if (str.charAt(i2) != '+' && str.charAt(i2) != '-') {
            return s.P(str, z);
        }
        try {
            ZoneOffset zoneOffsetQ = ZoneOffset.Q(str.substring(i2));
            return zoneOffsetQ == ZoneOffset.UTC ? M(strSubstring, zoneOffsetQ) : M(strSubstring, zoneOffsetQ);
        } catch (c e2) {
            throw new c("Invalid ID for offset-based ZoneId: ".concat(str), e2);
        }
    }

    public static ZoneId of(String str) {
        return L(str, true);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static ZoneId systemDefault() {
        String id = TimeZone.getDefault().getID();
        Objects.requireNonNull(id, "zoneId");
        Map map = f49822a;
        Objects.requireNonNull(map, "aliasMap");
        Object objRequireNonNull = (String) map.get(id);
        if (objRequireNonNull == null) {
            objRequireNonNull = Objects.requireNonNull(id, "defaultObj");
        }
        return of((String) objRequireNonNull);
    }

    private Object writeReplace() {
        return new o((byte) 7, this);
    }

    public abstract void O(ObjectOutput objectOutput);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneId) {
            return getId().equals(((ZoneId) obj).getId());
        }
        return false;
    }

    public String getDisplayName(TextStyle textStyle, Locale locale) {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.c(new j$.time.format.t(textStyle, false));
        return dateTimeFormatterBuilder.r(locale, b0.SMART, null).format(new j$.desugar.sun.nio.fs.g(2, this));
    }

    public abstract String getId();

    public abstract ZoneRules getRules();

    public int hashCode() {
        return getId().hashCode();
    }

    public String toString() {
        return getId();
    }
}
