package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ServiceLoader;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public interface Chronology extends Comparable<Chronology> {

    /* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
    /* renamed from: j$.time.chrono.Chronology$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Chronology a(TemporalAccessor temporalAccessor) {
            Objects.requireNonNull(temporalAccessor, "temporal");
            Object objRequireNonNull = (Chronology) temporalAccessor.x(j$.time.temporal.n.f50066b);
            r rVar = r.f49878d;
            if (objRequireNonNull == null) {
                objRequireNonNull = Objects.requireNonNull(rVar, "defaultObj");
            }
            return (Chronology) objRequireNonNull;
        }

        public static Chronology ofLocale(Locale locale) {
            ConcurrentHashMap concurrentHashMap = a.f49835a;
            Objects.requireNonNull(locale, "locale");
            String unicodeLocaleType = locale.getUnicodeLocaleType("ca");
            if (unicodeLocaleType == null) {
                unicodeLocaleType = locale.equals(a.f49837c) ? "japanese" : null;
            }
            if (unicodeLocaleType == null || "iso".equals(unicodeLocaleType) || "iso8601".equals(unicodeLocaleType)) {
                return r.f49878d;
            }
            do {
                Chronology chronology = (Chronology) a.f49836b.get(unicodeLocaleType);
                if (chronology != null) {
                    return chronology;
                }
            } while (a.k());
            Iterator it = ServiceLoader.load(Chronology.class).iterator();
            while (it.hasNext()) {
                Chronology chronology2 = (Chronology) it.next();
                if (unicodeLocaleType.equals(chronology2.getCalendarType())) {
                    return chronology2;
                }
            }
            j$.time.f.h("Unknown calendar system: ".concat(unicodeLocaleType));
            return null;
        }
    }

    b C(TemporalAccessor temporalAccessor);

    e F(TemporalAccessor temporalAccessor);

    b I(Map map, j$.time.format.b0 b0Var);

    ChronoZonedDateTime J(Instant instant, ZoneId zoneId);

    b date(int i2, int i3, int i4);

    b dateEpochDay(long j2);

    b dateYearDay(int i2, int i3);

    boolean equals(Object obj);

    l eraOf(int i2);

    List eras();

    String getCalendarType();

    String getId();

    int hashCode();

    boolean isLeapYear(long j2);

    ChronoZonedDateTime l(TemporalAccessor temporalAccessor);

    j$.time.temporal.p o(j$.time.temporal.a aVar);

    /* renamed from: t */
    int compareTo(Chronology chronology);

    String toString();

    int u(l lVar, int i2);
}
