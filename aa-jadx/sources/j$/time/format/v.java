package j$.time.format;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final class v {
    public final j$.time.format.DateTimeFormatter a;
    public boolean b = true;
    public boolean c = true;
    public final java.util.ArrayList d;
    public java.util.ArrayList e;

    public v(j$.time.format.DateTimeFormatter dateTimeFormatter) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.d = arrayList;
        this.e = null;
        this.a = dateTimeFormatter;
        arrayList.add(new j$.time.format.c0());
    }

    public static boolean b(char c, char c2) {
        return c == c2 || java.lang.Character.toUpperCase(c) == java.lang.Character.toUpperCase(c2) || java.lang.Character.toLowerCase(c) == java.lang.Character.toLowerCase(c2);
    }

    public final boolean a(char c, char c2) {
        if (this.b) {
            return c == c2;
        }
        return b(c, c2);
    }

    public final j$.time.format.c0 c() {
        java.util.ArrayList arrayList = this.d;
        return (j$.time.format.c0) arrayList.get(arrayList.size() - 1);
    }

    public final java.lang.Long d(j$.time.temporal.a aVar) {
        return (java.lang.Long) c().a.get(aVar);
    }

    public final void e(j$.time.ZoneId zoneId) {
        j$.util.Objects.a(zoneId, "zone");
        c().b = zoneId;
    }

    public final int f(j$.time.temporal.m mVar, long j, int i, int i2) {
        j$.util.Objects.a(mVar, "field");
        java.lang.Long l = (java.lang.Long) c().a.put(mVar, java.lang.Long.valueOf(j));
        return (l == null || l.longValue() == j) ? i2 : ~i;
    }

    public final boolean g(java.lang.CharSequence charSequence, int i, java.lang.CharSequence charSequence2, int i2, int i3) {
        if (i + i3 <= charSequence.length() && i2 + i3 <= charSequence2.length()) {
            if (this.b) {
                for (int i4 = 0; i4 < i3; i4++) {
                    if (charSequence.charAt(i + i4) == charSequence2.charAt(i2 + i4)) {
                    }
                }
                return true;
            }
            for (int i5 = 0; i5 < i3; i5++) {
                char cCharAt = charSequence.charAt(i + i5);
                char cCharAt2 = charSequence2.charAt(i2 + i5);
                if (cCharAt == cCharAt2 || java.lang.Character.toUpperCase(cCharAt) == java.lang.Character.toUpperCase(cCharAt2) || java.lang.Character.toLowerCase(cCharAt) == java.lang.Character.toLowerCase(cCharAt2)) {
                }
            }
            return true;
        }
        return false;
    }

    public final java.lang.String toString() {
        return c().toString();
    }
}
