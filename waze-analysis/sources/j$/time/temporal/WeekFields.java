package j$.time.temporal;

import j$.time.DayOfWeek;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Locale;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class WeekFields implements Serializable {

    /* renamed from: g, reason: collision with root package name */
    public static final ConcurrentHashMap f50038g = new ConcurrentHashMap(4, 0.75f, 2);

    /* renamed from: h, reason: collision with root package name */
    public static final g f50039h;
    private static final long serialVersionUID = -1177360819670808121L;

    /* renamed from: a, reason: collision with root package name */
    public final DayOfWeek f50040a;

    /* renamed from: b, reason: collision with root package name */
    public final int f50041b;

    /* renamed from: c, reason: collision with root package name */
    public final transient q f50042c;

    /* renamed from: d, reason: collision with root package name */
    public final transient q f50043d;

    /* renamed from: e, reason: collision with root package name */
    public final transient q f50044e;

    /* renamed from: f, reason: collision with root package name */
    public final transient q f50045f;

    static {
        new WeekFields(DayOfWeek.MONDAY, 4);
        a(DayOfWeek.SUNDAY, 1);
        f50039h = h.f50057d;
    }

    public WeekFields(DayOfWeek dayOfWeek, int i2) {
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        ChronoUnit chronoUnit2 = ChronoUnit.WEEKS;
        this.f50042c = new q("DayOfWeek", this, chronoUnit, chronoUnit2, q.f50076f);
        this.f50043d = new q("WeekOfMonth", this, chronoUnit2, ChronoUnit.MONTHS, q.f50077g);
        g gVar = h.f50057d;
        this.f50044e = new q("WeekOfWeekBasedYear", this, chronoUnit2, gVar, q.f50079i);
        this.f50045f = new q("WeekBasedYear", this, gVar, ChronoUnit.FOREVER, a.YEAR.f50048b);
        Objects.requireNonNull(dayOfWeek, "firstDayOfWeek");
        if (i2 < 1 || i2 > 7) {
            j$.time.f.b("Minimal number of days is invalid");
            throw null;
        }
        this.f50040a = dayOfWeek;
        this.f50041b = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static WeekFields a(DayOfWeek dayOfWeek, int i2) {
        String str = dayOfWeek.toString() + i2;
        ConcurrentHashMap concurrentHashMap = f50038g;
        WeekFields weekFields = (WeekFields) concurrentHashMap.get(str);
        if (weekFields != null) {
            return weekFields;
        }
        concurrentHashMap.putIfAbsent(str, new WeekFields(dayOfWeek, i2));
        return (WeekFields) concurrentHashMap.get(str);
    }

    public static WeekFields of(Locale locale) {
        Objects.requireNonNull(locale, "locale");
        Calendar calendar = Calendar.getInstance(new Locale(locale.getLanguage(), locale.getCountry()));
        int firstDayOfWeek = calendar.getFirstDayOfWeek();
        return a(DayOfWeek.f49789a[((((int) ((firstDayOfWeek - 1) % 7)) + 7) + DayOfWeek.SUNDAY.ordinal()) % 7], calendar.getMinimalDaysInFirstWeek());
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        if (this.f50040a == null) {
            throw new InvalidObjectException("firstDayOfWeek is null");
        }
        int i2 = this.f50041b;
        if (i2 < 1 || i2 > 7) {
            throw new InvalidObjectException("Minimal number of days is invalid");
        }
    }

    private Object readResolve() throws InvalidObjectException {
        try {
            return a(this.f50040a, this.f50041b);
        } catch (IllegalArgumentException e2) {
            throw new InvalidObjectException("Invalid serialized WeekFields: " + e2.getMessage());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WeekFields) && hashCode() == obj.hashCode();
    }

    public DayOfWeek getFirstDayOfWeek() {
        return this.f50040a;
    }

    public final int hashCode() {
        return (this.f50040a.ordinal() * 7) + this.f50041b;
    }

    public final String toString() {
        return "WeekFields[" + String.valueOf(this.f50040a) + "," + this.f50041b + "]";
    }
}
