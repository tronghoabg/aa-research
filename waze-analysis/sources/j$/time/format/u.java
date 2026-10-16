package j$.time.format;

import j$.time.ZoneId;
import j$.util.Objects;
import java.util.ArrayList;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final DateTimeFormatter f49990a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f49991b = true;

    /* renamed from: c, reason: collision with root package name */
    public boolean f49992c = true;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f49993d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f49994e;

    public u(DateTimeFormatter dateTimeFormatter) {
        ArrayList arrayList = new ArrayList();
        this.f49993d = arrayList;
        this.f49994e = null;
        this.f49990a = dateTimeFormatter;
        arrayList.add(new a0());
    }

    public static boolean b(char c2, char c3) {
        return c2 == c3 || Character.toUpperCase(c2) == Character.toUpperCase(c3) || Character.toLowerCase(c2) == Character.toLowerCase(c3);
    }

    public final boolean a(char c2, char c3) {
        return this.f49991b ? c2 == c3 : b(c2, c3);
    }

    public final a0 c() {
        return (a0) this.f49993d.get(r1.size() - 1);
    }

    public final Long d(j$.time.temporal.a aVar) {
        return (Long) c().f49923a.get(aVar);
    }

    public final void e(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        c().f49924b = zoneId;
    }

    public final int f(j$.time.temporal.m mVar, long j2, int i2, int i3) {
        Objects.requireNonNull(mVar, "field");
        Long l2 = (Long) c().f49923a.put(mVar, Long.valueOf(j2));
        return (l2 == null || l2.longValue() == j2) ? i3 : ~i2;
    }

    public final boolean g(CharSequence charSequence, int i2, CharSequence charSequence2, int i3, int i4) {
        if (i2 + i4 <= charSequence.length() && i3 + i4 <= charSequence2.length()) {
            if (this.f49991b) {
                for (int i5 = 0; i5 < i4; i5++) {
                    if (charSequence.charAt(i2 + i5) == charSequence2.charAt(i3 + i5)) {
                    }
                }
                return true;
            }
            for (int i6 = 0; i6 < i4; i6++) {
                char cCharAt = charSequence.charAt(i2 + i6);
                char cCharAt2 = charSequence2.charAt(i3 + i6);
                if (cCharAt == cCharAt2 || Character.toUpperCase(cCharAt) == Character.toUpperCase(cCharAt2) || Character.toLowerCase(cCharAt) == Character.toLowerCase(cCharAt2)) {
                }
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        return c().toString();
    }
}
