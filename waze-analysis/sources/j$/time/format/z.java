package j$.time.format;

import j$.time.chrono.Chronology;
import j$.util.concurrent.ConcurrentHashMap;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f50004a = new ConcurrentHashMap(16, 0.75f, 2);

    /* renamed from: b, reason: collision with root package name */
    public static final x f50005b = new x();

    /* renamed from: c, reason: collision with root package name */
    public static final z f50006c = new z();

    public static Object a(j$.time.temporal.m mVar, Locale locale) {
        Object yVar;
        long j2;
        String strSubstring;
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(mVar, locale);
        ConcurrentHashMap concurrentHashMap = f50004a;
        V v = concurrentHashMap.get(simpleImmutableEntry);
        if (v != 0) {
            return v;
        }
        HashMap map = new HashMap();
        if (mVar == j$.time.temporal.a.ERA) {
            DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            String[] eras = dateFormatSymbols.getEras();
            for (int i2 = 0; i2 < eras.length; i2++) {
                if (!eras[i2].isEmpty()) {
                    long j3 = i2;
                    map2.put(Long.valueOf(j3), eras[i2]);
                    Long lValueOf = Long.valueOf(j3);
                    String str = eras[i2];
                    map3.put(lValueOf, str.substring(0, Character.charCount(str.codePointAt(0))));
                }
            }
            if (!map2.isEmpty()) {
                map.put(TextStyle.FULL, map2);
                map.put(TextStyle.SHORT, map2);
                map.put(TextStyle.NARROW, map3);
            }
            yVar = new y(map);
        } else {
            long j4 = 1;
            if (mVar == j$.time.temporal.a.MONTH_OF_YEAR) {
                int length = DateFormatSymbols.getInstance(locale).getMonths().length;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (long j5 = 1; j5 <= length; j5++) {
                    String strA = j$.com.android.tools.r8.a.A(j5, "LLLL", locale);
                    linkedHashMap.put(Long.valueOf(j5), strA);
                    linkedHashMap2.put(Long.valueOf(j5), strA.substring(0, Character.charCount(strA.codePointAt(0))));
                    linkedHashMap3.put(Long.valueOf(j5), j$.com.android.tools.r8.a.A(j5, "LLL", locale));
                }
                if (length > 0) {
                    map.put(TextStyle.FULL_STANDALONE, linkedHashMap);
                    map.put(TextStyle.NARROW_STANDALONE, linkedHashMap2);
                    map.put(TextStyle.SHORT_STANDALONE, linkedHashMap3);
                    map.put(TextStyle.FULL, linkedHashMap);
                    map.put(TextStyle.NARROW, linkedHashMap2);
                    map.put(TextStyle.SHORT, linkedHashMap3);
                }
                yVar = new y(map);
            } else if (mVar == j$.time.temporal.a.DAY_OF_WEEK) {
                int length2 = DateFormatSymbols.getInstance(locale).getWeekdays().length;
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                boolean z = locale == Locale.SIMPLIFIED_CHINESE || locale == Locale.TRADITIONAL_CHINESE;
                long j6 = 1;
                while (j6 <= length2) {
                    String strZ = j$.com.android.tools.r8.a.z(j6, "cccc", locale);
                    linkedHashMap4.put(Long.valueOf(j6), strZ);
                    Long lValueOf2 = Long.valueOf(j6);
                    if (z) {
                        j2 = j4;
                        strSubstring = new StringBuilder().appendCodePoint(strZ.codePointBefore(strZ.length())).toString();
                    } else {
                        j2 = j4;
                        strSubstring = strZ.substring(0, Character.charCount(strZ.codePointAt(0)));
                    }
                    linkedHashMap5.put(lValueOf2, strSubstring);
                    linkedHashMap6.put(Long.valueOf(j6), j$.com.android.tools.r8.a.z(j6, "ccc", locale));
                    j6 += j2;
                    j4 = j2;
                }
                if (length2 > 0) {
                    map.put(TextStyle.FULL_STANDALONE, linkedHashMap4);
                    map.put(TextStyle.NARROW_STANDALONE, linkedHashMap5);
                    map.put(TextStyle.SHORT_STANDALONE, linkedHashMap6);
                    map.put(TextStyle.FULL, linkedHashMap4);
                    map.put(TextStyle.NARROW, linkedHashMap5);
                    map.put(TextStyle.SHORT, linkedHashMap6);
                }
                yVar = new y(map);
            } else if (mVar == j$.time.temporal.a.AMPM_OF_DAY) {
                DateFormatSymbols dateFormatSymbols2 = DateFormatSymbols.getInstance(locale);
                HashMap map4 = new HashMap();
                HashMap map5 = new HashMap();
                String[] amPmStrings = dateFormatSymbols2.getAmPmStrings();
                for (int i3 = 0; i3 < amPmStrings.length; i3++) {
                    if (!amPmStrings[i3].isEmpty()) {
                        long j7 = i3;
                        map4.put(Long.valueOf(j7), amPmStrings[i3]);
                        Long lValueOf3 = Long.valueOf(j7);
                        String str2 = amPmStrings[i3];
                        map5.put(lValueOf3, str2.substring(0, Character.charCount(str2.codePointAt(0))));
                    }
                }
                if (!map4.isEmpty()) {
                    map.put(TextStyle.FULL, map4);
                    map.put(TextStyle.SHORT, map4);
                    map.put(TextStyle.NARROW, map5);
                }
                yVar = new y(map);
            } else {
                yVar = "";
            }
        }
        concurrentHashMap.putIfAbsent(simpleImmutableEntry, yVar);
        return concurrentHashMap.get(simpleImmutableEntry);
    }

    public String b(Chronology chronology, j$.time.temporal.m mVar, long j2, TextStyle textStyle, Locale locale) {
        if (chronology == j$.time.chrono.r.f49878d || !(mVar instanceof j$.time.temporal.a)) {
            return c(mVar, j2, textStyle, locale);
        }
        return null;
    }

    public String c(j$.time.temporal.m mVar, long j2, TextStyle textStyle, Locale locale) {
        Object objA = a(mVar, locale);
        if (objA instanceof y) {
            return ((y) objA).a(j2, textStyle);
        }
        return null;
    }

    public Iterator d(Chronology chronology, j$.time.temporal.m mVar, TextStyle textStyle, Locale locale) {
        if (chronology == j$.time.chrono.r.f49878d || !(mVar instanceof j$.time.temporal.a)) {
            return e(mVar, textStyle, locale);
        }
        return null;
    }

    public Iterator e(j$.time.temporal.m mVar, TextStyle textStyle, Locale locale) {
        List list;
        Object objA = a(mVar, locale);
        if (!(objA instanceof y) || (list = (List) ((y) objA).f50003b.get(textStyle)) == null) {
            return null;
        }
        return list.iterator();
    }
}
